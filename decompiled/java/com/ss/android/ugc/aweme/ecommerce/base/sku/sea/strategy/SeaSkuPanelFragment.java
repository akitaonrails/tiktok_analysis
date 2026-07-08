package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.AnonymousClass0431;
import X.C004I;
import X.C013C;
import X.C01GW;
import X.C034S;
import X.C036A;
import X.C03DZ;
import X.C041D;
import X.C044V;
import X.C045K;
import X.C046E;
import X.C04JA;
import X.C098200Yq;
import X.C0WZX;
import X.C1018703yb;
import X.C1025303zf;
import X.C10379044b;
import X.C10456047a;
import X.C1120604Zw;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1388190mED;
import X.C1389600mGU;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1756370vo3;
import X.C1765020w20;
import X.C1878350yyn;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C20161913uj;
import X.C2132808Xe;
import X.C214820195e;
import X.C21578619ce;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C948503nH;
import X.C958103op;
import X.C960603pE;
import X.C991303uB;
import X.DialogC1743780vTk;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1748810vbr;
import X.InterfaceC1760590vur;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelFragment extends CommerceBottomSheetDialogFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, ViewTreeObserver.OnScrollChangedListener {
    public static final float LLJLLIL = C418440Gaw.LIZIZ(26);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZzw4PWs/LC59OzE+KDs2LzxiGioyGy45GS49LSkKOy40JSAiPQ==";
    public final AnonymousClass0412 LLJI;
    public ConstraintLayout LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public C21578619ce LLJILLL;
    public FrameLayout LLJJ;
    public FrameLayout LLJJI;
    public TuxTextView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public final lifecycleAwareLazy LLJJIJIL;
    public BottomSheetBehavior<FrameLayout> LLJJJ;
    public KeyBoardVisibilityUtil LLJJJIL;
    public SkuPanelBaseWidget LLJJJJ;
    public C1756370vo3 LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final BPEAHandler LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;

    public SeaSkuPanelFragment() {
        super(0);
        this.LLJI = new AnonymousClass0412();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuPanelViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1424);
        this.LLJJIJIL = new lifecycleAwareLazy(this, awS545S0100000_1, new AwS145S0400000_16(this, awS545S0100000_1, c19719912DlLIZ, AFwS284S0000000_1.get$arr$(17), 5));
        this.LLJJLIIIJLLLLLLLZ = new BPEAHandler(Looper.getMainLooper());
        this.LLJLIL = true;
        this.LLJLL = C452501pT.LIZIZ(new C046E(this));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean MR() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final int UR() {
        return R.drawable.b98;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final SeaSkuPanelViewModel dS() {
        return (SeaSkuPanelViewModel) this.LLJJIJIL.getValue();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C21578619ce c21578619ce = this.LLJILLL;
        if (c21578619ce != null) {
            int scrollY = c21578619ce.getScrollY();
            View view = this.LLJILJILJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(scrollY > 0 ? 0 : 8, view);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String strLJJLIIIJ;
        String str;
        Map<String, Object> map;
        Object obj;
        String string;
        Map<String, Object> map2;
        Map<String, Object> map3;
        List<SkuItem> list;
        LaneParams laneParamsLIZIZ;
        List<SaleProp> list2;
        super.onStop();
        SeaSkuPanelViewModel seaSkuPanelViewModelDS = dS();
        SkuInfo skuInfo = seaSkuPanelViewModelDS.LLJIJIL;
        int size = (skuInfo == null || (list2 = skuInfo.salePropList) == null) ? 0 : list2.size();
        InterfaceC1748810vbr interfaceC1748810vbrLIZJ = C960603pE.LIZJ(this);
        String strLJJLIIIJ2 = null;
        Object obj2 = (interfaceC1748810vbrLIZJ == null || (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZJ, "lib_track_builtin_lane_business")) == null) ? null : laneParamsLIZIZ.get((Object) "voucher_da_info");
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(obj2 instanceof String ? (String) obj2 : null);
        ProductPackStruct productPackStruct = seaSkuPanelViewModelDS.LLJILJILJ;
        if (productPackStruct == null || (list = productPackStruct.skus) == null) {
            strLJJLIIIJ = null;
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<SkuItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().skuId);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        C044V c044v = C044V.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelViewModelDS.LLJILJIL;
        String str2 = skuEnterParams != null ? skuEnterParams.enterFrom : null;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJ;
        if (C036A.LIZIZ()) {
            str = "close";
        } else {
            SkuPanelState skuPanelState = seaSkuPanelViewModelDS.LLJI;
            str = (skuPanelState == null || !skuPanelState.backToPdp) ? "return" : "next";
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = seaSkuPanelViewModelDS.LLJILJIL;
        Integer numValueOf = skuEnterParams2 != null ? Integer.valueOf(skuEnterParams2.clickFrom) : null;
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = seaSkuPanelViewModelDS.LLJILJIL;
        String strLIZ = C041D.LIZ(numValueOf, skuEnterParams3 != null ? skuEnterParams3.trackParams : null);
        boolean z = seaSkuPanelViewModelDS.LLJIJIL != null;
        String str3 = (String) (mapLJIIJ != null ? mapLJIIJ.get("coupon_id") : null);
        String str4 = (String) (mapLJIIJ != null ? mapLJIIJ.get("coupon_type_id") : null);
        String str5 = (String) (mapLJIIJ != null ? mapLJIIJ.get("coupon_type_info") : null);
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = seaSkuPanelViewModelDS.LLJILJIL;
        Object obj3 = (skuEnterParams4 == null || (map3 = skuEnterParams4.trackParams) == null) ? null : map3.get("coupon_zone");
        String str6 = obj3 instanceof String ? (String) obj3 : null;
        SkuPanelStarter.SkuEnterParams skuEnterParams5 = seaSkuPanelViewModelDS.LLJILJIL;
        Object obj4 = (skuEnterParams5 == null || (map2 = skuEnterParams5.trackParams) == null) ? null : map2.get("benefit_type");
        String str7 = obj4 instanceof String ? (String) obj4 : null;
        SkuItem skuItem = seaSkuPanelViewModelDS.LLJJJJ;
        C1025303zf c1025303zf = seaSkuPanelViewModelDS.LLJLLL;
        c1025303zf.getClass();
        Map<String, Object> mapLJ = c1025303zf.LJ("a2270.b9667");
        Map<String, Object> mapZt = seaSkuPanelViewModelDS.Zt();
        SkuPanelStarter.SkuEnterParams skuEnterParams6 = seaSkuPanelViewModelDS.LLJILJIL;
        String str8 = skuEnterParams6 != null ? skuEnterParams6.pdpUniqueId : null;
        SkuPanelState skuPanelState2 = seaSkuPanelViewModelDS.LLJI;
        HashMap<String, Object> mapLJIIJ2 = (skuEnterParams6 == null || (map = skuEnterParams6.trackParams) == null || (obj = map.get("sku_da_info")) == null || (string = obj.toString()) == null) ? null : C1741890vQh.LJIIJ(string);
        C10379044b c10379044bEr0 = seaSkuPanelViewModelDS.er0();
        Map<String, Object> mapLIZ = c10379044bEr0 != null ? c10379044bEr0.LIZ() : null;
        int i = seaSkuPanelViewModelDS.LLLFZ;
        int i2 = seaSkuPanelViewModelDS.LLLFFI;
        ProductPackStruct productPackStruct2 = seaSkuPanelViewModelDS.LLJILJILJ;
        String[] strArr = seaSkuPanelViewModelDS.LLJZ;
        Map<String, Integer> map4 = seaSkuPanelViewModelDS.LLJZIJLIL;
        Map<String, String> map5 = seaSkuPanelViewModelDS.LLL;
        if (map5 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((LinkedHashMap) map5).entrySet().iterator();
            while (it3.hasNext()) {
                Object value = ((Map.Entry) it3.next()).getValue();
                if (value != null) {
                    arrayList2.add(value);
                }
            }
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        }
        c044v.getClass();
        C1018703yb.LJII("tiktokec_stay_page", new C045K(size, i, i2, jElapsedRealtime, productPackStruct2, skuPanelState2, skuItem, "sku", str, str2, strLIZ, str3, str4, str5, str6, str7, str8, strLJJLIIIJ2, strLJJLIIIJ, mapLIZ, mapLJIIJ2, mapLJ, mapZt, map4, z, strArr));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        return Integer.valueOf(cS() + this.LLJJL);
    }

    public final int cS() throws Throwable {
        IECommerceHostService iECommerceHostService;
        int iLIZIZ;
        Double d;
        Map<String, Object> map;
        Object obj = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        Activity activityLIZ = C1388190mED.LIZ(applicationContext);
        Display displayLLILZIL = C2204961BRm.LLILZIL(activityLIZ != null ? activityLIZ.getWindowManager() : (WindowManager) C786410Ut5.H2(applicationContext, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnuxeu5Rue0rgOE52KcXyA11og==", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(displayLLILZIL, displayMetrics);
            iLIZIZ = displayMetrics.heightPixels;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = C2132808Xe.LIZIZ(applicationContext);
        }
        int iLIZ = iLIZIZ - C2132808Xe.LIZ(applicationContext);
        try {
            SkuPanelStarter.SkuEnterParams skuEnterParams = dS().LLJILJIL;
            if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
                obj = map.get("page_height");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        float fDoubleValue = (!(obj instanceof Double) || (d = (Double) obj) == null) ? 0.73f : (float) d.doubleValue();
        return (int) (fDoubleValue * iLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        dS().getClass();
        return "sku";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IECommerceHostService iECommerceHostService;
        super.onDestroy();
        if (this.LLJJJJJIL != null) {
            C1756370vo3.LIZIZ();
        }
        C991303uB.LIZIZ = null;
        C991303uB.LIZJ = 0L;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SkuPanelState skuPanelState;
        String strLJIIIIZZ;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        C19EG activity;
        Integer num;
        super.onDestroyView();
        AnonymousClass0431 anonymousClass0431 = dS().LLJLL;
        if (anonymousClass0431 != null) {
            anonymousClass0431.LIZJ();
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJJJIL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLJJJIL = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJIIJIL = null;
        SkuPanelState skuPanelState2 = dS().LLJI;
        if ((skuPanelState2 == null || (num = skuPanelState2.productQuantity) == null || num.intValue() == 0) && (skuPanelState = dS().LLJI) != null) {
            skuPanelState.productQuantity = 1;
        }
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelState skuPanelState3 = dS().LLJI;
        skuPanelStarter.getClass();
        SkuPanelStarter.LIZ(skuPanelState3);
        if (getContext() != null && Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLJLL.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null && (activity = getActivity()) != null) {
                activity.unregisterScreenCaptureCallback(screenCaptureCallback);
            }
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            SkuPanelState skuPanelState4 = dS().LLJI;
            if (skuPanelState4 == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(skuPanelState4)) == null) {
                strLJIIIIZZ = "{}";
            }
            iEventCenter.LIZ("ec_sku_panel_close", strLJIIIIZZ);
        }
        C044V.LIZ.getClass();
        C044V.LIZIZ.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJLIL) {
            this.LLJLIL = false;
            C948503nH.LJIIIIZZ(this, new C10456047a(this, null));
            if (this.LLJJJJJIL != null) {
                float fLIZIZ = this.LLJJJJLIIL;
                if (fLIZIZ <= 0.0f) {
                    fLIZIZ = C958103op.LIZIZ();
                }
                C1756370vo3.LIZ(fLIZIZ, 0);
            }
        }
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        int size;
        SkuInfo skuInfo;
        List<SkuItem> list;
        ViewGroup viewGroup;
        List<SkuItem> list2;
        getPageName();
        HashMap map2 = (HashMap) map;
        map2.put("page_name", "sku");
        SeaSkuPanelViewModel seaSkuPanelViewModelDS = dS();
        seaSkuPanelViewModelDS.getClass();
        C013C c013c = new C013C();
        SkuInfo skuInfo2 = seaSkuPanelViewModelDS.LLJIJIL;
        if (skuInfo2 != null && (list2 = skuInfo2.skuList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        map2.put("content_list_size", String.valueOf(size));
        seaSkuPanelViewModelDS.ml(new AwS367S0200000_1(c013c, (C013C) map, (Map<String, String>) 130));
        if (seaSkuPanelViewModelDS.LLJILJILJ != null && (skuInfo = seaSkuPanelViewModelDS.LLJIJIL) != null && (list = skuInfo.skuList) != null && !list.isEmpty()) {
            if (!c013c.element) {
                View view = getView();
                if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.ej8)) != null && viewGroup.getChildCount() > 0 && viewGroup.getHeight() > 0) {
                    return false;
                }
                map2.put("blank_type", "empty_view");
                return true;
            }
        } else {
            map2.put("blank_type", "no_meta_data");
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS228S0000000_1.get$arr$(353));
        SeaSkuPanelViewModel seaSkuPanelViewModelDS = dS();
        seaSkuPanelViewModelDS.getClass();
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(seaSkuPanelViewModelDS, 281));
    }

    public final void gS(C214820195e c214820195e) {
        SkuPanelBaseWidget seaSkuPanelHeaderWidget;
        if (dS().Hc0()) {
            seaSkuPanelHeaderWidget = new SeaSkuPanelSkcHeaderWidget();
        } else {
            seaSkuPanelHeaderWidget = new SeaSkuPanelHeaderWidget();
        }
        this.LLJJJJ = seaSkuPanelHeaderWidget;
        if (dS().Hc0()) {
            C03DZ.LIZ(this.LLJILJILJ);
            C991303uB.LIZIZ(c214820195e, R.id.jiu, seaSkuPanelHeaderWidget);
        } else {
            C03DZ.LIZJ(this.LLJILJILJ);
            C991303uB.LIZIZ(c214820195e, R.id.jit, seaSkuPanelHeaderWidget);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View viewFindViewById;
        ViewParent parent;
        C19EG c19eg;
        super.onActivityCreated(bundle);
        Context context = getContext();
        Object parent2 = null;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            this.LLJJJIL = new KeyBoardVisibilityUtil(c19eg, C20161913uj.LIZIZ(c19eg), AFwS284S0000000_1.get$arr$(16));
        }
        View view2 = getView();
        if (view2 != null && (parent = view2.getParent()) != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof View) && (view = (View) parent2) != null && (viewFindViewById = view.findViewById(R.id.yg_)) != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 32), viewFindViewById);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.11GK
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C19GU c19gu;
                    View viewFindViewById2;
                    if ((dialogInterface instanceof DialogC1389100mFg) && (c19gu = (C19GU) dialogInterface) != null && (viewFindViewById2 = c19gu.findViewById(R.id.fpl)) != null) {
                        this.LL.getClass();
                        viewFindViewById2.setElevation(0.0f);
                        SeaSkuPanelFragment seaSkuPanelFragment = this.LL;
                        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById2);
                        bottomSheetBehaviorFrom.setSkipCollapsed(true);
                        seaSkuPanelFragment.LLJJJ = bottomSheetBehaviorFrom;
                        final SeaSkuPanelFragment seaSkuPanelFragment2 = this.LL;
                        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = seaSkuPanelFragment2.LLJJJ;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.11GL
                                @Override // X.AbstractC1177930gl5
                                public final void LIZJ(View view3, float f) {
                                }

                                @Override // X.AbstractC1177930gl5
                                public final void LIZLLL(int i, View view3) {
                                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior2;
                                    if (i == 1 && (bottomSheetBehavior2 = seaSkuPanelFragment2.LLJJJ) != null) {
                                        bottomSheetBehavior2.setState(3);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        View view3 = this.LLJJIJIIJIL;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.height = cS();
            C786410Ut5.W5(view3, layoutParams);
            view3.setOutlineProvider(new C04JA(1));
            view3.setClipToOutline(true);
            view3.setBackgroundResource(R.drawable.b21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1743780vTk dialogC1743780vTk = new DialogC1743780vTk(requireContext(), getTheme());
        Window window = dialogC1743780vTk.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1743780vTk);
        return dialogC1743780vTk;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.LLJJJJJIL != null) {
            C1756370vo3.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJIJIL = (ConstraintLayout) view.findViewById(R.id.vds);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.vdu);
        this.LLJILJILJ = view.findViewById(R.id.vgk);
        this.LLJILLL = (C21578619ce) view.findViewById(R.id.vhm);
        this.LLJJ = (FrameLayout) view.findViewById(R.id.jit);
        this.LLJJI = (FrameLayout) view.findViewById(R.id.vga);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.ynp);
        this.LLJJIJI = view.findViewById(R.id.y9i);
        this.LLJJIJIIJIL = view.findViewById(R.id.vgb);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            viewLIZ = C991303uB.LIZ(context, R.layout.az1, viewGroup, false);
        } else {
            viewLIZ = null;
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
