package com.ss.ttm.player;

import X.C0WZX;
import X.C1285020jXo;
import X.C1285320jYI;
import X.C1471820oP6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217851BrD;
import X.C786410Ut5;
import Y.ARunnableS103S0200000_34;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes35.dex */
public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {
    public static final int LJJIJL = Build.VERSION.SDK_INT;
    public static boolean LJJIJLIJ;
    public static String LJJIL;
    public AudioTrack LIZ;
    public TTPlayer LIZIZ;
    public int LJI;
    public AudioManager LJII;
    public int LJIIIIZZ;
    public int LJIIJJI;
    public byte[] LJIILIIL;
    public Method LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJJ;
    public C2217851BrD LJJIFFI;
    public ConditionVariable LJJII;
    public int LJJIII;
    public ByteBuffer LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public long mNativeObject;
    public int LIZJ = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
    public int LIZLLL = 44100;
    public int LJ = 2;
    public int LJFF = 2;
    public int LJIIIZ = 2;
    public float LJIIJ = -1.0f;
    public volatile boolean LJIIL = true;
    public int LJIILJJIL = -1;
    public long LJIL = -9223372036854775807L;
    public int LJJI = 3;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = -1;

    public static int LIZ(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public void flushAndStop() {
        this.LJIIL = true;
        this.LJIJJ = 0L;
        this.LJIL = -9223372036854775807L;
        this.LJIIZILJ = 0;
        this.LJIJI = 0L;
        this.LJIJJLI = 0L;
        this.LJJIJ = 0L;
        this.LJJIII = -1;
        this.LJIIJ = -1.0f;
        this.mNativeObject = 0L;
        this.LIZIZ = null;
        try {
            AudioTrack audioTrack = this.LIZ;
            if (audioTrack != null) {
                audioTrack.stop();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("flushAndStop failed: ");
            sbLIZ.append(e);
            C1285320jYI.LIZLLL(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
            this.LJJIJIL = 1;
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public final long LIZJ() {
        int playState = this.LIZ.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.LIZ.getPlaybackHeadPosition()) & 4294967295L;
        if (playbackHeadPosition == 0 && this.LJIJJLI > 0 && playState == 3) {
            if (this.LJIL == -9223372036854775807L) {
                this.LJIL = SystemClock.elapsedRealtime();
            }
            return this.LJIJJLI;
        }
        this.LJIL = -9223372036854775807L;
        this.LJIJJLI = playbackHeadPosition;
        return playbackHeadPosition;
    }

    public final boolean LIZLLL() {
        return this.LJIL != -9223372036854775807L && this.LJIJJ > 0 && SystemClock.elapsedRealtime() - this.LJIL >= 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.LJ():int");
    }

    public final int LJI() {
        this.LJIJJ = 0L;
        this.LJIIZILJ = 0;
        this.LJIL = -9223372036854775807L;
        this.LJIJI = 0L;
        this.LJIJJLI = 0L;
        this.LJIIJ = -1.0f;
        AudioTrack audioTrack = this.LIZ;
        this.LIZ = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJ();
            throw th;
        }
        return LJ();
    }

    public void close() {
        final AudioTrack audioTrack = this.LIZ;
        if (audioTrack != null) {
            this.LIZ = null;
            try {
                C1471820oP6.LIZ(new Runnable() { // from class: X.19ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AJVoice@451a.close$1");
                        try {
                            this.LLILLJJLI.LJFF(audioTrack);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AJVoice@451a.close$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create close thread fail = ");
                sbLIZ.append(th);
                C1285320jYI.LIZLLL(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
                LJFF(audioTrack);
            }
        }
        C1285320jYI.LIZJ(this, "JAJVoice", "JAJVoice#$");
    }

    public void flush() {
        try {
            C2217851BrD c2217851BrD = this.LJJIFFI;
            if (c2217851BrD != null) {
                c2217851BrD.LJI = 0L;
                c2217851BrD.LJIILLIIL = 0;
                c2217851BrD.LJIILL = 0;
                c2217851BrD.LJII = 0L;
                c2217851BrD.LIZIZ = null;
                c2217851BrD.LIZJ = null;
            }
            this.LJJIII = -1;
            if (this.LJJIJIIJIL == 1) {
                this.LJIJJLI = 0L;
                this.LJJIJ = 0L;
            }
            this.LIZ.flush();
            if (this.LJIJJ > 0) {
                this.LJIJJ = 0L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getAvailableBufferSize() {
        /*
            r12 = this;
            long r5 = r12.LJIJJ
            android.media.AudioTrack r0 = r12.LIZ
            int r11 = r0.getPlayState()
            r0 = 1
            r9 = 0
            if (r11 == r0) goto L40
            android.media.AudioTrack r0 = r12.LIZ
            int r0 = r0.getPlaybackHeadPosition()
            long r3 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r1 = X.C1285020jXo.LIZ
            r0 = 29
            if (r1 > r0) goto L4c
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L4a
            long r0 = r12.LJIJJLI
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L4a
            r0 = 3
            if (r11 != r0) goto L4a
            long r1 = r12.LJIL
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L3e
            long r0 = android.os.SystemClock.elapsedRealtime()
            r12.LJIL = r0
        L3e:
            long r9 = r12.LJIJJLI
        L40:
            int r0 = r12.LJJIJIIJI
            long r0 = (long) r0
            long r9 = r9 * r0
            long r5 = r5 - r9
            int r1 = (int) r5
            int r0 = r12.LJIILLIIL
            int r0 = r0 - r1
            return r0
        L4a:
            r12.LJIL = r7
        L4c:
            long r1 = r12.LJIJJLI
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L59
            long r7 = r12.LJJIJ
            r0 = 1
            long r7 = r7 + r0
            r12.LJJIJ = r7
        L59:
            r12.LJIJJLI = r3
            long r1 = r12.LJJIJ
            r0 = 32
            long r1 = r1 << r0
            long r9 = r3 + r1
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getAvailableBufferSize():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getCurrentPositionMs() {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getCurrentPositionMs():int");
    }

    public int getEOSDelayMs() {
        return (int) (((((this.LJIJJ / ((long) LIZIZ(this.LJIIIZ, this.LJ))) * 1000) / ((long) this.LIZLLL)) - ((LIZJ() * 1000) / ((long) this.LIZLLL))) + (getLatency() > 0 ? this.LJIIZILJ - this.LJIJ : 0L));
    }

    public int getLatency() {
        if (this.LJJIJIIJIL == 0) {
            LIZJ();
        }
        if (this.LJIILL != null) {
            long jNanoTime = System.nanoTime() / 1000000;
            if (jNanoTime - this.LJIJI > 500) {
                try {
                    int iIntValue = ((Integer) C2204961BRm.a0(this.LJIILL, this.LIZ, null, new C0WZX("dzBzEhEpEd7IWBkxSROdY+z0JCpJ2MPy3w==", null))).intValue();
                    this.LJIIZILJ = iIntValue;
                    int iMax = Math.max(iIntValue, 0);
                    this.LJIIZILJ = iMax;
                    if (iMax > 5000) {
                        C1285320jYI.LIZLLL(this, "JAJVoice", "Ignoring impossibly large audio latency: " + this.LJIIZILJ);
                        this.LJIIZILJ = 0;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJIILL = null;
                }
                this.LJIJI = jNanoTime;
            }
        }
        return this.LJIIZILJ;
    }

    public int getSessionId() {
        AudioTrack audioTrack;
        int i = this.LJJIIJ;
        return (i != -1 || (audioTrack = this.LIZ) == null) ? i : audioTrack.getAudioSessionId();
    }

    public int getUnderRunCount() {
        AudioTrack audioTrack;
        if (Build.VERSION.SDK_INT < 24 || (audioTrack = this.LIZ) == null) {
            return -1;
        }
        return audioTrack.getUnderrunCount();
    }

    public float getVolume() {
        AudioManager audioManager;
        int streamVolume = 0;
        if (this.LIZIZ != null && this.LJIIJ == -1.0f && (audioManager = this.LJII) != null) {
            try {
                int iZ3 = C786410Ut5.Z3(audioManager, this.LJJI);
                try {
                    streamVolume = this.LJII.getStreamVolume(this.LJJI);
                    if (streamVolume < 0) {
                        if (iZ3 > 0) {
                            return iZ3 / 4;
                        }
                        return 10.0f;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return streamVolume;
    }

    public void pause() {
        try {
            C2217851BrD c2217851BrD = this.LJJIFFI;
            if (c2217851BrD != null) {
                c2217851BrD.LJI = 0L;
                c2217851BrD.LJIILLIIL = 0;
                c2217851BrD.LJIILL = 0;
                c2217851BrD.LJII = 0L;
                if (c2217851BrD.LJIIZILJ == -9223372036854775807L) {
                    c2217851BrD.LIZJ.LIZ();
                }
            }
            this.LIZ.pause();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJIJIL = 1;
        }
    }

    public int reconfigPCMFrameBuffer() {
        int i;
        if (!this.LJJIIZI || (i = this.LJIILLIIL) <= 0) {
            return 0;
        }
        try {
            this.LJJIIZ = ByteBuffer.allocateDirect(i);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1285320jYI.LIZ(this, "JAJVoice", "out of memory error when new audio buffer for audiotrack");
            return -10;
        }
    }

    public void resume() {
        try {
            C2217851BrD c2217851BrD = this.LJJIFFI;
            if (c2217851BrD != null) {
                AudioTrack audioTrack = this.LIZ;
                int i = this.LJIIIZ;
                c2217851BrD.LIZIZ(audioTrack, i, LIZIZ(i, this.LJ), this.LJIILLIIL);
                this.LJJIFFI.LIZJ.LIZ();
            }
            this.LIZ.play();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJIJIL = 1;
        }
    }

    public int start() {
        if (this.LIZ == null) {
            C1285320jYI.LIZ(this, "JAJVoice", "audiotrack start before created");
            return -2;
        }
        this.LJIIL = false;
        try {
            C2217851BrD c2217851BrD = this.LJJIFFI;
            if (c2217851BrD != null) {
                AudioTrack audioTrack = this.LIZ;
                int i = this.LJIIIZ;
                c2217851BrD.LIZIZ(audioTrack, i, LIZIZ(i, this.LJ), this.LJIILLIIL);
            }
            this.LIZ.play();
            this.LJIILJJIL = -1;
            if (LJJIJLIJ) {
                this.LJJ = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audioTrack start failed = ");
            sbLIZ.append(th);
            C1285320jYI.LIZ(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
            this.LJJIJIL = 1;
            return -3;
        }
    }

    public void stop() {
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        try {
            C2217851BrD c2217851BrD = this.LJJIFFI;
            if (c2217851BrD != null) {
                c2217851BrD.LJI = 0L;
                c2217851BrD.LJIILLIIL = 0;
                c2217851BrD.LJIILL = 0;
                c2217851BrD.LJII = 0L;
                if (c2217851BrD.LJIIZILJ == -9223372036854775807L) {
                    c2217851BrD.LIZJ.LIZ();
                }
            }
            this.LIZ.pause();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJIJIL = 1;
        }
    }

    public AJVoice() {
        C1285320jYI.LIZJ(this, "JAJVoice", "JAJVoice#^");
        this.LJJIII = -1;
        if (LJJIL == null) {
            String str = Build.DEVICE;
            LJJIL = str;
            if (str.equals("OnePlus6T")) {
                LJJIJLIJ = true;
            }
        }
    }

    public int getMaxVolume() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMaxVolume:");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LJIIJJI;
    }

    public int getErrorOccurred() {
        return this.LJJIJIL;
    }

    public ByteBuffer getPCMFrameBuffer() {
        return this.LJJIIZ;
    }

    public int getTrackBufferSize() {
        return this.LJIILLIIL;
    }

    public final void LJFF(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (LJJIJLIJ) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJJ;
                if (jElapsedRealtime <= 80) {
                    Thread.sleep(80 - jElapsedRealtime);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            audioTrack.release();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release in invalid state = ");
            sbLIZ.append(e2);
            C1285320jYI.LIZLLL(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void setAudioTrackSmoothClock(int i) {
        if (C1285020jXo.LIZ >= 21 && i > 0) {
            this.LJJIFFI = new C2217851BrD();
            this.LJJII = new ConditionVariable(true);
        }
    }

    public void setCalibrationType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJJIJIIJIL = i;
    }

    public void setContentType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setContentType contentType=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJJIIJZLJL = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setSessionId(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSessionId : ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJJIIJ = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setStreamType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set Stream type : ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJJI = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setUseDirectBuffer(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("useDirectBuffer: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJJIIZI = z;
    }

    public static int LIZIZ(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            throw new IllegalArgumentException();
        }
        return i2 * 2;
    }

    public int open(long j, TTPlayer tTPlayer) {
        this.mNativeObject = j;
        C786410Ut5.k4(Locale.US, "native object:%d", new Object[]{Long.valueOf(j)});
        this.LIZIZ = tTPlayer;
        int iLJ = LJ();
        if (iLJ == 0) {
            float f = this.LJIIJ;
            if (f != -1.0f) {
                setVolume(f, f);
            }
            try {
                this.LJIILL = AudioTrack.class.getMethod("getLatency", null);
                return iLJ;
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return iLJ;
    }

    public void setPlayerHandler(long j, TTPlayer tTPlayer) {
        this.mNativeObject = j;
        this.LIZIZ = tTPlayer;
    }

    public void setTrackVolume(float f, float f2) {
        AudioTrack audioTrack = this.LIZ;
        if (audioTrack != null) {
            if (LJJIJL < 21) {
                audioTrack.setStereoVolume(f, f2);
            } else {
                audioTrack.setVolume(f);
            }
        }
    }

    public void setVolume(float f, float f2) {
        AudioTrack audioTrack;
        try {
            int i = this.LJIIJJI;
            if (i < f) {
                f = i;
            }
            if (f2 == -1048575.0f && (audioTrack = this.LIZ) != null) {
                audioTrack.setStereoVolume(f, f2);
            } else {
                AudioManager audioManager = this.LJII;
                if (audioManager != null) {
                    audioManager.setStreamVolume(this.LJJI, (int) f, 0);
                }
            }
            this.LJIIJ = f;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public int write(int i, int i2, int i3) {
        int iWrite;
        int iStart = 0;
        if (this.LJIIL) {
            return 0;
        }
        if (this.LJIILJJIL != i3) {
            this.LJIILJJIL = i3;
            if (this.LJIJJ > 0) {
                this.LIZ.flush();
            }
        }
        try {
            if (C1285020jXo.LIZ >= 21) {
                iWrite = this.LIZ.write(this.LJJIIZ, i2, 0);
            } else {
                this.LJJIIZ.get(this.LJIILIIL, i, i2);
                iWrite = this.LIZ.write(this.LJIILIIL, 0, i2);
            }
            if (iWrite < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("write failed : ret: ");
                sbLIZ.append(iWrite);
                sbLIZ.append(", size = ");
                sbLIZ.append(i2);
                C1285320jYI.LIZ(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
                this.LJJIJIL = 1;
                return iWrite;
            }
            this.LJIJJ += (long) iWrite;
            if (LIZLLL() && LJI() == 0) {
                iStart = start();
            }
            this.LJJIIZ.clear();
            if (iStart != 0) {
                return iStart;
            }
            return iWrite;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("write fail = ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LJJIJIL = 1;
            return -1;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3) {
        int iStart;
        if (bArr != null && bArr.length != 0) {
            if (this.LJIIL) {
                return 0;
            }
            if (this.LJIILJJIL != i3) {
                this.LJIILJJIL = i3;
                if (this.LJIJJ > 0) {
                    this.LIZ.flush();
                }
            }
            try {
                int iWrite = this.LIZ.write(bArr, i, i2);
                if (iWrite < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("write failed : ret: ");
                    sbLIZ.append(iWrite);
                    sbLIZ.append(", size = ");
                    sbLIZ.append(i2);
                    C1285320jYI.LIZ(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJJIJIL = 1;
                    return iWrite;
                }
                this.LJIJJ += (long) iWrite;
                if (LIZLLL() && LJI() == 0 && (iStart = start()) != 0) {
                    return iStart;
                }
                return iWrite;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("write fail = ");
                sbLIZ2.append(e);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LJJIJIL = 1;
                return -1;
            }
        }
        C1285320jYI.LIZ(this, "JAJVoice", "buffer is nullpoint");
        return -10;
    }

    public int write(byte[] bArr, int i, int i2, int i3, long j) {
        if (bArr != null && bArr.length != 0) {
            if (this.LJIIL) {
                return 0;
            }
            if (this.LJIILJJIL != i3) {
                this.LJIILJJIL = i3;
                C2217851BrD c2217851BrD = this.LJJIFFI;
                if (c2217851BrD != null && this.LJJII != null) {
                    if (this.LJIJJ > 0) {
                        if (c2217851BrD.LIZIZ.getPlayState() == 3) {
                            this.LIZ.pause();
                        }
                        C2217851BrD c2217851BrD2 = this.LJJIFFI;
                        c2217851BrD2.LJI = 0L;
                        c2217851BrD2.LJIILLIIL = 0;
                        c2217851BrD2.LJIILL = 0;
                        c2217851BrD2.LJII = 0L;
                        c2217851BrD2.LIZIZ = null;
                        c2217851BrD2.LIZJ = null;
                        this.LJJIII = -1;
                        this.LJJII.close();
                        this.LJIJJ = 0L;
                        AudioTrack audioTrack = this.LIZ;
                        this.LIZ = null;
                        C1471820oP6.LIZ(new ARunnableS103S0200000_34(audioTrack, this, 13));
                        this.LJJII.block();
                        LJ();
                        start();
                        this.LJIILJJIL = i3;
                    }
                } else if (this.LJIJJ > 0) {
                    this.LIZ.flush();
                }
            }
            int i4 = this.LJJIII;
            if (i4 == -1) {
                this.LJJIII = (int) Math.max(0L, j);
            } else {
                long jLIZIZ = ((long) i4) + (((this.LJIJJ / ((long) LIZIZ(this.LJIIIZ, this.LJ))) * 1000) / ((long) this.LIZLLL));
                if (Math.abs(jLIZIZ - j) > 200) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Discontinuity detected [expected ");
                    sbLIZ.append(jLIZIZ);
                    sbLIZ.append(", got ");
                    sbLIZ.append(j);
                    sbLIZ.append(e3.f);
                    C1285320jYI.LIZ(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ));
                    this.LJJIII = (int) (((long) this.LJJIII) + (j - jLIZIZ));
                }
            }
            try {
                int iWrite = this.LIZ.write(bArr, i, i2);
                if (iWrite < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("write failed : ret: ");
                    sbLIZ2.append(iWrite);
                    sbLIZ2.append(", size = ");
                    sbLIZ2.append(i2);
                    C1285320jYI.LIZ(this, "JAJVoice", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LJJIJIL = 1;
                    return iWrite;
                }
                this.LJIJJ += (long) iWrite;
                if (LIZLLL() && LJI() == 0) {
                    int iStart = start();
                    this.LJIILJJIL = i3;
                    if (iStart != 0) {
                        return iStart;
                    }
                }
                return iWrite;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("write fail = ");
                sbLIZ3.append(e);
                C2188811AlT.LIZIZ(sbLIZ3);
                this.LJJIJIL = 1;
                return -1;
            }
        }
        C1285320jYI.LIZ(this, "JAJVoice", "buffer is nullpoint");
        return -10;
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LIZJ = i4;
        this.LJFF = i6;
        this.LJI = i5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mBlockSize:");
        sbLIZ.append(this.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
