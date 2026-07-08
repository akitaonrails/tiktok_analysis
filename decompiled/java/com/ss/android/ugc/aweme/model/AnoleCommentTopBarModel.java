package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleCommentTopBarModel implements Serializable {

    @C09CT("aibot_enabled")
    public final boolean aiBotEnable;

    @C09CT("jump_model")
    public final AdUnifyJumpModel jumpModel;

    @C09CT("promo_code_notice_msg")
    public final String promoCodeNoticeMsg;

    @C09CT("ask_question")
    public final String question;

    @C09CT("comment_ad_top_bar")
    public final CommentTopBarUIModel uiModel;

    public final boolean getAiBotEnable() {
        return this.aiBotEnable;
    }

    public final AdUnifyJumpModel getJumpModel() {
        return this.jumpModel;
    }

    public final String getPromoCodeNoticeMsg() {
        return this.promoCodeNoticeMsg;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final CommentTopBarUIModel getUiModel() {
        return this.uiModel;
    }

    public AnoleCommentTopBarModel(CommentTopBarUIModel commentTopBarUIModel, AdUnifyJumpModel adUnifyJumpModel, String str, boolean z, String str2) {
        this.uiModel = commentTopBarUIModel;
        this.jumpModel = adUnifyJumpModel;
        this.question = str;
        this.aiBotEnable = z;
        this.promoCodeNoticeMsg = str2;
    }
}
