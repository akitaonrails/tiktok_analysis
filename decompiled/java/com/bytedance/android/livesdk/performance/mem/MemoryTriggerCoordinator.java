package com.bytedance.android.livesdk.performance.mem;

import X.C1776970wLH;
import X.C1776980wLI;
import X.C19719612Di;
import X.C20125113on;
import X.C20441214yg;
import X.C2177571AKd;
import X.C2177581AKe;
import X.C2177641AKk;
import X.C2177651AKl;
import X.C2177661AKm;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C356901a3;
import X.C786410Ut5;
import X.EnumC1153480g7e;
import X.EnumC1783030wV3;
import X.EnumC2177591AKf;
import X.InterfaceC2177561AKc;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class MemoryTriggerCoordinator implements DefaultLifecycleObserver, LiveMemoryTrigger, GenericLifecycleObserver {
    public Context LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public LifecycleOwner LLILZIL;
    public C2177661AKm LLIZLLLIL;
    public C2177641AKk LLJ;
    public HandlerThread LLJI;
    public BPEAHandler LLJIJIL;
    public float LLJILLL;
    public final String LL = "MemoryTrigger";
    public final C2177651AKl LLILZLL = new C2177651AKl();
    public final C2177571AKd LLIZ = new C2177571AKd();
    public volatile long LLJILJIL = -1;
    public volatile long LLJILJILJ = -1;
    public String LLJJ = CardStruct.IStatusCode.DEFAULT;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void Ge1() {
        C1776970wLH c1776970wLH;
        C1776980wLI c1776980wLI;
        long j = this.LLJILJIL;
        long j2 = this.LLJILJILJ;
        long j3 = (long) this.LLJILLL;
        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(this.LLJJ);
        float fFloatValue = fLJIIIIZZ != null ? fLJIIIIZZ.floatValue() : 0.0f;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerWithPreviewData, usedBytes: ");
        sbLIZ.append(j);
        sbLIZ.append(", maxBytes: ");
        sbLIZ.append(j2);
        sbLIZ.append(", deviceTotalBytes: ");
        sbLIZ.append(j3);
        sbLIZ.append(", deviceUsagePct: ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (j <= 0 || j2 <= 0) {
            c1776970wLH = new C1776970wLH(EnumC2177591AKf.NONE, -1L, -1L);
        } else {
            this.LLILZLL.getClass();
            c1776970wLH = new C1776970wLH(C2177651AKl.LJ(j2 - j, j2), j, j2);
        }
        if (j3 > 0) {
            long j4 = (long) (j3 * (1.0f - (fFloatValue / 100.0f)));
            this.LLILZLL.getClass();
            c1776980wLI = new C1776980wLI(C2177651AKl.LIZJ(j4, j3), j4, j3);
        } else {
            c1776980wLI = new C1776980wLI(EnumC2177591AKf.NONE, -1L, -1L);
        }
        this.LLILZLL.getClass();
        this.LLIZ.LIZ(EnumC1783030wV3.GC, C2177651AKl.LIZ(c1776970wLH, c1776980wLI), this.LLILZ, EnumC1153480g7e.PREVIEW);
        bj0();
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void Gy0() {
        if (!this.LLILLL) {
            C20441214yg.LJIIL(this.LL, "forceTrigger called before init, ignoring");
            return;
        }
        BPEAHandler bPEAHandler = this.LLJIJIL;
        if (bPEAHandler == null) {
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS133S0100000_33(this, 27));
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void bj0() {
        C19719612Di.LJJIII(this.LLIZ.LIZ.entrySet(), new AwS612S0100000_33(EnumC1153480g7e.PREVIEW, 281), true);
        this.LLJILJIL = -1L;
        this.LLJILJILJ = -1L;
        this.LLJILLL = 0.0f;
        this.LLJJ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void LLD(boolean z) {
        Lifecycle lifecycle;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy, needQuitHandlerThread: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C2177661AKm c2177661AKm = this.LLIZLLLIL;
        if (c2177661AKm != null) {
            C20125113on.LIZIZ().getClass();
            ((CopyOnWriteArrayList) C20125113on.LIZIZ).remove(c2177661AKm);
        }
        C2177641AKk c2177641AKk = this.LLJ;
        if (c2177641AKk != null) {
            c2177641AKk.LJ.removeCallbacks(c2177641AKk.LJFF);
            C20441214yg.LIZIZ("MemoryTrigger", "ScheduledTrigger stopped");
        }
        this.LLIZ.LIZ.clear();
        this.LLIZLLLIL = null;
        this.LLJ = null;
        BPEAHandler bPEAHandler = this.LLJIJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        if (z) {
            HandlerThread handlerThread = this.LLJI;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.LLJI = null;
            this.LLJIJIL = null;
            LifecycleOwner lifecycleOwner = this.LLILZIL;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.LLJILJIL = -1L;
        this.LLJILJILJ = -1L;
        this.LLJILLL = 0.0f;
        this.LLJJ = CardStruct.IStatusCode.DEFAULT;
        this.LLILLJJLI = null;
        this.LLILLL = false;
        this.LLILZ = 0L;
        this.LLILZIL = null;
        C20441214yg.LIZIZ(this.LL, "Destroyed");
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void N5(String str) {
        this.LLIZ.LIZ.remove(str);
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unregistered: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C20441214yg.LIZIZ(this.LL, "onDestroy, cleaning up");
        LifecycleOwner lifecycleOwner2 = this.LLILZIL;
        if (lifecycleOwner2 != null && lifecycleOwner != lifecycleOwner2) {
            C20441214yg.LJIIL(this.LL, "onDestroy from stale observer, ignoring");
            lifecycleOwner.getLifecycle().removeObserver(this);
        } else {
            LLD(true);
        }
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void q62(Runnable runnable) {
        BPEAHandler bPEAHandler = this.LLJIJIL;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void Ek1(Context context, LifecycleOwner lifecycleOwner) {
        Context contextN3;
        Lifecycle lifecycle;
        if (!MemoryTriggerSetting.isEnabled()) {
            return;
        }
        if (this.LLILLL) {
            C20441214yg.LJIIL(this.LL, "Already initialized, destroying previous instance");
            LifecycleOwner lifecycleOwner2 = this.LLILZIL;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            LLD(false);
        }
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        this.LLILLJJLI = contextN3;
        this.LLILLL = true;
        this.LLILZIL = lifecycleOwner;
        if (this.LLJI == null) {
            HandlerThread handlerThread = new HandlerThread("MemoryTrigger-Scheduler");
            handlerThread.start();
            this.LLJI = handlerThread;
            this.LLJIJIL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        if (!this.LLILLL) {
            C20441214yg.LJIIL(this.LL, "Not initialized, skip starting triggers");
            return;
        }
        Context context2 = this.LLILLJJLI;
        if (context2 == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLILZ = jElapsedRealtime;
        C2177661AKm c2177661AKm = new C2177661AKm(this.LLILZLL, this.LLIZ, jElapsedRealtime);
        C20125113on.LIZIZ().getClass();
        C20125113on.LIZ(c2177661AKm);
        this.LLIZLLLIL = c2177661AKm;
        BPEAHandler bPEAHandler = this.LLJIJIL;
        if (bPEAHandler == null) {
            return;
        }
        C2177641AKk c2177641AKk = new C2177641AKk(this.LLILZLL, this.LLIZ, context2, this.LLILZ, bPEAHandler);
        C786410Ut5.LJLIIL(MemoryTriggerSetting.INSTANCE.getNormalIntervalMs(), bPEAHandler, c2177641AKk.LJFF);
        this.LLJ = c2177641AKk;
        C20441214yg.LIZIZ(this.LL, "Triggers started");
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void Gl2(long j, String str, long j2, float f) {
        this.LLJILJIL = j;
        this.LLJILJILJ = j2;
        this.LLJILLL = f;
        this.LLJJ = str;
    }

    @Override // com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger
    public final void YP1(String str, EnumC2177591AKf enumC2177591AKf, EnumC2177591AKf enumC2177591AKf2, EnumC1153480g7e enumC1153480g7e, InterfaceC2177561AKc interfaceC2177561AKc) {
        this.LLIZ.LIZ.put(str, new C2177581AKe(str, enumC2177591AKf, enumC2177591AKf2, enumC1153480g7e, interfaceC2177561AKc));
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Registered: ");
        sbLIZ.append(str);
        sbLIZ.append(" (java=");
        sbLIZ.append(enumC2177591AKf);
        sbLIZ.append(", device=");
        sbLIZ.append(enumC2177591AKf2);
        sbLIZ.append(", scope=");
        sbLIZ.append(enumC1153480g7e);
        sbLIZ.append(')');
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
