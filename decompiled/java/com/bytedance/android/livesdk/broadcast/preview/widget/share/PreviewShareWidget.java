package com.bytedance.android.livesdk.broadcast.preview.widget.share;

import X.C0IJT;
import X.C0KVU;
import X.C0KXJ;
import X.C1106200etO;
import X.C1106210etP;
import X.C1161920gLG;
import X.C19EG;
import X.C2188811AlT;
import X.C354201Zc;
import X.C474500IjA;
import X.C498690Jh5;
import X.C500260Jjc;
import X.C758220Toi;
import X.C766270U4b;
import X.C781270Ukn;
import X.InterfaceC1372610lp5;
import X.InterfaceC2262081DgM;
import X.InterfaceC481170Itv;
import X.InterfaceC498680Jh4;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.OpenSharePanelChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelEvent;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewShareWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131856097;
    public final int LLIZ = R.drawable.eqg;
    public InterfaceC481170Itv LLIZLLLIL;
    public boolean LLJ;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            W1();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AwS586S0100000_7(this, 59));
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSchemaOpenPanelEvent.class, new AwS586S0100000_7(this, 60));
        this.dataChannel.BQ2(this, OpenSharePanelChannel.class, new AwS586S0100000_7(this, 61));
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    public final void W1() {
        LiveMode liveMode;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_takepage_share_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZIZ.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0), "have_red_dot");
        c474500IjALIZIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if (!(currentUser instanceof User) || currentUser == null) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        W1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Itu] */
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
    public final void X1(boolean z) {
        final User user;
        String str;
        int i;
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if (!(currentUser instanceof User) || (user = (User) currentUser) == null || this.context == null) {
            return;
        }
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Sl1()) {
            InterfaceC481170Itv interfaceC481170Itv = this.LLIZLLLIL;
            if (interfaceC481170Itv != null) {
                interfaceC481170Itv.LIZIZ();
            }
            C766270U4b.LIZLLL(2131844074);
            return;
        }
        if (C498690Jh5.LIZ == null) {
            return;
        }
        HashMap map = new HashMap();
        if (C781270Ukn.LJIIJJI().isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("www.tiktok.com/@");
        sbLIZ.append(C0KVU.LJ(user));
        sbLIZ.append("/live?prepare=1&source=");
        sbLIZ.append(str);
        sbLIZ.append("&_r=1");
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            String idStr = user.getIdStr();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_share_click");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("live_take", "request_page");
            c474500IjALIZ.LJJII(idStr, "anchor_id");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0), "have_red_dot");
            c474500IjALIZ.LJJII(Integer.valueOf(PreviewToolBaseWidget.G1(getView())), "index");
            c474500IjALIZ.LIZ();
        }
        C1106200etO c1106200etO = new C1106200etO(C0KXJ.LIZIZ());
        c1106200etO.LIZ = -1L;
        InterfaceC498680Jh4 interfaceC498680Jh4 = C498690Jh5.LIZ;
        C19EG c19egLJ = C500260Jjc.LJ(this.context);
        c1106200etO.LIZJ = user.getId();
        c1106200etO.LJIILIIL = true;
        c1106200etO.LJIJJ = user.getSecUid();
        c1106200etO.LJJIIZI = this.LLJ;
        C758220Toi c758220Toi = (C758220Toi) this.dataChannel.gg0(VisibleScopeSelectedChannel.class);
        if (c758220Toi != null) {
            i = c758220Toi.LIZ;
        } else {
            i = 0;
        }
        c1106200etO.LJJIJ = i;
        c1106200etO.LJIIIZ = sb.toString();
        c1106200etO.LJIL = map;
        c1106200etO.LJJJLL = 2131856098;
        interfaceC498680Jh4.LIZ(c19egLJ, new C1106210etP(c1106200etO), new InterfaceC1372610lp5() { // from class: X.0Itu
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map2) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map2) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final void onDismiss() {
                InterfaceC481170Itv interfaceC481170Itv2 = this.LIZ.LLIZLLLIL;
                if (interfaceC481170Itv2 != null) {
                    interfaceC481170Itv2.LIZJ();
                }
                this.LIZ.LLIZLLLIL = null;
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
                InterfaceC481170Itv interfaceC481170Itv2 = this.LIZ.LLIZLLLIL;
                if (interfaceC481170Itv2 != null) {
                    interfaceC481170Itv2.LIZIZ();
                }
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZIZ(HashMap<String, String> map2) {
                if (map2 != null) {
                    C481180Itw.LJ(this.LIZ.dataChannel, map2);
                }
            }

            @Override // X.InterfaceC1372610lp5
            public final void onShow(int i2) {
                InterfaceC481170Itv interfaceC481170Itv2 = this.LIZ.LLIZLLLIL;
                if (interfaceC481170Itv2 != null) {
                    interfaceC481170Itv2.LIZ();
                }
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str2, String str3, Bundle bundle) {
                String string;
                String string2;
                String string3;
                PreviewShareWidget previewShareWidget = this.LIZ;
                User user2 = user;
                previewShareWidget.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("share_success");
                sbLIZ2.append(System.currentTimeMillis());
                String mD5String = MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ2));
                String str4 = "";
                if (bundle == null || (string = bundle.getString("shareIdList")) == null) {
                    string = "";
                }
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("share_info", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJII(mD5String, "bind_id");
                c474500IjALIZIZ.LJJII(string, "to_user_id");
                c474500IjALIZIZ.LIZ();
                HashMap map2 = new HashMap();
                map2.put("share_platform", str2);
                map2.put("share_type", str3);
                map2.put("user_type", "anchor");
                map2.put("request_page", "live_take");
                map2.put("bind_id", mD5String);
                map2.put("anchor_id", user2.getIdStr());
                map2.put("initiator", "anchor");
                w.LIZ.getClass();
                String strLJIILJJIL = w.LJIILJJIL();
                String str5 = "1";
                if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
                    map2.put("is_subscribe", "1");
                } else {
                    map2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                }
                if (C497740JfY.LJIL()) {
                    map2.put("room_orientation", "portrait");
                } else {
                    map2.put("room_orientation", "landscape");
                }
                Hashtag hashtag = (Hashtag) previewShareWidget.dataChannel.gg0(HashtagChangedChannel.class);
                if (hashtag != null) {
                    String str6 = hashtag.title;
                    if (str6 == null) {
                        str6 = "";
                    }
                    map2.put("hash_type", str6);
                    Long l = hashtag.id;
                    if (l != null && (string3 = l.toString()) != null) {
                        str4 = string3;
                    }
                    map2.put("hashtag_id", str4);
                }
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                map2.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                C481150Itt.LIZ(new AwS408S0200000_7(previewShareWidget, (PreviewShareWidget) map2, (Map<String, String>) 52));
                if (!Intrinsics.LJFF(str2, "chat_merge")) {
                    PreviewShareWidget previewShareWidget2 = this.LIZ;
                    if (bundle == null || (string2 = bundle.getString("clicked_channel_position")) == null) {
                        string2 = "-1";
                    }
                    previewShareWidget2.getClass();
                    HashMap map3 = new HashMap();
                    map3.put("share_platform", str2);
                    map3.put("to_user_id", "out_app_share");
                    map3.put("rank_index", string2);
                    map3.put("share_relation_type", "out_app_share");
                    map3.put("panel_source", "share_panel");
                    map3.put("share_follow_status", "out_app_share");
                    if (C924810aAp.LJ().LJJII <= 0) {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    map3.put("is_guest_connection", str5);
                    C481180Itw.LJ(previewShareWidget2.dataChannel, map3);
                }
            }
        });
        String idStr2 = user.getIdStr();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_share_panel_show");
        c474500IjALIZ2.LJIJJLI(this.dataChannel);
        c474500IjALIZ2.LJJII("camera", "enter_from_merge");
        c474500IjALIZ2.LJJII("live_take_page", "event_page");
        c474500IjALIZ2.LJJII(idStr2, "user_id");
        c474500IjALIZ2.LJJII(idStr2, "anchor_id");
        c474500IjALIZ2.LJJII("self_guide", "is_bubble_enter");
        c474500IjALIZ2.LJJII("share_panel", "panel_source");
        w.LIZ.getClass();
        c474500IjALIZ2.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ2.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        X1(false);
    }
}
