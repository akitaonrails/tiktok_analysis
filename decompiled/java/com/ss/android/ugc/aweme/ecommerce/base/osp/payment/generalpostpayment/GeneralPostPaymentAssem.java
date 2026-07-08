package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C0OM1;
import X.C1018503yZ;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13EN;
import X.C13EO;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1722180uuu;
import X.C19719912Dl;
import X.C19EH;
import X.C19ME;
import X.C21578619ce;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C443120HZe;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C877103bl;
import X.C933003km;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralPostPaymentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 394));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 287));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 392));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 393));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 285));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 284));
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GeneralPostPaymentAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/generalpostpayment/GeneralPostPaymentAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GeneralPostPaymentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GeneralPostPaymentAssemViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 286), AFwS268S0000000_26.get$arr$(206), null, true);
        this.LLJJ = new C1559260qg8(new C723580SZw(this, C1722180uuu.class, null), checkSupervisorPrepared());
    }

    public final C1722180uuu Go() {
        return (C1722180uuu) this.LLJJ.getValue();
    }

    public final GeneralPostPaymentAssemViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (GeneralPostPaymentAssemViewModel) assemVMLazy.getValue();
    }

    public final void Jo() {
        String str;
        String str2;
        C1722180uuu c1722180uuuGo = Go();
        if (c1722180uuuGo == null) {
            return;
        }
        if (!Intrinsics.LJFF(c1722180uuuGo.LLIZLLLIL, "VISA_PAYMENT_SIGNAL")) {
            Ho().LLILLL = "return";
            C877103bl.LJ("close", Ho().LL);
        }
        boolean z = c1722180uuuGo.LLILLJJLI;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel = c1722180uuuGo.LLILZLL;
        if (generalPostPaymentGuideModel != null) {
            if (Intrinsics.LJFF(c1722180uuuGo.LLIZLLLIL, "VISA_PAYMENT_SIGNAL")) {
                Object obj = Ho().LL.get("page_id");
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = "authorize_payment_signal";
                }
                Object obj2 = Ho().LL.get("previous_page_id");
                if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                    Object obj3 = Ho().LL.get("previous_page");
                    if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
                        str2 = "";
                    }
                }
                Map<String, Object> mapWQ2 = Ho().wQ2(str, str2);
                mapWQ2.put("button_id", "Skip");
                C1018503yZ.LIZIZ("pipo_button_click", mapWQ2, true);
            }
            if (!z) {
                Ho().yQ2(generalPostPaymentGuideModel, "skip", c1722180uuuGo.LLIZLLLIL, new AwS570S0100000_26(this, 391));
                return;
            }
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", "backup_payment");
                jSONObject.put("action", "skip");
                jSONObject.put("result", false);
                iEventCenter.LIZ("ec_checkout_guide_exit", C786410Ut5.J3(jSONObject));
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C19EH c19ehLJIIJ = fragmentLJI.getParentFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJI);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    public final void Lo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isAdded()) {
            C19EH c19ehLJIIJ = fragmentLJI.getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJI);
            c19ehLJIIJ.LJIIJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        boolean z;
        String str2;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel;
        AbstractC1250290idn abstractC1250290idn;
        String str3;
        String str4;
        String str5;
        String str6;
        C19ME c19me;
        ViewGroup viewGroup;
        TuxTextView tuxTextView;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel2;
        String str7;
        String str8;
        int i;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel3;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel4;
        super.onViewCreated(view);
        C1722180uuu c1722180uuuGo = Go();
        AttributeSet attributeSet = null;
        if (c1722180uuuGo != null) {
            str = c1722180uuuGo.LLIZLLLIL;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "VISA_PAYMENT_SIGNAL");
        C1722180uuu c1722180uuuGo2 = Go();
        int i2 = 0;
        if (c1722180uuuGo2 != null && c1722180uuuGo2.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLIZLLLIL.getValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        if (z) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1631));
            abstractC1250290idn = c1251150ifB;
        } else {
            C1250300ido c1250300ido = new C1250300ido();
            C1722180uuu c1722180uuuGo3 = Go();
            if (c1722180uuuGo3 == null || (generalPostPaymentGuideModel = c1722180uuuGo3.LLILZLL) == null || (str2 = generalPostPaymentGuideModel.skipBtn) == null) {
                str2 = "Skip";
            }
            c1250300ido.LIZJ = str2;
            c1250300ido.LIZ(new AwS570S0100000_26(this, 1632));
            abstractC1250290idn = c1250300ido;
        }
        abstractC1250290idnArr[0] = abstractC1250290idn;
        c0om1.LIZIZ(abstractC1250290idnArr);
        tuxNavBar.setNavActions(c0om1);
        if (!zLJFF) {
            C877103bl.LJFF("close", Ho().LL);
        }
        TextView textView = (TextView) this.LLJILJILJ.getValue();
        C786410Ut5.I7(new AjS70S0100000_26(this, 111), textView);
        C1722180uuu c1722180uuuGo4 = Go();
        if (c1722180uuuGo4 != null && (generalPostPaymentGuideModel4 = c1722180uuuGo4.LLILZLL) != null) {
            str3 = generalPostPaymentGuideModel4.enableBtn;
        } else {
            str3 = null;
        }
        textView.setText(str3);
        if (!zLJFF) {
            C877103bl.LJFF("turn_on", Ho().LL);
        } else {
            Object obj = Ho().LL.get("page_id");
            if (!(obj instanceof String) || (str4 = (String) obj) == null) {
                str4 = "authorize_payment_signal";
            }
            Object obj2 = Ho().LL.get("previous_page_id");
            if (!(obj2 instanceof String) || (str5 = (String) obj2) == null) {
                Object obj3 = Ho().LL.get("previous_page");
                if (!(obj3 instanceof String) || (str5 = (String) obj3) == null) {
                    str5 = "";
                }
            }
            Map<String, Object> mapWQ2 = Ho().wQ2(str4, str5);
            mapWQ2.put("button_id", "Skip");
            C1018503yZ.LIZIZ("pipo_button_show", mapWQ2, true);
            Map<String, Object> mapWQ22 = Ho().wQ2(str4, str5);
            mapWQ22.put("button_id", "Continue");
            C1018503yZ.LIZIZ("pipo_button_show", mapWQ22, true);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLJ.getValue();
        C1722180uuu c1722180uuuGo5 = Go();
        if (c1722180uuuGo5 != null && (generalPostPaymentGuideModel3 = c1722180uuuGo5.LLILZLL) != null) {
            str6 = generalPostPaymentGuideModel3.title;
        } else {
            str6 = null;
        }
        tuxTextView2.setText(str6);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        Context context = getContext();
        if (context != null) {
            ImageView imageView = (ImageView) this.LLJI.getValue();
            C0HTI c0hti = new C0HTI();
            if (zLJFF) {
                i = R.drawable.f622p2;
            } else {
                i = R.drawable.nr;
            }
            c0hti.LIZ = i;
            imageView.setImageDrawable(c0hti.LIZ(context));
        }
        C1722180uuu c1722180uuuGo6 = Go();
        int i3 = -2;
        int i4 = -1;
        if (c1722180uuuGo6 != null && (generalPostPaymentGuideModel2 = c1722180uuuGo6.LLILZLL) != null && (str7 = generalPostPaymentGuideModel2.instruction) != null) {
            Context context2 = ((View) this.LLJIJIL.getValue()).getContext();
            List<??> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str7, new String[]{"#"}, 0, 6);
            if (listLJJLIIIJILLIZJL != null) {
                for (?? LIZ : listLJJLIIIJILLIZJL) {
                    ?? linearLayout = new LinearLayout(context2);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i3);
                    layoutParams.setMargins(i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), i2, i2);
                    C786410Ut5.d6(linearLayout, layoutParams);
                    linearLayout.setOrientation(i2);
                    TuxIconView tuxIconView = new TuxIconView(context2, attributeSet, i2, 6, attributeSet);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                    tuxIconView.setTuxIcon(c419910GdJ);
                    C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                    ?? tuxTextView3 = new TuxTextView(context2, attributeSet, 6, i2);
                    tuxTextView3.setId(View.generateViewId());
                    C786410Ut5.R6(tuxTextView3, new LinearLayout.LayoutParams(i4, i3));
                    C1722180uuu c1722180uuuGo7 = Go();
                    Object obj4 = attributeSet;
                    if (c1722180uuuGo7 != null) {
                        obj4 = c1722180uuuGo7.LLIZLLLIL;
                    }
                    if (Intrinsics.LJFF(obj4, "VISA_PAYMENT_SIGNAL")) {
                        CharSequence charSequenceLIZ = C933003km.LIZ(LIZ);
                        final Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2);
                        final AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(context2, 174);
                        LIZ = new SpannableStringBuilder(charSequenceLIZ);
                        Matcher matcher = C933003km.LIZIZ.matcher(LIZ.toString());
                        ArrayList arrayList = new ArrayList();
                        while (matcher.find()) {
                            Integer numValueOf = Integer.valueOf(matcher.start());
                            Integer numValueOf2 = Integer.valueOf(matcher.end());
                            String strGroup = matcher.group(1);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            String strGroup2 = matcher.group(2);
                            if (strGroup2 == null) {
                                strGroup2 = "";
                            }
                            arrayList.add(new C443120HZe(numValueOf, numValueOf2, new Pair(strGroup, strGroup2)));
                        }
                        Iterator it2 = new C13EO(arrayList).iterator();
                        while (true) {
                            C13EN c13en = (C13EN) it2;
                            if (!c13en.hasNext()) {
                                break;
                            }
                            C443120HZe c443120HZe = (C443120HZe) c13en.next();
                            int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                            int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
                            Pair pair = (Pair) c443120HZe.getThird();
                            String str9 = (String) pair.getFirst();
                            final String str10 = (String) pair.getSecond();
                            LIZ.replace(iIntValue, iIntValue2, str9);
                            int length = str9.length() + iIntValue;
                            if (numLIZJ != null) {
                                C786410Ut5.q2(LIZ, new ForegroundColorSpan(numLIZJ.intValue()), iIntValue, length, 33);
                            }
                            C786410Ut5.q2(LIZ, new StyleSpan(1), iIntValue, length, 33);
                            if (!a0.LJJJIL(str10)) {
                                C786410Ut5.q2(LIZ, new ClickableSpan() { // from class: X.0Go0
                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view2) {
                                        awS582S0100000_3.invoke(str10);
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        Integer num = numLIZJ;
                                        if (num != null) {
                                            textPaint.setColor(num.intValue());
                                        }
                                        textPaint.setUnderlineText(false);
                                    }
                                }, iIntValue, length, 33);
                            }
                        }
                    } else if (zLJFF) {
                        LIZ = C933003km.LIZ(LIZ);
                    }
                    tuxTextView3.setText(LIZ);
                    tuxTextView3.setTextColorRes(R.attr.a1h);
                    tuxTextView3.setTuxFont(41);
                    C1722180uuu c1722180uuuGo8 = Go();
                    if (c1722180uuuGo8 != null) {
                        str8 = c1722180uuuGo8.LLIZLLLIL;
                    } else {
                        str8 = null;
                    }
                    if (Intrinsics.LJFF(str8, "VISA_PAYMENT_SIGNAL")) {
                        tuxTextView3.setClickable(true);
                        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                        tuxTextView3.setHighlightColor(0);
                    }
                    linearLayout.addView(tuxIconView);
                    linearLayout.addView(tuxTextView3);
                    ((ViewGroup) this.LLJIJIL.getValue()).addView(linearLayout);
                    attributeSet = null;
                    i2 = 0;
                    i3 = -2;
                    i4 = -1;
                }
            }
        }
        if (zLJFF) {
            ViewGroup.LayoutParams layoutParams2 = ((View) this.LLJILJIL.getValue()).getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).height = i2;
                c19me.topToTop = i4;
                c19me.topToBottom = R.id.p19;
                c19me.bottomToTop = R.id.cpz;
                c19me.startToStart = i2;
                c19me.endToEnd = i2;
                C786410Ut5.o6((C21578619ce) this.LLJILJIL.getValue(), c19me);
                int childCount = ((ViewGroup) this.LLJIJIL.getValue()).getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = ((ViewGroup) this.LLJIJIL.getValue()).getChildAt(i5);
                    if ((childAt instanceof LinearLayout) && (viewGroup = (ViewGroup) childAt) != null) {
                        View childAt2 = viewGroup.getChildAt(1);
                        if ((childAt2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) childAt2) != null) {
                            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(0, i3, 1.0f));
                            tuxTextView.setFocusable(false);
                            tuxTextView.setFocusableInTouchMode(false);
                        }
                    }
                }
                HandlerHook.viewPost((View) this.LLJILJIL.getValue(), new ARunnableS124S0100000_24(this, 176));
            }
        }
    }
}
