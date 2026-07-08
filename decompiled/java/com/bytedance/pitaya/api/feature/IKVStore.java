package com.bytedance.pitaya.api.feature;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public interface IKVStore extends ReflectionCall {
    boolean append(JSONObject jSONObject);

    boolean contain(String str);

    String getAid();

    String getBusinessName();

    JSONObject getCacheWithTryLock();

    boolean getInMemory();

    JSONObject getKVData();

    Object getValueForKey(String str);

    JSONObject getValueForKeys(List<String> list);

    boolean removeKeys(List<String> list);

    boolean setKVData(JSONObject jSONObject);

    boolean setValueForKey(String str, Object obj);

    String tryGetValuesForRequest(List<String> list);
}
