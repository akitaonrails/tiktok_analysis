package com.orbu.core.config;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes.dex */
public final class NetConfig {

    @C09CT("dataflowId")
    public final String dataflowId;

    @C09CT("host")
    public final List<String> hosts;

    @C09CT("path")
    public final List<String> paths;

    public NetConfig() {
        this(null, null, null, 7, null);
    }

    public final boolean match3PDomainAndPath(String str, String str2) {
        char cCharAt;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (this.paths.isEmpty()) {
            for (String str3 : this.hosts) {
                if (str.length() >= str3.length() && str3.length() > 0 && ((((cCharAt = str3.charAt(0)) == '.' || cCharAt == '-') && u.LJIIZILJ(str, str3, false)) || Intrinsics.LJFF(str, str3))) {
                    return true;
                }
            }
        }
        if (!this.hosts.contains(str)) {
            return false;
        }
        if (this.paths.isEmpty()) {
            return true;
        }
        return C13LP.LJJJJ(str2, this.paths);
    }

    public final boolean matchDomainAndPath(String str, String str2) {
        char cCharAt;
        if (str == null || str.length() == 0) {
            return false;
        }
        for (String str3 : this.hosts) {
            if (str.length() >= str3.length() && ((((cCharAt = str3.charAt(0)) == '.' || cCharAt == '-') && u.LJIIZILJ(str, str3, false)) || Intrinsics.LJFF(str, str3))) {
                return true;
            }
        }
        if (str2 == null || str2.length() <= 0) {
            str2 = "/";
        }
        if (!this.paths.isEmpty()) {
            List<String> list = this.paths;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str2, it2.next(), false)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public NetConfig(List<String> list, List<String> list2, String str) {
        this.hosts = list;
        this.paths = list2;
        this.dataflowId = str;
    }

    public NetConfig(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? "" : str);
    }
}
