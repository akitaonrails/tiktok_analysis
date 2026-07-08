package com.ss.android.ugc.aweme.inbox.bulletin.music;

import X.C01GW;
import X.C0OR7;
import X.C14EU;
import X.C15KZ;
import X.C20498815Ja;
import X.C20501715Kd;
import X.C20501815Ke;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C7854034y;
import X.InterfaceC20501915Kf;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes32.dex */
public final class LifecycleMusicPlayer implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public Music LL;
    public final InterfaceC20501915Kf LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public C0OR7 LLILZIL;
    public float LLILZLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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

    public final C20498815Ja LIZ() {
        return (C20498815Ja) this.LLILLL.getValue();
    }

    public final void LIZIZ() {
        LIZ().pause();
        if (this.LLILZ) {
            this.LLILZ = false;
            this.LLILLJJLI.LIZJ(this.LL, this.LLILZLL, false);
        }
    }

    public LifecycleMusicPlayer(Music music) {
        C20501815Ke c20501815Ke = C20501715Kd.LIZ;
        this.LL = music;
        this.LLILLJJLI = c20501815Ke;
        this.LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1449));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        EventBus.LIZLLL().LJIJJ(this);
        Music music = this.LL;
        this.LL = music;
        this.LLILZ = true;
        this.LLILZIL = null;
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C15KZ(music, this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        EventBus.LIZLLL().LJJI(this);
        this.LLILZ = false;
        this.LLILZIL = null;
        LIZ().release();
        this.LLILLJJLI.LJ();
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @C14EU
    public final void onEvent(C7854034y c7854034y) {
        int i = c7854034y.LIZJ;
        if (i == 4) {
            LIZ().pause();
            if (this.LLILZ) {
                this.LLILZ = false;
                this.LLILLJJLI.LIZJ(this.LL, this.LLILZLL, false);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this.LLILZ = false;
        this.LLILZIL = null;
        LIZ().release();
        this.LLILLJJLI.LJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        LIZ().pause();
        if (this.LLILZ) {
            this.LLILZ = false;
            this.LLILLJJLI.LIZJ(this.LL, this.LLILZLL, false);
        }
    }
}
