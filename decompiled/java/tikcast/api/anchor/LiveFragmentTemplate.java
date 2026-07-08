package tikcast.api.anchor;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveFragmentTemplate {

    @C09CT("clips_amount")
    public long clipsAmount;

    @C09CT("is_from_cc")
    public boolean isFromCc;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("play_url")
    public String playUrl = "";

    @C09CT("author_name")
    public String authorName = "";

    @C09CT("author_avatar_url")
    public String authorAvatarUrl = "";

    @C09CT("title")
    public String title = "";
}
