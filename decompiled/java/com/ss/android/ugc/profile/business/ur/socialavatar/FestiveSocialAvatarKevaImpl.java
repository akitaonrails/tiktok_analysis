package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.im.sticker.api.model.MixStudioFestiveSettings;
import com.ss.android.ugc.aweme.profile.keva.FestiveSocialAvatarKeva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FestiveSocialAvatarKevaImpl implements FestiveSocialAvatarKeva {
    @Override // com.ss.android.ugc.aweme.profile.keva.FestiveSocialAvatarKeva
    public final boolean LIZ() {
        String festiveId = MixStudioFestiveSettings.INSTANCE.getFestiveId();
        if (festiveId == null || festiveId.length() == 0) {
            return false;
        }
        return !Intrinsics.LJFF(LIZJ().getString("last_festive_id_popup_sheet", ""), festiveId);
    }

    @Override // com.ss.android.ugc.aweme.profile.keva.FestiveSocialAvatarKeva
    public final void LIZIZ() {
        String festiveId = MixStudioFestiveSettings.INSTANCE.getFestiveId();
        if (festiveId == null || festiveId.length() == 0) {
            return;
        }
        LIZJ().storeString("last_festive_id_popup_sheet", festiveId);
    }

    public static Keva LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_avatar_festive_keva_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
    }
}
