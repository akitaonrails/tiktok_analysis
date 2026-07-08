package com.ss.android.ugc.aweme.feed.adapter.widget.openlive;

import X.C01GW;
import X.C0IJT;
import X.C1ACA;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C484720Ize;
import X.C484730Izf;
import X.C484740Izg;
import X.C484750Izh;
import X.C484770Izj;
import Y.ARunnableS76S0200000_7;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import java.util.List;
import webcast.api.room.PreviewGoLiveAnchorPoint;

/* JADX INFO: loaded from: classes8.dex */
public final class GoLiveGuideVM extends LiveWidgetViewModel {
    public static final C484750Izh LLJILJIL = new Object() { // from class: X.0Izh
    };
    public static C484770Izj LLJILJILJ;
    public static List<String> LLJILLL;
    public PreviewGoLiveAnchorPoint LLILLL;
    public ARunnableS76S0200000_7 LLILZ;
    public boolean LLIZ;
    public String LLJI;
    public boolean LLJIJIL;
    public final NextLiveData<Boolean> LL = new NextLiveData<>();
    public final NextLiveData<PreviewGoLiveAnchorPoint> LLILLJJLI = new NextLiveData<>();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C484730Izf());
    public long LLILZLL = -1;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C484740Izg());
    public final C01GW LLJ = C452501pT.LIZIZ(new C484720Ize(this));

    public final C1ACA vQ2() {
        return (C1ACA) this.LLJ.getValue();
    }

    public static String xQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (strValueOf == null) {
            strValueOf = "";
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append("go_live_guide_past_show_times");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void wQ2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ug_node_filter");
        c474500IjALIZ.LJJII("encourage_live_anchor", "biz_name");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZLL), "biz_id");
        c474500IjALIZ.LJJII(2, "node_seq");
        c474500IjALIZ.LJJII(str, "filter_code");
        c474500IjALIZ.LJJII(1, "filter_side");
        c474500IjALIZ.LIZ();
    }
}
