package com.ss.android.ugc.aweme.ui.util;

import X.C15UA;
import X.C20684815ws;
import X.C2344009Gk;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StayTimeFragmentComponent implements GenericLifecycleObserver {
    public final Analysis LL;
    public final String LLILLJJLI;
    public long LLILLL = -1;
    public boolean LLILZ = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (this.LLILLL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            if (jCurrentTimeMillis > 100 && !TextUtils.isEmpty(this.LL.getLabelName())) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("duration", String.valueOf(jCurrentTimeMillis));
                c2344009Gk.LJIIIIZZ("enter_from", this.LL.getLabelName());
                if (Intrinsics.LJFF(this.LL.getLabelName(), "homepage_explore")) {
                    String str = this.LLILLJJLI;
                    c2344009Gk.LIZJ(((str == null || str.length() == 0) ? 1 : 0) ^ 1, "is_explore_innerfeed");
                    c2344009Gk.LJFF("enter_explore_session_id", C15UA.LIZIZ);
                }
                C20684815ws.LJIILLIIL("stay_time", c2344009Gk.LIZ);
            }
            this.LLILLL = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLILZ) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLILZ) {
            this.LLILLL = System.currentTimeMillis();
        }
    }

    public StayTimeFragmentComponent(Fragment fragment, Analysis analysis, String str) {
        this.LL = analysis;
        this.LLILLJJLI = str;
        fragment.getLifecycle().addObserver(this);
    }
}
