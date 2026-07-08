package com.lynx.tasm;

import X.C08JA;
import X.C1298840ju6;
import X.C1301610jyZ;
import X.C1310660kDA;
import X.C2188811AlT;
import X.EnumC1310650kD9;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS120S0100000_20;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class TemplateData {
    public volatile long LIZ;
    public volatile Map<String, Object> LIZIZ;
    public String LIZJ;
    public final AtomicBoolean LIZLLL;
    public volatile boolean LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public final AtomicBoolean LJII;
    public WeakReference<s> LJIIIIZZ;
    public final Object LJIIIZ;
    public final Object LJIIJ;
    public final Object LJIIJJI;
    public final Object LJIIL;
    public final List<UpdateAction> LJIILIIL;

    public static native long nativeClone(long j);

    public static native long nativeCreateObject();

    public static native long nativeCreateTemplateData(long j, boolean z, String str, Object obj);

    public static native Object nativeGetData(long j);

    public static native void nativeMergeTemplateData(long j, long j2);

    public static native long nativeParseData(ByteBuffer byteBuffer, int i);

    public static native long nativeParseStringData(String str);

    public static native void nativeReleaseData(long j);

    public static native void nativeReleaseTemplateData(long j);

    public static native void nativeRemoveData(long j, String str);

    public static native long nativeShallowCopy(long j);

    public static native void nativeUpdateData(long j, ByteBuffer byteBuffer, int i);

    public static class UpdateAction {
        public EnumC1310650kD9 LIZ;
        public ByteBuffer LIZIZ;
        public String LIZJ;
        public long LIZLLL;

        public final void finalize() throws Throwable {
            super.finalize();
            long j = this.LIZLLL;
            if (j != 0) {
                TemplateData.nativeReleaseData(j);
            }
        }

        public long getNativeData() {
            return this.LIZLLL;
        }
    }

    public final void LJFF() {
        if (this.LIZIZ == null) {
            synchronized (this.LJIIJ) {
                try {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = this.LIZLLL.get() ? new C08JA<>() : new HashMap<>();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateData.LJIIIZ():long");
    }

    public final List<UpdateAction> LJIIL() {
        ArrayList arrayList;
        synchronized (this.LJIIIZ) {
            try {
                arrayList = new ArrayList(this.LJIILIIL);
                this.LJIILIIL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LJIILL() {
        s sVar;
        WeakReference<s> weakReference = this.LJIIIIZZ;
        if (weakReference == null || (sVar = weakReference.get()) == null) {
            LJIIZILJ();
            return;
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 52);
        C1310660kDA c1310660kDALJIILL = sVar.LJIILL();
        if (c1310660kDALJIILL != null) {
            c1310660kDALJIILL.runOnTasmThread(aRunnableS120S0100000_20);
        }
    }

    public final void LJIILLIIL() {
        if (this.LJFF == 0) {
            return;
        }
        synchronized (this.LJIIJJI) {
            try {
                if (LIZJ() && this.LJFF != 0) {
                    nativeReleaseData(this.LJFF);
                    this.LJFF = 0L;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIZILJ() {
        if (this.LIZ == 0) {
            return;
        }
        synchronized (this.LJIIL) {
            try {
                if (LIZJ()) {
                    if (this.LIZ != 0) {
                        nativeReleaseData(this.LIZ);
                        this.LIZ = 0L;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final TemplateData LJIJ() {
        TraceEvent.LIZLLL("TemplateData.ShallowClone");
        if (!LIZJ()) {
            LynxLog.e("LynxTemplateData", "shallowClone failed since env not ready!");
            TraceEvent.LJII("TemplateData.ShallowClone");
            return new TemplateData();
        }
        LJI();
        TemplateData templateData = new TemplateData();
        if (this.LIZ != 0) {
            templateData.LIZ = nativeShallowCopy(this.LIZ);
        }
        templateData.LIZJ = this.LIZJ;
        templateData.LJ = this.LJ;
        templateData.LIZLLL.set(this.LIZLLL.get());
        templateData.LIZIZ(LIZLLL(true));
        TraceEvent.LJII("TemplateData.ShallowClone");
        return templateData;
    }

    public TemplateData getTemplateDataForJSThread() {
        TemplateData templateData = new TemplateData();
        templateData.LJI = true;
        synchronized (this.LJIIJJI) {
            try {
                if (this.LJFF != 0) {
                    templateData.LJFF = nativeClone(this.LJFF);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        templateData.LIZIZ(LIZLLL(false));
        return templateData;
    }

    public TemplateData() {
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = false;
        this.LJI = true;
        this.LJII = new AtomicBoolean(false);
        this.LJIIIZ = new Object();
        this.LJIIJ = new Object();
        this.LJIIJJI = new Object();
        this.LJIIL = new Object();
        this.LJIILIIL = new ArrayList();
        LynxEnv.inst();
        this.LIZJ = null;
    }

    public static boolean LIZJ() {
        return LynxEnv.inst().isNativeLibraryLoaded();
    }

    private void consumeUpdateActions() {
        C1301610jyZ.LIZ().execute(new ARunnableS120S0100000_20(this, 53));
    }

    public final TemplateData LJ() {
        if (!LIZJ()) {
            LynxLog.e("LynxTemplateData", "deepClone failed since env not ready!");
            return new TemplateData();
        }
        LJI();
        TemplateData templateData = new TemplateData();
        if (this.LIZ != 0) {
            templateData.LIZ = nativeClone(this.LIZ);
        }
        templateData.LIZJ = this.LIZJ;
        templateData.LJ = this.LJ;
        templateData.LIZLLL.set(this.LIZLLL.get());
        templateData.LIZIZ(LIZLLL(true));
        return templateData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r7 = this;
            boolean r0 = LIZJ()
            if (r0 != 0) goto Le
            java.lang.String r1 = "LynxTemplateData"
            java.lang.String r0 = "Env not ready!"
            com.lynx.base.log.LynxLog.w(r1, r0)
            return
        Le:
            java.lang.Object r4 = r7.LJIIJ
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L9f
            r5 = 0
            if (r0 == 0) goto L87
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L87
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L9f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L9f
            r0.clear()     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9f
            X.0ju6 r0 = X.C1298840ju6.LIZ
            r0.getClass()
            java.nio.ByteBuffer r4 = X.C1298840ju6.LIZIZ(r1)
            if (r4 == 0) goto L86
            int r0 = r4.position()
            if (r0 <= 0) goto L86
            java.lang.String r2 = "LynxTemplateData"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "flush data."
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.lynx.base.log.LynxLog.i(r2, r0)
            com.lynx.tasm.TemplateData$UpdateAction r1 = new com.lynx.tasm.TemplateData$UpdateAction
            r1.<init>()
            X.0kD9 r0 = X.EnumC1310650kD9.BYTE_BUFFER
            r1.LIZ = r0
            r1.LIZIZ = r4
            r7.LIZ(r1)
            java.lang.Object r3 = r7.LJIIL
            monitor-enter(r3)
            long r1 = r7.LIZ     // Catch: java.lang.Throwable -> L80
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L75
            int r0 = r4.position()     // Catch: java.lang.Throwable -> L80
            long r0 = nativeParseData(r4, r0)     // Catch: java.lang.Throwable -> L80
            r7.LIZ = r0     // Catch: java.lang.Throwable -> L80
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            goto L7f
        L75:
            long r1 = r7.LIZ     // Catch: java.lang.Throwable -> L80
            int r0 = r4.position()     // Catch: java.lang.Throwable -> L80
            nativeUpdateData(r1, r4, r0)     // Catch: java.lang.Throwable -> L80
            goto L73
        L7f:
            return
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            throw r0
        L86:
            return
        L87:
            java.lang.Object r3 = r7.LJIIL     // Catch: java.lang.Throwable -> L9f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L9f
            long r1 = r7.LIZ     // Catch: java.lang.Throwable -> L99
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r0 = nativeCreateObject()     // Catch: java.lang.Throwable -> L99
            r7.LIZ = r0     // Catch: java.lang.Throwable -> L99
        L96:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9f
            return
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateData.LJI():void");
    }

    public final Map<Object, Object> LJIJI() {
        if (!LIZJ()) {
            LynxLog.w("LynxTemplateData", "toMap failed since env not ready.");
            return null;
        }
        LJI();
        if (this.LIZ == 0) {
            LynxLog.w("LynxTemplateData", "toMap failed since mNativeData == 0.");
            return null;
        }
        Object objNativeGetData = nativeGetData(this.LIZ);
        HashMap map = new HashMap();
        if (objNativeGetData instanceof Map) {
            map.putAll((Map) objNativeGetData);
        }
        return map;
    }

    public final void finalize() throws Throwable {
        s sVar;
        LJIILL();
        WeakReference<s> weakReference = this.LJIIIIZZ;
        if (weakReference == null || (sVar = weakReference.get()) == null) {
            LJIILLIIL();
        } else {
            ARunnableS109S0100000_9 aRunnableS109S0100000_9 = new ARunnableS109S0100000_9(this, 24);
            C1310660kDA c1310660kDALJIILL = sVar.LJIILL();
            if (c1310660kDALJIILL != null) {
                c1310660kDALJIILL.runOnTasmThread(aRunnableS109S0100000_9);
            }
        }
        super.finalize();
    }

    public long getDataForJSThread() {
        return LJIIIZ();
    }

    public long getNativeTemplateData() {
        return this.LIZ;
    }

    public TemplateData(Map<String, Object> map) {
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = false;
        this.LJI = true;
        this.LJII = new AtomicBoolean(false);
        this.LJIIIZ = new Object();
        this.LJIIJ = new Object();
        this.LJIIJJI = new Object();
        this.LJIIL = new Object();
        this.LJIILIIL = new ArrayList();
        if (map != null && !map.isEmpty()) {
            LynxEnv.inst();
            if (!LIZJ()) {
                LJIILJJIL(map);
                return;
            }
            C1298840ju6.LIZ.getClass();
            ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(map);
            if (byteBufferLIZIZ != null && byteBufferLIZIZ.position() > 0) {
                this.LIZ = nativeParseData(byteBufferLIZIZ, byteBufferLIZIZ.position());
                this.LIZJ = null;
                UpdateAction updateAction = new UpdateAction();
                updateAction.LIZ = EnumC1310650kD9.BYTE_BUFFER;
                updateAction.LIZIZ = byteBufferLIZIZ;
                LIZ(updateAction);
            }
        }
    }

    public static TemplateData LJII(Map<String, Object> map) {
        TraceEvent.LIZIZ("TemplateData.FromMap");
        TemplateData templateData = new TemplateData(map);
        TraceEvent.LJII("TemplateData.FromMap");
        return templateData;
    }

    public static TemplateData LJIIIIZZ(String str) {
        TraceEvent.LIZIZ("TemplateData.FromString");
        TemplateData templateData = new TemplateData(str);
        TraceEvent.LJII("TemplateData.FromString");
        return templateData;
    }

    public static List<Object> LJIIJ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object objLJIIJ = jSONArray.get(i);
                if (objLJIIJ instanceof JSONObject) {
                    objLJIIJ = LJIIJJI((JSONObject) objLJIIJ);
                } else if (objLJIIJ instanceof JSONArray) {
                    objLJIIJ = LJIIJ((JSONArray) objLJIIJ);
                }
                arrayList.add(objLJIIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to parse JSONArray at index ");
                sbLIZ.append(i);
                sbLIZ.append(": ");
                sbLIZ.append(th.getMessage());
                LynxLog.e("LynxTemplateData", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> LJIIJJI(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objLJIIJ = jSONObject.get(next);
                if (objLJIIJ instanceof JSONObject) {
                    objLJIIJ = LJIIJJI((JSONObject) objLJIIJ);
                } else if (objLJIIJ instanceof JSONArray) {
                    objLJIIJ = LJIIJ((JSONArray) objLJIIJ);
                }
                map.put(next, objLJIIJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse JSONObject: ");
            sbLIZ.append(th.getMessage());
            LynxLog.e("LynxTemplateData", C2188811AlT.LIZIZ(sbLIZ));
        }
        return map;
    }

    public static Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C1298840ju6.LIZ.getClass();
            return C1298840ju6.LIZ(byteBuffer);
        }
        return null;
    }

    public final void LIZ(UpdateAction updateAction) {
        if (!this.LJI) {
            return;
        }
        synchronized (this.LJIIIZ) {
            try {
                ((ArrayList) this.LJIILIIL).add(updateAction);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(List<UpdateAction> list) {
        if (list == null || !this.LJI) {
            return;
        }
        synchronized (this.LJIIIZ) {
            try {
                this.LJIILIIL.addAll(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List<UpdateAction> LIZLLL(boolean z) {
        if (!this.LJI) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.LJIIJJI) {
            try {
                if (this.LJFF != 0) {
                    long jNativeShallowCopy = nativeShallowCopy(this.LJFF);
                    UpdateAction updateAction = new UpdateAction();
                    updateAction.LIZ = EnumC1310650kD9.NATIVE_DATA;
                    updateAction.LIZLLL = jNativeShallowCopy;
                    arrayList.add(updateAction);
                }
            } finally {
            }
        }
        synchronized (this.LJIIIZ) {
            try {
                arrayList.addAll(this.LJIILIIL);
            } finally {
            }
        }
        if (z) {
            consumeUpdateActions();
        }
        return arrayList;
    }

    public final void LJIILJJIL(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            LJFF();
            this.LIZIZ.putAll(map);
        }
    }

    public final void LJIJJ(Map<String, Object> map) {
        if (this.LJ) {
            LynxLog.e("LynxTemplateData", "can not update readOnly TemplateData");
            return;
        }
        if (this.LJII.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateData to consumed TemplateData, diff:");
            sbLIZ.append(map.keySet());
            LynxLog.w("LynxTemplateData", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJIILJJIL(map);
    }

    public final void LJIJJLI(TemplateData templateData) {
        if (templateData == null) {
            return;
        }
        if (this == templateData) {
            LynxLog.w("LynxTemplateData", "can not update TemplateData with self");
            return;
        }
        if (this.LJ) {
            LynxLog.w("LynxTemplateData", "can not update readOnly TemplateData");
            return;
        }
        if (!LIZJ()) {
            LynxLog.w("LynxTemplateData", "updateWithTemplateData failed since env not ready.");
            return;
        }
        if (this.LJII.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateWithTemplateData to consumed TemplateData, this:");
            sbLIZ.append(this);
            sbLIZ.append(",diff:");
            sbLIZ.append(templateData);
            LynxLog.w("LynxTemplateData", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJI();
        templateData.LJI();
        LIZIZ(templateData.LIZLLL(true));
        if (templateData.LIZ != 0) {
            nativeMergeTemplateData(this.LIZ, templateData.LIZ);
        }
    }

    public TemplateData(String str) {
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = false;
        this.LJI = true;
        this.LJII = new AtomicBoolean(false);
        this.LJIIIZ = new Object();
        this.LJIIJ = new Object();
        this.LJIIJJI = new Object();
        this.LJIIL = new Object();
        this.LJIILIIL = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LynxEnv.inst();
        if (!LIZJ()) {
            try {
                LJIILJJIL(LJIIJJI(new JSONObject(str)));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        this.LIZ = nativeParseStringData(str);
        this.LIZJ = null;
        UpdateAction updateAction = new UpdateAction();
        updateAction.LIZ = EnumC1310650kD9.STRING_DATA;
        updateAction.LIZJ = str;
        LIZ(updateAction);
    }

    public TemplateData(long j) {
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = false;
        this.LJI = true;
        this.LJII = new AtomicBoolean(false);
        this.LJIIIZ = new Object();
        this.LJIIJ = new Object();
        this.LJIIJJI = new Object();
        this.LJIIL = new Object();
        this.LJIILIIL = new ArrayList();
        LynxEnv.inst();
        this.LIZ = j;
        this.LJ = true;
        this.LIZJ = null;
        if (this.LIZ != 0) {
            long jNativeShallowCopy = nativeShallowCopy(this.LIZ);
            UpdateAction updateAction = new UpdateAction();
            updateAction.LIZ = EnumC1310650kD9.NATIVE_DATA;
            updateAction.LIZLLL = jNativeShallowCopy;
            LIZ(updateAction);
        }
    }

    public final void LJIILIIL(String str, Object obj) {
        if (this.LJ) {
            LynxLog.w("LynxTemplateData", "can not update readOnly TemplateData");
            return;
        }
        if (this.LJII.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("put data to consumed TemplateData,key:");
            sbLIZ.append(str);
            LynxLog.w("LynxTemplateData", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJFF();
        this.LIZIZ.put(str, obj);
    }
}
