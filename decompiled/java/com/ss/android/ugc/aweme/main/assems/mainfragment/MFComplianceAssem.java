package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C01GW;
import X.C0X35;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1558720qfG;
import X.C1602860roS;
import X.C2214201BlK;
import X.C303460Buy;
import X.C424700Gl2;
import X.C452501pT;
import X.InterfaceC1581600rGA;
import X.InterfaceC1586340rNo;
import X.InterfaceC1617760sCU;
import X.InterfaceC500500Jk0;
import Y.ARunnableS113S0100000_13;
import Y.AfS193S0100000_24;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class MFComplianceAssem extends UIContentAssem implements InterfaceC1581600rGA {
    public C11JF LLIZLLLIL;
    public View LLJ;
    public ViewStub LLJI;
    public InterfaceC1586340rNo LLJIJIL;
    public C424700Gl2 LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1558720qfG(this));

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        this.LLJIJIL = ((IProtectionService) ServiceManager.get().getService(IProtectionService.class)).LJJJJLI();
        super.onCreate();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            this.LLIZLLLIL = (C11JF) C11NZ.LJLLILLLL(C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()), C2214201BlK.LIZJ(), new InterfaceC500500Jk0() { // from class: X.0rjW
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    return new C1599790rjV((ITpcConsentService) obj, (Activity) obj2);
                }
            }).LJL(C11S5.LIZ()).LJJLJLI(new AfS193S0100000_24(this, 10));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            this.LLIZLLLIL = (C11JF) C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()).LJL(C11S5.LIZ()).LJJLJLI(new AfS193S0100000_24(this, 11));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IHomePageService iHomePageService;
        super.onViewCreated(view);
        if (C303460Buy.LIZJ()) {
            this.LLJI = (ViewStub) LJJIJL().findViewById(R.id.xg7);
        }
        if (this.LLJI == null) {
            this.LLJ = LJJIJL().findViewById(R.id.xg6);
            this.LLJILJIL = (C424700Gl2) LJJIJL().findViewById(R.id.xg4);
        }
        if (ComplianceServiceProvider.LJIL().LJJJJZI() && (iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null)) != null) {
            iHomePageService.LIZJ();
            if (C303460Buy.LIZJ()) {
                if (this.LLJ == null && this.LLJI != null) {
                    C0X35.LJIILL(new ARunnableS113S0100000_13(this, 232));
                }
                this.LLJILJIL = (C424700Gl2) LJJIJL().findViewById(R.id.xg4);
            }
            InterfaceC1586340rNo interfaceC1586340rNo = this.LLJIJIL;
            if (interfaceC1586340rNo != null) {
                interfaceC1586340rNo.LIZ((InterfaceC1617760sCU) this.LLJILJILJ.getValue(), this.LLJ, this.LLJILJIL, LJJIJL().findViewById(R.id.tpm));
            }
        }
    }
}
