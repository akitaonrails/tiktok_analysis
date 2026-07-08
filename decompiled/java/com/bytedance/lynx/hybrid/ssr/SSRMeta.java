package com.bytedance.lynx.hybrid.ssr;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class SSRMeta {

    @C09CT("hydrateHash")
    public final String hydrateHash;

    @C09CT("hydrateUrl")
    public final String hydrateUrl;

    @C09CT("serverMode")
    public final String serverMode;

    /* JADX WARN: Multi-variable type inference failed */
    public SSRMeta() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SSRMeta(hydrateUrl='");
        sbLIZ.append(this.hydrateUrl);
        sbLIZ.append("', hydrateHash='");
        sbLIZ.append(this.hydrateHash);
        sbLIZ.append("', serverMode='");
        sbLIZ.append(this.serverMode);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SSRMeta(String str, String str2, String str3) {
        this.hydrateUrl = str;
        this.hydrateHash = str2;
        this.serverMode = str3;
    }

    public /* synthetic */ SSRMeta(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
