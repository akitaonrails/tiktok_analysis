package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C09CT;
import X.C0WZX;
import X.C1161920gLG;
import X.C1701330uNH;
import X.C19EG;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2204961BRm;
import X.C2436109gd;
import X.C520010KaN;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.dataChannel.AnchorRankEvent;
import com.bytedance.android.livesdk.rank.api.CloseAudienceRankingEvent;
import com.bytedance.android.livesdk.rank.api.CloseCreatorRankingEvent;
import com.bytedance.android.livesdk.rank.api.OpenAudienceRankingEvent;
import com.bytedance.android.livesdk.rank.api.OpenAudienceRankingWithParamsEvent;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveRankingListDialogSchemaHandler extends AbstractC2436909gl<RankListSchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("webcast_rank_dialog");

    public static final class RankListSchemaModel extends C2436109gd {

        @C09CT("type")
        public String type = "live_creator_ranking";

        @C09CT("action")
        public String action = "open";

        @C09CT("rank_group_type")
        public String rankGroupType = "";

        @C09CT("select_rank_type")
        public String selectRankType = "";

        @C09CT("select_sub_rank_type")
        public String selectSubRankType = "";

        @C09CT("rank_period")
        public String rankPeriod = "";

        @C09CT("tab_infos")
        public String tabInfos = "";

        @C09CT("source")
        public String source = "schema";

        @C09CT("rank_enter_type")
        public String rankEnterType = "";

        @C09CT("request_page")
        public String requestPage = "";

        @C09CT("target_anchor_id")
        public String targetCreatorId = CardStruct.IStatusCode.DEFAULT;

        @C09CT("entrance_sub_rank_type")
        public String entranceSubRankType = "";
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) throws Throwable {
        RankListSchemaModel rankListSchemaModel = (RankListSchemaModel) c2436109gd;
        boolean z = false;
        if (Intrinsics.LJFF(rankListSchemaModel.type, "offline")) {
            C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(context, true);
            if (c19egLJIJJLI != null) {
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("source", rankListSchemaModel.source, bundle);
                C786410Ut5.LJJJI("rank_enter_type", rankListSchemaModel.rankEnterType, bundle);
                C786410Ut5.LJJJI("request_page", rankListSchemaModel.requestPage, bundle);
                Intent intentCreateOfflineRankIntent = iHostAction.createOfflineRankIntent(c19egLJIJJLI, bundle);
                if (intentCreateOfflineRankIntent != null) {
                    intentCreateOfflineRankIntent.putExtra("rank_group_type", rankListSchemaModel.rankGroupType);
                    intentCreateOfflineRankIntent.putExtra("select_rank_type", rankListSchemaModel.selectRankType);
                    intentCreateOfflineRankIntent.putExtra("select_sub_rank_type", rankListSchemaModel.selectSubRankType);
                    intentCreateOfflineRankIntent.putExtra("rank_period", rankListSchemaModel.rankPeriod);
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(rankListSchemaModel.rankPeriod);
                    if (numLJIIJJI != null && numLJIIJJI.intValue() != 0) {
                        z = true;
                    }
                    intentCreateOfflineRankIntent.putExtra("history", z);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLJIJJLI, intentCreateOfflineRankIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentCreateOfflineRankIntent, c19egLJIJJLI);
                    C2204961BRm.LLJJJJ(c19egLJIJJLI, intentCreateOfflineRankIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6imsx5yiaWkJVzBuF64C5r2VbkYao0D/OMpYHm+YUUjFwq5v9p6XDIi9I8qOii2Q9W2967ayoH+zoe8ffWCF", null));
                }
            }
            return true;
        }
        if (Intrinsics.LJFF(rankListSchemaModel.type, "live_audience_ranking")) {
            if (Intrinsics.LJFF(rankListSchemaModel.action, "close")) {
                DataChannelGlobal.LLILZ.GQ2(CloseAudienceRankingEvent.class);
                return true;
            }
            if (rankListSchemaModel.entranceSubRankType.length() > 0) {
                DataChannelGlobal.LLILZ.FQ2(OpenAudienceRankingWithParamsEvent.class, C2097908Jt.LIZJ(new Pair("entrance_sub_rank_type", rankListSchemaModel.entranceSubRankType)));
                return true;
            }
            DataChannelGlobal.LLILZ.GQ2(OpenAudienceRankingEvent.class);
            return true;
        }
        if (Intrinsics.LJFF(rankListSchemaModel.action, "close")) {
            DataChannelGlobal.LLILZ.GQ2(CloseCreatorRankingEvent.class);
            return true;
        }
        HashMap map2 = new HashMap();
        map2.put("rank_group_type", rankListSchemaModel.rankGroupType);
        map2.put("select_rank_type", rankListSchemaModel.selectRankType);
        map2.put("select_sub_rank_type", rankListSchemaModel.selectSubRankType);
        map2.put("rank_period", rankListSchemaModel.rankPeriod);
        map2.put("tab_infos", rankListSchemaModel.tabInfos);
        map2.put("source", rankListSchemaModel.source);
        map2.put("target_creator_id", rankListSchemaModel.targetCreatorId);
        DataChannelGlobal.LLILZ.FQ2(AnchorRankEvent.class, map2);
        return true;
    }
}
