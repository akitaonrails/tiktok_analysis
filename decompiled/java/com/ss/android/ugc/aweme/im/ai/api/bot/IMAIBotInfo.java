package com.ss.android.ugc.aweme.im.ai.api.bot;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAIBotInfo implements Serializable {

    @C09CT("auto_reply_switch")
    public final int autoReplySwitch;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("avoid")
    public final String avoid;

    @C09CT("bizId")
    public final int bizId;

    @C09CT("check_first")
    public final String checkFirst;

    @C09CT("creator_uid")
    public final long creatorUid;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("mode")
    public final int mode;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("progress_percentage")
    public final double progressPercentage;

    @C09CT("progress_text")
    public final String progressText;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("suggested_reply_switch")
    public final int suggestedReplySwitch;

    @C09CT("unique_name")
    public final String uniqueName;

    @C09CT("update_time")
    public final long updateTime;

    public final IMAIBotInfo copy(long j, int i, int i2, int i3, long j2, String str, String str2, String str3, double d, String str4, int i4, int i5, String str5, String str6, int i6, long j3) {
        return new IMAIBotInfo(j, i, i2, i3, j2, str, str2, str3, d, str4, i4, i5, str5, str6, i6, j3);
    }

    public IMAIBotInfo(long j, int i, int i2, int i3, long j2, String str, String str2, String str3, double d, String str4, int i4, int i5, String str5, String str6, int i6, long j3) {
        this.id = j;
        this.bizId = i;
        this.scene = i2;
        this.status = i3;
        this.creatorUid = j2;
        this.nickname = str;
        this.uniqueName = str2;
        this.avatarUrl = str3;
        this.progressPercentage = d;
        this.progressText = str4;
        this.suggestedReplySwitch = i4;
        this.autoReplySwitch = i5;
        this.avoid = str5;
        this.checkFirst = str6;
        this.mode = i6;
        this.updateTime = j3;
    }
}
