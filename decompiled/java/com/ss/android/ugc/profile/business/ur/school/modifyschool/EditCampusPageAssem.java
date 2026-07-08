package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.AnonymousClass0206;
import X.C019F;
import X.C01GW;
import X.C0DOF;
import X.C0DOG;
import X.C0DOI;
import X.C0DOO;
import X.C0DOU;
import X.C0HTI;
import X.C1229200i5m;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1856690yPr;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C440190HNx;
import X.C452501pT;
import X.C5182020e;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS653S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public class EditCampusPageAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final AssemVMLazy LLJJIJIL;
    public C0DOU LLJJJ;
    public C0DOU LLJJJIL;
    public TuxTextView LLJJJJ;
    public ImageView LLJJJJJIL;
    public C1856690yPr LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final boolean LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditCampusPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public EditCampusPageAssem() {
        super(EnumC337870DMj.EDIT_CAMPUS);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 434), AFwS232S0000000_4.get$arr$(228), null, true);
        this.LLJJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4294));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(418));
        this.LLJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4291));
        this.LLJLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(417));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4293));
        this.LLJLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4292));
        this.LLJLLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(412));
        this.LLJLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(411));
        this.LLJZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(414));
        this.LLJZIJLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(415));
        this.LLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(413));
        this.LLLF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(416));
        C1245840iWc.LIZ.getClass();
        this.LLLFF = C1245840iWc.LIZ();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = hp().getEnterFrom();
        C0DOF c0dof = C0DOF.SHOW;
        c0doo.getClass();
        C0DOO.LJFF(enterFrom, c0dof);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            CampusFlowViewModel campusFlowViewModelHp = hp();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C0DOI c0doi = GraduationYearPickerSheetFragment.LLJIJIL;
            AwS370S0200000_4 awS370S0200000_4 = new AwS370S0200000_4(campusFlowViewModelHp, lifecycleScope, 41);
            c0doi.getClass();
            fragmentLJI.getChildFragmentManager().LLIIIJ("GraduationYearResultKey", fragmentLJI, new C0DOG(awS370S0200000_4));
        }
    }

    public final CampusFlowViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final void ip() {
        C1856690yPr c1856690yPr = this.LLJJJJLIIL;
        if (c1856690yPr != null) {
            c1856690yPr.LJIIJ();
        }
        ImageView imageView = this.LLJJJJJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LLLFF ? 2131846893 : 2131846894);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        TuxNavBar tuxNavBarLIZ = C1229200i5m.LIZ(context, new AwS548S0100000_4(this, 355));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(tuxNavBarLIZ);
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i, i2);
        tuxTextView.setTuxFont(123);
        tuxTextView.setTextColorRes(R.attr.a1h);
        C1245840iWc.LIZ.getClass();
        tuxTextView.setText(C1245840iWc.LIZ() ? 2131846908 : 2131846909);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue());
        layoutParams.topMargin = ((Number) this.LLJJL.getValue()).intValue();
        layoutParams.bottomMargin = ((Number) this.LLJL.getValue()).intValue();
        linearLayout.addView(tuxTextView, layoutParams);
        C0DOU c0dou = new C0DOU(context);
        c0dou.setTitle(context.getString(this.LLLFF ? 2131846895 : 2131846897));
        c0dou.setArrowVisible(false);
        this.LLJJJ = c0dou;
        C0DOU c0dou2 = new C0DOU(context);
        c0dou2.setTitle(context.getString(2131846900));
        c0dou2.setArrowVisible(true);
        this.LLJJJIL = c0dou2;
        C0DOU c0dou3 = new C0DOU(context);
        c0dou3.setTitle(context.getString(2131846903));
        c0dou3.setContent(context.getString(2131846902));
        c0dou3.setArrowVisible(false);
        Iterator it2 = C1697810uHb.LJIILJJIL(c0dou, c0dou2, c0dou3).iterator();
        while (it2.hasNext()) {
            linearLayout.addView((View) it2.next(), C1229200i5m.LIZIZ(-1, -2, ((Number) this.LLJLLIL.getValue()).intValue(), 0, ((Number) this.LLJLLIL.getValue()).intValue(), ((Number) this.LLJLLL.getValue()).intValue(), 0, 64));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.a0h;
        imageView.setImageDrawable(c0hti.LIZ(context));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((Number) this.LLJLIL.getValue()).intValue(), ((Number) this.LLJLIL.getValue()).intValue(), 8388661);
        layoutParams2.topMargin = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        layoutParams2.setMarginEnd(((Number) this.LLJLL.getValue()).intValue());
        frameLayout.addView(imageView, layoutParams2);
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i, i2);
        tuxTextView2.setText(this.LLLFF ? 2131846893 : 2131846894);
        tuxTextView2.setTuxFont(102);
        tuxTextView2.setGravity(17);
        C786410Ut5.h9(tuxTextView2, new ACListenerS108S0200000_4(context, this, 6));
        tuxTextView2.setTextColorRes(R.attr.a1l);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            C440190HNx c440190HNx = new C440190HNx(C418440Gaw.LIZIZ(10), numLIZJ.intValue());
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
            if (numLIZJ2 != null) {
                c440190HNx.LJIIJ(0.5f, numLIZJ2.intValue());
            }
            tuxTextView2.setBackground(c440190HNx);
        }
        C427690Gpr.LJ(tuxTextView2, C418440Gaw.LIZIZ(10));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, ((Number) this.LLJZ.getValue()).intValue(), 80);
        layoutParams3.setMarginStart(((Number) this.LLJZIJLIL.getValue()).intValue());
        layoutParams3.setMarginEnd(((Number) this.LLJZIJLIL.getValue()).intValue());
        layoutParams3.bottomMargin = ((Number) this.LLL.getValue()).intValue();
        frameLayout.addView(tuxTextView2, layoutParams3);
        this.LLJJJJ = tuxTextView2;
        ImageView imageView2 = new ImageView(context);
        C786410Ut5.LJZI(8, imageView2);
        C1856690yPr c1856690yPr = new C1856690yPr(context, R.raw.icon_spinner_normal);
        c1856690yPr.LJI(R.attr.a1h, context);
        this.LLJJJJLIIL = c1856690yPr;
        imageView2.setImageDrawable(c1856690yPr);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(((Number) this.LLLF.getValue()).intValue(), ((Number) this.LLLF.getValue()).intValue(), 81);
        layoutParams4.bottomMargin = ((Number) this.LLL.getValue()).intValue() + ((((Number) this.LLJZ.getValue()).intValue() - ((Number) this.LLLF.getValue()).intValue()) / 2);
        frameLayout.addView(imageView2, layoutParams4);
        this.LLJJJJJIL = imageView2;
        Zo(frameLayout);
        super.xo();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0DOA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILZLL;
            }
        }, null, new AwS618S0100000_4(this, 41), 6);
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0DOB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0DOC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLIZ;
            }
        }, null, new AwS653S0100000_4(this, 11), 12);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            CampusFlowViewModel campusFlowViewModelHp = hp();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C0DOI c0doi = GraduationYearPickerSheetFragment.LLJIJIL;
            AwS370S0200000_4 awS370S0200000_4 = new AwS370S0200000_4(campusFlowViewModelHp, lifecycleScope, 41);
            c0doi.getClass();
            fragmentLJI.getChildFragmentManager().LLIIIJ("GraduationYearResultKey", fragmentLJI, new C0DOG(awS370S0200000_4));
        }
    }
}
