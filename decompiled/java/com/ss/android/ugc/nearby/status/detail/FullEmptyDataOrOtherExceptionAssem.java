package com.ss.android.ugc.nearby.status.detail;

import X.AbstractC426530Gnz;
import X.C1205260hTA;
import X.C1308910kAL;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444920HcY;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class FullEmptyDataOrOtherExceptionAssem extends UISlotAssem {
    public C1749280vcc LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dsk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Integer numLIZJ;
        String string2;
        super.onViewCreated(view);
        this.LLJJI = (C1749280vcc) view.findViewById(R.id.w1_);
        C1749280vcc c1749280vcc = this.LLJJI;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_no_video;
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
            if (context == null || (string = context.getString(2131837927)) == null) {
                string = "";
            }
            Context context2 = getContext();
            if (context2 != null && (string2 = context2.getString(2131837926)) != null) {
                str = string2;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, string, 0, false, 6);
            int length = string.length() + iLJJJ;
            Context context3 = getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context3)) != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length, 33);
            }
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0DfS
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view2) {
                    Activity activityLIZ;
                    C1205150hSz c1205150hSz = C1205150hSz.LIZ;
                    Context context4 = this.LL.getContext();
                    C19EG c19eg = null;
                    if (context4 != null) {
                        activityLIZ = C1388190mED.LIZ(context4);
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
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1205260hTA.LIZ.getClass();
        C1205260hTA.LJIIJJI("empty_page");
    }
}
