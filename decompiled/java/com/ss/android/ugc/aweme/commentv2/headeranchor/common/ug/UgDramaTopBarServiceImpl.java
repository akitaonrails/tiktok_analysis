package com.ss.android.ugc.aweme.commentv2.headeranchor.common.ug;

import X.C123100dR;
import X.C1350580lFY;
import X.C1350920lG6;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2189821An6;
import X.C294800Bh0;
import X.EnumC1350510lFR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarAction;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class UgDramaTopBarServiceImpl implements ICommentTopBarImplementService {
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Integer getCustomizeTopBarViewLayout(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentLongClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.UG_DRAMA.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        C1350580lFY.LIZ.getClass();
        return C1350580lFY.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        C1350580lFY.LIZ.getClass();
        return C1350580lFY.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        C1350580lFY.LIZ.getClass();
        if (C1350580lFY.LIZJ(aweme) != null && C294800Bh0.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        ICommentPageContainer iCommentPageContainer;
        CommentTopBarAction commentTopBarAction = commentTopBarComponent.action;
        if (commentTopBarAction != null) {
            str = commentTopBarAction.schema;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && fragment != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ICommentPageContainer.class, null)) != null) {
            iCommentPageContainer.Kb1("click_ug_drama_anchor");
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        C1350580lFY c1350580lFY = C1350580lFY.LIZ;
        String str2 = commentTopBarComponent.name;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = null;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str = commonModel.eventType;
        } else {
            str = null;
        }
        c1350580lFY.getClass();
        CommentTopBarComponent commentTopBarComponentLIZJ = C1350580lFY.LIZJ(aweme);
        if (commentTopBarComponentLIZJ != null) {
            str3 = commentTopBarComponentLIZJ.tracerInfo;
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        HashMap mapLIZIZ = C1350580lFY.LIZIZ(str3);
        c1350920lG6.getClass();
        C1350920lG6.LJLIIIL(aweme, "ttexp_comment_top_component_show", str2, str, mapLIZIZ);
    }
}
