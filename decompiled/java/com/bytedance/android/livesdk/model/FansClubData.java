package com.bytedance.android.livesdk.model;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FansClubData {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("available_gift_ids")
    public List<Long> availableGiftIds;

    @C09CT("badge")
    public UserBadge badge;

    @C09CT("club_name")
    public String clubName;

    @C09CT("level")
    public int level;

    @C09CT("user_fans_club_status")
    public int userFansClubStatus;

    public static class UserBadge {

        @C09CT("icons")
        public Map<Integer, ImageModel> icons;

        @C09CT("title")
        public String title;
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData != null && !TextUtils.isEmpty(fansClubData.clubName)) {
            return true;
        }
        return false;
    }
}
