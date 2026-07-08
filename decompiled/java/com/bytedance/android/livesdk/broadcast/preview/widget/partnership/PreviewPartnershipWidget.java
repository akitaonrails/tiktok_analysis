package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C013B;
import X.C015T;
import X.C015V;
import X.C01GU;
import X.C0IJT;
import X.C1161920gLG;
import X.C168I;
import X.C197400pQ;
import X.C197600pS;
import X.C2097608Jq;
import X.C2187701Ajg;
import X.C474500IjA;
import X.C515301zb;
import X.C5183020f;
import X.C749500Tae;
import X.C786410Ut5;
import android.app.Application;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.GamePartnershipEntrance;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRegionValiditySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPartnershipWidget extends PreviewToolBaseWidget {
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public AnchorInfoResponse.PunishInfo LLJ;
    public AnchorInfoResponse.LabelFilterInfo LLJIJIL;
    public C015T LLJILJIL;
    public boolean LLJILJILJ;
    public final int LLJJ;
    public final int LLJJI;
    public Long LLJI = 0L;
    public final C515301zb LLJILLL = new C515301zb(this, 7);

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJJI);
    }

    public final boolean X1() {
        LiveMode liveMode;
        int i;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || ((i = C013B.LIZ[liveMode.ordinal()]) != 1 && i != 2)) ? false : true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannelGlobal.LLILZ.JQ2(C168I.class, Boolean.valueOf(this.LLIZ));
        if (this.LLIZ && X1()) {
            Map map = (Map) this.dataChannel.gg0(C749500Tae.class);
            if (map != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.SX0(C749500Tae.class, C2097608Jq.LJ());
                }
                if (Intrinsics.LJFF(map.get("gp_open_current_promote"), "1") && ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
                    Context context = this.context;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(W1(""));
                    linkedHashMap.put("gp_open_current_promote", "1");
                    C01GU.LIZ(context, linkedHashMap);
                }
            }
            super.show();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJIIZI(W1(""));
            c474500IjALIZ.LIZ();
        }
    }

    public PreviewPartnershipWidget() {
        this.LLJJ = GameLivePartnershipRegionValiditySetting.INSTANCE.isInEuRegion() ? 2131855635 : 2131841775;
        this.LLJJI = R.drawable.f6v;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View viewFindViewById;
        ViewTreeObserver viewTreeObserver;
        super.E1();
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.z1c)) != null && (viewTreeObserver = viewFindViewById.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.01AZ
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2;
                    AppCompatTextView appCompatTextView;
                    TextView textView;
                    Layout layout;
                    TextView textView2;
                    Layout layout2;
                    PreviewPartnershipWidget previewPartnershipWidget = this.LL;
                    if (previewPartnershipWidget.LLJILJILJ) {
                        View view2 = previewPartnershipWidget.getView();
                        if (view2 == null || (viewTreeObserver2 = view2.getViewTreeObserver()) == null) {
                            return true;
                        }
                        viewTreeObserver2.removeOnPreDrawListener(this);
                        C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                        return true;
                    }
                    previewPartnershipWidget.LLJILJILJ = true;
                    View view3 = previewPartnershipWidget.getView();
                    int lineCount = (view3 == null || (textView2 = (TextView) view3.findViewById(R.id.z1c)) == null || (layout2 = textView2.getLayout()) == null) ? 1 : layout2.getLineCount();
                    View view4 = previewPartnershipWidget.getView();
                    if (view4 != null && (textView = (TextView) view4.findViewById(R.id.z1c)) != null && (layout = textView.getLayout()) != null && layout.getEllipsisCount(lineCount - 1) <= 0) {
                        return true;
                    }
                    View view5 = previewPartnershipWidget.getView();
                    if (view5 != null && (appCompatTextView = (AppCompatTextView) view5.findViewById(R.id.z1c)) != null) {
                        appCompatTextView.setTextSize(1, 9.0f);
                    }
                    return false;
                }
            };
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.dataChannel.EQ2(this, GamePartnershipEntrance.class, new C5183020f(this, 100));
        C197600pS.LIZ().init();
        this.LLJILJIL = new C015T();
        Context context = this.context;
        Application application = (Application) (context != null ? C786410Ut5.N3(context) : null);
        if (application != null) {
            C015T c015t = this.LLJILJIL;
            application.registerActivityLifecycleCallbacks(c015t != null ? c015t : null);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C015V.LJFF(this.LLJILLL);
        C197600pS.LIZ().destroy();
        C197400pQ c197400pQFy0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0();
        if (c197400pQFy0 != null) {
            c197400pQFy0.LIZJ();
        }
        Context context = this.context;
        Application application = (Application) (context != null ? C786410Ut5.N3(context) : null);
        if (application != null) {
            C015T c015t = this.LLJILJIL;
            application.unregisterActivityLifecycleCallbacks(c015t != null ? c015t : null);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9 A[PHI: r1
      0x00f9: PHI (r1v20 boolean) = (r1v19 boolean), (r1v21 boolean) binds: [B:40:0x00f5, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> W1(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget.W1(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            webcast.api.partnership.AnchorInfoResponse$LabelFilterInfo r2 = r4.LLJIJIL
            if (r2 == 0) goto Lf
            boolean r1 = r2.gpppaAccount
            r0 = 1
            if (r1 != r0) goto Lf
        L9:
            java.lang.String r3 = r2.gpppaBanToast
        Lb:
            X.C766270U4b.LJIIJJI(r3)
            return
        Lf:
            r0 = 0
            r3 = 0
            if (r0 == 0) goto L16
            if (r2 == 0) goto Lb
            goto L9
        L16:
            boolean r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L81
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LLJ
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.punishText
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C766270U4b.LJIIJJI(r0)
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LLJ
            if (r0 == 0) goto L6a
            java.lang.String r0 = "livesdk_violation_toast"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIL()
            java.lang.String r1 = "violation_type"
            java.lang.String r0 = "handle_revoke"
            r2.LJJII(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L7f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.logStreamingType
        L4c:
            java.lang.String r0 = "live_type"
            r2.LJJII(r1, r0)
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LLJ
            if (r0 == 0) goto L5b
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r0.punishEventInfo
            if (r0 == 0) goto L5b
            java.lang.Long r3 = r0.duration
        L5b:
            java.lang.String r0 = "period"
            r2.LJJII(r3, r0)
            java.lang.String r1 = "scene_type"
            java.lang.String r0 = "inapp_go_play"
            r2.LJJII(r0, r1)
            r2.LIZ()
        L6a:
            java.lang.Long r0 = r4.LLJI
            if (r0 == 0) goto L7b
            long r2 = r0.longValue()
            X.14i1<java.lang.Long> r1 = X.C0UKZ.LLJIJIL
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.LJFF(r0)
        L7b:
            r4.H1()
            return
        L7f:
            r1 = r3
            goto L4c
        L81:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService) r0
            X.01GU r0 = r0.oK0()
            java.lang.String r2 = ""
            if (r0 == 0) goto L9a
            android.content.Context r1 = r4.context
            java.util.Map r0 = r4.W1(r2)
            X.C01GU.LIZ(r1, r0)
        L9a:
            java.lang.String r0 = "livesdk_gamepad_btn_click"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r1.LJIJJLI(r0)
            java.util.Map r0 = r4.W1(r2)
            r1.LJJIIZI(r0)
            r1.LIZ()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget.onClick(android.view.View):void");
    }
}
