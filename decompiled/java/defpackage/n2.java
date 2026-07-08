package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Object obj, Object obj2) {
        if (Intrinsics.LJFF(obj, JSONObject.NULL) && Intrinsics.LJFF(obj2, JSONObject.NULL)) {
            return true;
        }
        if (Intrinsics.LJFF(obj, JSONObject.NULL) || Intrinsics.LJFF(obj2, JSONObject.NULL)) {
            return false;
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            if (((Number) obj).doubleValue() == ((Number) obj2).doubleValue()) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    public static int LIZIZ(Object obj, Object obj2) {
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
        }
        return obj.toString().compareTo(obj2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        if (LIZIZ(r4, r5) > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019e, code lost:
    
        if (r1.equals("neq") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a4, code lost:
    
        if (LIZ(r4, r5) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r1.equals("<") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0105, code lost:
    
        if (r1.equals(">") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r1.equals("!=") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
    
        if (r1.equals("<=") != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        if (r1.equals("==") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        if (r1.equals(">=") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (r1.equals("eq") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        return LIZ(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0140, code lost:
    
        if (r1.equals("gt") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0146, code lost:
    
        if (LIZIZ(r4, r5) <= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0148, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0171, code lost:
    
        if (r1.equals("lt") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0177, code lost:
    
        if (LIZIZ(r4, r5) >= 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0179, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0180, code lost:
    
        if (r1.equals("gte") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0186, code lost:
    
        if (LIZIZ(r4, r5) < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r1.equals("lte") != false) goto L100;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.util.HashMap r6, org.json.JSONObject r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2.LIZJ(java.util.HashMap, org.json.JSONObject):boolean");
    }
}
