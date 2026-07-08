package com.ss.android.ugc.aweme.component.verify.pin;

import X.C19EG;
import X.C724240Sb0;
import android.view.Window;
import com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem;

/* JADX INFO: loaded from: classes27.dex */
public class BasePinUIAssem extends ThemedContextUIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        Window window;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            c19egLIZ.setRequestedOrientation(1);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null || (window = c19egLIZ2.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }
}
