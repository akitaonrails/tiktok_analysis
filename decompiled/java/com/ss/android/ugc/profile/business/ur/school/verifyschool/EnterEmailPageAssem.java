package com.ss.android.ugc.profile.business.ur.school.verifyschool;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C0DL6;
import X.C0DNX;
import X.C0DNZ;
import X.C0DOO;
import X.C0HTI;
import X.C0XQ7;
import X.C1229200i5m;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C289690BXb;
import X.C330930CyB;
import X.C336520DHe;
import X.C338170DNn;
import X.C338180DNo;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1231460i9Q;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC346320Dhu;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class EnterEmailPageAssem extends CampusPageAssem {
    public static final C0DNX LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final C01GW<Regex> LLLI;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public TuxNavBar LLJJJIL;
    public TuxTextView LLJJJJ;
    public C1748440vbG LLJJJJJIL;
    public C1748330vb5 LLJJJJLIIL;
    public C197039127h LLJJL;
    public ViewOnLayoutChangeListenerC346320Dhu LLJJLIIIJLLLLLLLZ;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0DNX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EnterEmailPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(EnterEmailPageAssem.class, "verifySchoolVM", "getVerifySchoolVM()Lcom/ss/android/ugc/profile/business/ur/school/verifyschool/VerifySchoolViewModel;", 0)};
        LLLFFI = new Object() { // from class: X.0DNX
        };
        LLLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2261));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public EnterEmailPageAssem() {
        super(EnumC337870DMj.ENTER_EMAIL);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 366), AFwS232S0000000_4.get$arr$(131), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VerifySchoolViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 367), AFwS232S0000000_4.get$arr$(132), null, true);
        this.LLJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2271));
        this.LLJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2270));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2269));
        this.LLJLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2263));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2266));
        this.LLJLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2267));
        this.LLJZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2268));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2262));
        this.LLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2264));
        this.LLLF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2265));
        this.LLLFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 368));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = ip().getEnterFrom();
        C0DNZ c0dnz = C0DNZ.SHOW;
        c0doo.getClass();
        C0DOO.LJIILJJIL(enterFrom, c0dnz);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C336520DHe(this, null), 3);
    }

    public final CampusFlowViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final VerifySchoolViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (VerifySchoolViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        this.LLJJJIL = C1229200i5m.LIZ(context, new AwS548S0100000_4(this, 369));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.pc;
        imageView.setImageDrawable(c0hti.LIZ(context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJLILLLLZIIL.getValue()).intValue());
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i, i2);
        C1245840iWc.LIZ.getClass();
        tuxTextView.setText(!C1245840iWc.LIZIZ() ? 2131847003 : 2131847000);
        tuxTextView.setTuxFont(123);
        tuxTextView.LJJJJI(28.0f);
        tuxTextView.setTextColorRes(R.attr.a1i);
        tuxTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = ((Number) this.LLJLL.getValue()).intValue();
        linearLayout.addView(tuxTextView, layoutParams2);
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i, i2);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        tuxTextView2.setGravity(17);
        linearLayout.addView(tuxTextView2, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLLIL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJ = tuxTextView2;
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        c1748440vbG.setSizeVariant(1);
        c1748440vbG.LJIILLIIL(true);
        c1748440vbG.setPlaceholderText(context.getText(2131846994));
        c1748440vbG.LJIILIIL(32, false);
        c1748440vbG.LIZ((C0DL6) this.LLLFF.getValue());
        linearLayout.addView(c1748440vbG, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLLL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJJIL = c1748440vbG;
        C1748330vb5 c1748330vb5 = new C1748330vb5(context, null, 6);
        c1748330vb5.setMessageStyle(C338180DNo.LIZ);
        c1748330vb5.setMessage(context.getText(2131846976));
        c1748330vb5.setMessageIcon(new C338170DNn());
        C786410Ut5.LJLLLLLL(8, c1748330vb5);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ((Number) this.LLJZ.getValue()).intValue();
        linearLayout.addView(c1748330vb5, layoutParams3);
        this.LLJJJJLIIL = c1748330vb5;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.LLJJJIL);
        frameLayout.addView(linearLayout, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJL.getValue()).intValue(), 0, 0, ((Number) this.LLJLIL.getValue()).intValue(), 52));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TuxTextView tuxTextView3 = new TuxTextView(context, attributeSet, i, i2);
        String string = tuxTextView3.getContext().getString(2131846996);
        String string2 = tuxTextView3.getContext().getString(2131846995);
        String string3 = tuxTextView3.getContext().getString(2131845016);
        StringBuilder sb = new StringBuilder();
        if (C1245840iWc.LIZIZ()) {
            sb.append(tuxTextView3.getContext().getString(2131846992));
            sb.append(' ');
        }
        sb.append(tuxTextView3.getContext().getString(2131847002, string, string2));
        sb.append(' ');
        if (C289690BXb.LIZ()) {
            sb.append(string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        Integer numLIZJ = C1308910kAL.LIZJ(C1245840iWc.LIZIZ() ? R.attr.a1j : R.attr.a1k, tuxTextView3.getContext());
        final int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -16777216;
        final ACListenerS139S0100000_4 aCListenerS139S0100000_4 = new ACListenerS139S0100000_4(tuxTextView3, 105);
        ClickableSpan clickableSpan = new ClickableSpan(iIntValue, aCListenerS139S0100000_4) { // from class: X.0DNb
            public final int LL;
            public final View.OnClickListener LLILLJJLI;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.LLILLJJLI;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(this.LL);
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(82);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
            }

            {
                this.LL = iIntValue;
                this.LLILLJJLI = aCListenerS139S0100000_4;
            }
        };
        final ACListenerS139S0100000_4 aCListenerS139S0100000_42 = new ACListenerS139S0100000_4(tuxTextView3, 104);
        ClickableSpan clickableSpan2 = new ClickableSpan(iIntValue, aCListenerS139S0100000_42) { // from class: X.0DNb
            public final int LL;
            public final View.OnClickListener LLILLJJLI;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.LLILLJJLI;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(this.LL);
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(82);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
            }

            {
                this.LL = iIntValue;
                this.LLILLJJLI = aCListenerS139S0100000_42;
            }
        };
        String string4 = spannableStringBuilder.toString();
        int iLJJJ = a0.LJJJ(string4, string, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(string4, string2, 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, clickableSpan, iLJJJ, string.length() + iLJJJ, 34);
        }
        if (iLJJJ2 >= 0) {
            C786410Ut5.q2(spannableStringBuilder, clickableSpan2, iLJJJ2, string2.length() + iLJJJ2, 34);
        }
        if (C289690BXb.LIZ()) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1n, tuxTextView3.getContext());
            final int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : -16777216;
            final ACListenerS139S0100000_4 aCListenerS139S0100000_43 = new ACListenerS139S0100000_4(tuxTextView3, 103);
            ClickableSpan clickableSpan3 = new ClickableSpan(iIntValue2, aCListenerS139S0100000_43) { // from class: X.0DNb
                public final int LL;
                public final View.OnClickListener LLILLJJLI;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.LLILLJJLI;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(this.LL);
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(82);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                    textPaint.setUnderlineText(false);
                }

                {
                    this.LL = iIntValue2;
                    this.LLILLJJLI = aCListenerS139S0100000_43;
                }
            };
            int iLJJJ3 = a0.LJJJ(string4, string3, 0, false, 6);
            if (iLJJJ3 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, clickableSpan3, iLJJJ3, string3.length() + iLJJJ3, 34);
            }
        }
        tuxTextView3.setHighlightColor(0);
        tuxTextView3.setText(spannableStringBuilder);
        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView3.setTuxFont(81);
        tuxTextView3.setTextColorRes(R.attr.a1k);
        tuxTextView3.setGravity(17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        linearLayout2.addView(tuxTextView3, layoutParams4);
        C197039127h c197039127h = new C197039127h(context, null, 6, i2);
        c197039127h.setText(2131846993);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(0);
        c197039127h.setEnabled(true);
        linearLayout2.addView(c197039127h);
        this.LLJJL = c197039127h;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams5.setMarginStart(((Number) this.LLLF.getValue()).intValue());
        layoutParams5.setMarginEnd(((Number) this.LLLF.getValue()).intValue());
        layoutParams5.bottomMargin = ((Number) this.LLJZIJLIL.getValue()).intValue();
        frameLayout.addView(linearLayout2, layoutParams5);
        ViewOnLayoutChangeListenerC346320Dhu viewOnLayoutChangeListenerC346320Dhu = new ViewOnLayoutChangeListenerC346320Dhu(linearLayout, linearLayout2, this, 1);
        frameLayout.addOnLayoutChangeListener(viewOnLayoutChangeListenerC346320Dhu);
        this.LLJJLIIIJLLLLLLLZ = viewOnLayoutChangeListenerC346320Dhu;
        Zo(frameLayout);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ViewOnLayoutChangeListenerC346320Dhu viewOnLayoutChangeListenerC346320Dhu = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnLayoutChangeListenerC346320Dhu != null) {
            getContentView().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC346320Dhu);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void onPagePause() {
        Context context = getSupervisor().LLJIJIL;
        Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
        InputMethodManager inputMethodManager = objH2 instanceof InputMethodManager ? (InputMethodManager) objH2 : null;
        C1748440vbG c1748440vbG = this.LLJJJJJIL;
        if (c1748440vbG != null) {
            c1748440vbG.LJIIIIZZ(inputMethodManager, 2);
            c1748440vbG.LJII();
        }
        LJLZ();
    }

    public final void hp(String str) {
        C1748330vb5 c1748330vb5 = this.LLJJJJLIIL;
        if (c1748330vb5 != null) {
            C786410Ut5.LJLLLLLL(0, c1748330vb5);
            c1748330vb5.setMessage(str);
        }
        C197039127h c197039127h = this.LLJJL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        C1245840iWc.LIZ.getClass();
        if (C1245840iWc.LIZIZ()) {
            UserCampusService userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpi$default(UserCampusService.class, false, false, false, 14, null);
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (userCampusService != null && userCampusService.LJFF(curUserId) != null) {
                z = true;
            } else {
                z = false;
            }
            if (ip().getEnterFrom().internalEnterFrom == EnumC1231460i9Q.PERSONAL_HOMEPAGE && !z) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C330930CyB(this, null), 3);
            }
            C1748440vbG c1748440vbG = this.LLJJJJJIL;
            if (c1748440vbG != null) {
                c1748440vbG.LLJLILLLLZIIL.setText("");
            }
            C197039127h c197039127h = this.LLJJL;
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS139S0100000_4(this, 59));
            }
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                tuxTextView.setText(tuxTextView.getContext().getString(2131846998));
            }
        } else {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0DKQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C337920DMo) obj).LLILZLL;
                }
            }, null, new AwS618S0100000_4(this, 44), 6);
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0DNc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLJ;
            }
        }, null, new AwS618S0100000_4(this, 45), 6);
        AssemViewModel.asyncSubscribe$default(kp(), new C2217381BqS() { // from class: X.0DNh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338080DNe) obj).LLILZ;
            }
        }, this, null, new AwS370S0200000_4(this, view, 42), new AwS548S0100000_4(this, 370), new AwS583S0100000_4(this, 177), 4, null);
    }
}
