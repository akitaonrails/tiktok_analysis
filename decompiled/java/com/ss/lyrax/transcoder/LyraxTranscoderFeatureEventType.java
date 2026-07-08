package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderFeatureEventType {
    FEATURE_EVENT_TYPE_UNKNOWN(0),
    FEATURE_EVENT_TYPE_STARTED(1),
    FEATURE_EVENT_TYPE_UPDATED(2),
    FEATURE_EVENT_TYPE_STOPPED(3),
    FEATURE_EVENT_TYPE_STATE_CHANGED(4),
    FEATURE_EVENT_TYPE_ILLEGAL_CALL(5);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderFeatureEventType fromId(int i) {
        for (LyraxTranscoderFeatureEventType lyraxTranscoderFeatureEventType : values()) {
            if (lyraxTranscoderFeatureEventType.value() == i) {
                return lyraxTranscoderFeatureEventType;
            }
        }
        return null;
    }

    public static LyraxTranscoderFeatureEventType valueOf(String str) {
        return (LyraxTranscoderFeatureEventType) C08FF.LIZ(LyraxTranscoderFeatureEventType.class, str);
    }

    LyraxTranscoderFeatureEventType(int i) {
        this.value = i;
    }
}
