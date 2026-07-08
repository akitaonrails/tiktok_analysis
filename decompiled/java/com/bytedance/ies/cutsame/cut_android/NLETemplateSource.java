package com.bytedance.ies.cutsame.cut_android;

import X.C01GW;
import X.C098200Yq;
import X.C1428940nHw;
import X.C1428960nHy;
import X.C1428980nI0;
import X.C14LJ;
import X.C189200o6;
import X.C1C7U;
import X.C2169008ee;
import X.C2188811AlT;
import X.C2268941DrQ;
import X.C452501pT;
import X.C559870LxZ;
import X.C786410Ut5;
import X.EnumC1428950nHx;
import X.InterfaceC559900Lxc;
import Y.AObjectS396S0100000_22;
import Y.ARunnableS22S0100100_22;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final class NLETemplateSource {
    public static final Companion LJIIIIZZ = new Companion();
    public final CutSource LIZ;
    public long LIZIZ;
    public final HashMap<EnumC1428950nHx, ResourceFetcher> LIZJ;
    public final C01GW LIZLLL;
    public final List<NLEPrepareListener> LJ;
    public final C01GW LJFF;
    public ICutReporter LJI;
    public int LJII;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Companion {
        public final native String getMattingBlendUrs();

        public final native String getMattingModelUrs();

        public final native void initNLEModelDownloader(long j, long j2);
    }

    private final native long nativeClone_nle(long j);

    private final native long nativeCreate_nle(String str, String str2, String str3, String str4);

    private final native void nativePrepare_nle(long j, int i);

    private final native void nativeRelease_nle(long j);

    private final native void nativeSetDownloaderParams_nle(long j, long j2);

    private final native void nativeSetDownloader_nle(long j, long j2);

    private final native void nativeSetEnableAdaptTemplate(long j, boolean z);

    private final native void nativeSetEnableAsyncRender(long j, boolean z);

    private final native void nativeSetEnableCustomDownloader(long j, boolean z);

    private final native void nativeSetEnableSwing(long j, boolean z);

    private final native void nativeSetLokiWorkSpaceType(long j, int i);

    private final native void nativeSetPrepareListener_nle(long j, NLEPrepareListener nLEPrepareListener);

    private final native void nativeSetReporter(long j, ICutReporter iCutReporter);

    private final native void nativeSetResourceFetcher_nle(long j, ResourceFetcher resourceFetcher);

    private final native void nativeSetWuZhuiDownloader(long j, IWuZhuiDownloader iWuZhuiDownloader);

    public final void LJ() {
        nativeSetEnableAdaptTemplate(this.LIZIZ, true);
    }

    public final void LJI() {
        nativeSetEnableCustomDownloader(this.LIZIZ, true);
    }

    static {
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, true, false, false, 6, null);
    }

    public final void LIZJ() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZJ("NLETemplateSource", "prepareAsync");
        long j = this.LIZIZ;
        if (j == 0) {
            return;
        }
        new BPEAThread(new ARunnableS22S0100100_22(this, nativeClone_nle(j), 3)).start();
    }

    public final void LIZLLL() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseObject : ");
        sbLIZ.append(this.LIZIZ);
        C559870LxZ.LIZJ("NLETemplateSource", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.clear();
        long j = this.LIZIZ;
        if (j != 0) {
            nativeRelease_nle(j);
            this.LIZIZ = 0L;
        }
    }

    public final void finalize() {
        try {
            if (this.LIZIZ != 0) {
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                C559870LxZ.LJFF("NLETemplateSource", "You forget to release TemplateSource !!");
                LIZLLL();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public NLETemplateSource() {
        this.LIZJ = new HashMap<>();
        this.LIZLLL = C452501pT.LIZIZ(new AObjectS396S0100000_22(this, 11));
        this.LJ = new ArrayList();
        this.LJFF = C452501pT.LIZIZ(new AObjectS396S0100000_22(this, 12));
    }

    public final void LIZ(NLEPrepareListener nLEPrepareListener) {
        if (this.LIZIZ == 0) {
            return;
        }
        ((ArrayList) this.LJ).add(nLEPrepareListener);
    }

    public final void LJFF(boolean z) {
        nativeSetEnableAsyncRender(this.LIZIZ, z);
    }

    public final void LJII(Integer num) {
        if (num == null) {
            return;
        }
        nativeSetLokiWorkSpaceType(this.LIZIZ, num.intValue());
    }

    public final void LJIIIIZZ(NetworkFileFetcher networkFileFetcher) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("NLETemplateSource", "setNetworkFileFetcher");
        if (this.LIZIZ == 0) {
            return;
        }
        this.LIZJ.put(EnumC1428950nHx.NORMAL, networkFileFetcher);
    }

    public final void LJIIIZ(ICutReporter iCutReporter) {
        this.LJI = iCutReporter;
        nativeSetReporter(this.LIZIZ, iCutReporter);
    }

    public final void LJIIJ(NLEModelDownloader nLEModelDownloader) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("NLETemplateSource", "setNetworkFileFetcher");
        long j = this.LIZIZ;
        if (j == 0) {
            return;
        }
        nativeSetDownloader_nle(j, C14LJ.LIZLLL(nLEModelDownloader));
    }

    public final void LJIIJJI(IWuZhuiDownloader iWuZhuiDownloader) {
        nativeSetWuZhuiDownloader(this.LIZIZ, iWuZhuiDownloader);
    }

    public static void LIZIZ(NLETemplateSource nLETemplateSource, long j) {
        C1C7U.LIZ("NLETemplateSource@28ae.prepareAsync$1L");
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            nLETemplateSource.nativePrepare_nle(j, 0);
            ICutReporter iCutReporter = nLETemplateSource.LJI;
            if (iCutReporter != null) {
                iCutReporter.report(1, String.valueOf(nLETemplateSource.LJII), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis), nLETemplateSource.LIZ.type.getDesc(), nLETemplateSource.LIZ.value, null, null);
            }
            nLETemplateSource.nativeRelease_nle(j);
            C1C7U.LIZIZ("NLETemplateSource@28ae.prepareAsync$1L");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            nLETemplateSource.nativeRelease_nle(j);
            throw th;
        }
    }

    public NLETemplateSource(Context context, CutSource cutSource, String str) {
        String strLIZIZ;
        String strLIZIZ2;
        this();
        C786410Ut5.N3(context);
        this.LIZ = cutSource;
        C2169008ee.LIZJ = C786410Ut5.N3(context);
        String str2 = cutSource.value;
        if (!TextUtils.isEmpty(str2)) {
            int i = C1428960nHy.LIZ[cutSource.type.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        strLIZIZ2 = "";
                    } else {
                        throw new RuntimeException("unknown CutSourceType");
                    }
                } else {
                    strLIZIZ2 = cutSource.value;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C2268941DrQ.LIZIZ);
                sbLIZ.append('/');
                try {
                    strLIZIZ = C786410Ut5.j4("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, MessageDigest.getInstance("MD5").digest(cutSource.value.getBytes(Charsets.UTF_8)))}, 1));
                } catch (NoSuchAlgorithmException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TS_");
                    sbLIZ2.append(System.currentTimeMillis());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                sbLIZ.append(strLIZIZ);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("constructor : source=");
            sbLIZ3.append(cutSource);
            sbLIZ3.append(", initFolder=");
            sbLIZ3.append(strLIZIZ2);
            C559870LxZ.LIZ("NLETemplateSource", C2188811AlT.LIZIZ(sbLIZ3));
            long jNativeCreate_nle = nativeCreate_nle(strLIZIZ2, this.LIZ.type.getDesc(), str2, str == null ? "" : str);
            this.LIZIZ = jNativeCreate_nle;
            nativeSetResourceFetcher_nle(jNativeCreate_nle, (C1428980nI0) this.LIZLLL.getValue());
            nativeSetPrepareListener_nle(this.LIZIZ, (C1428940nHw) this.LJFF.getValue());
            return;
        }
        throw new NullPointerException("source is empty");
    }
}
