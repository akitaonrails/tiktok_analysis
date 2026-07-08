package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class SyncNicknameAndUsernameFrequency {

    @C09CT("isUpdated")
    public final boolean isUpdated;

    @C09CT("lastApiTime")
    public final long lastApiTime;

    @C09CT("showTime")
    public final List<Long> showTime;

    public SyncNicknameAndUsernameFrequency(long j, List<Long> list, boolean z) {
        this.lastApiTime = j;
        this.showTime = list;
        this.isUpdated = z;
    }

    public static SyncNicknameAndUsernameFrequency LIZ(SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequency, long j, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            j = syncNicknameAndUsernameFrequency.lastApiTime;
        }
        if ((i & 2) != 0) {
            list = syncNicknameAndUsernameFrequency.showTime;
        }
        if ((i & 4) != 0) {
            z = syncNicknameAndUsernameFrequency.isUpdated;
        }
        syncNicknameAndUsernameFrequency.getClass();
        return new SyncNicknameAndUsernameFrequency(j, list, z);
    }
}
