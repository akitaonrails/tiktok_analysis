package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C12ES;
import X.C1558520qew;
import X.C339190DRl;
import X.C426600Go6;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveGradualComponent extends BaseCellContentComponent<StoryImmersiveGradualComponent> implements CellGradualAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 706));
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final boolean IC1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void fi0() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void ii(boolean z) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, CellGradualAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, CellGradualAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJL = view.findViewById(R.id.gradual_top);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.gradual_bottom);
        View view2 = this.LLJJL;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.baz);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = (int) C12ES.LIZJ(136.0f, getContext());
            C786410Ut5.W5(view2, layoutParams);
        }
        C426600Go6.LIZ(this.LLJJLIIIJLLLLLLLZ);
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void sm0(boolean z) {
        if (z) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C339190DRl.LIZLLL(view);
                return;
            }
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 == null) {
            return;
        }
        C339190DRl.LIZIZ(view2);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
