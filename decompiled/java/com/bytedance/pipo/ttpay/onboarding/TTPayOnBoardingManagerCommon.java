package com.bytedance.pipo.ttpay.onboarding;

import X.AbstractC1387200mCc;
import X.AbstractC1716900umO;
import X.C123100dR;
import X.C1323820kYO;
import X.C13LP;
import X.C1440005kM;
import X.C1548820qPI;
import X.C1716550ulp;
import X.C1716570ulr;
import X.C1716930umR;
import X.C1717080umg;
import X.C1717140umm;
import X.C1717290un1;
import X.C1717490unL;
import X.C1717770unn;
import X.C1719100upw;
import X.C1719450uqV;
import X.C19EG;
import X.C397901gf;
import X.C585330MxX;
import X.C786410Ut5;
import X.EnumC1717170ump;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.biz.wallet.network.model.Step;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class TTPayOnBoardingManagerCommon extends BaseRegisterManager {
    public final C19EG LLJILLL;
    public final WeakReference<C19EG> LLJJ;
    public final Context LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final boolean LJIILL(Step step, List<Step> list) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final Function0<String> LIZLLL() {
        String str = this.LLILZIL;
        return (str == null || str.length() == 0) ? AFwS215S0000000_26.get$arr$(20) : new AwS570S0100000_26(this, 57);
    }

    public final void LJIJI() {
        String str;
        List<String> list;
        List<String> list2;
        C1716550ulp c1716550ulp = C1716550ulp.LIZ;
        String str2 = this.LL;
        c1716550ulp.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
        if (c1717080umgLJFF == null || (str = c1717080umgLJFF.LJIIIIZZ) == null || str.length() == 0 || (((list = C1717290un1.LIZ().ecCashierRefreshEntrances) != null && C13LP.LJJJJ(str, list)) || ((list2 = C1717290un1.LIZ().ecCashierRefreshEntrances) != null && list2.contains("*")))) {
            AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LJIIJJI().LIZJ();
            SmartRouter.buildRoute(abstractC1387200mCcLIZJ != null ? abstractC1387200mCcLIZJ.LIZIZ() : null, "aweme://ec/payment_refresh_cashier").open();
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIIZ(InterfaceC1717160umo interfaceC1717160umo) throws JSONException {
        LJIILJJIL();
        LJIJ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIL(InterfaceC1717200ums interfaceC1717200ums) {
        InterfaceC1717160umo interfaceC1717160umo;
        C19EG c19eg;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_ttpay_onboarding_close_activity_immediate", true) && !this.LLJJIII && ((interfaceC1717200ums instanceof C1719100upw) || (interfaceC1717200ums instanceof C1719450uqV) || (interfaceC1717200ums instanceof C1717140umm) || (interfaceC1717200ums instanceof C1716570ulr))) {
            this.LLJJIII = true;
            WeakReference<C19EG> weakReference = this.LLJJ;
            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                c19eg.finish();
            }
        }
        if ((interfaceC1717200ums instanceof C1717140umm) && (interfaceC1717160umo = ((AbstractC1716900umO) interfaceC1717200ums).LIZLLL) != null) {
            interfaceC1717160umo.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(java.lang.Object r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerCommon.LJIJ(java.lang.Object):void");
    }

    public final void LJIJJ(EnumC1717170ump enumC1717170ump) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, this.LL);
        jSONObject.put("source", this.LLILLJJLI);
        jSONObject.put("action", enumC1717170ump.getValue());
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "PIPO_ON_BOARDING_FINISH"));
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        String str;
        C19EG c19eg;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_ttpay_onboarding_close_activity_immediate", true) && !this.LLJJIII) {
            this.LLJJIII = true;
            WeakReference<C19EG> weakReference = this.LLJJ;
            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                c19eg.finish();
            }
        }
        Object obj2 = null;
        if (interfaceC1717200ums instanceof C1717490unL) {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
            C1440005kM.LIZ(new C585330MxX());
            LJIJJ(EnumC1717170ump.REFRESH);
            if (c1717080umgLJFF != null && (str = c1717080umgLJFF.LJIILL) != null && C123100dR.LIZ(str)) {
                SmartRouter.buildRoute(this.LLJJI, str).open();
            }
        }
        if (interfaceC1717200ums instanceof C1716570ulr) {
            if (obj instanceof Boolean) {
                obj2 = obj;
            }
            if (Intrinsics.LJFF(obj2, Boolean.TRUE)) {
                LJIJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJJI(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        InterfaceC1717160umo interfaceC1717160umoLIZ = interfaceC1717200ums.LIZ();
        if (interfaceC1717160umoLIZ != null) {
            interfaceC1717160umoLIZ.LIZLLL();
        }
        if (interfaceC1717200ums instanceof C1716930umR) {
            LJIJ(obj);
        }
        if (interfaceC1717200ums instanceof C1716570ulr) {
            LJIJI();
        }
    }

    public TTPayOnBoardingManagerCommon(C19EG c19eg, String str, String str2, WalletFlowDecision walletFlowDecision, String str3) {
        super(str, str2, walletFlowDecision, "", str3, null, "SET_MOBILE", 32);
        this.LLJILLL = c19eg;
        this.LLJJI = C786410Ut5.P3(c19eg);
        this.LLJJ = new WeakReference<>(this.LLJILLL);
    }
}
