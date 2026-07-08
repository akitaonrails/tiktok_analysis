package com.lynx.jsbridge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.InterfaceC1063790dmz;
import X.InterfaceC1300010jvz;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class LynxEmbeddedModule extends LynxContextModule {
    public WeakReference<InterfaceC1300010jvz> mLynxViewGroupRef;

    private LynxView getLynxViewById(int i) {
        InterfaceC1300010jvz interfaceC1300010jvz;
        WeakReference<InterfaceC1300010jvz> weakReference = this.mLynxViewGroupRef;
        if (weakReference != null && (interfaceC1300010jvz = weakReference.get()) != null) {
            return interfaceC1300010jvz.LJJIJIIJI(i);
        }
        return null;
    }

    public LynxEmbeddedModule(s sVar, Object obj) {
        super(sVar);
        if (obj instanceof InterfaceC1300010jvz) {
            this.mLynxViewGroupRef = new WeakReference<>(obj);
        }
    }

    @InterfaceC1063790dmz
    public void getDataV2(Callback callback, Callback callback2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxEmbeddedModule", "getDataV2", this, new Object[]{callback, callback2}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVzh1UBjEnyS+cLmCTYL", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                callback = (Callback) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback2 = (Callback) obj2;
            }
        }
        LynxView lynxViewLJIILJJIL = this.mLynxContext.LJIILJJIL();
        if (lynxViewLJIILJJIL == null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("message", "Cannot get related lynxView.");
            callback2.invoke(javaOnlyMap);
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(callback, lynxViewLJIILJJIL, 36));
    }

    @InterfaceC1063790dmz
    public void getData(int i, Callback callback, Callback callback2) throws Throwable {
        int iIntValue = i;
        Callback callback3 = callback2;
        Callback callback4 = callback;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxEmbeddedModule", "getData", this, new Object[]{Integer.valueOf(iIntValue), callback4, callback3}, "void", new C0WZW(false, "(ILcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVzh1UBjEnyS+cLmCTYL", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                callback4 = (Callback) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                callback3 = (Callback) obj3;
            }
        }
        LynxView lynxViewById = getLynxViewById(iIntValue);
        if (lynxViewById == null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("message", "Cannot get related lynxView (ID: " + iIntValue + ")");
            callback3.invoke(javaOnlyMap);
            return;
        }
        C1289620jfE.LIZJ(new ARunnableS89S0200000_20(callback4, lynxViewById, 35));
    }

    @InterfaceC1063790dmz
    public void setDataV2(ReadableMap readableMap, Callback callback, Callback callback2) throws Throwable {
        ReadableMap readableMap2 = readableMap;
        Callback callback3 = callback2;
        Callback callback4 = callback;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxEmbeddedModule", "setDataV2", this, new Object[]{readableMap2, callback4, callback3}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVzh1UBjEnyS+cLmCTYL", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap2 = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback4 = (Callback) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                callback3 = (Callback) obj3;
            }
        }
        LynxView lynxViewLJIILJJIL = this.mLynxContext.LJIILJJIL();
        if (lynxViewLJIILJJIL == null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("message", "Cannot get related lynxView.");
            callback3.invoke(javaOnlyMap);
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS53S0300000_20(readableMap2, lynxViewLJIILJJIL, callback4, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    @X.InterfaceC1063790dmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateData(int r17, com.lynx.react.bridge.ReadableMap r18, com.lynx.react.bridge.Callback r19, com.lynx.react.bridge.Callback r20) throws java.lang.Throwable {
        /*
            r16 = this;
            r4 = r17
            X.0WST r8 = new X.0WST
            r8.<init>()
            r0 = 4
            java.lang.Object[] r13 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2 = 0
            r13[r2] = r0
            r3 = 1
            r13[r3] = r18
            r7 = 2
            r13[r7] = r19
            r6 = 3
            r13[r6] = r20
            X.0WZW r15 = new X.0WZW
            X.0WZX r5 = new X.0WZX
            java.lang.String r1 = "dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVzh1UBjEnyS+cLmCTYL"
            r0 = 0
            r5.<init>(r1, r0)
            java.lang.String r0 = "(ILcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/Callback;)V"
            r15.<init>(r2, r0, r5)
            r9 = 300002(0x493e2, float:4.20392E-40)
            java.lang.String r10 = "com/lynx/jsbridge/LynxEmbeddedModule"
            java.lang.String r11 = "updateData"
            java.lang.String r14 = "void"
            r12 = r16
            X.0WSU r1 = r8.LIZIZ(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L3d
            return
        L3d:
            java.lang.Object[] r0 = r1.LIZJ
            if (r0 == 0) goto L90
            r0 = r0[r2]
            if (r0 == 0) goto L4b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
        L4b:
            java.lang.Object[] r0 = r1.LIZJ
            r8 = r0[r3]
            if (r8 == 0) goto L8d
            com.lynx.react.bridge.ReadableMap r8 = (com.lynx.react.bridge.ReadableMap) r8
        L53:
            r7 = r0[r7]
            if (r7 == 0) goto L8a
            com.lynx.react.bridge.Callback r7 = (com.lynx.react.bridge.Callback) r7
        L59:
            r6 = r0[r6]
            if (r6 == 0) goto L94
            com.lynx.react.bridge.Callback r6 = (com.lynx.react.bridge.Callback) r6
        L5f:
            com.lynx.tasm.LynxView r5 = r12.getLynxViewById(r4)
            if (r5 != 0) goto L97
            com.lynx.react.bridge.JavaOnlyMap r5 = new com.lynx.react.bridge.JavaOnlyMap
            r5.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot get related lynxView (ID: "
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "message"
            r5.put(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r5
            r6.invoke(r0)
            return
        L8a:
            r7 = r19
            goto L59
        L8d:
            r8 = r18
            goto L53
        L90:
            r8 = r18
            r7 = r19
        L94:
            r6 = r20
            goto L5f
        L97:
            Y.ARunnableS53S0300000_20 r1 = new Y.ARunnableS53S0300000_20
            r0 = 1
            r1.<init>(r8, r5, r7, r0)
            X.C1289620jfE.LIZJ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxEmbeddedModule.updateData(int, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback, com.lynx.react.bridge.Callback):void");
    }
}
