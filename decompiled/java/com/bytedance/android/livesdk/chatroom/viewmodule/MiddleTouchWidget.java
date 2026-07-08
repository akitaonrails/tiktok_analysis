package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC19994813Le;
import X.AnonymousClass0956;
import X.C001A;
import X.C011Z;
import X.C01C5;
import X.C08D5;
import X.C098200Yq;
import X.C0IFW;
import X.C0IJT;
import X.C0IK5;
import X.C1091250eVH;
import X.C1098020egC;
import X.C1098060egG;
import X.C1098140egO;
import X.C1098200egU;
import X.C1098210egV;
import X.C1098230egX;
import X.C1098510egz;
import X.C1102070emj;
import X.C1102250en1;
import X.C1107580evc;
import X.C1151890g55;
import X.C1161920gLG;
import X.C11JF;
import X.C1548820qPI;
import X.C1563370qml;
import X.C1843330y4J;
import X.C1871910yoP;
import X.C189200o6;
import X.C19748512Ol;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C354201Zc;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C635860Owq;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC682280QpW;
import X.InterfaceC1059280dfi;
import X.InterfaceC1097170eep;
import X.InterfaceC1098110egL;
import X.InterfaceC1098120egM;
import X.InterfaceC1102300en6;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1541990qEH;
import X.InterfaceC2262081DgM;
import X.InterfaceC499240Jhy;
import X.InterfaceC501410JlT;
import X.InterfaceC520720KbW;
import X.InterfaceC753440Th0;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessSourceWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.MiddleTouchExpandedAreaChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveEffectNotifyCheckParamsSetting;
import com.bytedance.android.livesdk.livesetting.LiveEffectNotifyDelaySetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveGoalIndicatorDestroyOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchBusinessConfigSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchContainerSchemaV2Setting;
import com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchSimplenessEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyAvoidControlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerPlaceholderReportSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkFixSizeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.TextDisplayHybirdReportSetting;
import com.bytedance.android.livesdk.model.UnifyBaseActionData;
import com.bytedance.android.livesdk.model.message.MiddleTouchMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS69S0210000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.IUnifyBaseConfig;
import webcast.api.room.UnifyBaseBusinessResponse;

/* JADX INFO: loaded from: classes18.dex */
public final class MiddleTouchWidget extends PerformProcessSourceWidget implements OnIMMessageListener, InterfaceC1059280dfi, InterfaceC1141530foN, C0IFW {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public ViewGroup LL;
    public C1091250eVH LLILLJJLI;
    public InterfaceC1541990qEH LLILLL;
    public IUnifyBaseConfig LLILZ;
    public InterfaceC1098120egM LLILZIL;
    public InterfaceC1098110egL LLILZLL;
    public InterfaceC753440Th0 LLIZ;
    public InterfaceC501410JlT LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public C11JF LLJI;
    public long LLJIJIL;
    public long LLJJIII;
    public C1098230egX LLJJIJI;
    public final Map<String, InterfaceC1102300en6> LLJILJIL = new LinkedHashMap();
    public final BPEAHandler LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    public final boolean LLJILLL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    public final float LLJJ = C497740JfY.LIZIZ(106.0f);
    public final ViewOnLayoutChangeListenerC1151610g4d LLJJI = new ViewOnLayoutChangeListenerC1151610g4d(this, 8);
    public final C1151890g55 LLJJIJIIJIL = new C1151890g55(CoroutineExceptionHandler.LJJLIL, 0);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i04;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "MiddleTouchWidget";
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0IFW
    public final void pause() {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @Override // X.C0IFW
    public final void resume() {
    }

    public final void D1() {
        View view;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        if (LiveBannerPlaceholderReportSetting.INSTANCE.enable() && (view = this.contentView) != null) {
            view.removeOnLayoutChangeListener(this.LLJJI);
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
        this.LLILLL = null;
    }

    public final void F1() {
        if (!LiveMainFrameworkFixSizeSetting.INSTANCE.enable() || C011Z.LIZ.LJJII()) {
            View view = getView();
            if (view != null) {
                C635860Owq.LIZ(view, 2, 4, 2, 4);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            C635860Owq.LIZIZ(2, 4, 2, -36, view2, this.LLILLJJLI, true);
        }
        C1091250eVH c1091250eVH = this.LLILLJJLI;
        if (c1091250eVH != null) {
            C635860Owq.LIZ(c1091250eVH, 0, 0, 0, 4);
        }
    }

    public final void G1() {
        View view;
        C1091250eVH c1091250eVH;
        if (!LiveMainFrameworkFixSizeSetting.INSTANCE.enable() || C011Z.LIZ.LJJII() || (view = getView()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) C497740JfY.LIZIZ(60.0f);
        layoutParams.width = (int) C497740JfY.LIZIZ(96.0f);
        C786410Ut5.W5(view, layoutParams);
        if (!(view instanceof C1091250eVH) || (c1091250eVH = (C1091250eVH) view) == null) {
            return;
        }
        c1091250eVH.setEnableFixedSize(true);
    }

    public final void O1() {
        IMessageManager iMessageManagerLJJJJLL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(dataChannel)) == null) {
            return;
        }
        iMessageManagerLJJJJLL.addMessageListener(C001A.MIDDLE_TOUCH_MESSAGE.getIntType(), (OnIMMessageListener) this);
    }

    @Override // X.C0IFW
    public final void W() {
        C20441214yg.LJIIIZ("matao-test", "LiveGoal cancel");
        cancel();
    }

    @Override // X.C0IFW
    public final void cancel() {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C11JF c11jf = this.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onViewAttached() {
        super.onViewAttached();
        if (enableAttachOpt()) {
            G1();
            F1();
        }
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        D1();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static C1098200egU A1(C262100zr c262100zr) {
        String strLJFF;
        int iLIZLLL;
        String strLJFF2;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        Integer numValueOf = null;
        if (interfaceC1107590evd != null) {
            int iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd, "biz", 0);
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                int iLIZLLL3 = C1871910yoP.LIZLLL(interfaceC1107590evd2, Scene.SCENE_SERVICE, 0);
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, FollowStatusChangeMethod.PARAM_UID, "")) != null) {
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null) {
                        iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd4, "duration", 0);
                    } else {
                        iLIZLLL = 0;
                    }
                    long j = iLIZLLL;
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null) {
                        strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd5, "container_id", "");
                    } else {
                        strLJFF2 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd6, "consume_method", 0));
                    }
                    return new C1098200egU(strLJFF, iLIZLLL2, iLIZLLL3, j, strLJFF2, numValueOf);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C1(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget.C1(X.05Vn):java.lang.Object");
    }

    public final void E1(C1098200egU c1098200egU) {
        String string;
        Room roomLJJLIIIIJ;
        C1091250eVH c1091250eVH = this.LLILLJJLI;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableFixedSize(false);
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request expand success, middle touch: ");
            sbLIZ.append(c1098200egU);
            x1(C2188811AlT.LIZIZ(sbLIZ));
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int iLIZIZ = (int) C497740JfY.LIZIZ(60.0f);
            if (layoutParams.height != iLIZIZ) {
                layoutParams.height = iLIZIZ;
                C786410Ut5.X5(layoutParams, viewGroup);
            }
            InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
            if (interfaceC1541990qEH != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098200egU.LIZ);
                jSONObject.put("effect_notify_id", c1098200egU.LIZ);
                jSONObject.put(Scene.SCENE_SERVICE, c1098200egU.LIZJ);
                jSONObject.put("biz", c1098200egU.LIZIZ);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                    string = Long.valueOf(roomLJJLIIIIJ.getId()).toString();
                } else {
                    string = null;
                }
                jSONObject.put("room_id", string);
                jSONObject.put("container_id", c1098200egU.LJ);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                interfaceC1541990qEH.LIZ("live_lynx_goal_indicator_event_client_expanded", jSONObject);
            }
            HandlerHook.viewPost(viewGroup, new ARunnableS86S0200000_17(viewGroup, this, 17));
        }
        C1091250eVH c1091250eVH2 = this.LLILLJJLI;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(true);
        }
    }

    public final void H1(C1098200egU c1098200egU) {
        String string;
        Room roomLJJLIIIIJ;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("force shrink, middle touch: ");
            sbLIZ.append(c1098200egU);
            x1(C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098200egU.LIZ);
            jSONObject.put("effect_notify_id", c1098200egU.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098200egU.LIZJ);
            jSONObject.put("biz", c1098200egU.LIZIZ);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                string = Long.valueOf(roomLJJLIIIIJ.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098200egU.LJ);
            jSONObject.put("action", "force_shrink");
            interfaceC1541990qEH.LIZ("live_lynx_goal_indicator_client_force_shrink", jSONObject);
        }
    }

    public final void J1(C262100zr c262100zr) {
        boolean zLJFF;
        int midTouchAudienceDelay;
        boolean z;
        NotifyAvoidRule notifyAvoidRuleLJIILIIL;
        C1098200egU c1098200egUA1 = A1(c262100zr);
        if (c1098200egUA1 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request expand, middle touch: ");
        sbLIZ.append(c1098200egUA1);
        x1(C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveMainFrameworkExpandSetting.INSTANCE.enable()) {
            L1(c1098200egUA1, "not in main framework experiment group", null, false);
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        LiveEffectNotifyDelaySetting liveEffectNotifyDelaySetting = LiveEffectNotifyDelaySetting.INSTANCE;
        if (zLJFF) {
            midTouchAudienceDelay = liveEffectNotifyDelaySetting.getMidTouchAnchorDelay();
        } else {
            midTouchAudienceDelay = liveEffectNotifyDelaySetting.getMidTouchAudienceDelay();
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel2 = this.dataChannel;
        int i = c1098200egUA1.LIZIZ;
        int i2 = c1098200egUA1.LIZJ;
        c1102070emj.getClass();
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        c1102250en1.getClass();
        if (dataChannel2 != null && (notifyAvoidRuleLJIILIIL = C1102250en1.LJIILIIL(dataChannel2, 1, i, i2)) != null) {
            z = notifyAvoidRuleLJIILIIL.timely;
        } else {
            z = false;
        }
        long j = midTouchAudienceDelay;
        if (System.currentTimeMillis() - this.LLJIJIL < j) {
            if (!z) {
                C08D5.LIZIZ(this.LLJILJILJ, new ARunnableS86S0200000_17(this, c262100zr, 18), c1098200egUA1.LIZ, j - (System.currentTimeMillis() - this.LLJIJIL));
                return;
            }
            L1(c1098200egUA1, "performance protection", null, z);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mid touch can expand after ");
            sbLIZ2.append(midTouchAudienceDelay);
            sbLIZ2.append(" ms");
            C20441214yg.LJIIIZ("effect_notify", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c1102250en1.getClass();
        if (!LiveEffectNotifyAvoidControlSetting.enable()) {
            E1(c1098200egUA1);
            return;
        }
        if (!C1102070emj.LJI(this.dataChannel, 1, c1098200egUA1.LIZIZ, c1098200egUA1.LIZJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("rule not found for component(");
            sbLIZ3.append(1);
            sbLIZ3.append(")/biz(");
            sbLIZ3.append(c1098200egUA1.LIZIZ);
            sbLIZ3.append(")/scene(");
            sbLIZ3.append(c1098200egUA1.LIZJ);
            sbLIZ3.append(')');
            L1(c1098200egUA1, C2188811AlT.LIZIZ(sbLIZ3), null, z);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("invalid biz(");
            sbLIZ4.append(c1098200egUA1.LIZIZ);
            sbLIZ4.append(") or scene(");
            sbLIZ4.append(c1098200egUA1.LIZJ);
            sbLIZ4.append("), you must pass a valid biz and scene for component ");
            sbLIZ4.append(1);
            C20441214yg.LJ("effect_notify", C2188811AlT.LIZIZ(sbLIZ4));
            if (this.LLJILLL) {
                if (!LiveEffectNotifyCheckParamsSetting.INSTANCE.enable()) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("invalid biz(");
                    sbLIZ5.append(c1098200egUA1.LIZIZ);
                    sbLIZ5.append(") or scene(");
                    sbLIZ5.append(c1098200egUA1.LIZJ);
                    sbLIZ5.append("), you must pass a valid biz and scene for component ");
                    sbLIZ5.append(1);
                    C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("invalid biz(");
                sbLIZ6.append(c1098200egUA1.LIZIZ);
                sbLIZ6.append(") or scene(");
                sbLIZ6.append(c1098200egUA1.LIZJ);
                sbLIZ6.append("), you must pass a valid biz and scene for component ");
                sbLIZ6.append(1);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
            }
            return;
        }
        if (z && C1102070emj.LJFF(this.dataChannel, 1, c1098200egUA1.LIZIZ, c1098200egUA1.LIZJ)) {
            L1(c1098200egUA1, "conflict", null, z);
            return;
        }
        C1098210egV c1098210egV = new C1098210egV(c1098200egUA1, new AwS418S0200000_17(this, c1098200egUA1, 11), new AwS418S0200000_17(this, c1098200egUA1, 12), new AwS69S0210000_17(this, c1098200egUA1, z, 0));
        this.LLJILJIL.put(c1098200egUA1.LIZ, c1098210egV);
        if (!C1102070emj.LJJ(this.dataChannel, c1098210egV, false, null)) {
            L1(c1098200egUA1, "conflict", null, z);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        String strLJFF3;
        String strLJFF4;
        String strLJFF5;
        Integer numValueOf;
        String strLJFF6;
        Integer numValueOf2;
        Integer numValueOf3;
        boolean z;
        String str;
        String str2;
        String str3;
        int width;
        View view;
        C1098200egU c1098200egUA1;
        C1098200egU c1098200egUA12;
        String strLJFF7;
        C1098200egU c1098200egUA13;
        String str4 = "";
        int iIntValue = 1;
        String string = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_lynx_goal_indicator_client_event")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd, "action", "")) != null) {
                if (Intrinsics.LJFF(strLJFF7, "expand")) {
                    J1(c262100zr);
                    return;
                }
                if (!Intrinsics.LJFF(strLJFF7, "shrink") || (c1098200egUA13 = A1(c262100zr)) == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shrink, middle touch: ");
                sbLIZ.append(c1098200egUA13);
                x1(C2188811AlT.LIZIZ(sbLIZ));
                this.LLJILJILJ.removeCallbacksAndMessages(c1098200egUA13.LIZ);
                C1091250eVH c1091250eVH = this.LLILLJJLI;
                if (c1091250eVH != null) {
                    c1091250eVH.setEnableFixedSize(false);
                }
                ViewGroup viewGroup = this.LL;
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    layoutParams.height = (int) C497740JfY.LIZIZ(24.0f);
                    C786410Ut5.X5(layoutParams, viewGroup);
                }
                C1091250eVH c1091250eVH2 = this.LLILLJJLI;
                if (c1091250eVH2 != null) {
                    c1091250eVH2.setEnableFixedSize(true);
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(MiddleTouchExpandedAreaChannel.class, null);
                }
                if (this.LLJILJIL.remove(c1098200egUA13.LIZ) == null) {
                    return;
                }
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel2 = this.dataChannel;
                String str5 = c1098200egUA13.LIZ;
                Integer num = c1098200egUA13.LJFF;
                if (num != null && num.intValue() != 0) {
                    iIntValue = num.intValue();
                }
                c1102070emj.getClass();
                C1102070emj.LJIIL(dataChannel2, iIntValue, str5);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_effect_notify_ready_event")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && C1871910yoP.LIZLLL(interfaceC1107590evd2, "component", 0) == 1 && (c1098200egUA12 = A1(c262100zr)) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("request marquee, middle touch: ");
                sbLIZ2.append(c1098200egUA12);
                x1(C2188811AlT.LIZIZ(sbLIZ2));
                C1102070emj c1102070emj2 = C1102070emj.LIZ;
                DataChannel dataChannel3 = this.dataChannel;
                int i = c1098200egUA12.LIZIZ;
                int i2 = c1098200egUA12.LIZJ;
                c1102070emj2.getClass();
                if (!C1102070emj.LJI(dataChannel3, 1, i, i2)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("rule not found for component(");
                    sbLIZ3.append(1);
                    sbLIZ3.append(")/biz(");
                    sbLIZ3.append(c1098200egUA12.LIZIZ);
                    sbLIZ3.append(")/scene(");
                    sbLIZ3.append(c1098200egUA12.LIZJ);
                    sbLIZ3.append(')');
                    C20441214yg.LJ("effect_notify", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("rule not found for componen, middle touch: ");
                    sbLIZ4.append(c1098200egUA12);
                    x1(C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                C1098210egV c1098210egV = new C1098210egV(c1098200egUA12, new AwS418S0200000_17(this, c1098200egUA12, 14), new AwS418S0200000_17(this, c1098200egUA12, 15), new AwS383S0200000_17(this, c1098200egUA12, 19));
                this.LLJILJIL.put(c1098200egUA12.LIZ, c1098210egV);
                DataChannel dataChannel4 = this.dataChannel;
                c1102070emj2.getClass();
                C1102070emj.LJJ(dataChannel4, c1098210egV, false, null);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_effect_notify_consumed_event")) {
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null && C1871910yoP.LIZLLL(interfaceC1107590evd3, "component", 0) == 1 && (c1098200egUA1 = A1(c262100zr)) != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("consume marquee, middle touch: ");
                sbLIZ5.append(c1098200egUA1);
                x1(C2188811AlT.LIZIZ(sbLIZ5));
                if (this.LLJILJIL.remove(c1098200egUA1.LIZ) != null) {
                    C1102070emj c1102070emj3 = C1102070emj.LIZ;
                    DataChannel dataChannel5 = this.dataChannel;
                    String str6 = c1098200egUA1.LIZ;
                    Integer num2 = c1098200egUA1.LJFF;
                    if (num2 != null && num2.intValue() != 0) {
                        iIntValue = num2.intValue();
                    }
                    c1102070emj3.getClass();
                    C1102070emj.LJIIL(dataChannel5, iIntValue, str6);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_report_text_display_recv_event") && TextDisplayHybirdReportSetting.INSTANCE.enable()) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
            if (roomLJJLIIIIJ != null) {
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                if (interfaceC1107590evd4 != null) {
                    strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd4, "component_type", "");
                } else {
                    strLJFF3 = null;
                }
                if (Intrinsics.LJFF(strLJFF3, "mid_interaction")) {
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null) {
                        strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd5, "text", "");
                    } else {
                        strLJFF4 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd6, "content_type", "");
                    } else {
                        strLJFF5 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd7 != null) {
                        numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd7, "is_complete_show", 0));
                    } else {
                        numValueOf = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd8 != null) {
                        string = C1871910yoP.LJFF(interfaceC1107590evd8, "incomplete_show_type", "");
                    }
                    InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd9 != null) {
                        strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd9, "sub_business_type", "");
                    } else {
                        strLJFF6 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd10 != null) {
                        numValueOf2 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd10, "character_total_number", 0));
                    } else {
                        numValueOf2 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd11 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd11 != null) {
                        numValueOf3 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd11, "character_show_number", 0));
                    } else {
                        numValueOf3 = null;
                    }
                    InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                    if (currentUser.getId() == roomLJJLIIIIJ.getOwnerUserId()) {
                        z = true;
                        str = "anchor";
                    } else {
                        z = false;
                        if (currentUser.getUserAttr() != null && currentUser.getUserAttr().isAdmin) {
                            str = "admin";
                        } else {
                            str = "viewer";
                        }
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_container_content_show");
                    c474500IjALIZ.LJJII(Long.valueOf(roomLJJLIIIIJ.getOwnerUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(roomLJJLIIIIJ.getId()), "room_id");
                    LiveMode streamType = roomLJJLIIIIJ.getStreamType();
                    if (streamType != null) {
                        str2 = streamType.logStreamingType;
                    } else {
                        str2 = null;
                    }
                    c474500IjALIZ.LJJII(str2, "live_type");
                    if (z) {
                        str3 = "live_take_detail";
                    } else {
                        str3 = "live_detail";
                    }
                    c474500IjALIZ.LJJII(str3, "event_page");
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ.LJJII(strLJFF3, "component_type");
                    c474500IjALIZ.LJJII(strLJFF5, "content_type");
                    c474500IjALIZ.LJJII(C1843330y4J.LIZ(String.valueOf(strLJFF4)).getTypeName(), "language_type");
                    c474500IjALIZ.LJJII(numValueOf2, "character_total_number");
                    c474500IjALIZ.LJJII(numValueOf3, "character_show_number");
                    if (!Intrinsics.LJFF(numValueOf2, numValueOf3)) {
                        str4 = string;
                    }
                    c474500IjALIZ.LJJII(str4, "incomplete_show_type");
                    c474500IjALIZ.LJJII(numValueOf, "is_complete_show");
                    c474500IjALIZ.LJJII(strLJFF6, "sub_business_type");
                    c474500IjALIZ.LJJIFFI(Float.valueOf(C497740JfY.LJJI(C497740JfY.LJIIZILJ())), "device_width");
                    Object obj = this.LLILLL;
                    if ((obj instanceof View) && (view = (View) obj) != null) {
                        width = view.getWidth();
                    } else {
                        width = 0;
                    }
                    c474500IjALIZ.LJJIFFI(Float.valueOf(C497740JfY.LJJI(width)), "component_width");
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd12 = c262100zr.LIZIZ;
        if (interfaceC1107590evd12 != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd12, "unify_base_id", "");
        } else {
            strLJFF = null;
        }
        if (!Intrinsics.LJFF(strLJFF, "3")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd13 = c262100zr.LIZIZ;
        if (interfaceC1107590evd13 != null) {
            strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd13, "room_id", "");
        } else {
            strLJFF2 = null;
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel6)).toString();
        }
        if (strLJFF2 != null && string != null && Intrinsics.LJFF(string, strLJFF2)) {
            String str7 = c262100zr.LIZ;
            int iHashCode = str7.hashCode();
            if (iHashCode != -1651852961) {
                if (iHashCode != 119863366) {
                    if (iHashCode == 1534059915 && str7.equals("unify_base_module_hide_message")) {
                        hide();
                        return;
                    }
                    return;
                }
                if (!str7.equals("unify_base_module_show_message")) {
                    return;
                }
                show();
                return;
            }
            if (!str7.equals("unify_base_module_close_message")) {
                return;
            }
            D1();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1091250eVH c1091250eVH;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.vsu);
        this.LL = viewGroup;
        if (viewGroup instanceof C1091250eVH) {
            c1091250eVH = (C1091250eVH) viewGroup;
        } else {
            c1091250eVH = null;
        }
        this.LLILLJJLI = c1091250eVH;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
        if (!enableAttachOpt()) {
            G1();
            F1();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        Object c098200Yq;
        Object obj = "";
        if (!(iMessage instanceof MiddleTouchMessage)) {
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH == null) {
            String value = LiveMiddleTouchContainerSchemaV2Setting.INSTANCE.getValue();
            C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
            try {
                c098200Yq = C1107580evc.LIZJ(UriProtector.parse(value));
                if (c098200Yq == null) {
                    c098200Yq = "";
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            c1098020egCLIZIZ.LIZ(obj, "container_url");
            c1098020egCLIZIZ.LIZ(value, "container_schema");
            if (value.length() == 0) {
                return;
            }
            y1(B1(value, new AwS418S0200000_17(this, iMessage, 10), new AwS383S0200000_17(this, iMessage, 18), true));
            return;
        }
        MiddleTouchMessage middleTouchMessage = (MiddleTouchMessage) iMessage;
        JSONObject jSONObject = new JSONObject();
        UnifyBaseActionData unifyBaseActionData = middleTouchMessage.actionData;
        String str2 = null;
        if (unifyBaseActionData != null) {
            numValueOf = Integer.valueOf(unifyBaseActionData.unifyBaseId);
        } else {
            numValueOf = null;
        }
        jSONObject.put("unify_base_id", numValueOf);
        UnifyBaseActionData unifyBaseActionData2 = middleTouchMessage.actionData;
        if (unifyBaseActionData2 != null) {
            numValueOf2 = Integer.valueOf(unifyBaseActionData2.action);
        } else {
            numValueOf2 = null;
        }
        jSONObject.put("action", numValueOf2);
        JSONObject jSONObject2 = new JSONObject();
        UnifyBaseActionData unifyBaseActionData3 = middleTouchMessage.actionData;
        if (unifyBaseActionData3 != null) {
            str = unifyBaseActionData3.businessId;
        } else {
            str = null;
        }
        jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, str);
        UnifyBaseActionData unifyBaseActionData4 = middleTouchMessage.actionData;
        if (unifyBaseActionData4 != null) {
            str2 = unifyBaseActionData4.name;
        }
        jSONObject2.put("name", str2);
        jSONObject2.put("extra", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, middleTouchMessage.extra));
        jSONObject.put("business_data", jSONObject2);
        interfaceC1541990qEH.LIZ("unify_base_module_update_message", jSONObject);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        IMessageManager iMessageManagerLJJJJLL;
        C1098230egX c1098230egX;
        String str;
        String strLIZ;
        String str2;
        LiveMode streamType;
        if (LiveBannerPlaceholderReportSetting.INSTANCE.enable() && (c1098230egX = this.LLJJIJI) != null) {
            DataChannel dataChannel = this.dataChannel;
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
            if (c1098230egX.LJ > 0 && (c1098230egX.LJFF > 0 || c1098230egX.LJI > 0)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_mid_load_together");
                c474500IjALIZ.LJIIIIZZ();
                if (zLJIIZILJ) {
                    str = "anchor";
                } else if (C01C5.LIZ(dataChannel)) {
                    str = "admin";
                } else {
                    str = "viewer";
                }
                c474500IjALIZ.LJJII(str, "user_type");
                c474500IjALIZ.LJJII(Integer.valueOf(c1098230egX.LIZJ), "banner_fallback_strategy");
                if (roomLJJLIIIIJ != null && (streamType = roomLJJLIIIIJ.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                } else {
                    strLIZ = null;
                }
                c474500IjALIZ.LJJII(strLIZ, "live_type");
                if (zLJIIZILJ) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_detail";
                }
                c474500IjALIZ.LJJII(str2, "event_page");
                c474500IjALIZ.LJJII(Integer.valueOf(c1098230egX.LIZ ? 1 : 0), "mid_shift");
                c474500IjALIZ.LJJII(Long.valueOf(c1098230egX.LJII), "room_enter_banner_load_duration");
                c474500IjALIZ.LJJII(Long.valueOf(c1098230egX.LJFF), "room_enter_banner_spark_load_duration");
                c474500IjALIZ.LJJII(Long.valueOf(c1098230egX.LIZLLL), "room_enter_mid_touch_duration");
                c474500IjALIZ.LJJII(Long.valueOf(c1098230egX.LJ), "room_enter_mid_touch_spark_duration");
                c474500IjALIZ.LJJII(Long.valueOf(c1098230egX.LJI), "room_enter_banner_placeholder_load_duration");
                c474500IjALIZ.LJJII(Integer.valueOf(c1098230egX.LIZIZ), "mid_touch_load_scene");
                c474500IjALIZ.LIZ();
            }
        }
        InterfaceC1098120egM interfaceC1098120egM = this.LLILZIL;
        if (interfaceC1098120egM != null) {
            interfaceC1098120egM.onUnload();
        }
        InterfaceC1098110egL interfaceC1098110egL = this.LLILZLL;
        if (interfaceC1098110egL != null) {
            interfaceC1098110egL.onUnload();
        }
        C11JF c11jf = this.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (recycleSource == RecycleSource.FROM_CONFIG_CHANGE) {
            InterfaceC753440Th0 interfaceC753440Th0 = this.LLIZ;
            if (interfaceC753440Th0 != null) {
                interfaceC753440Th0.LJJIII();
            }
        } else {
            InterfaceC753440Th0 interfaceC753440Th02 = this.LLIZ;
            if (interfaceC753440Th02 != null) {
                interfaceC753440Th02.onUnload();
            }
            this.LLIZ = null;
        }
        InterfaceC501410JlT interfaceC501410JlT = this.LLIZLLLIL;
        if (interfaceC501410JlT != null) {
            interfaceC501410JlT.LJJ(recycleSource);
        }
        this.LLIZLLLIL = null;
        C1548820qPI.LJIIIIZZ("unify_base_module_show_message", this);
        C1548820qPI.LJIIIIZZ("unify_base_module_show_message_v2", this);
        C1548820qPI.LJIIIIZZ("unify_base_module_hide_message", this);
        C1548820qPI.LJIIIIZZ("unify_base_module_close_message", this);
        C1548820qPI.LJIIIIZZ("live_lynx_goal_indicator_client_event", this);
        C1548820qPI.LJIIIIZZ("live_effect_notify_ready_event", this);
        C1548820qPI.LJIIIIZZ("live_effect_notify_consumed_event", this);
        C1548820qPI.LJIIIIZZ("live_report_text_display_recv_event", this);
        D1();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(dataChannel2)) != null) {
            iMessageManagerLJJJJLL.removeMessageListener((OnIMMessageListener) this);
        }
        this.LLILZ = null;
        C1098060egG.LIZIZ = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        C0IK5.LIZ().removeCallbacksAndMessages(this);
        ((LinkedHashMap) this.LLJILJIL).clear();
        this.LLJILJILJ.removeCallbacksAndMessages(null);
    }

    public final void x1(String str) {
        InterfaceC499240Jhy interfaceC499240JhyHi = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Hi();
        if (interfaceC499240JhyHi != null) {
            ((C1098510egz) interfaceC499240JhyHi).LIZ("MiddleTouchWidget", str);
        }
    }

    public final void y1(View view) {
        View view2;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            viewGroup2.addView(view, -1, -1);
        }
        if (TextDisplayHybirdReportSetting.INSTANCE.enable()) {
            C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS117S0100000_17(this, 72), this, AbstractC19994813Le.Default.nextInt(15000, 90000));
        }
        if (LiveBannerPlaceholderReportSetting.INSTANCE.enable() && (view2 = this.contentView) != null) {
            view2.addOnLayoutChangeListener(this.LLJJI);
        }
    }

    public final void z1(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(i));
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    public static void N1(InterfaceC1541990qEH interfaceC1541990qEH, UnifyBaseBusinessResponse.Data data) {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        if (data == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, data));
        if (LiveMiddleTouchSimplenessEnableSetting.INSTANCE.getValue()) {
            try {
                c098200Yq = new JSONArray(LiveMiddleTouchBusinessConfigSetting.INSTANCE.getValue());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("config");
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("business_config")) != null) {
                jSONObjectOptJSONObject.put("static_data_list", c098200Yq);
            }
        }
        interfaceC1541990qEH.LIZ("unify_base_module_init_message", jSONObject);
    }

    public final void M1(InterfaceC1541990qEH interfaceC1541990qEH, MiddleTouchMessage middleTouchMessage) {
        Object objValueOf;
        String str;
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject();
        UnifyBaseActionData unifyBaseActionData = middleTouchMessage.actionData;
        String str2 = null;
        if (unifyBaseActionData != null) {
            objValueOf = Integer.valueOf(unifyBaseActionData.unifyBaseId);
        } else {
            objValueOf = null;
        }
        jSONObject.put("unify_base_id", objValueOf);
        IUnifyBaseConfig iUnifyBaseConfig = this.LLILZ;
        if (iUnifyBaseConfig != null) {
            JSONObject jSONObject2 = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, iUnifyBaseConfig));
            if (LiveMiddleTouchSimplenessEnableSetting.INSTANCE.getValue()) {
                try {
                    c098200Yq = new JSONArray(LiveMiddleTouchBusinessConfigSetting.INSTANCE.getValue());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("business_config");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("static_data_list", c098200Yq);
                }
            }
            jSONObject.put("config", jSONObject2);
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        UnifyBaseActionData unifyBaseActionData2 = middleTouchMessage.actionData;
        if (unifyBaseActionData2 != null) {
            str = unifyBaseActionData2.businessId;
        } else {
            str = null;
        }
        jSONObject3.put(FollowStatusChangeMethod.PARAM_UID, str);
        UnifyBaseActionData unifyBaseActionData3 = middleTouchMessage.actionData;
        if (unifyBaseActionData3 != null) {
            str2 = unifyBaseActionData3.name;
        }
        jSONObject3.put("name", str2);
        jSONObject3.put("extra", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, middleTouchMessage.extra));
        jSONArray.put(jSONObject3);
        jSONObject.put("business_data_list", jSONArray);
        interfaceC1541990qEH.LIZ("unify_base_module_init_message", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a4  */
    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r8, java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }

    public final void I1(String str, C1098200egU c1098200egU, String str2) {
        String string;
        Room roomLJJLIIIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post marquee event, middle touch: ");
        sbLIZ.append(c1098200egU);
        sbLIZ.append(", event: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str2);
        x1(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098200egU.LIZ);
            jSONObject.put("effect_notify_id", c1098200egU.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098200egU.LIZJ);
            jSONObject.put("biz", c1098200egU.LIZIZ);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                string = Long.valueOf(roomLJJLIIIIJ.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098200egU.LJ);
            jSONObject.put("component", 1);
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            interfaceC1541990qEH.LIZ(str, jSONObject);
        }
    }

    public final View B1(String str, Function0 function0, Function1 function1, boolean z) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        Fragment fragment;
        C19EG activity;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1098060egG c1098060egG = C1098060egG.LIZ;
        C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
        if (z) {
            c1098020egCLIZIZ.LIZ("message", "create_from");
        } else {
            c1098020egCLIZIZ.LIZ("init_api", "create_from");
        }
        c1098020egCLIZIZ.LIZ(2, "is_new_indicator");
        c1098020egCLIZIZ.LJII = jCurrentTimeMillis;
        c1098020egCLIZIZ.LIZJ = str;
        Context context = this.context;
        if (context == null) {
            return null;
        }
        C1098140egO c1098140egO = new C1098140egO(context, str, this, z, function1, function0);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            interfaceC1541990qEH = (InterfaceC1541990qEH) C1563370qml.LIZ(activity, EnumC682280QpW.MAIN, new AwS561S0100000_17(c1098140egO, 301));
        } else {
            interfaceC1541990qEH = (InterfaceC1541990qEH) c1098140egO.invoke();
        }
        if (interfaceC1541990qEH == null) {
            return null;
        }
        InterfaceC520720KbW interfaceC520720KbW = (InterfaceC520720KbW) interfaceC1541990qEH.getHybridContext().LJFF(InterfaceC520720KbW.class);
        if (interfaceC520720KbW != null) {
            long roomId = interfaceC520720KbW.getRoomId();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && C500260Jjc.LJJLIIIJ(dataChannel) != roomId) {
                c1098060egG.LJII();
                if (LiveGoalIndicatorDestroyOptimizeSetting.INSTANCE.getValue()) {
                    interfaceC1541990qEH.LLD(true);
                    return null;
                }
            }
        }
        return interfaceC1541990qEH.e1();
    }

    public final void L1(C1098200egU c1098200egU, String str, Integer num, boolean z) {
        Object string;
        Room roomLJJLIIIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request expand faled, middle touch: ");
        sbLIZ.append(c1098200egU);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", frequencyControlledFailedReason: ");
        sbLIZ.append(num);
        sbLIZ.append(", isTimely: ");
        sbLIZ.append(z);
        x1(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098200egU.LIZ);
            jSONObject.put("effect_notify_id", c1098200egU.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098200egU.LIZJ);
            jSONObject.put("biz", c1098200egU.LIZIZ);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                string = Long.valueOf(roomLJJLIIIIJ.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098200egU.LJ);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
            jSONObject.put("is_timely", z ? 1 : 0);
            if (str != null) {
                jSONObject.put("faild_reason", str);
            }
            if (num != null) {
                num.intValue();
                jSONObject.put("frequency_controlled_reason", num.intValue());
            }
            interfaceC1541990qEH.LIZ("live_lynx_goal_indicator_event_client_expanded", jSONObject);
        }
    }
}
