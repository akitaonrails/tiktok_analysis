package com.bytedance.android.livesdk.watch;

import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.bean.PTYError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes17.dex */
public final class LivePitayaCepEnv$registerCallback$1 implements PTYCepCallback {
    public final /* synthetic */ Function1<List<? extends JSONArray>, Unit> $onEventProcessed;
    public final /* synthetic */ Function1<List<String>, Unit> $onFail;
    public final /* synthetic */ Function1<List<? extends JSONArray>, Unit> $onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LivePitayaCepEnv$registerCallback$1(Function1<? super List<? extends JSONArray>, Unit> function1, Function1<? super List<String>, Unit> function12, Function1<? super List<? extends JSONArray>, Unit> function13) {
        this.$onSuccess = function1;
        this.$onFail = function12;
        this.$onEventProcessed = function13;
    }

    @Override // com.bytedance.pitaya.api.PTYCepCallback
    public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
        if (z) {
            this.$onSuccess.invoke(pTYCepResult.getMatchedEventsSequences());
        } else if (pTYError != null) {
            this.$onFail.invoke(pTYError.getStacks());
        } else {
            this.$onEventProcessed.invoke(pTYCepResult.getMatchedEventsSequences());
        }
    }
}
