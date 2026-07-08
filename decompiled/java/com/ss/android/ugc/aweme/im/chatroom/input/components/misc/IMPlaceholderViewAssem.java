package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C23250099c;
import X.C384050F3z;
import X.C433890Gzr;
import X.C433900Gzs;
import X.C433910Gzt;
import X.C442000HUw;
import X.C459000HzG;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class IMPlaceholderViewAssem extends UiStateViewAssem<C433890Gzr, C442000HUw, View> {
    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        View view = new View(context);
        C384050F3z c384050F3z = ((C433890Gzr) C459000HzG.LIZIZ(this).getValue()).LIZIZ;
        Context context2 = view.getContext();
        if (context2 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        view.setBackground(c384050F3z.LIZ(context2));
        C786410Ut5.LJLLLLLL(((C433890Gzr) C459000HzG.LIZIZ(this).getValue()).LIZ ? 0 : 8, view);
        return view;
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, view);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C433900Gzs(this, view, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C433910Gzt(this, view, null), 3);
    }
}
