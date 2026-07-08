package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import X.C0XQ7;
import X.C14EU;
import X.C1618690sDz;
import X.C1619250sEt;
import X.C19EG;
import X.C2188811AlT;
import X.C487280J9a;
import X.C7821033r;
import X.C7837034h;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class SafeInfoNoticePopupWindowHelp implements InterfaceC487330J9f, GenericLifecycleObserver {
    public final Function0<Unit> LL;
    public final View LLILLJJLI;
    public final AmeBaseFragment LLILLL;
    public final TabChangeManager LLILZ;
    public C1619250sEt LLILZIL;
    public boolean LLILZLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLILZLL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        TabChangeManager tabChangeManager;
        this.LLILZLL = true;
        if (C0XQ7.LJFF().isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prior_to_safe_info_");
            sbLIZ.append(C0XQ7.LJFF().getCurUserId());
            if (repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) || ((tabChangeManager = this.LLILZ) != null && Intrinsics.LJFF("HOME", tabChangeManager.CQ2()))) {
                LIZ();
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        C1619250sEt c1619250sEt;
        C1619250sEt c1619250sEt2 = this.LLILZIL;
        if (c1619250sEt2 != null && c1619250sEt2.isShowing() && (c1619250sEt = this.LLILZIL) != null) {
            c1619250sEt.LJJIIJZLJL();
        }
        this.LL.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.LLILZLL
            if (r0 == 0) goto L2e
            java.lang.String r0 = "account_security_keva_name"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "prior_to_safe_info_"
            r1.append(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r0 = r0.getCurUserId()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L2f
            r4.LIZ()
        L2e:
            return
        L2f:
            boolean r0 = X.C1618670sDx.LIZIZ()
            if (r0 == 0) goto L2e
            X.0sEt r0 = r4.LLILZIL
            r3 = 1
            if (r0 == 0) goto L42
            if (r5 == 0) goto L5e
            r0.LJJIIJZLJL()
            r0 = 0
            r4.LLILZIL = r0
        L42:
            X.0sEt r2 = new X.0sEt
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LLILLL
            android.content.Context r1 = r0.requireContext()
            android.view.View r0 = r4.LLILLJJLI
            r2.<init>(r1, r0)
            r4.LLILZIL = r2
            r2.setTouchable(r3)
            X.0sEt r1 = r4.LLILZIL
            if (r1 == 0) goto L5e
            r0 = 2130837673(0x7f0200a9, float:1.7280307E38)
            r1.setAnimationStyle(r0)
        L5e:
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LLILLL
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LLILLL
            X.19EG r0 = r0.getActivity()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L2e
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LLILLL
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L2e
            kotlin.jvm.internal.AwS568S0100000_24 r2 = new kotlin.jvm.internal.AwS568S0100000_24
            r0 = 42
            r2.<init>(r4, r0)
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LLILLL
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L2e
            X.0sE2 r1 = new X.0sE2
            X.0TGX r0 = X.C0HZJ.LIZ(r0)
            r1.<init>(r0, r2)
            com.bytedance.poplayer.core.PopupManager.LJIJI(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp.LIZIZ(boolean):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(C7837034h c7837034h) {
        if (c7837034h != null) {
            if (c7837034h.LIZ) {
                LIZ();
            } else {
                LIZIZ(false);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSafeInfoNoticeEvent(C7821033r c7821033r) {
        if (c7821033r != null) {
            if (c7821033r.LIZ) {
                LIZ();
            } else {
                LIZIZ(false);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1619250sEt c1619250sEt = this.LLILZIL;
        if (c1619250sEt != null && c1619250sEt.isShowing()) {
            c1619250sEt.LJJIIJZLJL();
        }
    }

    public SafeInfoNoticePopupWindowHelp(AmeBaseFragment ameBaseFragment, C1618690sDz c1618690sDz, View view, TabChangeManager tabChangeManager) {
        int iHashCode;
        Lifecycle lifecycle;
        this.LL = c1618690sDz;
        this.LLILLJJLI = view;
        this.LLILLL = ameBaseFragment;
        this.LLILZ = tabChangeManager;
        if ((ameBaseFragment instanceof LifecycleOwner) && ameBaseFragment != null && (lifecycle = ameBaseFragment.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C19EG activity = ameBaseFragment.getActivity();
        if (activity != null) {
            iHashCode = activity.hashCode();
        } else {
            iHashCode = 0;
        }
        C487280J9a.LIZ(iHashCode, this);
    }
}
