package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1380780m2G;
import X.C1554960qZC;
import X.C586080Myk;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import android.content.Context;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryParamsGroupProvider implements BaseDownloadParamsGroupProvider<C586080Myk> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final Aweme aweme = c1380780m2G.LLILLJJLI;
        return new InterfaceC1282004zy(aweme) { // from class: X.0Myk
            public final Aweme LL;
            public final String LLILLJJLI = null;
            public final String LLILLL = null;
            public final Context LLILZ = null;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C586080Myk)) {
                    return false;
                }
                C586080Myk c586080Myk = (C586080Myk) obj;
                return Intrinsics.LJFF(this.LL, c586080Myk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c586080Myk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c586080Myk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c586080Myk.LLILZ);
            }

            public final int hashCode() {
                Aweme aweme2 = this.LL;
                int iHashCode = (aweme2 == null ? 0 : aweme2.hashCode()) * 31;
                String str = this.LLILLJJLI;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.LLILLL;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Context context = this.LLILZ;
                return iHashCode3 + (context != null ? context.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StoryParamsGroup(aweme=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", eventType=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", from=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", ctx=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                Aweme aweme2 = this.LL;
                String str = this.LLILLJJLI;
                String str2 = this.LLILLL;
                Context context = this.LLILZ;
                c735840Sti.getClass();
                C735840Sti.LIZJ(c2344009Gk, aweme2, str, str2, context, null);
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
                this.LL = aweme;
            }
        };
    }
}
