package com.bytedance.pipo.ocr.view.component;

import X.C2186421Ahc;
import X.InterfaceC1850080yFC;
import X.InterfaceC1910380zoS;
import X.InterfaceC20340314iP;
import X.InterfaceC21663619qM;
import X.InterfaceC2186401Aha;
import X.InterfaceC2186411Ahb;
import X.InterfaceC2186471Ahh;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes34.dex */
public interface IOcrComponent {
    InterfaceC1910380zoS getButton(Context context);

    InterfaceC20340314iP getDialog(Context context);

    InterfaceC2186471Ahh getFormItem(Context context);

    InterfaceC1850080yFC getLoadingHUD(Context context);

    InterfaceC2186401Aha getSheet(Context context);

    InterfaceC21663619qM getTextView(Context context);

    InterfaceC2186411Ahb getToast(Context context);

    C2186421Ahc setThemeAndGetColors(Activity activity);
}
