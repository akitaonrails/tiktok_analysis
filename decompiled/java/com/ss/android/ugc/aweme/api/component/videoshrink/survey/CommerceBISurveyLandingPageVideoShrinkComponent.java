package com.ss.android.ugc.aweme.api.component.videoshrink.survey;

import X.C01GW;
import X.C1058500deS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036270d4b;
import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.api.survey.BISurveyServiceImpl;
import com.ss.android.ugc.aweme.api.survey.IBISurveyService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceBISurveyLandingPageVideoShrinkComponent extends BaseCellLogicComponent<CommerceBISurveyLandingPageVideoShrinkComponent> implements InterfaceC1036270d4b {
    public View LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 80));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 79));

    @Override // X.InterfaceC1036270d4b
    public final void Gn(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void V() {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Yc() {
    }

    @Override // X.InterfaceC1036270d4b
    public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IBISurveyService iBISurveyServiceLIZ = BISurveyServiceImpl.LIZ();
        if (iBISurveyServiceLIZ != null) {
            iBISurveyServiceLIZ.r(null);
        }
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
        this.LLJJIJI = null;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        IBISurveyService iBISurveyServiceLIZ = BISurveyServiceImpl.LIZ();
        if (iBISurveyServiceLIZ != null) {
            iBISurveyServiceLIZ.r(this);
        }
    }

    @Override // X.InterfaceC1036270d4b
    public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
        ViewParent parent;
        ViewParent parent2;
        ViewGroup viewGroup;
        Context context;
        if (tuxSheet != null) {
            View view = tuxSheet.getView();
            if (view != null) {
                ((C1058500deS) this.LLJJIJIL.getValue()).LLILZIL = tuxSheet;
                ((C1058500deS) this.LLJJIJIL.getValue()).sy(view);
            }
            View view2 = tuxSheet.getView();
            if (view2 != null && (parent = view2.getParent()) != null && (parent2 = parent.getParent()) != null && (parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null && (context = viewGroup.getContext()) != null) {
                View viewFindViewWithTag = viewGroup.findViewWithTag("bi_survey_landing_page_back_icon");
                View view3 = viewFindViewWithTag;
                if (viewFindViewWithTag == null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                    tuxIconView.setTag("bi_survey_landing_page_back_icon");
                    tuxIconView.setTuxIcon(c419910GdJ);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)));
                    viewGroup.addView(tuxIconView, marginLayoutParams);
                    view3 = tuxIconView;
                }
                this.LLJJIJI = view3;
                C786410Ut5.LJLLLLLL(8, view3);
                C786410Ut5.I7(new ACListenerS108S0200000_4(interfaceC1034470d1h, tuxSheet, 18), view3);
            }
        }
    }
}
