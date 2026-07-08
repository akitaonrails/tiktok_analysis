package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C06G4;
import X.C09CT;
import X.EnumC1581606He;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionRecord {

    @C09CT("business_type")
    public final EnumC1581606He businessType;

    @C09CT("data")
    public final String data;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("target_type")
    public final C06G4 targetType;

    public UserInteractionRecord() {
        this(null, null, null, null);
    }

    public UserInteractionRecord(String str, C06G4 c06g4, EnumC1581606He enumC1581606He, String str2) {
        this.id = str;
        this.targetType = c06g4;
        this.businessType = enumC1581606He;
        this.data = str2;
    }
}
