package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMAudioResourceResponseEntry {

    @C09CT("public_resource_id")
    public final String publicResourceId;

    @C09CT("resource_urls")
    public final List<String> resourceUrls;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMAudioResourceResponseEntry)) {
            return false;
        }
        IMAudioResourceResponseEntry iMAudioResourceResponseEntry = (IMAudioResourceResponseEntry) obj;
        return Intrinsics.LJFF(this.publicResourceId, iMAudioResourceResponseEntry.publicResourceId) && Intrinsics.LJFF(this.resourceUrls, iMAudioResourceResponseEntry.resourceUrls);
    }

    public final int hashCode() {
        return (this.publicResourceId.hashCode() * 31) + this.resourceUrls.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAudioResourceResponseEntry(publicResourceId=");
        sbLIZ.append(this.publicResourceId);
        sbLIZ.append(", resourceUrls=");
        sbLIZ.append(this.resourceUrls);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMAudioResourceResponseEntry() {
        this("", new ArrayList());
    }

    public IMAudioResourceResponseEntry(String str, List<String> list) {
        this.publicResourceId = str;
        this.resourceUrls = list;
    }
}
