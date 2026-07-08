package com.ss.android.ugc.aweme.commentv2.headeranchor.common.activity;

import X.C1350920lG6;
import X.C19EG;
import X.C2095008Iq;
import X.C2189821An6;
import X.EnumC1342350l2H;
import X.EnumC1350510lFR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentActivityTopBarServiceImpl implements ICommentTopBarImplementService {
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        return true;
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
        return true;
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
    public final void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.ACTIVITY.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        String aid;
        String str2;
        CommentCommonModel commonModel;
        String str3;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        HashMap<String, String> map = new HashMap<>();
        map.put("source", "comment_activity");
        String str4 = "";
        if (commentContextSource == null || (commonModel3 = commentContextSource.getCommonModel()) == null || (str = commonModel3.enterFrom) == null) {
            str = "";
        }
        map.put("current_page", str);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        map.put("last_group_id", aid);
        if (commentContextSource == null || (commonModel2 = commentContextSource.getCommonModel()) == null || (str2 = commonModel2.enterFrom) == null) {
            str2 = "";
        }
        map.put("enter_from", str2);
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && (str3 = commonModel.enterFrom) != null) {
            str4 = str3;
        }
        map.put("refer", str4);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        Long lLJIILIIL;
        CommentCommonModel commonModel;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.CLICK;
        String str = commentTopBarComponent.bizId;
        String str2 = null;
        if (str != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str2 = commonModel.enterFrom;
        }
        c1350920lG6.getClass();
        C1350920lG6.LJLI(enumC1342350l2H, lLJIILIIL, aweme, str2);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        Long lLJIILIIL;
        CommentCommonModel commonModel;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.SHOW;
        String str = commentTopBarComponent.bizId;
        String str2 = null;
        if (str != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str2 = commonModel.enterFrom;
        }
        c1350920lG6.getClass();
        C1350920lG6.LJLI(enumC1342350l2H, lLJIILIIL, aweme, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResumeShow(X.C19EG r6, androidx.fragment.app.Fragment r7, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, com.ss.android.ugc.aweme.comment.model.CommentContextSource r10) {
        /*
            r5 = this;
            X.0lG6 r3 = X.C1350920lG6.LIZ
            X.0l2H r2 = X.EnumC1342350l2H.SHOW
            java.lang.String r0 = r8.bizId
            r4 = 0
            if (r0 == 0) goto L52
            java.lang.Long r1 = X.C2095008Iq.LJIILIIL(r0)
        Ld:
            if (r10 == 0) goto L50
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r10.getCommonModel()
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.enterFrom
        L17:
            r3.getClass()
            X.C1350920lG6.LJLI(r2, r1, r9, r0)
            if (r10 == 0) goto L4b
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r10.getCommonModel()
            if (r0 == 0) goto L4b
            java.lang.String r1 = r0.eventType
        L27:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r10)
        L2b:
            X.C1350920lG6.LJLJI(r8, r1, r0, r4)
            java.lang.String r3 = r8.name
            if (r3 == 0) goto L45
            if (r10 == 0) goto L46
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r10.getCommonModel()
            if (r0 == 0) goto L46
            java.lang.String r2 = r0.eventType
        L3c:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r10)
        L40:
            java.lang.String r0 = "comment_top_component_show"
            X.C1350920lG6.LJLIIIL(r1, r0, r3, r2, r4)
        L45:
            return
        L46:
            r2 = r4
            if (r10 != 0) goto L3c
            r1 = r4
            goto L40
        L4b:
            r1 = r4
            if (r10 != 0) goto L27
            r0 = r4
            goto L2b
        L50:
            r0 = r4
            goto L17
        L52:
            r1 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.headeranchor.common.activity.CommentActivityTopBarServiceImpl.onResumeShow(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):void");
    }
}
