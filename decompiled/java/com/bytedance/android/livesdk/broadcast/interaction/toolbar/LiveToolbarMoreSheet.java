package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.C475510Ikn;
import X.C500980Jkm;
import X.C773800UXa;
import X.C773810UXb;
import X.C773830UXd;
import X.EnumC1088870eRR;
import X.EnumC1102750enp;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveToolbarMoreSheet extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyHELIOSY9PCA+KCwnISoiZzs8JykuKD19BCw6LBs8JykuKD0eJzcpGic2LTE=";
    public final List<EnumC1102750enp> LL;
    public final List<EnumC1102750enp> LLILLJJLI;
    public final C773800UXa LLILLL;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hmb);
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJJI = 73;
        c500980Jkm.LJII = 80;
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ai0;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return super.getCustomLayoutParams();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C773800UXa c773800UXa = this.LLILLL;
        C773810UXb c773810UXb = c773800UXa.LJFF;
        if (c773810UXb != null) {
            c773810UXb.LL.remove(c773800UXa);
        }
        EnumC1088870eRR.POPUP_BASIC.release(c773800UXa.LJIILIIL);
        EnumC1088870eRR.POPUP_SETTING.release(c773800UXa.LJIILIIL);
    }

    public final void close() {
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLL.LIZJ(C475510Ikn.LJ(this));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL.LIZLLL(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveToolbarMoreSheet(List<? extends EnumC1102750enp> list, List<? extends EnumC1102750enp> list2, C773830UXd c773830UXd) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = new C773800UXa(list, list2, c773830UXd, this, new AwS556S0100000_12(this, 164));
    }
}
