package com.example.demospringcore.Sequence;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao{
    private final Map<String, Sequence> sequences=new HashMap<>();
    private final Map<String, AtomicInteger> values=new HashMap<>();

    public SequenceDaoImpl() {
        sequences.put("IT", new Sequence("IT", "30", "A"));
        values.put("IT", new AtomicInteger(10000));
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get(sequenceId);
    }

    @Override
    public int getNextValue(String sequenceId) {
        AtomicInteger value=values.get(sequenceId);
        return value.getAndIncrement();
    }
}
