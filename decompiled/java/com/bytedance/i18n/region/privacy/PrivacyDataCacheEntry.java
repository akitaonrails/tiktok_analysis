package com.bytedance.i18n.region.privacy;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PrivacyDataCacheEntry {

    @C09CT("expire_at_millis")
    public final long expireAtMillis;

    @C09CT("key")
    public final String key;

    @C09CT("ttl_seconds")
    public final long ttlSeconds;

    @C09CT("updated_at_millis")
    public final long updatedAtMillis;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataCacheEntry)) {
            return false;
        }
        PrivacyDataCacheEntry privacyDataCacheEntry = (PrivacyDataCacheEntry) obj;
        return Intrinsics.LJFF(this.key, privacyDataCacheEntry.key) && Intrinsics.LJFF(this.value, privacyDataCacheEntry.value) && this.ttlSeconds == privacyDataCacheEntry.ttlSeconds && this.expireAtMillis == privacyDataCacheEntry.expireAtMillis && this.updatedAtMillis == privacyDataCacheEntry.updatedAtMillis;
    }

    public final int hashCode() {
        return (((((((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + C786410Ut5.Y2(this.ttlSeconds)) * 31) + C786410Ut5.Y2(this.expireAtMillis)) * 31) + C786410Ut5.Y2(this.updatedAtMillis);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataCacheEntry(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", ttlSeconds=");
        sbLIZ.append(this.ttlSeconds);
        sbLIZ.append(", expireAtMillis=");
        sbLIZ.append(this.expireAtMillis);
        sbLIZ.append(", updatedAtMillis=");
        sbLIZ.append(this.updatedAtMillis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(long j) {
        if (this.value.length() > 0 && this.expireAtMillis > j) {
            return true;
        }
        return false;
    }

    public PrivacyDataCacheEntry(String str, String str2, long j, long j2, long j3) {
        this.key = str;
        this.value = str2;
        this.ttlSeconds = j;
        this.expireAtMillis = j2;
        this.updatedAtMillis = j3;
    }
}
