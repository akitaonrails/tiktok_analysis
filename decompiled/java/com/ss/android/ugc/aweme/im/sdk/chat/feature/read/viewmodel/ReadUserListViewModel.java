package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05QR;
import X.C0NZY;
import X.C0O25;
import X.C13BV;
import X.C1461005nk;
import X.C1658206eS;
import X.C1BNE;
import X.C2008107tn;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C897520ZIw;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadUserListViewModel extends AssemViewModel<C2008107tn> {
    public final String LL;
    public final List<Long> LLILLJJLI;
    public final C2252321DDq LLILLL = C1BNE.LIZ(C13BV.INSTANCE);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(198));
    public final C0O25 LLILZIL = new C05QR() { // from class: X.0O25
        @Override // X.C05QR
        public final void WB2(String str) {
        }

        @Override // X.C05QR
        public final void Ys1(C05QT c05qt, String str, List list) {
            this.LL.LLILLL.setValue(list);
        }
    };
    public AnonymousClass0956 LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2008107tn(0);
    }

    public final C897520ZIw vQ2() {
        return (C897520ZIw) this.LLILZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1658206eS.LIZ(C1461005nk.LIZ, this.LL, this.LLILZIL);
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0NZY(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0O25] */
    public ReadUserListViewModel(String str, List<Long> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
