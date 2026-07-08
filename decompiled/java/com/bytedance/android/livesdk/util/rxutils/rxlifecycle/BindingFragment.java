package com.bytedance.android.livesdk.util.rxutils.rxlifecycle;

import X.C098200Yq;
import X.C0J1T;
import X.C11PQ;
import X.C189200o6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class BindingFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PTElJWEhHELIOSMDA4ICMgZjc0JSY1LSY1KiM2ZgclJys6JiIKOy40JSAiPQ==";
    public final C11PQ<C0J1T> LL = new C11PQ<>();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL.onNext(C0J1T.DESTROY);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL.onNext(C0J1T.DESTROY_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.LL.onNext(C0J1T.DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LL.onNext(C0J1T.PAUSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LL.onNext(C0J1T.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LL.onNext(C0J1T.START);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LL.onNext(C0J1T.STOP);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.LL.onNext(C0J1T.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LL.onNext(C0J1T.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.LL.onNext(C0J1T.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LL.onNext(C0J1T.CREATE_VIEW);
        try {
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
