package com.ss.android.ugc.aweme.pipo.cashier.refund.lynx;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1708710uZB;
import X.C1711250udH;
import X.C1722120uuo;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1711270udJ;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxRefundCashierView extends UISimpleView<C1711250udH> implements InterfaceC1711270udJ {
    public ViewTreeObserverOnGlobalLayoutListenerC1775940wJc LL;
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LL;
        if (viewTreeObserverOnGlobalLayoutListenerC1775940wJc != null) {
            C786410Ut5.C3(this.mView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
        }
        super.destroy();
    }

    public LynxRefundCashierView(s sVar) {
        super(sVar);
        this.LLILLJJLI = 1;
        this.LLILLL = "";
        this.LLILZ = "";
    }

    public final void LJJIIZI(boolean z) {
        float fLIZ;
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF != null && (shadowNodeLJFF instanceof LynxRefundCashierShadowNode)) {
            LynxRefundCashierShadowNode lynxRefundCashierShadowNode = (LynxRefundCashierShadowNode) shadowNodeLJFF;
            if (z) {
                fLIZ = 0.0f;
            } else {
                fLIZ = C1722120uuo.LIZ(32);
            }
            if (fLIZ != lynxRefundCashierShadowNode.LJIL) {
                lynxRefundCashierShadowNode.LJIL = fLIZ;
                lynxRefundCashierShadowNode.LJIILLIIL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: Exception -> 0x00ea, TryCatch #1 {Exception -> 0x00ea, blocks: (B:25:0x005e, B:30:0x0090, B:33:0x0097, B:35:0x009b, B:37:0x009f, B:39:0x00b2, B:40:0x00b8, B:42:0x00be, B:44:0x00c6, B:47:0x00ce, B:49:0x00e6, B:29:0x0085, B:27:0x006f), top: B:57:0x005e, inners: #0 }] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterPropsUpdated(X.C1311730kEt r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.refund.lynx.LynxRefundCashierView.afterPropsUpdated(X.0kEt):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C1711250udH c1711250udH = new C1711250udH(context, null, 6);
        this.mView = c1711250udH;
        c1711250udH.setRefundOptionChangeCallback(this);
        this.LL = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 6);
        C786410Ut5.x3(this.mView.getViewTreeObserver(), this.LL);
        return this.mView;
    }

    @InterfaceC1312540kGC(name = "cashier-json")
    public final void setCashierJsonString(String str) {
        this.LLILZ = str;
        C1708710uZB.LIZ("RefundCashier").LIZ(3, "lynx set cashier-json");
    }

    @InterfaceC1312540kGC(name = "event-json")
    public final void setEventJsonParams(String str) {
        this.LLILLL = str;
        C1708710uZB.LIZ("RefundCashier").LIZ(3, "lynx set event-json");
    }

    @InterfaceC1312540kGC(name = "theme")
    public final void setTheme(int i) {
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1711270udJ
    public final void Pb(String str, String str2, String str3) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "refundoptionchange");
        if (str == null) {
            str = "";
        }
        c1289960jfm.LIZIZ(str, "refund_info_string");
        if (str2 == null) {
            str2 = "";
        }
        c1289960jfm.LIZIZ(str2, "refund_methods");
        if (str3 == null) {
            str3 = "";
        }
        c1289960jfm.LIZIZ(str3, "action_schema");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
