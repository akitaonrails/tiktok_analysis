package com.bytedance.live.render.engine.alphaplayer.player;

import X.C13LP;
import X.C1697810uHb;
import X.C20441214yg;
import X.C20520215Rg;
import X.C2188811AlT;
import X.C2246861Cwu;
import X.C2247041CxC;
import X.C2262651DhH;
import X.C786410Ut5;
import X.EnumC2262661DhI;
import X.InterfaceC2247071CxF;
import X.InterfaceC2247101CxI;
import X.InterfaceC2247111CxJ;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS2S1102000_23;
import Y.ARunnableS34S0101000_23;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: loaded from: classes36.dex */
public final class TTMultiplePlayerImplV2 extends AbsPlayer<TTMultiplePlayerImplV2> implements InterfaceC2247111CxJ {
    public static final float LJIJJ = LiveGiftMultiplePlayerSetting.INSTANCE.getPlayerPreloadThresholdPercent() / 100.0f;
    public final InterfaceC2247071CxF LIZ;
    public float LIZIZ;
    public List<C2262651DhH> LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public float LJII;
    public final AtomicBoolean LJIIIIZZ;
    public final AtomicBoolean LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public final AtomicBoolean LJIIJJI;
    public final AtomicBoolean LJIIL;
    public final AtomicBoolean LJIILIIL;
    public final AtomicBoolean LJIILJJIL;
    public final BPEAHandler LJIILL;
    public final DecodingHandler LJIILLIIL;
    public final ExecutorService LJIIZILJ;
    public InterfaceC2247101CxI LJIJ;
    public Surface LJIJI;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return "TTMultiplePlayerImplV2_gift_video_engine";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isSupportDataPathList() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    public final void LJ() {
        InterfaceC2247101CxI interfaceC2247101CxI = this.LJIJ;
        if (interfaceC2247101CxI != null) {
            interfaceC2247101CxI.LIZIZ();
        }
        int size = ((ArrayList) this.LIZJ).size();
        if (C13LP.LJJJLZIJ(this.LIZLLL + 1, this.LIZJ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleVideoCompletion, ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" video completed, switching to ");
            sbLIZ.append(this.LIZLLL + 1);
            sbLIZ.append(" video");
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(8));
            return;
        }
        if (this.LJI && size > 0) {
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "handleVideoCompletion, Video completed, looping");
            int i = (this.LIZLLL + 1) % size;
            LJI(i);
            LJIIJ(this.LIZLLL, false);
            this.LIZLLL = i;
            LJIIIZ(i);
            return;
        }
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "handleVideoCompletion, Video playback completed");
        LJIIJ(this.LIZLLL, false);
        this.LIZLLL = 0;
        LJIIIIZZ("handleVideoCompletion");
        if (this.completionListener != null) {
            C786410Ut5.LJJZZIII(this.LJIILL, new ARunnableS123S0100000_23(this, 19));
        } else {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "handleVideoCompletion, completionListener is null");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        int i;
        if (!this.LJIIJ.get() || (i = this.LIZLLL) < 0 || i >= ((ArrayList) this.LIZJ).size()) {
            return 0;
        }
        C2262651DhH c2262651DhH = (C2262651DhH) C13LP.LJJJLZIJ(this.LIZLLL, this.LIZJ);
        return (int) ((c2262651DhH != null ? c2262651DhH.LJIIIIZZ : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        if (!this.LJIIJ.get()) {
            return new C2247041CxC(0, 0, 0);
        }
        int i = this.LJ;
        int i2 = this.LJFF;
        C2262651DhH c2262651DhH = (C2262651DhH) C13LP.LJJJLZIJ(this.LIZLLL, this.LIZJ);
        return new C2247041CxC(i, i2, (int) ((c2262651DhH != null ? c2262651DhH.LJIIJJI : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "initMediaPlayer, Player is released, cannot initialize");
        } else {
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "initMediaPlayer, Media player initialized");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LJIIIIZZ.get();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "pause, Player is released, cannot pause");
            return;
        }
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "pause");
        DecodingHandler decodingHandler = this.LJIILLIIL;
        decodingHandler.sendMessage(decodingHandler.obtainMessage(3));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "prepareAsync, Player is released, cannot prepare");
            return;
        }
        if (((ArrayList) this.LIZJ).isEmpty()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "prepareAsync, Data source is not set, wait for dataSources");
            return;
        }
        if (this.LJIJI == null) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "prepareAsync, Surface is not set, wait for Surface");
            return;
        }
        this.LJIIJJI.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareAsync, isPrepareCalled=");
        sbLIZ.append(this.LJIIJJI.get());
        sbLIZ.append(", isSetDataCalled=");
        sbLIZ.append(this.LJIIL.get());
        sbLIZ.append(", isSetSurfaceCalled=");
        sbLIZ.append(this.LJIILIIL.get());
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI.get() && this.LJIIL.get() && this.LJIILIIL.get()) {
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        if (this.LJIIIZ.getAndSet(true)) {
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "release, Player is already released");
            return;
        }
        DecodingHandler decodingHandler = this.LJIILLIIL;
        decodingHandler.sendMessage(decodingHandler.obtainMessage(5));
        ExecutorService executorService = this.LJIIZILJ;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.LJIIZILJ.shutdown();
                C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "shutdownThreadPool, Thread pool shutdown");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", "shutdownThreadPool, Error shutting down thread pool", e);
            }
        }
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZ();
        }
        LJIIIIZZ("release");
        this.LJIILIIL.set(false);
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "release, Player released");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        C20441214yg.LIZIZ("TTMultiplePlayerImplV2_gift_video_engine", "reset, Reset called (no implementation)");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "start, Player is released, cannot start");
        } else {
            if (!this.LJIIJ.get()) {
                C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "start, Player is not prepared");
                return;
            }
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "start");
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(2));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "stop, Player is released, cannot stop");
            return;
        }
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "stop");
        DecodingHandler decodingHandler = this.LJIILLIIL;
        decodingHandler.sendMessage(decodingHandler.obtainMessage(4));
    }

    public static final class DecodingHandler extends BPEAHandler {
        public final WeakReference<TTMultiplePlayerImplV2> LL;

        /* JADX WARN: Removed duplicated region for block: B:84:0x0241  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r16) {
            /*
                Method dump skipped, instruction units count: 732
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2.DecodingHandler.handleMessage(android.os.Message):void");
        }

        public DecodingHandler(Looper looper, TTMultiplePlayerImplV2 tTMultiplePlayerImplV2) {
            super(looper);
            this.LL = new WeakReference<>(tTMultiplePlayerImplV2);
        }
    }

    public static Pair LIZLLL(MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
            int integer3 = mediaFormat.getInteger("crop-right");
            int integer4 = mediaFormat.getInteger("crop-left");
            int i = (integer3 - integer4) + 1;
            int integer5 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleFormatChange, Output format changed to: ");
            sbLIZ.append(mediaFormat);
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            return new Pair(Integer.valueOf(i), Integer.valueOf(integer5));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleFormatChange, Output format changed to: ");
        sbLIZ2.append(mediaFormat);
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
        return new Pair(Integer.valueOf(integer), Integer.valueOf(integer2));
    }

    @Override // X.InterfaceC2247111CxJ
    public final void LIZ(C2246861Cwu c2246861Cwu) {
        this.LJIJ = c2246861Cwu;
    }

    public final void LJI(int i) {
        Surface surface;
        C2262651DhH c2262651DhHLIZIZ = LIZIZ(i, "prepareDecoder");
        if (c2262651DhHLIZIZ == null) {
            return;
        }
        try {
            c2262651DhHLIZIZ.LIZIZ("prepareDecoder");
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(c2262651DhHLIZIZ.LIZIZ);
            c2262651DhHLIZIZ.LJ = mediaExtractor;
            int trackCount = mediaExtractor.getTrackCount();
            int i2 = 0;
            while (true) {
                if (i2 >= trackCount) {
                    break;
                }
                String string = mediaExtractor.getTrackFormat(i2).getString("mime");
                if (string == null || !u.LJJIIJZLJL(string, "video/", false)) {
                    i2++;
                } else if (i2 != -1) {
                    mediaExtractor.selectTrack(i2);
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                    int integer = trackFormat.getInteger("width");
                    int integer2 = trackFormat.getInteger("height");
                    if (i == this.LIZLLL) {
                        this.LJ = integer;
                        this.LJFF = integer2;
                        c2262651DhHLIZIZ.LJIIIZ = integer;
                        c2262651DhHLIZIZ.LJIIJ = integer2;
                    }
                    if (trackFormat.containsKey("durationUs")) {
                        c2262651DhHLIZIZ.LJIIJJI = trackFormat.getLong("durationUs");
                    } else {
                        c2262651DhHLIZIZ.LJIIJJI = 0L;
                    }
                    String string2 = trackFormat.getString("mime");
                    if (string2 == null) {
                        string2 = "";
                    }
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
                    c2262651DhHLIZIZ.LIZLLL = mediaCodecCreateDecoderByType;
                    if (i == this.LIZLLL) {
                        surface = c2262651DhHLIZIZ.LJFF;
                    } else {
                        surface = c2262651DhHLIZIZ.LJII;
                    }
                    mediaCodecCreateDecoderByType.configure(trackFormat, surface, (MediaCrypto) null, 0);
                    c2262651DhHLIZIZ.LIZJ = EnumC2262661DhI.LLILLJJLI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prepareDecoder, Decoder ");
                    sbLIZ.append(i);
                    sbLIZ.append(" prepared for ");
                    sbLIZ.append(c2262651DhHLIZIZ);
                    C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                    if (i == 0 && !this.LJIIJ.get()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("prepareDecoder, Decoder ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", call onPrepared start");
                        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LJIIJ.set(true);
                        if (this.preparedListener != null) {
                            C786410Ut5.LJJZZIII(this.LJIILL, new ARunnableS34S0101000_23(this, i, 2));
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("prepareDecoder, preparedListener is null, decoderIndex=");
                        sbLIZ3.append(i);
                        C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                    return;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("prepareDecoder, No video track found in ");
            sbLIZ4.append(c2262651DhHLIZIZ);
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("No video track found in ");
            sbLIZ5.append(c2262651DhHLIZIZ);
            LJFF(-2, C2188811AlT.LIZIZ(sbLIZ5));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("prepareDecoder, Error preparing decoder ");
            sbLIZ6.append(i);
            sbLIZ6.append(", IOException");
            C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ6), e);
            c2262651DhHLIZIZ.LIZJ = EnumC2262661DhI.LLIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Error preparing decoder ");
            sbLIZ7.append(i);
            sbLIZ7.append(", e=");
            sbLIZ7.append(e);
            LJFF(-2, C2188811AlT.LIZIZ(sbLIZ7));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("prepareDecoder, Error preparing decoder ");
            sbLIZ8.append(i);
            sbLIZ8.append(", Exception");
            C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ8), e2);
            c2262651DhHLIZIZ.LIZJ = EnumC2262661DhI.LLIZ;
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("Error preparing decoder ");
            sbLIZ9.append(i);
            sbLIZ9.append(", e=");
            sbLIZ9.append(e2);
            LJFF(0, C2188811AlT.LIZIZ(sbLIZ9));
        }
    }

    public final void LJII(String str) {
        for (C2262651DhH c2262651DhH : (ArrayList) this.LIZJ) {
            c2262651DhH.LIZIZ = "";
            c2262651DhH.LIZ = 0;
            c2262651DhH.LJFF = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_reset");
            c2262651DhH.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            c2262651DhH.LJIIIIZZ = 0L;
            c2262651DhH.LJIIIZ = 0;
            c2262651DhH.LJIIJ = 0;
            c2262651DhH.LJIIJJI = 0L;
            c2262651DhH.LJIILIIL.set(false);
            c2262651DhH.LJIILJJIL.set(false);
        }
        this.LIZJ = new ArrayList();
    }

    public final void LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetPlayerInnerFlag, source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIL.set(false);
        this.LJIIJ.set(false);
        this.LJIIJJI.set(false);
        this.LJIIIIZZ.set(false);
        this.LJIILJJIL.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2.LJIIIZ(int):void");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        C20441214yg.LJIIL("TTMultiplePlayerImplV2_gift_video_engine", "Seek operation is not supported in TTMultiplePlayerImplV2_gift_video_engine");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(List<String> list) {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "setDataSources, Player is released, cannot set data sources");
            return;
        }
        if (list.isEmpty()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "setDataSources, videoPathList is empty");
            return;
        }
        if (list.size() == 1) {
            setDataSource((String) ListProtector.get(list, 0));
            return;
        }
        LJII("setDataSource_multiple");
        if (LiveGiftMultiplePlayerSetting.INSTANCE.isEnableMockVideos()) {
            list.addAll(list);
        }
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                if (str2 != null) {
                    List<C2262651DhH> list2 = this.LIZJ;
                    C2262651DhH c2262651DhH = new C2262651DhH();
                    c2262651DhH.LIZJ(i, str2);
                    Surface surface = this.LJIJI;
                    if (surface != null) {
                        c2262651DhH.LJFF = surface;
                    }
                    ((ArrayList) list2).add(c2262651DhH);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LIZLLL = 0;
        this.LJIIL.set(true);
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZIZ(this.LJII);
        }
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "setDataSources, isPrepareCalled=" + this.LJIIJJI.get() + ", isSetDataCalled=" + this.LJIIL.get() + ", isSetSurfaceCalled=" + this.LJIILIIL.get() + ", decoderWrappers.size = " + ((ArrayList) this.LIZJ).size() + ", decoderWrappers = " + this.LIZJ);
        if (this.LJIIJJI.get() && this.LJIIL.get() && this.LJIILIIL.get()) {
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        this.LJI = z;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "setSurface, Player is released, cannot set surface");
            return;
        }
        this.LJIJI = surface;
        Iterator<C2262651DhH> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF = surface;
        }
        this.LJIILIIL.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface, isPrepareCalled=");
        sbLIZ.append(this.LJIIJJI.get());
        sbLIZ.append(", isSetDataCalled=");
        sbLIZ.append(this.LJIIL.get());
        sbLIZ.append(", isSetSurfaceCalled=");
        sbLIZ.append(this.LJIILIIL.get());
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI.get() && this.LJIIL.get() && this.LJIILIIL.get()) {
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        if (this.LJIIIZ.get()) {
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", "setDataSource, Player is released, cannot set data source");
            return;
        }
        if (str != null && str.length() != 0) {
            LJII("setDataSource_single");
            List<C2262651DhH> list = this.LIZJ;
            C2262651DhH c2262651DhH = new C2262651DhH();
            c2262651DhH.LIZJ(0, str);
            Surface surface = this.LJIJI;
            if (surface != null) {
                c2262651DhH.LJFF = surface;
            }
            ((ArrayList) list).add(c2262651DhH);
            this.LIZLLL = 0;
            this.LJIIL.set(true);
            InterfaceC2247071CxF interfaceC2247071CxF = this.LIZ;
            if (interfaceC2247071CxF != null) {
                interfaceC2247071CxF.LIZIZ(this.LJII);
            }
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", "setDataSource, isPrepareCalled=" + this.LJIIJJI.get() + ", isSetDataCalled=" + this.LJIIL.get() + ", isSetSurfaceCalled=" + this.LJIILIIL.get() + " decoderWrappers=" + this.LIZJ);
            if (this.LJIIJJI.get() && this.LJIIL.get() && this.LJIILIIL.get()) {
                DecodingHandler decodingHandler = this.LJIILLIIL;
                decodingHandler.sendMessage(decodingHandler.obtainMessage(1));
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource, path is isNullOrEmpty, path=");
        sbLIZ.append(str);
        C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
    }

    public TTMultiplePlayerImplV2(Context context, InterfaceC2247071CxF interfaceC2247071CxF) {
        super(context);
        this.LIZ = interfaceC2247071CxF;
        this.LIZIZ = 0.2f;
        this.LIZJ = new ArrayList();
        this.LJII = 1.0f;
        this.LJIIIIZZ = new AtomicBoolean(false);
        this.LJIIIZ = new AtomicBoolean(false);
        this.LJIIJ = new AtomicBoolean(false);
        this.LJIIJJI = new AtomicBoolean(false);
        this.LJIIL = new AtomicBoolean(false);
        this.LJIILIIL = new AtomicBoolean(false);
        this.LJIILJJIL = new AtomicBoolean(false);
        this.LJIILL = new BPEAHandler(Looper.getMainLooper());
        if (!C20520215Rg.LIZ.getAndSet(true)) {
            C20520215Rg.LIZIZ.start();
        }
        this.LJIILLIIL = new DecodingHandler(C786410Ut5.W2(C20520215Rg.LIZIZ), this);
        this.LJIIZILJ = C786410Ut5.c4(new ThreadFactory() { // from class: X.0p6d
            public final AtomicInteger LL = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTMultiplePlayerImplV2_gift_video_engine-Thread-");
                sbLIZ.append(this.LL.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("threadPool, newThread = ");
                sbLIZ2.append(bPEAThread.getName());
                C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                bPEAThread.setDaemon(false);
                return bPEAThread;
            }
        });
    }

    public final C2262651DhH LIZIZ(int i, String str) {
        if (i >= 0 && i < ((ArrayList) this.LIZJ).size()) {
            C2262651DhH c2262651DhH = (C2262651DhH) C13LP.LJJJLZIJ(i, this.LIZJ);
            if (c2262651DhH == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(", decoder ");
                sbLIZ.append(i);
                sbLIZ.append(" is null");
                C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            return c2262651DhH;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(", invalid decoder index: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", decoderWrappers.size=");
        sbLIZ2.append(((ArrayList) this.LIZJ).size());
        C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public final void LIZJ(int i, String str) {
        C2262651DhH c2262651DhH = (C2262651DhH) C13LP.LJJJLZIJ(i, this.LIZJ);
        if (c2262651DhH != null && !c2262651DhH.LJIILJJIL.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doHandlePreloadMsg, Reached preload threshold (");
            sbLIZ.append(this.LIZIZ * 100);
            sbLIZ.append("%), starting preload of next video, source = ");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            DecodingHandler decodingHandler = this.LJIILLIIL;
            decodingHandler.sendMessage(decodingHandler.obtainMessage(7));
        }
    }

    public final void LJFF(int i, String str) {
        if (this.errorListener != null) {
            C786410Ut5.LJJZZIII(this.LJIILL, new ARunnableS2S1102000_23(this, i, str, 1));
        } else {
            C20441214yg.LIZLLL("notifyError, errorListener is null");
        }
    }

    public final void LJIIJ(int i, boolean z) {
        C2262651DhH c2262651DhHLIZIZ = LIZIZ(i, "stopDecoder");
        if (c2262651DhHLIZIZ == null) {
            return;
        }
        EnumC2262661DhI enumC2262661DhI = c2262651DhHLIZIZ.LIZJ;
        enumC2262661DhI.getClass();
        boolean z2 = true;
        if (enumC2262661DhI != EnumC2262661DhI.LLILLL) {
            EnumC2262661DhI enumC2262661DhI2 = c2262651DhHLIZIZ.LIZJ;
            enumC2262661DhI2.getClass();
            if (enumC2262661DhI2 != EnumC2262661DhI.LLILZ) {
                z2 = false;
            }
        }
        if (!z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopDecoder");
            sbLIZ.append(", Decoder ");
            sbLIZ.append(i);
            sbLIZ.append(" is not in running or paused state, state=");
            sbLIZ.append(c2262651DhHLIZIZ.LIZJ);
            sbLIZ.append(", isSwitchDecoder=");
            sbLIZ.append(z);
            C20441214yg.LJ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stopDecoder");
            sbLIZ2.append('_');
            sbLIZ2.append(i);
            sbLIZ2.append('_');
            sbLIZ2.append(z);
            c2262651DhHLIZIZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            if (!z && i == this.LIZLLL) {
                this.LJIIIIZZ.set(false);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("stopDecoder");
            sbLIZ3.append(", Decoder ");
            sbLIZ3.append(i);
            sbLIZ3.append(" stopped, isSwitchDecoder=");
            sbLIZ3.append(z);
            C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("stopDecoder");
            sbLIZ4.append(", Error stopping decoder ");
            sbLIZ4.append(i);
            sbLIZ4.append(", isSwitchDecoder=");
            sbLIZ4.append(z);
            C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ4), e);
            c2262651DhHLIZIZ.LIZJ = EnumC2262661DhI.LLIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Error stopping decoder ");
            sbLIZ5.append(i);
            sbLIZ5.append(", isSwitchDecoder=");
            sbLIZ5.append(z);
            LJFF(0, C2188811AlT.LIZIZ(sbLIZ5));
        }
    }
}
