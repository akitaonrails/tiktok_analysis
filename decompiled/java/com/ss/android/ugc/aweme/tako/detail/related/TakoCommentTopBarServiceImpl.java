package com.ss.android.ugc.aweme.tako.detail.related;

import X.C04WE;
import X.C07EL;
import X.C0QSF;
import X.C123100dR;
import X.C1308910kAL;
import X.C14TF;
import X.C1857750yRZ;
import X.C19EG;
import X.C2189821An6;
import X.C289460BWe;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C597040NbK;
import X.C814420VxA;
import X.EnumC1350510lFR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIconStyle;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarMargin;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoCommentTopBarServiceImpl implements ICommentTopBarImplementService {
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
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
        return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.SEARCH_TAKO.getValue()));
    }

    public static TakoRelatedWordExtPassInfo LIZ(String str) {
        try {
            return (TakoRelatedWordExtPassInfo) C597040NbK.LIZ().LJII(str, TakoRelatedWordExtPassInfo.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        CommentTopBarText commentTopBarText;
        String str2;
        CommentTopBarText commentTopBarText2;
        String str3;
        if (aweme == null || str == null) {
            return false;
        }
        C14TF c14tf = C14TF.LIZIZ;
        if (!c14tf.LJIILL().LJIILIIL() || !c14tf.LJIILL().LJFF(aweme)) {
            return false;
        }
        if (c2189821An6 != null) {
            if (C289460BWe.LIZ()) {
                if (!c14tf.LJIILL().LJIIJ(c2189821An6.getEventType())) {
                    return false;
                }
            } else if (!c14tf.LJIILL().LJIILL(c2189821An6)) {
                return false;
            }
        } else if (C289460BWe.LIZ()) {
            if (!c14tf.LJIILL().LJIIJ(str)) {
                return false;
            }
        } else if (!c14tf.LJIILL().LIZLLL(str)) {
            return false;
        }
        if (c14tf.LJIILL().LJIIIZ(aweme, str) || (commentTopBarText = commentTopBarComponent.descSuffix) == null || (str2 = commentTopBarText.content) == null || str2.length() == 0) {
            return false;
        }
        CommentTopBarText commentTopBarText3 = commentTopBarComponent.descPrefix;
        if ((commentTopBarText3 == null || (str3 = commentTopBarText3.content) == null || str3.length() == 0) && (commentTopBarText2 = commentTopBarComponent.descPrefix) != null) {
            commentTopBarText2.setContent(C1857750yRZ.LJII(2131849646));
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        int i;
        CommentTopBarIconStyle commentTopBarIconStyle;
        CommentTopBarIcon commentTopBarIcon = commentTopBarComponent.icon;
        if (commentTopBarIcon != null && (commentTopBarIconStyle = commentTopBarIcon.style) != null) {
            commentTopBarIconStyle.setSize(14);
        }
        CommentTopBarIcon commentTopBarIcon2 = commentTopBarComponent.icon;
        if (commentTopBarIcon2 != null) {
            commentTopBarIcon2.setMargin(new CommentTopBarMargin(0, 0, 3, 0));
        }
        if (C0QSF.LIZ() && !((Boolean) C07EL.LIZ.getValue()).booleanValue()) {
            i = C14TF.LIZIZ.LJJLIIIJ().LJIIIIZZ(((Boolean) C04WE.LIZ.getValue()).booleanValue()).LIZ;
        } else {
            i = R.raw.icon_tako_new;
        }
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, context);
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[PHI: r7
      0x001c: PHI (r7v5 java.lang.String) = (r7v0 java.lang.String), (r7v6 java.lang.String) binds: [B:14:0x001a, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[PHI: r7
      0x0026: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String) binds: [B:14:0x001a, B:16:0x0020, B:18:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onComponentClick(X.C19EG r50, androidx.fragment.app.Fragment r51, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r52, com.ss.android.ugc.aweme.feed.model.Aweme r53, com.ss.android.ugc.aweme.comment.model.CommentContextSource r54) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.detail.related.TakoCommentTopBarServiceImpl.onComponentClick(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r2
      0x0011: PHI (r2v10 java.lang.String) = (r2v0 java.lang.String), (r2v11 java.lang.String) binds: [B:9:0x000f, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[PHI: r2
      0x001b: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v10 java.lang.String), (r2v10 java.lang.String) binds: [B:9:0x000f, B:11:0x0015, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComponentShow(X.C19EG r34, androidx.fragment.app.Fragment r35, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r36, com.ss.android.ugc.aweme.feed.model.Aweme r37, com.ss.android.ugc.aweme.comment.model.CommentContextSource r38) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.detail.related.TakoCommentTopBarServiceImpl.onComponentShow(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        CommentTopBarText commentTopBarText = commentTopBarComponent.descSuffix;
        String str2 = null;
        if (commentTopBarText != null) {
            str = commentTopBarText.content;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            C14TF c14tf = C14TF.LIZIZ;
            String str3 = commentTopBarComponent.name;
            if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
                str2 = commonModel.eventType;
            }
            c14tf.LJLLI(aweme, str3, str2);
        }
    }
}
