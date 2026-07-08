package kotlin.jvm.internal;

import X.C09AY;
import X.C2003207t0;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public class AwS1S1010000_3 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1010000_3(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = true;
    }

    public static final Object invoke$0(AwS1S1010000_3 awS1S1010000_3, Object obj) {
        C2003207t0 c2003207t0 = (C2003207t0) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2003207t0.LLILLJJLI);
        linkedHashMap.put(awS1S1010000_3.s0, Boolean.valueOf(awS1S1010000_3.z1));
        return new C2003207t0(c2003207t0.LL, linkedHashMap);
    }

    public static final Object invoke$1(AwS1S1010000_3 awS1S1010000_3, Object obj) {
        C2003207t0 c2003207t0 = (C2003207t0) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2003207t0.LL);
        linkedHashMap.put(awS1S1010000_3.s0, Boolean.valueOf(awS1S1010000_3.z1));
        return new C2003207t0(linkedHashMap, c2003207t0.LLILLJJLI);
    }

    public static final Object invoke$2(AwS1S1010000_3 awS1S1010000_3, Object obj) {
        File file = (File) obj;
        if (awS1S1010000_3.z1) {
            String absolutePath = file.getAbsolutePath();
            CharSequence charSequenceSubSequence = "";
            if (!u.LJJIIJZLJL(absolutePath, awS1S1010000_3.s0, false)) {
                return "";
            }
            String strSubstring = absolutePath.substring(awS1S1010000_3.s0.length());
            int length = strSubstring.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char cCharAt = strSubstring.charAt(i);
                    if (cCharAt != '/' && cCharAt != File.separatorChar) {
                        charSequenceSubSequence = strSubstring.subSequence(i, strSubstring.length());
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            return u.LJJI(charSequenceSubSequence.toString(), File.separatorChar, '/', false);
        }
        return u.LJJI(file.getAbsolutePath(), File.separatorChar, '/', false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1010000_3(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
