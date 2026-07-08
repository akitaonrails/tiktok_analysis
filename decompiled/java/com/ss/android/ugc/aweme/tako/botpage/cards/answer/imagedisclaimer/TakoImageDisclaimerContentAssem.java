package com.ss.android.ugc.aweme.tako.botpage.cards.answer.imagedisclaimer;

import X.C01GW;
import X.C098200Yq;
import X.C09RB;
import X.C09RD;
import X.C09RE;
import X.C0C64;
import X.C0DSB;
import X.C1331670kl3;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1848410yCV;
import X.C1856250yP9;
import X.C1857750yRZ;
import X.C1859250yTz;
import X.C1859260yU0;
import X.C1859280yU2;
import X.C1859290yU3;
import X.C1859300yU4;
import X.C1859620yUa;
import X.C1859810yUt;
import X.C1859900yV2;
import X.C1860130yVP;
import X.C189200o6;
import X.C1954807lC;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C376840Eq2;
import X.C418440Gaw;
import X.C431260Gvc;
import X.C444920HcY;
import X.C452501pT;
import X.C689230R1t;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857720yRW;
import X.InterfaceC712990Rxx;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoDisclaimerInfo;
import com.ss.android.ugc.aweme.tako.common.ui.TakoDisclaimerUIConfigExperiment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import mf.a;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageDisclaimerContentAssem extends ReusedUISlotAssem<TakoImageDisclaimerContentAssem> implements InterfaceC712990Rxx<InterfaceC1857720yRW> {
    public static final Regex LLJZ = new Regex("\\[(.+?)\\]\\((.+?)\\)");
    public C1860130yVP LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public LinearLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public SmartImageView LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 714));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkk;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C1860130yVP) view.findViewById(R.id.x_x);
        this.LLJL = (ConstraintLayout) view.findViewById(R.id.x5u);
        this.LLJLL = (LinearLayout) view.findViewById(R.id.x5w);
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.x5y);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.x5x);
        this.LLJLLIL = (SmartImageView) view.findViewById(R.id.x5v);
        C1860130yVP c1860130yVP = this.LLJJLIIIJLLLLLLLZ;
        if (c1860130yVP != null) {
            C1859900yV2.LIZIZ.LJFF(c1860130yVP.getContext(), c1860130yVP, 111, R.attr.a1h);
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLLL.getValue();
        if (takoCardAbility != null) {
            takoCardAbility.hw(this.LLJJLIIIJLLLLLLLZ);
        }
        C1860130yVP c1860130yVP2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1860130yVP2 != null) {
            View.OnClickListener aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(this, 65);
            if (C1848410yCV.LIZ) {
                aCListenerS161S0100000_27 = new f(aCListenerS161S0100000_27);
            }
            a aVar = new a(aCListenerS161S0100000_27);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1860130yVP2);
            }
            c1860130yVP2.setOnClickListener(aVar);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857720yRW interfaceC1857720yRW) {
        C1860130yVP c1860130yVP;
        LinearLayout linearLayout;
        boolean zLIZIZ;
        TakoDisclaimerUIConfigExperiment.Config config;
        List<String> list;
        List<String> list2;
        List<String> list3;
        C376840Eq2 c376840Eq2;
        final String str;
        MatchGroup matchGroupLJ;
        final String str2;
        boolean z;
        TakoDisclaimerInfo takoDisclaimerInfoLLJZ = interfaceC1857720yRW.LLJZ();
        if (takoDisclaimerInfoLLJZ != null) {
            int i = C1859810yUt.LIZ[takoDisclaimerInfoLLJZ.disclaimerType.ordinal()];
            boolean z2 = false;
            Object obj = null;
            if (i != 1) {
                int i2 = 2;
                if (i == 2) {
                    TuxTextView tuxTextView = this.LLJLILLLLZIIL;
                    if (tuxTextView != null) {
                        C0DSB.LIZJ(tuxTextView);
                    }
                    C1860130yVP c1860130yVP2 = this.LLJJLIIIJLLLLLLLZ;
                    if (c1860130yVP2 != null) {
                        C0DSB.LIZIZ(c1860130yVP2);
                    }
                    LinearLayout linearLayout2 = this.LLJLL;
                    if (linearLayout2 != null) {
                        C0DSB.LIZJ(linearLayout2);
                    }
                    if (takoDisclaimerInfoLLJZ.image != null) {
                        SmartImageView smartImageView = this.LLJLLIL;
                        if (smartImageView != null) {
                            C0DSB.LIZJ(smartImageView);
                        }
                        C1331670kl3 c1331670kl3LIZ = C1856250yP9.LIZ(takoDisclaimerInfoLLJZ.image);
                        c1331670kl3LIZ.LJJIJL(getContext());
                        c1331670kl3LIZ.LJJ(this.LLJLLIL);
                        C786410Ut5.h3(c1331670kl3LIZ);
                        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setGravity(8388611);
                        }
                        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
                        if (tuxTextView3 != null) {
                            C1857750yRZ.LJIILL(0, tuxTextView3);
                        }
                        LinearLayout linearLayout3 = this.LLJLL;
                        if (linearLayout3 != null) {
                            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), linearLayout3);
                        }
                    } else {
                        SmartImageView smartImageView2 = this.LLJLLIL;
                        if (smartImageView2 != null) {
                            C0DSB.LIZIZ(smartImageView2);
                        }
                        TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setGravity(49);
                        }
                        TuxTextView tuxTextView5 = this.LLJLILLLLZIIL;
                        if (tuxTextView5 != null) {
                            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView5);
                        }
                        LinearLayout linearLayout4 = this.LLJLL;
                        if (linearLayout4 != null) {
                            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), linearLayout4);
                        }
                    }
                    TuxTextView tuxTextView6 = this.LLJLILLLLZIIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(takoDisclaimerInfoLLJZ.title);
                    }
                    List<String> list4 = takoDisclaimerInfoLLJZ.newContentList;
                    if (list4 != null && (!list4.isEmpty())) {
                        int size = list4.size();
                        LinearLayout linearLayout5 = this.LLJLL;
                        if (linearLayout5 != null && size != linearLayout5.getChildCount()) {
                            while (size > linearLayout5.getChildCount()) {
                                if (linearLayout5.getChildCount() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                TuxTextView tuxTextView7 = new TuxTextView(linearLayout5.getContext(), null, 6, 0);
                                tuxTextView7.setTuxFont(81);
                                tuxTextView7.setTextColorRes(R.attr.a1k);
                                tuxTextView7.setMovementMethod(C431260Gvc.LIZ);
                                tuxTextView7.setIncludeFontPadding(false);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                if (!z) {
                                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                }
                                linearLayout5.addView(tuxTextView7, layoutParams);
                            }
                            while (size < linearLayout5.getChildCount()) {
                                C786410Ut5.LJJLJ(linearLayout5.getChildCount() - 1, linearLayout5);
                            }
                        }
                        LinearLayout linearLayout6 = this.LLJLL;
                        if (linearLayout6 != null) {
                            Iterator<View> it2 = new C09RD(linearLayout6).iterator();
                            int i3 = 0;
                            while (true) {
                                C09RE c09re = (C09RE) it2;
                                if (!c09re.hasNext()) {
                                    break;
                                }
                                int i4 = i3 + 1;
                                View view = (View) c09re.next();
                                if (view instanceof TuxTextView) {
                                    TextView textView = (TextView) view;
                                    textView.setLinksClickable(true);
                                    textView.setMovementMethod(C431260Gvc.LIZ);
                                    String str3 = (String) C13LP.LJJJLZIJ(i3, list4);
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                                    for (MatchResult matchResult : C13LP.LJLJJLL(C09RB.LJJII(Regex.findAll$default(LLJZ, str3, z2 ? 1 : 0, i2, obj)))) {
                                        MatchGroup matchGroupLJ2 = matchResult.getGroups().LJ(1);
                                        if (matchGroupLJ2 != null && (str = matchGroupLJ2.LIZ) != null && (matchGroupLJ = matchResult.getGroups().LJ(i2)) != null && (str2 = matchGroupLJ.LIZ) != null) {
                                            IntRange intRangeLIZIZ = matchResult.LIZIZ();
                                            spannableStringBuilder.replace(intRangeLIZIZ.LL, intRangeLIZIZ.LLILLJJLI + 1, (CharSequence) str);
                                            ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0yUs
                                                @Override // android.text.style.ClickableSpan
                                                public final void onClick(View view2) {
                                                    TakoCardAbility takoCardAbility = (TakoCardAbility) this.LL.LLJLLL.getValue();
                                                    if (takoCardAbility != null) {
                                                        takoCardAbility.bJ2(str, str2);
                                                    }
                                                }

                                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                                public final void updateDrawState(TextPaint textPaint) {
                                                    Integer numLIZJ;
                                                    super.updateDrawState(textPaint);
                                                    int iIntValue = 0;
                                                    textPaint.setUnderlineText(false);
                                                    Context context = this.LL.getContext();
                                                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                                                        iIntValue = numLIZJ.intValue();
                                                    }
                                                    textPaint.setColor(iIntValue);
                                                }
                                            };
                                            C444920HcY c444920HcY = new C444920HcY(82, z2);
                                            StyleSpan styleSpan = new StyleSpan(1);
                                            int i5 = intRangeLIZIZ.LL;
                                            C786410Ut5.q2(spannableStringBuilder, c444920HcY, i5, str.length() + i5, 33);
                                            int i6 = intRangeLIZIZ.LL;
                                            C786410Ut5.q2(spannableStringBuilder, styleSpan, i6, str.length() + i6, 33);
                                            int i7 = intRangeLIZIZ.LL;
                                            C786410Ut5.q2(spannableStringBuilder, clickableSpan, i7, str.length() + i7, 33);
                                        }
                                        z2 = false;
                                        i2 = 2;
                                    }
                                    textView.setText(spannableStringBuilder);
                                }
                                i3 = i4;
                                obj = null;
                            }
                        }
                    }
                    Context context = getContext();
                    if (context != null) {
                        zLIZIZ = C960203pA.LIZIZ(context);
                    } else {
                        zLIZIZ = false;
                    }
                    ConstraintLayout constraintLayout = this.LLJL;
                    if (constraintLayout != null) {
                        C376840Eq2.LJIIL.getClass();
                        TakoDisclaimerUIConfigExperiment.LIZ.getClass();
                        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                        TakoDisclaimerUIConfigExperiment.TakoDisclaimerUIConfig takoDisclaimerUIConfig = TakoDisclaimerUIConfigExperiment.LIZIZ;
                        TakoDisclaimerUIConfigExperiment.TakoDisclaimerUIConfig takoDisclaimerUIConfig2 = (TakoDisclaimerUIConfigExperiment.TakoDisclaimerUIConfig) c0c64LJIILLIIL.LJJII(TakoDisclaimerUIConfigExperiment.TakoDisclaimerUIConfig.class, takoDisclaimerUIConfig, "tako_client_disclaimer_ui_config", true);
                        if (takoDisclaimerUIConfig2 == null || (config = takoDisclaimerUIConfig2.f423android) == null) {
                            config = takoDisclaimerUIConfig.f423android;
                        }
                        if (zLIZIZ) {
                            list = config.horizontalDarkColor;
                        } else {
                            list = config.horizontalLightColor;
                        }
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<String> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(Integer.valueOf(ColorProtector.parseColor(it3.next())));
                        }
                        if (zLIZIZ) {
                            list2 = config.verticalDarkColor;
                        } else {
                            list2 = config.verticalLightColor;
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<String> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Integer.valueOf(ColorProtector.parseColor(it4.next())));
                        }
                        if (zLIZIZ) {
                            list3 = config.borderDarkColor;
                        } else {
                            list3 = config.borderLightColor;
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        Iterator<String> it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(Integer.valueOf(ColorProtector.parseColor(it5.next())));
                        }
                        try {
                            c376840Eq2 = new C376840Eq2(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue(), ((Number) arrayList2.get(2)).intValue(), ((Number) arrayList3.get(0)).intValue(), ((Number) arrayList3.get(1)).intValue());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            if (zLIZIZ) {
                                c376840Eq2 = new C376840Eq2(ColorProtector.parseColor("#1F1540"), ColorProtector.parseColor("#151142"), ColorProtector.parseColor("#A6FFFFFF"), ColorProtector.parseColor("#00FFFFFF"), 0, ColorProtector.parseColor("#261D45"), ColorProtector.parseColor("#222222"));
                            } else {
                                c376840Eq2 = new C376840Eq2(ColorProtector.parseColor("#F7F1FF"), ColorProtector.parseColor("#EEEBFF"), ColorProtector.parseColor("#A6FFFFFF"), ColorProtector.parseColor("#00FFFFFF "), 0, ColorProtector.parseColor("#1E9655FF"), ColorProtector.parseColor("#1E666666"));
                            }
                        }
                        constraintLayout.setBackground(c376840Eq2);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            if (C1859620yUa.LIZIZ() && (linearLayout = this.LLJLIL) != null) {
                C0DSB.LIZIZ(linearLayout);
            }
            TuxTextView tuxTextView8 = this.LLJLILLLLZIIL;
            if (tuxTextView8 != null) {
                C0DSB.LIZIZ(tuxTextView8);
            }
            SmartImageView smartImageView3 = this.LLJLLIL;
            if (smartImageView3 != null) {
                C0DSB.LIZIZ(smartImageView3);
            }
            LinearLayout linearLayout7 = this.LLJLL;
            if (linearLayout7 != null) {
                C0DSB.LIZIZ(linearLayout7);
            }
            String str4 = takoDisclaimerInfoLLJZ.content;
            if (str4 != null && str4.length() > 0 && (c1860130yVP = this.LLJJLIIIJLLLLLLLZ) != null) {
                C1859900yV2.LIZIZ.LJIIIIZZ(c1860130yVP, str4, C1859250yTz.LIZ(c1860130yVP, C1558520qew.LJIIL(this)), C1859250yTz.LIZJ(C1558520qew.LJIIL(this)), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)));
            }
            ConstraintLayout constraintLayout2 = this.LLJL;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackground(null);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857720yRW interfaceC1857720yRW) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857720yRW interfaceC1857720yRW) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
