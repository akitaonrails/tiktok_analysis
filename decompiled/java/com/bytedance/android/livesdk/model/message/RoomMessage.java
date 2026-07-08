package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class RoomMessage extends AbstractC1136060ffY {
    public Integer LL;
    public String LLILLJJLI;

    @C09CT("content")
    public String content;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("is_welcome")
    public boolean isWelcome;

    @C09CT("public_area_common")
    public PublicAreaMessageCommon publicAreaCommon;

    @C09CT("show_duration_ms")
    public long showDurationMs;

    @C09CT("source")
    public int source;

    @C09CT("supprot_landscape")
    public Boolean supprotLandscape;

    @C09CT("signature_version")
    public String signatureVersion = "";

    @C09CT("sub_scene")
    public String subScene = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("signature")
    public String signature = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public boolean canText() {
        return !TextUtils.isEmpty(this.content) || supportDisplayText();
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public RoomMessage() {
        this.type = C001A.ROOM;
    }
}
