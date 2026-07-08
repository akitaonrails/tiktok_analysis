package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleArmy {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("anchor_id_str")
    public String anchorIdStr;

    @C09CT("rank_list")
    public List<RankUser> rankList;

    public static final class RankUser {

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("nickname")
        public String nickname;

        @C09CT("score")
        public Long score;

        @C09CT("user_id")
        public Long userId;

        @C09CT("user_id_str")
        public String userIdStr;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.userId != null) {
                sb.append(", user_id=");
                sb.append(this.userId);
            }
            if (this.nickname != null) {
                sb.append(", nickname=");
                sb.append(this.nickname);
            }
            if (this.avatarThumb != null) {
                sb.append(", avatar_thumb=");
                sb.append(this.avatarThumb);
            }
            if (this.score != null) {
                sb.append(", score=");
                sb.append(this.score);
            }
            if (this.userIdStr != null) {
                sb.append(", user_id_str=");
                sb.append(this.userIdStr);
            }
            sb.replace(0, 2, "RankUser{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        List<RankUser> list = this.rankList;
        if (list != null && !list.isEmpty()) {
            sb.append(", rank_list=");
            sb.append(this.rankList);
        }
        if (this.anchorIdStr != null) {
            sb.append(", anchor_id_str=");
            sb.append(this.anchorIdStr);
        }
        sb.replace(0, 2, "BattleArmy{");
        sb.append('}');
        return sb.toString();
    }
}
