package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaModuleEntry {

    @C09CT("discount_tag_amount")
    public int discountTagAmount;

    @C09CT("enigma_icon")
    public ImageModel enigmaIcon;

    @C09CT("expiry_unix_second")
    public long expiryUnixSecond;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
