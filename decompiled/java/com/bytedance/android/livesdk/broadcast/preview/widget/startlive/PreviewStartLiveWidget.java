package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C01GW;
import X.C0HTI;
import X.C0IJT;
import X.C0IUA;
import X.C0UHK;
import X.C0UKZ;
import X.C0UOM;
import X.C0UOP;
import X.C0UPF;
import X.C0UQ5;
import X.C0UQ6;
import X.C0UQ8;
import X.C0UQF;
import X.C0UQK;
import X.C0UQX;
import X.C0URK;
import X.C0URN;
import X.C0URQ;
import X.C0URR;
import X.C0URS;
import X.C0UTQ;
import X.C0UV0;
import X.C0UV1;
import X.C1148130fz1;
import X.C1148240fzC;
import X.C1161920gLG;
import X.C11NJ;
import X.C11RK;
import X.C1276890jKh;
import X.C1388190mED;
import X.C1391810mK3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1528080prq;
import X.C16FS;
import X.C1701940uOG;
import X.C19EG;
import X.C1CC2;
import X.C200000pq;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2207321BaE;
import X.C292401Bi;
import X.C354201Zc;
import X.C384000F3u;
import X.C418440Gaw;
import X.C473410IhP;
import X.C474500IjA;
import X.C486790J7d;
import X.C486980J7w;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C753880Thi;
import X.C758410Tp1;
import X.C770230UJh;
import X.C771480UOc;
import X.C771610UOp;
import X.C771670UOv;
import X.C771780UPg;
import X.C771930UPv;
import X.C772460URw;
import X.C772470URx;
import X.C772480URy;
import X.C772490URz;
import X.C772780UTc;
import X.C773220UUu;
import X.C774610Ua3;
import X.C776270Ucj;
import X.C777390UeX;
import X.C781270Ukn;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.C930830aKX;
import X.C930940aKi;
import X.C931120aL0;
import X.C931150aL3;
import X.C931190aL7;
import X.C931280aLG;
import X.C931470aLZ;
import X.C951930asZ;
import X.C985403tE;
import X.DialogC780480UjW;
import X.EnumC486990J7x;
import X.InterfaceC1106030et7;
import X.InterfaceC20622815ms;
import X.InterfaceC2262081DgM;
import X.InterfaceC465240IMg;
import X.InterfaceC500940Jki;
import X.InterfaceC771800UPi;
import X.InterfaceC772190UQv;
import X.InterfaceC772390URp;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.broadcast.model.AgeRestrictedConfig;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.broadcast.AgeBlockEvent;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.broadcast.GoLiveNoPermissionEvent;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.PreviewGoLiveLoadingEvent;
import com.bytedance.android.livesdk.broadcast.PreviewStartLiveVisibilityEvent;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.ProtectMinorBlockEvent;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckAgeVerifyStatus;
import com.bytedance.android.livesdk.broadcast.ShouldShowSafetyEducationDialogCppV2;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.dataChannel.CreateVideoRoomSuccessEvent;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveGuidanceChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RemoveLiveBroadCastPreviewFragmentEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StartVideoLiveBroadcastFailEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorGCBlockABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewBottomFirstLoadOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSmoothRoomCreateOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDelayManualEndTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHLiveReuseCameraOptSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameTagSelectPopAudienceControlSheetSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.performance.LiveJatoSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS161S1100000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewStartLiveWidget extends PreviewWidget implements InterfaceC465240IMg {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public C0UQ8 LLILZ;
    public DialogC780480UjW LLJIJIL;
    public C16FS LLJILJIL;
    public boolean LLJILJILJ;
    public Integer LLJJI;
    public Boolean LLJJIII;
    public ARunnableS112S0100000_12 LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 197));
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(84));
    public final C01GW LLIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(85));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(87));
    public final C01GW LLJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(86));
    public final WeakHandler LLJI = new WeakHandler(this);
    public final C11NJ LLJILLL = new C11NJ();
    public final C11RK LLJJ = new C11RK();
    public boolean LLJJIJI = true;
    public final C11NJ LLJJIJIIJIL = new C11NJ();
    public boolean LLJJIJIL = true;
    public String LLJJJJJIL = "";
    public final C0URR LLJJJJLIIL = C0URR.LL;
    public final ARunnableS112S0100000_12 LLJJL = new ARunnableS112S0100000_12(this, 93);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2e;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean supportBatch() {
        return false;
    }

    public final void G1() {
        Object objGg0 = this.dataChannel.gg0(LiveModeChannel.class);
        LiveMode liveMode = LiveMode.VIDEO;
        if (objGg0 != liveMode && (!AnchorPreviewUniformStyleABSetting.INSTANCE.enable() || (objGg0 != LiveMode.SCREEN_RECORD && objGg0 != LiveMode.LIVE_VOICE && objGg0 != LiveMode.THIRD_PARTY))) {
            C16FS c16fs = this.LLJILJIL;
            if (c16fs != null) {
                C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(269)), c16fs);
                return;
            }
            return;
        }
        if (objGg0 != liveMode) {
            C16FS c16fs2 = this.LLJILJIL;
            if (c16fs2 != null) {
                C500260Jjc.LJLJLLL(C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), c16fs2);
                return;
            }
            return;
        }
        C770230UJh.LIZ.getClass();
        if (C770230UJh.LJ()) {
            C16FS c16fs3 = this.LLJILJIL;
            if (c16fs3 != null) {
                C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(C770230UJh.LIZIZ() - 32), c16fs3);
                return;
            }
            return;
        }
        C16FS c16fs4 = this.LLJILJIL;
        if (c16fs4 != null) {
            C500260Jjc.LJLJLLL(C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), c16fs4);
        }
    }

    public final boolean I1() {
        Boolean bool;
        Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (map = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class)) != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(J1().getModeFromServer())) != null && permissionApplyInfo.mApplyStatus == 2) {
            return false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        return (dataChannel2 == null || (bool = (Boolean) dataChannel2.gg0(LiveAccessTipsShowChannel.class)) == null || !bool.booleanValue()) && !N1();
    }

    public final LiveMode J1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        }
        return null;
    }

    public final boolean N1() {
        List<CreateInfoPerceptionMessage> list;
        List<CreateInfoPerceptionMessage> list2;
        Object objGg0 = this.dataChannel.gg0(LiveModeChannel.class);
        DataChannel dataChannel = this.dataChannel;
        RoomCreateInfo roomCreateInfo = dataChannel != null ? (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class) : null;
        if (roomCreateInfo == null || (list = roomCreateInfo.perceptionMessages) == null || list.size() <= 0 || (list2 = roomCreateInfo.perceptionMessages) == null) {
            return false;
        }
        Iterator<CreateInfoPerceptionMessage> it2 = list2.iterator();
        while (it2.hasNext()) {
            CreateInfoPerceptionMessage next = it2.next();
            C771780UPg c771780UPg = InterfaceC771800UPi.LIZIZ;
            int i = next.accessType;
            c771780UPg.getClass();
            if (C771780UPg.LIZ(i) == objGg0) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean O1() {
        return AnchorSmoothRoomCreateOptABSetting.INSTANCE.enable() && C354201Zc.LJFF(J1()) && C504210Jpz.LIZ && C0UHK.LIZ;
    }

    public final void P1() {
        PreviewContinueLiveHelper.LIZ.getClass();
        if (System.currentTimeMillis() - PreviewContinueLiveHelper.LIZIZ <= TimeUnit.SECONDS.toMillis(1L)) {
            C20441214yg.LJIIIZ("PreviewStartLiveWidget", "onButtonClick called, but receiveContinueLiveMsgTimestamp has not pass 1 sec, just return!");
            return;
        }
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZ();
        }
        if (LiveEffectStructureOptSetting.INSTANCE.shouldClearCache()) {
            C774610Ua3.LL.LLLZI(this.dataChannel);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLJJIJIL) {
            DataChannelGlobal.LLILZ.JQ2(C931120aL0.class, Long.valueOf(jCurrentTimeMillis));
            this.LLJJIJIL = false;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931150aL3.class, Long.valueOf(jCurrentTimeMillis));
        C777390UeX.LIZIZ(true);
        C1528080prq.LIZ();
        C0UTQ c0utq = new C0UTQ();
        c0utq.LIZ = jCurrentTimeMillis;
        c0utq.LIZIZ = J1().logStreamingType;
        c0utq.LIZJ = false;
        c0utq.LJ = C776270Ucj.LJIIL;
        c0utq.LJFF = 0;
        dataChannelGlobal.JQ2(C931280aLG.class, c0utq);
        C0UQ6 c0uq6 = (C0UQ6) this.LLILZIL.getValue();
        if (c0uq6 != null) {
            c0uq6.LIZ(this.LLJJI, this.LLJJIII, this.LLILZ, this.LLJILJIL, J1(), false, new AwS556S0100000_12(this, 198), AFwS199S0000000_12.get$arr$(88));
        }
    }

    public final boolean S1() {
        int iIntValue;
        GameTag.GameAgeRating next;
        GameTag.GameAgeRating next2;
        Integer num;
        RoomCreateInfo roomCreateInfo;
        AgeRestrictedConfig ageRestrictedConfig;
        GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(J1());
        if ((gameTagFB != null ? gameTagFB.id : null) == null) {
            return false;
        }
        Long l = gameTagFB.id;
        if ((l != null && l.longValue() == 0) || Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930830aKX.class), Boolean.TRUE)) {
            return false;
        }
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJJI = C500260Jjc.LJJJI((dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (ageRestrictedConfig = roomCreateInfo.ageRestrictedConfig) == null) ? null : Boolean.valueOf(ageRestrictedConfig.disabled));
        DataChannel dataChannel2 = this.dataChannel;
        int iIntValue2 = (dataChannel2 == null || (num = (Integer) dataChannel2.gg0(AgeRestrictedChannel.class)) == null) ? 0 : num.intValue();
        boolean audienceControlStatus = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getAudienceControlStatus();
        if (!TtliveGameTagSelectPopAudienceControlSheetSetting.INSTANCE.isEnable()) {
            iIntValue = 7;
        } else if (iIntValue2 == 4 || audienceControlStatus) {
            iIntValue = 1;
        } else if (zLJJJI) {
            iIntValue = 2;
        } else {
            Integer numMd2 = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).md2(gameTagFB);
            iIntValue = numMd2 != null ? numMd2.intValue() : 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_audience_control_perception");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue == 0 ? 1 : 0), "show");
        Iterator<GameTag.GameAgeRating> it2 = gameTagFB.gar.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.rs == 1) {
                break;
            }
        }
        GameTag.GameAgeRating gameAgeRating = next;
        c474500IjALIZ.LJJII(gameAgeRating != null ? Integer.valueOf(gameAgeRating.ar) : null, "pegi_rating");
        Iterator<GameTag.GameAgeRating> it3 = gameTagFB.gar.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (next2.rs == 2) {
                break;
            }
        }
        GameTag.GameAgeRating gameAgeRating2 = next2;
        c474500IjALIZ.LJJII(gameAgeRating2 != null ? Integer.valueOf(gameAgeRating2.ar) : null, "esrb_rating");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "reason_code");
        c474500IjALIZ.LJJII(gameTagFB.id, "hashtag_id");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LIZ();
        return iIntValue == 0;
    }

    public final void T1() {
        Drawable drawableLIZ;
        DataChannelGlobal.LLILZ.JQ2(C930830aKX.class, Boolean.TRUE);
        Context context = this.context;
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.th;
            drawableLIZ = c0hti.LIZ(context);
        } else {
            drawableLIZ = null;
        }
        if (this.context == null || drawableLIZ == null) {
            P1();
            return;
        }
        Context context2 = this.context;
        if (context2 == null) {
            return;
        }
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setText(C497740JfY.LJIJJ(2131837088, C497740JfY.LJIJI(2131837086)));
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColorRes(R.attr.ezs);
        tuxTextView.setGravity(17);
        InsetDrawable insetDrawable = new InsetDrawable(drawableLIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        Context context3 = this.context;
        if (context3 == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context3);
        C1391810mK3 c1391810mK3 = new C1391810mK3(0, context3, insetDrawable);
        c1391810mK3.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        c1397580mTM.LJIIIZ = c1391810mK3;
        C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(this, 433));
        c1397580mTM.LJI(C497740JfY.LJIJI(2131837089));
        c1397580mTM.LIZIZ(C497740JfY.LJIJI(2131837087));
        C384000F3u.LIZ(c1397580mTM, tuxTextView);
        c1397580mTM.LIZLLL(new AwS591S0100000_12(this, 434));
        c1397580mTM.LJII = false;
        c1397580mTM.LJ(AFwS245S0000000_12.get$arr$(45));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void V1() {
        try {
            InterfaceC772190UQv.v3.LJFF(-1);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C951930asZ.class, 1);
            C486980J7w.LJFF(EnumC486990J7x.CreateLive);
            dataChannelGlobal.JQ2(C931190aL7.class, Long.valueOf(C0UQK.LIZJ(this.dataChannel) ? SystemClock.elapsedRealtime() : -1L));
            Context context = this.context;
            String strName = J1().name();
            InterfaceC2262081DgM interfaceC2262081DgML1 = L1();
            C771610UOp.LIZJ(context, strName, String.valueOf(interfaceC2262081DgML1 != null ? Long.valueOf(interfaceC2262081DgML1.getId()) : null));
            BroadcastTimeLog.LIZ("start_broadcast_page", String.valueOf(System.currentTimeMillis()));
            TTLHLiveReuseCameraOptSwitch tTLHLiveReuseCameraOptSwitch = TTLHLiveReuseCameraOptSwitch.INSTANCE;
            if (tTLHLiveReuseCameraOptSwitch.enableTTLHLiveReuseCameraOpt() == 1) {
                C781270Ukn.LJ().startLiveManager().LIZLLL(true);
            }
            if (C781520UlC.LJIIJJI(J1())) {
                C1276890jKh.LIZLLL();
            }
            C0UQ8 c0uq8 = this.LLILZ;
            if (c0uq8 != null) {
                c0uq8.LJI(this.widgetCallback.getFragment(), Boolean.TRUE);
            }
            if (tTLHLiveReuseCameraOptSwitch.enableTTLHLiveReuseCameraOpt() == 0) {
                C781270Ukn.LJ().startLiveManager().LIZLLL(false);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.SX0(C771480UOc.class, Boolean.FALSE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZ(e.getMessage());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "PreviewStartLiveWidget#startLiveBroadcastActivity");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trace", Log.getStackTraceString(e));
            C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static InterfaceC2262081DgM L1() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            return interfaceC500940JkiUser.getCurrentUser();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        G1();
        int i = C200000pq.LIZ[J1().ordinal()];
        this.LLILZ = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : (C772480URy) this.LLJ.getValue() : (C772460URw) this.LLIZ.getValue() : (C772490URz) this.LLIZLLLIL.getValue() : (C772470URx) this.LLILZLL.getValue();
        if (!this.LLJILJILJ) {
            this.LLJJIJI = I1();
            W1("observe LiveMode");
        }
        if (N1() && this.LLJJIJI != I1()) {
            this.LLJJIJI = I1();
            W1("onAttach2");
        }
        if (AnchorPreviewBottomFirstLoadOptABSetting.INSTANCE.enable()) {
            this.dataChannel.FQ2(PreviewStartLiveVisibilityEvent.class);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C16FS c16fs;
        int iIntValue;
        super.E1();
        C20441214yg.LIZIZ("songsong", "PreviewStartLiveWidget onWidgetCreated");
        Integer numLIZ = InterfaceC772190UQv.o4.LIZ();
        if (numLIZ != null && (iIntValue = numLIZ.intValue()) > 0) {
            C0IUA.LJIJJ = iIntValue;
        }
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 336);
        this.LLJJJ = aRunnableS112S0100000_12;
        C473410IhP.LIZJ(aRunnableS112S0100000_12, Mp4ScreenVideoLoadTimeout.CONTROL);
        View view = getView();
        if (!(view instanceof C16FS) || (c16fs = (C16FS) view) == null) {
            return;
        }
        this.LLJILJIL = c16fs;
        this.LLJJIJIIJIL.LIZ(C784440Upu.LIZ().LJ(C0UQ5.class).LJJLJLI(new AfS181S0100000_12(this, 69)));
        View view2 = getView();
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 441));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewBlockInfoChannel.class, new AwS591S0100000_12(this, 442));
            dataChannel.EQ2(this, PermissionApplyInfoChannel.class, new AwS591S0100000_12(this, 443));
            dataChannel.EQ2(this, LiveAccessTipsShowChannel.class, new AwS591S0100000_12(this, 444));
            dataChannel.EQ2(this, AgeBlockEvent.class, new AwS591S0100000_12(this, 445));
            dataChannel.EQ2(this, ProtectMinorBlockEvent.class, new AwS591S0100000_12(this, 446));
            dataChannel.EQ2(this, ShouldShowSafetyEducationDialogCppV2.class, new AwS591S0100000_12(this, 447));
            dataChannel.EQ2(this, ShouldDoubleCheckAgeVerifyStatus.class, new AwS591S0100000_12(this, 448));
            dataChannel.EQ2(this, CppAgeVerifyResponse.class, new AwS591S0100000_12(this, 435));
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 436));
            dataChannel.BQ2(this, GoLiveNoPermissionEvent.class, new AwS591S0100000_12(this, 437));
        }
        DataChannelGlobal.LLILZ.DQ2(LiveCastStateChannel.class, this, new AwS591S0100000_12(this, 438));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, RemoveLiveBroadCastPreviewFragmentEvent.class, new AwS591S0100000_12(this, 439));
        this.LLJILLL.LIZ(this.LLJJ.LJJLIIIJLLLLLLLZ(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 70)));
        Boolean bool = (Boolean) dataChannelGlobal.gg0(PreviewSubOnlyLiveGuidanceChannel.class);
        if (bool != null && bool.booleanValue()) {
            C494680Jac.LJIJJ(true);
        }
        R1(C494680Jac.LIZJ());
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AwS591S0100000_12(this, 440));
        if (C2207321BaE.LIZ()) {
            C786410Ut5.f3(this.LLJJJJLIIL, Looper.myQueue());
        }
    }

    public final void Q1() {
        if (O1()) {
            C473410IhP.LJ(this.LLJJL);
            DataChannelGlobal.LLILZ.GQ2(StartVideoLiveBroadcastFailEvent.class);
            return;
        }
        if (!C354201Zc.LJFF(J1()) || LiveDelayManualEndTimeSetting.INSTANCE.getValue().enable) {
            DialogC780480UjW dialogC780480UjW = this.LLJIJIL;
            if (dialogC780480UjW != null) {
                C500260Jjc.LJJLIIIJL(dialogC780480UjW);
                return;
            }
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(PreviewGoLiveLoadingEvent.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("songsong", "PreviewStartLiveWidget onDestroy");
        C473410IhP.LJ(this.LLJJL);
        C0URK.LIZ.LIZIZ();
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZ();
        }
        if (!this.LLJJJIL) {
            C473410IhP.LJ(this.LLJJJ);
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJ;
            if (aRunnableS112S0100000_12 != null) {
                aRunnableS112S0100000_12.run();
            }
        }
        if (C771930UPv.LIZ != null) {
            C771930UPv.LIZ = null;
        }
        this.LLJJIJIIJIL.LJ();
        this.LLJILLL.dispose();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Boolean bool = Boolean.FALSE;
        dataChannelGlobal.JQ2(C930830aKX.class, bool);
        if (C2207321BaE.LIZ()) {
            Looper.myQueue().removeIdleHandler(this.LLJJJJLIIL);
        }
        dataChannelGlobal.HQ2(PreviewSubOnlyLiveGuidanceChannel.class, bool);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    public final void H1(String str) {
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        C0UKZ.LLII.LIZJ(Boolean.TRUE);
        C0UQ6 c0uq6 = (C0UQ6) this.LLILZIL.getValue();
        if (c0uq6 != null) {
            c0uq6.LIZIZ(this.LLILZ, new AwS161S1100000_12(this, str, 3));
        }
    }

    public final void M1(final Room room) throws JSONException {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2 = null;
        String str3 = "";
        if (O1()) {
            AnchorGCBlockABSetting anchorGCBlockABSetting = AnchorGCBlockABSetting.INSTANCE;
            if ((anchorGCBlockABSetting.isV1() || anchorGCBlockABSetting.isV3()) && !LiveJatoSetting.isEnable()) {
                JatoXL.requestBlockGc(2000L);
            }
            C20441214yg.LIZIZ("songsong", "handleCreateRoomSuccess");
            C473410IhP.LJ(this.LLJJL);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C930940aKi.class, room);
            C772780UTc.LIZJ = System.currentTimeMillis();
            Creator creator = room.creator;
            if (creator != null) {
                int i = creator.roomContinue;
                dataChannelGlobal.JQ2(C931470aLZ.class, new Pair(Boolean.TRUE, Long.valueOf(room.getId())));
                dataChannelGlobal.JQ2(C951930asZ.class, 1);
                dataChannelGlobal.JQ2(C1148130fz1.class, Long.valueOf(System.currentTimeMillis()));
                C0UQX.LJIIJJI(room, J1(), this.dataChannel, i, false, null, null, null, 0);
                if (C354201Zc.LIZLLL(J1())) {
                    C0URS.LIZ();
                }
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                str2 = (String) dataChannel.gg0(PreviewTitleChannel.class);
            }
            if (!TextUtils.isEmpty(str2)) {
                C0UQX.LJIIZILJ(this.dataChannel, J1().logStreamingType, room.isLiveTypeAudio());
            }
            Creator creator2 = room.creator;
            if (creator2 != null && creator2.roomContinue == 0) {
                C772780UTc.LJ(J1(), this.dataChannel, Long.valueOf(room.getId()));
                InterfaceC1106030et7.q8.LJFF("");
            }
            C773220UUu c773220UUu = C773220UUu.LIZ;
            LiveMode liveModeJ1 = J1();
            c773220UUu.getClass();
            C773220UUu.LJ = liveModeJ1;
            C773220UUu.LJIIL(new AwS378S0200000_12(this, room, 78));
            C486790J7d.LIZ(new ARunnableS81S0200000_12(this, room, 101));
            try {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.gg0(C0UQF.class)) != null && bool2.booleanValue()) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_phone_verify_success_live");
                    c474500IjALIZ.LJIJJLI(this.dataChannel);
                    DataChannel dataChannel3 = this.dataChannel;
                    if (dataChannel3 != null && (str = (String) dataChannel3.gg0(PreviewTitleChannel.class)) != null) {
                        str3 = str;
                    }
                    c474500IjALIZ.LJJII(str3, "room_title");
                    c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                    c474500IjALIZ.LIZ();
                }
                Pair pair = new Pair(Boolean.TRUE, Long.valueOf(room.getId()));
                this.dataChannel.zW(StartLiveSuccessChannel.class, pair);
                dataChannelGlobal.JQ2(C931470aLZ.class, pair);
                DataChannel dataChannel4 = this.dataChannel;
                long id = room.getId();
                C0UOP c0uop = (C0UOP) dataChannel4.gg0(C758410Tp1.class);
                if (c0uop != null) {
                    c0uop.LJFF = "golive_success";
                    c0uop.LJI = Long.valueOf(id);
                    C0UOM.LIZIZ(c0uop, dataChannel4);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZ(e.getMessage());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "PreviewStartLiveWidget#startLiveBroadcastActivity");
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trace", Log.getStackTraceString(e));
                C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
            }
            DataChannelGlobal.LLILZ.GQ2(CreateVideoRoomSuccessEvent.class);
            return;
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        dataChannelGlobal2.JQ2(C930940aKi.class, room);
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            bool = (Boolean) dataChannel5.gg0(C753880Thi.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            InterfaceC772390URp.f0.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        C2207321BaE.LIZIZ();
        if (this.isViewValid) {
            if (C354201Zc.LJFF(J1()) && !LiveDelayManualEndTimeSetting.INSTANCE.getValue().enable) {
                DataChannel dataChannel6 = this.dataChannel;
                if (dataChannel6 != null) {
                    dataChannel6.LC0(PreviewGoLiveLoadingEvent.class, Boolean.FALSE);
                }
            } else {
                DialogC780480UjW dialogC780480UjW = this.LLJIJIL;
                if (dialogC780480UjW != null) {
                    C500260Jjc.LJJLIIIJL(dialogC780480UjW);
                }
            }
        }
        C772780UTc.LIZJ = System.currentTimeMillis();
        Creator creator3 = room.creator;
        if (creator3 != null) {
            int i2 = creator3.roomContinue;
            dataChannelGlobal2.JQ2(C931470aLZ.class, new Pair(Boolean.TRUE, Long.valueOf(room.getId())));
            dataChannelGlobal2.JQ2(C951930asZ.class, 1);
            dataChannelGlobal2.JQ2(C1148130fz1.class, Long.valueOf(System.currentTimeMillis()));
            C0UQX.LJIIJJI(room, J1(), this.dataChannel, i2, false, null, null, null, 0);
            if (C354201Zc.LIZLLL(J1())) {
                C0URS.LIZ();
            }
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            str2 = (String) dataChannel7.gg0(PreviewTitleChannel.class);
        }
        if (!TextUtils.isEmpty(str2)) {
            C0UQX.LJIIZILJ(this.dataChannel, J1().logStreamingType, room.isLiveTypeAudio());
        }
        Creator creator4 = room.creator;
        if (creator4 != null && creator4.roomContinue == 0) {
            C772780UTc.LJ(J1(), this.dataChannel, Long.valueOf(room.getId()));
            InterfaceC1106030et7.q8.LJFF("");
        }
        C773220UUu c773220UUu2 = C773220UUu.LIZ;
        LiveMode liveModeJ12 = J1();
        c773220UUu2.getClass();
        C773220UUu.LJ = liveModeJ12;
        C773220UUu.LJIIL(new AwS378S0200000_12(this, room, 79));
        C486790J7d.LIZ(new ARunnableS81S0200000_12(this, room, 102));
        C0UV0 c0uv0 = C0UV0.LiveResource;
        if (!c0uv0.isInstalled()) {
            c0uv0.checkInstall(this.context, new C0UV1() { // from class: X.0URO
                @Override // X.C0UV1
                public final void onSuccess() throws JSONException {
                    C0UV0.LiveResource.load(this.LIZ.context, false);
                    this.LIZ.U1(room);
                }
            });
        } else {
            U1(room);
        }
    }

    public final void R1(boolean z) {
        C16FS c16fs;
        C16FS c16fs2;
        C16FS c16fs3;
        if (z) {
            if (C494680Jac.LIZ) {
                C494680Jac.LIZ = false;
                View view = getView();
                if ((view instanceof C16FS) && (c16fs3 = (C16FS) view) != null) {
                    c16fs3.setText(C497740JfY.LJIJI(2131856605));
                    return;
                }
                return;
            }
            View view2 = getView();
            if (!(view2 instanceof C16FS) || (c16fs2 = (C16FS) view2) == null) {
                return;
            }
            c16fs2.setText(C497740JfY.LJIJI(2131844455));
            return;
        }
        View view3 = getView();
        if (!(view3 instanceof C16FS) || (c16fs = (C16FS) view3) == null) {
            return;
        }
        c16fs.setText(C497740JfY.LJIJI(2131851630));
    }

    public final void U1(Room room) throws JSONException {
        long jElapsedRealtime;
        Long lValueOf;
        Boolean bool;
        String str;
        try {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0UQF.class)) != null && bool.booleanValue()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_phone_verify_success_live");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 == null || (str = (String) dataChannel2.gg0(PreviewTitleChannel.class)) == null) {
                    str = "";
                }
                c474500IjALIZ.LJJII(str, "room_title");
                c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                c474500IjALIZ.LIZ();
            }
            InterfaceC772190UQv.v3.LJFF(-1);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C951930asZ.class, 1);
            Pair pair = new Pair(Boolean.TRUE, Long.valueOf(room.getId()));
            this.dataChannel.zW(StartLiveSuccessChannel.class, pair);
            dataChannelGlobal.JQ2(C931470aLZ.class, pair);
            DataChannel dataChannel3 = this.dataChannel;
            long id = room.getId();
            C0UOP c0uop = (C0UOP) dataChannel3.gg0(C758410Tp1.class);
            if (c0uop != null) {
                c0uop.LJFF = "golive_success";
                c0uop.LJI = Long.valueOf(id);
                C0UOM.LIZIZ(c0uop, dataChannel3);
            }
            C486980J7w.LJFF(EnumC486990J7x.CreateLive);
            if (C0UQK.LIZJ(this.dataChannel)) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = -1;
            }
            dataChannelGlobal.JQ2(C931190aL7.class, Long.valueOf(jElapsedRealtime));
            Context context = this.context;
            String strName = J1().name();
            InterfaceC2262081DgM interfaceC2262081DgML1 = L1();
            if (interfaceC2262081DgML1 != null) {
                lValueOf = Long.valueOf(interfaceC2262081DgML1.getId());
            } else {
                lValueOf = null;
            }
            C771610UOp.LIZJ(context, strName, String.valueOf(lValueOf));
            BroadcastTimeLog.LIZ("start_broadcast_page", String.valueOf(System.currentTimeMillis()));
            TTLHLiveReuseCameraOptSwitch tTLHLiveReuseCameraOptSwitch = TTLHLiveReuseCameraOptSwitch.INSTANCE;
            if (tTLHLiveReuseCameraOptSwitch.enableTTLHLiveReuseCameraOpt() == 1) {
                C781270Ukn.LJ().startLiveManager().LIZLLL(true);
            }
            if (C781520UlC.LJIIJJI(J1())) {
                C1276890jKh.LIZLLL();
            }
            if (C504210Jpz.LIZ) {
                C0UQ8 c0uq8 = this.LLILZ;
                if (c0uq8 != null) {
                    c0uq8.LJI(this.widgetCallback.getFragment(), Boolean.FALSE);
                }
                InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(C1388190mED.LIZIZ(this.context));
                if (interfaceC20622815msLIZ != null) {
                    C520010KaN.LJIILLIIL(interfaceC20622815msLIZ);
                }
            } else {
                C0UQ8 c0uq82 = this.LLILZ;
                if (c0uq82 != null) {
                    c0uq82.LJFF(this.widgetCallback.getFragment());
                }
                C19EG c19egLJ = C500260Jjc.LJ(this.context);
                if (c19egLJ != null) {
                    c19egLJ.finish();
                }
                C19EG c19egLJ2 = C500260Jjc.LJ(this.context);
                if (c19egLJ2 != null) {
                    C786410Ut5.ce(c19egLJ2, 0, 0);
                }
            }
            if (tTLHLiveReuseCameraOptSwitch.enableTTLHLiveReuseCameraOpt() == 0) {
                C781270Ukn.LJ().startLiveManager().LIZLLL(false);
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.SX0(C771480UOc.class, Boolean.FALSE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZ(e.getMessage());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "PreviewStartLiveWidget#startLiveBroadcastActivity");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trace", Log.getStackTraceString(e));
            C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public final void W1(String str) {
        C0UOP c0uop;
        C16FS c16fs;
        C0UOP c0uop2;
        boolean z;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(dataChannelGlobal.gg0(C1148240fzC.class), Boolean.TRUE)) {
            C16FS c16fs2 = this.LLJILJIL;
            if (c16fs2 != null) {
                c16fs2.j0(R.style.a6u);
            }
            AnchorPreviewNoPermissionOptABSetting anchorPreviewNoPermissionOptABSetting = AnchorPreviewNoPermissionOptABSetting.INSTANCE;
            if ((anchorPreviewNoPermissionOptABSetting.enable() || AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) && (c16fs = this.LLJILJIL) != null) {
                C786410Ut5.j5(c16fs, 0.5f);
            }
            C16FS c16fs3 = this.LLJILJIL;
            if (c16fs3 != null) {
                if (!anchorPreviewNoPermissionOptABSetting.enable() && !AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
                    z = false;
                } else {
                    z = true;
                }
                c16fs3.setEnabled(z);
            }
            this.LLJJJJ = true;
            this.LLJJJJJIL = "no_permission";
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (c0uop2 = (C0UOP) dataChannel.gg0(C758410Tp1.class)) != null) {
                c0uop2.LJIIJ = false;
                c0uop2.LJIIJJI = 113;
                return;
            }
            return;
        }
        Boolean bool = (Boolean) dataChannelGlobal.gg0(LiveCastStateChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStartLiveButtonEnable(). scene=");
        sbLIZ.append(str);
        sbLIZ.append(", startLiveAccess=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", isCasting=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJIIIZ("PreviewStartLiveWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJI && !zBooleanValue) {
            C16FS c16fs4 = this.LLJILJIL;
            if (c16fs4 != null) {
                c16fs4.j0(R.style.a6s);
            }
            C16FS c16fs5 = this.LLJILJIL;
            if (c16fs5 != null) {
                c16fs5.setEnabled(true);
                return;
            }
            return;
        }
        C16FS c16fs6 = this.LLJILJIL;
        if (c16fs6 != null) {
            c16fs6.j0(R.style.a6t);
        }
        C16FS c16fs7 = this.LLJILJIL;
        if (c16fs7 != null) {
            c16fs7.setEnabled(zBooleanValue);
        }
        this.LLJJJJ = true;
        this.LLJJJJJIL = "is_casting";
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (c0uop = (C0UOP) dataChannel2.gg0(C758410Tp1.class)) == null) {
            return;
        }
        c0uop.LJIIJ = zBooleanValue;
        c0uop.LJIIJJI = 113;
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        C0UQ6 c0uq6;
        if (this.isViewValid && (c0uq6 = (C0UQ6) this.LLILZIL.getValue()) != null) {
            c0uq6.LIZJ(message, J1(), new C0URQ(this), new C0URN(this), this.LLJJ, false, !O1());
        }
    }
}
