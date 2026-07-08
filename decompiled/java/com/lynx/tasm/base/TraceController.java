package com.lynx.tasm.base;

import X.C0V1O;
import X.C0VEK;
import X.C0VEL;
import X.C0VEM;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.widget.Toast;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.base.TraceController;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class TraceController {
    public static boolean isTraceEnvInit;
    public static boolean mTracingStarted;
    public static boolean sNativeTracingOnly;
    public C0V1O mBroadcastReceiver;
    public List<C0VEM> mCompleteCallbacks;
    public Context mContext;
    public long mNativeTraceController;
    public String traceFilePath;
    public int tracingSession;

    private native long nativeCreateTraceController();

    private native void nativeStartStartupTracingIfNeeded(long j);

    private native int nativeStartTracing(long j, int i, String[] strArr, String[] strArr2, String str, boolean z, boolean z2);

    private native void nativeStopTracing(long j, int i);

    public void recordClockSyncMarker(String str) {
    }

    public String startTrace() {
        File file = getFile();
        String path = file.getPath();
        startTracing(40960, null, null, path, false, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trace started at: ");
        sbLIZ.append(path);
        C786410Ut5.re(Toast.makeText(this.mContext, C2188811AlT.LIZIZ(sbLIZ), 0));
        return file.getAbsolutePath();
    }

    private String generateTracingFileDir() {
        return C786410Ut5.y2(this.mContext, null).getPath();
    }

    public static boolean isTraceEnvInited() {
        boolean z;
        boolean z2;
        boolean z3 = isTraceEnvInit;
        if (z3) {
            return z3;
        }
        C0VEK c0vekLIZ = C0VEK.LIZ();
        if (c0vekLIZ.LIZ) {
            z2 = c0vekLIZ.LIZ;
        } else {
            if (c0vekLIZ.LIZ) {
                z = c0vekLIZ.LIZ;
            } else {
                try {
                    LoadSoLancet.LIZJ("lynxtrace");
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF("lynxtrace");
                    LoadSoLancet.LJ(jUptimeMillis, "lynxtrace");
                    LoadSoLancet.LIZLLL(jUptimeMillis, "lynxtrace");
                    LoadSoLancet.LIZIZ("lynxtrace");
                    z = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
            }
            c0vekLIZ.LIZ = z;
            TraceEvent.LIZIZ = c0vekLIZ.LIZ;
            z2 = c0vekLIZ.LIZ;
        }
        isTraceEnvInit = z2;
        return z2;
    }

    private void refreshATraceTags() {
        try {
            Field declaredField = Trace.class.getDeclaredField("sEnabledTags");
            declaredField.setAccessible(true);
            declaredField.setLong(null, 134217727L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onTerminate() {
        if (TraceEvent.LIZJ) {
            C786410Ut5.LJJIFFI(this.mContext, this.mBroadcastReceiver);
        }
        this.mContext = null;
    }

    public void startStartupTracingIfNeeded() {
        long j = this.mNativeTraceController;
        if (j != 0) {
            nativeStartStartupTracingIfNeeded(j);
        }
    }

    public void stopTracing() {
        long j = this.mNativeTraceController;
        if (j == 0 || !mTracingStarted) {
            return;
        }
        mTracingStarted = false;
        nativeStopTracing(j, this.tracingSession);
        if (this.traceFilePath.isEmpty()) {
            return;
        }
        onTracingComplete(this.traceFilePath);
        this.traceFilePath = "";
    }

    public TraceController() {
        this.mCompleteCallbacks = new ArrayList();
        this.mNativeTraceController = 0L;
        this.tracingSession = -1;
        try {
            if (isTraceEnvInited()) {
                this.mNativeTraceController = nativeCreateTraceController();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private File getFile() {
        int iMyPid = Process.myPid();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        File fileY2 = C786410Ut5.y2(this.mContext, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx-profile-trace-");
        sbLIZ.append(iMyPid);
        sbLIZ.append("-");
        sbLIZ.append(simpleDateFormat.format(new Date()));
        return new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public String generateTracingFileName() {
        return getFile().getPath();
    }

    public void stopTrace() {
        stopTracing();
        C786410Ut5.re(Toast.makeText(this.mContext, "Trace stopped", 0));
    }

    public static TraceController getInstance() {
        return C0VEL.LIZ;
    }

    public static boolean isNativeTracingOnly() {
        return sNativeTracingOnly;
    }

    public static boolean isTracingStarted() {
        return mTracingStarted;
    }

    public long getNativeTraceController() {
        return this.mNativeTraceController;
    }

    public static class TraceIntentFilter extends IntentFilter {
        public TraceIntentFilter(Context context) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(e3.d);
            sbLIZ.append("LYNX_TRACE_START");
            addAction(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(context.getPackageName());
            sbLIZ2.append(e3.d);
            sbLIZ2.append("LYNX_TRACE_STOP");
            addAction(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    private void setIsTracingStarted(boolean z) {
        mTracingStarted = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0V1O] */
    public void init(Context context) throws Exception {
        this.mContext = context;
        if (TraceEvent.LIZJ) {
            this.mBroadcastReceiver = new BroadcastReceiver() { // from class: X.0V1O
                public final void LIZ(Context context2, Intent intent) {
                    String stringExtra;
                    String strGenerateTracingFileName;
                    if (intent.getAction().endsWith("LYNX_TRACE_START")) {
                        String[] strArrSplit = null;
                        try {
                            stringExtra = intent.getStringExtra("categories");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        try {
                            strGenerateTracingFileName = intent.getStringExtra("file");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            strGenerateTracingFileName = null;
                        }
                        int intExtra = intent.getIntExtra("buffer", 40960);
                        TraceController.sNativeTracingOnly = intent.getBooleanExtra("nativeOnly", false);
                        boolean booleanExtra = intent.getBooleanExtra("enableCompress", false);
                        if (strGenerateTracingFileName == null) {
                            strGenerateTracingFileName = this.LIZ.generateTracingFileName();
                        }
                        TraceController traceController = this.LIZ;
                        if (stringExtra != null) {
                            strArrSplit = stringExtra.split(",");
                        }
                        traceController.startTracing(intExtra, strArrSplit, null, strGenerateTracingFileName, false, booleanExtra);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Trace started at: ");
                        sbLIZ.append(strGenerateTracingFileName);
                        C786410Ut5.re(Toast.makeText(context2, C2188811AlT.LIZIZ(sbLIZ), 0));
                        return;
                    }
                    if (intent.getAction().endsWith("LYNX_TRACE_STOP")) {
                        TraceController.sNativeTracingOnly = false;
                        this.LIZ.stopTracing();
                        C786410Ut5.re(Toast.makeText(context2, "Trace stopped", 0));
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(context2, intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(context2, intent);
                    }
                }
            };
            TraceIntentFilter traceIntentFilter = new TraceIntentFilter(this.mContext);
            if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
                C786410Ut5.LJIJJLI(this.mContext, this.mBroadcastReceiver, traceIntentFilter, 2);
            } else {
                C786410Ut5.LJIJJ(this.mContext, this.mBroadcastReceiver, traceIntentFilter);
            }
        }
    }

    public void onTracingComplete(String str) {
        Iterator<C0VEM> it2 = this.mCompleteCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onComplete();
        }
        this.mCompleteCallbacks.clear();
    }

    public void startTracing(C0VEM c0vem, Map<String, String> map) {
        int i;
        Boolean boolValueOf;
        this.mCompleteCallbacks.add(c0vem);
        String strGenerateTracingFileName = generateTracingFileName();
        Boolean boolValueOf2 = Boolean.FALSE;
        if (map.containsKey("trace_file")) {
            strGenerateTracingFileName = map.get("trace_file");
        }
        if (map.containsKey("buffer_size")) {
            i = CastIntegerProtector.parseInt(map.get("buffer_size"));
        } else {
            i = 40960;
        }
        if (map.containsKey("enable_systrace")) {
            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(map.get("enable_systrace")));
        } else {
            boolValueOf = boolValueOf2;
        }
        if (map.containsKey("enable_compress")) {
            boolValueOf2 = Boolean.valueOf(Boolean.parseBoolean(map.get("enable_compress")));
        }
        startTracing(i, null, null, strGenerateTracingFileName, boolValueOf.booleanValue(), boolValueOf2.booleanValue());
    }

    public void startTracing(C0VEM c0vem, String str) {
        this.mCompleteCallbacks.add(c0vem);
        startTracing(40960, null, null, generateTracingFileName(), false, false);
    }

    public void startTracing(int i, String[] strArr, String[] strArr2, String str, boolean z, boolean z2) {
        String path = str;
        if (mTracingStarted) {
            C786410Ut5.re(Toast.makeText(this.mContext, "Trace already started, please stop it first", 0));
            return;
        }
        if (this.mNativeTraceController == 0) {
            return;
        }
        mTracingStarted = true;
        if (path.isEmpty()) {
            path = getFile().getPath();
        }
        this.traceFilePath = path;
        this.tracingSession = nativeStartTracing(this.mNativeTraceController, i, strArr, strArr2, path, z, z2);
        HashMap map = new HashMap();
        map.put("Version", "3.9.1-rc.25");
        TraceEvent.LJIIL(1L, "Version", map);
    }
}
