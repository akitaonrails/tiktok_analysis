package kotlin.jvm.internal;

import X.C09AY;
import X.C1300980jxY;
import X.C21281918Qf;
import X.InterfaceC1631620sYq;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.ies.xelement.LynxSeekerManager;
import com.ss.android.ugc.aweme.ecommerce.player.video.lynx.LynxMMKVideoTimeView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class AwS669S0100000_20 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS669S0100000_20(C21281918Qf c21281918Qf, int i) {
        super(3);
        this.$t = i;
        this.l0 = c21281918Qf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS669S0100000_20(LynxSeekerManager lynxSeekerManager, int i) {
        super(3);
        this.$t = i;
        this.l0 = lynxSeekerManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS669S0100000_20(LynxMMKVideoTimeView lynxMMKVideoTimeView, int i) {
        super(3);
        this.$t = i;
        this.l0 = lynxMMKVideoTimeView;
    }

    public static final Object invoke$0(AwS669S0100000_20 awS669S0100000_20, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = ((LynxMMKVideoTimeView) awS669S0100000_20.l0).mContext;
        if (sVar != null) {
            String str2 = "ProximaNova-Regular";
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "ProximaNova-Regular";
                }
                str2 = str;
            }
            Typeface typefaceLJ = C1300980jxY.LJ(iIntValue, sVar, str2);
            if (typefaceLJ != null) {
                return typefaceLJ;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("Can't not find typeface for fontFamily: ");
        r1.append(r6);
        r1.append(" in lynx.");
        com.lynx.base.log.LynxLog.v("TypefaceCache", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS669S0100000_20 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r7 = r10.intValue()
            java.lang.Object r0 = r8.l0
            X.18Qf r0 = (X.C21281918Qf) r0
            r0.getClass()
            java.lang.String r6 = "ProximaNova-Regular"
            if (r9 == 0) goto L1b
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L1a
            r9 = r6
        L1a:
            r6 = r9
        L1b:
            java.lang.Class<X.07ww> r5 = X.C2027607ww.class
            monitor-enter(r5)
            java.lang.String r0 = ","
            java.lang.String[] r4 = r6.split(r0)     // Catch: java.lang.Throwable -> L69
            int r3 = r4.length     // Catch: java.lang.Throwable -> L69
            r2 = 0
        L26:
            if (r2 >= r3) goto L47
            r0 = r4[r2]     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = X.C1301130jxn.LIZLLL(r0)     // Catch: java.lang.Throwable -> L69
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L42
            android.graphics.Typeface r0 = X.C2027607ww.LIZIZ(r7, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L3b
            goto L64
        L3b:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r7)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L42
            goto L45
        L42:
            int r2 = r2 + 1
            goto L26
        L45:
            monitor-exit(r5)
            goto L65
        L47:
            java.lang.String r2 = "TypefaceCache"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "Can't not find typeface for fontFamily: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L69
            r1.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = " in lynx."
            r1.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L69
            com.lynx.base.log.LynxLog.v(r2, r0)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)
            r0 = 0
            goto L65
        L64:
            monitor-exit(r5)
        L65:
            if (r0 == 0) goto L68
            return r0
        L68:
            return r11
        L69:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS669S0100000_20.invoke$1(kotlin.jvm.internal.AwS669S0100000_20, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS669S0100000_20 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r5 = (java.util.Map) r5
            java.util.Map r2 = X.C2097608Jq.LJ()
            int r1 = r4.hashCode()
            r0 = 831845681(0x3194f531, float:4.335242E-9)
            if (r1 == r0) goto L70
            r0 = 1507777852(0x59dedd3c, float:7.841337E15)
            if (r1 == r0) goto L67
            r0 = 1971816291(0x75878763, float:3.4360647E32)
            if (r1 != r0) goto L23
            java.lang.String r1 = "seekend"
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L26
        L23:
            java.lang.String r1 = ""
            r5 = r2
        L26:
            java.lang.Object r0 = r3.l0
            com.bytedance.ies.xelement.LynxSeekerManager r0 = (com.bytedance.ies.xelement.LynxSeekerManager) r0
            j27.s r0 = r0.mContext
            if (r0 == 0) goto L7c
            X.0jtu r4 = r0.LLIZ
            if (r4 == 0) goto L7c
            int r0 = r1.length()
            if (r0 <= 0) goto L7c
            java.lang.Object r0 = r3.l0
            com.bytedance.ies.xelement.LynxSeekerManager r0 = (com.bytedance.ies.xelement.LynxSeekerManager) r0
            X.0jfm r3 = new X.0jfm
            int r0 = r0.getSign()
            r3.<init>(r0, r1)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L4d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r3.LIZIZ(r0, r1)
            goto L4d
        L67:
            java.lang.String r1 = "seekchanged"
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L26
            goto L23
        L70:
            java.lang.String r1 = "seekbegin"
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L26
            goto L23
        L79:
            r4.LIZIZ(r3)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS669S0100000_20.invoke$2(kotlin.jvm.internal.AwS669S0100000_20, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
