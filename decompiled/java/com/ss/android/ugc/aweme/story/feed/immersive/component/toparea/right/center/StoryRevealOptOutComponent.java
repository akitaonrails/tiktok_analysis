package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.center;

import X.C0SZ8;
import X.C1558420qem;
import X.C1558520qew;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealOptOutComponent extends BaseCellSlotComponent<StoryRevealOptOutComponent> {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 789));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 787);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_reveal_opt_out", true, awS555S0100000_11);
    }

    public final StoryPhotoAbility Ep() {
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJLLIL.getValue();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (feedCollectionViewPagerAbility == null || (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) == null) {
            return null;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryPhotoAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryPhotoAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        return (StoryPhotoAbility) interfaceC494301wDLIZ2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AkS83S0100000_11(this, 5), view);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
