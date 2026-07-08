package com.bytedance.pitaya.api;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PTYCustomURLHost implements ReflectionCall {
    public final String authURLHost;
    public final String urlHost;

    public final PTYCustomURLHost copy(String str, String str2) {
        return new PTYCustomURLHost(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYCustomURLHost)) {
            return false;
        }
        PTYCustomURLHost pTYCustomURLHost = (PTYCustomURLHost) obj;
        return Intrinsics.LJFF(this.urlHost, pTYCustomURLHost.urlHost) && Intrinsics.LJFF(this.authURLHost, pTYCustomURLHost.authURLHost);
    }

    public int hashCode() {
        String str = this.urlHost;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authURLHost;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYCustomURLHost(urlHost=");
        sbLIZ.append(this.urlHost);
        sbLIZ.append(", authURLHost=");
        sbLIZ.append(this.authURLHost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAuthURLHost() {
        return this.authURLHost;
    }

    public final String getUrlHost() {
        return this.urlHost;
    }

    public PTYCustomURLHost(String str, String str2) {
        this.urlHost = str;
        this.authURLHost = str2;
    }
}
