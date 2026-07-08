package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BcmKeyEntryPath {

    @C09CT("bcm")
    public final String bcmKey;

    @C09CT("location")
    public final List<String> locationList;

    public BcmKeyEntryPath() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BcmKeyEntryPath)) {
            return false;
        }
        BcmKeyEntryPath bcmKeyEntryPath = (BcmKeyEntryPath) obj;
        return Intrinsics.LJFF(this.bcmKey, bcmKeyEntryPath.bcmKey) && Intrinsics.LJFF(this.locationList, bcmKeyEntryPath.locationList);
    }

    public final int hashCode() {
        return (this.bcmKey.hashCode() * 31) + this.locationList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BcmKeyEntryPath(bcmKey=");
        sbLIZ.append(this.bcmKey);
        sbLIZ.append(", locationList=");
        sbLIZ.append(this.locationList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BcmKeyEntryPath(String str, List<String> list) {
        this.bcmKey = str;
        this.locationList = list;
    }

    public BcmKeyEntryPath(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
