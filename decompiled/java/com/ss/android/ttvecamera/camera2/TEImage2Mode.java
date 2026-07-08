package com.ss.android.ttvecamera.camera2;

import X.AbstractC2254741DMy;
import X.C1321640kUs;
import X.C1699800uKo;
import X.C1DJ6;
import X.C1DJG;
import X.C1DN3;
import X.C1DNG;
import X.C1DNM;
import X.C1DNQ;
import X.C1DNX;
import X.C2183321Acc;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2244641CtK;
import X.C2254731DMx;
import X.C386801es;
import X.EnumC2186171AhD;
import X.EnumC2186221AhI;
import X.EnumC2244671CtN;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.camera2.TEImage2Mode;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public final class TEImage2Mode extends AbstractC2254741DMy {
    public long LJJJZ;
    public final HandlerHelper LJJL;
    public final BPEAHandler LJJLI;
    public ImageReader LJJLIIIIJ;
    public ImageReader LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public TotalCaptureResult[] LJJLIIIJJI;
    public TotalCaptureResult LJJLIIIJJIZ;
    public volatile boolean LJJLIIIJL;
    public List<CaptureRequest.Key<?>> LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public boolean LJJLIL;
    public boolean LJJLJ;
    public boolean LJJLJLI;
    public boolean LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public long LJJZZIII;
    public ConditionVariable LJL;
    public int LJLI;
    public int LJLIIIL;
    public long LJLIIL;

    @Override // X.AbstractC2254741DMy
    public final void LJIIIZ() {
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJL.removeCallbacksAndMessages(null);
        BPEAHandler bPEAHandler = this.LJJIIZI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LJJIJIL = 0L;
        this.LJJJZ = 0L;
        this.LJJLJLI = false;
        this.LJJZ = 0;
        this.LJJIIZ = -1;
        this.LJJLIIIJJIZ = null;
        this.LJJJ = false;
        ImageReader imageReader = this.LJJLIIIIJ;
        if (imageReader != null) {
            imageReader.close();
            this.LJJLIIIIJ = null;
        }
        ImageReader imageReader2 = this.LJJLIIIJ;
        if (imageReader2 != null) {
            imageReader2.close();
            this.LJJLIIIJ = null;
        }
        ((ArrayList) this.LJJJJZ).clear();
        this.LJJJJL = false;
        this.LJJJJLI = false;
        this.LJJLIIIJJI = null;
        this.LIZJ = null;
        super.LJIIIZ();
    }

    @Override // X.AbstractC2254741DMy
    public final int LJIJI() {
        return 4;
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJIJ() {
        throw null;
    }

    @Override // X.AbstractC2254741DMy, X.C1DO2
    public final int LIZIZ() {
        CaptureRequest.Builder builder = this.LIZJ;
        if (builder != null) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            return super.LIZIZ();
        }
        this.LJFF.LIZJ(this.LJIIIZ, this.LJII.LLILLJJLI, -100, "rollbackMeteringSessionRequest : param is null.");
        return -100;
    }

    @Override // X.AbstractC2254741DMy
    public final void LJIIIIZZ() {
        C1DNM c1dnm;
        if (Build.VERSION.SDK_INT >= 28) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkDeferredSurfaceHasReady, mIsSurfaceReady: ");
            sbLIZ.append(this.LJJJJLL);
            sbLIZ.append(", outputs: ");
            sbLIZ.append(((ArrayList) this.LJJJJZ).size());
            C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
            if (((ArrayList) this.LJJJJZ).isEmpty()) {
                this.LJJJJLI = true;
                C2183341Ace.LJ("TEImage2Mode", "checkDeferredSurfaceHasReady, use real surface");
                return;
            }
            try {
                if (!this.LJJJJLL && (c1dnm = this.LJI.LJI) != null && c1dnm.LIZ() != null) {
                    ((OutputConfiguration) ((ArrayList) this.LJJJJZ).get(0)).addSurface(this.LJI.LJI.LIZ());
                    this.LJJJJLL = true;
                    C2183341Ace.LIZLLL("TEImage2Mode", "checkDeferredSurfaceHasReady, deferred surface has ready");
                }
                if (this.LJJJJLI || !this.LJJJJLL) {
                    return;
                }
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJZ);
                this.LJJJJLI = true;
                C2183341Ace.LIZ("TEImage2Mode", "checkDeferredSurfaceHasReady, finalizeOutputConfigurations");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC2254741DMy
    public final void LJIILIIL() throws CameraAccessException {
        if (Build.VERSION.SDK_INT >= 28) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSessionByDeferredSurface, mIsSessionStarted: ");
            sbLIZ.append(this.LJJJJL);
            C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJJJJL) {
                return;
            }
            this.LJJJJL = true;
            this.LJJJJLI = false;
            this.LJJJJLL = false;
            ((ArrayList) this.LJJJJZ).clear();
            List<OutputConfiguration> list = this.LJJJJZ;
            TEFrameSizei tEFrameSizei = this.LJII.LLJJJIL;
            ((ArrayList) list).add(new OutputConfiguration(new Size(tEFrameSizei.width, tEFrameSizei.height), SurfaceTexture.class));
            if (this.LJJLIIIIJ == null) {
                TEFrameSizei tEFrameSizei2 = this.LJII.LLJJJJJIL;
                LJJL(tEFrameSizei2.width, tEFrameSizei2.height);
            }
            if (this.LJJLIIIIJ != null) {
                ((ArrayList) this.LJJJJZ).add(new OutputConfiguration(this.LJJLIIIIJ.getSurface()));
            }
            if (this.LJJLIIIJ != null) {
                ((ArrayList) this.LJJJJZ).add(new OutputConfiguration(this.LJJLIIIJ.getSurface()));
            }
            this.LJJIJL = System.currentTimeMillis();
            LJIIL(null, this.LJJJLL, this.LJII.LLJIJIL ? LJIJ() : this.LJIIJ);
            if (this.LIZLLL == null) {
                LJJJJLL();
            }
            C2183341Ace.LIZLLL("TEImage2Mode", "createSessionByDeferredSurface end");
        }
    }

    @Override // X.AbstractC2254741DMy
    public final int[] LJIIZILJ() {
        ImageReader imageReader = this.LJJLIIIIJ;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.LJJLIIIIJ.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // X.AbstractC2254741DMy
    public final int[] LJJIFFI() {
        ImageReader imageReader = this.LJJLIIIIJ;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.LJJLIIIIJ.getHeight()};
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJIL() throws CameraAccessException {
        boolean z;
        C1321640kUs.LIZ("TEImage2Mode-startPreview");
        this.LJJJ = false;
        Float f = (Float) this.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        int iIntValue = f == null ? 0 : f.intValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lensInfoMinFocusDistance = ");
        sbLIZ.append(iIntValue);
        C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJLIL = iIntValue != 0;
        C1DNM c1dnm = this.LJI.LJI;
        if (this.LJIIIZ == null || c1dnm == null) {
            C2183341Ace.LIZIZ("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        C1DJ6 c1dj6 = this.LJII;
        if (c1dj6.LLLLLLJ) {
            if (c1dj6.LLJJIJI) {
                for (C1DN3 c1dn3 : c1dnm.LIZLLL()) {
                    c1dn3.LJIILL();
                    int i2 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TEImage2Mode", "reallocate st...");
                }
            } else if (c1dnm.LIZIZ() != null) {
                c1dnm.LIZIZ().LJIILL();
                C2183341Ace.LIZLLL("TEImage2Mode", "reallocate st...");
            } else {
                C2183341Ace.LIZIZ("TEImage2Mode", "reallocate st...err");
            }
        }
        int iLJJIJ = super.LJJIJ();
        if (iLJJIJ != 0) {
            return iLJJIJ;
        }
        if (this.LJJLIIIIJ == null) {
            TEFrameSizei tEFrameSizei = this.LJII.LLJJJJJIL;
            LJJL(tEFrameSizei.width, tEFrameSizei.height);
        }
        if (this.LIZJ == null) {
            this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = this.LJIJI;
            if (rect != null) {
                this.LIZJ.set(CaptureRequest.SCALER_CROP_REGION, rect);
            }
        } else {
            this.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.LJIILLIIL));
        }
        ArrayList arrayList = new ArrayList();
        if (this.LJII.LLJJIJI) {
            for (C1DN3 c1dn32 : c1dnm.LIZLLL()) {
                if (c1dn32.LIZJ && !c1dn32.LIZLLL) {
                    arrayList.add(c1dn32.LIZJ());
                }
            }
        } else {
            if (c1dnm.LIZIZ().LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_SURFACE_AND_IMAGE) {
                arrayList.addAll(Arrays.asList(c1dnm.LIZ.LJFF()));
            } else if (c1dnm.LIZIZ().LJIIJJI() == EnumC2186221AhI.PROVIDER_TYPE_MULTI_SURFACE_TEXTURE) {
                arrayList.addAll(Arrays.asList(c1dnm.LIZ.LJI(this.LJII.LLILZ)));
            } else {
                arrayList.add(c1dnm.LIZ());
            }
            if (!this.LJII.LLLIIIL && c1dnm.LIZIZ().LJ() != null && c1dnm.LIZIZ().LJFF() == EnumC2186171AhD.ADD_SURFACE) {
                arrayList.add(c1dnm.LIZIZ().LJ());
            }
        }
        ImageReader imageReader = this.LJJLIIIJ;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LIZJ.addTarget((Surface) it2.next());
        }
        ImageReader imageReader2 = this.LJJLIIIIJ;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        if (this.LJII.LLJJIJI) {
            C1DN3[] c1dn3ArrLIZLLL = c1dnm.LIZLLL();
            for (C1DN3 c1dn33 : c1dn3ArrLIZLLL) {
                if (c1dn33.LIZJ && c1dn33.LIZLLL) {
                    arrayList.add(c1dn33.LIZJ());
                }
            }
        }
        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 4);
        C1DJ6 c1dj62 = this.LJII;
        if (c1dj62.LLLLIILL) {
            if (Build.VERSION.SDK_INT >= 28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.LIZ;
                if (cameraCharacteristics != null && this.LJJLIIIJLJLI == null) {
                    this.LJJLIIIJLJLI = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.LJJLIIIJLJLI;
                if (list != null) {
                    Iterator<CaptureRequest.Key<?>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it3.next().getName())) {
                            this.LJII.LLLLIILL = false;
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("check aeTargetFpsRange is session key: ");
                    sbLIZ2.append(z);
                    sbLIZ2.append(", consume: ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    z = false;
                    int i32 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("check aeTargetFpsRange is session key: ");
                    sbLIZ22.append(z);
                    sbLIZ22.append(", consume: ");
                    sbLIZ22.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ22));
                }
            } else {
                c1dj62.LLLLIILL = false;
            }
        }
        this.LJLIIL = 0L;
        this.LJLIIIL = 0;
        this.LJJZ = 0;
        this.LJJLIIIJILLIZJL = -1;
        int i4 = this.LJII.LLLLIIIILLL;
        this.LJJZZI = i4;
        if (i4 > 0) {
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("release camera metadata threshold: ");
            sbLIZ3.append(this.LJJZZI);
            C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LJJLL = false;
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJIJL = System.currentTimeMillis();
        this.LJJIIJZLJL = LJIL();
        Handler handlerLJIJ = this.LJII.LLJIJIL ? LJIJ() : this.LJIIJ;
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startPreview, mIsSurfaceReady: ");
        sbLIZ4.append(this.LJJJJLL);
        sbLIZ4.append(", outputs: ");
        sbLIZ4.append(((ArrayList) this.LJJJJZ).size());
        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ4));
        if (((ArrayList) this.LJJJJZ).isEmpty()) {
            this.LJJJJL = true;
            this.LIZLLL = null;
            LJIIL(arrayList, this.LJJJLL, handlerLJIJ);
            if (this.LIZLLL == null) {
                LJJJJLL();
            }
        } else if (Build.VERSION.SDK_INT >= 28) {
            if (!this.LJJJJLL) {
                ((OutputConfiguration) ListProtector.get(this.LJJJJZ, 0)).addSurface((Surface) ListProtector.get(arrayList, 0));
                this.LJJJJLL = true;
                C2183341Ace.LIZLLL("TEImage2Mode", "deferred surface has ready");
            }
            if (this.LIZLLL != null) {
                this.LIZLLL.finalizeOutputConfigurations(this.LJJJJZ);
                this.LJJJJLI = true;
                C2183341Ace.LIZLLL("TEImage2Mode", "finalizeOutputConfigurations in startPreview");
                LJJJJ();
            }
        }
        C1321640kUs.LIZIZ();
        return 0;
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJJI() {
        LJJJIL(this.LJII.LLILZ);
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJJJI() {
        LJJJJIZL(this.LJJIIZ);
        return super.LJJJJI();
    }

    public final void LJJJJZ() {
        this.LJJZZIII = System.currentTimeMillis();
        this.LJJLIIIJLLLLLLLZ = 0;
        CaptureRequest.Builder builderLJIIJJI = LJIIJJI();
        if (builderLJIIJJI == null) {
            LJJJLZIJ(-1001, new Exception("capture build is null"));
            return;
        }
        ImageReader imageReader = this.LJJLIIIIJ;
        if (imageReader == null) {
            LJJJLZIJ(-1001, new Exception("image reader is null"));
            return;
        }
        builderLJIIJJI.addTarget(imageReader.getSurface());
        LJJLI(builderLJIIJJI);
        C1699800uKo c1699800uKoLJI = LJI(builderLJIIJJI, new CameraCaptureSession.CaptureCallback() { // from class: X.1DNA
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                TEImage2Mode tEImage2Mode = this.LIZ;
                if (tEImage2Mode.LIZJ == null) {
                    return;
                }
                tEImage2Mode.getClass();
                TEImage2Mode tEImage2Mode2 = this.LIZ;
                tEImage2Mode2.LJJLIIIJJIZ = totalCaptureResult;
                Integer num = (Integer) tEImage2Mode2.LIZJ.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
                Integer num2 = (Integer) this.LIZ.LIZJ.get(CaptureRequest.CONTROL_AF_TRIGGER);
                if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TEImage2Mode", "need cancel ae af trigger");
                    this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    TEImage2Mode tEImage2Mode3 = this.LIZ;
                    C1699800uKo c1699800uKoLJI2 = tEImage2Mode3.LJI(tEImage2Mode3.LIZJ, null, null);
                    if (!c1699800uKoLJI2.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCaptureSequenceCompleted: error = ");
                        sbLIZ.append(c1699800uKoLJI2.LIZIZ);
                        C2183341Ace.LJ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                }
                TEImage2Mode tEImage2Mode4 = this.LIZ;
                tEImage2Mode4.LJJJJJ(tEImage2Mode4.LIZJ);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEImage2Mode", "captureStillPicture, capture failed");
                TEImage2Mode tEImage2Mode = this.LIZ;
                C1DJ6 c1dj6 = tEImage2Mode.LJII;
                if (c1dj6.LLLLLLL) {
                    c1dj6.LLLLLLL = false;
                }
                if (c1dj6.LLIZLLLIL) {
                    c1dj6.LLIZLLLIL = false;
                }
                TEImage2Mode.HandlerHelper handlerHelper = tEImage2Mode.LJJL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Capture failed: ");
                sbLIZ.append(captureFailure.getReason());
                handlerHelper.sendMessage(handlerHelper.obtainMessage(1003, new Exception(C2188811AlT.LIZIZ(sbLIZ))));
                this.LIZ.LJJL.sendEmptyMessage(1002);
            }
        }, this.LJIIJ);
        if (c1699800uKoLJI.LIZ) {
            return;
        }
        LJJJLZIJ(-1001, new Exception(c1699800uKoLJI.LIZIZ));
    }

    public final void LJJJJZI() {
        this.LJJZZIII = System.currentTimeMillis();
        this.LJJLIIIJLLLLLLLZ = 0;
        CaptureRequest.Builder builderLJIIJJI = LJIIJJI();
        if (builderLJIIJJI == null) {
            LJJJLZIJ(-1001, new Exception("capture build is null"));
            return;
        }
        ImageReader imageReader = this.LJJLIIIIJ;
        if (imageReader == null) {
            LJJJLZIJ(-1001, new Exception("image reader is null"));
            return;
        }
        builderLJIIJJI.addTarget(imageReader.getSurface());
        LJJLI(builderLJIIJJI);
        C1699800uKo c1699800uKoLJI = LJI(builderLJIIJJI, new CameraCaptureSession.CaptureCallback() { // from class: X.1DNF
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TEImage2Mode", "onCaptureCompleted, do capture done");
                this.LIZ.LJJL.sendEmptyMessage(1002);
                TEImage2Mode tEImage2Mode = this.LIZ;
                tEImage2Mode.LJJLIIIJJIZ = totalCaptureResult;
                tEImage2Mode.getClass();
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEImage2Mode", "onCaptureCompleted, do capture failed");
                TEImage2Mode tEImage2Mode = this.LIZ;
                C1DJ6 c1dj6 = tEImage2Mode.LJII;
                if (c1dj6.LLLLLLL) {
                    c1dj6.LLLLLLL = false;
                }
                if (c1dj6.LLIZLLLIL) {
                    c1dj6.LLIZLLLIL = false;
                }
                TEImage2Mode.HandlerHelper handlerHelper = tEImage2Mode.LJJL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Capture failed: ");
                sbLIZ.append(captureFailure.getReason());
                handlerHelper.sendMessage(handlerHelper.obtainMessage(1003, new Exception(C2188811AlT.LIZIZ(sbLIZ))));
                this.LIZ.LJJL.sendEmptyMessage(1002);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                if (!this.LIZ.LJII.LLLF.getBoolean("enableShutterSound")) {
                    return;
                }
                this.LIZ.getClass();
                throw null;
            }
        }, null);
        if (c1699800uKoLJI.LIZ) {
            return;
        }
        LJJJLZIJ(-1001, new Exception(c1699800uKoLJI.LIZIZ));
    }

    @Override // X.AbstractC2254741DMy
    public final void LJII() {
        throw null;
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJ() {
        return this.LJJIIZ;
    }

    public class HandlerHelper extends BPEAHandler {
        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatch msg = ");
            sbLIZ.append(message.what);
            C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
            switch (message.what) {
                case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                case 1001:
                    TEImage2Mode.this.LJJJJZI();
                    break;
                case 1002:
                    TEImage2Mode tEImage2Mode = TEImage2Mode.this;
                    C1DJ6 c1dj6 = tEImage2Mode.LJII;
                    if (c1dj6.LLILZ == 0) {
                        CaptureRequest.Builder builder = tEImage2Mode.LIZJ;
                        if (builder == null) {
                            C2183341Ace.LIZIZ("TEImage2Mode", "resetPreviewAfterFlashCapture failed, no builder");
                        } else {
                            int i2 = c1dj6.LLLLILI;
                            if (i2 == 3) {
                                if (tEImage2Mode.LJJJ) {
                                    builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                                    tEImage2Mode.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
                                }
                            } else if (i2 == 2 && tEImage2Mode.LJJLIL) {
                                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                                tEImage2Mode.LJI(tEImage2Mode.LIZJ, null, null);
                            }
                            if (tEImage2Mode.LJJLIL) {
                                tEImage2Mode.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            }
                            tEImage2Mode.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 4);
                            tEImage2Mode.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                            tEImage2Mode.LJJJJJ(tEImage2Mode.LIZJ);
                        }
                    }
                    break;
                case 1003:
                    TEImage2Mode.this.LJJJLZIJ(C386801es.DEFAULT, (Exception) HandlerHook.getMessageObj(message.obj));
                    break;
                case 1004:
                    TEImage2Mode tEImage2Mode2 = TEImage2Mode.this;
                    tEImage2Mode2.LJJJJJ(tEImage2Mode2.LIZJ);
                    break;
                case 1005:
                    TEImage2Mode tEImage2Mode3 = TEImage2Mode.this;
                    Integer num = (Integer) tEImage2Mode3.LIZJ.get(CaptureRequest.CONTROL_AF_TRIGGER);
                    if (num != null && num.intValue() == 1) {
                        C2183341Ace.LIZLLL("TEImage2Mode", "need cancel af trigger");
                        tEImage2Mode3.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        tEImage2Mode3.LJI(tEImage2Mode3.LIZJ, null, null);
                        tEImage2Mode3.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        tEImage2Mode3.LJJJJJ(tEImage2Mode3.LIZJ);
                        break;
                    }
                    break;
                case 1006:
                case 1007:
                    TEImage2Mode.this.LJJJJZ();
                    break;
            }
        }

        public HandlerHelper(Looper looper) {
            super(looper);
        }
    }

    @Override // X.C1DO4
    public final void LIZ(int i) {
        boolean z;
        C1699800uKo c1699800uKoLJJJJJ;
        if (this.LIZJ == null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchFlashMode failed, mode: ");
            sbLIZ.append(i);
            C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i3 = this.LJJIIZ;
        if (i3 != -1 && i3 != 0 && i == 0) {
            z = true;
        } else {
            z = false;
        }
        LJJJJIZL(i);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJL == null) {
                this.LJL = new ConditionVariable();
            }
            this.LJL.close();
            c1699800uKoLJJJJJ = LJJJJJL(this.LIZJ, new CameraCaptureSession.CaptureCallback() { // from class: X.1DNa
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    this.LIZ.LJL.open();
                    int i4 = C2187451AjH.LIZ;
                    C2183341Ace.LIZLLL("TEImage2Mode", "onCaptureCompleted");
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    this.LIZ.LJL.open();
                    int i4 = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEImage2Mode", "set flash failed");
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                    this.LIZ.LJL.open();
                    int i4 = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEImage2Mode", "set flash request abort");
                }
            }, this.LJJLI);
            if (!this.LJL.block(33L)) {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("close flash: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ2.append("ms");
                C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
            }
            LJJJJJ(this.LIZJ);
        } else {
            c1699800uKoLJJJJJ = LJJJJJ(this.LIZJ);
        }
        if (!c1699800uKoLJJJJJ.LIZ) {
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: ");
            sbLIZ3.append(c1699800uKoLJJJJJ.LIZIZ);
            C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
            this.LJFF.LJ(-100, -100, c1699800uKoLJJJJJ.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    @Override // X.AbstractC2254741DMy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Range<java.lang.Integer> LJIIJ(android.util.Range<java.lang.Integer> r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.camera2.TEImage2Mode.LJIIJ(android.util.Range):android.util.Range");
    }

    @Override // X.AbstractC2254741DMy
    public final int LJIILL(C1DJG c1djg) {
        if (this.LJJLIIIJLLLLLLLZ != 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("focus action discard, state = ");
            sbLIZ.append(this.LJJLIIIJLLLLLLLZ);
            C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
            return -108;
        }
        return super.LJIILL(c1djg);
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJIJL(int i) {
        Surface surface;
        CameraCharacteristics cameraCharacteristics;
        Surface surface2;
        CameraCharacteristics cameraCharacteristics2;
        this.LJLI = i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSceneMode: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0) {
            if (this.LJII.LLLLIILL && (cameraCharacteristics2 = this.LIZ) != null) {
                Range<Integer> rangeLJJJLIIL = LJJJLIIL((Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                CaptureRequest.Builder builder = this.LIZJ;
                if (builder != null && rangeLJJJLIIL != null) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeLJJJLIIL);
                    LJJJJJ(this.LIZJ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("apply capture scene: ");
                    sbLIZ2.append(rangeLJJJLIIL);
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            ImageReader imageReader = this.LJJLIIIJ;
            if (imageReader != null && (surface2 = imageReader.getSurface()) != null && surface2.isValid()) {
                CaptureRequest.Builder builder2 = this.LIZJ;
                if (builder2 != null) {
                    try {
                        builder2.removeTarget(surface2);
                        this.LIZJ.addTarget(surface2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                LJJJJJ(this.LIZJ);
                return;
            }
            return;
        }
        if (i == 1) {
            if (this.LJII.LLLLIILL && (cameraCharacteristics = this.LIZ) != null) {
                Range<Integer> rangeLJJJLL = LJJJLL((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                CaptureRequest.Builder builder3 = this.LIZJ;
                if (builder3 != null && rangeLJJJLL != null) {
                    builder3.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeLJJJLL);
                    LJJJJJ(this.LIZJ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("apply record scene: ");
                    sbLIZ3.append(rangeLJJJLL);
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            ImageReader imageReader2 = this.LJJLIIIJ;
            if (imageReader2 != null && (surface = imageReader2.getSurface()) != null && surface.isValid()) {
                CaptureRequest.Builder builder4 = this.LIZJ;
                if (builder4 != null) {
                    try {
                        builder4.removeTarget(surface);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                LJJJJJ(this.LIZJ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("un support scene");
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJJIL(int i) {
        long j;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("takePicture, cameraFacing = ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
        super.LJJJIL(i);
        this.LJJLIIJ = i;
        this.LJJLJLI = false;
        this.LJJZZIII = System.currentTimeMillis();
        if (this.LJJLIIIJ != null && !this.LJJJ) {
            this.LJJLIIIJLLLLLLLZ = 1;
            this.LJJLIIIJL = true;
            C2183341Ace.LIZLLL("TEImage2Mode", "takePicture...use zsl buffer");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("takePicture...flash strategy: ");
        sbLIZ2.append(this.LJII.LLLLILI);
        sbLIZ2.append(", mCameraLightOn: ");
        sbLIZ2.append(this.LJJJ);
        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
        boolean z = this.LJJJ;
        if (z) {
            j = 1600;
        } else {
            j = 800;
        }
        C1DJ6 c1dj6 = this.LJII;
        if (c1dj6.LLILZ == 0) {
            int i3 = c1dj6.LLLLILI;
            if (i3 == 3) {
                if (z) {
                    this.LJJJZ = System.currentTimeMillis();
                    this.LJJLIIIJLLLLLLLZ = 2;
                    this.LJJL.sendEmptyMessageDelayed(1001, j);
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
                    if (this.LJJLIL) {
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.LIZJ.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                        LJI(this.LIZJ, this.LJJJLZIJ, LJIJ());
                        this.LIZJ.setTag(null);
                        this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        C1699800uKo c1699800uKoLJJJJJ = LJJJJJ(this.LIZJ);
                        if (!c1699800uKoLJJJJJ.LIZ) {
                            HandlerHelper handlerHelper = this.LJJL;
                            handlerHelper.sendMessage(handlerHelper.obtainMessage(1003, new Exception(c1699800uKoLJJJJJ.LIZIZ)));
                            return;
                        }
                        return;
                    }
                    this.LJJL.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 300L);
                    return;
                }
                LJJJJZI();
                return;
            }
            if (i3 == 2) {
                if (!z && this.LJJLL) {
                    C2183341Ace.LIZLLL("TEImage2Mode", "af converge, do capture...");
                    LJJJJZI();
                    return;
                }
                this.LJJJZ = System.currentTimeMillis();
                this.LJJLIIIJLLLLLLLZ = 2;
                this.LJJL.sendEmptyMessageDelayed(1001, j);
                if (this.LJJLIL) {
                    this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                this.LIZJ.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                LJI(this.LIZJ, this.LJJJLZIJ, LJIJ());
                this.LIZJ.setTag(null);
                this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                C1699800uKo c1699800uKoLJJJJJ2 = LJJJJJ(this.LIZJ);
                if (c1699800uKoLJJJJJ2.LIZ) {
                    return;
                }
                HandlerHelper handlerHelper2 = this.LJJL;
                handlerHelper2.sendMessage(handlerHelper2.obtainMessage(1003, new Exception(c1699800uKoLJJJJJ2.LIZIZ)));
                return;
            }
            if (i3 == 0) {
                if (!z && this.LJJLL) {
                    C2183341Ace.LIZLLL("TEImage2Mode", "af converge, do capture...");
                    LJJJJZ();
                    return;
                }
                this.LJJJZ = System.currentTimeMillis();
                this.LJJLIIIJLLLLLLLZ = 1;
                this.LJJL.sendEmptyMessageDelayed(1007, j);
                if (this.LJJLIL) {
                    this.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                C1699800uKo c1699800uKoLJI = LJI(this.LIZJ, this.LJJJLZIJ, this.LJIIJ);
                if (c1699800uKoLJI.LIZ) {
                    return;
                }
                HandlerHelper handlerHelper3 = this.LJJL;
                handlerHelper3.sendMessage(handlerHelper3.obtainMessage(1003, new Exception(c1699800uKoLJI.LIZIZ)));
                return;
            }
            if (i3 == 1) {
                this.LJJLIIIJLLLLLLLZ = 1;
                if (z) {
                    this.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.LIZJ.set(CaptureRequest.FLASH_MODE, 2);
                }
                LJJJJZ();
                return;
            }
            this.LJJLIIIJLLLLLLLZ = 1;
            LJJJJZI();
            return;
        }
        this.LJJLIIIJLLLLLLLZ = 1;
        LJJJJZI();
    }

    public final Range<Integer> LJJJLIIL(Range<Integer>[] rangeArr) {
        int i;
        int i2;
        Range<Integer> range = null;
        if (rangeArr != null) {
            C1DJ6 c1dj6 = this.LJII;
            int i3 = 30;
            if (c1dj6 != null && (i2 = c1dj6.LLLLIIL) >= 30) {
                i3 = i2;
            }
            int i4 = 0;
            int i5 = 0;
            for (Range<Integer> range2 : rangeArr) {
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fps: ");
                sbLIZ.append(range2.toString());
                C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                int iIntValue2 = ((Integer) range2.getLower()).intValue();
                if (iIntValue2 < 5) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("discard fps: ");
                    sbLIZ2.append(range2.toString());
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    if (iIntValue > i4) {
                        i4 = iIntValue;
                    }
                    if (iIntValue <= i3 && (i = iIntValue - iIntValue2) > i5) {
                        range = range2;
                        i5 = i;
                    }
                }
            }
        }
        return range;
    }

    public final Range<Integer> LJJJLL(Range<Integer>[] rangeArr) {
        int i;
        Range<Integer> range = null;
        if (rangeArr != null) {
            C1DJ6 c1dj6 = this.LJII;
            int i2 = 30;
            if (c1dj6 != null && (i = c1dj6.LLLLIIL) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                int i5 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fps: ");
                sbLIZ.append(range2.toString());
                C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                if (iIntValue > i3) {
                    i3 = iIntValue;
                }
                if (iIntValue <= i2 && iIntValue == ((Integer) range2.getLower()).intValue() && iIntValue > i4) {
                    range = range2;
                    i4 = iIntValue;
                }
            }
        }
        return range;
    }

    public final void LJJJZ(Image image) {
        int i;
        int width = image.getWidth();
        int height = image.getHeight();
        if (this.LJJLIIJ == 1) {
            i = 270;
        } else {
            i = 90;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on image available, consume: ");
        sbLIZ.append(System.currentTimeMillis() - this.LJJZZIII);
        sbLIZ.append(", size: ");
        sbLIZ.append(width);
        sbLIZ.append("x");
        sbLIZ.append(height);
        sbLIZ.append(", format: ");
        sbLIZ.append(image.getFormat());
        sbLIZ.append(", rotation: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJLI(CaptureRequest.Builder builder) {
        Integer num;
        CaptureRequest.Builder builder2 = this.LIZJ;
        if (builder2 == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TEImage2Mode", "syncPreviewParam failed, no preview builder");
            return;
        }
        Object obj = builder2.get(CaptureRequest.CONTROL_AF_MODE);
        if (obj != null) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, obj);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sync afMode: ");
            sbLIZ.append(obj);
            C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
        }
        Object[] objArr = (Object[]) this.LIZJ.get(CaptureRequest.CONTROL_AE_REGIONS);
        if (objArr != null) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, objArr);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sync aeRect: ");
            sbLIZ2.append(Arrays.toString(objArr));
            C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Object[] objArr2 = (Object[]) this.LIZJ.get(CaptureRequest.CONTROL_AF_REGIONS);
        if (objArr != null) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, objArr2);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sync afRect: ");
            sbLIZ3.append(Arrays.toString(objArr2));
            C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
        }
        CaptureRequest.Builder builder3 = this.LIZJ;
        Integer num2 = (Integer) builder3.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 != null) {
            if (num2.intValue() == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 1);
            } else if (num2.intValue() == 1 && (num = (Integer) builder3.get(CaptureRequest.FLASH_MODE)) != null && num.intValue() == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            }
        }
        Object obj2 = this.LIZJ.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (obj2 != null) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, obj2);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("sync fpsRange: ");
            sbLIZ4.append(obj2);
            C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = this.LJIJI;
            if (rect != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("sync crop region: ");
                sbLIZ5.append(this.LJIJI);
                C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ5));
            }
        } else {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.LJIILLIIL));
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("sync zoom ratio: ");
            sbLIZ6.append(this.LJIILLIIL);
            C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (this.LIZIZ != null) {
            C2244641CtK.LIZ(this.LIZ, builder, EnumC2244671CtN.OFF);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.LJIJ));
    }

    @Override // X.AbstractC2254741DMy
    public final int LJJIIZ(int i, String str) {
        this.LJLI = 0;
        this.LJJLIIIJLJLI = null;
        if (this.LJJIIZ == -1) {
            this.LJJIIZ = 0;
        }
        return super.LJJIIZ(i, str);
    }

    @Override // X.AbstractC2254741DMy
    public final void LJJIJIL(int i, int i2) {
        C1DJ6 c1dj6 = this.LJII;
        c1dj6.LLJLLL = true;
        TEFrameSizei tEFrameSizei = c1dj6.LLJJJJJIL;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        LJIIIZ();
        try {
            LJJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJLZIJ(int i, Exception exc) {
        this.LJJLIIIJLLLLLLLZ = 0;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCaptureFailed, err = ");
        sbLIZ.append(exc);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", facing = ");
        sbLIZ.append(this.LJJLIIJ);
        C2183341Ace.LJ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJL(int i, int i2) {
        int i3;
        TEFrameSizei tEFrameSizeiLJIIIZ;
        C1DJ6 c1dj6 = this.LJII;
        int i4 = 256;
        if (!c1dj6.LLLLLLL && !c1dj6.LLIZLLLIL) {
            i3 = 256;
        } else {
            i3 = 35;
        }
        int i5 = c1dj6.LLJJJJLIIL;
        boolean z = false;
        if (c1dj6.LLJLLL) {
            c1dj6.LLJLLL = false;
            tEFrameSizeiLJIIIZ = c1dj6.LLJJJJJIL;
        } else {
            List<TEFrameSizei> listLJ = C2183321Acc.LJ(LJIJJ(i3));
            C1DJ6 c1dj62 = this.LJII;
            if (c1dj62.LLJLLIL) {
                tEFrameSizeiLJIIIZ = C2183321Acc.LJIIIIZZ(listLJ, c1dj62.LLJJJIL, i5, c1dj62.LLJLL);
            } else {
                if (this.LJIJJ != null) {
                    if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                        int i6 = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TEImage2Mode", "Output SurfaceTexture is not supported");
                        int i7 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select picture size failed...format: ");
                        sbLIZ.append(i3);
                        C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C2183321Acc.LJ(LJIJJLI());
                    try {
                        this.LJIJJ.LJ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i8 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("select pic size from client err: ");
                        sbLIZ2.append(e.getMessage());
                        C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                tEFrameSizeiLJIIIZ = C2183321Acc.LJIIIZ(listLJ, this.LJII.LLJJJIL, new TEFrameSizei(i, i2));
                int i9 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("select pic size is null, get closest size: ");
                sbLIZ3.append(tEFrameSizeiLJIIIZ);
                C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        if (tEFrameSizeiLJIIIZ != null) {
            C1DJ6 c1dj63 = this.LJII;
            c1dj63.LLJJJJJIL = tEFrameSizeiLJIIIZ;
            int width = tEFrameSizeiLJIIIZ.width;
            int height = tEFrameSizeiLJIIIZ.height;
            if (c1dj63.LLIZLLLIL && width <= 4096 && i3 == 35) {
                this.LJJLIIIJJI = new TotalCaptureResult[5];
                ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, i3, 3);
                this.LJJLIIIJ = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.1DNZ
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        Image imageAcquireNextImage = imageReader.acquireNextImage();
                        if (this.LL.LJJLIIIJL) {
                            this.LL.LJJLIIIJL = false;
                            if (imageAcquireNextImage != null) {
                                long timestamp = imageAcquireNextImage.getTimestamp();
                                for (TotalCaptureResult totalCaptureResult : this.LL.LJJLIIIJJI) {
                                    Long l = (Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                                    if (l != null && timestamp >= l.longValue()) {
                                        break;
                                    }
                                }
                                this.LL.LJJJZ(imageAcquireNextImage);
                            } else {
                                this.LL.LJJJLZIJ(C386801es.DEFAULT, new Exception("no image data"));
                                return;
                            }
                        } else if (imageAcquireNextImage == null) {
                            return;
                        }
                        imageAcquireNextImage.close();
                    }
                }, this.LJJLI);
                z = true;
                for (Size size : (ArrayList) LJIJJ(256)) {
                    if (size.getWidth() == width && size.getHeight() == height) {
                        width = size.getWidth();
                        height = size.getHeight();
                        break;
                    }
                }
                this.LJJLIIIJJI = null;
                this.LJJLIIIJ.setOnImageAvailableListener(null, null);
                this.LJJLIIIJ.close();
                this.LJJLIIIJ = null;
                i4 = i3;
            } else {
                i4 = i3;
            }
            this.LJJLIIIIJ = ImageReader.newInstance(width, height, i4, 1);
            int i10 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("image reader width: ");
            sbLIZ4.append(this.LJJLIIIIJ.getWidth());
            sbLIZ4.append(", height = ");
            sbLIZ4.append(this.LJJLIIIIJ.getHeight());
            sbLIZ4.append(", format: ");
            sbLIZ4.append(i4);
            sbLIZ4.append(", maxWidth: ");
            sbLIZ4.append(this.LJII.LLJJJJLIIL);
            sbLIZ4.append(", hasZslYuvSurface: ");
            sbLIZ4.append(z);
            C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ4));
            this.LJJLIIIIJ.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.1DNb
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    Image imageAcquireNextImage = imageReader.acquireNextImage();
                    if (imageAcquireNextImage == null) {
                        this.LL.LJJJLZIJ(C386801es.DEFAULT, new Exception("no image data"));
                        return;
                    }
                    TEImage2Mode tEImage2Mode = this.LL;
                    imageAcquireNextImage.getFormat();
                    tEImage2Mode.LJJJZ(imageAcquireNextImage);
                    this.LL.LJJLIIIJJIZ = null;
                    imageAcquireNextImage.close();
                }
            }, this.LJJLI);
            return;
        }
        int i72 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("select picture size failed...format: ");
        sbLIZ5.append(i3);
        C2183341Ace.LIZIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<android.hardware.camera2.params.OutputConfiguration>] */
    @Override // X.AbstractC2254741DMy
    public final void LJIIL(List list, C1DNG c1dng, final Handler handler) throws CameraAccessException {
        ?? arrayList;
        C1321640kUs.LIZ("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            if (!((ArrayList) this.LJJJJZ).isEmpty()) {
                arrayList = this.LJJJJZ;
            } else {
                arrayList = new ArrayList();
                if (list != null) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new OutputConfiguration((Surface) it2.next()));
                    }
                } else {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEImage2Mode", "create session err, no surface...");
                }
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(LJJII(list), arrayList, new Executor() { // from class: X.1Ack
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    Handler handler2 = handler;
                    if (handler2 != null) {
                        C786410Ut5.LJJZZIII(handler2, runnable);
                    } else {
                        int i2 = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TEImage2Mode", "executor run, handler is null");
                    }
                }
            }, c1dng);
            Range<Integer> rangeLJIIJ = LJIIJ(new Range<>(Integer.valueOf(this.LJJII.min / this.LJII.LLILLL.fpsUnitFactor), Integer.valueOf(this.LJJII.max / this.LJII.LLILLL.fpsUnitFactor)));
            if (this.LIZJ == null) {
                this.LIZJ = this.LJIIIZ.createCaptureRequest(1);
            }
            this.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeLJIIJ);
            LJJJJIZL(this.LJJIIZ);
            sessionConfiguration.setSessionParameters(this.LIZJ.build());
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TEImage2Mode", "createSession by sessionConfiguration");
            this.LJIIIZ.createCaptureSession(sessionConfiguration);
        } else {
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TEImage2Mode", "createSession by normally");
            this.LJIIIZ.createCaptureSession(list, c1dng, handler);
        }
        C1321640kUs.LIZIZ();
    }

    public TEImage2Mode(C2254731DMx c2254731DMx, Context context, CameraManager cameraManager, Handler handler) {
        super(c2254731DMx, context, handler);
        this.LJJLI = new BPEAHandler(Looper.getMainLooper());
        this.LJJLIIIJ = null;
        this.LJJLIIIJILLIZJL = -1;
        this.LJJLIIIJJIZ = null;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = null;
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJLIL = false;
        this.LJJLJ = false;
        this.LJJLJLI = false;
        this.LJJLL = false;
        this.LJJZ = 0;
        this.LJJZZI = 0;
        this.LJJZZIII = 0L;
        this.LJL = null;
        this.LJLI = 0;
        this.LJLIIIL = 0;
        this.LJLIIL = 0L;
        this.LJ = cameraManager;
        if (this.LJII.LLJILJILJ) {
            this.LJIIIIZZ = new C1DNQ(this) { // from class: X.1DNg
                @Override // X.InterfaceC2254801DNe
                public final void LIZIZ(CaptureRequest.Builder builder) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                }
            };
        } else {
            this.LJIIIIZZ = new C1DNX(this);
        }
        this.LJJL = new HandlerHelper(handler.getLooper());
        this.LJJJLZIJ = new CameraCaptureSession.CaptureCallback() { // from class: X.1DN1
            public Integer LIZ = -1;
            public Integer LIZIZ = -1;
            public Integer LIZJ = -1;
            public Integer LIZLLL = -1;

            public final void LIZ(CaptureResult captureResult) {
                int iIntValue;
                boolean z;
                Integer num;
                int i = this.LJ.LJJLIIIJLLLLLLLZ;
                boolean z2 = true;
                if (i != 0) {
                    if (i == 1) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 != null && num2.intValue() == 1) {
                            this.LJ.LJJLJ = true;
                            int i2 = C2187451AjH.LIZ;
                            C2183341Ace.LIZLLL("TEImage2Mode", "ae trigger start...");
                        }
                        if (this.LJ.LJJLJ) {
                            if (num3 != null && num3.intValue() != 2 && num3.intValue() != 4) {
                                z2 = false;
                            } else {
                                this.LJ.LJJLJ = false;
                                int i3 = C2187451AjH.LIZ;
                                C2183341Ace.LIZLLL("TEImage2Mode", "ae converge, is shot can do");
                            }
                            if (!this.LIZLLL.equals(num3)) {
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ae state:");
                                sbLIZ.append(num3);
                                C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            this.LIZLLL = num3;
                            if (z2) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                TEImage2Mode tEImage2Mode = this.LJ;
                                long j = jCurrentTimeMillis - tEImage2Mode.LJJJZ;
                                tEImage2Mode.LJJLIIIJLLLLLLLZ = 0;
                                tEImage2Mode.LJJLJ = false;
                                TEImage2Mode.HandlerHelper handlerHelper = tEImage2Mode.LJJL;
                                if (handlerHelper != null) {
                                    handlerHelper.removeMessages(1007);
                                    this.LJ.LJJL.sendEmptyMessage(1006);
                                    this.LJ.LJJL.sendEmptyMessage(1005);
                                }
                                int i5 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("send-capture-command consume = ");
                                sbLIZ2.append(j);
                                C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                TEImage2Mode tEImage2Mode2 = this.LJ;
                if (numValueOf.intValue() != -1 && numValueOf.intValue() != 2 && numValueOf.intValue() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                tEImage2Mode2.LJJLL = z;
                CaptureRequest.Builder builder = this.LJ.LIZJ;
                if (builder == null || (num = (Integer) builder.get(CaptureRequest.CONTROL_AF_TRIGGER)) == null || num.intValue() != 1) {
                    return;
                }
                if (4 != numValueOf.intValue() && 5 != numValueOf.intValue() && -1 != numValueOf.intValue()) {
                    return;
                }
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                TEImage2Mode.HandlerHelper handlerHelper2 = this.LJ.LJJL;
                if (handlerHelper2 == null) {
                    return;
                }
                handlerHelper2.sendEmptyMessage(1004);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                int iIntValue4;
                C1DNM c1dnm;
                C20188413z0 c20188413z0;
                Long l;
                long jCurrentTimeMillis = System.currentTimeMillis();
                TEImage2Mode tEImage2Mode = this.LJ;
                if (jCurrentTimeMillis - tEImage2Mode.LJLIIL > 1000) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on frame arrived fps: ");
                    sbLIZ.append(this.LJ.LJLIIIL);
                    C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ));
                    TEImage2Mode tEImage2Mode2 = this.LJ;
                    tEImage2Mode2.LJLIIIL = 0;
                    tEImage2Mode2.LJLIIL = jCurrentTimeMillis;
                } else {
                    tEImage2Mode.LJLIIIL++;
                }
                TEImage2Mode tEImage2Mode3 = this.LJ;
                C1DJ6 c1dj6 = tEImage2Mode3.LJII;
                long j = 0;
                if (c1dj6 != null && c1dj6.LLLLLJIL) {
                    TECameraFrame.Metadata metadata = new TECameraFrame.Metadata();
                    float[] fArr = tEImage2Mode3.LJJIIJZLJL;
                    metadata.fovx = fArr[0];
                    metadata.fovy = fArr[1];
                    metadata.zoomRatio = tEImage2Mode3.LJIILLIIL;
                    if (totalCaptureResult != null && (l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null && l.longValue() > 0) {
                        metadata.exposureTime = (int) (l.longValue() / 1000);
                    }
                    C2254731DMx c2254731DMx2 = tEImage2Mode3.LJI;
                    if (c2254731DMx2 != null && (c20188413z0 = c2254731DMx2.LJIJ) != null) {
                        metadata.ambientLight = ((Float) c20188413z0.LIZ(EnumC20188613z2.INSTANT_AMBIENT_LIGHT_LUX)).floatValue();
                    }
                    C2254731DMx c2254731DMx3 = tEImage2Mode3.LJI;
                    if (c2254731DMx3 != null && c2254731DMx3.LJJJJZ == 3 && tEImage2Mode3.LJJJI && (c1dnm = tEImage2Mode3.LJI.LJI) != null) {
                        if (tEImage2Mode3.LJII.LLJJIJI) {
                            C1DN3[] c1dn3ArrLIZLLL = c1dnm.LIZLLL();
                            if (c1dn3ArrLIZLLL != null) {
                                for (C1DN3 c1dn3 : c1dn3ArrLIZLLL) {
                                    c1dn3.LJIIIZ = metadata;
                                }
                            }
                        } else {
                            C1DN3 c1dn3LIZIZ = c1dnm.LIZIZ();
                            if (c1dn3LIZIZ != null) {
                                c1dn3LIZIZ.LJIIIZ = metadata;
                            }
                        }
                    }
                }
                LIZ(totalCaptureResult);
                if (!this.LJ.LJJIJIIJIL) {
                    this.LJ.LJJIIZI();
                    this.LJ.LJJIJIIJIL = true;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    TEImage2Mode tEImage2Mode4 = this.LJ;
                    long j2 = jCurrentTimeMillis2 - tEImage2Mode4.LJJIL;
                    long j3 = tEImage2Mode4.LJJIJIL;
                    if (j3 != 0) {
                        j = jCurrentTimeMillis2 - j3;
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("first preview frame callback arrived! facing = ");
                    sbLIZ2.append(this.LJ.LJII.LLILZ);
                    sbLIZ2.append(" consume = ");
                    sbLIZ2.append(j2);
                    sbLIZ2.append(", session consume: ");
                    sbLIZ2.append(this.LJ.LJJIJLIJ);
                    sbLIZ2.append(", camera whole consume: ");
                    sbLIZ2.append(j);
                    C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ2));
                    C1305710k5B.LIZ(j2, "te_record_camera2_set_repeating_request_cost");
                }
                if (this.LJ.LJJLIIIJLLLLLLLZ == 2) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
                    Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    Integer numValueOf2 = Integer.valueOf(iIntValue2);
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = -1;
                    }
                    Integer numValueOf3 = Integer.valueOf(iIntValue3);
                    if (num4 != null) {
                        iIntValue4 = num4.intValue();
                    } else {
                        iIntValue4 = -1;
                    }
                    Integer numValueOf4 = Integer.valueOf(iIntValue4);
                    if (!this.LIZ.equals(numValueOf) || !this.LIZIZ.equals(numValueOf2) || !this.LIZJ.equals(numValueOf3) || !this.LIZLLL.equals(numValueOf4)) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[afMode=");
                        sbLIZ3.append(numValueOf);
                        sbLIZ3.append(", afState=");
                        sbLIZ3.append(numValueOf2);
                        sbLIZ3.append(",aeMode=");
                        sbLIZ3.append(numValueOf3);
                        sbLIZ3.append(", aeState=");
                        sbLIZ3.append(numValueOf4);
                        sbLIZ3.append(e3.f);
                        C2183341Ace.LIZ("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    this.LIZ = numValueOf;
                    this.LIZIZ = numValueOf2;
                    this.LIZJ = numValueOf3;
                    this.LIZLLL = numValueOf4;
                    if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(totalCaptureResult.getRequest().getTag())) {
                        this.LJ.LJJLJLI = true;
                        int i4 = C2187451AjH.LIZ;
                        C2183341Ace.LIZLLL("TEImage2Mode", "is shot can do");
                    }
                    if (!this.LJ.LJJLJLI) {
                        int i5 = C2187451AjH.LIZ;
                        C2183341Ace.LIZ("TEImage2Mode", "discard previous callback");
                    } else if ((numValueOf2.intValue() == -1 || numValueOf2.intValue() == 4 || numValueOf2.intValue() == 5 || numValueOf2.intValue() == 2) && (numValueOf4.intValue() == -1 || numValueOf4.intValue() == 4 || numValueOf4.intValue() == 2)) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        TEImage2Mode tEImage2Mode5 = this.LJ;
                        long j4 = jCurrentTimeMillis3 - tEImage2Mode5.LJJJZ;
                        tEImage2Mode5.LJJL.removeMessages(1001);
                        this.LJ.LJJL.sendEmptyMessage(LSPassThroughRecordSizeConfig.DEFAULT);
                        this.LJ.LJJLJLI = false;
                        int i6 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("send-capture-command consume = ");
                        sbLIZ4.append(j4);
                        C2183341Ace.LIZLLL("TEImage2Mode", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                TEImage2Mode tEImage2Mode6 = this.LJ;
                int i7 = tEImage2Mode6.LJJZ + 1;
                tEImage2Mode6.LJJZ = i7;
                int i8 = tEImage2Mode6.LJJZZI;
                if (i8 != 0 && i7 > i8) {
                    tEImage2Mode6.LJJZ = 0;
                    Runtime.getRuntime().gc();
                }
                TEImage2Mode tEImage2Mode7 = this.LJ;
                int i9 = tEImage2Mode7.LJJLIIIJILLIZJL + 1;
                tEImage2Mode7.LJJLIIIJILLIZJL = i9;
                if (i9 % 5 == 0) {
                    tEImage2Mode7.LJJLIIIJILLIZJL = 0;
                }
                TotalCaptureResult[] totalCaptureResultArr = tEImage2Mode7.LJJLIIIJJI;
                if (totalCaptureResultArr != null) {
                    totalCaptureResultArr[tEImage2Mode7.LJJLIIIJILLIZJL] = totalCaptureResult;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                if (this.LJ.LJJLIIIJLLLLLLLZ == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    this.LJ.LJJLJLI = true;
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEImage2Mode", "onCaptureFailed: ");
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                LIZ(captureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                if (this.LJ.LJJLIIIJLLLLLLLZ == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    this.LJ.LJJLJLI = true;
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEImage2Mode", "onCaptureBufferLost: ");
                }
            }
        };
    }
}
