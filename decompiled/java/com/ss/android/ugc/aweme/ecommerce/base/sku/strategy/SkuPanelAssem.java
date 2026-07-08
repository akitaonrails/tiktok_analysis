package com.ss.android.ugc.aweme.ecommerce.base.sku.strategy;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C036A;
import X.C041D;
import X.C045X;
import X.C04JA;
import X.C0Q4Y;
import X.C1018703yb;
import X.C1019703yl;
import X.C10296040w;
import X.C10457047b;
import X.C1158380gFY;
import X.C13LE;
import X.C13LP;
import X.C1427600nFm;
import X.C1637806bA;
import X.C1700260uLY;
import X.C1723500ux2;
import X.C1741890vQh;
import X.C1748730vbj;
import X.C1752360vha;
import X.C1757850vqR;
import X.C1774750wHh;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419400GcU;
import X.C452501pT;
import X.C631470Opl;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C785860UsC;
import X.C786410Ut5;
import X.C960603pE;
import X.EnumC1752350vhZ;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuBodyCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuFooterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuHeaderCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuLynxPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuOrderSummaryPanelCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuPaymentMethodCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuProductLinkageCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuPurchaseMethodCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductImageCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductNoticeMsgCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductTextCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageSpecPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageWithTextCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSinglePropsCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuArchitectureRevampConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C419400GcU LLIZLLLIL;
    public FrameLayout LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public BottomSheetBehavior<FrameLayout> LLJJIJIIJIL;
    public C1757850vqR LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPanelAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SkuPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 1472), AFwS228S0000000_1.get$arr$(368), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1470));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1464));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1466));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1468));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1473));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1469));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1465));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1467));
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1471));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SkuPanelAssemFragment Go() {
        return (SkuPanelAssemFragment) this.LLJJIJI.getValue();
    }

    public final C1774750wHh Ho() {
        return (C1774750wHh) this.LLJJI.getValue();
    }

    public final CardView Jo() {
        return (CardView) this.LLJJ.getValue();
    }

    public final SkuPanelAssemVM Lo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0673  */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem.onCreate():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        SkuPanelState skuPanelState;
        String strLJIIIIZZ;
        SkuPanelState skuPanelState2;
        Integer num;
        super.onDestroy();
        SkuPanelState skuPanelState3 = Lo().LLIZ;
        if ((skuPanelState3 == null || (num = skuPanelState3.productQuantity) == null || num.intValue() == 0) && (skuPanelState = Lo().LLIZ) != null) {
            skuPanelState.productQuantity = 1;
        }
        C1757850vqR c1757850vqR = this.LLJJIJIL;
        if (c1757850vqR != null) {
            c1757850vqR.LIZIZ();
        }
        this.LLJJIJIL = null;
        C1427600nFm c1427600nFmBQ2 = Lo().BQ2();
        if (c1427600nFmBQ2 != null) {
            try {
                C785860UsC c785860UsC = c1427600nFmBQ2.LJII;
                if (c785860UsC != null) {
                    c785860UsC.cancel();
                }
                ((Timer) c1427600nFmBQ2.LJI.getValue()).cancel();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1700260uLY c1700260uLYMQ2 = Lo().MQ2();
        synchronized (c1700260uLYMQ2) {
            try {
                ((ArrayList) c1700260uLYMQ2.LIZ).clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        ((Handler) c1700260uLYMQ2.LIZIZ.getValue()).removeCallbacksAndMessages(null);
        if (Lo().LLLFFI.LIZLLL() && (skuPanelState2 = Lo().LLIZ) != null) {
            skuPanelState2.recipientInfo = Lo().LLLFFI.LIZ;
        }
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelState skuPanelState4 = Lo().LLIZ;
        skuPanelStarter.getClass();
        SkuPanelStarter.LIZ(skuPanelState4);
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        SkuPanelState skuPanelState5 = Lo().LLIZ;
        if (skuPanelState5 == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(skuPanelState5)) == null) {
            strLJIIIIZZ = "{}";
        }
        iEventCenter.LIZ("ec_sku_panel_close", strLJIIIIZZ);
        C10296040w.LIZ.getClass();
        C10296040w.LIZIZ.clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1427600nFm c1427600nFmBQ2 = Lo().BQ2();
        if (c1427600nFmBQ2 != null) {
            c1427600nFmBQ2.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        String str;
        Map<String, Object> map;
        Object obj;
        String string;
        Map<String, Object> map2;
        Map<String, Object> map3;
        ProductPriceV2 productPriceV2;
        SinglePriceItem singlePriceItem;
        LaneParams laneParamsLIZIZ;
        List<SaleProp> list;
        C785860UsC c785860UsC;
        super.onStop();
        C1427600nFm c1427600nFmBQ2 = Lo().BQ2();
        if (c1427600nFmBQ2 != null && (c785860UsC = c1427600nFmBQ2.LJII) != null) {
            c785860UsC.cancel();
        }
        SkuPanelAssemVM skuPanelAssemVMLo = Lo();
        SkuPanelAssemFragment skuPanelAssemFragmentGo = Go();
        if (skuPanelAssemFragmentGo != null) {
            SkuInfo skuInfo = skuPanelAssemVMLo.LLJ;
            int i = 0;
            int size = (skuInfo == null || (list = skuInfo.salePropList) == null) ? 0 : list.size();
            InterfaceC1748810vbr interfaceC1748810vbrLIZJ = C960603pE.LIZJ(skuPanelAssemFragmentGo);
            HashMap<String, Object> mapLJIIJ = null;
            Object obj2 = (interfaceC1748810vbrLIZJ == null || (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZJ, "lib_track_builtin_lane_business")) == null) ? null : laneParamsLIZIZ.get((Object) "voucher_da_info");
            HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(obj2 instanceof String ? (String) obj2 : null);
            List<ProductPriceV2> list2 = skuPanelAssemVMLo.LLILZIL;
            String str2 = (list2 == null || (productPriceV2 = (ProductPriceV2) C13LP.LJJJLL(list2)) == null || (singlePriceItem = productPriceV2.minPrice) == null) ? null : singlePriceItem.currencyName;
            C10296040w c10296040w = C10296040w.LIZ;
            C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
            Integer numValueOf = Integer.valueOf(skuPanelAssemVMLo.Zf2().LJIIJ());
            c1752360vha.getClass();
            String strLIZ = C1752360vha.LIZ(numValueOf);
            SkuPanelStarter.SkuEnterParams skuEnterParams = skuPanelAssemVMLo.LLJI;
            String str3 = skuEnterParams != null ? skuEnterParams.enterFrom : null;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - skuPanelAssemFragmentGo.LLJ;
            if (C036A.LIZIZ()) {
                str = "close";
            } else {
                SkuPanelState skuPanelState = skuPanelAssemVMLo.LLIZ;
                str = (skuPanelState == null || !skuPanelState.backToPdp) ? "return" : "next";
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = skuPanelAssemVMLo.LLJI;
            Integer numValueOf2 = skuEnterParams2 != null ? Integer.valueOf(skuEnterParams2.clickFrom) : null;
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = skuPanelAssemVMLo.LLJI;
            String strLIZ2 = C041D.LIZ(numValueOf2, skuEnterParams3 != null ? skuEnterParams3.trackParams : null);
            boolean z = skuPanelAssemVMLo.LLJ != null;
            String str4 = (String) (mapLJIIJ2 != null ? mapLJIIJ2.get("coupon_id") : null);
            String str5 = (String) (mapLJIIJ2 != null ? mapLJIIJ2.get("coupon_type_id") : null);
            String str6 = (String) (mapLJIIJ2 != null ? mapLJIIJ2.get("coupon_type_info") : null);
            SkuPanelStarter.SkuEnterParams skuEnterParams4 = skuPanelAssemVMLo.LLJI;
            Object obj3 = (skuEnterParams4 == null || (map3 = skuEnterParams4.trackParams) == null) ? null : map3.get("coupon_zone");
            String str7 = obj3 instanceof String ? (String) obj3 : null;
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = skuPanelAssemVMLo.LLJI;
            Object obj4 = (skuEnterParams5 == null || (map2 = skuEnterParams5.trackParams) == null) ? null : map2.get("benefit_type");
            String str8 = obj4 instanceof String ? (String) obj4 : null;
            SkuItem skuItem = skuPanelAssemVMLo.LLJJL;
            ProductPackStruct productPackStructDh = skuPanelAssemVMLo.Dh();
            if (productPackStructDh != null && productPackStructDh.skuPanelBottomText != null) {
                i = 1;
            }
            int iBw1 = skuPanelAssemVMLo.bw1();
            String strLN = skuPanelAssemVMLo.LN();
            C1019703yl c1019703yl = skuPanelAssemVMLo.LLL;
            c1019703yl.getClass();
            Map<String, Object> mapLJ = c1019703yl.LJ("a2270.b9667");
            Map<String, Object> mapZt = skuPanelAssemVMLo.Zt();
            SkuPanelStarter.SkuEnterParams skuEnterParams6 = skuPanelAssemVMLo.LLJI;
            String str9 = skuEnterParams6 != null ? skuEnterParams6.pdpUniqueId : null;
            C1427600nFm c1427600nFmBQ22 = skuPanelAssemVMLo.BQ2();
            SkuPanelState skuPanelState2 = skuPanelAssemVMLo.LLIZ;
            SkuPanelStarter.SkuEnterParams skuEnterParams7 = skuPanelAssemVMLo.LLJI;
            if (skuEnterParams7 != null && (map = skuEnterParams7.trackParams) != null && (obj = map.get("sku_da_info")) != null && (string = obj.toString()) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(string);
            }
            c10296040w.getClass();
            C1018703yb.LJII("tiktokec_stay_page", new C045X(size, i, iBw1, jElapsedRealtime, c1427600nFmBQ22, skuPanelState2, skuItem, strLIZ, str, str2, str3, strLIZ2, str4, str5, str6, str7, str8, strLN, str9, null, mapLJIIJ, mapLJ, mapZt, z));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(0, Ho());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = EcomSkuArchitectureRevampConfig.LIZ().enableSpecSecRefactor;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            linkedHashMap.put(SkuImageSpecPowerCell.class, 1);
            linkedHashMap.put(SkuImageWithTextCell.class, 1);
            linkedHashMap.put(SkuTextSpecCell.class, 1);
            linkedHashMap.put(SkuSinglePropsCell.class, 1);
        }
        linkedHashMap.put(SkuFooterCell.class, 1);
        linkedHashMap.put(SkuCounterCell.class, 1);
        C1774750wHh c1774750wHhHo = Ho();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LJIIIIZZ = new OptimizeAbility(1, true, linkedHashMap);
        c20603715jn.LJIJ = true;
        c1774750wHhHo.setListConfig(c20603715jn);
        if (Intrinsics.LJFF(EcomSkuArchitectureRevampConfig.LIZ().enableBufferStrategy, bool2)) {
            Ho().setItemAnimator(null);
            Ho().getState().LIZLLL = C0Q4Y.BUFFER;
        }
        Ho().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.045k
            public int LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                CardView cardViewJo;
                if (i == 0) {
                    if (!recyclerView.canScrollVertically(-1)) {
                        this.LL = 0;
                        this.LLILLJJLI.Lo().LJJJZ(new AwS16S0001000_1(this.LL, 13));
                    }
                    CardView cardViewJo2 = this.LLILLJJLI.Jo();
                    if (cardViewJo2 != null) {
                        C786410Ut5.b5(cardViewJo2, 1.0f);
                        return;
                    }
                    return;
                }
                if ((i != 1 && i != 2) || (cardViewJo = this.LLILLJJLI.Jo()) == null) {
                    return;
                }
                C786410Ut5.b5(cardViewJo, 0.5f);
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                int i3;
                this.LL = this.LLILLJJLI.Ho().computeVerticalScrollOffset();
                this.LLILLJJLI.Lo().LJJJZ(new AwS16S0001000_1(this.LL, 13));
                SkuPanelAssemVM skuPanelAssemVMLo = this.LLILLJJLI.Lo();
                if (i2 > 0) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                skuPanelAssemVMLo.setStateImmediate(new AwS16S0001000_1(i3, 14));
            }
        });
        Ho().LJIILJJIL(SkuHeaderCell.class, SkuBodyCell.class, SkuCounterCell.class, SkuProductTextCell.class, SkuProductImageCell.class, SkuProductNoticeMsgCell.class, SkuProductVideoCell.class, SkuProductLinkageCell.class, SkuOrderSummaryPanelCell.class, SkuPaymentMethodCell.class, SkuPurchaseMethodCell.class, SkuFooterCell.class, SkuImageSpecPowerCell.class, SkuImageWithTextCell.class, SkuTextSpecCell.class, SkuSinglePropsCell.class);
        Iterator<T> it2 = C1158380gFY.LIZ.values().iterator();
        while (it2.hasNext()) {
            Ho().LJIJ(new C1723500ux2(((Number) it2.next()).intValue(), SkuLynxPowerCell.class));
        }
        Ho().setNestedScrollingEnabled(false);
        C631470Opl.LIZ(Ho(), null, Float.valueOf(C418440Gaw.LIZIZ(12)), Float.valueOf(C418440Gaw.LIZIZ(12)), null, null, 25);
        C723850SaN.LIZLLL(this, new AwS580S0100000_1(this, 434));
        Ho().getState().LJIILL(Lo().LLLILZ, null);
        Dialog dialog = Go().getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.19dk
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    View viewFindViewById = ((C19GU) dialogInterface).findViewById(R.id.fpl);
                    if (viewFindViewById != null) {
                        SkuPanelAssem skuPanelAssem = this.LL;
                        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                        bottomSheetBehaviorFrom.setState(3);
                        bottomSheetBehaviorFrom.setSkipCollapsed(true);
                        bottomSheetBehaviorFrom.setDraggable(false);
                        bottomSheetBehaviorFrom.setHideable(false);
                        skuPanelAssem.LLJJIJIIJIL = bottomSheetBehaviorFrom;
                        final SkuPanelAssem skuPanelAssem2 = this.LL;
                        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = skuPanelAssem2.LLJJIJIIJIL;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.19dl
                                @Override // X.AbstractC1177930gl5
                                public final void LIZJ(View view2, float f) {
                                }

                                @Override // X.AbstractC1177930gl5
                                public final void LIZLLL(int i, View view2) {
                                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior2;
                                    if (i == 1 && (bottomSheetBehavior2 = skuPanelAssem2.LLJJIJIIJIL) != null) {
                                        bottomSheetBehavior2.setState(3);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        View view2 = (View) this.LLJIJIL.getValue();
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.b21);
        }
        View view3 = (View) this.LLJIJIL.getValue();
        if (view3 != null) {
            view3.setOutlineProvider(new C04JA(2));
        }
        View view4 = (View) this.LLJIJIL.getValue();
        if (view4 != null) {
            view4.setClipToOutline(true);
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuPanelCloseEvent();
            }
        }, null, new AwS615S0100000_1(this, 91), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionWaist();
            }
        }, null, new AwS615S0100000_1(this, 92), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getShowToast();
            }
        }, null, new AwS615S0100000_1(this, 94), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.046G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SkuState) obj).getScrollOffset());
            }
        }, new C2217381BqS() { // from class: X.046H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SkuState) obj).getScrollOrientation());
            }
        }, null, new AwS650S0100000_1(this, 16), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, null, new AwS615S0100000_1(this, 93), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getFocusSpecAction();
            }
        }, null, new AwS615S0100000_1(this, 95), 6);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(Go());
        if (lifecycleScope != null) {
            lifecycleScope.launchWhenResumed(new C10457047b(this, null));
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.042O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, null, new AwS615S0100000_1(this, 96), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.046I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).getShowLoadingView());
            }
        }, new C2217381BqS() { // from class: X.042P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, null, new AwS650S0100000_1(this, 14), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0478
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getContentList();
            }
        }, null, new AwS615S0100000_1(this, 88), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.046m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getAllSkuSelected();
            }
        }, new C2217381BqS() { // from class: X.0443
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantity();
            }
        }, null, new AwS650S0100000_1(this, 15), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.045U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        }, null, new AwS615S0100000_1(this, 89), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.046n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPreOrderInfo();
            }
        }, null, new AwS615S0100000_1(this, 90), 6);
    }
}
