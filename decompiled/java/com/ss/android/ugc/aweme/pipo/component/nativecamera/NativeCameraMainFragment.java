package com.ss.android.ugc.aweme.pipo.component.nativecamera;

import X.AnonymousClass1430;
import X.C098200Yq;
import X.C0DRA;
import X.C14WP;
import X.C14WQ;
import X.C14WU;
import X.C14WV;
import X.C1685300txQ;
import X.C168Q;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19F0;
import X.C19GS;
import X.C1A6V;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C786410Ut5;
import X.C838410Wul;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import Y.ARunnableS130S0100000_30;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraMainFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC836760Ws6
public final class NativeCameraMainFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyohOSA9LSs4HELIOSZyEyPCw6LCwyJSA+KGEdKTElPyoQKSgpOy4eKSwiDz0yLygpJzs=";
    public Function0<Unit> LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public C14WV LLJILLL;
    public final NativeCameraPictureTakingFragment LLIZ = new NativeCameraPictureTakingFragment();
    public final NativeCameraFragmentPermission LLIZLLLIL = new NativeCameraFragmentPermission();
    public final BPEAHandler LLJJ = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJJI = true;
    public volatile boolean LLJJIII = true;
    public final ARunnableS130S0100000_30 LLJJIJI = new ARunnableS130S0100000_30(this, 14);
    public final C19F0<String> LLJJIJIIJIL = registerForActivityResult(new AnonymousClass1430(), new C168Q() { // from class: X.14WW
        @Override // X.C168Q
        public final void LIZ(Object obj) {
            FragmentManager supportFragmentManager;
            C19EH c19ehLJIIJ;
            if (((Boolean) obj).booleanValue()) {
                C14WU.LIZ("camera_permission_result", C2097908Jt.LIZJ(new Pair("permission_result", "allow")));
                return;
            }
            C14WU.LIZ("camera_permission_result", C2097908Jt.LIZJ(new Pair("permission_result", "denied")));
            NativeCameraMainFragment nativeCameraMainFragment = this.LIZ;
            nativeCameraMainFragment.LLJI = true;
            C19EG activity = nativeCameraMainFragment.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (c19ehLJIIJ = supportFragmentManager.LJIIJ()) == null) {
                return;
            }
            c19ehLJIIJ.LJIJ(R.id.trb, this.LIZ.LLIZLLLIL, null);
            c19ehLJIIJ.LJIIJ();
        }
    });

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public final boolean SR() {
        try {
            C19EG activity = getActivity();
            if (activity != null) {
                return C838410Wul.LIZ(activity, "android.permission.CAMERA") == 0;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = C14WP.LLILZ;
            C14WQ.LIZ(-6, e);
            return false;
        }
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        if (this.LLJI) {
            C14WU.LIZ("camera_permission_result", C2097908Jt.LIZJ(new Pair("permission_result", "denied")));
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("cancel_reason", "permission_denied_exit");
            C14WV c14wv = this.LLJILLL;
            pairArr[1] = new Pair("peak_memory_usage", String.valueOf(c14wv != null ? c14wv.LIZ().get("peak_memory_usage") : null));
            C14WV c14wv2 = this.LLJILLL;
            pairArr[2] = new Pair("peak_cpu_usage", String.valueOf(c14wv2 != null ? c14wv2.LIZ().get("peak_cpu_usage") : null));
            C14WU.LIZ("camera_cancel", C2097608Jq.LJIIIIZZ(pairArr));
            String str = C14WP.LLILZ;
            C14WQ.LIZ(-6, new Exception("User denied camera permission access"));
            C19EG activity = getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(this);
                c19ehLJIIJ.LJIIJ();
            }
        } else {
            Pair[] pairArr2 = new Pair[3];
            pairArr2[0] = new Pair("cancel_reason", "back_click");
            C14WV c14wv3 = this.LLJILLL;
            pairArr2[1] = new Pair("peak_memory_usage", String.valueOf(c14wv3 != null ? c14wv3.LIZ().get("peak_memory_usage") : null));
            C14WV c14wv4 = this.LLJILLL;
            pairArr2[2] = new Pair("peak_cpu_usage", String.valueOf(c14wv4 != null ? c14wv4.LIZ().get("peak_cpu_usage") : null));
            C14WU.LIZ("camera_cancel", C2097608Jq.LJIIIIZZ(pairArr2));
            String str2 = C14WP.LLILZ;
            C14WQ.LIZIZ(null);
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(this.LLJIJIL);
            window.setNavigationBarColor(this.LLJILJIL);
            C0DRA.LIZ(window, true);
            window.getDecorView().setSystemUiVisibility(this.LLJILJILJ);
            C1A6V c1a6v = new C1A6V(window, window.getDecorView());
            if (this.LLJILJIL != -16777216) {
                c1a6v.LIZJ(true);
                c1a6v.LIZIZ(true);
            } else {
                c1a6v.LIZJ(false);
                c1a6v.LIZIZ(false);
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        if (SR()) {
            this.LLJI = false;
            C19EG activity = getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(R.id.trb, this.LLIZ, null);
                c19ehLJIIJ.LJIIJ();
            }
        }
        super.onResume();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        Window window;
        Window window2;
        C19EG activity2 = getActivity();
        if (activity2 != null && (window2 = activity2.getWindow()) != null) {
            this.LLJIJIL = window2.getStatusBarColor();
            this.LLJILJIL = window2.getNavigationBarColor();
            window2.addFlags(Integer.MIN_VALUE);
            this.LLJILJILJ = window2.getDecorView().getSystemUiVisibility();
        }
        this.LLJILLL = new C14WV(getActivity());
        C786410Ut5.LJJZZIII(this.LLJJ, this.LLJJIJI);
        if (this.LLJ != null && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(-16777216);
            window.setNavigationBarColor(-16777216);
            window.addFlags(Integer.MIN_VALUE);
            C1A6V c1a6v = new C1A6V(window, window.getDecorView());
            c1a6v.LIZJ(false);
            c1a6v.LIZIZ(false);
        }
        super.onViewCreated(view, bundle);
        NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LLIZ;
        nativeCameraPictureTakingFragment.LLJLL = this.LLJILLL;
        nativeCameraPictureTakingFragment.LLJLIL = new AwS574S0100000_30(this, 80);
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(this, 83);
        this.LLIZLLLIL.LLIZ = new AwS574S0100000_30(awS574S0100000_30, 81);
        this.LLIZ.LLJL = new AwS574S0100000_30(awS574S0100000_30, 82);
        if (!SR()) {
            C14WU.LIZ("camera_permission_request", C2097608Jq.LJ());
            this.LLJJIJIIJIL.LIZ("android.permission.CAMERA");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dwd, viewGroup, false);
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
