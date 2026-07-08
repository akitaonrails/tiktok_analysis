package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IGR;
import X.C0IJR;
import X.C0IP3;
import X.C0IUA;
import X.C0J1N;
import X.C0JDJ;
import X.C0TD6;
import X.C0TD7;
import X.C0TD9;
import X.C0TDA;
import X.C0TDB;
import X.C0TDX;
import X.C0TDY;
import X.C0TE2;
import X.C0TEO;
import X.C0TEY;
import X.C0TEZ;
import X.C0TFE;
import X.C1148310fzJ;
import X.C11NZ;
import X.C11PQ;
import X.C11RB;
import X.C11RD;
import X.C11S5;
import X.C1273340jEy;
import X.C128Y;
import X.C1338270kvh;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19748512Ol;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C465220IMe;
import X.C465520INi;
import X.C480460Ism;
import X.C497740JfY;
import X.C743120TDa;
import X.C743150TDd;
import X.C743510TEn;
import X.C743540TEq;
import X.C748880TZe;
import X.C774610Ua3;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC500290Jjf;
import X.InterfaceC19483011Ki;
import X.InterfaceC743470TEj;
import X.InterfaceC769940UIe;
import Y.ARunnableS120S0100000_20;
import Y.AcS495S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceBeautyDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceRetryFromClick;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceSourceFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualCameraCaptureSizeMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDeviceConnectQualityModel;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDevicePublicScreenConfigMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateRequestMessage;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.CastLinkerWrapper;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.ICastSource$CastParams;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameDualDeviceOptimizeLibra;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePadModeSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceSourceFragmentV2 extends BaseFragment implements C0JDJ, C0IP3, C0IGR, InterfaceC743470TEj {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAfJjohKyAKOy40JSAiPRlh";
    public boolean LL;
    public DataChannel LLILLJJLI;
    public C0TE2 LLILZIL;
    public boolean LLILZLL;
    public LiveDialogFragment LLJI;
    public Integer LLJILJILJ;
    public Float LLJILLL;
    public C0TEY LLJJ;
    public C1273340jEy LLJJI;
    public boolean LLJJIJI;
    public C0TDX LLJJIJIIJIL;
    public DualDevicePublicScreenConfigMsg LLJJIJIL;
    public String LLJJJ;
    public LiveDialog LLJJJIL;
    public int LLILLL = -1;
    public String LLILZ = "";
    public int LLIZ = 640;
    public int LLIZLLLIL = 480;
    public final C11PQ<C0TDA> LLJ = C11PQ.LJLLLLLL(C0TDB.LIZ);
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(124));
    public final AwS591S0100000_12 LLJJJJ = new AwS591S0100000_12(this, 527);
    public final AfS181S0100000_12 LLJJJJJIL = new AfS181S0100000_12(this, 89);
    public final AfS181S0100000_12 LLJJJJLIIL = new AfS181S0100000_12(this, 91);

    @Override // X.InterfaceC743470TEj
    public final boolean Yk() {
        return false;
    }

    @Override // X.InterfaceC743470TEj
    public final InterfaceC769940UIe getLiveStream() {
        return null;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void OR() {
        Long lLJIILIIL;
        if (this.LLILZ.length() == 0 || (lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILZ)) == null || lLJIILIIL.longValue() == 0) {
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || dataChannel.gg0(RoomChannel.class) == null) {
            C20441214yg.LIZIZ("GameDualDeviceSourceV2", "fetch room");
            HashMap<String, String> mapLJI = C2097608Jq.LJI(new Pair("is_anchor", "true"), new Pair("room_id", this.LLILZ), new Pair("pack_level", "4"));
            C480460Ism.LIZ().getClass();
            ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).fetchRoom(mapLJI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 88), new C09JN() { // from class: X.0TAQ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameDualDeviceSourceFragmentV2@a930.fetchRoom$2");
                    C20441214yg.LJI("GameDualDeviceSourceV2", (Throwable) obj);
                    C1C7U.LIZIZ("GameDualDeviceSourceFragmentV2@a930.fetchRoom$2");
                }
            });
        }
    }

    public final void SR() {
        C0TDX c0tdx;
        if (!GameDualDevicePadModeSetting.INSTANCE.isEnabled()) {
            if (this.LLJJIJIIJIL != null) {
                return;
            }
            C128Y c128yLJJJJZI = getChildFragmentManager().LJJJJZI("GameDualDeviceInteractionFragment");
            if (c128yLJJJJZI instanceof GameDualDeviceInteractionFragment) {
                this.LLJJIJIIJIL = (C0TDX) c128yLJJJJZI;
                return;
            }
            GameDualDeviceInteractionFragment gameDualDeviceInteractionFragment = new GameDualDeviceInteractionFragment();
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.ik6, gameDualDeviceInteractionFragment, "GameDualDeviceInteractionFragment");
            c19ehLJIIJ.LJIIJ();
            this.LLJJIJIIJIL = gameDualDeviceInteractionFragment;
            return;
        }
        try {
            C128Y c128yLJJJJZI2 = getChildFragmentManager().LJJJJZI("GameDualDeviceInteractionFragmentV2");
            if (c128yLJJJJZI2 instanceof GameDualDeviceInteractionFragmentV2) {
                C0TDX c0tdx2 = (C0TDX) c128yLJJJJZI2;
                this.LLJJIJIIJIL = c0tdx2;
                if (c0tdx2 != null) {
                    c0tdx2.W5(C743510TEn.LIZ(getContext()));
                }
                DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg = this.LLJJIJIL;
                if (dualDevicePublicScreenConfigMsg == null || (c0tdx = this.LLJJIJIIJIL) == null) {
                    return;
                }
                c0tdx.wP(dualDevicePublicScreenConfigMsg);
                return;
            }
            GameDualDeviceInteractionFragmentV2 gameDualDeviceInteractionFragmentV2 = new GameDualDeviceInteractionFragmentV2();
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.ik6, gameDualDeviceInteractionFragmentV2, "GameDualDeviceInteractionFragmentV2");
            c19ehLJIIJ2.LJIIJ();
            this.LLJJIJIIJIL = gameDualDeviceInteractionFragmentV2;
            DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg2 = this.LLJJIJIL;
            if (dualDevicePublicScreenConfigMsg2 != null) {
                gameDualDeviceInteractionFragmentV2.wP(dualDevicePublicScreenConfigMsg2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showInteractionFragmentV2_error ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws Throwable {
        C20441214yg.LIZIZ("GameDualDeviceSourceV2", "fragment destroy");
        C0TE2 c0te2 = this.LLILZIL;
        if (c0te2 != null) {
            c0te2.LJII();
        }
        this.LLILZIL = null;
        C0TEY c0tey = this.LLJJ;
        if (c0tey != null) {
            c0tey.LIZ(10022007, 0, this.LLILZ, String.valueOf(PR()), false);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C1273340jEy c1273340jEy = this.LLJJI;
        if (c1273340jEy != null) {
            BPEAHandler bPEAHandler = c1273340jEy.LLIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS120S0100000_20(c1273340jEy, 0));
            }
            c1273340jEy.LLIZLLLIL = null;
        }
        super.onDestroyView();
    }

    public final void NR() {
        String string;
        String string2;
        int i;
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("source_port") : -1;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string = arguments2.getString("source_ip")) == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        int i3 = arguments3 != null ? arguments3.getInt("ver") : -1;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (i = arguments4.getInt("fps")) > 0) {
            this.LLJILJILJ = Integer.valueOf(i);
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            float f = arguments5.getFloat("bit_rate_scale");
            if (f > 0.0f) {
                this.LLJILLL = Float.valueOf(f);
            }
        }
        if (isAdded()) {
            VR(C0TDB.LIZ);
            C743540TEq.LJIILL(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("port = ");
        sbLIZ.append(i2);
        sbLIZ.append(",ip = ");
        sbLIZ.append(string);
        sbLIZ.append(",videoWidth =");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(",videoHeight =");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(",version =");
        sbLIZ.append(i3);
        sbLIZ.append(",fps =");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(",bitRateScale =");
        sbLIZ.append(this.LLJILLL);
        C20441214yg.LJIIIZ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
        C0TE2 c0te2 = this.LLILZIL;
        if (c0te2 != null) {
            c0te2.LIZLLL(i2, string, this.LLIZ, this.LLIZLLLIL, i3, this.LLJILJILJ, this.LLJILLL, 0);
        }
        Integer num = this.LLJILJILJ;
        if (num != null && (string2 = num.toString()) != null) {
            str = string2;
        }
        C0TFE.LJIILL(new Pair("in_cap_fps", str));
    }

    public final long PR() {
        if (UserService.getInstance().user() != null) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        return 0L;
    }

    public final void WR() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStateWhenReconnect() liveState = ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LJIIIZ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLILLL;
        if (i == 0) {
            VR(C0TD7.LIZ);
        } else if (i == 2) {
            VR(new C0TD9(0));
        } else if (i == 3) {
            VR(C0TD6.LIZ);
        }
        C0TE2 c0te2 = this.LLILZIL;
        if (c0te2 != null) {
            C0TFE c0tfe = C0TFE.LIZ;
            DualLiveStateRequestMessage dualLiveStateRequestMessage = new DualLiveStateRequestMessage(System.currentTimeMillis());
            c0tfe.getClass();
            String strLIZ = C0TFE.LIZ(dualLiveStateRequestMessage);
            if (strLIZ != null) {
                C20441214yg.LIZIZ("GameDualDeviceSourceLink2", "send request live state msg");
                C0TEO c0teo = c0te2.LJ;
                if (c0teo != null) {
                    c0teo.LIZ(10035, strLIZ);
                }
            }
        }
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        RR(getContext());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJ != null) {
            IPerformanceManager iPerformanceManager = C465520INi.LIZ;
            iPerformanceManager.yL0();
            iPerformanceManager.release();
        }
        ((IEffectService) this.LLJJIII.getValue()).onLiveDestroy();
        C774610Ua3.LL.LLLZZ(false, false);
        DataChannelGlobal.LLILZ.IQ2(C1148310fzJ.class);
        C0IUA.LIZLLL();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.LLILZ = null;
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            C0TFE.LJIILL(new Pair("is_foreground", "false"));
            C0TE2 c0te2 = this.LLILZIL;
            if (c0te2 != null) {
                c0te2.LJIIIIZZ(true);
            }
            this.LLILZLL = true;
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameDualDeviceSourceV2", "NoClassDefFoundError the df_live_plugin is not ready", e);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Boolean bool;
        super.onResume();
        SR();
        try {
            C0TFE.LJIILL(new Pair("is_foreground", "true"));
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(LiveDualDevicePowerCameraChannel.class)) != null) {
                boolean zBooleanValue = bool.booleanValue();
                C0TE2 c0te2 = this.LLILZIL;
                if (c0te2 != null) {
                    c0te2.LJIIIIZZ(zBooleanValue);
                }
            }
            C0TE2 c0te22 = this.LLILZIL;
            if (c0te22 != null) {
                c0te22.LIZ(false);
            }
            this.LLILZLL = false;
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameDualDeviceSourceV2", "NoClassDefFoundError the df_live_plugin is not ready", e);
        }
    }

    static {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC743470TEj
    public final C1273340jEy X7() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC743470TEj
    public final C11PQ<C0TDA> getCurrentState() {
        return this.LLJ;
    }

    @Override // X.InterfaceC743470TEj
    public final int getVideoHeight() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC743470TEj
    public final int getVideoWidth() {
        return this.LLIZ;
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLILLJJLI;
    }

    public final void RR(Context context) {
        if (context == null) {
            return;
        }
        LiveDialog liveDialog = this.LLJJJIL;
        if (liveDialog != null && liveDialog.isShowing()) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZIZ = this;
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131843010);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843007));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843009), new AcS495S0100000_12(this, 13));
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843008), new AcS495S0100000_12(this, 14));
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LLJJJIL = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public final void VR(C0TDA c0tda) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStateLayout, state: ");
        sbLIZ.append(c0tda);
        C20441214yg.LIZIZ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ.onNext(c0tda);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int i;
        int i2;
        String string2;
        String string3;
        super.onCreate(bundle);
        this.LLILLJJLI = C0IJR.LIZ(new ViewModelProvider(this), this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("room_id")) == null) {
            string = "";
        }
        this.LLILZ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("video_w");
        } else {
            i = 640;
        }
        this.LLIZ = i;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i2 = arguments3.getInt("video_h");
        } else {
            i2 = 480;
        }
        this.LLIZLLLIL = i2;
        Bundle arguments4 = getArguments();
        Map<String, ? extends Object> map = null;
        if (arguments4 != null) {
            string2 = arguments4.getString("anchor_id");
        } else {
            string2 = null;
        }
        this.LLJJJ = string2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("settings")) != null) {
            try {
                Object objLJII = C19748512Ol.LIZIZ.LJII(string3, Map.class);
                if (objLJII instanceof Map) {
                    map = (Map) objLJII;
                }
                this.LLJJIJI = BroadcastGameDualDeviceOptimizeLibra.INSTANCE.isExperimentGroup(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJ("GameDualDeviceSourceV2", String.valueOf(th.getMessage()));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJ = new C0TEY();
        C0TEZ.LIZ(getActivity(), String.valueOf(PR()), this.LLILZ);
        this.LLJJI = new C1273340jEy();
        if (TextUtils.equals(this.LLJJJ, String.valueOf(PR()))) {
            try {
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.zW(LiveDualDevicePowerCameraChannel.class, Boolean.FALSE);
                }
                C0TE2 c0te2 = new C0TE2(C11RB.LIZIZ(this).LIZIZ, this.LLILZ, PR(), C0TDY.CAST_DUAL_DEVICE);
                ((C0J1N) c0te2.LJIIIIZZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(this.LLJJJJLIIL, new C09JN() { // from class: X.0TAN
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceSourceFragmentV2@a930.initByteCastSDk$1$1");
                        C20441214yg.LJI("GameDualDeviceSourceV2", (Throwable) obj);
                        C1C7U.LIZIZ("GameDualDeviceSourceFragmentV2@a930.initByteCastSDk$1$1");
                    }
                });
                ((C0J1N) c0te2.LJIIIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(this.LLJJJJJIL, new C09JN() { // from class: X.0TAO
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceSourceFragmentV2@a930.initByteCastSDk$1$2");
                        C20441214yg.LJI("GameDualDeviceSourceV2", (Throwable) obj);
                        C1C7U.LIZIZ("GameDualDeviceSourceFragmentV2@a930.initByteCastSDk$1$2");
                    }
                });
                this.LLILZIL = c0te2;
                new C743150TDd(this);
                c0te2.LIZJ(this.LLJJJJ);
                c0te2.LJIIIZ(new IMessageListener() { // from class: X.0TDZ
                    public long LIZ;

                    public final String onMessageSync(String str) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("test onMessageSync from source:");
                        sbLIZ.append(str);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    public final void onMessage(ServiceInfo serviceInfo, String str) {
                        C0TFE.LIZ.getClass();
                        C0TER c0terLJII = C0TFE.LJII(str);
                        if (c0terLJII instanceof DualLiveStateMessage) {
                            Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LIZIZ.LLILZ);
                            if (lLJIILIIL == null || lLJIILIIL.longValue() == 0) {
                                DualLiveStateMessage dualLiveStateMessage = (DualLiveStateMessage) c0terLJII;
                                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(dualLiveStateMessage.roomId);
                                if (lLJIILIIL2 != null && lLJIILIIL2.longValue() > 0) {
                                    GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV2 = this.LIZIZ;
                                    gameDualDeviceSourceFragmentV2.LLILZ = dualLiveStateMessage.roomId;
                                    gameDualDeviceSourceFragmentV2.OR();
                                }
                            }
                            DualLiveStateMessage dualLiveStateMessage2 = (DualLiveStateMessage) c0terLJII;
                            if (dualLiveStateMessage2.resumeTimestampMillSec > this.LIZ) {
                                GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV22 = this.LIZIZ;
                                if (gameDualDeviceSourceFragmentV22.getContext() != null) {
                                    int i = dualLiveStateMessage2.liveState;
                                    if (i != 0) {
                                        if (i != 2) {
                                            if (i == 3) {
                                                C20441214yg.LIZIZ("GameDualDeviceSourceV2", "rec resume msg");
                                                gameDualDeviceSourceFragmentV22.VR(C0TD6.LIZ);
                                                gameDualDeviceSourceFragmentV22.LLILLL = 3;
                                            }
                                        } else {
                                            C20441214yg.LIZIZ("GameDualDeviceSourceV2", "rec pause msg");
                                            gameDualDeviceSourceFragmentV22.VR(new C0TD9(dualLiveStateMessage2.durationSec));
                                            gameDualDeviceSourceFragmentV22.LLILLL = 2;
                                        }
                                    } else {
                                        C20441214yg.LIZIZ("GameDualDeviceSourceV2", "rec connected msg");
                                        gameDualDeviceSourceFragmentV22.LL = true;
                                        gameDualDeviceSourceFragmentV22.VR(C0TD7.LIZ);
                                        gameDualDeviceSourceFragmentV22.LLILLL = 0;
                                    }
                                }
                                this.LIZ = dualLiveStateMessage2.resumeTimestampMillSec;
                            }
                        } else if (c0terLJII instanceof DualCameraCaptureSizeMessage) {
                            this.LIZIZ.getClass();
                            C0TE2 c0te22 = this.LIZIZ.LLILZIL;
                            if (c0te22 != null) {
                                DualCameraCaptureSizeMessage dualCameraCaptureSizeMessage = (DualCameraCaptureSizeMessage) c0terLJII;
                                ICastSource$CastParams iCastSource$CastParams = c0te22.LJIIJJI;
                                if (iCastSource$CastParams != null) {
                                    iCastSource$CastParams.setVideoWidth(dualCameraCaptureSizeMessage.width);
                                    iCastSource$CastParams.setVideoHeight(dualCameraCaptureSizeMessage.height);
                                    CastLinkerWrapper castLinkerWrapper = c0te22.LJI;
                                    if (castLinkerWrapper != null) {
                                        castLinkerWrapper.LJII(iCastSource$CastParams);
                                    }
                                    C0TE2.LJIIJ(c0te22, 3, false, false, 6);
                                }
                            }
                        } else if (c0terLJII instanceof DualDevicePublicScreenConfigMsg) {
                            GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV23 = this.LIZIZ;
                            DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg = (DualDevicePublicScreenConfigMsg) c0terLJII;
                            gameDualDeviceSourceFragmentV23.LLJJIJIL = dualDevicePublicScreenConfigMsg;
                            C0TDX c0tdx = gameDualDeviceSourceFragmentV23.LLJJIJIIJIL;
                            if (c0tdx != null) {
                                c0tdx.wP(dualDevicePublicScreenConfigMsg);
                            }
                        }
                        if (this.LIZIZ.LLJJ != null && str != null) {
                            try {
                                DualDeviceConnectQualityModel dualDeviceConnectQualityModel = (DualDeviceConnectQualityModel) C19748512Ol.LIZIZ.LJII(str, DualDeviceConnectQualityModel.class);
                                if (dualDeviceConnectQualityModel != null && Intrinsics.LJFF(dualDeviceConnectQualityModel.cmd, "sinkLatencyStat")) {
                                    C0TFE.LJIILL(new Pair("network_delay_ms", String.valueOf(dualDeviceConnectQualityModel.networkLatency)));
                                    float f = dualDeviceConnectQualityModel.streamFps;
                                    if (f > 60.0f) {
                                        f = 60.0f;
                                    }
                                    C0TFE.LJIILL(new Pair("push_fps", String.valueOf(f)));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJI("DualDeviceSourceReport", e);
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dualDeviceMessage = ");
                        sbLIZ.append(c0terLJII);
                        C20441214yg.LJIIIZ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
                c0te2.LJFF = this.LLJJI;
                NR();
                C20441214yg.LJIIIZ("GameDualDeviceSourceV2", "initByteCastSDk() sourceLink = " + this.LLILZIL);
            } catch (NoClassDefFoundError e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GameDualDeviceSourceV2", "NoClassDefFoundError the df_live_plugin is not ready", e);
            }
        } else {
            UR(this, "invalid_anchor_id", "invalid_anchor_id", C497740JfY.LJIJI(2131853800), C497740JfY.LJIJI(2131853801), false, 40);
            C743540TEq.LJI(1001, 3, this.LLILZ, "qr_scan", "qr_scan_6", this.LLILZLL);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LiveDualDevicePowerCameraChannel.class, new AwS591S0100000_12(this, 26));
            dataChannel2.EQ2(this, LiveDualDevicePowerEvent.class, new AwS591S0100000_12(this, 11));
            dataChannel2.CQ2(LiveDualDeviceRetryFromClick.class, this, new AwS591S0100000_12(this, 13));
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, LiveDualDeviceBeautyDialogEvent.class, new AwS591S0100000_12(this, 14));
        }
        ((C0J1N) this.LLJ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TDC
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C743120TDa;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 7), new C09JN() { // from class: X.0TAM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceFragmentV2@a930.observeDataChannel$5$3");
                C20441214yg.LJI("GameDualDeviceSourceV2", (Throwable) obj);
                C1C7U.LIZIZ("GameDualDeviceSourceFragmentV2@a930.observeDataChannel$5$3");
            }
        });
        DataChannel dataChannel4 = this.LLILLJJLI;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, RoomChannel.class, new AwS591S0100000_12(this, 528));
        }
        OR();
        EnumC500290Jjf.GAME.config();
        DataChannel dataChannel5 = this.LLILLJJLI;
        if (dataChannel5 != null) {
            dataChannel5.SX0(C748880TZe.class, getChildFragmentManager());
        }
        SR();
        DataChannel dataChannel6 = this.LLILLJJLI;
        if (dataChannel6 != null) {
            ((IEffectService) this.LLJJIII.getValue()).onEnterBroadcastPreview();
            C774610Ua3 c774610Ua3 = C774610Ua3.LL;
            c774610Ua3.LLLZIIL(this, dataChannel6);
            c774610Ua3.LLLZZIL(true);
            c774610Ua3.LLLZL(this, dataChannel6);
        }
        C743540TEq.LJIILJJIL(false);
        C11NZ.LJJJJZ(1).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS181S0100000_12(this, 90), new C09JN() { // from class: X.0TAP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceSourceFragmentV2@a930.onViewCreated$dispose$2");
                C20441214yg.LJ("GameDualDeviceSourceV2", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceSourceFragmentV2@a930.onViewCreated$dispose$2");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghh, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static void UR(GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV2, String str, String str2, String str3, String str4, boolean z, int i) {
        boolean z2;
        DataChannel dataChannel;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        gameDualDeviceSourceFragmentV2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show wrong page, error_code: ");
        sbLIZ.append(str);
        sbLIZ.append(", detailErrorCode: ");
        sbLIZ.append(str2);
        C20441214yg.LJ("GameDualDeviceSourceV2", C2188811AlT.LIZIZ(sbLIZ));
        C743540TEq.LJ(str, str2);
        gameDualDeviceSourceFragmentV2.VR(new C743120TDa(str3, str4, z2, z));
        if (!z2 && (dataChannel = gameDualDeviceSourceFragmentV2.LLILLJJLI) != null) {
            dataChannel.LC0(LiveDualDeviceRetryFromClick.class, Boolean.FALSE);
        }
    }
}
