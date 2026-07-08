package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes4.dex */
public class PTYMetaFeatureDescription implements ReflectionCall {
    public final String eventField;
    public final String eventFilter;
    public final String eventName;
    public final String featureName;
    public final int type;

    public String getEventField() {
        return this.eventField;
    }

    public String getEventFilter() {
        return this.eventFilter;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public int getType() {
        return this.type;
    }

    public PTYMetaFeatureDescription(String str, String str2, String str3, String str4, int i) {
        this.featureName = str;
        this.eventName = str2;
        this.eventFilter = str3;
        this.eventField = str4;
        this.type = i;
    }
}
