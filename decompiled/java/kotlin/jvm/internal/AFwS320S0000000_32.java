package kotlin.jvm.internal;

import X.C09AY;
import X.C21208717zB;
import X.C21211017zY;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public class AFwS320S0000000_32 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static AFwS320S0000000_32 get$arr$(int i) {
        AFwS320S0000000_32 aFwS320S0000000_32 = (AFwS320S0000000_32) arr$.get(i);
        if (aFwS320S0000000_32 != null) {
            return aFwS320S0000000_32;
        }
        arr$.compareAndSet(i, null, new AFwS320S0000000_32(i));
        return (AFwS320S0000000_32) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS320S0000000_32(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS320S0000000_32 aFwS320S0000000_32, Object obj, Object obj2) {
        JsWorkerWrapper jsWorkerWrapper = (JsWorkerWrapper) obj;
        if (jsWorkerWrapper != null && jsWorkerWrapper.LIZLLL.compareAndSet(false, true)) {
            jsWorkerWrapper.LJ = true;
            if (jsWorkerWrapper.LJ && jsWorkerWrapper.LIZ.isRunning()) {
                jsWorkerWrapper.LIZLLL();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AFwS320S0000000_32 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r4 = "page_params"
            r3 = 0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r5)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            java.lang.String r2 = X.C416901jj.LIZ(r1, r4)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            java.lang.String r1 = X.C416901jj.LIZ(r0, r4)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            boolean r0 = X.C21208717zB.LIZIZ(r5, r6)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            if (r0 == 0) goto L3e
            if (r2 == 0) goto L26
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L3e
            if (r1 == 0) goto L3a
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L43
            if (r0 == 0) goto L3a
            r0 = 0
            goto L3b
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L3e
        L3a:
            r0 = 1
        L3b:
            if (r0 == 0) goto L3e
            r3 = 1
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS320S0000000_32.invoke$1(kotlin.jvm.internal.AFwS320S0000000_32, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AFwS320S0000000_32 aFwS320S0000000_32, Object obj, Object obj2) {
        C21211017zY.LIZ.getClass();
        return Boolean.valueOf(C21211017zY.LIZLLL((String) obj, (String) obj2));
    }

    public static final Object invoke$3(AFwS320S0000000_32 aFwS320S0000000_32, Object obj, Object obj2) {
        C21211017zY.LIZ.getClass();
        return Boolean.valueOf(C21211017zY.LIZLLL((String) obj, (String) obj2));
    }

    public static final Object invoke$4(AFwS320S0000000_32 aFwS320S0000000_32, Object obj, Object obj2) {
        return Boolean.valueOf(C21208717zB.LIZIZ((String) obj, (String) obj2));
    }
}
