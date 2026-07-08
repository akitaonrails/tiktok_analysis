package com.lynx.jsbridge;

import com.lynx.react.bridge.JavaOnlyArray;

/* JADX INFO: loaded from: classes21.dex */
public class AttributeDescriptor {
    public final String LIZ;
    public final JavaOnlyArray LIZIZ;

    public String getName() {
        return this.LIZ;
    }

    public JavaOnlyArray getValue() {
        return this.LIZIZ;
    }

    public AttributeDescriptor(String str, JavaOnlyArray javaOnlyArray) {
        this.LIZ = str;
        this.LIZIZ = javaOnlyArray;
    }
}
