package com.bytedance.pitaya.api.bean;

import X.C122400dK;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class PTYClass implements ReflectionCall {
    public static final C122400dK Companion = new Object() { // from class: X.00dK
    };
    public final String bindID;
    public final int classType;

    public PTYClass() {
        this(4);
    }

    public final String getBindID$pitayacore_release() {
        return this.bindID;
    }

    public final int getClassType() {
        return this.classType;
    }

    public String toString() {
        return this.bindID;
    }

    public PTYClass(int i) {
        this.classType = i;
        this.bindID = UUID.randomUUID().toString();
    }
}
