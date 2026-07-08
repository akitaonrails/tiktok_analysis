package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class AnchorCustomizedGift {

    @C09CT("customized_gift_available")
    public boolean customizedGiftAvailable;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("review_status")
    public int reviewStatus;

    @C09CT("upload_image")
    public ImageModel uploadImage;
}
