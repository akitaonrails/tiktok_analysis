package com.ss.android.ugc.gamora.editorpro.capabilities.text.tts;

import X.C11Z3;
import X.C19EG;
import X.C201955140j;
import X.C201962140q;
import X.C786410Ut5;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.media.MediaPlayer;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes30.dex */
public class EditRepeatMusicPlayer implements GenericLifecycleObserver {
    public MediaPlayer LL;
    public ARunnableS40S0101000_29 LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS129S0100000_29 LLILZIL = new ARunnableS129S0100000_29(this, 111);
    public C11Z3 LLILZLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        C201955140j.LIZJ(C201962140q.LIZIZ, "stopMusic() called");
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.LL.pause();
            }
            this.LL.stop();
            this.LL.release();
            this.LL = null;
        }
        this.LLILZLL = null;
        this.LLILZ.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLILLL.removeCallbacksAndMessages(null);
        this.LLILZ.removeCallbacksAndMessages(null);
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LL.pause();
        }
        this.LLILZ.removeCallbacksAndMessages(null);
    }

    public final void LIZ(int i) {
        C201955140j.LIZJ(C201962140q.LIZIZ, "playMusic() called");
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LL.pause();
        }
        ARunnableS40S0101000_29 aRunnableS40S0101000_29 = this.LLILLJJLI;
        if (aRunnableS40S0101000_29 != null) {
            this.LLILLL.removeCallbacks(aRunnableS40S0101000_29);
        }
        this.LLILLJJLI = new ARunnableS40S0101000_29(this, i, 19);
        this.LL.seekTo(i);
        this.LL.start();
        ARunnableS129S0100000_29 aRunnableS129S0100000_29 = this.LLILZIL;
        if (aRunnableS129S0100000_29 != null) {
            this.LLILZ.removeCallbacks(aRunnableS129S0100000_29);
        }
        C786410Ut5.LJJZZIII(this.LLILZ, this.LLILZIL);
    }

    public EditRepeatMusicPlayer(C19EG c19eg, String str) {
        c19eg.getLifecycle().addObserver(this);
        try {
            MediaPlayer mediaPlayerCreate = MediaPlayer.create(c19eg, UriProtector.parse(str));
            this.LL = mediaPlayerCreate;
            if (mediaPlayerCreate != null) {
                mediaPlayerCreate.setAudioStreamType(3);
                this.LL.setDisplay(null);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
