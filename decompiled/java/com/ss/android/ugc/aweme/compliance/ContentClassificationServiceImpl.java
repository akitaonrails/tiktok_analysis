package com.ss.android.ugc.aweme.compliance;

import X.C10KE;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19EG;
import X.C2188811AlT;
import X.C259800zU;
import X.C444940Hca;
import X.C786410Ut5;
import X.C985403tE;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentClassificationServiceImpl implements IContentClassificationService {
    @Override // com.ss.android.ugc.aweme.compliance.IContentClassificationService
    public final Pair LIZIZ(C19EG c19eg, boolean z) {
        if (z) {
            String string = c19eg.getString(2131824488);
            String string2 = c19eg.getString(2131824485);
            String strJ4 = C786410Ut5.j4(c19eg.getString(2131824476), Arrays.copyOf(new Object[]{string2}, 1));
            int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
            SpannableString spannableString = new SpannableString(strJ4);
            if (iLJJJ >= 0) {
                C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, string2.length() + iLJJJ, 33);
            }
            return new Pair(string, spannableString);
        }
        return new Pair(c19eg.getString(2131837097), SpannableString.valueOf(c19eg.getString(2131837096)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.IContentClassificationService
    public final void LIZ(C19EG c19eg, Map map, Function0 function0) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "Cancel";
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJFF(2131837095);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ(2131837098);
        c444940Hca.LIZLLL(0);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(43);
        c444940Hca.LJIIIIZZ = new AwS403S0200000_2(map, c1397580mTM, c19eg, 72);
        CharSequence charSequenceLIZ = c444940Hca.LIZ(c19eg);
        C444940Hca c444940Hca2 = new C444940Hca();
        c444940Hca2.LIZJ(2131837099);
        c444940Hca2.LIZLLL(0);
        c444940Hca2.LIZIZ = false;
        c444940Hca2.LIZIZ(43);
        c444940Hca2.LJIIIIZZ = new AwS403S0200000_2(map, c1397580mTM, c19eg, 73);
        CharSequence charSequenceLIZ2 = c444940Hca2.LIZ(c19eg);
        C444940Hca c444940Hca3 = new C444940Hca();
        c444940Hca3.LIZJ(2131837100);
        c444940Hca3.LIZLLL(0);
        c444940Hca3.LIZIZ = false;
        c444940Hca3.LIZIZ(43);
        c444940Hca3.LJIIIIZZ = new AwS403S0200000_2(map, c1397580mTM, c19eg, 74);
        CharSequence charSequenceLIZ3 = c444940Hca3.LIZ(c19eg);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.getString(2131837093));
        sbLIZ.append("<br/><br/>");
        sbLIZ.append(c19eg.getString(2131837094));
        c1397580mTM.LIZIZ(C10KE.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), charSequenceLIZ, charSequenceLIZ2, charSequenceLIZ3));
        C985403tE.LIZ(c1397580mTM, new AwS368S0200000_2(function0, (Function0<Unit>) c259800zU, (C259800zU<String>) 130));
        c1397580mTM.LJ(new AwS581S0100000_2(map, (Map<String, String>) 571));
        c1397580mTM.LIZLLL(new AwS368S0200000_2(c259800zU, (C259800zU<String>) map, (Map<String, String>) 131));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
