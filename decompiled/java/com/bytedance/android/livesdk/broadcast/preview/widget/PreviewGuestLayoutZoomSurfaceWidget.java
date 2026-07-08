package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0ID9;
import X.C0UJY;
import X.C13LQ;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C774700UaC;
import X.C785830Us9;
import X.C786410Ut5;
import X.EnumC773710UWr;
import Y.ACListenerS139S0100000_4;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS37S0300000_4;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Looper;
import android.util.Property;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomInAction;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.LivePreviewGuestLayoutZoomOutAction;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostGuestLayoutZoomOpt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewGuestLayoutZoomSurfaceWidget extends PreviewWidget {
    public ViewGroup LLILZLL;
    public C774700UaC LLIZ;
    public C774700UaC LLIZLLLIL;
    public C0UJY LLJ;
    public FrameLayout LLJI;
    public LiveIconView LLJIJIL;
    public View LLJILJIL;
    public SurfaceView LLJILJILJ;
    public FrameLayout LLJILLL;
    public Integer LLJJ;
    public Integer LLJJI;
    public boolean LLJJIJI;
    public final String LLILZ = "PreviewGuestLayoutZoomSurfaceWidget";
    public EnumC773710UWr LLILZIL = EnumC773710UWr.DEFAULT;
    public final BPEAHandler LLJJIII = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        BPEAHandler bPEAHandler = this.LLJJIII;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1a;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        Integer numValueOf;
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout == null || (numValueOf = Integer.valueOf(frameLayout.getHeight())) == null || numValueOf.intValue() == 0) {
            C786410Ut5.LJJZZIII(this.LLJJIII, new ARunnableS112S0100000_12(this, 77));
            String str = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("surfaceViewContainer#height: ");
            FrameLayout frameLayout2 = this.LLJI;
            sbLIZ.append(frameLayout2 != null ? Integer.valueOf(frameLayout2.getHeight()) : null);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Context context = this.context;
        if (context == null) {
            return;
        }
        int iLIZLLL = C418440Gaw.LIZLLL(context);
        int iLIZJ = C418440Gaw.LIZJ(this.context);
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            frameLayout3.getWidth();
        }
        Integer numValueOf2 = ((float) iLIZLLL) / ((float) iLIZJ) > 0.5625f ? Integer.valueOf((int) ((numValueOf.intValue() / 7) * 5)) : Integer.valueOf((int) ((numValueOf.intValue() / 5) * 3));
        String str2 = this.LLILZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("adaptSurfaceContainerWithDevice height: ");
        sbLIZ2.append(iLIZJ);
        sbLIZ2.append(", root height: ");
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", old width: ");
        FrameLayout frameLayout4 = this.LLJI;
        sbLIZ2.append(frameLayout4 != null ? Integer.valueOf(frameLayout4.getWidth()) : null);
        sbLIZ2.append(", new width: ");
        sbLIZ2.append(numValueOf2);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        FrameLayout frameLayout5 = this.LLJI;
        if (frameLayout5 != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout5.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = numValueOf2.intValue();
            } else {
                layoutParams = null;
            }
            C786410Ut5.a6(frameLayout5, layoutParams);
        }
        this.LLJJ = numValueOf2;
        this.LLJJI = numValueOf;
        this.LLIZLLLIL = null;
    }

    public final C774700UaC H1() {
        C774700UaC c774700UaC = this.LLIZLLLIL;
        if (c774700UaC != null) {
            return c774700UaC;
        }
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout == null) {
            return null;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationInWindow(iArr);
        C774700UaC c774700UaC2 = new C774700UaC(frameLayout.getWidth(), frameLayout.getHeight(), iArr);
        this.LLIZLLLIL = c774700UaC2;
        return c774700UaC2;
    }

    public final void J1() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        SurfaceView surfaceView = this.LLJILJILJ;
        if (surfaceView == null || (frameLayout = this.LLJILLL) == null || frameLayout.indexOfChild(surfaceView) == -1 || (frameLayout2 = this.LLJILLL) == null) {
            return;
        }
        C786410Ut5.LJJJZ(surfaceView, frameLayout2);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (this.LLJJIJI) {
            return;
        }
        C500260Jjc.LJIILLIIL(getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        C500260Jjc.LJIILLIIL(getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        C500260Jjc.LJIILLIIL(getView());
        G1();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LivePreviewGuestLayoutZoomOutAction.class, new AwS583S0100000_4(this, 37));
        dataChannel.BQ2(this, LivePreviewGuestLayoutZoomInAction.class, new AwS591S0100000_12(this, 271));
        View view = getView();
        this.LLJI = view instanceof FrameLayout ? (FrameLayout) view : null;
        View view2 = getView();
        FrameLayout frameLayout = view2 != null ? (FrameLayout) view2.findViewById(R.id.zoom_surfaceview_container) : null;
        this.LLJILLL = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new C785830Us9(0));
        }
        View view3 = getView();
        LiveIconView liveIconView = view3 != null ? (LiveIconView) view3.findViewById(R.id.zoom_out_icon) : null;
        this.LLJIJIL = liveIconView;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS139S0100000_4(this, 3));
        }
        View view4 = getView();
        if (view4 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0UaD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                }
            }, view4);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.LLJJIJI = false;
        C20441214yg.LIZIZ(this.LLILZ, "hide...");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C20441214yg.LIZIZ(this.LLILZ, "show...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N1(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget.N1(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O1(boolean r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget.O1(boolean, X.05Vn):java.lang.Object");
    }

    public static Bitmap I1(PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        float width2;
        previewGuestLayoutZoomSurfaceWidget.getClass();
        if (bitmap != null && i > 0 && i2 > 0) {
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
                width2 = 0.0f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(width, width);
            if (width2 > 0.0f) {
                width2 = 0.0f;
            }
            if (height <= 0.0f) {
                f = height;
            }
            matrix.postTranslate(width2, f);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(7);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, matrix, paint);
            return bitmapCreateBitmap;
        }
        return null;
    }

    public static boolean L1(int[] iArr, int i, int i2, MotionEvent motionEvent) {
        int i3;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i4 = iArr[0];
        if (rawX < i4 || rawX >= i4 + i || rawY < (i3 = iArr[1]) || rawY >= i3 + i2) {
            return false;
        }
        return true;
    }

    public static void M1(final PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget, C774700UaC c774700UaC, C774700UaC c774700UaC2, final ViewGroup viewGroup, final Bitmap bitmap, final Function0 function0) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        previewGuestLayoutZoomSurfaceWidget.getClass();
        if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) {
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int[] iArr2 = c774700UaC.LIZJ;
            int i = iArr2[0];
            int i2 = iArr[0];
            int i3 = i - i2;
            int i4 = iArr2[1];
            int i5 = iArr[1];
            int i6 = i4 - i5;
            int[] iArr3 = c774700UaC2.LIZJ;
            int i7 = iArr3[0] - i2;
            int i8 = iArr3[1] - i5;
            int i9 = c774700UaC.LIZ;
            if (i9 < 1) {
                i9 = 1;
            }
            int i10 = c774700UaC.LIZIZ;
            if (i10 < 1) {
                i10 = 1;
            }
            int i11 = c774700UaC2.LIZ;
            if (i11 < 1) {
                i11 = 1;
            }
            int i12 = c774700UaC2.LIZIZ;
            if (i12 < 1) {
                i12 = 1;
            }
            final ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
            layoutParams.gravity = 3;
            C786410Ut5.c6(imageView, layoutParams);
            float f = i3;
            C786410Ut5.Hd(imageView, f);
            float f2 = i6;
            C786410Ut5.Nd(imageView, f2);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setOutlineProvider(new C0ID9(26));
            imageView.setClipToOutline(true);
            viewGroup.addView(imageView);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.X, f, i7);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.Y, f2, i8);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i9, i11);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(imageView, 140));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i10, i12);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS256S0100000_6(imageView, 139));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(C13LQ.LJIJI(new ValueAnimator[]{objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfInt, valueAnimatorOfInt2, null}));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(linearInterpolator);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0DRz
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    if (LiveHostGuestLayoutZoomOpt.INSTANCE.enable()) {
                        C786410Ut5.LJLIIL(30L, previewGuestLayoutZoomSurfaceWidget.LLJJIII, new ARunnableS37S0300000_4(this, viewGroup, imageView, bitmap, 18));
                        return;
                    }
                    C786410Ut5.LJJJLZIJ(imageView, viewGroup);
                    C786410Ut5.LJJJJ(bitmap);
                }
            });
            animatorSet.start();
            return;
        }
        function0.invoke();
    }
}
