package com.bytedance.android.livesdk.broadcast.preview.onetap;

import X.C01GW;
import X.C01QD;
import X.C0IJT;
import X.C0KPJ;
import X.C0UKZ;
import X.C0UO0;
import X.C0UOA;
import X.C0UOD;
import X.C0UOQ;
import X.C0UQX;
import X.C0US7;
import X.C0USA;
import X.C0USD;
import X.C0USJ;
import X.C0USU;
import X.C0USV;
import X.C0USY;
import X.C0UVW;
import X.C0WZX;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C1388190mED;
import X.C1701330uNH;
import X.C19514711Wn;
import X.C199800po;
import X.C19EG;
import X.C1EOY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C292401Bi;
import X.C354201Zc;
import X.C452501pT;
import X.C464950ILd;
import X.C465900IOu;
import X.C468960IaE;
import X.C470590Icr;
import X.C474500IjA;
import X.C477520Io2;
import X.C480460Ism;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501010Jkp;
import X.C501520Jle;
import X.C754700Tj2;
import X.C766270U4b;
import X.C772400URq;
import X.C772410URr;
import X.C772560USg;
import X.C772780UTc;
import X.C773220UUu;
import X.C776270Ucj;
import X.C780470UjV;
import X.C781270Ukn;
import X.C782110Um9;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C924810aAp;
import X.C930700aKK;
import X.C930800aKU;
import X.C930910aKf;
import X.C930930aKh;
import X.C930940aKi;
import X.C931190aL7;
import X.DialogC20690115xj;
import X.DialogC780480UjW;
import X.InterfaceC1106030et7;
import X.InterfaceC19515111Wr;
import X.InterfaceC472150IfN;
import X.InterfaceC743640TFa;
import X.InterfaceC772390URp;
import X.InterfaceC772600USk;
import X.InterfaceC953020auK;
import Y.AcS352S0200000_7;
import Y.AfS181S0100000_12;
import Y.AfS2S0300100_12;
import Y.AfS4S0100100_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingApi;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.BlockStatus;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.room.OneTapGoLiveEvent;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.preview.PrivateAccountDisableGiftSetting;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.CreateInfoRequest;

/* JADX INFO: loaded from: classes13.dex */
public final class OneTapGoLiveManager extends BPEAHandler {
    public static final /* synthetic */ int LLJZ = 0;
    public final Context LL;
    public DialogC780480UjW LLILLJJLI;
    public final LiveMode LLILLL;
    public final boolean LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public Integer LLJI;
    public RoomCreateInfo LLJIJIL;
    public LivePermissionApplyResponse LLJILJIL;
    public boolean LLJILJILJ;
    public Hashtag LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C11NZ<?> LLJJIJIL;
    public final Map<String, Long> LLJJJ;
    public long LLJJJIL;
    public int LLJJJJ;
    public final C501010Jkp LLJJJJJIL;
    public Function0<Unit> LLJJJJLIIL;
    public Bundle LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public WeakReference<Context> LLJLILLLLZIIL;
    public WeakReference<Context> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    public final void LJFF() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            for (C0USV c0usv : (C0USV[]) this.LLJLLIL.getValue()) {
                if (c0usv.LJIILIIL()) {
                    LJJIFFI(jCurrentTimeMillis, "check_intercept");
                    if ((c0usv instanceof C501010Jkp) || (c0usv instanceof C0USJ)) {
                        LJIIIZ();
                        LJJII(0, "login_intercept");
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("check_intercept_");
                        sbLIZ.append(c0usv.LIZ());
                        LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("oneTapGoLive failed,oneTapGoLive intercept by interceptor ");
                    sbLIZ2.append(c0usv);
                    C20441214yg.LJ("OneTapGoLiveManager", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "checkByInterceptors succ");
            LJJIFFI(jCurrentTimeMillis, "check_intercept");
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            C781270Ukn.LJIIL().requestLivePermission(new InterfaceC472150IfN() { // from class: X.0US2
                @Override // X.InterfaceC472150IfN
                public final void onFailed(Throwable th) {
                    String simpleName;
                    this.LIZ.LJJIFFI(jCurrentTimeMillis2, "check_live_permission");
                    OneTapGoLiveManager oneTapGoLiveManager = this.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("host_permission_1_");
                    if (th != null) {
                        simpleName = th.getClass().getSimpleName();
                    } else {
                        simpleName = null;
                    }
                    sbLIZ3.append(simpleName);
                    oneTapGoLiveManager.LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                    C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,requestLivePermission failed for:", th);
                }

                @Override // X.InterfaceC472150IfN
                public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map map) {
                    Boolean boolValueOf;
                    bool2.booleanValue();
                    this.LIZ.LJJIFFI(jCurrentTimeMillis2, "check_live_permission");
                    if (detailLivePermission != null) {
                        try {
                            DataChannelGlobal.LLILZ.JQ2(C168F.class, detailLivePermission);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZ.LJIIL("check_live_permission_exception");
                            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
                            return;
                        }
                    }
                    if (applyLivePermission != null) {
                        DataChannelGlobal.LLILZ.JQ2(C168D.class, applyLivePermission);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("requestLivePermission succeed, canLive:");
                    sbLIZ3.append(bool);
                    sbLIZ3.append(", detailLivePermission:");
                    sbLIZ3.append(detailLivePermission);
                    sbLIZ3.append(", applyLivePermission:");
                    sbLIZ3.append(applyLivePermission);
                    C20441214yg.LJIIIZ("OneTapGoLiveManager", C2188811AlT.LIZIZ(sbLIZ3));
                    C20441214yg.LJIIIZ("OneTapGoLiveManager", "queryLivePermission succ");
                    this.LIZ.getClass();
                    if (OneTapGoLiveManager.LJIJ(applyLivePermission, detailLivePermission)) {
                        this.LIZ.LJIIJJI(applyLivePermission, detailLivePermission);
                        return;
                    }
                    OneTapGoLiveManager oneTapGoLiveManager = this.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("host_permission_2_");
                    Boolean boolValueOf2 = null;
                    if (detailLivePermission == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
                    }
                    sbLIZ4.append(C500260Jjc.LJJJI(boolValueOf));
                    sbLIZ4.append('_');
                    if (applyLivePermission != null) {
                        boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
                    }
                    sbLIZ4.append(C500260Jjc.LJJJI(boolValueOf2));
                    oneTapGoLiveManager.LJIIL(C2188811AlT.LIZIZ(sbLIZ4));
                    C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed,have no live video permission, isCanLiveVideo is false");
                }
            }, "one_tap");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIL("check_intercept_exception");
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
    }

    public final void LJIIIZ() {
        DialogC780480UjW dialogC780480UjW = this.LLILLJJLI;
        if (dialogC780480UjW != null) {
            C500260Jjc.LJJLIIIJL(dialogC780480UjW);
        }
        ((C11NJ) this.LLJLLL.getValue()).LJ();
    }

    public final void LJJIII() {
        String str;
        String str2;
        String string;
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        ImageModel imageModel;
        WeakReference<Context> weakReference;
        Context context;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.LLJLIL && (weakReference = this.LLJLILLLLZIIL) != null && (context = weakReference.get()) != null) {
                if (context instanceof SparkActivity) {
                    ((SparkActivity) context).finish();
                } else {
                    ((IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class)).S82(true);
                }
            }
            C772780UTc.LIZIZ = System.currentTimeMillis();
            Hashtag hashtag = this.LLJILLL;
            if (hashtag != null && C468960IaE.LIZ(hashtag)) {
                C0UKZ.LLJJIJIL.LJFF(Boolean.TRUE);
            }
            RoomCreateInfo roomCreateInfo = this.LLJIJIL;
            if (roomCreateInfo == null || (imageModel = roomCreateInfo.mCover) == null || (str = imageModel.mUri) == null) {
                str = "";
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C930700aKK.class, Long.valueOf((roomCreateInfo == null || (liveEventInfo2 = roomCreateInfo.mLiveEventInfo) == null) ? 0L : liveEventInfo2.id));
            RoomCreateInfo roomCreateInfo2 = this.LLJIJIL;
            dataChannelGlobal.JQ2(C930800aKU.class, Boolean.valueOf(roomCreateInfo2 != null ? roomCreateInfo2.isNewAnchor : false));
            C773220UUu c773220UUu = C773220UUu.LIZ;
            LiveMode liveMode = this.LLILLL;
            c773220UUu.getClass();
            C773220UUu.LJ = liveMode;
            C773220UUu.LJIIL(AFwS245S0000000_12.get$arr$(37));
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "startLiveAfterServerCheck succ");
            C772400URq c772400URq = C772400URq.LIZ;
            C772410URr c772410URr = new C772410URr(this, this.LLILLL);
            String str3 = this.LLJ;
            if (str3 == null || str3.length() == 0) {
                Hashtag hashtag2 = this.LLJILLL;
                str2 = hashtag2 != null ? hashtag2.title : null;
            } else {
                str2 = this.LLJ;
            }
            c772410URr.LIZJ = str2;
            c772410URr.LIZLLL = str;
            c772410URr.LJ = C0UQX.LJFF(this.LLILLL);
            c772410URr.LJFF = 1;
            c772410URr.LJI = this.LLJJ;
            c772410URr.LJII = 1;
            c772410URr.LJIIIZ = this.LLJJI;
            c772410URr.LJIIJ = this.LLJJIII;
            c772410URr.LJIIJJI = this.LLJJIJI;
            c772410URr.LJIIL = false;
            c772410URr.LJIILIIL = null;
            c772410URr.LJIILJJIL = this.LLILZ;
            c772410URr.LJIILL = 0L;
            c772410URr.LJIIIIZZ = (User.sSubPermission && C494680Jac.LJJI()) ? 1L : 2L;
            RoomCreateInfo roomCreateInfo3 = this.LLJIJIL;
            c772410URr.LJIIZILJ = (roomCreateInfo3 == null || (liveEventInfo = roomCreateInfo3.mLiveEventInfo) == null) ? 0L : liveEventInfo.id;
            c772410URr.LJIILLIIL = 0L;
            c772410URr.LJIJ = "";
            c772410URr.LJIJI = 0L;
            c772410URr.LJJIIZ = C494680Jac.LIZJ() ? 1 : 0;
            c772410URr.LJJIIZI = C494680Jac.LJ();
            c772410URr.LJJIJ = C494680Jac.LIZLLL();
            c772410URr.LJJIIZ = C494680Jac.LIZJ() ? 1 : 0;
            c772410URr.LJJIJIIJI = (!C494680Jac.LIZJ() || C494680Jac.LJFF()) ? 0 : 1;
            InterfaceC1106030et7.E4.LJFF(Boolean.TRUE);
            c772410URr.LJJIJLIJ = true;
            c772410URr.LJJIL = !Intrinsics.LJFF(C0KPJ.Je.LIZ(), Boolean.FALSE) && LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview();
            StarCommentConfig starCommentConfig = new StarCommentConfig();
            starCommentConfig.starCommentSwitch = true;
            starCommentConfig.grantGroup = 1;
            starCommentConfig.starCommentQualification = this.LLJJIJIIJIL;
            c772410URr.LJJIZ = starCommentConfig;
            c772410URr.LJJ = new C0USU() { // from class: X.0US0
                @Override // X.C0USU
                public final void LIZ(Room room) throws JSONException {
                    boolean z;
                    int i;
                    String string2;
                    InterfaceC2262081DgM currentUser;
                    this.LIZ.LJJIFFI(jCurrentTimeMillis, "room_create");
                    Function0<Unit> function0 = this.LIZ.LLJJJJLIIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                    OneTapGoLiveManager oneTapGoLiveManager = this.LIZ;
                    dataChannelGlobal2.JQ2(C931040aKs.class, oneTapGoLiveManager.LLIZ);
                    Bundle bundle = oneTapGoLiveManager.LLJJL;
                    if (bundle != null) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("invite_guest_uid_list");
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        if (interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (string2 = Long.valueOf(currentUser.getId()).toString()) == null) {
                            string2 = "";
                        }
                        if (stringArrayList != null) {
                            stringArrayList.remove(string2);
                        }
                        C786410Ut5.LJJJIL(bundle, "invite_guest_uid_list", stringArrayList);
                        bundle.putInt("invite_guest_num", bundle.size());
                    } else {
                        bundle = null;
                    }
                    dataChannelGlobal2.JQ2(C931430aLV.class, bundle);
                    DataChannel dataChannel = new DataChannel();
                    OneTapGoLiveManager oneTapGoLiveManager2 = this.LIZ;
                    dataChannel.zW(LiveModeChannel.class, oneTapGoLiveManager2.LLILLL);
                    RoomCreateInfo roomCreateInfo4 = oneTapGoLiveManager2.LLJIJIL;
                    if (roomCreateInfo4 != null) {
                        dataChannel.zW(RoomCreateInfoChannel.class, roomCreateInfo4);
                    }
                    Bundle bundle2 = oneTapGoLiveManager2.LLJJL;
                    int i2 = 0;
                    int i3 = 1;
                    if (bundle2 != null && bundle2.containsKey("visible_scope_type")) {
                        Bundle bundle3 = oneTapGoLiveManager2.LLJJL;
                        if (bundle3 != null) {
                            i = bundle3.getInt("visible_scope_type");
                        } else {
                            i = 0;
                        }
                        dataChannel.zW(VisibleScopeSelectedChannel.class, new C758220Toi(i, (List) null, (List) null, (List) null, 30));
                    }
                    Bundle bundle4 = oneTapGoLiveManager2.LLJJL;
                    if (bundle4 != null && bundle4.containsKey("auto_approve")) {
                        Bundle bundle5 = oneTapGoLiveManager2.LLJJL;
                        if (bundle5 != null && bundle5.getInt("auto_approve") == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dataChannel.zW(GroupChatGoLiveAutoApproveSwitch.class, Boolean.valueOf(z));
                    }
                    String str4 = this.LIZ.LLIZ;
                    if (str4 != null) {
                        C0IUA.LJIJI = str4;
                    }
                    dataChannelGlobal2.JQ2(C931470aLZ.class, new Pair(Boolean.TRUE, Long.valueOf(room.getId())));
                    Creator creator = room.creator;
                    if (creator != null && creator.roomContinue == 1) {
                        i3 = 2;
                    }
                    dataChannelGlobal2.JQ2(C951930asZ.class, Integer.valueOf(i3));
                    dataChannelGlobal2.JQ2(C1148130fz1.class, Long.valueOf(System.currentTimeMillis()));
                    LiveMode liveMode2 = this.LIZ.LLILLL;
                    Creator creator2 = room.creator;
                    if (creator2 != null) {
                        i2 = creator2.roomContinue;
                    }
                    C0UQX.LJIIJJI(room, liveMode2, dataChannel, i2, false, null, null, null, 0);
                }
            };
            c772410URr.LJJIJIL = 2;
            Bundle bundle = this.LLJJL;
            if (bundle == null || (string = bundle.getString("chat_group_id")) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            c772410URr.LJJJI = CastLongProtector.parseLong(string);
            Bundle bundle2 = this.LLJJL;
            if (bundle2 != null) {
                if (bundle2.containsKey("visible_scope_type")) {
                    int i = bundle2.getInt("visible_scope_type");
                    c772410URr.LJJJIL = Integer.valueOf(i != 3 ? i : 0).intValue();
                }
                if (bundle2.containsKey("auto_approve")) {
                    c772410URr.LJJJJIZL = bundle2.getInt("auto_approve");
                }
            }
            c772400URq.LIZ(c772410URr, "one_tap_go_live");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("room_create_exception_1_");
            sbLIZ.append(th.getMessage());
            LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
    }

    public final void LJII() {
        WeakReference<Context> weakReference;
        Context context;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Activity topActivity = C781270Ukn.LJIIJ().getTopActivity();
            if (topActivity == null && ((weakReference = this.LLJLL) == null || (context = weakReference.get()) == null || (topActivity = C1388190mED.LIZ(context)) == null)) {
                LJIIL("activity_null_1");
            } else {
                C19514711Wn.LIZIZ.LIZIZ(topActivity, CertProviderManagerKt.findCert("bpea-audio_video_permission_onetapgolive", 1476788233)).LIZIZ("android.permission.RECORD_AUDIO", "android.permission.CAMERA").LIZJ(new InterfaceC19515111Wr() { // from class: X.0US3
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                        this.LIZ.LJJIFFI(jCurrentTimeMillis, "check_device_permission");
                        this.LIZ.LJIIL("device_permission_cancel");
                        C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed,has no device permission");
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        boolean z;
                        String simpleName;
                        int length = c0hwoArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (!c0hwoArr[i].LIZ()) {
                                    z = false;
                                    break;
                                }
                                i++;
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            try {
                                simpleName = null;
                                if (Camera.getNumberOfCameras() > 0) {
                                    C20441214yg.LJIIIZ("OneTapGoLiveManager", "checkDevicePermission succ");
                                    this.LIZ.LJJIFFI(jCurrentTimeMillis, "check_device_permission");
                                    final OneTapGoLiveManager oneTapGoLiveManager = this.LIZ;
                                    final Context context2 = oneTapGoLiveManager.LL;
                                    oneTapGoLiveManager.getClass();
                                    final long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    try {
                                        C0UV0 c0uv0 = C0UV0.LiveResource;
                                        if (c0uv0.isInstalled()) {
                                            C20441214yg.LJIIIZ("OneTapGoLiveManager", "checkPluginInstallState succ");
                                            oneTapGoLiveManager.LJJIFFI(jCurrentTimeMillis2, "check_plugin_state");
                                            oneTapGoLiveManager.LJFF();
                                            return;
                                        }
                                        c0uv0.checkInstall(context2, "broadcast", new C0UV1() { // from class: X.0USE
                                            @Override // X.C0UV1
                                            public final void onSuccess() {
                                                C0UV0.LiveResource.load(context2, false);
                                                C20441214yg.LJIIIZ("OneTapGoLiveManager", "checkPluginInstallState succ");
                                                oneTapGoLiveManager.LJJIFFI(jCurrentTimeMillis2, "check_plugin_state");
                                                oneTapGoLiveManager.LJFF();
                                            }
                                        });
                                        return;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        oneTapGoLiveManager.LJIIL("check_plugin_state_exception");
                                        C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,get camera cnt failed,", th2);
                                simpleName = th2.getClass().getSimpleName();
                            }
                            this.LIZ.LJJIFFI(jCurrentTimeMillis, "check_device_permission");
                            this.LIZ.LJIIL("camera_cnt_zero_" + simpleName);
                            C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed,cameraNumber <= 0");
                            return;
                        }
                        this.LIZ.LJJIFFI(jCurrentTimeMillis, "check_device_permission");
                        this.LIZ.LJIIL("device_permission");
                        C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed,has no device permission");
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIL("check_device_permission_exception");
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
    }

    public final void LJIIJ() {
        LJIIIZ();
        ((IHybridContainerManageService) C781270Ukn.LJIIIZ.getValue()).ZP(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL() {
        if (((Boolean) C924810aAp.LJ().LIZIZ).booleanValue()) {
            C766270U4b.LIZLLL(2131840941);
            DataChannelGlobal.LLILZ.FQ2(OneTapGoLiveEvent.class, new C772560USg(this.LLILZIL, Integer.valueOf(this.LLILZLL), 12));
            LJIIJ();
            return;
        }
        if (UserService.getInstance().user().getCurrentUser().getSecret() == 1) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844624));
            LJIIJ();
            return;
        }
        if (!C924810aAp.LJ().LJJIIJZLJL) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844624));
            LJIIJ();
        } else if (C924810aAp.LJ().LJJIIJZLJL) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
                LJIIIZ();
            } else {
                LJIIIIZZ(room, new C0US7(this), new C0USA(this));
            }
        }
    }

    public final void LJJIIJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C11NZ<?> c11nz = this.LLJJIJIL;
        if (c11nz == null) {
            LJII();
        } else {
            ((C11NJ) this.LLJLLL.getValue()).LIZ(c11nz.LJIILIIL(new C0UO0()).LJJLL(new AfS4S0100100_12(jCurrentTimeMillis, this, 6), new AfS4S0100100_12(jCurrentTimeMillis, this, 7)));
        }
    }

    public OneTapGoLiveManager(Context context) {
        super(Looper.getMainLooper());
        this.LL = context;
        this.LLILLL = LiveMode.VIDEO;
        this.LLILZ = true;
        this.LLILZLL = 1;
        this.LLIZLLLIL = 1;
        this.LLJJ = 1;
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJJJIL = new C501010Jkp();
        this.LLJL = true;
        this.LLJLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 175));
        this.LLJLLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(60));
    }

    public final void LJIIL(String str) {
        if (str != null) {
            LJJII(0, str);
        }
        DataChannelGlobal.LLILZ.IQ2(C930910aKf.class);
        LJIIIZ();
        Context topContext = C781270Ukn.LJIIJ().getTopContext();
        if (topContext == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(topContext);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131853930);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131853928));
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131853929), new InterfaceC743640TFa() { // from class: X.0USK
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public final void LJIIZILJ(Uri uri) {
        int i;
        boolean z;
        boolean z2;
        try {
            this.LLJLILLLLZIIL = new WeakReference<>(C781270Ukn.LJIIJ().getTopContext());
            if (this.LLJJJJJIL.LJIILIIL()) {
                return;
            }
            boolean z3 = true;
            if (C0UOQ.LJI) {
                i = 1;
            } else if (!C781270Ukn.LJIILJJIL().QL2()) {
                i = 2;
            } else {
                i = 0;
            }
            this.LLJJJJ = i;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "should_close_room");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                z = Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } else {
                z = false;
            }
            this.LLJJLIIIJLLLLLLLZ = z;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "should_go_live_alert");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                z2 = Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            } else {
                z2 = true;
            }
            this.LLJL = z2;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "should_close_h5_page");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                z3 = Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            }
            this.LLJLIL = z3;
            Context topContext = C781270Ukn.LJIIJ().getTopContext();
            if (topContext == null) {
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "skip");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                LJIILIIL(uri, 0);
                return;
            }
            DialogC20690115xj dialogC20690115xj = new DialogC20690115xj(topContext, uri, i, new C0USD(this));
            dialogC20690115xj.show();
            C785410UrT.LIZIZ(dialogC20690115xj);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC20690115xj);
            C816490W1f.LIZ(dialogC20690115xj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIL(null);
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
    }

    public final void LJIJI(Room room) {
        try {
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "jumpToLive succ");
            C772780UTc.LJ(this.LLILLL, null, Long.valueOf(room.getId()));
            C773220UUu c773220UUu = C773220UUu.LIZ;
            LiveMode liveMode = this.LLILLL;
            c773220UUu.getClass();
            C773220UUu.LJ = liveMode;
            C773220UUu.LJIIL(AFwS245S0000000_12.get$arr$(36));
            LJJI(room);
            LJJII(1, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIL("jump_to_live_exception");
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,failed for:", th);
            C464950ILd.LJI.getClass();
            C464950ILd.LJ(this, 0);
        }
    }

    public final void LJIJJLI(BroadcastSettingResponse broadcastSettingResponse) {
        int i;
        if (broadcastSettingResponse != null) {
            if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount() && PrivateAccountDisableGiftSetting.INSTANCE.enable()) {
                i = 2;
            } else {
                i = broadcastSettingResponse.giftFeature;
            }
            this.LLJJ = i;
            this.LLJJI = broadcastSettingResponse.giftRankSwitchStatus;
            this.LLJJIII = broadcastSettingResponse.friendRankSwitch;
            this.LLJJIJI = broadcastSettingResponse.ecRankSwitchStatus;
        }
    }

    public final boolean LJJ(RoomCreateInfo roomCreateInfo) {
        boolean z;
        boolean z2;
        if (roomCreateInfo != null) {
            this.LLJJIJIIJIL = roomCreateInfo.anchorStarCommentPermission;
            if (roomCreateInfo.mLiveEventInfo.title.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && roomCreateInfo.mLiveEventInfo.id > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJILJILJ = z2;
            Hashtag hashtag = roomCreateInfo.hashtag;
            if (hashtag == null) {
                hashtag = new Hashtag(0L, "", null, 0);
            }
            this.LLJILLL = hashtag;
            C754700Tj2.LJ(hashtag);
            BlockStatus blockStatus = roomCreateInfo.blockStatus;
            if (blockStatus != null && blockStatus.isBlock) {
                C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed, live permission blocked");
                return false;
            }
            InterfaceC1106030et7.A7.LJFF(Integer.valueOf(roomCreateInfo.effectActiveLevel));
        }
        return true;
    }

    public final void LJJI(Room room) {
        long jElapsedRealtime;
        String str;
        WeakReference<Context> weakReference;
        Context context;
        try {
            int i = 2;
            if (this.LLJJJJ == 2) {
                C784440Upu.LIZ().LIZIZ(new C465900IOu(6, 1));
            }
            C1EOY c1eoy = C1EOY.LIZ;
            C1EOY.LJIIIIZZ();
            int i2 = C199800po.LIZ[this.LLILLL.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                }
            } else {
                i = 1;
            }
            LJIIIZ();
            Activity topActivity = C781270Ukn.LJIIJ().getTopActivity();
            if (topActivity == null && ((weakReference = this.LLJLL) == null || (context = weakReference.get()) == null || (topActivity = C1388190mED.LIZ(context)) == null)) {
                LJIIL("activity_null_2");
                return;
            }
            if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLiveBroadcastActivityOnTop()) {
                topActivity.finish();
                C786410Ut5.ae(0, topActivity, 0);
            }
            Intent intentCreateStartBroadcastIntent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).createStartBroadcastIntent((C19EG) topActivity, i);
            if (C354201Zc.LJ(this.LLILLL) || C354201Zc.LIZLLL(this.LLILLL)) {
                InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
            }
            if (this.LLJILJILJ) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = -1;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C931190aL7.class, Long.valueOf(jElapsedRealtime));
            RoomCreateInfo roomCreateInfo = this.LLJIJIL;
            if (roomCreateInfo != null) {
                str = roomCreateInfo.mAdditionalPrompt;
            } else {
                str = null;
            }
            intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
            intentCreateStartBroadcastIntent.putExtra("anchor_layout_type", this.LLILZIL);
            intentCreateStartBroadcastIntent.putExtra("multi_guest_enable", this.LLILZLL);
            intentCreateStartBroadcastIntent.putExtra("is_one_tap_go_live", true);
            dataChannelGlobal.JQ2(C930940aKi.class, room);
            dataChannelGlobal.JQ2(C930930aKh.class, room);
            intentCreateStartBroadcastIntent.addFlags(268435456);
            C776270Ucj.LJIIL = false;
            Context context2 = C781270Ukn.LJIIJJI().context();
            if (context2 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context2);
                C2204961BRm.LJJJJJL(context2, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft1+nzid/DQpCMr69/a3o0G+6a2+YbJhnUJvc=", null));
            }
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "realStartLive succ");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for Exception,", th);
            C464950ILd.LJI.getClass();
            C464950ILd.LJ(this, 0);
            LJIIL("real_start_live_exception");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #1 {all -> 0x018f, blocks: (B:55:0x0143, B:57:0x014c, B:59:0x0156, B:60:0x0158, B:62:0x015e, B:64:0x0162, B:67:0x016b, B:69:0x016f, B:70:0x017e, B:71:0x0183), top: B:77:0x0143 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager.handleMessage(android.os.Message):void");
    }

    public static boolean LJIJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            if (applyLivePermission != null) {
                boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
            }
            if (!C500260Jjc.LJJJI(boolValueOf2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LJIJJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            if (applyLivePermission != null) {
                boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [T, com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse] */
    public final void LJIIJJI(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
        C11NZ<C470590Icr<LivePermissionApplyResponse>> c11nzLJJJJZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        BroadcastRoomApi broadcastRoomApiLIZ = C01QD.LIZ().LIZ();
        CreateInfoRequest createInfoRequest = new CreateInfoRequest();
        createInfoRequest.lastTimeHashtagId = 0L;
        HashMap<String, String> mapLIZ = C0USY.LIZ.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new HashMap<>();
        }
        createInfoRequest.bannerShowStats = mapLIZ;
        HashMap<String, String> mapLIZ2 = C0USY.LIZIZ.LIZ();
        if (mapLIZ2 == null) {
            mapLIZ2 = new HashMap<>();
        }
        createInfoRequest.bannerClickStats = mapLIZ2;
        HashMap<String, String> mapLIZ3 = C0USY.LIZJ.LIZ();
        if (mapLIZ3 == null) {
            mapLIZ3 = new HashMap<>();
        }
        createInfoRequest.bannerCloseStats = mapLIZ3;
        createInfoRequest.isTeen = C781270Ukn.LJIIL().isNeedProtectMinor();
        createInfoRequest.inviterId = 0L;
        createInfoRequest.hasEnteredTryMode = InterfaceC772600USk.zf.LIZIZ().booleanValue();
        C11NZ<C470590Icr<RoomCreateInfo>> previewRoomCreateInfo = broadcastRoomApiLIZ.getPreviewRoomCreateInfo(createInfoRequest);
        if (LJIJJ(applyLivePermission, detailLivePermission)) {
            StringBuffer stringBuffer = new StringBuffer("");
            if (applyLivePermission != null) {
                LJ(applyLivePermission.videoApplyPermission, stringBuffer, "live");
                LJ(applyLivePermission.screenApplyPermission, stringBuffer, "live_by_record");
                LJ(applyLivePermission.obsApplyPermission, stringBuffer, "computer");
            }
            c11nzLJJJJZ = C01QD.LIZ().LIZ().getLivePermissionApply(stringBuffer.toString());
        } else {
            C470590Icr c470590Icr = new C470590Icr();
            c470590Icr.data = new LivePermissionApplyResponse();
            c11nzLJJJJZ = C11NZ.LJJJJZ(c470590Icr);
        }
        C480460Ism.LIZ().getClass();
        ((C11NJ) this.LLJLLL.getValue()).LIZ(C11NZ.LJLLI(previewRoomCreateInfo, c11nzLJJJJZ, ((BroadcastSettingApi) C480460Ism.LIZLLL(BroadcastSettingApi.class)).fetchUserPermission(), new InterfaceC953020auK() { // from class: X.0USH
            @Override // X.InterfaceC953020auK
            public final Object LIZ(Object obj, Object obj2, Object obj3) {
                return new C0US4((C470590Icr) obj, (C470590Icr) obj2, (C470590Icr) obj3);
            }
        }).LJIILIIL(new C0UO0()).LJJLL(new AfS2S0300100_12(this, jCurrentTimeMillis, detailLivePermission, applyLivePermission, 1), new AfS4S0100100_12(jCurrentTimeMillis, this, 14)));
    }

    public final void LJIILIIL(Uri uri, int i) {
        int i2;
        int i3;
        int iValueOf;
        try {
            if (this.LLILLJJLI == null) {
                Context topContext = C781270Ukn.LJIIJ().getTopContext();
                if (topContext == null) {
                    return;
                }
                C780470UjV c780470UjV = new C780470UjV(topContext);
                c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
                this.LLILLJJLI = c780470UjV.LIZ();
            }
            DialogC780480UjW dialogC780480UjW = this.LLILLJJLI;
            if (dialogC780480UjW != null) {
                C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjW);
            }
            this.LLJJJIL = System.currentTimeMillis();
            ((LinkedHashMap) this.LLJJJ).clear();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String host = uri.getHost();
            this.LLILZIL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_layout_type");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_guest_enable");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                i2 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } else {
                i2 = 1;
            }
            this.LLILZLL = i2;
            this.LLIZ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "check_linkmic_permission");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                i3 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            } else {
                i3 = 1;
            }
            this.LLIZLLLIL = i3;
            this.LLJ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mic_count");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                iValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3));
            } else {
                iValueOf = -1;
            }
            this.LLJI = iValueOf;
            if (!TextUtils.isEmpty(strLIZIZ) && !TextUtils.isEmpty(host) && TextUtils.equals(strLIZIZ, "sslocal://") && TextUtils.equals(host, "one_tap_go_live")) {
                DataChannelGlobal.LLILZ.JQ2(C930910aKf.class, new C772560USg(this.LLILZIL, Integer.valueOf(this.LLILZLL), this.LLJI, uri));
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            LJJIIJ();
                            return;
                        }
                        return;
                    }
                    LJIILJJIL();
                    return;
                }
                LJJIIJ();
                return;
            }
            LJIIIZ();
            C766270U4b.LJIIJJI("schema is not available");
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "schema is not available, can not handle");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIL(null);
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
    }

    public final void LJJIFFI(long j, String str) {
        this.LLJJJ.put(str, Long.valueOf(System.currentTimeMillis() - j));
    }

    public final void LJJII(int i, String str) {
        long j;
        String string;
        Bundle bundle = this.LLJJL;
        long jCurrentTimeMillis = 0;
        if (bundle != null) {
            j = bundle.getLong("click_go_live_duration", 0L);
        } else {
            j = 0;
        }
        Bundle bundle2 = this.LLJJL;
        if (bundle2 == null || (string = bundle2.getString("chat_group_id")) == null) {
            string = "";
        }
        Bundle bundle3 = this.LLJJL;
        int i2 = 0;
        if (bundle3 != null) {
            i2 = bundle3.getInt("invite_guest_num", 0);
        }
        if (this.LLJJJIL > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJIL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", String.valueOf(C781270Ukn.LJIIL().getCurUser().getId()));
        linkedHashMap.put("group_chat_id", string);
        linkedHashMap.put("group_member_num", String.valueOf(i2));
        linkedHashMap.put("click_go_live_duration", String.valueOf(j));
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        linkedHashMap.put("latency", String.valueOf(jCurrentTimeMillis));
        if (str != null) {
            linkedHashMap.put("failed_reason", str);
        }
        linkedHashMap.put("metrics", C786410Ut5.J3(new JSONObject(this.LLJJJ)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_group_go_live_process");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void LJ(boolean z, StringBuffer stringBuffer, String str) {
        if (!z) {
            return;
        }
        if (a0.LJJJIL(stringBuffer)) {
            stringBuffer.append(str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(',');
        sbLIZ.append(str);
        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(Room room, Function1<? super Room, Unit> function1, Function1<? super Throwable, Unit> function12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        C480460Ism.LIZ().getClass();
        ((C11NJ) this.LLJLLL.getValue()).LIZ(((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAnchorSelfPermission(room.getId(), iHostAppContext.appId(), iHostAppContext.liveId()).LJFF(new C0UO0()).LJJIIZ(new AfS2S0300100_12(this, jCurrentTimeMillis, function1, room, 0), new AfS181S0100000_12(function12, 65)));
    }

    public final boolean LJIL(LivePermissionApplyResponse livePermissionApplyResponse, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission) {
        Boolean boolValueOf;
        if (!LJIJJ(applyLivePermission, detailLivePermission)) {
            return true;
        }
        if (livePermissionApplyResponse == null) {
            return false;
        }
        Boolean boolValueOf2 = null;
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            if (applyLivePermission != null) {
                boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                LJIIIZ();
                Context topContext = C781270Ukn.LJIIJ().getTopContext();
                if (topContext != null) {
                    C782110Um9 c782110Um9 = new C782110Um9(topContext);
                    c782110Um9.LJIILLIIL = false;
                    c782110Um9.LJIILL = false;
                    c782110Um9.LJIIZILJ(2131840787);
                    c782110Um9.LJII(2131840971);
                    c782110Um9.LJIILIIL(2131840788, new AcS352S0200000_7(topContext, this, 1));
                    c782110Um9.LJIIJ(2131843675, new InterfaceC743640TFa() { // from class: X.0USN
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
                LJJII(0, "show_apply_dialog");
                C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed, show ApplyDialog");
                return false;
            }
        }
        return true;
    }

    public final boolean LJJIIJZLJL(String str, Throwable th, boolean z) {
        C0UOA c0uoaLIZ;
        Integer numValueOf;
        Context topContext = C781270Ukn.LJIIJ().getTopContext();
        if (topContext == null) {
            return false;
        }
        RoomCreateInfo roomCreateInfo = this.LLJIJIL;
        CppAgeVerificationInfo cppAgeVerificationInfo = null;
        if (roomCreateInfo != null) {
            cppAgeVerificationInfo = roomCreateInfo.cppAgeVerificationInfo;
        }
        if ((!(th instanceof C477520Io2) || (numValueOf = Integer.valueOf(((C501520Jle) th).getErrorCode())) == null || numValueOf.intValue() != 4033040 || (c0uoaLIZ = C0UOA.CAN_SUBMIT_AGE_VERIFY_STAGE) == null) && (c0uoaLIZ = C0UOD.LIZ(cppAgeVerificationInfo, z)) == null) {
            return false;
        }
        return C0UOD.LIZJ(topContext, c0uoaLIZ, cppAgeVerificationInfo, "go_live", str, this.LLILLL.logStreamingType, null, z);
    }
}
