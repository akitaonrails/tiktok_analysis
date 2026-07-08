package com.ss.android.ugc.aweme.tako.botpage.submodebar;

import X.C01GW;
import X.C03IT;
import X.C0GVG;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LC;
import X.C1558520qew;
import X.C1854150yLl;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class TakoSubModeItemAssem extends ReusedUISlotAssem<TakoSubModeItemAssem> implements InterfaceC712990Rxx<C1854150yLl> {
    public C1295960jpS LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxTextView LLJLIL;
    public View LLJLILLLLZIIL;
    public C1854150yLl LLJLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 750));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 751));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fl9;
    }

    public Integer op() {
        return null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.ois);
        this.LLJLILLLLZIIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 17), viewFindViewById);
        }
        this.LLJJLIIIJLLLLLLLZ = (C1295960jpS) view.findViewById(R.id.jym);
        this.LLJL = (TuxIconView) view.findViewById(R.id.oir);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.oit);
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
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1854150yLl c1854150yLl) {
        String strValueOf;
        Map<String, String> mapLJ;
        Integer num;
        int i;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        Integer numLIZJ4;
        Integer numLIZJ5;
        int iIntValue6;
        C1854150yLl c1854150yLl2 = c1854150yLl;
        C1854150yLl c1854150yLl3 = this.LLJLL;
        if (c1854150yLl3 == null || c1854150yLl3.LL != c1854150yLl2.LL || c1854150yLl3.LLJILJILJ != c1854150yLl2.LLJILJILJ) {
            if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                View view = this.LLJLILLLLZIIL;
                if (view != null) {
                    view.setBackgroundResource(R.drawable.df9);
                }
            } else {
                View view2 = this.LLJLILLLLZIIL;
                if (view2 != null) {
                    view2.setBackground((Drawable) this.LLJLLL.getValue());
                }
            }
            boolean z = c1854150yLl2.LLJJIJI;
            int i2 = 8;
            int i3 = R.attr.a1s;
            if (!z && Intrinsics.LJFF(c1854150yLl2.LLJJJIL, Boolean.TRUE) && c1854150yLl2.LLJJIJIIJIL != null && c1854150yLl2.LLJJIJIL != null) {
                Context context = getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    iIntValue6 = c1854150yLl2.LLJJIJIL.intValue();
                } else {
                    iIntValue6 = c1854150yLl2.LLJJIJIIJIL.intValue();
                }
                TuxIconView tuxIconView = this.LLJL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                C1295960jpS c1295960jpS = this.LLJJLIIIJLLLLLLLZ;
                if (c1295960jpS != null) {
                    C786410Ut5.LLD(0, c1295960jpS);
                }
                C1295960jpS c1295960jpS2 = this.LLJJLIIIJLLLLLLLZ;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.setAnimation(iIntValue6);
                }
                C1295960jpS c1295960jpS3 = this.LLJJLIIIJLLLLLLLZ;
                if (c1295960jpS3 != null) {
                    c1295960jpS3.playAnimation();
                }
            } else {
                TuxIconView tuxIconView2 = this.LLJL;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
                C1295960jpS c1295960jpS4 = this.LLJJLIIIJLLLLLLLZ;
                if (c1295960jpS4 != null) {
                    C786410Ut5.LLD(8, c1295960jpS4);
                }
                Integer num2 = c1854150yLl2.LLILLL;
                if (num2 != null) {
                    num2.intValue();
                    TuxIconView tuxIconView3 = this.LLJL;
                    if (tuxIconView3 != null && (num = c1854150yLl2.LLILLL) != null) {
                        num.intValue();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = c1854150yLl2.LLILLL.intValue();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                            i = R.attr.a1s;
                        } else {
                            i = R.attr.a1h;
                        }
                        c419910GdJ.LJ = Integer.valueOf(i);
                        tuxIconView3.setTuxIcon(c419910GdJ);
                    }
                } else {
                    TuxIconView tuxIconView4 = this.LLJL;
                    if (tuxIconView4 != null) {
                        ViewGroup.LayoutParams layoutParams = tuxIconView4.getLayoutParams();
                        Integer num3 = c1854150yLl2.LLILZLL;
                        if (num3 != null) {
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num3));
                        }
                        Integer num4 = c1854150yLl2.LLIZ;
                        if (num4 != null) {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num4));
                        }
                        C786410Ut5.M6(tuxIconView4, layoutParams);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
                        Drawable drawableLIZ = c384050F3z.LIZ(tuxIconView4.getContext());
                        if (C960203pA.LIZIZ(tuxIconView4.getContext())) {
                            strValueOf = String.valueOf(c1854150yLl2.LLILZ);
                        } else {
                            strValueOf = String.valueOf(c1854150yLl2.LLILZIL);
                        }
                        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(strValueOf)));
                        c1331670kl3LJIIJ.LJJI(tuxIconView4);
                        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLLIL.getValue();
                        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        c1331670kl3LJIIJ.LJJJIL = new C1338340kvo("action_bar", mapLJ, tuxIconView4, i2);
                        c1331670kl3LJIIJ.LJJIIZI(drawableLIZ);
                        c1331670kl3LJIIJ.LJIL(drawableLIZ);
                        c1331670kl3LJIIJ.LJIIJJI();
                    }
                }
            }
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                if (!c1854150yLl2.LLJILJILJ || !c1854150yLl2.LLJILLL) {
                    i3 = R.attr.a1h;
                }
                tuxTextView.setTextColorRes(i3);
                if (!c1854150yLl2.LLJJIJI && Intrinsics.LJFF(c1854150yLl2.LLJJJIL, Boolean.TRUE)) {
                    SpannableString spannableString = new SpannableString(c1854150yLl2.LLILLJJLI);
                    int[] iArr = new int[4];
                    Context context2 = getContext();
                    if (context2 != null && (numLIZJ5 = C1308910kAL.LIZJ(R.attr.to, context2)) != null) {
                        iIntValue = numLIZJ5.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iArr[0] = iIntValue;
                    Context context3 = getContext();
                    if (context3 != null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.ti, context3)) != null) {
                        iIntValue2 = numLIZJ4.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    iArr[1] = iIntValue2;
                    Context context4 = getContext();
                    if (context4 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.th, context4)) != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    iArr[2] = iIntValue3;
                    Context context5 = getContext();
                    if (context5 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.fj, context5)) != null) {
                        iIntValue4 = numLIZJ2.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    iArr[3] = iIntValue4;
                    float[] fArr = {0.0f, 0.33f, 0.66f, 1.0f};
                    Context context6 = getContext();
                    if (context6 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context6)) != null) {
                        iIntValue5 = numLIZJ.intValue();
                    } else {
                        iIntValue5 = -1;
                    }
                    C0GVG c0gvg = new C0GVG(iArr, fArr, tuxTextView, iIntValue5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                    C786410Ut5.p2(spannableString, c0gvg, 0, c1854150yLl2.LLILLJJLI.length(), 17);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(1500L);
                    valueAnimatorOfFloat.setStartDelay(100L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c0gvg, 185));
                    valueAnimatorOfFloat.start();
                    tuxTextView.setText(spannableString);
                    c1854150yLl2.LLJJIJI = true;
                } else {
                    tuxTextView.setText(c1854150yLl2.LLILLJJLI);
                }
            }
            tp(c1854150yLl2);
            Function1<C1854150yLl, Unit> function1 = c1854150yLl2.LLJILJIL;
            if (function1 != null) {
                function1.invoke(c1854150yLl2);
            }
        }
        this.LLJLL = c1854150yLl2;
    }

    public void sp(C1854150yLl c1854150yLl) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZIL;
            String str5 = c1863850ybP.LLILZLL;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c1863850ybP.LLIZ;
            if (str7 != null) {
                str6 = str7;
            }
            if (c1854150yLl.LLJILJILJ) {
                str = "off";
            } else {
                str = "on";
            }
            C1862330yYx.LJLI(c1862330yYx, str2, str3, str4, str5, str6, str, c1854150yLl.LLJ, null, null, null, "action_bar", "base", 4992);
        }
    }

    public void tp(C1854150yLl c1854150yLl) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZIL;
            String str5 = c1863850ybP.LLILZLL;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c1863850ybP.LLIZ;
            if (str7 != null) {
                str6 = str7;
            }
            if (c1854150yLl.LLJILJILJ) {
                str = "on";
            } else {
                str = "off";
            }
            C1862330yYx.LJLIIIL(c1862330yYx, str2, str3, str4, str5, str6, str, c1854150yLl.LLJ, null, null, "action_bar", "base", 2432);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1854150yLl c1854150yLl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1854150yLl c1854150yLl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
