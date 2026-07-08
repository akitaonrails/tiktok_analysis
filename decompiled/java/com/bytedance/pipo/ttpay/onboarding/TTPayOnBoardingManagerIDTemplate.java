package com.bytedance.pipo.ttpay.onboarding;

import X.AbstractC1716900umO;
import X.C123100dR;
import X.C1323820kYO;
import X.C1440005kM;
import X.C1548820qPI;
import X.C1716550ulp;
import X.C1716570ulr;
import X.C1717080umg;
import X.C1717140umm;
import X.C1717490unL;
import X.C1719100upw;
import X.C1719450uqV;
import X.C19EG;
import X.C2188811AlT;
import X.C397901gf;
import X.C585330MxX;
import X.C786410Ut5;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import android.content.Context;
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
public final class TTPayOnBoardingManagerIDTemplate extends BaseRegisterManager {
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
    public final Function0<String> LIZLLL() {
        return this.LLILZIL.length() == 0 ? AFwS215S0000000_26.get$arr$(21) : new AwS570S0100000_26(this, 58);
    }

    public final void LJIJ() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, this.LL);
        jSONObject.put("source", this.LLILLJJLI);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "PIPO_ON_BOARDING_FINISH"));
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIIZ(InterfaceC1717160umo interfaceC1717160umo) throws JSONException {
        LJIILJJIL();
        if (!this.LLJJIII) {
            LJIJ();
            C1440005kM.LIZ(new C585330MxX());
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
            if (c1717080umgLJFF != null) {
                String str2 = c1717080umgLJFF.LJIIJ;
                if (str2 != null && C123100dR.LIZ(str2)) {
                    SmartRouter.buildRoute(this.LLJJI, str2).open();
                }
                String str3 = c1717080umgLJFF.LJIIJJI;
                if (str3 != null && C123100dR.LIZ(str3)) {
                    SmartRouter.buildRoute(this.LLJJI, str3).open();
                }
                String str4 = c1717080umgLJFF.LJIIL;
                if (str4 != null && C123100dR.LIZ(str4)) {
                    SmartRouter.buildRoute(this.LLJJI, str4).open();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIL(InterfaceC1717200ums interfaceC1717200ums) {
        InterfaceC1717160umo interfaceC1717160umo;
        C19EG c19eg;
        if (!this.LLJJIJI && ((interfaceC1717200ums instanceof C1719100upw) || (interfaceC1717200ums instanceof C1719450uqV) || (interfaceC1717200ums instanceof C1717140umm))) {
            this.LLJJIJI = true;
            WeakReference<C19EG> weakReference = this.LLJJ;
            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                c19eg.finish();
            }
        }
        if (interfaceC1717200ums instanceof C1716570ulr) {
            this.LLJJIII = true;
        }
        if ((interfaceC1717200ums instanceof C1717140umm) && (interfaceC1717160umo = ((AbstractC1716900umO) interfaceC1717200ums).LIZLLL) != null) {
            interfaceC1717160umo.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C19EG c19eg;
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            WeakReference<C19EG> weakReference = this.LLJJ;
            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                c19eg.finish();
            }
        }
        String str6 = null;
        if (interfaceC1717200ums instanceof C1717490unL) {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str7 = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str7);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStepExecuteCancel: failUrl: ");
            if (c1717080umgLJFF != null) {
                str4 = c1717080umgLJFF.LJIILL;
            } else {
                str4 = null;
            }
            sbLIZ.append(str4);
            C2188811AlT.LIZIZ(sbLIZ);
            C1440005kM.LIZ(new C585330MxX());
            if (c1717080umgLJFF != null && (str5 = c1717080umgLJFF.LJIILL) != null && C123100dR.LIZ(str5)) {
                SmartRouter.buildRoute(this.LLJJI, str5).open();
            }
        }
        if (interfaceC1717200ums instanceof C1716570ulr) {
            LJIJ();
            C1440005kM.LIZ(new C585330MxX());
            C1716550ulp c1716550ulp2 = C1716550ulp.LIZ;
            String str8 = this.LL;
            c1716550ulp2.getClass();
            C1717080umg c1717080umgLJFF2 = C1716550ulp.LJFF(str8);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStepExecuteCancel: portalUrl: ");
            if (c1717080umgLJFF2 != null) {
                str = c1717080umgLJFF2.LJIIJ;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (c1717080umgLJFF2 != null && (str3 = c1717080umgLJFF2.LJIIJ) != null && C123100dR.LIZ(str3)) {
                SmartRouter.buildRoute(this.LLJJI, str3).open();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onStepExecuteCancel: balanceUrl: ");
            if (c1717080umgLJFF2 != null) {
                str6 = c1717080umgLJFF2.LJIIJJI;
            }
            sbLIZ3.append(str6);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (c1717080umgLJFF2 != null && (str2 = c1717080umgLJFF2.LJIIJJI) != null && C123100dR.LIZ(str2)) {
                SmartRouter.buildRoute(this.LLJJI, str2).open();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJJI(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (interfaceC1717200ums instanceof C1716570ulr) {
            LJIJ();
            String str9 = null;
            if (obj != null && Intrinsics.LJFF(obj.toString(), "approved")) {
                C1716550ulp c1716550ulp = C1716550ulp.LIZ;
                String str10 = this.LL;
                c1716550ulp.getClass();
                C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str10);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStepExecuteSuccess: portalUrl: ");
                if (c1717080umgLJFF != null) {
                    str4 = c1717080umgLJFF.LJIIJ;
                } else {
                    str4 = null;
                }
                sbLIZ.append(str4);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1717080umgLJFF != null && (str8 = c1717080umgLJFF.LJIIJ) != null && C123100dR.LIZ(str8)) {
                    SmartRouter.buildRoute(this.LLJJI, str8).open();
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onStepExecuteSuccess: balanceUrl: ");
                if (c1717080umgLJFF != null) {
                    str5 = c1717080umgLJFF.LJIIJJI;
                } else {
                    str5 = null;
                }
                sbLIZ2.append(str5);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (c1717080umgLJFF != null && (str7 = c1717080umgLJFF.LJIIJJI) != null && C123100dR.LIZ(str7)) {
                    SmartRouter.buildRoute(this.LLJJI, str7).open();
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onStepExecuteSuccess: withdrawUrl: ");
                if (c1717080umgLJFF != null) {
                    str9 = c1717080umgLJFF.LJIILIIL;
                }
                sbLIZ3.append(str9);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (c1717080umgLJFF != null && (str6 = c1717080umgLJFF.LJIILIIL) != null && C123100dR.LIZ(str6)) {
                    SmartRouter.buildRoute(this.LLJJI, str6).open();
                }
            } else {
                C1716550ulp c1716550ulp2 = C1716550ulp.LIZ;
                String str11 = this.LL;
                c1716550ulp2.getClass();
                C1717080umg c1717080umgLJFF2 = C1716550ulp.LJFF(str11);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onStepExecuteSuccess: portalUrl: ");
                if (c1717080umgLJFF2 != null) {
                    str = c1717080umgLJFF2.LJIIJ;
                } else {
                    str = null;
                }
                sbLIZ4.append(str);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (c1717080umgLJFF2 != null && (str3 = c1717080umgLJFF2.LJIIJ) != null && C123100dR.LIZ(str3)) {
                    SmartRouter.buildRoute(this.LLJJI, str3).open();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onStepExecuteSuccess: balanceUrl: ");
                if (c1717080umgLJFF2 != null) {
                    str9 = c1717080umgLJFF2.LJIIJJI;
                }
                sbLIZ5.append(str9);
                C2188811AlT.LIZIZ(sbLIZ5);
                if (c1717080umgLJFF2 != null && (str2 = c1717080umgLJFF2.LJIIJJI) != null && C123100dR.LIZ(str2)) {
                    SmartRouter.buildRoute(this.LLJJI, str2).open();
                }
            }
        }
        InterfaceC1717160umo interfaceC1717160umoLIZ = interfaceC1717200ums.LIZ();
        if (interfaceC1717160umoLIZ != null) {
            interfaceC1717160umoLIZ.LIZLLL();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TTPayOnBoardingManagerIDTemplate(C19EG c19eg, String str, String str2, WalletFlowDecision walletFlowDecision, String str3) {
        String str4 = str3;
        super(str, str2, walletFlowDecision, "", str4 == null ? "" : str4, null, null, 96);
        this.LLJILLL = c19eg;
        this.LLJJI = C786410Ut5.P3(c19eg);
        this.LLJJ = new WeakReference<>(this.LLJILLL);
    }
}
