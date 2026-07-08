package com.ss.android.ugc.tiktok.tpsc.model;

import X.AnonymousClass1053;
import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsRestriction implements Serializable {
    public static final AnonymousClass1053 Companion = new Object() { // from class: X.1053
    };

    @C09CT("account")
    public final Map<String, PrivacySettingsRestrictionItem> account;

    @C09CT("video")
    public final Map<String, PrivacySettingsRestrictionItem> videoPrivacy;

    public PrivacySettingsRestriction() {
        this(null, null);
    }

    public final PrivacySettingsRestriction copy(Map<String, PrivacySettingsRestrictionItem> map, Map<String, PrivacySettingsRestrictionItem> map2) {
        return new PrivacySettingsRestriction(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestriction)) {
            return false;
        }
        PrivacySettingsRestriction privacySettingsRestriction = (PrivacySettingsRestriction) obj;
        return Intrinsics.LJFF(this.account, privacySettingsRestriction.account) && Intrinsics.LJFF(this.videoPrivacy, privacySettingsRestriction.videoPrivacy);
    }

    public PrivacySettingsRestriction(Map<String, PrivacySettingsRestrictionItem> map, Map<String, PrivacySettingsRestrictionItem> map2) {
        this.account = map;
        this.videoPrivacy = map2;
    }
}
