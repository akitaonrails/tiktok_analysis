package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common;

import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeNoticeDialog extends SubscriptionBaseSheet {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiEtHELIOSPSY8Jms8OyYlISkpLiojKSIpZykhKSIhLCEnZiYjJCI8JmsfPC0gKzclKyodJzElKioXISQgJig=";
    public final int LLJJJJLIIL = R.layout.fev;
    public final float LLJJL = 0.5f;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public String LLJLIL;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return this.LLJJL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.cov);
            } else {
                viewFindViewById = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) viewFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(this, 149));
        }
        View view3 = this.LLJL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.zzk);
            }
            this.LLJL = (TuxTextView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        TextView textView = (TextView) view3;
        if (textView != null) {
            textView.setText(this.LLJLIL);
        }
    }
}
