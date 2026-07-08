package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.C019F;
import X.C01GW;
import X.C0HBV;
import X.C0HFR;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS130S0101000_24;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarImageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public AvatarComponentView LLIZLLLIL;
    public Long LLJ;
    public boolean LLJI = true;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ = true;
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarImageAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/socialavatar/review/SocialAvatarEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SocialAvatarImageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarEditViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 927), AFwS236S0000000_6.get$arr$(383), null, true);
        this.LLJJ = new C1559260qg8(new C723580SZw(this, C0HFR.class, null), checkSupervisorPrepared());
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 926));
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 925));
    }

    public final C0HFR Go() {
        return (C0HFR) this.LLJJ.getValue();
    }

    public final SocialAvatarEditViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SocialAvatarEditViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZ;
        this.LLIZLLLIL = (AvatarComponentView) view.findViewById(R.id.m5w);
        Context context = getContext();
        if (context != null) {
            C0HBV.LIZ.getClass();
            iLIZ = C0HBV.LIZ(context);
        } else {
            iLIZ = 280;
        }
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        AvatarComponentView avatarComponentView2 = null;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        new AwS130S0101000_24(iLIZ, this, 4).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
        if (avatarComponentView3 == null) {
            avatarComponentView3 = null;
        }
        avatarComponentView3.setOnTouchListener(null);
        AvatarComponentView avatarComponentView4 = this.LLIZLLLIL;
        if (avatarComponentView4 != null) {
            avatarComponentView2 = avatarComponentView4;
        }
        avatarComponentView2.setClickable(false);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0HGg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 97), 6);
    }
}
