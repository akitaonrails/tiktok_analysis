package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C1331660kl2;
import X.C1331670kl3;
import X.C1558040qeA;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599640rjG;
import X.C497820Jfg;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C960203pA;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3NavBarAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RecUserUIAdaptionAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3EmptyPageUIAdaptionAssem extends BasePanelUIComponent implements FriendsV3RecUserUIAdaptionAbility {
    public final C630740Ooa LLJIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 512));

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3RecUserUIAdaptionAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3RecUserUIAdaptionAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RecUserUIAdaptionAbility
    public final void A20(boolean z) {
        FriendsV3NavBarAbility friendsV3NavBarAbility;
        Context context;
        if (z) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null && (context = viewLJJIJL.getContext()) != null && C960203pA.LIZIZ(context)) {
                Go("friends/empty_page_dark_bg.png");
            } else {
                Go("friends/empty_page_light_bg.png");
            }
        } else {
            ImageView imageView = (ImageView) LJJIJL().findViewById(R.id.h32);
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
        }
        if (((FriendsV3NavHideOnScrollConfig) C1558040qeA.LIZIZ.getValue()).enable && (friendsV3NavBarAbility = (FriendsV3NavBarAbility) this.LLJIJIL.getValue()) != null) {
            friendsV3NavBarAbility.WE2(z);
        }
    }

    public final void Go(String str) {
        File fileZu = C1599640rjG.LIZIZ.Zu(str);
        if (fileZu != null) {
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.h32);
            int iLIZIZ = C497820Jfg.LIZIZ(LJJIJL().getContext());
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(fileZu);
            c1331670kl3LJII.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJII.LJIIIZ = (int) (iLIZIZ / 1.41f);
            c1331670kl3LJII.LJIL = Bitmap.Config.RGB_565;
            c1331670kl3LJII.LJJ(smartImageView);
            c1331670kl3LJII.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RecUserUIAdaptionAbility
    public final void aK1(boolean z) {
        if (z) {
            LJJIJL().findViewById(R.id.msd).getLayoutParams().height = -2;
            LJJIJL().findViewById(R.id.h3o).getLayoutParams().height = -2;
        } else {
            LJJIJL().findViewById(R.id.msd).getLayoutParams().height = -1;
            LJJIJL().findViewById(R.id.msd).getLayoutParams().height = -1;
        }
    }
}
