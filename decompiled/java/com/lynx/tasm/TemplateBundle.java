package com.lynx.tasm;

import X.C0X8D;
import X.C1298840ju6;
import X.C1299850jvj;
import X.C1310290kCZ;
import X.C1536090q4l;
import X.C1537670q7J;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxDevToolPool;
import com.lynx.jsbridge.LynxBytecodeCallback;
import com.lynx.react.bridge.ReadableMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class TemplateBundle implements C0X8D {
    public String LL;
    public long LLILLJJLI;
    public Map<String, Object> LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public C1310290kCZ LLIZ = new C1310290kCZ(null);
    public C1299850jvj LLIZLLLIL;
    public LynxDevToolPool LLJ;

    public static native boolean nativeConstructContext(long j, int i);

    public static native boolean nativeGetContainsElementTree(long j);

    public static native Object nativeGetExtraInfo(long j);

    public static native void nativeInitWithOption(long j, int i, boolean z);

    public static native long nativeParseTemplateFromByteArray(byte[] bArr, Object[] objArr, boolean z, long j);

    public static native long nativeParseTemplateFromByteBuffer(ByteBuffer byteBuffer, Object[] objArr, boolean z, long j);

    public static native void nativePostJsCacheGenerationTask(long j, String str, boolean z, LynxBytecodeCallback lynxBytecodeCallback);

    public static native void nativeReleaseBundle(long j);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final Map<String, Object> LIZJ() {
        if (this.LLILLL == null && LynxEnv.inst().isNativeLibraryLoaded() && LJFF()) {
            this.LLILLL = new HashMap();
            Object objNativeGetExtraInfo = nativeGetExtraInfo(this.LLILLJJLI);
            if (objNativeGetExtraInfo instanceof Map) {
                ((HashMap) this.LLILLL).putAll((Map) objNativeGetExtraInfo);
            }
        }
        return this.LLILLL;
    }

    public final boolean LJFF() {
        return this.LLILLJJLI != 0;
    }

    public final void finalize() {
        C1299850jvj c1299850jvj;
        boolean z = LynxEnv.inst().isNativeLibraryLoaded() && this.LLILLJJLI != 0;
        if (z && (c1299850jvj = this.LLIZLLLIL) != null) {
            synchronized (c1299850jvj.LIZJ) {
                try {
                    c1299850jvj.LIZ.clear();
                    ((HashMap) c1299850jvj.LIZJ.LIZ).remove(c1299850jvj.LIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLIZLLLIL = null;
        }
        LynxDevToolPool lynxDevToolPool = this.LLJ;
        if (lynxDevToolPool != null) {
            lynxDevToolPool.LIZ();
            this.LLJ = null;
        }
        if (z) {
            nativeReleaseBundle(this.LLILLJJLI);
            this.LLILLJJLI = 0L;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public static Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C1298840ju6.LIZ.getClass();
            return C1298840ju6.LIZ(byteBuffer);
        }
        return null;
    }

    public static TemplateBundle LIZ(ByteBuffer byteBuffer, C1537670q7J c1537670q7J) throws Throwable {
        String str = c1537670q7J.LIZ;
        if (byteBuffer == null) {
            return null;
        }
        if (!byteBuffer.isDirect()) {
            LynxLog.i("TemplateBundle", "TemplateBundle only supports DirectByteBuffer.");
            TemplateBundle templateBundle = new TemplateBundle();
            templateBundle.LIZLLL(0L, byteBuffer.limit(), str, "TemplateBundle only supports DirectByteBuffer.", null);
            return templateBundle;
        }
        TemplateBundle templateBundle2 = new TemplateBundle();
        LJ(templateBundle2, null, byteBuffer, str, c1537670q7J);
        if (templateBundle2.LJFF()) {
            nativeInitWithOption(templateBundle2.LLILLJJLI, 0, false);
        }
        return templateBundle2;
    }

    public static TemplateBundle LIZIZ(byte[] bArr, C1537670q7J c1537670q7J) throws Throwable {
        if (bArr == null) {
            return null;
        }
        String str = c1537670q7J.LIZ;
        TemplateBundle templateBundle = new TemplateBundle();
        LJ(templateBundle, bArr, null, str, c1537670q7J);
        if (templateBundle.LJFF()) {
            nativeInitWithOption(templateBundle.LLILLJJLI, 0, false);
        }
        return templateBundle;
    }

    public static TemplateBundle fromNative(long j, ReadableMap readableMap) {
        String str;
        if (j == 0) {
            str = "native TemplateBundle doesn't exist";
        } else {
            str = null;
        }
        TemplateBundle templateBundle = new TemplateBundle();
        templateBundle.LIZLLL(j, 0, null, str, readableMap);
        return templateBundle;
    }

    public final void LJI(String str, C1536090q4l c1536090q4l) {
        if (LJFF() && !TextUtils.isEmpty(str)) {
            nativePostJsCacheGenerationTask(this.LLILLJJLI, str, false, c1536090q4l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r16 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:9:0x0017, B:11:0x0023, B:13:0x0032, B:14:0x0038, B:16:0x003c, B:20:0x0065, B:22:0x006f, B:41:0x00b7, B:17:0x0059, B:39:0x00ab), top: B:50:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.lynx.tasm.TemplateBundle LJ(com.lynx.tasm.TemplateBundle r14, byte[] r15, java.nio.ByteBuffer r16, java.lang.String r17, X.C1537670q7J r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateBundle.LJ(com.lynx.tasm.TemplateBundle, byte[], java.nio.ByteBuffer, java.lang.String, X.0q7J):com.lynx.tasm.TemplateBundle");
    }

    public final synchronized void LIZLLL(long j, int i, String str, String str2, ReadableMap readableMap) {
        if (this.LLILZLL) {
            return;
        }
        this.LLILLJJLI = j;
        this.LLILZIL = i;
        this.LL = str;
        this.LLILZ = str2;
        this.LLIZ = new C1310290kCZ(readableMap);
        this.LLILZLL = true;
    }
}
