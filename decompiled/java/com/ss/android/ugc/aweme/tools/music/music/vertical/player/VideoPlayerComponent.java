package com.ss.android.ugc.aweme.tools.music.music.vertical.player;

import X.C01GW;
import X.C1058540deW;
import X.C129G;
import X.C13BV;
import X.C13LP;
import X.C1482560ogQ;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C356901a3;
import X.C452501pT;
import X.InterfaceC1484830ok5;
import X.InterfaceC1488150opR;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoPlayerComponent implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public Lifecycle LLILLL;
    public VideoMusicModel LLILZIL;
    public VideoMusicModel LLILZLL;
    public List<? extends Aweme> LLIZLLLIL;
    public boolean LLJ;
    public Pair<? extends MusicModel, String> LLJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(102));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(103));
    public final Map<C129G, Object> LLILZ = new LinkedHashMap();
    public int LLIZ = -1;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    public final void LIZ() {
        if (this.LLJ) {
            this.LLJ = false;
            ((InterfaceC1488150opR) this.LLILLJJLI.getValue()).LIZ();
        }
    }

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LL.getValue();
    }

    public static void LJI(VideoPlayerComponent videoPlayerComponent) {
        videoPlayerComponent.LIZIZ().stop();
        LJFF(videoPlayerComponent, null);
        videoPlayerComponent.LLILZIL = null;
    }

    public static void LJII(VideoPlayerComponent videoPlayerComponent) {
        videoPlayerComponent.LIZIZ().stop();
        ((LinkedHashMap) videoPlayerComponent.LLILZ).clear();
        videoPlayerComponent.LLIZ = -1;
        videoPlayerComponent.LLIZLLLIL = null;
    }

    public final boolean LIZLLL(VideoMusicModel videoMusicModel) {
        String aid;
        Aweme aweme;
        if (videoMusicModel.getAweme().getAid() != null) {
            String aid2 = videoMusicModel.getAweme().getAid();
            VideoMusicModel videoMusicModel2 = this.LLILZIL;
            if (videoMusicModel2 != null && (aweme = videoMusicModel2.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJ(MusicModel musicModel) {
        VideoMusicModel videoMusicModel;
        if (musicModel == null || (videoMusicModel = this.LLILZLL) == null || videoMusicModel.getMusicModel().getMusicId() == null || !Intrinsics.LJFF(videoMusicModel.getMusicModel().getMusicId(), musicModel.getMusicId())) {
            return false;
        }
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LIZIZ().stop();
        LIZ();
        Lifecycle lifecycle = this.LLILLL;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILLL = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        List<? extends Aweme> list;
        C356901a3.LIZJ(this, lifecycleOwner);
        if ((!this.LLILZ.isEmpty() && (list = this.LLIZLLLIL) != null && C13LP.LJJJLZIJ(this.LLIZ, list) != null) || this.LLILZIL != null) {
            LIZIZ().pause();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        List<? extends Aweme> list;
        C356901a3.LIZLLL(this, lifecycleOwner);
        if ((!this.LLILZ.isEmpty() && (list = this.LLIZLLLIL) != null && C13LP.LJJJLZIJ(this.LLIZ, list) != null) || this.LLILZIL != null) {
            LIZIZ().resume();
        }
    }

    public static C1482560ogQ LIZJ(Video video, String str) {
        VideoUrlModel h264PlayAddr;
        String urlKey;
        List<String> urlList;
        if (video.checkVideo(video.getPlayAddr())) {
            h264PlayAddr = video.getPlayAddr();
        } else {
            h264PlayAddr = video.getH264PlayAddr();
        }
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = str;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        if (h264PlayAddr != null) {
            urlKey = h264PlayAddr.getUrlKey();
        } else {
            urlKey = null;
        }
        c1058540deW.LIZIZ = urlKey;
        if (h264PlayAddr == null || (urlList = h264PlayAddr.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        c1058540deW.LIZLLL = urlList;
        c1058540deW.LIZ();
        return new C1484680ojq(c1482580ogS).LIZ();
    }

    public static void LJFF(VideoPlayerComponent videoPlayerComponent, VideoMusicModel videoMusicModel) {
        Aweme aweme;
        Video video;
        videoPlayerComponent.LLILZLL = videoMusicModel;
        if (videoMusicModel != null) {
            if (videoPlayerComponent.LLJ) {
                videoPlayerComponent.LLJ = false;
                ((InterfaceC1488150opR) videoPlayerComponent.LLILLJJLI.getValue()).LIZ();
            }
            VideoMusicModel videoMusicModel2 = videoPlayerComponent.LLILZLL;
            if (videoMusicModel2 != null && (aweme = videoMusicModel2.getAweme()) != null && (video = aweme.getVideo()) != null) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                ((InterfaceC1488150opR) videoPlayerComponent.LLILLJJLI.getValue()).LJIILLIIL(-1, Collections.singletonList(LIZJ(video, aid)));
                videoPlayerComponent.LLJ = true;
                return;
            }
            return;
        }
        videoPlayerComponent.LIZ();
    }
}
