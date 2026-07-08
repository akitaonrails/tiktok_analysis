package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment;

import X.C01GW;
import X.C03H5;
import X.C06VW;
import X.C098200Yq;
import X.C0C64;
import X.C0I0B;
import X.C0OM1;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C1391190mJ3;
import X.C13LE;
import X.C1400340mXo;
import X.C14K9;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1685300txQ;
import X.C1749260vca;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19508111Tz;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C1BNE;
import X.C20617815m4;
import X.C20617915m5;
import X.C20618715mD;
import X.C20618815mE;
import X.C20619015mG;
import X.C20619115mH;
import X.C20750316Ht;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1431810nMZ;
import X.EnumC19358210oO;
import X.EnumC20618915mF;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20619415mK;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC897330ZId;
import Y.ACListenerS133S0200000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareScope;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class EditShareSelectFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1058150ddt, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGHELIOSspLSYnOy0tOyp9LjctLiI2JjFiDCs6PBYkKD02GyAgLCwnDjctLiI2JjE=";
    public C1749260vca LLIZ;
    public TuxTextView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxNavBar LLJI;
    public TuxTextView LLJIJIL;
    public final C736950SvV LLJILJIL;
    public AwS575S0100000_31 LLJILJILJ;
    public AwS575S0100000_31 LLJILLL;
    public AwS397S0200000_31 LLJJ;
    public C20619015mG LLJJI;
    public AwS275S0300000_31 LLJJIII;
    public AwS575S0100000_31 LLJJIJI;
    public AwS610S0100000_31 LLJJIJIIJIL;
    public AwS645S0100000_31 LLJJIJIL;
    public Integer LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Function1<? super Boolean, Unit> LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C2252321DDq LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public boolean LLLI;
    public boolean LLLII;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EditShareScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EditShareScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EditShareScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final ContactSelectVM SR() {
        return (ContactSelectVM) this.LLJILJIL.getValue();
    }

    public final void WR() {
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        C20618815mE.LIZJ(SR().LLJI, EnumC19358210oO.CLICK_GO_TO_SEARCH, SR().LLJ, SR().LLJIJIL, currentUser != null ? currentUser.getFriendCount() : 0, SR().getState().LL.size(), null, this.LLJJIJIIJIL, 320);
        ZR(EnumC20618915mF.SEARCH);
    }

    public EditShareSelectFragment() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 726);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(ContactSelectVM.class), new AwS575S0100000_31(awS575S0100000_31, (Function0<Unit>) 730), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(144), null, null, null);
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(211));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new AwS575S0100000_31(this, 729));
        this.LLL = c01gwLIZ;
        this.LLLF = C452501pT.LIZ(enumC452301pR, new AwS575S0100000_31(this, 727));
        this.LLLFF = C1BNE.LIZ(c01gwLIZ.getValue());
        this.LLLFFI = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(212));
        this.LLLFZ = C452501pT.LIZ(enumC452301pR, new AwS575S0100000_31(this, 728));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC897330ZId interfaceC897330ZId = SR().LLJILJIL.LIZIZ;
        if (interfaceC897330ZId != null) {
            interfaceC897330ZId.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC897330ZId interfaceC897330ZId = SR().LLJILJIL.LIZIZ;
        if (interfaceC897330ZId != null) {
            interfaceC897330ZId.LJII();
        }
    }

    public final void UR(View view) {
        InputMethodManager inputMethodManager;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Object objH2 = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "input_method");
        }
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR(X.C1749260vca r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L7
            X.0v1E r0 = X.EnumC1726100v1E.HIGH
            r5.setSearchBarHeight(r0)
        L7:
            X.19EG r1 = r4.getActivity()
            if (r1 == 0) goto L7b
            r0 = 2131100625(0x7f0603d1, float:1.7813637E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZ(r0, r1)
            if (r0 == 0) goto L7b
            int r1 = r0.intValue()
            if (r5 == 0) goto L52
            X.0I7D r0 = r5.getEditTextView()
            if (r0 == 0) goto L25
            r0.setHintTextColor(r1)
        L25:
            X.0I7D r2 = r5.getEditTextView()
            if (r2 == 0) goto L34
            X.16HQ r1 = new X.16HQ
            r0 = 1
            r1.<init>(r4, r0)
            r2.addTextChangedListener(r1)
        L34:
            X.0I7D r2 = r5.getEditTextView()
            if (r2 == 0) goto L43
            X.16H7 r1 = new X.16H7
            r0 = 0
            r1.<init>(r4, r0)
            r2.setOnEditorActionListener(r1)
        L43:
            X.0I7D r2 = r5.getEditTextView()
            if (r2 == 0) goto L52
            Y.ATListenerS463S0100000_31 r1 = new Y.ATListenerS463S0100000_31
            r0 = 3
            r1.<init>(r4, r0)
            r2.setOnTouchListener(r1)
        L52:
            boolean r0 = r4.LLJJJJLIIL
            if (r0 == 0) goto L7a
            if (r5 == 0) goto L7a
            X.0I7D r3 = r5.getEditTextView()
            if (r3 == 0) goto L7a
            r3.requestFocus()
            android.content.Context r2 = r4.getContext()
            r1 = 0
            if (r2 == 0) goto L6e
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C786410Ut5.H2(r2, r0)
        L6e:
            boolean r0 = r1 instanceof android.view.inputmethod.InputMethodManager
            if (r0 == 0) goto L7a
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L7a
            r0 = 0
            r1.showSoftInput(r3, r0)
        L7a:
            return
        L7b:
            if (r5 == 0) goto L52
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment.VR(X.0vca):void");
    }

    public final void ZR(EnumC20618915mF enumC20618915mF) {
        ConstraintLayout constraintLayout;
        ViewGroup.LayoutParams layoutParams;
        int i = C20619115mH.LIZ[enumC20618915mF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (C19508111Tz.LIZ() && this.LLJJJ != null && (constraintLayout = this.LLJ) != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                            layoutParams.height = (int) (ScreenUtils.getScreenHeight(getContext()) * 0.95f);
                        }
                        VR(this.LLIZ);
                        if (!this.LLLI) {
                            this.LLLI = true;
                            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 597), 3);
                        }
                        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), EditShareProtocol.class, false);
                        if (listLIZIZ != null) {
                            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((EditShareProtocol) it2.next()).Uc1();
                            }
                        }
                        ContactSelectVM contactSelectVMSR = SR();
                        contactSelectVMSR.LLIZ.set(false);
                        contactSelectVMSR.AQ2(true);
                        contactSelectVMSR.wQ2();
                        C1749260vca c1749260vca = this.LLIZ;
                        if (c1749260vca != null) {
                            C786410Ut5.LLLZ(c1749260vca, 0);
                        }
                        ConstraintLayout constraintLayout2 = this.LLJ;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setBackgroundColor(C1383370m6R.LJFF(R.attr.a1d));
                        }
                        TuxNavBar tuxNavBar = this.LLJI;
                        if (tuxNavBar != null) {
                            tuxNavBar.setNavBackground(C1383370m6R.LJFF(R.attr.a1d));
                        }
                        this.LLLFF.setValue(this.LLLF.getValue());
                        TuxNavBar tuxNavBar2 = this.LLJI;
                        if (tuxNavBar2 != null) {
                            tuxNavBar2.LJJ(new AwS610S0100000_31(this, 206), "leading_icon");
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                C1749260vca c1749260vca2 = this.LLIZ;
                if (c1749260vca2 != null) {
                    C786410Ut5.LLLZ(c1749260vca2, 8);
                }
                TuxTextView tuxTextView = this.LLJIJIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    return;
                }
                return;
            }
            C1749260vca c1749260vca3 = this.LLIZ;
            if (c1749260vca3 != null) {
                C786410Ut5.LLLZ(c1749260vca3, 8);
            }
            TuxTextView tuxTextView2 = this.LLJIJIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return;
            }
            return;
        }
        C1749260vca c1749260vca4 = this.LLIZ;
        if (c1749260vca4 != null) {
            C786410Ut5.LLLZ(c1749260vca4, 8);
        }
        TuxTextView tuxTextView3 = this.LLJIJIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        }
        TuxTextView tuxTextView4 = this.LLJIJIL;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String value;
        String string;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        EnumC20618915mF enumC20618915mF;
        TuxNavBar tuxNavBar;
        ConstraintLayout constraintLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Integer num;
        String string3;
        C786410Ut5.I7(new ACListenerS133S0200000_31(this, view, 13), view);
        Bundle arguments = getArguments();
        if (arguments == null || (value = arguments.getString("enter_method")) == null) {
            value = EnumC1431810nMZ.MAIN_POSTING_CAMERA_ICON.getValue();
        }
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string3 = arguments2.getString("enter_from", "")) != null) {
            str = string3;
        }
        Bundle arguments3 = getArguments();
        String string4 = null;
        if (arguments3 != null) {
            string = arguments3.getString("flow_id");
        } else {
            string = null;
        }
        this.LLJZ = string;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string2 = arguments4.getString("scenario", null);
        } else {
            string2 = null;
        }
        this.LLJLLIL = string2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z = arguments5.getBoolean("is_photo_post");
        } else {
            z = false;
        }
        this.LLLII = z;
        SR().LLJ = value;
        SR().LLJI = str;
        SR().LLJIJIL = this.LLJLLIL;
        this.LLIZ = (C1749260vca) view.findViewById(R.id.u78);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.paf);
        this.LLJ = (ConstraintLayout) view.findViewById(R.id.trr);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.p_7);
        this.LLJI = (TuxNavBar) view.findViewById(R.id.p15);
        TuxNavBar tuxNavBar2 = this.LLJI;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(C1383370m6R.LJFF(R.attr.a1e));
            C0OM1 c0om1 = new C0OM1();
            Object value2 = this.LLLFZ.getValue();
            if (value2 != null) {
                c0om1.LJ(value2);
            }
            C1251150ifB c1251150ifB = (C1251150ifB) this.LLLFFI.getValue();
            c1251150ifB.LIZIZ = "trailing_icon";
            c1251150ifB.LIZ(((InterfaceC20619415mK) this.LLLFF.getValue()).LIZ());
            c1251150ifB.LIZJ(new AwS575S0100000_31(this, 731));
            c0om1.LIZIZ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            Context context = tuxNavBar2.getContext();
            if (context != null) {
                c1250250idj.LIZJ = context.getString(2131846769);
                c0om1.LIZJ = c1250250idj;
                c0om1.LIZLLL = false;
                tuxNavBar2.setNavActions(c0om1);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06VW(this, tuxNavBar2, null), 3);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && arguments6.getBoolean("is_search_mode", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJJIL = z2;
        Bundle arguments7 = getArguments();
        if (arguments7 != null && arguments7.getBoolean("empty_friends_list", false)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJJJJ = z3;
        Bundle arguments8 = getArguments();
        if (arguments8 != null && arguments8.getBoolean("low_friends_list", false)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLJJJJJIL = z4;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_edit_share_panel_edge2edge", true) > 0) {
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJIJ(this);
            ConstraintLayout constraintLayout2 = this.LLJ;
            if (constraintLayout2 != null) {
                constraintLayout2.setFitsSystemWindows(false);
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(constraintLayout2.getContext()));
            }
        }
        if (C19508111Tz.LIZ()) {
            if (this.LLJJJJ) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(224)));
                this.LLJJJ = numValueOf;
                if (this.LLJL && numValueOf != null) {
                    this.LLJJJ = Integer.valueOf(numValueOf.intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                }
                if (this.LLJLILLLLZIIL && (num = this.LLJJJ) != null) {
                    this.LLJJJ = Integer.valueOf(num.intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
                }
                ConstraintLayout constraintLayout3 = this.LLJ;
                if (constraintLayout3 != null && (layoutParams2 = constraintLayout3.getLayoutParams()) != null) {
                    layoutParams2.height = this.LLJJJ.intValue();
                }
            } else if (this.LLJJJJJIL && (constraintLayout = this.LLJ) != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                layoutParams.height = this.LLJJJ.intValue();
            }
        }
        if (!this.LLJJJIL && this.LLJJJJLIIL) {
            if (this.LLJJJJ) {
                enumC20618915mF = EnumC20618915mF.VERTICAL_NONE;
            } else if (this.LLJJJJJIL) {
                enumC20618915mF = EnumC20618915mF.VERTICAL_LOW;
            } else {
                enumC20618915mF = EnumC20618915mF.VERTICAL_NORMAL;
            }
        } else {
            enumC20618915mF = EnumC20618915mF.SEARCH;
        }
        EnumC20618915mF enumC20618915mF2 = EnumC20618915mF.SEARCH;
        if (enumC20618915mF == enumC20618915mF2 && (tuxNavBar = this.LLJI) != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxNavBar.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                C786410Ut5.W5(tuxNavBar, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS397S0200000_31(this, enumC20618915mF, 51), 3);
        ZR(enumC20618915mF);
        ContactSelectVM contactSelectVMSR = SR();
        AwS645S0100000_31 awS645S0100000_31 = this.LLJJIJIL;
        if (contactSelectVMSR.LL == null) {
            C20617915m5 c20617915m5 = new C20617915m5(ViewModelKt.getViewModelScope(contactSelectVMSR), this, contactSelectVMSR.LLJ, awS645S0100000_31);
            contactSelectVMSR.LL = c20617915m5;
            c20617915m5.LJI = new AwS575S0100000_31(contactSelectVMSR, 1538);
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            string4 = arguments9.getString("from_group_id");
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.15lv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20617115lx) obj).LLILLL);
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 287), 4);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.15lz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20617115lx) obj).LLILZIL;
            }
        }, C736820SvI.LJ(), new C20617815m4(this, string4, value, str), 4);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.15ly
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20617115lx) obj).LLIZ);
            }
        }, C736820SvI.LJ(), new C20618715mD(this, str, value), 4);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.15m0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20617115lx) obj).LLIZLLLIL;
            }
        }, C736820SvI.LJ(), new AwS645S0100000_31(this, 108), 4);
        if (this.LLJJJJLIIL && enumC20618915mF != enumC20618915mF2) {
            ContactSelectVM contactSelectVMSR2 = SR();
            contactSelectVMSR2.LLIZ.set(true);
            contactSelectVMSR2.xQ2(true);
        } else {
            VR(this.LLIZ);
            ContactSelectVM contactSelectVMSR3 = SR();
            contactSelectVMSR3.xQ2(false);
            contactSelectVMSR3.wQ2();
        }
        C14K9.LJIJJ(view.getRootView(), new C20750316Ht(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLJJJJLIIL) {
            i = R.layout.cha;
        } else {
            i = R.layout.ch_;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
