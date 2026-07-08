package com.ss.android.ugc.aweme.explore.et;

import X.C1386470mBR;
import X.C15TA;
import X.C15UA;
import X.C1615500s8q;
import X.C2082308Dt;
import X.C2188811AlT;
import X.C740740T3w;
import X.InterfaceC1210900hcG;
import X.InterfaceC1603450rpP;
import Y.AObserverS216S0100000_12;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreStayTimeFragmentComponent implements InterfaceC1603450rpP, GenericLifecycleObserver {
    public final Fragment LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<String> LLILZ;
    public long LLILZIL = -1;
    public boolean LLILZLL = true;
    public AObserverS216S0100000_12 LLIZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (Intrinsics.LJFF("homepage_explore", this.LLILLJJLI) && this.LLILZIL > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZIL;
            C740740T3w.LJIIIIZZ(this.LL, this.LLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 12304);
            sbLIZ.append(this.LL.getClass().getSimpleName());
            sbLIZ.append("】report stay_time, delta: ");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append(", enterFrom:");
            sbLIZ.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1386470mBR c1386470mBR = new C1386470mBR();
            c1386470mBR.LJJLIIIJ = String.valueOf(jElapsedRealtime);
            c1386470mBR.LJJIJL(this.LLILLJJLI);
            c1386470mBR.LJL = this.LLILLL;
            C15TA.LIZ.getClass();
            String str = C15TA.LJJIL ? "1" : CardStruct.IStatusCode.DEFAULT;
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c1386470mBR.LJFF("is_explore_innerfeed", str, c2082308Dt);
            c1386470mBR.LJFF("enter_explore_session_id", C15UA.LIZIZ, c2082308Dt);
            c1386470mBR.LJIILJJIL();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLILZLL) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLILZLL) {
            this.LLILZIL = SystemClock.elapsedRealtime();
            Fragment fragment = this.LL;
            this.LLIZ = C740740T3w.LIZLLL(fragment, fragment, new C1615500s8q(this));
        }
    }

    @Override // X.InterfaceC1603450rpP
    public final void setUserVisibleHint(boolean z) {
        this.LLILZLL = z;
        if (z) {
            this.LLILZIL = SystemClock.elapsedRealtime();
            Fragment fragment = this.LL;
            this.LLIZ = C740740T3w.LIZLLL(fragment, fragment, new C1615500s8q(this));
            return;
        }
        LIZ();
    }

    public ExploreStayTimeFragmentComponent(Fragment fragment, String str, String str2, AwS568S0100000_24 awS568S0100000_24) {
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = awS568S0100000_24;
        fragment.getLifecycle().addObserver(this);
    }
}
