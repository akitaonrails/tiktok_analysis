package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IGR;
import X.C0IJR;
import X.C0IJT;
import X.C0IP3;
import X.C0IUA;
import X.C0J1N;
import X.C0JDJ;
import X.C0TC0;
import X.C0TC2;
import X.C0TCX;
import X.C0TDA;
import X.C0TDB;
import X.C0TDX;
import X.C0TEY;
import X.C0TEZ;
import X.C0TFE;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C11S5;
import X.C1273340jEy;
import X.C1274030jG5;
import X.C1275030jHh;
import X.C128Y;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
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
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C742860TCa;
import X.C743050TCt;
import X.C743120TDa;
import X.C743510TEn;
import X.C743540TEq;
import X.C748880TZe;
import X.C774610Ua3;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC500290Jjf;
import X.InterfaceC1273910jFt;
import X.InterfaceC19483011Ki;
import X.InterfaceC420801kM;
import X.InterfaceC743470TEj;
import X.InterfaceC754220TiG;
import X.InterfaceC769940UIe;
import X.InterfaceC775310UbB;
import Y.AcS495S0100000_12;
import Y.AfS181S0100000_12;
import Y.AkS475S0100000_12;
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
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceBeautyDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceRetryFromClick;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceSourceConnectType;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api.GameDualDeviceApi;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;
import com.bytedance.android.livesdk.game.broadcast.fragment.DualDeviceRtcSourceFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDevicePublicScreenConfigMsg;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePadModeSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.controller.GenRTCInfoReq;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceRtcSourceFragment extends BaseFragment implements C0JDJ, C0IP3, C0IGR, InterfaceC743470TEj, InterfaceC754220TiG {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSHELIOSwyOzFiLz0yLygpJzt9DDAtJQs2PiwvLB0nKxYjPD0wLQM+KCg+LSs4";
    public DataChannel LL;
    public C0TEY LLILLJJLI;
    public boolean LLILLL;
    public Long LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Integer LLJ;
    public String LLJI;
    public LiveDialogFragment LLJIJIL;
    public boolean LLJILJIL;
    public C0TDX LLJILLL;
    public DualDevicePublicScreenConfigMsg LLJJ;
    public C0TCX LLJJIII;
    public InterfaceC420801kM LLJJIJIL;
    public LiveDialog LLJJJ;
    public InterfaceC769940UIe LLJJJJJIL;
    public int LLILZ = 640;
    public int LLILZIL = 480;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(110));
    public final C11PQ<C0TDA> LLJJI = C11PQ.LJLLLLLL(C0TDB.LIZ);
    public boolean LLJJIJI = true;
    public final C11PQ<Boolean> LLJJIJIIJIL = C11PQ.LJLLLLLL(Boolean.FALSE);
    public final C743050TCt LLJJJIL = new C0TC2() { // from class: X.0TCt
        public long LIZ;
        public boolean LIZIZ = true;

        @Override // X.C0TC2
        public final void LJ() {
        }

        @Override // X.C0TC2
        public final void LIZ() {
            Boolean bool;
            if (this.LIZIZ) {
                C743540TEq.LJIILIIL(this.LIZJ.OR(), "shoot", null, null, true, this.LIZJ.LLJI, 12);
                this.LIZIZ = false;
            }
            this.LIZJ.VR(C0TD7.LIZ);
            DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment = this.LIZJ;
            dualDeviceRtcSourceFragment.LLILLL = true;
            DataChannel dataChannel = dualDeviceRtcSourceFragment.LL;
            if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(LiveDualDevicePowerCameraChannel.class)) == null) {
                return;
            }
            DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment2 = this.LIZJ;
            boolean zBooleanValue = bool.booleanValue();
            if (dualDeviceRtcSourceFragment2.LLJILJIL) {
                C0TDX c0tdx = dualDeviceRtcSourceFragment2.LLJILLL;
                if (c0tdx != null) {
                    c0tdx.yp(true);
                    return;
                }
                return;
            }
            C0TDX c0tdx2 = dualDeviceRtcSourceFragment2.LLJILLL;
            if (c0tdx2 != null) {
                c0tdx2.yp(zBooleanValue);
            }
        }

        @Override // X.C0TC2
        public final void LIZIZ(boolean z) {
            if (this.LIZJ.LLJJIJI && z) {
                C743540TEq.LJIILL(true);
                this.LIZJ.LLJJIJI = false;
            }
            this.LIZJ.LLJJIJIIJIL.onNext(Boolean.valueOf(z));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWsStateChanged isConnect = ");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.C0TC2
        public final boolean LIZJ(C0TCZ c0tcz) {
            String str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDisconnected error msg = ");
            sbLIZ.append(c0tcz.getDescription());
            sbLIZ.append(",error = ");
            sbLIZ.append(c0tcz);
            C20441214yg.LJ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment() && c0tcz.isSinkDisconnectManually()) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843024));
                C19EG activity = this.LIZJ.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return true;
            }
            boolean zIsSourceTryAgain = c0tcz.isSourceTryAgain();
            boolean zIsWsConnected = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).isWsConnected();
            DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment = this.LIZJ;
            String string = c0tcz.toString();
            if (zIsWsConnected) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            DualDeviceRtcSourceFragment.UR(dualDeviceRtcSourceFragment, string, str, null, zIsSourceTryAgain, null, 48);
            return true;
        }

        @Override // X.C0TC2
        public final void LIZLLL(DualSinkStateMessage dualSinkStateMessage) {
            Long lLJIILIIL;
            Long lLJIILIIL2;
            boolean z;
            long jLongValue;
            Long lLJIILIIL3;
            if (!TextUtils.isEmpty(dualSinkStateMessage.roomId) && !TextUtils.equals(dualSinkStateMessage.roomId, this.LIZJ.OR())) {
                DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment = this.LIZJ;
                String str = dualSinkStateMessage.roomId;
                if (str != null) {
                    lLJIILIIL3 = C2095008Iq.LJIILIIL(str);
                } else {
                    lLJIILIIL3 = null;
                }
                dualDeviceRtcSourceFragment.LLILZLL = lLJIILIIL3;
                this.LIZJ.NR();
            }
            C0TCX c0tcx = this.LIZJ.LLJJIII;
            long jLongValue2 = 0;
            if (c0tcx != null) {
                String str2 = dualSinkStateMessage.rtcRoomId;
                String str3 = dualSinkStateMessage.roomId;
                String str4 = C0TCX.LJIILJJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try updateRtcRoomId rtcRoomId = ");
                sbLIZ.append(str2);
                sbLIZ.append(",roomId = ");
                sbLIZ.append(str3);
                C20441214yg.LJ(str4, C2188811AlT.LIZIZ(sbLIZ));
                if (str2 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                } else {
                    lLJIILIIL = null;
                }
                if (str3 != null) {
                    lLJIILIIL2 = C2095008Iq.LJIILIIL(str3);
                } else {
                    lLJIILIIL2 = null;
                }
                if (lLJIILIIL != null && lLJIILIIL2 != null) {
                    Long l = c0tcx.LJ;
                    Long l2 = c0tcx.LJFF;
                    c0tcx.LJ = lLJIILIIL;
                    c0tcx.LJFF = lLJIILIIL2;
                    if (Intrinsics.LJFF(l, lLJIILIIL) && Intrinsics.LJFF(l2, c0tcx.LJFF)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (c0tcx.LJIIIIZZ.LJLZ() == null || z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateRtcRoomId rtcRoomId = ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(",roomId = ");
                        sbLIZ2.append(str3);
                        C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                        Long l3 = c0tcx.LJ;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            AwS126S1100000_12 awS126S1100000_12 = new AwS126S1100000_12(c0tcx, str2, 11);
                            GenRTCInfoReq genRTCInfoReq = new GenRTCInfoReq();
                            genRTCInfoReq.netMode = 1L;
                            genRTCInfoReq.rtcRoomId = jLongValue3;
                            LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, "", "", 0, "");
                            linkCommon.live_id = 12L;
                            linkCommon.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
                            genRTCInfoReq.common = linkCommon;
                            Player player = new Player(0L, 0L);
                            player.uid = UserService.getInstance().user().getCurrentUserId();
                            Long l4 = c0tcx.LJFF;
                            if (l4 != null) {
                                jLongValue = l4.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            player.roomId = jLongValue;
                            genRTCInfoReq.myself = player;
                            C480460Ism.LIZ().getClass();
                            ((C0J1N) ((GameDualDeviceApi) C480460Ism.LIZLLL(GameDualDeviceApi.class)).genRtcInfo(genRTCInfoReq).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(c0tcx.LIZ))).LIZ(new AfS181S0100000_12(awS126S1100000_12, 261), new C09JN() { // from class: X.0T6w
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("GameDualDeviceSourceStrategy@5ec.getRtcInfo$4");
                                    C20441214yg.LJ(C0TCX.LJIILJJIL, Log.getStackTraceString((Throwable) obj));
                                    C1C7U.LIZIZ("GameDualDeviceSourceStrategy@5ec.getRtcInfo$4");
                                }
                            });
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("source updateRtcRoomId rtcRoomId = ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(", roomId=");
                        sbLIZ3.append(str3);
                        C742860TCa.LIZIZ(c0tcx.LJFF, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }
            if (dualSinkStateMessage.resumeTimestampMillsec > this.LIZ) {
                DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment2 = this.LIZJ;
                if (dualDeviceRtcSourceFragment2.getContext() != null) {
                    int i = dualSinkStateMessage.liveState;
                    if (i != 0) {
                        if (i != 2) {
                            if (i == 3) {
                                if (dualDeviceRtcSourceFragment2.LLJJJJ) {
                                    C743540TEq.LJIILLIIL(dualDeviceRtcSourceFragment2.OR(), true);
                                    dualDeviceRtcSourceFragment2.LLJJJJ = false;
                                }
                                C20441214yg.LIZIZ("DualDeviceRtcSourceFragment", "rec resume msg");
                                C0TCX c0tcx2 = dualDeviceRtcSourceFragment2.LLJJIII;
                                if (c0tcx2 != null && c0tcx2.LJI == null) {
                                    ((C0J1N) c0tcx2.LJIIJ.LJJIL(new InterfaceC19483011Ki() { // from class: X.01yC
                                        @Override // X.InterfaceC19483011Ki
                                        public final boolean test(Object obj) {
                                            return Intrinsics.LJFF(obj, Boolean.TRUE);
                                        }
                                    }).LJJJ(new AkS475S0100000_12(c0tcx2, 13), false).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(c0tcx2.LIZ))).LIZ(new AfS181S0100000_12(c0tcx2, 268), new C09JN() { // from class: X.0T6x
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("GameDualDeviceSourceStrategy@5ec.startRtc$4");
                                            C20441214yg.LJ(C0TCX.LJIILJJIL, Log.getStackTraceString((Throwable) obj));
                                            C1C7U.LIZIZ("GameDualDeviceSourceStrategy@5ec.startRtc$4");
                                        }
                                    });
                                    String str5 = C0TCX.LJIILJJIL;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("startRtc() isLiveCore =");
                                    sbLIZ4.append(c0tcx2.LJIIJ.LJLZ());
                                    C20441214yg.LJIIIZ(str5, C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                dualDeviceRtcSourceFragment2.VR(C0TD6.LIZ);
                            }
                        } else {
                            C20441214yg.LIZIZ("DualDeviceRtcSourceFragment", "rec pause msg");
                            Long l5 = dualSinkStateMessage.pauseSec;
                            if (l5 != null) {
                                jLongValue2 = l5.longValue();
                            }
                            dualDeviceRtcSourceFragment2.VR(new C0TD9(jLongValue2));
                        }
                    } else {
                        C20441214yg.LIZIZ("DualDeviceRtcSourceFragment", "rec connected msg");
                        dualDeviceRtcSourceFragment2.VR(C0TD7.LIZ);
                    }
                }
                this.LIZ = dualSinkStateMessage.resumeTimestampMillsec;
                Integer num = dualSinkStateMessage.autoTranslationEnable;
                if (num != null) {
                    DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment3 = this.LIZJ;
                    int iIntValue = num.intValue();
                    DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg = new DualDevicePublicScreenConfigMsg(-1);
                    dualDevicePublicScreenConfigMsg.autoTranslationEnable = iIntValue;
                    dualDeviceRtcSourceFragment3.LLJJ = dualDevicePublicScreenConfigMsg;
                    C0TDX c0tdx = dualDeviceRtcSourceFragment3.LLJILLL;
                    if (c0tdx != null) {
                        c0tdx.wP(dualDevicePublicScreenConfigMsg);
                    }
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onLiveState message = ");
            sbLIZ5.append(dualSinkStateMessage);
            C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ5));
        }
    };
    public boolean LLJJJJ = true;

    @Override // X.InterfaceC743470TEj
    public final C1273340jEy X7() {
        return null;
    }

    @Override // X.InterfaceC743470TEj
    public final boolean Yk() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void NR() {
        Long l = this.LLILZLL;
        if (l != null) {
            l.longValue();
            Long l2 = this.LLILZLL;
            if (l2 == null || l2.longValue() > 0) {
                C20441214yg.LIZIZ("DualDeviceRtcSourceFragment", "fetch room");
                HashMap<String, String> mapLJI = C2097608Jq.LJI(new Pair("is_anchor", "true"), new Pair("room_id", OR()), new Pair("pack_level", "4"));
                C480460Ism.LIZ().getClass();
                ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).fetchRoom(mapLJI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 76), new C09JN() { // from class: X.0TAE
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DualDeviceRtcSourceFragment@1cf1.fetchRoom$dispose$2");
                        C20441214yg.LJI("DualDeviceRtcSourceFragment", (Throwable) obj);
                        C1C7U.LIZIZ("DualDeviceRtcSourceFragment@1cf1.fetchRoom$dispose$2");
                    }
                });
            }
        }
    }

    public final String OR() {
        String string;
        Long l = this.LLILZLL;
        return (l == null || (string = l.toString()) == null) ? "" : string;
    }

    public final void SR() {
        C0TDX c0tdx;
        if (!GameDualDevicePadModeSetting.INSTANCE.isEnabled()) {
            if (this.LLJILLL != null) {
                return;
            }
            C128Y c128yLJJJJZI = getChildFragmentManager().LJJJJZI("GameDualDeviceInteractionFragment");
            if (c128yLJJJJZI instanceof GameDualDeviceInteractionFragment) {
                this.LLJILLL = (C0TDX) c128yLJJJJZI;
                return;
            }
            GameDualDeviceInteractionFragment gameDualDeviceInteractionFragment = new GameDualDeviceInteractionFragment();
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.ik6, gameDualDeviceInteractionFragment, "GameDualDeviceInteractionFragment");
            c19ehLJIIJ.LJIIJ();
            this.LLJILLL = gameDualDeviceInteractionFragment;
            return;
        }
        try {
            C128Y c128yLJJJJZI2 = getChildFragmentManager().LJJJJZI("GameDualDeviceInteractionFragmentV2");
            if (c128yLJJJJZI2 instanceof GameDualDeviceInteractionFragmentV2) {
                C0TDX c0tdx2 = (C0TDX) c128yLJJJJZI2;
                this.LLJILLL = c0tdx2;
                if (c0tdx2 != null) {
                    c0tdx2.W5(C743510TEn.LIZ(getContext()));
                }
                DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg = this.LLJJ;
                if (dualDevicePublicScreenConfigMsg == null || (c0tdx = this.LLJILLL) == null) {
                    return;
                }
                c0tdx.wP(dualDevicePublicScreenConfigMsg);
                return;
            }
            GameDualDeviceInteractionFragmentV2 gameDualDeviceInteractionFragmentV2 = new GameDualDeviceInteractionFragmentV2();
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.ik6, gameDualDeviceInteractionFragmentV2, "GameDualDeviceInteractionFragmentV2");
            c19ehLJIIJ2.LJIIJ();
            this.LLJILLL = gameDualDeviceInteractionFragmentV2;
            DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg2 = this.LLJJ;
            if (dualDevicePublicScreenConfigMsg2 != null) {
                gameDualDeviceInteractionFragmentV2.wP(dualDevicePublicScreenConfigMsg2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showInteractionFragmentV2_error ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0TEY c0tey = this.LLILLJJLI;
        if (c0tey != null) {
            c0tey.LIZ(10022007, 0, OR(), String.valueOf(PR()), false);
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).releaseDualDeviceStream(CertProviderManagerKt.findCert("bpea-dual_device_live_stream_release", 1476788484));
        this.LLJJJJJIL = null;
        super.onDestroyView();
    }

    public final long PR() {
        if (UserService.getInstance().user() != null) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        return 0L;
    }

    @Override // X.InterfaceC754220TiG
    public final InterfaceC1273910jFt getLiveCore() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLiveCore() = ");
        InterfaceC769940UIe interfaceC769940UIe = this.LLJJJJJIL;
        sbLIZ.append(interfaceC769940UIe != null ? interfaceC769940UIe.getLiveCore() : null);
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe2 = this.LLJJJJJIL;
        if (interfaceC769940UIe2 != null) {
            return interfaceC769940UIe2.getLiveCore();
        }
        return null;
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        RR(getContext());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0TCX c0tcx = this.LLJJIII;
        if (c0tcx != null) {
            if (c0tcx.LJIIJJI) {
                DualSourceStateMessage dualSourceStateMessage = new DualSourceStateMessage();
                dualSourceStateMessage.connectState = C0TC0.CONNECT_STATE_LEAVE.getCode();
                c0tcx.LJII.LJIILIIL(dualSourceStateMessage);
            }
            c0tcx.LJII.LJI();
            c0tcx.LIZIZ();
        }
        this.LLJJIII = null;
        if (this.LLILLJJLI != null) {
            IPerformanceManager iPerformanceManager = C465520INi.LIZ;
            iPerformanceManager.yL0();
            iPerformanceManager.release();
        }
        ((IEffectService) this.LLJILJILJ.getValue()).onLiveDestroy();
        C774610Ua3.LL.LLLZZ(false, false);
        DataChannelGlobal.LLILZ.IQ2(C1148310fzJ.class);
        C0IUA.LIZLLL();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.LLILZ = null;
        }
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0TFE.LJIILL(new Pair("is_foreground", "false"));
        C0TCX c0tcx = this.LLJJIII;
        if (c0tcx != null) {
            c0tcx.LIZ(Boolean.TRUE);
        }
        C0TDX c0tdx = this.LLJILLL;
        if (c0tdx != null) {
            c0tdx.yp(false);
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Boolean bool;
        super.onResume();
        SR();
        C0TFE.LJIILL(new Pair("is_foreground", "true"));
        DataChannel dataChannel = this.LL;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(LiveDualDevicePowerCameraChannel.class)) == null) ? false : bool.booleanValue();
        C0TDX c0tdx = this.LLJILLL;
        if (c0tdx != null) {
            c0tdx.yp(!zBooleanValue);
        }
        C0TCX c0tcx = this.LLJJIII;
        if (c0tcx != null) {
            String str = C0TCX.LJIILJJIL;
            c0tcx.LIZ(null);
        }
        this.LLJILJIL = false;
    }

    @Override // X.InterfaceC743470TEj
    public final C11PQ<C0TDA> getCurrentState() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC743470TEj
    public final InterfaceC769940UIe getLiveStream() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC743470TEj
    public final int getVideoHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC743470TEj
    public final int getVideoWidth() {
        return this.LLILZ;
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LL;
    }

    public final void RR(Context context) {
        if (context == null) {
            return;
        }
        LiveDialog liveDialog = this.LLJJJ;
        if (liveDialog != null && liveDialog.isShowing()) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZIZ = this;
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131843010);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843007));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843009), new AcS495S0100000_12(this, 11));
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843008), new AcS495S0100000_12(this, 12));
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LLJJJ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public final void VR(C0TDA c0tda) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStateLayout, state: ");
        sbLIZ.append(c0tda);
        C20441214yg.LIZIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJI.onNext(c0tda);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Long lLJIILIIL;
        String string;
        String string2;
        Integer numValueOf;
        String str;
        DataChannel dataChannel;
        String string3;
        super.onCreate(bundle);
        this.LL = C0IJR.LIZ(new ViewModelProvider(this), this);
        Bundle arguments = getArguments();
        String string4 = null;
        if (arguments != null && (string3 = arguments.getString("room_id")) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(string3);
        } else {
            lLJIILIIL = null;
        }
        this.LLILZLL = lLJIILIIL;
        Bundle arguments2 = getArguments();
        int i = 640;
        if (arguments2 != null) {
            i = arguments2.getInt("video_w", 640);
        }
        this.LLILZ = i;
        Bundle arguments3 = getArguments();
        int i2 = 480;
        if (arguments3 != null) {
            i2 = arguments3.getInt("video_h", 480);
        }
        this.LLILZIL = i2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string = arguments4.getString("anchor_id");
        } else {
            string = null;
        }
        this.LLIZLLLIL = string;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string2 = arguments5.getString("did_sink");
        } else {
            string2 = null;
        }
        this.LLIZ = string2;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            numValueOf = Integer.valueOf(arguments6.getInt("ver"));
        } else {
            numValueOf = null;
        }
        this.LLJ = numValueOf;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            string4 = arguments7.getString("connect_type");
        }
        this.LLJI = string4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("version = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(",anchorId = ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(",didSink = ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(",roomId = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(",videoWidth = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",videoHeight = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(",connectType=");
        sbLIZ.append(this.LLJI);
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment() && (str = this.LLJI) != null && (dataChannel = this.LL) != null) {
            dataChannel.zW(LiveDualDeviceSourceConnectType.class, str);
        }
        DataChannel dataChannel2 = this.LL;
        String str2 = this.LLIZ;
        if (str2 == null) {
            str2 = "";
        }
        this.LLJJIII = new C0TCX(this, dataChannel2, this, str2, this.LLJJJIL, this.LLJI);
    }

    @Override // X.InterfaceC754220TiG
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create InteractConfig liveStream = ");
        sbLIZ.append(this.LLJJJJJIL);
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe = this.LLJJJJJIL;
        if (interfaceC769940UIe != null) {
            return interfaceC769940UIe.i3(c1275030jHh, interfaceC775310UbB);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = new C0TEY();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.SX0(C748880TZe.class, getChildFragmentManager());
        }
        C0TEZ.LIZ(getActivity(), String.valueOf(PR()), OR());
        Integer num = this.LLJ;
        String str = this.LLIZLLLIL;
        String str2 = this.LLIZ;
        if (num != null && num.intValue() <= 4) {
            if (!TextUtils.equals(str, String.valueOf(PR()))) {
                i = -2;
                UR(this, "invalid_anchor_id", "invalid_anchor_id", C497740JfY.LJIJI(2131853800), false, C497740JfY.LJIJI(2131853801), 40);
            } else if (TextUtils.isEmpty(str2)) {
                i = -3;
                UR(this, "invalid_qr", "invalid_qr", C497740JfY.LJIJI(2131855984), false, null, 56);
            } else {
                i = 0;
            }
        } else {
            i = -1;
            UR(this, "version", "version", C497740JfY.LJIJI(2131843023), false, null, 56);
        }
        String strOR = OR();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_rtc_params");
        c474500IjALIZ.LJJII(strOR, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(C743540TEq.LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "ret");
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check qr code ret = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LiveDualDevicePowerEvent.class, new AwS591S0100000_12(this, 15));
            dataChannel2.CQ2(LiveDualDeviceRetryFromClick.class, this, new AwS591S0100000_12(this, 16));
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, LiveDualDevicePowerCameraChannel.class, new AwS591S0100000_12(this, 17));
        }
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, LiveDualDeviceBeautyDialogEvent.class, new AwS591S0100000_12(this, 20));
        }
        ((C0J1N) this.LLJJI.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TDD
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C743120TDa;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 9), new C09JN() { // from class: X.0TAD
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceRtcSourceFragment@1cf1.observeDataChannel$5$3");
                C20441214yg.LJI("DualDeviceRtcSourceFragment", (Throwable) obj);
                C1C7U.LIZIZ("DualDeviceRtcSourceFragment@1cf1.observeDataChannel$5$3");
            }
        });
        DataChannel dataChannel5 = this.LL;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, RoomChannel.class, new AwS591S0100000_12(this, 526));
        }
        NR();
        EnumC500290Jjf.GAME.config();
        DataChannel dataChannel6 = this.LL;
        if (dataChannel6 != null) {
            ((IEffectService) this.LLJILJILJ.getValue()).onEnterBroadcastPreview();
            C774610Ua3 c774610Ua3 = C774610Ua3.LL;
            c774610Ua3.LLLZIIL(this, dataChannel6);
            c774610Ua3.LLLZZIL(true);
            c774610Ua3.LLLZL(this, dataChannel6);
        }
        C743540TEq.LJIILJJIL(true);
        C11NZ.LJJJJZ(1).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS181S0100000_12(this, 78), new C09JN() { // from class: X.0TAC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceRtcSourceFragment@1cf1.onViewCreated$dipose$2");
                C20441214yg.LJ("DualDeviceRtcSourceFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceRtcSourceFragment@1cf1.onViewCreated$dipose$2");
            }
        });
        if (i == 0) {
            InterfaceC420801kM interfaceC420801kM = this.LLJJIJIL;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LLJJIJIL = ((C0J1N) this.LLJJIJIIJIL.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TBV
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return Intrinsics.LJFF(obj, Boolean.TRUE);
                }
            }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 77), new C09JN() { // from class: X.0TAB
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DualDeviceRtcSourceFragment@1cf1.onViewCreated$5");
                    C20441214yg.LJ("DualDeviceRtcSourceFragment", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("DualDeviceRtcSourceFragment@1cf1.onViewCreated$5");
                }
            });
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("strategy = ");
        sbLIZ2.append(this.LLJJIII);
        sbLIZ2.append(" roomId = ");
        sbLIZ2.append(this.LLILZLL);
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ2));
        C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", "initViews()");
        SR();
        if (this.LLJJJJJIL != null) {
            C0TDX c0tdx = this.LLJILLL;
            if (c0tdx != null) {
                c0tdx.lp();
            }
            C0TCX c0tcx = this.LLJJIII;
            if (c0tcx != null) {
                c0tcx.LJIIJ.onNext(Boolean.TRUE);
                C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "liveCoreInit() isLiveCore = true");
                C742860TCa.LIZIZ(c0tcx.LJFF, "liveCoreInit() isLiveCore = true");
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initViews()  stream = ");
            sbLIZ3.append(this.LLJJJJJIL);
            C20441214yg.LJIIIZ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initDualDeviceLiveStream(getContext(), this.LLILZ, this.LLILZIL, new AfS181S0100000_12(this, 6));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("qrcode check ret = ");
        sbLIZ4.append(i);
        C742860TCa.LIZIZ(this.LLILZLL, C2188811AlT.LIZIZ(sbLIZ4));
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

    public static void UR(DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment, String str, String str2, String str3, boolean z, String str4, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        dualDeviceRtcSourceFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show wrong page, error_code: ");
        sbLIZ.append(str);
        sbLIZ.append(", detailErrorCode: ");
        sbLIZ.append(str2);
        C20441214yg.LJ("DualDeviceRtcSourceFragment", C2188811AlT.LIZIZ(sbLIZ));
        C743540TEq.LJ(str, str2);
        dualDeviceRtcSourceFragment.VR(new C743120TDa(str3, str4, z, false));
        DataChannel dataChannel = dualDeviceRtcSourceFragment.LL;
        if (dataChannel != null) {
            dataChannel.LC0(LiveDualDeviceRetryFromClick.class, Boolean.FALSE);
        }
    }
}
