package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0RBZ;
import X.C13LE;
import X.C2217381BqS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C691730RBj;
import X.C694610RMl;
import X.C694880RNm;
import X.C706480RnS;
import X.C708610Rqt;
import X.C723830SaL;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveBottomInfoComponent extends BaseCellSlotComponent<StoryImmersiveBottomInfoComponent> {
    public View LLJZ;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(384));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 704));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(164));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcp;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 705);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_immersive_bottom_info", true, awS555S0100000_11);
    }

    public final void Ep() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        ArrayList arrayList = null;
        boolean zLIZIZ = C694880RNm.LIZIZ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null));
        C724270Sb3 c724270Sb32 = this.LLJI;
        List<AnchorCommonStruct> anchors = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAnchors();
        if (anchors != null) {
            arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                C01GW c01gw = C708610Rqt.LIZ;
                if (C708610Rqt.LIZ(anchorCommonStruct.getType())) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty() && !zLIZIZ) {
            z = true;
        }
        CellGradualAbility cellGradualAbility = (CellGradualAbility) this.LLJLLL.getValue();
        if (cellGradualAbility != null) {
            cellGradualAbility.sm0(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        CellGradualAbility cellGradualAbility = (CellGradualAbility) this.LLJLLL.getValue();
        if (cellGradualAbility != null) {
            cellGradualAbility.sm0(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJZ = view.findViewById(R.id.i8_);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 201));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RDL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(118), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RDM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(119), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C694610RMl.LIZ(videoItemParams, jm());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        Object obj;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (ur(videoItemParams2)) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        } else {
            oo();
        }
        C691730RBj.LIZ(this, (C0RBZ) this.LLJZIJLIL.getValue(), videoItemParams2);
        C724270Sb3 c724270Sb3 = this.LLJI;
        ArrayList arrayList = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        List<AnchorCommonStruct> anchors = ((VideoItemParams) obj).getAweme().getAnchors();
        if (anchors != null) {
            arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                C01GW c01gw = C708610Rqt.LIZ;
                if (C708610Rqt.LIZ(anchorCommonStruct.getType())) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (true ^ z) {
            C337180DJs.LIZJ(LJJIJL());
            View viewLJJIJL = LJJIJL();
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
            if (layoutParams != null) {
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    int marginStart = marginLayoutParams2.getMarginStart();
                    int i = marginLayoutParams2.topMargin;
                    int marginEnd = marginLayoutParams2.getMarginEnd();
                    marginLayoutParams2.setMarginStart(marginStart);
                    marginLayoutParams2.topMargin = i;
                    marginLayoutParams2.setMarginEnd(marginEnd);
                    marginLayoutParams2.bottomMargin = iLIZIZ;
                }
                C786410Ut5.W5(viewLJJIJL, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        View viewLJJIJL2 = LJJIJL();
        ViewGroup.LayoutParams layoutParams2 = viewLJJIJL2.getLayoutParams();
        if (layoutParams2 != null) {
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i2 = marginLayoutParams.topMargin;
                int marginEnd2 = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart2);
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.setMarginEnd(marginEnd2);
                marginLayoutParams.bottomMargin = iLIZIZ2;
            }
            C786410Ut5.W5(viewLJJIJL2, layoutParams2);
            C337180DJs.LIZ(LJJIJL());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
