package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes32.dex */
public final class SeiPlaybookExtra {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("book_id")
    public final Long bookId;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long playId;

    @C09CT("state_id")
    public final Long runningStateId;

    @C09CT("biz_scenes")
    public final String scene;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("title")
    public final String title;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiPlaybookExtra(playId=");
        sbLIZ.append(this.playId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", bookId=");
        sbLIZ.append(this.bookId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", runningStateId=");
        sbLIZ.append(this.runningStateId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiPlaybookExtra(Long l, Integer num, String str, String str2, Long l2, String str3, Long l3) {
        this.playId = l;
        this.status = num;
        this.title = str;
        this.coverUrl = str2;
        this.bookId = l2;
        this.scene = str3;
        this.runningStateId = l3;
    }
}
