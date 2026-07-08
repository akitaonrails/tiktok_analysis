package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C01GW;
import X.C452501pT;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryGuidePhotoAnimComponent extends BaseCellContentComponent<StoryGuidePhotoAnimComponent> {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 486));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ((ValueAnimator) this.LLJJJJLIIL.getValue()).cancel();
        SmartImageView smartImageViewEp = ep();
        if (smartImageViewEp != null) {
            C786410Ut5.fc(smartImageViewEp, 1.0f);
        }
        SmartImageView smartImageViewEp2 = ep();
        if (smartImageViewEp2 != null) {
            C786410Ut5.Bc(smartImageViewEp2, 1.0f);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ((ValueAnimator) this.LLJJJJLIIL.getValue()).removeAllUpdateListeners();
        ((ValueAnimator) this.LLJJJJLIIL.getValue()).cancel();
    }

    public final SmartImageView ep() {
        return (SmartImageView) LJJIJL().findViewById(R.id.lqq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        ((ValueAnimator) this.LLJJJJLIIL.getValue()).start();
    }
}
