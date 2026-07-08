package com.ttnet.org.chromium.base;

import X.C787230UuP;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class PiiElider {
    public static final Pattern LIZ = PatternProtector.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    public static final Pattern LIZIZ = PatternProtector.compile("\\sat\\sorg\\.chromium\\.[^ ]+.|Caused by: java.lang.(ClassNotFoundException|NoClassDefFoundError):");
    public static final String[] LIZJ;
    public static final String[] LIZLLL;

    static {
        PatternProtector.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        PatternProtector.compile("\\[\\w*:CONSOLE.*\\].*");
        LIZJ = new String[]{"com.ttnet.org.chromium.", "com.google.", "com.chrome."};
        LIZLLL = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    public static String LIZ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            if (LIZIZ.matcher(str).find()) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            Matcher matcher = LIZ.matcher(sb);
            int iEnd = 0;
            while (matcher.find(iEnd)) {
                int iStart = matcher.start();
                iEnd = matcher.end();
                String strSubstring = sb.substring(iStart, iEnd);
                String[] strArr = LIZJ;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = true;
                    if (i < length) {
                        if (!strSubstring.startsWith(strArr[i])) {
                            i++;
                        } else {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    String[] strArr2 = LIZLLL;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            if (!strSubstring.startsWith(strArr2[i2])) {
                                i2++;
                            } else {
                                z3 = true;
                                break;
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    if (!z3) {
                        try {
                            Class.forName(strSubstring, false, C787230UuP.LIZ.getClassLoader());
                            z4 = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            z4 = false;
                        }
                        if (!z4) {
                            int iLastIndexOf = strSubstring.lastIndexOf(e3.d);
                            if (iLastIndexOf != -1) {
                                try {
                                    Class.forName(strSubstring.substring(0, iLastIndexOf), false, C787230UuP.LIZ.getClassLoader());
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            sb.replace(iStart, iEnd, "HTTP://WEBADDRESS.ELIDED");
                            iEnd = iStart + 24;
                            matcher = LIZ.matcher(sb);
                        }
                    }
                }
            }
            return sb.toString();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String sanitizeStacktrace(String str) {
        String[] strArrSplit = str.split("\\n");
        strArrSplit[0] = LIZ(strArrSplit[0]);
        for (int i = 1; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith("Caused by:")) {
                strArrSplit[i] = LIZ(strArrSplit[i]);
            }
        }
        return TextUtils.join("\n", strArrSplit);
    }
}
