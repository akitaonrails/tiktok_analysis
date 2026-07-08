package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C01GW;
import X.C0HCL;
import X.C0RO4;
import X.C0RO5;
import X.C1308910kAL;
import X.C13LE;
import X.C14KQ;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1601110rld;
import X.C1602160rnK;
import X.C2217381BqS;
import X.C2487409ou;
import X.C281310B0v;
import X.C418440Gaw;
import X.C628500Oky;
import X.C630740Ooa;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C706480RnS;
import X.C707270Roj;
import X.C707280Rok;
import X.C707290Rol;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS22S0101000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedCollectionProgressBarComponent extends BaseCellSlotComponent<FeedCollectionProgressBarComponent> implements FeedCollectionProgressBarAbility, ComponentPriorityProtocol {
    public C707280Rok LLJLLIL;
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 565));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 567));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 564));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(316));
    public volatile Integer LLLF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_container_story_progress_bar";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd0;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 566);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_over_length_sliding_progress_bar", true, awS555S0100000_11);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZIJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FeedCollectionProgressBarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZIJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FeedCollectionProgressBarAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility
    public final void T90(int i) {
        C1578630rBN.LJIIJJI(this, new C0RO4(this, i, null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C707280Rok c707280Rok;
        int iIntValue;
        int iIntValue2;
        ViewGroup viewGroup;
        super.onViewCreated(view);
        C2487409ou.LIZJ(new ARunnableS111S0100000_11(this, 46));
        if (C281310B0v.LIZ()) {
            Context context = view.getContext();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e8, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -3355444;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, context);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = -1;
            }
            C707270Roj c707270Roj = new C707270Roj(iIntValue, iIntValue2, C418440Gaw.LIZIZ(2));
            float fLIZIZ = C418440Gaw.LIZIZ(0);
            float fLIZIZ2 = C418440Gaw.LIZIZ(12);
            float fLIZIZ3 = C418440Gaw.LIZIZ(4);
            float fLJIIIIZZ = C14KQ.LJIIIIZZ(context) - (2 * fLIZIZ2);
            int iLJIIIIZZ = (int) (((double) (fLJIIIIZZ + fLIZIZ3)) / ((((double) C14KQ.LJIIIIZZ(context)) * 0.05d) + ((double) fLIZIZ3)));
            C707280Rok c707280Rok2 = new C707280Rok(context, c707270Roj, new C707290Rol(fLIZIZ3, C418440Gaw.LIZIZ(4), (fLJIIIIZZ - ((iLJIIIIZZ - 1) * fLIZIZ3)) / iLJIIIIZZ, fLIZIZ, fLIZIZ2, 2, iLJIIIIZZ, (iLJIIIIZZ - 2) - 1));
            this.LLJLLIL = c707280Rok2;
            Integer num = this.LLLF;
            if (num != null) {
                C2487409ou.LIZJ(new ARunnableS22S0101000_11(num.intValue(), c707280Rok2, 10));
            }
            C707280Rok c707280Rok3 = this.LLJLLIL;
            if (c707280Rok3 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0HCL.LIZ(4.0f, context));
                layoutParams.gravity = 16;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c707280Rok3);
                c707280Rok3.setLayoutParams(layoutParams);
            }
            View contentView = getContentView();
            if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
                viewGroup.addView(this.LLJLLIL);
            }
        }
        if (!C1601110rld.LIZ() && (c707280Rok = this.LLJLLIL) != null) {
            int visibility = c707280Rok.getVisibility();
            c707280Rok.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c707280Rok);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RHQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(105), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        C729510SjV.LJJIIZ(videoItemParams2.getAweme());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility
    public final void aF1(float f, int i, long j) {
        C1578630rBN.LJIIJJI(this, new C0RO5(this, i, f, j, null));
    }
}
