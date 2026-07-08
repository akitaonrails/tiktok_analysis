package com.ss.android.ugc.aweme.ecommerce.dependency.comment;

import X.C01GW;
import X.C04TD;
import X.C0CNZ;
import X.C295880Bik;
import X.C523420Kfs;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDependencyService implements ICommentDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Map<String, String> getCommentThemeSparkParams() {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().getCommentThemeSparkParams();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean isCommentDarkModeOptExp() {
        C01GW c01gw = C295880Bik.LIZ;
        return C295880Bik.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean enableCommentRefactor() {
        ((CommentService) ServiceManager.get().getService(CommentService.class)).enableCommentRefactor();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public boolean enablePreloadHighestAnchor() {
        return C0CNZ.LIZIZ();
    }

    public static ICommentDependencyService createICommentDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommentDependencyService.class, z);
        if (objLIZ != null) {
            return (ICommentDependencyService) objLIZ;
        }
        if (C04TD.c == null) {
            synchronized (ICommentDependencyService.class) {
                if (C04TD.c == null) {
                    C04TD.c = new CommentDependencyService();
                }
            }
        }
        return C04TD.c;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Context getCommentThemeContext(Context context) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().getCommentThemeContext(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService
    public Map<String, String> getContentRecReasonParams(Aweme aweme, String str) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().getContentRecReasonParams(aweme, str);
    }
}
