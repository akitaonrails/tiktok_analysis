package com.ss.android.ugc.aweme.commentv2.headeranchor.common.bridge;

import X.C19EG;
import X.C2189821An6;
import X.InterfaceC1350330lF9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseTopBarBridgeServiceImpl implements ICommentTopBarImplementService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    public abstract InterfaceC1350330lF9 bridgeTopBar();

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public abstract /* synthetic */ List<Integer> getBizTypes();

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public boolean onComponentLongClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public Integer getCustomizeTopBarViewLayout(Aweme aweme) {
        return bridgeTopBar().LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        return bridgeTopBar().LJIIL(context, aweme, commentContextSource);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        return bridgeTopBar().LIZLLL(aweme, c2189821An6, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        bridgeTopBar().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        bridgeTopBar().LIZJ(commentContextSource, aweme);
    }
}
