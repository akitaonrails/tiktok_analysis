package com.ss.android.ugc.aweme.music.ghost;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class GhostMusicTabReportResponse extends MusicBaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("log_pb")
    public final LogPbBean logPd;

    public final LogPbBean getLogPd() {
        return this.logPd;
    }
}
