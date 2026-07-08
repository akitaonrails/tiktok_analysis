package com.bytedance.android.livesdk.impl.revenue.goodybag;

import X.C09JN;
import X.C0IJT;
import X.C0UO0;
import X.C0UY5;
import X.C11S5;
import X.C1CC2;
import X.C474500IjA;
import X.C480460Ism;
import X.C500260Jjc;
import X.C754590Tir;
import X.C780500UjY;
import X.C930940aKi;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.AfS56S0110000_12;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.dataChannel.GetRoomGoodyBagResponseData;
import com.bytedance.android.livesdk.dataChannel.InitGoodyBagChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.impl.revenue.goodybag.api.GoodyBagApi;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAnchorSetting;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAudienceSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.AgeRestrictedConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.goody_bag.GetRoomGoodyBagRequest;

/* JADX INFO: loaded from: classes13.dex */
public class GoodyBagService implements IGoodyBagService {
    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final C0UY5 Cb() {
        return new C0UY5();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final GoodyBagWidget OS0() {
        return new GoodyBagWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final Class<? extends LiveRecyclableWidget> Fa0() {
        return GoodyBagWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final boolean ul2(DataChannel dataChannel) {
        Map map;
        boolean z;
        if (dataChannel != null) {
            map = (Map) dataChannel.gg0(C754590Tir.class);
        } else {
            map = null;
        }
        if (map != null) {
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(map.get(Long.valueOf(((Number) it2.next()).longValue())), Boolean.TRUE)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            if (GoodyBagFeatureAnchorSetting.INSTANCE.getValue() && !AgeRestrictedConfig.INSTANCE.isLimit() && z) {
                return true;
            }
            return false;
        }
        if (GoodyBagFeatureAudienceSetting.INSTANCE.getValue() && !AgeRestrictedConfig.INSTANCE.isLimit() && z) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final boolean wB(String str) {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        if (str == null || (goodyBagBaseInfo = C780500UjY.LIZ) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || goodyBagCommonDetail.participateMethod != 1 || goodyBagBaseInfo == null || (goodyBagCommonDetail2 = goodyBagBaseInfo.commonDetail) == null || !Intrinsics.LJFF(goodyBagCommonDetail2.participateMethodContent, str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService
    public final void B51(String str, DataChannel dataChannel, BaseFragment baseFragment, boolean z) {
        final boolean zLJIIZILJ;
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        Pair pair;
        boolean zLJI = MethodIDManager.LJI(202229);
        GetRoomGoodyBagRequest getRoomGoodyBagRequest = new GetRoomGoodyBagRequest();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        getRoomGoodyBagRequest.roomId = str;
        if (dataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        } else {
            zLJIIZILJ = false;
        }
        if (LiveShortTouchApiMergeSetting.INSTANCE.enable() && dataChannel != null && baseFragment != null && !z && (pair = (Pair) dataChannel.gg0(GetRoomGoodyBagResponseData.class)) != null && ((Boolean) pair.getFirst()).booleanValue()) {
            Object second = pair.getSecond();
            if (second != null) {
                dataChannel.zW(InitGoodyBagChannel.class, second);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (zLJIIZILJ) {
            str2 = "1";
        }
        map.put("is_anchor", str2);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                string = "";
            }
            map.put("follow_status", string);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_room_request");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_goody_bag_room_request", 0.1d)) {
            C1CC2.LJII(0, "ttlive_goody_bag_room_request", map);
        }
        C480460Ism.LIZ().getClass();
        ((GoodyBagApi) C480460Ism.LIZLLL(GoodyBagApi.class)).getGoodyBag(getRoomGoodyBagRequest.roomId).LJFF(new C0UO0()).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new AfS56S0110000_12(dataChannel, zLJIIZILJ, 0), new C09JN() { // from class: X.0T7m
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GoodyBagService@cede.getRoomGoodyBag$3");
                C1104600eqo.LJI(-1, zLJIIZILJ, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("err stack: ");
                sbLIZ.append(obj);
                C20441214yg.LJ("GoodyBagService", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GoodyBagService@cede.getRoomGoodyBag$3");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
