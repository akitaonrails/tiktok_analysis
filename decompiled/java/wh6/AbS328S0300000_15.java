package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1109770ez9;
import X.C1161920gLG;
import X.C465360IMs;
import X.C766270U4b;
import X.C915980Zwa;
import X.C917140ZyS;
import X.C919530a2J;
import X.C922480a74;
import X.C925600aC6;
import X.C927240aEk;
import X.C933400aOg;
import X.C936690aTz;
import X.C937150aUj;
import X.EnumC918970a1P;
import X.InterfaceC954180awC;
import android.view.View;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAgreeGuideEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceApplyGuide;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AbS328S0300000_15 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS328S0300000_15 abS328S0300000_15, View view) {
        LinkUser linkUserLLD;
        int followStatus;
        LinkUser linkUserLLD2;
        if (view != null) {
            DataChannel dataChannel = ((C1109770ez9) abS328S0300000_15.l0).LJIIIZ;
            if (view.getContext() != null && dataChannel != null) {
                if (C933400aOg.R5()) {
                    C766270U4b.LIZLLL(2131842740);
                    return;
                }
                String str = null;
                C922480a74.LIZ(dataChannel, null);
                User user = ((LinkmicAudienceApplyGuide) abS328S0300000_15.l2).user;
                if (user == null) {
                    return;
                }
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().contains(Long.valueOf(user.getId()))) {
                    User user2 = ((LinkmicAudienceApplyGuide) abS328S0300000_15.l2).user;
                    if (user2 != null) {
                        long id = user2.getId();
                        ((C933400aOg) abS328S0300000_15.l1).getClass();
                        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
                        C933400aOg c933400aOg = (C933400aOg) abS328S0300000_15.l1;
                        FollowInfo followInfo = user2.getFollowInfo();
                        c933400aOg.getClass();
                        if (followInfo == null) {
                            followStatus = 0;
                        } else {
                            followStatus = (int) followInfo.getFollowStatus();
                        }
                        Boolean bool = Boolean.FALSE;
                        String str2 = ((LinkmicAudienceApplyGuide) abS328S0300000_15.l2).linkmicAudienceApplyNoticeReason;
                        long id2 = user2.getId();
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null && (linkUserLLD2 = interfaceC954180awCLLJLL.LLD(id2)) != null) {
                            str = linkUserLLD2.linkMicId;
                        }
                        C925600aC6.LJJIJ(id, enumC918970a1PLJI, true, followStatus, bool, str2, "guest_apply_anchor", str, null);
                    }
                    C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "capsuleAgreeGuide");
                    c927240aEk.LJ = String.valueOf(user.getId());
                    c927240aEk.LIZ();
                    dataChannel.LC0(LinkInRoomAnchorPermitGuestEvent.class, new C919530a2J(user, true, false, null, 12));
                    DataChannel dataChannel2 = ((C1109770ez9) abS328S0300000_15.l0).LJIIIZ;
                    if (dataChannel2 == null) {
                        return;
                    }
                    dataChannel2.LC0(MultiGuestAgreeGuideEvent.class, user);
                    return;
                }
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null && (linkUserLLD = interfaceC954180awCLLJLL2.LLD(user.getId())) != null && linkUserLLD.linkMicId != null) {
                    C766270U4b.LIZLLL(2131854580);
                } else {
                    C766270U4b.LIZLLL(2131854581);
                }
            }
        }
    }

    public static final void LIZ$1(AbS328S0300000_15 abS328S0300000_15, View view) {
        if (view != null) {
            ((C937150aUj) abS328S0300000_15.l0).P5("join", (C936690aTz) abS328S0300000_15.l1);
            List listSingletonList = Collections.singletonList(Long.valueOf(((GuestApplyStillInLineResponse.GuestApplyItem) abS328S0300000_15.l2).roomId));
            String str = ((C937150aUj) abS328S0300000_15.l0).LLJILJILJ;
            if (str == null) {
                str = "apply_room_in_line_join";
            }
            C465360IMs.LIZ(str, false, listSingletonList);
            Function0<Unit> function0 = ((C937150aUj) abS328S0300000_15.l0).LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$2(AbS328S0300000_15 abS328S0300000_15, View view) {
        if (view != null) {
            ((C937150aUj) abS328S0300000_15.l0).P5("join", (C936690aTz) abS328S0300000_15.l1);
            List listSingletonList = Collections.singletonList(Long.valueOf(((GuestApplyStillInLineResponse.GuestInvitedItem) abS328S0300000_15.l2).roomId));
            String str = ((C937150aUj) abS328S0300000_15.l0).LLJILJILJ;
            if (str == null) {
                str = "invite_room_in_line_join";
            }
            C465360IMs.LIZ(str, true, listSingletonList);
            Function0<Unit> function0 = ((C937150aUj) abS328S0300000_15.l0).LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS328S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
