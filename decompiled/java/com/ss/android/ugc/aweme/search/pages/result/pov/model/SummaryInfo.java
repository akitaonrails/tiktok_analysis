package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SummaryInfo implements Serializable {

    @C09CT("is_stream")
    public final boolean isStream;

    @C09CT("is_tako")
    public final boolean isTako;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("stream_param")
    public final String streamParam;

    public SummaryInfo() {
        this(false, -1, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryInfo)) {
            return false;
        }
        SummaryInfo summaryInfo = (SummaryInfo) obj;
        return this.isStream == summaryInfo.isStream && this.status == summaryInfo.status && Intrinsics.LJFF(this.streamParam, summaryInfo.streamParam) && this.isTako == summaryInfo.isTako;
    }

    public final boolean isStream() {
        return this.isStream;
    }

    public final boolean isTako() {
        return this.isTako;
    }

    public SummaryInfo(boolean z, int i, String str, boolean z2) {
        this.isStream = z;
        this.status = i;
        this.streamParam = str;
        this.isTako = z2;
    }
}
