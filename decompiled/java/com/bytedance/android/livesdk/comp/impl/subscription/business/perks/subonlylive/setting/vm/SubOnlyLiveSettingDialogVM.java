package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm;

import X.C0IJT;
import X.C0JZH;
import X.C1559260qg8;
import X.C410401ig;
import X.C473420IhQ;
import X.C474500IjA;
import X.InterfaceC0148002o;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveSettingDialogVM extends AssemViewModel<C410401ig> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0JZH.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C410401ig(0);
    }

    public final C0JZH vQ2() {
        return (C0JZH) this.LL.getValue();
    }

    public final void yQ2(boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_use_music_popup_click");
        c474500IjALIZ.LJIJJLI(vQ2().LLILLL);
        c474500IjALIZ.LJJII(vQ2().LL, "click_position");
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public final void wQ2(DataChannel dataChannel, String str) {
        Long lValueOf;
        int i;
        User owner;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(vQ2().LL, "show_entrance");
        c474500IjALIZ.LJJII(vQ2().LL, "click_position");
        Room room = vQ2().LLILLJJLI;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room2 = vQ2().LLILLJJLI;
        if (room2 != null && (owner = room2.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_opt_in");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public final void xQ2(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_subscription_popup");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII("1", "is_in_live");
        c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(i)), "distribution_type");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "anchor_decision");
        }
        c474500IjALIZ.LIZ();
    }
}
