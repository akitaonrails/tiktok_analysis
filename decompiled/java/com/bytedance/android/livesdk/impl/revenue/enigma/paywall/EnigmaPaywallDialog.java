package com.bytedance.android.livesdk.impl.revenue.enigma.paywall;

import X.C0IJT;
import X.C0JDJ;
import X.C1104930erL;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1361400lX0;
import X.C13LZ;
import X.C1546210qL5;
import X.C158B;
import X.C16F5;
import X.C16FS;
import X.C19EH;
import X.C20513115On;
import X.C23250099c;
import X.C319060Cf2;
import X.C444920HcY;
import X.C465220IMe;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1142670fqD;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS165S0100000_31;
import Y.ALAdapterS25S0200000_31;
import Y.AObserverS233S0100000_31;
import Y.AUListenerS233S0200000_31;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes32.dex */
public final class EnigmaPaywallDialog extends LiveSheetFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpHELIOSJzo2ZiAiICg+KWs8KDYkKSkgZwo9ISIhKB8yMTItJSMXISQgJig=";
    public PaywallViewModel LLLFF;
    public C16F5 LLLFFI;
    public C16F5 LLLFZ;
    public C16FS LLLI;
    public Animator LLLII;
    public ColorStateList LLLIIII;
    public C16F5 LLLIIIL;
    public FrameLayout LLLIIL;
    public FrameLayout LLLIILIL;
    public ConstraintLayout LLLIL;
    public FrameLayout LLLILZ;
    public FrameLayout LLLILZJ;
    public C16F5 LLLILZLLLI;
    public C16F5 LLLIZZ;
    public C1104930erL LLLJ;
    public C1104930erL LLLJIL;
    public final float LLJLLL = 12.0f;
    public final float LLJZ = 9.0f;
    public final int LLJZIJLIL = 3;
    public final float LLL = 123.0f;
    public final long LLLF = 333;
    public int LLLIIIIL = 2;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int l5(Context context) {
        return -16185077;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r0.canPurchase == true) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ES() {
        /*
            r3 = this;
            com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel r2 = r3.LLLFF
            if (r2 == 0) goto L20
            int r1 = r2.LLILZ
            r0 = 2
            if (r1 != r0) goto L2a
            androidx.lifecycle.MutableLiveData<X.15On> r0 = r2.LLJI
            java.lang.Object r0 = r0.getValue()
            X.15On r0 = (X.C20513115On) r0
            if (r0 == 0) goto L3b
            X.15Om r0 = r0.LIZLLL
            if (r0 == 0) goto L3b
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJIIIIZZ
        L19:
            r1 = 1
            if (r0 == 0) goto L3b
            boolean r0 = r0.canPurchase
            if (r0 != r1) goto L3b
        L20:
            X.16FS r1 = r3.LLLI
            if (r1 == 0) goto L29
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.j5(r1, r0)
        L29:
            return
        L2a:
            androidx.lifecycle.MutableLiveData<X.15On> r0 = r2.LLJI
            java.lang.Object r0 = r0.getValue()
            X.15On r0 = (X.C20513115On) r0
            if (r0 == 0) goto L3b
            X.15Om r0 = r0.LIZJ
            if (r0 == 0) goto L3b
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJIIIIZZ
            goto L19
        L3b:
            X.16FS r1 = r3.LLLI
            if (r1 == 0) goto L29
            r0 = 1056964608(0x3f000000, float:0.5)
            X.C786410Ut5.j5(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog.ES():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FS() {
        MutableLiveData mutableLiveData;
        C20513115On c20513115On;
        PaywallViewModel paywallViewModel = this.LLLFF;
        if (paywallViewModel == null || (mutableLiveData = paywallViewModel.LLJILJILJ) == null || (c20513115On = (C20513115On) mutableLiveData.getValue()) == null) {
            return;
        }
        if (this.LLLIIIIL == 2) {
            BS(c20513115On.LIZLLL.LJFF);
            GS(c20513115On.LIZLLL.LJIIJJI);
        } else {
            BS(c20513115On.LIZJ.LJFF);
            GS(c20513115On.LIZJ.LJIIJJI);
        }
    }

    public final void zS() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        FrameLayout frameLayout = this.LLLIIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLLIILIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        ConstraintLayout constraintLayout = this.LLLIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        C16F5 c16f5 = this.LLLILZLLLI;
        if (c16f5 != null) {
            c16f5.setTextColor(-3154433);
        }
        C16F5 c16f52 = this.LLLIZZ;
        if (c16f52 != null) {
            c16f52.setTextColor(-4797702);
        }
        C16F5 c16f53 = this.LLLILZLLLI;
        if (c16f53 != null && (viewPropertyAnimatorAnimate4 = c16f53.animate()) != null) {
            viewPropertyAnimatorAnimate4.cancel();
        }
        C16F5 c16f54 = this.LLLIZZ;
        if (c16f54 != null && (viewPropertyAnimatorAnimate3 = c16f54.animate()) != null) {
            viewPropertyAnimatorAnimate3.cancel();
        }
        C16F5 c16f55 = this.LLLILZLLLI;
        if (c16f55 != null) {
            C786410Ut5.k5(c16f55, 0.0f);
            C786410Ut5.od(c16f55, this.LLL);
        }
        C16F5 c16f56 = this.LLLIZZ;
        if (c16f56 != null) {
            C786410Ut5.k5(c16f56, 0.0f);
            C786410Ut5.od(c16f56, this.LLL);
        }
        C16F5 c16f57 = this.LLLILZLLLI;
        if (c16f57 != null && (viewPropertyAnimatorAnimate2 = c16f57.animate()) != null && (viewPropertyAnimatorTranslationY2 = viewPropertyAnimatorAnimate2.translationY(0.0f)) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorTranslationY2.alpha(1.0f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(this.LLLF)) != null && (interpolator2 = duration2.setInterpolator(new DecelerateInterpolator())) != null) {
            interpolator2.start();
        }
        C16F5 c16f58 = this.LLLIZZ;
        if (c16f58 != null && (viewPropertyAnimatorAnimate = c16f58.animate()) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate.translationY(0.0f)) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorTranslationY.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(this.LLLF)) != null && (interpolator = duration.setInterpolator(new DecelerateInterpolator())) != null) {
            interpolator.start();
        }
        C1104930erL c1104930erL = this.LLLJ;
        if (c1104930erL != null) {
            C1104930erL.LIZ(c1104930erL, "enigma_mask_loading_animation", null, new AwS575S0100000_31(this, 179), 4);
        }
    }

    public final int wS() {
        View rootView;
        View viewFindViewById;
        Resources resources;
        DisplayMetrics displayMetrics;
        View view = getView();
        if (view == null || (rootView = view.getRootView()) == null || (viewFindViewById = rootView.findViewById(R.id.fpl)) == null) {
            C1546210qL5.LIZ.getClass();
            return C814420VxA.LIZIZ(C1546210qL5.LIZ(393));
        }
        int height = viewFindViewById.getHeight();
        Context context = getContext();
        return (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? height : (int) (height / (displayMetrics.densityDpi / 160));
    }

    public final void BS(final String str) {
        String string;
        final C16FS c16fs = this.LLLI;
        if (c16fs == null) {
            return;
        }
        CharSequence text = c16fs.getText();
        String string2 = null;
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, str)) {
            return;
        }
        CharSequence text2 = c16fs.getText();
        if (text2 != null) {
            string2 = text2.toString();
        }
        if (!Intrinsics.LJFF(string2, str)) {
            ColorStateList colorStateListValueOf = this.LLLIIII;
            if (colorStateListValueOf == null) {
                TextView textView = (TextView) c16fs.findViewById(R.id.yvc);
                if (textView != null && (colorStateListValueOf = textView.getTextColors()) != null) {
                    this.LLLIIII = colorStateListValueOf;
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(-16052696);
                }
            }
            Animator animator = this.LLLII;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(120L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS233S0200000_31(colorStateListValueOf, c16fs, 10));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0xBQ
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator2) {
                    this.LL = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    if (!this.LL) {
                        c16fs.setText(str);
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(160L);
            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS233S0200000_31(colorStateListValueOf, c16fs, 9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.addListener(new ALAdapterS25S0200000_31(colorStateListValueOf, c16fs, 8));
            animatorSet.start();
            this.LLLII = animatorSet;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GS(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog.GS(java.lang.String):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            sheetOptions.LIZ(4, null);
        } else {
            sheetOptions.LIZ(1, null);
        }
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(new C1361400lX0(requireContext(), R.style.y0));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String str;
        String string;
        PaywallViewModel paywallViewModel = this.LLLFF;
        if (paywallViewModel != null) {
            long jLIZ = (C158B.LIZ() - paywallViewModel.LLJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (paywallViewModel.LLIZ) {
                str = "cancel";
            } else if (paywallViewModel.LLILZ == 2) {
                str = "purchase_month";
            } else {
                str = "purchase_week";
            }
            Bundle bundle = paywallViewModel.LL;
            if (bundle == null || (string = bundle.getString("from")) == null) {
                string = "";
            }
            int iBQ2 = PaywallViewModel.BQ2();
            String strHQ2 = paywallViewModel.HQ2();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_second_page_duration");
            c474500IjALIZ.LJJII(strHQ2, "detail_page_version");
            c474500IjALIZ.LJJII(str, "page_type");
            c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "duration");
            c474500IjALIZ.LJJII(string, "enter_from");
            c474500IjALIZ.LJJII(Integer.valueOf(iBQ2), "user_level");
            c474500IjALIZ.LIZ();
        }
        C1104930erL c1104930erL = this.LLLJ;
        if (c1104930erL != null) {
            c1104930erL.LIZIZ();
        }
        this.LLLJ = null;
        C1104930erL c1104930erL2 = this.LLLJIL;
        if (c1104930erL2 != null) {
            c1104930erL2.LIZIZ();
        }
        this.LLLJIL = null;
    }

    public static Spannable yS(int i, String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Pair> arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                break;
            }
            int iLJJJ = a0.LJJJ(str, e3.e, i2, false, 4);
            if (iLJJJ == -1) {
                sb.append(str.substring(i2));
                break;
            }
            int i3 = iLJJJ + 1;
            int iLJJJ2 = a0.LJJJ(str, e3.f, i3, false, 4);
            if (iLJJJ2 == -1) {
                sb.append(str.substring(i2));
                break;
            }
            sb.append(str.substring(i2, iLJJJ));
            int length = sb.length();
            sb.append(str.substring(i3, iLJJJ2));
            int length2 = sb.length();
            if (length < length2) {
                arrayList.add(new Pair(Integer.valueOf(length), Integer.valueOf(length2)));
            }
            i2 = iLJJJ2 + 1;
        }
        if (arrayList.isEmpty()) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        for (Pair pair : arrayList) {
            C786410Ut5.p2(spannableString, new C444920HcY(i, false), ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 33);
        }
        return spannableString;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ColorStateList textColors;
        int i;
        MutableLiveData mutableLiveData;
        TextView textView;
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.q60);
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.q63);
        C1143680frq.LJFF(view.findViewById(R.id.q62), "tiktok_live_revenue_enigma_subscription", "enigma_paywall_dialog_top.png", null, new InterfaceC1142670fqD() { // from class: X.10eZ
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str, Exception exc) {
                System.out.print((Object) "");
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str) {
                System.out.print((Object) "");
            }
        });
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS165S0100000_31(this, 144));
        }
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS142S0100000_7(this, 209));
        }
        liveIconView.setIconTint(-1853189981);
        liveIconView2.setIconTint(-1853189981);
        this.LLLFFI = (C16F5) view.findViewById(R.id.q64);
        this.LLLFZ = (C16F5) view.findViewById(R.id.q61);
        C16FS c16fs = (C16FS) view.findViewById(R.id.q5z);
        this.LLLI = c16fs;
        if (c16fs != null) {
            c16fs.setTextColor(-16052696);
        }
        C16FS c16fs2 = this.LLLI;
        if (c16fs2 != null) {
            C16F5 c16f5 = c16fs2.LLILZIL;
            if (c16f5 != null) {
                c16f5.setTypeface(C1119920fFW.LIZIZ(500, 100));
            } else {
                SparseIntArray sparseIntArray = C1119920fFW.LIZ;
            }
        }
        C16FS c16fs3 = this.LLLI;
        if (c16fs3 != null && (textView = (TextView) c16fs3.findViewById(R.id.yvc)) != null) {
            textColors = textView.getTextColors();
        } else {
            textColors = null;
        }
        this.LLLIIII = textColors;
        C16FS c16fs4 = this.LLLI;
        if (c16fs4 != null) {
            C786410Ut5.h8(c16fs4, new ACListenerS165S0100000_31(this, 145));
        }
        this.LLLIIIL = (C16F5) view.findViewById(R.id.xj1);
        this.LLLIIL = (FrameLayout) view.findViewById(R.id.sic);
        this.LLLIILIL = (FrameLayout) view.findViewById(R.id.sib);
        this.LLLIL = (ConstraintLayout) view.findViewById(R.id.si9);
        this.LLLILZ = (FrameLayout) view.findViewById(R.id.si_);
        this.LLLILZJ = (FrameLayout) view.findViewById(R.id.sia);
        this.LLLILZLLLI = (C16F5) view.findViewById(R.id.sie);
        this.LLLIZZ = (C16F5) view.findViewById(R.id.sid);
        ConstraintLayout constraintLayout = this.LLLIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        FrameLayout frameLayout = this.LLLIIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
            frameLayout.setClickable(true);
            frameLayout.setFocusable(true);
            frameLayout.setFocusableInTouchMode(true);
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.15Ol
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.15Oj
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        FrameLayout frameLayout2 = this.LLLIILIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        C16F5 c16f52 = this.LLLILZLLLI;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, 0.0f);
            C786410Ut5.od(c16f52, this.LLL);
        }
        C16F5 c16f53 = this.LLLIZZ;
        if (c16f53 != null) {
            C786410Ut5.k5(c16f53, 0.0f);
            C786410Ut5.od(c16f53, this.LLL);
        }
        FrameLayout frameLayout3 = this.LLLILZ;
        if (frameLayout3 != null && this.LLLJ == null) {
            this.LLLJ = new C1104930erL(frameLayout3, getViewLifecycleOwner());
            C1104930erL.LIZJ();
        }
        FrameLayout frameLayout4 = this.LLLILZJ;
        if (frameLayout4 != null && this.LLLJIL == null) {
            this.LLLJIL = new C1104930erL(frameLayout4, getViewLifecycleOwner());
            C1104930erL.LIZJ();
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        EnigmaPaywallFragment enigmaPaywallFragment = new EnigmaPaywallFragment();
        enigmaPaywallFragment.LL = this.LLLFF;
        c19ehLJIIJ.LIZIZ(R.id.iiv, enigmaPaywallFragment);
        c19ehLJIIJ.LJIIIZ();
        PaywallViewModel paywallViewModel = this.LLLFF;
        if (paywallViewModel != null) {
            i = paywallViewModel.LLILZ;
        } else {
            i = 2;
        }
        this.LLLIIIIL = i;
        if (paywallViewModel != null && (mutableLiveData = paywallViewModel.LLJILJILJ) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 34));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C319060Cf2(this, null), 3);
    }

    public static final void uS(ColorStateList colorStateList, C16FS c16fs, float f) {
        int colorForState = colorStateList.getColorForState(c16fs.getDrawableState(), colorStateList.getDefaultColor());
        c16fs.setTextColor(Color.argb(C13LZ.LJ(C814420VxA.LIZIZ(Color.alpha(colorForState) * f), 0, 255), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long id;
        Bundle bundle2;
        Bundle arguments = getArguments();
        Bundle bundle3 = null;
        if (arguments != null && (bundle2 = arguments.getBundle("arg_enigma_paywall_results")) != null) {
            bundle2.getString("from");
        }
        Context context = getContext();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bundle3 = arguments2.getBundle("arg_enigma_paywall_results");
        }
        PaywallViewModel paywallViewModel = new PaywallViewModel(context, bundle3);
        this.LLLFF = paywallViewModel;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        paywallViewModel.LLILLL = id;
        return C786410Ut5.Td(layoutInflater, R.layout.gfn, viewGroup, false);
    }
}
