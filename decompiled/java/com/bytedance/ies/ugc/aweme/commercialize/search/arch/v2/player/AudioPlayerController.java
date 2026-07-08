package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player;

import X.C1058540deW;
import X.C1478410oZj;
import X.C1482560ogQ;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C582130MsN;
import X.InterfaceC1018510cbx;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484530ojb;
import X.InterfaceC1484830ok5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AudioPlayerController implements InterfaceC1018510cbx {
    public InterfaceC1484830ok5 audioPlayer;

    @Override // X.InterfaceC1018510cbx
    public void pause() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
    }

    public void release() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
    }

    @Override // X.InterfaceC1018510cbx
    public void resume() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.resume();
        }
    }

    public void stop() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
    }

    public void attach(InterfaceC1483820oiS interfaceC1483820oiS) {
        if (this.audioPlayer == null) {
            InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
            C1478410oZj c1478410oZj = new C1478410oZj();
            c1478410oZj.LIZIZ = true;
            this.audioPlayer = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LIZJ(interfaceC1483820oiS);
        }
    }

    public void play(Aweme aweme) {
        List<String> urlList;
        VideoUrlModel playAddr;
        if (aweme == null) {
            return;
        }
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = aweme.getAid();
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ = aweme.getAid();
        Video video = aweme.getVideo();
        if (video != null && (playAddr = video.getPlayAddr()) != null) {
            urlList = playAddr.getUrlList();
        } else {
            urlList = null;
        }
        c1058540deW.LIZLLL = urlList;
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        c1482570ogRLIZ.LIZIZ.LJJIIZ = "mp3";
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.audioPlayer;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJ(c1482560ogQLIZ);
        }
    }
}
