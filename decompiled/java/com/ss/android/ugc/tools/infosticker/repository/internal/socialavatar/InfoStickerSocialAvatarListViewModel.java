package com.ss.android.ugc.tools.infosticker.repository.internal.socialavatar;

import X.AbstractC19484711Kz;
import X.C0HK0;
import X.C13BV;
import X.C1465200oEQ;
import X.C454640HsE;
import X.C455350HtN;
import X.EnumC1641470soj;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSocialAvatarListViewModel extends BaseInfoStickerListViewModel<SocialAvatarStickerStruct> {
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
        this.LL.setValue(null);
        this.LLILLJJLI.setValue(EnumC1641470soj.NONE);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<SocialAvatarStickerStruct>> wQ2() {
        List<StickerItem> stickers;
        C0HK0 c0hk0;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        IMSocialAvatarStatus value = c454640HsE.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue();
        if (!(value instanceof C0HK0) || (c0hk0 = (C0HK0) value) == null || (stickers = c0hk0.getStickers()) == null) {
            stickers = C13BV.INSTANCE;
        }
        List<StickerItem> listLJIIJ = c454640HsE.LIZIZ().getImSocialAvatarService().LJIIJ(stickers, null);
        ArrayList arrayList = new ArrayList();
        Iterator<StickerItem> it2 = listLJIIJ.iterator();
        while (it2.hasNext()) {
            SocialAvatarStickerStruct socialAvatarStickerStructLIZ = C455350HtN.LIZ(it2.next());
            if (socialAvatarStickerStructLIZ != null) {
                arrayList.add(socialAvatarStickerStructLIZ);
            }
        }
        return AbstractC19484711Kz.LJIJJLI(arrayList);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<SocialAvatarStickerStruct>> xQ2() throws NoSuchMethodException {
        throw new NoSuchMethodException("Social avatar sticker does not support load more action.");
    }

    public InfoStickerSocialAvatarListViewModel(C1465200oEQ c1465200oEQ) {
        super(c1465200oEQ);
    }
}
