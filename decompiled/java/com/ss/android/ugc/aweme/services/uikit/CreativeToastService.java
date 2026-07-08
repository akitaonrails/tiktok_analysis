package com.ss.android.ugc.aweme.services.uikit;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes6.dex */
public interface CreativeToastService {
    CreativeToast createToast(Activity activity, int i, CreativeToastBuilder creativeToastBuilder);

    CreativeToast createToast(Dialog dialog, int i, CreativeToastBuilder creativeToastBuilder);

    CreativeToast createToast(View view, int i, CreativeToastBuilder creativeToastBuilder);

    CreativeToast createToast(PopupWindow popupWindow, int i, CreativeToastBuilder creativeToastBuilder);

    CreativeToast createToast(Fragment fragment, int i, CreativeToastBuilder creativeToastBuilder);
}
