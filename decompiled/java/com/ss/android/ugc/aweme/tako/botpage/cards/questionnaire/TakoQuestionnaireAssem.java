package com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire;

import X.C01GW;
import X.C03H5;
import X.C054G;
import X.C0PEM;
import X.C1203430hQD;
import X.C13LC;
import X.C13LP;
import X.C1701530uNb;
import X.C1856170yP1;
import X.C1856180yP2;
import X.C1856370yPL;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C20235214Fq;
import X.C2296808zG;
import X.C23250099c;
import X.C326880Cre;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1203470hQH;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.RunnableC1857600yRK;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS95S0200000_26;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireFragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoQuestionnaireAssem extends ReusedUISlotAssem<C03H5> implements InterfaceC712990Rxx<C1856370yPL> {
    public static final Map<String, Integer> LLLF = new LinkedHashMap();
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C1203430hQD LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TakoQuestionnaire LLJLLIL;
    public Message LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 758));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 759));
    public final C054G LLL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flh;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final String op() {
        List<C326880Cre> listSL;
        C326880Cre c326880CrePrevious;
        Message message;
        String str;
        TakoMixFeed takoMixFeedLJIIIZ;
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJZ.getValue();
        if (iMessageAbility != null && (listSL = iMessageAbility.sL()) != null) {
            ListIterator<C326880Cre> listIterator = listSL.listIterator(listSL.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c326880CrePrevious = null;
                    break;
                }
                c326880CrePrevious = listIterator.previous();
                Message message2 = c326880CrePrevious.LLILLL;
                if (!message2.sender.isSelf && ((takoMixFeedLJIIIZ = message2.LJIIIZ()) == null || takoMixFeedLJIIIZ.cardType != 10001)) {
                    break;
                }
            }
            C326880Cre c326880Cre = c326880CrePrevious;
            if (c326880Cre != null && (message = c326880Cre.LLILLL) != null && (str = message.uuid) != null) {
                return str;
            }
        }
        return "";
    }

    public final String sp() {
        List<C326880Cre> listSL;
        C326880Cre c326880CrePrevious;
        Message message;
        String str;
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJZ.getValue();
        if (iMessageAbility != null && (listSL = iMessageAbility.sL()) != null) {
            ListIterator<C326880Cre> listIterator = listSL.listIterator(listSL.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c326880CrePrevious = null;
                    break;
                }
                c326880CrePrevious = listIterator.previous();
                if (c326880CrePrevious.LLILLL.sender.isSelf) {
                    break;
                }
            }
            C326880Cre c326880Cre = c326880CrePrevious;
            if (c326880Cre != null && (message = c326880Cre.LLILLL) != null && (str = message.uuid) != null) {
                return str;
            }
        }
        return "";
    }

    public final ITakoContextAbility tp() {
        return (ITakoContextAbility) this.LLJZIJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.xbc);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        this.LLJL = (TuxTextView) view.findViewById(R.id.xbe);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.xbb), new ACListenerS161S0100000_27(this, 73));
        this.LLJLIL = (C1203430hQD) view.findViewById(R.id.xbd);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.xbh);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.xbg);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1856370yPL c1856370yPL) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer numValueOf;
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
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        C13LC<C1863850ybP> c13lcT7110;
        C1863850ybP c1863850ybP10;
        C1856370yPL c1856370yPL2 = c1856370yPL;
        this.LLJLLIL = c1856370yPL2.LLILLJJLI;
        Message message = c1856370yPL2.LLILLL;
        this.LLJLLL = message;
        Map<String, Integer> map = LLLF;
        String str18 = null;
        if (message != null) {
            str = message.uuid;
        } else {
            str = null;
        }
        String str19 = "";
        if (!map.containsKey(str)) {
            Message message2 = this.LLJLLL;
            if (message2 == null || (str16 = message2.uuid) == null) {
                str16 = "";
            }
            ITakoContextAbility iTakoContextAbilityTp = tp();
            if (iTakoContextAbilityTp != null && (c13lcT7110 = iTakoContextAbilityTp.T71()) != null && (c1863850ybP10 = (C1863850ybP) c13lcT7110.LIZIZ()) != null) {
                str17 = c1863850ybP10.LLILZIL;
            } else {
                str17 = null;
            }
            map.put(str16, Integer.valueOf(C1701530uNb.LIZ(str17)));
        }
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            TakoQuestionnaire takoQuestionnaire = this.LLJLLIL;
            if (takoQuestionnaire != null) {
                str15 = takoQuestionnaire.title;
            } else {
                str15 = null;
            }
            tuxTextView.setText(str15);
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            TakoQuestionnaire takoQuestionnaire2 = this.LLJLLIL;
            if (takoQuestionnaire2 != null) {
                str14 = takoQuestionnaire2.veryGoodText;
            } else {
                str14 = null;
            }
            tuxTextView2.setText(str14);
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            TakoQuestionnaire takoQuestionnaire3 = this.LLJLLIL;
            if (takoQuestionnaire3 != null) {
                str13 = takoQuestionnaire3.veryBadText;
            } else {
                str13 = null;
            }
            tuxTextView3.setText(str13);
        }
        C1203430hQD c1203430hQD = this.LLJLIL;
        if (c1203430hQD != null) {
            c1203430hQD.setOnValueSelectedListener(new InterfaceC1203470hQH() { // from class: X.0yRI
                @Override // X.InterfaceC1203470hQH
                public final void LIZ(final int i) {
                    int i2;
                    ITakoContextAbility iTakoContextAbilityTp2;
                    Map<String, String> commonParams;
                    TakoQuestionnaire takoQuestionnaire4;
                    String str20;
                    String str21;
                    String str22;
                    String str23;
                    String str24;
                    String str25;
                    String str26;
                    String str27;
                    Integer numValueOf2;
                    String str28;
                    String str29;
                    String str30;
                    C13LC<C1863850ybP> c13lcT7111;
                    C1863850ybP c1863850ybP11;
                    C13LC<C1863850ybP> c13lcT7112;
                    C1863850ybP c1863850ybP12;
                    String str31;
                    C13LC<C1863850ybP> c13lcT7113;
                    C1863850ybP c1863850ybP13;
                    C13LC<C1863850ybP> c13lcT7114;
                    C1863850ybP c1863850ybP14;
                    C13LC<C1863850ybP> c13lcT7115;
                    C1863850ybP c1863850ybP15;
                    C13LC<C1863850ybP> c13lcT7116;
                    C1863850ybP c1863850ybP16;
                    C13LC<C1863850ybP> c13lcT7117;
                    C1863850ybP c1863850ybP17;
                    C13LC<C1863850ybP> c13lcT7118;
                    C1863850ybP c1863850ybP18;
                    C13LC<C1863850ybP> c13lcT7119;
                    C1863850ybP c1863850ybP19;
                    C13LC<C1863850ybP> c13lcT7120;
                    C1863850ybP c1863850ybP20;
                    final TakoQuestionnaireAssem takoQuestionnaireAssem = this.LIZ;
                    C1203430hQD c1203430hQD2 = takoQuestionnaireAssem.LLJLIL;
                    int iIntValue2 = 0;
                    if (c1203430hQD2 != null) {
                        c1203430hQD2.setRatingTouchEnable(false);
                    }
                    TakoQuestionnaire takoQuestionnaire5 = takoQuestionnaireAssem.LLJLLIL;
                    if (takoQuestionnaire5 != null) {
                        i2 = takoQuestionnaire5.starNum;
                    } else {
                        i2 = 3;
                    }
                    String str32 = null;
                    if (i > i2) {
                        takoQuestionnaireAssem.up(i, null, null);
                        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(takoQuestionnaireAssem, 1376);
                        View view2 = takoQuestionnaireAssem.LLJJLIIIJLLLLLLLZ;
                        if (view2 != null) {
                            HandlerHook.viewPostDelay(view2, new RunnableC1857600yRK(takoQuestionnaireAssem, 200L, awS571S0100000_27), 300L);
                        }
                    } else {
                        FragmentManager fragmentManagerLIZ = C20230914Dz.LIZ(takoQuestionnaireAssem.getContentView(), C724240Sb0.LIZ(takoQuestionnaireAssem));
                        if (fragmentManagerLIZ != null && (iTakoContextAbilityTp2 = takoQuestionnaireAssem.tp()) != null && (commonParams = iTakoContextAbilityTp2.getCommonParams()) != null && (takoQuestionnaire4 = takoQuestionnaireAssem.LLJLLIL) != null) {
                            TakoSecondLevelQuestionnaireFragment takoSecondLevelQuestionnaireFragment = new TakoSecondLevelQuestionnaireFragment();
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJIZ(bundle, "tako_questionnaire", takoQuestionnaire4);
                            takoSecondLevelQuestionnaireFragment.setArguments(bundle);
                            takoSecondLevelQuestionnaireFragment.LLILLL = commonParams;
                            takoSecondLevelQuestionnaireFragment.LL = new InterfaceC1856100yOu() { // from class: X.0yRJ
                                @Override // X.InterfaceC1856100yOu
                                public final void onShow() {
                                    String str33;
                                    String str34;
                                    String str35;
                                    String str36;
                                    String str37;
                                    String str38;
                                    String str39;
                                    String str40;
                                    String str41;
                                    C13LC<C1863850ybP> c13lcT7121;
                                    C1863850ybP c1863850ybP21;
                                    String str42;
                                    C13LC<C1863850ybP> c13lcT7122;
                                    C1863850ybP c1863850ybP22;
                                    C13LC<C1863850ybP> c13lcT7123;
                                    C1863850ybP c1863850ybP23;
                                    C13LC<C1863850ybP> c13lcT7124;
                                    C1863850ybP c1863850ybP24;
                                    C13LC<C1863850ybP> c13lcT7125;
                                    C1863850ybP c1863850ybP25;
                                    C13LC<C1863850ybP> c13lcT7126;
                                    C1863850ybP c1863850ybP26;
                                    C13LC<C1863850ybP> c13lcT7127;
                                    C1863850ybP c1863850ybP27;
                                    C13LC<C1863850ybP> c13lcT7128;
                                    C1863850ybP c1863850ybP28;
                                    C13LC<C1863850ybP> c13lcT7129;
                                    C1863850ybP c1863850ybP29;
                                    TakoQuestionnaireAssem takoQuestionnaireAssem2 = takoQuestionnaireAssem;
                                    takoQuestionnaireAssem2.getClass();
                                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                                    ITakoContextAbility iTakoContextAbilityTp3 = takoQuestionnaireAssem2.tp();
                                    String str43 = (iTakoContextAbilityTp3 == null || (c13lcT7129 = iTakoContextAbilityTp3.T71()) == null || (c1863850ybP29 = (C1863850ybP) c13lcT7129.LIZIZ()) == null) ? null : c1863850ybP29.LL;
                                    String str44 = "";
                                    if (str43 == null) {
                                        str43 = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp4 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp4 == null || (c13lcT7128 = iTakoContextAbilityTp4.T71()) == null || (c1863850ybP28 = (C1863850ybP) c13lcT7128.LIZIZ()) == null || (str33 = c1863850ybP28.LLILLJJLI) == null) {
                                        str33 = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp5 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp5 == null || (c13lcT7127 = iTakoContextAbilityTp5.T71()) == null || (c1863850ybP27 = (C1863850ybP) c13lcT7127.LIZIZ()) == null || (str34 = c1863850ybP27.LLILZIL) == null) {
                                        str34 = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp6 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp6 == null || (c13lcT7126 = iTakoContextAbilityTp6.T71()) == null || (c1863850ybP26 = (C1863850ybP) c13lcT7126.LIZIZ()) == null || (str35 = c1863850ybP26.LLILZLL) == null) {
                                        str35 = "";
                                    }
                                    C20235214Fq c20235214Fq = C20235214Fq.LIZ;
                                    ITakoContextAbility iTakoContextAbilityTp7 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp7 == null || (c13lcT7125 = iTakoContextAbilityTp7.T71()) == null || (c1863850ybP25 = (C1863850ybP) c13lcT7125.LIZIZ()) == null || (str36 = c1863850ybP25.LLILZIL) == null) {
                                        str36 = "";
                                    }
                                    c20235214Fq.getClass();
                                    String strLIZJ = C20235214Fq.LIZJ(str36);
                                    if (strLIZJ == null) {
                                        strLIZJ = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp8 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp8 == null || (c13lcT7124 = iTakoContextAbilityTp8.T71()) == null || (c1863850ybP24 = (C1863850ybP) c13lcT7124.LIZIZ()) == null || (str37 = c1863850ybP24.LLILZIL) == null) {
                                        str37 = "";
                                    }
                                    String strLIZLLL = C20235214Fq.LIZLLL(str37);
                                    if (strLIZLLL == null) {
                                        strLIZLLL = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp9 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp9 == null || (c13lcT7123 = iTakoContextAbilityTp9.T71()) == null || (c1863850ybP23 = (C1863850ybP) c13lcT7123.LIZIZ()) == null || (str38 = c1863850ybP23.LLILLL) == null) {
                                        str38 = "";
                                    }
                                    ITakoContextAbility iTakoContextAbilityTp10 = takoQuestionnaireAssem2.tp();
                                    if (iTakoContextAbilityTp10 == null || (c13lcT7122 = iTakoContextAbilityTp10.T71()) == null || (c1863850ybP22 = (C1863850ybP) c13lcT7122.LIZIZ()) == null || (str39 = c1863850ybP22.LLILZ) == null) {
                                        str39 = "";
                                    }
                                    TakoQuestionnaire takoQuestionnaire6 = takoQuestionnaireAssem2.LLJLLIL;
                                    String strValueOf = String.valueOf(takoQuestionnaire6 != null ? Integer.valueOf(takoQuestionnaire6.id) : null);
                                    TakoQuestionnaire takoQuestionnaire7 = takoQuestionnaireAssem2.LLJLLIL;
                                    if (takoQuestionnaire7 == null || (str40 = takoQuestionnaire7.followReplyMessageId) == null) {
                                        str40 = "";
                                    }
                                    if (takoQuestionnaire7 == null || (str41 = takoQuestionnaire7.followMessageId) == null) {
                                        str41 = "";
                                    }
                                    Map<String, Integer> map2 = TakoQuestionnaireAssem.LLLF;
                                    Message message3 = takoQuestionnaireAssem2.LLJLLL;
                                    if (message3 != null && (str42 = message3.uuid) != null) {
                                        str44 = str42;
                                    }
                                    Integer num = (Integer) ((LinkedHashMap) map2).get(str44);
                                    int iIntValue3 = num != null ? num.intValue() : 0;
                                    ITakoContextAbility iTakoContextAbilityTp11 = takoQuestionnaireAssem2.tp();
                                    C1862330yYx.LJJLIIIIJ(c1862330yYx, str43, str33, str34, strLIZJ, strLIZLLL, str38, str39, strValueOf, str40, str41, iIntValue3, "feedback_panel", str35, (iTakoContextAbilityTp11 == null || (c13lcT7121 = iTakoContextAbilityTp11.T71()) == null || (c1863850ybP21 = (C1863850ybP) c13lcT7121.LIZIZ()) == null) ? null : c1863850ybP21.LLIZ);
                                }

                                @Override // X.InterfaceC1856100yOu
                                public final void LIZ(String str33, List list) {
                                    takoQuestionnaireAssem.yp(i, str33, list, false);
                                }

                                @Override // X.InterfaceC1856100yOu
                                public final void LIZIZ(String str33, List list) {
                                    takoQuestionnaireAssem.yp(i, str33, list, true);
                                }
                            };
                            HandlerHook.viewPostDelay(takoQuestionnaireAssem.LJJIJL(), new ARunnableS95S0200000_26(takoSecondLevelQuestionnaireFragment, fragmentManagerLIZ, 60), 100L);
                        }
                    }
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    ITakoContextAbility iTakoContextAbilityTp3 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp3 != null && (c13lcT7120 = iTakoContextAbilityTp3.T71()) != null && (c1863850ybP20 = (C1863850ybP) c13lcT7120.LIZIZ()) != null) {
                        str20 = c1863850ybP20.LL;
                    } else {
                        str20 = null;
                    }
                    String str33 = "";
                    if (str20 == null) {
                        str20 = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp4 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp4 == null || (c13lcT7119 = iTakoContextAbilityTp4.T71()) == null || (c1863850ybP19 = (C1863850ybP) c13lcT7119.LIZIZ()) == null || (str21 = c1863850ybP19.LLILLJJLI) == null) {
                        str21 = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp5 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp5 == null || (c13lcT7118 = iTakoContextAbilityTp5.T71()) == null || (c1863850ybP18 = (C1863850ybP) c13lcT7118.LIZIZ()) == null || (str22 = c1863850ybP18.LLILZIL) == null) {
                        str22 = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp6 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp6 == null || (c13lcT7117 = iTakoContextAbilityTp6.T71()) == null || (c1863850ybP17 = (C1863850ybP) c13lcT7117.LIZIZ()) == null || (str23 = c1863850ybP17.LLILZLL) == null) {
                        str23 = "";
                    }
                    C20235214Fq c20235214Fq = C20235214Fq.LIZ;
                    ITakoContextAbility iTakoContextAbilityTp7 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp7 == null || (c13lcT7116 = iTakoContextAbilityTp7.T71()) == null || (c1863850ybP16 = (C1863850ybP) c13lcT7116.LIZIZ()) == null || (str24 = c1863850ybP16.LLILZIL) == null) {
                        str24 = "";
                    }
                    c20235214Fq.getClass();
                    String strLIZJ = C20235214Fq.LIZJ(str24);
                    if (strLIZJ == null) {
                        strLIZJ = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp8 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp8 == null || (c13lcT7115 = iTakoContextAbilityTp8.T71()) == null || (c1863850ybP15 = (C1863850ybP) c13lcT7115.LIZIZ()) == null || (str25 = c1863850ybP15.LLILZIL) == null) {
                        str25 = "";
                    }
                    String strLIZLLL = C20235214Fq.LIZLLL(str25);
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp9 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp9 == null || (c13lcT7114 = iTakoContextAbilityTp9.T71()) == null || (c1863850ybP14 = (C1863850ybP) c13lcT7114.LIZIZ()) == null || (str26 = c1863850ybP14.LLILLL) == null) {
                        str26 = "";
                    }
                    ITakoContextAbility iTakoContextAbilityTp10 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp10 == null || (c13lcT7113 = iTakoContextAbilityTp10.T71()) == null || (c1863850ybP13 = (C1863850ybP) c13lcT7113.LIZIZ()) == null || (str27 = c1863850ybP13.LLILZ) == null) {
                        str27 = "";
                    }
                    TakoQuestionnaire takoQuestionnaire6 = takoQuestionnaireAssem.LLJLLIL;
                    if (takoQuestionnaire6 != null) {
                        numValueOf2 = Integer.valueOf(takoQuestionnaire6.id);
                    } else {
                        numValueOf2 = null;
                    }
                    String strValueOf = String.valueOf(numValueOf2);
                    TakoQuestionnaire takoQuestionnaire7 = takoQuestionnaireAssem.LLJLLIL;
                    if (takoQuestionnaire7 == null || (str28 = takoQuestionnaire7.followReplyMessageId) == null) {
                        str28 = "";
                    }
                    if (takoQuestionnaire7 == null || (str29 = takoQuestionnaire7.followMessageId) == null) {
                        str29 = "";
                    }
                    Map<String, Integer> map2 = TakoQuestionnaireAssem.LLLF;
                    Message message3 = takoQuestionnaireAssem.LLJLLL;
                    if (message3 == null || (str30 = message3.uuid) == null) {
                        str30 = "";
                    }
                    Integer num = (Integer) ((LinkedHashMap) map2).get(str30);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    }
                    String strSp = takoQuestionnaireAssem.sp();
                    String strOp = takoQuestionnaireAssem.op();
                    ITakoContextAbility iTakoContextAbilityTp11 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp11 != null && (c13lcT7112 = iTakoContextAbilityTp11.T71()) != null && (c1863850ybP12 = (C1863850ybP) c13lcT7112.LIZIZ()) != null && (str31 = c1863850ybP12.LLILZIL) != null) {
                        str33 = str31;
                    }
                    int iLIZ = C1701530uNb.LIZ(str33);
                    String strValueOf2 = String.valueOf(i);
                    ITakoContextAbility iTakoContextAbilityTp12 = takoQuestionnaireAssem.tp();
                    if (iTakoContextAbilityTp12 != null && (c13lcT7111 = iTakoContextAbilityTp12.T71()) != null && (c1863850ybP11 = (C1863850ybP) c13lcT7111.LIZIZ()) != null) {
                        str32 = c1863850ybP11.LLIZ;
                    }
                    C1862330yYx.LJJLI(c1862330yYx, str20, str21, str22, str23, str32, strLIZJ, strLIZLLL, str26, str27, strValueOf, str28, str29, iIntValue2, strSp, strOp, iLIZ, "star_card", "click_star", strValueOf2, null, null);
                }
            });
        }
        C23250099c.LIZLLL(this.LLL, null, null, new C1856180yP2(this, null), 3);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityTp2 = tp();
        if (iTakoContextAbilityTp2 == null || (c13lcT719 = iTakoContextAbilityTp2.T71()) == null || (c1863850ybP9 = (C1863850ybP) c13lcT719.LIZIZ()) == null || (str2 = c1863850ybP9.LL) == null) {
            str2 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp3 = tp();
        if (iTakoContextAbilityTp3 == null || (c13lcT718 = iTakoContextAbilityTp3.T71()) == null || (c1863850ybP8 = (C1863850ybP) c13lcT718.LIZIZ()) == null || (str3 = c1863850ybP8.LLILLJJLI) == null) {
            str3 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp4 = tp();
        if (iTakoContextAbilityTp4 == null || (c13lcT717 = iTakoContextAbilityTp4.T71()) == null || (c1863850ybP7 = (C1863850ybP) c13lcT717.LIZIZ()) == null || (str4 = c1863850ybP7.LLILZIL) == null) {
            str4 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp5 = tp();
        if (iTakoContextAbilityTp5 == null || (c13lcT716 = iTakoContextAbilityTp5.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str5 = c1863850ybP6.LLILZLL) == null) {
            str5 = "";
        }
        C20235214Fq c20235214Fq = C20235214Fq.LIZ;
        ITakoContextAbility iTakoContextAbilityTp6 = tp();
        if (iTakoContextAbilityTp6 == null || (c13lcT715 = iTakoContextAbilityTp6.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str6 = c1863850ybP5.LLILZIL) == null) {
            str6 = "";
        }
        c20235214Fq.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str6);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        ITakoContextAbility iTakoContextAbilityTp7 = tp();
        if (iTakoContextAbilityTp7 == null || (c13lcT714 = iTakoContextAbilityTp7.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str7 = c1863850ybP4.LLILZIL) == null) {
            str7 = "";
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str7);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        ITakoContextAbility iTakoContextAbilityTp8 = tp();
        if (iTakoContextAbilityTp8 == null || (c13lcT713 = iTakoContextAbilityTp8.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null || (str8 = c1863850ybP3.LLILLL) == null) {
            str8 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp9 = tp();
        if (iTakoContextAbilityTp9 == null || (c13lcT712 = iTakoContextAbilityTp9.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str9 = c1863850ybP2.LLILZ) == null) {
            str9 = "";
        }
        TakoQuestionnaire takoQuestionnaire4 = this.LLJLLIL;
        if (takoQuestionnaire4 != null) {
            numValueOf = Integer.valueOf(takoQuestionnaire4.id);
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        TakoQuestionnaire takoQuestionnaire5 = this.LLJLLIL;
        if (takoQuestionnaire5 == null || (str10 = takoQuestionnaire5.followReplyMessageId) == null) {
            str10 = "";
        }
        if (takoQuestionnaire5 == null || (str11 = takoQuestionnaire5.followMessageId) == null) {
            str11 = "";
        }
        Message message3 = this.LLJLLL;
        if (message3 != null && (str12 = message3.uuid) != null) {
            str19 = str12;
        }
        Integer num = (Integer) ((LinkedHashMap) map).get(str19);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ITakoContextAbility iTakoContextAbilityTp10 = tp();
        if (iTakoContextAbilityTp10 != null && (c13lcT71 = iTakoContextAbilityTp10.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str18 = c1863850ybP.LLIZ;
        }
        C1862330yYx.LJJLIIIIJ(c1862330yYx, str2, str3, str4, strLIZJ, strLIZLLL, str8, str9, strValueOf, str10, str11, iIntValue, "star_card", str5, str18);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1856370yPL c1856370yPL) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1856370yPL c1856370yPL) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void up(int i, String str, List list) {
        String strLJJLIIIJ;
        TakoQuestionnaire takoQuestionnaire = this.LLJLLIL;
        if (takoQuestionnaire != null) {
            int i2 = takoQuestionnaire.id;
            if (list != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            C23250099c.LIZLLL(this.LLL, null, null, new C1856170yP1(i2, this, i, strLJJLIIIJ, str, null), 3);
        }
    }

    public final void yp(int i, String str, List list, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer numValueOf;
        String str10;
        String str11;
        String str12;
        int iIntValue;
        String str13;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        String str14;
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
        C13LC<C1863850ybP> c13lcT7110;
        C1863850ybP c1863850ybP10;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1377);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new RunnableC1857600yRK(this, 0L, awS571S0100000_27), 0L);
        }
        up(i, str, list);
        String str15 = null;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, "&", null, null, 0, null, new AwS606S0100000_27(this, 630), 30);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityTp = tp();
        if (iTakoContextAbilityTp != null && (c13lcT7110 = iTakoContextAbilityTp.T71()) != null && (c1863850ybP10 = (C1863850ybP) c13lcT7110.LIZIZ()) != null) {
            str2 = c1863850ybP10.LL;
        } else {
            str2 = null;
        }
        String str16 = "";
        if (str2 == null) {
            str2 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp2 = tp();
        if (iTakoContextAbilityTp2 == null || (c13lcT719 = iTakoContextAbilityTp2.T71()) == null || (c1863850ybP9 = (C1863850ybP) c13lcT719.LIZIZ()) == null || (str3 = c1863850ybP9.LLILLJJLI) == null) {
            str3 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp3 = tp();
        if (iTakoContextAbilityTp3 == null || (c13lcT718 = iTakoContextAbilityTp3.T71()) == null || (c1863850ybP8 = (C1863850ybP) c13lcT718.LIZIZ()) == null || (str4 = c1863850ybP8.LLILZIL) == null) {
            str4 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp4 = tp();
        if (iTakoContextAbilityTp4 == null || (c13lcT717 = iTakoContextAbilityTp4.T71()) == null || (c1863850ybP7 = (C1863850ybP) c13lcT717.LIZIZ()) == null || (str5 = c1863850ybP7.LLILZLL) == null) {
            str5 = "";
        }
        C20235214Fq c20235214Fq = C20235214Fq.LIZ;
        ITakoContextAbility iTakoContextAbilityTp5 = tp();
        if (iTakoContextAbilityTp5 == null || (c13lcT716 = iTakoContextAbilityTp5.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str6 = c1863850ybP6.LLILZIL) == null) {
            str6 = "";
        }
        c20235214Fq.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str6);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        ITakoContextAbility iTakoContextAbilityTp6 = tp();
        if (iTakoContextAbilityTp6 == null || (c13lcT715 = iTakoContextAbilityTp6.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str7 = c1863850ybP5.LLILZIL) == null) {
            str7 = "";
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str7);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        ITakoContextAbility iTakoContextAbilityTp7 = tp();
        if (iTakoContextAbilityTp7 == null || (c13lcT714 = iTakoContextAbilityTp7.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str8 = c1863850ybP4.LLILLL) == null) {
            str8 = "";
        }
        ITakoContextAbility iTakoContextAbilityTp8 = tp();
        if (iTakoContextAbilityTp8 == null || (c13lcT713 = iTakoContextAbilityTp8.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null || (str9 = c1863850ybP3.LLILZ) == null) {
            str9 = "";
        }
        TakoQuestionnaire takoQuestionnaire = this.LLJLLIL;
        if (takoQuestionnaire != null) {
            numValueOf = Integer.valueOf(takoQuestionnaire.id);
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        TakoQuestionnaire takoQuestionnaire2 = this.LLJLLIL;
        if (takoQuestionnaire2 == null || (str10 = takoQuestionnaire2.followReplyMessageId) == null) {
            str10 = "";
        }
        if (takoQuestionnaire2 == null || (str11 = takoQuestionnaire2.followMessageId) == null) {
            str11 = "";
        }
        Map<String, Integer> map = LLLF;
        Message message = this.LLJLLL;
        if (message == null || (str12 = message.uuid) == null) {
            str12 = "";
        }
        Integer num = (Integer) ((LinkedHashMap) map).get(str12);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String strSp = sp();
        String strOp = op();
        ITakoContextAbility iTakoContextAbilityTp9 = tp();
        if (iTakoContextAbilityTp9 != null && (c13lcT712 = iTakoContextAbilityTp9.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null && (str14 = c1863850ybP2.LLILZIL) != null) {
            str16 = str14;
        }
        int iLIZ = C1701530uNb.LIZ(str16);
        if (z) {
            str13 = "submit";
        } else {
            str13 = "click_close";
        }
        String strValueOf2 = String.valueOf(i);
        ITakoContextAbility iTakoContextAbilityTp10 = tp();
        if (iTakoContextAbilityTp10 != null && (c13lcT71 = iTakoContextAbilityTp10.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str15 = c1863850ybP.LLIZ;
        }
        C1862330yYx.LJJLI(c1862330yYx, str2, str3, str4, str5, str15, strLIZJ, strLIZLLL, str8, str9, strValueOf, str10, str11, iIntValue, strSp, strOp, iLIZ, "feedback_panel", str13, strValueOf2, strLJJLIIIJ, str);
    }
}
