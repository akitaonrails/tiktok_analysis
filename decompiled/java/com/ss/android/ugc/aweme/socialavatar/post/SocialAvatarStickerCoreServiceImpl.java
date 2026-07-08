package com.ss.android.ugc.aweme.socialavatar.post;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C01GW;
import X.C19598411m2;
import X.C19598911m7;
import X.C19599311mB;
import X.C19599711mF;
import X.C19EG;
import X.C390420FSm;
import X.C452501pT;
import X.C705930RmZ;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;

/* JADX INFO: loaded from: classes30.dex */
public final class SocialAvatarStickerCoreServiceImpl implements ISocialAvatarStickerCoreService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C19598411m2());

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService
    public final Class<? extends AbstractC19589811ke<?>> LIZJ() {
        if (((Boolean) this.LIZ.getValue()).booleanValue()) {
            return C19598911m7.class;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11mB] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService
    public final C19599311mB LIZIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        return new AbstractC388880FMo<SocialAvatarStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm) { // from class: X.11mB
            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.SOCIAL_AVATAR;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                SocialAvatarStickerModel socialAvatarStickerModel = (SocialAvatarStickerModel) stickerModel;
                return socialAvatarStickerModel.copy(BaseStickerModel.copy$default(socialAvatarStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), socialAvatarStickerModel.id, socialAvatarStickerModel.expressions, socialAvatarStickerModel.lowResolutionUrl, socialAvatarStickerModel.midResolutionUrl, socialAvatarStickerModel.highResolutionUrl);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19599411mC(this.LIZ, (SocialAvatarStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }

            {
                C0FUH c0fuhLIZIZ = C390410FSl.LIZIZ(c390420FSm);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService
    public final C19599711mF LIZ(C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, ViewGroup viewGroup, boolean z, FragmentManager fragmentManager) {
        if (((Boolean) this.LIZ.getValue()).booleanValue()) {
            return new C19599711mF(c705930RmZ, c19eg, aweme, viewGroup, z, fragmentManager);
        }
        return null;
    }
}
