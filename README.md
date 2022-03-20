# ecommerce-kafka


### KAFKA INSTRUCTIONS

#### START ZOOKEEPER
	bin/zookeeper-server-start.sh config/zookeeper.properties

#### START KAFKA
	bin/kafka-server-start.sh config/server.properties

#### CREATE TOPICS
	bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic LOJA_NOVO_PEDIDO

#### TOPICS LIST 
    bin/kafka-topics.sh --list --bootstrap-server localhost:9092

#### DESCRIBE TOPICS 
    bin/kafka-topics.sh --describe --bootstrap-server localhost:9092

#### CREATE CONSOLE PRODUCER 
    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic LOJA_NOVO_PEDIDO 
    
#### CREATE CONSOLE CONSUMER 
    bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic LOJA_NOVO_PEDIDO --from-beginning 
    
#### SERVER PROPERTIES 
    vi config/server.properties

#### ALTER PARTITIONS 
    bin/kafka-topics.sh --alter --bootstrap-server localhost:9092 --topic ECOMMERCE_NEW_ORDER --partitions 3 
    
#### GROUPS DESCRIBE 
    bin/kafka-consumer-groups.sh --all-groups --bootstrap-server localhost:9092 --describe 
    
#### ALTER LOG DIR KAFKA 
    server.properties > log.dir

#### ALTER LOG DOR ZOOKEEPER 
    zookeeper.properties > dataDir 
    
#### NEW BROKER  
    bin/kafka-server-start.sh config/server2.properties 
    config/server2.properties > broker.id=2 
    config/server2.properties > listeners=PLAINTEXT://:9093 
    config/server2.properties > default.replication.factor=2 
    config/server.properties > default.replication.factor=2 
    config/server.properties > offsets.topic.replication.factor=3 
    config/server.properties > transaction.state.log.replication.factor=3
