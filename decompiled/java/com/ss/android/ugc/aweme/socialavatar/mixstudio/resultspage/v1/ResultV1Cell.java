package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0HQX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12YD;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19772912Xv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C370240EfO;
import X.C435650H6l;
import X.C452080Ho6;
import X.C452501pT;
import X.C463040IDu;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ResultV1Cell extends PowerCell<C0HQX> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(213));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(212));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(210));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(208));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(214));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(211));
    public SmartImageView LLIZ;
    public C370240EfO LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ResultV1Cell.class, "resultsVM", "getResultsVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ResultV1Cell.class, "baseVM", "getBaseVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public ResultV1Cell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 409);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(153);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 396), awS573S0100000_29, AFwS218S0000000_29.get$arr$(206), new AwS573S0100000_29((C03K6) this, 386), new AwS573S0100000_29((C03K6) this, 397), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 400), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 403), null, new AwS573S0100000_29((C03K6) this, 406));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_292 = new AwS573S0100000_29((C03K6) this, 382);
            AwS573S0100000_29 awS573S0100000_293 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 384);
            AwS573S0100000_29 awS573S0100000_294 = new AwS573S0100000_29(c19719912DlLIZ, 387);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_292, 38));
            AwS573S0100000_29 awS573S0100000_295 = new AwS573S0100000_29(c01gwLIZIZ, 392);
            AwS573S0100000_29 awS573S0100000_296 = new AwS573S0100000_29(c01gwLIZIZ, 395);
            AwS573S0100000_29 awS573S0100000_297 = new AwS573S0100000_29(c01gwLIZIZ, 398);
            AwS573S0100000_29 awS573S0100000_298 = new AwS573S0100000_29(c01gwLIZIZ, 401);
            AwS573S0100000_29 awS573S0100000_299 = new AwS573S0100000_29(c01gwLIZIZ, 404);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS573S0100000_294, awS573S0100000_29, new C452080Ho6(), awS573S0100000_295, awS573S0100000_296, awS573S0100000_293, aFwS273S0000000_29, awS573S0100000_297, awS573S0100000_298, awS573S0100000_299);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 407), awS573S0100000_29, AFwS218S0000000_29.get$arr$(217), new AwS573S0100000_29((C03K6) this, 411), new AwS573S0100000_29((C03K6) this, 413), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 415), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 417), null, new AwS573S0100000_29((C03K6) this, 419));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 368), awS573S0100000_29, AFwS218S0000000_29.get$arr$(207), new AwS573S0100000_29((C03K6) this, 370), new AwS573S0100000_29((C03K6) this, 371), new AwS573S0100000_29((C03K6) this, 374), aFwS273S0000000_29, null, null, new AwS573S0100000_29((C03K6) this, 376));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixStudioBaseViewModel.class);
        AwS573S0100000_29 awS573S0100000_2910 = new AwS573S0100000_29(c19719912DlLIZ2, 378);
        AFwS273S0000000_29 aFwS273S0000000_292 = AFwS273S0000000_29.get$arr$(154);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 381), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(216), new AwS573S0100000_29((C03K6) this, 385), new AwS573S0100000_29((C03K6) this, 388), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 390), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 393), null, new AwS573S0100000_29((C03K6) this, 399));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_2911 = new AwS573S0100000_29((C03K6) this, 402);
            AwS573S0100000_29 awS573S0100000_2912 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 405);
            AwS573S0100000_29 awS573S0100000_2913 = new AwS573S0100000_29(c19719912DlLIZ2, 408);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_2911, 39));
            AwS573S0100000_29 awS573S0100000_2914 = new AwS573S0100000_29(c01gwLIZIZ2, 410);
            AwS573S0100000_29 awS573S0100000_2915 = new AwS573S0100000_29(c01gwLIZIZ2, 412);
            AwS573S0100000_29 awS573S0100000_2916 = new AwS573S0100000_29(c01gwLIZIZ2, 414);
            AwS573S0100000_29 awS573S0100000_2917 = new AwS573S0100000_29(c01gwLIZIZ2, 416);
            AwS573S0100000_29 awS573S0100000_2918 = new AwS573S0100000_29(c01gwLIZIZ2, 418);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS573S0100000_2913, awS573S0100000_2910, new C452080Ho6(), awS573S0100000_2914, awS573S0100000_2915, awS573S0100000_2912, aFwS273S0000000_292, awS573S0100000_2916, awS573S0100000_2917, awS573S0100000_2918);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 369), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(209), new AwS573S0100000_29((C03K6) this, 372), new AwS573S0100000_29((C03K6) this, 373), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 375), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 377), null, new AwS573S0100000_29((C03K6) this, 379));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 380), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(215), new AwS573S0100000_29((C03K6) this, 383), new AwS573S0100000_29((C03K6) this, 389), new AwS573S0100000_29((C03K6) this, 391), aFwS273S0000000_292, null, null, new AwS573S0100000_29((C03K6) this, 394));
        }
        this.LLJI = assemVMLazy2;
    }

    public final MixStudioBaseViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (MixStudioBaseViewModel) assemVMLazy.getValue();
    }

    public final MixStudioResultsPageViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (MixStudioResultsPageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0HQX c0hqx = (C0HQX) interfaceC1891350zJl;
        String value = c0hqx.LLILLL.getValue();
        SmartImageView smartImageView = this.LLIZ;
        if (value != null && smartImageView != null) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(value));
            c1331670kl3LJI.LJJ(smartImageView);
            c1331670kl3LJI.LIZLLL("ResultPowerCell");
            c1331670kl3LJI.LIZLLL = false;
            c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI.LJIIJ(new C463040IDu(c0hqx, this, 5));
        }
        C786410Ut5.I7(new ACListenerS110S0200000_6(this, c0hqx, 43), this.itemView);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0HQO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0HQU) obj).LLILLL);
            }
        }, null, new AwS442S0200000_6(c0hqx, this, 23), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0EfO, android.view.View] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, C435650H6l.LIZ(((Number) this.LL.getValue()).intValue(), ((Number) this.LL.getValue()).intValue(), ((Number) this.LLILLJJLI.getValue()).intValue(), 0, 0, 248));
        View view = new View(viewGroup.getContext());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, view.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new C19772912Xv(this, 2));
        view.setElevation(3.0f);
        view.addOnLayoutChangeListener(new C12YD(view, 2));
        frameLayout.addView(view, new FrameLayout.LayoutParams(((Number) this.LLILLL.getValue()).intValue(), ((Number) this.LLILLL.getValue()).intValue(), 17));
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        smartImageView.setElevation(3.0f);
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(((Number) this.LLILZIL.getValue()).intValue(), ((Number) this.LLILZIL.getValue()).intValue(), 17));
        this.LLIZ = smartImageView;
        final Context context = viewGroup.getContext();
        ?? r3 = new View(context) { // from class: X.0EfO
            public final C01GW LL;
            public final Paint LLILLJJLI;
            public final Path LLILLL;
            public final int[] LLILZ;

            private final float getBorderWidth() {
                return ((Number) this.LL.getValue()).floatValue();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                int[] iArr = null;
                this.LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(441));
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(getBorderWidth());
                this.LLILLJJLI = paint;
                this.LLILLL = new Path();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, context);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, context);
                if (numLIZJ2 != null && numLIZJ3 != null) {
                    iArr = new int[]{numLIZJ2.intValue(), numLIZJ3.intValue()};
                }
                this.LLILZ = iArr;
                setWillNotDraw(false);
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawPath(this.LLILLL, this.LLILLJJLI);
            }

            @Override // android.view.View
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                if ((i == i3 && i2 == i4) || this.LLILZ == null) {
                    return;
                }
                float f = i;
                float f2 = i2;
                this.LLILLJJLI.setShader(new LinearGradient(0.0f, 0.0f, f, f2, this.LLILZ, (float[]) null, Shader.TileMode.CLAMP));
                float strokeWidth = this.LLILLJJLI.getStrokeWidth() / 2;
                this.LLILLL.reset();
                this.LLILLL.addRoundRect(strokeWidth, strokeWidth, f - strokeWidth, f2 - strokeWidth, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), Path.Direction.CW);
            }
        };
        frameLayout.addView((View) r3, new FrameLayout.LayoutParams(((Number) this.LLILZLL.getValue()).intValue(), ((Number) this.LLILZLL.getValue()).intValue(), 17));
        this.LLIZLLLIL = r3;
        return frameLayout;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
