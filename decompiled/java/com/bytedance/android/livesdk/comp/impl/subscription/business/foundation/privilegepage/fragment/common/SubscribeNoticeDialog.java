package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.common;

import X.C16F5;
import X.C500980Jkm;
import X.C786410Ut5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeNoticeDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqHELIOSJjo9LCQ4ICA9ZjU+IDk6JCArLD8yLyBiLz0yLygpJzt9KyohJCA9ZhY5KzwwOiwuLAE8PCwvLAs6KSkjLg==";
    public LiveIconView LL;
    public C16F5 LLILLJJLI;
    public String LLILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gbd);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
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
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.cov);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LiveIconView) viewFindViewById;
        }
        C786410Ut5.g8((LiveIconView) viewFindViewById, new View.OnClickListener() { // from class: X.0Ijh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.LL.dismiss();
            }
        });
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.zzk);
            }
            this.LLILLJJLI = (C16F5) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((TextView) view3).setText(this.LLILLL);
    }
}
