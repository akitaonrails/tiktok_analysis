package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Region {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("level")
    public int level;

    @C09CT("location_method")
    public int locationMethod;

    @C09CT("name")
    public String name = "";

    @C09CT("l0_code")
    public String l0Code = "";
}
