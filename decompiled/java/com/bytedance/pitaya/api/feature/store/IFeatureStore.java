package com.bytedance.pitaya.api.feature.store;

import X.C1851000yGg;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public interface IFeatureStore extends ReflectionCall {
    public static final C1851000yGg Companion = new Object() { // from class: X.0yGg
    };

    boolean addFeature(String str, float f, String str2);

    boolean addFeature(String str, String str2, String str3);

    boolean addFeature(String str, JSONObject jSONObject, String str2);

    boolean endSession(String str, String str2);

    void getFeature(String str, String str2, int i, int i2, int i3, PTYFeatureCallback pTYFeatureCallback);

    PTYModelInstance getGroupFeature(List<PTYFeatureGroupQuery> list, boolean z);

    PTYModelInstance getModelInstance(String str, boolean z);

    List<String> getRegisteredProducer();

    String registerCppCallback(String str, String str2, PTYFeatureChangeCallback pTYFeatureChangeCallback);

    void registerFeatureGroup(PTYFeatureGroup pTYFeatureGroup, PTYNormalCallback pTYNormalCallback);

    void registerFeatureProducer(PTYFeatureProducer pTYFeatureProducer, PTYNormalCallback pTYNormalCallback);

    String registerPyCallback(String str, String str2, String str3);

    boolean startSession(String str, String str2);

    void unregisterCppCallback(String str, String str2, String str3);

    boolean unregisterFeatureGroup(String str);

    boolean unregisterFeatureProducer(String str);

    void unregisterPyCallback(String str, String str2, String str3);

    boolean upload(PTYModelInstance pTYModelInstance, float f, String str, int i, String str2);
}
