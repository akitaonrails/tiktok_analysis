package com.bytedance.live.render.engine.alphaplayer.player;

import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2246861Cwu;
import X.C2247041CxC;
import X.C786410Ut5;
import X.InterfaceC2247071CxF;
import X.InterfaceC2247101CxI;
import X.InterfaceC2247111CxJ;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS2S1102000_23;
import Y.ARunnableS46S0101000_35;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public final class TTMultiplePlayerImpl extends AbsPlayer<TTMultiplePlayerImpl> implements InterfaceC2247111CxJ {
    public final float LIZ;
    public float LIZIZ;
    public final InterfaceC2247071CxF LIZJ;
    public final String[] LIZLLL;
    public int LJ;
    public final MediaCodec[] LJFF;
    public final MediaExtractor[] LJI;
    public final int[] LJII;
    public final Surface[] LJIIIIZZ;
    public final long[] LJIIIZ;
    public final long[] LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public float LJIILL;
    public Surface LJIILLIIL;
    public final AtomicBoolean LJIIZILJ;
    public final AtomicBoolean LJIJ;
    public final AtomicBoolean LJIJI;
    public final AtomicBoolean LJIJJ;
    public final AtomicBoolean LJIJJLI;
    public final AtomicBoolean LJIL;
    public final AtomicBoolean LJJ;
    public final AtomicBoolean LJJI;
    public final HandlerThread LJJIFFI;
    public final DecodingHandler LJJII;
    public final BPEAHandler LJJIII;
    public final ExecutorService LJJIIJ;
    public InterfaceC2247101CxI LJJIIJZLJL;
    public final String LJJIIZ;
    public Surface LJJIIZI;
    public SurfaceTexture LJJIJ;
    public Surface LJJIJIIJI;
    public SurfaceTexture LJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isSupportDataPathList() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    public final void LIZLLL() {
        InterfaceC2247101CxI interfaceC2247101CxI = this.LJJIIJZLJL;
        if (interfaceC2247101CxI != null) {
            interfaceC2247101CxI.LIZIZ();
        }
        if (this.LJ == 0 && this.LIZLLL[1] != null) {
            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handleVideoCompletion, First video completed, switching to second video");
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(8));
            return;
        }
        if (this.LJIILJJIL) {
            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handleVideoCompletion, Video completed, looping");
            this.LJ = 0;
            int i = (this.LJIIJJI + 1) % 2;
            LJFF(i);
            LJIIIZ(this.LJIIJJI, false);
            this.LJIIJJI = i;
            LJIIIIZZ(i);
            return;
        }
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handleVideoCompletion, Video playback completed");
        this.LJIIZILJ.set(false);
        LJIIIZ(this.LJIIJJI, false);
        this.LJ = 0;
        this.LJIIJJI = 0;
        LJII("handleVideoCompletion");
        if (this.completionListener != null) {
            C786410Ut5.LJJZZIII(this.LJJIII, new ARunnableS123S0100000_23(this, 158));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        int i;
        if (!this.LJIJI.get() || (i = this.LJIIJJI) < 0) {
            return 0;
        }
        long[] jArr = this.LJIIIZ;
        if (i < jArr.length) {
            return (int) (jArr[i] / 1000);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return !this.LJIJI.get() ? new C2247041CxC(0, 0, 0) : new C2247041CxC(this.LJIIL, this.LJIILIIL, (int) (this.LJIIJ[this.LJIIJJI] / 1000));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "initMediaPlayer, Player is released, cannot initialize");
        } else {
            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "initMediaPlayer, Media player initialized");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LJIIZILJ.get();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "pause, Player is released, cannot pause");
        } else {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(3));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "prepareAsync, Player is released, cannot prepare");
            return;
        }
        this.LJIJJLI.set(true);
        if (this.LIZLLL[0] == null) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "prepareAsync, Data source is not set, wait for dataSources");
            return;
        }
        if (this.LJIILLIIL == null) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "prepareAsync, Surface is not set, wait for Surface");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareAsync, isPrepareCalled=");
        sbLIZ.append(this.LJIJJLI.get());
        sbLIZ.append(", isSetDataCalled=");
        sbLIZ.append(this.LJIL.get());
        sbLIZ.append(", isSetSurfaceCalled=");
        sbLIZ.append(this.LJJ.get());
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIJJLI.get() && this.LJIL.get() && this.LJJ.get()) {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        if (this.LJIJ.getAndSet(true)) {
            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "release, Player is already released");
            return;
        }
        DecodingHandler decodingHandler = this.LJJII;
        decodingHandler.sendMessage(decodingHandler.obtainMessage(5));
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
        ExecutorService executorService = this.LJJIIJ;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.LJJIIJ.shutdown();
                C20441214yg.LIZIZ("TTMultiplePlayerImpl", "shutdownThreadPool, Thread pool shutdown");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJFF("TTMultiplePlayerImpl", "shutdownThreadPool, Error shutting down thread pool", e2);
            }
        }
        this.LJJIFFI.quitSafely();
        try {
            this.LJJIFFI.join(1000L);
        } catch (InterruptedException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C786410Ut5.u3().interrupt();
        }
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZJ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZ();
        }
        LJII("release");
        this.LJJ.set(false);
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", "release, Player released");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", "reset, Reset called (no implementation)");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "start, Player is released, cannot start");
        } else if (!this.LJIJI.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "start, Player is not prepared");
        } else {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(2));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "pause, Player is released, cannot stop");
        } else {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(4));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return this.LJJIIZ;
    }

    public static class DecodingHandler extends BPEAHandler {
        public final WeakReference<TTMultiplePlayerImpl> LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("TTMultiplePlayerImpl$DecodingHandler@d1d6.handleMessage");
            TTMultiplePlayerImpl tTMultiplePlayerImpl = this.LL.get();
            if (tTMultiplePlayerImpl != null && !tTMultiplePlayerImpl.LJIJ.get()) {
                switch (message.what) {
                    case 1:
                        tTMultiplePlayerImpl.LJFF(tTMultiplePlayerImpl.LJIIJJI);
                        break;
                    case 2:
                        tTMultiplePlayerImpl.LJIIIIZZ(tTMultiplePlayerImpl.LJIIJJI);
                        break;
                    case 3:
                        int[] iArr = tTMultiplePlayerImpl.LJII;
                        int i = tTMultiplePlayerImpl.LJIIJJI;
                        if (iArr[i] == 3) {
                            iArr[i] = 4;
                            tTMultiplePlayerImpl.LJIIZILJ.set(false);
                        }
                        break;
                    case 4:
                        tTMultiplePlayerImpl.LJIIIZ(tTMultiplePlayerImpl.LJIIJJI, false);
                        break;
                    case 5:
                        tTMultiplePlayerImpl.LJI(0);
                        tTMultiplePlayerImpl.LJI(1);
                        break;
                    case 6:
                        if (tTMultiplePlayerImpl.LJIIZILJ.get() && !tTMultiplePlayerImpl.LJIJ.get() && tTMultiplePlayerImpl.LIZLLL[1] != null) {
                            try {
                                try {
                                    long[] jArr = tTMultiplePlayerImpl.LJIIJ;
                                    int i2 = tTMultiplePlayerImpl.LJIIJJI;
                                    long j = jArr[i2];
                                    long j2 = tTMultiplePlayerImpl.LJIIIZ[i2];
                                    float f = j;
                                    if (f / 1000.0f < 2000.0f) {
                                        tTMultiplePlayerImpl.LIZIZ = 0.2f;
                                    } else {
                                        tTMultiplePlayerImpl.LIZIZ = tTMultiplePlayerImpl.LIZ;
                                    }
                                    if (j > 0 && j2 / f >= tTMultiplePlayerImpl.LIZIZ) {
                                        tTMultiplePlayerImpl.LIZIZ("handleCheckProgress");
                                    }
                                } catch (Throwable th) {
                                    if (tTMultiplePlayerImpl.LJIIZILJ.get() && !tTMultiplePlayerImpl.LJIJ.get() && !tTMultiplePlayerImpl.LJIJJ.get()) {
                                        DecodingHandler decodingHandler = tTMultiplePlayerImpl.LJJII;
                                        decodingHandler.sendMessageDelayed(decodingHandler.obtainMessage(6), 100L);
                                    }
                                    throw th;
                                }
                                break;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJFF("TTMultiplePlayerImpl", "handleCheckProgress, Error checking progress", e);
                                if (tTMultiplePlayerImpl.LJIIZILJ.get() && !tTMultiplePlayerImpl.LJIJ.get() && !tTMultiplePlayerImpl.LJIJJ.get()) {
                                }
                            }
                            if (tTMultiplePlayerImpl.LJIIZILJ.get() && !tTMultiplePlayerImpl.LJIJ.get() && !tTMultiplePlayerImpl.LJIJJ.get()) {
                                DecodingHandler decodingHandler2 = tTMultiplePlayerImpl.LJJII;
                                decodingHandler2.sendMessageDelayed(decodingHandler2.obtainMessage(6), 100L);
                            }
                        }
                        break;
                    case 7:
                        if (tTMultiplePlayerImpl.LJIJJ.getAndSet(true)) {
                            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handlePreload, Already preloading");
                        } else if (tTMultiplePlayerImpl.LIZLLL[1] == null) {
                            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handlePreload, No second video to preload");
                            tTMultiplePlayerImpl.LJIJJ.set(false);
                        } else {
                            C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handlePreload, Preloading second video");
                            try {
                                try {
                                    tTMultiplePlayerImpl.LJFF((tTMultiplePlayerImpl.LJIIJJI + 1) % 2);
                                    tTMultiplePlayerImpl.LJIJJ.set(true);
                                    C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handlePreload, Second video preloaded");
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C20441214yg.LJFF("TTMultiplePlayerImpl", "handlePreload, Error preloading second video", e2);
                                tTMultiplePlayerImpl.LJIJJ.set(false);
                            }
                        }
                        break;
                    case 8:
                        int i3 = (tTMultiplePlayerImpl.LJIIJJI + 1) % 2;
                        if (tTMultiplePlayerImpl.LJII[i3] != 2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("handleSwitchDecoder, Next decoder is not prepared, nextIndex = ");
                            sbLIZ.append(i3);
                            sbLIZ.append(", decoderStates=");
                            sbLIZ.append(tTMultiplePlayerImpl.LJII);
                            C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("handleSwitchDecoder, Switching from decoder ");
                            sbLIZ2.append(tTMultiplePlayerImpl.LJIIJJI);
                            sbLIZ2.append(" to ");
                            sbLIZ2.append(i3);
                            C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                            try {
                                int i4 = tTMultiplePlayerImpl.LJIIJJI;
                                tTMultiplePlayerImpl.LJFF[i4].setOutputSurface(tTMultiplePlayerImpl.LJIIIIZZ[2]);
                                try {
                                    tTMultiplePlayerImpl.LJJIIJ.execute(new ARunnableS46S0101000_35(tTMultiplePlayerImpl, i4, 10));
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    C20441214yg.LJFF("TTMultiplePlayerImpl", "handleSwitchDecoder, Error stopping current decoder", e3);
                                }
                                tTMultiplePlayerImpl.LJIIJJI = i3;
                                tTMultiplePlayerImpl.LJ = 1;
                                tTMultiplePlayerImpl.LJFF[i3].setOutputSurface(tTMultiplePlayerImpl.LJIIIIZZ[0]);
                                tTMultiplePlayerImpl.LJIIIIZZ(tTMultiplePlayerImpl.LJIIJJI);
                                C20441214yg.LIZIZ("TTMultiplePlayerImpl", "handleSwitchDecoder, Switched to decoder " + tTMultiplePlayerImpl.LJIIJJI);
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                C20441214yg.LJFF("TTMultiplePlayerImpl", "handleSwitchDecoder, Error switching decoders", e4);
                                tTMultiplePlayerImpl.LJ(0, "Error switching decoders");
                            }
                        }
                        break;
                }
                C1C7U.LIZIZ("TTMultiplePlayerImpl$DecodingHandler@d1d6.handleMessage");
                return;
            }
            C1C7U.LIZIZ("TTMultiplePlayerImpl$DecodingHandler@d1d6.handleMessage");
        }

        public DecodingHandler(Looper looper, TTMultiplePlayerImpl tTMultiplePlayerImpl) {
            super(looper);
            this.LL = new WeakReference<>(tTMultiplePlayerImpl);
        }
    }

    @Override // X.InterfaceC2247111CxJ
    public final void LIZ(C2246861Cwu c2246861Cwu) {
        this.LJJIIJZLJL = c2246861Cwu;
    }

    public final void LIZIZ(String str) {
        if (this.LIZLLL[1] != null && !this.LJIJJ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doHandlePreloadMsg, Reached preload threshold (");
            sbLIZ.append(this.LIZIZ * 100.0f);
            sbLIZ.append("%), starting preload of next video, source = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(7));
        }
    }

    public final void LIZJ(MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
            int integer3 = mediaFormat.getInteger("crop-right");
            int integer4 = mediaFormat.getInteger("crop-left");
            int integer5 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            this.LJIIL = (integer3 - integer4) + 1;
            this.LJIILIIL = integer5;
        } else {
            this.LJIIL = integer;
            this.LJIILIIL = integer2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleFormatChange, Output format changed to: ");
        sbLIZ.append(mediaFormat);
        C20441214yg.LJIIIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(int i) {
        char c;
        if (i >= 0 && i < this.LJFF.length) {
            String[] strArr = this.LIZLLL;
            if (i == this.LJIIJJI) {
                c = 0;
            } else {
                c = 1;
            }
            String str = strArr[c];
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareDecoder, Data source is null for decoder ");
                sbLIZ.append(i);
                C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            try {
                MediaExtractor mediaExtractor = this.LJI[i];
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                MediaCodec mediaCodec = this.LJFF[i];
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                this.LJI[i] = new MediaExtractor();
                this.LJI[i].setDataSource(str);
                int i2 = 0;
                while (true) {
                    if (i2 >= this.LJI[i].getTrackCount()) {
                        break;
                    }
                    String string = this.LJI[i].getTrackFormat(i2).getString("mime");
                    if (string == null || !string.startsWith("video/")) {
                        i2++;
                    } else if (i2 != -1) {
                        this.LJI[i].selectTrack(i2);
                        MediaFormat trackFormat = this.LJI[i].getTrackFormat(i2);
                        int integer = trackFormat.getInteger("width");
                        int integer2 = trackFormat.getInteger("height");
                        if (i == this.LJIIJJI) {
                            this.LJIIL = integer;
                            this.LJIILIIL = integer2;
                        }
                        if (trackFormat.containsKey("durationUs")) {
                            this.LJIIJ[i] = trackFormat.getLong("durationUs");
                        } else {
                            this.LJIIJ[i] = 0;
                        }
                        this.LJFF[i] = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                        this.LJFF[i].configure(trackFormat, this.LJIIIIZZ[i], (MediaCrypto) null, 0);
                        this.LJII[i] = 2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("prepareDecoder, Decoder ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(" prepared for ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", videoWidth=");
                        sbLIZ2.append(this.LJIIL);
                        sbLIZ2.append(", videoHeight=");
                        sbLIZ2.append(this.LJIILIIL);
                        sbLIZ2.append(", duration=");
                        sbLIZ2.append(this.LJIIJ[i]);
                        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                        if (i == this.LJIIJJI && !this.LJIJI.get()) {
                            this.LJIJI.set(true);
                            if (this.preparedListener != null) {
                                C786410Ut5.LJJZZIII(this.LJJIII, new ARunnableS123S0100000_23(this, 157));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("prepareDecoder, No video track found in ");
                sbLIZ3.append(str);
                C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("No video track found in ");
                sbLIZ4.append(str);
                LJ(-1, C2188811AlT.LIZIZ(sbLIZ4));
                return;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("prepareDecoder, Error preparing decoder ");
                sbLIZ5.append(i);
                sbLIZ5.append(", IOException");
                C20441214yg.LJFF("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ5), e);
                this.LJII[i] = 7;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Error preparing decoder ");
                sbLIZ6.append(i);
                sbLIZ6.append(", e=");
                sbLIZ6.append(e);
                LJ(-1, C2188811AlT.LIZIZ(sbLIZ6));
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("prepareDecoder, Error preparing decoder ");
                sbLIZ7.append(i);
                sbLIZ7.append(", Exception");
                C20441214yg.LJFF("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ7), e2);
                this.LJII[i] = 7;
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("Error preparing decoder ");
                sbLIZ8.append(i);
                sbLIZ8.append(", e=");
                sbLIZ8.append(e2);
                LJ(0, C2188811AlT.LIZIZ(sbLIZ8));
                return;
            }
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("prepareDecoder, Invalid decoder index: ");
        sbLIZ9.append(i);
        C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ9));
    }

    public final void LJI(int i) {
        if (i >= 0 && i < this.LJFF.length) {
            try {
                MediaExtractor mediaExtractor = this.LJI[i];
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    this.LJI[i] = null;
                }
                MediaCodec mediaCodec = this.LJFF[i];
                if (mediaCodec != null) {
                    if (this.LJII[i] == 3) {
                        mediaCodec.stop();
                    }
                    this.LJFF[i].release();
                    this.LJFF[i] = null;
                }
                this.LJII[i] = 6;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseDecoder, Decoder ");
                sbLIZ.append(i);
                sbLIZ.append(" released");
                C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("releaseDecoder, Error releasing decoder ");
                sbLIZ2.append(i);
                C20441214yg.LJFF("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2), e);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("releaseDecoder, Invalid decoder index: ");
        sbLIZ3.append(i);
        C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetPlayerInnerFlag, source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIJI.set(false);
        this.LJIJJLI.set(false);
        this.LJIL.set(false);
        this.LJJI.set(false);
        this.LJIJJ.set(false);
    }

    public final void LJIIIIZZ(int i) {
        if (i >= 0) {
            MediaCodec[] mediaCodecArr = this.LJFF;
            if (i < mediaCodecArr.length) {
                MediaCodec mediaCodec = mediaCodecArr[i];
                if (mediaCodec == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startDecoder, Decoder ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is null");
                    C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                int i2 = this.LJII[i];
                if (i2 != 2 && i2 != 4) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startDecoder, Decoder ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" is not in prepared or paused state, state=");
                    sbLIZ2.append(this.LJII[i]);
                    C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                try {
                    mediaCodec.start();
                    this.LJII[i] = 3;
                    this.LJIIZILJ.set(true);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("startDecoder, Decoder ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" started");
                    C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LJJIIJ.execute(new ARunnableS46S0101000_35(this, i, 9));
                    if (i == this.LJIIJJI) {
                        DecodingHandler decodingHandler = this.LJJII;
                        decodingHandler.sendMessageDelayed(decodingHandler.obtainMessage(6), 100L);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("startDecoder, Error starting decoder ");
                    sbLIZ4.append(i);
                    C20441214yg.LJFF("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ4), e);
                    this.LJII[i] = 7;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Error starting decoder ");
                    sbLIZ5.append(i);
                    LJ(0, C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("startDecoder, Invalid decoder index: ");
        sbLIZ6.append(i);
        C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ6));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        C20441214yg.LJIIL("TTMultiplePlayerImpl", "Seek operation is not supported in TTMultiplePlayerImpl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(List<String> list) {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "setDataSources, Player is released, cannot set data sources");
            return;
        }
        if (list.isEmpty()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "setDataSources, videoPathList is empty");
            return;
        }
        if (list.size() == 1) {
            setDataSource((String) ListProtector.get(list, 0));
            return;
        }
        this.LIZLLL[0] = ListProtector.get(list, 0);
        this.LIZLLL[1] = ListProtector.get(list, 1);
        this.LJ = 0;
        this.LJIL.set(true);
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZJ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZIZ(this.LJIILL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSources, Data sources set: [");
        sbLIZ.append(this.LIZLLL[0]);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL[1]);
        sbLIZ.append(e3.f);
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setDataSources, isPrepareCalled=");
        sbLIZ2.append(this.LJIJJLI.get());
        sbLIZ2.append(", isSetDataCalled=");
        sbLIZ2.append(this.LJIL.get());
        sbLIZ2.append(", isSetSurfaceCalled=");
        sbLIZ2.append(this.LJJ.get());
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LJIJJLI.get() && this.LJIL.get() && this.LJJ.get()) {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "setSurface, Player is released, cannot set surface");
            return;
        }
        this.LJIILLIIL = surface;
        Surface[] surfaceArr = this.LJIIIIZZ;
        surfaceArr[0] = surface;
        surfaceArr[1] = this.LJJIIZI;
        surfaceArr[2] = this.LJJIJIIJI;
        this.LJJ.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface, isPrepareCalled=");
        sbLIZ.append(this.LJIJJLI.get());
        sbLIZ.append(", isSetDataCalled=");
        sbLIZ.append(this.LJIL.get());
        sbLIZ.append(", isSetSurfaceCalled=");
        sbLIZ.append(this.LJJ.get());
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIJJLI.get() && this.LJIL.get() && this.LJJ.get()) {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        if (this.LJIJ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImpl", "setDataSource, Player is released, cannot set data source");
            return;
        }
        String[] strArr = this.LIZLLL;
        strArr[0] = str;
        strArr[1] = null;
        this.LJ = 0;
        this.LJIL.set(true);
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZJ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZIZ(this.LJIILL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource, Data sources set: [");
        sbLIZ.append(this.LIZLLL[0]);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL[1]);
        sbLIZ.append(e3.f);
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setDataSource, isPrepareCalled=");
        sbLIZ2.append(this.LJIJJLI.get());
        sbLIZ2.append(", isSetDataCalled=");
        sbLIZ2.append(this.LJIL.get());
        sbLIZ2.append(", isSetSurfaceCalled=");
        sbLIZ2.append(this.LJJ.get());
        C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LJIJJLI.get() && this.LJIL.get() && this.LJJ.get()) {
            DecodingHandler decodingHandler = this.LJJII;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    public TTMultiplePlayerImpl(Context context, InterfaceC2247071CxF interfaceC2247071CxF) {
        super(context);
        this.LIZ = LiveGiftMultiplePlayerSetting.INSTANCE.getPlayerPreloadThresholdPercent() / 100.0f;
        this.LIZIZ = 0.2f;
        this.LIZLLL = new String[2];
        this.LJ = 0;
        this.LJFF = new MediaCodec[2];
        this.LJI = new MediaExtractor[2];
        this.LJII = new int[]{0, 0};
        this.LJIIIIZZ = new Surface[3];
        this.LJIIIZ = new long[2];
        this.LJIIJ = new long[2];
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
        this.LJIILL = 1.0f;
        this.LJIIZILJ = new AtomicBoolean(false);
        this.LJIJ = new AtomicBoolean(false);
        this.LJIJI = new AtomicBoolean(false);
        this.LJIJJ = new AtomicBoolean(false);
        this.LJIJJLI = new AtomicBoolean(false);
        this.LJIL = new AtomicBoolean(false);
        this.LJJ = new AtomicBoolean(false);
        this.LJJI = new AtomicBoolean(false);
        this.LJJIIZ = "TTMultiplePlayerImpl";
        this.LIZJ = interfaceC2247071CxF;
        this.LJJIII = new BPEAHandler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("TTMultiplePlayerImpl_DecodingThread");
        this.LJJIFFI = handlerThread;
        handlerThread.start();
        this.LJJII = new DecodingHandler(C786410Ut5.W2(handlerThread), this);
        this.LJJIIJ = C786410Ut5.c4(new ThreadFactory() { // from class: X.0p6e
            public final AtomicInteger LL = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTMultiplePlayerImpl-Thread-");
                sbLIZ.append(this.LL.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("threadPool, newThread = ");
                sbLIZ2.append(bPEAThread.getName());
                C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                bPEAThread.setDaemon(false);
                return bPEAThread;
            }
        });
        this.LJJIJ = new SurfaceTexture(0);
        this.LJJIIZI = new Surface(this.LJJIJ);
        this.LJJIJIIJIL = new SurfaceTexture(1);
        this.LJJIJIIJI = new Surface(this.LJJIJIIJIL);
    }

    public final void LJ(int i, String str) {
        if (this.errorListener != null) {
            C786410Ut5.LJJZZIII(this.LJJIII, new ARunnableS2S1102000_23(this, i, str, 0));
        }
    }

    public final void LJIIIZ(int i, boolean z) {
        if (i >= 0) {
            MediaCodec[] mediaCodecArr = this.LJFF;
            if (i < mediaCodecArr.length) {
                MediaCodec mediaCodec = mediaCodecArr[i];
                if (mediaCodec == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stopDecoder, Decoder ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is null");
                    C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                int i2 = this.LJII[i];
                if (i2 != 3 && i2 != 4) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("stopDecoder, Decoder ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" is not in running or paused state");
                    C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                try {
                    mediaCodec.stop();
                    this.LJII[i] = 5;
                    if (!z && i == this.LJIIJJI) {
                        this.LJIIZILJ.set(false);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("stopDecoder, Decoder ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" stopped");
                    C20441214yg.LIZIZ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("stopDecoder, Error stopping decoder ");
                    sbLIZ4.append(i);
                    C20441214yg.LJFF("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ4), e);
                    this.LJII[i] = 7;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Error stopping decoder ");
                    sbLIZ5.append(i);
                    LJ(0, C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("stopDecoder, Invalid decoder index: ");
        sbLIZ6.append(i);
        C20441214yg.LJ("TTMultiplePlayerImpl", C2188811AlT.LIZIZ(sbLIZ6));
    }
}
