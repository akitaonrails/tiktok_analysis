package com.ss.android.ugc.aweme.relation.fp;

import X.C0OM1;
import X.C1069830dwj;
import X.C1071540dzU;
import X.C1073970e3P;
import X.C1074520e4I;
import X.C1074610e4R;
import X.C1074630e4T;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C2217381BqS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1070410dxf;
import X.EnumC1074240e3q;
import X.InterfaceC836760Ws6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6(attachActivity = InviteFriendsHostActivity.class)
public final class InviteFriendsPage extends BaseFriendsPage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpHELIOSJS4nISoiZykjZgwiPyYnLQM+ICo9LDYcKCg2";
    public final C736950SvV LLIZ;
    public C1074610e4R LLIZLLLIL;
    public final int LLJ;

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void UR() {
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0dwT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLJJLI;
            }
        }, null, new AwS630S0100000_16(this, 35), 6);
    }

    public final FindFriendsPageVM VR() {
        return (FindFriendsPageVM) this.LLIZ.getValue();
    }

    public final void WR() {
        ViewGroup viewGroup;
        C1074610e4R c1074610e4R = (C1074610e4R) C1071540dzU.LIZIZ.LJFF();
        c1074610e4R.LIZJ(new C1074630e4T(requireActivity(), EnumC1074240e3q.FIND_FRIENDS, new C1074520e4I("invite_friends", null, 30), false, false, false, false, null, null, true, null, null, 254008));
        c1074610e4R.LLJILJILJ = new AwS560S0100000_16(this, 547);
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView((View) c1074610e4R.LLIZ.getValue(), -1, -1);
        }
        this.LLIZLLLIL = c1074610e4R;
        C736680Sv4.LJIJJ(VR(), new AwS595S0100000_16(this, 137));
    }

    public InviteFriendsPage() {
        AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(251);
        this.LLIZ = new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), aFwS204S0000000_16, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS252S0000000_16.get$arr$(330), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJ = R.layout.c_2;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final int getLayoutId() {
        return this.LLJ;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void SR(View view) {
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 548));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getText(2131836220);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(true);
        EnumC1070410dxf enumC1070410dxf = EnumC1070410dxf.CONTACT;
        if (!enumC1070410dxf.isGrant()) {
            String str = null;
            C1069830dwj.LIZ(enumC1070410dxf, requireContext(), new C1073970e3P(VR().getState().LLILZIL.LIZ, "auto", str, str, 28), new AwS595S0100000_16(this, 270));
        } else {
            WR();
        }
    }
}
