package com.ss.android.ugc.profile.business.ur.popup;

import X.C019F;
import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C422840Gi2;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1169630gXh;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.popup.AddProfilePhotoAssem;
import com.ss.android.ugc.profile.business.ur.popup.AvatarAndNicknamePopupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddProfilePhotoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C422840Gi2 LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddProfilePhotoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/popup/AvatarAndNicknamePopupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddProfilePhotoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2403), AFwS256S0000000_18.get$arr$(812), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2402));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C422840Gi2 c422840Gi2 = this.LLJ;
        if (c422840Gi2 != null) {
            C786410Ut5.Ra(c422840Gi2, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.0gY1
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                TuxIconDrawable tuxIconDrawableLIZ;
                this.LIZ.LLJ = (C422840Gi2) view2.findViewById(R.id.jjh);
                AddProfilePhotoAssem addProfilePhotoAssem = this.LIZ;
                C422840Gi2 c422840Gi2 = addProfilePhotoAssem.LLJ;
                if (c422840Gi2 != null) {
                    Context context = addProfilePhotoAssem.getContext();
                    if (context != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                        tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                    } else {
                        tuxIconDrawableLIZ = null;
                    }
                    c422840Gi2.setImageDrawable(tuxIconDrawableLIZ);
                }
                User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
                AddProfilePhotoAssem addProfilePhotoAssem2 = this.LIZ;
                C422840Gi2 c422840Gi22 = addProfilePhotoAssem2.LLJ;
                if (c422840Gi22 != null) {
                    C786410Ut5.Ra(c422840Gi22, new ACListenerS121S0200000_18(addProfilePhotoAssem2, currentUser, 34));
                }
                AssemVMLazy assemVMLazy = this.LIZ.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AddProfilePhotoAssem.LLJIJIL;
                C1169690gXn c1169690gXn = ((AvatarAndNicknamePopupViewModel) assemVMLazy.getValue()).LL;
                if (c1169690gXn != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c1169690gXn.LIZ(c2344009Gk);
                    C20684815ws.LJIILLIIL("show_update_avatar_sheet", c2344009Gk.LIZ);
                }
            }
        });
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gXv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169650gXj) obj).LL;
            }
        }, null, new AwS632S0100000_18(view, 205), 6);
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1169630gXh.class), new C2217381BqS() { // from class: X.0gXu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169640gXi) obj).LIZ;
            }
        }, new AwS597S0100000_18(this, 618));
    }
}
