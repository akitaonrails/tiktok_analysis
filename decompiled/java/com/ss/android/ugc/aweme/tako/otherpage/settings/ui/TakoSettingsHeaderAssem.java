package com.ss.android.ugc.aweme.tako.otherpage.settings.ui;

import X.C07CR;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1852920yJm;
import X.C1857680yRS;
import X.C1857690yRT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSettingsHeaderAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.flm;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.xc9);
        View viewFindViewById = view.findViewById(R.id.p1k);
        TextView textView = (TextView) view.findViewById(R.id.xc8);
        ImageView imageView = (ImageView) view.findViewById(R.id.xc6);
        C786410Ut5.T4(viewFindViewById, 0.0f);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        C786410Ut5.i9(tuxNavBar, new View.OnClickListener() { // from class: X.0yRR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        tuxNavBar.LJIIZILJ(false);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1119));
        tuxNavBar.LIZIZ(c1251150ifB);
        textView.setText(C1852920yJm.LIZ.botName);
        if (C07CR.LIZ()) {
            Context context2 = getContext();
            if (context2 != null && imageView != null) {
                imageView.setBackground(C1857680yRS.LIZ.LJI(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)))).LIZ(context2));
                return;
            }
            return;
        }
        if (imageView == null) {
            return;
        }
        C1857690yRT.LJI(imageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), R.attr.zq, 0, Float.valueOf(0.825f), 8);
    }
}
