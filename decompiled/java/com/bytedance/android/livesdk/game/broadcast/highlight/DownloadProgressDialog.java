package com.bytedance.android.livesdk.game.broadcast.highlight;

import X.C16F5;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1811910xFd;
import Y.ACListenerS161S0100000_27;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class DownloadProgressDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotHELIOSLSwyOzFiISY0ICklLicnZgEjPiE/JyQoGT08LzcpOjwXISQgJig=";
    public ProgressBar LL;
    public C16F5 LLILLJJLI;
    public InterfaceC1811910xFd LLILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5m);
        c500980Jkm.LJIIJ = (int) C497740JfY.LIZIZ(106.0f);
        c500980Jkm.LJIIIZ = (int) C497740JfY.LIZIZ(113.0f);
        c500980Jkm.LJII = 17;
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (ProgressBar) view.findViewById(R.id.q69);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_pb_progress_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.cpo);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS161S0100000_27(this, 29));
        }
    }
}
