package com.bytedance.im.core.model;

import X.C0YDF;
import X.C0YEM;
import X.C786410Ut5;
import X.C869590Y9l;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleConReadInfoHelper {
    public final C0YEM LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public List<? extends C869590Y9l> LIZLLL = new ArrayList();
    public final long LJ = 3000;
    public final C0YDF LJFF;
    public final SingleConReadInfoHelper$mainHandler$1 LJI;

    public final void LIZ() {
        if (this.LIZ.LJIIIZ().LJJIZ && this.LIZJ) {
            this.LJFF.LLIILZL("message_model", Collections.singletonList(this.LIZIZ));
        }
    }

    public final void LIZIZ() {
        if (this.LIZ.LJIIIZ().LJJIZ && this.LIZJ && !hasMessages(1)) {
            C786410Ut5.LJLJJI(1, this.LJ, this.LJI);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.im.core.model.SingleConReadInfoHelper$mainHandler$1] */
    public SingleConReadInfoHelper(C0YEM c0yem, String str, boolean z) {
        this.LIZ = c0yem;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LJFF = c0yem.LJIIZILJ().LIZ().LIZIZ();
        LIZ();
        final Looper mainLooper = Looper.getMainLooper();
        this.LJI = new BPEAHandler(mainLooper) { // from class: com.bytedance.im.core.model.SingleConReadInfoHelper$mainHandler$1
            /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleMessage(android.os.Message r11) {
                /*
                    r10 = this;
                    java.lang.String r9 = "SingleConReadInfoHelper@6e19.mainHandler$1"
                    X.C1C7U.LIZ(r9)
                    int r0 = r11.what
                    r4 = 1
                    if (r0 != r4) goto L8f
                    com.bytedance.im.core.model.SingleConReadInfoHelper r8 = r10.LL
                    java.util.List<? extends X.0Y9l> r0 = r8.LIZLLL
                    java.util.Iterator r7 = r0.iterator()
                    r5 = 0
                L14:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L39
                    java.lang.Object r3 = r7.next()
                    X.0Y9l r3 = (X.C869590Y9l) r3
                    X.0YEM r0 = r8.LIZ
                    long r0 = r0.getUid()
                    boolean r0 = r3.isSelf(r0)
                    if (r0 == 0) goto L14
                    long r1 = r3.getIndex()
                    int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L14
                    long r5 = r3.getIndex()
                    goto L14
                L39:
                    X.0YDF r1 = r8.LJFF
                    java.lang.String r0 = r8.LIZIZ
                    java.util.List r0 = r1.LLL(r0)
                    if (r0 == 0) goto L59
                    java.util.Iterator r3 = r0.iterator()
                L47:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L93
                    java.lang.Object r0 = r3.next()
                    X.0YCo r0 = (X.C870400YCo) r0
                    long r1 = r0.LLILZ
                    int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r0 >= 0) goto L47
                L59:
                    r3 = 1
                L5a:
                    com.bytedance.im.core.model.SingleConReadInfoHelper r0 = r10.LL
                    X.0YEM r0 = r0.LIZ
                    X.0Y6i r2 = r0.LIZLLL()
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = " ConvReadInfoHelperSingleConReadInfoHelper cid = "
                    r1.append(r0)
                    com.bytedance.im.core.model.SingleConReadInfoHelper r0 = r10.LL
                    java.lang.String r0 = r0.LIZIZ
                    r1.append(r0)
                    java.lang.String r0 = " shouldQueryMsg = "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C868780Y6i.LIZLLL(r2, r0)
                    if (r3 == 0) goto L88
                    com.bytedance.im.core.model.SingleConReadInfoHelper r0 = r10.LL
                    r0.LIZ()
                L88:
                    com.bytedance.im.core.model.SingleConReadInfoHelper r0 = r10.LL
                    long r0 = r0.LJ
                    r10.sendEmptyMessageDelayed(r4, r0)
                L8f:
                    X.C1C7U.LIZIZ(r9)
                    return
                L93:
                    r3 = 0
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.model.SingleConReadInfoHelper$mainHandler$1.handleMessage(android.os.Message):void");
            }
        };
    }
}
