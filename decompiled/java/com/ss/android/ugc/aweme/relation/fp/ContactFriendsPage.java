package com.ss.android.ugc.aweme.relation.fp;

import X.AbstractC1071680dzi;
import X.C01GW;
import X.C0OM1;
import X.C1071540dzU;
import X.C1074520e4I;
import X.C1074610e4R;
import X.C1074630e4T;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C296060Bj2;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1074240e3q;
import X.InterfaceC836760Ws6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6(attachActivity = ContactFriendsHostActivity.class)
public final class ContactFriendsPage extends BaseFriendsPage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJSHELIOS4nISoiZykjZgYjJzsyKzEKOyY2JiE/GS40LQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(327), "scene_type", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(325), "enter_from", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(326), "enter_method", String.class);
    public final C736950SvV LLJI;
    public AbstractC1071680dzi LLJIJIL;
    public final int LLJILJIL;

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void UR() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0dwO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLJJLI;
            }
        }, null, new AwS630S0100000_16(this, 33), 6);
        C736680Sv4.LJIJJ((AssemViewModel) this.LLJI.getValue(), new AwS595S0100000_16(this, 135));
    }

    public ContactFriendsPage() {
        AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(249);
        this.LLJI = new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), aFwS204S0000000_16, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS252S0000000_16.get$arr$(328), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJILJIL = R.layout.c_2;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final int getLayoutId() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void SR(View view) {
        Integer num;
        Integer num2;
        ViewGroup viewGroup;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 543));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getText(2131837441);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(true);
        AbstractC1071680dzi abstractC1071680dziLJFF = C1071540dzU.LIZIZ.LJFF();
        this.LLJIJIL = abstractC1071680dziLJFF;
        if (abstractC1071680dziLJFF == null) {
            abstractC1071680dziLJFF = null;
        }
        C19EG c19egRequireActivity = requireActivity();
        EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.FIND_FRIENDS;
        C1074520e4I c1074520e4I = new C1074520e4I("contact", (String) this.LLIZ.getValue(), 14);
        boolean z = C296060Bj2.LIZIZ;
        boolean z2 = !z;
        if (z) {
            num = null;
            num2 = null;
        } else {
            num = 2131834641;
            num2 = 2131834643;
        }
        ((C1074610e4R) abstractC1071680dziLJFF).LIZJ(new C1074630e4T(c19egRequireActivity, enumC1074240e3q, c1074520e4I, false, z2, z2, z2, num2, num, z, null, null, 254008));
        AbstractC1071680dzi abstractC1071680dzi = this.LLJIJIL;
        if (abstractC1071680dzi == null) {
            abstractC1071680dzi = null;
        }
        ((C1074610e4R) abstractC1071680dzi).LLJILJILJ = new AwS560S0100000_16(this, 544);
        if ((view instanceof LinearLayout) && (viewGroup = (ViewGroup) view) != null) {
            AbstractC1071680dzi abstractC1071680dzi2 = this.LLJIJIL;
            if (abstractC1071680dzi2 == null) {
                abstractC1071680dzi2 = null;
            }
            viewGroup.addView((View) ((C1074610e4R) abstractC1071680dzi2).LLIZ.getValue(), -1, -1);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLIZLLLIL.getValue());
        c2344009Gk.LJIIIIZZ("enter_method", (String) this.LLJ.getValue());
        C20684815ws.LJIILLIIL("ttsocial_contacts_page_enter", c2344009Gk.LIZ);
    }
}
