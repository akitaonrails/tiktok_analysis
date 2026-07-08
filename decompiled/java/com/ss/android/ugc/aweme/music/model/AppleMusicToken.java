package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AppleMusicToken implements Serializable {

    @C09CT("developer_token")
    public String developToken;

    @C09CT("user_token")
    public String userToken;

    public AppleMusicToken() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleMusicToken)) {
            return false;
        }
        AppleMusicToken appleMusicToken = (AppleMusicToken) obj;
        return Intrinsics.LJFF(this.developToken, appleMusicToken.developToken) && Intrinsics.LJFF(this.userToken, appleMusicToken.userToken);
    }

    public int hashCode() {
        String str = this.developToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public AppleMusicToken(String str, String str2) {
        this.developToken = str;
        this.userToken = str2;
    }
}
