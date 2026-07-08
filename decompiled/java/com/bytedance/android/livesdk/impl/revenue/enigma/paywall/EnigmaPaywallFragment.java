package com.bytedance.android.livesdk.impl.revenue.enigma.paywall;

import X.C098200Yq;
import X.C1104930erL;
import X.C1143680frq;
import X.C1308910kAL;
import X.C1546210qL5;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20513015Om;
import X.C20513415Oq;
import X.C20513515Or;
import X.C23250099c;
import X.C319300CfQ;
import X.C426750GoL;
import X.C454590Hs9;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterpolatorC1088720eRC;
import X.RunnableC514801zW;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS13S0201000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public final class EnigmaPaywallFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzHELIOSo2ZiAiICg+KWs8KDYkKSkgZwo9ISIhKB8yMTItJSMVOiQrJCo9PA==";
    public PaywallViewModel LL;
    public final long LLILLJJLI = 300;
    public final float LLILLL = 0.9f;
    public final float LLILZ = 0.5f;
    public final float LLILZIL = 0.3f;
    public final InterpolatorC1088720eRC LLILZLL = new InterpolatorC1088720eRC(0.6f, 1.0f);
    public final float LLIZ = 40.0f;
    public final float LLIZLLLIL = 4.0f;
    public final float LLJ = 28.0f;
    public final float LLJI = 16.0f;
    public View LLJIJIL;
    public View LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C1104930erL LLJILLL;

    public final void UR() {
        C1104930erL c1104930erL = this.LLJILLL;
        if (c1104930erL == null || c1104930erL.LJ || c1104930erL.LJFF || c1104930erL == null) {
            return;
        }
        c1104930erL.LJ = false;
        c1104930erL.LJFF = false;
        c1104930erL.LIZLLL = null;
        Context context = getContext();
        boolean z = context != null && C426750GoL.LIZLLL(context);
        PaywallViewModel paywallViewModel = this.LL;
        C1104930erL.LIZ(c1104930erL, (paywallViewModel == null || !paywallViewModel.LLILLJJLI) ? z ? "enigma_subscription_montly_rtl" : "enigma_subscription_montly" : z ? "enigma_subscription_montly_short_rtl" : "enigma_subscription_montly_short", null, null, 14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PaywallViewModel paywallViewModel = this.LL;
        if (paywallViewModel != null) {
            paywallViewModel.LLILZIL = new WeakReference<>(getContext());
        }
    }

    public final void SR(int i) {
        PaywallViewModel paywallViewModel = this.LL;
        if (paywallViewModel == null || i == paywallViewModel.LLILZ) {
            return;
        }
        paywallViewModel.kK0(i);
    }

    public static void OR(View view, C20513515Or c20513515Or) {
        C20513415Oq c20513415Oq;
        Object tag = null;
        if (view != null) {
            tag = view.getTag();
        }
        if ((tag instanceof C20513415Oq) && (c20513415Oq = (C20513415Oq) tag) != null) {
            View view2 = c20513415Oq.LIZLLL;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = c20513515Or.LIZLLL;
                C786410Ut5.W5(view2, layoutParams);
            }
            View view3 = c20513415Oq.LJ;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                layoutParams2.height = c20513515Or.LIZLLL + c20513515Or.LIZJ;
                C786410Ut5.W5(view3, layoutParams2);
            }
            View view4 = c20513415Oq.LJFF;
            if (view4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                marginLayoutParams.topMargin = c20513515Or.LIZJ;
                marginLayoutParams.bottomMargin = c20513515Or.LJFF;
                marginLayoutParams.height = c20513515Or.LIZLLL;
                C786410Ut5.W5(view4, marginLayoutParams);
            }
            View view5 = c20513415Oq.LJI;
            if (view5 != null) {
                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                layoutParams3.height = c20513515Or.LIZ - c20513515Or.LIZJ;
                C786410Ut5.W5(view5, layoutParams3);
            }
            C16F5 c16f5 = c20513415Oq.LJII;
            if (c16f5 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c16f5.getLayoutParams();
                marginLayoutParams2.topMargin = c20513515Or.LIZIZ;
                C786410Ut5.y6(c16f5, marginLayoutParams2);
            }
            C16F5 c16f52 = c20513415Oq.LJIIIIZZ;
            if (c16f52 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c16f52.getLayoutParams();
                marginLayoutParams3.topMargin = c20513515Or.LJ;
                C786410Ut5.y6(c16f52, marginLayoutParams3);
            }
        }
    }

    public final void NR(View view, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        Object tag;
        C20513415Oq c20513415Oq;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator interpolator3;
        if (view == null) {
            return;
        }
        float f5 = 1.0f;
        if (z) {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        } else {
            f = this.LLILLL;
            f2 = this.LLILZ;
            f3 = this.LLILZIL;
            f4 = 0.0f;
            if (!z) {
                f5 = 0.0f;
            }
            view.animate().scaleX(f).scaleY(f).alpha(f2).translationZ(f4).setDuration(this.LLILLJJLI).setInterpolator(this.LLILZLL).start();
            tag = view.getTag();
            if (!(tag instanceof C20513415Oq) && (c20513415Oq = (C20513415Oq) tag) != null) {
                View view2 = c20513415Oq.LIZIZ;
                if (view2 != null && (viewPropertyAnimatorAnimate3 = view2.animate()) != null && (viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(f3)) != null && (duration3 = viewPropertyAnimatorAlpha3.setDuration(this.LLILLJJLI)) != null && (interpolator3 = duration3.setInterpolator(this.LLILZLL)) != null) {
                    interpolator3.start();
                }
                FrameLayout frameLayout = c20513415Oq.LIZ;
                if (frameLayout != null && (viewPropertyAnimatorAnimate2 = frameLayout.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(f5)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(this.LLILLJJLI)) != null && (interpolator2 = duration2.setInterpolator(this.LLILZLL)) != null) {
                    interpolator2.start();
                }
                View view3 = c20513415Oq.LIZJ;
                if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f5)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(this.LLILLJJLI)) != null && (interpolator = duration.setInterpolator(this.LLILZLL)) != null) {
                    interpolator.start();
                    return;
                }
                return;
            }
        }
        f4 = this.LLIZLLLIL;
        view.animate().scaleX(f).scaleY(f).alpha(f2).translationZ(f4).setDuration(this.LLILLJJLI).setInterpolator(this.LLILZLL).start();
        tag = view.getTag();
        if (!(tag instanceof C20513415Oq)) {
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void PR(View view, C20513015Om c20513015Om) {
        C20513415Oq c20513415Oq;
        int iLIZIZ;
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        String str;
        float f;
        int iIntValue2;
        Integer numLIZJ3;
        int i;
        C19ME c19me;
        C1546210qL5 c1546210qL5;
        int i2;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        Object obj = null;
        if ((tag instanceof C20513415Oq) && (c20513415Oq = (C20513415Oq) tag) != null) {
            C16F5 c16f5 = c20513415Oq.LJII;
            C16F5 c16f52 = c20513415Oq.LJIIIZ;
            C16F5 c16f53 = c20513415Oq.LJIIIIZZ;
            C16F5 c16f54 = c20513415Oq.LJIIJ;
            C16F5 c16f55 = c20513415Oq.LJIIJJI;
            c16f52.setTextColor(-15590614);
            c16f54.setTextColor(-1715088129);
            if (c16f5 != null) {
                c16f5.setText(c20513015Om.LIZ);
            }
            c16f52.setText(c20513015Om.LJ);
            if (c16f53 != null) {
                c16f53.setText(c20513015Om.LIZIZ);
            }
            String str2 = c20513015Om.LIZJ;
            SpannableString spannableString = new SpannableString(str2);
            int i3 = 0;
            C786410Ut5.p2(spannableString, new StrikethroughSpan(), 0, str2.length(), 33);
            c16f54.setText(spannableString);
            if (!a0.LJJJIL(c20513015Om.LIZLLL)) {
                if (c16f55 != null) {
                    c16f55.setText(c20513015Om.LIZLLL);
                    C786410Ut5.LLJJJJ(c16f55, 0);
                }
            } else if (c16f55 != null) {
                C786410Ut5.LLJJJJ(c16f55, 8);
            }
            if (c16f53 != null) {
                ViewGroup.LayoutParams layoutParams = c16f53.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    if (c20513015Om.LJIIIZ) {
                        c19me.topToBottom = R.id.h6_;
                        c19me.bottomToBottom = -1;
                        if (!a0.LJJJIL(c20513015Om.LIZLLL)) {
                            c1546210qL5 = C1546210qL5.LIZ;
                            i2 = 17;
                        } else {
                            c1546210qL5 = C1546210qL5.LIZ;
                            i2 = 25;
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        c1546210qL5.getClass();
                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf));
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                    } else {
                        c19me.topToBottom = -1;
                        c19me.bottomToBottom = 0;
                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                    }
                } else {
                    c19me = null;
                }
                C786410Ut5.y6(c16f53, c19me);
            }
            LiveIconView liveIconView = c20513415Oq.LJIIZILJ;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new ACListenerS165S0100000_31(this, 50));
                HandlerHook.viewPost(liveIconView, new ARunnableS104S0100000_4(liveIconView, 6));
            }
            View view2 = c20513415Oq.LJIJ;
            if (view2 != null) {
                if (c20513015Om.LJIIIZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
            View view3 = c20513415Oq.LJIJI;
            if (view3 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(-15592926);
                C1546210qL5.LIZ.getClass();
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, C814420VxA.LIZIZ(C1546210qL5.LIZ(4)), C814420VxA.LIZIZ(C1546210qL5.LIZ(4)), C814420VxA.LIZIZ(C1546210qL5.LIZ(4)), C814420VxA.LIZIZ(C1546210qL5.LIZ(4))});
                view3.setBackground(gradientDrawable);
            }
            PaywallViewModel paywallViewModel = this.LL;
            if (paywallViewModel != null && paywallViewModel.LLILLJJLI) {
                C1546210qL5.LIZ.getClass();
                iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(22));
            } else {
                C1546210qL5.LIZ.getClass();
                iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(30));
            }
            View view4 = c20513415Oq.LJIJI;
            if (view4 != null) {
                view4.setPadding(view4.getPaddingStart(), iLIZIZ, view4.getPaddingEnd(), 0);
            }
            C16F5 c16f56 = c20513415Oq.LJIILLIIL;
            if (c16f56 != null) {
                HandlerHook.viewPost(c16f56, new ARunnableS13S0201000_6(c20513015Om, iLIZIZ, c20513415Oq, 1));
            }
            C1143680frq.LIZLLL(c20513415Oq.LJIIL, "tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_mask.png");
            C1143680frq.LIZLLL(c20513415Oq.LJIILIIL, "tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_whisper.png");
            C1143680frq.LIZLLL(c20513415Oq.LJIILJJIL, "tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_hide_match_points.png");
            C1143680frq.LIZLLL(c20513415Oq.LJIILL, "tiktok_live_revenue_enigma_subscription", "ttlive_enigma_features_id.png");
            C1143680frq.LIZLLL(c20513415Oq.LIZJ, "tiktok_live_revenue_enigma_subscription", "enigma_paywal_lower_corner.png");
            int iIntValue3 = -3812097;
            if (c20513015Om.LJIIIZ) {
                if (c16f5 != null) {
                    HandlerHook.viewPost(c16f5, new ARunnableS75S0200000_6(this, c16f5, 20));
                }
            } else if (c16f5 != null) {
                c16f5.getPaint().setShader(null);
                Context context = c16f5.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.epn, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -3812097;
                }
                c16f5.setTextColor(iIntValue);
            }
            if (c20513015Om.LJIIIZ) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColors(new int[]{-1, -6442753, -1181697, -3812097});
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.TL_BR);
                C1546210qL5.LIZ.getClass();
                gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C1546210qL5.LIZ(4)));
                c16f52.setBackground(gradientDrawable2);
                Context context2 = c16f52.getContext();
                if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.epm, context2)) != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = -14803403;
                }
                c16f52.setTextColor(iIntValue2);
            } else {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setColor(C497740JfY.LJI(-3355444, "#1A9DB0FF"));
                C1546210qL5.LIZ.getClass();
                gradientDrawable3.setCornerRadius(C814420VxA.LIZIZ(C1546210qL5.LIZ(4)));
                c16f52.setBackground(gradientDrawable3);
                Context context3 = c16f52.getContext();
                if (context3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.epn, context3)) != null) {
                    iIntValue3 = numLIZJ2.intValue();
                }
                c16f52.setTextColor(iIntValue3);
            }
            FrameLayout frameLayout = c20513415Oq.LIZ;
            if (Intrinsics.LJFF(view, this.LLJILJIL)) {
                if (this.LLJILLL == null) {
                    this.LLJILLL = new C1104930erL(frameLayout, getViewLifecycleOwner());
                    C1104930erL.LIZJ();
                }
                UR();
            } else {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    i3 = layoutParams2.height;
                }
                C1546210qL5.LIZ.getClass();
                if (i3 < C814420VxA.LIZIZ(C1546210qL5.LIZ(180))) {
                    str = "enigma_paywall_weekly_header_short.png";
                } else {
                    str = "enigma_paywall_weekly_header.png";
                }
                Object tag2 = frameLayout.getTag(R.id.h67);
                if (tag2 instanceof String) {
                    obj = tag2;
                }
                if (C454590Hs9.LIZ(getContext())) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.Pb(frameLayout, f);
                if (!Intrinsics.LJFF(obj, str)) {
                    frameLayout.setTag(R.id.h67, str);
                    C1143680frq.LIZLLL(frameLayout, "tiktok_live_revenue_enigma_subscription", str);
                }
            }
            if (c16f53 != null) {
                try {
                    c16f53.setTextSize(RR(c20513015Om.LIZIZ, this.LLJ, 16.0f));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            c16f54.setTextSize(RR(c20513015Om.LIZJ, this.LLJI, 10.0f));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object tag;
        MutableLiveData mutableLiveData;
        C20513415Oq c20513415Oq;
        super.onViewCreated(view, bundle);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.dgo);
        this.LLJIJIL = C786410Ut5.Td(getLayoutInflater(), R.layout.gfm, this.LLJILJILJ, false);
        this.LLJILJIL = C786410Ut5.Td(getLayoutInflater(), R.layout.gfm, this.LLJILJILJ, false);
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setTag(new C20513415Oq(view2));
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            view3.setTag(new C20513415Oq(view3));
        }
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout != null) {
            frameLayout.addView(this.LLJIJIL);
        }
        FrameLayout frameLayout2 = this.LLJILJILJ;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.LLJILJIL);
        }
        C1546210qL5.LIZ.getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(256));
        int iLIZIZ2 = C814420VxA.LIZIZ(C1546210qL5.LIZ(370));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ2);
        layoutParams.gravity = 8388627;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ2);
        layoutParams2.gravity = 8388629;
        View view4 = this.LLJIJIL;
        if (view4 != null) {
            C786410Ut5.W5(view4, layoutParams);
        }
        View view5 = this.LLJILJIL;
        if (view5 != null) {
            C786410Ut5.W5(view5, layoutParams2);
        }
        View view6 = this.LLJIJIL;
        if (view6 != null) {
            view6.setElevation(0.0f);
        }
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            view7.setElevation(0.0f);
        }
        View view8 = this.LLJIJIL;
        if (view8 != null) {
            C786410Ut5.Ob(view8, this.LLILLL);
            C786410Ut5.pc(view8, this.LLILLL);
            C786410Ut5.T4(view8, this.LLILZ);
            C786410Ut5.Jc(view8, -this.LLIZ);
            view8.setTranslationZ(0.0f);
        }
        View view9 = this.LLJILJIL;
        if (view9 != null) {
            C786410Ut5.Ob(view9, 1.0f);
            C786410Ut5.pc(view9, 1.0f);
            C786410Ut5.T4(view9, 1.0f);
            C786410Ut5.Jc(view9, 0.0f);
            view9.setTranslationZ(this.LLIZLLLIL);
        }
        View view10 = this.LLJIJIL;
        if (view10 != null) {
            tag = view10.getTag();
        } else {
            tag = null;
        }
        if ((tag instanceof C20513415Oq) && (c20513415Oq = (C20513415Oq) tag) != null) {
            View view11 = c20513415Oq.LJI;
            if (view11 != null) {
                C786410Ut5.T4(view11, this.LLILZIL);
            }
            FrameLayout frameLayout3 = c20513415Oq.LIZ;
            if (frameLayout3 != null) {
                C786410Ut5.U4(frameLayout3, 0.0f);
            }
            View view12 = c20513415Oq.LIZJ;
            if (view12 != null) {
                C786410Ut5.T4(view12, 0.0f);
            }
        }
        PaywallViewModel paywallViewModel = this.LL;
        if (paywallViewModel != null && (mutableLiveData = paywallViewModel.LLJILJILJ) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 33));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C319300CfQ(this, null), 3);
        FrameLayout frameLayout4 = this.LLJILJILJ;
        if (frameLayout4 != null) {
            HandlerHook.viewPost(frameLayout4, new ARunnableS131S0100000_31(this, 34));
        }
    }

    public static float RR(String str, float f, float f2) {
        if (a0.LJJJIL(str)) {
            return f;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        float fMeasureText = textPaint.measureText("A$159.90");
        float fMeasureText2 = textPaint.measureText(str);
        if (fMeasureText2 > 0.0f && fMeasureText2 > fMeasureText) {
            float f3 = f * (fMeasureText / fMeasureText2);
            if (f3 >= f2) {
                f2 = f3;
            }
            return (float) Math.floor(f2);
        }
        return f;
    }

    public final void MR(View view, Function0 function0, boolean z) {
        float f;
        if (view == null) {
            return;
        }
        if (z) {
            if (Intrinsics.LJFF(view, this.LLJIJIL)) {
                f = -this.LLIZ;
            } else {
                f = this.LLIZ;
            }
        } else {
            f = 0.0f;
        }
        view.animate().translationX(f).setDuration(this.LLILLJJLI).setInterpolator(this.LLILZLL).withEndAction(new RunnableC514801zW(function0, (Function0<Unit>) 108)).start();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gfo, viewGroup, false);
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
