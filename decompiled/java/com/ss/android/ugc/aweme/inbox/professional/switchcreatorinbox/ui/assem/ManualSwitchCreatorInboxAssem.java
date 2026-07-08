package com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.ui.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass1278;
import X.C01GW;
import X.C05RV;
import X.C06WO;
import X.C0I0B;
import X.C0OM1;
import X.C1157510gE9;
import X.C1251150ifB;
import X.C127K;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13DA;
import X.C13LE;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1848410yCV;
import X.C1910250zoF;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C421130GfH;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C889930Yvf;
import X.EnumC1157520gEA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.vm.SwitchCreatorInboxViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS616S0100000_2;
import mf.a;

/* JADX INFO: loaded from: classes29.dex */
public final class ManualSwitchCreatorInboxAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1157510gE9.class, "hierarchy_data_key"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final List<C1910250zoF> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Map<C05RV, C127K> LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManualSwitchCreatorInboxAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/professional/switchcreatorinbox/vm/SwitchCreatorInboxViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a5s;
    }

    public final SwitchCreatorInboxViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SwitchCreatorInboxViewModel) assemVMLazy.getValue();
    }

    public ManualSwitchCreatorInboxAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SwitchCreatorInboxViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 349);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(112);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((AbstractC738140SxQ) this, 350), aFwS271S0000000_28, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C1697810uHb.LJIIJJI(new C1910250zoF(C05RV.PERSONAL_INBOX, 2131836128, C1697810uHb.LJIIJJI(2131836129, 2131836130), R.raw.icon_person, "personal"), new C1910250zoF(C05RV.PRO_CREATOR_INBOX, 2131836122, C1697810uHb.LJIIJJI(2131836124, 2131836125, 2131836126), R.raw.icon_star_ring, "professional"));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 351));
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 348));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(206));
    }

    public final void kp(String str) {
        String str2;
        C13DA c13da = new C13DA();
        c13da.put("account_type", this.LLJJJIL.getValue());
        c13da.put("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        if (str != null) {
            c13da.put("button_name", str);
            str2 = "ttsocial_inbox_selection_confirm_click";
        } else {
            str2 = "ttsocial_inbox_selection_confirm_show";
        }
        Map mapBuild = c13da.build();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str2, mapBuild);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C05RV c05rvLIZJ;
        boolean z;
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) getContentView().findViewById(R.id.nzb);
        int i = 1;
        if (tuxNavBar != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2572));
            c0om1.LJ(c1251150ifB);
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
        }
        ViewGroup viewGroup = (ViewGroup) getContentView().findViewById(R.id.wtz);
        EnumC1157520gEA enumC1157520gEA = null;
        if (viewGroup != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(viewGroup.getContext(), R.style.a_p);
            int i2 = 0;
            for (C1910250zoF c1910250zoF : this.LLJJIJI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C1910250zoF c1910250zoF2 = c1910250zoF;
                    C421130GfH c421130GfH = new C421130GfH(viewGroup.getContext(), null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421130GfH);
                    c421130GfH.setLayoutParams(layoutParams);
                    c421130GfH.setOrientation(i);
                    c421130GfH.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zq, c421130GfH.getContext());
                    if (numLIZJ2 != null) {
                        c421130GfH.setBackgroundColor(numLIZJ2.intValue());
                    }
                    View.OnClickListener aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(this, c1910250zoF2, 27);
                    if (C1848410yCV.LIZ) {
                        aCListenerS130S0200000_28 = new f(aCListenerS130S0200000_28);
                    }
                    a aVar = new a(aCListenerS130S0200000_28);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c421130GfH);
                    }
                    c421130GfH.setOnClickListener(aVar);
                    C127K c127k = new C127K(contextThemeWrapper, null, 6);
                    C786410Ut5.Y6(c127k, new LinearLayout.LayoutParams(-1, -2));
                    c127k.setTitle(c127k.getContext().getString(c1910250zoF2.LIZIZ));
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = c1910250zoF2.LIZLLL;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c127k.setIcon(c419910GdJ);
                    AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(c127k.getContext());
                    if (hp().getState().LL == c1910250zoF2.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    anonymousClass1278.LJIILJJIL(z);
                    anonymousClass1278.LJIILL(new AwS429S0200000_28(this, c1910250zoF2, 32));
                    c127k.setAccessory(anonymousClass1278);
                    c127k.setClickable(false);
                    c127k.setFocusable(false);
                    View viewFindViewById = c127k.findViewById(R.id.dlh);
                    if (viewFindViewById != null) {
                        viewFindViewById.setClickable(false);
                        viewFindViewById.setFocusable(false);
                        viewFindViewById.setForeground(null);
                    }
                    this.LLJJIJIL.put(c1910250zoF2.LIZ, c127k);
                    c421130GfH.addView(c127k);
                    if (!c1910250zoF2.LIZJ.isEmpty()) {
                        List<Integer> list = c1910250zoF2.LIZJ;
                        LinearLayout linearLayout = new LinearLayout(getContentView().getContext());
                        linearLayout.setOrientation(i);
                        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                        C1383370m6R.LIZIZ(linearLayout, AFwS229S0000000_2.get$arr$(749));
                        int i4 = 0;
                        for (Integer num : list) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                int iIntValue = num.intValue();
                                View viewTd = C786410Ut5.Td(C786410Ut5.ne(linearLayout.getContext()), R.layout.a_r, linearLayout, false);
                                if (i4 > 0) {
                                    C1383370m6R.LIZIZ(viewTd, AFwS229S0000000_2.get$arr$(750));
                                }
                                TextView textView = (TextView) viewTd.findViewById(R.id.kj6);
                                if (textView != null) {
                                    textView.setText(linearLayout.getContext().getString(iIntValue));
                                }
                                linearLayout.addView(viewTd);
                                i4 = i5;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        c421130GfH.addView(linearLayout);
                    }
                    if (i2 > 0) {
                        C1383370m6R.LIZIZ(c421130GfH, AFwS229S0000000_2.get$arr$(751));
                    }
                    viewGroup.addView(c421130GfH);
                    i2 = i3;
                    i = 1;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C786410Ut5.U8((C197039127h) this.LLJJIJIIJIL.getValue(), new ACListenerS162S0100000_28(this, 116));
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0zoG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1910220zoC) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0zoD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1910220zoC) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C06WO(this), 8);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0zoE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1910220zoC) obj).LLILLJJLI);
            }
        }, null, new AwS616S0100000_2(this, 115), 6);
        C1157510gE9 c1157510gE9 = (C1157510gE9) this.LLJJI.getValue();
        if (c1157510gE9 != null) {
            enumC1157520gEA = c1157510gE9.LL;
        }
        if (enumC1157520gEA == EnumC1157520gEA.GUIDE_SWITCH) {
            c05rvLIZJ = C05RV.PRO_CREATOR_INBOX;
        } else {
            c05rvLIZJ = C889930Yvf.LIZ.LIZJ();
        }
        hp().setState(new AwS607S0100000_28(c05rvLIZJ, 268));
    }

    public final void ip(String str, String str2, String str3) {
        String str4;
        C13DA c13da = new C13DA();
        c13da.put("previous_page", str3);
        C1157510gE9 c1157510gE9 = (C1157510gE9) this.LLJJI.getValue();
        if (c1157510gE9 == null || (str4 = c1157510gE9.LLILLJJLI) == null) {
            str4 = "personal_homepage";
        }
        c13da.put("pre_previous_page", str4);
        c13da.put("account_type", this.LLJJJIL.getValue());
        c13da.put("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        c13da.put("button_name", str);
        if (str2 != null) {
            c13da.put("to_mode", str2);
        }
        Map mapBuild = c13da.build();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_inbox_selection_click", mapBuild);
    }
}
