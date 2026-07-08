package com.ss.android.ugc.aweme.nxreword.proxy;

import X.C2110908Ot;
import X.C2111008Ou;
import X.C2188811AlT;
import X.C817700W5w;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class NxStringLancet {
    public void attachBaseContextActivity(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            new C817700W5w(context, true);
        }
        int i = C2110908Ot.LIZ;
    }

    public void attachBaseContextWrapper(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            new C817700W5w(context, false);
        }
        int i = C2110908Ot.LIZ;
    }

    public String getStringLancet(int i) {
        int i2 = C2111008Ou.LIZ;
        CharSequence text = getText((TypedArray) new Object(), i);
        if (text != null) {
            return text.toString();
        }
        int i3 = C2110908Ot.LIZ;
        return (String) new Object();
    }

    public CharSequence getTextLancet(int i) {
        int i2 = C2111008Ou.LIZ;
        CharSequence text = getText((TypedArray) new Object(), i);
        if (text != null) {
            return text;
        }
        int i3 = C2110908Ot.LIZ;
        return (CharSequence) new Object();
    }

    public static CharSequence getText(TypedArray typedArray, int i) {
        CharSequence text;
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId != -1) {
            if (NxRewordManager.LJIIJ != null) {
                text = NxRewordManager.LJIIJ.getText(resourceId);
            } else {
                text = typedArray.getResources().getText(resourceId);
            }
            if (text == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getText null, from origin get id : ");
                sbLIZ.append(resourceId);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return text;
        }
        return null;
    }
}
