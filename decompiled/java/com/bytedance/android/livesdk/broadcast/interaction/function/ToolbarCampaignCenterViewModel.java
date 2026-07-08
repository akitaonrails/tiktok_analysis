package com.bytedance.android.livesdk.broadcast.interaction.function;

import X.C0IJT;
import X.C354201Zc;
import X.C474500IjA;
import X.C930940aKi;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.broadcast.setting.LiveCampaignSchemaSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes13.dex */
public final class ToolbarCampaignCenterViewModel extends ViewModel {
    public final ShowCampaignHintData LL = new ShowCampaignHintData();
    public final HideCampaignHintData LLILLJJLI = new HideCampaignHintData();
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;
    public volatile boolean LLILZIL;
    public String LLILZLL;

    public final void vQ2() {
        LiveMode streamType;
        if (this.LLILZLL == null) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(LiveCampaignSchemaSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("enter_from", "live_take_detail_campaign_center");
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            this.LLILZLL = builderAppendQueryParameter.appendQueryParameter("live_type", (room == null || (streamType = room.getStreamType()) == null) ? null : C354201Zc.LIZ(streamType)).appendQueryParameter("campaign_traffic_id", "cptraffic010106cp2846395827631948654").appendQueryParameter("enable_code_cache", SecondPageCodeCacheABSetting.INSTANCE.isMatch() ? "1" : CardStruct.IStatusCode.DEFAULT).build().toString();
        }
    }

    public final void wQ2() {
        if (this.LLILZIL) {
            return;
        }
        vQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_center_campaign_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL ? 3 : 0), "prompt_icon");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ ? 1 : 0), "prompt_api_return");
        c474500IjALIZ.LJJII("live_take_detail_campaign_center", "enter_from");
        c474500IjALIZ.LJJII(this.LLILZLL, "next_page_url");
        c474500IjALIZ.LIZ();
    }
}
