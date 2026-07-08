package webcast.data.multi_guest_play;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderPlayContent {

    @C09CT("end_time")
    public long endTime;

    @C09CT("room_id")
    public long roomId;

    @C09CT("running_text_header_info")
    public TextHeaderRecordInfo runningTextHeaderInfo;

    @C09CT("selected_text_header_info")
    public TextHeaderRecordInfo selectedTextHeaderInfo;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("text_header_id")
    public long textHeaderId;

    @C09CT("version")
    public long version;
}
