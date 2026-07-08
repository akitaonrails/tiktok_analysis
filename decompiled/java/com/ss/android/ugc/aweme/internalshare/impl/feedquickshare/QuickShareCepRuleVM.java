package com.ss.android.ugc.aweme.internalshare.impl.feedquickshare;

import X.C065R;
import X.C1004600cFW;
import X.C1865840yec;
import X.C998420c5Y;
import X.InterfaceC0148002o;
import X.InterfaceC1610880s1O;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS130S1100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickShareCepRuleVM extends AssemViewModel<C998420c5Y> {
    public static final /* synthetic */ int LLILLL = 0;
    public boolean LL;
    public final List<String> LLILLJJLI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C998420c5Y(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (C1865840yec.LIZ()) {
            for (String str : (ArrayList) this.LLILLJJLI) {
                InterfaceC1610880s1O interfaceC1610880s1O = (InterfaceC1610880s1O) C065R.LIZJ.getValue();
                if (interfaceC1610880s1O != null) {
                    interfaceC1610880s1O.LIZIZ("quick_share_button_trigger_cep", str);
                }
            }
            ((ArrayList) this.LLILLJJLI).clear();
            this.LL = false;
        }
        super.onCleared();
    }

    public static final class SharePTYCepCallback implements PTYCepCallback {
        public final String ruleName;
        public final String trigger;
        public final WeakReference<QuickShareCepRuleVM> vmRef;

        public final String getTrigger() {
            return this.trigger;
        }

        public SharePTYCepCallback(WeakReference<QuickShareCepRuleVM> weakReference, String str, String str2) {
            this.vmRef = weakReference;
            this.trigger = str;
            this.ruleName = str2;
        }

        @Override // com.bytedance.pitaya.api.PTYCepCallback
        public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
            if (z) {
                try {
                    String strLIZ = C1004600cFW.LIZ(pTYCepResult);
                    QuickShareCepRuleVM quickShareCepRuleVM = this.vmRef.get();
                    if (quickShareCepRuleVM != null) {
                        quickShareCepRuleVM.setState(new AwS130S1100000_16(strLIZ, this, 5));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
