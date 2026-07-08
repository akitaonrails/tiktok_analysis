package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel;

import X.AbstractC19994813Le;
import X.AbstractViewOnClickListenerC1231770i9v;
import X.AnonymousClass1418;
import X.C019F;
import X.C01GW;
import X.C07II;
import X.C07QF;
import X.C09R3;
import X.C1153090g71;
import X.C1163410gNf;
import X.C1308910kAL;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852820yJc;
import X.C1854530yMN;
import X.C1854540yMO;
import X.C1854620yMW;
import X.C1854790yMn;
import X.C1855110yNJ;
import X.C1855450yNr;
import X.C1855670yOD;
import X.C1861390yXR;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2441009hQ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1854550yMP;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInputSkillLabelAssemV2 extends UISlotAssem implements ISkillLabelAbilityV2, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public boolean LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2306));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2308));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2305));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1236));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2307));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1238));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1239));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1240));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1237));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 687));
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final C01GW LLJLIL;
    public String LLJLILLLLZIIL;
    public EnumC1854550yMP LLJLL;
    public String LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoInputSkillLabelAssemV2.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoInputSkillLabelAssemV2.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoInputSkillLabelAssemV2() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(426));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2309), AFwS269S0000000_27.get$arr$(198), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(425));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2310), AFwS269S0000000_27.get$arr$(199), null, true);
        this.LLJLIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(172));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpe;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -120193058) {
            return null;
        }
        return this;
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJJJJIL.getValue();
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final BottomInputViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    public final IBottomInputHostAbility ip() {
        return (IBottomInputHostAbility) this.LLJJIJIL.getValue();
    }

    public final TakoInputSkillLabelViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (TakoInputSkillLabelViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2
    public final C1854790yMn Y5() {
        C1854530yMN state = lp().getState();
        C1854540yMO c1854540yMO = state.LL;
        if (c1854540yMO.LIZ != EnumC1854550yMP.NONE) {
            return new C1854790yMn(c1854540yMO, state.LLILLJJLI, state.LLILLL, lp().LLILLL, lp().LLILZIL, this.LLJLLIL);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L40(com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo r22) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.TakoInputSkillLabelAssemV2.L40(com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2
    public final String M11(boolean z) {
        Resources resources;
        C1854540yMO c1854540yMO = lp().getState().LL;
        EnumC1854550yMP enumC1854550yMP = c1854540yMO.LIZ;
        EnumC1854550yMP enumC1854550yMP2 = EnumC1854550yMP.NONE;
        if (enumC1854550yMP == enumC1854550yMP2) {
            this.LLJLLIL = null;
        }
        if (z) {
            if (enumC1854550yMP == enumC1854550yMP2) {
                C1855110yNJ.LIZ.getClass();
                if (C1855110yNJ.LIZ()) {
                    Context context = getContext();
                    if (context == null) {
                        return null;
                    }
                    return context.getString(2131849707);
                }
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJJJJIL.getValue();
                if (iTakoContextAbility != null && iTakoContextAbility.isTako() && C07II.LIZ()) {
                    Context context2 = getContext();
                    if (context2 == null) {
                        return null;
                    }
                    return context2.getString(2131849882);
                }
                Context context3 = getContext();
                if (context3 == null || (resources = context3.getResources()) == null) {
                    return null;
                }
                return resources.getQuantityString(2131755744, hp().vQ2());
            }
            return kp(c1854540yMO);
        }
        return kp(c1854540yMO);
    }

    public final String kp(C1854540yMO c1854540yMO) {
        boolean z;
        C1855450yNr.LIZ.getClass();
        C1153090g71.LIZ.getClass();
        if (C1153090g71.LIZIZ(0, C1855450yNr.class) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LLJLLIL = null;
            String str = c1854540yMO.LIZJ;
            if (str != null && str.length() > 0) {
                return str;
            }
            IBottomInputHostAbility iBottomInputHostAbilityIp = ip();
            if (iBottomInputHostAbilityIp == null) {
                return null;
            }
            return iBottomInputHostAbilityIp.NV1();
        }
        EnumC1854550yMP enumC1854550yMP = c1854540yMO.LIZ;
        if (enumC1854550yMP != this.LLJLL) {
            this.LLJLILLLLZIIL = null;
            this.LLJLL = enumC1854550yMP;
            this.LLJLLIL = null;
        }
        List<String> list = c1854540yMO.LJIIJ;
        if (list != null && !list.isEmpty()) {
            if (this.LLJLILLLLZIIL == null) {
                String str2 = (String) C13LP.LJLJJI(list, AbstractC19994813Le.Default);
                this.LLJLILLLLZIIL = str2;
                this.LLJLLIL = str2;
            }
        } else {
            this.LLJLLIL = null;
        }
        String str3 = this.LLJLILLLLZIIL;
        if (str3 == null) {
            String str4 = c1854540yMO.LIZJ;
            if (str4 != null && str4.length() > 0) {
                return str4;
            }
            IBottomInputHostAbility iBottomInputHostAbilityIp2 = ip();
            if (iBottomInputHostAbilityIp2 == null) {
                return null;
            }
            return iBottomInputHostAbilityIp2.NV1();
        }
        return str3;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        TakoInteractGuideData takoInteractGuideData;
        EnumC1854550yMP enumC1854550yMP;
        String str;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        this.LLJJI = true;
        C1163410gNf.LIZ.getClass();
        int iIntValue = 0;
        String str2 = null;
        if (C1163410gNf.LIZJ() && (viewFindViewById = view.findViewById(R.id.ksh)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                C426750GoL.LJIIJ(marginLayoutParams, view.getContext(), 0, 0, 0, 0, 32);
            }
            viewFindViewById.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        if (C1163410gNf.LIZ()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            }
            View view2 = (View) this.LLJJIJIIJIL.getValue();
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
                    C786410Ut5.W5(view2, layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLJJIJIIJIL.getValue();
            if (tuxIconView != null) {
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
            TuxIconView tuxIconView2 = (TuxIconView) this.LLJJIJIIJIL.getValue();
            if (tuxIconView2 != null) {
                tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
            TuxTextView tuxTextView = (TuxTextView) this.LLJJIJI.getValue();
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(62);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.oo, new ContextThemeWrapper(view.getContext(), R.style.zd));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(iIntValue);
        if (C1163410gNf.LIZJ()) {
            i = 999;
        } else {
            i = 8;
        }
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (C1163410gNf.LIZJ()) {
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJ = Integer.valueOf(C2441009hQ.LJIIL(iIntValue, 51));
        }
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        View view3 = (View) this.LLJJIJIIJIL.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0yMX
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1231770i9v
                public final void LIZ(View view4) {
                    if (view4 != null) {
                        this.LLILZ.lp().EQ2();
                        this.LLILZ.w7(EnumC1854550yMP.NONE, "", null, null, null, null, null, false, false);
                    }
                }
            }, view3);
        }
        lp().zQ2((C1852820yJc) this.LLJLIL.getValue(), getCommonParams());
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yMy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 155), 4);
        Integer numValueOf = null;
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217371BqR() { // from class: X.0yN2
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1854530yMN) obj).LLILLL = (ConvertStyleItem) obj2;
            }
        }, null, new AwS641S0100000_27(this, 156), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yMz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 157), 6);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJJIL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.aC2(new AwS606S0100000_27(this, 197));
        }
        C07QF.LIZ.getClass();
        String str3 = "";
        if (C07QF.LIZ() && C1861390yXR.LJ()) {
            C1854790yMn c1854790yMn = C1861390yXR.LIZIZ.LJIIIIZZ;
            if (c1854790yMn != null) {
                EnumC1854550yMP enumC1854550yMP2 = c1854790yMn.LIZ.LIZ;
                String str4 = c1854790yMn.LIZLLL;
                if (str4 == null) {
                    str4 = "";
                }
                TakoStandardRatio takoStandardRatio = c1854790yMn.LIZIZ;
                if (takoStandardRatio != null) {
                    numValueOf = Integer.valueOf(takoStandardRatio.stdSize);
                }
                ConvertStyleItem convertStyleItem = c1854790yMn.LIZJ;
                if (convertStyleItem != null) {
                    str2 = convertStyleItem.nameStarling;
                }
                w7(enumC1854550yMP2, str4, null, null, numValueOf, str2, c1854790yMn.LJ, true, false);
                return;
            }
            return;
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJJJJIL.getValue();
        if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (takoInteractGuideData = c1863850ybP.LLJLILLLLZIIL) == null || (enumC1854550yMP = takoInteractGuideData.inputSkillLabel) == null) {
            return;
        }
        Map<String, String> map = c1863850ybP.LLJLL;
        TakoTemplateInfo takoTemplateInfo = takoInteractGuideData.templateInfo;
        if (map != null && (str = map.get("mode_source")) != null) {
            str3 = str;
        }
        w7(enumC1854550yMP, str3, null, null, null, null, takoTemplateInfo, false, true);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2
    public final void qi0(boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) this.LLJJIJI.getValue();
        if (tuxTextView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2
    public final void w7(EnumC1854550yMP enumC1854550yMP, String str, String str2, List<BaseImage> list, Integer num, String str3, TakoTemplateInfo takoTemplateInfo, boolean z, boolean z2) {
        List<BaseImage> listLIZ;
        int iWQ2;
        String str4;
        IInputInnerAbility iInputInnerAbility;
        Integer num2 = num;
        C1855670yOD.LIZ.getClass();
        if (!C1855670yOD.LIZ()) {
            return;
        }
        if (z2 && (iInputInnerAbility = (IInputInnerAbility) this.LLJJJJLIIL.getValue()) != null) {
            iInputInnerAbility.Cz0(0L, true);
        }
        if (list != null) {
            listLIZ = AnonymousClass1418.LIZ(list);
        } else {
            listLIZ = null;
        }
        BaseImage baseImage = (BaseImage) C13LP.LJJJLL(hp().TG1());
        if (baseImage == null) {
            if (listLIZ != null) {
                baseImage = (BaseImage) C13LP.LJJJLL(listLIZ);
            } else {
                baseImage = null;
            }
        }
        if ((num2 != null && num2.intValue() > 0) || (takoTemplateInfo != null && (num2 = takoTemplateInfo.defaultStdSize) != null && num2.intValue() > 0)) {
            iWQ2 = num2.intValue();
        } else {
            lp();
            iWQ2 = TakoInputSkillLabelViewModel.wQ2(baseImage);
        }
        lp().AQ2(enumC1854550yMP, str, str3, Integer.valueOf(iWQ2), takoTemplateInfo, z);
        if (listLIZ != null) {
            int i = C1854620yMW.LIZ[enumC1854550yMP.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str4 = "default_entrance";
                    } else {
                        str4 = "image_to_video";
                    }
                } else {
                    str4 = "edit_image";
                }
            } else {
                str4 = "homework";
            }
            IBottomInputHostAbility iBottomInputHostAbilityIp = ip();
            if (iBottomInputHostAbilityIp != null) {
                iBottomInputHostAbilityIp.FB1(true);
            }
            for (BaseImage baseImage2 : listLIZ) {
                IBottomInputHostAbility iBottomInputHostAbilityIp2 = ip();
                if (iBottomInputHostAbilityIp2 != null) {
                    iBottomInputHostAbilityIp2.wu(baseImage2, str4);
                }
            }
        }
        if (str2 != null) {
            hp().AQ2(str2);
        }
    }
}
