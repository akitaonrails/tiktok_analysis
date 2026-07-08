package com.ss.android.ugc.aweme.feed.collection.sub.video.component;

import X.C0RF0;
import X.C1618440sDa;
import X.C2189821An6;
import X.C291001Au;
import X.C337180DJs;
import X.C628500Oky;
import X.InterfaceC494301wD;
import X.InterfaceC706770Rnv;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class SubVideoCoverComponent extends VideoCoverComponent {
    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        SmartImageView smartImageView;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        lD2(false);
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (!interfaceC706770RnvLJJIIJ.LJIILLIIL((c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null) ? null : c2189821An6.getFrom()) || (smartImageView = this.LLJZIJLIL) == null) {
            return;
        }
        C337180DJs.LIZJ(smartImageView);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent
    public final void ip() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent, X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1472213694) {
            return null;
        }
        return this;
    }

    public void mp() {
        qa1("onRenderFirstFrame");
    }

    public SubVideoCoverComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 370));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent
    public final void kp(C291001Au<String> c291001Au) {
        if (c291001Au == null) {
            return;
        }
        Er1("onPreparePlay");
        this.LLLFZ = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent
    public final void lp(C291001Au<String> c291001Au) {
        if (c291001Au == null) {
            return;
        }
        this.LLLFZ = true;
        mp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        hp((VideoItemParams) obj);
    }
}
