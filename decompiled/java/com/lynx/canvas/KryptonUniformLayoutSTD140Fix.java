package com.lynx.canvas;

import X.C2188811AlT;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
public class KryptonUniformLayoutSTD140Fix {
    public static String polyfill(String str) {
        if (PatternProtector.compile("^\\\\s*#version\\\\s+300\\\\s+es").matcher(str).matches()) {
            return str;
        }
        Matcher matcher = PatternProtector.compile("(es|;)\\s*uniform\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s+\\{").matcher(str);
        ArrayList<Pair> arrayList = new ArrayList();
        while (matcher.find()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(";\n layout(std140) uniform ");
            sbLIZ.append(matcher.group(2));
            sbLIZ.append(" {");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Objects.equals(matcher.group(1), "es")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("es\n layout(std140) uniform ");
                sbLIZ2.append(matcher.group(2));
                sbLIZ2.append(" {");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            arrayList.add(new Pair(matcher.group(), strLIZIZ));
        }
        for (Pair pair : arrayList) {
            str = str.replace((CharSequence) pair.first, (CharSequence) pair.second);
        }
        return str;
    }
}
