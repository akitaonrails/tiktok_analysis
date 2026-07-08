package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03HJ;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C09R3;
import X.C10516049i;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C719302rP;
import X.C737910Sx3;
import X.C7930037w;
import X.EnumC805403Cq;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationProductInfoAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USAggregationOrderCell extends ECPowerCell<C719302rP> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C7930037w LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public C719302rP LLJILLL;
    public int LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USAggregationOrderCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USAggregationOrderCell.class, "aggregationVM", "getAggregationVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/aggregation/OspAggregationOrderModuleViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public USAggregationOrderCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1321);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(67);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1308), awS577S0100000_33, AFwS224S0000000_33.get$arr$(188), new AwS577S0100000_33((C03K6) this, 1298), new AwS577S0100000_33((C03K6) this, 1309), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1312), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1315), null, new AwS577S0100000_33((C03K6) this, 1318));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1294);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1296);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1299);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 48));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1304);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1307);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1310);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1313);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1316);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1319), awS577S0100000_33, AFwS224S0000000_33.get$arr$(187), new AwS577S0100000_33((C03K6) this, 1323), new AwS577S0100000_33((C03K6) this, 1325), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1327), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1329), null, new AwS577S0100000_33((C03K6) this, 1331));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1332), awS577S0100000_33, AFwS224S0000000_33.get$arr$(189), new AwS577S0100000_33((C03K6) this, 1334), new AwS577S0100000_33((C03K6) this, 1336), new AwS577S0100000_33((C03K6) this, 1339), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1341));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAggregationOrderModuleViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1343);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(66);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1293), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(186), new AwS577S0100000_33((C03K6) this, 1297), new AwS577S0100000_33((C03K6) this, 1300), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1302), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1305), null, new AwS577S0100000_33((C03K6) this, 1311));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1314);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1317);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1320);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 49));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1322);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1324);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1326);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1328);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1330);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1333), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(190), new AwS577S0100000_33((C03K6) this, 1335), new AwS577S0100000_33((C03K6) this, 1337), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1338), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1340), null, new AwS577S0100000_33((C03K6) this, 1342));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1292), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(185), new AwS577S0100000_33((C03K6) this, 1295), new AwS577S0100000_33((C03K6) this, 1301), new AwS577S0100000_33((C03K6) this, 1303), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1306));
        }
        this.LLJI = assemVMLazy2;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_virtual_info_open_subpage", this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_virtual_info_open_subpage", this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bd  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r29) {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b1w, viewGroup, false);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C719302rP c719302rP;
        if (Intrinsics.LJFF(str, "ec_virtual_info_open_subpage") && (c719302rP = this.LLJILLL) != null) {
            Iterator<C719202rO> it2 = c719302rP.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                List<C719102rN> list = it2.next().LLJL;
                if (list != null) {
                    for (C719102rN c719102rN : (ArrayList) list) {
                        if (c719102rN.LLILZLL != null && L5().h.LIZ.containsKey(c719102rN.LLILZLL)) {
                            P5(this.itemView, c719302rP, "x_items");
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void N5(USAggregationOrderCell uSAggregationOrderCell, String str, Map map) {
        HashMap<String, Object> mapHi1 = uSAggregationOrderCell.L5().hi1(false);
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

    public final void P5(View view, C719302rP c719302rP, String str) {
        String string;
        Object obj;
        String string2;
        Object obj2;
        C1748720vbi.LIZLLL(view, new C10516049i(), new AwS86S1200000_1(str, c719302rP, this, 1));
        Fragment fragment = getFragment();
        if (fragment != null) {
            C03HJ c03hj = USAggregationProductInfoAssemFragment.LLJILJILJ;
            Pair[] pairArr = new Pair[2];
            HashMap<String, Object> map = L5().LLLIL;
            String str2 = "";
            if (map == null || (obj2 = map.get("previous_page")) == null || (string = obj2.toString()) == null) {
                string = "";
            }
            pairArr[0] = new Pair("previous_page", string);
            HashMap<String, Object> map2 = L5().LLLIL;
            if (map2 != null && (obj = map2.get("entrance_info")) != null && (string2 = obj.toString()) != null) {
                str2 = string2;
            }
            pairArr[1] = new Pair("entrance_info", str2);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c03hj.getClass();
            C03HJ.LIZ(fragment, c719302rP, mapLJIIIIZZ, true, null, false);
        }
    }
}
