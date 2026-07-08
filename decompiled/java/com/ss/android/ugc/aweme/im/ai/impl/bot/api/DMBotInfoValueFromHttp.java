package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DMBotInfoValueFromHttp implements Serializable {

    @C09CT("auto_reply_switch")
    public final int autoReplySwitch;

    @C09CT("avoid")
    public final String avoid;

    @C09CT("biz_id")
    public final int bizId;

    @C09CT("bot_account_info")
    public final DMBotAccountInfo botAccountInfo;

    @C09CT("bot_id")
    public final long botId;

    @C09CT("check_first")
    public final String checkFirst;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("creator_uid")
    public final long creatorUid;

    @C09CT("mode")
    public final Integer mode;

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

    @C09CT("update_time")
    public final long updateTime;

    public DMBotInfoValueFromHttp(long j, int i, int i2, int i3, long j2, DMBotAccountInfo dMBotAccountInfo, double d, String str, int i4, int i5, long j3, long j4, String str2, String str3, Integer num) {
        this.botId = j;
        this.bizId = i;
        this.scene = i2;
        this.status = i3;
        this.creatorUid = j2;
        this.botAccountInfo = dMBotAccountInfo;
        this.progressPercentage = d;
        this.progressText = str;
        this.suggestedReplySwitch = i4;
        this.autoReplySwitch = i5;
        this.createTime = j3;
        this.updateTime = j4;
        this.avoid = str2;
        this.checkFirst = str3;
        this.mode = num;
    }
}
