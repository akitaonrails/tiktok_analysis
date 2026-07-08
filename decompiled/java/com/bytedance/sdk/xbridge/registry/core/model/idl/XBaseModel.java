package com.bytedance.sdk.xbridge.registry.core.model.idl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface XBaseModel {
    Map<String, Object> convert();

    JSONObject toJSON();
}
