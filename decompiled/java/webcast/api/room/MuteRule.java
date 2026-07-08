package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class MuteRule {

    @C09CT("duration_second")
    public long durationSecond;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("content")
    public String content = "";

    @C09CT("normalized_content")
    public String normalizedContent = "";
}
