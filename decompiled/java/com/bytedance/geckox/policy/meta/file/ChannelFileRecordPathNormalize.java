package com.bytedance.geckox.policy.meta.file;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelFileRecordPathNormalize {
    public static final ChannelFileRecordPathNormalize INSTANCE = new ChannelFileRecordPathNormalize();
    public static final Pattern hexHashSegmentPattern = PatternProtector.compile("^[0-9a-f]{6,32}$");

    public final String removeHash(String str) {
        String strSubstring;
        String strLJLJJLL = a0.LJLJJLL(u.LJJI(str, '\\', '/', false), '/');
        int iLJJJJ = a0.LJJJJ(strLJLJJLL, '/', 0, 6);
        if (iLJJJJ >= 0) {
            strSubstring = strLJLJJLL.substring(0, iLJJJJ);
            strLJLJJLL = strLJLJJLL.substring(iLJJJJ + 1);
        } else {
            strSubstring = "";
        }
        String strStripHashFromLeafFilename$geckox_release = stripHashFromLeafFilename$geckox_release(strLJLJJLL);
        if (strSubstring.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append('/');
            sbLIZ.append(strStripHashFromLeafFilename$geckox_release);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strStripHashFromLeafFilename$geckox_release;
    }

    public final String stripHashFromLeafFilename$geckox_release(String str) {
        int iLJJJJ = a0.LJJJJ(str, '.', 0, 6);
        if (iLJJJJ == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iLJJJJ);
        String strSubstring2 = str.substring(iLJJJJ);
        int iLJJJJ2 = a0.LJJJJ(strSubstring, '.', 0, 6);
        if (iLJJJJ2 == -1) {
            return str;
        }
        if (!hexHashSegmentPattern.matcher(strSubstring.substring(iLJJJJ2 + 1)).matches()) {
            return str;
        }
        String strSubstring3 = strSubstring.substring(0, iLJJJJ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring3);
        sbLIZ.append(strSubstring2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
