package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1387050mCN;
import X.C20639815pc;
import X.C339190DRl;
import X.C434310H1h;
import X.C472620Ig8;
import X.EnumC2274741E1w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostFriends;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveHostFriends implements IHostFriends {
    public static final LiveHostFriends LL = new LiveHostFriends();

    @Override // com.bytedance.android.livesdkapi.host.IHostFriends
    public final View vP(Context context) {
        return new RelationButton(context, (AttributeSet) null, 0, 14);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFriends
    public final void lc0(View view, User user, LifecycleOwner lifecycleOwner, C472620Ig8 c472620Ig8, C434310H1h c434310H1h, AwS585S0100000_6 awS585S0100000_6) {
        RelationButton relationButton;
        if ((view instanceof RelationButton) && (relationButton = (RelationButton) view) != null) {
            com.ss.android.ugc.aweme.profile.model.User userLIZJ = C20639815pc.LIZJ(user);
            if (userLIZJ.getFollowStatus() == 0) {
                C339190DRl.LIZLLL(relationButton);
                C1387050mCN c1387050mCN = new C1387050mCN(userLIZJ);
                c1387050mCN.LIZIZ = false;
                c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_INBOX_SKYLIGHT_RELATION;
                c1387050mCN.LJIIJJI = lifecycleOwner;
                relationButton.LLLLZIL(c1387050mCN.LIZ());
                relationButton.setFollowClickListener(new AwS642S0100000_28(c472620Ig8, 94));
                relationButton.setDataChangeListener(new AwS237S0300000_28(userLIZJ, user, c434310H1h, 19));
                relationButton.setTracker(new AwS565S0100000_21(userLIZJ, 1544));
                awS585S0100000_6.invoke(Boolean.TRUE);
                return;
            }
            C339190DRl.LIZIZ(relationButton);
            relationButton.LIZ();
            awS585S0100000_6.invoke(Boolean.FALSE);
        }
    }
}
