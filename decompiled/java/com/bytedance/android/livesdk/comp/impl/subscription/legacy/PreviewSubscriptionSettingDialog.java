package com.bytedance.android.livesdk.comp.impl.subscription.legacy;

import X.C19EH;
import X.C500980Jkm;
import X.C786410Ut5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.fragment.SubscriptionManagementFragmentV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewSubscriptionSettingDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyHELIOSYjPCwjJ2E/LSItKjZ9GDcpPyY2PxY5KzwwOiw8PSY8JhYpPTs6JiIIIC4/JyI=";
    public View LL;
    public int LLILLJJLI;
    public String LLILLL = "";
    public String LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gbx);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pw6);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Ij3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.LL.dismissAllowingStateLoss();
            }
        }, viewFindViewById);
        if (this.LLILLJJLI == 1) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            SubscribeInviteLetterFragment subscribeInviteLetterFragment = new SubscribeInviteLetterFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("letter_enter_from", str, bundle2);
            C786410Ut5.LJJJI("letter_activity_id", str2, bundle2);
            subscribeInviteLetterFragment.setArguments(bundle2);
            c19ehLJIIJ.LIZIZ(R.id.iiv, subscribeInviteLetterFragment);
            c19ehLJIIJ.LJIIIZ();
            return;
        }
        Bundle bundle3 = new Bundle();
        C786410Ut5.LJJJI("enter_from", "live_take_page", bundle3);
        SubscriptionManagementFragmentV2 subscriptionManagementFragmentV2 = new SubscriptionManagementFragmentV2();
        subscriptionManagementFragmentV2.setArguments(bundle3);
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ2.LIZIZ(R.id.iiv, subscriptionManagementFragmentV2);
        c19ehLJIIJ2.LJIIIZ();
    }
}
