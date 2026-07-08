package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment;

import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceFeedGuestSettingDialogFragment extends SubscriptionBaseSheet {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiOjoxOzHELIOSUtKip9LCA4KCY/ZjMlLDh9LjctLiI2JjFiGj8yKyAKLCo3DzApOjsALTE4ICE0DCwtJSA0DjctLiI2JjE=";
    public LinearLayout LLJJJJLIIL;
    public SubSpaceFeedVM LLJJL;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return R.layout.feu;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJJLIIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.hfl);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJJLIIL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS142S0100000_7(this, 152));
    }
}
