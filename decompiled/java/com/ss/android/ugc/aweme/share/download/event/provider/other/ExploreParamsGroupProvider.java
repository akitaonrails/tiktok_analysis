package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1381000m2c;
import X.C1554960qZC;
import X.C614760O9i;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ExploreParamsGroupProvider implements BaseDownloadParamsGroupProvider<C614760O9i> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1381000m2c c1381000m2c;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1381000m2c.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1381000m2c = (C1381000m2c) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final String str = c1381000m2c.LL;
        final Aweme aweme = c1381000m2c.LLILLJJLI;
        final String str2 = c1381000m2c.LLILLL;
        return new InterfaceC1282004zy(aweme, str, str2) { // from class: X.0O9i
            public final String LL;
            public final Aweme LLILLJJLI;
            public final String LLILLL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C614760O9i)) {
                    return false;
                }
                C614760O9i c614760O9i = (C614760O9i) obj;
                return Intrinsics.LJFF(this.LL, c614760O9i.LL) && Intrinsics.LJFF(this.LLILLJJLI, c614760O9i.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c614760O9i.LLILLL);
            }

            public final int hashCode() {
                return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ExploreParamsGroup(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", aweme=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", exploreFromGroupId=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C15WT.LIZIZ.LJFF(c2344009Gk, this.LL, this.LLILLL, this.LLILLJJLI.getAid());
                c2344009Gk.LJFF("request_id", C735370Ssx.LJIJJ(this.LLILLJJLI));
                c2344009Gk.LIZJ(C735370Ssx.LJIILL(this.LLILLJJLI), "pic_cnt");
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
                this.LLILLL = str2;
            }
        };
    }
}
