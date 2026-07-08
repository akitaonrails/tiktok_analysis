package com.ss.android.ugc.aweme.relation.usercard.vm;

import X.C338480DOs;
import X.EnumC1262370ixH;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.spi.IPostListVMService;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class PostListVMServiceImpl implements IPostListVMService {
    @Override // com.ss.android.ugc.aweme.relation.usercard.spi.IPostListVMService
    public final void LIZ(LifecycleOwner lifecycleOwner, User user, EnumC1262370ixH enumC1262370ixH, Map<String, String> map) {
        RecUserVideoListSharedVM recUserVideoListSharedVMLIZIZ = C338480DOs.LIZIZ(lifecycleOwner, user, enumC1262370ixH);
        if (map != null) {
            recUserVideoListSharedVMLIZIZ.LLJIJIL = map;
        }
    }
}
