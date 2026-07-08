package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum SEIStreamUpdateEvent {
    STREAM_ADD(0),
    STREAM_REMOVE(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SEIStreamUpdateEvent valueOf(String str) {
        return (SEIStreamUpdateEvent) C08FF.LIZ(SEIStreamUpdateEvent.class, str);
    }

    SEIStreamUpdateEvent(int i) {
        this.value = i;
    }
}
