package com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C13BV;
import X.C13LC;
import X.C13LE;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1701530uNb;
import X.C1785140wYS;
import X.C1856380yPM;
import X.C1858330ySV;
import X.C1858340ySW;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20235214Fq;
import X.C2217381BqS;
import X.C326880Cre;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1858260ySO;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AAListenerS275S0200000_27;
import Y.AAListenerS317S0100000_6;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiAnswerQuestionnaireAssem extends ReusedUISlotAssem<C03H5> implements InterfaceC712990Rxx<C1856380yPM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public static final Map<String, Integer> LLLIL;
    public View LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public EnumC1858260ySO LLL;
    public TakoQuestionnaire LLLF;
    public C1856380yPM LLLFF;
    public Message LLLFFI;
    public AwS571S0100000_27 LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 754));
    public final AssemVMLazy LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMultiAnswerQuestionnaireAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIL = new LinkedHashMap();
    }

    public TakoMultiAnswerQuestionnaireAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLIIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS571S0100000_27(c19719912DlLIZ, 756), AFwS269S0000000_27.get$arr$(213), null, true);
        this.LLLIIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 757));
        this.LLLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 753));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fl_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Bp() {
        Ep(this.LLJL, this.LLJLLIL, this.LLL == EnumC1858260ySO.LLILLL);
        Ep(this.LLJLIL, this.LLJLLL, this.LLL == EnumC1858260ySO.LLILZ);
        Ep(this.LLJLILLLLZIIL, this.LLJZ, this.LLL == EnumC1858260ySO.LLILZIL);
        Ep(this.LLJLL, this.LLJZIJLIL, this.LLL == EnumC1858260ySO.LLILZLL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        IMessageAbility iMessageAbilityTp;
        AwS571S0100000_27 awS571S0100000_27 = this.LLLFZ;
        if (awS571S0100000_27 != null && (iMessageAbilityTp = tp()) != null) {
            iMessageAbilityTp.fc2(awS571S0100000_27);
        }
        this.LLLFZ = null;
    }

    public final IMessageAbility tp() {
        return (IMessageAbility) this.LLLIIII.getValue();
    }

    public final String up() {
        Integer numValueOf;
        TakoQuestionnaire takoQuestionnaire = this.LLLF;
        return (takoQuestionnaire == null || (numValueOf = Integer.valueOf(takoQuestionnaire.type)) == null) ? "star_card" : numValueOf.intValue() == 2 ? "multi_answer" : numValueOf.intValue() == 3 ? "regenerate" : "star_card";
    }

    public final ITakoContextAbility yp() {
        return (ITakoContextAbility) this.LLLIIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 755);
        this.LLLFZ = awS571S0100000_27;
        IMessageAbility iMessageAbilityTp = tp();
        if (iMessageAbilityTp != null) {
            iMessageAbilityTp.tU1(awS571S0100000_27);
        }
    }

    public final Message sp() {
        List<C326880Cre> listSL;
        String str;
        C326880Cre next;
        C326880Cre next2;
        IMessageAbility iMessageAbilityTp = tp();
        if (iMessageAbilityTp == null || (listSL = iMessageAbilityTp.sL()) == null) {
            listSL = C13BV.INSTANCE;
        }
        TakoQuestionnaire takoQuestionnaire = this.LLLF;
        if (takoQuestionnaire == null || (str = takoQuestionnaire.followMessageId) == null) {
            str = "";
        }
        Iterator<C326880Cre> it2 = listSL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.LLILLL.uuid, str)) {
                break;
            }
        }
        C326880Cre c326880Cre = next;
        if (c326880Cre == null || c326880Cre.LLILLL == null) {
            return null;
        }
        Iterator<C326880Cre> it3 = listSL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (Intrinsics.LJFF(next2.LLILLL.uuid, str)) {
                break;
            }
        }
        C326880Cre c326880Cre2 = next2;
        if (c326880Cre2 != null) {
            return c326880Cre2.LLILLL;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.xa7);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.lc0), new ACListenerS161S0100000_27(this, 72));
        this.LLJL = (FrameLayout) view.findViewById(R.id.i9k);
        this.LLJLIL = (FrameLayout) view.findViewById(R.id.i9l);
        this.LLJLILLLLZIIL = (FrameLayout) view.findViewById(R.id.i3j);
        this.LLJLL = (FrameLayout) view.findViewById(R.id.i8c);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.tv_response_1);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.tv_response_2);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.zaw);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.zys);
        AssemVMLazy assemVMLazy = this.LLLIIIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS606S0100000_27(this, 231));
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.ME(new AwS606S0100000_27(this, 232));
        }
        FrameLayout frameLayout = this.LLJL;
        EnumC1858260ySO enumC1858260ySO = EnumC1858260ySO.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS129S0200000_27(enumC1858260ySO, this, 14));
        }
        FrameLayout frameLayout2 = this.LLJLIL;
        EnumC1858260ySO enumC1858260ySO2 = EnumC1858260ySO.LLILZ;
        if (frameLayout2 != null) {
            C786410Ut5.O7(frameLayout2, new ACListenerS129S0200000_27(enumC1858260ySO2, this, 14));
        }
        FrameLayout frameLayout3 = this.LLJLILLLLZIIL;
        EnumC1858260ySO enumC1858260ySO3 = EnumC1858260ySO.LLILZIL;
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS129S0200000_27(enumC1858260ySO3, this, 14));
        }
        FrameLayout frameLayout4 = this.LLJLL;
        EnumC1858260ySO enumC1858260ySO4 = EnumC1858260ySO.LLILZLL;
        if (frameLayout4 != null) {
            C786410Ut5.O7(frameLayout4, new ACListenerS129S0200000_27(enumC1858260ySO4, this, 14));
        }
    }

    public final void op(C1856380yPM c1856380yPM) {
        int i;
        int i2;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer numValueOf3;
        String str10;
        String str11;
        int iIntValue;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str12;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        C13LC<C1863850ybP> c13lcT717;
        C1863850ybP c1863850ybP7;
        C13LC<C1863850ybP> c13lcT718;
        C1863850ybP c1863850ybP8;
        C13LC<C1863850ybP> c13lcT719;
        C1863850ybP c1863850ybP9;
        if (c1856380yPM == null) {
            return;
        }
        if (this.LLLII) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
                return;
            }
            return;
        }
        Message messageSp = sp();
        if (messageSp != null) {
            i = messageSp.selectedAnswerIndex;
        } else {
            i = 0;
        }
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        String str13 = null;
        if (messageSp != null) {
            numValueOf = Integer.valueOf(messageSp.LIZ(i));
            numValueOf2 = Integer.valueOf(messageSp.LIZ(i2));
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (numValueOf2 != null && numValueOf2.intValue() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (messageSp != null) {
            str = messageSp.uuid;
        } else {
            str = null;
        }
        boolean z3 = !C1785140wYS.LIZJ(i, str);
        if (messageSp != null && messageSp.isMultiAnswer && (!z || !z2 || !z3)) {
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        this.LLL = null;
        Bp();
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityYp = yp();
        if (iTakoContextAbilityYp != null && (c13lcT719 = iTakoContextAbilityYp.T71()) != null && (c1863850ybP9 = (C1863850ybP) c13lcT719.LIZIZ()) != null) {
            str2 = c1863850ybP9.LL;
        } else {
            str2 = null;
        }
        String str14 = "";
        if (str2 == null) {
            str2 = "";
        }
        ITakoContextAbility iTakoContextAbilityYp2 = yp();
        if (iTakoContextAbilityYp2 == null || (c13lcT718 = iTakoContextAbilityYp2.T71()) == null || (c1863850ybP8 = (C1863850ybP) c13lcT718.LIZIZ()) == null || (str3 = c1863850ybP8.LLILLJJLI) == null) {
            str3 = "";
        }
        ITakoContextAbility iTakoContextAbilityYp3 = yp();
        if (iTakoContextAbilityYp3 == null || (c13lcT717 = iTakoContextAbilityYp3.T71()) == null || (c1863850ybP7 = (C1863850ybP) c13lcT717.LIZIZ()) == null || (str4 = c1863850ybP7.LLILZIL) == null) {
            str4 = "";
        }
        ITakoContextAbility iTakoContextAbilityYp4 = yp();
        if (iTakoContextAbilityYp4 == null || (c13lcT716 = iTakoContextAbilityYp4.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str5 = c1863850ybP6.LLILZLL) == null) {
            str5 = "";
        }
        C20235214Fq c20235214Fq = C20235214Fq.LIZ;
        ITakoContextAbility iTakoContextAbilityYp5 = yp();
        if (iTakoContextAbilityYp5 == null || (c13lcT715 = iTakoContextAbilityYp5.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str6 = c1863850ybP5.LLILZIL) == null) {
            str6 = "";
        }
        c20235214Fq.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str6);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        ITakoContextAbility iTakoContextAbilityYp6 = yp();
        if (iTakoContextAbilityYp6 == null || (c13lcT714 = iTakoContextAbilityYp6.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str7 = c1863850ybP4.LLILZIL) == null) {
            str7 = "";
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str7);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        ITakoContextAbility iTakoContextAbilityYp7 = yp();
        if (iTakoContextAbilityYp7 == null || (c13lcT713 = iTakoContextAbilityYp7.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null || (str8 = c1863850ybP3.LLILLL) == null) {
            str8 = "";
        }
        ITakoContextAbility iTakoContextAbilityYp8 = yp();
        if (iTakoContextAbilityYp8 == null || (c13lcT712 = iTakoContextAbilityYp8.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str9 = c1863850ybP2.LLILZ) == null) {
            str9 = "";
        }
        TakoQuestionnaire takoQuestionnaire = this.LLLF;
        if (takoQuestionnaire != null) {
            numValueOf3 = Integer.valueOf(takoQuestionnaire.id);
        } else {
            numValueOf3 = null;
        }
        String strValueOf = String.valueOf(numValueOf3);
        TakoQuestionnaire takoQuestionnaire2 = this.LLLF;
        if (takoQuestionnaire2 == null || (str10 = takoQuestionnaire2.followReplyMessageId) == null) {
            str10 = "";
        }
        if (takoQuestionnaire2 == null || (str11 = takoQuestionnaire2.followMessageId) == null) {
            str11 = "";
        }
        Map<String, Integer> map = LLLIL;
        Message message = this.LLLFFI;
        if (message != null && (str12 = message.uuid) != null) {
            str14 = str12;
        }
        Integer num = (Integer) ((LinkedHashMap) map).get(str14);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String strUp = up();
        ITakoContextAbility iTakoContextAbilityYp9 = yp();
        if (iTakoContextAbilityYp9 != null && (c13lcT71 = iTakoContextAbilityYp9.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str13 = c1863850ybP.LLIZ;
        }
        C1862330yYx.LJJLIIIIJ(c1862330yYx, str2, str3, str4, strLIZJ, strLIZLLL, str8, str9, strValueOf, str10, str11, iIntValue, strUp, str5, str13);
        if (this.LLLI) {
            View view4 = this.LLJJLIIIJLLLLLLLZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
                C786410Ut5.T4(view4, 1.0f);
                return;
            }
            return;
        }
        View view5 = this.LLJJLIIIJLLLLLLLZ;
        if (view5 == null) {
            return;
        }
        view5.animate().cancel();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view5, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(300L);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(view5, 80));
        objectAnimatorOfFloat.addListener(new AAListenerS275S0200000_27(view5, this, 4));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1856380yPM c1856380yPM) {
        String str;
        String str2;
        String str3;
        String str4;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1856380yPM c1856380yPM2 = c1856380yPM;
        Message message = this.LLLFFI;
        String str5 = null;
        if (message != null) {
            str = message.uuid;
        } else {
            str = null;
        }
        Message message2 = c1856380yPM2.LLILLL;
        if (message2 != null) {
            str2 = message2.uuid;
        } else {
            str2 = null;
        }
        this.LLLI = Intrinsics.LJFF(str, str2);
        this.LLLFF = c1856380yPM2;
        this.LLLF = c1856380yPM2.LLILLJJLI;
        Message message3 = c1856380yPM2.LLILLL;
        this.LLLFFI = message3;
        Map<String, Integer> map = LLLIL;
        if (message3 != null) {
            str3 = message3.uuid;
        } else {
            str3 = null;
        }
        if (!map.containsKey(str3)) {
            Message message4 = this.LLLFFI;
            if (message4 == null || (str4 = message4.uuid) == null) {
                str4 = "";
            }
            ITakoContextAbility iTakoContextAbilityYp = yp();
            if (iTakoContextAbilityYp != null && (c13lcT71 = iTakoContextAbilityYp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                str5 = c1863850ybP.LLILZIL;
            }
            map.put(str4, Integer.valueOf(C1701530uNb.LIZ(str5)));
        }
        op(c1856380yPM2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1856380yPM c1856380yPM) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(X.EnumC1858260ySO r39) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoMultiAnswerQuestionnaireAssem.zp(X.0ySO):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1856380yPM c1856380yPM) {
    }

    public final void Ap(EnumC1858260ySO enumC1858260ySO, int i) {
        ITakoContextAbility iTakoContextAbilityYp;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        String str;
        C1858330ySV c1858330ySVLIZ;
        Message messageSp = sp();
        if (messageSp != null && messageSp.isMultiAnswer && (iTakoContextAbilityYp = yp()) != null && (c13lcT71 = iTakoContextAbilityYp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            int iOrdinal = enumC1858260ySO.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            str = "click_close";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str = "click_neither";
                    }
                } else {
                    str = "click_both";
                }
            } else {
                str = "choose";
            }
            String str2 = messageSp.uuid;
            if (str2.length() > 0 && (c1858330ySVLIZ = C1858340ySW.LIZ(str2)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1858340ySW.LIZJ(jCurrentTimeMillis, str2);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = c1863850ybP.LL;
                String str4 = c1863850ybP.LLILLJJLI;
                String str5 = messageSp.uuid;
                Integer numValueOf = Integer.valueOf(c1858330ySVLIZ.LIZ + 1);
                String str6 = c1863850ybP.LLILZIL;
                String str7 = c1863850ybP.LLILZLL;
                String str8 = "";
                if (str7 == null) {
                    str7 = "";
                }
                String str9 = c1863850ybP.LLIZ;
                if (str9 != null) {
                    str8 = str9;
                }
                C1862330yYx.LJLJLLL(c1862330yYx, str3, str4, str5, numValueOf, str6, str7, str8, str, strNZ0, (jCurrentTimeMillis - c1858330ySVLIZ.LIZIZ) - c1858330ySVLIZ.LIZJ);
                C1858340ySW.LIZIZ(i, jCurrentTimeMillis, str2);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public static void Ep(FrameLayout frameLayout, TuxTextView tuxTextView, boolean z) {
        int i;
        int i2;
        if (frameLayout == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a00);
        frameLayout.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
        if (tuxTextView != null) {
            if (z) {
                i2 = R.attr.a1h;
            } else {
                i2 = R.attr.a1k;
            }
            tuxTextView.setTextColorRes(i2);
        }
    }
}
