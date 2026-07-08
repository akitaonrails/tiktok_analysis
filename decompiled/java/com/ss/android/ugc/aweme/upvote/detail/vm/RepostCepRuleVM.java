package com.ss.android.ugc.aweme.upvote.detail.vm;

import X.C1004610cFX;
import X.C1004620cFY;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS130S1100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RepostCepRuleVM extends AssemViewModel<C1004620cFY> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1004620cFY(0);
    }

    public static final class RepostPTYCepCallback implements PTYCepCallback {
        public final String ruleName;
        public final WeakReference<RepostCepRuleVM> vmRef;

        public RepostPTYCepCallback(WeakReference<RepostCepRuleVM> weakReference, String str) {
            this.vmRef = weakReference;
            this.ruleName = str;
        }

        @Override // com.bytedance.pitaya.api.PTYCepCallback
        public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
            if (z) {
                try {
                    String strLIZ = C1004610cFX.LIZ(pTYCepResult);
                    RepostCepRuleVM repostCepRuleVM = this.vmRef.get();
                    if (repostCepRuleVM != null) {
                        repostCepRuleVM.setState(new AwS130S1100000_16(strLIZ, this, 15));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
