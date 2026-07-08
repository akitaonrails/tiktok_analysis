package com.ss.android.ugc.profile.business.profile.menu.business.content.search;

import X.C019F;
import X.C01GW;
import X.C01TH;
import X.C01TK;
import X.C01TP;
import X.C09R3;
import X.C0I7D;
import X.C0IDL;
import X.C0PEM;
import X.C0QSJ;
import X.C1242680iRW;
import X.C1248250iaV;
import X.C1248860ibU;
import X.C1248950ibd;
import X.C1249090ibr;
import X.C1249580ice;
import X.C1249640ick;
import X.C1249660icm;
import X.C1249670icn;
import X.C1250680ieQ;
import X.C1266020j3A;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1720106oR;
import X.C1749260vca;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20600815jK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1249630icj;
import X.EnumC395401gG;
import X.InterfaceC1146704e9;
import X.InterfaceC1242690iRX;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnFocusChangeListenerC1265950j33;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S0300000_19;
import Y.AObjectS71S0000000_19;
import Y.ARunnableS119S0100000_19;
import Y.AsS46S0100000_19;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.view.SearchableMenuCell;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SearchActionComponent extends BaseUIComponent implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final AssemVMLazy LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C1749260vca LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLLIL;
    public C1242680iRW LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public long LLLF;
    public long LLLFF;
    public volatile HomePageViewPagerAbility LLLFFI;
    public C127G LLLFZ;
    public InterfaceC665370Q7z LLLI;
    public C0QSJ LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchActionComponent.class, "profilePageMenuViewModel", "getProfilePageMenuViewModel()Lcom/ss/android/ugc/profile/business/profile/menu/viewmodel/ProfileMenuViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchActionComponent.class, "homePageViewPagerAbility", "getHomePageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchActionComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileMenuViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2114), AFwS257S0000000_19.get$arr$(352), null, true);
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(369));
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2113));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        List<? extends ProfileComponents> list;
        CharSequence text;
        Integer numLJIL;
        Integer numLIZIZ;
        Context context;
        String string;
        Describe describe;
        super.onCreate();
        ProfileComponents profileComponents = this.LLJJJ;
        if (profileComponents != null && (list = profileComponents.components) != null) {
            for (ProfileComponents profileComponents2 : list) {
                String str = profileComponents2.componentId;
                if (Intrinsics.LJFF(str, "search_section_cell_input_box")) {
                    View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
                    if (viewFindViewById == null) {
                        View viewLJJIJL = LJJIJL();
                        viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.o8l) : null;
                        this.LLJJLIIIJLLLLLLLZ = (LinearLayout) viewFindViewById;
                    }
                    LinearLayout linearLayout = (LinearLayout) viewFindViewById;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(0, linearLayout);
                    }
                    final C1749260vca c1749260vcaBp = Bp();
                    if (c1749260vcaBp != null) {
                        c1749260vcaBp.getEditTextView().setHint(c1749260vcaBp.getContext().getText(2131840572));
                        c1749260vcaBp.getEditTextView().setFilters(new C1249670icn[]{new InputFilter() { // from class: X.0icn
                            @Override // android.text.InputFilter
                            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                                if (charSequence != null) {
                                    for (int i5 = 0; i5 < charSequence.length(); i5++) {
                                        if (!C1244080iTm.LJ(charSequence.charAt(i5))) {
                                            return null;
                                        }
                                    }
                                    if (spanned == null || spanned.length() == 0) {
                                        return "";
                                    }
                                    return null;
                                }
                                return null;
                            }
                        }});
                        c1749260vcaBp.getEditTextView().setOnEditorActionListener(new C0IDL(c1749260vcaBp, 2));
                        c1749260vcaBp.getEditTextView().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(this, 3));
                        c1749260vcaBp.getEditTextView().addTextChangedListener(new C1266020j3A(this, 13));
                        c1749260vcaBp.setEndAction(null);
                        HomePageViewPagerAbility homePageViewPagerAbilityYp = yp();
                        final int iIntValue = (homePageViewPagerAbilityYp == null || (numLJIL = homePageViewPagerAbilityYp.LJIL()) == null) ? 0 : numLJIL.intValue();
                        HomePageViewPagerAbility homePageViewPagerAbilityYp2 = yp();
                        if (homePageViewPagerAbilityYp2 != null) {
                            homePageViewPagerAbilityYp2.Jk1(new InterfaceC469360Ias() { // from class: X.0ich
                                public int LL = -1;

                                @Override // X.InterfaceC469360Ias
                                public final void onPageScrollStateChanged(int i) {
                                    Object tag;
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onPageScrollStateChanged: state = ");
                                    sbLIZ.append(i);
                                    sbLIZ.append(", targetPosition = ");
                                    sbLIZ.append(this.LL);
                                    sbLIZ.append(", lastPageIndex = ");
                                    sbLIZ.append(iIntValue);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    if (i != 0) {
                                        if (i == 1) {
                                            KeyboardUtils.LIZIZ(c1749260vcaBp.getEditTextView());
                                            C1720106oR.LJI("SearchActionComponent", "start slide scroll, and dismiss keyboard");
                                            return;
                                        }
                                        return;
                                    }
                                    if (this.LL != iIntValue) {
                                        return;
                                    }
                                    C1749260vca c1749260vcaBp2 = this.Bp();
                                    Object obj = null;
                                    if (c1749260vcaBp2 != null) {
                                        tag = c1749260vcaBp2.getTag(R.id.s6w);
                                    } else {
                                        tag = null;
                                    }
                                    if (tag instanceof EnumC1249630icj) {
                                        obj = tag;
                                    }
                                    EnumC1249630icj enumC1249630icj = EnumC1249630icj.EXIT;
                                    if (obj == enumC1249630icj) {
                                        return;
                                    }
                                    this.Wp(new C1249660icm(enumC1249630icj));
                                }

                                @Override // X.InterfaceC469360Ias
                                public final void onPageSelected(int i) {
                                    this.LL = i;
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onPageSelected: ");
                                    sbLIZ.append(i);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.InterfaceC469360Ias
                                public final void onPageScrolled(int i, float f, int i2) {
                                    int i3 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onPageScrolled: ");
                                    sbLIZ.append(i);
                                    sbLIZ.append(", ");
                                    sbLIZ.append(f);
                                    sbLIZ.append(", ");
                                    sbLIZ.append(i2);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                            });
                        }
                    }
                    TuxTextView tuxTextViewEp = Ep();
                    if (tuxTextViewEp != null) {
                        C786410Ut5.LLLLZLL(tuxTextViewEp, 8);
                    }
                    TuxTextView tuxTextViewEp2 = Ep();
                    if (tuxTextViewEp2 != null) {
                        Context context2 = getContext();
                        if (context2 == null || (text = context2.getText(R.string.f1_)) == null) {
                            text = "";
                        }
                        tuxTextViewEp2.setText(text);
                    }
                    TuxTextView tuxTextViewEp3 = Ep();
                    if (tuxTextViewEp3 != null) {
                        C786410Ut5.h9(tuxTextViewEp3, new ACListenerS154S0100000_19(this, 193));
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp = Gp();
                    if (viewOnAttachStateChangeListenerC20604515jvGp != null) {
                        viewOnAttachStateChangeListenerC20604515jvGp.LJIILJJIL(SearchableMenuCell.class);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp2 = Gp();
                    if (viewOnAttachStateChangeListenerC20604515jvGp2 != null) {
                        viewOnAttachStateChangeListenerC20604515jvGp2.setItemAnimator(null);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp3 = Gp();
                    if (viewOnAttachStateChangeListenerC20604515jvGp3 != null) {
                        viewOnAttachStateChangeListenerC20604515jvGp3.addOnScrollListener(new AsS46S0100000_19(this, 15));
                    }
                    C1242680iRW c1242680iRWUp = up();
                    if (c1242680iRWUp != null) {
                        c1242680iRWUp.setOnScrollListener(new InterfaceC1242690iRX() { // from class: X.0ici
                            @Override // X.InterfaceC1242690iRX
                            public final void LIZIZ(int i, int i2) {
                                C0I7D editTextView;
                                int i3 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onScrolled: ");
                                sbLIZ.append(i);
                                sbLIZ.append(", ");
                                sbLIZ.append(i2);
                                C2188811AlT.LIZIZ(sbLIZ);
                                if (Math.abs(i2) > 20 && !this.LIZ.Qp()) {
                                    C1749260vca c1749260vcaBp2 = this.LIZ.Bp();
                                    if (c1749260vcaBp2 != null) {
                                        editTextView = c1749260vcaBp2.getEditTextView();
                                    } else {
                                        editTextView = null;
                                    }
                                    KeyboardUtils.LIZIZ(editTextView);
                                    C1720106oR.LJI("SearchActionComponent", "start slide scroll from active state, and dismiss keyboard");
                                }
                            }
                        });
                    }
                    Up(false);
                } else if (Intrinsics.LJFF(str, "search_section_cell_settings_and_privacy")) {
                    this.LLJZ = true;
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("initSettingEntrance = ");
                    sbLIZ.append(this.LLJJJ);
                    sbLIZ.append(", ");
                    sbLIZ.append(this.LLJJIJIIJIL);
                    C1720106oR.LJI("SearchActionComponent", C2188811AlT.LIZIZ(sbLIZ));
                    C1248250iaV.LIZ.getClass();
                    BizBaseData bizBaseDataLIZ = C1248250iaV.LIZ(profileComponents2);
                    TuxTextView tuxTextViewAp = Ap();
                    if (tuxTextViewAp != null) {
                        C786410Ut5.LLLLZLL(tuxTextViewAp, 0);
                        if ((bizBaseDataLIZ == null || (describe = bizBaseDataLIZ.getDescribe()) == null || (string = describe.getText()) == null) && ((context = tuxTextViewAp.getContext()) == null || (string = context.getString(2131824015)) == null)) {
                            string = "Settings";
                        }
                        tuxTextViewAp.setText(string);
                    }
                    Context context3 = getContext();
                    if (context3 != null) {
                        if (bizBaseDataLIZ != null && (numLIZIZ = C1248250iaV.LIZIZ(bizBaseDataLIZ, context3, "content_section_cell_base_item")) != null) {
                            int iIntValue2 = numLIZIZ.intValue();
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = iIntValue2;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                            c419910GdJ.LJ = Integer.valueOf(((C1248860ibU) this.LLJZIJLIL.getValue()).LIZLLL);
                            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context3);
                            TuxTextView tuxTextViewAp2 = Ap();
                            if (tuxTextViewAp2 != null) {
                                tuxTextViewAp2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, tuxIconDrawableLIZ, (Drawable) null, (Drawable) null);
                            }
                            TuxTextView tuxTextViewAp3 = Ap();
                            if (tuxTextViewAp3 != null) {
                                tuxTextViewAp3.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                            }
                        }
                        TuxTextView tuxTextViewAp4 = Ap();
                        if (tuxTextViewAp4 != null) {
                            C786410Ut5.h9(tuxTextViewAp4, new ACListenerS85S0300000_19(this, profileComponents2, context3, 14));
                        }
                    }
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, Ip(), new C2217381BqS() { // from class: X.0icA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C596330NaB) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 119), 4);
    }

    public final TuxTextView Ap() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u5g) : null;
            this.LLJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1749260vca Bp() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.o8k) : null;
            this.LLJLILLLLZIIL = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    public final TuxTextView Ep() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u7u) : null;
            this.LLJLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView Fp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.o8m) : null;
            this.LLJLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Gp() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.o8n) : null;
            this.LLJLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final ProfileMenuViewModel Ip() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        return (ProfileMenuViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        C1249090ibr c1249090ibr = (C1249090ibr) new C1559260qg8(new C723580SZw(this, C1249090ibr.class, this.assemTagInternal), checkSupervisorPrepared()).getValue();
        this.LLJJJ = c1249090ibr != null ? (ProfileComponents) c1249090ibr.LL : null;
        C1248950ibd c1248950ibd = this.LLJJI;
        this.LLJILLL = c1248950ibd != null ? c1248950ibd.LL : -1;
    }

    public final C1242680iRW up() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.s2b) : null;
            this.LLJLLL = (C1242680iRW) viewFindViewById;
        }
        return (C1242680iRW) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.HomePageViewPagerAbility yp() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLLFFI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLLFFI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLII     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLI     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLI = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLII = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.HomePageViewPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLFFI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent.yp():com.ss.android.ugc.aweme.base.HomePageViewPagerAbility");
    }

    public final IMenuAbility zp() {
        return (IMenuAbility) this.LLL.getValue();
    }

    public final boolean Qp() {
        C1749260vca c1749260vcaBp = Bp();
        Object tag = c1749260vcaBp != null ? c1749260vcaBp.getTag(R.id.s6w) : null;
        Object obj = tag instanceof EnumC1249630icj ? tag : null;
        return obj == null || C13LQ.LJJIJIIJI(obj, new EnumC1249630icj[]{EnumC1249630icj.EXIT, EnumC1249630icj.CANCEL}) >= 0;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ProfileMenuViewModel.class, new AObjectS71S0000000_19(this, 4)}, defaultViewModelProviderFactory);
                    this.LLLFZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Ip().LL.LIZ(null);
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SearchActionComponent", "onPause");
        Jp(EnumC395401gG.CLICK);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19EG activity;
        super.onResume();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SearchActionComponent", "onResume");
        TuxTextView tuxTextViewAp = Ap();
        if (tuxTextViewAp != null && Intrinsics.LJFF(tuxTextViewAp.getTag(R.id.s6y), Boolean.TRUE)) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
                Hox hoxLIZ = Hox.LLJILJIL.LIZ(activity);
                Bundle bundle = new Bundle();
                bundle.putBoolean("isSmoothScroll", true);
                hoxLIZ.TQ2(bundle, "USER", false);
            }
            TuxTextView tuxTextViewAp2 = Ap();
            if (tuxTextViewAp2 != null) {
                tuxTextViewAp2.setTag(R.id.s6y, Boolean.FALSE);
            }
        }
        this.LLLFF = System.currentTimeMillis();
    }

    public final void Jp(EnumC395401gG enumC395401gG) {
        if (Qp()) {
            return;
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLFF;
        c1250680ieQ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TH(enumC395401gG, jCurrentTimeMillis, null), 3);
    }

    public final void Tp(boolean z) {
        TuxTextView tuxTextViewEp;
        TuxTextView tuxTextViewAp;
        TuxTextView tuxTextViewAp2;
        if (z) {
            if (this.LLJZ) {
                tuxTextViewEp = Ap();
            } else {
                tuxTextViewEp = null;
            }
            tuxTextViewAp = Ep();
        } else {
            tuxTextViewEp = Ep();
            tuxTextViewAp = Ap();
        }
        if (tuxTextViewAp != null && tuxTextViewAp.getVisibility() == 0) {
            C786410Ut5.LLLLZLL(tuxTextViewAp, 8);
        }
        if (tuxTextViewEp != null && tuxTextViewEp.getVisibility() != 0) {
            C786410Ut5.LLLLZLL(tuxTextViewEp, 0);
        }
        if (z && (tuxTextViewAp2 = Ap()) != null) {
            tuxTextViewAp2.setTag(R.id.s6y, Boolean.FALSE);
        }
    }

    public final void Up(boolean z) {
        int i;
        C1749260vca c1749260vcaBp = Bp();
        if (c1749260vcaBp != null) {
            if (z) {
                i = R.attr.a1h;
            } else {
                i = R.attr.a1k;
            }
            c1749260vcaBp.setInnerStartIconColorAttr(i);
        }
    }

    public final void Wp(C1249660icm c1249660icm) {
        Integer numValueOf;
        Integer numValueOf2;
        List listLLIIII;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp2;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        EnumC395401gG enumC395401gG;
        C0I7D editTextView;
        int size = 0;
        boolean z = false;
        switch (C1249640ick.LIZ[c1249660icm.LIZ.ordinal()]) {
            case 1:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp3 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp3 != null) {
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jvGp3);
                }
                TuxTextView tuxTextViewFp = Fp();
                if (tuxTextViewFp != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewFp, 8);
                }
                C1242680iRW c1242680iRWUp = up();
                if (c1242680iRWUp != null) {
                    C786410Ut5.A1(c1242680iRWUp, 8);
                }
                List<C1249580ice> list = c1249660icm.LIZJ;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp4 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp4 != null && (state2 = viewOnAttachStateChangeListenerC20604515jvGp4.getState()) != null) {
                    numValueOf2 = Integer.valueOf(state2.LJIIIIZZ());
                } else {
                    numValueOf2 = null;
                }
                boolean z2 = !Intrinsics.LJFF(numValueOf, numValueOf2);
                List<C1249580ice> list2 = c1249660icm.LIZJ;
                if (list2 != null && (viewOnAttachStateChangeListenerC20604515jvGp2 = Gp()) != null && (state = viewOnAttachStateChangeListenerC20604515jvGp2.getState()) != null) {
                    state.LJIILL(list2, null);
                }
                if (z2 && (viewOnAttachStateChangeListenerC20604515jvGp = Gp()) != null) {
                    viewOnAttachStateChangeListenerC20604515jvGp.scrollToPosition(0);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                String str = c1249660icm.LIZIZ;
                List<C1249580ice> list3 = c1249660icm.LIZJ;
                if (list3 != null) {
                    size = list3.size();
                }
                List<C1249580ice> list4 = c1249660icm.LIZJ;
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator<C1249580ice> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LLILLJJLI);
                    }
                    listLLIIII = C13LP.LLIIII(arrayList);
                } else {
                    listLLIIII = null;
                }
                String strValueOf = String.valueOf(jCurrentTimeMillis);
                String strValueOf2 = String.valueOf(this.LLLF);
                c1250680ieQ.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TP(str, size, listLLIIII, strValueOf, strValueOf2, null), 3);
                this.LLLF = jCurrentTimeMillis;
                break;
            case 2:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp5 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp5 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvGp5);
                }
                TuxTextView tuxTextViewFp2 = Fp();
                if (tuxTextViewFp2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewFp2, 0);
                }
                C1242680iRW c1242680iRWUp2 = up();
                if (c1242680iRWUp2 != null) {
                    C786410Ut5.A1(c1242680iRWUp2, 8);
                }
                break;
            case 3:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp6 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp6 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvGp6);
                }
                TuxTextView tuxTextViewFp3 = Fp();
                if (tuxTextViewFp3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewFp3, 8);
                }
                C1242680iRW c1242680iRWUp3 = up();
                if (c1242680iRWUp3 != null) {
                    C786410Ut5.A1(c1242680iRWUp3, 0);
                }
                break;
            case 4:
                break;
            case 5:
            case 6:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp7 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp7 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvGp7);
                }
                TuxTextView tuxTextViewFp4 = Fp();
                if (tuxTextViewFp4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewFp4, 8);
                }
                C1242680iRW c1242680iRWUp4 = up();
                if (c1242680iRWUp4 != null) {
                    C786410Ut5.A1(c1242680iRWUp4, 0);
                }
                C1749260vca c1749260vcaBp = Bp();
                if (c1749260vcaBp != null && (editTextView = c1749260vcaBp.getEditTextView()) != null) {
                    editTextView.setText("");
                }
                Tp(true);
                Up(false);
                if (c1249660icm.LIZ == EnumC1249630icj.CANCEL) {
                    z = true;
                }
                Vp(true, z);
                if (z) {
                    enumC395401gG = EnumC395401gG.CLICK_CANCEL;
                } else {
                    enumC395401gG = EnumC395401gG.SLIDE;
                }
                Jp(enumC395401gG);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exit/cancel search, reset page width to default, searchExitType = ");
                sbLIZ.append(c1249660icm.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                break;
            case 7:
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGp8 = Gp();
                if (viewOnAttachStateChangeListenerC20604515jvGp8 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvGp8);
                }
                TuxTextView tuxTextViewFp5 = Fp();
                if (tuxTextViewFp5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewFp5, 8);
                }
                C1242680iRW c1242680iRWUp5 = up();
                if (c1242680iRWUp5 != null) {
                    C786410Ut5.A1(c1242680iRWUp5, 0);
                }
                Tp(false);
                Up(true);
                Vp(false, true);
                Ip().vQ2(null);
                this.LLLFF = System.currentTimeMillis();
                C1250680ieQ.LIZ.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TK(null), 3);
                break;
            default:
                throw new C1954807lC();
        }
        C1749260vca c1749260vcaBp2 = Bp();
        if (c1749260vcaBp2 != null) {
            c1749260vcaBp2.setTag(R.id.s6w, c1249660icm.LIZ);
        }
    }

    public final void Vp(boolean z, boolean z2) {
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 103);
        if (z) {
            if (z2) {
                aRunnableS119S0100000_19.run();
            }
            HomePageViewPagerAbility homePageViewPagerAbilityYp = yp();
            if (homePageViewPagerAbilityYp != null) {
                homePageViewPagerAbilityYp.IX(0.85f, z2);
                return;
            }
            return;
        }
        if (z2) {
            aRunnableS119S0100000_19.run();
        }
        HomePageViewPagerAbility homePageViewPagerAbilityYp2 = yp();
        if (homePageViewPagerAbilityYp2 == null) {
            return;
        }
        homePageViewPagerAbilityYp2.IX(1.0f, z2);
    }
}
