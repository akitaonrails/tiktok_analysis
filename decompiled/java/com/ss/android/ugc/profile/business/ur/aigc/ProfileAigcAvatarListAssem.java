package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01GW;
import X.C0P6P;
import X.C1221140hsm;
import X.C1221260hsy;
import X.C1221530htP;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1221200hss;
import X.EnumC1221310ht3;
import X.EnumC1221420htE;
import X.InterfaceC1221630htZ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcAvatarListAssem extends UIListContentAssem<ProfileAigcAvatarViewModel> implements InterfaceC1221630htZ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1221530htP.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcAvatarListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcAvatarListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2196), AFwS257S0000000_19.get$arr$(361), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2195));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = ProfileAigcChooseAvatarFooterCell.class;
        return c20603715jn;
    }

    @Override // X.InterfaceC1221630htZ
    public final C1221140hsm LJIIZILJ() {
        return new C1221140hsm(Go(), new C0P6P() { // from class: X.0hsi
            @Override // X.C0P6P
            public final void LJJIFFI() {
            }
        });
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final ProfileAigcAvatarViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Jo().manualListRefresh();
        withState(Jo(), new AwS598S0100000_19(this, 341));
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0hsg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0hsh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZLL;
            }
        }, null, new AwS668S0100000_19(this, 14), 12);
    }

    public final void No(EnumC1221420htE enumC1221420htE, C1221260hsy c1221260hsy) {
        EnumC1221200hss enumC1221200hss;
        C1221530htP c1221530htP = (C1221530htP) this.LLIZLLLIL.getValue();
        if (c1221530htP != null) {
            enumC1221200hss = c1221530htP.LLILZ;
        } else {
            enumC1221200hss = null;
        }
        if (enumC1221200hss == EnumC1221200hss.MULTIPLE_VERTICAL && !enumC1221420htE.isDownload()) {
            int i = C2187451AjH.LIZ;
            LJJIJL().setPadding(Go().getPaddingStart(), Go().getPaddingTop(), Go().getPaddingEnd(), Go().getResources().getDimensionPixelOffset(R.dimen.t0));
        } else if (c1221260hsy.LIZ != EnumC1221310ht3.HIDE) {
            int i2 = C2187451AjH.LIZ;
            LJJIJL().setPadding(Go().getPaddingStart(), Go().getPaddingTop(), Go().getPaddingEnd(), Go().getResources().getDimensionPixelOffset(R.dimen.mn));
        } else {
            int i3 = C2187451AjH.LIZ;
            LJJIJL().setPadding(Go().getPaddingStart(), Go().getPaddingTop(), Go().getPaddingEnd(), Go().getResources().getDimensionPixelOffset(R.dimen.t8));
        }
    }
}
