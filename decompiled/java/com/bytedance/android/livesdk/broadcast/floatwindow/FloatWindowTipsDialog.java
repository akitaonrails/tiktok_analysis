package com.bytedance.android.livesdk.broadcast.floatwindow;

import X.C0UVE;
import X.C1143680frq;
import X.C16F5;
import X.C16FS;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class FloatWindowTipsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4Zyk/JyQ4PiY9LCo7Zwk/JyQ4HiY9LCo7HSYjOwElKCM8Lw==";
    public LiveIconView LL;
    public LiveIconView LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16FS LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6n);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = c500980Jkm.LJIIIZ;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
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
        this.LL = (LiveIconView) view.findViewById(R.id.e26);
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.bx_);
        this.LLILLL = (C16F5) view.findViewById(R.id.q_6);
        this.LLILZ = (C16F5) view.findViewById(R.id.q9d);
        this.LLILZIL = (C16FS) view.findViewById(R.id.uux);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131851247));
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131851245));
        }
        C16FS c16fs = this.LLILZIL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131851246));
        }
        C1143680frq.LJ(this.LL, "tiktok_live_broadcast_demand_8", "float_window_dialog_close.png", ImageView.ScaleType.CENTER_CROP);
        C1143680frq.LJ(this.LLILLJJLI, "tiktok_live_broadcast_demand_8", "float_window_all_bg.png", ImageView.ScaleType.CENTER_CROP);
        C16FS c16fs2 = this.LLILZIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS142S0100000_7(this, 20));
        }
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 21));
        }
        C0UVE.LJI("tip_show");
    }
}
