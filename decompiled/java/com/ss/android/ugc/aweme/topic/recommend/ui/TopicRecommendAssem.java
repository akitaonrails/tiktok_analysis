package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.C1559260qg8;
import X.C2097908Jt;
import X.C427690Gpr;
import X.C626950OiT;
import X.C723590SZx;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRecommendAssem extends DynamicAssem {
    public LinearLayout LLJJI;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, C626950OiT.class, null), checkSupervisorPrepared());
    public final Map<String, Integer> LLJJIJI = C2097908Jt.LIZJ(new Pair("content", Integer.valueOf(R.id.eu1)));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fw8;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return this.LLJJIJI;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        mo127do();
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ol7);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS144S0100000_9(this, 89));
        View viewFindViewById2 = this.LLJJI;
        if (viewFindViewById2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ol7);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJI = (LinearLayout) viewFindViewById2;
        }
        C427690Gpr.LJI(viewFindViewById2, null);
    }
}
