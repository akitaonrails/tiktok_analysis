package com.ss.android.ugc.aweme.minis.feed.instantplay.vh;

import X.C01GW;
import X.C0TVI;
import X.C1006240cIA;
import X.C1006340cIK;
import X.C1006350cIL;
import X.C13LE;
import X.C14K9;
import X.C1697810uHb;
import X.C197039127h;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import Y.ACListenerS151S0100000_16;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniGameInstantPlayCardInfoAssem extends BaseCellSlotComponent<MiniGameInstantPlayCardInfoAssem> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(MiniGameInstantPlayViewModel.class), AFwS252S0000000_16.get$arr$(273));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 362));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 359));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 356));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 357));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 361));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 360));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 358));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d6i;
    }

    public final C1006340cIK Bp() {
        Aweme aweme;
        CardInsertInfo cardInsertInfo;
        C1006240cIA c1006240cIA = (C1006240cIA) ((AssemViewModel) this.LLJLLIL.getValue()).getState();
        VideoItemParams videoItemParams = c1006240cIA.LLILLL;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null) {
            return null;
        }
        return C1006350cIL.LIZ(cardInsertInfo.getCardId(), c1006240cIA.LL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0cIO
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                view2.setPadding(0, 0, 0, 0);
                return C20246014Ju.LIZIZ;
            }
        });
        float f = view.getResources().getDisplayMetrics().density;
        float f2 = 10.0f * f;
        float f3 = f * 2.0f;
        for (TextView textView : C1697810uHb.LJIIJJI(this.LLLFF.getValue(), this.LLJLLL.getValue(), this.LLLF.getValue(), this.LLJZ.getValue())) {
            if (textView != null) {
                textView.setShadowLayer(f2, 0.0f, f3, 905969664);
            }
        }
        C197039127h c197039127h = (C197039127h) this.LLJZIJLIL.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS151S0100000_16(this, 44));
        }
        C197039127h c197039127h2 = (C197039127h) this.LLL.getValue();
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS151S0100000_16(this, 45));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0cIN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1006240cIA) obj).LL;
            }
        }, null, AFwS300S0000000_16.get$arr$(60), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
