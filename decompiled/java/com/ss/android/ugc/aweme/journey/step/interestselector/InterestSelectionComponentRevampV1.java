package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.C0OM1;
import X.C10HH;
import X.C10R1;
import X.C10VO;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1602160rnK;
import X.C1619800sFm;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19245410Qy;
import X.C19245810Rc;
import X.C19246210Rg;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C420060GdY;
import X.C420970Gf1;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC638250P1r;
import Y.ALAdapterS9S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class InterestSelectionComponentRevampV1 extends BaseInterestSelectionComponent {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGslJzs2OiA/HELIOSPTw2JCAvPSAhZgwiPSohLTY4Gio/LSY4ICA9CyohOSA9LSs4GyolKSg8H34=";
    public final String LLLLIIL = "tick_buttons";
    public final AwS607S0100000_28 LLLLIILL = new AwS607S0100000_28(this, 87);

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void JS() {
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b6658";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final boolean hS() {
        return false;
    }

    public final C10HH RS() {
        C19233810Mm.LIZ.getClass();
        return (C10HH) C19233810Mm.LIZ(C10HH.class);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void aS() {
        TuxTextView tuxTextViewUS;
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar == null || (tuxTextViewUS = US(tuxNavBar)) == null) {
            return;
        }
        tuxTextViewUS.setEnabled(false);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public C10R1 cS() {
        final List<NewUserInterestStruct> listNS = nS();
        final AwS607S0100000_28 awS607S0100000_28 = this.LLLLIILL;
        final C19245810Rc c19245810Rc = this.LLJL;
        final C19246210Rg c19246210Rg = this.LLLIIL;
        return new C19245410Qy(listNS, awS607S0100000_28, c19245810Rc, c19246210Rg) { // from class: X.10Qw
            @Override // X.C19245410Qy, X.C03AM
            public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
                C1150504el.LIZ().LIZLLL("interest_fragment_create_dataholder", false);
                C19245510Qz c19245510Qz = new C19245510Qz(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czl, viewGroup, false));
                C1150504el.LIZ().LJI("interest_fragment_create_dataholder", false);
                return c19245510Qz;
            }

            @Override // X.C10R1, X.C03AM
            public final AbstractC1216180hkm LLLII(ViewGroup viewGroup) {
                String string;
                String string2;
                int iLIZIZ;
                C1150504el.LIZ().LIZLLL("interest_fragment_create_headholder", false);
                int i = C1911390zq5.LL;
                C19245810Rc c19245810Rc2 = this.LLILZIL;
                if (c19245810Rc2 == null || (string = c19245810Rc2.LIZ) == null) {
                    string = viewGroup.getContext().getString(2131838464);
                }
                C19245810Rc c19245810Rc3 = this.LLILZIL;
                if (c19245810Rc3 == null || (string2 = c19245810Rc3.LIZIZ) == null) {
                    string2 = viewGroup.getContext().getString(2131838463);
                }
                C19233810Mm.LIZ.getClass();
                C1911390zq5 c1911390zq5LIZ = C1911380zq4.LIZ(viewGroup, string, string2, C19233810Mm.LIZ(C10HH.class).LIZLLL("text_alignment_style", "start"), ((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1911390zq5LIZ.itemView.getLayoutParams();
                if (C1911400zq6.LIZ(viewGroup.getContext())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(28.0f)));
                }
                marginLayoutParams.bottomMargin = iLIZIZ;
                C786410Ut5.W5(c1911390zq5LIZ.itemView, marginLayoutParams);
                C1150504el.LIZ().LJI("interest_fragment_create_headholder", false);
                return c1911390zq5LIZ;
            }

            @Override // X.C19245410Qy, X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder instanceof C19245510Qz) {
                    ((C10R3) viewHolder).I5();
                }
            }

            {
                super(listNS, listNS, awS607S0100000_28, c19245810Rc, c19246210Rg, null);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public RecyclerView.LayoutManager dS() {
        RecyclerView recyclerView = this.LLJLLL;
        return new FlexboxLayoutManager(recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void wS() {
        C10VO.LIZJ(this.LLJZ, 0.75f);
        C10VO.LIZJ(this.LLJZIJLIL, 0.75f);
        ConstraintLayout constraintLayout = this.LLL;
        if (constraintLayout != null) {
            C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(constraintLayout);
        }
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            c197039127h.setText(C786410Ut5.j4(getString(2131857657), Arrays.copyOf(new Object[]{0}, 1)));
        }
        if (Intrinsics.LJFF(RS().LIZLLL("skip_button_style", "bottom"), "bottom")) {
            return;
        }
        mS();
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
    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void yS() {
        String str;
        String string;
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar != null) {
            C786410Ut5.C5(tuxNavBar, 1.0f);
            C786410Ut5.T4(tuxNavBar.findViewById(R.id.p1k), 0.0f);
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            C19245810Rc c19245810Rc = this.LLJL;
            if (c19245810Rc == null || (str = c19245810Rc.LJ) == null) {
                str = "";
            }
            c1250250idj.LIZJ = str;
            c1250250idj.LIZIZ = "nav_tag_title";
            c0om1.LIZJ = c1250250idj;
            Context context = getContext();
            if (context != null && (string = context.getString(2131838034)) != null) {
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = string;
                c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
                c1250300ido.LIZIZ = "nav_tag_skip";
                c1250300ido.LIZ(new AwS572S0100000_28(this, 277));
                if (Intrinsics.LJFF(RS().LIZLLL("skip_button_style", "bottom"), "top_left")) {
                    c0om1.LJ(c1250300ido);
                }
                if (Intrinsics.LJFF(RS().LIZLLL("skip_button_style", "bottom"), "top_right")) {
                    c0om1.LIZIZ(c1250300ido);
                }
            }
            tuxNavBar.setNavActions(c0om1);
            TuxTextView tuxTextViewUS = US(tuxNavBar);
            if (tuxTextViewUS != null) {
                tuxTextViewUS.setTextColorRes(R.attr.a1k);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void PS() {
        Integer numValueOf;
        super.PS();
        C10HH c10hhRS = RS();
        c10hhRS.getClass();
        String strLIZLLL = c10hhRS.LIZLLL("title_copy", C20642515q3.LJI(2131838464));
        C10HH c10hhRS2 = RS();
        c10hhRS2.getClass();
        String strLIZLLL2 = c10hhRS2.LIZLLL("sub_title_copy", C20642515q3.LJI(2131838463));
        C10HH c10hhRS3 = RS();
        c10hhRS3.getClass();
        String strLIZLLL3 = c10hhRS3.LIZLLL("next_button_copy", C20642515q3.LJI(2131838032));
        C10HH c10hhRS4 = RS();
        c10hhRS4.getClass();
        String strLIZLLL4 = c10hhRS4.LIZLLL("skip_button_copy", C20642515q3.LJI(2131838034));
        C10HH c10hhRS5 = RS();
        c10hhRS5.getClass();
        String strLIZLLL5 = c10hhRS5.LIZLLL("title_copy", C20642515q3.LJI(2131838464));
        String strLIZLLL6 = RS().LIZLLL("top_icon_style", "revamp");
        if (!Intrinsics.LJFF(strLIZLLL6, "revamp")) {
            if (Intrinsics.LJFF(strLIZLLL6, "coin")) {
                numValueOf = Integer.valueOf(C1619800sFm.LIZIZ.LJJII());
            }
            this.LLJL = new C19245810Rc(strLIZLLL, strLIZLLL2, strLIZLLL3, strLIZLLL4, null, strLIZLLL5, 32);
        }
        numValueOf = Integer.valueOf(R.raw.icon_bitmap_emoji_star);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        this.LLJL = new C19245810Rc(strLIZLLL, strLIZLLL2, strLIZLLL3, strLIZLLL4, null, strLIZLLL5, 32);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void ZR() {
        Integer numLIZJ;
        super.ZR();
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView != null) {
            recyclerView.setPadding(0, 0, 0, 0);
            C1911400zq6.LIZJ(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))), null);
        }
        View view = this.LLLFZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLLFF;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C420970Gf1 c420970Gf1 = this.LLLFFI;
        if (c420970Gf1 != null) {
            int visibility = c420970Gf1.getVisibility();
            c420970Gf1.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c420970Gf1);
        }
        ConstraintLayout constraintLayout = this.LLL;
        if (constraintLayout != null) {
            C19EG activity = getActivity();
            if (activity != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activity)) != null) {
                constraintLayout.setBackgroundColor(numLIZJ.intValue());
            }
            C1911400zq6.LJFF(constraintLayout, 0, 0, null, null, null, null, 246);
            C1911400zq6.LIZJ(constraintLayout, 0, 0, null, null);
            C426750GoL.LJIIL(constraintLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0, 16);
        }
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C786410Ut5.S4(0.4f, c197039127h);
        }
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 276);
        zS();
        C19233810Mm c19233810Mm = C19233810Mm.LIZ;
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            TuxNavBar tuxNavBar = this.LLLF;
            if (tuxNavBar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxNavBar.getLayoutParams();
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                C786410Ut5.S6(tuxNavBar, marginLayoutParams);
            }
            RecyclerView recyclerView2 = this.LLJLLL;
            if (recyclerView2 != null) {
                C426750GoL.LJIIIZ(recyclerView2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), null, null, false, 29);
            }
        }
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            awS572S0100000_28.invoke();
        } else {
            C1911410zq7.LIZ("IS_RevampV1", "to call showPageTransitionWithBottomSection");
            C420060GdY.LIZ(this.LLJLLIL, this.LLL, true, new AwS572S0100000_28(awS572S0100000_28, 1114), 24);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void zS() {
        super.zS();
        if (C1911400zq6.LIZ(getContext())) {
            ConstraintLayout constraintLayout = this.LLL;
            if (constraintLayout != null) {
                C426750GoL.LJIIL(constraintLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 21);
            }
            C19233810Mm.LIZ.getClass();
            if (!Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
                C1911400zq6.LIZIZ(this.LLJLLL, Float.valueOf(0.1f), Float.valueOf(0.1f));
                return;
            }
            RecyclerView recyclerView = this.LLJLLL;
            if (recyclerView != null) {
                C426750GoL.LJIIIZ(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null, false, 24);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public String RR() {
        return this.LLLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final Function1<Integer, Unit> iS() {
        return this.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void ES(int i) {
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar != null && isViewValid() && tuxNavBar.getHeight() > 0) {
            C786410Ut5.T4(tuxNavBar.findViewById(R.id.p1k), (i * 1.0f) / tuxNavBar.getHeight());
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public void NS(C19245810Rc c19245810Rc) {
        this.LLLILZJ = Boolean.FALSE;
    }

    public final TuxTextView US(TuxNavBar tuxNavBar) {
        ViewGroup viewGroup;
        if (Intrinsics.LJFF(RS().LIZLLL("skip_button_style", "bottom"), "top_left")) {
            viewGroup = (ViewGroup) tuxNavBar.findViewById(R.id.p25);
        } else {
            if (Intrinsics.LJFF(RS().LIZLLL("skip_button_style", "bottom"), "top_right")) {
                viewGroup = (ViewGroup) tuxNavBar.findViewById(R.id.p1u);
            }
            return null;
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TuxTextView) {
                    return (TuxTextView) childAt;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void rS(boolean z) {
        C1911410zq7.LIZ("IS_RevampV1", "onPageComplete called");
        C19233810Mm.LIZ.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            super.rS(z);
            return;
        }
        AwS144S0110000_28 awS144S0110000_28 = new AwS144S0110000_28(this, z, 0);
        C1911410zq7.LIZ("IS_RevampV1", "enter completePageWithExitTransition");
        C420060GdY.LIZ(this.LLJLLIL, this.LLL, false, new AwS572S0100000_28(awS144S0110000_28, 1113), 24);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void FS(Boolean bool, Integer num, boolean z) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newUIStyle triggered: state: ");
            sbLIZ.append(z);
            sbLIZ.append(", count: ");
            sbLIZ.append(num);
            C1911410zq7.LIZ("IS_RevampV1", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                C1911410zq7.LIZ("IS_RevampV1", "bottomButtonNext change to true");
                C197039127h c197039127h = this.LLJZ;
                if (c197039127h != null) {
                    C1911410zq7.LIZ("IS_RevampV1", "bottomButtonNext not null");
                    c197039127h.animate().alpha(1.0f).setDuration(150L).setListener(new ALAdapterS9S0100000_12(c197039127h, 58)).start();
                }
            } else {
                C1911410zq7.LIZ("IS_RevampV1", "bottomButtonNext change to false");
                C197039127h c197039127h2 = this.LLJZ;
                if (c197039127h2 != null) {
                    c197039127h2.animate().alpha(0.4f).setDuration(150L).setListener(new ALAdapterS9S0100000_12(c197039127h2, 59)).start();
                }
            }
        } else {
            C197039127h c197039127h3 = this.LLJZ;
            if (c197039127h3 != null) {
                c197039127h3.setEnabled(z);
            }
        }
        String string = getString(2131838032);
        if (num != null) {
            num.intValue();
            C197039127h c197039127h4 = this.LLJZ;
            if (c197039127h4 != null) {
                c197039127h4.setText(C786410Ut5.j4(getString(2131857657), Arrays.copyOf(new Object[]{num}, 1)));
                return;
            }
            return;
        }
        C197039127h c197039127h5 = this.LLJZ;
        if (c197039127h5 == null) {
            return;
        }
        c197039127h5.setText(string);
    }
}
