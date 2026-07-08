package com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui;

import X.C098200Yq;
import X.C1391190mJ3;
import X.C1593970ra7;
import X.C1685300txQ;
import X.C189200o6;
import X.C1914630zvJ;
import X.C1914710zvR;
import X.C1914760zvW;
import X.C19EG;
import X.C19GS;
import X.C343970De7;
import X.C786410Ut5;
import X.InterfaceC1914640zvK;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS61S0300000_28;
import Y.ARunnableS97S0200000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class ContainerFragment extends Fragment implements InterfaceC1914640zvK, ViewTreeObserver.OnGlobalLayoutListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9LiApLTwyLiHELIOSA4MGEkIDw4ISYgOCo/PWEmIWsPJiEnKSwiLD0VOiQrJCo9PA==";
    public final Aweme LL;
    public final BaseSharePackage LLILLJJLI;
    public ViewFlipper LLILLL;
    public C1914710zvR LLILZ;
    public final boolean LLILZIL;

    public ContainerFragment() {
        this(null, null);
    }

    @Override // X.InterfaceC1914640zvK
    public final void Bi() {
        ViewFlipper viewFlipper = this.LLILLL;
        if (viewFlipper == null || viewFlipper.getParent() == null) {
            return;
        }
        HandlerHook.viewPost(viewFlipper, new ARunnableS97S0200000_28(this, viewFlipper, 22));
    }

    @Override // X.InterfaceC1914640zvK
    public final void SA() {
        ViewFlipper viewFlipper = this.LLILLL;
        if (viewFlipper == null || viewFlipper.getParent() == null) {
            return;
        }
        HandlerHook.viewPost(viewFlipper, new ARunnableS61S0300000_28(this.LLILZ, this, viewFlipper, 3));
    }

    @Override // X.InterfaceC1914640zvK
    public final void close() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZ = null;
        this.LLILLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r7 = this;
            android.view.View r6 = r7.getView()
            if (r6 != 0) goto L7
            return
        L7:
            int r3 = r6.getHeight()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            r5 = 0
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.feed.model.RecReasonsStruct r0 = r0.getRecReasonsStruct()
            if (r0 == 0) goto L42
            java.util.List<com.ss.android.ugc.aweme.feed.model.RecReasonEntry> r2 = r0.reasons
        L18:
            r4 = 0
            r1 = 1
            if (r2 == 0) goto L40
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L40
            int r0 = r2.size()
            if (r0 < r1) goto L40
            boolean r0 = r7.LLILZIL
            if (r0 != 0) goto L40
            X.0ra7 r0 = X.C1593970ra7.LIZ
            r0.getClass()
            boolean r0 = X.C1593970ra7.LIZ()
            if (r0 != 0) goto L40
        L39:
            if (r3 <= 0) goto L77
            android.widget.ViewFlipper r3 = r7.LLILLL
            if (r3 != 0) goto L44
            return
        L40:
            r1 = 0
            goto L39
        L42:
            r2 = r5
            goto L18
        L44:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L7f
            int r0 = X.C0FUC.LIZIZ()
            float r1 = (float) r0
            r0 = 1052602532(0x3ebd70a4, float:0.37)
            float r1 = r1 * r0
            int r1 = X.C814420VxA.LIZIZ(r1)
            int r0 = r3.getDisplayedChild()
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 == 0) goto L67
            int r4 = r0.getHeight()
        L67:
            int r0 = java.lang.Math.max(r4, r1)
        L6b:
            r2.height = r0
            r5 = r2
        L6e:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setLayoutParams(r5)
            r3.requestLayout()
        L77:
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            X.C786410Ut5.C3(r0, r7)
            return
        L7f:
            r0 = -2
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui.ContainerFragment.onGlobalLayout():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ContainerFragment(com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.LL = r7
            r6.LLILLJJLI = r8
            java.lang.Class<com.ss.android.ugc.tiktok.pns.feedsafety.api.whythispost.IWhyThisPostService> r0 = com.ss.android.ugc.tiktok.pns.feedsafety.api.whythispost.IWhyThisPostService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            boolean r0 = r1 instanceof com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.WhyThisPostService
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            boolean r1 = com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.WhyThisPostService.LIZIZ()
            r0 = 1
            if (r1 != r0) goto L23
        L20:
            r6.LLILZIL = r0
            return
        L23:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui.ContainerFragment.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View c1914630zvJ;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLILLL = new ViewFlipper(requireContext());
        ViewFlipper viewFlipper = this.LLILLL;
        if (viewFlipper != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFlipper);
            viewFlipper.setLayoutParams(layoutParams);
        }
        Context contextRequireContext = requireContext();
        ViewFlipper viewFlipper2 = this.LLILLL;
        if (viewFlipper2 != null) {
            C1593970ra7.LIZ.getClass();
            if (C1593970ra7.LIZ()) {
                c1914630zvJ = new C1914760zvW(contextRequireContext, this.LLILLJJLI, this);
            } else {
                c1914630zvJ = new C1914630zvJ(contextRequireContext, this, this.LL, this.LLILLJJLI);
            }
            viewFlipper2.addView(c1914630zvJ);
        }
        C19GS c19gs = null;
        this.LLILZ = null;
        frameLayout.addView(this.LLILLL);
        C786410Ut5.x3(frameLayout.getViewTreeObserver(), this);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
