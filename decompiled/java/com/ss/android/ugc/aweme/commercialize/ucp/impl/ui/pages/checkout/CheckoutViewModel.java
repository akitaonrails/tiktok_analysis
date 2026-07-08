package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout;

import X.AbstractC334660DAa;
import X.AbstractC334690DAd;
import X.AbstractC334700DAe;
import X.AbstractC334710DAf;
import X.AbstractC334720DAg;
import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C00Y8;
import X.C051K;
import X.C098200Yq;
import X.C09IC;
import X.C09IR;
import X.C0D5F;
import X.C0D5G;
import X.C0D5H;
import X.C0D60;
import X.C0D6A;
import X.C0D7I;
import X.C0D7U;
import X.C0D7Z;
import X.C0D94;
import X.C0D96;
import X.C0D9B;
import X.C0D9C;
import X.C0D9D;
import X.C0D9E;
import X.C0D9F;
import X.C0D9G;
import X.C0D9H;
import X.C0D9J;
import X.C0D9L;
import X.C0D9Q;
import X.C0D9R;
import X.C0D9S;
import X.C0D9U;
import X.C0D9V;
import X.C0D9W;
import X.C0D9X;
import X.C0D9Y;
import X.C0D9Z;
import X.C0DA0;
import X.C0DA2;
import X.C0DA3;
import X.C0DA4;
import X.C0DA5;
import X.C0DA6;
import X.C0DA7;
import X.C0DA9;
import X.C0DAA;
import X.C0DAB;
import X.C0DAC;
import X.C0DAD;
import X.C0DAE;
import X.C0DAF;
import X.C0DAG;
import X.C0DAH;
import X.C0DAI;
import X.C0DAK;
import X.C0DAM;
import X.C0DAN;
import X.C0DAO;
import X.C0DAP;
import X.C0DAR;
import X.C0DAS;
import X.C0DAV;
import X.C0DAZ;
import X.C0DB0;
import X.C0DB1;
import X.C0DB2;
import X.C0DB8;
import X.C0DBT;
import X.C0PEM;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1954807lC;
import X.C1BNE;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2266371DnH;
import X.C2266381DnI;
import X.C23250099c;
import X.C332710D2n;
import X.C332720D2o;
import X.C333610D5z;
import X.C334040D7q;
import X.C334260D8m;
import X.C334330D8t;
import X.C334340D8u;
import X.C334370D8x;
import X.C334380D8y;
import X.C334400D9a;
import X.C334410D9b;
import X.C334420D9c;
import X.C334430D9d;
import X.C334460D9g;
import X.C334470D9h;
import X.C334500D9k;
import X.C334510D9l;
import X.C334520D9m;
import X.C334530D9n;
import X.C334550D9p;
import X.C334570D9r;
import X.C334580D9s;
import X.C334590D9t;
import X.C334600D9u;
import X.C334610D9v;
import X.C334630D9x;
import X.C334750DAj;
import X.C334760DAk;
import X.C334770DAl;
import X.C334780DAm;
import X.C334790DAn;
import X.C334800DAo;
import X.C334810DAp;
import X.C334830DAr;
import X.C334860DAu;
import X.C334870DAv;
import X.C334900DAy;
import X.C334910DAz;
import X.C335070DBp;
import X.C335080DBq;
import X.C336750DIb;
import X.EnumC1984507pz;
import X.EnumC334480D9i;
import X.EnumC334490D9j;
import X.EnumC334560D9q;
import X.EnumC334620D9w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutDiscounts;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutTotal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutViewModel extends ViewModel {
    public final CheckoutIntent LL;
    public final CheckoutSession LLILLJJLI;
    public final C0D7Z LLILLL;
    public final C0D6A LLILZ;
    public final C0D7U LLILZIL;
    public final C332710D2n LLILZLL;
    public final C0D9X LLIZ;
    public final C0D9V LLIZLLLIL;
    public final C0D9Z LLJ;
    public CheckoutIntent LLJI;
    public C0DAO LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public final C2252331DDr LLJILLL;
    public final AnonymousClass0950 LLJJ;
    public final C2252331DDr LLJJI;
    public final AnonymousClass0950 LLJJIII;
    public String LLJJIJI;
    public CheckoutSession LLJJIJIIJIL;
    public C334460D9g LLJJIJIL;
    public C334550D9p LLJJJ;
    public long LLJJJIL;
    public boolean LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public Long LLJJLIIIJLLLLLLLZ;
    public Long LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public boolean LLJLL;

    public final void OQ2() {
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        lR2(this, "protocol.resolve.reset.clearContext", null, "clearCheckoutContext", false, 10);
        jR2(gR2(), "clearCheckoutContext");
    }

    public final void WQ2() {
        Object c098200Yq;
        String str;
        List<CheckoutLineItemContext> list;
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        this.LLJJLIIIJLLLLLLLZ = Long.valueOf(System.currentTimeMillis());
        try {
            c098200Yq = C051K.LIZLLL(true, false, true, this.LL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("serialize_failed: ");
            Object obj = this.LL;
            if (obj == null) {
                obj = "null";
            }
            sbLIZ.append(obj);
            sbLIZ.append(", error=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLILZIL == C0D7U.FullPageModel && this.LLJI == null && this.LLILLJJLI == null) {
            RQ2();
            return;
        }
        C0D9X c0d9x = this.LLIZ;
        if (!c0d9x.LJ) {
            c0d9x.LJ = true;
        }
        C0D9V c0d9v = this.LLIZLLLIL;
        if (!c0d9v.LJFF) {
            c0d9v.LJFF = true;
            c0d9v.LIZIZ.setValue(new C0D9W(C0D9U.LIZIZ(c0d9v.LIZ), 55));
            c0d9v.LIZLLL.LIZJ(C334870DAv.LIZ);
        }
        if (this.LLILZIL == C0D7U.OneStepModel && this.LLJI == null && this.LLILLJJLI == null) {
            jR2(C334910DAz.LIZ, "loadDataOneStepPendingCheckout");
            RQ2();
            return;
        }
        C0D9Z c0d9z = this.LLJ;
        CheckoutIntent checkoutIntent = this.LLJI;
        c0d9z.getClass();
        if (checkoutIntent != null && (list = checkoutIntent.items) != null && !list.isEmpty()) {
            C334430D9d c334430D9dLIZ = c0d9z.LIZIZ.LIZ(null, checkoutIntent);
            c334430D9dLIZ.products.size();
            List<C334410D9b> list2 = c334430D9dLIZ.products;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C334410D9b> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().currentPriceText);
            }
            arrayList.toString();
            C2252321DDq c2252321DDq = c0d9z.LIZJ;
            Object value = c2252321DDq.getValue();
            C00Y8 c00y8 = C00Y8.IDLE;
            value.getClass();
            c2252321DDq.setValue(new C334500D9k(c334430D9dLIZ, c00y8));
        }
        CheckoutSession checkoutSession = this.LLILLJJLI;
        if (checkoutSession != null) {
            if (C334040D7q.LIZIZ(checkoutSession)) {
                KQ2(checkoutSession, "attachInitialCheckoutSession");
                jR2(C0DB0.LIZ, "attachInitialCheckoutSession");
            } else {
                lR2(this, "protocol.resolve.session.initial", checkoutSession, null, false, 12);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ignore initial checkout session because it is not a successful session. checkoutId=");
                String str2 = checkoutSession.id;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                sbLIZ2.append(str2);
                sbLIZ2.append(" ucpStatus=");
                String strLIZ = C334040D7q.LIZ(checkoutSession);
                if (strLIZ == null) {
                    strLIZ = "";
                }
                sbLIZ2.append(strLIZ);
                sbLIZ2.append(" status=");
                String str4 = checkoutSession.status;
                if (str4 == null) {
                    str4 = "";
                }
                sbLIZ2.append(str4);
                sbLIZ2.append(" orderId=");
                CheckoutOrder checkoutOrder = checkoutSession.order;
                if (checkoutOrder != null && (str = checkoutOrder.id) != null) {
                    str3 = str;
                }
                sbLIZ2.append(str3);
                sbLIZ2.append(" checkoutState=");
                sbLIZ2.append(checkoutSession.getCheckoutState());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        RQ2();
    }

    public final void HQ2() {
        CheckoutStoredUserAddress checkoutStoredUserAddress;
        String str;
        if (Intrinsics.LJFF(this.LLJIJIL, C334900DAy.LIZ)) {
            this.LLJILLL.LIZJ(C334830DAr.LIZ);
            return;
        }
        this.LLJLILLLLZIIL = UUID.randomUUID().toString().toLowerCase(Locale.US);
        CheckoutSession checkoutSession = this.LLJJIJIIJIL;
        if (checkoutSession == null) {
            UQ2("placeOrder", new C0DAN(EnumC334490D9j.MISSING_CHECKOUT_ID), true, (C0D9W) this.LLIZLLLIL.LIZJ.getValue());
            return;
        }
        lR2(this, "protocol.resolve.session.preflight", checkoutSession, null, false, 12);
        C334460D9g c334460D9g = this.LLJJIJIL;
        Object c0dap = (c334460D9g.LIZ != C0DA2.ECP || (str = c334460D9g.LIZJ) == null) ? C334750DAj.LIZ : new C0DAP(str);
        if (!Intrinsics.LJFF(c0dap, C334750DAj.LIZ)) {
            if (!(c0dap instanceof C0DAP)) {
                throw new C1954807lC();
            }
            String str2 = ((C0DAP) c0dap).LIZ;
            if (str2 == null) {
                Map<String, String> map = C0D9H.LIZ;
                cR2(C0D9H.LIZ(aR2(), checkoutSession.messages));
                RQ2();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("complete.routeFallbackDirectly continueUrl=");
            sbLIZ.append(str2);
            sbLIZ.append(" executionType=");
            sbLIZ.append(ZQ2(this.LLJJIJIL.LIZ));
            sbLIZ.append(" coreState=");
            sbLIZ.append(YQ2(this.LLJJIJIL.LIZIZ));
            C2188811AlT.LIZIZ(sbLIZ);
            kR2(C334800DAo.LIZ, "placeOrderResolvedDowngrade");
            this.LLJILLL.LIZJ(new C0DAK(str2));
            return;
        }
        if (this.LLJJIJIL.LIZIZ != EnumC334480D9i.READY_FOR_COMPLETE) {
            Map<String, String> map2 = C0D9H.LIZ;
            cR2(C0D9H.LIZ(aR2(), checkoutSession.messages));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("placeOrder blocked by protocol gate coreState=");
            sbLIZ2.append(YQ2(this.LLJJIJIL.LIZIZ));
            sbLIZ2.append(" executionType=");
            sbLIZ2.append(ZQ2(this.LLJJIJIL.LIZ));
            C2188811AlT.LIZIZ(sbLIZ2);
            RQ2();
            return;
        }
        C0D9W c0d9w = (C0D9W) this.LLIZLLLIL.LIZJ.getValue();
        C0DAO c0dao = this.LLJIJIL;
        CheckoutIntent checkoutIntent = this.LLJI;
        C0DAR c0dar = (C0DAR) this.LLIZ.LIZIZ.getValue();
        String str3 = this.LLJJIJI;
        AbstractC334710DAf c0dae = !Intrinsics.LJFF(c0dao, C0DB0.LIZ) ? new C0DAE(new C0DAN(EnumC334490D9j.PAGE_BUSY)) : checkoutIntent == null ? new C0DAE(new C0DAN(EnumC334490D9j.MISSING_INTENT)) : (c0dar.LIZ != C0DAS.READY || (checkoutStoredUserAddress = c0dar.LIZIZ) == null) ? new C0DAE(C0DA0.LIZ(c0dar)) : str3 == null ? new C0DAE(new C0DAN(EnumC334490D9j.MISSING_CHECKOUT_ID)) : !c0d9w.LIZIZ() ? new C0DAE(new C0DAN(EnumC334490D9j.PAYMENT_NOT_READY)) : new C0DAD(new C334530D9n(str3, checkoutIntent, checkoutStoredUserAddress));
        if (!(c0dae instanceof C0DAD)) {
            if (!(c0dae instanceof C0DAE)) {
                throw new C1954807lC();
            }
            UQ2("placeOrder", ((C0DAE) c0dae).LIZ, true, c0d9w);
            return;
        }
        C334530D9n c334530D9n = ((C0DAD) c0dae).LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("placeOrder: start buildToken. checkoutId=");
        sbLIZ3.append(c334530D9n.LIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        jR2(new C0DAI(EnumC1984507pz.BUILDING_TOKEN), "buildCashierToken");
        C0D9V c0d9v = this.LLIZLLLIL;
        C0D9W c0d9w2 = (C0D9W) c0d9v.LIZIZ.getValue();
        if (c0d9w2.LIZIZ()) {
            c0d9v.LIZIZ.setValue(C0D9W.LIZ(c0d9w2, null, null, C0DA4.BUILDING_TOKEN, null, null, null, 43));
            c0d9v.LIZLLL.LIZJ(C334860DAu.LIZ);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("requestBuildToken blocked. state=");
            sbLIZ4.append(c0d9w2);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        RQ2();
    }

    public final void IQ2() {
        C0D9V c0d9v = this.LLIZLLLIL;
        C0D9W c0d9w = (C0D9W) c0d9v.LIZIZ.getValue();
        if (c0d9w.LIZ != EnumC334620D9w.READY) {
            c0d9v.LIZIZ.setValue(C0D9W.LIZ(c0d9w, EnumC334620D9w.PREPARING, EnumC334560D9q.INITIAL_LOADING, C0DA4.IDLE, null, null, null, 40));
            c0d9v.LIZLLL.LIZJ(C334870DAv.LIZ);
        } else {
            C0D9Y c0d9y = c0d9w.LIZLLL;
            if (c0d9y != null) {
                c0d9v.LIZIZ(c0d9y);
            }
        }
        RQ2();
    }

    public final C335080DBq NQ2() {
        AbstractC334660DAa abstractC334660DAaLIZ = ((C0DAR) this.LLIZ.LIZIZ.getValue()).LIZ();
        C334500D9k c334500D9k = (C334500D9k) this.LLJ.LIZLLL.getValue();
        c334500D9k.getClass();
        C334630D9x c334630D9x = new C334630D9x(c334500D9k.LIZ, c334500D9k.LIZIZ);
        C0DB8 c0db8LIZLLL = ((C0D9W) this.LLIZLLLIL.LIZJ.getValue()).LIZLLL();
        String strLIZ = C0D9L.LIZ(2131857542);
        C334610D9v c334610D9v = C334400D9a.Companion;
        String str = C0D9U.LIZIZ(false).LJ;
        c334610D9v.getClass();
        C335070DBp c335070DBp = new C335070DBp("Shopify Store", strLIZ, C334610D9v.LIZ(str), new C0DA6(0));
        C0DAO c0dao = this.LLJIJIL;
        return new C335080DBq(abstractC334660DAaLIZ, c334630D9x, c0db8LIZLLL, c335070DBp, c0dao, this.LLJJJ, hR2(c0dao, (C0D9W) this.LLIZLLLIL.LIZJ.getValue()));
    }

    public final void RQ2() {
        int size;
        String strLIZ;
        AbstractC334720DAg c0da6;
        C334520D9m c334520D9m;
        C334400D9a c334400D9a;
        C334520D9m c334520D9m2;
        List<C334600D9u> list;
        C0DAR c0dar = (C0DAR) this.LLIZ.LIZIZ.getValue();
        C0D9W c0d9w = (C0D9W) this.LLIZLLLIL.LIZJ.getValue();
        C334500D9k c334500D9k = (C334500D9k) this.LLJ.LIZLLL.getValue();
        if (!this.LLJJJJ) {
            this.LLJILJIL.setValue(NQ2());
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emitState: pageFlowState=");
        sbLIZ.append(XQ2(this.LLJIJIL));
        sbLIZ.append(" canPay=");
        sbLIZ.append(c0d9w.LIZIZ());
        sbLIZ.append(" checkoutId=");
        String str = this.LLJJIJI;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" executionType=");
        sbLIZ.append(ZQ2(this.LLJJIJIL.LIZ));
        sbLIZ.append(" coreState=");
        sbLIZ.append(YQ2(this.LLJJIJIL.LIZIZ));
        sbLIZ.append(" continueUrl=");
        String str2 = this.LLJJIJIL.LIZJ;
        sbLIZ.append(str2 != null ? str2 : "");
        sbLIZ.append(" messageCount=");
        CheckoutSession checkoutSession = this.LLJJIJIIJIL;
        if (checkoutSession != null) {
            List list2 = checkoutSession.messages;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            size = list2.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        C334430D9d c334430D9d = c334500D9k.LIZ;
        boolean z = !(c334430D9d == null || (c334520D9m2 = c334430D9d.summary) == null || (list = c334520D9m2.rows) == null || list.isEmpty());
        String strLJ = C0D9U.LJ(this.LLJJIJIIJIL);
        if (!z || c334430D9d == null || (c334520D9m = c334430D9d.summary) == null || (c334400D9a = c334520D9m.totalAmount) == null || (strLIZ = c334400D9a.formatted()) == null) {
            C334400D9a.Companion.getClass();
            strLIZ = C334610D9v.LIZ(strLJ);
        }
        C0DAO c0dao = this.LLJIJIL;
        if (Intrinsics.LJFF(c0dao, C334760DAk.LIZ) || Intrinsics.LJFF(c0dao, C334910DAz.LIZ)) {
            c0da6 = new C0DA6(0);
        } else if (Intrinsics.LJFF(c0dao, C334900DAy.LIZ)) {
            c0da6 = new C0DA5(C0D9L.LIZ(2131857460));
        } else if (Intrinsics.LJFF(c0dao, C334790DAn.LIZ) || Intrinsics.LJFF(c0dao, C334780DAm.LIZ)) {
            c0da6 = new C0DA6(0);
        } else if (Intrinsics.LJFF(c0dao, C0DB0.LIZ)) {
            c0da6 = new C0DA5(0);
        } else {
            if (!Intrinsics.LJFF(c0dao, C0DB1.LIZ) && !Intrinsics.LJFF(c0dao, C334810DAp.LIZ) && !(c0dao instanceof C0DAI) && !Intrinsics.LJFF(c0dao, C334800DAo.LIZ) && !Intrinsics.LJFF(c0dao, C334770DAl.LIZ)) {
                throw new C1954807lC();
            }
            c0da6 = new C0DA6(0);
        }
        C335070DBp c335070DBp = new C335070DBp(SQ2(), C0D9L.LIZ(2131857542), strLIZ, c0da6);
        C2252321DDq c2252321DDq = this.LLJILJIL;
        AbstractC334660DAa abstractC334660DAaLIZ = c0dar.LIZ();
        C334630D9x c334630D9x = new C334630D9x(c334500D9k.LIZ, c334500D9k.LIZIZ);
        C0DB8 c0db8LIZLLL = c0d9w.LIZLLL();
        C0DAO c0dao2 = this.LLJIJIL;
        c2252321DDq.setValue(new C335080DBq(abstractC334660DAaLIZ, c334630D9x, c0db8LIZLLL, c335070DBp, c0dao2, this.LLJJJ, hR2(c0dao2, c0d9w)));
    }

    public final String SQ2() {
        String str;
        CheckoutIntent checkoutIntent = this.LLJI;
        String str2 = null;
        Map<String, String> map = checkoutIntent != null ? checkoutIntent.passThrough : null;
        if (map != null && (str = map.get("external_shop_name")) != null && (!a0.LJJJIL(str))) {
            str2 = str;
        }
        String strLIZ = C332720D2o.LIZ(map);
        return strLIZ == null ? str2 == null ? "Shopify Store" : str2 : strLIZ;
    }

    public final String TQ2() {
        int i = C334420D9c.LIZ[this.LLJJIJIL.LIZ.ordinal()];
        if (i == 1) {
            return "native_checkout";
        }
        if (i == 2) {
            return "ecp_checkout";
        }
        throw new C1954807lC();
    }

    public final boolean VQ2() {
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        CheckoutIntent checkoutIntent = this.LLJI;
        return (checkoutIntent == null || (map = checkoutIntent.passThrough) == null || (str = map.get("protocol_type")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) ? false : true;
    }

    public final long aR2() {
        long j = this.LLJJJIL + 1;
        this.LLJJJIL = j;
        return j;
    }

    public final C0DAO gR2() {
        if (this.LLILZIL == C0D7U.OneStepModel && this.LLJI == null) {
            return C334910DAz.LIZ;
        }
        if (((C0DAR) this.LLIZ.LIZIZ.getValue()).LIZIZ == null) {
            return C334900DAy.LIZ;
        }
        String str = this.LLJJIJI;
        return (str == null || a0.LJJJIL(str) || this.LLJJIJIIJIL == null) ? C334780DAm.LIZ : C0DB0.LIZ;
    }

    public final void yQ2() {
        EnumC334620D9w enumC334620D9w = ((C0D9W) this.LLIZLLLIL.LIZJ.getValue()).LIZ;
        EnumC334620D9w enumC334620D9w2 = EnumC334620D9w.READY;
        if (enumC334620D9w == enumC334620D9w2) {
            return;
        }
        C0D9V c0d9v = this.LLIZLLLIL;
        C0D9W c0d9w = (C0D9W) c0d9v.LIZIZ.getValue();
        if (c0d9w.LIZ != enumC334620D9w2) {
            c0d9v.LIZIZ.setValue(C0D9W.LIZ(c0d9w, enumC334620D9w2, null, null, null, null, null, 46));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bridgePrepared. hasParams=");
            sbLIZ.append(c0d9w.LIZLLL != null);
            C2188811AlT.LIZIZ(sbLIZ);
            C0D9Y c0d9y = c0d9w.LIZLLL;
            if (c0d9y != null) {
                c0d9v.LIZIZ(c0d9y);
            }
        }
        RQ2();
    }

    public final void GQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackCheckout: willOpen checkoutId=");
        String str = this.LLJJIJI;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" protocolCheckoutType=");
        sbLIZ.append(TQ2());
        C2188811AlT.LIZIZ(sbLIZ);
        QQ2("");
    }

    public static String XQ2(C0DAO c0dao) {
        if (Intrinsics.LJFF(c0dao, C334760DAk.LIZ)) {
            return "Bootstrapping";
        }
        if (Intrinsics.LJFF(c0dao, C334910DAz.LIZ)) {
            return "PendingCheckout";
        }
        if (Intrinsics.LJFF(c0dao, C334900DAy.LIZ)) {
            return "NoAddress";
        }
        if (Intrinsics.LJFF(c0dao, C334790DAn.LIZ)) {
            return "CreatingCheckout";
        }
        if (Intrinsics.LJFF(c0dao, C334780DAm.LIZ)) {
            return "CreateFailedNeedsRetry";
        }
        if (Intrinsics.LJFF(c0dao, C0DB0.LIZ)) {
            return "Ready";
        }
        if (Intrinsics.LJFF(c0dao, C0DB1.LIZ)) {
            return "UpdatingCheckout";
        }
        if (Intrinsics.LJFF(c0dao, C334810DAp.LIZ)) {
            return "StaleNeedsRetry";
        }
        if (c0dao instanceof C0DAI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CompletingCheckout(");
            sbLIZ.append(((C0DAI) c0dao).LIZ.name());
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(c0dao, C334800DAo.LIZ)) {
            return "DowngradeCheckout";
        }
        if (Intrinsics.LJFF(c0dao, C334770DAl.LIZ)) {
            return "CheckoutSucceeded";
        }
        throw new C1954807lC();
    }

    public static String YQ2(EnumC334480D9i enumC334480D9i) {
        int i = C334420D9c.LIZJ[enumC334480D9i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "completed";
                        }
                        throw new C1954807lC();
                    }
                    return "readyForComplete";
                }
                return "businessEscalation";
            }
            return "businessFixable";
        }
        return "systemError";
    }

    public static String ZQ2(C0DA2 c0da2) {
        int i = C334420D9c.LIZ[c0da2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "ecp";
            }
            throw new C1954807lC();
        }
        return "ucp";
    }

    public static String bR2(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            return "";
        }
        return string;
    }

    public final void BQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashierTokenBuildFailed: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0D9V c0d9v = this.LLIZLLLIL;
        c0d9v.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tokenBuildFailed: ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        String strLIZ = C0D9L.LIZ(2131857493);
        C2252321DDq c2252321DDq = c0d9v.LIZIZ;
        c2252321DDq.setValue(C0D9W.LIZ((C0D9W) c2252321DDq.getValue(), null, null, C0DA4.IDLE, null, strLIZ, null, 43));
        PQ2("TOKEN_BUILD_FAILED", str, null);
        String strLIZ2 = C0D9L.LIZ(2131857493);
        jR2(gR2(), "cashierTokenBuildFailed");
        Map<String, String> map = C0D9H.LIZ;
        cR2(C0D9H.LIZLLL(aR2(), strLIZ2, C0D9J.REQUEST_FAILED));
        RQ2();
    }

    public final void JQ2(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        String str;
        String str2;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("address.sync addressId=");
        String str3 = null;
        if (checkoutStoredUserAddress != null) {
            str3 = checkoutStoredUserAddress.id;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(" email=");
        if (checkoutStoredUserAddress == null || (str = checkoutStoredUserAddress.email) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" country=");
        if (checkoutStoredUserAddress == null || (str2 = checkoutStoredUserAddress.countryCode) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append(" flow=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" checkoutId=");
        String str5 = this.LLJJIJI;
        if (str5 != null) {
            str4 = str5;
        }
        sbLIZ.append(str4);
        sbLIZ.append(" intentReady=");
        if (this.LLJI != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZ.LIZ(checkoutStoredUserAddress);
        this.LLIZLLLIL.LIZ();
    }

    public final C0D94 LQ2(C0D5G c0d5g) {
        if (Intrinsics.LJFF(c0d5g, C0D5H.LIZ)) {
            C0DAO c0dao = this.LLJIJIL;
            if (!(c0dao instanceof C0DAI) && !Intrinsics.LJFF(c0dao, C334800DAo.LIZ) && !Intrinsics.LJFF(this.LLJIJIL, C334770DAl.LIZ)) {
                dR2(null);
                AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJJJJJIL = null;
                AnonymousClass0956 anonymousClass09562 = this.LLJJJJLIIL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                this.LLJJJJLIIL = null;
                this.LLJ.LIZJ.setValue(new C334500D9k(null, C00Y8.IDLE));
                OQ2();
                RQ2();
                return C0D96.LIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page busy: ");
            sbLIZ.append(XQ2(this.LLJIJIL));
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            return new C0D94(strLIZIZ) { // from class: X.0D95
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0D95) && Intrinsics.LJFF(this.LIZ, ((C0D95) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Rejected(reason=");
                    sbLIZ2.append(this.LIZ);
                    sbLIZ2.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                {
                    this.LIZ = strLIZIZ;
                }
            };
        }
        if (c0d5g instanceof C0D5F) {
            C0DAO c0dao2 = this.LLJIJIL;
            if (!(c0dao2 instanceof C0DAI) && !Intrinsics.LJFF(c0dao2, C334800DAo.LIZ) && !Intrinsics.LJFF(this.LLJIJIL, C334770DAl.LIZ)) {
                CheckoutIntent checkoutIntent = this.LLJI;
                C0D5F c0d5f = (C0D5F) c0d5g;
                CheckoutIntent checkoutIntent2 = c0d5f.LIZ;
                if (checkoutIntent != null && Intrinsics.LJFF(checkoutIntent.source, checkoutIntent2.source)) {
                    List list = checkoutIntent.items;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    List list2 = checkoutIntent2.items;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    if (list.size() == list2.size()) {
                        ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(list, list2);
                        if (!arrayList.isEmpty()) {
                            for (Pair pair : arrayList) {
                                CheckoutLineItemContext checkoutLineItemContext = (CheckoutLineItemContext) pair.getFirst();
                                CheckoutLineItemContext checkoutLineItemContext2 = (CheckoutLineItemContext) pair.getSecond();
                                if (Intrinsics.LJFF(bR2(checkoutLineItemContext.productId), bR2(checkoutLineItemContext2.productId)) && Intrinsics.LJFF(bR2(checkoutLineItemContext.variantId), bR2(checkoutLineItemContext2.variantId))) {
                                    Map<String, String> mapLJ = checkoutLineItemContext.selectedOptions;
                                    if (mapLJ == null) {
                                        mapLJ = C2097608Jq.LJ();
                                    }
                                    TreeMap treeMap = new TreeMap(mapLJ);
                                    Map<String, String> mapLJ2 = checkoutLineItemContext2.selectedOptions;
                                    if (mapLJ2 == null) {
                                        mapLJ2 = C2097608Jq.LJ();
                                    }
                                    if (Intrinsics.LJFF(treeMap, new TreeMap(mapLJ2))) {
                                    }
                                }
                            }
                        }
                        final String str = "duplicated determined";
                        return new C0D94(str) { // from class: X.0D95
                            public final String LIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C0D95) && Intrinsics.LJFF(this.LIZ, ((C0D95) obj).LIZ);
                            }

                            public final int hashCode() {
                                return this.LIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Rejected(reason=");
                                sbLIZ2.append(this.LIZ);
                                sbLIZ2.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ2);
                            }

                            {
                                this.LIZ = str;
                            }
                        };
                    }
                }
                dR2(c0d5f.LIZ);
                AnonymousClass0956 anonymousClass09563 = this.LLJJJJJIL;
                if (anonymousClass09563 != null) {
                    anonymousClass09563.LIZIZ(null);
                }
                this.LLJJJJJIL = null;
                AnonymousClass0956 anonymousClass09564 = this.LLJJJJLIIL;
                if (anonymousClass09564 != null) {
                    anonymousClass09564.LIZIZ(null);
                }
                this.LLJJJJLIIL = null;
                C0D9Z c0d9z = this.LLJ;
                c0d9z.LIZJ.setValue(new C334500D9k(c0d9z.LIZIZ.LIZ(null, c0d5f.LIZ), C00Y8.IDLE));
                OQ2();
                if (((C0DAR) this.LLIZ.LIZIZ.getValue()).LIZIZ == null) {
                    jR2(C334900DAy.LIZ, "applySKUEventDetermined");
                    RQ2();
                } else {
                    eR2(this, false, null, 3);
                }
                return C0D96.LIZ;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("page busy: ");
            sbLIZ2.append(XQ2(this.LLJIJIL));
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            return new C0D94(strLIZIZ2) { // from class: X.0D95
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0D95) && Intrinsics.LJFF(this.LIZ, ((C0D95) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("Rejected(reason=");
                    sbLIZ22.append(this.LIZ);
                    sbLIZ22.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ22);
                }

                {
                    this.LIZ = strLIZIZ2;
                }
            };
        }
        throw new C1954807lC();
    }

    public final void QQ2(String str) {
        int i;
        boolean z;
        boolean z2;
        List<CheckoutLineItemContext> list;
        int iIntValue;
        if (str == null) {
            str = "";
        }
        this.LLJLIL = str;
        this.LLJL = Long.valueOf(System.currentTimeMillis());
        C2252331DDr c2252331DDr = this.LLJJI;
        List<String> list2 = null;
        String strIR2 = iR2(null);
        String str2 = this.LLJLIL;
        String strTQ2 = TQ2();
        CheckoutSession checkoutSession = this.LLJJIJIIJIL;
        int i2 = 0;
        if (checkoutSession == null) {
            i = 0;
        } else {
            CheckoutDiscounts checkoutDiscounts = checkoutSession.discounts;
            if (checkoutDiscounts != null) {
                list2 = checkoutDiscounts.codes;
            }
            i = 1;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            boolean z3 = !z;
            List<CheckoutTotal> list3 = checkoutSession.totals;
            if (list3 != null && !list3.isEmpty()) {
                for (CheckoutTotal checkoutTotal : list3) {
                    if (Intrinsics.LJFF(checkoutTotal.type, "items_discount") || Intrinsics.LJFF(checkoutTotal.type, "discount")) {
                        Integer num = checkoutTotal.amount;
                        if (num != null && num.intValue() > 0) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z3) {
                    i = 0;
                }
            } else {
                z2 = false;
                if (!z3 && !z2) {
                    i = 0;
                }
            }
        }
        CheckoutIntent checkoutIntent = this.LLJI;
        if (checkoutIntent != null && (list = checkoutIntent.items) != null) {
            Iterator<CheckoutLineItemContext> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                Integer num2 = it2.next().quantity;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                i2 += iIntValue;
            }
        }
        c2252331DDr.LIZJ(new C2266371DnH(strIR2, str2, strTQ2, i, i2, this.LLJLILLLLZIIL));
    }

    public final void cR2(C334550D9p c334550D9p) {
        if (!this.LLJJJJ) {
            return;
        }
        this.LLJJJ = c334550D9p;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dR2(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r6) {
        /*
            r5 = this;
            r5.LLJI = r6
            X.0D7Z r4 = r5.LLILLL
            if (r6 == 0) goto L5f
            r4.getClass()
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.passThrough
            if (r1 == 0) goto L5f
            java.lang.String r0 = "protocol_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L5f
            int r2 = r0.intValue()
        L21:
            int r0 = r4.LIZ
            if (r2 == r0) goto L3e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ignore protocol type change requested="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " fixed="
            r1.append(r0)
            int r0 = r4.LIZ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L3e:
            X.0D5B r3 = X.C0D59.LIZ(r6)
            java.lang.String r1 = r3.LIZ
            X.0D5B r0 = r4.LIZLLL
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = r0 ^ 1
            java.lang.String r1 = r3.LIZIZ
            X.0D5B r0 = r4.LIZLLL
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r2 != 0) goto L61
            if (r0 != 0) goto L61
            return
        L5f:
            r2 = 0
            goto L21
        L61:
            X.0D7Q r1 = r4.LIZIZ
            X.0D5B r0 = r4.LIZLLL
            r1.LIZ(r0, r3)
            r4.LIZLLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel.dR2(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent):void");
    }

    public final boolean fR2(Function0<Unit> function0) {
        boolean z;
        C0DAZ c0daf;
        CheckoutStoredUserAddress checkoutStoredUserAddress;
        C0DAO c0dao = this.LLJIJIL;
        CheckoutIntent checkoutIntent = this.LLJI;
        C0DAR c0dar = (C0DAR) this.LLIZ.LIZIZ.getValue();
        String str = this.LLJJIJI;
        boolean z2 = false;
        if (!Intrinsics.LJFF(c0dao, C0DB0.LIZ) && !Intrinsics.LJFF(c0dao, C334810DAp.LIZ)) {
            if (!Intrinsics.LJFF(c0dao, C334760DAk.LIZ) && !Intrinsics.LJFF(c0dao, C334910DAz.LIZ) && !Intrinsics.LJFF(c0dao, C334900DAy.LIZ) && !Intrinsics.LJFF(c0dao, C334790DAn.LIZ) && !Intrinsics.LJFF(c0dao, C334780DAm.LIZ) && !Intrinsics.LJFF(c0dao, C0DB1.LIZ) && !(c0dao instanceof C0DAI) && !Intrinsics.LJFF(c0dao, C334800DAo.LIZ) && !Intrinsics.LJFF(c0dao, C334770DAl.LIZ)) {
                throw new C1954807lC();
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            c0daf = new C0DAF(new C0DAN(EnumC334490D9j.PAGE_BUSY));
        } else if (checkoutIntent == null) {
            c0daf = new C0DAF(new C0DAN(EnumC334490D9j.MISSING_INTENT));
        } else if (c0dar.LIZ == C0DAS.READY && (checkoutStoredUserAddress = c0dar.LIZIZ) != null) {
            if (str == null) {
                final C334570D9r c334570D9r = new C334570D9r(checkoutIntent, checkoutStoredUserAddress);
                c0daf = new C0DAZ(c334570D9r) { // from class: X.0DAH
                    public final C334570D9r LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0DAH) && Intrinsics.LJFF(this.LIZ, ((C0DAH) obj).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FallbackToCreate(input=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = c334570D9r;
                    }
                };
            } else {
                c0daf = new C0DAG(new C334470D9h(str, checkoutIntent, checkoutStoredUserAddress));
            }
        } else {
            c0daf = new C0DAF(C0DA0.LIZ(c0dar));
        }
        if (c0daf instanceof C0DAG) {
            C334470D9h c334470D9h = ((C0DAG) c0daf).LIZ;
            kR2(C0DB1.LIZ, "requestUpdateCheckout");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCheckout: start. checkoutId=");
            sbLIZ.append(c334470D9h.LIZ);
            sbLIZ.append(", items=");
            List list = c334470D9h.LIZIZ.items;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            sbLIZ.append(list.size());
            sbLIZ.append(", hasAddress=");
            String str2 = c334470D9h.LIZJ.id;
            if (str2 == null || a0.LJJJIL(str2)) {
                z2 = true;
            }
            sbLIZ.append(!z2);
            C2188811AlT.LIZIZ(sbLIZ);
            AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJJJLIIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0D9F(this, c334470D9h, function0, null), 2);
            return true;
        }
        if (c0daf instanceof C0DAH) {
            eR2(this, false, null, 3);
            return true;
        }
        if (c0daf instanceof C0DAF) {
            C0DAF c0daf2 = (C0DAF) c0daf;
            if (c0daf2.LIZ.LIZ == EnumC334490D9j.MISSING_ADDRESS) {
                OQ2();
            }
            UQ2("updateCheckout", c0daf2.LIZ, true, null);
            if (function0 != null) {
                function0.invoke();
            }
            return false;
        }
        throw new C1954807lC();
    }

    public final String iR2(CheckoutSession checkoutSession) {
        C334590D9t c334590D9tLJFF;
        String str;
        if ((checkoutSession == null && (checkoutSession = this.LLJJIJIIJIL) == null) || (c334590D9tLJFF = C0D9U.LJFF(checkoutSession)) == null || (str = c334590D9tLJFF.plainText) == null) {
            return "";
        }
        return str;
    }

    public final void wQ2(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("address.confirm addressId=");
        String str = checkoutStoredUserAddress.id;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" email=");
        String str3 = checkoutStoredUserAddress.email;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(" country=");
        sbLIZ.append(checkoutStoredUserAddress.countryCode);
        sbLIZ.append(" flow=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" checkoutId=");
        String str4 = this.LLJJIJI;
        if (str4 == null) {
            str4 = "";
        }
        sbLIZ.append(str4);
        sbLIZ.append(" intentReady=");
        if (this.LLJI != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C0D9X c0d9x = this.LLIZ;
        c0d9x.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("address.component.confirm addressId=");
        String str5 = checkoutStoredUserAddress.id;
        if (str5 != null) {
            str2 = str5;
        }
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        c0d9x.LIZ(checkoutStoredUserAddress);
        this.LLIZLLLIL.LIZ();
    }

    public final void xQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashierBridgePrepareFailed: ");
        sbLIZ.append(str);
        C0DAV.LIZ("CheckoutViewModel", C2188811AlT.LIZIZ(sbLIZ), null);
        C0D9V c0d9v = this.LLIZLLLIL;
        c0d9v.getClass();
        Map<String, String> map = C0D9H.LIZ;
        String strLIZ = C0D9L.LIZ(2131857475);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bridgePrepareFailed: ");
        sbLIZ2.append(strLIZ);
        C0DAV.LIZ("CheckoutPaymentMethodComponent", C2188811AlT.LIZIZ(sbLIZ2), null);
        C2252321DDq c2252321DDq = c0d9v.LIZIZ;
        c2252321DDq.setValue(C0D9W.LIZ((C0D9W) c2252321DDq.getValue(), EnumC334620D9w.FAILED, null, C0DA4.IDLE, null, strLIZ, null, 42));
        RQ2();
    }

    public final void zQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashierReadyForPayFailed: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0D9V c0d9v = this.LLIZLLLIL;
        c0d9v.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("readyForPayFailed: ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2252321DDq c2252321DDq = c0d9v.LIZIZ;
        c2252321DDq.setValue(C0D9W.LIZ((C0D9W) c2252321DDq.getValue(), null, null, C0DA4.IDLE, null, null, null, 43));
        kR2(gR2(), "cashierReadyForPayFailed");
    }

    public final void AQ2(String str, boolean z) {
        C0D9W c0d9wLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashierRefreshResult: success=");
        sbLIZ.append(z);
        sbLIZ.append(", err=");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0D9V c0d9v = this.LLIZLLLIL;
        C0D9W c0d9w = (C0D9W) c0d9v.LIZIZ.getValue();
        if (z) {
            c0d9v.LIZIZ.setValue(C0D9W.LIZ(c0d9w, null, EnumC334560D9q.READY, C0DA4.IDLE, null, null, C0DAM.SHOWN, 9));
        } else {
            Map<String, String> map = C0D9H.LIZ;
            String strLIZ = C0D9L.LIZ(2131857530);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refreshResult failed: ");
            sbLIZ2.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2252321DDq c2252321DDq = c0d9v.LIZIZ;
            if (c0d9w.LJFF == C0DAM.SHOWN) {
                c0d9wLIZ = C0D9W.LIZ(c0d9w, null, EnumC334560D9q.STALE, C0DA4.IDLE, null, strLIZ, null, 41);
            } else {
                c0d9wLIZ = C0D9W.LIZ(c0d9w, null, EnumC334560D9q.FAILED, C0DA4.IDLE, null, strLIZ, null, 41);
            }
            c2252321DDq.setValue(c0d9wLIZ);
        }
        RQ2();
    }

    public final void DQ2(String str, boolean z) {
        if (z) {
            jR2(C0DB0.LIZ, "fallbackCheckoutLaunched");
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fallbackCheckout: launch failed ");
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            jR2(C0DB0.LIZ, "fallbackCheckoutLaunchFailed");
            Map<String, String> map = C0D9H.LIZ;
            cR2(C0D9H.LIZLLL(aR2(), C0D9L.LIZ(2131857491), C0D9J.REQUEST_FAILED));
        }
        RQ2();
    }

    public final void EQ2(C0DB2 c0db2, AwS213S0300000_4 awS213S0300000_4) {
        boolean z;
        boolean z2;
        CheckoutIntent checkoutIntentCopy = this.LLJI;
        CheckoutSession checkoutSession = this.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackCredentialReady: start context=");
        sbLIZ.append(c0db2);
        sbLIZ.append(" hasIntent=");
        boolean z3 = true;
        if (checkoutIntentCopy != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hasSession=");
        if (checkoutSession != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" checkoutId=");
        String str = this.LLJJIJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (checkoutIntentCopy != null && checkoutSession != null) {
            ShopifyEcpCheckout shopifyEcpCheckout = c0db2.LIZ.checkout;
            CheckoutStoredUserAddress checkoutStoredUserAddressLIZIZ = C334260D8m.LIZIZ(shopifyEcpCheckout);
            String strLIZ = C334330D8t.LIZ(shopifyEcpCheckout);
            if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                Map<String, String> mapLJ = checkoutIntentCopy.passThrough;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
                linkedHashMap.put("payment_type", strLIZ);
                checkoutIntentCopy = checkoutIntentCopy.copy(checkoutIntentCopy.items, checkoutIntentCopy.source, checkoutIntentCopy.sellerProfileId, linkedHashMap);
            }
            CheckoutIntent checkoutIntentMQ2 = MQ2(checkoutIntentCopy, checkoutStoredUserAddressLIZIZ, "", checkoutSession, false, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fallbackCredentialReady: prepared paymentType=");
            if (strLIZ != null) {
                str2 = strLIZ;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(" hasShippingAddress=");
            if (checkoutStoredUserAddressLIZIZ == null) {
                z3 = false;
            }
            sbLIZ2.append(z3);
            C2188811AlT.LIZIZ(sbLIZ2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C333610D5z(this, checkoutIntentMQ2, checkoutSession, awS213S0300000_4, null), 2);
            return;
        }
        C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("fallbackCredentialReady: missing intent/session"));
        C189200o6.m2constructorimpl(c098200Yq);
        awS213S0300000_4.invoke(C189200o6.m1boximpl(c098200Yq));
    }

    public final void FQ2(C334340D8u c334340D8u, AwS583S0100000_4 awS583S0100000_4) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        ShopifyEcpCheckout.Order order;
        ShopifyEcpCheckout.Order order2;
        CheckoutIntent checkoutIntent = this.LLJI;
        CheckoutSession checkoutSession = this.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackPaymentSucceeded: start context=");
        sbLIZ.append(c334340D8u);
        sbLIZ.append(" hasIntent=");
        if (checkoutIntent != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hasSession=");
        if (checkoutSession != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" checkoutId=");
        String str5 = this.LLJJIJI;
        if (str5 == null) {
            str5 = "";
        }
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        if (checkoutIntent != null && checkoutSession != null) {
            ShopifyEcpCheckout shopifyEcpCheckout = c334340D8u.LIZ.checkout;
            if (shopifyEcpCheckout == null || (order2 = shopifyEcpCheckout.order) == null || (str = order2.id) == null || !(!a0.LJJJIL(str))) {
                str = "";
            }
            if (a0.LJJJIL(str)) {
                C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("fallbackPaymentSucceeded: missing orderId"));
                C189200o6.m2constructorimpl(c098200Yq);
                awS583S0100000_4.invoke(C189200o6.m1boximpl(c098200Yq));
                return;
            }
            CheckoutStoredUserAddress checkoutStoredUserAddressLIZIZ = C334260D8m.LIZIZ(shopifyEcpCheckout);
            if (checkoutStoredUserAddressLIZIZ == null) {
                checkoutStoredUserAddressLIZIZ = ((C0DAR) this.LLIZ.LIZIZ.getValue()).LIZIZ;
            }
            String strLIZ = C334330D8t.LIZ(shopifyEcpCheckout);
            CheckoutIntent checkoutIntentMQ2 = MQ2(checkoutIntent, checkoutStoredUserAddressLIZIZ, str, checkoutSession, true, strLIZ);
            dR2(checkoutIntentMQ2);
            if (((shopifyEcpCheckout != null && (str2 = shopifyEcpCheckout.id) != null && (!a0.LJJJIL(str2))) || (str2 = checkoutSession.id) != null) && !a0.LJJJIL(str2)) {
                this.LLJJIJI = str2;
            }
            CheckoutOrder checkoutOrder = checkoutSession.order;
            if (checkoutOrder != null) {
                str3 = checkoutOrder.name;
            } else {
                str3 = null;
            }
            if (shopifyEcpCheckout != null && (order = shopifyEcpCheckout.order) != null && (str4 = order.permalinkUrl) != null) {
                if (checkoutOrder != null) {
                    l = checkoutOrder.localCreatedAt;
                } else {
                    l = null;
                }
            } else if (checkoutOrder != null) {
                str4 = checkoutOrder.permalinkUrl;
                l = checkoutOrder.localCreatedAt;
            } else {
                str4 = null;
                l = null;
            }
            CheckoutSession checkoutSessionCopy = checkoutSession.copy(checkoutSession.ucp, checkoutSession.id, checkoutSession.currency, checkoutSession.buyer, checkoutSession.lineItems, checkoutSession.discounts, checkoutSession.totals, checkoutSession.fulfillment, checkoutSession.expiresAt, checkoutSession.links, checkoutSession.payment, new CheckoutOrder(str, str3, str4, l), checkoutSession.messages, checkoutSession.status, checkoutSession.continueUrl, checkoutSession._checkoutState, checkoutSession.lastCreatAtTime);
            this.LLJJIJIIJIL = checkoutSessionCopy;
            lR2(this, "protocol.resolve.fallbackCompleted", null, null, true, 6);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0D60(this, checkoutIntentMQ2, checkoutSessionCopy, str, strLIZ, checkoutStoredUserAddressLIZIZ, awS583S0100000_4, null), 2);
            return;
        }
        C098200Yq c098200Yq2 = new C098200Yq(new IllegalStateException("fallbackPaymentSucceeded: missing intent/session"));
        C189200o6.m2constructorimpl(c098200Yq2);
        awS583S0100000_4.invoke(C189200o6.m1boximpl(c098200Yq2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130 A[LOOP:2: B:55:0x012a->B:57:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel.KQ2(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, java.lang.String):void");
    }

    public final C0DBT hR2(C0DAO c0dao, C0D9W c0d9w) {
        if (Intrinsics.LJFF(c0dao, C0DB0.LIZ) && (c0d9w.LIZ == EnumC334620D9w.PREPARING || c0d9w.LIZJ == C0DA4.REFRESHING)) {
            return new C0DBT(C0DA3.READY_AWAITING_PAYMENT, 40000L, null);
        }
        if (Intrinsics.LJFF(c0dao, C334760DAk.LIZ)) {
            return new C0DBT(C0DA3.CREATING_CHECKOUT, 40000L, null);
        }
        if (Intrinsics.LJFF(c0dao, C334790DAn.LIZ)) {
            return new C0DBT(C0DA3.CREATING_CHECKOUT, 40000L, null);
        }
        if (Intrinsics.LJFF(c0dao, C0DB1.LIZ)) {
            return new C0DBT(C0DA3.UPDATING_CHECKOUT, 40000L, null);
        }
        if (!(c0dao instanceof C0DAI)) {
            return null;
        }
        return new C0DBT(C0DA3.COMPLETING_CHECKOUT, 40000L, SQ2());
    }

    public final void jR2(C0DAO c0dao, String str) {
        long jCurrentTimeMillis;
        C0DAO c0dao2 = this.LLJIJIL;
        if (Intrinsics.LJFF(c0dao2, c0dao)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pageFlowState unchanged: ");
            sbLIZ.append(c0dao.getClass().getSimpleName());
            sbLIZ.append(", reason=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LLJIJIL = c0dao;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pageFlowState changed: ");
        sbLIZ2.append(c0dao2.getClass().getSimpleName());
        sbLIZ2.append(" -> ");
        sbLIZ2.append(c0dao.getClass().getSimpleName());
        sbLIZ2.append(", reason=");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (Intrinsics.LJFF(c0dao, C0DB0.LIZ) && !this.LLJLL) {
            this.LLJLL = true;
            Long l = this.LLJJLIIIJLLLLLLLZ;
            if (l != null) {
                jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            } else {
                jCurrentTimeMillis = 0;
            }
            this.LLJJI.LIZJ(new C336750DIb(jCurrentTimeMillis));
        }
    }

    public final void kR2(C0DAO c0dao, String str) {
        jR2(c0dao, str);
        RQ2();
    }

    public final void vQ2(int i, int i2) {
        int iIntValue;
        CheckoutIntent checkoutIntent = this.LLJI;
        if (checkoutIntent == null) {
            return;
        }
        C0D9Z c0d9z = this.LLJ;
        C334500D9k c334500D9k = (C334500D9k) c0d9z.LIZJ.getValue();
        if (i >= 0) {
            List list = checkoutIntent.items;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (i < list.size()) {
                List list2 = checkoutIntent.items;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                CheckoutLineItemContext checkoutLineItemContext = (CheckoutLineItemContext) ListProtector.get(list2, i);
                Integer num = checkoutLineItemContext.quantity;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int iMax = Math.max(1, iIntValue + i2);
                if (iMax != iIntValue) {
                    Collection collection = checkoutIntent.items;
                    if (collection == null) {
                        collection = C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(collection);
                    ListProtector.set(arrayList, i, checkoutLineItemContext.copy(checkoutLineItemContext.productId, checkoutLineItemContext.variantId, Integer.valueOf(iMax), checkoutLineItemContext.selectedOptions, checkoutLineItemContext.productSnapshot, checkoutLineItemContext.appliedCoupons, checkoutLineItemContext.eligibleForNativeCheckout));
                    CheckoutIntent checkoutIntentCopy = checkoutIntent.copy(arrayList, checkoutIntent.source, checkoutIntent.sellerProfileId, checkoutIntent.passThrough);
                    C334430D9d c334430D9dCopy = c334500D9k.LIZ;
                    if (c334430D9dCopy != null) {
                        if (i >= 0 && i < c334430D9dCopy.products.size()) {
                            ArrayList arrayList2 = new ArrayList(c334430D9dCopy.products);
                            C334410D9b c334410D9b = (C334410D9b) ListProtector.get(arrayList2, i);
                            ListProtector.set(arrayList2, i, c334410D9b.copy(c334410D9b.storeName, c334410D9b.orderTitle, c334410D9b.imageUrl, c334410D9b.title, c334410D9b.variantText, c334410D9b.currentPriceText, c334410D9b.originalPriceText, c334410D9b.discountText, iMax, c334410D9b.shippingInfoText, c334410D9b.estDeliveryText));
                            c334430D9dCopy = c334430D9dCopy.copy(arrayList2, c334430D9dCopy.deals, c334430D9dCopy.summary, c334430D9dCopy.savingsText);
                        }
                    } else {
                        c334430D9dCopy = null;
                    }
                    c0d9z.LIZJ.setValue(new C334500D9k(c334430D9dCopy, C00Y8.UPDATING));
                    c0d9z.LJ.LIZJ(new C0DA7(new C334580D9s(checkoutIntent, checkoutIntentCopy, c334500D9k.LIZ)));
                }
            }
        }
    }

    public final void PQ2(String str, String str2, CheckoutSession checkoutSession) {
        long jCurrentTimeMillis;
        Long l = this.LLJL;
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LLJJI.LIZJ(new C2266381DnI(jCurrentTimeMillis, iR2(checkoutSession), this.LLJLIL, str, str2, this.LLJLILLLLZIIL));
    }

    public static boolean eR2(CheckoutViewModel checkoutViewModel, boolean z, AwS405S0200000_4 awS405S0200000_4, int i) {
        AbstractC334700DAe c0dac;
        CheckoutStoredUserAddress checkoutStoredUserAddress;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            awS405S0200000_4 = null;
        }
        C0DAR c0dar = (C0DAR) checkoutViewModel.LLIZ.LIZIZ.getValue();
        C0DAO c0dao = checkoutViewModel.LLJIJIL;
        CheckoutIntent checkoutIntent = checkoutViewModel.LLJI;
        boolean z3 = true;
        if (!Intrinsics.LJFF(c0dao, C334760DAk.LIZ) && !Intrinsics.LJFF(c0dao, C334910DAz.LIZ) && !Intrinsics.LJFF(c0dao, C334900DAy.LIZ) && !Intrinsics.LJFF(c0dao, C334780DAm.LIZ) && !Intrinsics.LJFF(c0dao, C334810DAp.LIZ) && !Intrinsics.LJFF(c0dao, C0DB0.LIZ)) {
            if (!Intrinsics.LJFF(c0dao, C334790DAn.LIZ) && !Intrinsics.LJFF(c0dao, C0DB1.LIZ) && !(c0dao instanceof C0DAI) && !Intrinsics.LJFF(c0dao, C334800DAo.LIZ) && !Intrinsics.LJFF(c0dao, C334770DAl.LIZ)) {
                throw new C1954807lC();
            }
            c0dac = new C0DAC(new C0DAN(EnumC334490D9j.PAGE_BUSY));
        } else if (checkoutIntent == null) {
            c0dac = new C0DAC(new C0DAN(EnumC334490D9j.MISSING_INTENT));
        } else if (c0dar.LIZ == C0DAS.READY && (checkoutStoredUserAddress = c0dar.LIZIZ) != null) {
            c0dac = new C0DAB(new C334570D9r(checkoutIntent, checkoutStoredUserAddress));
        } else {
            c0dac = new C0DAC(C0DA0.LIZ(c0dar));
        }
        if (c0dac instanceof C0DAB) {
            C334570D9r c334570D9r = ((C0DAB) c0dac).LIZ;
            checkoutViewModel.kR2(C334790DAn.LIZ, "requestCreateCheckout");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createCheckout: start. items=");
            List list = c334570D9r.LIZ.items;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            sbLIZ.append(list.size());
            sbLIZ.append(", hasAddress=");
            if (c0dar.LIZIZ != null) {
                z2 = true;
            }
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            AnonymousClass0956 anonymousClass0956 = checkoutViewModel.LLJJJJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            checkoutViewModel.LLJJJJJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(checkoutViewModel), C0PEM.LIZJ, null, new C0D9G(checkoutViewModel, c334570D9r, awS405S0200000_4, null), 2);
            return true;
        }
        if (c0dac instanceof C0DAC) {
            C0DAN c0dan = ((C0DAC) c0dac).LIZ;
            if (c0dan.LIZ != EnumC334490D9j.MISSING_INTENT || (checkoutViewModel.LLILZIL == C0D7U.OneStepModel && checkoutViewModel.LLJI == null && !z)) {
                z3 = false;
            }
            checkoutViewModel.UQ2("createCheckout", c0dan, z3, null);
            if (awS405S0200000_4 == null) {
                return false;
            }
            awS405S0200000_4.invoke();
            return false;
        }
        throw new C1954807lC();
    }

    public final void UQ2(String str, C0DAN c0dan, boolean z, C0D9W c0d9w) {
        String str2;
        C334510D9l c334510D9l;
        String strLIZ;
        if (z) {
            switch (C334420D9c.LIZIZ[c0dan.LIZ.ordinal()]) {
                case 1:
                    c334510D9l = new C334510D9l(C0D9L.LIZ(2131857527), C0D9J.USER_ACTION_BLOCKED);
                    break;
                case 2:
                    c334510D9l = new C334510D9l(C0D9Q.LIZ(), C0D9J.USER_ACTION_BLOCKED);
                    break;
                case 3:
                    c334510D9l = new C334510D9l(C0D9L.LIZ(2131857461), C0D9J.USER_ACTION_BLOCKED);
                    break;
                case 4:
                    c334510D9l = new C334510D9l(C0D9Q.LIZ(), C0D9J.USER_ACTION_BLOCKED);
                    break;
                case 5:
                    if (c0d9w == null || (strLIZ = C0D9L.LIZ(2131857521)) == null) {
                        strLIZ = C0D9L.LIZ(2131857521);
                    }
                    c334510D9l = new C334510D9l(strLIZ, C0D9J.USER_ACTION_BLOCKED);
                    break;
                case 6:
                    c334510D9l = new C334510D9l(C0D9L.LIZ(2131857521), C0D9J.REQUEST_FAILED);
                    break;
                default:
                    throw new C1954807lC();
            }
            Map<String, String> map = C0D9H.LIZ;
            cR2(C0D9H.LIZLLL(aR2(), c334510D9l.LIZ, c334510D9l.LIZIZ));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" blocked: ");
        switch (C334420D9c.LIZIZ[c0dan.LIZ.ordinal()]) {
            case 1:
                str2 = "page busy";
                break;
            case 2:
                str2 = "missing intent";
                break;
            case 3:
                str2 = "missing shipping address";
                break;
            case 4:
                str2 = "missing checkoutId";
                break;
            case 5:
                str2 = "payment not ready";
                break;
            case 6:
                str2 = "payment reference is incomplete";
                break;
            default:
                throw new C1954807lC();
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        RQ2();
    }

    public CheckoutViewModel(CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, C0D7Z c0d7z, C0D7U c0d7u, C332710D2n c332710D2n) {
        boolean z;
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        C0D6A c0d6a = new C0D6A(0);
        this.LL = checkoutIntent;
        this.LLILLJJLI = checkoutSession;
        this.LLILLL = c0d7z;
        this.LLILZ = c0d6a;
        this.LLILZIL = c0d7u;
        this.LLILZLL = c332710D2n;
        this.LLIZ = new C0D9X();
        if (checkoutIntent != null && (map = checkoutIntent.passThrough) != null && (str = map.get("protocol_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = new C0D9V(z);
        this.LLJ = new C0D9Z();
        this.LLJI = checkoutIntent;
        this.LLJIJIL = C334760DAk.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(NQ2());
        this.LLJILJIL = c2252321DDqLIZ;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJILLL = c2252331DDrLIZIZ;
        this.LLJJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJJI = c2252331DDrLIZIZ2;
        this.LLJJIII = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.LLJJIJIL = new C334460D9g(C0DA2.UCP, EnumC334480D9i.BUSINESS_FIXABLE, null);
        this.LLJLIL = "";
        this.LLJLILLLLZIIL = "";
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0D9C(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C334380D8y(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0D9E(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0D9B(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0D9D(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C334370D8x(this, null), 3);
    }

    public final void CQ2(String str, String str2, C0D7I c0d7i, String str3, String str4) {
        int length;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC334690DAd c0daa;
        CheckoutStoredUserAddress checkoutStoredUserAddress;
        boolean z4;
        Integer numValueOf;
        CheckoutIntent checkoutIntent;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashierTokenReady: tokenLen=");
        boolean z5 = false;
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append(" methodType=");
        sbLIZ.append(str2);
        sbLIZ.append(" hasBilling=");
        if (c0d7i != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hasPaymentMethodId=");
        if (str3 != null && !a0.LJJJIL(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ.append(!z2);
        sbLIZ.append(" hasInstrumentId=");
        if (str4 != null && !a0.LJJJIL(str4)) {
            z3 = false;
        } else {
            z3 = true;
        }
        sbLIZ.append(!z3);
        sbLIZ.append(" isAcpScene=");
        sbLIZ.append(VQ2());
        C2188811AlT.LIZIZ(sbLIZ);
        C0D9V c0d9v = this.LLIZLLLIL;
        c0d9v.getClass();
        C2252321DDq c2252321DDq = c0d9v.LIZIZ;
        c2252321DDq.setValue(C0D9W.LIZ((C0D9W) c2252321DDq.getValue(), null, null, C0DA4.IDLE, null, null, null, 43));
        if (str2 != null && !a0.LJJJIL(str2) && (checkoutIntent = this.LLJI) != null) {
            Map<String, String> mapLJ = checkoutIntent.passThrough;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
            linkedHashMap.put("payment_type", str2);
            dR2(checkoutIntent.copy(checkoutIntent.items, checkoutIntent.source, checkoutIntent.sellerProfileId, linkedHashMap));
        }
        CheckoutIntent checkoutIntent2 = this.LLJI;
        C0DAR c0dar = (C0DAR) this.LLIZ.LIZIZ.getValue();
        String str5 = this.LLJJIJI;
        boolean zVQ2 = VQ2();
        if (checkoutIntent2 == null) {
            c0daa = new C0DAA(new C0DAN(EnumC334490D9j.MISSING_INTENT));
        } else if (c0dar.LIZ == C0DAS.READY && (checkoutStoredUserAddress = c0dar.LIZIZ) != null) {
            if (str5 == null) {
                c0daa = new C0DAA(new C0DAN(EnumC334490D9j.MISSING_CHECKOUT_ID));
            } else {
                if (str != null && !a0.LJJJIL(str)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z6 = !z4;
                if (str3 != null && !a0.LJJJIL(str3) && str4 != null && !a0.LJJJIL(str4)) {
                    z5 = true;
                }
                if (zVQ2) {
                    z6 = z5;
                }
                if (!z6) {
                    c0daa = new C0DAA(new C0DAN(EnumC334490D9j.MISSING_PAYMENT_REFERENCE));
                } else {
                    c0daa = new C0DA9(new C0D9S(str5, checkoutIntent2, checkoutStoredUserAddress, str, str2, c0d7i, str3, str4));
                }
            }
        } else {
            c0daa = new C0DAA(C0DA0.LIZ(c0dar));
        }
        if (c0daa instanceof C0DA9) {
            C0D9S c0d9s = ((C0DA9) c0daa).LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("completeCheckout: start. checkoutId=");
            sbLIZ2.append(c0d9s.LIZ);
            sbLIZ2.append(" tokenLen=");
            String str6 = c0d9s.LIZLLL;
            if (str6 != null) {
                numValueOf = Integer.valueOf(str6.length());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            kR2(new C0DAI(EnumC1984507pz.COMPLETING), "completeCheckout");
            AnonymousClass0956 anonymousClass0956 = this.LLJJL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0D9R(this, c0d9s, null), 2);
            return;
        }
        if (c0daa instanceof C0DAA) {
            jR2(gR2(), "continueCompleteCheckoutBlocked");
            UQ2("continueCompleteCheckout", ((C0DAA) c0daa).LIZ, true, null);
            return;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e A[REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void lR2(com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel r13, java.lang.String r14, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r15, java.lang.String r16, boolean r17, int r18) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel.lR2(com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, java.lang.String, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent MQ2(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r7, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r8, java.lang.String r9, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel.MQ2(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, boolean, java.lang.String):com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent");
    }
}
