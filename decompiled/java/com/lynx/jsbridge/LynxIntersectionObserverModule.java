package com.lynx.jsbridge;

import X.AbstractRunnableC1298320jtG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.InterfaceC1063790dmz;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS89S0200000_20;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxIntersectionObserverModule extends LynxContextModule {
    public LynxIntersectionObserverModule(s sVar) {
        super(sVar);
    }

    @InterfaceC1063790dmz
    public void disconnect(final int i) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "disconnect", this, new Object[]{Integer.valueOf(i)}, "void", new C0WZW(false, "(I)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            i = ((Integer) obj).intValue();
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtB
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1298220jt6 c1298220jt6LJIILIIL = this.LLILLL.mLynxContext.LJIIJJI().LJIILIIL(i);
                if (c1298220jt6LJIILIIL != null) {
                    c1298220jt6LJIILIIL.LJIIL.clear();
                    C1298340jtI c1298340jtI = c1298220jt6LJIILIIL.LIZIZ.get();
                    int i2 = c1298220jt6LJIILIIL.LIZ;
                    c1298340jtI.getClass();
                    C1289620jfE.LIZLLL(new ARunnableS31S0101000_20(i2, c1298340jtI, 15));
                }
            }
        });
    }

    @InterfaceC1063790dmz
    public void relativeToScreen(final int i, final ReadableMap readableMap) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToScreen", this, new Object[]{Integer.valueOf(i), readableMap}, "void", new C0WZW(false, "(ILcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                i = ((Integer) obj).intValue();
            }
            Object obj2 = c0wsuLIZIZ.LIZJ[1];
            if (obj2 != null) {
                readableMap = (ReadableMap) obj2;
            }
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtA
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1298220jt6 c1298220jt6LJIILIIL = this.LLILZ.mLynxContext.LJIIJJI().LJIILIIL(i);
                if (c1298220jt6LJIILIIL != null) {
                    ReadableMap readableMap2 = readableMap;
                    c1298220jt6LJIILIIL.LJ = null;
                    c1298220jt6LJIILIIL.LJIIJJI = true;
                    c1298220jt6LJIILIIL.LJ(readableMap2);
                }
            }
        });
    }

    @InterfaceC1063790dmz
    public void relativeToViewport(final int i, final ReadableMap readableMap) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToViewport", this, new Object[]{Integer.valueOf(i), readableMap}, "void", new C0WZW(false, "(ILcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                i = ((Integer) obj).intValue();
            }
            Object obj2 = c0wsuLIZIZ.LIZJ[1];
            if (obj2 != null) {
                readableMap = (ReadableMap) obj2;
            }
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtD
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1298220jt6 c1298220jt6LJIILIIL = this.LLILZ.mLynxContext.LJIIJJI().LJIILIIL(i);
                if (c1298220jt6LJIILIIL != null) {
                    ReadableMap readableMap2 = readableMap;
                    c1298220jt6LJIILIIL.LJ = null;
                    c1298220jt6LJIILIIL.LJ(readableMap2);
                }
            }
        });
    }

    @InterfaceC1063790dmz
    public void createIntersectionObserver(int i, String str, ReadableMap readableMap) throws Throwable {
        ReadableMap readableMap2 = readableMap;
        String str2 = str;
        final int iIntValue = i;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "createIntersectionObserver", this, new Object[]{Integer.valueOf(iIntValue), str2, readableMap2}, "void", new C0WZW(false, "(ILjava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
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
                str2 = (String) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                readableMap2 = (ReadableMap) obj3;
            }
        }
        final s sVar = this.mLynxContext;
        final String str3 = str2;
        final ReadableMap readableMap3 = readableMap2;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtC
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1298340jtI c1298340jtILJIIJJI = this.LLILZIL.mLynxContext.LJIIJJI();
                if (c1298340jtILJIIJJI.LJIILIIL(iIntValue) == null) {
                    C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(c1298340jtILJIIJJI, new C1298220jt6(c1298340jtILJIIJJI, iIntValue, !str3.isEmpty() ? str3 : "-1", readableMap3), 137));
                }
            }
        });
    }

    @InterfaceC1063790dmz
    public void observe(int i, String str, int i2) throws Throwable {
        final int iIntValue = i2;
        String str2 = str;
        final int iIntValue2 = i;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "observe", this, new Object[]{Integer.valueOf(iIntValue2), str2, Integer.valueOf(iIntValue)}, "void", new C0WZW(false, "(ILjava/lang/String;I)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue2 = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        }
        final s sVar = this.mLynxContext;
        final String str3 = str2;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jt8
            /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
            @Override // X.AbstractRunnableC1298320jtG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r8 = this;
                    com.lynx.jsbridge.LynxIntersectionObserverModule r0 = r8.LLILZIL
                    j27.s r0 = r0.mLynxContext
                    X.0jtI r1 = r0.LJIIJJI()
                    int r0 = r3
                    X.0jt6 r3 = r1.LJIILIIL(r0)
                    if (r3 == 0) goto L21
                    java.lang.String r7 = r4
                    int r4 = r5
                    j27.s r0 = r3.LIZIZ()
                    java.lang.String r6 = "LynxIntersectionObserver"
                    if (r0 != 0) goto L22
                    java.lang.String r0 = "observe failed because context is null"
                    com.lynx.base.log.LynxLog.e(r6, r0)
                L21:
                    return
                L22:
                    java.lang.String r0 = "#"
                    boolean r0 = r7.startsWith(r0)
                    r2 = 1
                    if (r0 == 0) goto L54
                    j27.s r0 = r3.LIZIZ()
                    java.lang.String r5 = r7.substring(r2)
                    com.lynx.tasm.behavior.ui.LynxBaseUI r1 = r3.LIZLLL
                    java.lang.ref.WeakReference<X.0kEs> r0 = r0.LLJJ
                    java.lang.Object r0 = r0.get()
                    if (r0 == 0) goto L43
                    com.lynx.tasm.behavior.ui.LynxBaseUI r5 = X.C1311720kEs.LJIILIIL(r5, r1)
                    if (r5 != 0) goto L6f
                L43:
                    java.lang.String r0 = "Can't find element, finding in element"
                    com.lynx.base.log.LynxLog.w(r6, r0)
                    X.0kEs r0 = r3.LIZLLL()
                    if (r0 != 0) goto L61
                    java.lang.String r0 = "observe failed because UIOwner is null"
                    com.lynx.base.log.LynxLog.e(r6, r0)
                    return
                L54:
                    int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L9d
                    j27.s r0 = r3.LIZIZ()     // Catch: java.lang.NumberFormatException -> L9d
                    com.lynx.tasm.behavior.ui.LynxBaseUI r5 = r0.LJ(r1)     // Catch: java.lang.NumberFormatException -> L9d
                    goto L6d
                L61:
                    X.0kEs r1 = r3.LIZLLL()
                    java.lang.String r0 = r7.substring(r2)
                    com.lynx.tasm.behavior.ui.LynxBaseUI r5 = r1.LJIIL(r0)
                L6d:
                    if (r5 == 0) goto L21
                L6f:
                    r1 = 0
                L70:
                    java.util.ArrayList<X.0jt7> r0 = r3.LJIIL
                    int r0 = r0.size()
                    if (r1 >= r0) goto L87
                    java.util.ArrayList<X.0jt7> r0 = r3.LJIIL
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
                    X.0jt7 r0 = (X.C1298230jt7) r0
                    com.lynx.tasm.behavior.ui.LynxBaseUI r0 = r0.LIZ
                    if (r0 == r5) goto L21
                    int r1 = r1 + 1
                    goto L70
                L87:
                    X.0jt7 r1 = new X.0jt7
                    r1.<init>()
                    r1.LIZ = r5
                    r1.LIZIZ = r4
                    java.util.ArrayList<X.0jt7> r0 = r3.LJIIL
                    r0.add(r1)
                    android.graphics.RectF r0 = r3.LIZJ()
                    r3.LIZ(r1, r0, r2)
                    return
                L9d:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = "observe failed because uid is invalid"
                    com.lynx.base.log.LynxLog.e(r6, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1298240jt8.LIZ():void");
            }
        });
    }

    @InterfaceC1063790dmz
    public void relativeTo(int i, String str, ReadableMap readableMap) throws Throwable {
        ReadableMap readableMap2 = readableMap;
        String str2 = str;
        final int iIntValue = i;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeTo", this, new Object[]{Integer.valueOf(iIntValue), str2, readableMap2}, "void", new C0WZW(false, "(ILjava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVDiw0B1BXyVwMR9Cwvr80rEeJYxoAhR1dz1", null)));
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
                str2 = (String) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                readableMap2 = (ReadableMap) obj3;
            }
        }
        final s sVar = this.mLynxContext;
        final String str3 = str2;
        final ReadableMap readableMap3 = readableMap2;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jt9
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1298220jt6 c1298220jt6LJIILIIL = this.LLILZIL.mLynxContext.LJIIJJI().LJIILIIL(iIntValue);
                if (c1298220jt6LJIILIIL != null) {
                    String str4 = str3;
                    ReadableMap readableMap4 = readableMap3;
                    if (str4.startsWith("#")) {
                        if (c1298220jt6LJIILIIL.LIZIZ() == null) {
                            LynxLog.e("LynxIntersectionObserver", "relativeTo failed because context is null");
                            c1298220jt6LJIILIIL.LJ = null;
                        } else {
                            c1298220jt6LJIILIIL.LJ = c1298220jt6LJIILIIL.LIZIZ().LLJJ.get() != null ? C1311720kEs.LJIILIIL(str4.substring(1), c1298220jt6LJIILIIL.LIZLLL) : null;
                        }
                        if (c1298220jt6LJIILIIL.LJ == null) {
                            LynxLog.w("LynxIntersectionObserver", "Can't find element, finding in element");
                            if (c1298220jt6LJIILIIL.LIZLLL() == null) {
                                LynxLog.e("LynxIntersectionObserver", "relativeTo failed because UIOwner is null");
                            } else {
                                c1298220jt6LJIILIIL.LJ = c1298220jt6LJIILIIL.LIZLLL().LJIIL(str4.substring(1));
                            }
                        }
                        c1298220jt6LJIILIIL.LJ(readableMap4);
                    }
                }
            }
        });
    }
}
