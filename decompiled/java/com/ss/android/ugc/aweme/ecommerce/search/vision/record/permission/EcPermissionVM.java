package com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission;

import X.C1A2G;
import X.C1A3X;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS399S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class EcPermissionVM extends AssemViewModel<C1A2G> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1A3X.LIZ.getClass();
        return new C1A2G(C1A3X.LIZJ(contextLIZ), C1A3X.LIZIZ(contextLIZ), C1A3X.LIZ(contextLIZ));
    }

    public static String vQ2(boolean z, boolean z2) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void wQ2(Context context, boolean z) {
        if (context == null) {
            return;
        }
        C1A2G state = getState();
        setState(new AwS399S0200000_33(this, context, 8));
        if (z) {
            withState(new AwS399S0200000_33(this, state, 9));
        }
    }
}
