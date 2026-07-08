package com.bytedance.sdk.xbridge.services;

import X.InterfaceC1298030jsn;
import X.InterfaceC1298040jso;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IUtilsService extends IHybridInnerAutoService {
    WritableArray convertArrayToWritableArray(List<? extends Object> list);

    WritableArray convertJsonToArray(JSONArray jSONArray);

    WritableMap convertJsonToMap(JSONObject jSONObject);

    WritableMap convertMapToReadableMap(Map<String, ? extends Object> map);

    WritableArray convertXReadableArrayToReadableArray(InterfaceC1298030jsn interfaceC1298030jsn);

    WritableMap convertXReadableMapToReadableMap(InterfaceC1298040jso interfaceC1298040jso);

    Object getValue(Object obj);

    List<Object> jsonToList(JSONArray jSONArray);

    Map<String, Object> jsonToMap(JSONObject jSONObject);

    JSONArray listSupportPiperdataToJSON(List<? extends Object> list);

    JSONArray listToJSON(List<? extends Object> list);

    JSONObject mapSupportPiperdataToJSON(Map<String, ? extends Object> map);

    JSONObject mapToJSON(Map<String, ? extends Object> map);

    String toStringOrJson(Object obj);
}
