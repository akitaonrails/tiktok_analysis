package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class Device implements Serializable {
    public static final int $stable = 0;

    @C09CT("device_id")
    public final Long device_id;

    @C09CT("device_name")
    public final String device_name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return Intrinsics.LJFF(this.device_name, device.device_name) && Intrinsics.LJFF(this.device_id, device.device_id);
    }

    public int hashCode() {
        String str = this.device_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.device_id;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public Device(String str, Long l) {
        this.device_name = str;
        this.device_id = l;
    }
}
