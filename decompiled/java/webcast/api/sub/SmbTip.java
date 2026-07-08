package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SmbTip {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image_url")
    public ImageModel imageUrl;

    @C09CT("is_fixed")
    public boolean isFixed;

    @C09CT("tip_location")
    public int tipLocation;

    @C09CT("tip_type")
    public int tipType;

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("button_text")
    public String buttonText = "";

    @C09CT("schema")
    public String schema = "";
}
