package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C0OM1;
import X.C1221530htP;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC638250P1r;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcChooseAvatarNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public C0OM1 LLJI;
    public C0OM1 LLJIJIL;
    public C0OM1 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseAvatarNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseAvatarNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2229), AFwS257S0000000_19.get$arr$(367), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1221530htP.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
    }

    public final ProfileAigcAvatarViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Resources resources;
        super.onViewCreated(view);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3142));
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = resources.getString(2131820610);
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = resources.getString(2131820605);
            EnumC638250P1r enumC638250P1r = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZLLL = enumC638250P1r;
            c1250300ido.LIZ(new AwS563S0100000_19(this, 3140));
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = resources.getString(2131820598);
            c1250300ido2.LIZLLL = enumC638250P1r;
            c1250300ido2.LIZ(new AwS563S0100000_19(this, 3141));
            C1250300ido c1250300ido3 = new C1250300ido();
            c1250300ido3.LIZJ = resources.getString(2131820594);
            c1250300ido3.LIZLLL = enumC638250P1r;
            c1250300ido3.LIZ(new AwS563S0100000_19(this, 3138));
            C1250300ido c1250300ido4 = new C1250300ido();
            c1250300ido4.LIZJ = resources.getString(2131820592);
            c1250300ido4.LIZLLL = enumC638250P1r;
            c1250300ido4.LIZ(new AwS563S0100000_19(this, 3136));
            C0OM1 c0om1 = new C0OM1();
            c0om1.LJ(c1251150ifB);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZIZ(c1250300ido);
            this.LLJI = c0om1;
            C0OM1 c0om12 = new C0OM1();
            c0om12.LJ(c1250300ido4);
            c0om12.LIZJ = c1250250idj;
            c0om12.LIZIZ(c1250300ido2);
            this.LLJIJIL = c0om12;
            C0OM1 c0om13 = new C0OM1();
            c0om13.LJ(c1250300ido4);
            c0om13.LIZJ = c1250250idj;
            c0om13.LIZIZ(c1250300ido3);
            this.LLJILJIL = c0om13;
            C0OM1 c0om14 = this.LLJI;
            if (c0om14 != null) {
                ((TuxNavBar) LJJIJL().findViewById(R.id.p15)).setNavActions(c0om14);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0ht0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZ;
            }
        }, null, new AwS633S0100000_19(this, 126), 6);
    }
}
