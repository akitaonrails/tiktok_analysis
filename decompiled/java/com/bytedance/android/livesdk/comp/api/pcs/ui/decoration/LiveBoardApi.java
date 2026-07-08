package com.bytedance.android.livesdk.comp.api.pcs.ui.decoration;

import X.AbstractC19484711Kz;
import X.C092G;
import X.C0X76;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.scene.Scene;
import java.util.List;
import tikcast.api.anchor.BatchMigrateBoardReq;
import tikcast.api.anchor.BatchMigrateBoardResponse;
import tikcast.api.anchor.DeleteBoardReq;
import tikcast.api.anchor.DeleteBoardResponse;
import tikcast.api.anchor.GetBoardAISummaryListResponse;
import tikcast.api.anchor.GetBoardItemTemplateListResponse;
import tikcast.api.anchor.GetBoardListResponse;
import tikcast.api.anchor.GetBoardResponse;
import tikcast.api.anchor.GetBoardTemplateListResponse;
import tikcast.api.anchor.MigrateBoardReq;
import tikcast.api.anchor.MigrateBoardResponse;
import tikcast.api.anchor.UpsertBoardItemReq;
import tikcast.api.anchor.UpsertBoardItemResponse;
import tikcast.api.anchor.UpsertBoardReq;
import tikcast.api.anchor.UpsertBoardResponse;
import webcast.api.smb.GetBoardPresetFontsResponse;
import webcast.api.smb.SMBBoardAuditReq;
import webcast.api.smb.SMBBoardAuditResponse;
import webcast.api.smb.SMBBoardLiveApplyReq;
import webcast.api.smb.SMBBoardLiveApplyResp;
import webcast.api.smb.SMBRecommendBoardResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveBoardApi {
    @InterfaceC1501170pAR("/webcast/smb/tool/board/live_apply/")
    Object applyBoardLive(@InterfaceC1485405rg SMBBoardLiveApplyReq sMBBoardLiveApplyReq, InterfaceC1364105Vn<? super C470590Icr<SMBBoardLiveApplyResp.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/smb/tool/board/audit/")
    Object boardAuditCheck(@InterfaceC1485405rg SMBBoardAuditReq sMBBoardAuditReq, InterfaceC1364105Vn<? super C470590Icr<SMBBoardAuditResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/batch_migrate/")
    Object boardBatchMigrate(@InterfaceC1485405rg BatchMigrateBoardReq batchMigrateBoardReq, InterfaceC1364105Vn<? super C470590Icr<List<BatchMigrateBoardResponse.ResponseData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/delete/")
    Object boardDelete(@InterfaceC1485405rg DeleteBoardReq deleteBoardReq, InterfaceC1364105Vn<? super C470590Icr<DeleteBoardResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/board/list/")
    Object boardList(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("supported_dsl_version") long j, InterfaceC1364105Vn<? super C470590Icr<GetBoardListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/migrate/")
    Object boardMigrate(@InterfaceC1485405rg MigrateBoardReq migrateBoardReq, InterfaceC1364105Vn<? super C470590Icr<MigrateBoardResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/board/template_list/")
    Object boardRecBoardTemplateList(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, InterfaceC1364105Vn<? super C470590Icr<GetBoardTemplateListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/upsert/")
    Object boardUpsert(@InterfaceC1485405rg UpsertBoardReq upsertBoardReq, InterfaceC1364105Vn<? super C470590Icr<UpsertBoardResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/board/item/template_list/")
    Object boardWordList(@InterfaceC1501070pAH("board_item_type") int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("count") int i3, InterfaceC1364105Vn<? super C470590Icr<GetBoardItemTemplateListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/board/ai_summary_list/")
    Object getAiSummaryBoardList(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("limit") int i2, InterfaceC1364105Vn<? super C470590Icr<GetBoardAISummaryListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/board/get/")
    Object getBoard(@InterfaceC1501070pAH("board_id") long j, @InterfaceC1501070pAH("supported_dsl_version") long j2, InterfaceC1364105Vn<? super C470590Icr<GetBoardResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/smb/tool/board/font_list/")
    Object getBoardFontList(@InterfaceC1501070pAH("supported_dsl_version") long j, InterfaceC1364105Vn<? super C470590Icr<GetBoardPresetFontsResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/smb/tool/board/recommend_list/")
    Object getBoardRecommendList(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("supported_dsl_version") long j2, InterfaceC1364105Vn<? super C470590Icr<SMBRecommendBoardResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/item/upsert/")
    Object suspendUpsertBoardItem(@InterfaceC1485405rg UpsertBoardItemReq upsertBoardItemReq, InterfaceC1364105Vn<? super C470590Icr<UpsertBoardItemResponse.ResponseData>> interfaceC1364105Vn);

    @C092G
    @InterfaceC1501170pAR("/webcast/room/upload/image/")
    Object uploadImage(@InterfaceC1501030pAD C0X76 c0x76, InterfaceC1364105Vn<? super C470590Icr<CoverImageModel>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/board/item/upsert/")
    AbstractC19484711Kz<C470590Icr<UpsertBoardItemResponse.ResponseData>> upsertBoardItem(@InterfaceC1485405rg UpsertBoardItemReq upsertBoardItemReq);
}
