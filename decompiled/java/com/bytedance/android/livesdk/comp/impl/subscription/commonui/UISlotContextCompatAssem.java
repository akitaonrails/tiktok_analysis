package com.bytedance.android.livesdk.comp.impl.subscription.commonui;

import X.AbstractC1387200mCc;
import X.C464660IKa;
import X.C504210Jpz;
import X.C520040KaQ;
import X.C724240Sb0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UISlotContextCompatAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if ((C504210Jpz.LIZ || C464660IKa.LIZ()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }
}
