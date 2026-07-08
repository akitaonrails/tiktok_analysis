package com.bytedance.android.livesdk.broadcast.preview;

import X.C01GW;
import X.C098200Yq;
import X.C0IJR;
import X.C0J3Y;
import X.C0UU9;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1300690jx5;
import X.C1685300txQ;
import X.C16FV;
import X.C1766560w4U;
import X.C1848410yCV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19I1;
import X.C19I2;
import X.C20441214yg;
import X.C2204961BRm;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C418810GbX;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C786410Ut5;
import X.C838130WuJ;
import Y.ACListenerS165S0100000_31;
import Y.ACListenerS166S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraRetryEvent;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraTypeChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverFlashModeChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverIsFlashSupportedChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverManualFocusEvent;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveCoverCameraFragment extends BaseFragment implements C0UU9, SensorEventListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswHELIOSKTY4Zz8hLTMlLDh9BCw6LAw8PiA+Ci4+LTctDz0yLygpJzs=";
    public View LL;
    public C418810GbX LLILLJJLI;
    public View LLILLL;
    public ImageView LLILZ;
    public C16FV LLILZIL;
    public C19I1 LLILZLL;
    public C16FV LLIZ;
    public LinearLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public LinearLayout LLJI;
    public Uri LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public DataChannel LLJILLL;
    public C19I2 LLJJ;
    public boolean LLJJIII;
    public SensorManager LLJJJ;
    public Sensor LLJJJIL;
    public double LLJJJJ;
    public double LLJJJJJIL;
    public Function0<Unit> LLJJJJLIIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 65));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 116));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 117));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 66));
    public final Object LLJJL = new Object();

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final LinearLayout NR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.d9w) : null;
            this.LLIZLLLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout OR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.d9y) : null;
            this.LLJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ImageView PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.idn) : null;
            this.LLILZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C19I1 RR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wq8) : null;
            this.LLILZLL = (C19I1) viewFindViewById;
        }
        return (C19I1) viewFindViewById;
    }

    public final void SR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.x2y) : null;
            this.LLILLL = viewFindViewById;
        }
        viewFindViewById.startAnimation((Animation) this.LLJJIJIIJIL.getValue());
        Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: X.19I3
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera) throws Throwable {
                byte[] byteArray;
                C19EG activity;
                ContentResolver contentResolver;
                OutputStream outputStreamLJFF;
                int height;
                LiveCoverCameraFragment liveCoverCameraFragment = this.LIZ;
                int width = 0;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray == null) {
                    return;
                }
                C19I2 c19i2 = liveCoverCameraFragment.LLJJ;
                if (c19i2 == null) {
                    c19i2 = null;
                }
                c19i2.getClass();
                Camera.getCameraInfo(c19i2.LIZLLL, new Camera.CameraInfo());
                Matrix matrix = new Matrix();
                matrix.postRotate(r2.orientation);
                if (c19i2.LIZLLL == 1) {
                    matrix.postScale(-1.0f, 1.0f);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                if (liveCoverCameraFragment.getContext() != null) {
                    float fLJFF = C14KS.LJFF() / C14KS.LIZJ(r2);
                    if (liveCoverCameraFragment.RR().LLILLL) {
                        width = (int) ((bitmapCreateBitmap.getWidth() - (bitmapCreateBitmap.getHeight() * fLJFF)) / 2);
                        height = 0;
                        if (width >= 0) {
                        }
                    } else {
                        height = (int) ((bitmapCreateBitmap.getHeight() - (bitmapCreateBitmap.getWidth() / fLJFF)) / 2);
                    }
                    if (height >= 0) {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, width, height, bitmapCreateBitmap.getWidth() - (width * 2), bitmapCreateBitmap.getHeight() - (height * 2));
                    }
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                if (bitmapCreateBitmap == null) {
                    byteArray = null;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(compressFormat, 100, byteArrayOutputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                try {
                    Uri uri = liveCoverCameraFragment.LLJIJIL;
                    if (uri != null && (activity = liveCoverCameraFragment.getActivity()) != null && (contentResolver = activity.getContentResolver()) != null && (outputStreamLJFF = C09NT.LJFF(contentResolver, uri)) != null) {
                        outputStreamLJFF.write(byteArray);
                    }
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("LiveCoverCameraFragment", e);
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJI("LiveCoverCameraFragment", e2);
                }
                liveCoverCameraFragment.LLJJIII = true;
                if (!liveCoverCameraFragment.LLJILJIL && !liveCoverCameraFragment.LLJILJILJ) {
                    Intent intent = new Intent();
                    C19EG activity2 = liveCoverCameraFragment.getActivity();
                    if (activity2 != null) {
                        C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft9O7gmP3cGrqQiZpzfk86EUk+SdIiFGM=", null));
                    }
                    C19EG activity3 = liveCoverCameraFragment.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                        return;
                    }
                    return;
                }
                Function0<Unit> function0 = liveCoverCameraFragment.LLJJJJLIIL;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }
        };
        C19I2 c19i2 = this.LLJJ;
        if ((c19i2 == null ? null : c19i2).LJ) {
            if (c19i2 == null) {
                c19i2 = null;
            }
            try {
                Camera camera = c19i2.LIZJ;
                if (camera != null) {
                    camera.takePicture(null, null, pictureCallback);
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveCoverCameraFragment", e);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            SensorManager sensorManager = this.LLJJJ;
            if (sensorManager == null) {
                sensorManager = null;
            }
            C1300690jx5.LIZJ(sensorManager, this, this.LLJJJIL, 3, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onResume();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.x2x) : null;
            this.LLILLJJLI = (C418810GbX) viewFindViewById;
        }
        viewFindViewById.clearAnimation();
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.x2y) : null;
            this.LLILLL = viewFindViewById2;
        }
        viewFindViewById2.clearAnimation();
        PR().clearAnimation();
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.d9x) : null;
            this.LLILZIL = (C16FV) viewFindViewById3;
        }
        viewFindViewById3.clearAnimation();
        ((Animator) this.LLJJIJI.getValue()).removeAllListeners();
        ((Animation) this.LLJJIJIIJIL.getValue()).cancel();
        ((Animation) this.LLJJIJIL.getValue()).cancel();
        C19I2 c19i2 = this.LLJJ;
        if (c19i2 == null) {
            c19i2 = null;
        }
        ((Handler) c19i2.LJII.getValue()).removeCallbacksAndMessages(null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            SensorManager sensorManager = this.LLJJJ;
            if (sensorManager == null) {
                sensorManager = null;
            }
            C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((AnimatorSet) this.LLJJIJI.getValue()).end();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (C500260Jjc.LJ(getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZJ(false, false);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
            tuxImmersionBarLIZLLL.LJFF(-16777216);
            tuxImmersionBarLIZLLL.LIZIZ.LJII(false);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        SensorManager sensorManager = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/preview/LiveCoverCameraFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft9O7gmP3cGrqQiZpzfk86EUk+SdIiFGM=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z) {
            RR().surfaceDestroyed(RR().getHolder());
            try {
                SensorManager sensorManager2 = this.LLJJJ;
                if (sensorManager2 != null) {
                    sensorManager = sensorManager2;
                }
                C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            RR().surfaceChanged(RR().getHolder(), 1, 0, 0);
            try {
                SensorManager sensorManager3 = this.LLJJJ;
                if (sensorManager3 != null) {
                    sensorManager = sensorManager3;
                }
                C1300690jx5.LIZJ(sensorManager, this, this.LLJJJIL, 3, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLJJIII = false;
        }
        super.onHiddenChanged(z);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        String focusMode;
        synchronized (this.LLJJL) {
            try {
                C19I2 c19i2 = this.LLJJ;
                C19I2 c19i22 = null;
                if (c19i2 == null) {
                    c19i2 = null;
                }
                if (c19i2.LJ && sensorEvent != null && (sensor = sensorEvent.sensor) != null && C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft9O7gmP3cGrqQiZpzfk86EUk+SdIiFGM=", null)) == 1) {
                    C19I2 c19i23 = this.LLJJ;
                    if (c19i23 == null) {
                        c19i23 = null;
                    }
                    Camera.Parameters parametersLIZ = c19i23.LIZ();
                    if (parametersLIZ != null) {
                        focusMode = parametersLIZ.getFocusMode();
                    } else {
                        focusMode = null;
                    }
                    if (Intrinsics.LJFF(focusMode, "continuous-picture")) {
                        return;
                    }
                    double d = ((int) sensorEvent.values[0]) / 9.80665f;
                    double d2 = ((int) r3[1]) / 9.80665f;
                    double d3 = ((int) r3[2]) / 9.80665f;
                    double dSqrt = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
                    double d4 = this.LLJJJJ;
                    this.LLJJJJ = dSqrt;
                    double d5 = (this.LLJJJJJIL * ((double) 0.9f)) + (dSqrt - d4);
                    this.LLJJJJJIL = d5;
                    if (d5 > 0.03d) {
                        C19I2 c19i24 = this.LLJJ;
                        if (c19i24 == null) {
                            c19i24 = null;
                        }
                        Camera.Parameters parametersLIZ2 = c19i24.LIZ();
                        if (parametersLIZ2 != null) {
                            parametersLIZ2.setFocusMode("continuous-picture");
                        }
                        C19I2 c19i25 = this.LLJJ;
                        if (c19i25 != null) {
                            c19i22 = c19i25;
                        }
                        c19i22.LJ(parametersLIZ2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        Object objJ2;
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.w0v);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C500260Jjc.LJLJL(C497740JfY.LJIJ(), viewFindViewById);
        Parcelable parcelableLJIIIIZZ = C520010KaN.LJIIIIZZ(this, "photoUri");
        if (parcelableLJIIIIZZ instanceof Uri) {
            uri = (Uri) parcelableLJIIIIZZ;
        } else {
            uri = null;
        }
        this.LLJIJIL = uri;
        Boolean boolLJFF = C520010KaN.LJFF(this, "isFromLiveCover", false);
        Boolean bool = Boolean.TRUE;
        this.LLJILJIL = Intrinsics.LJFF(boolLJFF, bool);
        this.LLJILJILJ = Intrinsics.LJFF(C520010KaN.LJFF(this, "isFromMultiGuest", false), bool);
        this.LLJILLL = C0IJR.LIZ(ViewModelProviders.of(this), this);
        Context context = getContext();
        if (context != null) {
            DataChannel dataChannel = this.LLJILLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            this.LLJJ = new C19I2(context, dataChannel, this.LLJILJIL, this.LLJILJILJ);
            C19I1 c19i1RR = RR();
            DataChannel dataChannel2 = this.LLJILLL;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            c19i1RR.LLILLJJLI = dataChannel2;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            dataChannel2.BQ2(this, LiveCoverCameraTypeChannel.class, new AwS611S0100000_32(c19i1RR, 233));
            dataChannel2.BQ2(this, LiveCoverCameraRetryEvent.class, new AwS611S0100000_32(c19i1RR, 234));
            C19I2 c19i2 = this.LLJJ;
            if (c19i2 == null) {
                c19i2 = null;
            }
            c19i1RR.setCameraProxy(c19i2);
            SurfaceHolder holder = c19i1RR.getHolder();
            if (holder != null) {
                holder.addCallback(RR());
            }
            c19i1RR.setCheckFragVisibleCallback(new AwS575S0100000_31(this, 1334));
            DataChannel dataChannel3 = this.LLJILLL;
            if (dataChannel3 == null) {
                dataChannel3 = null;
            }
            dataChannel3.BQ2(this, LiveCoverFlashModeChannel.class, new AwS611S0100000_32(this, 237));
            dataChannel3.BQ2(this, LiveCoverIsFlashSupportedChannel.class, new AwS611S0100000_32(this, 238));
            dataChannel3.BQ2(this, LiveCoverManualFocusEvent.class, new AwS596S0100000_17(this, 294));
            View viewFindViewById2 = this.LLJ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.db0);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJ = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.O7((FrameLayout) viewFindViewById2, new ACListenerS166S0100000_32(this, 51));
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.x2x);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (C418810GbX) viewFindViewById3;
            }
            View.OnClickListener aCListenerS165S0100000_31 = new ACListenerS165S0100000_31(this, 127);
            if (C1848410yCV.LIZ) {
                aCListenerS165S0100000_31 = new f(aCListenerS165S0100000_31);
            }
            a aVar = new a(aCListenerS165S0100000_31);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(viewFindViewById3);
            }
            viewFindViewById3.setOnClickListener(aVar);
            C786410Ut5.I7(new AbS698S0100000_17(this, 4), OR());
            C786410Ut5.R7(NR(), new ACListenerS166S0100000_32(this, 52));
            C19EG activity = getActivity();
            if (activity != null) {
                objJ2 = C786410Ut5.J2(activity, "sensor");
            } else {
                objJ2 = null;
            }
            SensorManager sensorManager = (SensorManager) objJ2;
            this.LLJJJ = sensorManager;
            this.LLJJJIL = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft9O7gmP3cGrqQiZpzfk86EUk+SdIiFGM=", null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.gh7, viewGroup, false, layoutInflater.getContext(), false, 48);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }
}
