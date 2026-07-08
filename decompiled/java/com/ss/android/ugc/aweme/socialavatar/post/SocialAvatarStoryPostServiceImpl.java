package com.ss.android.ugc.aweme.socialavatar.post;

import X.C13LP;
import X.C19EG;
import X.C455350HtN;
import X.C455410HtT;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarStoryPostServiceImpl implements ISocialAvatarStoryPostService {
    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService
    public final boolean enable() {
        SocialAvatarAccess socialAvatarAccess = (SocialAvatarAccess) PluggableExtentionKt.pluggableSpi$default(SocialAvatarAccess.class, false, false, false, 14, null);
        return socialAvatarAccess != null && socialAvatarAccess.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService
    public final SocialAvatarStickerStruct LIZIZ(String str) {
        StickerItem stickerItem = (StickerItem) C13LP.LJJJLL(IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIIZILJ(str, null));
        if (stickerItem == null) {
            return null;
        }
        return C455350HtN.LIZ(stickerItem);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService
    public final void LIZ(C19EG c19eg, LifecycleOwner lifecycleOwner, boolean z, boolean z2, List list) {
        PopupManager.LJIJI(new C455410HtT(c19eg, lifecycleOwner, z, z2, list), true);
    }
}
