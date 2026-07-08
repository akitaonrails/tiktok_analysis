package com.bytedance.pitaya.api.feature.store;

import X.C1944707jZ;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PTYFeatureDescription extends PTYMetaFeatureDescription {
    public static final C1944707jZ Companion = new Object() { // from class: X.07jZ
    };
    public final int divideTimeType;
    public final boolean dump;
    public final String endSessionEvent;
    public final String eventField;
    public final String eventFilter;
    public final String eventName;
    public final String featureName;
    public final int featureSource;
    public final int maxCacheCount;
    public final String startSessionEvent;
    public final List<PTYMetaFeatureDescription> subFeatures;
    public final int type;

    public final int getDivideTimeType() {
        return this.divideTimeType;
    }

    public final boolean getDump() {
        return this.dump;
    }

    public final String getEndSessionEvent() {
        return this.endSessionEvent;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventField() {
        return this.eventField;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventFilter() {
        return this.eventFilter;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public String getFeatureName() {
        return this.featureName;
    }

    public final int getFeatureSource() {
        return this.featureSource;
    }

    public final int getMaxCacheCount() {
        return this.maxCacheCount;
    }

    public final String getStartSessionEvent() {
        return this.startSessionEvent;
    }

    public final List<PTYMetaFeatureDescription> getSubFeatures() {
        return this.subFeatures;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYMetaFeatureDescription
    public int getType() {
        return this.type;
    }

    public PTYFeatureDescription(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, int i4, List<PTYMetaFeatureDescription> list, String str5, String str6) {
        super(str, str2, str3, str4, i);
        this.featureName = str;
        this.eventName = str2;
        this.eventFilter = str3;
        this.eventField = str4;
        this.type = i;
        this.featureSource = i2;
        this.dump = z;
        this.maxCacheCount = i3;
        this.divideTimeType = i4;
        this.subFeatures = list;
        this.startSessionEvent = str5;
        this.endSessionEvent = str6;
    }
}
