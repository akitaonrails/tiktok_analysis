package com.ss.android.ugc.profile.platform.standard.protocol.component;

import X.C01GW;
import X.C11G4;
import X.C1248090iaF;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419890GdH;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ContentCellProtocol extends AdvancedFeatureProtocol {
    public boolean LLJL;
    public C419890GdH LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;
    public Map<String, ? extends Object> LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2570));

    public void LJLILLLLZI(Map map) {
    }

    public void LJLJJI(boolean z) {
    }

    public void LJLJJLL(Map map, boolean z) {
    }

    public boolean LJLJLLL(n nVar) {
        return false;
    }

    public void onDestroy() {
    }

    public void LJLJI() {
        View view = (View) this.LLJZIJLIL.getValue();
        if (view != null) {
            view.setBackground(null);
        }
        this.LLJLLL = false;
    }

    public final void LJLL(String str) {
        C127M accessory;
        C11G4 c11g4;
        Context context;
        int i;
        int iIntValue;
        int iBreakText;
        C127K c127k;
        View view = this.LLILZLL;
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (!(accessory instanceof C11G4) || (c11g4 = (C11G4) accessory) == null || (context = getContext()) == null) {
            return;
        }
        this.LLJLLIL = str;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) "12");
        TextPaint paint = ((TextView) c11g4.LIZIZ.findViewById(R.id.m4r)).getPaint();
        paint.setTextSize(C418440Gaw.LIZIZ(13));
        float fMeasureText = paint.measureText(str);
        if (this.LLJL) {
            i = 65;
        } else {
            i = 80;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i));
        C1248090iaF c1248090iaF = new C1248090iaF(context);
        c1248090iaF.LIZIZ(3);
        if (fMeasureText > fLIZIZ && (iBreakText = paint.breakText(str, true, fLIZIZ, null) - 3) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, iBreakText));
            sbLIZ.append("...");
            c1248090iaF.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1248090iaF.LIZJ(str);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1248090iaF.LIZLLL(iIntValue);
        c1248090iaF.LIZ(0);
        C786410Ut5.q2(spannableStringBuilderAppend, c1248090iaF, 0, 1, 17);
        if (this.LLJL) {
            C786410Ut5.q2(spannableStringBuilderAppend, this.LLJLIL, 1, 2, 17);
        } else {
            spannableStringBuilderAppend.delete(1, 2);
        }
        c11g4.LJIILJJIL(spannableStringBuilderAppend);
    }
}
