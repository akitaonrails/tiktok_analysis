package com.bytedance.pumbaa.app2app;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartySDKSourceTrafficTagData {

    @C09CT("app2app")
    public final boolean app2app;

    @C09CT("network")
    public final boolean network;

    @C09CT("user_input")
    public final boolean userInput;

    public ThirdPartySDKSourceTrafficTagData() {
        this(true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartySDKSourceTrafficTagData)) {
            return false;
        }
        ThirdPartySDKSourceTrafficTagData thirdPartySDKSourceTrafficTagData = (ThirdPartySDKSourceTrafficTagData) obj;
        return this.app2app == thirdPartySDKSourceTrafficTagData.app2app && this.userInput == thirdPartySDKSourceTrafficTagData.userInput && this.network == thirdPartySDKSourceTrafficTagData.network;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.app2app;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.userInput;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return ((i + r02) * 31) + (this.network ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartySDKSourceTrafficTagData(app2app=");
        sbLIZ.append(this.app2app);
        sbLIZ.append(", userInput=");
        sbLIZ.append(this.userInput);
        sbLIZ.append(", network=");
        sbLIZ.append(this.network);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThirdPartySDKSourceTrafficTagData(boolean z, boolean z2, boolean z3) {
        this.app2app = z;
        this.userInput = z2;
        this.network = z3;
    }
}
