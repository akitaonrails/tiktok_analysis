package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC214823195h;
import X.C10HH;
import X.C10R0;
import X.C10R1;
import X.C1388190mED;
import X.C1389340mG4;
import X.C1911410zq7;
import X.C19233810Mm;
import X.C19245810Rc;
import X.C19246210Rg;
import X.C19EG;
import X.C20593115i5;
import X.C2188811AlT;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class TabletInterestSelectionComponent extends BaseInterestSelectionComponent {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGslJzs2OiHELIOSA/PTw2JCAvPSAhZhEtKyM2PAwiPSohLTY4Gio/LSY4ICA9CyohOSA9LSs4";
    public final String LLLLIIL = "tablet";

    public static C10HH QS() {
        C19233810Mm.LIZ.getClass();
        return (C10HH) C19233810Mm.LIZ(C10HH.class);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final C10R1 cS() {
        List<NewUserInterestStruct> list = this.LLLJL;
        AwS607S0100000_28 awS607S0100000_28 = this.LLLIZZ;
        C19245810Rc c19245810Rc = this.LLJL;
        C19246210Rg c19246210Rg = this.LLLIIL;
        Boolean bool = this.LLLILZJ;
        return new C10R0(list, awS607S0100000_28, c19245810Rc, c19246210Rg, bool != null ? bool.booleanValue() : QS().LIZ("should_show_icon", false));
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final RecyclerView.LayoutManager dS() {
        Resources resources;
        Configuration configuration;
        Context context;
        Activity activityLIZ;
        Resources resources2;
        Configuration configuration2;
        C20593115i5.LIZ.getClass();
        boolean z = false;
        if (C20593115i5.LJIIIIZZ(null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("foldable orientation: ");
            Context context2 = getContext();
            sbLIZ.append((context2 == null || (resources2 = context2.getResources()) == null || (configuration2 = resources2.getConfiguration()) == null) ? null : Integer.valueOf(configuration2.orientation));
            C1911410zq7.LIZ("TabletISComponent", C2188811AlT.LIZIZ(sbLIZ));
            Context context3 = getContext();
            if (context3 != null && (resources = context3.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 1 && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                if (r0.LIZIZ() < ((double) C1389340mG4.LIZJ(activityLIZ, null).LIZ()) * 0.5d) {
                    z = true;
                }
            }
        }
        final int iLIZIZ = z ? QS().LIZIZ("card_view_item_count_per_row_on_fold", 2) : QS().LIZIZ("card_view_item_count_per_row", 2);
        RecyclerView recyclerView = this.LLJLLL;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView != null ? recyclerView.getContext() : null, iLIZIZ);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.10Re
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i == 0) {
                    return iLIZIZ;
                }
                return 1;
            }
        };
        return gridLayoutManager;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void HS() {
        C19EG activity;
        Window window;
        C19EG activity2;
        Window window2;
        if (getActivity() instanceof NewUserJourneyActivity) {
            int iLLLLZIL = ((NewUserJourneyActivity) getActivity()).LLLLZIL(true);
            this.LLJJL = iLLLLZIL;
            VR(iLLLLZIL);
            if (Build.VERSION.SDK_INT >= 26 && (activity2 = getActivity()) != null && (window2 = activity2.getWindow()) != null) {
                window2.setNavigationBarColor(this.LLJJL);
            }
        }
        if (getActivity() instanceof NewUserJourneyContainerActivity) {
            int iIS = ((NewUserJourneyContainerActivity) getActivity()).LL.iS(true);
            this.LLJJL = iIS;
            VR(iIS);
            if (Build.VERSION.SDK_INT < 26 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setNavigationBarColor(this.LLJJL);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void JS() {
        C19EG activity;
        Window window;
        C19EG activity2;
        Window window2;
        if (getActivity() instanceof NewUserJourneyActivity) {
            int iLLLLZIL = ((NewUserJourneyActivity) getActivity()).LLLLZIL(false);
            this.LLJJL = iLLLLZIL;
            VR(iLLLLZIL);
            if (Build.VERSION.SDK_INT >= 26 && (activity2 = getActivity()) != null && (window2 = activity2.getWindow()) != null) {
                window2.setNavigationBarColor(this.LLJJL);
            }
        }
        if (getActivity() instanceof NewUserJourneyContainerActivity) {
            int iIS = ((NewUserJourneyContainerActivity) getActivity()).LL.iS(false);
            this.LLJJL = iIS;
            VR(iIS);
            if (Build.VERSION.SDK_INT < 26 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setNavigationBarColor(this.LLJJL);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final String RR() {
        return this.LLLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void NS(C19245810Rc c19245810Rc) {
        this.LLLILZJ = Boolean.valueOf(QS().LIZ("should_show_icon", false));
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("screenwidth: ");
        sbLIZ.append(configuration.screenWidthDp);
        sbLIZ.append(", new orientation: ");
        sbLIZ.append(configuration.orientation);
        C1911410zq7.LIZ("TabletISComponent", C2188811AlT.LIZIZ(sbLIZ));
        RecyclerView.LayoutManager layoutManager = null;
        if (configuration.screenWidthDp <= 600) {
            final int iLIZIZ = QS().LIZIZ("card_view_item_count_per_row_on_fold", 2);
            RecyclerView recyclerView = this.LLJLLL;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LJIJ(iLIZIZ);
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.10S1
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    if (i == 0) {
                        return iLIZIZ;
                    }
                    return 1;
                }
            });
            return;
        }
        final int iLIZIZ2 = QS().LIZIZ("card_view_item_count_per_row", 2);
        RecyclerView recyclerView2 = this.LLJLLL;
        if (recyclerView2 != null) {
            layoutManager = recyclerView2.getLayoutManager();
        }
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) layoutManager;
        gridLayoutManager2.LJIJ(iLIZIZ2);
        gridLayoutManager2.LJIJI(new AbstractC214823195h() { // from class: X.10S1
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i == 0) {
                    return iLIZIZ2;
                }
                return 1;
            }
        });
    }
}
