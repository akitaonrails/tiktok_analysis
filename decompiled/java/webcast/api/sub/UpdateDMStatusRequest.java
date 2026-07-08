package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.DirectMessageScopeV2Settings;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes23.dex */
public final class UpdateDMStatusRequest {

    @C09CT("group_scope_settings")
    public DirectMessageScopeV2Settings groupScopeSettings;

    @C09CT("group_v2")
    public int groupV2;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("scope")
    public int scope;

    @C09CT("scope_v2")
    public int scopeV2;
}
