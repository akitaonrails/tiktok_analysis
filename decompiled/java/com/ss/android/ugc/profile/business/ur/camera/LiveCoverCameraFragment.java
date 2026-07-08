package com.ss.android.ugc.profile.business.ur.camera;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1300690jx5;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C1910890zpH;
import X.C19EG;
import X.C19GS;
import X.C21514619Hs;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import X.C838130WuJ;
import X.SurfaceHolderCallbackC21514919Hv;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS143S0100000_8;
import Y.ACListenerS166S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment;
import com.ss.android.ugc.profile.business.ur.camera.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS711S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveCoverCameraFragment extends BaseFragment implements SensorEventListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiKi4+LTctZwM6PiAPJjk2OgYtJCohKQM+KCg+LSs4";
    public Uri LLIZ;
    public DataChannel LLIZLLLIL;
    public C21514619Hs LLJ;
    public boolean LLJIJIL;
    public SensorManager LLJJI;
    public Sensor LLJJIII;
    public double LLJJIJI;
    public double LLJJIJIIJIL;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 374));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 882));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 378));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 375));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(122));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 379));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 373));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 380));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 376));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 371));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 372));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 369));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 370));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 377));

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void SR() {
        View view = (View) this.LLJJJIL.getValue();
        if (view != null) {
            view.startAnimation((Animation) this.LLJILJILJ.getValue());
        }
        Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: X.19Hw
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera) throws Throwable {
                byte[] byteArray;
                C19EG activity;
                ContentResolver contentResolver;
                OutputStream outputStreamLJFF;
                Context context;
                int height;
                LiveCoverCameraFragment liveCoverCameraFragment = this.LIZ;
                int width = 0;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray == null) {
                    return;
                }
                C21514619Hs c21514619Hs = liveCoverCameraFragment.LLJ;
                if (c21514619Hs != null) {
                    Camera.getCameraInfo(c21514619Hs.LIZLLL, new Camera.CameraInfo());
                    Matrix matrix = new Matrix();
                    matrix.postRotate(r1.orientation);
                    if (c21514619Hs.LIZLLL == 1) {
                        matrix.postScale(-1.0f, 1.0f);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                    if (bitmapCreateBitmap != null) {
                        bitmapDecodeByteArray = bitmapCreateBitmap;
                    }
                }
                SurfaceHolderCallbackC21514919Hv surfaceHolderCallbackC21514919Hv = (SurfaceHolderCallbackC21514919Hv) liveCoverCameraFragment.LLJL.getValue();
                if (surfaceHolderCallbackC21514919Hv != null && (context = liveCoverCameraFragment.getContext()) != null) {
                    C0IKF.LIZ.getClass();
                    Rect rectLIZ = C465320IMo.LIZ().LIZIZ(context).LIZ();
                    float fWidth = rectLIZ.width() / rectLIZ.height();
                    if (surfaceHolderCallbackC21514919Hv.LLILLL) {
                        width = (int) ((bitmapDecodeByteArray.getWidth() - (bitmapDecodeByteArray.getHeight() * fWidth)) / 2);
                        height = 0;
                        if (width >= 0) {
                        }
                    } else {
                        height = (int) ((bitmapDecodeByteArray.getHeight() - (bitmapDecodeByteArray.getWidth() / fWidth)) / 2);
                    }
                    if (height >= 0) {
                        bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, width, height, bitmapDecodeByteArray.getWidth() - (width * 2), bitmapDecodeByteArray.getHeight() - (height * 2));
                    }
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                if (bitmapDecodeByteArray == null) {
                    byteArray = null;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeByteArray.compress(compressFormat, 100, byteArrayOutputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                try {
                    Uri uri = liveCoverCameraFragment.LLIZ;
                    if (uri != null && (activity = liveCoverCameraFragment.getActivity()) != null && (contentResolver = activity.getContentResolver()) != null && (outputStreamLJFF = C09NT.LJFF(contentResolver, uri)) != null) {
                        outputStreamLJFF.write(byteArray);
                    }
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((C1910890zpH) liveCoverCameraFragment.LLJJ.getValue()).LIZLLL("LiveCoverCameraFragment", e);
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    ((C1910890zpH) liveCoverCameraFragment.LLJJ.getValue()).LIZLLL("LiveCoverCameraFragment", e2);
                }
                liveCoverCameraFragment.LLJIJIL = true;
                Intent intent = new Intent();
                C19EG activity2 = liveCoverCameraFragment.getActivity();
                if (activity2 != null) {
                    C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZWJ1srJeuBS9Wv+ZJRcu6NkKycVGrXt", null));
                }
                C19EG activity3 = liveCoverCameraFragment.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                }
            }
        };
        C21514619Hs c21514619Hs = this.LLJ;
        if (c21514619Hs == null || !c21514619Hs.LJ) {
            return;
        }
        try {
            Camera camera = c21514619Hs.LIZJ;
            if (camera != null) {
                camera.takePicture(null, null, pictureCallback);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1910890zpH) this.LLJJ.getValue()).LIZLLL("LiveCoverCameraFragment", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            SensorManager sensorManager = this.LLJJI;
            if (sensorManager != null) {
                C1300690jx5.LIZJ(sensorManager, this, this.LLJJIII, 3, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onResume();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = (View) this.LLJJIJIL.getValue();
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = (View) this.LLJJJIL.getValue();
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = (View) this.LLJJJJ.getValue();
        if (view3 != null) {
            view3.clearAnimation();
        }
        View view4 = (View) this.LLJJJJJIL.getValue();
        if (view4 != null) {
            view4.clearAnimation();
        }
        ((Animator) this.LLJILJIL.getValue()).removeAllListeners();
        ((Animation) this.LLJILJILJ.getValue()).cancel();
        ((Animation) this.LLJILLL.getValue()).cancel();
        C21514619Hs c21514619Hs = this.LLJ;
        if (c21514619Hs != null) {
            ((Handler) c21514619Hs.LJII.getValue()).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            SensorManager sensorManager = this.LLJJI;
            if (sensorManager != null) {
                C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((AnimatorSet) this.LLJILJIL.getValue()).end();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZJ(false, false);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LJFF(-16777216);
        tuxImmersionBarLIZLLL.LIZIZ.LJII(false);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/profile/business/ur/camera/LiveCoverCameraFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZWJ1srJeuBS9Wv+ZJRcu6NkKycVGrXt", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z) {
            SurfaceHolderCallbackC21514919Hv surfaceHolderCallbackC21514919Hv = (SurfaceHolderCallbackC21514919Hv) this.LLJL.getValue();
            if (surfaceHolderCallbackC21514919Hv != null) {
                surfaceHolderCallbackC21514919Hv.surfaceDestroyed(surfaceHolderCallbackC21514919Hv.getHolder());
            }
            try {
                SensorManager sensorManager = this.LLJJI;
                if (sensorManager != null) {
                    C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            SurfaceHolderCallbackC21514919Hv surfaceHolderCallbackC21514919Hv2 = (SurfaceHolderCallbackC21514919Hv) this.LLJL.getValue();
            if (surfaceHolderCallbackC21514919Hv2 != null) {
                surfaceHolderCallbackC21514919Hv2.surfaceChanged(surfaceHolderCallbackC21514919Hv2.getHolder(), 1, 0, 0);
            }
            try {
                SensorManager sensorManager2 = this.LLJJI;
                if (sensorManager2 != null) {
                    C1300690jx5.LIZJ(sensorManager2, this, this.LLJJIII, 3, CertProviderManagerKt.findCert("bpea-live_anchor_cover_focus", 1476415490));
                }
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLJIJIL = false;
        }
        super.onHiddenChanged(z);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Integer numValueOf;
        Sensor sensor;
        String focusMode;
        Camera.Parameters parametersLIZ;
        C21514619Hs c21514619Hs = this.LLJ;
        Camera.Parameters parametersLIZ2 = null;
        if (c21514619Hs != null) {
            numValueOf = Integer.valueOf(c21514619Hs.LIZLLL);
        } else {
            numValueOf = null;
        }
        synchronized (String.valueOf(numValueOf)) {
            try {
                C21514619Hs c21514619Hs2 = this.LLJ;
                if (c21514619Hs2 != null && c21514619Hs2.LJ && sensorEvent != null && (sensor = sensorEvent.sensor) != null && C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZWJ1srJeuBS9Wv+ZJRcu6NkKycVGrXt", null)) == 1) {
                    C21514619Hs c21514619Hs3 = this.LLJ;
                    if (c21514619Hs3 != null && (parametersLIZ = c21514619Hs3.LIZ()) != null) {
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
                    double d4 = this.LLJJIJI;
                    this.LLJJIJI = dSqrt;
                    double d5 = (this.LLJJIJIIJIL * ((double) 0.9f)) + (dSqrt - d4);
                    this.LLJJIJIIJIL = d5;
                    if (d5 > 0.03d) {
                        C21514619Hs c21514619Hs4 = this.LLJ;
                        if (c21514619Hs4 != null && (parametersLIZ2 = c21514619Hs4.LIZ()) != null) {
                            parametersLIZ2.setFocusMode("continuous-picture");
                        }
                        C21514619Hs c21514619Hs5 = this.LLJ;
                        if (c21514619Hs5 != null) {
                            c21514619Hs5.LJFF(parametersLIZ2);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        DataChannel dataChannel;
        Object objJ2;
        C21514619Hs c21514619Hs;
        DataChannel dataChannel2;
        Intent intent;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            uri = (Uri) intent.getParcelableExtra("photoUri");
        } else {
            uri = null;
        }
        if (!(uri instanceof Uri)) {
            uri = null;
        }
        this.LLIZ = uri;
        DataChannel dataChannel3 = (DataChannel) ViewModelProviders.of(this).get(DataChannel.class);
        dataChannel3.LLILLL = this;
        this.LLIZLLLIL = dataChannel3;
        Context context = getContext();
        if (context != null && (dataChannel = this.LLIZLLLIL) != null) {
            this.LLJ = new C21514619Hs(context, dataChannel);
            SurfaceHolderCallbackC21514919Hv surfaceHolderCallbackC21514919Hv = (SurfaceHolderCallbackC21514919Hv) this.LLJL.getValue();
            if (surfaceHolderCallbackC21514919Hv != null && (c21514619Hs = this.LLJ) != null && (dataChannel2 = this.LLIZLLLIL) != null) {
                surfaceHolderCallbackC21514919Hv.LLILLJJLI = dataChannel2;
                dataChannel2.xQ2(this, LiveCoverCameraTypeChannel.class, new AwS611S0100000_32(surfaceHolderCallbackC21514919Hv, 380));
                dataChannel2.xQ2(this, LiveCoverCameraRetryEvent.class, new AwS611S0100000_32(surfaceHolderCallbackC21514919Hv, 381));
                surfaceHolderCallbackC21514919Hv.setCameraProxy(c21514619Hs);
                SurfaceHolder holder = surfaceHolderCallbackC21514919Hv.getHolder();
                if (holder != null) {
                    holder.addCallback(surfaceHolderCallbackC21514919Hv);
                }
                surfaceHolderCallbackC21514919Hv.setCheckFragVisibleCallback(new AwS576S0100000_32(this, 780));
            }
            DataChannel dataChannel4 = this.LLIZLLLIL;
            if (dataChannel4 != null) {
                dataChannel4.xQ2(this, LiveCoverFlashModeChannel.class, new AwS611S0100000_32(this, 350));
                dataChannel4.xQ2(this, LiveCoverIsFlashSupportedChannel.class, new AwS611S0100000_32(this, 351));
                dataChannel4.xQ2(this, LiveCoverManualFocusEvent.class, new AwS585S0100000_6(this, 376));
            }
            FrameLayout frameLayout = (FrameLayout) this.LLJJJ.getValue();
            if (frameLayout != null) {
                C786410Ut5.O7(frameLayout, new ACListenerS141S0100000_6(this, 148));
            }
            View view2 = (View) this.LLJJIJIL.getValue();
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS143S0100000_8(this, 144), view2);
            }
            View view3 = (View) this.LLJJJJLIIL.getValue();
            if (view3 != null) {
                C786410Ut5.I7(new AbS711S0100000_32(this, 3), view3);
            }
            LinearLayout linearLayout = (LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, new ACListenerS166S0100000_32(this, 109));
            }
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                objJ2 = C786410Ut5.J2(activity2, "sensor");
            } else {
                objJ2 = null;
            }
            SensorManager sensorManager = (SensorManager) objJ2;
            this.LLJJI = sensorManager;
            this.LLJJIII = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZWJ1srJeuBS9Wv+ZJRcu6NkKycVGrXt", null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ebo, viewGroup, false);
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
