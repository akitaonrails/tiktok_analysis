package com.ss.android.ugc.aweme.sidebar.model;

import X.C09CT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarComponentAction {

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("router_url")
    public final String routerUrl;

    @C09CT("type")
    public final String type;

    public SideBarComponentAction() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideBarComponentAction)) {
            return false;
        }
        SideBarComponentAction sideBarComponentAction = (SideBarComponentAction) obj;
        return Intrinsics.LJFF(this.type, sideBarComponentAction.type) && Intrinsics.LJFF(this.routerUrl, sideBarComponentAction.routerUrl) && Intrinsics.LJFF(this.params, sideBarComponentAction.params);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.routerUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.params;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public SideBarComponentAction(String str, String str2, Map<String, ? extends Object> map) {
        this.type = str;
        this.routerUrl = str2;
        this.params = map;
    }
}
