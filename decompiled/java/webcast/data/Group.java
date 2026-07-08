package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class Group {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("name")
    public String name = "";

    @C09CT("uri")
    public String uri = "";
}
