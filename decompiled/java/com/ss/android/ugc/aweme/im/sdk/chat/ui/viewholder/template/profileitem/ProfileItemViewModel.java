package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem;

import X.C01GW;
import X.C0Y8T;
import X.C0YG2;
import X.C0YSQ;
import X.C0ZCJ;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1677606ha;
import X.C23250099c;
import X.C287600BPa;
import X.C457780HxI;
import X.C723600SZy;
import X.C830490Whz;
import X.C876470YZx;
import X.C882340YjQ;
import X.C895880ZCo;
import X.C895890ZCp;
import X.C895910ZCr;
import X.InterfaceC0148002o;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IMRelationLabelService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileItemViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileItemViewModel extends AssemViewModel<C895910ZCr> {
    public IMRelationLabelInfo LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1004));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1002));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 1003));
    public final C895890ZCp LLJILJIL = new C0YG2() { // from class: X.0ZCp
        @Override // X.C0YG2
        public final void xf0(C876610YaB c876610YaB) {
        }

        @Override // X.C0YG2
        public final void I02(List<String> list) {
            if (!list.contains(this.LL.vQ2())) {
                return;
            }
            ProfileItemViewModel profileItemViewModel = this.LL;
            profileItemViewModel.LLIZLLLIL = false;
            IMUser iMUser = profileItemViewModel.getState().LL;
            ProfileItemViewModel profileItemViewModel2 = this.LL;
            profileItemViewModel2.setState(new AwS380S0200000_14(iMUser, profileItemViewModel2, 56));
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C895910ZCr(0);
    }

    public final String vQ2() {
        return (String) this.LLILZ.getValue();
    }

    public final C830490Whz wQ2() {
        String singleChatFromUserId;
        C830490Whz c830490Whz = new C830490Whz();
        SessionInfo sessionInfoXQ2 = xQ2();
        c830490Whz.put("previous_page", sessionInfoXQ2 != null ? sessionInfoXQ2.getEnterFromForMob() : null);
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("chat_type", C1677606ha.LIZ(((Number) this.LLILLL.getValue()).intValue()));
        c830490Whz.put("conversation_id", vQ2());
        SessionInfo sessionInfoXQ22 = xQ2();
        if (sessionInfoXQ22 != null && (singleChatFromUserId = sessionInfoXQ22.getSingleChatFromUserId()) != null) {
            c830490Whz.put("to_user_id", singleChatFromUserId);
        }
        return c830490Whz;
    }

    public final SessionInfo xQ2() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C876470YZx.LIZ().LJIIL(this.LLJILJIL);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(vQ2());
        this.LLIZLLLIL = c0y8tLIZ != null ? C882340YjQ.LJ(c0y8tLIZ) : false;
        setState(new AwS380S0200000_14(getState().LL, this, 57));
        C876470YZx.LIZ().LJIIIZ(this.LLJILJIL);
    }

    public final void yQ2(IMUser iMUser) {
        if (iMUser == null) {
            return;
        }
        setState(new AwS380S0200000_14(iMUser, this, 58));
        if (!this.LLIZ && !this.LLILZLL) {
            IMRelationLabelService.LIZ.getClass();
            IMRelationLabelService value = C0ZCJ.LIZIZ.getValue();
            String uid = iMUser.getUid();
            this.LLIZ = true;
            if ((C287600BPa.LIZ() == 1 || C287600BPa.LIZ() == 3) && uid != null && uid.length() != 0 && value != null) {
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C895880ZCo(value, uid, this, iMUser, null), 3);
            } else {
                this.LLILZLL = true;
                setState(new AwS380S0200000_14(iMUser, this, 98));
            }
        }
    }
}
