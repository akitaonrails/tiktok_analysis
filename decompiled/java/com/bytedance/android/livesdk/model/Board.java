package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Board {

    @C09CT("dsl_version")
    public long dslVersion;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("min_compatible_dsl_version")
    public long minCompatibleDslVersion;

    @C09CT("preview_image")
    public ImageModel previewImage;

    @C09CT("recommend_board_info")
    public RecommendBoardInfo recommendBoardInfo;

    @C09CT("smb_review_id")
    public long smbReviewId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("version")
    public int version;

    @C09CT("violation_id")
    public long violationId;

    @C09CT("board_item_list")
    public List<BoardItem> boardItemList = new ArrayList();

    @C09CT("preview_image_uri")
    public String previewImageUri = "";

    @C09CT("review_id")
    public String reviewId = "";

    @C09CT("preview_image_uri_list")
    public List<String> previewImageUriList = new ArrayList();

    @C09CT("preview_image_list")
    public List<ImageModel> previewImageList = new ArrayList();

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("smb_review_interception_reasons")
    public List<String> smbReviewInterceptionReasons = new ArrayList();

    @C09CT("preview_bg_color")
    public String previewBgColor = "";

    public final Board LIZ() {
        Board board = new Board();
        board.id = this.id;
        Iterator<BoardItem> it2 = this.boardItemList.iterator();
        while (it2.hasNext()) {
            board.boardItemList.add(it2.next().LIZ());
        }
        board.previewImageUri = this.previewImageUri;
        board.previewImage = this.previewImage;
        board.status = this.status;
        board.previewImageUriList = this.previewImageUriList;
        board.previewImageList = this.previewImageList;
        board.version = this.version;
        board.violationId = this.violationId;
        board.templateId = this.templateId;
        board.recommendBoardInfo = this.recommendBoardInfo;
        board.dslVersion = this.dslVersion;
        board.minCompatibleDslVersion = this.minCompatibleDslVersion;
        return board;
    }
}
