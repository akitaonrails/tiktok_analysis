package com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar;

import X.C1558360qeg;
import X.C1558520qew;
import X.C724240Sb0;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeProfileListAvatarAssem extends LandscapeAvatarAssem {
    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem, com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d0i;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem, com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.bnb), new ACListenerS146S0100000_11(this, 17));
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem
    public final void Jp(Aweme aweme, String str, boolean z, int i, C737030Svd c737030Svd) {
        LandscapeProfilePanelAbility landscapeProfilePanelAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), LandscapeProfilePanelAbility.class, null)) != null && landscapeProfilePanelAbility.LJJII()) {
            super.Jp(aweme, str, z, i, c737030Svd);
        }
    }
}
