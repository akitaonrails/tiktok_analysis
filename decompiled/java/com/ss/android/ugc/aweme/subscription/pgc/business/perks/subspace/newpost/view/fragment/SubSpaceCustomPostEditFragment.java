package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.fragment;

import X.C0HN5;
import X.C0I7D;
import X.C0K4E;
import X.C521840KdK;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC513530KBz;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceCustomPostEditFragment extends SubscriptionBaseSheet {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiOjoxHELIOSOzUtKip9JiA7OSAgPGs6ICokZiM+KCg+LSs4ZxwmKhY8KCw2CzA/PSA+GCo/PQo3ITEKOy40JSAiPQ==";
    public final int LLJJJJLIIL = R.layout.ffq;
    public final float LLJJL = 0.5f;
    public final int LLJJLIIIJLLLLLLLZ = 375;
    public final boolean LLJL = true;
    public TextView LLJLIL;
    public TextView LLJLILLLLZIIL;
    public C0I7D LLJLL;
    public SubSpaceNewPostVM LLJLLIL;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Integer ZR() {
        return Integer.valueOf(this.LLJJLIIIJLLLLLLLZ);
    }

    public final C0I7D gS() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fdm) : null;
            this.LLJLL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final TextView hS() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zsh) : null;
            this.LLJLILLLLZIIL = (TextView) viewFindViewById;
        }
        return (TextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final C0HN5 dS() {
        return new C0HN5(EnumC513530KBz.CONTENT_FIT, 0.0f, 0.0f, C814420VxA.LIZIZ(getResources().getDisplayMetrics().density * 212.0f), true, this.LLJJIJIIJIL, this.LLJJIJIL, false, ZR(), 294);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final boolean bS() {
        return this.LLJL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0K4E.LIZ().LIZJ("sub_space_new_post");
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.f830xlp);
            } else {
                viewFindViewById = null;
            }
            this.LLJLIL = (TextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            textView.setText("0/300");
        }
        TextView textViewHS = hS();
        if (textViewHS != null) {
            textViewHS.setEnabled(false);
        }
        C0I7D c0i7dGS = gS();
        if (c0i7dGS != null) {
            c0i7dGS.setText("");
        }
        C0K4E.LIZ().LIZJ("sub_space_new_post");
        C0I7D c0i7dGS2 = gS();
        if (c0i7dGS2 != null) {
            c0i7dGS2.addTextChangedListener(new C521840KdK(this, 7));
        }
        C0I7D c0i7dGS3 = gS();
        if (c0i7dGS3 != null) {
            c0i7dGS3.requestFocus();
        }
        C0I7D c0i7dGS4 = gS();
        if (c0i7dGS4 != null) {
            HandlerHook.viewPostDelay(c0i7dGS4, new ARunnableS107S0100000_7(this, 273), 100L);
        }
        TextView textViewHS2 = hS();
        if (textViewHS2 != null) {
            C786410Ut5.T7(textViewHS2, new ACListenerS142S0100000_7(this, 310));
        }
    }
}
