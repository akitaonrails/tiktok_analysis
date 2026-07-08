package com.ss.android.ugc.profile.business.ur.school.verifyschool;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DOO;
import X.C0DOR;
import X.C0HTI;
import X.C1229200i5m;
import X.C1245840iWc;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2219808mq;
import X.C23250099c;
import X.C440190HNx;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC2235608pO;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CorrectSchoolPageAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public TuxTextView LLJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJ;
    public C197039127h LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
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
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CorrectSchoolPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CorrectSchoolPageAssem.class, "verifySchoolVM", "getVerifySchoolVM()Lcom/ss/android/ugc/profile/business/ur/school/verifyschool/VerifySchoolViewModel;", 0);
        c09r3.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public CorrectSchoolPageAssem() {
        super(EnumC337870DMj.CORRECT_SCHOOL);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 364), AFwS232S0000000_4.get$arr$(129), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VerifySchoolViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 365), AFwS232S0000000_4.get$arr$(130), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2245));
        this.LLJJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2248));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 363));
        this.LLJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2252));
        this.LLJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2250));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2256));
        this.LLJLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2254));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2255));
        this.LLJLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2251));
        this.LLJZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2242));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2246));
        this.LLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2253));
        this.LLLF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2244));
        this.LLLFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2247));
        this.LLLFFI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2249));
        this.LLLFZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2260));
        this.LLLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2240));
        this.LLLII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2259));
        this.LLLIIII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2258));
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2257));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2243));
        this.LLLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2241));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        C0DOO c0doo = C0DOO.LIZ;
        EnumC2235608pO enumC2235608pO = EnumC2235608pO.SHOW;
        int iHp = hp();
        c0doo.getClass();
        C0DOO.LJIILIIL(enumC2235608pO, iHp);
    }

    public final VerifySchoolViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        return (VerifySchoolViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        TuxNavBar tuxNavBarLIZ = C1229200i5m.LIZ(context, new AwS547S0100000_3(this, 77));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.xx;
        imageView.setImageDrawable(c0hti.LIZ(context));
        int i = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJLIL.getValue()).intValue());
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        AttributeSet attributeSet = null;
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i2);
        C1245840iWc.LIZ.getClass();
        tuxTextView.setText(C1245840iWc.LIZ() ? 2131846990 : 2131846991);
        tuxTextView.setTuxFont(123);
        tuxTextView.LJJJJI(28.0f);
        tuxTextView.setTextColorRes(R.attr.u_);
        tuxTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        linearLayout.addView(tuxTextView, layoutParams2);
        if (C1245840iWc.LIZIZ()) {
            TuxTextView tuxTextViewLJ = C1229200i5m.LJ(context, 41, R.attr.a1h, 2131846989, 48);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = ((Number) this.LLJLLL.getValue()).intValue();
            layoutParams3.bottomMargin = ((Number) this.LLJZ.getValue()).intValue();
            linearLayout.addView(tuxTextViewLJ, layoutParams3);
        } else {
            linearLayout.addView(C1229200i5m.LJ(context, 52, R.attr.a1k, 2131846985, 48), C1229200i5m.LIZIZ(-2, -2, ((Number) this.LLJLL.getValue()).intValue(), ((Number) this.LLJLLIL.getValue()).intValue(), 0, 0, 0, 112));
            TuxTextView tuxTextViewLJ2 = C1229200i5m.LJ(context, 42, R.attr.a1h, null, 56);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
            if (numLIZJ != null) {
                tuxTextViewLJ2.setBackground(new C440190HNx(((Number) this.LLLFFI.getValue()).floatValue(), numLIZJ.intValue()));
            }
            tuxTextViewLJ2.setTextAlignment(5);
            tuxTextViewLJ2.setPadding(((Number) this.LLLFF.getValue()).intValue(), ((Number) this.LLL.getValue()).intValue(), ((Number) this.LLLFF.getValue()).intValue(), ((Number) this.LLLF.getValue()).intValue());
            linearLayout.addView(tuxTextViewLJ2, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLLL.getValue()).intValue(), 0, 0, ((Number) this.LLJZIJLIL.getValue()).intValue(), 52));
            this.LLJJJIL = tuxTextViewLJ2;
            i = -2;
            linearLayout.addView(C1229200i5m.LJ(context, 52, R.attr.a1k, 2131846987, 48), C1229200i5m.LIZIZ(-2, -2, ((Number) this.LLLFZ.getValue()).intValue(), ((Number) this.LLLI.getValue()).intValue(), 0, 0, 0, 112));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CorrectSchoolCell.class);
        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv.getAdapter()).LLLLII((C0DOR) this.LLJJLIIIJLLLLLLLZ.getValue(), C0DOR.class);
        int i3 = i;
        linearLayout.addView(viewOnAttachStateChangeListenerC20604515jv, C1229200i5m.LIZIZ(-1, i3, 0, ((Number) this.LLLII.getValue()).intValue(), 0, ((Number) this.LLLIIIIL.getValue()).intValue(), ((Number) this.LLLIIII.getValue()).intValue(), 20));
        this.LLJJJJ = viewOnAttachStateChangeListenerC20604515jv;
        C197039127h c197039127h = new C197039127h(context, attributeSet, 6, i2);
        c197039127h.setText(2131846984);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(0);
        this.LLJJJJJIL = c197039127h;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(tuxNavBarLIZ);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, i3);
        layoutParams4.topMargin = ((Number) this.LLJL.getValue()).intValue();
        frameLayout.addView(linearLayout, layoutParams4);
        C197039127h c197039127h2 = this.LLJJJJJIL;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, i3, 80);
        layoutParams5.setMarginStart(((Number) this.LLLIIIL.getValue()).intValue());
        layoutParams5.bottomMargin = ((Number) this.LLLIIL.getValue()).intValue();
        layoutParams5.setMarginEnd(((Number) this.LLLIIIL.getValue()).intValue());
        frameLayout.addView(c197039127h2, layoutParams5);
        Zo(frameLayout);
        super.xo();
    }

    public final int hp() {
        return ip().getState().LLIZ.size();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0DO9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLIZ;
            }
        }, null, new AwS617S0100000_3(this, 23), 6);
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DO8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILZLL;
            }
        }, null, new AwS618S0100000_4(this, 43), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0DO7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLILZIL;
            }
        }, null, new AwS369S0200000_3(this, view, 10), new AwS547S0100000_3(this, 78), new AwS582S0100000_3(this, 72), 2, null);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2219808mq(this, null), 3);
    }
}
