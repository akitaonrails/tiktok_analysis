package com.ss.android.ugc.gamora.editor.lightening.live;

import X.C1119460fEm;
import X.C1444350ngn;
import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.live.ILiveHighLighteningPublisherService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveHighLighteningPublisherService implements ILiveHighLighteningPublisherService {
    @Override // com.ss.android.ugc.aweme.live.ILiveHighLighteningPublisherService
    public final C1444350ngn LIZIZ(Fragment fragment, C19EG c19eg, boolean z) {
        return new C1444350ngn(fragment, c19eg, "live_mile_stone", z);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHighLighteningPublisherService
    public final void LIZ(Object obj, String str, String str2, List list, int i, int i2, int i3, Map map, String str3, String str4, String str5, C1119460fEm c1119460fEm) {
        C1444350ngn c1444350ngn;
        if ((obj instanceof C1444350ngn) && (c1444350ngn = (C1444350ngn) obj) != null) {
            c1444350ngn.LJIILJJIL(str, i2, i3, str2, i, map, list, str5);
            c1444350ngn.LJIILL(str3, str4);
            c1444350ngn.LLJJIJIL = c1119460fEm;
            c1444350ngn.LJJIIJZLJL();
        }
    }
}
