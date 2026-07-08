package com.ss.android.ugc.aweme.rich.reward.video;

import X.C1034410d1b;
import X.InterfaceC1016100cY4;
import X.InterfaceC1034450d1f;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtVideoPlayTaskManager implements InterfaceC1016100cY4 {
    public final ConcurrentHashMap<String, C1034410d1b> LIZ;
    public final Collection<C1034410d1b> LIZIZ;
    public int LIZJ;
    public final PlayerHandler LIZLLL;
    public InterfaceC1034450d1f LJ;
    public int LJFF;
    public long LJI;
    public long LJII;

    @Override // X.InterfaceC1016100cY4
    public final void LJJIJIIJIL() {
        this.LIZJ++;
        if (this.LIZIZ.isEmpty()) {
            PlayerHandler playerHandler = this.LIZLLL;
            if (playerHandler.hasMessages(1)) {
                playerHandler.removeMessages(1);
            }
        }
    }

    @Override // X.InterfaceC1016100cY4
    public final void LL() {
        for (C1034410d1b c1034410d1b : this.LIZ.values()) {
            if (c1034410d1b.LIZLLL) {
                c1034410d1b.LJI = (int) (((long) c1034410d1b.LIZIZ) / c1034410d1b.LIZ);
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

    @Override // X.InterfaceC1016100cY4
    public final void LLD() {
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            return;
        }
        playerHandler.sendEmptyMessage(1);
    }

    @Override // X.InterfaceC1016100cY4
    public final void LLFF() {
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            playerHandler.removeMessages(1);
        }
    }

    @Override // X.InterfaceC1016100cY4
    public final void reset() {
        this.LIZ.clear();
        PlayerHandler playerHandler = this.LIZLLL;
        if (playerHandler.hasMessages(1)) {
            playerHandler.removeMessages(1);
        }
        this.LIZLLL.LLILLJJLI = 1000L;
        this.LJII = -1L;
    }

    public GmtVideoPlayTaskManager() {
        new ArrayList();
        ConcurrentHashMap<String, C1034410d1b> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = concurrentHashMap;
        this.LIZIZ = concurrentHashMap.values();
        this.LIZLLL = new PlayerHandler(this);
        this.LJ = new InterfaceC1034450d1f() { // from class: X.0d1e
            @Override // X.InterfaceC1034450d1f
            public final long getCurrentPosition() {
                return 0L;
            }
        };
        this.LJII = -1L;
    }

    @Override // X.InterfaceC1016100cY4
    public final int LLF() {
        return this.LIZJ;
    }

    public static final class PlayerHandler extends BPEAHandler {
        public final GmtVideoPlayTaskManager LL;
        public long LLILLJJLI = 1000;

        public PlayerHandler(GmtVideoPlayTaskManager gmtVideoPlayTaskManager) {
            this.LL = gmtVideoPlayTaskManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r16) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.video.GmtVideoPlayTaskManager.PlayerHandler.handleMessage(android.os.Message):void");
        }
    }

    @Override // X.InterfaceC1016100cY4
    public final void LIZ(C1034410d1b c1034410d1b) {
        if (this.LIZIZ.isEmpty()) {
            PlayerHandler playerHandler = this.LIZLLL;
            if (!playerHandler.hasMessages(1)) {
                playerHandler.sendEmptyMessage(1);
            }
        }
        String str = c1034410d1b.LJFF;
        if (this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, c1034410d1b);
    }
}
