package com.bytedance.android.livesdk.comp.impl.subscription.widget;

import X.C001A;
import X.C09JN;
import X.C0IF2;
import X.C0II9;
import X.C0JS1;
import X.C0K9Q;
import X.C0KFS;
import X.C0TZM;
import X.C0U3P;
import X.C0U3Q;
import X.C0UO0;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C262100zr;
import X.C389001fE;
import X.C480460Ism;
import X.C492290JSh;
import X.C494680Jac;
import X.C500260Jjc;
import X.C510070JzR;
import X.C510180Jzc;
import X.C510380Jzw;
import X.C512660K8q;
import X.C749130Ta3;
import X.C776250Uch;
import X.C784440Upu;
import X.C930840aKY;
import X.EnumC510330Jzr;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC510100JzU;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.widget.SubscriptionWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyOnBoardingOpen;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeCommunitySetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionWidget extends RoomRecycleWidget implements InterfaceC1141530foN, OnMessageListener {
    public Room LL;
    public boolean LLILLJJLI;
    public volatile boolean LLILLL;
    public IMessageManager LLILZIL;
    public C492290JSh LLIZ;
    public PrivilegeRepository LLIZLLLIL;
    public C512660K8q LLJ;
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public String LLILZLL = "";
    public C0KFS LLJI = C0KFS.LIVE_ROOM;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void x1(final SubscriptionWidget subscriptionWidget) {
        String idStr;
        subscriptionWidget.getClass();
        boolean zLJI = MethodIDManager.LJI(202135);
        PrivilegeRepository privilegeRepository = subscriptionWidget.LLIZLLLIL;
        if (privilegeRepository != null) {
            Room room = subscriptionWidget.LL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            privilegeRepository.LIZ(idStr, true, subscriptionWidget.LLILZLL, true, new InterfaceC510100JzU() { // from class: X.0K8i
                @Override // X.InterfaceC510100JzU
                public final void hj(C509160Jxy c509160Jxy) {
                }

                @Override // X.InterfaceC510100JzU
                public final void QP(C470590Icr<n> c470590Icr) {
                    boolean z;
                    boolean zLJ;
                    boolean z2;
                    k kVarLJJIIZ;
                    List listLLIIII;
                    k kVarLJJIIZ2;
                    String idStr2;
                    User owner;
                    String secUid;
                    AbstractC509530JyZ abstractC509530JyZLIZJ;
                    if (c470590Icr != null) {
                        SubscriptionWidget subscriptionWidget2 = this.LL;
                        if (subscriptionWidget2.LLILLL) {
                            C492290JSh c492290JSh = subscriptionWidget2.LLIZ;
                            boolean z3 = false;
                            if (c492290JSh != null && (abstractC509530JyZLIZJ = c492290JSh.LIZJ()) != null && abstractC509530JyZLIZJ.LIZ) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Activity activityLIZ = null;
                            if (z) {
                                ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(subscriptionWidget2.context, c470590Icr.data.toString(), "user_subscribe_entry_info", null);
                                n nVar = c470590Icr.data;
                                if (C1122210fJD.LIZ("/webcast/sub/privilege/get_sub_privilege_detail/")) {
                                    Room room2 = subscriptionWidget2.LL;
                                    if (room2 != null) {
                                        idStr2 = room2.getIdStr();
                                    } else {
                                        idStr2 = null;
                                    }
                                    String str = "";
                                    if (idStr2 == null) {
                                        idStr2 = "";
                                    }
                                    Room room3 = subscriptionWidget2.LL;
                                    if (room3 != null && (owner = room3.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                                        str = secUid;
                                    }
                                    C1106750euH c1106750euHLJJIIZI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJJIIZI();
                                    if (c1106750euHLJJIIZI != null) {
                                        c1106750euHLJJIIZI.LJIILLIIL(new C1100630ekP(new C0KA1(Long.MAX_VALUE)), nVar, "/webcast/sub/privilege/get_sub_privilege_detail/", C2097608Jq.LJIIIIZZ(new Pair("room_id", idStr2), new Pair("sec_anchor_id", str), new Pair("benefit_scene", 0), new Pair("is_new_page", Boolean.TRUE), new Pair("live_sub_only_tier", 0L)));
                                    }
                                }
                            }
                            n nVar2 = c470590Icr.data;
                            if (nVar2 == null) {
                                nVar2 = new n();
                            }
                            k kVarLJJIIZ3 = nVar2.LJJIIZ("sub_scenario");
                            if (kVarLJJIIZ3 != null && kVarLJJIIZ3.LJIIJJI() == 6) {
                                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                                Context context = subscriptionWidget2.context;
                                if (context != null) {
                                    activityLIZ = C1388190mED.LIZ(context);
                                }
                                interfaceC1791930wjP.triggerInAppMessages(activityLIZ, subscriptionWidget2.LLJI.getKey());
                            }
                            k kVarLJJIIZ4 = nVar2.LJJIIZ("sub_note_info");
                            if (kVarLJJIIZ4 != null && (kVarLJJIIZ2 = kVarLJJIIZ4.LJIILIIL().LJJIIZ("show_note_detail")) != null) {
                                zLJ = kVarLJJIIZ2.LJ();
                            } else {
                                zLJ = true;
                            }
                            k kVarLJJIIZ5 = nVar2.LJJIIZ("community_detail");
                            if (kVarLJJIIZ5 != null && (kVarLJJIIZ = kVarLJJIIZ5.LJIILIIL().LJJIIZ("community_content_list")) != null && (listLLIIII = C13LP.LLIIII(kVarLJJIIZ.LJIIL())) != null && !listLLIIII.isEmpty()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z4 = !z2;
                            boolean value = SubscribeCommunitySetting.INSTANCE.getValue();
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            if (zLJ || (z4 && value)) {
                                z3 = true;
                            }
                            dataChannelGlobal.JQ2(C930840aKY.class, Boolean.valueOf(z3));
                        }
                    }
                }

                @Override // X.InterfaceC510100JzU
                public final void yO(C509170Jxz c509170Jxz, boolean z) {
                    String secUid;
                    User owner;
                    if (!z) {
                        SubscriptionWidget subscriptionWidget2 = this.LL;
                        Context context = subscriptionWidget2.context;
                        Room room2 = subscriptionWidget2.LL;
                        if (room2 == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                            secUid = "";
                        }
                        C0KJX c0kjx = new C0KJX(secUid, false, 0, "prefetch_sub", 0L, 0L, false, EnumC513490KBv.PRIVILEGE_PAGE, null, context, new C0KKO() { // from class: X.0K8j
                            @Override // X.C0KKO
                            public final void LIZ(int i, String str) {
                            }

                            @Override // X.C0KKO
                            public final void LIZIZ() {
                            }

                            @Override // X.C0KKO
                            public final void LIZJ(String str) {
                            }

                            @Override // X.C0KKO
                            public final void LIZLLL(int i, int i2, int i3, String str, C0KH1 c0kh1) {
                            }

                            @Override // X.C0KKO
                            public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
                            }

                            @Override // X.C0KKO
                            public final void LJFF(long j, TemplateListData templateListData) {
                            }
                        }, null, false, 63792);
                        TemplateListData templateListData = new TemplateListData();
                        templateListData.templateList = c509170Jxz.LIZ.templateList;
                        new C515710KKj(new C0KH1(null, false, 0, null, null, null, 127), new C0KKQ()).LIZ(templateListData, c0kjx);
                    }
                }
            }, C2097908Jt.LIZJ(new Pair("cancelledKey", "-12345")), 0L);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        DataChannel dataChannel;
        Map<String, Object> mapLIZ;
        Boolean boolValueOf;
        InterfaceC1107590evd interfaceC1107590evd;
        Boolean boolValueOf2;
        String strLJFF;
        String idStr;
        InterfaceC1107590evd interfaceC1107590evd2;
        User owner;
        InterfaceC1107590evd interfaceC1107590evd3;
        DataChannel dataChannel2;
        String str = c262100zr.LIZ;
        String str2 = "";
        InterfaceC1107590evd interfaceC1107590evdLJ = null;
        Boolean boolValueOf3 = null;
        switch (str.hashCode()) {
            case -1791520632:
                if (str.equals("live_lynx_sub_onboarding_close") && (dataChannel = this.dataChannel) != null) {
                    dataChannel.zW(SubscribeSubOnlyOnBoardingOpen.class, Boolean.FALSE);
                    break;
                }
                break;
            case -272510863:
                if (str.equals("open_native_sub_privilege_detail")) {
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null) {
                        interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd4, "extra_params");
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (interfaceC1107590evdLJ != null && (mapLIZ = interfaceC1107590evdLJ.LIZ()) != null) {
                        for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                    Room room = this.LL;
                    if (room != null) {
                        Context context = this.context;
                        String str3 = (String) linkedHashMap.get("show_entrance");
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = (String) linkedHashMap.get("group_id");
                        if (str4 != null) {
                            str2 = str4;
                        }
                        C510180Jzc.LIZ(context, room, str3, str2, linkedHashMap, null, null, null, null, 0L, false, null, null, null, 16320);
                    }
                }
                break;
            case 260701291:
                if (str.equals("sub_indicator_has_ongoing_goal")) {
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null) {
                        boolValueOf = Boolean.valueOf(interfaceC1107590evd5.hasKey("hasOngoingGoal"));
                    } else {
                        boolValueOf = null;
                    }
                    if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
                        boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "hasOngoingGoal", false);
                        InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd6 != null) {
                            boolValueOf2 = Boolean.valueOf(interfaceC1107590evd6.hasKey("anchorUid"));
                        } else {
                            boolValueOf2 = null;
                        }
                        if (!C500260Jjc.LJJJI(boolValueOf2) || (interfaceC1107590evd3 = c262100zr.LIZIZ) == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "anchorUid", "")) == null) {
                            strLJFF = "";
                        }
                        if (!Intrinsics.LJFF(strLJFF, "")) {
                            Room room2 = this.LL;
                            if (room2 != null && (owner = room2.getOwner()) != null) {
                                idStr = owner.getIdStr();
                            } else {
                                idStr = null;
                            }
                            if (Intrinsics.LJFF(idStr, strLJFF)) {
                                if (zLIZIZ) {
                                    InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                                    if (interfaceC1107590evd7 != null) {
                                        boolValueOf3 = Boolean.valueOf(interfaceC1107590evd7.hasKey("goalId"));
                                    }
                                    if (C500260Jjc.LJJJI(boolValueOf3) && (interfaceC1107590evd2 = c262100zr.LIZIZ) != null) {
                                        C1871910yoP.LJFF(interfaceC1107590evd2, "goalId", "");
                                    }
                                }
                                DataChannel dataChannel3 = this.dataChannel;
                                if (dataChannel3 != null) {
                                    dataChannel3.SX0(C749130Ta3.class, new Object() { // from class: X.0K8o
                                    });
                                }
                            }
                        }
                    }
                }
                break;
            case 358212026:
                if (str.equals("live_lynx_sub_onboarding_open") && (dataChannel2 = this.dataChannel) != null) {
                    dataChannel2.zW(SubscribeSubOnlyOnBoardingOpen.class, Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C0KFS c0kfs;
        C20441214yg.LJIIIZ("SubscriptionWidget", "onInit");
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if ((obj instanceof C0KFS) && (c0kfs = (C0KFS) obj) != null) {
                this.LLJI = c0kfs;
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(final IMessage iMessage) {
        String secUid;
        User owner;
        long j;
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i = memberMessage.action;
            if (i != 5 && i != 6 && i != 20) {
                if (i != 28) {
                    if (i == 36) {
                        Room room = this.LL;
                        if (room != null) {
                            room.disablePreviewSubOnly = 1L;
                        }
                        if (C494680Jac.LJI(this.dataChannel)) {
                            C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.FALSE)) {
                    return;
                }
                Room room2 = this.LL;
                if (room2 != null) {
                    room2.liveSubOnly = 1L;
                }
                ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
                C0U3P.LIZLLL(C0U3Q.SUB_ONLY);
                C389001fE.LIZ("switch_sub_only_live", null, System.currentTimeMillis(), false);
                if (memberMessage.liveSubOnlyMonth <= 0 && memberMessage.liveSubOnlyTier <= 0) {
                    if (C494680Jac.LJI(this.dataChannel)) {
                        long j2 = memberMessage.allowPreviewTime;
                        Room room3 = this.LL;
                        if (room3 != null) {
                            j = room3.maxPreviewTime;
                        } else {
                            j = -1;
                        }
                        if (j2 > 0) {
                            if (room3 != null) {
                                if (j > 0) {
                                    j2 = j;
                                }
                                room3.allowPreviewTime = j2;
                            }
                        } else if (room3 != null) {
                            room3.allowPreviewTime = j2;
                        }
                        C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                        return;
                    }
                    if (!C494680Jac.LJIILLIIL(this.dataChannel)) {
                        return;
                    }
                    this.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.SUBSCRIBER_NORMAL_LIVE);
                    return;
                }
                C480460Ism.LIZ().getClass();
                SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
                Room room4 = this.LL;
                if (room4 != null && (owner = room4.getOwner()) != null) {
                    secUid = owner.getSecUid();
                } else {
                    secUid = null;
                }
                C510380Jzw.LJIILJJIL(subscribeApi.getUserInfo(secUid, memberMessage.liveSubOnlyMonth, memberMessage.liveSubOnlyTier, 0), EnumC510330Jzr.GENERAL, "SubscriptionWidget", "sub/user/info", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0K8k
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        long j3;
                        SubscribeInfo subscribeInfo;
                        boolean z;
                        SubOnlyLiveInfo subOnlyLiveInfo;
                        User owner2;
                        SubscribeInfo subscribeInfo2;
                        String str;
                        SubOnlyLiveInfo subOnlyLiveInfo2;
                        C1C7U.LIZ("SubscriptionWidget@2ff0.onMessage$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Room room5 = this.LL.LL;
                        if (room5 != null && (owner2 = room5.getOwner()) != null && (subscribeInfo2 = owner2.getSubscribeInfo()) != null) {
                            SubscribeUserInfoResponse subscribeUserInfoResponse = (SubscribeUserInfoResponse) baseResponse.data;
                            if (subscribeUserInfoResponse != null && (subOnlyLiveInfo2 = subscribeUserInfoResponse.subOnlyLiveInfo) != null) {
                                str = subOnlyLiveInfo2.solRoomDisplayText;
                            } else {
                                str = null;
                            }
                            subscribeInfo2.solRoomDisplayText = str;
                        }
                        Room room6 = this.LL.LL;
                        if (room6 != null) {
                            room6.liveSubOnlyMonth = ((MemberMessage) iMessage).liveSubOnlyMonth;
                            room6.liveSubOnlyTier = ((MemberMessage) iMessage).liveSubOnlyTier;
                            User owner3 = room6.getOwner();
                            if (owner3 != null && (subscribeInfo = owner3.getSubscribeInfo()) != null) {
                                SubscribeUserInfoResponse subscribeUserInfoResponse2 = (SubscribeUserInfoResponse) baseResponse.data;
                                if (subscribeUserInfoResponse2 != null && (subOnlyLiveInfo = subscribeUserInfoResponse2.subOnlyLiveInfo) != null) {
                                    z = subOnlyLiveInfo.isSolEligible;
                                } else {
                                    z = false;
                                }
                                subscribeInfo.isSolEligible = z;
                            }
                        }
                        if (C494680Jac.LJI(this.LL.dataChannel)) {
                            long j4 = ((MemberMessage) iMessage).allowPreviewTime;
                            Room room7 = this.LL.LL;
                            if (room7 != null) {
                                j3 = room7.maxPreviewTime;
                            } else {
                                j3 = -1;
                            }
                            if (j4 > 0) {
                                if (room7 != null) {
                                    if (j3 > 0) {
                                        j4 = j3;
                                    }
                                    room7.allowPreviewTime = j4;
                                }
                                C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                            } else {
                                if (room7 != null) {
                                    room7.allowPreviewTime = j4;
                                }
                                C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                            }
                        } else if (C494680Jac.LJIILLIIL(this.LL.dataChannel)) {
                            this.LL.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.SUBSCRIBER_NORMAL_LIVE);
                        }
                        C1C7U.LIZIZ("SubscriptionWidget@2ff0.onMessage$1");
                    }
                }, new C09JN() { // from class: X.0K8m
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SubscriptionWidget@2ff0.onMessage$2");
                        C1C7U.LIZIZ("SubscriptionWidget@2ff0.onMessage$2");
                    }
                });
                return;
            }
            x1(this);
            if (memberMessage.action != 5 || this.LLJ != null) {
                return;
            }
            C512660K8q c512660K8q = new C512660K8q(this.context, this.dataChannel, this.LLILLJJLI);
            this.LLJ = c512660K8q;
            c512660K8q.LIZ(this.context, this.dataChannel);
            return;
        }
        if (!(iMessage instanceof SubNotifyMessage) || ((SubNotifyMessage) iMessage).subscribeMessageType != 12) {
            return;
        }
        x1(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        C20441214yg.LJIIIZ("SubscriptionWidget", "onUnLoad");
        this.LLILLL = false;
        DataChannelGlobal.LLILZ.JQ2(C930840aKY.class, Boolean.TRUE);
        this.LLILZ.removeCallbacksAndMessages(null);
        C1548820qPI.LJIIIIZZ("sub_indicator_has_ongoing_goal", this);
        C1548820qPI.LJIIIIZZ("live_lynx_sub_onboarding_open", this);
        C1548820qPI.LJIIIIZZ("live_lynx_sub_onboarding_close", this);
        C1548820qPI.LJIIIIZZ("open_native_sub_privilege_detail", this);
        IMessageManager iMessageManager = this.LLILZIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (this.LLJ != null) {
            C512660K8q.LIZIZ(this.dataChannel);
        }
        this.LLJ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room room;
        boolean zBooleanValue;
        String secUid;
        User owner;
        Boolean bool;
        Boolean bool2;
        super.onLoad(recycleSource, objArr);
        C20441214yg.LJIIIZ("SubscriptionWidget", "onLoad");
        this.LLILLL = true;
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLJJLI = zBooleanValue;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(C0TZM.class)) != null) {
            bool.booleanValue();
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class);
        }
        this.LLILZIL = iMessageManager;
        C1548820qPI.LIZLLL("sub_indicator_has_ongoing_goal", this);
        C1548820qPI.LIZLLL("live_lynx_sub_onboarding_open", this);
        C1548820qPI.LIZLLL("live_lynx_sub_onboarding_close", this);
        C1548820qPI.LIZLLL("open_native_sub_privilege_detail", this);
        IMessageManager iMessageManager2 = this.LLILZIL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.MEMBER.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LLILZIL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(C001A.SUB_NOTIFY_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LLILZIL;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(C001A.SUB_WAVE_MESSAGE.getIntType(), this);
        }
        C784440Upu.LIZ().LIZJ(this, C0JS1.class).LIZJ(new C09JN() { // from class: X.0JRu
            @Override // X.C09JN
            public final void accept(Object obj) {
                Bundle bundle;
                FragmentManager fragmentManager;
                Bundle bundle2;
                C1C7U.LIZ("SubscriptionWidget@2ff0.onLoad$1");
                C0JS1 c0js1 = (C0JS1) obj;
                this.LL.LLILZLL = c0js1.LIZJ;
                int i = C492170JRv.LIZ[c0js1.LIZ.ordinal()];
                if (i != 1) {
                    if (i == 2 && (fragmentManager = (FragmentManager) this.LL.dataChannel.gg0(C748880TZe.class)) != null) {
                        Object obj2 = c0js1.LIZLLL;
                        if (obj2 instanceof Bundle) {
                            bundle2 = (Bundle) obj2;
                        } else {
                            bundle2 = null;
                        }
                        C19322110iZ.LIZLLL(fragmentManager, EmotePollDetailDialog.class, "sub_emote_poll_detail", null, bundle2);
                    }
                } else {
                    FragmentManager fragmentManager2 = (FragmentManager) this.LL.dataChannel.gg0(C748880TZe.class);
                    if (fragmentManager2 != null) {
                        Object obj3 = c0js1.LIZLLL;
                        if (obj3 instanceof Bundle) {
                            bundle = (Bundle) obj3;
                        } else {
                            bundle = null;
                        }
                        C19322110iZ.LIZLLL(fragmentManager2, EmotePollStartDialog.class, "sub_emote_poll_create", null, bundle);
                    }
                }
                C1C7U.LIZIZ("SubscriptionWidget@2ff0.onLoad$1");
            }
        });
        ISubscriptionStatusService.LJIIIZ.getClass();
        this.LLIZ = C0K9Q.LIZ().fi2(this.LL, this, this);
        Room room2 = this.LL;
        if (room2 == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        this.LLIZLLLIL = C510070JzR.LIZ(secUid, this);
        if (this.LLJ == null) {
            C512660K8q c512660K8q = new C512660K8q(this.context, this.dataChannel, this.LLILLJJLI);
            this.LLJ = c512660K8q;
            c512660K8q.LIZ(this.context, this.dataChannel);
        }
    }
}
