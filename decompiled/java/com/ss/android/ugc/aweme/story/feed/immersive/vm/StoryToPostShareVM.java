package com.ss.android.ugc.aweme.story.feed.immersive.vm;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C189200o6;
import X.C2296808zG;
import X.C23250099c;
import X.C316201Km;
import X.C452501pT;
import X.C712320Rws;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS4S3100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryToPostShareVM extends AssemViewModel<C712320Rws> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(199));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C712320Rws(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ((InterfaceC497601wk) this.LL.getValue(), null);
    }

    public static void vQ2(Aweme aweme, String str, String str2, String str3, String str4) {
        Object c098200Yq;
        AwS4S3100000_11 awS4S3100000_11 = new AwS4S3100000_11(str2, str3, str4, aweme, 2);
        JSONObject jSONObject = new JSONObject();
        try {
            awS4S3100000_11.invoke(jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C316201Km(str, null, jSONObject), 3);
        }
    }
}
