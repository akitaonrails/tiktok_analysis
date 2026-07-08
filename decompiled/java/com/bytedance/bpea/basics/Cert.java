package com.bytedance.bpea.basics;

import X.C825940Wae;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface Cert extends Serializable {
    void attachCustomInfo(String str, Object obj);

    void attachCustomInfo(Map<String, ? extends Object> map);

    String authKey();

    String certToken();

    String certType();

    Map<String, Object> customInfo();

    JSONObject toJSON();

    void validate(C825940Wae c825940Wae);
}
