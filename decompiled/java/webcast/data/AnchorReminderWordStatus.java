package webcast.data;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorReminderWordStatus {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";
}
