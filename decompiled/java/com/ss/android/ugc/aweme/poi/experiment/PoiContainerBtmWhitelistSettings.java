package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiContainerBtmWhitelistSettings {
    public static final PoiContainerBtmWhitelistModel LIZ = new PoiContainerBtmWhitelistModel(C13BV.INSTANCE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(600));

    public static final class PoiContainerBtmWhitelistModel {

        @C09CT("btm_list")
        public final List<String> btmList;

        public PoiContainerBtmWhitelistModel() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiContainerBtmWhitelistModel) && Intrinsics.LJFF(this.btmList, ((PoiContainerBtmWhitelistModel) obj).btmList);
        }

        public final int hashCode() {
            List<String> list = this.btmList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiContainerBtmWhitelistModel(btmList=");
            sbLIZ.append(this.btmList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiContainerBtmWhitelistModel(List<String> list) {
            this.btmList = list;
        }

        public PoiContainerBtmWhitelistModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
