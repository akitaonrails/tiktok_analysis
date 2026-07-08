package com.ss.android.ugc.aweme.badge;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class EditProfileBadgeCampaignModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("description")
    public final String description;

    @C09CT("name")
    public final String name;

    public EditProfileBadgeCampaignModel(String str, String str2) {
        this.name = str;
        this.description = str2;
    }
}
