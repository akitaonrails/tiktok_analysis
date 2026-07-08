package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.ui;

import X.C0R12;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC658120Pre;
import X.InterfaceC1587906Jp;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTagAssem extends ReusedUIContentAssem<SearchAdTagAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        ViewGroup viewGroup;
        Aweme aweme = interfaceC657240PqE.getAweme();
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            if (!aweme.isAd()) {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                return;
            }
            View viewLJIIZILJ = C0R12.LIZIZ.LJIIZILJ(aweme.getAwemeRawAd(), viewGroup, EnumC658120Pre.MULTI_LIVE_CARD);
            if (viewLJIIZILJ == null) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388691;
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            C786410Ut5.W5(viewLJIIZILJ, layoutParams);
            viewGroup.addView(viewLJIIZILJ);
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
