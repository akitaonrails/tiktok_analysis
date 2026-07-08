package com.ss.android.ugc.aweme.account.login.googleonetap;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C052E;
import X.C0C64;
import X.C0XQ7;
import X.C1192904lb;
import X.C15O7;
import X.C19313710hD;
import X.C452501pT;
import X.C849700XUy;
import X.EnumC452301pR;
import X.InterfaceC2385309Wh;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.googleonetap.GoogleOneTapService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GoogleOneTapService implements IGoogleOneTapService {
    public static final C01GW<GoogleOneTapService> LJI = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C19313710hD());
    public long LIZ;
    public long LIZIZ;
    public final long LIZJ;
    public int LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C1192904lb());
    public final C01GW LJFF = C452501pT.LIZIZ(new C052E(this));

    public final Keva LIZIZ() {
        return (Keva) this.LJ.getValue();
    }

    public GoogleOneTapService() {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZ = LIZIZ().getLong("last_trigger_time", -1L);
        this.LIZIZ = LIZIZ().getLong("first_trigger_time", -1L);
        long j = LIZIZ().getLong("first_proactive_check", -1L);
        this.LIZJ = j;
        if (j == -1) {
            LIZIZ().storeLong("first_proactive_check", System.currentTimeMillis());
            this.LIZJ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService
    public final void LIZ(final String str, final WeakReference weakReference) {
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "remove_got_from_fyp_16vv_android", true, true)) {
            return;
        }
        C15O7.LJIIIIZZ(200L).LJ(new InterfaceC2385309Wh() { // from class: X.10gz
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("GoogleOneTapService@aebf.updateNewVV$1");
                GoogleOneTapService googleOneTapService = this.LIZ;
                int i = googleOneTapService.LIZLLL + 1;
                googleOneTapService.LIZLLL = i;
                if (i >= 16 && ((Boolean) googleOneTapService.LJFF.getValue()).booleanValue() && this.LIZ.LIZJ + (((long) 7) * 86400000) > System.currentTimeMillis() && this.LIZ.LIZJ("vv_trigger", weakReference)) {
                    this.LIZ.LIZLLL = Integer.MIN_VALUE;
                    Activity activity = weakReference.get();
                    String str2 = str;
                    if (activity instanceof C19EG) {
                        C849690XUx.LIZ(str2, "vv_trigger");
                        PopupManager.LJIJI(new C1912380zrg((C19EG) activity, str2, "vv_trigger", AFwS217S0000000_28.get$arr$(524)), true);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GoogleOneTapService@aebf.updateNewVV$1");
                return unit;
            }
        }, C15O7.LJI, null);
    }

    public final boolean LIZJ(String str, WeakReference weakReference) {
        C849700XUy.LIZ.getClass();
        if (!C849700XUy.LIZ(str, weakReference) || Intrinsics.LJFF("US", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase()) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        long j = this.LIZIZ;
        if (j == -1) {
            LIZIZ().storeLong("first_trigger_time", System.currentTimeMillis());
            return true;
        }
        if (j + (((long) 1) * 86400000) < System.currentTimeMillis()) {
            long j2 = this.LIZ;
            if (j2 == -1) {
                LIZIZ().storeLong("last_trigger_time", System.currentTimeMillis());
                return true;
            }
            if (j2 + (((long) 7) * 86400000) < System.currentTimeMillis()) {
                this.LIZIZ = this.LIZ;
                this.LIZ = System.currentTimeMillis();
                LIZIZ().storeLong("first_trigger_time", this.LIZIZ);
                LIZIZ().storeLong("last_trigger_time", this.LIZ);
                return true;
            }
        }
        return false;
    }
}
