package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class FilteredEffect {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("reason_code")
    public int reasonCode;

    @C09CT("reason_msg")
    public String reasonMsg = "";
}
