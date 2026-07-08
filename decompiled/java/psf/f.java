package psf;

import X.C1119920fFW;
import X.C16F5;
import X.C176600m4;
import X.C814420VxA;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: loaded from: classes32.dex */
public final class f {
    public static void LIZ(String str, dc.a aVar, C16F5 c16f5) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strLJ = ec.a.LJ(str);
        int iHashCode = strLJ.hashCode();
        if (iHashCode != -515807685) {
            if (iHashCode != 365645865) {
                if (iHashCode == 930483431 && strLJ.equals("layout_marginHorizontal")) {
                    int iLIZIZ = C814420VxA.LIZIZ(ec.a.LIZJ(c16f5.getContext(), aVar));
                    ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMarginStart(iLIZIZ);
                        marginLayoutParams.setMarginEnd(iLIZIZ);
                    }
                    c16f5.requestLayout();
                    return;
                }
                return;
            }
            if (strLJ.equals("fontType")) {
                Context contextLIZ = C176600m4.LIZ();
                String str2 = aVar.LIZ;
                SparseIntArray sparseIntArray = C1119920fFW.LIZ;
                if (TextUtils.equals(str2, "bold")) {
                    i = OppoPermissionPopupMaskDelayExp.DEFAULT;
                } else if (TextUtils.equals(str2, "medium")) {
                    i = 500;
                } else {
                    i = 400;
                }
                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), i, contextLIZ));
                return;
            }
            return;
        }
        if (strLJ.equals("lineHeight")) {
            c16f5.setLineHeight(C814420VxA.LIZIZ(ec.a.LIZJ(c16f5.getContext(), aVar)));
        }
    }
}
