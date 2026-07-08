package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout;

import X.AbstractC21673619ry;
import X.AbstractC334960DBe;
import X.C01GW;
import X.C098200Yq;
import X.C0D8O;
import X.C0DAV;
import X.C0DBY;
import X.C0DCF;
import X.C0DCG;
import X.C0DCH;
import X.C0DCI;
import X.C0DCK;
import X.C0DCW;
import X.C0DCX;
import X.C0DDL;
import X.C0DEJ;
import X.C0DEM;
import X.C0DEO;
import X.C0OBG;
import X.C0TVI;
import X.C0XQ7;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19226610Js;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C333540D5s;
import X.C334180D8e;
import X.C334190D8f;
import X.C334200D8g;
import X.C334210D8h;
import X.C334410D9b;
import X.C334430D9d;
import X.C334630D9x;
import X.C334830DAr;
import X.C334970DBf;
import X.C334980DBg;
import X.C334990DBh;
import X.C335000DBi;
import X.C335080DBq;
import X.C335270DCj;
import X.C335300DCm;
import X.C336720DHy;
import X.C346440Di6;
import X.C452501pT;
import X.C516501zn;
import X.C786410Ut5;
import X.EnumC335460DDc;
import X.EnumC452301pR;
import X.InterfaceC333090D3z;
import X.InterfaceC335280DCk;
import X.InterfaceC336350DGn;
import X.InterfaceC586170Myt;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS48S0101000_4;
import Y.ARunnableS37S0300000_4;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import com.ss.android.ugc.aweme.commercialize.ucp.api.spi.IUcpDebugService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS118S1100000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutFragment extends Fragment implements InterfaceC336350DGn, InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiKic2Ky4jPDt9Cy0pKiQ8PTEKOy40JSAiPQ==";
    public C0DCG LL;
    public String LLILZ;
    public boolean LLILZIL;
    public C19226610Js LLILZLL;
    public C335000DBi LLIZ;
    public boolean LLIZLLLIL;
    public C335080DBq LLJ;
    public String LLJIJIL;
    public final ViewModelLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C333540D5s LLILLJJLI = new C333540D5s(null);
    public final C335270DCj LLILLL = new C335270DCj(null);
    public final C0DCW LLJI = new C0DCW();

    public final CheckoutViewModel MR() {
        return (CheckoutViewModel) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        C0DBY c0dby = C335000DBi.LIZJ;
        C335000DBi c335000DBi = this.LLIZ;
        Map<String, String> map = c335000DBi != null ? c335000DBi.LIZ : null;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC586170Myt interfaceC586170MytRemove;
        String str = this.LLJIJIL;
        if (str != null && (interfaceC586170MytRemove = this.LLJI.LIZ.LIZ.remove(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gateway.removeInvalidationListener token=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C0XQ7.LJ();
            C0XQ7.LIZ.LJI(interfaceC586170MytRemove);
        }
        this.LLJIJIL = null;
        super.onDestroyView();
        PR("system_back");
        C19226610Js c19226610Js = this.LLILZLL;
        if (c19226610Js != null) {
            c19226610Js.LIZ();
        }
        this.LLILZLL = null;
        C335270DCj c335270DCj = this.LLILLL;
        c335270DCj.getClass();
        c335270DCj.LJ = null;
        c335270DCj.LIZLLL = false;
        c335270DCj.LJFF = null;
        InterfaceC335280DCk interfaceC335280DCk = c335270DCj.LIZIZ;
        if (interfaceC335280DCk != null) {
            c335270DCj.LJI.getClass();
            interfaceC335280DCk.LJFF(null);
        }
        this.LL = null;
    }

    public CheckoutFragment() {
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 86);
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS548S0100000_4(new AwS548S0100000_4((Fragment) this, 83), (Function0<Unit>) 84));
        this.LLJILJIL = C336720DHy.LIZ(this, C13LE.LIZ(CheckoutViewModel.class), new AwS548S0100000_4(c01gwLIZ, 85), new AwS405S0200000_4((Function0) null, c01gwLIZ, 12), awS548S0100000_4);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 79));
    }

    @Override // X.InterfaceC336350DGn
    public final void F1() {
        MR().IQ2();
    }

    @Override // X.InterfaceC336350DGn
    public final void Pf() {
        View view = getView();
        if (view == null) {
            return;
        }
        if (C0OBG.LIZ(1500L, view)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ui.click.shippingAddress.debounced currentSelectedAddressId=");
            String str = this.LLILZ;
            sbLIZ.append(str != null ? str : "");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ui.click.shippingAddress currentSelectedAddressId=");
        String str2 = this.LLILZ;
        sbLIZ2.append(str2 != null ? str2 : "");
        C2188811AlT.LIZIZ(sbLIZ2);
        CheckoutViewModel checkoutViewModelMR = MR();
        checkoutViewModelMR.getClass();
        checkoutViewModelMR.LLJILLL.LIZJ(C334830DAr.LIZ);
    }

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[PHI: r5
      0x0096: PHI (r5v1 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v0 boolean), (r5v5 boolean) binds: [B:9:0x003e, B:11:0x0042, B:13:0x004c, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(java.lang.String r16) {
        /*
            r15 = this;
            android.content.Context r10 = r15.getContext()
            r5 = 0
            if (r10 != 0) goto L11
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel r1 = r15.MR()
            java.lang.String r0 = "Fallback checkout context is unavailable."
            r1.DQ2(r0, r5)
            return
        L11:
            java.lang.Class<com.ss.android.ugc.aweme.ad.ecp.IEcpService> r4 = com.ss.android.ugc.aweme.ad.ecp.IEcpService.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.ad.ecp.IEcpService r2 = (com.ss.android.ugc.aweme.ad.ecp.IEcpService) r2
            if (r2 == 0) goto L95
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel r0 = r15.MR()
            r0.GQ2()
            X.0DCM r3 = new X.0DCM
            r3.<init>(r10)
            r0 = r16
            r3.LIZ = r0
            android.os.Bundle r4 = r15.getArguments()
            java.lang.String r1 = "arg_checkout_intent"
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent> r0 = com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent.class
            java.io.Serializable r0 = X.C0DCF.LIZ(r4, r1, r0)
            com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r0 = (com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent) r0
            if (r0 == 0) goto L96
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.passThrough
            if (r1 == 0) goto L96
            java.lang.String r0 = "source_aweme_id"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L96
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r4 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            r8 = 14
            r9 = 0
            r5 = r5
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.xr(r1)
        L62:
            r3.LIZIZ = r0
            X.0DCj r0 = r15.LLILLL
            X.0DCk r4 = r0.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cashier: get bridge for fallback reuse, hit="
            r1.append(r0)
            if (r4 == 0) goto L74
            r5 = 1
        L74:
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            r3.LIZJ = r4
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel r0 = r15.MR()
            java.lang.String r14 = r0.LLJLILLLLZIIL
            X.0DCU r9 = new X.0DCU
            java.lang.String r11 = r3.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r3.LIZIZ
            java.lang.Object r13 = r3.LIZJ
            r9.<init>(r10, r11, r12, r13, r14)
            X.0D9e r0 = new X.0D9e
            r0.<init>()
            r2.LIZIZ(r9, r0)
        L95:
            return
        L96:
            r0 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment.NR(java.lang.String):void");
    }

    public final void OR(String str) {
        C335000DBi c335000DBi = this.LLIZ;
        if (c335000DBi != null) {
            c335000DBi.logAd(C0DEO.LIZ.LJIIIIZZ("order_submit"), ee(), new AwS118S1100000_4(str, this, 1));
        }
    }

    public final void PR(String str) {
        long jCurrentTimeMillis;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        Long l = MR().LLJJLIIIJLLLLLLLZ;
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        String strIR2 = MR().iR2(null);
        RR("checkout_ucp_checkout_exit", C2097608Jq.LJII(new Pair("order_amount", strIR2), new Pair("exit_method", str), new Pair("stay_duration_ms", String.valueOf(jCurrentTimeMillis))));
        C335000DBi c335000DBi = this.LLIZ;
        if (c335000DBi != null) {
            c335000DBi.logAd(C0DEM.LIZ, ee(), new C0DEJ(strIR2, str, jCurrentTimeMillis));
        }
    }

    public final void SR(int i) {
        String strIR2 = MR().iR2(null);
        RR("checkout_ucp_quantity_modify", C2097608Jq.LJII(new Pair("order_amount", strIR2), new Pair("quantity", String.valueOf(i))));
        C335000DBi c335000DBi = this.LLIZ;
        if (c335000DBi != null) {
            c335000DBi.logAd(C0DCI.LIZ, ee(), new C0DCH(strIR2, i));
        }
    }

    @Override // X.InterfaceC336350DGn
    public final void c3(FrameLayout frameLayout) {
        AbstractC334960DBe abstractC334960DBeLIZIZ;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C335270DCj c335270DCj = this.LLILLL;
        c335270DCj.LJ = frameLayout;
        if (c335270DCj.LIZIZ == null) {
            abstractC334960DBeLIZIZ = C334980DBg.LIZ;
        } else {
            abstractC334960DBeLIZIZ = c335270DCj.LIZIZ(context, this);
        }
        if (Intrinsics.LJFF(abstractC334960DBeLIZIZ, C334990DBh.LIZ)) {
            HandlerHook.viewPost(frameLayout, new ARunnableS73S0200000_4(frameLayout, this, 7));
        } else {
            if (Intrinsics.LJFF(abstractC334960DBeLIZIZ, C334980DBg.LIZ)) {
                return;
            }
            if (abstractC334960DBeLIZIZ instanceof C334970DBf) {
                HandlerHook.viewPost(frameLayout, new ARunnableS37S0300000_4(frameLayout, this, abstractC334960DBeLIZIZ, 2));
                return;
            }
            throw new C1954807lC();
        }
    }

    public static void RR(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tracking.report label=");
        sbLIZ.append(str);
        sbLIZ.append(" params=");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC336350DGn
    public final void Sf(int i, int i2) {
        Integer numValueOf;
        C334630D9x c334630D9x;
        C334430D9d c334430D9d;
        List<C334410D9b> list;
        C334410D9b c334410D9b;
        C335080DBq c335080DBq = this.LLJ;
        if (c335080DBq != null && (c334630D9x = c335080DBq.LIZIZ) != null && (c334430D9d = c334630D9x.LIZ) != null && (list = c334430D9d.products) != null && (c334410D9b = (C334410D9b) C13LP.LJJJLZIJ(i, list)) != null) {
            numValueOf = Integer.valueOf(c334410D9b.quantity);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ui.commit.quantityInput.skipped index=");
            sbLIZ.append(i);
            sbLIZ.append(" targetQuantity=");
            sbLIZ.append(i2);
            sbLIZ.append(" reason=missing_current_quantity");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        int iIntValue = i2 - numValueOf.intValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ui.commit.quantityInput index=");
        sbLIZ2.append(i);
        sbLIZ2.append(" currentQuantity=");
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" targetQuantity=");
        sbLIZ2.append(i2);
        sbLIZ2.append(" delta=");
        sbLIZ2.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (iIntValue == 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ui.commit.quantityInput.noop index=");
            sbLIZ3.append(i);
            sbLIZ3.append(" currentQuantity=");
            sbLIZ3.append(numValueOf);
            sbLIZ3.append(" targetQuantity=");
            sbLIZ3.append(i2);
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        SR(i2);
        MR().vQ2(i, iIntValue);
    }

    public final void UR(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("address.refresh.start source=");
        sbLIZ.append(str);
        sbLIZ.append(" clearWhenMissing=");
        sbLIZ.append(z);
        sbLIZ.append(" currentSelectedAddressId=");
        String str2 = this.LLILZ;
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append(" hasResolvedInitialAddress=");
        sbLIZ.append(this.LLILZIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C334180D8e(this, str, z, null), 3);
    }

    @Override // X.InterfaceC336350DGn
    public final void Zk(int i, int i2) {
        OR("minus_num");
        SR(i2);
        MR().vQ2(i, -1);
    }

    @Override // X.InterfaceC336350DGn
    public final void ep(int i, int i2) {
        OR("add_num");
        SR(i2);
        MR().vQ2(i, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CheckoutLineItemContext checkoutLineItemContext;
        CheckoutLineItemContext checkoutLineItemContext2;
        String str;
        ConstraintLayout constraintLayout;
        String str2;
        String str3;
        String str4;
        super.onViewCreated(view, bundle);
        final C0DCG c0dcg = this.LL;
        if (c0dcg == null) {
            return;
        }
        c0dcg.LLILZ.setLayoutManager(new LinearLayoutManager(view.getContext()));
        c0dcg.LLILZ.setAdapter((AbstractC21673619ry) this.LLJILJILJ.getValue());
        final int paddingTop = c0dcg.LLILZIL.getPaddingTop();
        final int paddingBottom = c0dcg.LLILLL.getPaddingBottom();
        C14K9.LJIJJ(c0dcg.LL, new C0TVI() { // from class: X.0DD9
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                ConstraintLayout constraintLayout2 = c0dcg.LLILZIL;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), paddingTop + c20244914JjLIZ.LIZIZ, c0dcg.LLILZIL.getPaddingRight(), c0dcg.LLILZIL.getPaddingBottom());
                C0DDL c0ddl = c0dcg.LLILLL;
                c0ddl.setPadding(c0ddl.getPaddingLeft(), c0dcg.LLILLL.getPaddingTop(), c0dcg.LLILLL.getPaddingRight(), paddingBottom + c20244914JjLIZ.LIZLLL);
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(c0dcg.LL);
        if (PluggableExtentionKt.pluggableSpi$default(IUcpDebugService.class, false, false, false, 14, null) != null) {
            C786410Ut5.Y7(c0dcg.LLILZIL, new ACListenerS48S0101000_4(this, 4));
        }
        C786410Ut5.a9(c0dcg.LLILLJJLI, new ACListenerS139S0100000_4(this, 15));
        c0dcg.LLILLL.setOnPlaceOrderClick(new AwS548S0100000_4(this, 80));
        c0dcg.LLILLL.setOnDisclaimerInfoClick(new AwS548S0100000_4(this, 81));
        this.LLILZLL = new C19226610Js(view.getContext(), new AwS548S0100000_4(this, 82));
        CheckoutIntent checkoutIntent = (CheckoutIntent) C0DCF.LIZ(getArguments(), "arg_checkout_intent", CheckoutIntent.class);
        String str5 = null;
        if (checkoutIntent == null) {
            C0DAV.LIZ("CheckoutFragment", "missing CheckoutIntent, finish", null);
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        List<CheckoutLineItemContext> list = checkoutIntent.items;
        if (list != null) {
            checkoutLineItemContext = (CheckoutLineItemContext) C13LP.LJJJLL(list);
        } else {
            checkoutLineItemContext = null;
        }
        Map<String, String> mapLJ = checkoutIntent.passThrough;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
        if (checkoutLineItemContext != null) {
            String str6 = checkoutLineItemContext.productId;
            if (str6 != null && (!a0.LJJJIL(str6))) {
                linkedHashMap.put("external_product_id", str6);
            }
            String str7 = checkoutLineItemContext.variantId;
            if (str7 != null && (!a0.LJJJIL(str7))) {
                linkedHashMap.put("shopify_variant_id", str7);
            }
        }
        this.LLIZ = new C335000DBi(linkedHashMap, new Object[0]);
        this.LLILLL.LJFF = new C335300DCm(this);
        C0DCW c0dcw = this.LLJI;
        AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(this, 49);
        C0DCX c0dcx = c0dcw.LIZ;
        c0dcx.getClass();
        String string = UUID.randomUUID().toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gateway.addInvalidationListener token=");
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        C346440Di6 c346440Di6 = new C346440Di6(awS583S0100000_4, 2);
        c0dcx.LIZ.put(string, c346440Di6);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(c346440Di6);
        this.LLJIJIL = string;
        C0D8O.LIZ(EnumC335460DDc.CHECKOUT, null, 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C334190D8f(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C334200D8g(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C334210D8h(this, null), 3);
        MR().WQ2();
        UR("unspecified", false);
        Map<String, String> map = checkoutIntent.passThrough;
        List<CheckoutLineItemContext> list2 = checkoutIntent.items;
        if (list2 != null) {
            checkoutLineItemContext2 = (CheckoutLineItemContext) C13LP.LJJJLL(list2);
        } else {
            checkoutLineItemContext2 = null;
        }
        if (map == null || (str = map.get("raw_ad_data_str")) == null) {
            str = null;
        }
        C0DCK c0dck = C0DCK.LIZ;
        C19EG activity2 = getActivity();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C0DCG c0dcg2 = this.LL;
        if (c0dcg2 != null) {
            constraintLayout = c0dcg2.LL;
        } else {
            constraintLayout = null;
        }
        if (map != null) {
            str2 = map.get("tiktok_shop_id");
            str3 = map.get("tiktok_spu_id");
        } else {
            str2 = null;
            str3 = null;
        }
        if (checkoutLineItemContext2 != null) {
            str4 = checkoutLineItemContext2.productId;
            str5 = checkoutLineItemContext2.variantId;
        } else {
            str4 = null;
        }
        C0DCK.LIZ(c0dck, activity2, viewLifecycleOwner, constraintLayout, map, str, str2, str3, str4, new C516501zn(str5, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3s, viewGroup, false);
        int i = R.id.ucp_checkout_back;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.ucp_checkout_back, viewTd);
        if (tuxIconView != null) {
            i = R.id.ucp_checkout_bottom_bar;
            C0DDL c0ddl = (C0DDL) C1616006Uk.LIZ(R.id.ucp_checkout_bottom_bar, viewTd);
            if (c0ddl != null) {
                i = R.id.ucp_checkout_list;
                RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.ucp_checkout_list, viewTd);
                if (recyclerView != null) {
                    i = R.id.ucp_checkout_nav;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.ucp_checkout_nav, viewTd);
                    if (constraintLayout != null) {
                        i = R.id.ucp_checkout_security_row;
                        if (C1616006Uk.LIZ(R.id.ucp_checkout_security_row, viewTd) != null) {
                            i = R.id.ucp_checkout_security_text;
                            if (C1616006Uk.LIZ(R.id.ucp_checkout_security_text, viewTd) != null) {
                                i = R.id.ucp_checkout_title;
                                if (C1616006Uk.LIZ(R.id.ucp_checkout_title, viewTd) != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewTd;
                                    this.LL = new C0DCG(constraintLayout2, tuxIconView, c0ddl, recyclerView, constraintLayout);
                                    C19GS c19gs = null;
                                    if (!(constraintLayout2 instanceof View)) {
                                        constraintLayout2 = null;
                                    }
                                    if (constraintLayout2 != null) {
                                        try {
                                            ViewTreeLifecycleOwner.set(constraintLayout2, getViewLifecycleOwner());
                                            ViewTreeViewModelStoreOwner.set(constraintLayout2, this);
                                            constraintLayout2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                            C19EG activity = getActivity();
                                            if (activity instanceof C19GS) {
                                                c19gs = (C19GS) activity;
                                            }
                                            C1685300txQ.LIZ(c19gs);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                            return constraintLayout2;
                                        }
                                    }
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                    return constraintLayout2;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
