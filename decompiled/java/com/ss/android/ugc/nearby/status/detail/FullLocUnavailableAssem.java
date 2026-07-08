package com.ss.android.ugc.nearby.status.detail;

import X.AbstractC426530Gnz;
import X.C0HW7;
import X.C1308910kAL;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444540Hbw;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444630Hc5;
import X.C444640Hc6;
import X.C444690HcB;
import X.C444920HcY;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class FullLocUnavailableAssem extends UISlotAssem {
    public C1749280vcc LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dsn;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        String string2;
        Integer numLIZJ;
        String strJ4;
        super.onViewCreated(view);
        this.LLJJI = (C1749280vcc) view.findViewById(R.id.w1y);
        if (C0HW7.LIZ) {
            EnumC444680HcA enumC444680HcA = EnumC444680HcA.UNAVAILABLE;
            C444630Hc5 c444630Hc5LIZ = C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.HUG, (Float) null, 6), null, null, 2131833888, new C444560Hby(EnumC444580Hc0.PILL_BUTTON, 3, 2131833889, 1, new AwS548S0100000_4(this, 315)), new C444590Hc1(3));
            C1749280vcc c1749280vcc = this.LLJJI;
            if (c1749280vcc != null) {
                c1749280vcc.setStatus(C444600Hc2.LIZ(getContext(), this.LLJJI, c444630Hc5LIZ));
            }
            C444690HcB.LIZ(enumC444680HcA, this.LLJJI);
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJI;
        if (c1749280vcc2 == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_unavailable_region;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131837924)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        Context context2 = getContext();
        if (context2 == null || (string2 = context2.getString(2131837927)) == null) {
            string2 = "";
        }
        Context context3 = getContext();
        if (context3 != null && (strJ4 = C786410Ut5.j4(context3.getString(2131837921), Arrays.copyOf(new Object[]{string2}, 1))) != null) {
            str = strJ4;
        }
        SpannableString spannableString = new SpannableString(str);
        int iLJJJ = a0.LJJJ(str, string2, 0, false, 6);
        int length = string2.length() + iLJJJ;
        Context context4 = getContext();
        if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context4)) != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length, 33);
        }
        C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0DfT
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                Activity activityLIZ;
                C1205150hSz c1205150hSz = C1205150hSz.LIZ;
                Context context5 = this.LL.getContext();
                C19EG c19eg = null;
                if (context5 != null) {
                    activityLIZ = C1388190mED.LIZ(context5);
                } else {
                    activityLIZ = null;
                }
                if (activityLIZ instanceof C19EG) {
                    c19eg = (C19EG) activityLIZ;
                }
                c1205150hSz.getClass();
                C1205150hSz.LIZIZ(c19eg);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, length, 33);
        C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ, length, 33);
        c1722300uv6.LJIIIIZZ = spannableString;
        c1749280vcc2.setStatus(c1722300uv6);
    }
}
