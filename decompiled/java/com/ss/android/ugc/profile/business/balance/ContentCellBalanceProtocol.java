package com.ss.android.ugc.profile.business.balance;

import X.C01GW;
import X.C11NJ;
import X.C11O8;
import X.C1253840ijW;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.InterfaceC1253830ijV;
import Y.AfS188S0100000_19;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellBalanceProtocol extends ContentCellProtocol {
    public final C01GW LLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(345));
    public boolean LLLF;
    public boolean LLLFF;
    public C11NJ LLLFFI;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_balance";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        InterfaceC1253830ijV interfaceC1253830ijVLJLLL;
        C11O8 c11o8LJ;
        if (this.LLLFFI == null) {
            this.LLLFFI = new C11NJ();
        }
        C11NJ c11nj = this.LLLFFI;
        if (c11nj == null || (interfaceC1253830ijVLJLLL = LJLLL()) == null || (c11o8LJ = interfaceC1253830ijVLJLLL.LJ()) == null) {
            return false;
        }
        c11nj.LIZ(c11o8LJ.LJJLJLI(new AfS188S0100000_19(this, 40)));
        return false;
    }

    public final InterfaceC1253830ijV LJLLL() {
        return (InterfaceC1253830ijV) this.LLL.getValue();
    }

    public final void LJLLLL() {
        String strLJIIJJI;
        IAccountUserService iAccountUserService;
        Boolean boolIsCurUserOrgAccount;
        IAccountUserService iAccountUserService2;
        Boolean boolIsOrgAccConvInterPeriod;
        InterfaceC1253830ijV interfaceC1253830ijVLJLLL;
        if (!this.LLLFF || ((interfaceC1253830ijVLJLLL = LJLLL()) != null && interfaceC1253830ijVLJLLL.LJII())) {
            InterfaceC1253830ijV interfaceC1253830ijVLJLLL2 = LJLLL();
            boolean z = interfaceC1253830ijVLJLLL2 != null && interfaceC1253830ijVLJLLL2.LIZ() && (iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null)) != null && (boolIsCurUserOrgAccount = iAccountUserService.isCurUserOrgAccount()) != null && boolIsCurUserOrgAccount.booleanValue() && ((iAccountUserService2 = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null)) == null || (boolIsOrgAccConvInterPeriod = iAccountUserService2.isOrgAccConvInterPeriod()) == null || !boolIsOrgAccConvInterPeriod.booleanValue());
            InterfaceC1253830ijV interfaceC1253830ijVLJLLL3 = LJLLL();
            if (interfaceC1253830ijVLJLLL3 == null || !interfaceC1253830ijVLJLLL3.LJIIL() || z) {
                return;
            }
            InterfaceC1253830ijV interfaceC1253830ijVLJLLL4 = LJLLL();
            if (interfaceC1253830ijVLJLLL4 == null || (strLJIIJJI = interfaceC1253830ijVLJLLL4.LJIIJJI()) == null) {
                strLJIIJJI = "";
            }
            LJLL(strLJIIJJI);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void onDestroy() {
        C11NJ c11nj = this.LLLFFI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLLFFI = null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        if (!C1253840ijW.LIZJ() || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJII()) {
            return;
        }
        LJLLLL();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        boolean z;
        String str;
        String str2;
        C19EG activity;
        boolean z2 = this.LLLFF;
        this.LLLFF = false;
        if (z2) {
            LIZLLL();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("entrance", "profile_center");
        InterfaceC1253830ijV interfaceC1253830ijVLJLLL = LJLLL();
        if (interfaceC1253830ijVLJLLL != null && interfaceC1253830ijVLJLLL.LJIILJJIL()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_income_before", str);
        InterfaceC1253830ijV interfaceC1253830ijVLJLLL2 = LJLLL();
        if (interfaceC1253830ijVLJLLL2 != null && interfaceC1253830ijVLJLLL2.LJIIL()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("display_balance", str2);
        if (!this.LLLF) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("show_red_point", str3);
        C20684815ws.LJIILLIIL("livesdk_wallet_entrance_click", c2344009Gk.LIZ);
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1253840ijW.LIZIZ(activity, false, true);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJLJLLL(com.google.gson.n r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L1e
            java.lang.String r0 = "cell"
            com.google.gson.n r1 = r4.LJJIJ(r0)     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L1e
            java.lang.String r0 = "tail_red_dot"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1e
            boolean r0 = r0.LJ()     // Catch: java.lang.Exception -> L1a
            if (r0 != r2) goto L1e
            goto L20
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            r3.LLLFF = r0
            if (r0 != 0) goto L31
            X.0ijV r0 = r3.LJLLL()
            if (r0 == 0) goto L34
            boolean r0 = r0.LJII()
            if (r0 != r2) goto L34
        L31:
            r3.LLLF = r2
            return r2
        L34:
            r2 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.balance.ContentCellBalanceProtocol.LJLJLLL(com.google.gson.n):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        boolean z2;
        String str;
        String str2;
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("entrance", "setting_panel");
            InterfaceC1253830ijV interfaceC1253830ijVLJLLL = LJLLL();
            if (interfaceC1253830ijVLJLLL != null && interfaceC1253830ijVLJLLL.LJIILJJIL()) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str3 = "1";
            if (z2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("has_income_before", str);
            InterfaceC1253830ijV interfaceC1253830ijVLJLLL2 = LJLLL();
            if (interfaceC1253830ijVLJLLL2 != null && interfaceC1253830ijVLJLLL2.LJIIL()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("display_balance", str2);
            if (!this.LLLF) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("show_red_point", str3);
            C20684815ws.LJIILLIIL("livesdk_wallet_entrance_show", c2344009Gk.LIZ);
            return;
        }
        C11NJ c11nj = this.LLLFFI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLLFFI = null;
    }
}
