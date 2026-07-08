package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03HK;
import X.C03IJ;
import X.C03IT;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C046U;
import X.C09R3;
import X.C0H1U;
import X.C10515049h;
import X.C1071904Hd;
import X.C123100dR;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C19MB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C719202rO;
import X.C723002s0;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7806033c;
import X.C786410Ut5;
import X.C814420VxA;
import X.C815003Gi;
import X.C819603Ic;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class ShopInfoCell extends ECPowerCell<C719202rO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C815003Gi LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShopInfoCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ShopInfoCell.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ShopInfoCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1110);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(59);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1097), awS577S0100000_33, AFwS224S0000000_33.get$arr$(164), new AwS577S0100000_33((C03K6) this, 1087), new AwS577S0100000_33((C03K6) this, 1098), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1101), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1104), null, new AwS577S0100000_33((C03K6) this, 1107));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1083);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1085);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1088);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 40));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1093);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1096);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1099);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1102);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1105);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1108), awS577S0100000_33, AFwS224S0000000_33.get$arr$(163), new AwS577S0100000_33((C03K6) this, 1112), new AwS577S0100000_33((C03K6) this, 1114), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1116), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1118), null, new AwS577S0100000_33((C03K6) this, 1120));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1121), awS577S0100000_33, AFwS224S0000000_33.get$arr$(165), new AwS577S0100000_33((C03K6) this, 1123), new AwS577S0100000_33((C03K6) this, 1125), new AwS577S0100000_33((C03K6) this, 1128), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1130));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspShopViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1132);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(58);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1082), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(162), new AwS577S0100000_33((C03K6) this, 1086), new AwS577S0100000_33((C03K6) this, 1089), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1091), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1094), null, new AwS577S0100000_33((C03K6) this, 1100));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1103);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1106);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1109);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 41));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1111);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1113);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1115);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1117);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1119);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1122), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(166), new AwS577S0100000_33((C03K6) this, 1124), new AwS577S0100000_33((C03K6) this, 1126), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1127), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1129), null, new AwS577S0100000_33((C03K6) this, 1131));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1081), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(161), new AwS577S0100000_33((C03K6) this, 1084), new AwS577S0100000_33((C03K6) this, 1090), new AwS577S0100000_33((C03K6) this, 1092), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1095));
        }
        this.LLJI = assemVMLazy2;
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void P5() {
        View view = this.itemView;
        if (((RecyclerView) view.findViewById(R.id.nwv)).getAdapter() == null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = N5();
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            this.LLJIJIL = new C815003Gi(orderSubmitAssemViewModelN5, (OspShopViewModel) assemVMLazy.getValue(), getFragment(), getActivity(), getLifecycle());
            ((RecyclerView) view.findViewById(R.id.nwv)).setItemAnimator(null);
            ((RecyclerView) view.findViewById(R.id.nwv)).setLayoutManager(new LinearLayoutManager(view.getContext()));
            ((RecyclerView) view.findViewById(R.id.nwv)).addItemDecoration(new C819603Ic(8));
            ((RecyclerView) view.findViewById(R.id.nwv)).setAdapter(this.LLJIJIL);
            if (C03HK.LIZ()) {
                ((RecyclerView) view.findViewById(R.id.nwv)).setRecycledViewPool(N5().e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("shop_orders_new", this.itemView);
        }
        ModuleManager moduleManager2 = N5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "shop_orders_new");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C815003Gi c815003Gi = this.LLJIJIL;
        if (c815003Gi != null) {
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = c815003Gi.LLJ;
            if (keyBoardVisibilityUtil != null) {
                keyBoardVisibilityUtil.LIZ();
            }
            c815003Gi.LLJ = null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (C03HK.LIZ()) {
            C1071904Hd.LIZ((RecyclerView) this.itemView.findViewById(R.id.nwv));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zBooleanValue;
        int i;
        boolean z;
        int i2;
        C03IT thumbFirstImageUrlModel;
        Image imageLIZ;
        float f;
        Integer num;
        Integer num2;
        Integer num3;
        C723002s0 c723002s0;
        C723002s0 c723002s02;
        C723002s0 c723002s03;
        int i3;
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        Integer num4;
        MainOrderSetting mainOrderSetting;
        Integer num5;
        Integer num6;
        int i4;
        Integer num7;
        C03IT thumbFirstImageUrlModel2;
        C719202rO c719202rO = (C719202rO) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        boolean z2 = true;
        int i5 = 0;
        if (N5().LLZILL) {
            View view = this.itemView;
            if (Intrinsics.LJFF(c719202rO.LLJJJJJIL, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, view);
                P5();
                C815003Gi c815003Gi = this.LLJIJIL;
                if (c815003Gi != null) {
                    c815003Gi.LLLI(c719202rO.LLJIJIL);
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.itemView;
        if (!this.LL) {
            this.LL = true;
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            OspShopViewModel ospShopViewModel = (OspShopViewModel) assemVMLazy.getValue();
            int i6 = ospShopViewModel.LL;
            ospShopViewModel.LL = i6 + 1;
            c719202rO.LLJJL = i6;
        }
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.19yj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJ;
            }
        }, null, new AwS437S0200000_1(this, c719202rO, 24), 6);
        Boolean bool = c719202rO.LLJJJJ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.o_0);
        if (!zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        C03J8.LIZ(view2, true);
        P5();
        if (c719202rO.LLJJIII) {
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.j89));
        } else {
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.j89));
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.fjn);
            MainOrderSetting mainOrderSetting2 = c719202rO.LLJJJJLIIL;
            if (mainOrderSetting2 != null && (num2 = mainOrderSetting2.shopInfoDisplayStyle) != null && num2.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0H1U.LIZIZ(view2.findViewById(R.id.v6_));
                if (constraintLayout != null) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    c19mb.LJI(R.id.pim, 6);
                    c19mb.LJI(R.id.pim, 7);
                    c19mb.LJIIIIZZ(R.id.pim, 6, constraintLayout.getId(), 6);
                    c19mb.LJI(R.id.v78, 6);
                    c19mb.LJI(R.id.v78, 7);
                    c19mb.LJIIIIZZ(R.id.v78, 6, R.id.pim, 7);
                    c19mb.LJIIIIZZ(R.id.v78, 7, R.id.fjq, 6);
                    c19mb.LIZIZ(constraintLayout);
                }
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                Integer numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                i2 = R.id.pim;
                C426750GoL.LJIIIZ(constraintLayout, numValueOf, numValueOf2, numValueOf3, numValueOf4, false, 16);
                C786410Ut5.m6(constraintLayout, layoutParams);
                SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.pim);
                ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
                C426750GoL.LJIIIZ(smartImageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                C786410Ut5.G6(smartImageView, layoutParams2);
                TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.v78);
                ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                C786410Ut5.R6(tuxTextView, layoutParams3);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.fjq);
                ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
                C786410Ut5.d6(linearLayout, layoutParams4);
            } else {
                i2 = R.id.pim;
                Image image = c719202rO.LLIZ;
                if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                    c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view2.findViewById(R.id.v6_));
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                    ((ImageView) view2.findViewById(R.id.v6_)).setColorFilter(134217728);
                }
            }
            ((TextView) view2.findViewById(R.id.v78)).setText(c719202rO.LLIZLLLIL);
            StoreOfficialLabel storeOfficialLabel = c719202rO.LLJJI;
            if (storeOfficialLabel != null && (imageLIZ = storeOfficialLabel.LIZ(view2.getContext())) != null) {
                C786410Ut5.LJLLLLLL(0, view2.findViewById(i2));
                Integer num8 = c719202rO.LLJJI.labelType;
                int value = C046U.BLUE_V.getValue();
                if (num8 != null && num8.intValue() == value) {
                    f = 12.0f;
                } else {
                    f = 15.0f;
                }
                Integer width = imageLIZ.getWidth(f);
                if (width != null) {
                    C1744700vVE.LJII(view2.findViewById(i2), width.intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))));
                }
                MainOrderSetting mainOrderSetting3 = c719202rO.LLJJJJLIIL;
                if (mainOrderSetting3 == null || (num = mainOrderSetting3.shopInfoDisplayStyle) == null || num.intValue() != 1) {
                    C0H1U.LIZ((TextView) view2.findViewById(R.id.v78), view2.findViewById(i2));
                }
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C03IT imageUrlModel = imageLIZ.toImageUrlModel();
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                c1331670kl3LIZLLL2.LJJ((InterfaceC1334290kpH) view2.findViewById(i2));
                C786410Ut5.h3(c1331670kl3LIZLLL2);
            } else {
                C786410Ut5.LJLLLLLL(8, view2.findViewById(i2));
            }
        }
        C815003Gi c815003Gi2 = this.LLJIJIL;
        if (c815003Gi2 != null) {
            c815003Gi2.LLLI(c719202rO.LLJIJIL);
        }
        ShopPromotionActivity shopPromotionActivity = c719202rO.LLJILLL;
        if (shopPromotionActivity != null) {
            ((TextView) view2.findViewById(R.id.sa2)).setText(shopPromotionActivity.desc);
            C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
            Image image2 = shopPromotionActivity.leftIcon;
            if (image2 != null) {
                thumbFirstImageUrlModel2 = image2.toThumbFirstImageUrlModel();
            } else {
                thumbFirstImageUrlModel2 = null;
            }
            c1326790kdB2.getClass();
            C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel2);
            c1331670kl3LIZLLL3.LJJ((InterfaceC1334290kpH) view2.findViewById(R.id.sa0));
            C786410Ut5.h3(c1331670kl3LIZLLL3);
        }
        View viewFindViewById2 = view2.findViewById(R.id.sa1);
        if (viewFindViewById2 != null) {
            ShopPromotionActivity shopPromotionActivity2 = c719202rO.LLJILLL;
            if (shopPromotionActivity2 != null && (num7 = shopPromotionActivity2.positionType) != null && num7.intValue() == 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, viewFindViewById2);
        }
        View viewFindViewById3 = view2.findViewById(R.id.sa1);
        if (viewFindViewById3 != null) {
            C1748720vbi.LJFF(viewFindViewById3, new C10515049h(), new AwS545S0100000_1(c719202rO, 1641), new AwS580S0100000_1(c719202rO, 752));
        }
        if (c719202rO.LLJIJIL.size() == 1) {
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.cgl));
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.cgm));
            View viewFindViewById4 = view2.findViewById(R.id.fjm);
            C723002s0 c723002s04 = (C723002s0) C13LP.LJJJLL(c719202rO.LLJIJIL);
            if ((c723002s04 != null && (num6 = c723002s04.LLJIJIL) != null && num6.intValue() == 1) || ((((c723002s0 = (C723002s0) C13LP.LJJJLL(c719202rO.LLJIJIL)) == null || c723002s0.LLILZIL == null) && ((c723002s02 = (C723002s0) C13LP.LJJJLL(c719202rO.LLJIJIL)) == null || c723002s02.LLJJIJIIJIL == null)) || ((c723002s03 = (C723002s0) C13LP.LJJJLL(c719202rO.LLJIJIL)) != null && (logisticPanelModule = c723002s03.LLJJIJIIJIL) != null && (logisticArea = logisticPanelModule.logisticArea) != null && (num4 = logisticArea.style) != null && num4.intValue() == 1 && ((mainOrderSetting = c719202rO.LLJJJJLIIL) == null || (num5 = mainOrderSetting.addNotePosition) == null || num5.intValue() != 1)))) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById4);
        } else if (c719202rO.LLJIJIL.size() > 1 && C123100dR.LIZ(c719202rO.LLJILJILJ)) {
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.cgl));
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.cgm));
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.fjm));
            AssemVMLazy assemVMLazy2 = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILJIL;
            assemVMLazy2.getValue();
            OspShopViewModel.vQ2(view2.findViewById(R.id.cgl), N5(), c719202rO, Integer.valueOf(c719202rO.LLJJL));
        }
        C736680Sv4.LJIJJ(N5(), new AwS367S0200000_1(this, c719202rO, 270));
        MainOrderSetting mainOrderSetting4 = c719202rO.LLJJJJLIIL;
        if (mainOrderSetting4 == null || (num3 = mainOrderSetting4.addNotePosition) == null || num3.intValue() != 1) {
            z2 = false;
        }
        if (z2) {
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.fjq));
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.o9j));
            ((TextView) view2.findViewById(R.id.fjo)).setText(L5(this, c719202rO, N5().LLL.get(c719202rO.LLILZLL), null, 4));
            C786410Ut5.I7(new AjS40S0200000_1(this, c719202rO, 67), view2.findViewById(R.id.fjq));
        } else {
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.fjq));
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.o9j);
            if (C7806033c.LJIJJLI()) {
                i5 = 8;
            }
            C786410Ut5.LL(i5, constraintLayout2);
            TextView textView = (TextView) view2.findViewById(R.id.o9o);
            String str = N5().LLL.get(c719202rO.LLILZLL);
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            C786410Ut5.I7(new AjS40S0200000_1(this, c719202rO, 68), view2.findViewById(R.id.o9j));
        }
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager == null) {
            return;
        }
        moduleManager.LJIIJ(System.currentTimeMillis() - this.LLIZLLLIL, "shop_orders_new");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b47, viewGroup, false);
    }

    public static String L5(ShopInfoCell shopInfoCell, C719202rO c719202rO, String str, String str2, int i) {
        BillStarlingText billStarlingText;
        BillStarlingText billStarlingText2;
        Integer num;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        shopInfoCell.getClass();
        if (str == null) {
            str = str2;
        }
        if (C123100dR.LIZ(str)) {
            MainOrderSetting mainOrderSetting = c719202rO.LLJJJJLIIL;
            if (mainOrderSetting != null && (num = mainOrderSetting.skuCardStyle) != null && num.intValue() == 2) {
                return str;
            }
            ShopOrderStarling shopOrderStarling = c719202rO.LLJJJIL;
            if (shopOrderStarling != null && (billStarlingText2 = shopOrderStarling.orderNotesEdit) != null) {
                return billStarlingText2.text;
            }
        } else {
            ShopOrderStarling shopOrderStarling2 = c719202rO.LLJJJIL;
            if (shopOrderStarling2 != null && (billStarlingText = shopOrderStarling2.orderNotesText) != null) {
                return billStarlingText.text;
            }
        }
        return null;
    }
}
