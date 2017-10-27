package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;
import edu.kis.vh.stacks.stack;

public class ArrayStackFactory implements IstacksFactory {
    @Override
    public stack GetStandardStack() {
        return new stack(new StackArray());
    }

    @Override
    public stack GetFalseStack() {
        return new stack(new StackList());
    }

    @Override
    public StackFIFO GetFIFOStack() {
        return new StackFIFO(new StackArray());
    }

    @Override
    public StackHanoi GetHanoiStack() {
        return new StackHanoi(new StackArray());
    }
}