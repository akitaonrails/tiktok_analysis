package com.bytedance.android.livesdk.impl.revenue.enigma;

import X.C0IHL;
import X.C0KZM;
import X.C0KZN;
import X.C0KZO;
import X.C0KZU;
import X.C0PEM;
import X.C0UO0;
import X.C1150560g2w;
import X.C118300cf;
import X.C11HT;
import X.C11IB;
import X.C11JN;
import X.C11NZ;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C470590Icr;
import X.C480460Ism;
import X.C482020IvI;
import X.C497740JfY;
import X.C517101zt;
import X.C520860Kbk;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import X.InterfaceC743640TFa;
import Y.AfS172S0100000_3;
import Y.AfS176S0100000_7;
import Y.AfS1S0300200_7;
import Y.AfS3S0200200_7;
import Y.AkS323S0200000_7;
import Y.AkS7S0101100_7;
import Y.AkS86S0201000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaApi;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.impl.revenue.enigma.widget.EnigmaWidget;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaRefreshOptimizationTimerSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaToggleTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveKeyApiOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveEnterRoomVersionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.text.a0;
import tikcast.api.privilege.PrivilegeReportRequest;
import tikcast.api.privilege.enigma.EnigmaPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaToggleWearRequest;
import tikcast.api.privilege.enigma.EnigmaToggleWearResponse;
import tikcast.api.privilege.enigma.EnigmaWhisperRequest;

/* JADX INFO: loaded from: classes8.dex */
public class EnigmaService implements IEnigmaService {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final EnigmaWidget nX1() {
        return new EnigmaWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void Bl2(String str) {
        try {
            PrivilegeReportRequest privilegeReportRequest = new PrivilegeReportRequest();
            privilegeReportRequest.reportType = 2;
            privilegeReportRequest.animationUuid = str;
            privilegeReportRequest.businessType = 1L;
            C480460Ism.LIZ().getClass();
            ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).reportPrivilegeCenter(privilegeReportRequest).LJIILIIL(new C0UO0()).LJJLJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void XD0(Context context) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131852222);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131852206));
        c782110Um9.LJIILL(C497740JfY.LJIJI(2131852208), new InterfaceC743640TFa() { // from class: X.0KZQ
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        Window window = liveDialogLIZ.getWindow();
        if (window != null) {
            window.addFlags(131072);
        }
        C786410Ut5.E4(liveDialogLIZ);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void bs2(String str) {
        try {
            PrivilegeReportRequest privilegeReportRequest = new PrivilegeReportRequest();
            privilegeReportRequest.reportType = 1;
            privilegeReportRequest.animationUuid = str;
            privilegeReportRequest.businessType = 1L;
            C480460Ism.LIZ().getClass();
            ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).reportPrivilegeCenter(privilegeReportRequest).LJIILIIL(new C0UO0()).LJJLJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void V00(Bundle bundle, FragmentManager fragmentManager) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C482020IvI(this, bundle, fragmentManager, null), 3);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void fG(EnigmaPurchaseRequest enigmaPurchaseRequest, C1150560g2w c1150560g2w) {
        C480460Ism.LIZ().getClass();
        ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).purchaseEnigma(enigmaPurchaseRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(c1150560g2w, 133), new AfS176S0100000_7(c1150560g2w, 134));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final C520860Kbk HU(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TextView textView) {
        return new C520860Kbk(dataChannel, lifecycleOwner, textView);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void NN1(final String str, AwS428S0200000_27 awS428S0200000_27, AwS582S0100000_3 awS582S0100000_3) {
        UserService.getInstance().user().LJIILLIIL().LJJIJLIJ().LJJJ(new C517101zt(2L, 5), false).LJJLIIIJLJLI(new AkS86S0201000_7(LiveEnigmaRefreshOptimizationTimerSetting.INSTANCE.getMaxRetries(), this, null, 1)).LJJJ(new InterfaceC1487280oo2() { // from class: X.01Al
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                User user = (User) obj;
                if (a0.LJJIIZI(user.getNickName(), str, false)) {
                    return C11NZ.LJJJJZ(user);
                }
                return C11NZ.LJJIJLIJ(new C290301An());
            }
        }, false).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(awS428S0200000_27, 137), new AfS172S0100000_3((Object) awS582S0100000_3, 25));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void vY1(EnigmaWhisperRequest enigmaWhisperRequest, C0KZU c0kzu, int i) {
        C480460Ism.LIZ().getClass();
        ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).sendWhisperMessage(enigmaWhisperRequest).LJIILIIL(new C0UO0()).LJJLIIIJJIZ(i).LJJLL(new AfS176S0100000_7(c0kzu, 135), new AfS176S0100000_7(c0kzu, 136));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService
    public final void ia2(Room room, long j, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, DataChannel dataChannel) {
        Pair pair;
        C11NZ<BaseResponse<Room, EnterRoomExtra>> c11nzNewVersionEnterRoom;
        long id = room.getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j == 2) {
            EnigmaToggleWearRequest enigmaToggleWearRequest = new EnigmaToggleWearRequest();
            enigmaToggleWearRequest.roomId = id;
            enigmaToggleWearRequest.changeTo = 2L;
            enigmaToggleWearRequest.forceUpdate = false;
            EnigmaToggleWearRequest enigmaToggleWearRequest2 = new EnigmaToggleWearRequest();
            enigmaToggleWearRequest2.roomId = id;
            enigmaToggleWearRequest2.changeTo = 1L;
            enigmaToggleWearRequest2.forceUpdate = true;
            pair = new Pair(enigmaToggleWearRequest, enigmaToggleWearRequest2);
        } else {
            if (j != 1) {
                return;
            }
            EnigmaToggleWearRequest enigmaToggleWearRequest3 = new EnigmaToggleWearRequest();
            enigmaToggleWearRequest3.roomId = id;
            enigmaToggleWearRequest3.changeTo = 1L;
            enigmaToggleWearRequest3.forceUpdate = false;
            EnigmaToggleWearRequest enigmaToggleWearRequest4 = new EnigmaToggleWearRequest();
            enigmaToggleWearRequest4.roomId = id;
            enigmaToggleWearRequest4.changeTo = 2L;
            enigmaToggleWearRequest4.forceUpdate = true;
            pair = new Pair(enigmaToggleWearRequest3, enigmaToggleWearRequest4);
        }
        EnigmaToggleWearRequest enigmaToggleWearRequest5 = (EnigmaToggleWearRequest) pair.getFirst();
        EnigmaToggleWearRequest enigmaToggleWearRequest6 = (EnigmaToggleWearRequest) pair.getSecond();
        C480460Ism.LIZ().getClass();
        C11NZ<EnigmaToggleWearResponse> c11nz = ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).toggleWear(enigmaToggleWearRequest5);
        C480460Ism.LIZ().getClass();
        C11NZ<EnigmaToggleWearResponse> c11nz2 = ((IEnigmaApi) C480460Ism.LIZLLL(IEnigmaApi.class)).toggleWear(enigmaToggleWearRequest6);
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<Object>> c11nzLeaveRoom = ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).leaveRoom(id, -99);
        LiveEnigmaRefreshOptimizationTimerSetting liveEnigmaRefreshOptimizationTimerSetting = LiveEnigmaRefreshOptimizationTimerSetting.INSTANCE;
        long initialDelay = liveEnigmaRefreshOptimizationTimerSetting.getInitialDelay();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C11IB c11ibLJLJJLL = C11NZ.LJLJJLL(initialDelay, timeUnit);
        long id2 = room.getId();
        String requestId = room.getRequestId();
        String labels = room.getLabels();
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("common_label_list", labels);
        c0ihl.LIZ("enter_source", "live_merge-live_cover");
        c0ihl.LIZ("request_id", requestId);
        c0ihl.LIZ("enter_type", "mystery");
        c0ihl.LIZ("live_reason", "mystery");
        c0ihl.LIZ("enter_from_uid_by_shared", null);
        c0ihl.LIZ("is_fresh", "1");
        c0ihl.LIZ("ecommerce_use_new_promotion", "1");
        c0ihl.LIZ("action_type", "draw");
        c0ihl.LIZ("sort_wbc_tag", "");
        c0ihl.LIZ("need_trim_pull_stream", CardStruct.IStatusCode.DEFAULT);
        HashMap<String, String> map = c0ihl.LIZ;
        String version = LiveEnterRoomVersionSetting.getVersion();
        if (LiveKeyApiOpt.enableRoomEnterHighPriority()) {
            if (version.length() == 0) {
                C480460Ism.LIZ().getClass();
                c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).enterRoomImmediate(id2, 1L, 1L, map);
            } else {
                C480460Ism.LIZ().getClass();
                c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).newVersionEnterRoomImmediately(version, id2, 1L, 1L, map);
            }
        } else if (version.length() == 0) {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).enterRoom(id2, 1L, 1L, map);
        } else {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).newVersionEnterRoom(version, id2, 1L, 1L, map);
        }
        C11JN c11jnLJJIJIIJIL = c11nzNewVersionEnterRoom.LJJIJIIJIL(new AfS176S0100000_7(dataChannel, 69));
        C11NZ<R> c11nzLJJJ = UserService.getInstance().user().LJIILLIIL().LJJIJLIJ().LJJJ(new C517101zt(j, 5), false);
        C118300cf c118300cf = new C118300cf();
        new C11HT(C11NZ.LJIILLIIL(c11nz.LJJLIIIJLJLI(new AkS7S0101100_7(new C0KZM(this), 0)).LJJL(new InterfaceC1487280oo2() { // from class: X.0KZL
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C11NZ.LJJIJLIJ(new Exception() { // from class: X.0KZK
                });
            }
        }), c11ibLJLJJLL, c11nzLJJJ.LJJLIIIJLJLI(new AkS86S0201000_7(liveEnigmaRefreshOptimizationTimerSetting.getMaxRetries(), this, new AwS551S0100000_7(c118300cf, 66), 1)), c11nzLeaveRoom.LJJLIIIJLJLI(new AkS7S0101100_7(new C0KZN(this), 0)).LJJL(new InterfaceC1487280oo2() { // from class: X.0KZJ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C11NZ.LJJIJLIJ(new Exception() { // from class: X.0KZI
                });
            }
        }), c11jnLJJIJIIJIL.LJJLIIIJLJLI(new AkS7S0101100_7(new C0KZO(this), 0)).LJJL(new InterfaceC1487280oo2() { // from class: X.0KZH
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C11NZ.LJJIJLIJ(new Exception() { // from class: X.0KZG
                });
            }
        })).LJLJI(LiveEnigmaToggleTimeoutSetting.INSTANCE.getValue(), timeUnit).LJJL(new AkS323S0200000_7(this, c11nz2, 0))).LJJIJLIJ().LJIILIIL(new C0UO0()).LJJLL(new AfS1S0300200_7(function0, c118300cf, j, this, jCurrentTimeMillis, 0), new AfS3S0200200_7(function1, j, jCurrentTimeMillis, c118300cf, 0));
    }
}
