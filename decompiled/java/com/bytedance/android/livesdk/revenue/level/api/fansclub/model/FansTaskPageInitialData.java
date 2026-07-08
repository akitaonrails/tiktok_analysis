package com.bytedance.android.livesdk.revenue.level.api.fansclub.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class FansTaskPageInitialData {

    @C09CT("fans_club_name")
    public final String fansTeamName;

    @C09CT("is_sleeping")
    public final boolean isSleeping;

    public FansTaskPageInitialData(boolean z, String str) {
        this.isSleeping = z;
        this.fansTeamName = str;
    }
}
