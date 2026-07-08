package com.ss.android.ugc.musicprovider.provider;

import X.C086I;
import X.C0PDN;
import X.C0VSJ;
import X.C1485060okS;
import X.C1487610ooZ;
import X.C1490520otG;
import X.C1492570owZ;
import X.C15K5;
import X.C201955140j;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2354709Kn;
import X.C786410Ut5;
import X.InterfaceC1475840oVa;
import X.InterfaceC1485080okU;
import X.InterfaceC1485090okV;
import X.InterfaceC1485100okW;
import X.InterfaceC1485110okX;
import X.InterfaceC1485120okY;
import X.InterfaceC20499215Je;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.musicprovider.provider.MusicPlayer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicPlayer implements InterfaceC20499215Je, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, GenericLifecycleObserver {
    public final Context LL;
    public Long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1485120okY LLIZ;
    public InterfaceC1485110okX LLIZLLLIL;
    public InterfaceC1485100okW LLJ;
    public InterfaceC1485080okU LLJI;
    public MediaPlayer LLJIJIL;
    public C15K5 LLJILJIL;
    public long LLJILJILJ;
    public C1485060okS LLJILLL;
    public String LLJJ;
    public boolean LLJJIJI;
    public final String LLILLJJLI = "";
    public long LLILLL = -1;
    public int LLJJI;
    public int LLJJIII = this.LLJJI;
    public final BPEAHandler LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS131S0100000_31 LLJJIJIL = new ARunnableS131S0100000_31(this, 126);
    public final ARunnableS131S0100000_31 LLJJJ = new ARunnableS131S0100000_31(this, 125);

    @Override // X.InterfaceC20499215Je
    public final void LIZLLL(C0PDN c0pdn) {
    }

    @Override // X.InterfaceC20499215Je
    public final int LJI() {
        int currentPosition = 0;
        try {
            MediaPlayer mediaPlayer = this.LLJIJIL;
            if (mediaPlayer != null) {
                currentPosition = mediaPlayer.getCurrentPosition();
                return currentPosition;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof IllegalStateException) {
                C201955140j.LIZIZ("MediaPlayer", "call curPlayTime on illegal state");
            }
        }
        return currentPosition;
    }

    @Override // X.InterfaceC20499215Je
    public final void LJIILLIIL(float f, float f2) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            submitBackground();
        }
    }

    @Override // X.InterfaceC20499215Je
    public final int K2() {
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public final void LJIIJJI() {
        C15K5 c15k5 = this.LLJILJIL;
        if (c15k5 != null) {
            c15k5.cancel();
        }
    }

    public final void LJIIL() {
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJIJIL);
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
            C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, this.LLJJJ);
            C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, this.LLJJIJIL);
            mediaPlayer.start();
        }
    }

    @Override // X.InterfaceC20499215Je
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC20499215Je
    public final void pause() {
        try {
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJIJIL);
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
            LJIIJJI();
            this.LLILZIL = true;
            MediaPlayer mediaPlayer = this.LLJIJIL;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            MediaPlayer mediaPlayer2 = this.LLJIJIL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
            LJIILIIL("pause");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 124));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void stop() {
        try {
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJIJIL);
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
            LJIIJJI();
            this.LLILZLL = true;
            MediaPlayer mediaPlayer = this.LLJIJIL;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            MediaPlayer mediaPlayer2 = this.LLJIJIL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
            LJIILIIL("stop");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 125));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void submitBackground() {
        LJIILIIL("background");
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 126));
    }

    public final void LJIIJ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJILJ;
        C1485060okS c1485060okS = this.LLJILLL;
        if (c1485060okS != null) {
            List<String> list = c1485060okS.LIZIZ;
            C1487610ooZ.LIZIZ(jElapsedRealtime, list != null ? list.toString() : null, this.LLJJ, this.LLILLJJLI);
            C1492570owZ c1492570owZ = C1492570owZ.LIZ;
            String str = c1485060okS.LJFF;
            List<String> list2 = c1485060okS.LIZIZ;
            String string = list2 != null ? list2.toString() : null;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLJJ;
            Long lValueOf = Long.valueOf(jElapsedRealtime);
            c1492570owZ.getClass();
            C1492570owZ.LJFF(lValueOf, str, string, str2, str3);
        }
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            pause();
            int i = this.LLJJI;
            if (i < 0) {
                i = 0;
            }
            this.LLJJI = i;
            int i2 = this.LLJJIII;
            if (i2 <= i || i2 >= mediaPlayer.getDuration()) {
                this.LLJJIII = mediaPlayer.getDuration();
            }
            if (this.LLJJI > 0) {
                mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: X.15K7
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                        this.LL.LJIIL();
                        InterfaceC1485120okY interfaceC1485120okY = this.LL.LLIZ;
                        if (interfaceC1485120okY != null) {
                            interfaceC1485120okY.LIZ(4, mediaPlayer2.getDuration());
                        }
                    }
                });
                mediaPlayer.seekTo(this.LLJJI);
                return;
            }
            LJIIL();
            InterfaceC1485120okY interfaceC1485120okY = this.LLIZ;
            if (interfaceC1485120okY != null) {
                interfaceC1485120okY.LIZ(4, mediaPlayer.getDuration());
            }
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void release() {
        try {
            pause();
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJIJIL);
            this.LLJJIJIIJIL.removeCallbacks(this.LLJJJ);
            MediaPlayer mediaPlayer = this.LLJIJIL;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.LLJIJIL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.LLJIJIL = null;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void resume() {
        try {
            LJIIL();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public MusicPlayer(Context context) {
        this.LL = context;
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZ(InterfaceC1485100okW interfaceC1485100okW) {
        this.LLJ = interfaceC1485100okW;
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZIZ(final C1485060okS c1485060okS) {
        String strLJ;
        String str;
        int i = c1485060okS.LJII;
        if (i <= 0) {
            i = 0;
        }
        this.LLJJI = i;
        int i2 = c1485060okS.LJIIIIZZ;
        if (i2 > i) {
            i = i2;
        }
        this.LLJJIII = i;
        this.LLJJIJI = c1485060okS.LJI;
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new MediaPlayer();
        }
        final LinkedList linkedList = new LinkedList();
        if (c1485060okS.LIZIZ != null && (!r0.isEmpty())) {
            C1490520otG c1490520otGLJFF = C1490520otG.LJFF();
            List<String> list = c1485060okS.LIZIZ;
            if (list != null) {
                str = (String) ListProtector.get(list, 0);
            } else {
                str = null;
            }
            strLJ = c1490520otGLJFF.LJ(str, c1485060okS.LJIIJ);
        } else {
            strLJ = "";
        }
        if (!TextUtils.isEmpty(strLJ) && C2354709Kn.LIZIZ(strLJ) && new C0VSJ(strLJ).length() > 0) {
            c1485060okS.LIZ = strLJ;
        }
        if (!TextUtils.isEmpty(c1485060okS.LIZ)) {
            linkedList.add(c1485060okS.LIZ);
        } else if (C086I.LIZIZ(c1485060okS.LIZIZ)) {
            return;
        } else {
            linkedList.addAll(c1485060okS.LIZIZ);
        }
        LJIIJJI();
        this.LLILZIL = false;
        this.LLILZLL = false;
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.15K4
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i3, int i4) {
                    if (C086I.LIZIZ(linkedList)) {
                        this.LJII(i3, i4);
                        return false;
                    }
                    MusicPlayer musicPlayer = this;
                    musicPlayer.LJIIIZ(c1485060okS, linkedList, musicPlayer.LLJJIJI);
                    return false;
                }
            });
        }
        LJIIIZ(c1485060okS, linkedList, this.LLJJIJI);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZJ(InterfaceC1485110okX interfaceC1485110okX) {
        this.LLIZLLLIL = interfaceC1485110okX;
    }

    @Override // X.InterfaceC20499215Je
    public final void LJ(InterfaceC1485120okY interfaceC1485120okY) {
        this.LLIZ = interfaceC1485120okY;
    }

    public final void LJIIIIZZ(Exception exc) {
        String string;
        InterfaceC1485110okX interfaceC1485110okX = this.LLIZLLLIL;
        if (interfaceC1485110okX != null) {
            interfaceC1485110okX.LIZ(0, 0);
        }
        release();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJILJ;
        C1485060okS c1485060okS = this.LLJILLL;
        if (c1485060okS != null) {
            List<String> list = c1485060okS.LIZIZ;
            String string2 = null;
            if (list != null) {
                string = list.toString();
            } else {
                string = null;
            }
            C1487610ooZ.LIZ(-1, string, this.LLJJ, jElapsedRealtime, exc.getMessage(), this.LLILLJJLI);
            C1492570owZ c1492570owZ = C1492570owZ.LIZ;
            String str = c1485060okS.LJFF;
            List<String> list2 = c1485060okS.LIZIZ;
            if (list2 != null) {
                string2 = list2.toString();
            }
            String str2 = this.LLILLJJLI;
            String str3 = this.LLJJ;
            String message = exc.getMessage();
            c1492570owZ.getClass();
            C1492570owZ.LIZLLL(str, string2, str2, str3, message);
        }
    }

    public final void LJIILIIL(String str) {
        String str2;
        if (this.LLILLL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            C1492570owZ c1492570owZ = C1492570owZ.LIZ;
            C1485060okS c1485060okS = this.LLJILLL;
            Integer numValueOf = null;
            if (c1485060okS != null) {
                str2 = c1485060okS.LJFF;
            } else {
                str2 = null;
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            String str3 = this.LLILLJJLI;
            C1485060okS c1485060okS2 = this.LLJILLL;
            if (c1485060okS2 != null) {
                numValueOf = Integer.valueOf(c1485060okS2.LIZLLL);
            }
            String str4 = this.LLJJ;
            c1492570owZ.getClass();
            if (numValueOf == null || numValueOf.intValue() != 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("music_id", str2);
                c2344009Gk.LJ(lValueOf, "stall_time");
                c2344009Gk.LJIIIIZZ("enter_from", str3);
                c2344009Gk.LJ(numValueOf, "time");
                c2344009Gk.LJIIIIZZ("url", str4);
                c2344009Gk.LJIIIIZZ("submit_point", str);
                C20684815ws.LJIILLIIL("audio_stall_time", c2344009Gk.LIZ);
            }
            this.LLILLL = -1L;
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void Of(InterfaceC1485080okU interfaceC1485080okU) {
        this.LLJI = interfaceC1485080okU;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i;
        MediaPlayer mediaPlayer2;
        InterfaceC1485100okW interfaceC1485100okW = this.LLJ;
        if (interfaceC1485100okW != null) {
            interfaceC1485100okW.LIZIZ();
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 122));
        if (this.LLJJIJI && (i = this.LLJJI) > 0 && (mediaPlayer2 = this.LLJIJIL) != null) {
            mediaPlayer2.seekTo(i);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        String str;
        try {
            try {
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                release();
                LJIIIIZZ(e);
            }
            if (!this.LLILZIL && !this.LLILZLL) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 123));
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ.longValue();
                C1492570owZ c1492570owZ = C1492570owZ.LIZ;
                C1485060okS c1485060okS = this.LLJILLL;
                Integer numValueOf = null;
                if (c1485060okS != null) {
                    str = c1485060okS.LJFF;
                } else {
                    str = null;
                }
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                String str2 = this.LLILLJJLI;
                C1485060okS c1485060okS2 = this.LLJILLL;
                if (c1485060okS2 != null) {
                    numValueOf = Integer.valueOf(c1485060okS2.LIZLLL);
                }
                String str3 = this.LLJJ;
                c1492570owZ.getClass();
                C1492570owZ.LJI(numValueOf, str, str2, lValueOf, str3);
                this.LLILLL = -1L;
                LJIIJ();
                LJIIJJI();
                return;
            }
            LJIIJJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIJJI();
            throw th;
        }
    }

    public final void LJII(int i, int i2) {
        String string;
        InterfaceC1485110okX interfaceC1485110okX = this.LLIZLLLIL;
        if (interfaceC1485110okX != null) {
            interfaceC1485110okX.LIZ(i, i2);
        }
        release();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJILJ;
        C1485060okS c1485060okS = this.LLJILLL;
        if (c1485060okS != null) {
            List<String> list = c1485060okS.LIZIZ;
            String string2 = null;
            if (list != null) {
                string = list.toString();
            } else {
                string = null;
            }
            C1487610ooZ.LIZ(i, string, this.LLJJ, jElapsedRealtime, String.valueOf(i2), this.LLILLJJLI);
            C1492570owZ c1492570owZ = C1492570owZ.LIZ;
            String str = c1485060okS.LJFF;
            List<String> list2 = c1485060okS.LIZIZ;
            if (list2 != null) {
                string2 = list2.toString();
            }
            String str2 = this.LLILLJJLI;
            String str3 = this.LLJJ;
            String strValueOf = String.valueOf(i2);
            c1492570owZ.getClass();
            C1492570owZ.LIZLLL(str, string2, str2, str3, strValueOf);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void Nf(int i, final InterfaceC1485090okV interfaceC1485090okV) {
        MediaPlayer mediaPlayer = this.LLJIJIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: X.15K8
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                    this.LL.LJIIL();
                    InterfaceC1485090okV interfaceC1485090okV2 = interfaceC1485090okV;
                    if (interfaceC1485090okV2 != null) {
                        interfaceC1485090okV2.LJII(true);
                    }
                }
            });
        }
        MediaPlayer mediaPlayer2 = this.LLJIJIL;
        if (mediaPlayer2 != null) {
            mediaPlayer2.seekTo(i);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void LJFF(String str, String str2, InterfaceC1475840oVa interfaceC1475840oVa) {
        interfaceC1475840oVa.LIZIZ(-1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15K5, android.os.CountDownTimer] */
    public final void LJIIIZ(final C1485060okS c1485060okS, final LinkedList linkedList, final boolean z) {
        MediaPlayer mediaPlayer;
        String string;
        if (this.LLILZIL || this.LLILZLL || (mediaPlayer = this.LLJIJIL) == null) {
            return;
        }
        try {
            this.LLJILLL = c1485060okS;
            ?? r0 = new CountDownTimer() { // from class: X.15K5
                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    if (C086I.LIZIZ(linkedList)) {
                        this.LJII(0, 0);
                        return;
                    }
                    this.LJIIIZ(c1485060okS, linkedList, z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(30000L, 1000L);
                }
            };
            this.LLJILJIL = r0;
            r0.start();
            String str = (String) linkedList.poll();
            this.LLJJ = str;
            Uri uri = UriProtector.parse(str);
            mediaPlayer.stop();
            mediaPlayer.reset();
            this.LLJILJILJ = SystemClock.elapsedRealtime();
            mediaPlayer.setAudioStreamType(3);
            HashMap<String, String> map = c1485060okS.LJ;
            if (map != null) {
                mediaPlayer.setDataSource(this.LL, uri, map);
            } else {
                mediaPlayer.setDataSource(this.LL, uri);
            }
            mediaPlayer.setLooping(z);
            C1492570owZ c1492570owZ = C1492570owZ.LIZ;
            String str2 = c1485060okS.LJFF;
            List<String> list = c1485060okS.LIZIZ;
            if (list != null) {
                string = list.toString();
            } else {
                string = null;
            }
            String str3 = this.LLILLJJLI;
            String str4 = this.LLJJ;
            Long lValueOf = Long.valueOf(c1485060okS.LIZLLL);
            c1492570owZ.getClass();
            C1492570owZ.LJ(lValueOf, str2, string, str3, str4);
            this.LLILZ = Long.valueOf(System.currentTimeMillis());
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnInfoListener(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            release();
            LJIIIIZZ(e);
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 701) {
            this.LLILLL = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return true;
        }
        LJIILIIL("buffering_end");
        return true;
    }
}
