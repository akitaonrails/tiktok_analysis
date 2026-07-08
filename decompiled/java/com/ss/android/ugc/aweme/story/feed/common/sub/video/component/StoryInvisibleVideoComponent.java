package com.ss.android.ugc.aweme.story.feed.common.sub.video.component;

import X.C01GW;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C729510SjV;
import X.InterfaceC665370Q7z;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInvisibleVideoComponent extends BaseCellLogicComponent<StoryInvisibleVideoComponent> implements StoryInvisibleVideoAbility {
    public boolean LLJJJIL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(151));
    public final C630740Ooa LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 648));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 647));
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 645));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 646));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final Aweme Bo() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    public final ValueAnimator Co() {
        return (ValueAnimator) this.LLJJJJ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C729510SjV.LIZLLL(Bo(), new AwS590S0100000_11(this, 191));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility
    public final void lF2() {
        C729510SjV.LIZLLL(Bo(), new AwS590S0100000_11(this, 192));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryInvisibleVideoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryInvisibleVideoAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility
    public final void wG0() {
        C729510SjV.LIZLLL(Bo(), new AwS590S0100000_11(this, 193));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C729510SjV.LIZLLL(Bo(), new AwS590S0100000_11(this, 188));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C729510SjV.LIZLLL(Bo(), new AwS590S0100000_11(this, 189));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C729510SjV.LIZLLL(videoItemParams.getAweme(), new AwS590S0100000_11(this, 433));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", aid: ");
        String authorUid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", authorUid: ");
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        sbLIZ.append(authorUid);
        C2188811AlT.LIZIZ(sbLIZ);
        C729510SjV.LIZLLL(aweme, new AwS590S0100000_11(this, 190));
    }
}
