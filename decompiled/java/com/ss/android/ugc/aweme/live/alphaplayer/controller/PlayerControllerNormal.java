package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import X.C0VSJ;
import X.C1292170jjL;
import X.C1602160rnK;
import X.C2188811AlT;
import X.C2246831Cwr;
import X.C2246881Cww;
import X.C2246901Cwy;
import X.C2247081CxG;
import X.C2247311Cxd;
import X.C786410Ut5;
import X.EnumC2246911Cwz;
import X.InterfaceC1292160jjK;
import X.InterfaceC2247141CxM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* JADX INFO: loaded from: classes35.dex */
public class PlayerControllerNormal implements IPlayerController, GenericLifecycleObserver {
    public long LL;
    public boolean LLILLJJLI;
    public Context LLILZ;
    public IMonitor LLILZIL;
    public AlphaPlayerAction LLILZLL;
    public IMediaPlayer<AbsPlayer<AbsPlayer>> LLIZ;
    public C1292170jjL LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public EnumC2246911Cwz LLILLL = EnumC2246911Cwz.NOT_PREPARED;
    public final C2246831Cwr LLJILJILJ = new IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cwr
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
        public final void onPrepared(AbsPlayer<AbsPlayer> absPlayer) {
            try {
                this.LIZ.LIZJ();
                PlayerControllerNormal playerControllerNormal = this.LIZ;
                playerControllerNormal.LLILLL = EnumC2246911Cwz.PREPARED;
                playerControllerNormal.startPlay();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZ();
                PlayerControllerNormal playerControllerNormal2 = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start video failure:");
                sbLIZ.append(Log.getStackTraceString(e));
                playerControllerNormal2.LIZIZ(false, 0, 0, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    };
    public final C2246901Cwy LLJILLL = new IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cwy
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
        public final void onError(AbsPlayer<AbsPlayer> absPlayer, int i, int i2, String str) {
            PlayerControllerNormal playerControllerNormal = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mediaPlayer error, info:");
            sbLIZ.append(str);
            playerControllerNormal.LIZIZ(false, i, i2, C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.LIZ();
        }
    };

    public final void LIZ() {
        this.LLILLJJLI = false;
        this.LL = 0L;
        AlphaPlayerAction alphaPlayerAction = this.LLILZLL;
        if (alphaPlayerAction != null) {
            alphaPlayerAction.endAction();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void cancel() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getCurFrame() {
        return 0;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMask(MaskSrc maskSrc) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final /* synthetic */ void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK) {
        C2247081CxG.LIZ(this, null);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setPrepareListener(InterfaceC2247141CxM interfaceC2247141CxM) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setProgressListener(IProgressListener iProgressListener, long j) {
    }

    public final void LIZJ() {
        if (this.LLJILJIL <= 0) {
            VideoInfo videoInfo = this.LLIZ.getVideoInfo();
            this.LLJI = videoInfo.getVideoWidth() / 2;
            this.LLJIJIL = videoInfo.getVideoHeight();
        }
        this.LLIZLLLIL.LIZLLL(this.LLJI, this.LLJIJIL);
        DataSource.ScaleType scaleType = this.LLIZLLLIL.getScaleType();
        AlphaPlayerAction alphaPlayerAction = this.LLILZLL;
        if (alphaPlayerAction != null) {
            alphaPlayerAction.onVideoSizeChange(this.LLJI, this.LLJIJIL, scaleType);
        }
    }

    public final void LIZLLL() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer == null) {
            return;
        }
        EnumC2246911Cwz enumC2246911Cwz = this.LLILLL;
        if (enumC2246911Cwz == EnumC2246911Cwz.NOT_PREPARED || enumC2246911Cwz == EnumC2246911Cwz.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.LLJILJILJ);
            this.LLIZ.setOnErrorListener(this.LLJILLL);
            this.LLIZ.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer == null) {
            return -1;
        }
        try {
            return iMediaPlayer.getVideoInfo().getDuration();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final String getPlayerType() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        return iMediaPlayer != null ? iMediaPlayer.getPlayerSimpleName() : "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        return iMediaPlayer != null && iMediaPlayer.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void pause() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer == null || this.LLILLL != EnumC2246911Cwz.STARTED) {
            return;
        }
        iMediaPlayer.pause();
        this.LLILLL = EnumC2246911Cwz.PAUSED;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void release() {
        this.LLIZLLLIL.onPause();
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer == null) {
            this.LLILLL = EnumC2246911Cwz.NOT_PREPARED;
            return;
        }
        if (this.LLILLL == EnumC2246911Cwz.STARTED) {
            iMediaPlayer.pause();
            this.LLILLL = EnumC2246911Cwz.PAUSED;
        }
        if (this.LLILLL == EnumC2246911Cwz.PAUSED) {
            this.LLIZ.stop();
            this.LLILLL = EnumC2246911Cwz.STOPPED;
        }
        this.LLIZ.release();
        this.LLIZLLLIL.release();
        this.LLILLL = EnumC2246911Cwz.RELEASE;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void reset() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.LLILLL = EnumC2246911Cwz.NOT_PREPARED;
            this.LLILLJJLI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void resume() {
        if (this.LLILLJJLI) {
            startPlay();
        } else if (this.LLJ) {
            this.LLJ = false;
            LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startPlay() {
        if (this.LLIZ != null) {
            int i = C2246881Cww.LIZ[this.LLILLL.ordinal()];
            if (i == 1) {
                this.LLIZ.start();
                this.LLILLJJLI = true;
                this.LLILLL = EnumC2246911Cwz.STARTED;
                AlphaPlayerAction alphaPlayerAction = this.LLILZLL;
                if (alphaPlayerAction != null) {
                    alphaPlayerAction.startAction();
                    return;
                }
                return;
            }
            if (i == 2) {
                this.LLIZ.start();
                this.LLILLL = EnumC2246911Cwz.STARTED;
            } else if (i == 3 || i == 4) {
                try {
                    LIZLLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(false, 0, 0, "prepare and start MediaPlayer failure.");
                    LIZ();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void stop() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer != null) {
            EnumC2246911Cwz enumC2246911Cwz = this.LLILLL;
            if (enumC2246911Cwz == EnumC2246911Cwz.STARTED || enumC2246911Cwz == EnumC2246911Cwz.PAUSED) {
                iMediaPlayer.pause();
                this.LLILLL = EnumC2246911Cwz.PAUSED;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final View getView() {
        return this.LLIZLLLIL;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        release();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        resume();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        stop();
    }

    public final void LJ(DataSource dataSource) {
        String path;
        this.LLIZ.reset();
        this.LLILLL = EnumC2246911Cwz.NOT_PREPARED;
        int i = this.LLILZ.getResources().getConfiguration().orientation;
        DataSource.DataInfo dataInfo = dataSource.getDataInfo(i);
        if (dataInfo != null && !TextUtils.isEmpty(dataInfo.getPath()) && new C0VSJ(dataInfo.getPath()).exists()) {
            this.LLIZLLLIL.setConfigParams(dataInfo);
            this.LLIZ.setDataSource(dataInfo.getPath());
            this.LLJI = dataInfo.getActualWidth();
            this.LLJIJIL = dataInfo.getActualHeight();
            this.LLJILJIL = dataInfo.getVersion();
            if (this.LLIZLLLIL.LL) {
                LIZLLL();
                return;
            } else {
                this.LLJ = true;
                return;
            }
        }
        if (1 == i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dataPath is empty or File is not exists. path: ");
            if (dataInfo == null) {
                path = "null";
            } else {
                path = dataInfo.getPath();
            }
            sbLIZ.append(path);
            LIZIZ(false, 0, 0, C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void attachAlphaView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LLIZLLLIL.getParent();
        if (viewGroup2 != null) {
            C786410Ut5.LJJJLZIJ(this.LLIZLLLIL, viewGroup2);
        }
        if (viewGroup.indexOfChild(this.LLIZLLLIL) == -1) {
            viewGroup.addView(this.LLIZLLLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void detachAlphaView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLIZLLLIL, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMonitor(IMonitor iMonitor) {
        this.LLILZIL = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setSurface(Surface surface) {
        this.LLIZ.setSurface(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setVisibility(int i) {
        C1292170jjL c1292170jjL = this.LLIZLLLIL;
        int visibility = c1292170jjL.getVisibility();
        c1292170jjL.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1292170jjL);
        if (i == 0) {
            this.LLIZLLLIL.bringToFront();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void start(DataSource dataSource) {
        startWithLastFrameHold(dataSource, false);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.LLILZLL = alphaPlayerAction;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startWithLastFrameHold(DataSource dataSource, boolean z) {
        this.LLIZLLLIL.setLastFrameHold(z);
        this.LL = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            try {
                LJ(dataSource);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("alphaVideoView set dataSource failure:");
                sbLIZ.append(Log.getStackTraceString(e));
                LIZIZ(false, 0, 0, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dataSource is invalid. ErrorInfo: ");
        sbLIZ2.append(dataSource.getErrorInfo());
        LIZIZ(false, 0, 0, C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Cwr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Cwy] */
    public PlayerControllerNormal(Context context, LifecycleOwner lifecycleOwner, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer) {
        String playerSimpleName;
        this.LLILZ = context;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLIZLLLIL = new C1292170jjL(this.LLILZ);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        C1292170jjL c1292170jjL = this.LLIZLLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1292170jjL);
        c1292170jjL.setLayoutParams(layoutParams);
        this.LLIZLLLIL.setPlayerController(this);
        C1292170jjL c1292170jjL2 = this.LLIZLLLIL;
        c1292170jjL2.setVideoRenderer(new C2247311Cxd(c1292170jjL2));
        if (iMediaPlayer == null) {
            this.LLIZ = new DefaultSystemPlayer();
        } else {
            this.LLIZ = iMediaPlayer;
        }
        try {
            this.LLIZ.initMediaPlayer();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IMonitor iMonitor = this.LLILZIL;
            if (iMonitor != null) {
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2 = this.LLIZ;
                if (iMediaPlayer2 != null) {
                    playerSimpleName = iMediaPlayer2.getPlayerSimpleName();
                } else {
                    playerSimpleName = "unknown";
                }
                iMonitor.monitorInit(playerSimpleName, e);
            }
            DefaultSystemPlayer defaultSystemPlayer = new DefaultSystemPlayer();
            defaultSystemPlayer.initMediaPlayer();
            this.LLIZ = defaultSystemPlayer;
        }
        this.LLIZ.setScreenOnWhilePlaying(true);
        this.LLIZ.setLooping(false);
        this.LLIZ.setOnFirstFrameListener(new IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cx4
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
            public final void onFirstFrame(AbsPlayer<AbsPlayer> absPlayer) {
                this.LIZ.LLIZLLLIL.LJII();
            }
        });
        this.LLIZ.setOnCompletionListener(new IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cx0
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(AbsPlayer<AbsPlayer> absPlayer) {
                this.LIZ.LLIZLLLIL.onCompletion();
                PlayerControllerNormal playerControllerNormal = this.LIZ;
                playerControllerNormal.LLILLL = EnumC2246911Cwz.PAUSED;
                playerControllerNormal.LIZIZ(true, 0, 0, null);
                this.LIZ.LIZ();
            }
        });
    }

    public final void LIZIZ(boolean z, int i, int i2, String str) {
        String playerSimpleName;
        IMonitor iMonitor = this.LLILZIL;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LLIZ;
        if (iMediaPlayer != null) {
            playerSimpleName = iMediaPlayer.getPlayerSimpleName();
        } else {
            playerSimpleName = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", messageId: ");
        sbLIZ.append(this.LL);
        iMonitor.monitor(z, playerSimpleName, i, i2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
