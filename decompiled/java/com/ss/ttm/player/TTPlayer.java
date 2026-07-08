package com.ss.ttm.player;

import X.C1285320jYI;
import X.C1285330jYJ;
import X.C1286610jaN;
import X.C1467830oIf;
import X.C1470940oNg;
import X.C1470950oNh;
import X.C1470960oNi;
import X.C1470970oNj;
import X.C1471020oNo;
import X.C1471030oNp;
import X.C1471100oNw;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467440oI2;
import X.InterfaceC1470980oNk;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public class TTPlayer {
    public static int LJIIJ;
    public static int[] LJIIJJI;
    public static String LJIIL;
    public static final String LJIILIIL;
    public long LIZ;
    public C1470940oNg LIZIZ;
    public InterfaceC1470980oNk LIZJ;
    public final Context LIZLLL;
    public InterfaceC1467440oI2 LJ;
    public int LJFF = -1;
    public int LJI = -1;
    public final C1470950oNh LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long mMediaDataSource;

    public static final native void _close(long j);

    private final native long _create(Context context, int i, int i2, int i3, String str);

    public static final native long _createDefaultConfig();

    public static final native String _getAppPath();

    public static final native int _getCurrentPosition(long j);

    public static final native long _getDemuxerFactory(int i);

    public static final native double _getDoubleValue(long j, int i, double d);

    public static final native int _getDuration(long j);

    public static final native float _getFloatValue(long j, int i, float f);

    public static final native int _getIntValue(long j, int i, int i2);

    public static final native Object _getJObjectValue(long j, int i);

    public static final native long _getLongValue(long j, int i, long j2);

    public static final native Object _getPlayerMetrics(long j);

    public static final native Object[] _getStreamInfo(long j);

    public static final native String _getStringValue(long j, int i);

    public static final native String _getSubtitleContent(long j, int i);

    public static final native int _getVideoHeight(long j);

    public static final native int _getVideoWidth(long j);

    public static final native void _initCpuManager();

    public static final native int _isLooping(long j);

    public static final native int _isPlaying(long j);

    public static final native void _mouseEvent(long j, int i, int i2, int i3);

    public static final native void _notifyReparent(long j, int i, int i2, int i3, boolean z);

    public static final native int _operateReparent(long j, SurfaceControl surfaceControl, int i, int i2, boolean z);

    public static final native int _pause(long j);

    public static final native int _prepare(long j);

    public static final native void _prevClose(long j);

    public static final native int _registerNativeMdl(long j);

    public static final native void _registerPlayerCoreConfig();

    public static final native void _registerPlayerInfo();

    public static final native void _release(long j);

    public static final native int _reset(long j);

    public static final native void _rotateCamera(long j, float f, float f2);

    public static final native int _seek(long j, int i);

    public static final native int _seek2(long j, int i, int i2);

    public static final native void _setABRStrategy(long j, ABRStrategy aBRStrategy);

    public static final native void _setAIBarrageInfo(long j, MaskInfo maskInfo);

    public static final native void _setAudioProcessor(long j, AudioProcessor audioProcessor);

    public static final native void _setConfig(long j, long j2);

    public static final native void _setDataSource(long j, IMediaDataSource iMediaDataSource);

    public static final native void _setDataSource(long j, String str);

    public static final native void _setDataSourceFd(long j, int i);

    public static final native int _setDoubleValue(long j, int i, double d);

    public static final native int _setFloatValue(long j, int i, float f);

    public static final native int _setFloatValueArray(long j, int[] iArr, float[] fArr);

    public static final native void _setGlobalIntForKey(int i, int i2);

    public static final native int _setIntValue(long j, int i, int i2);

    public static final native int _setIntValueArray(long j, int[] iArr, int[] iArr2);

    public static final native void _setLayerCallback(long j, int i);

    public static final native void _setLoadControl(long j, LoadControl loadControl);

    public static final native int _setLongValue(long j, int i, long j2);

    public static final native int _setLongValueArray(long j, int[] iArr, long[] jArr);

    public static final native void _setLooping(long j, int i);

    public static final native void _setMaskInfo(long j, MaskInfo maskInfo);

    public static final native void _setMediaTransport(long j, MediaTransport mediaTransport);

    public static final native int _setStringValue(long j, int i, String str);

    public static final native int _setStringValueArray(long j, int[] iArr, String[] strArr);

    public static final native void _setSubInfo(long j, SubInfo subInfo);

    public static final native void _setSupportFormatNB(int i);

    public static final native void _setSupprotSampleRates(int[] iArr, int i);

    public static final native int _setSurfaceValue(long j, long j2);

    public static final native void _setTraitObject(long j, int i, int i2, TraitObject traitObject);

    public static final native int _setVideoLayer(long j, TTPlayerSurface tTPlayerSurface);

    public static final native int _setVideoSubSurface(long j, Surface surface, int i);

    public static final native int _setVideoSurface(long j, Surface surface);

    public static final native void _setVolume(long j, float f, float f2);

    public static final native int _setupMediaCodec(long j);

    public static final native int _start(long j);

    public static final native void _stop(long j);

    public static final native void _switchStream(long j, int i, int i2);

    public static final native void _takeScreenshot(long j);

    public static final String getCrashPath() {
        return null;
    }

    public String getStrategyParams(String str) {
        return "none";
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
    }

    static {
        LJIILIIL = "";
        synchronized (TTPlayer.class) {
            try {
                C1286610jaN.LIZ();
                TTPlayerInitializer.LIZ();
                LJIILIIL = C1286610jaN.LJ;
                try {
                    LIZ();
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    String str = C1286610jaN.LIZJ;
                    if (str == null) {
                        throw e;
                    }
                    throw new UnsatisfiedLinkError(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ() {
        if (LJIIJ == 0) {
            int[] iArr = new int[20];
            LJIIJJI = iArr;
            int i = 0;
            do {
                iArr[i] = AudioFormats.LIZ[i];
                i++;
            } while (i < 17);
            LJIIJ = 17;
            _setSupprotSampleRates(LJIIJJI, 17);
        }
    }

    public static int getThreadPoolStackSize() {
        return x.LIZJ(25, 32);
    }

    public static int getVC1DecPoolV2Flags() {
        return x.LIZJ(66, 0);
    }

    public static int getVC1DecPoolV2MaxUseCount() {
        return x.LIZJ(65, 0);
    }

    public static int getVC1DecPoolV2Size() {
        return x.LIZJ(64, 0);
    }

    public static int getVC2DecPoolSize() {
        return x.LIZJ(42, 0);
    }

    public static int getVC2DecPoolV2Flags() {
        return x.LIZJ(61, 0);
    }

    public static int getVC2DecPoolV2MaxUseCount() {
        return x.LIZJ(60, 0);
    }

    public static int getVC2DecPoolV2Size() {
        return x.LIZJ(59, 0);
    }

    public static int getVC2StackSizeValue() {
        return x.LIZJ(40, 0);
    }

    public static int getVC2ThreadPriorityValue() {
        return x.LIZJ(35, 0);
    }

    public static int isEnableSmartPipeline() {
        return x.LJ(67) ? 1 : 0;
    }

    public static int isEnableVC1DecPoolV2() {
        return x.LJ(63) ? 1 : 0;
    }

    public static int isEnableVC2DecPool() {
        return x.LJ(41) ? 1 : 0;
    }

    public static int isEnableVC2DecPoolV2() {
        return x.LJ(58) ? 1 : 0;
    }

    public static int isEnableVC2ThreadPriority() {
        return x.LJ(34) ? 1 : 0;
    }

    public static int isEnableVC2ThreadPriorityLite() {
        return x.LJ(36) ? 1 : 0;
    }

    public static int isUseThreadV2() {
        return x.LIZJ(38, 0);
    }

    public static int isUsedThreadPool() {
        return x.LJ(24) ? 1 : 0;
    }

    public static int isVC2StackSizeOpt() {
        return x.LJ(39) ? 1 : 0;
    }

    public final Map<String, Object> LJI() {
        return (Map) _getPlayerMetrics(this.LIZ);
    }

    public final void LJIIJ() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _pause(j);
    }

    public final void LJIIJJI() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _prepare(j);
    }

    public final void LJIIL() {
        if (this.LIZ == 0) {
            return;
        }
        if (!this.LJII.LIZIZ()) {
            _setVideoSurface(this.LIZ, null);
            return;
        }
        if (this.LJIIIIZZ) {
            _setVideoSurface(this.LIZ, null);
        }
        this.LJII.LIZJ(4);
    }

    public final void LJIILJJIL() {
        C1285320jYI.LIZJ(this, "TTPlayerJava", C786410Ut5.k4(Locale.US, "release TTPlayer:%x", new Object[]{Long.valueOf(this.LIZ)}));
        this.LJ = null;
        if (!this.LJIIIIZZ) {
            this.LJII.LJFF();
        }
        long j = this.LIZ;
        if (j != 0) {
            _release(j);
            this.LIZ = 0L;
        }
        this.LJII.LIZIZ = 0L;
        if (!this.LJIIIZ && this.LJIIIIZZ) {
            this.LJII.LJFF();
        }
        this.LIZIZ = null;
    }

    public final int LJIILL() {
        if (this.LIZ == 0) {
            return -1;
        }
        this.LJ = null;
        if (!this.LJIIIIZZ) {
            this.LJII.LIZJ(2);
        }
        int i_reset = _reset(this.LIZ);
        if (this.LJIIIIZZ) {
            this.LJII.LIZJ(2);
        }
        return i_reset;
    }

    public final void LJJIZ() {
        _setupMediaCodec(this.LIZ);
    }

    public final void LJJJI() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _start(j);
    }

    public final void LJJJIL() {
        long j = this.LIZ;
        if (j != 0) {
            this.LJ = null;
            _stop(j);
        }
    }

    public TTPlayerSurface acquireSurface() {
        TTPlayerSurface tTPlayerSurfaceLIZ = C1471030oNp.LIZ.LIZ(this);
        if (tTPlayerSurfaceLIZ == null || !tTPlayerSurfaceLIZ.isValid()) {
            return null;
        }
        return tTPlayerSurfaceLIZ;
    }

    public static boolean isIPPlayer() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mIsIPCPlayer:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    public static void LJIIIZ() {
        _initCpuManager();
    }

    public static void LJIILIIL() {
        _registerPlayerCoreConfig();
    }

    public static long LIZIZ(int i) {
        return _getDemuxerFactory(i);
    }

    public static int registerNativeMdl(long j) {
        return _registerNativeMdl(j);
    }

    public final Object LJFF(int i) {
        return _getJObjectValue(this.LIZ, i);
    }

    public final String LJII(int i) {
        int size;
        if (i == 1095) {
            return LJIILIIL;
        }
        if (i == 35013) {
            C1470970oNj c1470970oNj = this.LJII.LJIIJJI;
            if (c1470970oNj.LIZIZ()) {
                try {
                    C1470960oNi c1470960oNi = C1471030oNp.LIZ;
                    if (c1470960oNi.LIZIZ > 0) {
                        size = ((ArrayList) c1470960oNi.LIZ).size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                        c1470970oNj.LIZ.put("pool_size", size);
                    }
                    c1470970oNj.LIZ.put("gen_sc", c1470970oNj.LJ);
                    c1470970oNj.LIZ.put("bind", c1470970oNj.LIZJ);
                    if (!c1470970oNj.LJFF.isEmpty()) {
                        c1470970oNj.LIZ.put("re_list", new JSONArray((Collection) c1470970oNj.LJFF));
                    }
                    c1470970oNj.LIZ.put("re_ret", c1470970oNj.LJII);
                    c1470970oNj.LIZ.put("bind_ret", c1470970oNj.LJIIIIZZ);
                    return C786410Ut5.J3(c1470970oNj.LIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return _getStringValue(this.LIZ, i);
    }

    public final String LJIIIIZZ(int i) {
        return _getSubtitleContent(this.LIZ, i);
    }

    public final void LJIILLIIL(int i) {
        _seek(this.LIZ, i);
    }

    public final void LJIJ(ABRStrategy aBRStrategy) {
        long j = this.LIZ;
        if (j != 0) {
            _setABRStrategy(j, aBRStrategy);
        }
    }

    public final void LJIJI(MaskInfo maskInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setAIBarrageInfo(j, maskInfo);
        }
    }

    public final void LJIJJ(AudioProcessor audioProcessor) {
        long j = this.LIZ;
        if (j != 0) {
            _setAudioProcessor(j, audioProcessor);
        }
    }

    public final void LJIJJLI(InterfaceC1467440oI2 interfaceC1467440oI2) {
        _setConfig(this.LIZ, interfaceC1467440oI2.getNativeHandle());
    }

    public final void LJIL(String str) {
        long j = this.LIZ;
        if (j != 0) {
            _setDataSource(j, str);
        }
    }

    public final void LJJ(int i) {
        long j = this.LIZ;
        if (j != 0) {
            _setDataSourceFd(j, i);
        }
    }

    public final void LJJIII(LoadControl loadControl) {
        long j = this.LIZ;
        if (j != 0) {
            _setLoadControl(j, loadControl);
        }
    }

    public final void LJJIIJZLJL(int i) {
        _setLooping(this.LIZ, i);
    }

    public final void LJJIIZ(MaskInfo maskInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setMaskInfo(j, maskInfo);
        }
    }

    public final void LJJIIZI(long j) {
        _setIntValue(this.LIZ, 16, (int) j);
    }

    public final void LJJIJIIJI(SubInfo subInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setSubInfo(j, subInfo);
        }
    }

    public final int LJJIJIL(TTPlayerSurface tTPlayerSurface) {
        long j = this.LIZ;
        if (j != 0) {
            return _setVideoLayer(j, tTPlayerSurface);
        }
        return -1;
    }

    public final void LJJIJLIJ(Surface surface) {
        if (this.LIZ != 0) {
            if (!this.LJIIIIZZ) {
                this.LJII.LIZJ(8);
            }
            _setVideoSurface(this.LIZ, surface);
            if (this.LJIIIIZZ) {
                this.LJII.LIZJ(8);
            }
        }
    }

    public final boolean LJJJ(int i) {
        if (this.LJ != null && i <= this.LJI && i >= this.LJFF) {
            return true;
        }
        return false;
    }

    public void onLiveFirstSeiUpdate(String str) {
        C1285320jYI.LIZLLL(null, "TTPlayerJava", "receive first live sei");
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LIZLLL(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public int onSurfaceConsumerChanged(TTPlayerSurface tTPlayerSurface) {
        int iLIZIZ;
        C1470950oNh c1470950oNh = this.LJII;
        C1285330jYJ.LIZ(3, "core", c1470950oNh.LIZIZ, "onSurfaceConsumerChanged");
        synchronized (c1470950oNh.LJIIIIZZ) {
            try {
                if (c1470950oNh.LJFF != null) {
                    iLIZIZ = C1471100oNw.LIZIZ(tTPlayerSurface, c1470950oNh.LJFF, c1470950oNh.LJI, c1470950oNh.LJII, true, c1470950oNh.LIZIZ);
                } else {
                    iLIZIZ = -1;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            c1470950oNh.LIZLLL.writeLock().lock();
            if (iLIZIZ == 0 && tTPlayerSurface != c1470950oNh.LIZJ) {
                c1470950oNh.LIZJ = tTPlayerSurface;
            }
            c1470950oNh.LIZLLL.writeLock().unlock();
            return iLIZIZ;
        } catch (Throwable th) {
            c1470950oNh.LIZLLL.writeLock().unlock();
            throw th;
        }
    }

    public void onSurfaceConsumerError(TTPlayerSurface tTPlayerSurface) {
        C1285330jYJ.LIZ(6, "core", this.LJII.LIZIZ, "onSurfaceConsumerError");
        tTPlayerSurface.LIZLLL = false;
    }

    public void receiveBinarySei(ByteBuffer byteBuffer) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LJFF(byteBuffer);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LJJIFFI(int i, int i2) {
        _setGlobalIntForKey(i, i2);
    }

    public final float LIZJ(float f, int i) {
        return _getFloatValue(this.LIZ, i, f);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final int LIZLLL(int r3, int r4) {
        /*
            r2 = this;
            r0 = 11
            if (r3 == r0) goto L6b
            r0 = 51
            if (r3 == r0) goto L69
            switch(r3) {
                case 1: goto L3f;
                case 2: goto L46;
                case 3: goto L4d;
                case 4: goto L54;
                case 5: goto L5b;
                case 6: goto L62;
                default: goto Lb;
            }
        Lb:
            switch(r3) {
                case 40101: goto L15;
                case 40102: goto L1c;
                case 40103: goto L23;
                case 40104: goto L2a;
                case 40105: goto L31;
                case 40106: goto L38;
                default: goto Le;
            }
        Le:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L15:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L1c:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L23:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L2a:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L31:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L38:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        L3f:
            long r0 = r2.LIZ
            int r0 = _getDuration(r0)
            return r0
        L46:
            long r0 = r2.LIZ
            int r0 = _getCurrentPosition(r0)
            return r0
        L4d:
            long r0 = r2.LIZ
            int r0 = _getVideoWidth(r0)
            return r0
        L54:
            long r0 = r2.LIZ
            int r0 = _getVideoHeight(r0)
            return r0
        L5b:
            long r0 = r2.LIZ
            int r0 = _isLooping(r0)
            return r0
        L62:
            long r0 = r2.LIZ
            int r0 = _isPlaying(r0)
            return r0
        L69:
            r0 = 0
            return r0
        L6b:
            long r0 = r2.LIZ
            int r0 = _getIntValue(r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayer.LIZLLL(int, int):int");
    }

    public final long LJ(int i, long j) {
        if (i == 50) {
            return this.LIZ;
        }
        return _getLongValue(this.LIZ, i, j);
    }

    public final void LJIIZILJ(int i, int i2) {
        _seek2(this.LIZ, i, i2);
    }

    public final int LJJI(float f, int i) {
        if (LJJJ(i)) {
            this.LJ.LJFF(f, i);
        }
        return _setFloatValue(this.LIZ, i, f);
    }

    public final int LJJII(int i, int i2) {
        if (LJJJ(i)) {
            this.LJ.LIZJ(i, i2);
        }
        boolean z = true;
        if (i == 111) {
            int[] iArr = new int[19];
            int i3 = 0;
            int i4 = 0;
            do {
                if (((1 << i3) & i2) == 0) {
                    iArr[i4] = C1467830oIf.LIZ[i3];
                    i4++;
                }
                i3++;
            } while (i3 < 19);
            _setSupprotSampleRates(iArr, i4);
            return 0;
        }
        if (i != 43364 && i != 43365 && i != 43366) {
            if (i == 43360) {
                if ((i2 & 1) <= 0) {
                    z = false;
                }
                this.LJIIIIZZ = z;
                this.LJII.LJ(i, i2);
                return 0;
            }
            if (i == 43368) {
                if (i2 != 2) {
                    z = false;
                }
                this.LJIIIZ = z;
            } else if (i == 43343) {
                this.LJII.LJ(i, i2);
            }
            return _setIntValue(this.LIZ, i, i2);
        }
        this.LJII.LJ(i, i2);
        return 0;
    }

    public final int LJJIIJ(int i, long j) {
        if (LJJJ(i)) {
            this.LJ.LIZIZ(i, j);
        }
        return _setLongValue(this.LIZ, i, j);
    }

    public final int LJJIJ(int i, String str) {
        if (LJJJ(i)) {
            this.LJ.LIZ(i, str);
        }
        return _setStringValue(this.LIZ, i, str);
    }

    public final void LJJIJIIJIL(int i, TraitObject traitObject) {
        int i2;
        long j = this.LIZ;
        if (j != 0) {
            if (traitObject != null) {
                i2 = traitObject.LIZ;
            } else {
                i2 = -1;
            }
            _setTraitObject(j, i, i2, traitObject);
        }
    }

    public final void LJJIJL(int i, Surface surface) {
        long j = this.LIZ;
        if (j != 0) {
            _setVideoSubSurface(j, surface, i);
        }
    }

    public final void LJJIL(float f, float f2) {
        _setVolume(this.LIZ, f, f2);
    }

    public final void LJJJJ(int i, int i2) {
        _switchStream(this.LIZ, i, i2);
    }

    public void onAbrDecisionInfo(long j, String str) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LIZJ(j, str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onSurfaceConsumerDestroyed(TTPlayerSurface tTPlayerSurface, int i) {
        C1470950oNh c1470950oNh = this.LJII;
        C1285330jYJ.LIZ(4, "core", c1470950oNh.LIZIZ, "onSurfaceConsumerDestroyed");
        try {
            c1470950oNh.LIZLLL.writeLock().lock();
            if (tTPlayerSurface == c1470950oNh.LIZJ) {
                c1470950oNh.LIZJ = null;
                c1470950oNh.LJ = 0;
            }
            c1470950oNh.LIZLLL.writeLock().unlock();
            c1470950oNh.LIZLLL(tTPlayerSurface, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1470950oNh.LIZLLL.writeLock().unlock();
            throw th;
        }
    }

    public void frameDTSNotify(int i, long j, long j2) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LIZ(i, j2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void onLogInfo(int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(i);
        sbLIZ.append(" code:");
        sbLIZ.append(i2);
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1470940oNg c1470940oNg = this.LIZIZ;
        if (c1470940oNg != null) {
            try {
                c1470940oNg.LJ(i, i2, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void updateFrameTerminatedDTS(int i, long j, long j2) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public TTPlayer(int i, int i2, long j, Context context) throws Exception {
        C1470950oNh c1470950oNh = new C1470950oNh(new C1471020oNo(this));
        this.LJII = c1470950oNh;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LIZLLL = context;
        this.LIZIZ = null;
        this.LIZ = _create(context, 0, i, i2, LJIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("yafeng playerid:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1285320jYI.LIZJ(this, "TTPlayerJava", C786410Ut5.k4(Locale.US, "create TTPlayer:%x", new Object[]{Long.valueOf(this.LIZ)}));
        c1470950oNh.LIZIZ = this.LIZ;
        if (this.LIZ != 0) {
        } else {
            throw new Exception("create native player is fail.");
        }
    }

    public void didReceivePacket(int i, long j, long j2, Map<Integer, String> map) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.LIZIZ(i, j2, map);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        try {
            InterfaceC1470980oNk interfaceC1470980oNk = this.LIZJ;
            if (interfaceC1470980oNk != null) {
                interfaceC1470980oNk.onFrameAboutToBeRendered(i, j, j2, map);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        try {
            C1470940oNg c1470940oNg = this.LIZIZ;
            if (c1470940oNg != null) {
                c1470940oNg.LIZJ.LJJIJLIJ(i, i2, i3, str);
            }
            if (i2 == 7) {
                this.LJII.LJ(3, 1);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
