package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakFeedbackUploadInfo {

    @C09CT("cur_timestamp")
    public final long curTimestamp;

    @C09CT("cur_timezone")
    public final String curTimezone;

    @C09CT("is_exp_enable_pet")
    public final boolean isExpEnablePet;

    @C09CT("last_fetch_all_date")
    public final long lastFetchAllDataTimeSecond;

    @C09CT("streak_infos")
    public final List<StreakFeedbackUserUploadInfo> steakInfos;

    @C09CT("pet_infos")
    public final List<StreakPetFeedbackUserUploadInfo> streakPetInfos;

    @C09CT("streak_pet_resource_info")
    public final StreakPetResourceInfo streakPetResourceInfo;

    @C09CT("streak_resource_feedback_upload_info")
    public final StreakResourceFeedbackUploadInfo streakResourceFeedbackUploadInfo;

    public StreakFeedbackUploadInfo() {
        this(0L, null, null, null, false, null, null, 0L, 255, null);
    }

    public StreakFeedbackUploadInfo(long j, String str, List<StreakFeedbackUserUploadInfo> list, StreakResourceFeedbackUploadInfo streakResourceFeedbackUploadInfo, boolean z, List<StreakPetFeedbackUserUploadInfo> list2, StreakPetResourceInfo streakPetResourceInfo, long j2) {
        this.curTimestamp = j;
        this.curTimezone = str;
        this.steakInfos = list;
        this.streakResourceFeedbackUploadInfo = streakResourceFeedbackUploadInfo;
        this.isExpEnablePet = z;
        this.streakPetInfos = list2;
        this.streakPetResourceInfo = streakPetResourceInfo;
        this.lastFetchAllDataTimeSecond = j2;
    }

    public StreakFeedbackUploadInfo(long j, String str, List list, StreakResourceFeedbackUploadInfo streakResourceFeedbackUploadInfo, boolean z, List list2, StreakPetResourceInfo streakPetResourceInfo, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : streakResourceFeedbackUploadInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? C13BV.INSTANCE : list2, (i & 64) == 0 ? streakPetResourceInfo : null, (i & 128) == 0 ? j2 : 0L);
    }
}
