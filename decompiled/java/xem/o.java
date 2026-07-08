package xem;

import X.C2095008Iq;
import X.C2327809Ae;
import com.bytedance.tux.input.TuxTextView;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class o {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, dc.a aVar, TuxTextView tuxTextView) {
        Integer numLJIIJJI;
        Float fLJIIIIZZ;
        if (Intrinsics.LJFF(str, "app:tux_font")) {
            String str2 = aVar.LIZ;
            if (str2 == null) {
                return;
            }
            switch (str2.hashCode()) {
                case -2075419153:
                    if (str2.equals("P3_Semibold")) {
                        tuxTextView.setTuxFont(72);
                    }
                    break;
                case -1977381360:
                    if (str2.equals("Headline_Bold")) {
                        tuxTextView.setTuxFont(103);
                    }
                    break;
                case -1878905648:
                    if (str2.equals("P2_Semibold")) {
                        tuxTextView.setTuxFont(62);
                    }
                    break;
                case -1687436011:
                    if (str2.equals("LargeTitle_Semibold")) {
                        tuxTextView.setTuxFont(122);
                    }
                    break;
                case -1682392143:
                    if (str2.equals("P1_Semibold")) {
                        tuxTextView.setTuxFont(52);
                    }
                    break;
                case -1666769871:
                    if (str2.equals("Headline_Regular")) {
                        tuxTextView.setTuxFont(101);
                    }
                    break;
                case -1412917347:
                    if (str2.equals("Longform_Regular")) {
                        tuxTextView.setTuxFont(111);
                    }
                    break;
                case -1401011141:
                    if (str2.equals("SmallText2_Regular")) {
                        tuxTextView.setTuxFont(91);
                    }
                    break;
                case -781223674:
                    if (str2.equals("H4_Semibold")) {
                        tuxTextView.setTuxFont(42);
                    }
                    break;
                case -729437660:
                    if (str2.equals("Longform_Bold")) {
                        tuxTextView.setTuxFont(113);
                    }
                    break;
                case -628105945:
                    if (str2.equals("H2_Regular")) {
                        tuxTextView.setTuxFont(21);
                    }
                    break;
                case -584710169:
                    if (str2.equals("H3_Semibold")) {
                        tuxTextView.setTuxFont(32);
                    }
                    break;
                case -521510333:
                    if (str2.equals("P1_Bold")) {
                        tuxTextView.setTuxFont(53);
                    }
                    break;
                case -492881182:
                    if (str2.equals("P2_Bold")) {
                        tuxTextView.setTuxFont(63);
                    }
                    break;
                case -464252031:
                    if (str2.equals("P3_Bold")) {
                        tuxTextView.setTuxFont(73);
                    }
                    break;
                case -392759522:
                    if (str2.equals("P1_Regular")) {
                        tuxTextView.setTuxFont(51);
                    }
                    break;
                case -388196664:
                    if (str2.equals("H2_Semibold")) {
                        tuxTextView.setTuxFont(22);
                    }
                    break;
                case -191683159:
                    if (str2.equals("H1_Semibold")) {
                        tuxTextView.setTuxFont(12);
                    }
                    break;
                case 51952425:
                    if (str2.equals("H4_Regular")) {
                        tuxTextView.setTuxFont(41);
                    }
                    break;
                case 287298848:
                    if (str2.equals("P3_Regular")) {
                        tuxTextView.setTuxFont(71);
                    }
                    break;
                case 406443322:
                    if (str2.equals("SmallText1_Regular")) {
                        tuxTextView.setTuxFont(81);
                    }
                    break;
                case 968394811:
                    if (str2.equals("H1_Bold")) {
                        tuxTextView.setTuxFont(13);
                    }
                    break;
                case 997023962:
                    if (str2.equals("H2_Bold")) {
                        tuxTextView.setTuxFont(23);
                    }
                    break;
                case 1025653113:
                    if (str2.equals("H3_Bold")) {
                        tuxTextView.setTuxFont(33);
                    }
                    break;
                case 1052453650:
                    if (str2.equals("Longform_Semibold")) {
                        tuxTextView.setTuxFont(112);
                    }
                    break;
                case 1054282264:
                    if (str2.equals("H4_Bold")) {
                        tuxTextView.setTuxFont(43);
                    }
                    break;
                case 1179348518:
                    if (str2.equals("H1_Regular")) {
                        tuxTextView.setTuxFont(11);
                    }
                    break;
                case 1421546036:
                    if (str2.equals("SmallText2_Semibold")) {
                        tuxTextView.setTuxFont(92);
                    }
                    break;
                case 1547812263:
                    if (str2.equals("LargeTitle_Bold")) {
                        tuxTextView.setTuxFont(123);
                    }
                    break;
                case 1618059541:
                    if (str2.equals("SmallText1_Semibold")) {
                        tuxTextView.setTuxFont(82);
                    }
                    break;
                case 1721080231:
                    if (str2.equals("SmallText1_Bold")) {
                        tuxTextView.setTuxFont(83);
                    }
                    break;
                case 1749709382:
                    if (str2.equals("SmallText2_Bold")) {
                        tuxTextView.setTuxFont(93);
                    }
                    break;
                case 1772959998:
                    if (str2.equals("Headline_Semibold")) {
                        tuxTextView.setTuxFont(102);
                    }
                    break;
                case 1859406888:
                    if (str2.equals("H3_Regular")) {
                        tuxTextView.setTuxFont(31);
                    }
                    break;
                case 2094753311:
                    if (str2.equals("P2_Regular")) {
                        tuxTextView.setTuxFont(61);
                    }
                    break;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "app:tux_minTextSize") || !(aVar instanceof a.d)) {
            return;
        }
        String str3 = aVar.LIZ;
        String str4 = ((a.d) aVar).LIZIZ;
        if (Intrinsics.LJFF(str4, "dp")) {
            if (str3 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3)) != null) {
                tuxTextView.setMinTextSize(fLJIIIIZZ.floatValue());
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str4, "px") || str3 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) == null) {
            return;
        }
        tuxTextView.setMinTextSizePx(numLJIIJJI.intValue());
    }
}
