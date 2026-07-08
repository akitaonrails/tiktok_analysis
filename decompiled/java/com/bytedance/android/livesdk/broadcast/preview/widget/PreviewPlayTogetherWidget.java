package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C1143680frq;
import X.C1161920gLG;
import X.C20337914i1;
import X.C20441214yg;
import X.C354201Zc;
import X.C474500IjA;
import X.C760180Trs;
import X.C770600UKs;
import X.InterfaceC772390URp;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLivePlayTogetherConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaV2Setting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewPlayTogetherWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131855143;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return 0;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        if (!C760180Trs.LJI()) {
            View view = getView();
            C1143680frq.LIZLLL(view != null ? view.findViewById(R.id.widget_icon) : null, "tiktok_live_game_demand_2", "ttlive_ic_play_together.png");
        }
        W1(true);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public final void W1(boolean z) {
        LiveMode liveMode;
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_play_together_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.SCREEN_RECORD;
        }
        c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(0, "has_red_dot");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        String creatorSettingSchema;
        LiveMode liveMode;
        GameLivePlayTogetherConfigSetting gameLivePlayTogetherConfigSetting = GameLivePlayTogetherConfigSetting.INSTANCE;
        if (gameLivePlayTogetherConfigSetting.enableV2()) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.m0;
            if (!c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.TRUE);
                creatorSettingSchema = TtlivePlayTogetherSchemaV2Setting.INSTANCE.getCreatorGuideSchema();
            } else {
                creatorSettingSchema = TtlivePlayTogetherSchemaV2Setting.INSTANCE.getCreatorSettingSchema();
            }
        } else {
            C20337914i1<Boolean> c20337914i12 = InterfaceC772390URp.l0;
            if (!c20337914i12.LIZIZ().booleanValue()) {
                c20337914i12.LJFF(Boolean.TRUE);
                creatorSettingSchema = TtlivePlayTogetherSchemaSetting.INSTANCE.getCreatorGuideSchema();
            } else {
                creatorSettingSchema = TtlivePlayTogetherSchemaSetting.INSTANCE.getCreatorSettingSchema();
            }
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(creatorSettingSchema).buildUpon().appendQueryParameter("show_entrance", "live_take_page");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.SCREEN_RECORD;
        }
        String str = "1";
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("live_type", C354201Zc.LIZ(liveMode)).appendQueryParameter("use_spark", "1");
        if (gameLivePlayTogetherConfigSetting.enableV2()) {
            if (!gameLivePlayTogetherConfigSetting.enableBoard()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            builderAppendQueryParameter2.appendQueryParameter("enable_show_board", str);
            builderAppendQueryParameter2.appendQueryParameter("force_theme_style", "light");
        }
        C770600UKs.LIZ(builderAppendQueryParameter2);
        String string = builderAppendQueryParameter2.build().toString();
        C20441214yg.LIZIZ("ZHANGYUE", string);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view.getContext(), string);
        W1(false);
    }
}
