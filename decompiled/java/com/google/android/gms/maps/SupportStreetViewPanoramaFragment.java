package com.google.android.gms.maps;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BTN;
import X.C2205381BTc;
import X.C2205411BTf;
import X.C2205421BTg;
import X.C2205431BTh;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmE+KTU/ZxwmODHELIOSUjOzsAPDcpLDsFISA7GS49JzctJC4VOiQrJCo9PA==";
    public final C1BTN LL = new C1BTN(this);

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1BTN c1btn = this.LL;
        T t = c1btn.LIZ;
        if (t != 0) {
            t.onDestroy();
        } else {
            c1btn.LIZLLL(1);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1BTN c1btn = this.LL;
        T t = c1btn.LIZ;
        if (t != 0) {
            t.onDestroyView();
        } else {
            c1btn.LIZLLL(2);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        T t = this.LL.LIZ;
        if (t != 0) {
            t.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C1BTN c1btn = this.LL;
        T t = c1btn.LIZ;
        if (t != 0) {
            t.onPause();
        } else {
            c1btn.LIZLLL(5);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C1BTN c1btn = this.LL;
        T t = c1btn.LIZ;
        if (t != 0) {
            t.onStop();
        } else {
            c1btn.LIZLLL(4);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1BTN c1btn = this.LL;
        c1btn.getClass();
        c1btn.LJ(null, new C2205431BTh(c1btn));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1BTN c1btn = this.LL;
        c1btn.getClass();
        c1btn.LJ(null, new C2205421BTg(c1btn));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C1BTN c1btn = this.LL;
        c1btn.LJI = activity;
        c1btn.LJFF();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1BTN c1btn = this.LL;
        c1btn.getClass();
        c1btn.LJ(bundle, new C2205411BTf(c1btn, bundle));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        C1BTN c1btn = this.LL;
        T t = c1btn.LIZ;
        if (t != 0) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = c1btn.LIZIZ;
        if (bundle2 == null) {
            return;
        }
        C786410Ut5.LJJIIJZLJL(bundle, bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLIZIZ = this.LL.LIZIZ(layoutInflater, viewGroup, bundle);
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZIZ;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C1BTN c1btn = this.LL;
            c1btn.LJI = activity;
            c1btn.LJFF();
            Bundle bundle2 = new Bundle();
            C1BTN c1btn2 = this.LL;
            c1btn2.getClass();
            c1btn2.LJ(bundle, new C2205381BTc(c1btn2, activity, bundle2, bundle));
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
