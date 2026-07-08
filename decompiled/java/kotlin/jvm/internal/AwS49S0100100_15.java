package kotlin.jvm.internal;

import X.C09AY;
import X.C1388190mED;
import X.C13LP;
import X.C19EG;
import X.C518340KUm;
import X.C766270U4b;
import X.C921520a5W;
import X.C932420aN6;
import X.C932810aNj;
import X.C934080aPm;
import X.C936770aU7;
import X.InterfaceC921200a50;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MaxMultiGuestMixModeApplyBubbleShowTimesChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestCancelReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestHideMixModeApplyBubbleEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.GuestUserInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS49S0100100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        Object next;
        User user;
        DataChannel dataChannel;
        List listLIZIZ = ((InterfaceC921200a50) obj).LIZIZ();
        long j = awS49S0100100_15.j1;
        Iterator it2 = listLIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user2 = ((LinkPlayerInfo) next).mUser;
                if (user2 != null && user2.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            DataChannel dataChannel2 = ((C921520a5W) awS49S0100100_15.l0).dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.LC0(MultiGuestCancelReservationMsgReceivedEvent.class, Long.valueOf(user.getId()));
            }
            if (((C921520a5W) awS49S0100100_15.l0).LLJLL == user.getId() && (dataChannel = ((C921520a5W) awS49S0100100_15.l0).dataChannel) != null) {
                dataChannel.FQ2(MultiGuestHideMixModeApplyBubbleEvent.class);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        Object next;
        User user;
        FollowInfo followInfo;
        Integer num;
        List listLJI = ((InterfaceC921200a50) obj).LJI();
        long j = awS49S0100100_15.j1;
        Iterator it2 = listLJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user2 = ((LinkPlayerInfo) next).mUser;
                if (user2 != null && user2.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null && (followInfo = user.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 2 && (num = (Integer) ((C921520a5W) awS49S0100100_15.l0).dataChannel.gg0(MaxMultiGuestMixModeApplyBubbleShowTimesChannel.class)) != null && num.intValue() > 0) {
            ((LinkedList) ((C921520a5W) awS49S0100100_15.l0).LLJJLIIIJLLLLLLLZ.getValue()).offer(user);
            ((C921520a5W) awS49S0100100_15.l0).LJLLI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS49S0100100_15.j1), "from_uid");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS49S0100100_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS49S0100100_15.j1), "leave_uid");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS49S0100100_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS49S0100100_15.j1), "from_uid");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS49S0100100_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS49S0100100_15.j1), "userId");
        interfaceC954910axN.LJIILIIL(((GuestUserInfo) awS49S0100100_15.l0).linkmicIdStr, "linkmic_id");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((C932420aN6) awS49S0100100_15.l0).LLJJJJJIL.remove(Long.valueOf(awS49S0100100_15.j1));
        ((C932420aN6) awS49S0100100_15.l0).LJJJIL().LLLI(awS49S0100100_15.j1, true);
        if (!zBooleanValue) {
            ((C932420aN6) awS49S0100100_15.l0).LJJJLIIL();
            C518340KUm c518340KUm = ((C932420aN6) awS49S0100100_15.l0).LLJL;
            if (c518340KUm != null) {
                c518340KUm.LIZ(awS49S0100100_15.j1);
            }
        }
        C766270U4b.LIZLLL(2131852856);
        ((C932420aN6) awS49S0100100_15.l0).LLJJL.getValue().getClass();
        C932810aNj.LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        String str;
        String str2;
        List urls;
        Object objLJJJLL;
        HashMap map = (HashMap) obj;
        map.put("userId", String.valueOf(((C936770aU7) awS49S0100100_15.l0).LIZ));
        String str3 = ((C936770aU7) awS49S0100100_15.l0).LIZLLL;
        Object obj2 = "";
        if (str3 == null) {
            str3 = "";
        }
        map.put("linkMicId", str3);
        String str4 = ((C936770aU7) awS49S0100100_15.l0).LJ;
        if (str4 == null) {
            str4 = "";
        }
        map.put("username", str4);
        ImageModel imageModel = ((C936770aU7) awS49S0100100_15.l0).LJFF;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && (objLJJJLL = C13LP.LJJJLL(urls)) != null) {
            obj2 = objLJJJLL;
        }
        map.put("avatarUrl", obj2);
        map.put("followStatus", String.valueOf(((C936770aU7) awS49S0100100_15.l0).LJI));
        Long l = ((C936770aU7) awS49S0100100_15.l0).LIZIZ;
        long j = awS49S0100100_15.j1;
        if (l != null && l.longValue() == j) {
            str = "own_guest";
        } else {
            str = "other_guest";
        }
        map.put("userRole", str);
        if (((C936770aU7) awS49S0100100_15.l0).LJIIIIZZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("isEnigma", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS49S0100100_15 awS49S0100100_15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Room room = (Room) ((C934080aPm) awS49S0100100_15.l0).LIZIZ.gg0(RoomChannel.class);
        if (room != null) {
            C934080aPm c934080aPm = (C934080aPm) awS49S0100100_15.l0;
            long j = awS49S0100100_15.j1;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c934080aPm.LIZ.getContext());
            if (c19egLIZIZ != null) {
                if (!zBooleanValue) {
                    new C518340KUm(room, c19egLIZIZ, c934080aPm.LIZIZ).LIZ(j);
                }
                C766270U4b.LIZLLL(2131852856);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(long j, InterfaceC954180awC interfaceC954180awC, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = interfaceC954180awC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(long j, GuestUserInfo guestUserInfo, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = guestUserInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(C921520a5W c921520a5W, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c921520a5W;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(C932420aN6 c932420aN6, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c932420aN6;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(C934080aPm c934080aPm, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c934080aPm;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0100100_15(C936770aU7 c936770aU7, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c936770aU7;
        this.j1 = j;
    }
}
