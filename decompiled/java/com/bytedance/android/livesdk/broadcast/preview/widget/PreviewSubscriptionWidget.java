package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0KPJ;
import X.C0UOP;
import X.C0UX6;
import X.C1108110ewT;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1826730xdX;
import X.C1871910yoP;
import X.C19EH;
import X.C2188811AlT;
import X.C259800zU;
import X.C262100zr;
import X.C292401Bi;
import X.C354201Zc;
import X.C474500IjA;
import X.C492400JSs;
import X.C493580JXg;
import X.C493700JXs;
import X.C494680Jac;
import X.C495520Jby;
import X.C499850Jix;
import X.C499860Jiy;
import X.C499890Jj1;
import X.C500260Jjc;
import X.C517530KRj;
import X.C518420KUu;
import X.C518880KWo;
import X.C521980KdY;
import X.C748880TZe;
import X.C758410Tp1;
import X.C760180Trs;
import X.C781270Ukn;
import X.C785230UrB;
import X.C785270UrF;
import X.C786410Ut5;
import X.C931230aLB;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2262081DgM;
import X.InterfaceC492450JSx;
import X.InterfaceC492460JSy;
import X.InterfaceC493650JXn;
import X.InterfaceC513260KAy;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelEvent;
import com.bytedance.android.livesdk.chatroom.api.GamingInfo;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.event.OpenNewRecordPage;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubNoteToastEvent;
import com.bytedance.android.livesdk.dataChannel.HasOptInSubData;
import com.bytedance.android.livesdk.dataChannel.IsSubscribeEnable;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.SubInfoResponseChannel;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewSubscriptionWidget extends PreviewToolBaseWidget implements InterfaceC1141530foN {
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(20));
    public final InterfaceC493650JXn LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public long LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final C499860Jiy LLJJ;
    public final BPEAHandler LLJJI;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        C499850Jix c499850Jix = this.LLJJ.LIZJ;
        c499850Jix.getClass();
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterHostWS(50331740, 1, c499850Jix.LIZIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJ);
    }

    public final void X1() {
        LiveMode liveMode;
        C0UOP c0uop;
        if (this.LLJILJIL) {
            return;
        }
        this.LLJILJIL = true;
        C760180Trs.LJIIJJI(this.dataChannel, "subscription");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_management_entrance_show");
        c474500IjALIZ.LJJII("live_take_page", "show_entrance");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0UOP c0uop2 = (C0UOP) this.dataChannel.gg0(C758410Tp1.class);
        long j = 0;
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - (c0uop2 != null ? c0uop2.LIZ : 0L)), "tti_duration");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscribe_icon_show");
        c474500IjALIZ2.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c474500IjALIZ2.LJJII("anchor", "user_type");
        c474500IjALIZ2.LJJII("live_take_page", "show_entrance");
        c474500IjALIZ2.LJJIIZI(C494680Jac.LJJIFFI(C518420KUu.LIZJ(this.dataChannel), C518420KUu.LIZLLL(this.dataChannel), true));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ2.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0), "have_red_dot");
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ2.LJIJ())) {
            c474500IjALIZ2.LJJIJLIJ();
            c474500IjALIZ2.LJJIJIL();
            c474500IjALIZ2.LJJIJL();
        } else {
            c474500IjALIZ2.LIZ();
        }
        InterfaceC513260KAy interfaceC513260KAyLIZIZ = C1826730xdX.LIZIZ();
        if (interfaceC513260KAyLIZIZ != null) {
            int iHashCode = hashCode();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (c0uop = (C0UOP) dataChannel2.gg0(C758410Tp1.class)) != null) {
                j = c0uop.LIZ;
            }
            interfaceC513260KAyLIZIZ.LIZLLL("SubEntranceBeforeLive", new C517530KRj(iHashCode, 40, jCurrentTimeMillis2 - j, "live_take_page", null));
        }
    }

    public final boolean Y1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.gg0(LiveModeChannel.class);
        }
        C499890Jj1.LIZIZ();
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("anchor_subscribe_invitation_accepted", this);
        C1548820qPI.LJIIIIZZ("open_native_subscription_settings", this);
        C1548820qPI.LJIIIIZZ("close_native_subscription_settings", this);
        super.onDestroy();
        InterfaceC493650JXn interfaceC493650JXn = this.LLIZ;
        if (interfaceC493650JXn != null) {
            interfaceC493650JXn.onDestroy();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        InterfaceC493650JXn interfaceC493650JXn = this.LLIZ;
        if (interfaceC493650JXn != null) {
            interfaceC493650JXn.LJI(new InterfaceC492460JSy() { // from class: X.0JXp
                @Override // X.InterfaceC492460JSy
                public final void LIZIZ(Throwable th) {
                }

                @Override // X.InterfaceC492460JSy
                public final void LIZ() {
                    final PreviewSubscriptionWidget previewSubscriptionWidget = this.LIZ;
                    InterfaceC493650JXn interfaceC493650JXn2 = previewSubscriptionWidget.LLIZ;
                    if (interfaceC493650JXn2 != null) {
                        interfaceC493650JXn2.LIZJ(new InterfaceC492450JSx() { // from class: X.0JT5
                            @Override // X.InterfaceC492450JSx
                            public final void LIZ(Throwable th) {
                            }

                            @Override // X.InterfaceC492450JSx
                            public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                                boolean z;
                                SubEnable subEnable;
                                DataChannel dataChannel = previewSubscriptionWidget.dataChannel;
                                if (getSubInfoResponse != null && (subEnable = getSubInfoResponse.subEnable) != null) {
                                    z = subEnable.canEnable;
                                } else {
                                    z = false;
                                }
                                dataChannel.zW(IsSubscribeEnable.class, Boolean.valueOf(z));
                            }
                        });
                    }
                    this.LIZ.Y1();
                }
            });
        }
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LJFF();
    }

    public PreviewSubscriptionWidget() {
        C781270Ukn.LJJIII().pa();
        this.LLIZ = C1108110ewT.LIZJ();
        this.LLIZLLLIL = 2131844403;
        this.LLJ = R.drawable.eqi;
        this.LLJILLL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(19));
        this.LLJJ = new C499860Jiy();
        this.LLJJI = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        Y1();
        hide();
        if (C500260Jjc.LJJJJIZL(getView())) {
            X1();
            Boolean bool = (Boolean) this.dataChannel.gg0(IsSubscribeEnable.class);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (!this.LLJILJILJ) {
                    a2(zBooleanValue);
                }
            }
        }
        C499850Jix c499850Jix = this.LLJJ.LIZJ;
        c499850Jix.getClass();
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS(50331740, 1, c499850Jix.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, android.os.BaseBundle, android.os.Bundle] */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        JSONObject jSONObjectOptJSONObject;
        InterfaceC493650JXn interfaceC493650JXn;
        super.E1();
        H1();
        C1548820qPI.LIZLLL("anchor_subscribe_invitation_accepted", this);
        C1548820qPI.LIZLLL("open_native_subscription_settings", this);
        C1548820qPI.LIZLLL("close_native_subscription_settings", this);
        InterfaceC493650JXn interfaceC493650JXn2 = this.LLIZ;
        if (interfaceC493650JXn2 != null) {
            interfaceC493650JXn2.LIZJ(new InterfaceC492450JSx() { // from class: X.0JXx
                @Override // X.InterfaceC492450JSx
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC492450JSx
                public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                    boolean z;
                    this.LIZ.dataChannel.zW(SubInfoResponseChannel.class, getSubInfoResponse);
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    if (getSubInfoResponse != null) {
                        z = getSubInfoResponse.qualification;
                    } else {
                        z = false;
                    }
                    dataChannelGlobal.HQ2(HasOptInSubData.class, Boolean.valueOf(z));
                    this.LIZ.Y1();
                }
            });
        }
        Y1();
        hide();
        this.dataChannel.EQ2(this, IsSubscribeEnable.class, new AwS586S0100000_7(this, 44));
        JSONObject jSONObject = (JSONObject) this.dataChannel.gg0(PreviewSourceParamsDataChannel.class);
        C259800zU c259800zU = new C259800zU();
        if (jSONObject != null) {
            ?? bundle = new Bundle();
            bundle.putInt("open_sub_setting", jSONObject.optInt("open_sub_setting"));
            bundle.putInt("open_sub_only_setting", jSONObject.optInt("open_sub_only_setting"));
            C786410Ut5.LJJJI("show_entrance", jSONObject.optString("show_entrance"), bundle);
            C786410Ut5.LJJJI("code", jSONObject.optString("code"), bundle);
            C786410Ut5.LJJJI("open_type", jSONObject.optString("open_type"), bundle);
            C786410Ut5.LJJJI("open_url_key", jSONObject.optString("open_url_key"), bundle);
            bundle.putInt("open_sub_invitation", jSONObject.optInt("open_sub_invitation"));
            bundle.putInt("open_subscription", jSONObject.optInt("open_subscription"));
            bundle.putInt("route_subs_settings", jSONObject.optInt("route_subs_settings"));
            bundle.putInt("live_goal_widget", jSONObject.optInt("live_goal_widget"));
            c259800zU.element = bundle;
        }
        if (!new C493580JXg(this.context, this.dataChannel, this.LLIZ).LIZIZ((Bundle) c259800zU.element) && (interfaceC493650JXn = this.LLIZ) != null) {
            interfaceC493650JXn.LJFF(new AwS586S0100000_7(this, 507));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, SubNoteToastEvent.class, new AwS586S0100000_7(this, 45));
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenNewRecordPage.class, new AwS586S0100000_7(this, 46));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, PreviewSchemaOpenPanelEvent.class, new AwS586S0100000_7(this, 47));
        if (C500260Jjc.LJJJI((Boolean) dataChannelGlobal.gg0(C931230aLB.class))) {
            C0UX6 c0ux6 = C0UX6.SUBSCRIPTION_INTEGRATE_FANS_CLUB;
            View view = getView();
            RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS586S0100000_7(this, 48));
        }
        if (jSONObject == null || jSONObject.optInt("open_sub_gift_panel") != 1 || (jSONObjectOptJSONObject = jSONObject.optJSONObject("sub_extra_param")) == null) {
            return;
        }
        String strOptString = jSONObjectOptJSONObject.optString("to_anchor_id");
        String strOptString2 = jSONObjectOptJSONObject.optString("show_entrance");
        String strOptString3 = jSONObjectOptJSONObject.optString("for_old_version");
        String strOptString4 = jSONObjectOptJSONObject.optString("user_type");
        String userGiftPanelPage = ((LiveSubscribeLynxMap) this.LLJILLL.getValue()).getUserGiftPanelPage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(userGiftPanelPage);
        sbLIZ.append("&to_anchor_id=");
        sbLIZ.append(strOptString);
        sbLIZ.append("&for_old_version=");
        sbLIZ.append(strOptString3);
        sbLIZ.append("&user_type=");
        sbLIZ.append(strOptString4);
        C495520Jby c495520Jby = new C495520Jby(C2188811AlT.LIZIZ(sbLIZ));
        c495520Jby.LIZJ("show_entrance", strOptString2);
        c495520Jby.LIZJ("container_type", "page");
        c495520Jby.LIZJ("event_page", "live_take_page");
        c495520Jby.LIZJ("mask_bg_color", "00000000");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, UriProtector.parse(c495520Jby.LIZLLL()));
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        Object objGg0;
        InterfaceC493650JXn interfaceC493650JXn;
        this.LLJIJIL = System.currentTimeMillis();
        X1();
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LJI();
        InterfaceC493650JXn interfaceC493650JXn2 = this.LLIZ;
        if (interfaceC493650JXn2 != null) {
            interfaceC493650JXn2.LJI(new InterfaceC492460JSy() { // from class: X.0Jgx
                @Override // X.InterfaceC492460JSy
                public final void LIZIZ(Throwable th) {
                }

                @Override // X.InterfaceC492460JSy
                public final void LIZ() {
                    this.LIZ.Y1();
                    if (this.LIZ.isShowing()) {
                        this.LIZ.hide();
                        C781270Ukn.LJJIII().pa();
                        C1108110ewT.LJFF();
                    }
                }
            });
        }
        if (!S1()) {
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_SUBSCRIPTION;
            View view = getView();
            RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, null);
            C0UX6 c0ux62 = C0UX6.LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT;
            View view2 = getView();
            RedDotExtensionKt.LJI(view2 != null ? view2.findViewById(R.id.widget_red_dot) : null, this, this, c0ux62, null);
        }
        if (!C0KPJ.ie.LIZIZ().booleanValue() || S1()) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(LiveModeChannel.class)) == null) {
            objGg0 = LiveMode.VIDEO;
        }
        if ((objGg0 == LiveMode.LIVE_STUDIO || objGg0 == LiveMode.THIRD_PARTY || objGg0 == LiveMode.SCREEN_RECORD) && (interfaceC493650JXn = this.LLIZ) != null) {
            interfaceC493650JXn.LIZJ(new InterfaceC492450JSx() { // from class: X.0Jgw
                @Override // X.InterfaceC492450JSx
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC492450JSx
                public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                    Boolean boolValueOf;
                    GamingInfo gamingInfo;
                    if (!C0KPJ.ie.LIZIZ().booleanValue()) {
                        return;
                    }
                    Boolean boolValueOf2 = null;
                    if (getSubInfoResponse != null) {
                        boolValueOf = Boolean.valueOf(getSubInfoResponse.qualification);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        if (getSubInfoResponse != null && (gamingInfo = getSubInfoResponse.gamingInfo) != null) {
                            boolValueOf2 = Boolean.valueOf(gamingInfo.isGamingHost);
                        }
                        if (C500260Jjc.LJJJI(boolValueOf2)) {
                            this.LIZ.U1();
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Y1();
    }

    public final void W1(boolean z) {
        String str;
        Object objValueOf;
        SubscribeInfo subscribeInfo;
        if (z) {
            str = "livesdk_subscribe_icon_service_update_red_dot_click";
        } else {
            str = "livesdk_subscribe_icon_service_update_red_dot_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("subscription_upgrades_to_fan_plus", "show_reason");
        c474500IjALIZ.LJJII("live_take_page", "page_name");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if (currentUser != null && (subscribeInfo = currentUser.getSubscribeInfo()) != null) {
            objValueOf = Integer.valueOf(subscribeInfo.getSubscriberCount());
        } else {
            objValueOf = 0L;
        }
        c474500IjALIZ.LJJII(objValueOf, "active_sub_cnt");
        c474500IjALIZ.LIZ();
    }

    public final void a2(boolean z) {
        Object objGg0;
        int i;
        List<String> listLIZIZ = C0KPJ.He.LIZIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(LiveModeChannel.class)) == null) {
            objGg0 = LiveMode.VIDEO;
        }
        if (listLIZIZ != null && !listLIZIZ.contains(String.valueOf(UserService.getInstance().user().getCurrentUserId())) && z) {
            if (objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY) {
                if (User.sShowSubEntranceGoLive) {
                    i = 2131843028;
                } else {
                    i = 2131843027;
                }
                C785230UrB c785230UrB = new C785230UrB(this.contentView);
                c785230UrB.LIZLLL(i);
                c785230UrB.LJIILL = new C521980KdY(listLIZIZ, 0);
                C786410Ut5.LJLIIL(500L, this.LLJJI, new ARunnableS76S0200000_7(new C785270UrF(c785230UrB), this, 3));
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Class<?> cls;
        C19EH c19ehLJIIJ;
        String strLJFF2;
        FragmentManager fragmentManager;
        List<Fragment> listLJJLIIIJL;
        Class<?> cls2;
        C19EH c19ehLJIIJ2;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1710760782) {
            if (iHashCode != 1268793102) {
                if (iHashCode == 1514286020 && str.equals("close_native_subscription_settings")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "type", "");
                    } else {
                        strLJFF2 = null;
                    }
                    if (Intrinsics.LJFF(strLJFF2, "popup") && (fragmentManager = (FragmentManager) this.dataChannel.gg0(C748880TZe.class)) != null && (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) != null) {
                        for (Fragment fragment : listLJJLIIIJL) {
                            Class<?> cls3 = fragment.getClass();
                            Object value = this.LLILZLL.getValue();
                            if (value != null) {
                                cls2 = value.getClass();
                            } else {
                                cls2 = null;
                            }
                            if (Intrinsics.LJFF(cls3, cls2) && (fragment instanceof LiveDialogFragment) && ((LiveDialogFragment) fragment).isShowing() && (c19ehLJIIJ2 = fragmentManager.LJIIJ()) != null) {
                                c19ehLJIIJ2.LJIILL(fragment);
                                c19ehLJIIJ2.LJIIJ();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("anchor_subscribe_invitation_accepted")) {
                show();
                C786410Ut5.LJLIIL(600L, this.LLJJI, new ARunnableS107S0100000_7(this, 15));
                return;
            }
            return;
        }
        if (str.equals("open_native_subscription_settings")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "type", "");
            } else {
                strLJFF = null;
            }
            boolean z = false;
            if (Intrinsics.LJFF(strLJFF, "popup")) {
                FragmentManager fragmentManager2 = (FragmentManager) this.dataChannel.gg0(C748880TZe.class);
                if (fragmentManager2 != null) {
                    List<Fragment> listLJJLIIIJL2 = fragmentManager2.LJJLIIIJL();
                    if (listLJJLIIIJL2 != null) {
                        for (Fragment fragment2 : listLJJLIIIJL2) {
                            Class<?> cls4 = fragment2.getClass();
                            Object value2 = this.LLILZLL.getValue();
                            if (value2 != null) {
                                cls = value2.getClass();
                            } else {
                                cls = null;
                            }
                            if (Intrinsics.LJFF(cls4, cls)) {
                                if ((fragment2 instanceof LiveDialogFragment) && !((LiveDialogFragment) fragment2).isShowing() && (c19ehLJIIJ = fragmentManager2.LJIIJ()) != null) {
                                    c19ehLJIIJ.LJJIFFI(fragment2);
                                    c19ehLJIIJ.LJIIJ();
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            return;
                        }
                    }
                    LiveDialogFragment liveDialogFragment = (LiveDialogFragment) this.LLILZLL.getValue();
                    if (liveDialogFragment != null) {
                        C492400JSs.LIZ(liveDialogFragment, fragmentManager2, "PreviewSubscriptionWidget");
                        return;
                    }
                    return;
                }
                return;
            }
            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            if (iHostSubscription != null) {
                iHostSubscription.EB0(this.context, 0, "creator_tools_page");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_SUBSCRIPTION);
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT);
        if (C500260Jjc.LJJJI((Boolean) DataChannelGlobal.LLILZ.gg0(C931230aLB.class))) {
            RedDotExtensionKt.LIZ(C0UX6.SUBSCRIPTION_INTEGRATE_FANS_CLUB);
            W1(true);
        }
        if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus)) {
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).rQ0(this.context, this.dataChannel);
            RedDotExtensionKt.LIZ(C0UX6.SUBSCRIPTION_INTEGRATE_FANS_CLUB_TRANSITION);
        } else {
            if (this.LLJJ.LIZ()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLJI < 500) {
                return;
            }
            this.LLJI = jCurrentTimeMillis;
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2().LIZIZ();
            C518880KWo.LL.LJI();
            C500260Jjc.LJJJJJ(this, null, new C493700JXs(this, false, null), 3);
        }
    }
}
