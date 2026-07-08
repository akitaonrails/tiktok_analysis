package com.ss.android.ugc.profile.business.profile.menu.root;

import X.C13LE;
import X.C19719912Dl;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.ProfileMenuContentComponent;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import com.ss.android.ugc.profile.business.profile.menu.root.base.ProfileMenuRootBaseComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileMenuRootComponent extends ProfileMenuRootBaseComponent {
    public LinearLayout LLJJJ;
    public RelativeLayout LLJJJIL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchActionComponent.class);
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tsc) : null;
            this.LLJJJIL = (RelativeLayout) viewFindViewById;
        }
        Ho("search_section", c19719912DlLIZ, viewFindViewById, -1, false);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProfileMenuContentComponent.class);
        View view = this.LLJJJ;
        if (view == null) {
            View viewLJJIJL2 = LJJIJL();
            View viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.s2a) : null;
            this.LLJJJ = (LinearLayout) viewFindViewById2;
            view = viewFindViewById2;
        }
        Ho("content_section", c19719912DlLIZ2, view, -1, false);
    }
}
