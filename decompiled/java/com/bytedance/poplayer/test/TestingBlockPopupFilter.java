package com.bytedance.poplayer.test;

import X.C20655415s8;
import X.InterfaceC20655315s7;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes32.dex */
public final class TestingBlockPopupFilter implements InterfaceC20655315s7 {
    public static final C20655415s8 Companion = new Object() { // from class: X.15s8
    };
    public final InterfaceC20655315s7 delegate;
    public final AtomicBoolean isBlocking = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<String> exemptKeys = new CopyOnWriteArrayList<>();

    public final CopyOnWriteArrayList<String> getExemptKeys() {
        return this.exemptKeys;
    }

    public final AtomicBoolean isBlocking() {
        return this.isBlocking;
    }

    public TestingBlockPopupFilter(InterfaceC20655315s7 interfaceC20655315s7) {
        this.delegate = interfaceC20655315s7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // X.InterfaceC20655315s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean filterTask(X.C688120Qyw r6, X.AbstractC20656215sG r7, java.lang.String r8, X.InterfaceC20658115sZ r9) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isBlocking
            boolean r0 = r0.get()
            r4 = 0
            if (r0 == 0) goto L42
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<X.15qs> r0 = X.InterfaceC20647615qs.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            X.15qs r0 = (X.InterfaceC20647615qs) r0
            if (r0 == 0) goto L4d
            java.lang.String r3 = r0.value()
        L1b:
            java.lang.String r1 = r7.elementLabel
            int r0 = r1.length()
            r2 = 1
            if (r0 != 0) goto L4b
            if (r3 == 0) goto L4f
        L26:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = r5.exemptKeys
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "exempt popup ["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "], allow show."
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L42:
            X.15s7 r0 = r5.delegate
            if (r0 == 0) goto L4a
            boolean r4 = r0.filterTask(r6, r7, r8, r9)
        L4a:
            return r4
        L4b:
            r3 = r1
            goto L26
        L4d:
            r3 = 0
            goto L1b
        L4f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "blocked popup ["
            r1.append(r0)
            if (r3 != 0) goto L5e
            java.lang.String r3 = r7.getId()
        L5e:
            r1.append(r3)
            java.lang.String r0 = "]."
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.poplayer.test.TestingBlockPopupFilter.filterTask(X.0Qyw, X.15sG, java.lang.String, X.15sZ):boolean");
    }
}
