package com.ss.android.ugc.aweme.im.readstate;

import X.C0Y8T;
import X.C0YNP;
import X.C13BV;
import X.C1758606ue;
import X.C1C7U;
import X.C2188811AlT;
import X.C356901a3;
import X.C866530Xz1;
import X.C869590Y9l;
import X.InterfaceC1755906uD;
import X.InterfaceC892260YzQ;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ReadStateMarkDelegate extends BPEAHandler implements InterfaceC892260YzQ, GenericLifecycleObserver {
    public final InterfaceC1755906uD LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;

    @Override // X.InterfaceC892260YzQ
    public final void PW0(List<? extends C869590Y9l> list) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final boolean LJ() {
        boolean zLJIIIZ = this.LL.LJIIIZ();
        boolean zLJJJJI = this.LL.LJJJJI();
        boolean z = false;
        if (!zLJIIIZ || zLJJJJI) {
            return false;
        }
        List<C869590Y9l> listLIZLLL = this.LL.LIZLLL();
        if (listLIZLLL == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        if (listLIZLLL.isEmpty()) {
            return true;
        }
        C869590Y9l c869590Y9lLJIIIIZZ = this.LL.LJIIIIZZ();
        Iterator<C869590Y9l> it2 = listLIZLLL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!Intrinsics.LJFF(it2.next().getUuid(), c869590Y9lLJIIIIZZ != null ? c869590Y9lLJIIIIZZ.getUuid() : null)) {
                i++;
            } else if (i != -1) {
                z = true;
            }
        }
        return !z;
    }

    public final void LJFF() {
        if (this.LLILZIL) {
            boolean zLJIIIZ = this.LL.LJIIIZ();
            if (this.LLILLJJLI) {
                SystemClock.elapsedRealtime();
                C1758606ue.LIZ(this.LLILZLL);
                C0YNP.LIZIZ(this.LLILLL).LJIJJLI(null);
                return;
            }
            C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(this.LLILLL);
            C0Y8T c0y8tLJ = c866530Xz1LIZIZ.LJ();
            if (c0y8tLJ != null && !c0y8tLJ.isTemp() && c0y8tLJ.getConversationShortId() > 0) {
                SystemClock.elapsedRealtime();
                C1758606ue.LIZ(this.LLILZLL);
                if (zLJIIIZ) {
                    return;
                }
                c866530Xz1LIZIZ.LJIJJLI(null);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startMarkReadReal conversation not prepared: ");
            sbLIZ.append(c0y8tLJ != null ? Boolean.valueOf(c0y8tLJ.isTemp()) : null);
            sbLIZ.append(", ");
            sbLIZ.append(c0y8tLJ != null ? Long.valueOf(c0y8tLJ.getConversationShortId()) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC892260YzQ
    public final void C() {
        if (LJ()) {
            return;
        }
        sendEmptyMessageDelayed(0, 1000L);
        this.LLILZLL = 1000L;
    }

    @Override // X.InterfaceC892260YzQ
    public final void T20() {
        if (LJ()) {
            return;
        }
        this.LLILZ = true;
        sendEmptyMessageDelayed(0, 2000L);
        this.LLILZLL = 2000L;
    }

    @Override // X.InterfaceC892260YzQ
    public final void lz0() {
        if (LJ()) {
            return;
        }
        sendEmptyMessageDelayed(0, 1000L);
        this.LLILZLL = 1000L;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("ReadStateMarkDelegate@9bd6.handleMessage");
        if (message.what == 0) {
            removeMessages(0);
            if (this.LLILZ) {
                LJFF();
            }
            this.LLILZ = false;
        }
        C1C7U.LIZIZ("ReadStateMarkDelegate@9bd6.handleMessage");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        if (!LJ()) {
            LJFF();
        }
        this.LLILZIL = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LLILZIL = true;
        if (LJ()) {
            return;
        }
        LJFF();
    }

    public ReadStateMarkDelegate(InterfaceC1755906uD interfaceC1755906uD, boolean z) {
        super(Looper.getMainLooper());
        this.LL = interfaceC1755906uD;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1755906uD.getConversationId();
        this.LLILZIL = true;
    }
}
