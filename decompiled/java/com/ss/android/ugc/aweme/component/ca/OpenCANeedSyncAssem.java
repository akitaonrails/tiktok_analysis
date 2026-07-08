package com.ss.android.ugc.aweme.component.ca;

import X.C019F;
import X.C01GW;
import X.C1155840gBS;
import X.C1266280j3a;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class OpenCANeedSyncAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1155840gBS.class, "KEY_STEP_DATA"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OpenCANeedSyncAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/ca/OpenCANeedSyncViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OpenCANeedSyncAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OpenCANeedSyncViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 958), AFwS257S0000000_19.get$arr$(115), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 954));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 953));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 955));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 957));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 952));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 956));
    }

    public final C1155840gBS Go() {
        return (C1155840gBS) this.LLIZLLLIL.getValue();
    }

    public final OpenCANeedSyncViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (OpenCANeedSyncViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        OpenCANeedSyncViewModel openCANeedSyncViewModelHo = Ho();
        selectSubscribe(openCANeedSyncViewModelHo, new C2217381BqS() { // from class: X.0hu8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1222010huB) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0hu5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1222010huB) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0hu6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1222010huB) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(openCANeedSyncViewModelHo.usedInReusedScene), null, new C1266280j3a(this, 0));
        C786410Ut5.U8((C197039127h) this.LLJILJILJ.getValue(), new ACListenerS154S0100000_19(this, 234));
        Ho().wQ2(Go().LLILLJJLI, true, Go().LLILLL);
    }
}
