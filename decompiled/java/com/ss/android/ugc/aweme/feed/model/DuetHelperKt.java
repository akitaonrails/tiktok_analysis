package com.ss.android.ugc.aweme.feed.model;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes32.dex */
public final class DuetHelperKt {
    public static final boolean checkDuetSetting(Aweme aweme) {
        User user = aweme.author;
        if (user == null) {
            return false;
        }
        int duetSetting = user.getDuetSetting();
        if (duetSetting == 0) {
            return true;
        }
        if (duetSetting != 1 || aweme.author.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean canAddDuet(Aweme aweme, boolean z) {
        int duet;
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            duet = interactPermission.getDuet();
            if (duet == 4) {
                return false;
            }
        } else {
            duet = 0;
        }
        if ((!z && (duet == 2 || AwemeExtKt.isPrivate(aweme))) || !AwemeExtKt.canDuetVideoType(aweme) || aweme.isWithPromotionalMusic() || aweme.duetSetting == 2) {
            return false;
        }
        return true;
    }

    public static final boolean setGrayForDuet(Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4) {
        int duet;
        boolean zCheckDuetSetting = checkDuetSetting(aweme);
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            duet = interactPermission.getDuet();
        } else {
            duet = 0;
        }
        if (z2 && duet != 3 && ((z || (zCheckDuetSetting && duet != 1)) && ((!aweme.author.isSecret() || z) && !z3 && !z4))) {
            return false;
        }
        return true;
    }
}
