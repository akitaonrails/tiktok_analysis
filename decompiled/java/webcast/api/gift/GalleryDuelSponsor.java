package webcast.api.gift;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GalleryDuelSponsor {

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("opt_out")
    public boolean optOut;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("avatar_image")
    public String avatarImage = "";

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("gift_icon_list")
    public List<String> giftIconList = new ArrayList();
}
