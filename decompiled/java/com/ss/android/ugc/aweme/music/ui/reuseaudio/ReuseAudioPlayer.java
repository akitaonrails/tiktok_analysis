package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.C15MS;
import X.C20498815Ja;
import X.InterfaceC1485080okU;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes32.dex */
public final class ReuseAudioPlayer implements GenericLifecycleObserver {
    public final C20498815Ja LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LL.isPlaying()) {
            this.LL.pause();
        }
        this.LL.release();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.LL.isPlaying()) {
            this.LL.pause();
        }
    }

    public ReuseAudioPlayer(LifecycleOwner lifecycleOwner, final C15MS c15ms) {
        lifecycleOwner.getLifecycle().addObserver(this);
        C20498815Ja c20498815Ja = new C20498815Ja("ReuseAudioDetailFragment");
        this.LL = c20498815Ja;
        c20498815Ja.LIZ(new InterfaceC1485100okW() { // from class: X.15LL
            @Override // X.InterfaceC1485100okW
            public final void LIZIZ() {
                c15ms.LJJIJIIJIL();
            }
        });
        c20498815Ja.LIZJ(new InterfaceC1485110okX() { // from class: X.15LM
            @Override // X.InterfaceC1485110okX
            public final void LIZ(int i, int i2) {
                c15ms.LIZ();
            }
        });
        c20498815Ja.LJ(new InterfaceC1485120okY() { // from class: X.15LO
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                c15ms.onPlay();
            }
        });
        c20498815Ja.Of(new InterfaceC1485080okU() { // from class: X.15LK
            @Override // X.InterfaceC1485080okU
            public final void LIZ(float f, int i) {
                c15ms.LIZIZ();
            }
        });
    }
}
