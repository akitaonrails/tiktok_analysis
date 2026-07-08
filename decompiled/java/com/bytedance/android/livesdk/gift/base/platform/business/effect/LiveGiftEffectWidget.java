package com.bytedance.android.livesdk.gift.base.platform.business.effect;

import X.AnonymousClass0956;
import X.C001A;
import X.C0KVU;
import X.C0PEM;
import X.C1128450fTH;
import X.C1133130fap;
import X.C1135260feG;
import X.C1135270feH;
import X.C1135280feI;
import X.C1135810ff9;
import X.C1136140ffg;
import X.C1136280ffu;
import X.C1136290ffv;
import X.C1136500fgG;
import X.C1136640fgU;
import X.C1136940fgy;
import X.C1137020fh6;
import X.C1137700fiC;
import X.C1138010fih;
import X.C1138310fjB;
import X.C1138320fjC;
import X.C1138600fje;
import X.C1138640fji;
import X.C1139440fl0;
import X.C1139680flO;
import X.C1140490fmh;
import X.C1161920gLG;
import X.C118200ce;
import X.C11NJ;
import X.C176600m4;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2836017y;
import X.C500260Jjc;
import X.C766270U4b;
import X.C776250Uch;
import X.C784440Upu;
import X.EnumC586430MzJ;
import X.InterfaceC1136810fgl;
import X.InterfaceC1138060fim;
import X.InterfaceC1139410fkx;
import X.InterfaceC1140970fnT;
import Y.AfS186S0100000_17;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.ShowGiftChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomOwnerWindowStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.ShowGiftGeneralTrayMessageEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VideoViewTransformChanged;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.base.platform.core.send.SendGiftBySenderEvent;
import com.bytedance.android.livesdk.livesetting.gift.GiftDevicePerformanceScoreSettings;
import com.bytedance.android.livesdk.livesetting.gift.GiftEffectObserveLiveRoomEventSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftEffectWidget extends LiveWidget implements InterfaceC1136810fgl {
    public static C1135810ff9 lastLiveGeneralGiftMessage;
    public C1135810ff9 currentTrayMessage;
    public C1136290ffv giftEffectLayoutHelper;
    public boolean isEffectPlaying;
    public C118200ce liveRoomEventObserver;
    public Room room;
    public int showErrorToast;
    public static final C1137700fiC Companion = new Object() { // from class: X.0fiC
    };
    public static final int $stable = 8;
    public final C11NJ widgetCompositeDisposable = new C11NJ();
    public final C11NJ compositeDisposable = new C11NJ();
    public final C1136280ffu renderRequestHelper = new C1136280ffu(this);

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hup;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final String getSuffix() {
        C1135810ff9 c1135810ff9 = this.currentTrayMessage;
        return c1135810ff9 != null ? c1135810ff9.LJJJLIIL ? "_self" : c1135810ff9.LJJJLL ? "_anchor" : C1128450fTH.LJJIJ() ? "_guest" : "" : "";
    }

    private final void initData() {
        DataChannel dataChannel = this.dataChannel;
        this.room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        DataChannel dataChannel2 = this.dataChannel;
        Object objGg0 = dataChannel2 != null ? dataChannel2.gg0(UserIsAnchorChannel.class) : null;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(ShowGiftGeneralTrayMessageEvent.class, this, new AwS596S0100000_17(this, 121));
            dataChannel3.CQ2(SendGiftBySenderEvent.class, this, AFwS254S0000000_17.get$arr$(47));
        }
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getPreloadAssetsModel()) {
            if (C1138010fih.LIZ <= 0.0f) {
                C1138010fih.LIZ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1().LJ();
            }
            if (C1138010fih.LIZ >= GiftDevicePerformanceScoreSettings.INSTANCE.getValue().highEndLowestScore) {
                DataChannel dataChannel4 = this.dataChannel;
                if (C176600m4.LIZIZ(dataChannel4 != null ? Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel4)) : null) || C2836017y.LIZJ(2592000000L)) {
                    this.compositeDisposable.LIZ(C784440Upu.LIZ().LJ(C1133130fap.class).LJJLJLI(new AfS186S0100000_17(this, 38)));
                }
            }
        }
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        Room room = this.room;
        boolean zLJFF = Intrinsics.LJFF(objGg0, Boolean.TRUE);
        c1136280ffu.LIZIZ = room;
        c1136280ffu.LIZJ = zLJFF;
        C118200ce c118200ce = new C118200ce();
        this.liveRoomEventObserver = c118200ce;
        DataChannel dataChannel5 = this.dataChannel;
        if (C500260Jjc.LJIIZILJ(dataChannel5)) {
            if (!GiftEffectObserveLiveRoomEventSetting.INSTANCE.isEnableAnchorSide()) {
                return;
            }
        } else if (!GiftEffectObserveLiveRoomEventSetting.INSTANCE.isEnableViewerSide()) {
            return;
        }
        c118200ce.LL = dataChannel5;
        Map<Integer, Set<C1140490fmh>> map = C1139440fl0.LL;
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel5);
        if (C1139440fl0.LLILZIL != jLJJLIIIJ) {
            ((LinkedHashMap) C1139440fl0.LL).clear();
            ((LinkedHashMap) C1139440fl0.LLILLJJLI).clear();
        }
        C1139440fl0.LLILZIL = jLJJLIIIJ;
        if (dataChannel5 != null) {
            IMessageManager iMessageManager = (IMessageManager) dataChannel5.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.GIFT.getIntType(), c118200ce);
            }
            IMessageManager iMessageManager2 = (IMessageManager) dataChannel5.gg0(C776250Uch.class);
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.CHAT.getIntType(), c118200ce);
            }
            IMessageManager iMessageManager3 = (IMessageManager) dataChannel5.gg0(C776250Uch.class);
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(C001A.SOCIAL.getIntType(), c118200ce);
            }
            IMessageManager iMessageManager4 = (IMessageManager) dataChannel5.gg0(C776250Uch.class);
            if (iMessageManager4 != null) {
                iMessageManager4.addMessageListener(C001A.LIKE.getIntType(), c118200ce);
            }
        }
    }

    private final boolean isEffectPlaying() {
        if (this.isEffectPlaying) {
            return true;
        }
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        AnonymousClass0956 anonymousClass0956 = c1136280ffu.LJI;
        return C500260Jjc.LJJJI(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null) || c1136280ffu.LJII != null;
    }

    public long getGiftId() {
        C1135810ff9 c1135810ff9 = this.currentTrayMessage;
        if (c1135810ff9 != null) {
            return c1135810ff9.LJJJJZ;
        }
        return 0L;
    }

    @Override // X.InterfaceC1136810fgl
    public int getGiftType() {
        C1135810ff9 c1135810ff9 = this.currentTrayMessage;
        if (c1135810ff9 == null || c1135810ff9.LIZ == null) {
            return 0;
        }
        Gift giftFindGiftById = c1135810ff9.LIZ.mGift;
        if (giftFindGiftById == null && (giftFindGiftById = GiftManager.inst().findGiftById(c1135810ff9.LIZ.giftId)) == null) {
            return 0;
        }
        return giftFindGiftById.type;
    }

    @Override // X.InterfaceC1136810fgl
    public void onVideoFinished() {
        C20441214yg.LJIIIZ("VideoGiftWidget_ttlive_gift_render", "onVideoFinished");
        setShowErrorToast(0);
        C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fik
        });
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(ShowGiftChannel.class, Boolean.FALSE);
        }
        this.isEffectPlaying = false;
    }

    @Override // X.InterfaceC1136810fgl
    public void stopVideoPlay() {
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        c1136280ffu.getClass();
        C20441214yg.LJIIIZ("RenderRequestHelper_ttlive_gift_render", "stopPlay");
        AnonymousClass0956 anonymousClass0956 = c1136280ffu.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1136280ffu.LJI = null;
        InterfaceC1138060fim interfaceC1138060fim = c1136280ffu.LJII;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1136280ffu.LJII = null;
    }

    private final void initView() {
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        KeyEvent.Callback callbackFindViewById = contentView.findViewById(R.id.t6_);
        KeyEvent.Callback callbackFindViewById2 = contentView.findViewById(R.id.t69);
        c1136280ffu.getClass();
        c1136280ffu.LIZLLL = callbackFindViewById instanceof InterfaceC1140970fnT ? (InterfaceC1140970fnT) callbackFindViewById : null;
        C1136290ffv.LJII = new WeakReference<>(c1136280ffu.LIZLLL);
        c1136280ffu.LJ = callbackFindViewById2 instanceof InterfaceC1140970fnT ? (InterfaceC1140970fnT) callbackFindViewById2 : null;
        this.giftEffectLayoutHelper = new C1136290ffv();
        C1136290ffv c1136290ffv = this.giftEffectLayoutHelper;
        if (c1136290ffv != null) {
            DataChannel dataChannel = this.dataChannel;
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 137);
            c1136290ffv.LIZ = dataChannel;
            C1136290ffv.LJI = new WeakReference<>(c1136290ffv);
            c1136290ffv.LIZIZ = this;
            if (dataChannel != null) {
                dataChannel.DQ2(MultiLiveRTCLayoutChannel.class, c1136290ffv, new AwS596S0100000_17(c1136290ffv, 397));
                dataChannel.DQ2(LinkCrossRoomOwnerWindowStateChangeEvent.class, c1136290ffv, new AwS383S0200000_17(c1136290ffv, awS561S0100000_17, 76));
                dataChannel.DQ2(VideoViewTransformChanged.class, c1136290ffv, new AwS596S0100000_17(c1136290ffv, 398));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" onCreate");
        C20441214yg.LJIIIZ("VideoGiftWidget_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        initData();
        initView();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" onDestroy");
        C20441214yg.LJIIIZ("VideoGiftWidget_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        lastLiveGeneralGiftMessage = null;
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        c1136280ffu.getClass();
        C20441214yg.LJIIIZ("RenderRequestHelper_ttlive_gift_render", "onDestroy");
        AnonymousClass0956 anonymousClass0956 = c1136280ffu.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1136280ffu.LJI = null;
        InterfaceC1138060fim interfaceC1138060fim = c1136280ffu.LJII;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1136280ffu.LJII = null;
        this.widgetCompositeDisposable.LJ();
        this.compositeDisposable.dispose();
        C1136290ffv c1136290ffv = this.giftEffectLayoutHelper;
        if (c1136290ffv != null) {
            DataChannel dataChannel2 = c1136290ffv.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c1136290ffv);
            }
            ((ArrayList) c1136290ffv.LIZJ).clear();
            c1136290ffv.LIZLLL.setEmpty();
            c1136290ffv.LJ = null;
            c1136290ffv.LIZ = null;
        }
        this.giftEffectLayoutHelper = null;
        C118200ce c118200ce = this.liveRoomEventObserver;
        if (c118200ce != null) {
            DataChannel dataChannel3 = c118200ce.LL;
            if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(c118200ce);
            }
            c118200ce.LLILLJJLI.clear();
            Map<Integer, Set<C1140490fmh>> map = C1139440fl0.LL;
            if (C1139440fl0.LLILZIL == C500260Jjc.LJJLIIIJ(c118200ce.LL)) {
                C1139440fl0.LLILZIL = 0L;
            }
            if (C1139440fl0.LLILZIL == 0) {
                ((LinkedHashMap) C1139440fl0.LL).clear();
                ((LinkedHashMap) C1139440fl0.LLILLJJLI).clear();
            }
        }
        this.liveRoomEventObserver = null;
    }

    @Override // X.InterfaceC1136810fgl
    public View getContentView() {
        return this.contentView;
    }

    @Override // X.InterfaceC1136810fgl
    public DataChannel getDataChannel() {
        return this.dataChannel;
    }

    @Override // X.InterfaceC1136810fgl
    public int getShowErrorToast() {
        return this.showErrorToast;
    }

    private final void consumeMessage(C1135810ff9 c1135810ff9) {
        Room room;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" consumeMessage, message = ");
        sbLIZ.append(giftMessage);
        C20441214yg.LJIIIZ("VideoGiftWidget_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        if (giftMessage != null && (room = this.room) != null) {
            C1135280feI c1135280feILIZJ = c1135810ff9.LJJLIIJ;
            if (c1135280feILIZJ == null && (c1135280feILIZJ = C1135260feG.LIZJ(giftMessage, room.getOwner())) == null) {
                C1136140ffg c1136140ffg = C1136940fgy.LIZ;
                String suffix = getSuffix();
                int showErrorToast = getShowErrorToast();
                int giftType = getGiftType();
                c1136140ffg.getClass();
                C1136140ffg.LIZIZ(-10, showErrorToast, giftType, suffix, "Effect Message is Null");
                onVideoFinished();
                return;
            }
            initMonitorData(c1135810ff9, giftMessage);
            AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feILIZJ.LJFF);
            if (assetsModelLIZLLL == null) {
                C1136140ffg c1136140ffg2 = C1136940fgy.LIZ;
                String suffix2 = getSuffix();
                int showErrorToast2 = getShowErrorToast();
                int giftType2 = getGiftType();
                c1136140ffg2.getClass();
                C1136140ffg.LIZIZ(-11, showErrorToast2, giftType2, suffix2, "assetsModel is Null");
                onVideoFinished();
                return;
            }
            renderWithSDK(c1135280feILIZJ, giftMessage, assetsModelLIZLLL, c1135810ff9.LJLI);
            return;
        }
        C1136140ffg c1136140ffg3 = C1136940fgy.LIZ;
        String suffix3 = getSuffix();
        int errorCode = EnumC586430MzJ.GIFT_MESSAGE_NULL.getErrorCode();
        int showErrorToast3 = getShowErrorToast();
        int giftType3 = getGiftType();
        c1136140ffg3.getClass();
        C1136140ffg.LIZIZ(errorCode, showErrorToast3, giftType3, suffix3, "Gift Message is Null");
        onVideoFinished();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:17:0x0022, B:20:0x002f, B:28:0x004d, B:27:0x0048, B:26:0x0042, B:25:0x003c), top: B:33:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reportWidgetUnloadedEvent(X.C1135810ff9 r7) {
        /*
            r6 = this;
            X.0ff9 r0 = com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveGiftEffectWidget.lastLiveGeneralGiftMessage
            r3 = 1
            if (r7 != r0) goto L20
            r4 = 1
        L6:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L13
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            if (r0 == 0) goto L13
            r3 = 0
        L13:
            if (r4 != 0) goto L22
            if (r3 != 0) goto L22
            boolean r0 = r6.isEffectPlaying()
            if (r0 != 0) goto L22
            com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveGiftEffectWidget.lastLiveGeneralGiftMessage = r7
            return
        L20:
            r4 = 0
            goto L6
        L22:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            boolean r0 = r6.isEffectPlaying()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "type"
            if (r0 == 0) goto L35
            java.lang.String r0 = "gift_effect_widget_parallel_render_error"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L8d
            goto L4d
        L35:
            if (r4 == 0) goto L3a
            if (r3 == 0) goto L42
            goto L48
        L3a:
            if (r3 == 0) goto L42
            java.lang.String r0 = "gift_effect_widget_room_invalid_error"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L8d
            goto L4d
        L42:
            java.lang.String r0 = "gift_effect_widget_duplicate_msg_error"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L8d
            goto L4d
        L48:
            java.lang.String r0 = "gift_effect_widget_room_invalid_duplicate_msg_error"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L8d
        L4d:
            java.lang.String r2 = "gift_core_monitor"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            X.C1CC2.LJ(r2, r5, r1, r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "VideoGiftWidget_ttlive_gift_render"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8d
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L8d
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = " reportWidgetUnloadedEvent, isDuplicateMsg:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            r1.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = ", isRoomInvalid:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            r1.append(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = ", isEffectPlaying:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            boolean r0 = r6.isEffectPlaying()     // Catch: java.lang.Throwable -> L8d
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8d
            X.C20441214yg.LJ(r2, r0)     // Catch: java.lang.Throwable -> L8d
            return
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveGiftEffectWidget.reportWidgetUnloadedEvent(X.0ff9):void");
    }

    public final void onGiftMessage(C1135810ff9 c1135810ff9) {
        try {
            reportWidgetUnloadedEvent(c1135810ff9);
            this.isEffectPlaying = true;
            this.currentTrayMessage = c1135810ff9;
            if (c1135810ff9.LIZ != null) {
                consumeMessage(c1135810ff9);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("VideoGiftWidget_ttlive_gift_render", "consumeMessage flow crash", th);
            onVideoFinished();
            HashMap map = new HashMap();
            map.put("log_id", String.valueOf(c1135810ff9.LJIIZILJ));
            map.put("gift_id", String.valueOf(c1135810ff9.LJJJJZ));
            C1136500fgG.LIZ("gift_effect_widget_consume_msg_error", map, th, false);
        }
    }

    @Override // X.InterfaceC1136810fgl
    public void onShowVideoError(C1135280feI c1135280feI) {
        C20441214yg.LJIIIZ("VideoGiftWidget_ttlive_gift_render", "onShowVideoError");
        if (this.giftEffectLayoutHelper != null) {
            String strLJ = C0KVU.LJ(c1135280feI.LJIIIZ);
            if (c1135280feI.LJIILJJIL && !TextUtils.isEmpty(c1135280feI.LIZIZ)) {
                C766270U4b.LJII(2131841929, c1135280feI.LIZIZ, strLJ);
                setShowErrorToast(1);
            }
        }
    }

    public void setShowErrorToast(int i) {
        this.showErrorToast = i;
    }

    private final void initMonitorData(C1135810ff9 c1135810ff9, GiftMessage giftMessage) {
        long j;
        long j2;
        long jLIZJ;
        int i;
        long id;
        int i2;
        boolean z;
        String str;
        GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
        long jLIZJ2 = C1135270feH.LIZJ(giftMessage);
        boolean zLJII = C1138640fji.LJII(null, Long.valueOf(jLIZJ2));
        long j3 = c1135810ff9.LJJIIJ;
        if (giftMonitorInfo != null) {
            j = giftMonitorInfo.sendGiftStartClientLocalMs;
            j2 = c1135810ff9.LJJIII - giftMonitorInfo.send_gift_req_start_ms;
        } else {
            j = 0;
            j2 = 0;
        }
        long j4 = c1135810ff9.LJJIIJZLJL;
        long j5 = j4 - c1135810ff9.LJJIII;
        long j6 = c1135810ff9.LJJIIZ - j4;
        long j7 = c1135810ff9.LJJIIZI;
        if (giftMessage.LL) {
            jLIZJ = giftMessage.giftId;
        } else {
            jLIZJ = C1135270feH.LIZJ(giftMessage);
        }
        String strLJ = C1138640fji.LJ(jLIZJ, null);
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(jLIZJ2);
        if (assetsModelLIZLLL != null) {
            i = assetsModelLIZLLL.resourceType;
        } else {
            i = 0;
        }
        User user = giftMessage.toUser;
        if (user != null) {
            id = user.getId();
        } else {
            GiftMonitorInfo giftMonitorInfo2 = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo2 != null) {
                id = giftMonitorInfo2.to_user_id;
            } else {
                id = 0;
            }
        }
        ConcurrentHashMap<String, String> concurrentHashMapLIZ = c1135810ff9.LJJLIL;
        if (concurrentHashMapLIZ == null) {
            concurrentHashMapLIZ = C1137020fh6.LIZ(giftMessage);
            if (zLJII) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            concurrentHashMapLIZ.put("effect_load_status", str);
        }
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        long messageId = giftMessage.getMessageId();
        String str2 = giftMessage.mLogId;
        boolean z2 = giftMessage.LLILLL;
        String desc = C1128450fTH.LJIIJ().getDesc();
        C1135810ff9 c1135810ff92 = this.currentTrayMessage;
        if (c1135810ff92 != null) {
            if (c1135810ff92.LJJIJIL == 0) {
                i2 = 2;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        HashMap<String, Long> map = c1135810ff9.LJJJJIZL.LIZJ;
        if (id != 0 && id == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        c1136280ffu.getClass();
        c1136280ffu.LJFF = new C1138600fje(i2, i, messageId, j3, j, j2, j5, j6, j7, str2, desc, strLJ, map, concurrentHashMapLIZ, z2, zLJII, z);
    }

    private final void renderWithSDK(C1135280feI c1135280feI, GiftMessage giftMessage, AssetsModel assetsModel, InterfaceC1139410fkx interfaceC1139410fkx) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        ConcurrentHashMap<String, String> concurrentHashMap2;
        ConcurrentHashMap<String, String> concurrentHashMap3;
        ConcurrentHashMap<String, String> concurrentHashMap4;
        if (assetsModel == null) {
            onShowVideoError(c1135280feI);
            C1136140ffg c1136140ffg = C1136940fgy.LIZ;
            String suffix = getSuffix();
            int showErrorToast = getShowErrorToast();
            int giftType = getGiftType();
            c1136140ffg.getClass();
            C1136140ffg.LIZIZ(-11, showErrorToast, giftType, suffix, "assetModel is Null");
            onVideoFinished();
            return;
        }
        C1136280ffu c1136280ffu = this.renderRequestHelper;
        c1136280ffu.getClass();
        if (c1135280feI != null) {
            boolean z = c1135280feI.LJIILJJIL;
            C1136940fgy.LIZ.getClass();
            int iLIZ = C1136140ffg.LIZ();
            IInteractService iInteractService = C1128450fTH.LIZ;
            boolean zLJJII = C1128450fTH.LJJII(UserService.getInstance().user().getCurrentUserId());
            if (z) {
                C1138600fje c1138600fje = c1136280ffu.LJFF;
                if (c1138600fje != null) {
                    concurrentHashMap4 = c1138600fje.LJIIZILJ;
                } else {
                    concurrentHashMap4 = null;
                }
                C1136640fgU.LIZ(assetsModel, c1135280feI, "_self", concurrentHashMap4);
            } else if (iLIZ == 1) {
                C1138600fje c1138600fje2 = c1136280ffu.LJFF;
                if (c1138600fje2 != null) {
                    concurrentHashMap2 = c1138600fje2.LJIIZILJ;
                } else {
                    concurrentHashMap2 = null;
                }
                C1136640fgU.LIZ(assetsModel, c1135280feI, "_anchor", concurrentHashMap2);
            } else if (zLJJII) {
                C1138600fje c1138600fje3 = c1136280ffu.LJFF;
                if (c1138600fje3 != null) {
                    concurrentHashMap = c1138600fje3.LJIIZILJ;
                } else {
                    concurrentHashMap = null;
                }
                C1136640fgU.LIZ(assetsModel, c1135280feI, "_guest", concurrentHashMap);
            }
            C1138600fje c1138600fje4 = c1136280ffu.LJFF;
            if ((c1138600fje4 == null || !GiftEventTrackSamplingSetting.shouldBlock(C500260Jjc.LJJJI(Boolean.valueOf(c1138600fje4.LJIILL)))) && (!GiftEventTrackSamplingSetting.enable() || (!z && iLIZ != 1 && !zLJJII))) {
                C1138600fje c1138600fje5 = c1136280ffu.LJFF;
                if (c1138600fje5 != null) {
                    concurrentHashMap3 = c1138600fje5.LJIIZILJ;
                } else {
                    concurrentHashMap3 = null;
                }
                C1136640fgU.LIZ(assetsModel, c1135280feI, "", concurrentHashMap3);
            }
        }
        C1138310fjB c1138310fjB = new C1138310fjB(CoroutineExceptionHandler.LJJLIL, c1136280ffu, giftMessage, c1135280feI);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c1136280ffu.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        c1136280ffu.LJI = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII().plus(new C1138320fjC("RenderRequestHelper_ttlive_gift_render")).plus(c1138310fjB), null, new C1139680flO(assetsModel, c1136280ffu, c1135280feI, giftMessage, interfaceC1139410fkx, null), 2);
    }
}
