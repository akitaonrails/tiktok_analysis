package com.ss.android.ugc.aweme.ecommerce.dependency.player;

import X.C04TD;
import X.C1058540deW;
import X.C1351990lHp;
import X.C13BV;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1483340ohg;
import X.C1483410ohn;
import X.C1484680ojq;
import X.C1484750ojx;
import X.C585980Mya;
import X.InterfaceC1477220oXo;
import X.InterfaceC1479620obg;
import X.InterfaceC1508380pM4;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PlayerDependencyService implements IPlayerDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean otherSceneFeedUseMediaBoxExp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean otherSceneFeedUseMediaBoxExp2() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1508380pM4 getSharedPlayerManager() {
        return new C585980Mya(C1483410ohn.LJLJJI());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public boolean isVideoPlaying() {
        return C1483410ohn.LJLJJI().isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoMute() {
        C1483410ohn.LJLJJI().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoPause() {
        C1483410ohn.LJLJJI().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoResume() {
        C1483410ohn.LJLJJI().LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void playingVideoUnMute() {
        C1483410ohn.LJLJJI().LJIJJ();
    }

    public static IPlayerDependencyService createIPlayerDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPlayerDependencyService.class, z);
        if (objLIZ != null) {
            return (IPlayerDependencyService) objLIZ;
        }
        if (C04TD.N == null) {
            synchronized (IPlayerDependencyService.class) {
                if (C04TD.N == null) {
                    C04TD.N = new PlayerDependencyService();
                }
            }
        }
        return C04TD.N;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public long getHitCacheSize(VideoUrlModel videoUrlModel) {
        return C1483340ohg.LJIIIZ(videoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public int getNonNullQualityType(VideoUrlModel videoUrlModel) {
        Integer numValueOf;
        if (videoUrlModel == null) {
            return -1;
        }
        InterfaceC1477220oXo hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null || (numValueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            numValueOf = -1;
        }
        return numValueOf.intValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1508380pM4 getPlayerManager(boolean z) {
        return new C585980Mya(new C1483410ohn());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public long getVideoSize(VideoUrlModel videoUrlModel) {
        return C1483340ohg.LJIILLIIL(videoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public void preloadDescVideo(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C1483340ohg.LJJIIJZLJL(1228800, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService
    public InterfaceC1479620obg toIPlayRequest(Aweme aweme) {
        C1482580ogS c1482580ogS;
        VideoUrlModel h264PlayAddr;
        String sourceId;
        long size;
        List<String> urlList;
        Video video = aweme.getVideo();
        if (video != null) {
            c1482580ogS = new C1482580ogS();
            if (video.checkVideo(video.getPlayAddr())) {
                h264PlayAddr = video.getPlayAddr();
            } else {
                h264PlayAddr = video.getH264PlayAddr();
            }
            String urlKey = null;
            if (h264PlayAddr != null) {
                sourceId = h264PlayAddr.getSourceId();
            } else {
                sourceId = null;
            }
            c1482580ogS.LIZ = sourceId;
            c1482580ogS.LIZIZ = video.getRatio();
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZJ = 0;
            if (h264PlayAddr != null) {
                size = h264PlayAddr.getSize();
            } else {
                size = 0;
            }
            c1058540deW.LJ = size;
            if (h264PlayAddr != null) {
                urlKey = h264PlayAddr.getUrlKey();
            }
            c1058540deW.LIZIZ = urlKey;
            if (h264PlayAddr == null || (urlList = h264PlayAddr.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            c1058540deW.LIZLLL = urlList;
            c1058540deW.LIZ();
            for (BitRate bitRate : video.getBitRate()) {
                C1058540deW c1058540deW2 = new C1058540deW(c1482580ogS);
                int i = 1;
                if (bitRate.isBytevc1() != 1) {
                    i = 0;
                }
                c1058540deW2.LIZJ = i;
                c1058540deW2.LJ = bitRate.getSize();
                c1058540deW2.LIZIZ = bitRate.getUrlKey();
                c1058540deW2.LIZLLL = bitRate.urlList();
                C1484750ojx c1484750ojx = new C1484750ojx(c1058540deW2);
                c1484750ojx.LIZ = bitRate.getBitRate();
                c1484750ojx.LIZIZ = bitRate.getGearName();
                c1484750ojx.LIZJ = bitRate.getQualityType();
                c1058540deW2.LJI = c1484750ojx;
                c1058540deW2.LIZ();
            }
            if (video.hasDashBitrate()) {
                C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogS);
                c1351990lHp.LIZ = video.getVideoModelStr();
                c1351990lHp.LIZIZ = video.getVideoModelMap();
                c1482580ogS.LIZLLL = c1351990lHp;
            }
        } else {
            c1482580ogS = new C1482580ogS();
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1482580ogS.LIZ = aid;
        C1482570ogR c1482570ogRLIZ = c1482580ogS.LIZ();
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        return new C1484680ojq(c1482580ogS2).LIZ();
    }
}
