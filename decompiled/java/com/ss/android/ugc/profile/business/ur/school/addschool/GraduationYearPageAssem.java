package com.ss.android.ugc.profile.business.ur.school.addschool;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DKP;
import X.C0DOO;
import X.C0HTI;
import X.C1229200i5m;
import X.C1245860iWe;
import X.C13LE;
import X.C14LC;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.ss.android.ugc.profile.business.ur.school.utils.YearPickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class GraduationYearPageAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public View LLJJJIL;
    public C197039127h LLJJJJ;
    public TuxNavBar LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GraduationYearPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GraduationYearPageAssem.class, "yearPickerVM", "getYearPickerVM()Lcom/ss/android/ugc/profile/business/ur/school/utils/YearPickerViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public GraduationYearPageAssem() {
        super(EnumC337870DMj.GRADUATION_YEAR);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 333), AFwS232S0000000_4.get$arr$(110), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(YearPickerViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 334), AFwS232S0000000_4.get$arr$(111), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2199));
        this.LLJJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2198));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2200));
        this.LLJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2201));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = hp().getEnterFrom();
        C0DKP c0dkp = C0DKP.SHOW;
        boolean z = !hp().bt0();
        c0doo.getClass();
        C0DOO.LJIIIIZZ(enterFrom, c0dkp, z, null);
    }

    public final CampusFlowViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final int ip() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            super.xo();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        Zo(frameLayout);
        AttributeSet attributeSet = null;
        int i = 6;
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
        frameLayout.addView(tuxNavBar);
        this.LLJJJJJIL = tuxNavBar;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(View.generateViewId());
        this.LLJJJIL = frameLayout2;
        Integer numValueOf = Integer.valueOf(R.drawable.xz);
        Integer num = 2131846916;
        AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(this, 166);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setHorizontalGravity(1);
        if (numValueOf != null) {
            numValueOf.intValue();
            ImageView imageView = new ImageView(context);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = numValueOf.intValue();
            imageView.setImageDrawable(c0hti.LIZ(context));
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
            Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
            if (C14LC.LJIIIZ) {
                numValueOf2 = numValueOf3;
            }
            linearLayout.addView(imageView, C1229200i5m.LIZIZ(-2, numValueOf2.intValue(), 0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 92));
        }
        int i2 = 0;
        if (num != null) {
            num.intValue();
            TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i, i2);
            tuxTextView.setText(num.intValue());
            tuxTextView.setTuxFont(123);
            tuxTextView.LJJJJI(28.0f);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setGravity(17);
            linearLayout.addView(tuxTextView);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i, i2);
        tuxTextView2.setText((CharSequence) null);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        tuxTextView2.setGravity(17);
        awS583S0100000_4.invoke(tuxTextView2);
        linearLayout.addView(tuxTextView2, C1229200i5m.LIZIZ(-1, -2, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0, 0, 116));
        View view = this.LLJJJIL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ((Number) this.LLJL.getValue()).intValue();
        linearLayout.addView(view, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ((Number) this.LLJJJJLIIL.getValue()).intValue();
        layoutParams2.setMarginStart(ip());
        layoutParams2.setMarginEnd(ip());
        frameLayout.addView(linearLayout, layoutParams2);
        C197039127h c197039127h = new C197039127h(context, attributeSet, i, i2);
        c197039127h.setText(2131846913);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(0);
        C786410Ut5.U8(c197039127h, new ACListenerS108S0200000_4(this, c197039127h, 5));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams3.setMarginStart(ip());
        layoutParams3.setMarginEnd(ip());
        layoutParams3.bottomMargin = ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
        frameLayout.addView(c197039127h, layoutParams3);
        this.LLJJJJ = c197039127h;
        super.xo();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 355));
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DKN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2005407tM) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 33), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0DKM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C337920DMo) obj).LLILLL);
            }
        }, null, new AwS616S0100000_2(this, 67), 6);
    }
}
