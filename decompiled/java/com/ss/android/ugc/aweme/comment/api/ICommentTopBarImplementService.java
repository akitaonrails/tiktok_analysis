package com.ss.android.ugc.aweme.comment.api;

import X.C19EG;
import X.C2189821An6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentTopBarImplementService {
    boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6);

    View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource);

    List<Integer> getBizTypes();

    Integer getCustomizeTopBarViewLayout(Aweme aweme);

    Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    boolean onComponentLongClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent);

    void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);

    void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource);
}
