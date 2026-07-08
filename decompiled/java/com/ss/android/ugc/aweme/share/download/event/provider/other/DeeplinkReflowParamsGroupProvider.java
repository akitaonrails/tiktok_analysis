package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1380780m2G;
import X.C1554960qZC;
import X.C493001w0;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DeeplinkReflowParamsGroupProvider implements BaseDownloadParamsGroupProvider<C493001w0> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final String str = c1380780m2G.LLIZLLLIL;
        final String str2 = c1380780m2G.LLJ;
        return new InterfaceC1282004zy(str, str2) { // from class: X.01w0
            public final String LL;
            public final String LLILLJJLI;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C493001w0)) {
                    return false;
                }
                C493001w0 c493001w0 = (C493001w0) obj;
                return Intrinsics.LJFF(this.LL, c493001w0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c493001w0.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DeeplinkReflowParamsGroup(externalSharerUid=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", externalShareOid=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("external_sharer_uid", this.LL);
                c2344009Gk.LJFF("_oid", this.LLILLJJLI);
                return c2344009Gk.LIZ;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = str;
                this.LLILLJJLI = str2;
            }
        };
    }
}
