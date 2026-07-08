package com.ss.android.ugc.aweme.specact.touchpoints.rules;

import com.bytedance.pitaya.api.PTYMessageHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class TaskRule$initPitayaListener$1$1 implements PTYMessageHandler {
    public final /* synthetic */ Function1<JSONObject, Unit> $action;

    /* JADX WARN: Multi-variable type inference failed */
    public TaskRule$initPitayaListener$1$1(Function1<? super JSONObject, Unit> function1) {
        this.$action = function1;
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) {
        this.$action.invoke(jSONObject);
        return jSONObject;
    }
}
