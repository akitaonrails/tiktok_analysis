package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class NotionFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZz8hLTMlLDh9PywoLionZjYpPTs6JiJiByAnISoiDz0yLygpJzs=";
    public View LL;
    public LiveIconView LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hlu);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIIIZ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.fy1);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 21), viewFindViewById);
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.e26);
            }
            this.LLILLJJLI = (LiveIconView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.g8((LiveIconView) view3, new ACListenerS152S0100000_17(this, 22));
    }
}
