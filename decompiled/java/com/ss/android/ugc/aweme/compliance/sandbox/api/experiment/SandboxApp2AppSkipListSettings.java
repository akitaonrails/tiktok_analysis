package com.ss.android.ugc.aweme.compliance.sandbox.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxApp2AppSkipListSettings {
    public static final SandboxApp2AppSkipListData LIZ = new SandboxApp2AppSkipListData(null, null, null);

    public static final class SandboxApp2AppSkipListData {

        @C09CT("intent_action")
        public final List<String> skipActions;

        @C09CT("intent_category")
        public final List<String> skipCategories;

        @C09CT("intent_package")
        public final List<String> skipPackages;

        public SandboxApp2AppSkipListData() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SandboxApp2AppSkipListData)) {
                return false;
            }
            SandboxApp2AppSkipListData sandboxApp2AppSkipListData = (SandboxApp2AppSkipListData) obj;
            return Intrinsics.LJFF(this.skipPackages, sandboxApp2AppSkipListData.skipPackages) && Intrinsics.LJFF(this.skipActions, sandboxApp2AppSkipListData.skipActions) && Intrinsics.LJFF(this.skipCategories, sandboxApp2AppSkipListData.skipCategories);
        }

        public final int hashCode() {
            List<String> list = this.skipPackages;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.skipActions;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.skipCategories;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SandboxApp2AppSkipListData(skipPackages=");
            sbLIZ.append(this.skipPackages);
            sbLIZ.append(", skipActions=");
            sbLIZ.append(this.skipActions);
            sbLIZ.append(", skipCategories=");
            sbLIZ.append(this.skipCategories);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SandboxApp2AppSkipListData(List<String> list, List<String> list2, List<String> list3) {
            this.skipPackages = list;
            this.skipActions = list2;
            this.skipCategories = list3;
        }
    }
}
