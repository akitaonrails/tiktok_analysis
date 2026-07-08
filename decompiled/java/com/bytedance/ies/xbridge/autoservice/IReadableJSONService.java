package com.bytedance.ies.xbridge.autoservice;

import X.InterfaceC1107590evd;
import X.InterfaceC1871920yoQ;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface IReadableJSONService extends IHybridInnerAutoService {
    JSONArray xReadableArrayToJSONArray(InterfaceC1871920yoQ interfaceC1871920yoQ);

    JSONObject xReadableMapToJSONObject(InterfaceC1107590evd interfaceC1107590evd);
}
