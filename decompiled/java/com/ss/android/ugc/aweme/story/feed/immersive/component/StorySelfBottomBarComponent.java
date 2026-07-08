package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0RBZ;
import X.C0RJN;
import X.C1210704oT;
import X.C13LE;
import X.C1618440sDa;
import X.C2189821An6;
import X.C418440Gaw;
import X.C452501pT;
import X.C691730RBj;
import X.C706480RnS;
import X.C723830SaL;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS64S0210000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StorySelfBottomBarComponent extends BaseCellSlotComponent<StorySelfBottomBarComponent> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(388));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(167));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd5;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 719);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_self_bottom_bar", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C1618440sDa.LIZIZ.LJIIJJI().LIZJ().LIZJ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String from;
        int i;
        C2189821An6 c2189821An6;
        super.onViewCreated(view);
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        boolean zLJFF = Intrinsics.LJFF(from, "STORY_ENTRANCE_HIGHLIGHTS");
        C723830SaL.LIZ(this, null, new AwS64S0210000_11(this, zLJFF, view, 1));
        if (C1210704oT.LIZIZ()) {
            if (zLJFF) {
                i = R.id.ia7;
            } else {
                i = R.id.i7z;
            }
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById != null) {
                C786410Ut5.ed(viewFindViewById, C418440Gaw.LIZIZ(Double.valueOf(0.0d)));
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C691730RBj.LIZ(this, (C0RBZ) this.LLJLLL.getValue(), videoItemParams);
    }
}
