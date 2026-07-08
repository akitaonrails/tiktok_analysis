package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C039J;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C09R3;
import X.C123100dR;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C719402rQ;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.OspAggregationOrderModuleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MXAggregationOrderCell extends ECPowerCell<C719402rQ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final List<String> LLJILJIL;
    public final List<C719102rN> LLJILJILJ;
    public ShopOrderStarling LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public C719402rQ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MXAggregationOrderCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MXAggregationOrderCell.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MXAggregationOrderCell.class, "aggregationVM", "getAggregationVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/aggregation/OspAggregationOrderModuleViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MXAggregationOrderCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1054);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(55);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1038), awS577S0100000_33, AFwS224S0000000_33.get$arr$(158), new AwS577S0100000_33((C03K6) this, 1024), new AwS577S0100000_33((C03K6) this, 1062), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1013), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1049), null, new AwS577S0100000_33((C03K6) this, 1067));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1020);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1022);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1026);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 37));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1033);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1037);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1041);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1044);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1047);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1050), awS577S0100000_33, AFwS224S0000000_33.get$arr$(157), new AwS577S0100000_33((C03K6) this, 1060), new AwS577S0100000_33((C03K6) this, 1064), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1068), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1072), null, new AwS577S0100000_33((C03K6) this, 1075));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1077), awS577S0100000_33, AFwS224S0000000_33.get$arr$(159), new AwS577S0100000_33((C03K6) this, 1080), new AwS577S0100000_33((C03K6) this, 996), new AwS577S0100000_33((C03K6) this, 1003), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1007));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspShopViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1011);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(56);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1018), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(153), new AwS577S0100000_33((C03K6) this, 1023), new AwS577S0100000_33((C03K6) this, 1027), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1030), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1034), null, new AwS577S0100000_33((C03K6) this, 1042));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1045);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1048);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1051);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 38));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1057);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1061);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1065);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1069);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1073);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1078), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(160), new AwS577S0100000_33((C03K6) this, 997), new AwS577S0100000_33((C03K6) this, LSPassThroughRecordSizeConfig.DEFAULT), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1004), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1008), null, new AwS577S0100000_33((C03K6) this, 1012));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1015), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(152), new AwS577S0100000_33((C03K6) this, 1021), new AwS577S0100000_33((C03K6) this, 1028), new AwS577S0100000_33((C03K6) this, 1031), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1035));
        }
        this.LLJI = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(OspAggregationOrderModuleViewModel.class);
        AwS577S0100000_33 awS577S0100000_3319 = new AwS577S0100000_33(c19719912DlLIZ3, 1039);
        AFwS279S0000000_33 aFwS279S0000000_333 = AFwS279S0000000_33.get$arr$(57);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1046), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(156), new AwS577S0100000_33((C03K6) this, 1052), new AwS577S0100000_33((C03K6) this, 1055), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1058), aFwS279S0000000_333, new AwS577S0100000_33((C03K6) this, 1066), null, new AwS577S0100000_33((C03K6) this, 1070));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3320 = new AwS577S0100000_33((C03K6) this, 1074);
            AwS577S0100000_33 awS577S0100000_3321 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1076);
            AwS577S0100000_33 awS577S0100000_3322 = new AwS577S0100000_33(c19719912DlLIZ3, 1079);
            C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3320, 39));
            AwS577S0100000_33 awS577S0100000_3323 = new AwS577S0100000_33(c01gwLIZIZ3, 998);
            AwS577S0100000_33 awS577S0100000_3324 = new AwS577S0100000_33(c01gwLIZIZ3, 1001);
            AwS577S0100000_33 awS577S0100000_3325 = new AwS577S0100000_33(c01gwLIZIZ3, 1005);
            AwS577S0100000_33 awS577S0100000_3326 = new AwS577S0100000_33(c01gwLIZIZ3, 1009);
            AwS577S0100000_33 awS577S0100000_3327 = new AwS577S0100000_33(c01gwLIZIZ3, 1016);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C737910Sx3.LIZ;
            assemVMLazy3 = new AssemVMLazy(awS577S0100000_3322, awS577S0100000_3319, new C452080Ho6(), awS577S0100000_3323, awS577S0100000_3324, awS577S0100000_3321, aFwS279S0000000_333, awS577S0100000_3325, awS577S0100000_3326, awS577S0100000_3327);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1019), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(154), new AwS577S0100000_33((C03K6) this, 1025), new AwS577S0100000_33((C03K6) this, 1029), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1032), aFwS279S0000000_333, new AwS577S0100000_33((C03K6) this, 1036), null, new AwS577S0100000_33((C03K6) this, 1040));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Don't support this VMScope: ");
                sbLIZ3.append(obj);
                sbLIZ3.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1043), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(155), new AwS577S0100000_33((C03K6) this, 1053), new AwS577S0100000_33((C03K6) this, 1056), new AwS577S0100000_33((C03K6) this, 1059), aFwS279S0000000_333, null, null, new AwS577S0100000_33((C03K6) this, 1063));
        }
        this.LLJIJIL = assemVMLazy3;
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new ArrayList();
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1010));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1014));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 999));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1071));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1002));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1017));
        this.LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1006));
    }

    public final RecyclerView L5() {
        return (RecyclerView) this.LLJJIII.getValue();
    }

    public final C039J N5() {
        return (C039J) this.LLJJIJIIJIL.getValue();
    }

    public final OrderSubmitAssemViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final boolean S5() {
        Integer num;
        List<C719202rO> list;
        C719202rO c719202rO;
        C719402rQ c719402rQ = this.LLJJJIL;
        MainOrderSetting mainOrderSetting = (c719402rQ == null || (list = c719402rQ.LLIZ) == null || (c719202rO = (C719202rO) C13LP.LJJJLL(list)) == null) ? null : c719202rO.LLJJJJLIIL;
        return (mainOrderSetting == null || (num = mainOrderSetting.skuCardStyle) == null || num.intValue() != 2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0436  */
    /* JADX WARN: Type inference failed for: r2v169 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90, types: [int] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r22) {
        /*
            Method dump skipped, instruction units count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.MXAggregationOrderCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.aoo, viewGroup, false);
    }

    public static String P5(MXAggregationOrderCell mXAggregationOrderCell, C719202rO c719202rO, String str, String str2, int i) {
        ShopOrderStarling shopOrderStarling;
        BillStarlingText billStarlingText;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        mXAggregationOrderCell.getClass();
        if (str == null) {
            str = str2;
        }
        if (C123100dR.LIZ(str)) {
            return str;
        }
        if (c719202rO == null || (shopOrderStarling = c719202rO.LLJJJIL) == null || (billStarlingText = shopOrderStarling.orderNotesText) == null) {
            return null;
        }
        return billStarlingText.text;
    }
}
