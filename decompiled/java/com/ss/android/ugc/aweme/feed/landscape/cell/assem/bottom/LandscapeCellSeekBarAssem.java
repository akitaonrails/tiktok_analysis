package com.ss.android.ugc.aweme.feed.landscape.cell.assem.bottom;

import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C1887907aP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeCellSeekBarAssem extends FeedBaseContentAssem<LandscapeCellSeekBarAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final float LLJJJJ = 1.0f;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeCellSeekBarAssem.class, "seekBarVM", "getSeekBarVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/bottom/LandscapeCellSeekBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LandscapeCellSeekBarAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeCellSeekBarVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 396), null, AFwS243S0000000_11.get$arr$(187));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.vu2);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(this, LLJJL[0]), new C2217381BqS() { // from class: X.0RIQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C00GP) obj).LL);
            }
        }, null, AFwS294S0000000_11.get$arr$(81), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        boolean z;
        VideoItemParams videoItemParams2 = videoItemParams;
        float f = this.LLJJJJ;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView = null;
        if (!z) {
            TuxTextView tuxTextView2 = this.LLJJJJLIIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(C1887907aP.LIZ(f));
        } else {
            TuxTextView tuxTextView3 = this.LLJJJJLIIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setText("1x");
        }
        TuxTextView tuxTextView4 = this.LLJJJJLIIL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS115S0200000_11(this, videoItemParams2, 34));
    }
}
