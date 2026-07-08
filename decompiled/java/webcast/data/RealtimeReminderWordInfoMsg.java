package webcast.data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class RealtimeReminderWordInfoMsg {

    @C09CT("title")
    public Text title;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("content")
    public String content = "";

    @C09CT("message_key")
    public String messageKey = "";
}
