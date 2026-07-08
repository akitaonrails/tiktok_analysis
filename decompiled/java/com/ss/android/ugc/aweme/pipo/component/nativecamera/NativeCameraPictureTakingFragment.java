package com.ss.android.ugc.aweme.pipo.component.nativecamera;

import X.C089E;
import X.C098200Yq;
import X.C0WZX;
import X.C1289540jf6;
import X.C1305760k5G;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14WP;
import X.C14WQ;
import X.C14WV;
import X.C14WX;
import X.C14WY;
import X.C1685300txQ;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20295514bB;
import X.C20295914bF;
import X.C2204961BRm;
import X.C416170GTn;
import X.C786410Ut5;
import X.C838410Wul;
import X.C985403tE;
import X.EnumC20295414bA;
import X.EnumC20295614bC;
import Y.ACListenerS132S0200000_30;
import Y.ACListenerS164S0100000_30;
import Y.ARunnableS99S0200000_30;
import Y.ATListenerS462S0100000_30;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS111S0201000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class NativeCameraPictureTakingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyohOSA9LSs4ZyEyPCHELIOSw6LCwyJSA+KGEdKTElPyoQKSgpOy4DISY4PD02HCQnICE0DjctLiI2JjE=";
    public EnumC20295414bA LLIZ = EnumC20295414bA.LL;
    public final HandlerThread LLIZLLLIL;
    public final BPEAHandler LLJ;
    public CameraDevice LLJI;
    public CameraManager LLJIJIL;
    public String LLJILJIL;
    public ImageReader LLJILJILJ;
    public C1289540jf6 LLJILLL;
    public Surface LLJJ;
    public CameraCaptureSession LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public EnumC20295614bC LLJJIJIL;
    public int LLJJJ;
    public ConstraintLayout LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public ImageView LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public Rect LLJJLIIIJLLLLLLLZ;
    public AwS574S0100000_30 LLJL;
    public AwS574S0100000_30 LLJLIL;
    public ScaleGestureDetector LLJLILLLLZIIL;
    public C14WV LLJLL;
    public long LLJLLIL;
    public boolean LLJLLL;
    public final C20295914bF LLJZ;
    public final C14WX LLJZIJLIL;
    public final C14WY LLL;
    public final C20295514bB LLLF;

    public final void SR() {
        try {
            CameraDevice cameraDevice = this.LLJI;
            if (cameraDevice != null) {
                C1305760k5G.LIZ(cameraDevice, CertProviderManagerKt.findCert("bpea-ecom_ocr_close_camera", 1476788484));
            }
            this.LLJI = null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            ZR(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment.UR():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment.WR():void");
    }

    public final void aS() {
        CaptureRequest.Builder builderCreateCaptureRequest;
        ImageReader imageReader;
        int i;
        WindowManager windowManager;
        Display displayLLILZIL;
        try {
            CameraDevice cameraDevice = this.LLJI;
            builderCreateCaptureRequest = cameraDevice != null ? cameraDevice.createCaptureRequest(2) : null;
            imageReader = this.LLJILJILJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            ZR(e);
            return;
        }
        if (imageReader != null) {
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.addTarget(imageReader.getSurface());
            }
            CameraManager cameraManager = this.LLJIJIL;
            if (cameraManager != null) {
                if (builderCreateCaptureRequest != null) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    String str = this.LLJILJIL;
                    C19EG activity = getActivity();
                    int rotation = (activity == null || (windowManager = activity.getWindowManager()) == null || (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3z2byM80K/EaZKUQk1FunmYd3efJQTr676XorrGjqI+oLD9/SSEd0WODYRJ7u0iQRVEp5n7AuD0=", null))) == null) ? 0 : displayLLILZIL.getRotation();
                    try {
                        Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_ORIENTATION);
                        int iIntValue = num != null ? num.intValue() : 0;
                        SparseIntArray sparseIntArray = new SparseIntArray(4);
                        sparseIntArray.append(0, 90);
                        sparseIntArray.append(1, 0);
                        sparseIntArray.append(2, 270);
                        sparseIntArray.append(3, 180);
                        i = ((sparseIntArray.get(rotation) + iIntValue) + 270) % 360;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        i = 0;
                    }
                    builderCreateCaptureRequest.set(key, Integer.valueOf(i));
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AWB_MODE, 1);
                    builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, C416170GTn.LIZ(this.LLJJL, this.LLJJJJLIIL, this.LLJJLIIIJLLLLLLLZ));
                }
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
                ZR(e);
                return;
            }
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AWB_MODE, 1);
                builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, C416170GTn.LIZ(this.LLJJL, this.LLJJJJLIIL, this.LLJJLIIIJLLLLLLLZ));
            }
            int iOrdinal = this.LLJJIJIL.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                        builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
                    }
                } else if (builderCreateCaptureRequest != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                }
            } else if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            }
            imageReader.setOnImageAvailableListener(this.LLL, this.LLJ);
            if (builderCreateCaptureRequest != null) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                CameraCaptureSession cameraCaptureSession = this.LLJJI;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.stopRepeating();
                }
                CameraCaptureSession cameraCaptureSession2 = this.LLJJI;
                if (cameraCaptureSession2 != null) {
                    cameraCaptureSession2.capture(builderCreateCaptureRequest.build(), null, null);
                }
            }
        }
    }

    public final void bS() {
        CaptureRequest.Builder builderCreateCaptureRequest;
        try {
            Surface surface = this.LLJJ;
            if (surface != null) {
                CameraDevice cameraDevice = this.LLJI;
                if (cameraDevice != null) {
                    builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
                    if (builderCreateCaptureRequest != null) {
                        builderCreateCaptureRequest.addTarget(surface);
                        builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, C416170GTn.LIZ(this.LLJJL, this.LLJJJJLIIL, this.LLJJLIIIJLLLLLLLZ));
                    }
                } else {
                    builderCreateCaptureRequest = null;
                }
                int iOrdinal = this.LLJJIJIL.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new C1954807lC();
                        }
                        if (builderCreateCaptureRequest == null) {
                            return;
                        }
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                        builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
                    } else if (builderCreateCaptureRequest == null) {
                        return;
                    } else {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    }
                } else if (builderCreateCaptureRequest == null) {
                    return;
                } else {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
                }
                CameraCaptureSession cameraCaptureSession = this.LLJJI;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), this.LLLF, this.LLJ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            ZR(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.14bF] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.14WX] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.14WY] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.14bB] */
    public NativeCameraPictureTakingFragment() {
        HandlerThread handlerThread = new HandlerThread("CameraBgThread");
        handlerThread.start();
        this.LLIZLLLIL = handlerThread;
        this.LLJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LLJILJIL = "";
        boolean z = true;
        if (!Intrinsics.LJFF(C14WP.LLJILJIL.toLowerCase(Locale.ROOT), "back") && C14WP.LLJILJIL.length() != 0) {
            z = false;
        }
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = EnumC20295614bC.LLILLL;
        this.LLJJJJLIIL = 1.0f;
        this.LLJJL = 1.0f;
        this.LLJJLIIIJLLLLLLLZ = new Rect(0, 0, 0, 0);
        this.LLJZ = new CameraCaptureSession.StateCallback() { // from class: X.14bF
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                this.LIZ.ZR(new Exception("Session issue"));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LIZ;
                nativeCameraPictureTakingFragment.LLJJI = cameraCaptureSession;
                nativeCameraPictureTakingFragment.bS();
                this.LIZ.LLJJIII = false;
            }
        };
        this.LLJZIJLIL = new TextureView.SurfaceTextureListener() { // from class: X.14WX
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.SR();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                String string;
                String string2;
                String string3;
                String string4;
                NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LL;
                if (!nativeCameraPictureTakingFragment.LLJLLL) {
                    C14WV c14wv = nativeCameraPictureTakingFragment.LLJLL;
                    if (c14wv != null) {
                        Pair[] pairArr = new Pair[5];
                        String strValueOf = String.valueOf(System.currentTimeMillis() - nativeCameraPictureTakingFragment.LLJLLIL);
                        String str = "";
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        pairArr[0] = new Pair("latency_first_frame_ms", strValueOf);
                        Object obj = c14wv.LIZ().get("current_memory_usage");
                        if (obj == null || (string = obj.toString()) == null) {
                            string = "";
                        }
                        pairArr[1] = new Pair("current_memory_usage", string);
                        Object obj2 = c14wv.LIZ().get("current_cpu_usage");
                        if (obj2 == null || (string2 = obj2.toString()) == null) {
                            string2 = "";
                        }
                        pairArr[2] = new Pair("current_cpu_usage", string2);
                        Object obj3 = c14wv.LIZ().get("peak_memory_usage");
                        if (obj3 == null || (string3 = obj3.toString()) == null) {
                            string3 = "";
                        }
                        pairArr[3] = new Pair("peak_memory_usage", string3);
                        Object obj4 = c14wv.LIZ().get("peak_cpu_usage");
                        if (obj4 != null && (string4 = obj4.toString()) != null) {
                            str = string4;
                        }
                        pairArr[4] = new Pair("peak_cpu_usage", str);
                        C14WU.LIZ("camera_first_frame_shown", C2097608Jq.LJIIIIZZ(pairArr));
                    }
                    this.LL.LLJLLL = true;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                this.LL.WR();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                this.LL.UR();
            }
        };
        this.LLL = new ImageReader.OnImageAvailableListener() { // from class: X.14WY
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LL;
                C786410Ut5.LJJZZIII(nativeCameraPictureTakingFragment.LLJ, new ARunnableS99S0200000_30(imageReader, nativeCameraPictureTakingFragment, 3));
            }
        };
        this.LLLF = new CameraCaptureSession.CaptureCallback() { // from class: X.14bB
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (C20295714bD.LIZ[this.LIZ.LLIZ.ordinal()] == 1) {
                    NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LIZ;
                    nativeCameraPictureTakingFragment.LLIZ = EnumC20295414bA.LL;
                    if (nativeCameraPictureTakingFragment.LLJJIJIL == EnumC20295614bC.LLILLL) {
                        nativeCameraPictureTakingFragment.aS();
                        return;
                    }
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num == null) {
                        return;
                    }
                    if (num.intValue() != 2 && num.intValue() != 4) {
                        return;
                    }
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C01UG(this.LIZ, null), 3);
                }
            }
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        SR();
        this.LLIZLLLIL.quit();
        CameraCaptureSession cameraCaptureSession = this.LLJJI;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        Surface surface = this.LLJJ;
        if (surface != null) {
            surface.release();
        }
        this.LLJ.getLooper().quit();
        ImageReader imageReader = this.LLJILJILJ;
        if (imageReader != null) {
            imageReader.close();
        }
        this.LLIZ = EnumC20295414bA.LL;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SR();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            C19EG activity = getActivity();
            if (activity != null) {
                if (C838410Wul.LIZ(activity, "android.permission.CAMERA") == 0) {
                    try {
                        this.LLJLLIL = System.currentTimeMillis();
                        View view = getView();
                        C1289540jf6 c1289540jf6 = view != null ? (C1289540jf6) view.findViewById(R.id.qji) : null;
                        this.LLJILLL = c1289540jf6;
                        if (c1289540jf6 != null) {
                            c1289540jf6.setOnTouchListener(new ATListenerS462S0100000_30(this, 2));
                            if (c1289540jf6.isAvailable()) {
                                WR();
                            } else {
                                c1289540jf6.setSurfaceTextureListener(this.LLJZIJLIL);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        ZR(e);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            String str = C14WP.LLILZ;
            C14WQ.LIZ(-6, e2);
        }
        super.onResume();
    }

    public final void ZR(Exception exc) {
        if (isAdded()) {
            C19EG activity = getActivity();
            if ((activity != null && activity.isFinishing()) || getContext() == null) {
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(getContext());
            c1397580mTM.LIZ(2131848597);
            C985403tE.LIZ(c1397580mTM, new AwS111S0201000_30(this, exc, 2));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ScaleGestureDetector scaleGestureDetector;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            scaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: X.14bE
                @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
                public final boolean onScale(ScaleGestureDetector scaleGestureDetector2) {
                    this.LL.LLJJL *= scaleGestureDetector2.getScaleFactor();
                    NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = this.LL;
                    nativeCameraPictureTakingFragment.LLJJL = C13LZ.LIZLLL(nativeCameraPictureTakingFragment.LLJJL, 1.0f, nativeCameraPictureTakingFragment.LLJJJJLIIL);
                    this.LL.bS();
                    return true;
                }
            });
        } else {
            scaleGestureDetector = null;
        }
        this.LLJLILLLLZIIL = scaleGestureDetector;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.qjh);
        this.LLJJJIL = constraintLayout;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.qjg);
        this.LLJJJJ = constraintLayout2;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.qje);
        tuxIconView.setBackgroundColor(0);
        C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(this, 14));
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.qj6), new ACListenerS164S0100000_30(this, 15));
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.qj7), new ACListenerS164S0100000_30(this, 16));
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.qj9);
        C786410Ut5.a9(tuxIconView2, new ACListenerS132S0200000_30(tuxIconView2, this, 2));
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.qjc), new ACListenerS164S0100000_30(this, 17));
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.qjf), new ACListenerS164S0100000_30(this, 18));
        this.LLJJJJJIL = (ImageView) view.findViewById(R.id.qjb);
    }

    public static Size VR(Size size, Size size2, CameraCharacteristics cameraCharacteristics) {
        Size[] outputSizes;
        Size size3;
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object next = null;
        if (cameraCharacteristics != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = null;
        }
        if (outputSizes != null) {
            C089E c089e = new C089E(outputSizes);
            while (c089e.hasNext()) {
                Size size4 = (Size) c089e.next();
                if (size4.getWidth() <= size2.getWidth() && size4.getHeight() <= size2.getHeight() && Math.abs((((double) size4.getWidth()) / ((double) size4.getHeight())) - (((double) 4) / ((double) 3))) < 0.1d) {
                    if (size4.getWidth() >= size.getWidth() && size4.getHeight() >= size.getHeight()) {
                        arrayList.add(size4);
                    } else {
                        arrayList2.add(size4);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    Size size5 = (Size) next;
                    int width = size5.getWidth() * size5.getHeight();
                    do {
                        Object next2 = it2.next();
                        Size size6 = (Size) next2;
                        int width2 = size6.getWidth() * size6.getHeight();
                        if (width > width2) {
                            next = next2;
                            width = width2;
                        }
                    } while (it2.hasNext());
                }
            }
            size3 = (Size) next;
        } else if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    Size size7 = (Size) next;
                    int width3 = size7.getWidth() * size7.getHeight();
                    do {
                        Object next3 = it3.next();
                        Size size8 = (Size) next3;
                        int width4 = size8.getWidth() * size8.getHeight();
                        if (width3 < width4) {
                            next = next3;
                            width3 = width4;
                        }
                    } while (it3.hasNext());
                }
            }
            size3 = (Size) next;
        } else {
            if (outputSizes != null) {
                size3 = outputSizes[0];
            }
            return new Size(4, 3);
        }
        if (size3 != null) {
            return size3;
        }
        return new Size(4, 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dwa, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
