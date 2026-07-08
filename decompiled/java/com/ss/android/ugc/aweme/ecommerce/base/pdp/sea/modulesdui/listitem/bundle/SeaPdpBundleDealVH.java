package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle;

import X.C01GW;
import X.C04A2;
import X.C1019103yf;
import X.C128Y;
import X.C13LE;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1753650vjf;
import X.C1753670vjh;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C452501pT;
import X.C919503ib;
import X.C946803n0;
import X.EnumC1014603xw;
import X.InterfaceC1748810vbr;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import zva.m;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpBundleDealVH extends AbsFullSpanVH<C04A2> implements InterfaceC1748810vbr {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final LinkedList<C1753670vjh> LLJJJIL;
    public final m LLJJJJ;
    public int LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1753650vjf c6() {
        return (C1753650vjf) this.LLJJJ.getValue();
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        C128Y c128yLIZ = C946803n0.LIZ(this.itemView);
        if (c128yLIZ instanceof InterfaceC1748810vbr) {
            return (InterfaceC1748810vbr) c128yLIZ;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpBundleDealVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.avx, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 60));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 409));
        this.LLJJJIL = new LinkedList<>();
        this.LLJJJJ = new m();
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS268S0000000_26.get$arr$(210));
    }

    public final void f6(String str) {
        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR34;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBundleDealVH ");
        sbLIZ.append(str);
        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0398  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH.rr(java.lang.Object):void");
    }

    public final void e6(BundleAddButton bundleAddButton, BundleInfo bundleInfo) {
        Object obj;
        Object obj2;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str = bundleAddButton.schema;
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("previous_page", "product_detail");
            String strPR2 = d6().PR2();
            if (strPR2 != null) {
                linkedHashMap.put("entrance_info", strPR2);
            }
            linkedHashMap.put("entrance_form", "horizontal_goods_card");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<BundleProduct> list = bundleInfo.productList;
            if (list != null) {
                for (BundleProduct bundleProduct : list) {
                    sb.append(bundleProduct.productSource);
                    sb.append(",");
                    sb2.append(bundleProduct.productId);
                    sb2.append(",");
                }
            }
            linkedHashMap.put("product_source", sb.toString());
            linkedHashMap.put("product_id", sb2.toString());
            IPdpStarter.PdpEnterParam pdpEnterParam = d6().LLIZ;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                obj = map2.get("enter_from_info");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                obj = null;
            }
            Object obj3 = "unknown";
            if (obj == null) {
                obj = "unknown";
            }
            linkedHashMap.put("enter_from_info", obj);
            linkedHashMap.put("source_page_type", "bundle_deal");
            IPdpStarter.PdpEnterParam pdpEnterParam2 = d6().LLIZ;
            if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
                obj2 = map.get("source_page_type");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof String) && obj2 != null) {
                obj3 = obj2;
            }
            linkedHashMap.put("first_source_page", obj3);
            linkedHashMap.put("parent_product_id", d6().getProductId());
            Context context = this.itemView.getContext();
            String strLJII = d6().LLLLL.LJII("c1720.d9604", bundleAddButton.schema, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
            C919503ib.LIZIZ(context, strLJII, linkedHashMap2, false).open();
            return;
        }
        f6("schema is null");
    }
}
