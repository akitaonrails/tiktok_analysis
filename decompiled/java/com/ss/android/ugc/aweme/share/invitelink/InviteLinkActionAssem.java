package com.ss.android.ugc.aweme.share.invitelink;

import X.C019F;
import X.C01GW;
import X.C0ZBQ;
import X.C127K;
import X.C13LE;
import X.C1637806bA;
import X.C1695206kQ;
import X.C1695306kR;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C898670ZNh;
import X.EnumC1695106kP;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteLinkActionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InviteLinkActionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/share/invitelink/InviteLinkVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InviteLinkActionAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C0ZBQ.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InviteLinkVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1842), AFwS257S0000000_19.get$arr$(311), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1840));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1841));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1837));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1839));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1838));
    }

    public final InviteLinkVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (InviteLinkVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        C1695206kQ.LIZIZ((C127K) this.LLJ.getValue(), new C1695306kR(true, EnumC1695106kP.SEND_IN_TT, new AwS598S0100000_19(this, 249)));
        C127K c127k = (C127K) this.LLJI.getValue();
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJFF();
            z = true;
        } else {
            z = false;
        }
        C1695206kQ.LIZIZ(c127k, new C1695306kR(z, EnumC1695106kP.SHARE_LINK, new AwS598S0100000_19(this, 250)));
        C1695206kQ.LIZIZ((C127K) this.LLJIJIL.getValue(), new C1695306kR(true, EnumC1695106kP.COPY_LINK, new AwS598S0100000_19(this, 251)));
        C1695206kQ.LIZIZ((C127K) this.LLJILJIL.getValue(), new C1695306kR(true, EnumC1695106kP.QR_CODE, new AwS598S0100000_19(this, 252)));
        C1695206kQ.LIZIZ((C127K) this.LLJILJILJ.getValue(), new C1695306kR(true, EnumC1695106kP.GET_NEW_LINK, new AwS598S0100000_19(this, 253)));
    }
}
