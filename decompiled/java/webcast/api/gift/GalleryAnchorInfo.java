package webcast.api.gift;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class GalleryAnchorInfo {

    @C09CT("num_lit_up")
    public int numLitUp;

    @C09CT("num_total")
    public int numTotal;

    @C09CT("opt_out_duel")
    public boolean optOutDuel;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("avatar_url")
    public String avatarUrl = "";
}
