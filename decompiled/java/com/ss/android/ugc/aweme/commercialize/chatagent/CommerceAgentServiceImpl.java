package com.ss.android.ugc.aweme.commercialize.chatagent;

import X.C1076920e8A;
import X.C320640Cha;
import X.C320760Chm;
import X.C321620CjA;
import X.C321630CjB;
import X.C321640CjC;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentServiceImpl implements ICommerceAgentService {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService
    public final void LIZLLL() {
        C321630CjB.LIZ.clear();
        C321630CjB.LIZIZ.clear();
        C321620CjA.LIZ.clear();
        C320760Chm.LIZ.getClass();
        C320760Chm.LIZIZ.clear();
        C320640Cha.LJIIJJI.clear();
        C320640Cha.LJIIL.clear();
        C320640Cha.LJIILIIL.clear();
        C320640Cha.LJIILJJIL.clear();
        C320640Cha.LJIILL.clear();
        C320640Cha.LJIILLIIL.clear();
        C320640Cha.LJIIZILJ.clear();
        C320640Cha.LJIJ = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService
    public final void LIZJ(Aweme aweme, String str, String str2) {
        C321640CjC.LIZ = aweme;
        C321640CjC.LIZIZ = str;
        C321640CjC.LIZJ = str2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService
    public final C1076920e8A LIZIZ(Context context, List list, Function1 function1, Function0 function0) {
        C1076920e8A c1076920e8A = new C1076920e8A(context, function1, function0);
        c1076920e8A.setupDefaultActions(list);
        return c1076920e8A;
    }
}
