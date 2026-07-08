package psf;

import X.C1119920fFW;
import X.C176600m4;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class d {
    public static void LIZ(String str, a.c cVar, LiveEditText liveEditText) {
        int i;
        if (Intrinsics.LJFF(ec.a.LJ(str), "fontType")) {
            Context contextLIZ = C176600m4.LIZ();
            String str2 = cVar.LIZ;
            SparseIntArray sparseIntArray = C1119920fFW.LIZ;
            if (TextUtils.equals(str2, "bold")) {
                i = OppoPermissionPopupMaskDelayExp.DEFAULT;
            } else if (TextUtils.equals(str2, "medium")) {
                i = 500;
            } else {
                i = 400;
            }
            liveEditText.setTypeface(C1119920fFW.LIZJ(liveEditText.getTextSize(), i, contextLIZ));
        }
    }
}
