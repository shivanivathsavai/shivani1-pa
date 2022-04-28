package Programs;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;

import java.util.Properties;

public class StreamsDemo {
    public static void main(String args[])
    {
        Properties properties = new Properties();
        properties.put(StreamsConfig.APPLICATION_ID_CONFIG,"appid");
        properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        StreamsBuilder builder= new StreamsBuilder();

        /*Providing input topic through streams*/

        KStream<String,String> ks0=builder.stream("input-topic");

        /*Making the values to uppercase*/

        KStream<String,String> ks1=ks0.mapValues(v->v.toUpperCase());

        /*By using to() sending to output topic*/

        ks1.to("output-topic", Produced.with(Serdes.String(),Serdes.String()));

        KafkaStreams streams = new KafkaStreams(builder.build(),properties);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));



    }
}
