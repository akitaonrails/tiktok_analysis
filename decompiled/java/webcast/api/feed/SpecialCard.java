package webcast.api.feed;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialCard {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("payload")
    public String payload = "";

    @C09CT("type")
    public int type;
}
