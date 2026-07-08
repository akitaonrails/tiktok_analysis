package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AnonymousClass0956;
import X.C01GW;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C1935107i1;
import X.C2217381BqS;
import X.C281310B0v;
import X.C628500Oky;
import X.C630740Ooa;
import X.C725580SdA;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGestureEducationComponent extends BaseCellContentComponent<StoryGestureEducationComponent> implements StoryGestureEducationAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 693));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 691));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 692));
    public final C01GW LLJL = C1935107i1.LIZ(new AwS555S0100000_11(this, 694));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(380));
    public Aweme LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        tj0(false);
        this.LLJL.getValue().getClass();
        if (C281310B0v.LIZ()) {
            return;
        }
        C725580SdA.LJIIJ.getValue().storeBoolean("vertical_swipe_gesture_education_shown", true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, StoryGestureEducationAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility
    public final void pause() {
        C725580SdA c725580SdA = (C725580SdA) this.LLJL.getValue();
        AnonymousClass0956 anonymousClass0956 = c725580SdA.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c725580SdA.LJFF = null;
        c725580SdA.LJII.clear();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility
    public final void resume() {
        ((C725580SdA) this.LLJL.getValue()).LJ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, StoryGestureEducationAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        tj0(true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0SdI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(117), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJLILLLLZIIL = videoItemParams.getAweme();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility
    public final void tj0(boolean z) {
        C725580SdA c725580SdA = (C725580SdA) this.LLJL.getValue();
        AnonymousClass0956 anonymousClass0956 = c725580SdA.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c725580SdA.LJII.clear();
        c725580SdA.LIZLLL(z);
    }
}
