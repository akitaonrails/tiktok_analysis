package com.ss.android.ugc.aweme.feed.bottom;

import X.C1360890lWB;
import X.C1389910mGz;
import X.C1389920mH0;
import X.C14LC;
import X.C19EG;
import X.C418440Gaw;
import X.C814420VxA;
import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomToastVM extends ViewModel {
    public C1389910mGz LL;
    public C1360890lWB LLILLJJLI;
    public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL = null;
    }

    public final C1389910mGz wQ2() {
        C1389910mGz c1389910mGz = this.LL;
        if (c1389910mGz == null) {
            return null;
        }
        c1389910mGz.LIZJ();
        C1360890lWB c1360890lWB = this.LLILLJJLI;
        if (c1360890lWB != null) {
            C1389920mH0 c1389920mH0 = c1360890lWB.LIZ;
            c1389920mH0.LJFF = true;
            c1389920mH0.LJI = true;
            c1389910mGz.LIZ = new C1360890lWB(c1389920mH0, c1360890lWB.LIZIZ, c1360890lWB.LIZJ, c1360890lWB.LIZLLL, c1360890lWB.LJ, c1360890lWB.LJFF, c1360890lWB.LJI, c1360890lWB.LJII, c1360890lWB.LJIIIIZZ, c1360890lWB.LJIIIZ);
        }
        return c1389910mGz;
    }

    public final void vQ2(final Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (this.LL == null) {
            this.LL = new C1389910mGz(fragment);
        }
        this.LLILLJJLI = new C1360890lWB(0);
        View view = fragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0SRh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BottomToastVM@7c6.createToast$1");
                    try {
                        this.LL.xQ2(fragment);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BottomToastVM@7c6.createToast$1");
                }
            });
        }
    }

    public final void xQ2(Fragment fragment) {
        int i;
        Window window;
        View decorView;
        if (fragment == null) {
            return;
        }
        C19EG activity = fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            int i2 = rect.bottom;
            decorView.findViewById(R.id.content).getGlobalVisibleRect(rect);
            i = i2 - rect.bottom;
        } else {
            i = 0;
        }
        C1360890lWB c1360890lWB = this.LLILLJJLI;
        if (c1360890lWB != null) {
            c1360890lWB.LJII = Integer.valueOf(Math.max(i, 0) + this.LLILLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }
}
