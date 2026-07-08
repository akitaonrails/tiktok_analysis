package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1380780m2G;
import X.C1554960qZC;
import X.C337901Sv;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class EcomParamsGroupProvider implements BaseDownloadParamsGroupProvider<C337901Sv> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final Aweme aweme = c1380780m2G.LLILLJJLI;
        return new InterfaceC1282004zy(aweme) { // from class: X.01Sv
            public final Aweme LL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C337901Sv) && Intrinsics.LJFF(this.LL, ((C337901Sv) obj).LL);
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EcomParamsGroup(aweme=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJFF(c2344009Gk, this.LL);
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
