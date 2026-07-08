package com.ss.android.ugc.aweme.component.guide;

import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C1390130mHL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1715330ujr;
import X.C1716030ukz;
import X.C1716490ulj;
import X.C1716550ulp;
import X.C1717080umg;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class GuidePageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final long LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GuidePageAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/guide/GuidePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GuidePageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GuidePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 80), AFwS268S0000000_26.get$arr$(106), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1716490ulj.class, "SOURCE_DATA"), checkSupervisorPrepared());
        this.LLJI = System.currentTimeMillis();
        this.LLJIJIL = -1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 134));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 135));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 138));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 139));
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 140));
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 141));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 143));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 142));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 136));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 137));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 79));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 144));
    }

    public final C1716490ulj Go() {
        return (C1716490ulj) this.LLJ.getValue();
    }

    public final InfoCollectGuideModel Ho() {
        return Go().LLILZLL;
    }

    public final boolean Jo() {
        String str;
        InfoCollectGuideModel infoCollectGuideModelHo = Ho();
        return (infoCollectGuideModelHo == null || (str = infoCollectGuideModelHo.scene) == null || !u.LJIJI(str, "SET_MOBILE", true)) ? false : true;
    }

    public final void Lo(String str) {
        String str2;
        String strDecode;
        String str3;
        try {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str4 = Go().LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str4);
            if (c1717080umgLJFF == null || (strDecode = c1717080umgLJFF.LIZ) == null) {
                InfoCollectGuideModel infoCollectGuideModel = Go().LLILZLL;
                if (infoCollectGuideModel != null) {
                    str2 = infoCollectGuideModel.host;
                } else {
                    str2 = null;
                }
                strDecode = Uri.decode(str2);
            }
            String str5 = Go().LLIZLLLIL;
            String str6 = Go().LLIZ;
            if (Jo()) {
                str3 = "MOBILE";
            } else {
                str3 = "PIN";
            }
            C1716030ukz.LIZIZ(strDecode, str5, str6, str3, str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void No(boolean z) {
        if (z) {
            C1715330ujr.LIZJ((View) this.LLJJI.getValue());
        } else {
            C786410Ut5.LLZ((C1390130mHL) this.LLJJI.getValue(), 8);
        }
        ((C197039127h) this.LLJILJIL.getValue()).setEnabled(!z);
        ((TuxNavBar) this.LLJJIII.getValue()).LJJ(new AwS112S0110000_26(this, z, 2), "skip");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.guide.GuidePageAssem.onViewCreated(android.view.View):void");
    }
}
