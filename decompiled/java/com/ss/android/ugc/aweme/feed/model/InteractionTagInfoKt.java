package com.ss.android.ugc.aweme.feed.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes35.dex */
public final class InteractionTagInfoKt {
    public static final MutualUser toMutualUser(InteractionTagUserInfo interactionTagUserInfo) {
        String str = interactionTagUserInfo.uid;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = interactionTagUserInfo.nickname;
        if (str3 != null) {
            str2 = str3;
        }
        UrlModel urlModel = interactionTagUserInfo.avatarThumb;
        return new MutualUser(str, str2, urlModel, urlModel, "", null);
    }

    public static final User toUser(InteractionTagUserInfo interactionTagUserInfo) {
        User user = new User();
        user.setUid(interactionTagUserInfo.uid);
        user.setUniqueId(interactionTagUserInfo.uniqueId);
        user.setNickname(interactionTagUserInfo.nickname);
        user.setAvatarThumb(interactionTagUserInfo.avatarThumb);
        user.setFollowStatus(interactionTagUserInfo.followStatus);
        user.setFollowerStatus(interactionTagUserInfo.followerStatus);
        boolean z = true;
        if (interactionTagUserInfo.isPrivateAccount() != 1) {
            z = false;
        }
        user.setPrivateAccount(z);
        user.setCustomVerify(interactionTagUserInfo.customVerify);
        user.setEnterpriseVerifyReason(interactionTagUserInfo.enterpriseVerifyReason);
        user.setTaggedIsBA(interactionTagUserInfo.isBusinessAccount());
        user.setTaggedBAInvitationStatus(interactionTagUserInfo.invitationStatus);
        return user;
    }
}
