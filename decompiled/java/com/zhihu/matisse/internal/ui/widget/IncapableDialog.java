package com.zhihu.matisse.internal.ui.widget;

import X.C1389600mGU;
import X.C21560119Zf;
import X.C786410Ut5;
import X.DialogInterfaceC21560019Ze;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class IncapableDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzU7IS05ZyIyPCw/Oip9ISs4LD09KSliHELIOSPCZ9PywoLionZgwiKi4jKScgLAs6KSkjLg==";

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        C21560119Zf c21560119Zf = new C21560119Zf(getActivity());
        if (!TextUtils.isEmpty(string)) {
            c21560119Zf.LIZ.LIZLLL = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            c21560119Zf.LIZ.LJFF = string2;
        }
        c21560119Zf.LIZJ(2131837069, new DialogInterface.OnClickListener() { // from class: X.0m9W
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogInterfaceC21560019ZeLIZ);
        return dialogInterfaceC21560019ZeLIZ;
    }

    public static IncapableDialog MR(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("extra_title", str, bundle);
        C786410Ut5.LJJJI("extra_message", str2, bundle);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }
}
