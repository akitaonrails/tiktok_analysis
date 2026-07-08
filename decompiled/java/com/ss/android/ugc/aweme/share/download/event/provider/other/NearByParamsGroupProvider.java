package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1380780m2G;
import X.C1554960qZC;
import X.C341760DaY;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NearByParamsGroupProvider implements BaseDownloadParamsGroupProvider<C341760DaY> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final String str = c1380780m2G.LLILLL;
        final Aweme aweme = c1380780m2G.LLILLJJLI;
        return new InterfaceC1282004zy(str, aweme) { // from class: X.0DaY
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
                if (!(obj instanceof C341760DaY)) {
                    return false;
                }
                C341760DaY c341760DaY = (C341760DaY) obj;
                return Intrinsics.LJFF(this.LL, c341760DaY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c341760DaY.LLILLJJLI);
            }

            public final int hashCode() {
                return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NearByParamsGroup(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", aweme=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                if (!Intrinsics.LJFF(this.LL, "homepage_nearby")) {
                    return C2097608Jq.LJ();
                }
                HashMap<String, String> map = new HashMap<>();
                C1606660rua.LIZIZ.LIZJ(this.LL, map, this.LLILLJJLI, true);
                return map;
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
