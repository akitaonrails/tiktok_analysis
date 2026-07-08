package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03AZ;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C09R3;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C723202s2;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7930037w;
import X.EnumC805403Cq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.OspAggregationOrderModuleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USAggregationOrderSingleSkuCell extends ECPowerCell<C723202s2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C7930037w LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public LinearLayout LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USAggregationOrderSingleSkuCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USAggregationOrderSingleSkuCell.class, "aggregationVM", "getAggregationVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/aggregation/OspAggregationOrderModuleViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19yw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 38), 6);
    }

    public USAggregationOrderSingleSkuCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1511);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(73);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1498), awS577S0100000_33, AFwS224S0000000_33.get$arr$(209), new AwS577S0100000_33((C03K6) this, 1488), new AwS577S0100000_33((C03K6) this, 1499), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1502), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1505), null, new AwS577S0100000_33((C03K6) this, 1508));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1484);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1486);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1489);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 55));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1494);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1497);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1503);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1506);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1509), awS577S0100000_33, AFwS224S0000000_33.get$arr$(208), new AwS577S0100000_33((C03K6) this, 1513), new AwS577S0100000_33((C03K6) this, 1515), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1517), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1519), null, new AwS577S0100000_33((C03K6) this, 1521));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1522), awS577S0100000_33, AFwS224S0000000_33.get$arr$(210), new AwS577S0100000_33((C03K6) this, 1524), new AwS577S0100000_33((C03K6) this, 1526), new AwS577S0100000_33((C03K6) this, 1529), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1531));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAggregationOrderModuleViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1533);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(74);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1483), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(207), new AwS577S0100000_33((C03K6) this, 1487), new AwS577S0100000_33((C03K6) this, 1490), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1492), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1495), null, new AwS577S0100000_33((C03K6) this, 1501));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1504);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1507);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1510);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 56));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1512);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1514);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1516);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1518);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1520);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1523), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(211), new AwS577S0100000_33((C03K6) this, 1525), new AwS577S0100000_33((C03K6) this, 1527), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1528), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1530), null, new AwS577S0100000_33((C03K6) this, 1532));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1534), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(206), new AwS577S0100000_33((C03K6) this, 1485), new AwS577S0100000_33((C03K6) this, 1491), new AwS577S0100000_33((C03K6) this, 1493), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1496));
        }
        this.LLJI = assemVMLazy2;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = L5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("shop_orders_new", this.itemView);
        }
        ModuleManager moduleManager2 = L5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "shop_orders_new");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C03AZ c03az = (C03AZ) this.itemView.findViewById(R.id.vh4);
        if (c03az != null) {
            c03az.i0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bf  */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [T, X.02rO] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r35) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b20, viewGroup, false);
    }

    public static void N5(USAggregationOrderSingleSkuCell uSAggregationOrderSingleSkuCell, String str, Map map) {
        HashMap<String, Object> mapHi1 = uSAggregationOrderSingleSkuCell.L5().hi1(false);
        mapHi1.put("module_name", "add_on_reminder");
        mapHi1.put("module_type", "hide_product_card");
        if (map != null) {
            mapHi1.putAll(map);
        }
        C03O0 c03o0 = C03O0.LIZ;
        EnumC805403Cq enumC805403Cq = EnumC805403Cq.ADD_ITEM_INTERCEPT;
        c03o0.getClass();
        C03O0.LJJJJLI(str, mapHi1, null, null, enumC805403Cq);
    }
}
