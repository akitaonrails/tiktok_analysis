package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsMigrateItem {

    @C09CT("dfid_allowList")
    public final List<String> dfidAllowList;

    @C09CT("host")
    public final String host;

    @C09CT("host_allowList")
    public final List<String> hostAllowList;

    @C09CT("path")
    public final String path;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsMigrateItem)) {
            return false;
        }
        PnsMigrateItem pnsMigrateItem = (PnsMigrateItem) obj;
        return Intrinsics.LJFF(this.host, pnsMigrateItem.host) && Intrinsics.LJFF(this.path, pnsMigrateItem.path) && Intrinsics.LJFF(this.type, pnsMigrateItem.type) && Intrinsics.LJFF(this.dfidAllowList, pnsMigrateItem.dfidAllowList) && Intrinsics.LJFF(this.hostAllowList, pnsMigrateItem.hostAllowList);
    }

    public PnsMigrateItem() {
        this("", "", "cct", new ArrayList(), new ArrayList());
    }

    public PnsMigrateItem(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.host = str;
        this.path = str2;
        this.type = str3;
        this.dfidAllowList = list;
        this.hostAllowList = list2;
    }
}
