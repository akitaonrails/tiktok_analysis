package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class SpotlightUpdateItem {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_pinned")
    public boolean isPinned;

    @C09CT("uri")
    public String uri = "";
}
