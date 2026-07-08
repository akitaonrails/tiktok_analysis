package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.fragment;

import X.C098200Yq;
import X.C1440005kM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC490160JKc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionManagementFragmentV2 extends BaseFragment implements InterfaceC490160JKc {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqHELIOSJjo9LCQ4ICA9ZigtJy40LSgpJzt9LjctLiI2JjFiGjoxOyY+ID8nISoiBC49KSIpJCo9PAM+KCg+LSs4H30=";

    @Override // X.InterfaceC490160JKc
    public final void closePanel() {
        FragmentManager supportFragmentManager;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        if (supportFragmentManager.LJJLIIIJL().size() > 1) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJ();
            return;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        onDestroy();
        C1440005kM.LIZ(new IEvent() { // from class: X.0JKg
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000e, code lost:
    
        r1 = null;
     */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            super.onViewCreated(r7, r8)
            android.view.ViewParent r1 = r7.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            r5 = 0
            if (r0 == 0) goto L1f
            android.view.View r1 = (android.view.View) r1
        Le:
            r4 = 0
            if (r1 == 0) goto L21
            r1.setFitsSystemWindows(r4)
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1f
            android.view.View r1 = (android.view.View) r1
            goto Le
        L1f:
            r1 = r5
            goto Le
        L21:
            X.0JKp r0 = X.C490290JKp.LIZ
            r0.getClass()
            com.bytedance.tux.system.TuxImmersionBar r3 = X.C1766560w4U.LIZLLL(r6)
            com.bytedance.immersionbar.ImmersionBar r0 = r3.LIZIZ
            r2 = 1
            r0.LJIIJ(r2)
            android.content.Context r1 = r6.getContext()
            r0 = 2131103517(0x7f060f1d, float:1.7819502E38)
            int r0 = X.C497740JfY.LIZLLL(r0, r1)
            r3.LJIIIZ(r0)
            r3.LJIIL()
            r3.LIZLLL()
            android.os.Bundle r1 = r6.getArguments()
            if (r1 == 0) goto L4f
            java.lang.String r0 = "popup"
            r1.putBoolean(r0, r2)
        L4f:
            X.04dX r1 = new X.04dX
            r1.<init>(r6)
            r0 = 3
            X.C723850SaN.LIZ(r6, r4, r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.fragment.SubscriptionManagementFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hnl, viewGroup, false);
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
}
