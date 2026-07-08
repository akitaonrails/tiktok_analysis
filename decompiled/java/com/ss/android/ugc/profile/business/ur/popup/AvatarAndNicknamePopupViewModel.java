package com.ss.android.ugc.profile.business.ur.popup;

import X.C1169650gXj;
import X.C1169690gXn;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1169660gXk;
import X.EnumC1169700gXo;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes19.dex */
public final class AvatarAndNicknamePopupViewModel extends AssemViewModel<C1169650gXj> {
    public C1169690gXn LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1169650gXj(EnumC1169660gXk.NO_SHEET, null);
    }

    public final void vQ2(EnumC1169700gXo enumC1169700gXo) {
        C1169690gXn c1169690gXn = this.LL;
        if (c1169690gXn != null && !c1169690gXn.LIZIZ(enumC1169700gXo)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("click_what", C1169690gXn.LIZJ(enumC1169700gXo));
            c1169690gXn.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("click_update_avatar_sheet", c2344009Gk.LIZ);
        }
    }

    public final void wQ2(EnumC1169700gXo enumC1169700gXo) {
        C1169690gXn c1169690gXn = this.LL;
        if (c1169690gXn != null && !c1169690gXn.LIZIZ(enumC1169700gXo)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("click_what", C1169690gXn.LIZJ(enumC1169700gXo));
            c1169690gXn.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("click_update_avatar_success", c2344009Gk.LIZ);
        }
    }

    public final void xQ2(EnumC1169700gXo enumC1169700gXo) {
        C1169690gXn c1169690gXn = this.LL;
        if (c1169690gXn != null && !c1169690gXn.LIZIZ(enumC1169700gXo)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("click_what", C1169690gXn.LIZJ(enumC1169700gXo));
            c1169690gXn.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("click_update_nickname_sheet", c2344009Gk.LIZ);
        }
    }
}
