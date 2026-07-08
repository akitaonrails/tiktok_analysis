package com.ss.android.ugc.profile.business.ur.school.findschoolfriends;

import X.AnonymousClass0206;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0HTI;
import X.C0I7D;
import X.C0TVI;
import X.C0ZP4;
import X.C1261170ivL;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1427300nFI;
import X.C14K9;
import X.C1637806bA;
import X.C1637906bB;
import X.C1722300uv6;
import X.C1749260vca;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C20600815jK;
import X.C2217381BqS;
import X.C338370DOh;
import X.C339440DSk;
import X.C346420Di4;
import X.C418440Gaw;
import X.C452501pT;
import X.C5182020e;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1070180dxI;
import X.EnumC337870DMj;
import X.EnumC338380DOi;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS139S0100000_4;
import Y.AsS31S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUserItemCell;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchSchoolMembersAssem extends CampusPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public C1749260vca LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJ;
    public C1749280vcc LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public C0ZP4 LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchSchoolMembersAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/SearchSchoolMembersViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchSchoolMembersAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void LLFF() {
        InputMethodManager inputMethodManager;
        C0I7D editTextView;
        this.LLJJJJLIIL = C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0DOg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C338350DOf) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 36), 6);
        C1749260vca c1749260vca = this.LLJJIJIL;
        if (c1749260vca != null && (editTextView = c1749260vca.getEditTextView()) != null) {
            editTextView.setCursorVisible(true);
            editTextView.requestFocus();
        }
        C1749260vca c1749260vca2 = this.LLJJIJIL;
        C0I7D editTextView2 = c1749260vca2 != null ? c1749260vca2.getEditTextView() : null;
        if (!(editTextView2 instanceof TextView) || editTextView2 == null) {
            return;
        }
        editTextView2.setCursorVisible(true);
        Object objH2 = C786410Ut5.H2(editTextView2.getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.showSoftInput(editTextView2, 1);
    }

    public SearchSchoolMembersAssem() {
        super(EnumC337870DMj.SEARCH_SCHOOL_FRIENDS);
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchSchoolMembersViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 189), AFwS232S0000000_4.get$arr$(162), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CampusFlowViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 190), AFwS232S0000000_4.get$arr$(163), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(254));
        this.LLJL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(252));
    }

    public final SearchSchoolMembersViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (SearchSchoolMembersViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void onPagePause() {
        C0I7D editTextView;
        C20600815jK<InterfaceC1891350zJl> state;
        C0I7D editTextView2;
        InputMethodManager inputMethodManager;
        C1749260vca c1749260vca = this.LLJJIJIL;
        if (c1749260vca != null && (editTextView2 = c1749260vca.getEditTextView()) != null) {
            editTextView2.setCursorVisible(false);
            editTextView2.clearFocus();
            Object objH2 = C786410Ut5.H2(editTextView2.getContext(), "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(editTextView2.getWindowToken(), 0);
            }
        }
        C0ZP4 c0zp4 = this.LLJJJJLIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJJJJLIIL = null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJFF(null);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1749260vca c1749260vca2 = this.LLJJIJIL;
        if (c1749260vca2 == null || (editTextView = c1749260vca2.getEditTextView()) == null) {
            return;
        }
        editTextView.clearFocus();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        final View decorView;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Window window;
        Context context = getContext();
        if (context == null) {
            super.xo();
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            linearLayout.setBackgroundColor(numLIZJ.intValue());
        }
        C14K9.LJIJJ(linearLayout, new C0TVI() { // from class: X.0DOd
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), view.getPaddingRight(), view.getPaddingBottom());
                return c20246014Ju;
            }
        });
        C1749260vca c1749260vca = new C1749260vca(context, null, 6);
        c1749260vca.setFocusable(true);
        c1749260vca.setFocusableInTouchMode(true);
        c1749260vca.getEditTextView().setHint(context.getString(2131847096));
        c1749260vca.setEditBackgroundRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c1749260vca.setShowSeparator(false);
        c1749260vca.getEditTextView().addTextChangedListener(new C346420Di4(this, 0));
        C1427300nFI c1427300nFI = new C1427300nFI();
        c1427300nFI.LIZIZ(EnumC1070180dxI.SECONDARY);
        String string = context.getString(R.string.f1_);
        c1427300nFI.LJI = string;
        TuxTextView tuxTextView = c1427300nFI.LJII;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
        c1427300nFI.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        ACListenerS139S0100000_4 aCListenerS139S0100000_4 = new ACListenerS139S0100000_4(new AwS583S0100000_4(this, 168), 94);
        c1427300nFI.LJFF = aCListenerS139S0100000_4;
        TuxTextView tuxTextView2 = c1427300nFI.LJII;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, aCListenerS139S0100000_4);
        }
        c1749260vca.setEndAction(c1427300nFI);
        this.LLJJIJIL = c1749260vca;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            decorView = linearLayout;
        }
        C786410Ut5.x3(decorView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0DOj
            public boolean LL;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0I7D editTextView;
                decorView.getWindowVisibleDisplayFrame(new Rect());
                C20246014Ju c20246014JuLIZ = C14K4.LIZ(decorView);
                boolean z = c20246014JuLIZ != null && c20246014JuLIZ.LJIIIIZZ(8);
                if (z != this.LL) {
                    C1749260vca c1749260vca2 = this.LLJJIJIL;
                    if (c1749260vca2 != null && (editTextView = c1749260vca2.getEditTextView()) != null) {
                        editTextView.setCursorVisible(z && editTextView.hasFocus());
                        if (!z && editTextView.hasFocus()) {
                            editTextView.clearFocus();
                        }
                    }
                    this.LL = z;
                }
            }
        });
        linearLayout.addView(this.LLJJIJIL, new LinearLayout.LayoutParams(-1, -2));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SchoolUserItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS31S0100000_4(this, 5));
        this.LLJJJ = viewOnAttachStateChangeListenerC20604515jv2;
        C1261170ivL.LIZ.getClass();
        if (C1261170ivL.LIZ() && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ) != null) {
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C339440DSk());
        }
        linearLayout.addView(this.LLJJJ, new LinearLayout.LayoutParams(-1, -2));
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        kp(EnumC338380DOi.EMPTY_KEYWORD);
        this.LLJJJIL = c1749280vcc;
        linearLayout.addView(c1749280vcc, new LinearLayout.LayoutParams(-1, -1));
        Zo(linearLayout);
        super.xo();
    }

    public static int hp(EnumC338380DOi enumC338380DOi) {
        int i = C338370DOh.LIZ[enumC338380DOi.ordinal()];
        if (i != 1) {
            if (i != 2 && i == 3) {
                return R.drawable.nl;
            }
            return R.drawable.ng;
        }
        return R.drawable.n_;
    }

    public final void kp(EnumC338380DOi enumC338380DOi) {
        int i;
        C1749280vcc c1749280vcc = this.LLJJJIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = hp(enumC338380DOi);
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            Context context = c1749280vcc.getContext();
            int i2 = C338370DOh.LIZ[enumC338380DOi.ordinal()];
            if (i2 != 1 && i2 == 2) {
                i = 2131828968;
            } else {
                i = 2131828969;
            }
            c1722300uv6.LJIIIIZZ = context.getString(i);
            int iIntValue = ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
            int iIntValue2 = ((Number) this.LLJL.getValue()).intValue();
            c1722300uv6.LIZLLL = iIntValue;
            c1722300uv6.LJ = iIntValue2;
            c1749280vcc.setStatus(c1722300uv6);
        }
    }
}
