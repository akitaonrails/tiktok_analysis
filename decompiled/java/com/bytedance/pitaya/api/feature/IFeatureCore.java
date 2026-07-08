package com.bytedance.pitaya.api.feature;

import X.InterfaceC1610880s1O;
import X.InterfaceC1851010yGh;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes28.dex */
public interface IFeatureCore extends ReflectionCall {
    void ResetRunEventCache(String str);

    InterfaceC1851010yGh createCloudFeature(String str);

    IFeatureSchema createFeatureSchema(String str);

    IKVStore createInMemoryKVStore(String str);

    IKVStore createKVStore(String str);

    String getAid();

    InterfaceC1610880s1O getCepCore();

    IFeatureSchema sharedFeatureSchema();
}
