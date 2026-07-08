package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.AnonymousClass0956;
import X.C01GW;
import X.C06MW;
import X.C0XQ7;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397720mTa;
import X.C1518520pcQ;
import X.C1916250zxv;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C2512209su;
import X.C356901a3;
import X.C452501pT;
import X.C466120IPq;
import X.C985403tE;
import X.InterfaceC1196790hFV;
import X.InterfaceC1916320zy2;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FBVNoticeObserver implements C06MW, GenericLifecycleObserver {
    public final Context LL;
    public final int LLILLJJLI;
    public final C1916250zxv LLILLL;
    public final C1518520pcQ LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final InterfaceC1916320zy2 LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(113));
    public final IAccountService LLJI = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(114));
    public AnonymousClass0956 LLJILJIL;
    public C1397510mTF LLJILJILJ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(FBVCheckResponse fBVCheckResponse) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkResponseHandle response status handle ");
        sbLIZ.append(fBVCheckResponse.status);
        C201955140j.LIZIZ("FBVNoticeObserver", C2188811AlT.LIZIZ(sbLIZ));
        int i = fBVCheckResponse.status;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C1916250zxv c1916250zxv = this.LLILLL;
                    c1916250zxv.LIZIZ().storeLong(c1916250zxv.LIZJ, fBVCheckResponse.timestampToCheckAgain);
                    InterfaceC1916320zy2 interfaceC1916320zy2 = this.LLIZLLLIL;
                    if (interfaceC1916320zy2 != null) {
                        interfaceC1916320zy2.LIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LLJILJILJ == null && C2512209su.LIZ) {
                Context context = this.LL;
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZIZ(context.getString(2131833816));
                c1397580mTM.LJFF(this.LLILLJJLI);
                c1397580mTM.LJII = false;
                C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 9));
                c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.0zxz
                    @Override // X.InterfaceC1196790hFV
                    public final void onWindowFocusChanged(boolean z) {
                        C1397510mTF c1397510mTF;
                        if (!z && (c1397510mTF = this.LIZ.LLJILJILJ) != null) {
                            c1397510mTF.LIZIZ(null);
                        }
                    }
                };
                C1397720mTa.LIZ(c1397580mTM, this.LL.getString(2131833821), new AwS607S0100000_28(this, 11));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                this.LLJILJILJ = c1397510mTF;
                C1391850mK7.LIZIZ(c1397510mTF, "332");
                C1397510mTF c1397510mTF2 = this.LLJILJILJ;
                if (c1397510mTF2 != null) {
                    c1397510mTF2.LIZLLL();
                }
                LIZLLL("fbv_consent_popup_show");
                return;
            }
            InterfaceC1916320zy2 interfaceC1916320zy22 = this.LLIZLLLIL;
            if (interfaceC1916320zy22 == null) {
                return;
            }
            interfaceC1916320zy22.LIZ();
            return;
        }
        this.LLILLL.LIZ();
        InterfaceC1916320zy2 interfaceC1916320zy23 = this.LLIZLLLIL;
        if (interfaceC1916320zy23 == null) {
            return;
        }
        interfaceC1916320zy23.LIZ();
    }

    public final void LIZJ(boolean z) {
        String curUserId = this.LLJI.LJIIJ().getCurUserId();
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        this.LLILLL.LIZ();
        if (!z) {
            LIZLLL("fbv_consent_popup_click_ok");
        }
        C1518520pcQ c1518520pcQ = this.LLILZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 137);
        AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(this, 138);
        c1518520pcQ.getClass();
        IPolicyNoticeService iPolicyNoticeServiceLJIJI = ComplianceServiceProvider.LJIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"operation\": 2,\"approve_type\": \"user_id\", \"user_id\": ");
        sbLIZ.append(curUserId);
        sbLIZ.append(", \"device_id\": ");
        sbLIZ.append(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        sbLIZ.append('}');
        iPolicyNoticeServiceLJIJI.LJII("effect_fbv_policy_US_IL", "v20230328", "pop", C2188811AlT.LIZIZ(sbLIZ), 2, null, Boolean.FALSE, new AwS572S0100000_28(awS572S0100000_28, 4), new AwS572S0100000_28(awS572S0100000_282, 5));
    }

    public final void LIZLLL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZLL);
        c2344009Gk.LJIIIIZZ("shoot_way", this.LLILZIL);
        c2344009Gk.LJIIIIZZ("creation_id", this.LLIZ);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        C1397510mTF c1397510mTF = this.LLJILJILJ;
        if (c1397510mTF != null) {
            c1397510mTF.cancel();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C201955140j.LIZIZ("FBVNoticeObserver", "onResume is executing");
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            this.LLJILJIL = C23250099c.LIZLLL((InterfaceC497601wk) this.LLJIJIL.getValue(), null, null, new C466120IPq(this, null), 3);
            return;
        }
        InterfaceC1916320zy2 interfaceC1916320zy2 = this.LLIZLLLIL;
        if (interfaceC1916320zy2 == null) {
            return;
        }
        interfaceC1916320zy2.LIZ();
    }

    public FBVNoticeObserver(Context context, int i, C1916250zxv c1916250zxv, C1518520pcQ c1518520pcQ, String str, String str2, String str3, InterfaceC1916320zy2 interfaceC1916320zy2) {
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = c1916250zxv;
        this.LLILZ = c1518520pcQ;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = interfaceC1916320zy2;
    }
}
