package com.ttkmedia.datacenter.featurecenter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IFeatureCenterManager {
    public native Object getBatchFeatures(String str, int i);

    public native Object getBatchFeaturesByBizName(String str, String str2, String str3);

    public abstract Object getBatchFeaturesByBizNameFromNative(String str, String str2, String str3);

    public abstract Object getBatchFeaturesFromNative(String str, int i);

    public native Object getFeature(String str);

    public abstract Object getFeatureFromNative(String str);

    public abstract Object getFeatureFromTT(String str);

    public native Object getProducerFeature(String str, String str2);

    public abstract Object getProducerFeatureFromNative(String str, String str2);

    public native Object getVideoFeature(String str, String str2, int i);

    public abstract Object getVideoFeatureFromNative(String str, String str2, int i);
}
