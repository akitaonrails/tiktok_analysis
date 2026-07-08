package com.ss.android.ugc.aweme.slash.component;

import X.C1308910kAL;
import X.C1749280vcc;
import X.C444540Hbw;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SlashUnavailableAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
            c1749280vcc.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Hc7
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, view.getContext());
            if (numLIZJ != null) {
                c1749280vcc.setBackgroundColor(numLIZJ.intValue());
            }
            c1749280vcc.setStatus(C444600Hc2.LIZ(viewGroup.getContext(), c1749280vcc, C444540Hbw.LIZ(EnumC444680HcA.UNAVAILABLE, new C444640Hc6(EnumC444620Hc4.ILLUSTRATION, (Float) null, 6), null, 2131844863, 2131844862, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, 2131844864, 1, new AwS550S0100000_6(viewGroup, 606)), new C444590Hc1(3))));
            viewGroup.addView(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
