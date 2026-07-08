package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2;

import X.AbstractC333830D6v;
import X.AbstractC333850D6x;
import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C09IC;
import X.C09IR;
import X.C0D6E;
import X.C0D6J;
import X.C0D6U;
import X.C0PEM;
import X.C1024180cl6;
import X.C13BV;
import X.C13LP;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C332170D0l;
import X.C333730D6l;
import X.C333740D6m;
import X.C333760D6o;
import X.C333860D6y;
import X.C844470XAv;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.CheckoutOrderDetails;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersV2ViewModel extends ViewModel {
    public final C0D6E LL = new C0D6E();
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;
    public final C2252331DDr LLILZLL;
    public final AnonymousClass0950 LLIZ;
    public boolean LLIZLLLIL;
    public OrderSnapshotV2 LLJ;
    public OrderSnapshotV2 LLJI;
    public List<LocalOrderWrapper> LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    public final void wQ2() {
        this.LLJ = null;
        this.LLJI = null;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJIJIL = c13bv;
        this.LLJILJIL = 0L;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLILLJJLI.setValue(new C333760D6o(vQ2(c13bv), false, true));
    }

    public OrdersV2ViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C333860D6y.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILZLL = c2252331DDrLIZIZ2;
        this.LLIZ = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.LLJIJIL = C13BV.INSTANCE;
    }

    public final LocalOrderWrapper yQ2() {
        C333760D6o c333760D6o;
        List<AbstractC333850D6x> list;
        Object value = this.LLILLJJLI.getValue();
        if (!(value instanceof C333760D6o) || (c333760D6o = (C333760D6o) value) == null || (list = c333760D6o.LIZ) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC333850D6x abstractC333850D6x : list) {
            if (abstractC333850D6x instanceof C0D6U) {
                arrayList.add(abstractC333850D6x);
            }
        }
        C0D6U c0d6u = (C0D6U) C13LP.LJJJLL(arrayList);
        if (c0d6u != null) {
            return c0d6u.LIZ;
        }
        return null;
    }

    public final void CQ2() {
        OrderSnapshotV2 orderSnapshotV2;
        if (C332170D0l.LIZLLL() || this.LLJILLL || this.LLJJ || !this.LLJILJILJ || (orderSnapshotV2 = this.LLJ) == null || this.LLJILJIL <= 0) {
            return;
        }
        this.LLJJ = true;
        this.LLJJI = false;
        OrderSnapshotV2 orderSnapshotV22 = this.LLJI;
        if (orderSnapshotV22 != null) {
            xQ2(orderSnapshotV22, true);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C333740D6m(this, orderSnapshotV2, null), 2);
    }

    public final String zQ2() {
        String strLIZIZ = C1024180cl6.LIZIZ();
        return (!(a0.LJJJIL(strLIZIZ) ^ true) || strLIZIZ == null) ? "" : strLIZIZ;
    }

    public static boolean AQ2(LocalOrderWrapper localOrderWrapper) {
        C0D6J checkoutState;
        CheckoutSession resolvedCheckoutSession = localOrderWrapper.getResolvedCheckoutSession();
        if (resolvedCheckoutSession != null) {
            checkoutState = resolvedCheckoutSession.getCheckoutState();
        } else {
            checkoutState = null;
        }
        if (checkoutState == C0D6J.COMPLETED) {
            return true;
        }
        return false;
    }

    public static String BQ2(String str) {
        String string = a0.LJLIIIL(str).toString();
        String strLJLJJI = a0.LJLJJI(a0.LJJLL('?', string, string), '/');
        return a0.LJJLJ('/', strLJLJJI, strLJLJJI);
    }

    public static String EQ2(String str) {
        C844470XAv.LIZ.getClass();
        return u.LJJIFFI(C844470XAv.LIZ().getString(2131857438), "{main_order_id}", str, false);
    }

    public static String FQ2(LocalOrderWrapper localOrderWrapper) {
        CheckoutSession checkoutSession;
        CheckoutOrder checkoutOrder;
        String str;
        String strBQ2;
        CheckoutOrder checkoutOrder2;
        String str2;
        String strBQ22;
        String externalOrderId = localOrderWrapper.order.getExternalOrderId();
        if (externalOrderId == null || !(!a0.LJJJIL(externalOrderId)) || (strBQ22 = BQ2(externalOrderId)) == null) {
            CheckoutSession checkoutSession2 = localOrderWrapper.checkoutSession;
            if (checkoutSession2 != null && (checkoutOrder2 = checkoutSession2.order) != null && (str2 = checkoutOrder2.id) != null && (!a0.LJJJIL(str2))) {
                return BQ2(str2);
            }
            CheckoutOrderDetails checkoutCreateOriginData = localOrderWrapper.order.getCheckoutCreateOriginData();
            if (checkoutCreateOriginData != null && (checkoutSession = checkoutCreateOriginData.checkoutSession) != null && (checkoutOrder = checkoutSession.order) != null && (str = checkoutOrder.id) != null && (!a0.LJJJIL(str)) && (strBQ2 = BQ2(str)) != null) {
                return strBQ2;
            }
            return "";
        }
        return strBQ22;
    }

    public final void GQ2(boolean z) {
        List list;
        C333760D6o c333760D6o;
        if (C332170D0l.LIZLLL()) {
            this.LLIZLLLIL = true;
            wQ2();
            this.LLILZLL.LIZJ(Unit.LIZ);
        } else {
            if (!this.LLJILLL && !this.LLJJ) {
                AbstractC333830D6v abstractC333830D6v = (AbstractC333830D6v) this.LLILLJJLI.getValue();
                if (!(abstractC333830D6v instanceof C333760D6o) || (c333760D6o = (C333760D6o) abstractC333830D6v) == null || !c333760D6o.LIZIZ) {
                    this.LLILLJJLI.setValue(C333860D6y.LIZ);
                }
                this.LLJILLL = true;
                if (z) {
                    list = this.LLJIJIL;
                } else {
                    list = C13BV.INSTANCE;
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C333730D6l(this, list, this.LLJILJIL, this.LLJILJILJ, null), 2);
                return;
            }
            this.LLILZLL.LIZJ(Unit.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b8 A[LOOP:10: B:166:0x03b2->B:168:0x03b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC333850D6x> vQ2(java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r23) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel.vQ2(java.util.List):java.util.List");
    }

    public final void xQ2(OrderSnapshotV2 orderSnapshotV2, boolean z) {
        List<LocalOrderWrapper> list = orderSnapshotV2.items;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        this.LLILLJJLI.setValue(new C333760D6o(vQ2(list), !list.isEmpty(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2 r22, int r23, java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r24, long r25, X.InterfaceC1364105Vn<? super X.C333720D6k> r27) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2ViewModel.DQ2(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2, int, java.util.List, long, X.05Vn):java.lang.Object");
    }
}
