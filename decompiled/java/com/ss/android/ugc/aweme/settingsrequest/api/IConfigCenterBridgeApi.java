package com.ss.android.ugc.aweme.settingsrequest.api;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface IConfigCenterBridgeApi {
    void LIZ(JSONObject jSONObject, Function1<? super String, Unit> function1, Function1<? super Exception, Unit> function12);

    Map<String, Object> getSettings(List<String> list);
}
