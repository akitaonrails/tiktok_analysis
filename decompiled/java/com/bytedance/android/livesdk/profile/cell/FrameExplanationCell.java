package com.bytedance.android.livesdk.profile.cell;

import X.AbstractC495800JcQ;
import X.C1324720kZq;
import X.C13BV;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C21415018rM;
import X.C2187701Ajg;
import X.C2268791DrB;
import X.C376710Epp;
import X.C419910GdJ;
import X.C444830HcP;
import X.C495920Jcc;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC495780JcO;
import X.EnumC496240Jd8;
import X.InterfaceC1364105Vn;
import X.InterfaceC496480JdW;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ALAdapterS4S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.profile.cell.FrameExplanationCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import webcast.api.room.AvatarFrameExplanation;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class FrameExplanationCell extends AbstractC495800JcQ<AvatarFrameExplanation> implements InterfaceC496480JdW, GenericLifecycleObserver {
    public static final C2268791DrB LLJL = new C2268791DrB(0.25f, 0.1f, 0.25f, 1.0f);
    public LiveIconView LLILZIL;
    public C1324720kZq LLILZLL;
    public C1324720kZq LLIZ;
    public C1324720kZq LLIZLLLIL;
    public C1324720kZq LLJ;
    public C21415018rM LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16FS LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public User LLJJJJ;
    public final EnumC495780JcO LLJJJJJIL;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJJJJLIIL;
    public final boolean LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.hjh;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZIL = view != null ? (LiveIconView) view.findViewById(R.id.e1y) : null;
        View view2 = this.LLILLL;
        this.LLILZLL = view2 != null ? (C1324720kZq) view2.findViewById(R.id.bh2) : null;
        View view3 = this.LLILLL;
        this.LLIZ = view3 != null ? (C1324720kZq) view3.findViewById(R.id.bhu) : null;
        View view4 = this.LLILLL;
        this.LLIZLLLIL = view4 != null ? (C1324720kZq) view4.findViewById(R.id.vzu) : null;
        View view5 = this.LLILLL;
        this.LLJ = view5 != null ? (C1324720kZq) view5.findViewById(R.id.h5c) : null;
        View view6 = this.LLILLL;
        this.LLJI = view6 != null ? (C21415018rM) view6.findViewById(R.id.title) : null;
        View view7 = this.LLILLL;
        this.LLJIJIL = view7 != null ? (C16F5) view7.findViewById(R.id.validity_period) : null;
        View view8 = this.LLILLL;
        this.LLJILJIL = view8 != null ? (C16F5) view8.findViewById(R.id.fof) : null;
        View view9 = this.LLILLL;
        this.LLJILJILJ = view9 != null ? (C16FS) view9.findViewById(R.id.s0v) : null;
    }

    public final void LJIJI() {
        ArrayList<Animator> childAnimations;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.LLJJLIIIJLLLLLLLZ;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLJJLIIIJLLLLLLLZ) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = this.LLJJLIIIJLLLLLLLZ;
        if (animatorSet3 != null && (childAnimations = animatorSet3.getChildAnimations()) != null) {
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        LJJ();
    }

    public final void LJJ() {
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.Qc(c1324720kZq, 0.0f);
        }
        C1324720kZq c1324720kZq2 = this.LLILZLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.md(c1324720kZq2, 0.0f);
        }
        C1324720kZq c1324720kZq3 = this.LLIZ;
        if (c1324720kZq3 != null) {
            C786410Ut5.Qc(c1324720kZq3, 0.0f);
        }
        C1324720kZq c1324720kZq4 = this.LLIZ;
        if (c1324720kZq4 != null) {
            C786410Ut5.md(c1324720kZq4, 0.0f);
        }
        C1324720kZq c1324720kZq5 = this.LLILZLL;
        if (c1324720kZq5 != null) {
            C786410Ut5.Yb(c1324720kZq5, 1.0f);
        }
        C1324720kZq c1324720kZq6 = this.LLILZLL;
        if (c1324720kZq6 != null) {
            C786410Ut5.xc(c1324720kZq6, 1.0f);
        }
        C1324720kZq c1324720kZq7 = this.LLIZ;
        if (c1324720kZq7 != null) {
            C786410Ut5.Yb(c1324720kZq7, 1.0f);
        }
        C1324720kZq c1324720kZq8 = this.LLIZ;
        if (c1324720kZq8 != null) {
            C786410Ut5.xc(c1324720kZq8, 1.0f);
        }
        LJJI(1.0f);
        C21415018rM c21415018rM = this.LLJI;
        if (c21415018rM != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415018rM);
            c21415018rM.setTranslationY(0.0f);
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            C786410Ut5.od(c16f5, 0.0f);
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            C786410Ut5.od(c16f52, 0.0f);
        }
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        LJIJI();
        C500260Jjc.LJIILIIL(this.LLILLL);
        C500260Jjc.LLFFF(this.LLJILLL);
        C500260Jjc.LLFFF(this.LLJJ);
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJJL;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJJJJLIIL;
    }

    public FrameExplanationCell(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLJJJJJIL = EnumC495780JcO.FRAME_EXPLANATION;
        this.LLJJJJLIIL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
        this.LLJJL = true;
    }

    public static ValueAnimator LJIJ(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        valueAnimatorOfFloat.setInterpolator(LLJL);
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    public static Pair LJIL(View view) {
        int width;
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        int height = 0;
        float f = iArr[0];
        if (view != null) {
            width = view.getWidth();
        } else {
            width = 0;
        }
        float f2 = f + (width / 2.0f);
        float f3 = iArr[1];
        if (view != null) {
            height = view.getHeight();
        }
        return new Pair(Float.valueOf(f2), Float.valueOf(f3 + (height / 2.0f)));
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        return responseData.avatarFrameExplanation;
    }

    public final void LJJI(float f) {
        C21415018rM c21415018rM = this.LLJI;
        if (c21415018rM != null) {
            C786410Ut5.A5(c21415018rM, f);
        }
        C1324720kZq c1324720kZq = this.LLIZLLLIL;
        if (c1324720kZq != null) {
            C786410Ut5.h5(c1324720kZq, f);
        }
        C1324720kZq c1324720kZq2 = this.LLJ;
        if (c1324720kZq2 != null) {
            C786410Ut5.h5(c1324720kZq2, f);
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, f);
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, f);
        }
        C16FS c16fs = this.LLJILJILJ;
        if (c16fs != null) {
            C786410Ut5.j5(c16fs, f);
        }
        LiveIconView liveIconView = this.LLILZIL;
        if (liveIconView != null) {
            C786410Ut5.i5(liveIconView, f);
        }
    }

    public static Pair LJIJJ(long j, View view) {
        ObjectAnimator objectAnimatorLJIIZILJ = LJIIZILJ(view, View.TRANSLATION_Y, C497740JfY.LIZIZ(10.0f), 0.0f);
        objectAnimatorLJIIZILJ.setStartDelay(j);
        ObjectAnimator objectAnimatorLJIIZILJ2 = LJIIZILJ(view, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLJIIZILJ2.setStartDelay(j);
        return new Pair(objectAnimatorLJIIZILJ, objectAnimatorLJIIZILJ2);
    }

    @Override // X.InterfaceC496480JdW
    public final boolean LIZIZ(final View view, final View view2) {
        ViewTreeObserver viewTreeObserver;
        if (this.LLJJJIL) {
            C500260Jjc.LLFFF(this.LLILLL);
            C1324720kZq c1324720kZq = this.LLILZLL;
            if (c1324720kZq != null && (viewTreeObserver = c1324720kZq.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0KYt
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver2;
                        FrameExplanationCell frameExplanationCell = this.LL;
                        frameExplanationCell.LLJILLL = view;
                        View view3 = view2;
                        frameExplanationCell.LLJJ = view3;
                        Pair pairLJIL = FrameExplanationCell.LJIL(view3);
                        frameExplanationCell.LLJJI = ((Number) pairLJIL.getFirst()).floatValue();
                        frameExplanationCell.LLJJIJI = ((Number) pairLJIL.getSecond()).floatValue();
                        Pair pairLJIL2 = FrameExplanationCell.LJIL(frameExplanationCell.LLIZ);
                        frameExplanationCell.LLJJIII = ((Number) pairLJIL2.getFirst()).floatValue();
                        frameExplanationCell.LLJJIJIIJIL = ((Number) pairLJIL2.getSecond()).floatValue();
                        View view4 = frameExplanationCell.LLJILLL;
                        float fFloatValue = (view4 != null ? Integer.valueOf(view4.getWidth()) : 0L).floatValue();
                        C1324720kZq c1324720kZq2 = frameExplanationCell.LLILZLL;
                        float fFloatValue2 = fFloatValue / (c1324720kZq2 != null ? Integer.valueOf(c1324720kZq2.getWidth()) : 1L).floatValue();
                        frameExplanationCell.LLJJIJIL = fFloatValue2;
                        if (Float.isInfinite(fFloatValue2)) {
                            frameExplanationCell.LLJJIJIL = 1.0f;
                        }
                        FrameExplanationCell frameExplanationCell2 = this.LL;
                        ValueAnimator valueAnimatorLJIJ = FrameExplanationCell.LJIJ(frameExplanationCell2.LLJJI, frameExplanationCell2.LLJJIII);
                        valueAnimatorLJIJ.addUpdateListener(new AUListenerS257S0100000_7(frameExplanationCell2, 21));
                        ValueAnimator valueAnimatorLJIJ2 = FrameExplanationCell.LJIJ(frameExplanationCell2.LLJJIJI, frameExplanationCell2.LLJJIJIIJIL);
                        valueAnimatorLJIJ2.addUpdateListener(new AUListenerS257S0100000_7(frameExplanationCell2, 22));
                        ValueAnimator valueAnimatorLJIJ3 = FrameExplanationCell.LJIJ(frameExplanationCell2.LLJJIJIL, 1.0f);
                        valueAnimatorLJIJ3.addUpdateListener(new AUListenerS257S0100000_7(frameExplanationCell2, 23));
                        valueAnimatorLJIJ3.addListener(new ALAdapterS4S0100000_7(frameExplanationCell2, 19));
                        Pair pairLJIJJ = FrameExplanationCell.LJIJJ(300L, frameExplanationCell2.LLJI);
                        Object first = pairLJIJJ.getFirst();
                        Object second = pairLJIJJ.getSecond();
                        Pair pairLJIJJ2 = FrameExplanationCell.LJIJJ(300L, frameExplanationCell2.LLIZLLLIL);
                        Object first2 = pairLJIJJ2.getFirst();
                        Object second2 = pairLJIJJ2.getSecond();
                        Pair pairLJIJJ3 = FrameExplanationCell.LJIJJ(300L, frameExplanationCell2.LLJ);
                        Object first3 = pairLJIJJ3.getFirst();
                        Object second3 = pairLJIJJ3.getSecond();
                        Pair pairLJIJJ4 = FrameExplanationCell.LJIJJ(350L, frameExplanationCell2.LLJIJIL);
                        Object first4 = pairLJIJJ4.getFirst();
                        Object second4 = pairLJIJJ4.getSecond();
                        Pair pairLJIJJ5 = FrameExplanationCell.LJIJJ(400L, frameExplanationCell2.LLJILJIL);
                        Object first5 = pairLJIJJ5.getFirst();
                        Object second5 = pairLJIJJ5.getSecond();
                        ObjectAnimator objectAnimatorLJIIZILJ = FrameExplanationCell.LJIIZILJ(frameExplanationCell2.LLJILJILJ, View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorLJIIZILJ.setStartDelay(500L);
                        ObjectAnimator objectAnimatorLJIIZILJ2 = FrameExplanationCell.LJIIZILJ(frameExplanationCell2.LLILZIL, View.ALPHA, 0.0f, 1.0f);
                        frameExplanationCell2.LJIJI();
                        frameExplanationCell2.LJJI(0.0f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        frameExplanationCell2.LLJJLIIIJLLLLLLLZ = animatorSet;
                        animatorSet.playTogether(valueAnimatorLJIJ, valueAnimatorLJIJ2, valueAnimatorLJIJ3, first, second, first2, second2, first3, second3, first4, second4, first5, second5, objectAnimatorLJIIZILJ, objectAnimatorLJIIZILJ2);
                        AnimatorSet animatorSet2 = frameExplanationCell2.LLJJLIIIJLLLLLLLZ;
                        if (animatorSet2 != null) {
                            animatorSet2.start();
                        }
                        FrameExplanationCell frameExplanationCell3 = this.LL;
                        frameExplanationCell3.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_profile_explanation_page_show");
                        c474500IjALIZ.LJJII(frameExplanationCell3.LL.LIZJ.LJI ? "anchor" : "user", "user_type");
                        c474500IjALIZ.LJJII(frameExplanationCell3.LL.LIZJ.LJII ? "anchor" : "user", "object_user_type");
                        c474500IjALIZ.LJJII(frameExplanationCell3.LLJJJ, "object_privilege_id");
                        c474500IjALIZ.LJJII(Long.valueOf(frameExplanationCell3.LL.LJII), "object_user_id");
                        c474500IjALIZ.LIZ();
                        View view5 = this.LL.LLILLL;
                        if (view5 == null || (viewTreeObserver2 = view5.getViewTreeObserver()) == null) {
                            return;
                        }
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                        C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        } else {
            this.LL.LIZLLL.o1();
        }
        return this.LLJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0249  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.cell.FrameExplanationCell.LJIIIZ(com.bytedance.android.live.base.model.user.User, java.lang.Object):boolean");
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super AvatarFrameExplanation> interfaceC1364105Vn) {
        return responseData.avatarFrameExplanation;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super AvatarFrameExplanation> interfaceC1364105Vn) {
        return responseData.avatarFrameExplanation;
    }

    public static ObjectAnimator LJIIZILJ(View view, Property property, float... fArr) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setInterpolator(LLJL);
        objectAnimatorOfFloat.setDuration(300L);
        return objectAnimatorOfFloat;
    }

    public static Layout LJIJJLI(int i, int i2, String str) {
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(str);
        c444830HcP.LJIILJJIL(i);
        c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        c444830HcP.LJII(33);
        c444830HcP.LIZIZ.LJ = i2;
        c444830HcP.LJIIIZ(2);
        c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
        return C444830HcP.LIZJ(c444830HcP, 0.0f, false, C1697810uHb.LJIIJJI(new Pair(17, 24), new Pair(17, 17)), 27);
    }

    public final void LJJIFFI(C1324720kZq c1324720kZq, int i, int i2, int i3, int i4) {
        Context context;
        View view = this.LLILLL;
        if (view != null && (context = view.getContext()) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_laurel_trailing_ltr;
            c419910GdJ.LIZIZ = i;
            c419910GdJ.LIZJ = i2;
            Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(c419910GdJ.LIZ(context));
            int width = bitmapLIZIZ.getWidth();
            int height = bitmapLIZIZ.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapLIZIZ, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            float f = width;
            float f2 = height;
            paint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, i3, i4, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawRect(0.0f, 0.0f, f, f2, paint);
            c1324720kZq.setBackground(new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
        }
    }
}
