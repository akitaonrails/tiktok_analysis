package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment;

import X.C0K3S;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailSettingDialogFragment extends SubscriptionBaseSheet {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiHELIOSOjoxOzUtKip9LCA4KCY/ZjMlLDh9LjctLiI2JjFiDSonKSwgGionPCwiLgs6KSkjLgkhKSIhLCEn";
    public LinearLayout LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C0K3S LLJLIL;
    public SubSpaceDetailVM LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return R.layout.feq;
    }

    public final ConstraintLayout gS() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qgq) : null;
            this.LLJJL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final ConstraintLayout hS() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.un_pin_panel) : null;
            this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SpacePost spacePost;
        super.onViewCreated(view, bundle);
        C0K3S c0k3s = this.LLJLIL;
        View viewFindViewById = null;
        if (c0k3s != null && (spacePost = c0k3s.LLILLL) != null) {
            if (spacePost.isPinned) {
                C786410Ut5.LL(8, gS());
            } else {
                C786410Ut5.LL(8, hS());
            }
            if (spacePost.pollInfo != null) {
                View viewFindViewById2 = this.LLJL;
                if (viewFindViewById2 == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById2 = view2.findViewById(R.id.fz3);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJL = viewFindViewById2;
                }
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                C786410Ut5.LL(8, gS());
                C786410Ut5.LL(8, hS());
            }
            C786410Ut5.Y7(gS(), new ACListenerS142S0100000_7(this, 181));
            C786410Ut5.Y7(hS(), new ACListenerS142S0100000_7(this, 182));
        }
        View view3 = this.LLJJJJLIIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.fla);
            }
            this.LLJJJJLIIL = (LinearLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) view3, new ACListenerS142S0100000_7(this, 151));
    }
}
