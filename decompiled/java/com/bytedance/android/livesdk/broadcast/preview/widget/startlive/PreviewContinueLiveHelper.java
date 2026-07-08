package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C013C;
import X.C0IJT;
import X.C0UF5;
import X.C0UKC;
import X.C0UOM;
import X.C0UOP;
import X.C0UP3;
import X.C0UQ2;
import X.C0UQ3;
import X.C0UQX;
import X.C0URD;
import X.C0URF;
import X.C0URS;
import X.C0UTQ;
import X.C0WZX;
import X.C1148130fz1;
import X.C1161920gLG;
import X.C1276890jKh;
import X.C1338270kvh;
import X.C1388190mED;
import X.C1391850mK7;
import X.C13LE;
import X.C1528080prq;
import X.C1701330uNH;
import X.C199900pp;
import X.C19EG;
import X.C19GN;
import X.C19GO;
import X.C1C7U;
import X.C20441214yg;
import X.C20629915o1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2207321BaE;
import X.C293501Bt;
import X.C354201Zc;
import X.C464950ILd;
import X.C472970Igh;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501080Jkw;
import X.C504210Jpz;
import X.C520010KaN;
import X.C749340TaO;
import X.C758410Tp1;
import X.C770780ULk;
import X.C771670UOv;
import X.C772290URf;
import X.C772320URi;
import X.C772530USd;
import X.C772780UTc;
import X.C773220UUu;
import X.C776270Ucj;
import X.C777390UeX;
import X.C781270Ukn;
import X.C781520UlC;
import X.C786410Ut5;
import X.C930580aK8;
import X.C930860aKa;
import X.C930940aKi;
import X.C931280aLG;
import X.C931470aLZ;
import X.C951930asZ;
import X.InterfaceC20622815ms;
import X.InterfaceC20630715o9;
import X.InterfaceC214902198i;
import X.InterfaceC772190UQv;
import X.InterfaceC772390URp;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewLiveResumeRoomChannel;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BroadcastResumeInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickConfirmContinueLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickStartLiveEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveContinueDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewFixBackDialogBugSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostNetControlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeLaunchBroadcastOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameContinueDefinitionNullOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableSaveOrientationSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS63S1000000_12;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewContinueLiveHelper {
    public static final PreviewContinueLiveHelper LIZ = new PreviewContinueLiveHelper();
    public static long LIZIZ = -1;
    public static C19GN LIZJ;

    public static int LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C199900pp.LIZ[liveMode.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 4) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    public static boolean LIZIZ(Room room) {
        if (!C781520UlC.LJIIL(room) && !C781520UlC.LJFF(room)) {
            return false;
        }
        return true;
    }

    public static void LIZJ(LiveMode liveMode) {
        String str;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_room_create", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII("normal", "enter_from");
        if (liveMode == null || (str = liveMode.logStreamingType) == null) {
            str = "";
        }
        c474500IjALIZIZ.LJJII(str, "live_mode");
        c474500IjALIZIZ.LJJII("normal", "is_smooth");
        c474500IjALIZIZ.LJJII(1, "is_success");
        c474500IjALIZIZ.LJJII(1, "is_continue");
        c474500IjALIZIZ.LJJII("", "error");
        c474500IjALIZIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[PHI: r3
      0x0057: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:17:0x0042, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.os.Message r12, com.bytedance.ies.sdk.datachannel.DataChannel r13, androidx.fragment.app.Fragment r14) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper.LJI(android.os.Message, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(Context context, DataChannel dataChannel, Intent intent, int i) {
        Bundle bundle;
        NavigationScene navigationScene;
        Fragment fragment;
        if (C504210Jpz.LIZ) {
            dataChannel.zW(TryModeGoLiveChannel.class, Boolean.TRUE);
            InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(i);
            if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                return;
            }
            if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment.getArguments()) == null) {
                bundle = new Bundle();
            }
            C786410Ut5.LJJJI("request_page", "try_mode", bundle);
            bundle.putBoolean("is_try_mode", false);
            bundle.putBoolean("is_from_try_mode", true);
            InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(C1388190mED.LIZ(context));
            if (interfaceC20622815msLIZ != null && (C20629915o1.LIZLLL(interfaceC20622815msLIZ) instanceof InterfaceC20630715o9) && (navigationScene = interfaceC20622815msLIZ.getNavigationScene()) != null) {
                navigationScene.LLLLLL();
            }
            InterfaceC20622815ms interfaceC20622815msLIZ2 = C520010KaN.LIZ(C1388190mED.LIZ(context));
            if (interfaceC20622815msLIZ2 != null) {
                C520010KaN.LJIIL(interfaceC20622815msLIZ2, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
            }
            InterfaceC20622815ms interfaceC20622815msLIZ3 = C520010KaN.LIZ(C1388190mED.LIZ(context));
            if (interfaceC20622815msLIZ3 != null) {
                C520010KaN.LJIILLIIL(interfaceC20622815msLIZ3);
                return;
            }
            return;
        }
        if (intent == null) {
            return;
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        dataChannel.zW(TryModeGoLiveChannel.class, Boolean.TRUE);
        if (c19egLJ != null) {
            intent.putExtra("request_page", "try_mode");
            intent.putExtra("is_try_mode", false);
            intent.putExtra("is_from_try_mode", true);
            intent.setFlags(268435456);
            c19egLJ.finish();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLJ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, c19egLJ);
            C2204961BRm.LLJJJJ(c19egLJ, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqPWKxFpCtGvjU25JLIJLikKUJKmF7jrzUe", null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.bytedance.android.livesdkapi.depend.model.live.Room r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, X.C772320URi r10, X.C772320URi r11, long r12) {
        /*
            com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameContinueUseLocalOrientationSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameContinueUseLocalOrientationSetting.INSTANCE
            boolean r0 = r0.enable()
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            if (r10 == 0) goto L5c
            if (r11 == 0) goto L5c
            long r0 = r10.LIZ
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L5e
            long r0 = r11.LIZ
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L5e
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5e
            com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameUseLocalOrientationTimeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameUseLocalOrientationTimeSetting.INSTANCE
            int r6 = r0.getValue()
            long r0 = r10.LIZ
            long r3 = r11.LIZ
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L5a
            long r3 = (long) r6
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5a
            r1 = 1
        L34:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            if (r1 == 0) goto L5e
            X.14i1<X.0URi> r0 = X.InterfaceC772390URp.C0
            java.lang.Object r0 = r0.LIZIZ()
            X.0URi r0 = (X.C772320URi) r0
            int r0 = r0.LIZIZ
            if (r0 != r2) goto L45
        L44:
            r7 = 1
        L45:
            java.lang.Class<com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel> r1 = com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.zW(r1, r0)
            X.14i1<java.lang.Boolean> r1 = X.InterfaceC772390URp.c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.LJFF(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        L5a:
            r1 = 0
            goto L34
        L5c:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
        L5e:
            if (r8 == 0) goto L45
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r8.getRoomAuthStatus()
            if (r0 == 0) goto L45
            int r0 = r0.getLandscape()
            if (r0 != r2) goto L45
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper.LJIIIIZZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, X.0URi, X.0URi, long):void");
    }

    public static void LJ(final Room room, Message message, final DataChannel dataChannel, final Fragment fragment, int i, final BroadcastResumeInfo broadcastResumeInfo) {
        final Context context;
        final Integer numValueOf;
        final Integer numValueOf2;
        C772320URi c772320URiLIZIZ;
        C772320URi c772320URi;
        final long jCurrentTimeMillis;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long id;
        LIZIZ = System.currentTimeMillis();
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        long id2 = 0;
        if (c0utq != null) {
            c0utq.LJIIIZ = System.currentTimeMillis();
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c0utq.LJII = String.valueOf(id);
        }
        LiveMode streamType = null;
        if (fragment != null && (context = fragment.getContext()) != null && dataChannel != null) {
            if (message != null) {
                numValueOf = Integer.valueOf(message.arg1);
                numValueOf2 = Integer.valueOf(message.arg2);
            } else {
                numValueOf = null;
                numValueOf2 = null;
            }
            LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            if (liveMode == null) {
                liveMode = LiveMode.VIDEO;
            }
            if (TtliveGameContinueDefinitionNullOptSetting.INSTANCE.enable() && C354201Zc.LIZLLL(liveMode) && fragment != null) {
                PushStreamInfo.Quality qualityWG1 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).WG1();
                if (qualityWG1 != null) {
                    C501080Jkw.LIZ(qualityWG1, true, "PreviewContinueLiveHelper");
                }
                dataChannel.EQ2(fragment, RoomCreateInfoChannel.class, new AwS63S1000000_12("PreviewContinueLiveHelper", 0));
            }
            TtliveGameEnableSaveOrientationSetting ttliveGameEnableSaveOrientationSetting = TtliveGameEnableSaveOrientationSetting.INSTANCE;
            if (!ttliveGameEnableSaveOrientationSetting.enable() || room == null || room.getId() <= 0 || (c772320URiLIZIZ = InterfaceC772390URp.C0.LIZIZ()) == null || c772320URiLIZIZ.LIZ != room.getId()) {
                c772320URiLIZIZ = null;
            }
            if (ttliveGameEnableSaveOrientationSetting.enable() && room != null && room.getId() > 0) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null && roomAuthStatus.getLandscape() == 1) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                c772320URi = new C772320URi(room.getId(), i6);
            } else {
                c772320URi = null;
            }
            if (ttliveGameEnableSaveOrientationSetting.enable() && room != null && room.getId() > 0 && room.getCreateTime() > 0) {
                jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - room.getCreateTime();
            } else {
                jCurrentTimeMillis = -999;
            }
            final C013C c013c = new C013C();
            if (i == 1) {
                c013c.element = true;
                if (room != null) {
                    id2 = room.getId();
                }
                C0UQX.LJIILL(id2, dataChannel, "show", CardStruct.IStatusCode.DEFAULT);
                i2 = 2131843990;
                i3 = 2131843989;
                i4 = 2131843987;
                i5 = 2131843988;
            } else {
                i2 = 2131840695;
                i3 = 2131840692;
                i4 = 2131840693;
                i5 = 2131840694;
            }
            ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
            if (numValueOf != null && numValueOf.intValue() == 1 && numValueOf2 != null && numValueOf2.intValue() == 3) {
                i2 = 2131855741;
                i3 = 2131855739;
                i4 = 2131855740;
                i5 = 2131855738;
            }
            C777390UeX.LIZIZ(true);
            if (room != null) {
                streamType = room.getStreamType();
            }
            if (C781520UlC.LJI(streamType)) {
                dataChannel.zW(GameLiveContinueDialogShowChannel.class, Boolean.TRUE);
            }
            C19GO c19go = new C19GO(context);
            c19go.LJI(i2);
            c19go.LIZIZ(i3);
            final C772320URi c772320URi2 = c772320URi;
            final LiveMode liveMode2 = liveMode;
            final C772320URi c772320URi3 = c772320URiLIZIZ;
            c19go.LJ(i4, new DialogInterface.OnClickListener() { // from class: X.0UP0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) throws JSONException {
                    String string;
                    ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
                    dataChannel.FQ2(BroadcastClickStartLiveEvent.class);
                    Integer num = numValueOf2;
                    if (num != null && num.intValue() == 3) {
                        C780470UjV c780470UjV = new C780470UjV(context);
                        c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
                        DialogC780480UjW dialogC780480UjWLIZ = c780470UjV.LIZ();
                        Room room2 = room;
                        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                            string = CardStruct.IStatusCode.DEFAULT;
                        }
                        C0UP1 c0up1 = new C0UP1(dialogC780480UjWLIZ, liveMode2, room, dataChannel, c772320URi3, c772320URi2, jCurrentTimeMillis, context, c013c, broadcastResumeInfo, numValueOf, fragment);
                        HashMap<String, String> map = new HashMap<>();
                        map.put("room_id", string);
                        C480460Ism.LIZ().getClass();
                        ((RoomRetrofitApi) C480460Ism.LIZIZ(RoomRetrofitApi.class)).resumeRoom(map).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(c0up1, 200), new AfS181S0100000_12(c0up1, 201));
                        C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjWLIZ);
                    } else {
                        if (C781520UlC.LJI(liveMode2)) {
                            PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                            Room room3 = room;
                            DataChannel dataChannel2 = dataChannel;
                            C772320URi c772320URi4 = c772320URi3;
                            C772320URi c772320URi5 = c772320URi2;
                            long j = jCurrentTimeMillis;
                            previewContinueLiveHelper.getClass();
                            PreviewContinueLiveHelper.LJIIIIZZ(room3, dataChannel2, c772320URi4, c772320URi5, j);
                        }
                        PreviewContinueLiveHelper previewContinueLiveHelper2 = PreviewContinueLiveHelper.LIZ;
                        LiveMode liveMode3 = liveMode2;
                        DataChannel dataChannel3 = dataChannel;
                        Context context2 = context;
                        boolean z = c013c.element;
                        Room room4 = room;
                        BroadcastResumeInfo broadcastResumeInfo2 = broadcastResumeInfo;
                        Fragment fragment2 = fragment;
                        C772320URi c772320URi6 = c772320URi3;
                        C772320URi c772320URi7 = c772320URi2;
                        long j2 = jCurrentTimeMillis;
                        previewContinueLiveHelper2.getClass();
                        PreviewContinueLiveHelper.LIZLLL(liveMode3, dataChannel3, context2, z, room4, broadcastResumeInfo2, fragment2, false, c772320URi6, c772320URi7, j2);
                    }
                    boolean z2 = C0URD.LJ;
                    C0UQ2.LIZ().LIZJ();
                    if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
                        PreviewContinueLiveHelper.LIZ.getClass();
                        PreviewContinueLiveHelper.LIZJ = null;
                    }
                }
            }, false);
            final Integer num = numValueOf2;
            final C772320URi c772320URi4 = c772320URiLIZIZ;
            final C772320URi c772320URi5 = c772320URi;
            final long j = jCurrentTimeMillis;
            final Integer num2 = numValueOf;
            c19go.LIZJ(i5, new DialogInterface.OnClickListener() { // from class: com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper$showContinueLiveDialog$dialog$2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    Integer num3;
                    Integer num4;
                    long id3;
                    ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(false);
                    InterfaceC772190UQv.O3.LIZJ(Boolean.FALSE);
                    if (c013c.element && ((num4 = num) == null || num4.intValue() != 3)) {
                        Room room2 = room;
                        if (room2 != null) {
                            id3 = room2.getId();
                        } else {
                            id3 = 0;
                        }
                        C0UQX.LJIILL(id3, dataChannel, "click", "cancel");
                        C19EG c19egLJ = C500260Jjc.LJ(context);
                        if (c19egLJ != null) {
                            c19egLJ.finish();
                        }
                        boolean z = C0URD.LJ;
                        C0UQ2.LIZ().LIZJ();
                        return;
                    }
                    C0UQX.LJJIIJZLJL("cancel", dataChannel, c772320URi4, c772320URi5, j);
                    Integer num5 = num2;
                    if (num5 != null && num5.intValue() == 0) {
                        final Looper mainLooper = Looper.getMainLooper();
                        final DataChannel dataChannel2 = dataChannel;
                        BPEAHandler bPEAHandler = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper$showContinueLiveDialog$dialog$2$msgHandler$1
                            @Override // android.os.Handler
                            public final void handleMessage(Message message2) {
                                C1C7U.LIZ("PreviewContinueLiveHelper@dfb0.showContinueLiveDialog$dialog$2$msgHandler$1");
                                if (message2.what == 32) {
                                    dataChannel2.zW(PreviewLiveResumeRoomChannel.class, Boolean.FALSE);
                                }
                                C1C7U.LIZIZ("PreviewContinueLiveHelper@dfb0.showContinueLiveDialog$dialog$2$msgHandler$1");
                            }
                        };
                        C464950ILd.LJI.getClass();
                        C464950ILd.LJ(bPEAHandler, 1);
                        Map<String, Object> map = C1338270kvh.LIZ;
                        dataChannel.zW(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
                        C770780ULk.LL.LIZJ(dataChannel, context);
                    } else {
                        Integer num6 = num2;
                        if (num6 != null && num6.intValue() == 1 && ((num3 = num) == null || num3.intValue() != 3)) {
                            DataChannel dataChannel3 = dataChannel;
                            Boolean bool = Boolean.TRUE;
                            dataChannel3.SX0(C0UP3.class, bool);
                            dataChannel.SX0(C749340TaO.class, bool);
                            PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) C0UKC.LJFF(C13LE.LIZ(PreviewStartLiveWidget.class));
                            if (previewStartLiveWidget != null) {
                                previewStartLiveWidget.H1("continue_dialog_after_click");
                            }
                        }
                    }
                    boolean z2 = C0URD.LJ;
                    C0UQ2.LIZ().LIZJ();
                    if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
                        PreviewContinueLiveHelper.LIZ.getClass();
                        PreviewContinueLiveHelper.LIZJ = null;
                    }
                }
            }, false);
            c19go.LJJIIJ = false;
            C19GN c19gnLIZ = c19go.LIZ();
            if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
                LIZJ = c19gnLIZ;
            }
            C1391850mK7.LIZIZ(c19gnLIZ, "157");
            boolean z = C0URD.LJ;
            final C772320URi c772320URi6 = c772320URiLIZIZ;
            final C772320URi c772320URi7 = c772320URi;
            final long j2 = jCurrentTimeMillis;
            C0UQ2.LIZ().LIZ(c19gnLIZ, C0URF.MIDDLE, new C0UQ3() { // from class: X.0UP2
                @Override // X.C0UQ3
                public final void LIZ() {
                    C0UQX.LJJIIJZLJL("show", dataChannel, c772320URi6, c772320URi7, j2);
                }
            }, "SHOW_CONTINUE_DIALOG_TAG");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(LiveMode liveMode, DataChannel dataChannel, Context context, boolean z, Room room, BroadcastResumeInfo broadcastResumeInfo, Fragment fragment, boolean z2, C772320URi c772320URi, C772320URi c772320URi2, long j) throws JSONException {
        boolean zBooleanValue;
        int i;
        String str;
        int i2;
        int i3;
        Bundle bundle;
        String str2;
        boolean z3;
        C772290URf c772290URfLJI;
        Fragment fragment2;
        String str3;
        boolean z4;
        C772290URf c772290URfLJI2;
        long id;
        Creator creator;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0UTQ c0utq = (C0UTQ) dataChannelGlobal.gg0(C931280aLG.class);
        if (c0utq == null) {
            c0utq = new C0UTQ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0utq.LIZ <= 0) {
            c0utq.LIZ = jCurrentTimeMillis;
        }
        c0utq.LJIIIIZZ = jCurrentTimeMillis;
        c0utq.LIZIZ = liveMode.logStreamingType;
        Boolean bool = (Boolean) dataChannel.gg0(TryModeGoLiveChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c0utq.LIZJ = zBooleanValue;
        c0utq.LJ = C776270Ucj.LJIIL;
        if (room != null && (creator = room.creator) != null) {
            i = creator.roomContinue;
        } else {
            i = 1;
        }
        c0utq.LJFF = i;
        dataChannelGlobal.JQ2(C931280aLG.class, c0utq);
        C1528080prq.LIZ();
        C773220UUu c773220UUu = C773220UUu.LIZ;
        c773220UUu.getClass();
        C773220UUu.LJIIJJI(liveMode);
        C773220UUu.LJ = liveMode;
        C773220UUu.LJIIL(AFwS245S0000000_12.get$arr$(171));
        if (C771670UOv.LJFF) {
            str = "resume";
        } else {
            str = "back_to_live";
        }
        C0UQX.LJJIIJZLJL(str, dataChannel, c772320URi, c772320URi2, j);
        if (z) {
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C0UQX.LJIILL(id, dataChannel, "click", "resume");
            dataChannelGlobal.JQ2(C930580aK8.class, Boolean.TRUE);
        }
        if (Room.isValid(room) && room != null) {
            LiveBroadcastResourceOptSetting liveBroadcastResourceOptSetting = LiveBroadcastResourceOptSetting.INSTANCE;
            if (liveBroadcastResourceOptSetting.enable() && !C772530USd.LIZ && liveBroadcastResourceOptSetting.endPhase() > 1) {
                C772530USd.LIZ = true;
                C20441214yg.LIZIZ("BroadcastResOpt", "startResumeOpt");
                C772530USd.LIZJ();
                C772530USd.LJIIIIZZ();
                C772530USd.LIZIZ();
            }
            if (LiveHostEnableNetControlSetting.INSTANCE.enable() && room.getStreamType() == LiveMode.VIDEO) {
                C20441214yg.LIZIZ("HostNetCtrl", "resume - rtmp connect");
                LiveDispatchConfig configByScene = LiveHostNetControlConfig.INSTANCE.getConfigByScene("biz_live_broadcast_rtmp_connect");
                if (configByScene != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resume - rtmp connect: ");
                    sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), configByScene));
                    C20441214yg.LIZIZ("HostNetCtrl", C2188811AlT.LIZIZ(sbLIZ));
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerNetworkControl(configByScene.getSceneName(), configByScene);
                }
            }
            Boolean bool2 = Boolean.FALSE;
            dataChannelGlobal.JQ2(C930860aKa.class, bool2);
            dataChannelGlobal.JQ2(C930940aKi.class, room);
            if (room.getStreamType() == LiveMode.VIDEO) {
                C776270Ucj.LIZ.getClass();
                C776270Ucj.LJIJ(context, room);
            }
            C472970Igh.LJJ = true;
            C472970Igh.LJJI = true;
            int i4 = 3;
            if (C771670UOv.LJFF) {
                i2 = 3;
            } else if (C771670UOv.LJI) {
                i2 = 4;
            } else {
                i2 = 1;
            }
            C772780UTc.LJIIZILJ = i2;
            C772780UTc.LIZIZ = System.currentTimeMillis();
            C2207321BaE.LIZIZ();
            C772780UTc.LJIIIZ(1);
            if (z2) {
                i3 = 3;
            } else {
                i3 = 1;
            }
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(i3, room, 939);
            c773220UUu.getClass();
            C773220UUu.LJIIL(awS591S0100000_12);
            Boolean bool3 = Boolean.TRUE;
            Pair pair = new Pair(bool3, Long.valueOf(room.getId()));
            dataChannel.zW(StartLiveSuccessChannel.class, pair);
            dataChannelGlobal.JQ2(C931470aLZ.class, pair);
            dataChannelGlobal.JQ2(C951930asZ.class, 2);
            dataChannelGlobal.JQ2(C1148130fz1.class, Long.valueOf(System.currentTimeMillis()));
            if (!C771670UOv.LJFF) {
                i4 = 1;
            }
            C0UQX.LJIIJJI(room, liveMode, dataChannel, i4, false, null, null, null, 0);
            if (C354201Zc.LIZLLL(liveMode)) {
                C0URS.LIZ();
            }
            if (C781520UlC.LJIIL(room) && C354201Zc.LJFF(liveMode)) {
                C1276890jKh.LIZLLL();
            }
            if (!C504210Jpz.LIZ) {
                int iLIZ = LIZ(room.getStreamType());
                Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(C500260Jjc.LJ(context), iLIZ);
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
                if (roomCreateInfo != null) {
                    str3 = roomCreateInfo.mAdditionalPrompt;
                } else {
                    str3 = null;
                }
                intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str3);
                intentCreateStartBroadcastIntent.putExtra("live.intent.extra.IS_CONTINUE_LIVE", true);
                if (C781520UlC.LIZIZ(room)) {
                    intentCreateStartBroadcastIntent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", (Serializable) dataChannel.gg0(GameLandScapeOrientationChannel.class));
                } else if (LIZIZ(room)) {
                    intentCreateStartBroadcastIntent.putExtra("interact_resume_scene", broadcastResumeInfo.getRealScene());
                    if (broadcastResumeInfo.linkMicUserNum > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    intentCreateStartBroadcastIntent.putExtra("interact_is_only_push_rtc", z4);
                }
                if (C500260Jjc.LJJJIL(dataChannel)) {
                    if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || ((c772290URfLJI2 = C0UF5.LJI()) != null && c772290URfLJI2.LIZ)) {
                        LJII(context, dataChannel, intentCreateStartBroadcastIntent, iLIZ);
                    } else {
                        C776270Ucj.LIZ.getClass();
                        if (C776270Ucj.LJIL(room)) {
                            dataChannel.zW(TryModeGoLiveChannel.class, bool3);
                        } else {
                            C772290URf c772290URfLJI3 = C0UF5.LJI();
                            if (c772290URfLJI3 != null) {
                                c772290URfLJI3.LIZ = true;
                            }
                            LJII(context, dataChannel, intentCreateStartBroadcastIntent, iLIZ);
                        }
                    }
                } else {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context);
                    C2204961BRm.LJJJJJL(context, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqPWKxFpCtGvjU25JLIJLikKUJKmF7jrzUe", null));
                    C19EG c19egLJ = C500260Jjc.LJ(context);
                    if (c19egLJ != null) {
                        c19egLJ.finish();
                    }
                    C19EG c19egLJ2 = C500260Jjc.LJ(context);
                    if (c19egLJ2 != null) {
                        C786410Ut5.ce(c19egLJ2, 0, 0);
                    }
                    LIZJ(room.getStreamType());
                }
            } else {
                int iLIZ2 = LIZ(room.getStreamType());
                InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(iLIZ2);
                if (interfaceC214902198iCreateStartBroadcastFragment != 0) {
                    if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment2 = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment2.getArguments()) == null) {
                        bundle = new Bundle();
                    }
                    RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
                    if (roomCreateInfo2 != null) {
                        str2 = roomCreateInfo2.mAdditionalPrompt;
                    } else {
                        str2 = null;
                    }
                    C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str2, bundle);
                    bundle.putBoolean("live.intent.extra.IS_CONTINUE_LIVE", true);
                    if (C781520UlC.LIZIZ(room)) {
                        C786410Ut5.LJJIZ(bundle, "hotsoon.intent.extra.IS_LANDSCAPE", (Serializable) dataChannel.gg0(GameLandScapeOrientationChannel.class));
                    } else {
                        LIZ.getClass();
                        if (LIZIZ(room)) {
                            bundle.putInt("interact_resume_scene", broadcastResumeInfo.getRealScene());
                            if (broadcastResumeInfo.linkMicUserNum > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bundle.putBoolean("interact_is_only_push_rtc", z3);
                        }
                    }
                    if (C500260Jjc.LJJJIL(dataChannel)) {
                        if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || ((c772290URfLJI = C0UF5.LJI()) != null && c772290URfLJI.LIZ)) {
                            LJII(context, dataChannel, null, iLIZ2);
                        } else {
                            C776270Ucj.LIZ.getClass();
                            if (C776270Ucj.LJIL(room)) {
                                dataChannel.zW(TryModeGoLiveChannel.class, bool3);
                                InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(fragment.getActivity());
                                if (interfaceC20622815msLIZ != null) {
                                    C520010KaN.LJIILLIIL(interfaceC20622815msLIZ);
                                }
                            } else {
                                C772290URf c772290URfLJI4 = C0UF5.LJI();
                                if (c772290URfLJI4 != null) {
                                    c772290URfLJI4.LIZ = true;
                                }
                                LJII(context, dataChannel, null, iLIZ2);
                            }
                        }
                    } else {
                        InterfaceC20622815ms interfaceC20622815msLIZ2 = C520010KaN.LIZ(fragment.getActivity());
                        if (interfaceC20622815msLIZ2 != null) {
                            C520010KaN.LJIIL(interfaceC20622815msLIZ2, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
                        }
                        InterfaceC20622815ms interfaceC20622815msLIZ3 = C520010KaN.LIZ(fragment.getActivity());
                        if (interfaceC20622815msLIZ3 != null) {
                            C520010KaN.LJIILLIIL(interfaceC20622815msLIZ3);
                        }
                        LIZJ(room.getStreamType());
                    }
                }
            }
            C781270Ukn.LJ().startLiveManager().LIZLLL(false);
            Long lValueOf = Long.valueOf(room.getId());
            C0UOP c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class);
            if (c0uop != null) {
                c0uop.LJFF = "golive_success";
                c0uop.LJI = lValueOf;
                C0UOM.LIZIZ(c0uop, dataChannel);
            }
            dataChannel.zW(PreviewStartLiveContinueMsgChannel.class, bool2);
            dataChannel.FQ2(BroadcastClickConfirmContinueLiveEvent.class);
        }
    }
}
