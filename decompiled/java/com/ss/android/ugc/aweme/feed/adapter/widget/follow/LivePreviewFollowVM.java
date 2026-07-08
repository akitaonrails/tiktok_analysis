package com.ss.android.ugc.aweme.feed.adapter.widget.follow;

import X.C01GW;
import X.C0IJT;
import X.C0J3U;
import X.C0TKN;
import X.C0TL9;
import X.C1ACA;
import X.C1ADO;
import X.C452501pT;
import X.C474500IjA;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewFollowVM extends LiveWidgetViewModel {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 470));

    public final C1ACA vQ2() {
        return (C1ACA) this.LLILLJJLI.getValue();
    }

    public final void wQ2() {
        long j;
        C1ADO c1ado;
        C1ACA c1acaVQ2 = vQ2();
        if (c1acaVQ2 == null || !c1acaVQ2.LJLI) {
            if (C0TKN.LIZ().versionId < 0) {
                return;
            }
            long jLJ = C0TL9.LJ(vQ2());
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1ACA c1acaVQ22 = vQ2();
            if (c1acaVQ22 == null || (c1ado = c1acaVQ22.LJIIJ) == null) {
                j = 0;
            } else {
                j = c1ado.LIZ;
                if (j < 0) {
                    return;
                }
            }
            if (jCurrentTimeMillis - j < jLJ) {
                return;
            }
        }
        C1ACA c1acaVQ23 = vQ2();
        if (c1acaVQ23 != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_preview_follow_btn_pair");
            c474500IjALIZ.LJJIIZI(C0J3U.LIZ(c1acaVQ23));
            c474500IjALIZ.LJJII(Integer.valueOf(C0TKN.LIZ().versionId), "version_id");
            c474500IjALIZ.LIZ();
        }
    }
}
