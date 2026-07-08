package com.ss.android.ugc.aweme.commercialize.utils.video;

import X.C306380Bzg;
import X.C988020bom;
import X.C988290bpD;
import X.InterfaceC988050bop;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoPlayTaskManager implements IVideoPlayTaskManager {
    public final ConcurrentHashMap<String, C988290bpD> LIZ;
    public final Collection<C988290bpD> LIZIZ;
    public int LIZJ;
    public final PlayerHandler LIZLLL;
    public InterfaceC988050bop LJ;
    public int LJFF;
    public long LJI;
    public long LJII;

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJJIJIIJIL() {
        this.LIZJ++;
        if (this.LIZIZ.isEmpty()) {
            PlayerHandler playerHandler = this.LIZLLL;
            if (playerHandler.hasMessages(1)) {
                playerHandler.removeMessages(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LL() {
        for (C988290bpD c988290bpD : this.LIZ.values()) {
            if (c988290bpD.LIZLLL) {
                c988290bpD.LJI = (int) (((long) c988290bpD.LIZIZ) / c988290bpD.LIZ);
            }
        }
        this.LIZJ = 0;
        this.LJFF = 0;
        this.LJI = 0L;
        if (!this.LIZIZ.isEmpty()) {
            PlayerHandler playerHandler = this.LIZLLL;
            if (playerHandler.hasMessages(1)) {
                return;
            }
            playerHandler.sendEmptyMessage(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLD() {
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            return;
        }
        playerHandler.sendEmptyMessage(1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLFF() {
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            playerHandler.removeMessages(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final long getCurrentPosition() {
        return this.LJ.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void reset() {
        this.LIZ.clear();
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            playerHandler.removeMessages(1);
        }
        this.LIZLLL.LLILLJJLI = C306380Bzg.LIZ() > 0 ? C306380Bzg.LIZ() : 1000L;
        this.LJII = -1L;
    }

    public VideoPlayTaskManager() {
        new ArrayList();
        ConcurrentHashMap<String, C988290bpD> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = concurrentHashMap;
        this.LIZIZ = concurrentHashMap.values();
        this.LIZLLL = new PlayerHandler(this);
        this.LJ = C988020bom.LL;
        this.LJII = -1L;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final int LLF() {
        return this.LIZJ;
    }

    public static final class PlayerHandler extends BPEAHandler {
        public final VideoPlayTaskManager LL;
        public long LLILLJJLI;

        public PlayerHandler(VideoPlayTaskManager videoPlayTaskManager) {
            long jLIZ;
            this.LL = videoPlayTaskManager;
            if (C306380Bzg.LIZ() > 0) {
                jLIZ = C306380Bzg.LIZ();
            } else {
                jLIZ = 1000;
            }
            this.LLILLJJLI = jLIZ;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (java.lang.Math.abs(r1 - r6) > 500) goto L18;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r16) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager.PlayerHandler.handleMessage(android.os.Message):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLFII(InterfaceC988050bop interfaceC988050bop) {
        this.LJ = interfaceC988050bop;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLFZ(String str) {
        if (this.LIZ.containsKey(str)) {
            this.LIZ.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLI(long j) {
        if (C306380Bzg.LIZ() <= 0) {
            this.LIZLLL.LLILLJJLI = j;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLIFFJFJJ(C988290bpD c988290bpD) {
        if (this.LIZIZ.isEmpty()) {
            PlayerHandler playerHandler = this.LIZLLL;
            if (!playerHandler.hasMessages(1)) {
                playerHandler.sendEmptyMessage(1);
            }
        }
        String str = c988290bpD.LJFF;
        if (this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, c988290bpD);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LLFFF(int i, boolean z) {
        this.LIZJ = i;
        if (z) {
            this.LJFF = i;
            this.LJI = getCurrentPosition();
        }
        for (C988290bpD c988290bpD : this.LIZIZ) {
            if (c988290bpD.LIZLLL) {
                c988290bpD.LJI = i;
            }
        }
    }
}
