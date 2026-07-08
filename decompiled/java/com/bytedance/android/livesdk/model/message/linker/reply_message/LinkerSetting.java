package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class LinkerSetting {

    @C09CT("link_type")
    public long linkType;

    @C09CT("max_member_limit")
    public long maxMemberLimit;

    @C09CT("owner_room_id")
    public long ownerRoomId;

    @C09CT("owner_user_id")
    public long ownerUid;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("vendor")
    public int vendor;
}
