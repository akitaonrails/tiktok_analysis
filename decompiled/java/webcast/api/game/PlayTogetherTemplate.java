package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class PlayTogetherTemplate {

    @C09CT("apply_limit_type")
    public int applyLimitType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("description")
    public String description = "";

    @C09CT("apply_note")
    public String applyNote = "";
}
