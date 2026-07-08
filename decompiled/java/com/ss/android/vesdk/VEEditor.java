package com.ss.android.vesdk;

import X.C08FF;
import X.C0VSJ;
import X.C1284450jWt;
import X.C1311120kDu;
import X.C1404320meE;
import X.C1465870oFV;
import X.C1465880oFW;
import X.C1780100wQK;
import X.C1780110wQL;
import X.C1966107n1;
import X.C1C7U;
import X.C1DOG;
import X.C1DOH;
import X.C1DOI;
import X.C1DOK;
import X.C1DOL;
import X.C1DOQ;
import X.C1DOS;
import X.C1DOV;
import X.C1DOX;
import X.C1DOZ;
import X.C20334614hU;
import X.C2185851Agh;
import X.C2188811AlT;
import X.C2249071D1d;
import X.C2255151DOn;
import X.C2255181DOq;
import X.C2255221DOu;
import X.C2484209oO;
import X.C786410Ut5;
import X.EnumC1464490oDH;
import X.EnumC2255021DOa;
import X.InterfaceC1464130oCh;
import X.InterfaceC1464140oCi;
import X.InterfaceC1464170oCl;
import X.InterfaceC1464180oCm;
import X.InterfaceC1464190oCn;
import X.InterfaceC1464200oCo;
import X.InterfaceC2185721AgU;
import X.InterfaceC2185751AgX;
import X.InterfaceC2185821Age;
import X.InterfaceC2255101DOi;
import X.InterfaceC2255161DOo;
import X.InterfaceC574560MgA;
import X.RunnableC2186311AhR;
import X.SurfaceHolderCallback2C2248441CzS;
import X.TextureViewSurfaceTextureListenerC2248451CzT;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.jni.TEAudioEffectInterface;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.android.vesdk.runtime.VEPublishSettingManager;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public final class VEEditor implements SurfaceTexture.OnFrameAvailableListener {
    public static final Object LLLLLLLLLL;
    public static volatile boolean LLLLLLLZIL;
    public static int LLLLLLZ;
    public InterfaceC2255101DOi LL;
    public InterfaceC2255161DOo LLILLJJLI;
    public C1DOX LLILLL;
    public C1DOV LLILZ;
    public C2255151DOn LLILZIL;
    public VEEditorResManager LLILZLL;
    public final VESize LLIZ;
    public String LLIZLLLIL;
    public VEEditorMessageHandler LLJ;
    public volatile InterfaceC1464180oCm LLJI;
    public volatile InterfaceC574560MgA LLJIJIL;
    public volatile InterfaceC1464190oCn LLJILJIL;
    public volatile C1DOL LLJILJILJ;
    public volatile InterfaceC1464130oCh LLJILLL;
    public volatile C1DOZ LLJJ;
    public InterfaceC1464200oCo LLJJI;
    public InterfaceC1464200oCo LLJJIII;
    public final C2249071D1d LLJJIJI;
    public final C2255221DOu LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final String LLJJJ;
    public VERecordData LLJJJIL;
    public final Map<Integer, String> LLJJJJ;
    public final AtomicBoolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public int LLJLL;
    public final TEInterface LLJLLIL;
    public SurfaceTexture LLJLLL;
    public Surface LLJZ;
    public SurfaceView LLJZIJLIL;
    public TextureView LLL;
    public int LLLF;
    public long LLLFF;
    public long LLLFFI;
    public long LLLFZ;
    public long LLLI;
    public long LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public boolean LLLIIIL;
    public final int LLLIIL;
    public EnumC1464490oDH LLLIILIL;
    public final VIDEO_GRAVITY LLLIL;
    public final VIDEO_SCALETYPE LLLILZ;
    public boolean LLLILZJ;
    public int LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public RunnableC2186311AhR LLLJL;
    public InterfaceC1464170oCl LLLL;
    public InterfaceC1464140oCi LLLLII;
    public InterfaceC1464140oCi LLLLIIIILLL;
    public final C20334614hU LLLLIIL;
    public boolean LLLLIILL;
    public Bitmap LLLLIILLL;
    public float LLLLIL;
    public float LLLLILI;
    public float LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public long LLLLLILLIL;
    public final long LLLLLJIL;
    public float LLLLLJLJLL;
    public final TextureViewSurfaceTextureListenerC2248451CzT LLLLLL;
    public final SurfaceHolderCallback2C2248441CzS LLLLLLIL;
    public final C2185851Agh LLLLLLJ;
    public final C1DOK LLLLLLL;
    public final C1DOS LLLLLLLLL;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EDITOR_SEEK_FLAG_LAST_UpdateIn' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class SEEK_MODE {
        public static final /* synthetic */ SEEK_MODE[] $VALUES;
        public static final SEEK_MODE EDITOR_REFRESH_MODE;
        public static final SEEK_MODE EDITOR_REFRESH_MODE_FOECE;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_Forward;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Accurate;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Accurate_Clear;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Clear;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Forward;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateIn;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateInOut;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_UpdateOut;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_LastSeek;
        public static final SEEK_MODE EDITOR_SEEK_FLAG_OnGoing = new SEEK_MODE("EDITOR_SEEK_FLAG_OnGoing", 0, 0);
        public static final SEEK_MODE EDITOR_SEEK_FLAG_ToIframe;
        public int mValue;

        public static /* synthetic */ SEEK_MODE[] $values() {
            return new SEEK_MODE[]{EDITOR_SEEK_FLAG_OnGoing, EDITOR_SEEK_FLAG_LastSeek, EDITOR_SEEK_FLAG_ToIframe, EDITOR_SEEK_FLAG_LAST_UpdateIn, EDITOR_SEEK_FLAG_LAST_UpdateOut, EDITOR_SEEK_FLAG_LAST_UpdateInOut, EDITOR_SEEK_FLAG_Forward, EDITOR_SEEK_FLAG_LAST_Forward, EDITOR_SEEK_FLAG_LAST_Clear, EDITOR_SEEK_FLAG_LAST_Accurate, EDITOR_SEEK_FLAG_LAST_Accurate_Clear, EDITOR_REFRESH_MODE, EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker, EDITOR_REFRESH_MODE_FOECE};
        }

        static {
            SEEK_MODE seek_mode = new SEEK_MODE("EDITOR_SEEK_FLAG_LastSeek", 1, 1);
            EDITOR_SEEK_FLAG_LastSeek = seek_mode;
            EDITOR_SEEK_FLAG_ToIframe = new SEEK_MODE("EDITOR_SEEK_FLAG_ToIframe", 2, 2);
            EDITOR_SEEK_FLAG_LAST_UpdateIn = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateIn", 3, seek_mode.getValue() | 4);
            EDITOR_SEEK_FLAG_LAST_UpdateOut = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateOut", 4, seek_mode.getValue() | 8);
            EDITOR_SEEK_FLAG_LAST_UpdateInOut = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_UpdateInOut", 5, seek_mode.getValue() | 16);
            SEEK_MODE seek_mode2 = new SEEK_MODE("EDITOR_SEEK_FLAG_Forward", 6, 128);
            EDITOR_SEEK_FLAG_Forward = seek_mode2;
            EDITOR_SEEK_FLAG_LAST_Forward = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Forward", 7, seek_mode2.getValue() | seek_mode.getValue());
            EDITOR_SEEK_FLAG_LAST_Clear = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Clear", 8, seek_mode.getValue() | 256);
            EDITOR_SEEK_FLAG_LAST_Accurate = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Accurate", 9, seek_mode.getValue() | 640);
            EDITOR_SEEK_FLAG_LAST_Accurate_Clear = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Accurate_Clear", 10, seek_mode.getValue() | 896);
            EDITOR_REFRESH_MODE = new SEEK_MODE("EDITOR_REFRESH_MODE", 11, 1024);
            EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker = new SEEK_MODE("EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker", 12, 24577);
            EDITOR_REFRESH_MODE_FOECE = new SEEK_MODE("EDITOR_REFRESH_MODE_FOECE", 13, 536870912);
            $VALUES = $values();
        }

        public static SEEK_MODE[] values() {
            return (SEEK_MODE[]) $VALUES.clone();
        }

        public int getValue() {
            return this.mValue;
        }

        public static SEEK_MODE valueOf(String str) {
            return (SEEK_MODE) C08FF.LIZ(SEEK_MODE.class, str);
        }

        public SEEK_MODE(String str, int i, int i2) {
            this.mValue = i2;
        }
    }

    public VEEditor() {
        throw null;
    }

    public final void LJIIL() {
        this.LL = (InterfaceC2255101DOi) C1966107n1.LIZLLL("com.ss.android.vesdk.VEMVInvoker", new Class[]{VEEditor.class}, this);
        this.LLILLL = (C1DOX) C1966107n1.LIZLLL("com.ss.android.vesdk.VEBingoInvoker", new Class[]{VEEditor.class}, this);
        this.LLILLJJLI = (InterfaceC2255161DOo) C1966107n1.LIZLLL("com.ss.android.vesdk.VEStickerInvoker", new Class[]{VEEditor.class}, this);
        this.LLILZ = new C1DOV(this);
        this.LLILZIL = new C2255151DOn(this);
        new Object(this) { // from class: X.1DOs
        };
        if (this.LLILLJJLI == null) {
            C2484209oO.LIZJ("VEEditor", "VEStickerInvoker is NULL");
        }
    }

    public final int LJIJJLI() {
        int duration;
        synchronized (this) {
            try {
                duration = this.LLJLLIL.getDuration();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return duration;
    }

    public final VEState LJIL() {
        synchronized (this) {
            try {
                TEInterface tEInterface = this.LLJLLIL;
                if (tEInterface == null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "video editor is created yet");
                    return VEState.IDLE;
                }
                int curState = tEInterface.getCurState();
                if (curState >= 0) {
                    return VEState.valueOf(curState);
                }
                C2484209oO.LJIIIIZZ("VEEditor", "native video editor is not inited, already released or releasing");
                return VEState.IDLE;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJJIIJZLJL() {
        int iPause;
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pause... refreshFrame:");
                sbLIZ.append(false);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                iPause = this.LLJLLIL.pause(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iPause;
    }

    public final int LJJIJIIJI() {
        int iRefreshCurrentFrame;
        synchronized (this) {
            try {
                C2484209oO.LIZ("VEEditor", "refreshCurrentFrame...");
                iRefreshCurrentFrame = this.LLJLLIL.refreshCurrentFrame(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iRefreshCurrentFrame;
    }

    static {
        new HashMap();
        LLLLLLLLLL = new Object();
        LLLLLLLZIL = false;
        LLLLLLZ = 0;
    }

    public final void LJIIIIZZ() {
        C2484209oO.LJIIIIZZ("VEEditor", "clearNativeFromInvokers... ");
        InterfaceC2255101DOi interfaceC2255101DOi = this.LL;
        if (interfaceC2255101DOi != null) {
            interfaceC2255101DOi.clearNativeFromMV();
        }
        C1DOX c1dox = this.LLILLL;
        if (c1dox != null) {
            c1dox.clearNativeFromBingo();
        }
        InterfaceC2255161DOo interfaceC2255161DOo = this.LLILLJJLI;
        if (interfaceC2255161DOo != null) {
            interfaceC2255161DOo.clearNativeFromSticker();
        }
        C1DOV c1dov = this.LLILZ;
        if (c1dov != null) {
            c1dov.LIZJ.clearNative();
        }
    }

    public final void LJIILIIL() {
        this.LLJJJJJIL.set(true);
        C2484209oO.LJIIIIZZ("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            try {
                this.LLLILZJ = false;
                C2484209oO.LJIIIIZZ("VEEditor", "onDestroy... ");
                TEVideoUtils.nativeCancelCompileProbe();
                if (this.LLJLLIL.getNativeHandler() == 0) {
                    return;
                }
                this.LLJLLIL.stop();
                SurfaceView surfaceView = this.LLJZIJLIL;
                if (surfaceView != null) {
                    surfaceView.getHolder().removeCallback(this.LLLLLLIL);
                } else {
                    TextureView textureView = this.LLL;
                    if (textureView != null && textureView.getSurfaceTextureListener() == this.LLLLLL) {
                        this.LLL.setSurfaceTextureListener(null);
                    }
                }
                this.LLJZIJLIL = null;
                this.LLL = null;
                this.LLJLLL = null;
                TEInterface tEInterface = this.LLJLLIL;
                if (tEInterface != null) {
                    tEInterface.setOpenGLListeners(null);
                    this.LLJLLIL.setInfoListener(null);
                    this.LLJLLIL.setErrorListener(null);
                    this.LLJLLIL.destroyEngine();
                    LJIIIIZZ();
                }
                this.LLILZLL = null;
                Bitmap bitmap = this.LLLLIILLL;
                if (bitmap != null && !bitmap.isRecycled()) {
                    C786410Ut5.LJJJJ(this.LLLLIILLL);
                    this.LLLLIILLL = null;
                }
                this.LLJJJJJIL.set(false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final VESize LJJ() {
        VESize vESize = this.LLIZ;
        VESize vESize2 = new VESize(vESize.width, vESize.height);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoResolution... width:");
        sbLIZ.append(vESize2.width);
        sbLIZ.append(", height:");
        sbLIZ.append(vESize2.height);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        return vESize2;
    }

    public final void LJJIIJ() {
        if (this.LLJJJJJIL.get()) {
            C2484209oO.LJIIIIZZ("VEEditor", "no need to releasePreviewSurface, is destroying, just return");
            return;
        }
        synchronized (this) {
            try {
                if (this.LLJJJJJIL.get()) {
                    C2484209oO.LJIIIIZZ("VEEditor", "no need to releasePreviewSurface, just lock return");
                } else {
                    C2484209oO.LJIIIIZZ("VEEditor", "surfaceDestroyed...");
                    this.LLJLLIL.releasePreviewSurface();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJJIIZ() {
        if (this.LLJJJJJIL.get()) {
            C2484209oO.LJIIIIZZ("VEEditor", "no need to play, is destroying, just return");
            return 0;
        }
        synchronized (this) {
            try {
                if (this.LLJJJJJIL.get()) {
                    C2484209oO.LJIIIIZZ("VEEditor", "no need to play, is destroying, just lock return");
                    return 0;
                }
                C2484209oO.LJIIIIZZ("VEEditor", "play...");
                this.LLLF = 0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LLLFFI = jCurrentTimeMillis;
                if (this.LLLII == 0) {
                    this.LLLII = jCurrentTimeMillis;
                }
                return this.LLJLLIL.start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJJIIZI() {
        int iPrepareEngine;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init start---> init end  VE cost: ");
        sbLIZ.append(this.LLLLLJIL + this.LLLLLILLIL);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init start---> init end  VE sequence cost: ");
        sbLIZ2.append(this.LLLLLILLIL);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("init start---> init end  VE editor cost: ");
        sbLIZ3.append(this.LLLLLJIL);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor", "prepare...");
                LJJJJIZL(this.LLLLLIL);
                this.LLJLLIL.setEnableRemuxVideo(false);
                this.LLJLLIL.setUsrRotate(0);
                iPrepareEngine = this.LLJLLIL.prepareEngine(0);
                if (iPrepareEngine != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("prepare() prepareEngine failed: result: ");
                    sbLIZ4.append(iPrepareEngine);
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                }
                int[] initResolution = this.LLJLLIL.getInitResolution();
                VESize vESize = this.LLIZ;
                vESize.width = initResolution[0];
                vESize.height = initResolution[1];
                if (this.LLJJL > 0 && this.LLJJLIIIJLLLLLLLZ > 0) {
                    LJJJJLI();
                }
                LJJIJLIJ(this.LLLLL);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("prepare... cost ");
                sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ5));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iPrepareEngine;
    }

    public final int LJJIJ() {
        if (!this.LLJJIJIL) {
            return 0;
        }
        LJJJJIZL(this.LLLLLIL);
        if (this.LLJJI == null) {
            this.LLJLLIL.setEnableRemuxVideo(false);
            this.LLJLLIL.setUsrRotate(0);
            return this.LLJLLIL.prepareEngine(0);
        }
        VEState vEStateLJIL = VEState.ERROR;
        try {
            vEStateLJIL = LJIL();
            int curPosition = this.LLJLLIL.getCurPosition();
            this.LLJLLIL.setEnableRemuxVideo(false);
            this.LLJLLIL.setUsrRotate(0);
            int iPrepareEngine = this.LLJLLIL.prepareEngine(0);
            if (iPrepareEngine != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareEngine error: ");
                sbLIZ.append(iPrepareEngine);
                C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJJI.onCallback(4120, vEStateLJIL.ordinal(), curPosition, null);
                return iPrepareEngine;
            }
            int[] initResolution = this.LLJLLIL.getInitResolution();
            VESize vESize = this.LLIZ;
            vESize.width = initResolution[0];
            vESize.height = initResolution[1];
            if (this.LLJJL > 0 && this.LLJJLIIIJLLLLLLLZ > 0) {
                LJJJJLI();
            }
            this.LLJJI.onCallback(4120, vEStateLJIL.ordinal(), curPosition, null);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("prepareWithCallback error: ");
            sbLIZ2.append(e);
            C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJJI.onCallback(4120, vEStateLJIL.ordinal(), 0, null);
            return -1;
        }
    }

    public final void LJJJJL() {
        C1DOV c1dov = this.LLILZ;
        c1dov.getClass();
        C2484209oO.LIZJ("VEEditor_VEFilterInvoker", "updateFilters");
        int duration = c1dov.LIZIZ.getDuration();
        int i = c1dov.LIZLLL;
        if (i > -1) {
            c1dov.LIZIZ.adjustFilterInOut(i, 0, duration);
        }
        int i2 = c1dov.LJ;
        if (i2 > -1) {
            c1dov.LIZIZ.adjustFilterInOut(i2, 0, duration);
        }
        int i3 = c1dov.LJFF;
        if (i3 > -1) {
            c1dov.LIZIZ.adjustFilterInOut(i3, 0, duration);
        }
    }

    public final void LJJJJLI() {
        VESize vESize = this.LLIZ;
        int i = vESize.width;
        int i2 = vESize.height;
        float f = i / i2;
        int i3 = this.LLJJL;
        int i4 = this.LLJJLIIIJLLLLLLLZ;
        if (f > i3 / i4) {
            this.LLJL = i3;
            this.LLJLIL = (int) (i3 / (i / i2));
        } else {
            this.LLJLIL = i4;
            this.LLJL = (int) (i4 / (i2 / i));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateInitDisplaySize... mInitDisplayWidth:");
        sbLIZ.append(this.LLJL);
        sbLIZ.append(", mInitDisplayHeight:");
        sbLIZ.append(this.LLJLIL);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableEffectCanvas: ");
        sbLIZ.append(true);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        TEInterface.nativeEnableEffectCanvas(true);
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum GET_FRAMES_FLAGS {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static GET_FRAMES_FLAGS valueOf(String str) {
            return (GET_FRAMES_FLAGS) C08FF.LIZ(GET_FRAMES_FLAGS.class, str);
        }

        GET_FRAMES_FLAGS(int i) {
            this.mValue = i;
        }
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum VEState {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(128);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static VEState valueOf(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 8) {
                                if (i != 16) {
                                    if (i != 32) {
                                        if (i != 64) {
                                            if (i != 128) {
                                                if (i != 65535) {
                                                    if (i != 1048576) {
                                                        return null;
                                                    }
                                                    return NOTHING;
                                                }
                                                return ANY;
                                            }
                                            return COMPLETED;
                                        }
                                        return STOPPED;
                                    }
                                    return SEEKING;
                                }
                                return PAUSED;
                            }
                            return STARTED;
                        }
                        return PREPARED;
                    }
                    return INITIALIZED;
                }
                return IDLE;
            }
            return ERROR;
        }

        public static VEState valueOf(String str) {
            return (VEState) C08FF.LIZ(VEState.class, str);
        }

        VEState(int i) {
            this.mValue = i;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public enum SET_RANGE_MODE {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);

        public int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static SET_RANGE_MODE valueOf(String str) {
            return (SET_RANGE_MODE) C08FF.LIZ(SET_RANGE_MODE.class, str);
        }

        SET_RANGE_MODE(int i) {
            this.mValue = i;
        }
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum SCALE_MODE {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS;

        public static SCALE_MODE valueOf(String str) {
            return (SCALE_MODE) C08FF.LIZ(SCALE_MODE.class, str);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public enum TIME_MODE {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE;

        public static TIME_MODE valueOf(String str) {
            return (TIME_MODE) C08FF.LIZ(TIME_MODE.class, str);
        }
    }

    public class VEEditorMessageHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String string;
            C1C7U.LIZ("VEEditor$VEEditorMessageHandler@972e.handleMessage");
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4117) {
                            if (i != 4133) {
                                if (i == 4157) {
                                    VEEditor.this.getClass();
                                }
                            } else if (VEEditor.this.LLJILJILJ != null) {
                                VEEditor.this.LLJILJILJ.LIZ(message.arg1, message.arg2);
                            }
                        } else {
                            InterfaceC1464140oCi interfaceC1464140oCi = VEEditor.this.LLLLII;
                            if (interfaceC1464140oCi != null) {
                                interfaceC1464140oCi.onGetImageData(null, -1, -1, -1, 0.0f);
                                VEEditor.this.LLLLII = null;
                            }
                        }
                    } else if (VEEditor.this.LLJIJIL != null) {
                        VEEditor.this.LLJIJIL.onCompileProgress(((Float) HandlerHook.getMessageObj(message.obj)).floatValue());
                    }
                } else if (VEEditor.this.LLJIJIL != null) {
                    if (message.arg1 < 0) {
                        InterfaceC574560MgA interfaceC574560MgA = VEEditor.this.LLJIJIL;
                        int i2 = message.arg1;
                        if (HandlerHook.getMessageObj(message.obj) == null) {
                            string = "";
                        } else {
                            string = HandlerHook.getMessageObj(message.obj).toString();
                        }
                        interfaceC574560MgA.onCompileError(i2, i2, 0.0f, string);
                    } else {
                        VEEditor.this.LLJIJIL.onCompileDone();
                    }
                    VEEditor.this.LLJIJIL = null;
                }
            } else if (VEEditor.this.LLJI != null) {
                VEEditor.this.LLJI.onSeekDone(0);
                VEEditor.this.LLJI = null;
            }
            C1C7U.LIZIZ("VEEditor$VEEditorMessageHandler@972e.handleMessage");
        }

        public VEEditorMessageHandler(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum VIDEO_GRAVITY {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL;

        public static VIDEO_GRAVITY valueOf(String str) {
            return (VIDEO_GRAVITY) C08FF.LIZ(VIDEO_GRAVITY.class, str);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public enum VIDEO_SCALETYPE {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        public static VIDEO_SCALETYPE valueOf(String str) {
            return (VIDEO_SCALETYPE) C08FF.LIZ(VIDEO_SCALETYPE.class, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1CzT] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1CzS] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1DOK] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1DOS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1DOu] */
    public VEEditor(String str) {
        this.LLIZ = new VESize(-1, -1);
        this.LLIZLLLIL = "mp4";
        this.LLJ = new VEEditorMessageHandler(Looper.getMainLooper());
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = new C2249071D1d();
        this.LLJJIJIIJIL = new Object() { // from class: X.1DOu
        };
        this.LLJJIJIL = true;
        this.LLJJJ = "unknown";
        this.LLJJJIL = null;
        this.LLJJJJ = new HashMap();
        this.LLJJJJJIL = new AtomicBoolean(false);
        this.LLJJJJLIIL = -1;
        InterfaceC2185751AgX interfaceC2185751AgX = new InterfaceC2185751AgX() { // from class: X.1DOJ
            @Override // X.InterfaceC2185751AgX
            public final void onCallback(int i, int i2, float f, String str2) {
                RunnableC2186311AhR runnableC2186311AhR;
                RunnableC2186311AhR runnableC2186311AhR2;
                if (i != 4101) {
                    if (i != 4103) {
                        if (i != 4105) {
                            if (i != 4129) {
                                if (i != 4157) {
                                    if (i != 4133) {
                                        if (i != 4134) {
                                            if (i != 4144) {
                                                if (i != 4145) {
                                                    if (i != 4160) {
                                                        if (i != 4161) {
                                                            if (this.LIZ.LLJJI != null) {
                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                sbLIZ.append("TECommonCallback type:");
                                                                sbLIZ.append(i);
                                                                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        VEEditor vEEditor = this.LIZ;
                                                        if (!vEEditor.LLLJIL || (runnableC2186311AhR2 = vEEditor.LLLJL) == null) {
                                                            return;
                                                        }
                                                        runnableC2186311AhR2.LLIZLLLIL = i2;
                                                        return;
                                                    }
                                                    VEEditor vEEditor2 = this.LIZ;
                                                    if (!vEEditor2.LLLJIL || (runnableC2186311AhR = vEEditor2.LLLJL) == null) {
                                                        return;
                                                    }
                                                    runnableC2186311AhR.LLIZ = i2;
                                                    return;
                                                }
                                                if (this.LIZ.LLJILLL != null) {
                                                    this.LIZ.LLJILLL.LIZ();
                                                    return;
                                                }
                                                if (this.LIZ.LLJJI == null) {
                                                    return;
                                                }
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("TECommonCallback type:");
                                                sbLIZ2.append(i);
                                                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                return;
                                            }
                                            if (this.LIZ.LLJILLL != null) {
                                                this.LIZ.LLJILLL.onReleaseEngineUnitResourceSuccess();
                                                return;
                                            }
                                            if (this.LIZ.LLJJI == null) {
                                                return;
                                            }
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("TECommonCallback type:");
                                            sbLIZ3.append(i);
                                            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                                            this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                            return;
                                        }
                                        this.LIZ.LLLLLJLJLL = f;
                                        return;
                                    }
                                    if (this.LIZ.LLJILJILJ == null || this.LIZ.LLJ == null) {
                                        return;
                                    }
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    this.LIZ.LLJ.sendMessage(message);
                                    return;
                                }
                                this.LIZ.getClass();
                                return;
                            }
                            VEEditor vEEditor3 = this.LIZ;
                            if (vEEditor3.LLLIIIIL != 0) {
                                return;
                            }
                            vEEditor3.LLLIIIIL = System.currentTimeMillis();
                            C2484209oO.LJI("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            return;
                        }
                        if (this.LIZ.LLJIJIL != null && this.LIZ.LLJ != null) {
                            Message message2 = new Message();
                            message2.what = i;
                            message2.obj = Float.valueOf(f);
                            this.LIZ.LLJ.sendMessage(message2);
                            return;
                        }
                        InterfaceC1464200oCo interfaceC1464200oCo = this.LIZ.LLJJI;
                        if (interfaceC1464200oCo == null) {
                            return;
                        }
                        interfaceC1464200oCo.onCallback(i, i2, f, str2);
                        return;
                    }
                    VEEditor vEEditor4 = this.LIZ;
                    if (vEEditor4.LLLJIL) {
                        vEEditor4.LLLJL.LLILZ = vEEditor4.LLJJI;
                        new BPEAThread(this.LIZ.LLLJL).start();
                        this.LIZ.LLLJIL = false;
                        return;
                    } else {
                        if (vEEditor4.LLJIJIL != null && this.LIZ.LLJ != null) {
                            C2484209oO.LJIIIIZZ("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                            Message message3 = new Message();
                            message3.what = 4103;
                            message3.arg1 = i2;
                            message3.obj = str2;
                            this.LIZ.LLJ.sendMessage(message3);
                            return;
                        }
                        if (this.LIZ.LLJJI == null) {
                            return;
                        }
                        C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                        return;
                    }
                }
                if (this.LIZ.LLLIIII > 0) {
                    System.currentTimeMillis();
                }
                if (this.LIZ.LLJI != null && this.LIZ.LLJ != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                    this.LIZ.LLJ.sendEmptyMessage(4101);
                } else {
                    if (this.LIZ.LLJJI == null) {
                        return;
                    }
                    C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                    this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                }
            }
        };
        C1DOQ c1doq = new C1DOQ(this);
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = Boolean.FALSE;
        this.LLJLL = 0;
        this.LLLF = 0;
        this.LLLFF = 0L;
        this.LLLFFI = 0L;
        this.LLLFZ = 0L;
        this.LLLI = 0L;
        this.LLLII = 0L;
        this.LLLIIII = 0L;
        this.LLLIIIIL = 0L;
        this.LLLIIIL = false;
        this.LLLIIL = -1;
        this.LLLIL = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLLILZ = VIDEO_SCALETYPE.CENTER;
        this.LLLILZJ = false;
        this.LLLILZLLLI = -1;
        this.LLLIZZ = null;
        this.LLLJ = false;
        this.LLLJIL = false;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = new C20334614hU();
        this.LLLLIILL = false;
        this.LLLLIILLL = null;
        this.LLLLIL = 0.0f;
        this.LLLLILI = 1.0f;
        this.LLLLJ = 1.0f;
        this.LLLLJI = -1;
        this.LLLLL = -16777216;
        this.LLLLLIL = -16777216;
        this.LLLLLILLIL = 0L;
        this.LLLLLJIL = 0L;
        this.LLLLLJLJLL = 0.0f;
        this.LLLLLL = new TextureView.SurfaceTextureListener() { // from class: X.1CzT
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.LJJIIJ();
                Surface surface = this.LL.LLJZ;
                if (surface != null) {
                    surface.release();
                    return true;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                if (vEEditor.LLJLLL == surfaceTexture) {
                    vEEditor.LJJIII(vEEditor.LLJZ);
                } else {
                    vEEditor.LLJZ = new Surface(surfaceTexture);
                    VEEditor vEEditor2 = this.LL;
                    vEEditor2.LJJIII(vEEditor2.LLJZ);
                }
                this.LL.LLJLLL = surfaceTexture;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                vEEditor.LLJJL = i;
                vEEditor.LLJJLIIIJLLLLLLLZ = i2;
                vEEditor.LJJJJLI();
            }
        };
        this.LLLLLLIL = new SurfaceHolder.Callback2() { // from class: X.1CzS
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.LL.LJJIII(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (this.LL.LLJJJJJIL.get()) {
                    C2484209oO.LJIIIIZZ("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    this.LL.LJJIIJ();
                }
            }

            @Override // android.view.SurfaceHolder.Callback2
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C2484209oO.LIZ("VEEditor", "surfaceRedrawNeeded...");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C2484209oO.LIZ("VEEditor", C786410Ut5.k4(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                VEEditor vEEditor = this.LL;
                vEEditor.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceChanged... ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                vEEditor.LLJJL = i2;
                vEEditor.LLJJLIIIJLLLLLLLZ = i3;
                vEEditor.LJJJJLI();
                if (i2 != 0 && i3 != 0) {
                    vEEditor.LLJLLIL.setSurfaceSize(i2, i3);
                }
            }
        };
        InterfaceC2185721AgU interfaceC2185721AgU = new InterfaceC2185721AgU() { // from class: X.1AhQ
            @Override // X.InterfaceC2185721AgU
            public final void LIZLLL(int i) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LJ(double d) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDestroy: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZJ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLCreate: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZIZ(double d, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDrawing: tex = ");
                sbLIZ.append(i);
                sbLIZ.append(" timeStamp = ");
                sbLIZ.append(d);
                C2484209oO.LJII("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                VEEditor vEEditor = this.LIZ;
                if (!vEEditor.LLLIIIL) {
                    vEEditor.LLLIIIL = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    VEEditor vEEditor2 = this.LIZ;
                    long j = vEEditor2.LLLIIIIL;
                    if (j <= 0) {
                        j = jCurrentTimeMillis;
                    }
                    long j2 = vEEditor2.LLLII;
                    if (j2 <= 0) {
                        j2 = vEEditor2.LLLI;
                    }
                    if (j2 == 0 || j2 < vEEditor2.LLLFZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLII);
                        sbLIZ2.append(", mlFirstSeekTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLI);
                        sbLIZ2.append(", mlInitTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLFZ);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                        j2 = this.LIZ.LLLFZ;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - this.LIZ.LLLFZ);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", jCurrentTimeMillis - j);
                        jSONObject.put("time_total", jCurrentTimeMillis - this.LIZ.LLLFZ);
                        jSONObject.put("usage_type", this.LIZ.LLJJJ);
                        b.LIZIZ("vesdk_event_editor_first_frame_draw", "performance", jSONObject, true);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("first frame draw cost:");
                        sbLIZ3.append(C786410Ut5.J3(jSONObject));
                        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("report first frame json err ");
                        sbLIZ4.append(e);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (this.LIZ.LLJILJIL != null) {
                        this.LIZ.LLJILJIL.onRendered();
                    }
                }
                VEEditor vEEditor3 = this.LIZ;
                int i2 = vEEditor3.LLLF + 1;
                vEEditor3.LLLF = i2;
                if (i2 == 30) {
                    vEEditor3.LLLFF = System.currentTimeMillis();
                    VEEditor vEEditor4 = this.LIZ;
                    long j3 = vEEditor4.LLLFFI;
                    long j4 = vEEditor4.LLLFF;
                    if (j3 != j4) {
                        boolean z = C1284450jWt.LIZ;
                        vEEditor4.LLLFFI = j4;
                        vEEditor4.LLLF = 0;
                    }
                }
            }
        };
        this.LLLLLLJ = new C2185851Agh(this);
        this.LLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOK
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                VEEditor vEEditor = this.LIZ;
                InterfaceC1464140oCi interfaceC1464140oCi = vEEditor.LLLLII;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null && vEEditor.LLJ != null) {
                    Message message = new Message();
                    message.what = 4117;
                    this.LIZ.LLJ.sendMessage(message);
                    return 0;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        this.LLLLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOS
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                InterfaceC1464140oCi interfaceC1464140oCi = this.LIZ.LLLLIIIILLL;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        C1311120kDu.LIZ("VEEditor-offscreen");
        if (!TextUtils.isEmpty(str)) {
            C2484209oO.LJI("VEEditor", "VEEditor offscreen");
            TEInterface tEInterfaceCreateEngine = TEInterface.createEngine();
            this.LLJLLIL = tEInterfaceCreateEngine;
            this.LLILZLL = new VEEditorResManager(str);
            tEInterfaceCreateEngine.setOpenGLListeners(interfaceC2185721AgU);
            tEInterfaceCreateEngine.setInfoListener(interfaceC2185751AgX);
            tEInterfaceCreateEngine.setErrorListener(c1doq);
            LJIILL(false);
            LJIIL();
            C1311120kDu.LIZIZ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workspace is: ");
        sbLIZ.append(str);
        throw new VEException(-100, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJJJ(int i) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOptConfig... ");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        boolean z3 = false;
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("config", i);
                b.LIZIZ("vesdk_event_editor_opt_config", "performance", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("report optConfig json err ");
                sbLIZ2.append(e);
                C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (VEConfigCenter.getInstance().getValue("crossplat_glbase_fbo", false).booleanValue()) {
            i |= 2097152;
        }
        if (VEConfigCenter.getInstance().getValue("use_byte264", false).booleanValue()) {
            i |= 33554432;
        }
        if (VEConfigCenter.getInstance().getValue("color_space", false).booleanValue()) {
            i |= 536870912;
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4", false).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C2484209oO.LJI("VEEditor", "enableRenderEncodeAlign4: true");
            i |= 16777216;
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        boolean z4 = C1284450jWt.LIZ;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        C1284450jWt.LIZ = z;
        if ((i & 8192) == 8192) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1284450jWt.LIZIZ = z2;
        if ((i & 16777216) == 16777216) {
            z3 = true;
        }
        C1284450jWt.LIZJ = z3;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setConfig, sUseSingleGLThread = ");
        sbLIZ3.append(C1284450jWt.LIZ);
        sbLIZ3.append(", sSeekTimeCostOpt = ");
        sbLIZ3.append(C1284450jWt.LIZIZ);
        sbLIZ3.append(", sOutResolutionBase4 = ");
        sbLIZ3.append(C1284450jWt.LIZJ);
        C2484209oO.LJI("VERuntimeConfig", C2188811AlT.LIZIZ(sbLIZ3));
        TEInterface.nativeSetOptVersion(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed A[PHI: r9
      0x00ed: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:43:0x00e8, B:45:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(com.ss.android.vesdk.VEVideoEncodeSettings r16) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJIIJJI(com.ss.android.vesdk.VEVideoEncodeSettings):boolean");
    }

    public final void LJIILL(boolean z) {
        synchronized (this) {
            try {
                this.LLJLLIL.enableEffectAmazing(z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LJIILLIIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableSimpleProcessor: ");
        sbLIZ.append(String.valueOf(z));
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.enableSimpleProcessor(z);
    }

    public final Bitmap LJIJJ(int i) {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrDisplayImage... width:");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this) {
            try {
                VESize vESizeLJJ = LJJ();
                int i3 = vESizeLJJ.width;
                if (i3 == 0 || (i2 = vESizeLJJ.height) == 0) {
                    return null;
                }
                if (i <= 0 || i >= i3) {
                    i = i3;
                } else {
                    i2 = (i2 * i) / i3;
                }
                if (i % 2 == 1) {
                    i++;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    int displayImage = this.LLJLLIL.getDisplayImage(bitmapCreateBitmap);
                    if (displayImage != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getDisplayImage failed ");
                        sbLIZ2.append(displayImage);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                        if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled()) {
                            bitmapCreateBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                        }
                        return null;
                    }
                    return bitmapCreateBitmap;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getDisplayImage createBitmap failed ");
                    sbLIZ3.append(e.getMessage());
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJJII(VEVideoEncodeSettings vEVideoEncodeSettings) {
        synchronized (this) {
            try {
                if (this.LLLILZJ) {
                    if (this.LLJLLIL.getNativeHandler() == 0) {
                        return false;
                    }
                    this.LLJLLIL.genEditorStatus();
                    long nativeContext = VERuntime.getInstance().getNativeContext();
                    int i = VEPublishSettingManager.LIZIZ;
                    EnumC2255021DOa enumC2255021DOa = EnumC2255021DOa.LLILLJJLI;
                    enumC2255021DOa.LL.LIZLLL(vEVideoEncodeSettings, nativeContext);
                    return enumC2255021DOa.LL.LIZIZ();
                }
                throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIII(Surface surface) {
        Rect rect;
        C1311120kDu.LIZ("VEEditor-onSurfaceCreated.");
        C2484209oO.LJIIIIZZ("VEEditor", "surfaceCreated...");
        if (this.LLLLIILL && this.LLLLIILLL != null) {
            Canvas canvasLockCanvas = surface.lockCanvas(null);
            int width = canvasLockCanvas.getWidth();
            int height = canvasLockCanvas.getHeight();
            int width2 = this.LLLLIILLL.getWidth();
            int height2 = this.LLLLIILLL.getHeight();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("width ");
            sbLIZ.append(width);
            sbLIZ.append(" height ");
            sbLIZ.append(height);
            sbLIZ.append(" image width ");
            sbLIZ.append(width2);
            sbLIZ.append(" image height ");
            sbLIZ.append(height2);
            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            float f = width;
            float f2 = height;
            float f3 = width2 / height2;
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            canvasLockCanvas.drawBitmap(this.LLLLIILLL, (Rect) null, rect, (Paint) null);
            surface.unlockCanvasAndPost(canvasLockCanvas);
        }
        this.LLJLLIL.setPreviewSurface(surface);
        if (this.LLJJ != null) {
            this.LLJJ.LIZ(surface);
        }
        C1311120kDu.LIZIZ();
    }

    public final void LJJIJLIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBackgroundColor... color:");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLL = i;
        this.LLJLLIL.setBackGroundColor(i);
    }

    public final void LJJIL(String str) {
        C1DOV c1dov = this.LLILZ;
        synchronized (c1dov.LIZ) {
            try {
                C2484209oO.LJI("VEEditor_VEFilterInvoker", "setColorFilter normal...");
                int i = c1dov.LIZLLL;
                if (i < 0) {
                    C2484209oO.LIZJ("VEEditor_VEFilterInvoker", "setColorFilter... mColorFilterIndex error.");
                    return;
                }
                if (str == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setColorFilter... param error. intensity = ");
                    sbLIZ.append(1.0f);
                    sbLIZ.append(", filterPath = ");
                    sbLIZ.append(str);
                    C2484209oO.LIZJ("VEEditor_VEFilterInvoker", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (c1dov.LJII == null) {
                    c1dov.LJII = new C2255181DOq();
                }
                C2255181DOq c2255181DOq = c1dov.LJII;
                c2255181DOq.LIZ = str;
                c2255181DOq.getClass();
                c2255181DOq.getClass();
                c2255181DOq.getClass();
                c2255181DOq.getClass();
                c1dov.LIZIZ.setFilterParam(i, "left filter", str);
                c1dov.LIZIZ.setFilterParam(c1dov.LIZLLL, "use filter res intensity", String.valueOf(false));
                TEInterface tEInterface = c1dov.LIZIZ;
                int i2 = c1dov.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append(1.0f);
                tEInterface.setFilterParam(i2, "left filter intensity", C2188811AlT.LIZIZ(sbLIZ2));
                c1dov.LIZIZ.setFilterParam(c1dov.LIZLLL, "right filter", "");
                c1dov.LIZIZ.setFilterParam(c1dov.LIZLLL, "filter position", "1.0");
                C1404320meE c1404320meE = new C1404320meE();
                String str2 = "";
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split(File.separator);
                    if (strArrSplit.length > 0) {
                        str2 = strArrSplit[strArrSplit.length - 1];
                    }
                }
                c1404320meE.LIZJ("iesve_veeditor_set_filter_click_filter_id", str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("filterPath", str);
                    jSONObject.put("intensity", String.valueOf(1.0f));
                    jSONObject.put("tag", "setColorFilter");
                    b.LIZIZ("vesdk_event_editor_color_filter", "business", jSONObject, true);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIZ(Looper looper) {
        this.LLJIJIL = null;
        if (looper != null) {
            this.LLJ = new VEEditorMessageHandler(looper);
        } else {
            this.LLJ = null;
        }
    }

    public final synchronized void LJJJJI(int i) {
        this.LLLLJI = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPageMode: ");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.setPageMode(i);
    }

    public final void LJJJJIZL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoBackgroudColor... color:");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLLIL = i;
        this.LLJLLIL.setVideoBackGroundColor(i);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C2484209oO.LJII("VEEditor", "onFrameAvailable...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1CzS] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1DOK] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1DOS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1DOu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1CzT, android.view.TextureView$SurfaceTextureListener] */
    public VEEditor(String str, TextureView textureView) {
        this.LLIZ = new VESize(-1, -1);
        this.LLIZLLLIL = "mp4";
        this.LLJ = new VEEditorMessageHandler(Looper.getMainLooper());
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = new C2249071D1d();
        this.LLJJIJIIJIL = new Object() { // from class: X.1DOu
        };
        this.LLJJIJIL = true;
        this.LLJJJ = "unknown";
        this.LLJJJIL = null;
        this.LLJJJJ = new HashMap();
        this.LLJJJJJIL = new AtomicBoolean(false);
        this.LLJJJJLIIL = -1;
        InterfaceC2185751AgX interfaceC2185751AgX = new InterfaceC2185751AgX() { // from class: X.1DOJ
            @Override // X.InterfaceC2185751AgX
            public final void onCallback(int i, int i2, float f, String str2) {
                RunnableC2186311AhR runnableC2186311AhR;
                RunnableC2186311AhR runnableC2186311AhR2;
                if (i != 4101) {
                    if (i != 4103) {
                        if (i != 4105) {
                            if (i != 4129) {
                                if (i != 4157) {
                                    if (i != 4133) {
                                        if (i != 4134) {
                                            if (i != 4144) {
                                                if (i != 4145) {
                                                    if (i != 4160) {
                                                        if (i != 4161) {
                                                            if (this.LIZ.LLJJI != null) {
                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                sbLIZ.append("TECommonCallback type:");
                                                                sbLIZ.append(i);
                                                                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        VEEditor vEEditor = this.LIZ;
                                                        if (!vEEditor.LLLJIL || (runnableC2186311AhR2 = vEEditor.LLLJL) == null) {
                                                            return;
                                                        }
                                                        runnableC2186311AhR2.LLIZLLLIL = i2;
                                                        return;
                                                    }
                                                    VEEditor vEEditor2 = this.LIZ;
                                                    if (!vEEditor2.LLLJIL || (runnableC2186311AhR = vEEditor2.LLLJL) == null) {
                                                        return;
                                                    }
                                                    runnableC2186311AhR.LLIZ = i2;
                                                    return;
                                                }
                                                if (this.LIZ.LLJILLL != null) {
                                                    this.LIZ.LLJILLL.LIZ();
                                                    return;
                                                }
                                                if (this.LIZ.LLJJI == null) {
                                                    return;
                                                }
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("TECommonCallback type:");
                                                sbLIZ2.append(i);
                                                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                return;
                                            }
                                            if (this.LIZ.LLJILLL != null) {
                                                this.LIZ.LLJILLL.onReleaseEngineUnitResourceSuccess();
                                                return;
                                            }
                                            if (this.LIZ.LLJJI == null) {
                                                return;
                                            }
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("TECommonCallback type:");
                                            sbLIZ3.append(i);
                                            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                                            this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                            return;
                                        }
                                        this.LIZ.LLLLLJLJLL = f;
                                        return;
                                    }
                                    if (this.LIZ.LLJILJILJ == null || this.LIZ.LLJ == null) {
                                        return;
                                    }
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    this.LIZ.LLJ.sendMessage(message);
                                    return;
                                }
                                this.LIZ.getClass();
                                return;
                            }
                            VEEditor vEEditor3 = this.LIZ;
                            if (vEEditor3.LLLIIIIL != 0) {
                                return;
                            }
                            vEEditor3.LLLIIIIL = System.currentTimeMillis();
                            C2484209oO.LJI("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            return;
                        }
                        if (this.LIZ.LLJIJIL != null && this.LIZ.LLJ != null) {
                            Message message2 = new Message();
                            message2.what = i;
                            message2.obj = Float.valueOf(f);
                            this.LIZ.LLJ.sendMessage(message2);
                            return;
                        }
                        InterfaceC1464200oCo interfaceC1464200oCo = this.LIZ.LLJJI;
                        if (interfaceC1464200oCo == null) {
                            return;
                        }
                        interfaceC1464200oCo.onCallback(i, i2, f, str2);
                        return;
                    }
                    VEEditor vEEditor4 = this.LIZ;
                    if (vEEditor4.LLLJIL) {
                        vEEditor4.LLLJL.LLILZ = vEEditor4.LLJJI;
                        new BPEAThread(this.LIZ.LLLJL).start();
                        this.LIZ.LLLJIL = false;
                        return;
                    } else {
                        if (vEEditor4.LLJIJIL != null && this.LIZ.LLJ != null) {
                            C2484209oO.LJIIIIZZ("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                            Message message3 = new Message();
                            message3.what = 4103;
                            message3.arg1 = i2;
                            message3.obj = str2;
                            this.LIZ.LLJ.sendMessage(message3);
                            return;
                        }
                        if (this.LIZ.LLJJI == null) {
                            return;
                        }
                        C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                        return;
                    }
                }
                if (this.LIZ.LLLIIII > 0) {
                    System.currentTimeMillis();
                }
                if (this.LIZ.LLJI != null && this.LIZ.LLJ != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                    this.LIZ.LLJ.sendEmptyMessage(4101);
                } else {
                    if (this.LIZ.LLJJI == null) {
                        return;
                    }
                    C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                    this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                }
            }
        };
        C1DOQ c1doq = new C1DOQ(this);
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = Boolean.FALSE;
        this.LLJLL = 0;
        this.LLLF = 0;
        this.LLLFF = 0L;
        this.LLLFFI = 0L;
        this.LLLFZ = 0L;
        this.LLLI = 0L;
        this.LLLII = 0L;
        this.LLLIIII = 0L;
        this.LLLIIIIL = 0L;
        this.LLLIIIL = false;
        this.LLLIIL = -1;
        this.LLLIL = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLLILZ = VIDEO_SCALETYPE.CENTER;
        this.LLLILZJ = false;
        this.LLLILZLLLI = -1;
        this.LLLIZZ = null;
        this.LLLJ = false;
        this.LLLJIL = false;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = new C20334614hU();
        this.LLLLIILL = false;
        this.LLLLIILLL = null;
        this.LLLLIL = 0.0f;
        this.LLLLILI = 1.0f;
        this.LLLLJ = 1.0f;
        this.LLLLJI = -1;
        this.LLLLL = -16777216;
        this.LLLLLIL = -16777216;
        this.LLLLLILLIL = 0L;
        this.LLLLLJIL = 0L;
        this.LLLLLJLJLL = 0.0f;
        ?? r6 = new TextureView.SurfaceTextureListener() { // from class: X.1CzT
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.LJJIIJ();
                Surface surface = this.LL.LLJZ;
                if (surface != null) {
                    surface.release();
                    return true;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                if (vEEditor.LLJLLL == surfaceTexture) {
                    vEEditor.LJJIII(vEEditor.LLJZ);
                } else {
                    vEEditor.LLJZ = new Surface(surfaceTexture);
                    VEEditor vEEditor2 = this.LL;
                    vEEditor2.LJJIII(vEEditor2.LLJZ);
                }
                this.LL.LLJLLL = surfaceTexture;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                vEEditor.LLJJL = i;
                vEEditor.LLJJLIIIJLLLLLLLZ = i2;
                vEEditor.LJJJJLI();
            }
        };
        this.LLLLLL = r6;
        this.LLLLLLIL = new SurfaceHolder.Callback2() { // from class: X.1CzS
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.LL.LJJIII(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (this.LL.LLJJJJJIL.get()) {
                    C2484209oO.LJIIIIZZ("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    this.LL.LJJIIJ();
                }
            }

            @Override // android.view.SurfaceHolder.Callback2
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C2484209oO.LIZ("VEEditor", "surfaceRedrawNeeded...");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C2484209oO.LIZ("VEEditor", C786410Ut5.k4(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                VEEditor vEEditor = this.LL;
                vEEditor.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceChanged... ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                vEEditor.LLJJL = i2;
                vEEditor.LLJJLIIIJLLLLLLLZ = i3;
                vEEditor.LJJJJLI();
                if (i2 != 0 && i3 != 0) {
                    vEEditor.LLJLLIL.setSurfaceSize(i2, i3);
                }
            }
        };
        InterfaceC2185721AgU interfaceC2185721AgU = new InterfaceC2185721AgU() { // from class: X.1AhQ
            @Override // X.InterfaceC2185721AgU
            public final void LIZLLL(int i) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LJ(double d) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDestroy: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZJ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLCreate: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZIZ(double d, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDrawing: tex = ");
                sbLIZ.append(i);
                sbLIZ.append(" timeStamp = ");
                sbLIZ.append(d);
                C2484209oO.LJII("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                VEEditor vEEditor = this.LIZ;
                if (!vEEditor.LLLIIIL) {
                    vEEditor.LLLIIIL = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    VEEditor vEEditor2 = this.LIZ;
                    long j = vEEditor2.LLLIIIIL;
                    if (j <= 0) {
                        j = jCurrentTimeMillis;
                    }
                    long j2 = vEEditor2.LLLII;
                    if (j2 <= 0) {
                        j2 = vEEditor2.LLLI;
                    }
                    if (j2 == 0 || j2 < vEEditor2.LLLFZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLII);
                        sbLIZ2.append(", mlFirstSeekTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLI);
                        sbLIZ2.append(", mlInitTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLFZ);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                        j2 = this.LIZ.LLLFZ;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - this.LIZ.LLLFZ);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", jCurrentTimeMillis - j);
                        jSONObject.put("time_total", jCurrentTimeMillis - this.LIZ.LLLFZ);
                        jSONObject.put("usage_type", this.LIZ.LLJJJ);
                        b.LIZIZ("vesdk_event_editor_first_frame_draw", "performance", jSONObject, true);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("first frame draw cost:");
                        sbLIZ3.append(C786410Ut5.J3(jSONObject));
                        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("report first frame json err ");
                        sbLIZ4.append(e);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (this.LIZ.LLJILJIL != null) {
                        this.LIZ.LLJILJIL.onRendered();
                    }
                }
                VEEditor vEEditor3 = this.LIZ;
                int i2 = vEEditor3.LLLF + 1;
                vEEditor3.LLLF = i2;
                if (i2 == 30) {
                    vEEditor3.LLLFF = System.currentTimeMillis();
                    VEEditor vEEditor4 = this.LIZ;
                    long j3 = vEEditor4.LLLFFI;
                    long j4 = vEEditor4.LLLFF;
                    if (j3 != j4) {
                        boolean z = C1284450jWt.LIZ;
                        vEEditor4.LLLFFI = j4;
                        vEEditor4.LLLF = 0;
                    }
                }
            }
        };
        this.LLLLLLJ = new C2185851Agh(this);
        this.LLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOK
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                VEEditor vEEditor = this.LIZ;
                InterfaceC1464140oCi interfaceC1464140oCi = vEEditor.LLLLII;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null && vEEditor.LLJ != null) {
                    Message message = new Message();
                    message.what = 4117;
                    this.LIZ.LLJ.sendMessage(message);
                    return 0;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        this.LLLLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOS
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                InterfaceC1464140oCi interfaceC1464140oCi = this.LIZ.LLLLIIIILLL;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        C1311120kDu.LIZ("VEEditor-textureView");
        if (!TextUtils.isEmpty(str)) {
            C2484209oO.LJI("VEEditor", "VEEditor textureView");
            TEInterface tEInterfaceCreateEngine = TEInterface.createEngine((VEUserConfig) null);
            this.LLJLLIL = tEInterfaceCreateEngine;
            this.LLILZLL = new VEEditorResManager(str);
            this.LLL = textureView;
            textureView.setSurfaceTextureListener(r6);
            tEInterfaceCreateEngine.setOpenGLListeners(interfaceC2185721AgU);
            tEInterfaceCreateEngine.setInfoListener(interfaceC2185751AgX);
            tEInterfaceCreateEngine.setErrorListener(c1doq);
            LJIILL(false);
            LJIIL();
            C1311120kDu.LIZIZ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workspace is: ");
        sbLIZ.append(str);
        throw new VEException(-100, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int LJJIJIIJIL(int i, SEEK_MODE seek_mode) {
        int iSeek;
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seek... ");
                sbLIZ.append(i);
                sbLIZ.append(" flags ");
                sbLIZ.append(seek_mode);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                if ((seek_mode.getValue() & SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.LLJI = null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LLLIIII = jCurrentTimeMillis;
                    if (this.LLLI == 0) {
                        this.LLLI = jCurrentTimeMillis;
                    }
                }
                iSeek = this.LLJLLIL.seek(i, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, seek_mode.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iSeek;
    }

    public final void LJJJJJL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWidthHeight... width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.setWidthHeight(i, i2);
    }

    public final int LJJJJZ(int i, VEBaseFilterParam vEBaseFilterParam) {
        int iUpdateFilterParam;
        C1DOV c1dov = this.LLILZ;
        synchronized (c1dov.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateTrackFilterParam, filterIndex: ");
                sbLIZ.append(i);
                sbLIZ.append(", param = ");
                sbLIZ.append(vEBaseFilterParam.toString());
                C2484209oO.LJI("VEEditor_VEFilterInvoker", C2188811AlT.LIZIZ(sbLIZ));
                int i2 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = c1dov.LIZJ;
                    if (tEAudioEffectInterface == null) {
                        C2484209oO.LIZJ("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    iUpdateFilterParam = tEAudioEffectInterface.updateAudioFilterParam(-1, i, vEBaseFilterParam);
                } else {
                    iUpdateFilterParam = c1dov.LIZIZ.updateFilterParam(-1, i, vEBaseFilterParam);
                }
                if (iUpdateFilterParam >= 0) {
                    i2 = 0;
                }
                return i2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1CzT] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.1DOK] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.1DOS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1DOu] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1CzS, android.view.SurfaceHolder$Callback] */
    public VEEditor(String str, SurfaceView surfaceView, VEUserConfig vEUserConfig) {
        this.LLIZ = new VESize(-1, -1);
        this.LLIZLLLIL = "mp4";
        this.LLJ = new VEEditorMessageHandler(Looper.getMainLooper());
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = new C2249071D1d();
        this.LLJJIJIIJIL = new Object() { // from class: X.1DOu
        };
        this.LLJJIJIL = true;
        this.LLJJJ = "unknown";
        this.LLJJJIL = null;
        this.LLJJJJ = new HashMap();
        this.LLJJJJJIL = new AtomicBoolean(false);
        this.LLJJJJLIIL = -1;
        InterfaceC2185751AgX interfaceC2185751AgX = new InterfaceC2185751AgX() { // from class: X.1DOJ
            @Override // X.InterfaceC2185751AgX
            public final void onCallback(int i, int i2, float f, String str2) {
                RunnableC2186311AhR runnableC2186311AhR;
                RunnableC2186311AhR runnableC2186311AhR2;
                if (i != 4101) {
                    if (i != 4103) {
                        if (i != 4105) {
                            if (i != 4129) {
                                if (i != 4157) {
                                    if (i != 4133) {
                                        if (i != 4134) {
                                            if (i != 4144) {
                                                if (i != 4145) {
                                                    if (i != 4160) {
                                                        if (i != 4161) {
                                                            if (this.LIZ.LLJJI != null) {
                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                sbLIZ.append("TECommonCallback type:");
                                                                sbLIZ.append(i);
                                                                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        VEEditor vEEditor = this.LIZ;
                                                        if (!vEEditor.LLLJIL || (runnableC2186311AhR2 = vEEditor.LLLJL) == null) {
                                                            return;
                                                        }
                                                        runnableC2186311AhR2.LLIZLLLIL = i2;
                                                        return;
                                                    }
                                                    VEEditor vEEditor2 = this.LIZ;
                                                    if (!vEEditor2.LLLJIL || (runnableC2186311AhR = vEEditor2.LLLJL) == null) {
                                                        return;
                                                    }
                                                    runnableC2186311AhR.LLIZ = i2;
                                                    return;
                                                }
                                                if (this.LIZ.LLJILLL != null) {
                                                    this.LIZ.LLJILLL.LIZ();
                                                    return;
                                                }
                                                if (this.LIZ.LLJJI == null) {
                                                    return;
                                                }
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("TECommonCallback type:");
                                                sbLIZ2.append(i);
                                                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                                                this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                                return;
                                            }
                                            if (this.LIZ.LLJILLL != null) {
                                                this.LIZ.LLJILLL.onReleaseEngineUnitResourceSuccess();
                                                return;
                                            }
                                            if (this.LIZ.LLJJI == null) {
                                                return;
                                            }
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("TECommonCallback type:");
                                            sbLIZ3.append(i);
                                            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                                            this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                                            return;
                                        }
                                        this.LIZ.LLLLLJLJLL = f;
                                        return;
                                    }
                                    if (this.LIZ.LLJILJILJ == null || this.LIZ.LLJ == null) {
                                        return;
                                    }
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    this.LIZ.LLJ.sendMessage(message);
                                    return;
                                }
                                this.LIZ.getClass();
                                return;
                            }
                            VEEditor vEEditor3 = this.LIZ;
                            if (vEEditor3.LLLIIIIL != 0) {
                                return;
                            }
                            vEEditor3.LLLIIIIL = System.currentTimeMillis();
                            C2484209oO.LJI("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            return;
                        }
                        if (this.LIZ.LLJIJIL != null && this.LIZ.LLJ != null) {
                            Message message2 = new Message();
                            message2.what = i;
                            message2.obj = Float.valueOf(f);
                            this.LIZ.LLJ.sendMessage(message2);
                            return;
                        }
                        InterfaceC1464200oCo interfaceC1464200oCo = this.LIZ.LLJJI;
                        if (interfaceC1464200oCo == null) {
                            return;
                        }
                        interfaceC1464200oCo.onCallback(i, i2, f, str2);
                        return;
                    }
                    VEEditor vEEditor4 = this.LIZ;
                    if (vEEditor4.LLLJIL) {
                        vEEditor4.LLLJL.LLILZ = vEEditor4.LLJJI;
                        new BPEAThread(this.LIZ.LLLJL).start();
                        this.LIZ.LLLJIL = false;
                        return;
                    } else {
                        if (vEEditor4.LLJIJIL != null && this.LIZ.LLJ != null) {
                            C2484209oO.LJIIIIZZ("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                            Message message3 = new Message();
                            message3.what = 4103;
                            message3.arg1 = i2;
                            message3.obj = str2;
                            this.LIZ.LLJ.sendMessage(message3);
                            return;
                        }
                        if (this.LIZ.LLJJI == null) {
                            return;
                        }
                        C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                        return;
                    }
                }
                if (this.LIZ.LLLIIII > 0) {
                    System.currentTimeMillis();
                }
                if (this.LIZ.LLJI != null && this.LIZ.LLJ != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                    this.LIZ.LLJ.sendEmptyMessage(4101);
                } else {
                    if (this.LIZ.LLJJI == null) {
                        return;
                    }
                    C2484209oO.LJIIIIZZ("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                    this.LIZ.LLJJI.onCallback(i, i2, f, str2);
                }
            }
        };
        C1DOQ c1doq = new C1DOQ(this);
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = Boolean.FALSE;
        this.LLJLL = 0;
        this.LLLF = 0;
        this.LLLFF = 0L;
        this.LLLFFI = 0L;
        this.LLLFZ = 0L;
        this.LLLI = 0L;
        this.LLLII = 0L;
        this.LLLIIII = 0L;
        this.LLLIIIIL = 0L;
        this.LLLIIIL = false;
        this.LLLIIL = -1;
        this.LLLIL = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
        this.LLLILZ = VIDEO_SCALETYPE.CENTER;
        this.LLLILZJ = false;
        this.LLLILZLLLI = -1;
        this.LLLIZZ = null;
        this.LLLJ = false;
        this.LLLJIL = false;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = new C20334614hU();
        this.LLLLIILL = false;
        this.LLLLIILLL = null;
        this.LLLLIL = 0.0f;
        this.LLLLILI = 1.0f;
        this.LLLLJ = 1.0f;
        this.LLLLJI = -1;
        this.LLLLL = -16777216;
        this.LLLLLIL = -16777216;
        this.LLLLLILLIL = 0L;
        this.LLLLLJIL = 0L;
        this.LLLLLJLJLL = 0.0f;
        this.LLLLLL = new TextureView.SurfaceTextureListener() { // from class: X.1CzT
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.LJJIIJ();
                Surface surface = this.LL.LLJZ;
                if (surface != null) {
                    surface.release();
                    return true;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                if (vEEditor.LLJLLL == surfaceTexture) {
                    vEEditor.LJJIII(vEEditor.LLJZ);
                } else {
                    vEEditor.LLJZ = new Surface(surfaceTexture);
                    VEEditor vEEditor2 = this.LL;
                    vEEditor2.LJJIII(vEEditor2.LLJZ);
                }
                this.LL.LLJLLL = surfaceTexture;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                VEEditor vEEditor = this.LL;
                vEEditor.LLJJL = i;
                vEEditor.LLJJLIIIJLLLLLLLZ = i2;
                vEEditor.LJJJJLI();
            }
        };
        ?? r5 = new SurfaceHolder.Callback2() { // from class: X.1CzS
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.LL.LJJIII(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (this.LL.LLJJJJJIL.get()) {
                    C2484209oO.LJIIIIZZ("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    this.LL.LJJIIJ();
                }
            }

            @Override // android.view.SurfaceHolder.Callback2
            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C2484209oO.LIZ("VEEditor", "surfaceRedrawNeeded...");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C2484209oO.LIZ("VEEditor", C786410Ut5.k4(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                VEEditor vEEditor = this.LL;
                vEEditor.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceChanged... ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                vEEditor.LLJJL = i2;
                vEEditor.LLJJLIIIJLLLLLLLZ = i3;
                vEEditor.LJJJJLI();
                if (i2 != 0 && i3 != 0) {
                    vEEditor.LLJLLIL.setSurfaceSize(i2, i3);
                }
            }
        };
        this.LLLLLLIL = r5;
        InterfaceC2185721AgU interfaceC2185721AgU = new InterfaceC2185721AgU() { // from class: X.1AhQ
            @Override // X.InterfaceC2185721AgU
            public final void LIZLLL(int i) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LJ(double d) {
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDestroy: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZJ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLCreate: ret = ");
                sbLIZ.append(i);
                C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZIZ(double d, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDrawing: tex = ");
                sbLIZ.append(i);
                sbLIZ.append(" timeStamp = ");
                sbLIZ.append(d);
                C2484209oO.LJII("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                VEEditor vEEditor = this.LIZ;
                if (!vEEditor.LLLIIIL) {
                    vEEditor.LLLIIIL = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    VEEditor vEEditor2 = this.LIZ;
                    long j = vEEditor2.LLLIIIIL;
                    if (j <= 0) {
                        j = jCurrentTimeMillis;
                    }
                    long j2 = vEEditor2.LLLII;
                    if (j2 <= 0) {
                        j2 = vEEditor2.LLLI;
                    }
                    if (j2 == 0 || j2 < vEEditor2.LLLFZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLII);
                        sbLIZ2.append(", mlFirstSeekTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLI);
                        sbLIZ2.append(", mlInitTimeMS = ");
                        sbLIZ2.append(this.LIZ.LLLFZ);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                        j2 = this.LIZ.LLLFZ;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - this.LIZ.LLLFZ);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", jCurrentTimeMillis - j);
                        jSONObject.put("time_total", jCurrentTimeMillis - this.LIZ.LLLFZ);
                        jSONObject.put("usage_type", this.LIZ.LLJJJ);
                        b.LIZIZ("vesdk_event_editor_first_frame_draw", "performance", jSONObject, true);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("first frame draw cost:");
                        sbLIZ3.append(C786410Ut5.J3(jSONObject));
                        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("report first frame json err ");
                        sbLIZ4.append(e);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (this.LIZ.LLJILJIL != null) {
                        this.LIZ.LLJILJIL.onRendered();
                    }
                }
                VEEditor vEEditor3 = this.LIZ;
                int i2 = vEEditor3.LLLF + 1;
                vEEditor3.LLLF = i2;
                if (i2 == 30) {
                    vEEditor3.LLLFF = System.currentTimeMillis();
                    VEEditor vEEditor4 = this.LIZ;
                    long j3 = vEEditor4.LLLFFI;
                    long j4 = vEEditor4.LLLFF;
                    if (j3 != j4) {
                        boolean z = C1284450jWt.LIZ;
                        vEEditor4.LLLFFI = j4;
                        vEEditor4.LLLF = 0;
                    }
                }
            }
        };
        this.LLLLLLJ = new C2185851Agh(this);
        this.LLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOK
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                VEEditor vEEditor = this.LIZ;
                InterfaceC1464140oCi interfaceC1464140oCi = vEEditor.LLLLII;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null && vEEditor.LLJ != null) {
                    Message message = new Message();
                    message.what = 4117;
                    this.LIZ.LLJ.sendMessage(message);
                    return 0;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        this.LLLLLLLLL = new InterfaceC2185821Age() { // from class: X.1DOS
            @Override // X.InterfaceC2185821Age
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                InterfaceC1464140oCi interfaceC1464140oCi = this.LIZ.LLLLIIIILLL;
                if (interfaceC1464140oCi == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i, i2, i3, f);
            }
        };
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1311120kDu.LIZ("VEEditor-surfaceView");
        if (!TextUtils.isEmpty(str)) {
            C2484209oO.LJI("VEEditor", "VEEditor surfaceView");
            TEInterface tEInterfaceCreateEngine = TEInterface.createEngine(vEUserConfig);
            this.LLJLLIL = tEInterfaceCreateEngine;
            this.LLILZLL = new VEEditorResManager(str);
            this.LLJZIJLIL = surfaceView;
            surfaceView.getHolder().addCallback(r5);
            tEInterfaceCreateEngine.setOpenGLListeners(interfaceC2185721AgU);
            tEInterfaceCreateEngine.setInfoListener(interfaceC2185751AgX);
            tEInterfaceCreateEngine.setErrorListener(c1doq);
            LJIILL(false);
            LJIIL();
            C1311120kDu.LIZIZ();
            this.LLLLLJIL = (System.currentTimeMillis() - jCurrentTimeMillis) + 0;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workspace is: ");
        sbLIZ.append(str);
        throw new VEException(-100, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static LoudnessDetectResult[] LJIILJJIL(String[] strArr, int[] iArr, int[] iArr2) {
        int length;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int length2 = iArr.length;
        int length3 = iArr2.length;
        if (length <= 0 || length2 != length3 || (length2 > 0 && length2 != length)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detectAudioLoudness invalid param, audioPathLength:");
            sbLIZ.append(length);
            sbLIZ.append(" trimInLength: ");
            sbLIZ.append(length2);
            sbLIZ.append(", trimOutLength: ");
            sbLIZ.append(length3);
            C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return TEInterface.nativeDetectAudioLoudness(strArr, iArr, iArr2);
    }

    public final boolean LJIIIZ(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LLJIJIL = null;
        boolean zLIZIZ = LIZIZ(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.DEFAULT);
        if (!zLIZIZ) {
            C2484209oO.LIZJ("VEEditor", "_compile failed");
        }
        return zLIZIZ;
    }

    public final int LJJIJIL(int i, SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm) {
        int iSeek;
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seek with cb... ");
                sbLIZ.append(i);
                sbLIZ.append(" flags ");
                sbLIZ.append(seek_mode);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                if ((seek_mode.getValue() & SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.LLJI = interfaceC1464180oCm;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LLLIIII = jCurrentTimeMillis;
                    if (this.LLLI == 0) {
                        this.LLLI = jCurrentTimeMillis;
                    }
                }
                iSeek = this.LLJLLIL.seek(i, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, seek_mode.getValue());
                if (iSeek != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("seek failed, result = ");
                    sbLIZ2.append(iSeek);
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLJI = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iSeek;
    }

    public final int LJJIJL(int i, int i2, InterfaceC1464140oCi interfaceC1464140oCi) {
        int i3;
        synchronized (this) {
            try {
                this.LLLLIIIILLL = interfaceC1464140oCi;
                this.LLJLLIL.setSeekFrameCallback(this.LLLLLLLLL);
                int i4 = -1;
                if (i2 > 0) {
                    VESize vESizeLJJ = LJJ();
                    int i5 = vESizeLJJ.width;
                    if (i5 == 0 || (i3 = vESizeLJJ.height) == 0) {
                        return -1;
                    }
                    if (i2 >= i5) {
                        i2 = i5;
                    } else {
                        i3 = (i3 * i2) / i5;
                    }
                    if (i2 % 2 == 1) {
                        i2++;
                    }
                    i4 = i2;
                    if (i3 % 2 == 1) {
                        i3++;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("seekWithResult... ");
                    sbLIZ.append(i);
                    sbLIZ.append(", (");
                    sbLIZ.append(i4);
                    sbLIZ.append(", ");
                    sbLIZ.append(i3);
                    sbLIZ.append(")");
                    C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    i3 = -1;
                }
                int iSeekWithResult = this.LLJLLIL.seekWithResult(i, i4, i3);
                if (iSeekWithResult != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("seek failed, result = ");
                    sbLIZ2.append(iSeekWithResult);
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLLLIIIILLL = null;
                }
                return iSeekWithResult;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJJIL(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setImageResizeInfo... width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        sbLIZ.append(", resfillmode:");
        sbLIZ.append(i3);
        sbLIZ.append(", resizeAlgro");
        sbLIZ.append(0);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.setImageResizeinfo(i, i2, i3, 0);
    }

    public final boolean LJJJJJ(float f, int i, int i2) {
        boolean trackVolume;
        C2255151DOn c2255151DOn = this.LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setVolume... index:");
                sbLIZ.append(i);
                sbLIZ.append(" type:");
                sbLIZ.append(i2);
                sbLIZ.append(" volume:");
                sbLIZ.append(f);
                C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                trackVolume = c2255151DOn.LIZIZ.setTrackVolume(i2, c2255151DOn.LIZ.LLJJIJI.LIZIZ(1, i), f);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return trackVolume;
    }

    public final int LJJJJLL(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        int iUpdateFilterParam;
        C1DOV c1dov = this.LLILZ;
        synchronized (c1dov.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateClipFilterParam, clipIndex:");
                sbLIZ.append(i);
                sbLIZ.append(",filterIndex:");
                sbLIZ.append(i2);
                C2484209oO.LIZ("VEEditor_VEFilterInvoker", C2188811AlT.LIZIZ(sbLIZ));
                int i3 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = c1dov.LIZJ;
                    if (tEAudioEffectInterface == null) {
                        C2484209oO.LIZJ("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    iUpdateFilterParam = tEAudioEffectInterface.updateAudioFilterParam(i, i2, vEBaseFilterParam);
                } else {
                    iUpdateFilterParam = c1dov.LIZIZ.updateFilterParam(i, i2, vEBaseFilterParam);
                }
                if (iUpdateFilterParam >= 0) {
                    i3 = 0;
                }
                return i3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJI(VEEditor vEEditor, VEEditorResManager vEEditorResManager, VEVideoEncodeSettings vEVideoEncodeSettings, C1DOH c1doh) {
        String string;
        String string2;
        String string3;
        String string4;
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = vEVideoEncodeSettings;
        System.currentTimeMillis();
        TEVideoUtils.nativeCancelCompileProbe();
        TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(c1doh);
        vEEditorResManager.mReverseDone = false;
        if (vEVideoEncodeSettingsLIZ == null) {
            C2484209oO.LJIIIIZZ("VEEditor", "using default video setting for genReverseVideo2");
            vEVideoEncodeSettingsLIZ = C1780110wQL.LIZ(-1, -1, 1);
        }
        LLLLLLZ++;
        vEEditorResManager.clearReverseCacheFiles();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLLLLLZ);
        sbLIZ.append("-");
        sbLIZ.append(0);
        String strGenReverseVideoPath = vEEditorResManager.genReverseVideoPath(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LLLLLLZ);
        sbLIZ2.append("-");
        sbLIZ2.append(1);
        String strGenReverseVideoPath2 = vEEditorResManager.genReverseVideoPath(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LLLLLLZ);
        sbLIZ3.append("-");
        sbLIZ3.append(0);
        String strGenSeqAudioPath = vEEditorResManager.genSeqAudioPath(C2188811AlT.LIZIZ(sbLIZ3));
        C1DOG c1dog = new C1DOG(vEEditor, strGenReverseVideoPath, strGenReverseVideoPath2, tEReverseCallback, strGenSeqAudioPath, vEEditorResManager, c1doh);
        C2484209oO.LJI("VEEditor", "setOnInfoListener...");
        vEEditor.LLJJI = c1dog;
        vEEditor.LLJJIII = new C1DOI(vEEditor, c1doh);
        C2484209oO.LJI("VEEditor", "setOnErrorListener...");
        if (!vEVideoEncodeSettingsLIZ.isEnableHdr10BitEncode() && vEEditor.LLJLLIL.getNativeHandler() != 0) {
            vEEditor.LLJLLIL.setCompileColorTransferCharacteristic(1);
        }
        vEEditor.LJIIIZ(strGenReverseVideoPath, strGenSeqAudioPath, vEVideoEncodeSettingsLIZ);
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mWorkSpace", vEEditorResManager.getWorkspace());
                String[] strArr = vEEditorResManager.mVideoPaths;
                String string5 = null;
                if (strArr != null) {
                    string = Arrays.toString(strArr);
                } else {
                    string = null;
                }
                jSONObject.put("mVideoPaths", string);
                String[] strArr2 = vEEditorResManager.mAudioPaths;
                if (strArr2 != null) {
                    string2 = Arrays.toString(strArr2);
                } else {
                    string2 = null;
                }
                jSONObject.put("mAudioPaths", string2);
                String[] strArr3 = vEEditorResManager.mTransitions;
                if (strArr3 != null) {
                    string3 = Arrays.toString(strArr3);
                } else {
                    string3 = null;
                }
                jSONObject.put("mTransitions", string3);
                String[] strArr4 = vEEditorResManager.mReverseVideoPath;
                if (strArr4 != null) {
                    string4 = Arrays.toString(strArr4);
                } else {
                    string4 = null;
                }
                jSONObject.put("mReverseVideoPath", string4);
                String[] strArr5 = vEEditorResManager.mReverseAudioPaths;
                if (strArr5 != null) {
                    string5 = Arrays.toString(strArr5);
                }
                jSONObject.put("mReverseAudioPaths", string5);
                jSONObject.put("resultCode", 0);
                b.LIZIZ("vesdk_event_editor_reverse_video", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x045b A[Catch: all -> 0x04b8, DONT_GENERATE, TryCatch #1 {all -> 0x04b8, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0016, B:10:0x001c, B:12:0x0051, B:14:0x0063, B:16:0x0069, B:18:0x0071, B:29:0x00fc, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:24:0x00a2, B:26:0x00dc, B:31:0x0105, B:32:0x010d, B:34:0x0116, B:36:0x0125, B:37:0x014b, B:38:0x0165, B:39:0x0168, B:40:0x0171, B:42:0x022c, B:44:0x0232, B:46:0x023a, B:47:0x0249, B:49:0x025c, B:51:0x0262, B:53:0x026a, B:54:0x0278, B:56:0x028d, B:57:0x0299, B:59:0x02c8, B:61:0x02d0, B:63:0x02d8, B:65:0x02e0, B:66:0x02f1, B:68:0x02f7, B:69:0x0300, B:71:0x0306, B:73:0x030a, B:75:0x0317, B:113:0x045f, B:115:0x0465, B:116:0x0470, B:118:0x0491, B:121:0x04a8, B:120:0x04a5, B:117:0x0488, B:105:0x0440, B:107:0x0447, B:108:0x0453, B:110:0x045b, B:77:0x031a, B:78:0x032c, B:79:0x033e, B:80:0x034a, B:81:0x0357, B:82:0x0364, B:84:0x0368, B:86:0x036c, B:88:0x036f, B:90:0x037c, B:91:0x0383, B:92:0x03b9, B:94:0x03bd, B:96:0x03c1, B:98:0x03c4, B:100:0x03d0, B:101:0x03d7, B:102:0x0429, B:103:0x0434, B:125:0x04ac, B:127:0x04ae, B:128:0x04b7), top: B:135:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0465 A[Catch: all -> 0x04b8, TryCatch #1 {all -> 0x04b8, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0016, B:10:0x001c, B:12:0x0051, B:14:0x0063, B:16:0x0069, B:18:0x0071, B:29:0x00fc, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:24:0x00a2, B:26:0x00dc, B:31:0x0105, B:32:0x010d, B:34:0x0116, B:36:0x0125, B:37:0x014b, B:38:0x0165, B:39:0x0168, B:40:0x0171, B:42:0x022c, B:44:0x0232, B:46:0x023a, B:47:0x0249, B:49:0x025c, B:51:0x0262, B:53:0x026a, B:54:0x0278, B:56:0x028d, B:57:0x0299, B:59:0x02c8, B:61:0x02d0, B:63:0x02d8, B:65:0x02e0, B:66:0x02f1, B:68:0x02f7, B:69:0x0300, B:71:0x0306, B:73:0x030a, B:75:0x0317, B:113:0x045f, B:115:0x0465, B:116:0x0470, B:118:0x0491, B:121:0x04a8, B:120:0x04a5, B:117:0x0488, B:105:0x0440, B:107:0x0447, B:108:0x0453, B:110:0x045b, B:77:0x031a, B:78:0x032c, B:79:0x033e, B:80:0x034a, B:81:0x0357, B:82:0x0364, B:84:0x0368, B:86:0x036c, B:88:0x036f, B:90:0x037c, B:91:0x0383, B:92:0x03b9, B:94:0x03bd, B:96:0x03c1, B:98:0x03c4, B:100:0x03d0, B:101:0x03d7, B:102:0x0429, B:103:0x0434, B:125:0x04ac, B:127:0x04ae, B:128:0x04b7), top: B:135:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0488 A[Catch: all -> 0x04b8, TRY_LEAVE, TryCatch #1 {all -> 0x04b8, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0016, B:10:0x001c, B:12:0x0051, B:14:0x0063, B:16:0x0069, B:18:0x0071, B:29:0x00fc, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:24:0x00a2, B:26:0x00dc, B:31:0x0105, B:32:0x010d, B:34:0x0116, B:36:0x0125, B:37:0x014b, B:38:0x0165, B:39:0x0168, B:40:0x0171, B:42:0x022c, B:44:0x0232, B:46:0x023a, B:47:0x0249, B:49:0x025c, B:51:0x0262, B:53:0x026a, B:54:0x0278, B:56:0x028d, B:57:0x0299, B:59:0x02c8, B:61:0x02d0, B:63:0x02d8, B:65:0x02e0, B:66:0x02f1, B:68:0x02f7, B:69:0x0300, B:71:0x0306, B:73:0x030a, B:75:0x0317, B:113:0x045f, B:115:0x0465, B:116:0x0470, B:118:0x0491, B:121:0x04a8, B:120:0x04a5, B:117:0x0488, B:105:0x0440, B:107:0x0447, B:108:0x0453, B:110:0x045b, B:77:0x031a, B:78:0x032c, B:79:0x033e, B:80:0x034a, B:81:0x0357, B:82:0x0364, B:84:0x0368, B:86:0x036c, B:88:0x036f, B:90:0x037c, B:91:0x0383, B:92:0x03b9, B:94:0x03bd, B:96:0x03c1, B:98:0x03c4, B:100:0x03d0, B:101:0x03d7, B:102:0x0429, B:103:0x0434, B:125:0x04ac, B:127:0x04ae, B:128:0x04b7), top: B:135:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r18, java.lang.String r19, com.ss.android.vesdk.VEVideoEncodeSettings r20, com.ss.android.vesdk.VEAudioEncodeSettings r21) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LIZIZ(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    public final boolean LJIIJ(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, InterfaceC574560MgA interfaceC574560MgA) {
        this.LLJIJIL = interfaceC574560MgA;
        boolean zLIZIZ = LIZIZ(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.DEFAULT);
        if (!zLIZIZ) {
            this.LLJIJIL = null;
        }
        return zLIZIZ;
    }

    public static VEEditor LJIIZILJ(VEEditorResManager vEEditorResManager, VERecordData vERecordData, int i, int i2, C1DOH c1doh) {
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZ;
        int iLJJIFFI;
        C2484209oO.LJIIIIZZ("VEEditor", "genReverseVideo2 with recordData.");
        if (vERecordData.getSegmentData() != null && vERecordData.getSegmentData().size() > 1) {
            vEVideoEncodeSettingsLIZ = C1780110wQL.LIZ(i, i2, 1);
        } else {
            vEVideoEncodeSettingsLIZ = C1780110wQL.LIZ(i, i2, 2);
        }
        VEEditor vEEditor = new VEEditor(vEEditorResManager.getWorkspace());
        long jCurrentTimeMillis = System.currentTimeMillis();
        vEEditor.LLJJJIL = vERecordData;
        int size = vERecordData.getSegmentData().size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        int i3 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
            if (vERecordSegmentData.mEnable) {
                strArr[i3] = vERecordSegmentData.mVideo;
                strArr2[i3] = vERecordSegmentData.mAudio;
                iArr[i3] = (int) (vERecordSegmentData.getCutTrimIn() / 1000);
                iArr2[i3] = (int) (vERecordSegmentData.getCutTrimOut() / 1000);
                float f = vERecordSegmentData.mSpeed;
                if (f == 0.0f) {
                    f = 1.0f;
                }
                fArr[i3] = f;
                float f2 = vERecordSegmentData.mVideoSpeed;
                if (f2 == 0.0f) {
                    f2 = 1.0f;
                }
                fArr2[i3] = f2;
                rotate_degreeArr[i3] = vERecordSegmentData.mRotate;
                if (vERecordSegmentData.mWithNoSpeedBoth) {
                    iArr3[i3] = (int) (iArr[i3] * 1.0f);
                    iArr4[i3] = (int) (iArr2[i3] * 1.0f);
                } else {
                    float f3 = iArr[i3];
                    float f4 = fArr[i3];
                    iArr3[i3] = (int) (f3 * f4);
                    iArr4[i3] = (int) (iArr2[i3] * f4);
                }
                i3++;
            }
        }
        if (i3 == 0) {
            C2484209oO.LIZJ("VEEditor", "There are no valid clips!");
            iLJJIFFI = -100;
        } else {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i3);
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i3);
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i3);
            int[] iArrCopyOf3 = Arrays.copyOf(iArr3, i3);
            int[] iArrCopyOf4 = Arrays.copyOf(iArr4, i3);
            float[] fArrCopyOf = Arrays.copyOf(fArr, i3);
            float[] fArrCopyOf2 = Arrays.copyOf(fArr2, i3);
            ROTATE_DEGREE[] rotate_degreeArr2 = (ROTATE_DEGREE[]) Arrays.copyOf(rotate_degreeArr, i3);
            vEEditor.LLILZ.LJII = null;
            vEEditor.LLJLLIL.clearFilter();
            C2249071D1d c2249071D1d = vEEditor.LLJJIJI;
            c2249071D1d.LIZ = -1;
            c2249071D1d.LIZIZ = -1;
            ((ArrayList) c2249071D1d.LIZJ).clear();
            ((ArrayList) c2249071D1d.LIZLLL).clear();
            if (vERecordData.isUseMusic()) {
                strArr4 = null;
                iArrCopyOf3 = null;
                iArrCopyOf4 = null;
                fArrCopyOf = null;
            }
            iLJJIFFI = vEEditor.LJJIFFI(strArr3, iArrCopyOf, iArrCopyOf2, null, strArr4, iArrCopyOf3, iArrCopyOf4, fArrCopyOf2, fArrCopyOf, rotate_degreeArr2, EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL);
            vEEditor.LLLLLILLIL += System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init with VERecordData: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
            if (iLJJIFFI == 0) {
                LJIJI(vEEditor, vEEditorResManager, vEVideoEncodeSettingsLIZ, c1doh);
                return vEEditor;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("genReverseVideo2 init error:");
        sbLIZ2.append(iLJJIFFI);
        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:4:0x000b, B:6:0x004d, B:15:0x008d, B:17:0x0097, B:21:0x00a3, B:29:0x00c1, B:31:0x00c5, B:33:0x00ce, B:34:0x00d2, B:38:0x00d8, B:40:0x00de, B:42:0x00e2, B:46:0x00e8, B:48:0x00ec, B:50:0x00ee, B:52:0x0120, B:53:0x012b, B:54:0x012d, B:24:0x00af, B:19:0x009e), top: B:62:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:4:0x000b, B:6:0x004d, B:15:0x008d, B:17:0x0097, B:21:0x00a3, B:29:0x00c1, B:31:0x00c5, B:33:0x00ce, B:34:0x00d2, B:38:0x00d8, B:40:0x00de, B:42:0x00e2, B:46:0x00e8, B:48:0x00ec, B:50:0x00ee, B:52:0x0120, B:53:0x012b, B:54:0x012d, B:24:0x00af, B:19:0x009e), top: B:62:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:4:0x000b, B:6:0x004d, B:15:0x008d, B:17:0x0097, B:21:0x00a3, B:29:0x00c1, B:31:0x00c5, B:33:0x00ce, B:34:0x00d2, B:38:0x00d8, B:40:0x00de, B:42:0x00e2, B:46:0x00e8, B:48:0x00ec, B:50:0x00ee, B:52:0x0120, B:53:0x012b, B:54:0x012d, B:24:0x00af, B:19:0x009e), top: B:62:0x000b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(int r21, int r22, com.ss.android.vesdk.filterparam.VEBaseFilterParam r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJFF(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam, int, int):int");
    }

    public final int LJJI(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, float[] fArr, EnumC1464490oDH enumC1464490oDH) {
        synchronized (this) {
            try {
                TEPerfStatsInvoker.nativeReset(1);
                this.LLLFFI = System.currentTimeMillis();
                this.LLLFZ = System.currentTimeMillis();
                C2484209oO.LJI("VEEditor", "init2...");
                int iInitImageEditor = this.LLJLLIL.initImageEditor(bitmapArr, iArr, iArr2, null, null, null, null, null, fArr, null, enumC1464490oDH.ordinal());
                if (iInitImageEditor != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Create Scene failed, ret = ");
                    sbLIZ.append(iInitImageEditor);
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLLILZJ = false;
                    return iInitImageEditor;
                }
                this.LLLILZJ = true;
                VEEditorResManager vEEditorResManager = this.LLILZLL;
                vEEditorResManager.mReverseDone = false;
                this.LLLIILIL = enumC1464490oDH;
                vEEditorResManager.mAudioPaths = null;
                vEEditorResManager.mTransitions = null;
                this.LLILZ.getClass();
                Boolean bool = false;
                this.LLJLILLLLZIIL = bool;
                if (bool.booleanValue()) {
                    this.LLILZLL.mOriginalSoundTrackType = 1;
                } else {
                    this.LLILZLL.mOriginalSoundTrackType = 0;
                }
                this.LLILZLL.mOriginalSoundTrackIndex = 0;
                this.LLJLL = 0;
                this.LLILZ.LIZ();
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJJ(float f, float f2, float f3, int i, int i2) {
        C1404320meE c1404320meE = new C1404320meE();
        c1404320meE.LIZ(f, "iesve_veeditor_video_scale_width");
        c1404320meE.LIZ(f2, "iesve_veeditor_video_scale_heigh");
        this.LLLLIL = f3;
        this.LLLLILI = f2;
        this.LLLLJ = f2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisplayState... ");
        sbLIZ.append(f);
        sbLIZ.append(" ");
        sbLIZ.append(f2);
        sbLIZ.append(" ");
        sbLIZ.append(f3);
        sbLIZ.append(" ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(i2);
        sbLIZ.append(" ");
        sbLIZ.append(0);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scaleW", String.valueOf(f));
                jSONObject.put("scaleH", String.valueOf(f2));
                jSONObject.put("degree", String.valueOf(f3));
                jSONObject.put("transX", String.valueOf(i));
                jSONObject.put("transY", String.valueOf(i2));
                b.LIZIZ("vesdk_event_editor_scale_rotate_trans", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJLLIL.setDisplayState(f, f2, f3, 0.0f, i, i2, 0);
    }

    public static VEEditor LJIJ(VEEditorResManager vEEditorResManager, VETimelineParams vETimelineParams, VEVideoEncodeSettings vEVideoEncodeSettings, int i, int i2, C1DOH c1doh) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("genReverseVideo2 with param:startTime:");
        sbLIZ.append(i);
        sbLIZ.append("endTime:");
        sbLIZ.append(i2);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        float[] fArr = new float[vETimelineParams.speed.length];
        int i3 = 0;
        while (true) {
            double[] dArr = vETimelineParams.speed;
            if (i3 >= dArr.length) {
                break;
            }
            fArr[i3] = (float) dArr[i3];
            i3++;
        }
        VEEditor vEEditor = new VEEditor(vEEditorResManager.getWorkspace());
        int iLJJIFFI = vEEditor.LJJIFFI(vETimelineParams.videoFilePaths, vETimelineParams.vTrimIn, vETimelineParams.vTrimOut, null, vETimelineParams.audioFilePaths, vETimelineParams.aTrimIn, vETimelineParams.aTrimOut, fArr, fArr, vETimelineParams.rotate, EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL);
        if (iLJJIFFI != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("genReverseVideo2 init2 error:");
            sbLIZ2.append(iLJJIFFI);
            C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        SET_RANGE_MODE set_range_mode = SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED;
        C2255151DOn c2255151DOn = vEEditor.LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                c2255151DOn.LIZIZ.setTimeRange(i, i2, set_range_mode.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJI(vEEditor, vEEditorResManager, vEVideoEncodeSettings, c1doh);
        return vEEditor;
    }

    public static int LIZLLL(String str, String str2, int i, int i2, long j, long j2, String str3, int i3, final C1465880oFW c1465880oFW, final C1465870oFV c1465870oFV) {
        final int i4;
        TEVideoUtils.CompileProbeListener compileProbeListener;
        TEVideoUtils.CompileProbeListener2 compileProbeListener2;
        int iIntValue;
        C1780100wQK c1780100wQK = new C1780100wQK(2);
        c1780100wQK.LIZIZ.externalSettingsJsonStr = str3;
        final VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = c1780100wQK.LIZ();
        VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
        VEConfigCenter.DataType dataType = VEConfigCenter.DataType.BOOLEAN;
        VEConfigCenter.ValuePkt value = vEConfigCenter.getValue("use_byte264", dataType, Boolean.FALSE);
        VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("compile_probe_use_byte264", dataType, Boolean.TRUE);
        VEConfigCenter.ValuePkt value3 = VEConfigCenter.getInstance().getValue("compile_probe_crf", VEConfigCenter.DataType.INTEGER, -1);
        if (value3 != null && value3.getValue() != null && (value3.getValue() instanceof Integer) && (iIntValue = ((Integer) value3.getValue()).intValue()) > 0) {
            vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf = iIntValue;
        }
        if (value != null && value.getValue() != null && ((Boolean) value.getValue()).booleanValue()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (value2 != null && value2.getValue() != null && !((Boolean) value2.getValue()).booleanValue()) {
            i4 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KEY_USE_BYTE264= ");
        sbLIZ.append(((Boolean) value.getValue()).booleanValue());
        sbLIZ.append("KEY_COMPILE_PROBE_USE_BYTE264= ");
        sbLIZ.append(((Boolean) value2.getValue()).booleanValue());
        sbLIZ.append("tempValue= ");
        sbLIZ.append(i4);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        if (c1465870oFV != null) {
            compileProbeListener2 = new TEVideoUtils.CompileProbeListener2() { // from class: X.0wK9
                /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onCompileProbeResult2(int r19, int r20, float r21, float r22, int r23, int r24, int r25, int r26, float r27) {
                    /*
                        r18 = this;
                        r7 = r22
                        r5 = r18
                        X.0oFo r0 = r1
                        if (r0 == 0) goto L5f
                        r11 = r25
                        r12 = r26
                        int r1 = java.lang.Math.min(r11, r12)
                        r0 = 716(0x2cc, float:1.003E-42)
                        if (r1 <= r0) goto L7e
                        r0 = 724(0x2d4, float:1.015E-42)
                        if (r1 >= r0) goto L60
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
                        long r0 = r0.mBitrate
                        float r7 = (float) r0
                    L23:
                        r0 = 0
                        int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                        if (r0 <= 0) goto L2b
                        r0 = 1148846080(0x447a0000, float:1000.0)
                        float r7 = r7 / r0
                    L2b:
                        X.0oFo r3 = r1
                        int r8 = r3
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
                        int r14 = r0.mCrf
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
                        int r2 = r0.mGop
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
                        double r0 = r0.mQPOffset
                        r13 = r27
                        r10 = r24
                        r9 = r23
                        r6 = r21
                        r5 = r20
                        r4 = r19
                        r15 = r2
                        r16 = r0
                        r3.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    L5f:
                        return
                    L60:
                        r0 = 1076(0x434, float:1.508E-42)
                        if (r1 <= r0) goto L7e
                        r0 = 1084(0x43c, float:1.519E-42)
                        if (r1 >= r0) goto L23
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
                        long r3 = r0.mBitrate
                        double r1 = (double) r3
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
                        double r3 = r0.mFullHd_bitrate_ratio
                        goto L9b
                    L7e:
                        r0 = 572(0x23c, float:8.02E-43)
                        if (r1 <= r0) goto L23
                        r0 = 580(0x244, float:8.13E-43)
                        if (r1 >= r0) goto L23
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
                        long r3 = r0.mBitrate
                        double r1 = (double) r3
                        com.ss.android.vesdk.VEVideoEncodeSettings r0 = r2
                        com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
                        com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
                        double r3 = r0.mSd_bitrate_ratio
                    L9b:
                        double r1 = r1 * r3
                        float r7 = (float) r1
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1776270wK9.onCompileProbeResult2(int, int, float, float, int, int, int, int, float):void");
                }
            };
            compileProbeListener = null;
        } else {
            if (c1465880oFW != null) {
                compileProbeListener = new TEVideoUtils.CompileProbeListener() { // from class: X.0wKA
                    @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener
                    public final void onCompileProbeResult(int i5, int i6, float f, int i7, int i8, int i9, int i10, float f2) {
                        InterfaceC1466070oFp interfaceC1466070oFp = c1465880oFW;
                        if (interfaceC1466070oFp != null) {
                            interfaceC1466070oFp.LIZ(i5, i6, f, i4, i7, i8, i9, i10, f2, vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                        }
                    }
                };
                compileProbeListener2 = null;
            }
            return -100;
        }
        VEVideoCompileEncodeSettings videoCompileEncodeSetting = vEVideoEncodeSettingsLIZ.getVideoCompileEncodeSetting();
        if (videoCompileEncodeSetting.useHWEncoder && i3 == 1) {
            C2484209oO.LJIIIIZZ("VEEditor", "compile use hard encode, not soft encode");
            return -100;
        }
        if (str2 != null && !str2.isEmpty()) {
            C0VSJ c0vsj = new C0VSJ(str2);
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("/probe/");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (!new C0VSJ(strLIZIZ).exists() && !VEFileUtils.mkdir(strLIZIZ)) {
                    C2484209oO.LJIIIIZZ("VEEditor", "create probeDir failed");
                    return -1;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("compile_probe");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = videoCompileEncodeSetting.mSWEncodeSetting;
                TEVideoUtils.nativeCompileProbe(str, strLIZIZ2, i, i2, j, j2, vEVideoSWEncodeSettings.mPreset, vEVideoSWEncodeSettings.mCrf, vEVideoSWEncodeSettings.mGop, vEVideoSWEncodeSettings.mMaxRate, vEVideoSWEncodeSettings.mQPOffset, compileProbeListener, compileProbeListener2, i3);
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ2);
                if (c0vsj2.exists()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("delete file: ");
                    sbLIZ4.append(strLIZIZ2);
                    C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                    c0vsj2.delete();
                }
                return 0;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("savepath is not exist, savepath: ");
            sbLIZ5.append(str2);
            C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ5));
            return -1;
        }
        C2484209oO.LJIIIIZZ("VEEditor", "savepath is null or savepath is empty");
        return -100;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0165 A[Catch: all -> 0x01b8, TryCatch #1 {all -> 0x01b8, blocks: (B:5:0x0006, B:10:0x005c, B:11:0x0060, B:15:0x006b, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:21:0x0083, B:22:0x0087, B:24:0x008e, B:25:0x0092, B:27:0x0099, B:28:0x009d, B:30:0x00a5, B:31:0x00a9, B:33:0x00b0, B:34:0x00b4, B:36:0x00bb, B:37:0x00bf, B:46:0x013b, B:57:0x0165, B:58:0x0178, B:60:0x017a, B:62:0x018f, B:66:0x0195, B:68:0x01a1, B:69:0x01a5, B:70:0x01b0, B:72:0x01b2, B:55:0x0160), top: B:80:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[Catch: all -> 0x01b8, TryCatch #1 {all -> 0x01b8, blocks: (B:5:0x0006, B:10:0x005c, B:11:0x0060, B:15:0x006b, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:21:0x0083, B:22:0x0087, B:24:0x008e, B:25:0x0092, B:27:0x0099, B:28:0x009d, B:30:0x00a5, B:31:0x00a9, B:33:0x00b0, B:34:0x00b4, B:36:0x00bb, B:37:0x00bf, B:46:0x013b, B:57:0x0165, B:58:0x0178, B:60:0x017a, B:62:0x018f, B:66:0x0195, B:68:0x01a1, B:69:0x01a5, B:70:0x01b0, B:72:0x01b2, B:55:0x0160), top: B:80:0x0006 }] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIFFI(java.lang.String[] r28, int[] r29, int[] r30, java.lang.String[] r31, java.lang.String[] r32, int[] r33, int[] r34, float[] r35, float[] r36, com.ss.android.vesdk.ROTATE_DEGREE[] r37, X.EnumC1464490oDH r38) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.LJJIFFI(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], float[], com.ss.android.vesdk.ROTATE_DEGREE[], X.0oDH):int");
    }

    public final int LJI(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        float trackVolume;
        boolean z;
        C2484209oO.LJI("VEEditor", "changeResWithEffect in...");
        if (strArr.length != 0 && zArr.length == strArr.length) {
            int iStop = this.LLJLLIL.stop();
            if (iStop != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stop in changeResWithEffect failed, ret = ");
                sbLIZ.append(iStop);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                return -1;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeResWithEffect clear reverse before, mOriginalSoundTrackType = ");
            sbLIZ2.append(this.LLILZLL.mOriginalSoundTrackType);
            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
            VEEditorResManager vEEditorResManager = this.LLILZLL;
            if (vEEditorResManager.mReverseDone && vEEditorResManager.mReverseAudioDone && vEEditorResManager.mReverseAudioPaths != null && vEEditorResManager.mOriginalSoundTrackType == 1) {
                int i = vEEditorResManager.mOriginalSoundTrackIndex;
                C2255151DOn c2255151DOn = this.LLILZIL;
                c2255151DOn.getClass();
                C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", "getVolume...");
                if (c2255151DOn.LIZIZ.getDuration() < 0) {
                    trackVolume = -100.0f;
                } else {
                    trackVolume = c2255151DOn.LIZIZ.getTrackVolume(1, c2255151DOn.LIZ.LLJJIJI.LIZIZ(1, i), 0);
                }
                int i2 = this.LLILZLL.mOriginalSoundTrackIndex;
                C2255151DOn c2255151DOn2 = this.LLILZIL;
                synchronized (c2255151DOn2.LIZ) {
                    try {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("deleteAudioTrack... trackIndex:");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(" needPrepare:");
                        sbLIZ3.append(false);
                        C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                        if (i2 >= 0) {
                            int iLIZIZ = c2255151DOn2.LIZ.LLJJIJI.LIZIZ(1, i2);
                            ((ArrayList) c2255151DOn2.LIZ.LLJJIJI.LIZJ).remove(Integer.valueOf(i2));
                            c2255151DOn2.LIZIZ.deleteAudioTrack(iLIZIZ, false);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LLILZLL.mOriginalSoundTrackIndex = 0;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("changeResWithEffect remove org audio track index ");
                sbLIZ4.append(this.LLILZLL.mOriginalSoundTrackIndex);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                trackVolume = -1.0f;
            }
            VEEditorResManager vEEditorResManager2 = this.LLILZLL;
            vEEditorResManager2.mReverseAudioPaths = null;
            vEEditorResManager2.mReverseVideoPath = null;
            vEEditorResManager2.mReverseDone = false;
            vEEditorResManager2.mReverseAudioDone = false;
            if (strArr3 != null && strArr3.length != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.LLJLILLLLZIIL = boolValueOf;
            if (boolValueOf.booleanValue()) {
                this.LLILZLL.mOriginalSoundTrackType = 1;
            } else {
                this.LLILZLL.mOriginalSoundTrackType = 0;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("changeResWithEffect clear reverse after, mOriginalSoundTrackType = ");
            sbLIZ5.append(this.LLILZLL.mOriginalSoundTrackType);
            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ5));
            VEEditorResManager vEEditorResManager3 = this.LLILZLL;
            vEEditorResManager3.mVideoPaths = strArr;
            vEEditorResManager3.mAudioPaths = strArr3;
            int iChangeResWithEffect = this.LLJLLIL.changeResWithEffect(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, ROTATE_DEGREE.toIntArray(rotate_degreeArr));
            if (iChangeResWithEffect != 0) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("updateRes in changeResWithEffect failed, ret = ");
                sbLIZ6.append(iChangeResWithEffect);
                C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ6));
                return iChangeResWithEffect;
            }
            this.LLJLLIL.createTimeline();
            int iPrepareEngine = this.LLJLLIL.prepareEngine(0);
            if (trackVolume >= 0.0f) {
                VEEditorResManager vEEditorResManager4 = this.LLILZLL;
                LJJJJJ(trackVolume, vEEditorResManager4.mOriginalSoundTrackIndex, vEEditorResManager4.mOriginalSoundTrackType);
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("changeResWithEffect done，mInitSize.width = ");
            sbLIZ7.append(this.LLIZ.width);
            sbLIZ7.append(", mInitSize.height = ");
            sbLIZ7.append(this.LLIZ.height);
            sbLIZ7.append(", ret = ");
            sbLIZ7.append(iPrepareEngine);
            C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ7));
            return iPrepareEngine;
        }
        return -100;
    }
}
