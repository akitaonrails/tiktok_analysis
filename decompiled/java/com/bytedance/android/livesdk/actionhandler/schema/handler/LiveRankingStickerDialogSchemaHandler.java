package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C09CT;
import X.C1161920gLG;
import X.C2436109gd;
import X.C497740JfY;
import X.C520010KaN;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingStickerDialogSchemaHandler extends AbstractC2436909gl<RankStickerSchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("webcast_ranking_sticker");

    public static final class RankStickerSchemaModel extends C2436109gd {

        @C09CT("enter_from")
        public String enterFrom;

        @C09CT("height")
        public int height;

        @C09CT("rank_height_unit")
        public String rankHeightUnit;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("tip_or_tag_id")
        public String tipOrTagId;

        public RankStickerSchemaModel() {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            this.rankType = RankTypeV2.LJIIL.type;
            this.height = Integer.MIN_VALUE;
            this.enterFrom = "";
            this.rankHeightUnit = "";
            this.tipOrTagId = "";
        }
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        int iLIZIZ;
        RankStickerSchemaModel rankStickerSchemaModel = (RankStickerSchemaModel) c2436109gd;
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, true);
        if (fragmentManagerLJIL != null) {
            if (TextUtils.equals(rankStickerSchemaModel.rankHeightUnit, "rank_dp_unit")) {
                iLIZIZ = (int) C497740JfY.LIZIZ(rankStickerSchemaModel.height);
            } else {
                iLIZIZ = rankStickerSchemaModel.height;
            }
            LiveDialogFragment liveDialogFragmentYP = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).YP(rankStickerSchemaModel.rankType, iLIZIZ, rankStickerSchemaModel.enterFrom, rankStickerSchemaModel.tipOrTagId);
            if (liveDialogFragmentYP != null) {
                liveDialogFragmentYP.show(fragmentManagerLJIL, "LiveRankingStickerDialog");
            }
            return true;
        }
        return false;
    }
}
