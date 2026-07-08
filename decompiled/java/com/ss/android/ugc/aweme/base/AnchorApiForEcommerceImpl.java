package com.ss.android.ugc.aweme.base;

import X.C1066920ds2;
import X.C1394720mOk;
import X.DialogC1393760mNC;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorApiForEcommerceImpl implements IAnchorApiForEcommerce {
    @Override // com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce
    public final void LIZ(Dialog dialog) {
        DialogC1393760mNC dialogC1393760mNC;
        if ((dialog instanceof DialogC1393760mNC) && (dialogC1393760mNC = (DialogC1393760mNC) dialog) != null) {
            dialogC1393760mNC.LLJJIJIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce
    public final boolean containAnchors(List<Integer> list) {
        AnchorListManager.LIZ.getClass();
        return AnchorListManager.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce
    public final View commonAnchorItemProduceOne(ViewGroup viewGroup, Function0<Integer> function0, Function0<String> function02) {
        C1394720mOk c1394720mOkLIZ = C1066920ds2.LIZ(viewGroup.getContext());
        c1394720mOkLIZ.setIconRes(function0.invoke().intValue());
        c1394720mOkLIZ.setTitle(function02.invoke());
        return c1394720mOkLIZ;
    }
}
