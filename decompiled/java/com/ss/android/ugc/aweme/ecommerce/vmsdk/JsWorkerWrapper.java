package com.ss.android.ugc.aweme.ecommerce.vmsdk;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C1701450uNT;
import X.C1749760vdO;
import X.C2188811AlT;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import X.InterfaceC21345618gA;
import Y.ARunnableS0S3210000_32;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class JsWorkerWrapper {
    public static final /* synthetic */ int LJFF = 0;
    public final JsWorker LIZ;
    public final String LIZIZ;
    public final CopyOnWriteArrayList<Pair<String, String>> LIZJ = new CopyOnWriteArrayList<>();
    public final AtomicBoolean LIZLLL;
    public volatile boolean LJ;

    public final void LIZLLL() {
        while (!this.LIZJ.isEmpty()) {
            try {
                Pair<String, String> pairRemove = this.LIZJ.remove(0);
                String first = pairRemove.getFirst();
                if (Intrinsics.LJFF(first, "script")) {
                    LIZ(pairRemove.getSecond());
                } else if (Intrinsics.LJFF(first, "msg")) {
                    String second = pairRemove.getSecond();
                    if (this.LJ) {
                        LIZLLL();
                        this.LIZ.postMessage(second);
                    } else {
                        this.LIZJ.add(new Pair<>("msg", second));
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ(String str) {
        C1701450uNT c1701450uNT = C1701450uNT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1701450uNT.LIZ(c1701450uNT, "jsWorkerWrapper", 4);
        this.LIZ.evaluateJavaScript(str);
    }

    public final void LJ(final Function1<? super String, Unit> function1) {
        this.LIZ.setOnErrorCallback(new InterfaceC21345618gA() { // from class: com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper$setOnErrorCallBack$1
            @Override // X.InterfaceC21345618gA
            public final void LIZ(String str) {
                function1.invoke(str);
            }
        });
    }

    public JsWorkerWrapper(JsWorker jsWorker, String str) {
        this.LIZ = jsWorker;
        this.LIZIZ = str;
        C1749760vdO.LIZLLL("js_worker_wrapper_init");
        jsWorker.setOnErrorCallback(new InterfaceC21345618gA() { // from class: com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper.1
            @Override // X.InterfaceC21345618gA
            public final void LIZ(String str2) {
                C1749760vdO.LIZIZ("js_worker_wrapper_init", str2, "", C1749760vdO.LIZ("js_worker_wrapper_init"), "", false);
            }
        });
        this.LIZLLL = new AtomicBoolean(false);
    }

    public final void LIZIZ(String str, String str2) {
        C1701450uNT c1701450uNT = C1701450uNT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1701450uNT.LIZ(c1701450uNT, "jsWorkerWrapper", 4);
        this.LIZ.evaluateJavaScript(str, str2);
    }

    public final Object LIZJ(String str, String str2, String str3, boolean z, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        int iHashCode = str2.hashCode();
        if (iHashCode != -907987551) {
            if (iHashCode != 96891546) {
                this.LIZ.postOnJSRunner(new ARunnableS0S3210000_32(z, this, str, str3, str2, c23260099m, 1));
            } else {
                this.LIZ.postOnJSRunner(new ARunnableS0S3210000_32(z, this, str, str3, str2, c23260099m, 1));
            }
        } else if (str2.equals("schema")) {
            this.LIZ.postOnJSRunner(new ARunnableS0S3210000_32(z, this, str, str3, str2, c23260099m, 0));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
