package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C04JS;
import X.C098200Yq;
import X.C09CT;
import X.C0OM1;
import X.C0QSJ;
import X.C1019203yg;
import X.C1019303yh;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1053404Aa;
import X.InterfaceC1146704e9;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC599480NfG;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC737790Swr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BundlePanelFragment extends ECBaseFragment implements InterfaceC344240DeY, InterfaceC1164530gPT, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C1019203yg LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZy0mJiEgLD8yJiAgZw0mJiEgLB8yJiAgDz0yLygpJzs=";
    public final C1019303yh LLILLL = new C1019303yh();
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;
    public final C04JS LLILZLL;
    public InterfaceC1053404Aa LLIZ;
    public InterfaceC599480NfG LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BundlePanelFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/bundlepanel/BundlePanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new C1019203yg();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1053404Aa.class) {
            this.LLIZ = (InterfaceC1053404Aa) obj;
        } else if (cls == InterfaceC599480NfG.class) {
            this.LLIZLLLIL = (InterfaceC599480NfG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BundlePanelFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1053404Aa.class) {
            return this.LLIZ;
        }
        if (cls == InterfaceC599480NfG.class) {
            return this.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BundlePanelFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BundlePanelFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1053404Aa.class) {
            this.LLIZ = null;
        } else if (cls == InterfaceC599480NfG.class) {
            this.LLIZLLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public BundlePanelFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 76);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BundlePanelVM.class);
        AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(c19719912DlLIZ, 75);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(45);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_12, awS545S0100000_1, aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
        this.LLILZIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(29));
        this.LLILZLL = new C04JS(this, 2);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = "Customize your bundle";
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 74));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    public final BundlePanelVM VR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (BundlePanelVM) assemVMLazy.getValue();
    }

    public static final class BizParams {
        public static final int $stable = 8;

        @C09CT("add_to_cart_delegate_key")
        public final String addToCartDelegateKey;

        @C09CT("biz_type")
        public final Integer bizType;

        @C09CT("buyer_addr_id")
        public final String buyerAddrId;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("is_async_add_cart")
        public final boolean isAsyncAddCart;

        @C09CT("is_from_follow")
        public final Boolean isFromFollow;

        @C09CT("logistics_service_id")
        public final String logisticServiceId;

        @C09CT("ocp_context")
        public OneClickPayContext ocpContext;

        @C09CT("should_use_ocp")
        public final Integer ocpFlag;

        @C09CT("ocp_main_order_id")
        public final String ocpOrderId;

        @C09CT("orderRequestParams")
        public final Map<String, Object> orderRequestParams;

        @C09CT("pdp_from")
        public final String pdpFrom;

        @C09CT("pdp_pipe_params")
        public final String pipeParams;

        @C09CT("product_enter_context")
        public final Map<String, Object> productEnterContext;

        @C09CT("chain_key")
        public final String schemaChainKey;

        @C09CT("source_info")
        public final String sourceInfo;

        @C09CT("voucher_type_id")
        public final String voucherTypeId;

        public BizParams() {
            this(null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BizParams)) {
                return false;
            }
            BizParams bizParams = (BizParams) obj;
            return Intrinsics.LJFF(this.productEnterContext, bizParams.productEnterContext) && Intrinsics.LJFF(this.schemaChainKey, bizParams.schemaChainKey) && Intrinsics.LJFF(this.sourceInfo, bizParams.sourceInfo) && Intrinsics.LJFF(this.buyerAddrId, bizParams.buyerAddrId) && Intrinsics.LJFF(this.logisticServiceId, bizParams.logisticServiceId) && Intrinsics.LJFF(this.enterFrom, bizParams.enterFrom) && Intrinsics.LJFF(this.pipeParams, bizParams.pipeParams) && this.isAsyncAddCart == bizParams.isAsyncAddCart && Intrinsics.LJFF(this.bizType, bizParams.bizType) && Intrinsics.LJFF(this.addToCartDelegateKey, bizParams.addToCartDelegateKey) && Intrinsics.LJFF(this.isFromFollow, bizParams.isFromFollow) && Intrinsics.LJFF(this.pdpFrom, bizParams.pdpFrom) && Intrinsics.LJFF(this.voucherTypeId, bizParams.voucherTypeId) && Intrinsics.LJFF(this.orderRequestParams, bizParams.orderRequestParams) && Intrinsics.LJFF(this.ocpFlag, bizParams.ocpFlag) && Intrinsics.LJFF(this.ocpOrderId, bizParams.ocpOrderId) && Intrinsics.LJFF(this.ocpContext, bizParams.ocpContext);
        }

        public int hashCode() {
            Map<String, Object> map = this.productEnterContext;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            String str = this.schemaChainKey;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sourceInfo;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buyerAddrId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logisticServiceId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.enterFrom;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pipeParams;
            int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.isAsyncAddCart)) * 31;
            Integer num = this.bizType;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            String str7 = this.addToCartDelegateKey;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.isFromFollow;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str8 = this.pdpFrom;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.voucherTypeId;
            int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Map<String, Object> map2 = this.orderRequestParams;
            int iHashCode13 = (iHashCode12 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Integer num2 = this.ocpFlag;
            int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str10 = this.ocpOrderId;
            int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
            OneClickPayContext oneClickPayContext = this.ocpContext;
            return iHashCode15 + (oneClickPayContext != null ? oneClickPayContext.hashCode() : 0);
        }

        public String toString() {
            return "BizParams(productEnterContext=" + this.productEnterContext + ", schemaChainKey=" + this.schemaChainKey + ", sourceInfo=" + this.sourceInfo + ", buyerAddrId=" + this.buyerAddrId + ", logisticServiceId=" + this.logisticServiceId + ", enterFrom=" + this.enterFrom + ", pipeParams=" + this.pipeParams + ", isAsyncAddCart=" + this.isAsyncAddCart + ", bizType=" + this.bizType + ", addToCartDelegateKey=" + this.addToCartDelegateKey + ", isFromFollow=" + this.isFromFollow + ", pdpFrom=" + this.pdpFrom + ", voucherTypeId=" + this.voucherTypeId + ", orderRequestParams=" + this.orderRequestParams + ", ocpFlag=" + this.ocpFlag + ", ocpOrderId=" + this.ocpOrderId + ", ocpContext=" + this.ocpContext + ')';
        }

        public final boolean isAsyncAddCart() {
            return this.isAsyncAddCart;
        }

        public final Boolean isFromFollow() {
            return this.isFromFollow;
        }

        public final void setOcpContext(OneClickPayContext oneClickPayContext) {
            this.ocpContext = oneClickPayContext;
        }

        public BizParams(Map<String, Object> map, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Integer num, String str7, Boolean bool, String str8, String str9, Map<String, Object> map2, Integer num2, String str10, OneClickPayContext oneClickPayContext) {
            this.productEnterContext = map;
            this.schemaChainKey = str;
            this.sourceInfo = str2;
            this.buyerAddrId = str3;
            this.logisticServiceId = str4;
            this.enterFrom = str5;
            this.pipeParams = str6;
            this.isAsyncAddCart = z;
            this.bizType = num;
            this.addToCartDelegateKey = str7;
            this.isFromFollow = bool;
            this.pdpFrom = str8;
            this.voucherTypeId = str9;
            this.orderRequestParams = map2;
            this.ocpFlag = num2;
            this.ocpOrderId = str10;
            this.ocpContext = oneClickPayContext;
        }
    }

    public static final class RenderParams {
        public static final int $stable = 8;

        @C09CT("product_id")
        public final String productId;

        @C09CT("product")
        public final ProductPackStruct productInfoPack;

        @C09CT("virtual_bundle")
        public final Object virtualBundle;

        public RenderParams() {
            this("", null, "");
        }

        public final String getProductId() {
            return this.productId;
        }

        public final ProductPackStruct getProductInfoPack() {
            return this.productInfoPack;
        }

        public final Object getVirtualBundle() {
            return this.virtualBundle;
        }

        public RenderParams(String str, ProductPackStruct productPackStruct, Object obj) {
            this.productId = str;
            this.productInfoPack = productPackStruct;
            this.virtualBundle = obj;
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BundlePanelFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLILLL, InterfaceC1053404Aa.class);
        c0qsjLIZIZ.unbindAbility(this.LLILZIL.getValue(), InterfaceC599480NfG.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0217 A[PHI: r2 r5 r6 r7
      0x0217: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v11 java.lang.String) binds: [B:99:0x0213, B:84:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r5v5 java.lang.Integer) = (r5v4 java.lang.Integer), (r5v9 java.lang.Integer) binds: [B:99:0x0213, B:84:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r6v3 java.lang.Integer) = (r6v2 java.lang.Integer), (r6v5 java.lang.Integer) binds: [B:99:0x0213, B:84:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r7v4 java.util.Map<java.lang.String, java.lang.Object>) = (r7v3 java.util.Map<java.lang.String, java.lang.Object>), (r7v6 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:99:0x0213, B:84:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208 A[PHI: r7
      0x0208: PHI (r7v1 java.util.Map<java.lang.String, java.lang.Object>) = (r7v0 java.util.Map<java.lang.String, java.lang.Object>), (r7v9 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:90:0x0204, B:75:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d A[PHI: r6 r7
      0x020d: PHI (r6v1 java.lang.Integer) = (r6v0 java.lang.Integer), (r6v7 java.lang.Integer) binds: [B:93:0x0209, B:78:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r7v2 java.util.Map<java.lang.String, java.lang.Object>) = (r7v1 java.util.Map<java.lang.String, java.lang.Object>), (r7v8 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:93:0x0209, B:78:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212 A[PHI: r5 r6 r7
      0x0212: PHI (r5v4 java.lang.Integer) = (r5v3 java.lang.Integer), (r5v10 java.lang.Integer) binds: [B:96:0x020e, B:81:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r6v2 java.lang.Integer) = (r6v1 java.lang.Integer), (r6v6 java.lang.Integer) binds: [B:96:0x020e, B:81:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r7v3 java.util.Map<java.lang.String, java.lang.Object>) = (r7v2 java.util.Map<java.lang.String, java.lang.Object>), (r7v7 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:96:0x020e, B:81:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r47) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BundlePanelFragmentScope.class});
        c0qsjLIZIZ.bindAbility(this.LLILLL, InterfaceC1053404Aa.class);
        c0qsjLIZIZ.bindAbility(this.LLILZIL.getValue(), InterfaceC599480NfG.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 67), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ayt, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static final class EnterParams {
        public static final int $stable = 8;

        @C09CT("biz_params")
        public final BizParams bizParams;

        @C09CT("click_from")
        public final int clickFrom;

        @C09CT("product_id")
        public final String productId;

        @C09CT("sku_descriptor")
        public final SkuDescriptor skuDescriptor;

        @C09CT("source_btm_token")
        public final String sourceBtmToken;

        @C09CT("trackParams")
        public final Map<String, Object> trackParams;

        public EnterParams() {
            this(null, null, null, 0, new SkuDescriptor(null, ""), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParams)) {
                return false;
            }
            EnterParams enterParams = (EnterParams) obj;
            return Intrinsics.LJFF(this.productId, enterParams.productId) && Intrinsics.LJFF(this.sourceBtmToken, enterParams.sourceBtmToken) && Intrinsics.LJFF(this.trackParams, enterParams.trackParams) && this.clickFrom == enterParams.clickFrom && Intrinsics.LJFF(this.skuDescriptor, enterParams.skuDescriptor) && Intrinsics.LJFF(this.bizParams, enterParams.bizParams);
        }

        public int hashCode() {
            String str = this.productId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sourceBtmToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.trackParams;
            int iHashCode3 = (((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + this.clickFrom) * 31) + this.skuDescriptor.hashCode()) * 31;
            BizParams bizParams = this.bizParams;
            return iHashCode3 + (bizParams != null ? bizParams.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnterParams(productId=");
            sbLIZ.append(this.productId);
            sbLIZ.append(", sourceBtmToken=");
            sbLIZ.append(this.sourceBtmToken);
            sbLIZ.append(", trackParams=");
            sbLIZ.append(this.trackParams);
            sbLIZ.append(", clickFrom=");
            sbLIZ.append(this.clickFrom);
            sbLIZ.append(", skuDescriptor=");
            sbLIZ.append(this.skuDescriptor);
            sbLIZ.append(", bizParams=");
            sbLIZ.append(this.bizParams);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EnterParams(String str, String str2, Map<String, Object> map, int i, SkuDescriptor skuDescriptor, BizParams bizParams) {
            this.productId = str;
            this.sourceBtmToken = str2;
            this.trackParams = map;
            this.clickFrom = i;
            this.skuDescriptor = skuDescriptor;
            this.bizParams = bizParams;
        }
    }
}
