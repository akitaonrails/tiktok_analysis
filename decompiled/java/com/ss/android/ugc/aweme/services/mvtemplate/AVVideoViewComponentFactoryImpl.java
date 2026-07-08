package com.ss.android.ugc.aweme.services.mvtemplate;

import X.C1425240nBy;
import X.C1473870oSP;
import X.C1478160oZK;
import X.C1481240oeI;
import X.InterfaceC1425180nBs;
import X.InterfaceC1425250nBz;
import X.InterfaceC1425790nCr;
import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class AVVideoViewComponentFactoryImpl implements InterfaceC1425790nCr {
    public static final int $stable = 8;
    public Pair<String, String> lastTryResumeInfo;

    @Override // X.InterfaceC1425790nCr
    public InterfaceC1425180nBs create() {
        final VideoViewComponent videoViewComponent = new VideoViewComponent();
        return new InterfaceC1425180nBs() { // from class: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl.create.1
            public OnUIPlayListener aVOnUIPlayListener;

            public InterfaceC1425790nCr getAvVideoViewComponentFactory() {
                return null;
            }

            @Override // X.InterfaceC1425180nBs
            public long getCurrentPosition() {
                return videoViewComponent.LIZLLL();
            }

            @Override // X.InterfaceC1425180nBs
            public long getVideoDuration() {
                return videoViewComponent.LJ();
            }

            @Override // X.InterfaceC1425180nBs
            public boolean isPlaying() {
                return videoViewComponent.LJFF();
            }

            @Override // X.InterfaceC1425180nBs
            public void mute() {
                videoViewComponent.LJI();
            }

            @Override // X.InterfaceC1425180nBs
            public void pause() {
                videoViewComponent.pause();
            }

            public void removePlayerListener() {
                videoViewComponent.H1(this.aVOnUIPlayListener);
            }

            @Override // X.InterfaceC1425180nBs
            public void stop() {
                videoViewComponent.LJIIJJI();
            }

            @Override // X.InterfaceC1425180nBs
            public void unmute() {
                videoViewComponent.LJIILIIL();
            }

            @Override // X.InterfaceC1425180nBs
            public void addPlayerListener(InterfaceC1425250nBz interfaceC1425250nBz) {
                VideoViewComponent videoViewComponent2 = videoViewComponent;
                OnUIPlayListener onUIPlayListener = AVVideoViewComponentFactoryImplKt.toOnUIPlayListener(interfaceC1425250nBz);
                this.aVOnUIPlayListener = onUIPlayListener;
                videoViewComponent2.LIZ(onUIPlayListener);
            }

            @Override // X.InterfaceC1425180nBs
            public int getCacheSize(Video video) {
                return C1478160oZK.LIZ().LJJLIIIJJI(C1481240oeI.LJ(video.getProperPlayAddr()));
            }

            @Override // X.InterfaceC1425180nBs
            public void seek(float f) {
                videoViewComponent.LJIIIZ(f);
            }

            @Override // X.InterfaceC1425180nBs
            public void setForceNewPlay(boolean z) {
                videoViewComponent.LLJILLL = z;
            }

            @Override // X.InterfaceC1425180nBs
            public void setLoop(boolean z) {
                videoViewComponent.LLJILJILJ = z;
            }

            @Override // X.InterfaceC1425180nBs
            public void wrap(TextureView textureView) {
                videoViewComponent.LJIILJJIL((C1473870oSP) textureView);
            }

            public String getResumeTag(Object obj, int i) {
                return C1425240nBy.LIZ(obj, i);
            }

            @Override // X.InterfaceC1425180nBs
            public void preloadVideo(Video video, int i) {
                C1478160oZK.LIZ().LJJJLL(C1481240oeI.LJ(video.getProperPlayAddr()), i);
            }

            @Override // X.InterfaceC1425180nBs
            public void tryResume(Video video, String str) {
                this.lastTryResumeInfo = new Pair<>(video.getAid(), str);
                videoViewComponent.LJIIL(video);
            }
        };
    }

    @Override // X.InterfaceC1425790nCr
    public Pair<String, String> getLastTryResumeVideoInfo() {
        return this.lastTryResumeInfo;
    }
}
