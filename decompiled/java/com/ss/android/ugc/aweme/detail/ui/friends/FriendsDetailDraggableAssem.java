package com.ss.android.ugc.aweme.detail.ui.friends;

import X.C01GW;
import X.C0SZ8;
import X.C0T1R;
import X.C21588319eD;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailDraggableAssem extends BasePanelUIComponent {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 139));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(61));
    public final C630740Ooa LLJILJILJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 146));
    public final C630740Ooa LLJILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 138));
    public final C630740Ooa LLJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 149));
    public final C630740Ooa LLJJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 148));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 140));
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 147));

    public final C21588319eD Ho() {
        return (C21588319eD) this.LLJIJIL.getValue();
    }

    public final C0SZ8 Go() {
        IViewPagerComponentAbility iViewPagerComponentAbilityLIZLLL;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (iViewPagerComponentAbilityLIZLLL = C0T1R.LIZLLL(fragmentLJI)) == null) {
            return null;
        }
        return iViewPagerComponentAbilityLIZLLL.LJLIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo(boolean r3) {
        /*
            r2 = this;
            X.0SZ8 r0 = r2.Go()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L5a
            boolean r1 = X.C582980Mtk.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L5a
        L13:
            if (r0 == 0) goto L2f
            X.0Ooa r0 = r2.LLJILJILJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility r0 = (com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility) r0
            if (r0 == 0) goto L2e
            X.0SKa r0 = r0.LJLIL()
            if (r0 == 0) goto L2e
            android.view.View r0 = r0.getImageView()
            if (r0 == 0) goto L2e
            r2.Jo(r0, r3)
        L2e:
            return
        L2f:
            X.0SZ8 r0 = r2.Go()
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView r0 = r0.E()
            if (r0 == 0) goto L44
            android.view.View r0 = r0.getVideoView()
            if (r0 == 0) goto L44
            r2.Jo(r0, r3)
        L44:
            X.0SZ8 r0 = r2.Go()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView r0 = r0.E()
            if (r0 == 0) goto L2e
            android.view.ViewGroup r0 = r0.zt1()
            if (r0 == 0) goto L2e
            r2.Jo(r0, r3)
            return
        L5a:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.friends.FriendsDetailDraggableAssem.Lo(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Ho().setOnDragStart(new AwS590S0100000_11(this, 62));
        Ho().setOnDragEnd(new AwS590S0100000_11(this, 63));
        Ho().setOnSwipeUp(new AwS555S0100000_11(this, 141));
        Ho().setOnExit(new AwS555S0100000_11(this, 142));
        Ho().setEnableDragRight(new AwS555S0100000_11(this, 143));
        Ho().setEnableDragDown(new AwS555S0100000_11(this, 144));
        Ho().setEnableSwipeUp(new AwS555S0100000_11(this, 145));
    }

    public final void Jo(View view, boolean z) {
        ViewOutlineProvider viewOutlineProvider;
        if (z) {
            viewOutlineProvider = (ViewOutlineProvider) this.LLJILJIL.getValue();
        } else {
            viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        }
        view.setOutlineProvider(viewOutlineProvider);
        view.setClipToOutline(z);
    }
}
