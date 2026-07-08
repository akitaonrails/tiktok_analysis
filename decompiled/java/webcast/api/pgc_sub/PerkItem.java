package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PerkItem {

    @C09CT("icon_dark")
    public ImageModel iconDark;

    @C09CT("icon_light")
    public ImageModel iconLight;

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";
}
