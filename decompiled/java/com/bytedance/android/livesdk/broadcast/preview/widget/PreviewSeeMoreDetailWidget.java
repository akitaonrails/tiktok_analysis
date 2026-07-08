package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0IZJ;
import X.C0UO0;
import X.C0WZX;
import X.C1161920gLG;
import X.C11JF;
import X.C168F;
import X.C16FS;
import X.C1701330uNH;
import X.C19EG;
import X.C20441214yg;
import X.C2204961BRm;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770800ULm;
import X.C771420UNw;
import X.C771430UNx;
import X.C772150UQr;
import X.C781270Ukn;
import X.C786410Ut5;
import X.DialogC780480UjW;
import Y.ACListenerS116S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.api.LiveStudioGetPermissionInfoApi;
import com.bytedance.android.livesdk.dataChannel.AccessLiveStudioSucceedChannel;
import com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGetPermissionWebUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.game.JudgeActivityPermissionResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewSeeMoreDetailWidget extends PreviewWidget {
    public static String LLJILLL = "";
    public JudgeActivityPermissionResponse.ResponseData LLILZIL;
    public C11JF LLILZLL;
    public C11JF LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public DialogC780480UjW LLJIJIL;
    public C16FS LLJILJILJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(66));
    public boolean LLJI = true;
    public final DetailLivePermission LLJILJIL = (DetailLivePermission) DataChannelGlobal.LLILZ.gg0(C168F.class);

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLILZLL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
    }

    public final void I1() {
        String str;
        String webUrl;
        String str2;
        C772150UQr c772150UQr;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2;
        Uri uriBuild;
        this.LLJ = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (str = (String) dataChannel.gg0(C771420UNw.class)) == null) {
            str = "";
        }
        JudgeActivityPermissionResponse.ResponseData responseData = this.LLILZIL;
        if (responseData == null || !H1()) {
            C20441214yg.LJIIIZ("PreviewSeeMoreDetailWidget", "open default page");
            webUrl = LiveStudioGetPermissionWebUrlSetting.INSTANCE.getWebUrl();
        } else {
            C20441214yg.LJIIIZ("PreviewSeeMoreDetailWidget", "open activity page");
            webUrl = UriProtector.parse(responseData.activityUrl).buildUpon().appendQueryParameter("from", "android").build().toString();
        }
        Uri uri = UriProtector.parse(webUrl);
        String string = null;
        if (uri != null && (builderBuildUpon = uri.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("app_source", "preview_page")) != null && (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("enter_from", str)) != null) {
            DetailLivePermission detailLivePermission = this.LLJILJIL;
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("has_ls_auth", String.valueOf(C500260Jjc.LJJJI(detailLivePermission != null ? Boolean.valueOf(detailLivePermission.enableLiveStudio) : null) ? 1 : 0));
            if (builderAppendQueryParameter3 != null && (uriBuild = builderAppendQueryParameter3.build()) != null) {
                string = uriBuild.toString();
            }
        }
        if (!TextUtils.isEmpty(string)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, string);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (c772150UQr = (C772150UQr) dataChannel2.gg0(C771430UNx.class)) == null || (str2 = c772150UQr.LIZIZ) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_studio_get_access_click");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(this.LLILZ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(H1() ? "activity" : "normal", "show_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(C0IZJ.LIZ(str2) > 0 ? 1 : 0), "from_message");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1q;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        C19EG c19egLJ;
        Context context = this.context;
        if (context == null || (c19egLJ = C500260Jjc.LJ(context)) == null) {
            return;
        }
        Intent intentCreateLiveStudioMonitorIntent = C781270Ukn.LJIIJ().createLiveStudioMonitorIntent(c19egLJ);
        intentCreateLiveStudioMonitorIntent.putExtras(new Bundle());
        Context context2 = this.context;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intentCreateLiveStudioMonitorIntent, "Context_startActivity_1");
        C1701330uNH.LIZ(intentCreateLiveStudioMonitorIntent, context2);
        C2204961BRm.LJJJJJL(context2, intentCreateLiveStudioMonitorIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoIMliD4i/D4BztWV+xatDf5wLO", null));
    }

    public final boolean H1() {
        JudgeActivityPermissionResponse.ResponseData responseData = this.LLILZIL;
        return responseData != null && responseData.hitActivityRule && responseData.activityUrl.length() > 0;
    }

    public final void L1() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_studio_get_access_show");
        c474500IjALIZ.LJJII(this.LLILZ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(H1() ? "activity" : "normal", "show_reason");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1() {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            r3 = 0
            if (r0 == 0) goto L70
            webcast.api.game.CreateInfoResponse$ResponseData r2 = r0.I92()
            if (r2 == 0) goto L71
            boolean r0 = r2.hasLiveStudioLogin
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L17:
            boolean r1 = X.C500260Jjc.LJJJI(r0)
            if (r2 == 0) goto L23
            boolean r0 = r2.enableLiveStudioMonitor
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L23:
            boolean r0 = X.C500260Jjc.LJJJI(r3)
            r3 = 0
            if (r1 == 0) goto L4e
            if (r0 == 0) goto L73
            java.lang.String r1 = "monitor"
            com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget.LLJILLL = r1
            X.16FS r4 = r5.LLJILJILJ
            if (r4 == 0) goto L4d
            r0 = 2131853856(0x7f118220, float:1.934137E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r4.setText(r0)
            r5.J1(r1, r3)
            kotlin.jvm.internal.AwS378S0200000_12 r2 = new kotlin.jvm.internal.AwS378S0200000_12
            r0 = 89
            r2.<init>(r4, r5, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C500260Jjc.LJLIIIL(r0, r4, r2)
        L4d:
            return
        L4e:
            java.lang.String r0 = "get_download_ticket"
            com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget.LLJILLL = r0
            X.16FS r2 = r5.LLJILJILJ
            if (r2 == 0) goto L4d
            r0 = 2131842958(0x7f11578e, float:1.9319267E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r2.setText(r0)
            java.lang.String r0 = "get_download_link"
            r5.J1(r0, r3)
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 21
            r1.<init>(r5, r2, r0)
            X.C786410Ut5.h8(r2, r1)
            return
        L70:
            r2 = r3
        L71:
            r0 = r3
            goto L17
        L73:
            java.lang.String r1 = "cast"
            com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget.LLJILLL = r1
            X.16FS r2 = r5.LLJILJILJ
            if (r2 == 0) goto L92
            r0 = 2131841750(0x7f1152d6, float:1.9316817E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r2.setText(r0)
            r5.J1(r1, r3)
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 89
            r1.<init>(r5, r2, r0)
            X.C786410Ut5.h8(r2, r1)
        L92:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r1 = "live_take_page_LS"
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C0UQN.LIZJ(r0, r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget.M1():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (this.LLIZLLLIL) {
            if (this.LLILZIL != null) {
                L1();
                return;
            }
            boolean zLJI = MethodIDManager.LJI(202474);
            C11JF c11jf = this.LLILZLL;
            if (c11jf != null && !c11jf.isDisposed()) {
                c11jf.dispose();
            }
            C480460Ism.LIZ().getClass();
            this.LLILZLL = (C11JF) ((LiveStudioGetPermissionInfoApi) C480460Ism.LIZLLL(LiveStudioGetPermissionInfoApi.class)).getLiveStudioPermissionInfo().LJIILIIL(new C0UO0()).LJJLIIIJJIZ(3L).LJJLL(new AfS181S0100000_12(this, 269), new AfS181S0100000_12(this, 270));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C16FS c16fs;
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, DeepLinkLiveModeChannel.class, new AwS591S0100000_12(this, 323));
        }
        View view = getView();
        if (!(view instanceof C16FS) || (c16fs = (C16FS) view) == null) {
            return;
        }
        this.LLJILJILJ = c16fs;
        DetailLivePermission detailLivePermission = this.LLJILJIL;
        if (C500260Jjc.LJJJI(detailLivePermission != null ? Boolean.valueOf(detailLivePermission.enableLiveStudio) : null)) {
            this.LLIZLLLIL = false;
            M1();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, GameRoomCreateInfoChannel.class, new AwS591S0100000_12(this, 324));
            }
        } else {
            this.LLIZLLLIL = true;
            C16FS c16fs2 = this.LLJILJILJ;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131842947));
                LLJILLL = "get_access";
                J1("get_access", false);
                C786410Ut5.h8(c16fs2, new ACListenerS116S0200000_12(this, c16fs2, 20));
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, AccessLiveStudioSucceedChannel.class, new AwS591S0100000_12(this, 325));
        }
    }

    public final void J1(String str, boolean z) {
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_page_button");
        c474500IjALIZ.LJJ(LiveMode.LIVE_STUDIO.logStreamingType);
        c474500IjALIZ.LJII((String) this.LLILZ.getValue());
        if (!z) {
            str2 = "show";
        } else {
            str2 = "click";
        }
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LIZ();
        if (!z) {
            DetailLivePermission detailLivePermission = this.LLJILJIL;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                str3 = (String) dataChannel.gg0(C771420UNw.class);
            } else {
                str3 = null;
            }
            C770800ULm.LIZIZ(detailLivePermission, str3, "show", str);
        }
    }
}
