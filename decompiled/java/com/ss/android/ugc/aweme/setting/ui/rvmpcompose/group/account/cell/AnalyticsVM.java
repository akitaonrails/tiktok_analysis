package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.AnonymousClass0858;
import X.C09QQ;
import X.C11W3;
import X.C1238740iLA;
import X.C1934007hq;
import X.C2015907v3;
import X.C2019507vd;
import X.C2188811AlT;
import X.C497270Jen;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.experiment.AnalyticsSDUISetting;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS617S0100000_3;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsVM extends BaseCellSettingsVM<C2015907v3> {
    public final AnonymousClass0858 LL = new Object() { // from class: X.0858
        @C14EU(threadMode = ThreadMode.MAIN)
        public final void onEvent(AnonymousClass0859 anonymousClass0859) {
            AnalyticsVM analyticsVM = this.LIZ;
            analyticsVM.getClass();
            analyticsVM.setState(new AwS582S0100000_3(analyticsVM, 138));
            if (C848040XOo.LIZIZ != null) {
                C0XGN.LJ();
            }
        }

        @C14EU(threadMode = ThreadMode.MAIN)
        public final void onEvent(C848450XQd c848450XQd) {
            AnalyticsVM analyticsVM = this.LIZ;
            analyticsVM.getClass();
            analyticsVM.setState(new AwS582S0100000_3(analyticsVM, 138));
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        boolean zLIZJ = C1238740iLA.LIZJ("show_insights_red").LIZJ("show_insights_red", false);
        return new C2015907v3(Integer.valueOf(R.string.t5e), new C1934007hq(this), new AwS617S0100000_3(this, 36), zLIZJ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C09QQ.LIZIZ(this.LL);
        super.onCleared();
    }

    public final void vQ2(Context context) {
        C1238740iLA.LIZJ("show_insights_red").LJI("show_insights_red", false);
        if (context != null) {
            HashMap map = new HashMap();
            map.put("anchor_type", "analytics");
            AnalyticsSDUISetting.H5AnalyticsInfoStructJsonModel h5AnalyticsInfoStructJsonModelLIZ = AnalyticsSDUISetting.LIZ();
            if (h5AnalyticsInfoStructJsonModelLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.creatorToolEntryURL);
                sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.queryParams);
                sbLIZ.append("&status_bar_height=");
                sbLIZ.append(C497270Jen.LIZ(44));
                SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://www.tiktok.com/insight?hide_nav_bar=1&should_full_screen=1&status_bar_height=");
            sbLIZ2.append(C497270Jen.LIZ(44));
            C11W3.LIZ(context, C2188811AlT.LIZIZ(sbLIZ2), map);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnalyticsCell: ");
        sbLIZ.append(event);
        sbLIZ.append(" | source: ");
        sbLIZ.append(lifecycleOwner);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2019507vd.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C09QQ.LIZIZ(this.LL);
                return;
            }
            return;
        }
        C09QQ.LIZ(this.LL);
    }
}
