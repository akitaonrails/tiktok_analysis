package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C0HV8;
import X.C442000HUw;
import X.C459000HzG;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class IMHorizontalLinearLayoutViewAssem extends UiStateViewAssem<C0HV8, C442000HUw, LinearLayout> {
    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.kr1);
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(80);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, view);
        }
    }
}
