package com.bytedance.pumbaa.utility.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemApiPerfOptConfigV1 {

    @C09CT("bpeaOptEnable")
    public final boolean bpeaOptEnable;

    @C09CT("hookOptEnable")
    public final boolean hookOptEnable;

    public SystemApiPerfOptConfigV1() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemApiPerfOptConfigV1)) {
            return false;
        }
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV1 = (SystemApiPerfOptConfigV1) obj;
        return this.hookOptEnable == systemApiPerfOptConfigV1.hookOptEnable && this.bpeaOptEnable == systemApiPerfOptConfigV1.bpeaOptEnable;
    }

    public SystemApiPerfOptConfigV1(boolean z, boolean z2) {
        this.hookOptEnable = z;
        this.bpeaOptEnable = z2;
    }
}
