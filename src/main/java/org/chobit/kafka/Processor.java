package org.chobit.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecords;

/**
 * 消息处理类，具体消息处理逻辑需要实现此接口
 *
 * @author robin
 */
public interface Processor<K, V> extends Shutdown {

    /**
     * 执行消息处理逻辑
     *
     * @param records 消费的记录总数
     * @return 是否处理成功
     */
    boolean process(ConsumerRecords<K, V> records);


    @Override
    default void awaitShutdown() {
    }


    @Override
    default void shutdown() {
    }

}
