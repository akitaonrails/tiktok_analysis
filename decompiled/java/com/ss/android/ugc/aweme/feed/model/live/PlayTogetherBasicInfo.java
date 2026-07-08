package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class PlayTogetherBasicInfo implements Serializable {

    @C09CT("apply_limit_type")
    public int applyLimitType;

    @C09CT("apply_user_num")
    public long applyUserNum;

    @C09CT("business_version")
    public long businessVersion;

    @C09CT("creator_id")
    public long creatorId;

    @C09CT("is_applying")
    public boolean isApplying;

    @C09CT("is_open_bulletin_board")
    public boolean isOpenBulletinBoard;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template_info")
    public PlayTogetherTemplateV2 templateInfo;

    @C09CT("play_together_id")
    public String playTogetherId = "";

    @C09CT("description")
    public String description = "";

    @C09CT("apply_note")
    public String applyNote = "";

    @C09CT("creator_avatar")
    public String creatorAvatar = "";

    @C09CT("creator_nick_name")
    public String creatorNickName = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isOpenBulletinBoard: ");
        sbLIZ.append(this.isOpenBulletinBoard);
        sbLIZ.append(" \t applyNote: ");
        sbLIZ.append(this.applyNote);
        sbLIZ.append(" \t description: ");
        sbLIZ.append(this.description);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
