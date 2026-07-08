package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C1E5F;
import X.C2189821An6;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoAIVideoDetailPageComponent extends DetailPageComponent {
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void Ho(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.Ho(view);
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = -2;
                marginLayoutParams.setMarginStart(0);
                C786410Ut5.W5(view2, marginLayoutParams);
                view2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view2.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view2.getPaddingBottom());
            }
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 56), view2);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void No(Fragment fragment, Aweme aweme, Map map, C2189821An6 c2189821An6) {
        View view = getFragment().getView();
        if (view == null) {
            return;
        }
        for (View view2 : C1E5F.LIZIZ.LJIIIIZZ(view).values()) {
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        View viewFindViewWithTag = view.findViewWithTag("search_bar");
        if (viewFindViewWithTag != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
        }
    }
}
