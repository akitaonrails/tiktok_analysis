package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C01GW;
import X.C23250099c;
import X.C343000DcY;
import X.C434110H0n;
import X.C434130H0p;
import X.C452501pT;
import X.C459000HzG;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioViewAssem extends UiStateViewAssem<C434130H0p, C343000DcY, View> {
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(61));

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        View view;
        MixStudioEntranceControl mixStudioEntranceControl;
        Context context = getContext();
        if (context == null || (mixStudioEntranceControl = (MixStudioEntranceControl) this.LLJJIII.getValue()) == null || (view = mixStudioEntranceControl.LJIIIIZZ(context)) == null) {
            view = new View(getContext());
        }
        Function1<View, Unit> function1 = ((C343000DcY) C459000HzG.LIZ(this)).LIZ;
        if (function1 == null) {
            C786410Ut5.I7(null, view);
            return view;
        }
        C786410Ut5.I7(new AbS688S0100000_6(function1, 0), view);
        return view;
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, view);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C434110H0n(this, view, (MixStudioEntranceControl) PluggableExtentionKt.pluggableSpiForReal(MixStudioEntranceControl.class), null), 3);
    }
}
