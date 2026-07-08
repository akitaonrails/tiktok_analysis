package com.bytedance.android.livesdk.browser.dialog;

import X.C1338790kwX;
import X.C367280Eac;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1839930xyp;
import Y.ACListenerS161S0100000_27;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class DownloadProgressDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjPjHELIOSw2OmsoIC4/JyJiDSAkJikjKCsDOiorOyogOwElKCM8Lw==";
    public C367280Eac LL;
    public InterfaceC1839930xyp LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gd3);
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 17;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        super.onStart();
        if (getDialog() != null && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes != null) {
                attributes.gravity = 17;
                attributes.width = C1338790kwX.LIZ(121.0f);
                attributes.height = C1338790kwX.LIZ(106.0f);
            }
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.ft1);
        this.LL = (C367280Eac) view.findViewById(R.id.s8q);
        C786410Ut5.Q7(imageView, new ACListenerS161S0100000_27(this, 28));
    }
}
