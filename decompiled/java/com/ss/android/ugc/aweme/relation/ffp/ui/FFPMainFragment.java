package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC1223210hw7;
import X.AbstractC1250290idn;
import X.C019F;
import X.C01D1;
import X.C0DLI;
import X.C0OM1;
import X.C0WZX;
import X.C1070190dxJ;
import X.C1070210dxL;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1365870leD;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1599690rjL;
import X.C1622206Wu;
import X.C1701940uOG;
import X.C1749260vca;
import X.C19286910ct;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C296060Bj2;
import X.C338490DOt;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1726100v1E;
import X.EnumC666200QBe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ATListenerS340S0200000_16;
import Y.AfS185S0100000_16;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public final class FFPMainFragment extends FFPBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJSHELIOS4nISoiZyk1OGs5IGEVDhUBKCY9DjctLiI2JjE=";
    public final AssemVMLazy LLIZLLLIL;
    public Fragment LLJ;
    public Fragment LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public C1749260vca LLJILLL;
    public TuxNavBar LLJJ;
    public final C11NJ LLJJI;
    public final int LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FFPMainFragment.class, "ffpMainFragmentVM", "getFfpMainFragmentVM()Lcom/ss/android/ugc/aweme/relation/ffp/vm/FFPMainFragmentVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dwt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069910dwr) obj).LL;
            }
        }, C736820SvI.LIZJ(), new AwS630S0100000_16(this, 23), 4);
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dws
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1069910dwr) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 24), 4);
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dwu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069910dwr) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 25), 4);
    }

    public FFPMainFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(316);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FFPMainFragmentVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 494);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 495), aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS560S0100000_16((Fragment) this, 496), aFwS252S0000000_16, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 497), aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJJI = new C11NJ();
        this.LLJJIII = R.layout.c_e;
    }

    public final FFPMainFragmentVM dS() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (FFPMainFragmentVM) assemVMLazy.getValue();
    }

    public final void iS() {
        C19286910ct.LIZIZ.LIZJ(requireContext(), hS() ? 4 : 6, false);
        mS("click");
        String str = hS() ? "now_find_friends_page" : "find_friends_page";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
    }

    public final void kS() {
        if (this.LLJIJIL) {
            final String str = "";
            if (Intrinsics.LJFF(this.LLJILJILJ, "")) {
                return;
            }
            C13IQ<? extends Fragment> c13iq = dS().getState().LL;
            if (Intrinsics.LJFF(c13iq, C13LE.LIZ(AnimationAuthFragment.class)) || Intrinsics.LJFF(c13iq, C13LE.LIZ(NeedAuthFragment.class))) {
                str = "authorize";
            } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(RecEmptyFragment.class))) {
                str = "invite";
            } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(RecFriendsFragment.class))) {
                str = "normal";
            }
            final String str2 = this.LLJILJIL;
            final int newMafCount = VR().getNewMafCount();
            final String str3 = this.LLJILJILJ;
            new AbstractC1223210hw7(str, str2, newMafCount, str3) { // from class: X.07sk
                public final String LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;
                public final String LJ;

                @Override // X.AbstractC1223210hw7
                public final String LIZ() {
                    return "show_find_friends_page";
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2001607sk)) {
                        return false;
                    }
                    C2001607sk c2001607sk = (C2001607sk) obj;
                    return Intrinsics.LJFF(this.LIZIZ, c2001607sk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2001607sk.LIZJ) && this.LIZLLL == c2001607sk.LIZLLL && Intrinsics.LJFF(this.LJ, c2001607sk.LJ);
                }

                public final int hashCode() {
                    return (((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShowFFPSuggestedFindFriendTrack(pageType=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", enterFrom=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", newSuggestedCount=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", enterMethod=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1223210hw7
                public final Map<String, String> LIZIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", this.LIZJ);
                    c2344009Gk.LJIIIIZZ("enter_method", this.LJ);
                    c2344009Gk.LJIIIIZZ("tab_name", "suggested");
                    c2344009Gk.LIZJ(this.LIZLLL, "new_suggested_cnt");
                    c2344009Gk.LJIIIIZZ("page_type", this.LIZIZ);
                    return c2344009Gk.LIZ;
                }

                {
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZLLL = newMafCount;
                    this.LJ = str3;
                }
            }.LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final boolean WR() throws Throwable {
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.drh);
        Fragment fragment = this.LLJI;
        if (fragmentLJJJJZ == null || (!((fragmentLJJJJZ instanceof SearchResultFragment) || (fragmentLJJJJZ instanceof SearchFriendsV2Fragment)) || fragment == null)) {
            return false;
        }
        gS();
        dS().vQ2(C13LE.LIZ(fragment.getClass()));
        this.LLJI = null;
        return true;
    }

    public final void gS() throws Throwable {
        C19EG activity = getActivity();
        C1749260vca c1749260vca = this.LLJILLL;
        if (c1749260vca == null) {
            c1749260vca = null;
        }
        C0DLI.LIZ(activity, c1749260vca.getEditTextView());
        C1749260vca c1749260vca2 = this.LLJILLL;
        if (c1749260vca2 == null) {
            c1749260vca2 = null;
        }
        c1749260vca2.setEndAction(null);
        C1749260vca c1749260vca3 = this.LLJILLL;
        if (c1749260vca3 == null) {
            c1749260vca3 = null;
        }
        c1749260vca3.setInnerEmptyEndIcon(null);
        C1749260vca c1749260vca4 = this.LLJILLL;
        if (c1749260vca4 == null) {
            c1749260vca4 = null;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(c1749260vca4.getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitb57a1T2PZzwP6Q6D0INtL6EXO+I5C7yhk7s6Bnk=", null));
        if (editableLLLLJI != null) {
            editableLLLLJI.clear();
        }
    }

    public final boolean hS() {
        return SR().zQ2().getPageStyle() == EnumC666200QBe.TT_NOW;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJI.LJ();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        boolean z;
        C1251150ifB c1251150ifB;
        int i;
        C1251150ifB c1251150ifB2;
        SR().LLIZ = dS();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("disable_nav_layout", true);
        } else {
            z = true;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJJ = tuxNavBar;
        if (!z) {
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
        } else {
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            C0OM1 c0om1 = new C0OM1();
            AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
            EnumC666200QBe pageStyle = SR().zQ2().getPageStyle();
            EnumC666200QBe enumC666200QBe = EnumC666200QBe.TT_NOW;
            if (pageStyle == enumC666200QBe) {
                mS("show");
                c1251150ifB = new C1251150ifB();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_scan;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c1251150ifB.LIZLLL();
                c1251150ifB.LJ = c419910GdJ;
                c1251150ifB.LIZJ(new AwS560S0100000_16(this, 961));
            } else {
                c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                c1251150ifB.LJIIIIZZ = getString(2131823332);
                c1251150ifB.LIZJ(new AwS560S0100000_16(this, 962));
            }
            abstractC1250290idnArr[0] = c1251150ifB;
            c0om1.LJ(abstractC1250290idnArr);
            C1250250idj c1250250idj = new C1250250idj();
            if (!C296060Bj2.LIZIZ) {
                i = 2131825144;
            } else {
                i = 2131834969;
            }
            c1250250idj.LIZJ = getText(i);
            c0om1.LIZJ = c1250250idj;
            AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
            if (SR().zQ2().getPageStyle() == enumC666200QBe) {
                c1251150ifB2 = new C1251150ifB();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_ltr;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LJ = c419910GdJ2;
                c1251150ifB2.LIZJ(new AwS560S0100000_16(this, 959));
            } else {
                mS("show");
                c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_scan;
                c1251150ifB2.LIZJ(new AwS560S0100000_16(this, 960));
                IScanQRCodeDiffProtocol.LIZ.getClass();
                C1070210dxL.LIZIZ.getValue().LIZIZ();
                c1251150ifB2.LJI = true;
            }
            abstractC1250290idnArr2[0] = c1251150ifB2;
            c0om1.LIZIZ(abstractC1250290idnArr2);
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
        }
        C1749260vca c1749260vca = (C1749260vca) view.findViewById(R.id.u78);
        c1749260vca.setSearchBarHeight(EnumC1726100v1E.HIGH);
        c1749260vca.setShowSeparator(false);
        if (C296060Bj2.LIZIZ) {
            c1749260vca.getEditTextView().setHint(getString(2131839080));
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = view.getContext().getTheme();
            theme.resolveAttribute(R.attr.a1k, typedValue, true);
            c1749260vca.getEditTextView().setHintTextColor(typedValue.data);
            theme.resolveAttribute(R.attr.a1h, typedValue, true);
            c1749260vca.getEditTextView().setTextColor(typedValue.data);
        } else {
            c1749260vca.getEditTextView().setHint(getString(2131834652));
        }
        this.LLJJI.LIZ(C1070190dxJ.LIZ(c1749260vca.getEditTextView()).LJIL(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS185S0100000_16(this, 9)));
        c1749260vca.getEditTextView().setOnTouchListener(new ATListenerS340S0200000_16(c1749260vca, this, 0));
        this.LLJILLL = c1749260vca;
    }

    public final void mS(String str) {
        String str2;
        if (hS()) {
            str2 = "now_find_friends_page";
        } else {
            str2 = "find_friends_page";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("scan_icon", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        if (getActivity() != null && getView() != null) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJJIIZ(this, c1365870leD);
        }
    }
}
