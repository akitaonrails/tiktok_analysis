package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxForwardStreamEvent {
    DISCONNECTED(0),
    CONNECTED(1),
    INTERRUPT(2),
    DSTROOM_UPDATED(3),
    UNEXPECT_APICALL(4);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxForwardStreamEvent fromId(int i) {
        for (LyraxForwardStreamEvent lyraxForwardStreamEvent : values()) {
            if (lyraxForwardStreamEvent.value() == i) {
                return lyraxForwardStreamEvent;
            }
        }
        return UNEXPECT_APICALL;
    }

    public static LyraxForwardStreamEvent valueOf(String str) {
        return (LyraxForwardStreamEvent) C08FF.LIZ(LyraxForwardStreamEvent.class, str);
    }

    LyraxForwardStreamEvent(int i) {
        this.val = i;
    }
}
