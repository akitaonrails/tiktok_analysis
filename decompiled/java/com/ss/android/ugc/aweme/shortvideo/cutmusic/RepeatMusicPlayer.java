package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import X.C1399580mWa;
import X.C15K3;
import X.C201955140j;
import X.C201962140q;
import X.C786410Ut5;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS42S0101000_31;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;

/* JADX INFO: loaded from: classes32.dex */
public class RepeatMusicPlayer implements GenericLifecycleObserver {
    public MediaPlayer LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public ARunnableS42S0101000_31 LLILZIL;
    public C15K3 LLIZ;
    public Scene LLJI;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS131S0100000_31 LLJ = new ARunnableS131S0100000_31(this, 85);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public void LIZJ() {
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
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLILZLL.removeCallbacksAndMessages(null);
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        LIZJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LL.pause();
        }
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
    }

    public void LIZ(Context context, Uri uri) {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, uri);
        this.LL = mediaPlayerCreate;
        if (mediaPlayerCreate != null) {
            mediaPlayerCreate.setAudioStreamType(3);
            this.LL.setDisplay(null);
            this.LL.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.15K2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    RepeatMusicPlayer repeatMusicPlayer = this.LL;
                    C15K3 c15k3 = repeatMusicPlayer.LLIZ;
                    if (c15k3 != null) {
                        c15k3.LIZIZ++;
                    }
                    repeatMusicPlayer.LIZIZ(repeatMusicPlayer.LLILLJJLI, repeatMusicPlayer.LLILLL);
                }
            });
        }
    }

    public void LIZIZ(int i, int i2) {
        this.LLILLJJLI = i;
        C201955140j.LIZJ(C201962140q.LIZIZ, "playMusic() called");
        if (this.LL == null) {
            return;
        }
        if (C1399580mWa.LIZ()) {
            if (i2 == 0) {
                this.LLILLL = this.LL.getDuration();
            } else {
                this.LLILLL = i2;
            }
        }
        if (this.LL.isPlaying()) {
            this.LL.pause();
        }
        ARunnableS42S0101000_31 aRunnableS42S0101000_31 = this.LLILZIL;
        if (aRunnableS42S0101000_31 != null) {
            this.LLILZLL.removeCallbacks(aRunnableS42S0101000_31);
        }
        this.LLILZIL = new ARunnableS42S0101000_31(i, this, 5);
        this.LL.seekTo(i);
        int i3 = this.LLILZ;
        if (i3 != 0) {
            C786410Ut5.LJLIIL(i3, this.LLILZLL, this.LLILZIL);
        }
        this.LL.start();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLJ;
        if (aRunnableS131S0100000_31 != null) {
            this.LLIZLLLIL.removeCallbacks(aRunnableS131S0100000_31);
        }
        C786410Ut5.LJJZZIII(this.LLIZLLLIL, this.LLJ);
    }

    public RepeatMusicPlayer(int i, Scene scene, String str) {
        this.LLILZ = i;
        scene.getLifecycle().addObserver(this);
        LIZ(scene.requireSceneContext(), UriProtector.parse(str));
    }
}
