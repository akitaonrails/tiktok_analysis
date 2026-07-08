package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubPackageSummary {

    @C09CT("is_default_package")
    public boolean isDefaultPackage;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("is_pinned")
    public boolean isPinned;

    @C09CT("price_info")
    public SubPackagePriceInfo priceInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";

    @C09CT("desc")
    public String desc = "";
}
