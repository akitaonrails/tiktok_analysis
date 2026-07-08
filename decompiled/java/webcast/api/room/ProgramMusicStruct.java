package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ProgramMusicStruct {

    @C09CT("create_time")
    public long createTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    @C09CT("used_count")
    public long usedCount;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("album")
    public String album = "";

    @C09CT("author")
    public String author = "";

    @C09CT("title")
    public String title = "";

    @C09CT("internal_id")
    public String internalId = "";
}
