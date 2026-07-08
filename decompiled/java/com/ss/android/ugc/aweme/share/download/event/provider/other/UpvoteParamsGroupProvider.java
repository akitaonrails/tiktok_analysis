package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C01T1;
import X.C1380780m2G;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteParamsGroupProvider implements BaseDownloadParamsGroupProvider<C01T1> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final String str = c1380780m2G.LLILLL;
        final Aweme aweme = c1380780m2G.LLILLJJLI;
        return new InterfaceC1282004zy(str, aweme) { // from class: X.01T1
            public final String LL;
            public final Aweme LLILLJJLI;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C01T1)) {
                    return false;
                }
                C01T1 c01t1 = (C01T1) obj;
                return Intrinsics.LJFF(this.LL, c01t1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c01t1.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UpvoteParamsGroup(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", aweme=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1359610lU7.LJ(c2344009Gk, this.LLILLJJLI, null);
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
                this.LLILLJJLI = aweme;
            }
        };
    }
}
