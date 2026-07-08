package com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders;

import X.C01GW;
import X.C054G;
import X.C0M0P;
import X.C452501pT;
import X.C561130Lzb;
import X.C562270M3l;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import X.InterfaceC562000M2k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftBoxNormalBadgeItemViewHolder extends DraftBoxNormalItemViewHolder {
    public final View LLL;
    public final C561130Lzb LLLF;
    public final InterfaceC497601wk LLLFF;
    public final InterfaceC562000M2k LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder
    public final ViewGroup r6() {
        return (ViewGroup) this.LLLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final Integer S5() {
        return Integer.valueOf(R.layout.f890cvk);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final C561130Lzb R5() {
        return this.LLLF;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final InterfaceC562000M2k T5() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final InterfaceC497601wk U5() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final View getItemView() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder
    public final void w6(C0M0P c0m0p) {
        int i;
        FrameLayout frameLayout = (FrameLayout) this.LLLI.getValue();
        if (c0m0p.LJJII) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZ(i, frameLayout);
        Pair<String, String> pairLJ = C562270M3l.LJ(c0m0p.LIZIZ());
        String first = pairLJ.getFirst();
        String second = pairLJ.getSecond();
        ((TextView) this.LLLIIII.getValue()).setText(first);
        ((TextView) this.LLLII.getValue()).setText(second);
    }

    public DraftBoxNormalBadgeItemViewHolder(View view, C561130Lzb c561130Lzb, C054G c054g, DraftBoxFragment draftBoxFragment) {
        super(view, c561130Lzb, c054g, draftBoxFragment);
        this.LLL = view;
        this.LLLF = c561130Lzb;
        this.LLLFF = c054g;
        this.LLLFFI = draftBoxFragment;
        this.LLLFZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 876));
        this.LLLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 879));
        this.LLLII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 882));
        this.LLLIIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 885));
    }
}
