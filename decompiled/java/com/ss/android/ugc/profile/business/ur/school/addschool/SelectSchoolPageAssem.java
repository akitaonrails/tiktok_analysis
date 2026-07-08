package com.ss.android.ugc.profile.business.ur.school.addschool;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DHV;
import X.C0DHZ;
import X.C0DL6;
import X.C0DOO;
import X.C0HTI;
import X.C0OM1;
import X.C1229200i5m;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748440vbG;
import X.C19719912Dl;
import X.C1BNE;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C23271099x;
import X.C2344009Gk;
import X.C330090Cwp;
import X.C330300CxA;
import X.C330320CxC;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C948503nH;
import X.EnumC337870DMj;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS31S0100000_4;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SelectSchoolPageAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public C1748440vbG LLJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public View LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
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
    public final C2252321DDq LLLIIIL;
    public boolean LLLIIL;
    public final C2252321DDq LLLIILIL;
    public long LLLIL;
    public final boolean LLLILZ;
    public AnonymousClass0956 LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectSchoolPageAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectSchoolPageAssem.class, "schoolListVM", "getSchoolListVM()Lcom/ss/android/ugc/profile/business/ur/school/schoollist/SchoolListViewModel;", 0);
        c09r3.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        this.LLLIIL = true;
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = hp().getEnterFrom();
        int i = 1 ^ (hp().bt0() ? 1 : 0);
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, enterFrom);
        C1245880iWg.LIZIZ(c2344009Gk, enterFrom);
        c2344009Gk.LIZJ(i, "is_new_user");
        C20684815ws.LJIILLIIL("enter_add_school_search", c2344009Gk.LIZ);
        this.LLLIL = SystemClock.elapsedRealtime();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DHV(this, null), 3);
        C1748440vbG c1748440vbG = this.LLJJJIL;
        if (c1748440vbG != null) {
            C0DHZ c0dhz = hp().getState().LLILZLL;
            c1748440vbG.LLJLILLLLZIIL.setText(c0dhz != null ? c0dhz.LIZ : null);
            c1748440vbG.setSelection(c1748440vbG.getEditTextLength());
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void onPagePause() {
        this.LLLIIL = false;
        C1748440vbG c1748440vbG = this.LLJJJIL;
        if (c1748440vbG != null) {
            C0DHZ c0dhz = hp().getState().LLILZLL;
            c1748440vbG.LLJLILLLLZIIL.setText(c0dhz != null ? c0dhz.LIZ : null);
        }
        C1748440vbG c1748440vbG2 = this.LLJJJIL;
        if (c1748440vbG2 != null) {
            c1748440vbG2.setSelection(c1748440vbG2.getEditTextLength());
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLILZJ = null;
        LJLZ();
    }

    public SelectSchoolPageAssem() {
        super(EnumC337870DMj.SELECT_SCHOOL);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 335), AFwS232S0000000_4.get$arr$(112), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SchoolListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 336), AFwS232S0000000_4.get$arr$(113), null, true);
        this.LLJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2217));
        this.LLJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2216));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2218));
        this.LLJLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2211));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2206));
        this.LLJLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2207));
        this.LLJZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2208));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2203));
        this.LLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2202));
        this.LLLF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2204));
        this.LLLFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2205));
        this.LLLFFI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2209));
        this.LLLFZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2210));
        this.LLLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2213));
        this.LLLII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2214));
        this.LLLIIII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2215));
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2212));
        this.LLLIIIL = C1BNE.LIZ("");
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ("");
        C948503nH.LJ(this, C23271099x.INSTANCE, new C330090Cwp(this, c2252321DDqLIZ, null));
        this.LLLIILIL = c2252321DDqLIZ;
        C1245840iWc.LIZ.getClass();
        this.LLLILZ = C1245840iWc.LIZ();
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 339));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 338));
    }

    public final CampusFlowViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final int ip() {
        return ((Number) this.LLLFF.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        Zo(frameLayout);
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 337));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = context.getString(this.LLLILZ ? 2131846859 : 2131846861);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        frameLayout.addView(tuxNavBar);
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        c1748440vbG.setSizeVariant(1);
        C1748440vbG.LJIILJJIL(c1748440vbG, R.raw.icon_magnifying_glass);
        c1748440vbG.LJIILLIIL(true);
        c1748440vbG.setPlaceholderText(context.getString(this.LLLILZ ? 2131846858 : 2131846860));
        c1748440vbG.LJIILIIL(1, false);
        c1748440vbG.LIZ((C0DL6) this.LLLILZLLLI.getValue());
        c1748440vbG.setMaxLines(1);
        c1748440vbG.setEditTextTextAlignment(5);
        frameLayout.addView(c1748440vbG, C1229200i5m.LIZIZ(-1, -2, ((Number) this.LLJLIL.getValue()).intValue(), ((Number) this.LLJL.getValue()).intValue(), ((Number) this.LLJLIL.getValue()).intValue(), 0, 0, 96));
        this.LLJJJIL = c1748440vbG;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv.getAdapter()).LLLLII((C330300CxA) this.LLLIZZ.getValue(), C330300CxA.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS31S0100000_4(this, 4));
        frameLayout.addView(viewOnAttachStateChangeListenerC20604515jv, C1229200i5m.LIZIZ(-1, -1, 0, ((Number) this.LLJLILLLLZIIL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJ = viewOnAttachStateChangeListenerC20604515jv;
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.zb;
        imageView.setImageDrawable(c0hti.LIZ(context));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-1, ((Number) this.LLJLLL.getValue()).intValue(), 1));
        TuxTextView tuxTextViewLJ = C1229200i5m.LJ(context, 51, R.attr.a1j, null, 56);
        tuxTextViewLJ.setText(this.LLLILZ ? 2131846853 : 2131846854);
        tuxTextViewLJ.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
        layoutParams.topMargin = ((Number) this.LLJLLIL.getValue()).intValue() + ((Number) this.LLJLLL.getValue()).intValue();
        layoutParams.setMarginStart(((Number) this.LLJZ.getValue()).intValue());
        layoutParams.setMarginEnd(((Number) this.LLJZ.getValue()).intValue());
        frameLayout2.addView(tuxTextViewLJ, layoutParams);
        frameLayout.addView(frameLayout2, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJJIL = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ImageView imageView2 = new ImageView(context);
        C0HTI c0hti2 = new C0HTI();
        c0hti2.LIZ = R.drawable.n_;
        imageView2.setImageDrawable(c0hti2.LIZ(context));
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ((Number) this.LLJZIJLIL.getValue()).intValue());
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = ((Number) this.LLL.getValue()).intValue();
        linearLayout.addView(imageView2, layoutParams2);
        TuxTextView tuxTextViewLJ2 = C1229200i5m.LJ(context, 32, R.attr.a1h, null, 56);
        tuxTextViewLJ2.setText(this.LLLILZ ? 2131846855 : 2131846857);
        tuxTextViewLJ2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = ((Number) this.LLLF.getValue()).intValue();
        layoutParams3.setMarginStart(ip());
        layoutParams3.setMarginEnd(ip());
        linearLayout.addView(tuxTextViewLJ2, layoutParams3);
        TuxTextView tuxTextViewLJ3 = C1229200i5m.LJ(context, 51, R.attr.a1k, null, 56);
        tuxTextViewLJ3.setText(2131846856);
        tuxTextViewLJ3.setGravity(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMarginStart(ip());
        layoutParams4.setMarginEnd(ip());
        linearLayout.addView(tuxTextViewLJ3, layoutParams4);
        frameLayout.addView(linearLayout, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLJLL.getValue()).intValue(), 0, 0, 0, 116));
        this.LLJJJJLIIL = linearLayout;
        FrameLayout frameLayout3 = new FrameLayout(context);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        c1390410mHn.LIZJ();
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(((Number) this.LLLFFI.getValue()).intValue(), ((Number) this.LLLFFI.getValue()).intValue(), 1);
        layoutParams5.topMargin = ((Number) this.LLLFZ.getValue()).intValue();
        frameLayout3.addView(c1390410mHn, layoutParams5);
        frameLayout.addView(frameLayout3, C1229200i5m.LIZIZ(-1, -2, 0, 0, 0, 0, 0, 124));
        this.LLJJL = frameLayout3;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        ImageView imageView3 = new ImageView(context);
        C0HTI c0hti3 = new C0HTI();
        c0hti3.LIZ = R.drawable.nl;
        imageView3.setImageDrawable(c0hti3.LIZ(context));
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, ((Number) this.LLLI.getValue()).intValue());
        layoutParams6.gravity = 1;
        layoutParams6.topMargin = ((Number) this.LLLII.getValue()).intValue();
        linearLayout2.addView(imageView3, layoutParams6);
        TuxTextView tuxTextViewLJ4 = C1229200i5m.LJ(context, 32, R.attr.a1h, null, 56);
        tuxTextViewLJ4.setText(2131846852);
        tuxTextViewLJ4.setGravity(1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = ((Number) this.LLLIIII.getValue()).intValue();
        layoutParams7.setMarginStart(ip());
        layoutParams7.setMarginEnd(ip());
        linearLayout2.addView(tuxTextViewLJ4, layoutParams7);
        TuxTextView tuxTextViewLJ5 = C1229200i5m.LJ(context, 51, R.attr.a1k, null, 56);
        tuxTextViewLJ5.setText(2131846851);
        tuxTextViewLJ5.setGravity(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.topMargin = ((Number) this.LLLIIIIL.getValue()).intValue();
        layoutParams8.setMarginStart(ip());
        layoutParams8.setMarginEnd(ip());
        linearLayout2.addView(tuxTextViewLJ5, layoutParams8);
        frameLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        this.LLJJLIIIJLLLLLLLZ = linearLayout2;
        super.xo();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS583S0100000_4(this, 167));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C330320CxC(this, null), 3);
    }
}
