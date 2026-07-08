package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotCreateData implements Serializable {
    public static final int $stable = 0;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_short_id")
    public final Long conversationShortId;

    @C09CT("conversation_type")
    public final Integer conversationType;

    @C09CT("image_info")
    public final AIShotImageInfo imageInfo;

    @C09CT("effect_template_id")
    public final String templateId;

    @C09CT("im_session_id")
    public final String uuid;

    public AIGroupShotCreateData(String str, Integer num, Long l, String str2, AIShotImageInfo aIShotImageInfo, String str3) {
        this.conversationId = str;
        this.conversationType = num;
        this.conversationShortId = l;
        this.templateId = str2;
        this.imageInfo = aIShotImageInfo;
        this.uuid = str3;
    }
}
