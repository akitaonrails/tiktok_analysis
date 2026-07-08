package com.ss.ttlivestreamer.core.engine;

import X.C0TI5;
import X.C2188811AlT;
import X.InterfaceC1272820jE8;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class MediaEngineFactory {
    public static List<String> librarylist;
    public long mNativeObj;

    public static MediaEngineFactory create() {
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            return null;
        }
        long jNativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (jNativeGetMediaEngineFactory != 0) {
            return new MediaEngineFactory(jNativeGetMediaEngineFactory);
        }
        return null;
    }

    public static String getVersion() {
        return !LyraxSoLoadState.isLyraxNativeReady() ? "" : nativeGetVersion();
    }

    public static native int nativeCheckLicense(String str);

    private native long nativeCreateAudioTrack(long j, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j, VideoSource videoSource, String str);

    public static native long nativeGetMediaEngineFactory();

    public static native String nativeGetVersion();

    private native void nativeSetStatisticsType(int i);

    public static native void nativeSetupClassLoader();

    public synchronized void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.mNativeObj = 0L;
        }
    }

    static {
        List listAsList = Arrays.asList("c++_shared", "aaudio", "ttcrypto", "bytenn", "yuv", "fdk-aac", "bytevc0", "bytevc1enc", "iesapplogger", "ttboringssl", "lens", "ttffmpeg", "vcbasekit", "ttquic", "IESSaliency");
        ArrayList arrayList = new ArrayList();
        librarylist = arrayList;
        arrayList.addAll(listAsList);
        librarylist.add("audioeffect");
        librarylist.add("volcenginertc");
        try {
            List list = (List) Class.forName("com.bef.effectsdk.EffectSDKBuildConfig").getMethod("getEffectLibs", new Class[0]).invoke(null, new Object[0]);
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!librarylist.contains(ListProtector.get(list, i))) {
                        librarylist.add((String) ListProtector.get(list, i));
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
        }
        librarylist.add("avframework");
        doLoadLibraries();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void doLoadLibraries() {
        /*
            java.lang.Class<com.ss.ttlivestreamer.core.engine.MediaEngineFactory> r7 = com.ss.ttlivestreamer.core.engine.MediaEngineFactory.class
            monitor-enter(r7)
            java.util.List<java.lang.String> r0 = com.ss.ttlivestreamer.core.engine.MediaEngineFactory.librarylist     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L78
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L78
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7a
            java.util.List<java.lang.String> r0 = com.ss.ttlivestreamer.core.engine.MediaEngineFactory.librarylist     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L7a
        L18:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L76
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "volcenginertc"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            if (r0 == 0) goto L74
            boolean r3 = com.ss.bytertc.engine.loader.LyraxSoLoadState.isLyraxNativeReady()     // Catch: java.lang.Throwable -> L7a
        L31:
            java.lang.String r0 = "vcbasekit"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L5d
            java.lang.String r0 = "com.ss.ttm.vcshared.VCBaseKitLoader"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "loadLibrary"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L59
            r0 = 0
            java.lang.Object r0 = r2.invoke(r0, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5d
            goto L6e
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
        L5d:
            if (r3 != 0) goto L6e
            boolean r0 = loadLibrary(r4)     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L6e
            INVOKESTATIC_com_ss_ttlivestreamer_core_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(r4)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            goto L18
        L6e:
            java.util.List<java.lang.String> r0 = com.ss.ttlivestreamer.core.engine.MediaEngineFactory.librarylist     // Catch: java.lang.Throwable -> L7a
            r0.remove(r4)     // Catch: java.lang.Throwable -> L7a
            goto L18
        L74:
            r3 = 0
            goto L31
        L76:
            monitor-exit(r7)
            return
        L78:
            monitor-exit(r7)
            return
        L7a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.engine.MediaEngineFactory.doLoadLibraries():void");
    }

    public static void loadLibrary() {
        doLoadLibraries();
        if (LyraxSoLoadState.isLyraxNativeReady()) {
            nativeSetupClassLoader();
        }
    }

    public static List<String> getLibrarylist() {
        return librarylist;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public MediaEngineFactory(long j) {
        this.mNativeObj = j;
    }

    public static void INVOKESTATIC_com_ss_ttlivestreamer_core_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static int checkLicense(String str) {
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            return -1;
        }
        return nativeCheckLicense(str);
    }

    public static boolean loadLibrary(String str) {
        try {
            boolean zLIZ = C0TI5.LIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Loading library lib");
            sbLIZ.append(str);
            sbLIZ.append(".so done (");
            sbLIZ.append(zLIZ);
            sbLIZ.append(")");
            C2188811AlT.LIZIZ(sbLIZ);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Loading library lib");
            sbLIZ2.append(str);
            sbLIZ2.append(".so error (");
            sbLIZ2.append(th.getMessage());
            sbLIZ2.append(")");
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
    }

    public static void setLogLevel(int i) {
        AVLog.setLevel(i);
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    public void setStatisticsType(int i) {
        nativeSetStatisticsType(i);
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        long jNativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (jNativeCreateAudioTrack != 0) {
            return new AudioTrack(jNativeCreateAudioTrack, audioSource);
        }
        return null;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        long jNativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (jNativeCreateVideoTrack != 0) {
            return new VideoTrack(jNativeCreateVideoTrack, videoSource);
        }
        return null;
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport) {
        return createMediaEncodeStream(videoEncoderFactory, audioEncoderFactory, transport, null, true);
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport, InterfaceC1272820jE8 interfaceC1272820jE8, boolean z) {
        MediaEncodeStream mediaEncodeStream;
        long jNativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, audioEncoderFactory, transport);
        if (jNativeCreateMediaEncodeStream != 0) {
            mediaEncodeStream = new MediaEncodeStream(jNativeCreateMediaEncodeStream, transport);
            mediaEncodeStream.setServiceManager(interfaceC1272820jE8);
            if (z) {
                mediaEncodeStream.createNativeAudioMixer();
                mediaEncodeStream.createNativeVideoMixer();
            }
        } else {
            mediaEncodeStream = null;
        }
        if (transport != null && mediaEncodeStream != null) {
            transport.setVysncModule(new VsyncModule(mediaEncodeStream.nativeGetVsyncModule(jNativeCreateMediaEncodeStream)));
        }
        return mediaEncodeStream;
    }
}
