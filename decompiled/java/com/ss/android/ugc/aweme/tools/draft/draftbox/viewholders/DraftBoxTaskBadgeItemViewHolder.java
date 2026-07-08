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
public final class DraftBoxTaskBadgeItemViewHolder extends DraftBoxTaskItemViewHolder {
    public final View LLLII;
    public final C561130Lzb LLLIIII;
    public final InterfaceC497601wk LLLIIIIL;
    public final InterfaceC562000M2k LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder
    public final ViewGroup u6() {
        return (ViewGroup) this.LLLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final Integer S5() {
        return Integer.valueOf(R.layout.cvp);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final C561130Lzb R5() {
        return this.LLLIIII;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final InterfaceC562000M2k T5() {
        return this.LLLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final InterfaceC497601wk U5() {
        return this.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder, com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder
    public final View getItemView() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder
    public final void D6(C0M0P c0m0p) {
        int i;
        FrameLayout frameLayout = (FrameLayout) this.LLLIILIL.getValue();
        if (c0m0p.LJJII) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZ(i, frameLayout);
        Pair<String, String> pairLJ = C562270M3l.LJ(c0m0p.LIZIZ());
        String first = pairLJ.getFirst();
        String second = pairLJ.getSecond();
        ((TextView) this.LLLILZ.getValue()).setText(first);
        ((TextView) this.LLLIL.getValue()).setText(second);
    }

    public DraftBoxTaskBadgeItemViewHolder(View view, C561130Lzb c561130Lzb, C054G c054g, DraftBoxFragment draftBoxFragment) {
        super(view, c561130Lzb, c054g, draftBoxFragment);
        this.LLLII = view;
        this.LLLIIII = c561130Lzb;
        this.LLLIIIIL = c054g;
        this.LLLIIIL = draftBoxFragment;
        this.LLLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 877));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 880));
        this.LLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 883));
        this.LLLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 836));
    }
}
