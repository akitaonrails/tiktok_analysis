package com.ss.android.ugc.tools.infosticker.repository.internal.socialavatar;

import X.C11NZ;
import X.C1465200oEQ;
import X.C1634100scq;
import X.C1698350uIT;
import X.EnumC1641420soe;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSocialAvatarStateViewModel extends BaseInfoStickerStateViewModel<SocialAvatarStickerStruct> {
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public InfoStickerSocialAvatarStateViewModel(C1465200oEQ c1465200oEQ) {
        super(c1465200oEQ);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final C11NZ<C1634100scq<SocialAvatarStickerStruct, EnumC1641420soe, Integer>> vQ2(SocialAvatarStickerStruct socialAvatarStickerStruct) {
        return C11NZ.LJIJJLI(new C1698350uIT(socialAvatarStickerStruct, 0));
    }
}
