package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import X.C0VSJ;
import X.C0WZX;
import X.C1292130jjH;
import X.C1292170jjL;
import X.C12MH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2246821Cwq;
import X.C2246871Cwv;
import X.C2247081CxG;
import X.C2247301Cxc;
import X.C2247311Cxd;
import X.C786410Ut5;
import X.EnumC2246911Cwz;
import X.InterfaceC1292140jjI;
import X.InterfaceC1292160jjK;
import X.InterfaceC2246811Cwp;
import X.InterfaceC2247121CxK;
import X.InterfaceC2247141CxM;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class PlayerController implements IPlayerController, Handler.Callback, GenericLifecycleObserver {
    public AlphaPlayerAction alphaPlayerAction;
    public InterfaceC2246811Cwp alphaVideoView;
    public Context context;
    public InterfaceC2247141CxM customPrepareListener;
    public InterfaceC2247121CxK firstGLFrameListener;
    public boolean isIntentPrepare;
    public boolean isLooping;
    public boolean isPlaying;
    public IMediaPlayer<AbsPlayer<AbsPlayer>> mediaPlayer;
    public long messageId;
    public IMonitor monitor;
    public HandlerThread playThread;
    public Handler workHandler;
    public List<MaskSrc> masks = new ArrayList();
    public EnumC2246911Cwz state = EnumC2246911Cwz.NOT_PREPARED;
    public Handler mainHandler = new BPEAHandler(Looper.getMainLooper());
    public int actualWidth = 0;
    public int actualHeight = 0;
    public int version = 0;
    public int totalFrame = 0;
    public volatile boolean isAttached = false;
    public boolean autoRelease = true;
    public final C2246821Cwq progressHelper = new C2246821Cwq();
    public LifecycleOwner owner = null;
    public IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>> preparedListener = new IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cx3
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
        public final void onPrepared(AbsPlayer<AbsPlayer> absPlayer) {
            this.LIZ.sendMessage(PlayerController.getMessage(2, null));
        }
    };
    public IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>> errorListener = new IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cwx
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
        public final void onError(AbsPlayer<AbsPlayer> absPlayer, int i, int i2, String str) {
            PlayerController playerController = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mediaPlayer error, info:");
            sbLIZ.append(str);
            playerController.monitor(false, i, i2, C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.emitEndSignal();
        }
    };

    public void emitEndSignal() {
        this.isPlaying = false;
        this.messageId = 0L;
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS134S0100000_34(this, 19));
        this.progressHelper.LIZLLL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        sendMessage(getMessage(6, null));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
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
    public void pause() {
        sendMessage(getMessage(3, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void release() {
        sendMessage(getMessage(6, null));
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.owner = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void resume() {
        sendMessage(getMessage(4, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final /* synthetic */ void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK) {
        C2247081CxG.LIZ(this, null);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setPrepareListener(InterfaceC2247141CxM interfaceC2247141CxM) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void stop() {
        sendMessage(getMessage(5, null));
    }

    private void initMediaPlayer() {
        try {
            this.mediaPlayer.initMediaPlayer();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            monitorInit(e);
            DefaultSystemPlayer defaultSystemPlayer = new DefaultSystemPlayer();
            defaultSystemPlayer.initMediaPlayer();
            this.mediaPlayer = defaultSystemPlayer;
        }
        this.mediaPlayer.setScreenOnWhilePlaying(true);
        this.mediaPlayer.setLooping(this.isLooping);
        this.mediaPlayer.setOnFirstFrameListener(new IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cx2
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
            public final void onFirstFrame(AbsPlayer<AbsPlayer> absPlayer) {
                this.LIZ.alphaVideoView.LJII();
            }
        });
        this.mediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer>>() { // from class: X.1Cws
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(AbsPlayer<AbsPlayer> absPlayer) {
                if (this.LIZ.isAttached && this.LIZ.isLooping) {
                    return;
                }
                PlayerController playerController = this.LIZ;
                if (playerController.autoRelease) {
                    playerController.alphaVideoView.onCompletion();
                    this.LIZ.masks.clear();
                }
                PlayerController playerController2 = this.LIZ;
                playerController2.state = EnumC2246911Cwz.PAUSED;
                playerController2.monitor(true, null);
                this.LIZ.emitEndSignal();
            }
        });
    }

    private void parseVideoSize() {
        if (this.version <= 0) {
            VideoInfo videoInfo = this.mediaPlayer.getVideoInfo();
            this.actualWidth = videoInfo.getVideoWidth() / 2;
            this.actualHeight = videoInfo.getVideoHeight();
        }
        this.alphaVideoView.LIZLLL(this.actualWidth, this.actualHeight);
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS103S0200000_34(this.alphaVideoView.getScaleType(), this, 6));
    }

    private void prepareAsync() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer == null) {
            return;
        }
        EnumC2246911Cwz enumC2246911Cwz = this.state;
        if (enumC2246911Cwz == EnumC2246911Cwz.NOT_PREPARED || enumC2246911Cwz == EnumC2246911Cwz.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.preparedListener);
            this.mediaPlayer.setOnErrorListener(this.errorListener);
            this.mediaPlayer.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void cancel() {
        sendMessage(getMessage(12, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getCurFrame() {
        if (this.mediaPlayer == null || this.totalFrame == 0) {
            return -1;
        }
        float duration = getDuration();
        if (duration <= 0.0f) {
            return -1;
        }
        if (this.mediaPlayer.getCurrentPosition() / duration > 1.0f) {
            return -1;
        }
        return (int) Math.ceil(r1 * this.totalFrame);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
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
    public String getPlayerType() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        return iMediaPlayer != null ? iMediaPlayer.getPlayerSimpleName() : "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public View getView() {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.alphaVideoView;
        if (interfaceC2246811Cwp != null) {
            return interfaceC2246811Cwp.getView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        return iMediaPlayer != null && iMediaPlayer.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void reset() {
        sendMessage(getMessage(9, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startPlay() {
        if (this.mediaPlayer != null) {
            int i = C2246871Cwv.LIZ[this.state.ordinal()];
            if (i == 1) {
                this.mediaPlayer.start();
                this.isPlaying = true;
                this.state = EnumC2246911Cwz.STARTED;
                C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS134S0100000_34(this, 20));
                this.progressHelper.LIZJ();
                return;
            }
            if (i == 2) {
                this.mediaPlayer.start();
                this.state = EnumC2246911Cwz.STARTED;
                this.progressHelper.LIZJ();
            } else if (i == 3 || i == 4) {
                try {
                    prepareAsync();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    monitor(false, "prepare and start MediaPlayer failure.");
                    emitEndSignal();
                }
            }
        }
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

    private int getOrientation(Context context) {
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C2204961BRm.LLILZIL(((Activity) context).getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA3T53owqGRxgc02YKUoOvZQyH7WUuP/1bQH2/fLQ3eMpJ7kAwQyG6", null)).getMetrics(displayMetrics);
            if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                return 1;
            }
            return 2;
        }
        return context.getResources().getConfiguration().orientation;
    }

    private void initPlayer(IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer) {
        if (iMediaPlayer == null) {
            this.mediaPlayer = new DefaultSystemPlayer();
        } else {
            this.mediaPlayer = iMediaPlayer;
        }
        this.progressHelper.LIZ = this.mediaPlayer;
        sendMessage(getMessage(10, null));
    }

    private void monitorInit(Exception exc) {
        String playerSimpleName;
        IMonitor iMonitor = this.monitor;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            playerSimpleName = iMediaPlayer.getPlayerSimpleName();
        } else {
            playerSimpleName = "unknown";
        }
        iMonitor.monitorInit(playerSimpleName, exc);
    }

    private void setDataSource(DataSource dataSource) {
        try {
            setVideoFromFile(dataSource);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            emitEndSignal();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alphaVideoView set dataSource failure:");
            sbLIZ.append(Log.getStackTraceString(e));
            monitor(false, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private void setVideoFromFile(DataSource dataSource) {
        String path;
        if (!this.isAttached) {
            monitor(false, "alphaVideoView is not attach");
            emitEndSignal();
            return;
        }
        this.mediaPlayer.reset();
        this.state = EnumC2246911Cwz.NOT_PREPARED;
        int i = this.context.getResources().getConfiguration().orientation;
        DataSource.DataInfo dataInfo = dataSource.getDataInfo(i);
        if (dataInfo != null && !TextUtils.isEmpty(dataInfo.getPath()) && new C0VSJ(dataInfo.getPath()).exists()) {
            this.alphaVideoView.setConfigParams(dataInfo);
            this.alphaVideoView.LIZ(this.masks);
            this.mediaPlayer.setDataSource(dataInfo.getPath());
            boolean loop = dataSource.getLoop();
            this.isLooping = loop;
            this.mediaPlayer.setLooping(loop);
            this.totalFrame = dataInfo.getTotalFrame();
            this.actualWidth = dataInfo.getActualWidth();
            this.actualHeight = dataInfo.getActualHeight();
            this.version = dataInfo.getVersion();
            this.autoRelease = dataSource.getAutoRelease();
            if (this.alphaVideoView.LIZIZ()) {
                prepareAsync();
                return;
            } else {
                this.isIntentPrepare = true;
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
            monitor(false, C2188811AlT.LIZIZ(sbLIZ));
        }
        emitEndSignal();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void attachAlphaView(ViewGroup viewGroup) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.alphaVideoView;
        if (interfaceC2246811Cwp != null && interfaceC2246811Cwp.LJ(viewGroup)) {
            this.isAttached = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void detachAlphaView(ViewGroup viewGroup) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.alphaVideoView;
        if (interfaceC2246811Cwp != null && interfaceC2246811Cwp.LIZJ(viewGroup)) {
            this.isAttached = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        EnumC2246911Cwz enumC2246911Cwz;
        switch (message.what) {
            case 1:
                if (HandlerHook.getMessageObj(message.obj) instanceof DataSource) {
                    Handler handler = this.workHandler;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    setDataSource((DataSource) HandlerHook.getMessageObj(message.obj));
                    return true;
                }
                return true;
            case 2:
                try {
                    parseVideoSize();
                    this.state = EnumC2246911Cwz.PREPARED;
                    startPlay();
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    emitEndSignal();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start video failure:");
                    sbLIZ.append(Log.getStackTraceString(e));
                    monitor(false, C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            case 3:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
                if (iMediaPlayer != null && this.state == EnumC2246911Cwz.STARTED) {
                    iMediaPlayer.pause();
                    this.progressHelper.LIZLLL();
                    this.state = EnumC2246911Cwz.PAUSED;
                    return true;
                }
                return true;
            case 4:
                if (this.isPlaying) {
                    startPlay();
                    return true;
                }
                if (this.isIntentPrepare) {
                    try {
                        prepareAsync();
                        this.isIntentPrepare = false;
                        return true;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        monitor(false, "RESUME: prepare and start MediaPlayer failure.");
                        emitEndSignal();
                        return true;
                    }
                }
                return true;
            case 5:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2 = this.mediaPlayer;
                if (iMediaPlayer2 != null && ((enumC2246911Cwz = this.state) == EnumC2246911Cwz.STARTED || enumC2246911Cwz == EnumC2246911Cwz.PAUSED)) {
                    iMediaPlayer2.pause();
                    this.progressHelper.LIZLLL();
                    this.state = EnumC2246911Cwz.PAUSED;
                    return true;
                }
                return true;
            case 6:
                this.alphaVideoView.onPause();
                this.progressHelper.LIZLLL();
                C2246821Cwq c2246821Cwq = this.progressHelper;
                c2246821Cwq.LIZ();
                HandlerThread handlerThread = c2246821Cwq.LJ;
                if (handlerThread != null) {
                    handlerThread.quit();
                    c2246821Cwq.LJ = null;
                }
                c2246821Cwq.LIZ = null;
                c2246821Cwq.LIZJ = 500L;
                c2246821Cwq.LIZIZ = C2246821Cwq.LJFF;
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer3 = this.mediaPlayer;
                if (iMediaPlayer3 == null) {
                    this.state = EnumC2246911Cwz.NOT_PREPARED;
                    return true;
                }
                if (this.state == EnumC2246911Cwz.STARTED) {
                    iMediaPlayer3.pause();
                    this.state = EnumC2246911Cwz.PAUSED;
                }
                if (this.state == EnumC2246911Cwz.PAUSED) {
                    this.mediaPlayer.stop();
                    this.state = EnumC2246911Cwz.STOPPED;
                }
                this.mediaPlayer.release();
                this.alphaVideoView.release();
                this.state = EnumC2246911Cwz.RELEASE;
                HandlerThread handlerThread2 = this.playThread;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                    this.playThread.interrupt();
                    return true;
                }
                return true;
            case 7:
                try {
                    this.mediaPlayer.setSurface((Surface) HandlerHook.getMessageObj(message.obj));
                    return true;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    emitEndSignal();
                    monitor(false, "surface has been released");
                    return true;
                }
            case 8:
            default:
                return true;
            case BdTuring.TYPE_ECAF /* 9 */:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer4 = this.mediaPlayer;
                if (iMediaPlayer4 != null) {
                    iMediaPlayer4.reset();
                    this.progressHelper.LIZLLL();
                    this.state = EnumC2246911Cwz.NOT_PREPARED;
                    this.isPlaying = false;
                    return true;
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                initMediaPlayer();
                return true;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (HandlerHook.getMessageObj(message.obj) instanceof MaskSrc) {
                    MaskSrc maskSrc = (MaskSrc) HandlerHook.getMessageObj(message.obj);
                    if (maskSrc.getType() == 0) {
                        try {
                            maskSrc.setBitmap(C12MH.LIZ(maskSrc));
                        } catch (OutOfMemoryError e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (maskSrc.getBitmap() != null) {
                        maskSrc.setWidth(maskSrc.getBitmap().getWidth());
                        maskSrc.setHeight(maskSrc.getBitmap().getHeight());
                        this.masks.add(maskSrc);
                        return true;
                    }
                    break;
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer5 = this.mediaPlayer;
                if (iMediaPlayer5 != null) {
                    iMediaPlayer5.stop();
                    this.state = EnumC2246911Cwz.STOPPED;
                    this.isPlaying = false;
                    this.progressHelper.LIZLLL();
                    InterfaceC2246811Cwp interfaceC2246811Cwp = this.alphaVideoView;
                    if (interfaceC2246811Cwp != null) {
                        interfaceC2246811Cwp.onCompletion();
                        return true;
                    }
                }
                return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    public void sendMessage(Message message) {
        sendMessage(message, 0L);
    }

    public void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.firstGLFrameListener = interfaceC2247121CxK;
        this.alphaVideoView.setFirstGLFrameListener(interfaceC2247121CxK);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMask(MaskSrc maskSrc) {
        sendMessage(getMessage(11, maskSrc));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMonitor(IMonitor iMonitor) {
        this.monitor = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setSurface(Surface surface) {
        sendMessage(getMessage(7, surface));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setVisibility(int i) {
        this.alphaVideoView.setVisibility(i);
        if (i == 0) {
            this.alphaVideoView.bringToFront();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void start(DataSource dataSource) {
        startWithLastFrameHold(dataSource, false);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.alphaPlayerAction = alphaPlayerAction;
        return this;
    }

    public static PlayerController get(Configuration configuration, IMediaPlayer iMediaPlayer) {
        return new PlayerController(configuration.getContext(), configuration.getLifecycleOwner(), iMediaPlayer, configuration.getAlphaVideoViewType(), configuration.getThreadName(), configuration.videoRendererVersion());
    }

    public static Message getMessage(int i, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = obj;
        return messageObtain;
    }

    private void initAlphaView(int i, int i2) {
        InterfaceC1292140jjI c2247311Cxd;
        if (i == 1) {
            this.alphaVideoView = new C1292130jjH(this.context);
        } else {
            this.alphaVideoView = new C1292170jjL(this.context);
        }
        this.alphaVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.alphaVideoView.setPlayerController(this);
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.alphaVideoView;
        if (i2 == 2) {
            c2247311Cxd = new C2247301Cxc(interfaceC2246811Cwp);
        } else {
            c2247311Cxd = new C2247311Cxd(interfaceC2246811Cwp);
        }
        interfaceC2246811Cwp.setVideoRenderer(c2247311Cxd);
    }

    private void sendMessage(Message message, long j) {
        HandlerThread handlerThread = this.playThread;
        if (handlerThread != null && handlerThread.isAlive() && !this.playThread.isInterrupted()) {
            if (this.workHandler == null) {
                this.workHandler = new BPEAHandler(C786410Ut5.W2(this.playThread), this);
            }
            C786410Ut5.LJLJLJ(this.workHandler, message, j);
        }
    }

    public void monitor(boolean z, String str) {
        monitor(z, 0, 0, str);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setProgressListener(IProgressListener iProgressListener, long j) {
        C2246821Cwq c2246821Cwq = this.progressHelper;
        if (iProgressListener != null) {
            c2246821Cwq.LIZIZ = iProgressListener;
        } else {
            c2246821Cwq.LIZIZ = C2246821Cwq.LJFF;
        }
        c2246821Cwq.LIZJ = j;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startWithLastFrameHold(DataSource dataSource, boolean z) {
        this.alphaVideoView.setLastFrameHold(z);
        DataSource dataSourceCopy = DataSource.copy(dataSource);
        this.messageId = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            sendMessage(getMessage(1, dataSourceCopy));
            return;
        }
        emitEndSignal();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataSource is invalid. ErrorInfo: ");
        sbLIZ.append(dataSourceCopy.getErrorInfo());
        monitor(false, C2188811AlT.LIZIZ(sbLIZ));
    }

    private void init(Context context, LifecycleOwner lifecycleOwner, String str) {
        this.context = context;
        this.owner = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        HandlerThread handlerThread = new HandlerThread(str, 10);
        this.playThread = handlerThread;
        handlerThread.start();
        this.workHandler = new BPEAHandler(C786410Ut5.W2(this.playThread), this);
    }

    public void monitor(boolean z, int i, int i2, String str) {
        String playerSimpleName;
        IMonitor iMonitor = this.monitor;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            playerSimpleName = iMediaPlayer.getPlayerSimpleName();
        } else {
            playerSimpleName = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", messageId: ");
        sbLIZ.append(this.messageId);
        iMonitor.monitor(z, playerSimpleName, i, i2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public PlayerController(Context context, LifecycleOwner lifecycleOwner, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer, int i, String str, int i2) {
        init(context, lifecycleOwner, str);
        initAlphaView(i, i2);
        initPlayer(iMediaPlayer);
    }
}
