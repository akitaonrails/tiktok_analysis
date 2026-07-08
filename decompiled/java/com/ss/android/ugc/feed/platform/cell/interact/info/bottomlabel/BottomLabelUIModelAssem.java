package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.C14KQ;
import X.C1602160rnK;
import X.C339190DRl;
import X.C723850SaN;
import X.EnumC700430Rdh;
import X.InterfaceC698070RZt;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BottomLabelUIModelAssem extends BaseCellSlotComponent<BottomLabelUIModelAssem> {
    public FeedBottomLabelLayout LLJLLIL;
    public InterfaceC698070RZt LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5b;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
    }

    public final FeedBottomLabelLayout Bp() {
        FeedBottomLabelLayout feedBottomLabelLayout = this.LLJLLIL;
        if (feedBottomLabelLayout != null) {
            return feedBottomLabelLayout;
        }
        return null;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public void tp(VideoItemParams videoItemParams) {
        if (this.LLJLLIL != null) {
            float fLJIIIIZZ = C14KQ.LJIIIIZZ(Bp().getContext()) - C339190DRl.LIZ(112);
            FeedBottomLabelLayout feedBottomLabelLayoutBp = Bp();
            int visibility = feedBottomLabelLayoutBp.getVisibility();
            feedBottomLabelLayoutBp.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, feedBottomLabelLayoutBp);
            setComponentClickStatusExperimental(Bp(), EnumC700430Rdh.POSITIVE);
            InterfaceC698070RZt interfaceC698070RZt = this.LLJLLL;
            if (interfaceC698070RZt != null) {
                Bp().LIZ(Bp().getContext(), interfaceC698070RZt.LIZJ(videoItemParams), fLJIIIIZZ, interfaceC698070RZt.LIZ(videoItemParams), videoItemParams.getAweme(), interfaceC698070RZt.LIZIZ());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (FeedBottomLabelLayout) view.findViewById(R.id.m4i);
        this.LLJLLL = (InterfaceC698070RZt) C723850SaN.LJFF(this, "bottom_label_ui_state");
    }
}
