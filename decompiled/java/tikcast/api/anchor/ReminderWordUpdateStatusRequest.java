package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class ReminderWordUpdateStatusRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
