package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PostLiveFragmentReq {

    @C09CT("edit_param")
    public EditParam editParam;

    @C09CT("post_by_scene")
    public int postByScene;

    @C09CT("private_status")
    public int privateStatus;

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("hash_tag_list")
    public List<HashTag> hashTagList = new ArrayList();

    @C09CT("user_identity")
    public String userIdentity = "";
}
