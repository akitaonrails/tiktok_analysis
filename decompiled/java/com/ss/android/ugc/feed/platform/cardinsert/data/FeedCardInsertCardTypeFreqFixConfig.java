package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FeedCardInsertCardTypeFreqFixConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("card_type_whitelist")
    public final List<Integer> whitelist;

    public FeedCardInsertCardTypeFreqFixConfig() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedCardInsertCardTypeFreqFixConfig)) {
            return false;
        }
        FeedCardInsertCardTypeFreqFixConfig feedCardInsertCardTypeFreqFixConfig = (FeedCardInsertCardTypeFreqFixConfig) obj;
        return this.enable == feedCardInsertCardTypeFreqFixConfig.enable && Intrinsics.LJFF(this.whitelist, feedCardInsertCardTypeFreqFixConfig.whitelist);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.whitelist.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedCardInsertCardTypeFreqFixConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", whitelist=");
        sbLIZ.append(this.whitelist);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedCardInsertCardTypeFreqFixConfig(boolean z, List<Integer> list) {
        this.enable = z;
        this.whitelist = list;
    }

    public FeedCardInsertCardTypeFreqFixConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
