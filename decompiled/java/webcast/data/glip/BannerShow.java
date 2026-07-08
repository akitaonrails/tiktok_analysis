package webcast.data.glip;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes9.dex */
public final class BannerShow {

    @C09CT("image")
    public ImageModel image;

    @C09CT("landing_page")
    public BannerLandingPage landingPage;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    @C09CT("subtitle")
    public String subtitle = "";
}
