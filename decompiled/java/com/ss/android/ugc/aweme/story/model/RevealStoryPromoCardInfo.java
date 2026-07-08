package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RevealStoryPromoCardInfo implements Serializable {

    @C09CT("is_story_reveal_promo_card")
    public Boolean isStoryRevealPromoCard;

    @C09CT("reveal_friend_users")
    public List<User> revealFriendUsers;

    @C09CT("total_friend_count")
    public Integer totalFriendCount;

    public RevealStoryPromoCardInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevealStoryPromoCardInfo)) {
            return false;
        }
        RevealStoryPromoCardInfo revealStoryPromoCardInfo = (RevealStoryPromoCardInfo) obj;
        return Intrinsics.LJFF(this.isStoryRevealPromoCard, revealStoryPromoCardInfo.isStoryRevealPromoCard) && Intrinsics.LJFF(this.revealFriendUsers, revealStoryPromoCardInfo.revealFriendUsers) && Intrinsics.LJFF(this.totalFriendCount, revealStoryPromoCardInfo.totalFriendCount);
    }

    public int hashCode() {
        Boolean bool = this.isStoryRevealPromoCard;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<User> list = this.revealFriendUsers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.totalFriendCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealStoryPromoCardInfo(isStoryRevealPromoCard=");
        sbLIZ.append(this.isStoryRevealPromoCard);
        sbLIZ.append(", revealFriendUsers=");
        sbLIZ.append(this.revealFriendUsers);
        sbLIZ.append(", totalFriendCount=");
        sbLIZ.append(this.totalFriendCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isStoryRevealPromoCard() {
        return this.isStoryRevealPromoCard;
    }

    public final void setRevealFriendUsers(List<User> list) {
        this.revealFriendUsers = list;
    }

    public final void setStoryRevealPromoCard(Boolean bool) {
        this.isStoryRevealPromoCard = bool;
    }

    public final void setTotalFriendCount(Integer num) {
        this.totalFriendCount = num;
    }

    public RevealStoryPromoCardInfo(Boolean bool, List<User> list, Integer num) {
        this.isStoryRevealPromoCard = bool;
        this.revealFriendUsers = list;
        this.totalFriendCount = num;
    }
}
