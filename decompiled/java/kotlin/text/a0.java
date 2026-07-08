package kotlin.text;

import X.C08LY;
import X.C09RB;
import X.C1244080iTm;
import X.C13LQ;
import X.C13LZ;
import X.C15438062q;
import X.C1846520y9S;
import X.C1947107jx;
import X.C19995113Lh;
import X.C20307914dB;
import X.C2188811AlT;
import X.InterfaceC19983313Gt;
import Y.AObjectS373S0100000_30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public class a0 extends u {
    public static final int LJJIJL(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final boolean LJJJIL(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C1244080iTm.LJ(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final List<String> LJJJJIZL(CharSequence charSequence) {
        return C09RB.LJJII(new C1947107jx(charSequence));
    }

    public static final void LJJLI(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Limit must be non-negative, but was ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final Boolean LJLI(String str) {
        if (Intrinsics.LJFF(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.LJFF(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence LJLIIIL(CharSequence charSequence) {
        int i;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean zLJ = C1244080iTm.LJ(charSequence.charAt(i));
            if (!z) {
                if (!zLJ) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!zLJ) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final CharSequence LJLILLLLZI(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!C1244080iTm.LJ(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static final CharSequence LJLJJL(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C1244080iTm.LJ(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static boolean LJJIJ(CharSequence charSequence, char c) {
        if (LJJIZ(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean LJJIJIIJIL(CharSequence charSequence, char c) {
        if (charSequence.length() <= 0 || !C1244080iTm.LIZJ(charSequence.charAt(charSequence.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJJIJIL(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return u.LJIIZILJ((String) charSequence, (String) charSequence2, false);
        }
        return LJJJJLL(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static final String LJJJJZ(CharSequence charSequence, String str) {
        if (LJJLIIIJL(str, charSequence)) {
            return str.substring(charSequence.length());
        }
        return str;
    }

    public static final CharSequence LJJJLIIL(CharSequence charSequence, CharSequence charSequence2) {
        if (LJJIJIL(charSequence, charSequence2)) {
            return charSequence.subSequence(0, charSequence.length() - ((String) charSequence2).length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String LJJJLL(CharSequence charSequence, String str) {
        if (LJJIJIL(str, charSequence)) {
            return str.substring(0, str.length() - charSequence.length());
        }
        return str;
    }

    public static String LJJJZ(String str, String str2) {
        int iLJJJJI = LJJJJI(str, "_", 0, 6);
        if (iLJJJJI != -1) {
            return LJJL(str, iLJJJJI + 1, str.length(), str2).toString();
        }
        return str;
    }

    public static C08LY LJJLIIIJJI(CharSequence charSequence, String[] strArr) {
        return new C08LY(LJJJJLI(charSequence, strArr, false, 0), new AObjectS373S0100000_30(charSequence, 5));
    }

    public static boolean LJJLIIIJJIZ(CharSequence charSequence, char c) {
        if (charSequence.length() <= 0 || !C1244080iTm.LIZJ(charSequence.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJJLIIIJL(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return u.LJJIIJZLJL((String) charSequence, (String) charSequence2, false);
        }
        return LJJJJLL(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static final String LJJLIIIJLJLI(CharSequence charSequence, IntRange intRange) {
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.LJFF().intValue() + 1).toString();
    }

    public static final String LJJLIIIJLLLLLLLZ(String str, IntRange intRange) {
        return str.substring(intRange.getStart().intValue(), intRange.LJFF().intValue() + 1);
    }

    public static final CharSequence LJLIIL(CharSequence charSequence, char... cArr) {
        int i;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean zLJIILIIL = C13LQ.LJIILIIL(charSequence.charAt(i), cArr);
            if (!z) {
                if (!zLJIILIIL) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!zLJIILIIL) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final String LJLIL(String str, char... cArr) {
        int i;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean zLJIILIIL = C13LQ.LJIILIIL(str.charAt(i), cArr);
            if (!z) {
                if (!zLJIILIIL) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!zLJIILIIL) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static final CharSequence LJLJI(CharSequence charSequence, char... cArr) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!C13LQ.LJIILIIL(charSequence.charAt(length), cArr)) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static final String LJLJJI(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C13LQ.LJIILIIL(str.charAt(length), cArr)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final String LJLJJLL(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!C13LQ.LJIILIIL(str.charAt(i), cArr)) {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean LJJIIZI(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (LJJJ(charSequence, (String) charSequence2, 0, z, 2) < 0) {
                return false;
            }
        } else if (LJJIL(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    public static final String LJJJJJ(char c, int i, String str) {
        ?? sb;
        if (i >= 0) {
            if (i <= str.length()) {
                sb = str.subSequence(0, str.length());
            } else {
                sb = new StringBuilder(i);
                sb.append(str);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return sb.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Desired length ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJJJJJL(char c, int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i >= 0) {
            if (i <= str.length()) {
                charSequenceSubSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequenceSubSequence = sb;
            }
            return charSequenceSubSequence.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Desired length ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final CharSequence LJJJJZI(int i, int i2, CharSequence charSequence) {
        if (i2 >= i) {
            if (i2 == i) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("End index (");
        sbLIZ.append(i2);
        sbLIZ.append(") is less than start index (");
        sbLIZ.append(i);
        sbLIZ.append(").");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJJJLZIJ(CharSequence charSequence, CharSequence charSequence2, String str) {
        String str2 = (String) charSequence;
        String str3 = (String) charSequence2;
        if (str.length() >= str2.length() + str3.length() && LJJLIIIJL(str, charSequence) && LJJIJIL(str, charSequence2)) {
            return str.substring(str2.length(), str.length() - str3.length());
        }
        return str;
    }

    public static final String LJJLIIJ(char c, String str, String str2) {
        int iLJJIZ = LJJIZ(str, c, 0, false, 6);
        if (iLJJIZ != -1) {
            return str.substring(iLJJIZ + 1, str.length());
        }
        return str2;
    }

    public static final String LJJLIL(String str, String str2, String str3) {
        int iLJJJ = LJJJ(str, str2, 0, false, 6);
        if (iLJJJ != -1) {
            return str.substring(iLJJJ + str2.length(), str.length());
        }
        return str3;
    }

    public static final String LJJLJ(char c, String str, String str2) {
        int iLJJJJ = LJJJJ(str, c, 0, 6);
        if (iLJJJJ != -1) {
            return str.substring(iLJJJJ + 1, str.length());
        }
        return str2;
    }

    public static final String LJJLJLI(String str, String str2, String str3) {
        int iLJJJJI = LJJJJI(str, str2, 0, 6);
        if (iLJJJJI != -1) {
            return str.substring(iLJJJJI + str2.length(), str.length());
        }
        return str3;
    }

    public static final String LJJLL(char c, String str, String str2) {
        int iLJJIZ = LJJIZ(str, c, 0, false, 6);
        if (iLJJIZ != -1) {
            return str.substring(0, iLJJIZ);
        }
        return str2;
    }

    public static final String LJJZ(String str, String str2, String str3) {
        int iLJJJ = LJJJ(str, str2, 0, false, 6);
        if (iLJJJ != -1) {
            return str.substring(0, iLJJJ);
        }
        return str3;
    }

    public static final String LJJZZIII(char c, String str, String str2) {
        int iLJJJJ = LJJJJ(str, c, 0, 6);
        if (iLJJJJ != -1) {
            return str.substring(0, iLJJJJ);
        }
        return str2;
    }

    public static final String LJL(String str, String str2, String str3) {
        int iLJJJJI = LJJJJI(str, str2, 0, 6);
        if (iLJJJJI != -1) {
            return str.substring(0, iLJJJJI);
        }
        return str3;
    }

    public static final int LJJIJLIJ(int i, CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return LJJIL(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int LJJJI(int i, CharSequence charSequence, boolean z, char[] cArr) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i <= length2) {
            while (true) {
                char cCharAt = charSequence.charAt(i);
                for (char c : cArr) {
                    if (C1244080iTm.LIZJ(c, cCharAt, z)) {
                        return i;
                    }
                }
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return -1;
    }

    public static int LJJJJ(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(c, i);
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (C1244080iTm.LIZJ(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int LJJJJI(CharSequence charSequence, String str, int i, int i2) {
        int length = i;
        if ((i2 & 2) != 0) {
            length = charSequence.length() - 1;
        }
        if (!(charSequence instanceof String)) {
            return LJJIL(charSequence, str, length, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, length);
    }

    public static C19995113Lh LJJJJL(CharSequence charSequence, final char[] cArr, final boolean z, int i) {
        LJJLI(i);
        return new C19995113Lh(charSequence, 0, i, new Function2() { // from class: X.04rs
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                char[] cArr2 = cArr;
                boolean z2 = z;
                int iLJJJI = a0.LJJJI(((Integer) obj2).intValue(), (CharSequence) obj, z2, cArr2);
                if (iLJJJI < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iLJJJI), 1);
            }
        });
    }

    public static C19995113Lh LJJJJLI(CharSequence charSequence, String[] strArr, final boolean z, int i) {
        LJJLI(i);
        final List listAsList = Arrays.asList(strArr);
        return new C19995113Lh(charSequence, 0, i, new Function2() { // from class: X.0HXR
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Pair pair;
                List list = listAsList;
                boolean z2 = z;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!z2 && list.size() == 1) {
                    String str = (String) C13LP.LJLJL(list);
                    int iLJJJ = a0.LJJJ(charSequence2, str, iIntValue, false, 4);
                    if (iLJJJ < 0) {
                        return null;
                    }
                    pair = new Pair(Integer.valueOf(iLJJJ), str);
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, charSequence2.length());
                    if (charSequence2 instanceof String) {
                        int i2 = intRange.LLILLJJLI;
                        int i3 = intRange.LLILLL;
                        if (i3 > 0) {
                            if (iIntValue > i2) {
                                return null;
                            }
                        } else if (i3 >= 0 || i2 > iIntValue) {
                            return null;
                        }
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                String str2 = (String) next;
                                if (u.LJIJJLI(str2, 0, z2, iIntValue, str2.length(), (String) charSequence2)) {
                                    if (next != null) {
                                        pair = new Pair(Integer.valueOf(iIntValue), next);
                                        break;
                                    }
                                }
                            }
                            if (iIntValue == i2) {
                                return null;
                            }
                            iIntValue += i3;
                        }
                    } else {
                        int i4 = intRange.LLILLJJLI;
                        int i5 = intRange.LLILLL;
                        if (i5 > 0) {
                            if (iIntValue > i4) {
                                return null;
                            }
                        } else if (i5 >= 0 || i4 > iIntValue) {
                            return null;
                        }
                        while (true) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                String str3 = (String) next2;
                                if (a0.LJJJJLL(str3, 0, charSequence2, iIntValue, str3.length(), z2)) {
                                    if (next2 != null) {
                                        pair = new Pair(Integer.valueOf(iIntValue), next2);
                                        break;
                                    }
                                }
                            }
                            if (iIntValue == i4) {
                                return null;
                            }
                            iIntValue += i5;
                        }
                    }
                }
                return new Pair(pair.getFirst(), Integer.valueOf(((String) pair.getSecond()).length()));
            }
        });
    }

    public static final CharSequence LJJL(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("End index (");
        sbLIZ.append(i2);
        sbLIZ.append(") is less than start index (");
        sbLIZ.append(i);
        sbLIZ.append(").");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final List LJJLIIIIJ(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        LJJLI(i);
        int length = 0;
        int iLJJIJLIJ = LJJIJLIJ(0, charSequence, str, z);
        if (iLJJIJLIJ != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = 10;
            if (z2 && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            do {
                arrayList.add(charSequence.subSequence(length, iLJJIJLIJ).toString());
                length = str.length() + iLJJIJLIJ;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                iLJJIJLIJ = LJJIJLIJ(length, charSequence, str, z);
            } while (iLJJIJLIJ != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return Collections.singletonList(charSequence.toString());
    }

    public static List LJJLIIIJILLIZJL(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return LJJLIIIIJ(i, charSequence, str, false);
            }
        }
        C20307914dB c20307914dB = new C20307914dB(LJJJJLI(charSequence, strArr, false, i), 2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c20307914dB, 10));
        Iterator<InterfaceC19983313Gt> it2 = c20307914dB.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJJLIIIJLJLI(charSequence, (IntRange) it2.next()));
        }
        return arrayList;
    }

    public static int LJJIZ(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        } else {
            if (!z) {
            }
            return LJJJI(i, charSequence, z, new char[]{c});
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        return LJJJI(i, charSequence, z, new char[]{c});
    }

    public static /* synthetic */ int LJJJ(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return LJJIJLIJ(i, charSequence, str, z);
    }

    public static List LJJLIIIJ(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (cArr.length == 1) {
            return LJJLIIIIJ(i, charSequence, String.valueOf(cArr[0]), z);
        }
        C20307914dB c20307914dB = new C20307914dB(LJJJJL(charSequence, cArr, z, i), 2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c20307914dB, 10));
        Iterator<InterfaceC19983313Gt> it2 = c20307914dB.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJJLIIIJLJLI(charSequence, (IntRange) it2.next()));
        }
        return arrayList;
    }

    public static final int LJJIL(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1846520y9S c1846520y9SLJIIIZ;
        int i3 = i2;
        int i4 = i;
        if (!z2) {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            c1846520y9SLJIIIZ = new IntRange(i4, i3);
        } else {
            int length2 = charSequence.length() - 1;
            if (i4 > length2) {
                i4 = length2;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            c1846520y9SLJIIIZ = C13LZ.LJIIIZ(i4, i3);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i5 = c1846520y9SLJIIIZ.LL;
            int i6 = c1846520y9SLJIIIZ.LLILLJJLI;
            int i7 = c1846520y9SLJIIIZ.LLILLL;
            if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
                while (true) {
                    String str = (String) charSequence2;
                    if (u.LJIJJLI(str, 0, z, i5, str.length(), (String) charSequence)) {
                        return i5;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
        } else {
            int i8 = c1846520y9SLJIIIZ.LL;
            int i9 = c1846520y9SLJIIIZ.LLILLJJLI;
            int i10 = c1846520y9SLJIIIZ.LLILLL;
            if (i10 > 0) {
                if (i8 > i9) {
                    return -1;
                }
            } else if (i10 < 0 && i9 <= i8) {
            }
            while (!LJJJJLL(charSequence2, 0, charSequence, i8, charSequence2.length(), z)) {
                if (i8 != i9) {
                    i8 += i10;
                }
            }
            return i8;
        }
        return -1;
    }

    public static final boolean LJJJJLL(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C1244080iTm.LIZJ(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
