package com.ss.ugc.android.editor.base.view;

import X.C1389600mGU;
import X.C19EG;
import X.C21560119Zf;
import X.C367260Eaa;
import X.C390810FTz;
import X.C786410Ut5;
import X.DialogInterfaceC21560019Ze;
import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class WaitingDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZjArKmEyJiE+JiY3ZiAoIDs8OmHELIOSsuKDw2ZjMlLDh9HyQlPSY9LwElKCM8Lw==";
    public C367260Eaa LL;

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = C390810FTz.LIZ(104.0f);
        attributes.height = C390810FTz.LIZ(88.0f);
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        C19EG activity = getActivity();
        if (activity != null) {
            C21560119Zf c21560119Zf = new C21560119Zf(activity);
            View viewSd = C786410Ut5.Sd(R.layout.ek0, requireActivity().getLayoutInflater(), null);
            C786410Ut5.Q7((ImageView) viewSd.findViewById(R.id.s98), new ACListenerS155S0100000_21(this, 108));
            this.LL = (C367260Eaa) viewSd.findViewById(R.id.xk7);
            viewSd.findViewById(R.id.s9z);
            C367260Eaa c367260Eaa = this.LL;
            if (c367260Eaa != null) {
                c367260Eaa.setProgress(0);
            }
            c21560119Zf.LIZ.LJIJI = viewSd;
            DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
            dialogInterfaceC21560019ZeLIZ.setCanceledOnTouchOutside(false);
            Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialogInterfaceC21560019ZeLIZ.requestWindowFeature(1);
            Window window2 = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                decorView.setTag(R.id.yzv, this);
            }
            C1389600mGU.LIZJ(dialogInterfaceC21560019ZeLIZ);
            return dialogInterfaceC21560019ZeLIZ;
        }
        throw new IllegalStateException("Activity cannot be null");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
