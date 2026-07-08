package com.ss.android.ugc.aweme.ecommerce.base.sku.strategy;

import X.AbstractC1389240mFu;
import X.AnonymousClass0317;
import X.AnonymousClass0444;
import X.AnonymousClass0477;
import X.C01GW;
import X.C034S;
import X.C044N;
import X.C098200Yq;
import X.C1019103yf;
import X.C1019703yl;
import X.C1025503zh;
import X.C10429045z;
import X.C10460047e;
import X.C1091940eWO;
import X.C1120604Zw;
import X.C13LP;
import X.C1685300txQ;
import X.C1700260uLY;
import X.C1753460vjM;
import X.C189200o6;
import X.C18ZQ;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C419400GcU;
import X.C452501pT;
import X.C723850SaN;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C838410Wul;
import X.C928103jz;
import X.C958103op;
import X.C987903td;
import X.EnumC1014603xw;
import X.InterfaceC911603hK;
import X.ViewTreeObserverOnPreDrawListenerC1775920wJa;
import Y.ARunnableS34S0300000_1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelAssemFragment extends BaseSkuFragment<SkuPanelAssemVM> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTHELIOSYpZzw4PWs/PT0yPCArMGEAIzAcKCE2JAQ/Oio+DjctLiI2JjE=";
    public TuxTextView LLJJ;
    public C1753460vjM LLJJI;
    public C419400GcU LLJJIII;
    public View LLJJIJI;
    public RelativeLayout LLJJJ;
    public boolean LLJJJJ;
    public final SkuPanelAssemFragment LLJJIJIIJIL = this;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1474));
    public final BPEAHandler LLJJJIL = new BPEAHandler(Looper.getMainLooper());
    public final C10429045z LLJJJJJIL = new AbstractC1389240mFu() { // from class: X.045z
        @Override // X.AbstractC1389240mFu
        public final boolean LIZ(String str) {
            if (this.LIZ.isResumed() && !this.LIZ.iS()) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                View view = this.LIZ.LLJJIJIIJIL.getView();
                if (view != null) {
                    this.LIZ.dS().LLLFF.LIZ(view.getContext(), "sku_panel", bitmapDecodeFile, null);
                    return true;
                }
                return true;
            }
            return true;
        }
    };
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AnonymousClass0477(this));

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final void bS(int i) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment
    public final void clearFromXmlViewCache() {
        this.LLJI = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
    }

    public final boolean iS() {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        Activity activityLIZIZ;
        boolean z = true;
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
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null && !Intrinsics.LJFF(activityLIZIZ, getActivity())) {
                return true;
            }
            List<Fragment> listLJJLIIIJL = this.LLJJIJIIJIL.getParentFragmentManager().LJJLIIIJL();
            ArrayList arrayList = new ArrayList();
            for (Fragment fragment : listLJJLIIIJL) {
                Fragment fragment2 = fragment;
                if (fragment2.isAdded() && fragment2.isVisible()) {
                    arrayList.add(fragment);
                }
            }
            if (!Intrinsics.LJFF(C13LP.LJJLIIIJL(arrayList), this.LLJJIJIIJIL)) {
                return true;
            }
            z = dS().LLLILZJ;
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR_SKU_SCREENSHOT_10019, th, null);
            return z;
        }
    }

    public final View hS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vi0) : null;
            this.LLJJIJI = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        C19EG activity;
        super.onDestroyView();
        clearFromXmlViewCache();
        C044N.LIZJ = null;
        if (getContext() != null && Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLJJJJLIIL.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null && (activity = getActivity()) != null) {
                activity.unregisterScreenCaptureCallback(screenCaptureCallback);
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).removeAppBackGroundListener((C18ZQ) this.LLJJIJIL.getValue());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).removeScreenShotListener(this.LLJJJJJIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        ViewGroup viewGroup;
        HashMap map2 = (HashMap) map;
        map2.put("page_name", "sku");
        if (super.Pp(map)) {
            return true;
        }
        View view = getView();
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.rn0)) != null && viewGroup.getChildCount() > 0 && viewGroup.getHeight() > 0) {
            return false;
        }
        map2.put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        boolean z2;
        String name2;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        super.onViewCreated(view, bundle);
        C1700260uLY c1700260uLYMQ2 = dS().MQ2();
        c1700260uLYMQ2.getClass();
        ViewTreeObserverOnPreDrawListenerC1775920wJa viewTreeObserverOnPreDrawListenerC1775920wJa = new ViewTreeObserverOnPreDrawListenerC1775920wJa(c1700260uLYMQ2, view, 0);
        C786410Ut5.y3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1775920wJa);
        C1091940eWO.LIZIZ(10000L, new ARunnableS34S0300000_1(view, viewTreeObserverOnPreDrawListenerC1775920wJa, c1700260uLYMQ2, 0));
        this.LLJJJ = (RelativeLayout) view.findViewById(R.id.vgj);
        Dialog dialog = getDialog();
        if (dialog != null) {
            viewFindViewById = dialog.findViewById(R.id.fpl);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
        RelativeLayout relativeLayout = this.LLJJJ;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (C958103op.LIZJ() * dS().Zf2().LJIIJJI());
            } else {
                layoutParams = null;
            }
            C786410Ut5.e6(relativeLayout, layoutParams);
        }
        Context context = getContext();
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                Object value = this.LLJJJJLIIL.getValue();
                if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                    Executor executorLIZJ = C838410Wul.LIZJ(context);
                    C19EG activity = getActivity();
                    if (activity != null) {
                        activity.registerScreenCaptureCallback(executorLIZJ, screenCaptureCallback);
                    }
                }
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IActivityStackDependencyService.class.getName();
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).addAppBackGroundListener((C18ZQ) this.LLJJIJIL.getValue());
        }
        if (C10460047e.LIZ()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IShareDependencyService.class.getName();
                if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
            }
            ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).addScreenShotListener(this.LLJJJJJIL);
        }
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 307), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View viewTd;
        Context context = getContext();
        C1019703yl c1019703yl = dS().LLL;
        SkuPanelStarter.SkuEnterParams skuEnterParams = dS().LLJI;
        C19GS c19gs = null;
        if (skuEnterParams != null) {
            str = skuEnterParams.sourceBtmToken;
        } else {
            str = null;
        }
        c1019703yl.LJFF(this, str);
        SkuPanelAssemVM skuPanelAssemVMDS = dS();
        skuPanelAssemVMDS.LLLJ.clear();
        ((LinkedHashMap) skuPanelAssemVMDS.LLLJIL).clear();
        for (String str2 : skuPanelAssemVMDS.LLLLIIL) {
            C987903td c987903td = skuPanelAssemVMDS.LLJLLL;
            c987903td.getClass();
            Object objLIZIZ = C1025503zh.LIZIZ(AnonymousClass0444.class, new BizIdentity(str2, c987903td.LIZ, c987903td.LIZIZ));
            if (objLIZIZ != null) {
                skuPanelAssemVMDS.LLLJ.add((AnonymousClass0444) objLIZIZ);
                skuPanelAssemVMDS.LLLJIL.put(str2, (AnonymousClass0444) objLIZIZ);
            }
        }
        AnonymousClass0444 anonymousClass0444Remove = skuPanelAssemVMDS.LLLJIL.remove("sku_panel_selection_legacy_style_1");
        if (anonymousClass0444Remove != null) {
            skuPanelAssemVMDS.LLLJIL.put("sku_panel_selection_style_1", anonymousClass0444Remove);
        }
        if (context != null) {
            C044N c044n = C044N.LIZ;
            viewTd = C044N.LIZIZ(context, R.layout.azf, viewGroup);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.azf, viewGroup, false);
        }
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
}
