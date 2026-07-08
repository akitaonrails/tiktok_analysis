package com.ss.android.ugc.aweme.pipo.cashier.lynx;

import X.C098200Yq;
import X.C1227904rF;
import X.C1298700jts;
import X.C1298720jtu;
import X.C1299240juk;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1709430uaL;
import X.C1709570uaZ;
import X.C1710050ubL;
import X.C1711340udQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C1AF0;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.EnumC1298710jtt;
import X.EnumC1709240ua2;
import X.EnumC1709270ua5;
import X.EnumC586150Myr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1709390uaH;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import j27.s;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxTtlsPdpCashierView extends UISimpleView<C1710050ubL> implements InterfaceC1709390uaH {
    public Context LL;
    public C1709430uaL LLILLJJLI;
    public C1710050ubL LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1775940wJc LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1709390uaH
    public final void pP1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL() {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView.LJJIJIL():void");
    }

    @Override // X.InterfaceC1709390uaH
    public final void XX1() {
        C1709430uaL c1709430uaL = this.LLILLJJLI;
        LJJIJIIJIL(c1709430uaL != null ? c1709430uaL.LJIIIZ() : null);
        LJJIJIL();
    }

    @Override // X.InterfaceC1709390uaH
    public final void c3() {
        C1709430uaL c1709430uaL = this.LLILLJJLI;
        LJJIJIIJI(String.valueOf(c1709430uaL != null ? c1709430uaL.LIZLLL() : null));
        C1709430uaL c1709430uaL2 = this.LLILLJJLI;
        LJJIJIIJIL(c1709430uaL2 != null ? c1709430uaL2.LJIIIZ() : null);
        LJJIJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        Unit unit;
        ViewTreeObserver viewTreeObserver;
        LJJIJ("destroy");
        C1709430uaL c1709430uaL = this.LLILLJJLI;
        if (c1709430uaL != null) {
            c1709430uaL.LJIILJJIL();
        }
        try {
            C1710050ubL c1710050ubL = this.LLILLL;
            if (c1710050ubL == null || (viewTreeObserver = c1710050ubL.getViewTreeObserver()) == null) {
                unit = null;
            } else {
                ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLILZLL;
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.destroy();
    }

    public LynxTtlsPdpCashierView(s sVar) {
        super(sVar);
        this.LLIZLLLIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new instance: ");
        C1711340udQ.LIZ.getClass();
        sbLIZ.append(C1711340udQ.LIZJ(this));
        LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIIZI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisableLynxTouchEvent: ");
        sbLIZ.append(z);
        LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL = z;
    }

    public final void LJJIJ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx_ttls_pdp_cashier_view, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIJIIJI(String str) {
        C1298720jtu c1298720jtu;
        if (!Intrinsics.LJFF(this.LLILZ, str)) {
            LJJIJ("common_params_changed");
            this.LLILZ = str;
            C1298700jts c1298700jts = new C1298700jts(getSign(), "pipocommonparamschanged");
            String str2 = this.LLILZ;
            if (str2 == null) {
                str2 = "";
            }
            c1298700jts.LIZIZ(str2, "params");
            s sVar = this.mContext;
            if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                c1298720jtu.LIZIZ(c1298700jts);
            }
        }
    }

    public final void LJJIJIIJIL(String str) {
        C1298720jtu c1298720jtu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pp_id may changed: new: ");
        sbLIZ.append(str);
        sbLIZ.append(", old: ");
        sbLIZ.append(this.LLILZIL);
        LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LLILZIL, str)) {
            this.LLILZIL = str;
            C1298700jts c1298700jts = new C1298700jts(getSign(), "pipopricingplanidchanged");
            String str2 = this.LLILZIL;
            if (str2 == null) {
                str2 = "";
            }
            c1298700jts.LIZIZ(str2, "pricing_plan_id");
            s sVar = this.mContext;
            if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                c1298720jtu.LIZIZ(c1298700jts);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        LJJIJ("create_view");
        if (context != null) {
            this.LL = context;
            C1710050ubL c1710050ubL = new C1710050ubL(context);
            View.OnClickListener aCListenerS160S0100000_26 = new ACListenerS160S0100000_26(this, 0);
            if (C1848410yCV.LIZ) {
                aCListenerS160S0100000_26 = new f(aCListenerS160S0100000_26);
            }
            a aVar = new a(aCListenerS160S0100000_26);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1710050ubL);
            }
            c1710050ubL.setOnClickListener(aVar);
            this.LLILLL = c1710050ubL;
            this.LLILZLL = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 0);
            ViewTreeObserver viewTreeObserver = c1710050ubL.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLILZLL;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            C1710050ubL c1710050ubL2 = this.LLILLL;
            if (c1710050ubL2 != null) {
                c1710050ubL2.setRefreshCallback(new AwS570S0100000_26(this, 3));
            }
            return this.LLILLL;
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchEvent(C1299240juk c1299240juk) {
        if (c1299240juk != null) {
            if (c1299240juk.LIZ.LIZJ != EnumC1298710jtt.kTouch) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMotionEvent error, event type is not touch event. type is ");
                sbLIZ.append(c1299240juk.LIZ.LIZJ);
                LynxLog.w("LynxEventDetail", C2188811AlT.LIZIZ(sbLIZ));
            }
            MotionEvent motionEvent = c1299240juk.LIZLLL;
            if (motionEvent != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handling event: ");
                sbLIZ2.append(motionEvent);
                sbLIZ2.append(", ");
                sbLIZ2.append(this.LLIZLLLIL);
                LJJIJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (!this.LLIZLLLIL) {
            return true;
        }
        return super.dispatchEvent(c1299240juk);
    }

    @InterfaceC1312540kGC(name = "cashier-data")
    public final void setCashierData(String str) {
        C1709430uaL c1709430uaLLJIL;
        JSONObject jSONObjectLIZLLL;
        C1709430uaL c1709430uaL;
        C1709570uaZ c1709570uaZ;
        C1709570uaZ c1709570uaZ2;
        EnumC1709240ua2 enumC1709240ua2;
        try {
            C1227904rF.LIZ.getClass();
            LynxCashierData lynxCashierData = (LynxCashierData) C1227904rF.LIZIZ(str, LynxCashierData.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set_cashier_data p_r_id: ");
            sbLIZ.append(lynxCashierData.payRequestId);
            sbLIZ.append(", n_id: ");
            sbLIZ.append(lynxCashierData.notificationId);
            LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
            Context context = this.LL;
            if (context != null) {
                IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
                String strLJIIIZ = null;
                if (iPIPOCashierService != null) {
                    String str2 = lynxCashierData.payRequestId;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = lynxCashierData.notificationId;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c1709430uaLLJIL = iPIPOCashierService.LJIL(context, str2, str3, EnumC1709270ua5.TTLS);
                } else {
                    c1709430uaLLJIL = null;
                }
                if (!(c1709430uaLLJIL instanceof C1709430uaL)) {
                    c1709430uaLLJIL = null;
                }
                this.LLILLJJLI = c1709430uaLLJIL;
                if (c1709430uaLLJIL != null) {
                    c1709430uaLLJIL.LLJJIJIIJIL = "one_step_checkout";
                }
                String str5 = lynxCashierData.cashierStr;
                if (str5 != null && c1709430uaLLJIL != null) {
                    Integer num = lynxCashierData.theme;
                    if (num != null && num.intValue() == 1) {
                        enumC1709240ua2 = EnumC1709240ua2.TOKO;
                    } else {
                        enumC1709240ua2 = EnumC1709240ua2.DEFAULT;
                    }
                    c1709430uaLLJIL.LJIJI(str5, enumC1709240ua2);
                }
                C1709430uaL c1709430uaL2 = this.LLILLJJLI;
                if (c1709430uaL2 != null && (c1709570uaZ2 = c1709430uaL2.LLILLL) != null) {
                    c1709570uaZ2.LJJ(EnumC586150Myr.LYNX_PDP_CASHIER);
                }
                C1709430uaL c1709430uaL3 = this.LLILLJJLI;
                if (c1709430uaL3 != null && (c1709570uaZ = c1709430uaL3.LLILLL) != null) {
                    c1709570uaZ.LJJJJJ(this);
                }
                String str6 = lynxCashierData.eventBizParamsStr;
                if (str6 != null && (c1709430uaL = this.LLILLJJLI) != null) {
                    c1709430uaL.LIZ(new JSONObject(str6));
                }
                C1709430uaL c1709430uaL4 = this.LLILLJJLI;
                if (c1709430uaL4 != null) {
                    jSONObjectLIZLLL = c1709430uaL4.LIZLLL();
                } else {
                    jSONObjectLIZLLL = null;
                }
                LJJIJIIJI(String.valueOf(jSONObjectLIZLLL));
                C1709430uaL c1709430uaL5 = this.LLILLJJLI;
                if (c1709430uaL5 != null) {
                    strLJIIIZ = c1709430uaL5.LJIIIZ();
                }
                LJJIJIIJIL(strLJIIIZ);
                LJJIJIL();
                return;
            }
            C1AF0.LIZJ("set_cashier_data with empty android_context");
            LJJIJ("set_cashier_data with empty android_context");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            LJJIJ("fail to parse cashier_data");
        }
    }
}
