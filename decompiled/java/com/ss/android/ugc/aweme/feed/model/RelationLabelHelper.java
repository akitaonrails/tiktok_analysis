package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RelationLabelHelper {
    public static final RelationLabelHelper INSTANCE = new RelationLabelHelper();

    public static final User convertLabelUser2user(RelationLabelUser relationLabelUser) {
        User user = new User();
        user.setUid(String.valueOf(relationLabelUser.getUid()));
        user.setSecUid(relationLabelUser.getSecUid());
        user.setNickname(relationLabelUser.getNickName());
        user.setRemarkName(relationLabelUser.getRemarkName());
        user.setAvatarLarger(relationLabelUser.getAvatarLarger());
        user.setAvatarThumb(relationLabelUser.getAvatarThumb());
        user.setFollowStatus(relationLabelUser.getFollowStatus());
        return user;
    }

    public static final List<User> convertLabelUsers2Users(List<RelationLabelUser> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RelationLabelUser> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(convertLabelUser2user(it2.next()));
        }
        return arrayList;
    }

    public static final boolean hasCommentId(Aweme aweme) {
        RelationLabelNew feedRelationLabel;
        Integer type;
        RelationLabelNew feedRelationLabel2;
        RelationLabelExtra extra;
        String cid;
        if (aweme != null && (feedRelationLabel = aweme.getFeedRelationLabel()) != null && (type = feedRelationLabel.getType()) != null && type.intValue() == 3 && (feedRelationLabel2 = aweme.getFeedRelationLabel()) != null && (extra = feedRelationLabel2.getExtra()) != null && (cid = extra.getCid()) != null && cid.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewFollowRelationLabel(Aweme aweme) {
        Integer type;
        RelationLabelNew relationLabelNew;
        if (aweme != null && (relationLabelNew = aweme.feedRelationLabel) != null) {
            type = relationLabelNew.getType();
        } else {
            type = null;
        }
        return hasNewFollowRelationLabel(type);
    }

    public static final boolean hasNewInteractiveRelationLabel(Integer num) {
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 22 || num.intValue() == 5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean hasNewRelationLabel(Aweme aweme) {
        if (aweme != null && aweme.feedRelationLabel != null) {
            return true;
        }
        return false;
    }

    public static final RelationLabelNew mockStarCommentLabel(User user) {
        RelationLabelNew relationLabelNew = new RelationLabelNew();
        relationLabelNew.setType(4);
        ArrayList arrayList = new ArrayList();
        RelationLabelUser relationLabelUser = new RelationLabelUser();
        relationLabelUser.setUid(CastLongProtector.parseLong(user.getUid()));
        relationLabelUser.setSecUid(user.getSecUid());
        relationLabelUser.setNickName(user.getNickname());
        relationLabelUser.setRemarkName(user.getRemarkName());
        relationLabelUser.setAvatarLarger(user.getAvatarLarger());
        relationLabelUser.setAvatarThumb(user.getAvatarThumb());
        relationLabelUser.setFollowStatus(user.getFollowStatus());
        arrayList.add(relationLabelUser);
        relationLabelNew.setUserList(arrayList);
        return relationLabelNew;
    }

    public static final boolean hasNewFollowRelationLabel(Integer num) {
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewInteractiveRelationLabel(Aweme aweme) {
        Integer type;
        RelationLabelNew relationLabelNew;
        if (aweme != null && (relationLabelNew = aweme.feedRelationLabel) != null) {
            type = relationLabelNew.getType();
        } else {
            type = null;
        }
        return hasNewInteractiveRelationLabel(type);
    }
}
