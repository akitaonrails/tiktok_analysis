package com.ss.android.ugc.aweme.utils;

import X.C04TD;
import X.C21566519ah;
import X.C21566919al;
import X.C574300Mfk;
import X.DialogInterfaceOnClickListenerC580870MqL;
import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;

/* JADX INFO: loaded from: classes9.dex */
public final class NotificationClickHelperImpl implements NotificationClickHelper {
    public static NotificationClickHelper LIZIZ() {
        Object objLIZ = C04TD.LIZ(NotificationClickHelper.class, false);
        if (objLIZ != null) {
            return (NotificationClickHelper) objLIZ;
        }
        if (C04TD.W5 == null) {
            synchronized (NotificationClickHelper.class) {
                if (C04TD.W5 == null) {
                    C04TD.W5 = new NotificationClickHelperImpl();
                }
            }
        }
        return C04TD.W5;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper
    public final boolean LIZ(final Activity activity, boolean z, final boolean z2, final boolean z3, final String str) {
        if (activity == null) {
            return false;
        }
        if (z) {
            C21566919al c21566919al = new C21566919al(activity);
            c21566919al.LJFF(2131838802);
            c21566919al.LIZ(2131838800);
            c21566919al.LJII(2131835160, new DialogInterfaceOnClickListenerC580870MqL(0), false);
            c21566919al.LJIIJ(2131826403, new DialogInterface.OnClickListener() { // from class: X.0Mfl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C574300Mfk.LIZ(activity, str, z2, z3);
                    dialogInterface.dismiss();
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
            return true;
        }
        return C574300Mfk.LIZ(activity, str, z2, z3);
    }
}
