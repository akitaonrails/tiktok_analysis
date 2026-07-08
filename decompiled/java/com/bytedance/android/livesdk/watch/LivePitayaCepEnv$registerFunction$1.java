package com.bytedance.android.livesdk.watch;

import com.bytedance.pitaya.api.PTYCepFunction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class LivePitayaCepEnv$registerFunction$1 implements PTYCepFunction {
    public final /* synthetic */ Function1<JSONArray, Object> $handler;

    /* JADX WARN: Multi-variable type inference failed */
    public LivePitayaCepEnv$registerFunction$1(Function1<? super JSONArray, ? extends Object> function1) {
        this.$handler = function1;
    }

    @Override // com.bytedance.pitaya.api.PTYCepFunction
    public Object apply(JSONArray jSONArray) {
        try {
            this.$handler.invoke(jSONArray);
            return Boolean.FALSE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Boolean.FALSE;
        }
    }
}
