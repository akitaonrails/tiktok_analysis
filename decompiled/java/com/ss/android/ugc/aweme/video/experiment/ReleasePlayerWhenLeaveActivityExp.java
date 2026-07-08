package com.ss.android.ugc.aweme.video.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ReleasePlayerWhenLeaveActivityExp {
    public static final Config LIZ = new Config(false, 0);
    public static final C01GW LIZIZ;

    static {
        new Config(true, LivePreCreateNextRoomPlayer.ENABLE);
        LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(355));
    }

    public static final class Config {

        @C09CT("delay")
        public final int delay;

        @C09CT("enable")
        public final boolean enable;

        public Config() {
            this(false, 0);
        }

        public Config(boolean z, int i) {
            this.enable = z;
            this.delay = i;
        }
    }
}
