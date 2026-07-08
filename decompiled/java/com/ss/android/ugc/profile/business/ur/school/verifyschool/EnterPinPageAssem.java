package com.ss.android.ugc.profile.business.ur.school.verifyschool;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DOO;
import X.C0GV9;
import X.C0HTI;
import X.C1229200i5m;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748330vb5;
import X.C1754640vlG;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C23250099c;
import X.C338170DNn;
import X.C338180DNo;
import X.C338200DNq;
import X.C338280DNy;
import X.C339010DQt;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1723120uwQ;
import X.EnumC337870DMj;
import X.EnumC338220DNs;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class EnterPinPageAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final long LLLIIIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public TuxTextView LLJJJIL;
    public C1754640vlG LLJJJJ;
    public C1748330vb5 LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxSpinner LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
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
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public String LLLII;
    public final C01GW LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EnterPinPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EnterPinPageAssem.class, "verifySchoolVM", "getVerifySchoolVM()Lcom/ss/android/ugc/profile/business/ur/school/verifyschool/VerifySchoolViewModel;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLIIIL = TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public EnterPinPageAssem() {
        super(EnumC337870DMj.ENTER_PIN);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 375), AFwS232S0000000_4.get$arr$(134), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VerifySchoolViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 371), AFwS232S0000000_4.get$arr$(133), null, true);
        this.LLJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2278));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2273));
        this.LLJLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2277));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2276));
        this.LLJLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2274));
        this.LLJZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2280));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2275));
        this.LLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2279));
        this.LLLF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2281));
        this.LLLFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2272));
        this.LLLI = "";
        this.LLLIIII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 374));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = ip().getEnterFrom();
        EnumC338220DNs enumC338220DNs = EnumC338220DNs.SHOW;
        c0doo.getClass();
        C0DOO.LJIIL(enterFrom, enumC338220DNs);
        C1754640vlG c1754640vlG = this.LLJJJJ;
        if (c1754640vlG != null) {
            c1754640vlG.LIZJ();
        }
        C1754640vlG c1754640vlG2 = this.LLJJJJ;
        if (c1754640vlG2 != null) {
            c1754640vlG2.LJ("", true);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C338280DNy(this, null), 3);
    }

    public final CampusFlowViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final VerifySchoolViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (VerifySchoolViewModel) assemVMLazy.getValue();
    }

    public final void mp() {
        TuxSpinner tuxSpinner = this.LLJJLIIIJLLLLLLLZ;
        if (tuxSpinner != null) {
            int i = 0;
            if (!this.LLLFZ && !this.LLLFFI) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxSpinner);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        View viewLIZ = C1229200i5m.LIZ(context, new AwS548S0100000_4(this, 372));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.vj;
        imageView.setImageDrawable(c0hti.LIZ(context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJLL.getValue()).intValue());
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i, i2);
        tuxTextView.setText(2131846983);
        tuxTextView.setTuxFont(123);
        tuxTextView.LJJJJI(28.0f);
        tuxTextView.setTextColorRes(R.attr.a1i);
        tuxTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = ((Number) this.LLJLLIL.getValue()).intValue();
        linearLayout.addView(tuxTextView, layoutParams2);
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i, i2);
        C1245840iWc.LIZ.getClass();
        tuxTextView2.setText(C1245840iWc.LIZ() ? 2131846999 : 2131847001);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        tuxTextView2.setGravity(17);
        linearLayout.addView(tuxTextView2, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLLL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJIL = tuxTextView2;
        C1754640vlG c1754640vlG = new C1754640vlG(context, null, 6);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            char cCharAt = "******".charAt(i3);
            int i6 = i5 + 1;
            if (cCharAt == ' ' || cCharAt == '-') {
                arrayList.add(Integer.valueOf(i5 - i4));
                i4 = i6;
            }
            i3++;
            i5 = i6;
        } while (i3 < 6);
        arrayList.add(Integer.valueOf(6 - i4));
        c1754640vlG.setPattern(new C339010DQt(arrayList));
        c1754640vlG.setPinType(EnumC1723120uwQ.NUMERIC);
        c1754640vlG.setListener((C338200DNq) this.LLLIIII.getValue());
        c1754640vlG.setAutoWidth(true);
        c1754640vlG.setDeleteAllAfterError(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ((Number) this.LLJZ.getValue()).intValue();
        linearLayout.addView(c1754640vlG, layoutParams3);
        this.LLJJJJ = c1754640vlG;
        C1748330vb5 c1748330vb5 = new C1748330vb5(context, null, 6);
        c1748330vb5.setMessageStyle(C338180DNo.LIZ);
        c1748330vb5.setMessage(context.getString(2131847010));
        c1748330vb5.setMessageIcon(new C338170DNn());
        C786410Ut5.LJLLLLLL(8, c1748330vb5);
        linearLayout.addView(c1748330vb5, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJZIJLIL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJJIL = c1748330vb5;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        linearLayout.addView(constraintLayout, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLL.getValue()).intValue(), 0, 0, 0, 116));
        int iGenerateViewId = View.generateViewId();
        TuxTextView tuxTextViewLJ = C1229200i5m.LJ(context, 42, R.attr.a1p, 2131846979, 48);
        tuxTextViewLJ.setId(iGenerateViewId);
        C786410Ut5.LJLLLLLL(8, tuxTextViewLJ);
        C19ME c19me = new C19ME(-2, -2);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        constraintLayout.addView(tuxTextViewLJ, c19me);
        this.LLJJJJLIIL = tuxTextViewLJ;
        TuxTextView tuxTextViewLJ2 = C1229200i5m.LJ(context, 42, R.attr.a1k, null, 56);
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.startToEnd = iGenerateViewId;
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        c19me2.setMarginStart(((Number) this.LLLF.getValue()).intValue());
        constraintLayout.addView(tuxTextViewLJ2, c19me2);
        this.LLJJL = tuxTextViewLJ2;
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
        C786410Ut5.LJLLLLLL(8, tuxSpinner);
        C19ME c19me3 = new C19ME(((Number) this.LLLFF.getValue()).intValue(), ((Number) this.LLLFF.getValue()).intValue());
        c19me3.endToEnd = 0;
        c19me3.topToTop = 0;
        c19me3.bottomToBottom = 0;
        constraintLayout.addView(tuxSpinner, c19me3);
        this.LLJJLIIIJLLLLLLLZ = tuxSpinner;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(viewLIZ);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = ((Number) this.LLJLIL.getValue()).intValue();
        layoutParams4.setMarginStart(((Number) this.LLJLILLLLZIIL.getValue()).intValue());
        layoutParams4.setMarginEnd(((Number) this.LLJLILLLLZIIL.getValue()).intValue());
        frameLayout.addView(linearLayout, layoutParams4);
        Zo(frameLayout);
        super.xo();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void onPagePause() {
        LJLZ();
    }

    public final void hp(String str) {
        C1754640vlG c1754640vlG = this.LLJJJJ;
        if (c1754640vlG != null) {
            c1754640vlG.LJI(str);
        }
        C1748330vb5 c1748330vb5 = this.LLJJJJJIL;
        if (c1748330vb5 != null) {
            c1748330vb5.setMessage(str);
            C786410Ut5.LJLLLLLL(0, c1748330vb5);
        }
    }

    public final SpannableString kp(String str) {
        Integer numValueOf;
        Integer numValueOf2;
        Context context = getContext();
        String string = null;
        if (context != null) {
            string = context.getString(2131846981, str);
        }
        SpannableString spannableString = new SpannableString(string);
        StyleSpan styleSpan = new StyleSpan(1);
        if (string != null && (numValueOf = Integer.valueOf(a0.LJJJ(string, str, 0, false, 6))) != null && (numValueOf2 = Integer.valueOf(numValueOf.intValue() + str.length())) != null) {
            C786410Ut5.p2(spannableString, styleSpan, numValueOf.intValue(), numValueOf2.intValue(), 17);
            C786410Ut5.p2(spannableString, new C0GV9(), numValueOf.intValue(), numValueOf2.intValue(), 17);
        }
        return spannableString;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0DNw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 46), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0DNz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILZLL;
            }
        }, null, new AwS618S0100000_4(this, 47), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0DNt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLILLJJLI;
            }
        }, null, new AwS618S0100000_4(this, 48), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0DNu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLIZLLLIL;
            }
        }, null, new AwS618S0100000_4(this, 49), 6);
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0DNv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLILZLL;
            }
        }, this, null, new AwS583S0100000_4(this, 178), new AwS548S0100000_4(this, 373), new AwS583S0100000_4(this, 179), 4, null);
    }
}
