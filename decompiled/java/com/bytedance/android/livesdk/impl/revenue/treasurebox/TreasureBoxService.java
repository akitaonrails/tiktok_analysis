package com.bytedance.android.livesdk.impl.revenue.treasurebox;

import X.AbstractC19484711Kz;
import X.AbstractC497160Jec;
import X.C0IJT;
import X.C0UO0;
import X.C1104600eqo;
import X.C1104650eqt;
import X.C1148020fyq;
import X.C1151220g40;
import X.C11S5;
import X.C19474411Ha;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C328000CtS;
import X.C470590Icr;
import X.C474500IjA;
import X.C480460Ism;
import X.C496230Jd7;
import X.C497120JeY;
import X.C497580JfI;
import X.C500260Jjc;
import X.C750070TbZ;
import X.C750090Tbb;
import X.C750220Tbo;
import X.C754590Tir;
import X.C754990TjV;
import X.C817503Hh;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.AfS2S1200100_17;
import Y.AfS3S0200100_12;
import Y.AfS4S0300100_17;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.dataChannel.RedEnvelopeListResponseData;
import com.bytedance.android.livesdk.dataChannel.RevenueAuthSuccessEvent;
import com.bytedance.android.livesdk.dataChannel.RevenuePermissionResponseData;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.TreasureBoxRootWidget;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.network.ActivityTreasureBoxApi;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOptEnablePost;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.envelope.RevenuePermissionRequest;
import webcast.api.envelope.RevenuePermissionResponse;

/* JADX INFO: loaded from: classes18.dex */
public class TreasureBoxService implements ITreasureBoxService {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void ma(DataChannel dataChannel) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0g40] */
    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final C1151220g40 Te2() {
        return new AbstractC497160Jec<C470590Icr<TaskInfoResponse.Data>, C496230Jd7>() { // from class: X.0g40
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(149));

            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/task/info/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<TaskInfoResponse.Data>>() { // from class: X.0g41
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<TaskInfoResponse.Data>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                if (C1796440wqg.LIZIZ == null && this.LIZ.getValue() == null) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                Pair[] pairArr = new Pair[8];
                Room room = c496230Jd7.LIZ;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("room_id", String.valueOf(lValueOf));
                pairArr[1] = new Pair("scene_type", "7");
                pairArr[2] = new Pair("task_period", CardStruct.IStatusCode.DEFAULT);
                C1134550fd7 c1134550fd7 = C1134550fd7.LIZ;
                pairArr[3] = new Pair("daily_watch_duration", String.valueOf(C1134550fd7.LJ()));
                w.LIZ.getClass();
                pairArr[4] = new Pair("enter_from_merge", w.LJIIIZ());
                pairArr[5] = new Pair("task_type", CardStruct.IStatusCode.DEFAULT);
                Object value = C1796440wqg.LIZIZ;
                if (value == null && (value = this.LIZ.getValue()) == null) {
                    value = "";
                }
                pairArr[6] = new Pair("currency", value);
                pairArr[7] = new Pair("ab_config", "isp_new_arch");
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<TaskInfoResponse.Data> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final TreasureBoxRootWidget W70() {
        return new TreasureBoxRootWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final boolean pD() {
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        Set setKeySet = map != null ? map.keySet() : null;
        if (setKeySet == null) {
            return false;
        }
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (jLongValue != 1 && jLongValue != 2 && jLongValue != 4 && jLongValue != 9 && jLongValue != 19 && Intrinsics.LJFF(map.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final ActivityTreasureBoxWidget sR1() {
        return new ActivityTreasureBoxWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final Class<? extends LiveRecyclableWidget> ax2() {
        return TreasureBoxRootWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final Class<? extends LiveRecyclableWidget> j61() {
        return ActivityTreasureBoxWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final boolean jK2(Integer num) {
        Set setKeySet;
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        if (map != null) {
            setKeySet = map.keySet();
        } else {
            setKeySet = null;
        }
        if (setKeySet == null) {
            return false;
        }
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            int i = (int) jLongValue;
            if (num != null && i == num.intValue()) {
                return Intrinsics.LJFF(map.get(Long.valueOf(jLongValue)), Boolean.TRUE);
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void y71(String str, DataChannel dataChannel, boolean z) {
        String secUid;
        String str2;
        AbstractC19484711Kz<C470590Icr<RedEnvelopeListResponse>> redEnvelopList;
        List<RedEnvelopInfo> list;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        boolean zLJI = MethodIDManager.LJI(202245);
        if (str == null) {
            C20441214yg.LIZIZ("TreasureBoxService", "getEnvelopeList: roomId is null");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (dataChannel == null) {
            C20441214yg.LIZIZ("TreasureBoxService", "getEnvelopeList, live data channel is null");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        User userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel);
        if (userLJIIIIZZ == null || (secUid = userLJIIIIZZ.getSecUid()) == null) {
            secUid = "";
        }
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        HashMap map = new HashMap(5);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_list_request");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
        C1CC2.LJII(0, "ttlive_treasure_box_list_request", new HashMap());
        long jCurrentTimeMillis = System.currentTimeMillis();
        dataChannel.SX0(C750090Tbb.class, Long.valueOf(jCurrentTimeMillis));
        if (LiveShortTouchApiMergeSetting.INSTANCE.enable() && !z) {
            Pair pair = (Pair) dataChannel.gg0(RedEnvelopeListResponseData.class);
            if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                RedEnvelopeListResponse redEnvelopeListResponse = (RedEnvelopeListResponse) pair.getSecond();
                if (redEnvelopeListResponse != null && (list = redEnvelopeListResponse.envelopList) != null) {
                    dataChannel.SX0(C754990TjV.class, Long.valueOf(System.currentTimeMillis()));
                    dataChannel.zW(InitEnvelopeListChannel.class, list);
                } else {
                    C20441214yg.LJ("TreasureBoxService", "err info: empty list");
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            C20441214yg.LJ("TreasureBoxService", "err info: request merge api error");
        }
        if (!GetTreasureBoxListOptEnablePost.INSTANCE.getValue()) {
            if (LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/envelope/list/")) {
                redEnvelopList = new C19474411Ha<>(C497120JeY.LJIIZILJ.LIZIZ("/webcast/envelope/list/", new C497580JfI(str, secUid)));
            } else {
                C480460Ism.LIZ().getClass();
                redEnvelopList = ((ActivityTreasureBoxApi) C480460Ism.LIZLLL(ActivityTreasureBoxApi.class)).getRedEnvelopList(str, secUid);
            }
            redEnvelopList.LJFF(new C0UO0()).LJJIIZ(new AfS4S0300100_17(jCurrentTimeMillis, this, bool, dataChannel, 2), new AfS3S0200100_12(this, jCurrentTimeMillis, bool, 0));
        } else {
            C480460Ism.LIZ().getClass();
            ((ActivityTreasureBoxApi) C480460Ism.LIZLLL(ActivityTreasureBoxApi.class)).getRedEnvelopListV2(str, secUid).LJFF(new C0UO0()).LJJIIZ(new AfS4S0300100_17(jCurrentTimeMillis, this, bool, dataChannel, 3), new AfS3S0200100_12(this, jCurrentTimeMillis, bool, 1));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZ(int i, String str, long j, List list, Boolean bool) {
        int size;
        String str2;
        int iIntValue;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap(12);
        map.put("error_code", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        map.put("error_msg", str);
        map.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        map.put("envelope_count", String.valueOf(size));
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                RedEnvelopInfo redEnvelopInfo = (RedEnvelopInfo) it2.next();
                String str3 = redEnvelopInfo.envelopeId;
                if (str3 == null) {
                    str3 = "";
                }
                Integer num = redEnvelopInfo.businessType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                String str4 = redEnvelopInfo.sendUserId;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(str3);
                arrayList2.add(String.valueOf(iIntValue));
                arrayList3.add(str4);
            }
        }
        map.put("envelope_id_list", arrayList.toString());
        map.put("business_type_list", arrayList2.toString());
        map.put("send_user_id_list", arrayList3.toString());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_list_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
        C1CC2.LJII(0, "ttlive_treasure_box_list_response", map);
    }

    public static void LIZIZ(DataChannel dataChannel, String str, long j, Throwable th, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            C1104600eqo.LJII(-1, arrayList, arrayList2, str, null, j);
        }
        if (dataChannel != null) {
            dataChannel.LC0(RevenueAuthSuccessEvent.class, Boolean.FALSE);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("err stack: ");
        sbLIZ.append(th);
        C20441214yg.LJ("twr:RedEnvelopePermission", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService
    public final void BW0(Long l, String str, DataChannel dataChannel, LifecycleOwner lifecycleOwner, boolean z) {
        long jLongValue;
        String str2 = str;
        boolean zLJI = MethodIDManager.LJI(202463);
        RevenuePermissionRequest revenuePermissionRequest = new RevenuePermissionRequest();
        revenuePermissionRequest.needBizs = 3L;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        revenuePermissionRequest.roomId = jLongValue;
        if (str2 == null) {
            str2 = "";
        }
        revenuePermissionRequest.secAnchorId = str2;
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (dataChannel != null) {
            dataChannel.SX0(C750070TbZ.class, Long.valueOf(System.currentTimeMillis()));
        }
        if (LiveShortTouchApiMergeSetting.INSTANCE.enable() && lifecycleOwner != null && dataChannel != null) {
            dataChannel.EQ2(lifecycleOwner, RevenuePermissionResponseData.class, new C1104650eqt(this, revenuePermissionRequest, string, dataChannel, jCurrentTimeMillis));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LIZLLL(revenuePermissionRequest, string, jCurrentTimeMillis, dataChannel, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZLLL(RevenuePermissionRequest revenuePermissionRequest, String str, long j, DataChannel dataChannel, boolean z) {
        AbstractC19484711Kz<C470590Icr<RevenuePermissionResponse.ResponseData>> redEnvelopePermission;
        HashMap map = new HashMap(3);
        map.put("uuid", str);
        C20441214yg.LIZIZ("GoodyBagLogHelper", "start posting request revenue permission event");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_revenue_interact_permission_request");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
        C1CC2.LJII(0, "ttlive_revenue_interact_permission_request", new HashMap());
        C20441214yg.LIZIZ("GoodyBagLogHelper", "end of posting request revenue permission event");
        if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/revenue/permission/")) {
            redEnvelopePermission = new C19474411Ha<>(C497120JeY.LJIIZILJ.LIZIZ("/webcast/revenue/permission/", new AwS561S0100000_17(revenuePermissionRequest, 210)));
        } else {
            C480460Ism.LIZ().getClass();
            redEnvelopePermission = ((ActivityTreasureBoxApi) C480460Ism.LIZLLL(ActivityTreasureBoxApi.class)).getRedEnvelopePermission(revenuePermissionRequest.needBizs, revenuePermissionRequest.roomId, revenuePermissionRequest.secAnchorId);
        }
        redEnvelopePermission.LJFF(new C0UO0()).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new AfS2S1200100_17(this, dataChannel, str, j, 0), new AfS2S1200100_17(this, dataChannel, str, j, 1));
    }

    public static void LIZJ(DataChannel dataChannel, RevenuePermissionResponse.ResponseData responseData, String str, long j, int i, String str2, boolean z) {
        if (dataChannel != null) {
            dataChannel.SX0(C750220Tbo.class, Boolean.TRUE);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (responseData != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C328000CtS(dataChannel, null), 3);
            DataChannelGlobal.LLILZ.JQ2(C1148020fyq.class, responseData.envelopePermission);
            if (dataChannel != null) {
                dataChannel.SX0(C754590Tir.class, responseData.goodyBagPermission);
            }
            Map<Long, Boolean> map = responseData.envelopePermission;
            if (map != null) {
                for (Long l : map.keySet()) {
                    if (Intrinsics.LJFF(map.get(l), Boolean.TRUE)) {
                        arrayList.add(l);
                    }
                }
            }
            Map<Long, Boolean> map2 = responseData.goodyBagPermission;
            if (map2 != null) {
                for (Long l2 : map2.keySet()) {
                    if (Intrinsics.LJFF(map2.get(l2), Boolean.TRUE)) {
                        arrayList2.add(l2);
                    }
                }
            }
        } else {
            C20441214yg.LJ("twr:RedEnvelopePermission", "err info: empty permissionMap");
        }
        if (z) {
            C1104600eqo.LJII(Integer.valueOf(i), arrayList, arrayList2, str, str2, j);
        }
    }
}
