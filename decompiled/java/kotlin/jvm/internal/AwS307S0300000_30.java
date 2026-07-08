package kotlin.jvm.internal;

import X.AbstractC20303614cU;
import X.C01GW;
import X.C09AY;
import X.C0VSP;
import X.C112R;
import X.C1295960jpS;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LQ;
import X.C14XX;
import X.C14Z0;
import X.C14Z9;
import X.C14ZA;
import X.C14ZT;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19409710wh;
import X.C19411210ww;
import X.C1954807lC;
import X.C197039127h;
import X.C20055113dV;
import X.C20082713hx;
import X.C201992141u;
import X.C20280514Xb;
import X.C20280714Xd;
import X.C20285414Yy;
import X.C20303114cP;
import X.C20303414cS;
import X.C20303514cT;
import X.C20303714cV;
import X.C2420609e8;
import X.C341940Daq;
import X.C426750GoL;
import X.C786410Ut5;
import X.C817403Hg;
import X.C988000bok;
import X.InterfaceC1680500tpg;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS94S0300000_30;
import Y.ARunnableS0S0501000_30;
import Y.AUListenerS254S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public class AwS307S0300000_30 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            C20055113dV.LIZ((AndroidComposeView) awS307S0300000_30.l0, (C2420609e8) awS307S0300000_30.l1, (Function2) awS307S0300000_30.l2, interfaceC1680500tpg, 0);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) {
        float f;
        File file = (File) obj;
        String str = (String) obj2;
        if (file == null) {
            C786410Ut5.LJLLLLLL(0, ((C20303414cS) awS307S0300000_30.l0).LLILZ);
            C20303414cS c20303414cS = (C20303414cS) awS307S0300000_30.l0;
            C786410Ut5.h9(c20303414cS.LLIZLLLIL, new ACListenerS94S0300000_30((Context) awS307S0300000_30.l2, (AbstractC20303614cU) awS307S0300000_30.l1, c20303414cS, 0));
        } else {
            AbstractC20303614cU abstractC20303614cU = (AbstractC20303614cU) awS307S0300000_30.l1;
            if (abstractC20303614cU instanceof C20303514cT) {
                C786410Ut5.LJLLLLLL(0, ((C20303414cS) awS307S0300000_30.l0).LLILZIL);
                C20303414cS c20303414cS2 = (C20303414cS) awS307S0300000_30.l0;
                Context context = (Context) awS307S0300000_30.l2;
                C20303514cT c20303514cT = (C20303514cT) ((AbstractC20303614cU) awS307S0300000_30.l1);
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C20303114cP.LIZ;
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(file));
                c1331670kl3LJI.LJJ(c20303414cS2.LLILZIL);
                C786410Ut5.h3(c1331670kl3LJI);
                SmartImageView smartImageView = c20303414cS2.LLILZIL;
                if (C426750GoL.LIZLLL(context)) {
                    f = 180.0f;
                } else {
                    f = 0.0f;
                }
                C786410Ut5.Jb(smartImageView, f);
                C20303114cP.LJIILLIIL(c20303514cT.LIZJ, c20303414cS2.LLJILJIL, c20303414cS2.LLJ);
                C20303114cP.LJIILLIIL(c20303514cT.LIZLLL, c20303414cS2.LLJILJILJ, c20303414cS2.LLJI);
                C786410Ut5.LJLLLLLL(8, c20303414cS2.LLJILLL);
                if (c20303514cT.LJ != 0) {
                    C786410Ut5.LJLLLLLL(0, c20303414cS2.LLJIJIL);
                    c20303414cS2.LLJIJIL.addView(C786410Ut5.Td(C786410Ut5.ne(context), c20303514cT.LJ, c20303414cS2.LLJIJIL, false));
                }
            } else if (abstractC20303614cU instanceof C20303714cV) {
                C786410Ut5.LJLLLLLL(0, ((C20303414cS) awS307S0300000_30.l0).LLIZ);
                C20303414cS c20303414cS3 = (C20303414cS) awS307S0300000_30.l0;
                AbstractC20303614cU abstractC20303614cU2 = (AbstractC20303614cU) awS307S0300000_30.l1;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C20303114cP.LIZ;
                C1295960jpS c1295960jpS = c20303414cS3.LLIZ;
                try {
                    c1295960jpS.setAnimation(new C0VSP(file), str);
                    c1295960jpS.setRepeatCount(-1);
                    abstractC20303614cU2.getClass();
                    throw null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) throws JSONException {
        String str;
        C1863850ybP c1863850ybP = (C1863850ybP) awS307S0300000_30.l0;
        if (c1863850ybP != null) {
            str = c1863850ybP.LLILZLL;
        } else {
            str = null;
        }
        C201992141u c201992141u = C201992141u.LIZ;
        Context context = (Context) awS307S0300000_30.l1;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS307S0300000_30.l2;
        c201992141u.getClass();
        C201992141u.LIZIZ(context, takoEnterParams, str);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS307S0300000_30.l2;
        String str2 = takoEnterParams2.enterFrom;
        String str3 = takoEnterParams2.enterMethod;
        String str4 = takoEnterParams2.processId;
        if (str == null) {
            str = "";
        }
        C1862330yYx.LJIIZILJ(c1862330yYx, str2, str3, str4, "language_style_available", "click_choose_language_style", null, null, null, null, null, null, str, takoEnterParams2.takoChatId, 10208);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float f = fFloatValue - ((C817403Hg) awS307S0300000_30.l0).element;
        C20082713hx c20082713hx = (C20082713hx) awS307S0300000_30.l1;
        ((C817403Hg) awS307S0300000_30.l0).element += c20082713hx.LIZLLL(c20082713hx.LJI(((C112R) awS307S0300000_30.l2).LIZIZ(c20082713hx.LJII(c20082713hx.LIZLLL(f)))));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) {
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        FeedSurvey feedSurvey;
        Question[] questionArr;
        Question question;
        Option[] optionArr;
        Question[] questionArr2;
        Question question2;
        Option[] optionArr2;
        Option option;
        Question[] questionArr3;
        Question question3;
        ViewStub viewStub;
        View view;
        Question question4;
        Question[] questionArr4;
        Question question5;
        Option[] optionArr3;
        Option option2;
        int iIntValue = ((Number) obj2).intValue();
        C14ZT c14zt = C14ZT.LIZ;
        C20280514Xb c20280514Xb = (C20280514Xb) awS307S0300000_30.l0;
        Aweme aweme = c20280514Xb.LL;
        C14Z0 c14z0 = c20280514Xb.LLILLL;
        FeedSurvey feedSurvey2 = c20280514Xb.LLILLJJLI;
        String aid = null;
        if (feedSurvey2 != null) {
            str = feedSurvey2.id;
        } else {
            str = null;
        }
        Option[] optionArr4 = ((Question) awS307S0300000_30.l1).options;
        if (optionArr4 != null && (option2 = optionArr4[iIntValue]) != null) {
            numValueOf = Integer.valueOf(option2.id);
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        C14Z9 c14z9 = C14ZA.Companion;
        Question question6 = (Question) awS307S0300000_30.l1;
        if (question6 != null) {
            numValueOf2 = Integer.valueOf(question6.type);
        } else {
            numValueOf2 = null;
        }
        c14z9.getClass();
        C14ZT.LJI(c14zt, aweme, c14z0, str, strValueOf, C14Z9.LIZ(numValueOf2));
        Option option3 = (Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue);
        Question[] questionArr5 = option3.questions;
        if (questionArr5 != null && questionArr5.length != 0 && (question4 = (Question) C13LQ.LJIL(questionArr5)) != null && question4.options != null && (questionArr4 = option3.questions) != null && (question5 = (Question) C13LQ.LJIL(questionArr4)) != null && (optionArr3 = question5.options) != null && optionArr3.length != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C20280514Xb c20280514Xb2 = (C20280514Xb) awS307S0300000_30.l0;
            if (jCurrentTimeMillis - c20280514Xb2.LLJLL >= 300) {
                c20280514Xb2.LLJLL = System.currentTimeMillis();
                C20280514Xb c20280514Xb3 = (C20280514Xb) awS307S0300000_30.l0;
                C19409710wh<Option> c19409710wh = c20280514Xb3.LLJJJJLIIL;
                if (c19409710wh != null) {
                    c19409710wh.LL = iIntValue;
                }
                C197039127h c197039127h = c20280514Xb3.LLJJIJIIJIL;
                if (c197039127h != null) {
                    C786410Ut5.LLLLLLJ(c197039127h, 4);
                }
                C19409710wh<Option> c19409710wh2 = c20280514Xb3.LLJJJJLIIL;
                if (c19409710wh2 != null) {
                    c19409710wh2.notifyDataSetChanged();
                }
                if (iIntValue >= 0 && (feedSurvey = c20280514Xb3.LLILLJJLI) != null && (questionArr = feedSurvey.questions) != null && (question = questionArr[0]) != null && (optionArr = question.options) != null && iIntValue < optionArr.length && feedSurvey != null && (questionArr2 = feedSurvey.questions) != null && (question2 = questionArr2[0]) != null && (optionArr2 = question2.options) != null && (option = optionArr2[iIntValue]) != null && (questionArr3 = option.questions) != null && (question3 = questionArr3[0]) != null && (viewStub = c20280514Xb3.LLJJIJIL) != null && (view = c20280514Xb3.LLJILJILJ) != null) {
                    view.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS0S0501000_30(view, c20280514Xb3, viewStub, option, iIntValue, question3, 2)).setStartDelay(200L).start();
                }
            }
        } else {
            ((C20280514Xb) awS307S0300000_30.l0).LJIJJ();
            int i = ((C20280514Xb) awS307S0300000_30.l0).LLILZIL;
            if (i != 0 && i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        Iterator it2 = ((ArrayList) awS307S0300000_30.l2).iterator();
                        while (it2.hasNext()) {
                            ((Option) it2.next()).setSelected(false);
                        }
                        ((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue)).setSelected(true);
                        TuxTextView tuxTextView = ((C20280514Xb) awS307S0300000_30.l0).LLJJIJI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue)).name);
                        }
                        TuxTextView tuxTextView2 = ((C20280514Xb) awS307S0300000_30.l0).LLJJIJI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTextColorRes(R.attr.ee);
                        }
                    }
                } else {
                    if (iIntValue >= 0) {
                        int i2 = 0;
                        while (true) {
                            ((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, i2)).setSelected(true);
                            if (i2 == iIntValue) {
                                break;
                            }
                            i2++;
                        }
                    }
                    int size = ((ArrayList) awS307S0300000_30.l2).size();
                    for (int i3 = iIntValue + 1; i3 < size; i3++) {
                        ((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, i3)).setSelected(false);
                    }
                    TuxTextView tuxTextView3 = ((C20280514Xb) awS307S0300000_30.l0).LLJJIJI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue)).name);
                    }
                    TuxTextView tuxTextView4 = ((C20280514Xb) awS307S0300000_30.l0).LLJJIJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setTextColorRes(R.attr.ee);
                    }
                }
            } else {
                Iterator it3 = ((ArrayList) awS307S0300000_30.l2).iterator();
                while (it3.hasNext()) {
                    ((Option) it3.next()).setSelected(false);
                }
                ((Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue)).setSelected(true);
            }
            C20280514Xb c20280514Xb4 = (C20280514Xb) awS307S0300000_30.l0;
            c20280514Xb4.LLJJL = iIntValue;
            C19409710wh<Option> c19409710wh3 = c20280514Xb4.LLJJJJLIIL;
            if (c19409710wh3 != null) {
                c19409710wh3.LL = iIntValue;
                c19409710wh3.notifyDataSetChanged();
            }
            ((C20280514Xb) awS307S0300000_30.l0).LLJJLIIIJLLLLLLLZ = (Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue);
            C14XX c14xx = new C14XX();
            c14xx.LIZ = ((C20280514Xb) awS307S0300000_30.l0).LLJJL;
            c14xx.LIZIZ = false;
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = ((C20280514Xb) awS307S0300000_30.l0).LL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            c20285414YyLIZ.LJI(aid, c14xx);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS307S0300000_30 awS307S0300000_30, Object obj, Object obj2) {
        FeedSurvey feedSurvey;
        Question[] questionArr;
        Question question;
        Option[] optionArr;
        Question[] questionArr2;
        Question question2;
        Option[] optionArr2;
        Option option;
        Question[] questionArr3;
        Question question3;
        ViewStub viewStub;
        View view;
        int iIntValue = ((Number) obj2).intValue();
        if (C19411210ww.LIZJ(((Option[]) awS307S0300000_30.l0)[iIntValue])) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C20280714Xd c20280714Xd = (C20280714Xd) awS307S0300000_30.l1;
            if (jCurrentTimeMillis - c20280714Xd.LLJL >= 300) {
                c20280714Xd.LLJL = System.currentTimeMillis();
                C20280714Xd c20280714Xd2 = (C20280714Xd) awS307S0300000_30.l1;
                C19409710wh<Option> c19409710wh = c20280714Xd2.LLJJJJ;
                if (c19409710wh != null) {
                    c19409710wh.LL = iIntValue;
                    c19409710wh.notifyDataSetChanged();
                }
                if (iIntValue >= 0 && (feedSurvey = c20280714Xd2.LLILLJJLI) != null && (questionArr = feedSurvey.questions) != null && (question = questionArr[0]) != null && (optionArr = question.options) != null && iIntValue < optionArr.length && feedSurvey != null && (questionArr2 = feedSurvey.questions) != null && (question2 = questionArr2[0]) != null && (optionArr2 = question2.options) != null && (option = optionArr2[iIntValue]) != null && (questionArr3 = option.questions) != null && (question3 = questionArr3[0]) != null && (viewStub = c20280714Xd2.LLJJIJI) != null && (view = c20280714Xd2.LLJILJILJ) != null) {
                    view.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS0S0501000_30(view, c20280714Xd2, viewStub, option, iIntValue, question3, 3)).setStartDelay(200L).start();
                }
            }
        } else {
            C20280714Xd c20280714Xd3 = (C20280714Xd) awS307S0300000_30.l1;
            C197039127h c197039127h = c20280714Xd3.LLJJIII;
            if (c197039127h != null) {
                if (c197039127h.getVisibility() != 0) {
                    View view2 = c20280714Xd3.LLJILJILJ;
                    if (view2 != null) {
                        int height = view2.getHeight();
                        c20280714Xd3.LLJJJJLIIL = height;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, height + C341940Daq.LIZ(44.0d));
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(view2, 14));
                        valueAnimatorOfInt.start();
                    }
                    C786410Ut5.LLLLLLJ(c197039127h, 0);
                    c197039127h.animate().alpha(1.0f).setDuration(200L).setStartDelay(150L).start();
                }
                c197039127h.setEnabled(true);
                c197039127h.setClickable(true);
                c197039127h.setButtonVariant(0);
            }
            ((C20280714Xd) awS307S0300000_30.l1).getClass();
            C19409710wh<Option> c19409710wh2 = ((C20280714Xd) awS307S0300000_30.l1).LLJJJJ;
            if (c19409710wh2 != null) {
                c19409710wh2.LL = iIntValue;
                c19409710wh2.notifyDataSetChanged();
            }
            ((C20280714Xd) awS307S0300000_30.l1).LLJJJJJIL = (Option) ListProtector.get((ArrayList) awS307S0300000_30.l2, iIntValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0300000_30(C817403Hg c817403Hg, C20082713hx c20082713hx, C112R c112r, int i) {
        super(2);
        this.$t = i;
        this.l0 = c817403Hg;
        this.l1 = c20082713hx;
        this.l2 = c112r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0300000_30(C1863850ybP c1863850ybP, Context context, TakoEnterParams takoEnterParams, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1863850ybP;
        this.l1 = context;
        this.l2 = takoEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS307S0300000_30(C20280514Xb c20280514Xb, C20280514Xb c20280514Xb2, Question question, ArrayList<Option> arrayList) {
        super(2);
        this.$t = arrayList;
        this.l0 = c20280514Xb;
        this.l1 = c20280514Xb2;
        this.l2 = question;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0300000_30(Context context, AbstractC20303614cU abstractC20303614cU, C20303414cS c20303414cS, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20303414cS;
        this.l1 = abstractC20303614cU;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS307S0300000_30(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2, C2420609e8 c2420609e8, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = androidComposeView;
        this.l1 = androidComposeView2;
        this.l2 = c2420609e8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS307S0300000_30(Option[] optionArr, Option[] optionArr2, C20280714Xd c20280714Xd, ArrayList<Option> arrayList) {
        super(2);
        this.$t = arrayList;
        this.l0 = optionArr;
        this.l1 = optionArr2;
        this.l2 = c20280714Xd;
    }
}
