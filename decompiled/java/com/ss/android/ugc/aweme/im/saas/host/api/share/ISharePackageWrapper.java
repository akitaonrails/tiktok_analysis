package com.ss.android.ugc.aweme.im.saas.host.api.share;

import X.C900540ZUm;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface ISharePackageWrapper {
    public static final C900540ZUm LIZ = C900540ZUm.LIZ;

    CommentSharePackage LIZ(CommentContent commentContent);

    void LIZIZ(GroupSharePackage groupSharePackage, List list);
}
