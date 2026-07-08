package com.bytedance.lynx.hybrid.ssp;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1042820dFA;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordingTopDomainRequestResult {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final RequestMeta LIZJ;
    public final EnumC1042820dFA LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordingTopDomainRequestResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasSendNetRequest=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestMeta=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class RequestMeta {

        @C09CT("cdn_url")
        public final String url;

        @C09CT("version")
        public final long version;

        /* JADX WARN: Multi-variable type inference failed */
        public RequestMeta() {
            this(null, 0L, 3, 0 == true ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestMeta(url=");
            sbLIZ.append(this.url);
            sbLIZ.append(", version=");
            sbLIZ.append(this.version);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RequestMeta(String str, long j) {
            this.url = str;
            this.version = j;
        }

        public /* synthetic */ RequestMeta(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
        }
    }

    public /* synthetic */ RecordingTopDomainRequestResult(boolean z, RequestMeta requestMeta, EnumC1042820dFA enumC1042820dFA, String str, int i) {
        this(z, false, requestMeta, (i & 8) != 0 ? null : enumC1042820dFA, (i & 16) == 0 ? str : null);
    }

    public RecordingTopDomainRequestResult(boolean z, boolean z2, RequestMeta requestMeta, EnumC1042820dFA enumC1042820dFA, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = requestMeta;
        this.LIZLLL = enumC1042820dFA;
        this.LJ = str;
    }
}
