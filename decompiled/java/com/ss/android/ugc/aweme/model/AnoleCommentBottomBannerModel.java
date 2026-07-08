package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleCommentBottomBannerModel implements Serializable {

    @C09CT("jump_model")
    public final AdUnifyJumpModel jumpModel;

    @C09CT("promo_code_notice_msg")
    public final String promoCodeNoticeMsg;

    @C09CT("comment_ad_bottom_banner")
    public final CommentBottomBannerUIModel uiModel;

    public AnoleCommentBottomBannerModel() {
        this(null, null, null);
    }

    public AnoleCommentBottomBannerModel(CommentBottomBannerUIModel commentBottomBannerUIModel, AdUnifyJumpModel adUnifyJumpModel, String str) {
        this.uiModel = commentBottomBannerUIModel;
        this.jumpModel = adUnifyJumpModel;
        this.promoCodeNoticeMsg = str;
    }
}
