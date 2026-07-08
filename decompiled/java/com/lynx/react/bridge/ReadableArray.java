package com.lynx.react.bridge;

import X.InterfaceC1298070jsr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public interface ReadableArray {
    ArrayList<Object> asArrayList();

    ReadableArray getArray(int i);

    boolean getBoolean(int i);

    byte getByte(int i);

    byte[] getByteArray(int i);

    char getChar(int i);

    double getDouble(int i);

    InterfaceC1298070jsr getDynamic(int i);

    int getInt(int i);

    long getLong(int i);

    ReadableMap getMap(int i);

    PiperData getPiperData(int i);

    short getShort(int i);

    String getString(int i);

    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
