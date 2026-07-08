package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C01GW;
import X.C0IDW;
import X.C13LE;
import X.C2217381BqS;
import X.C305740Bye;
import X.C339190DRl;
import X.C435920H7m;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC436120H8g;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchDetailKeyframeAnchorAssem extends BaseCellSlotComponent<SearchDetailKeyframeAnchorAssem> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS236S0000000_6.get$arr$(273));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS236S0000000_6.get$arr$(274));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS550S0100000_6(this, 555));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS550S0100000_6(this, 557));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(124));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 556));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 554));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ew2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS110S0200000_6(this, view, 14), view);
        view.addOnAttachStateChangeListener(new C0IDW(this, view, 1));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0HBz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(view, 56), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<SearchKeyFramePoint> list;
        EnumC436120H8g enumC436120H8g;
        int size;
        SearchDetailKeyframeAnchorTrigger searchDetailKeyframeAnchorTrigger;
        SearchDetailKeyframeAnchorTrigger searchDetailKeyframeAnchorTrigger2;
        C339190DRl.LIZLLL((View) this.LLLF.getValue());
        if (((Boolean) C305740Bye.LIZIZ.getValue()).booleanValue()) {
            Context context = getContext();
            TextView textView = (TextView) this.LLLF.getValue();
            TuxIconView tuxIconView = (TuxIconView) this.LLLFF.getValue();
            LifecycleOwner parent = getParent();
            String quantityString = null;
            if ((parent instanceof SearchDetailKeyframeAnchorTrigger) && (searchDetailKeyframeAnchorTrigger2 = (SearchDetailKeyframeAnchorTrigger) parent) != null) {
                list = searchDetailKeyframeAnchorTrigger2.LLJL;
            } else {
                list = null;
            }
            LifecycleOwner parent2 = getParent();
            if ((parent2 instanceof SearchDetailKeyframeAnchorTrigger) && (searchDetailKeyframeAnchorTrigger = (SearchDetailKeyframeAnchorTrigger) parent2) != null) {
                enumC436120H8g = searchDetailKeyframeAnchorTrigger.LLJLIL;
            } else {
                enumC436120H8g = null;
            }
            if (context != null) {
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (((Boolean) C305740Bye.LIZJ.getValue()).booleanValue() && enumC436120H8g != null && C435920H7m.LIZ[enumC436120H8g.ordinal()] == 1) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        quantityString = resources.getQuantityString(2131755320, size, Integer.valueOf(size));
                    }
                    textView.setText(quantityString);
                    tuxIconView.setIconRes(R.raw.icon_cook_fill);
                } else {
                    textView.setText(context.getResources().getQuantityString(2131755321, size, Integer.valueOf(size)));
                    tuxIconView.setIconRes(R.raw.icon_dots_lines_horizontal_fill_ltr);
                }
            }
        }
        TuxTextView tuxTextView = (TuxTextView) ((View) LJJIJL().getParent()).findViewById(R.id.title);
        C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(tuxTextView, this, 12));
    }
}
