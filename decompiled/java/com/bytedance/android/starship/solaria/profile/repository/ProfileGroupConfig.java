package com.bytedance.android.starship.solaria.profile.repository;

import X.C09CT;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileGroupConfig implements Serializable {

    @C09CT("group_name")
    public final String groupName;

    @C09CT("profile_keys")
    public final HashSet<String> profileKeys;

    @C09CT("version")
    public final Long version;

    public ProfileGroupConfig() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.groupName;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileGroupConfig) {
            return Intrinsics.LJFF(this.groupName, ((ProfileGroupConfig) obj).groupName);
        }
        return false;
    }

    public ProfileGroupConfig(String str, Long l, HashSet<String> hashSet) {
        this.groupName = str;
        this.version = l;
        this.profileKeys = hashSet;
    }
}
