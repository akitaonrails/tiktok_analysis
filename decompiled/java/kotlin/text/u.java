package kotlin.text;

import X.C1244080iTm;
import X.C2095008Iq;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class u extends C2095008Iq {
    public static final String LJIILL(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static final byte[] LJIILLIIL(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static final boolean LJIILJJIL(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return LJIJI((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null) {
            String str = (String) charSequence;
            String str2 = (String) charSequence2;
            if (str.length() == str2.length()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (!C1244080iTm.LIZJ(str.charAt(i), str2.charAt(i), true)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String LJJ(int i, CharSequence charSequence) {
        int i2 = 1;
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    if (1 <= i) {
                        while (true) {
                            sb.append(charSequence);
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        }
                    }
                    return sb.toString();
                }
                char cCharAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = cCharAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Count 'n' must be non-negative, but was ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final boolean LJIIZILJ(String str, String str2, boolean z) {
        if (!z) {
            return str.endsWith(str2);
        }
        return LJIJJLI(str, str.length() - str2.length(), true, 0, str2.length(), str2);
    }

    public static final boolean LJIJI(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean LJJIIJZLJL(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        return LJIJJLI(str, 0, z, 0, str2.length(), str2);
    }

    public static final String LJJI(String str, char c, char c2, boolean z) {
        if (!z) {
            return str.replace(c, c2);
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (C1244080iTm.LIZJ(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String LJJIFFI(String str, String str2, String str3, boolean z) {
        int i = 0;
        int iLJJIJLIJ = a0.LJJIJLIJ(0, str, str2, z);
        if (iLJJIJLIJ < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, iLJJIJLIJ);
                sb.append(str3);
                i = iLJJIJLIJ + length;
                if (iLJJIJLIJ >= str.length()) {
                    break;
                }
                iLJJIJLIJ = a0.LJJIJLIJ(iLJJIJLIJ + i2, str, str2, z);
            } while (iLJJIJLIJ > 0);
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static final String LJJIII(String str, String str2, String str3, boolean z) {
        int iLJJJ = a0.LJJJ(str, str2, 0, z, 2);
        if (iLJJJ >= 0) {
            return a0.LJJL(str, iLJJJ, str2.length() + iLJJJ, str3).toString();
        }
        return str;
    }

    public static final boolean LJIJJLI(String str, int i, boolean z, int i2, int i3, String str2) {
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
