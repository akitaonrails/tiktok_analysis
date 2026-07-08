package com.ss.android.ugc.aweme.im.sdk.chat.legacy;

import X.C0C0R;
import X.C13BV;
import X.C1697810uHb;
import X.C457780HxI;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.PhotoSwapProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.PictureCardProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveVideoCardProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.VideoCardProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.photo.PrivateImageViewProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.photoswap.PhotoSwapNewProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.video.PrivateVideoViewProtocol;
import com.ss.android.ugc.aweme.im.service.legacy.IMMediaCardBridge;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMediaCardBridgeService implements IMMediaCardBridge {
    @Override // com.ss.android.ugc.aweme.im.service.legacy.IMMediaCardBridge
    public final List<Object> LIZ(Object obj) {
        C457780HxI c457780HxI;
        if ((obj instanceof C457780HxI) && (c457780HxI = (C457780HxI) obj) != null) {
            return C1697810uHb.LJIIJJI(new PhotoSwapProtocol(c457780HxI), new PictureCardProtocol(c457780HxI), new VideoCardProtocol(c457780HxI), new QuickLiveVideoCardProtocol(c457780HxI));
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.im.service.legacy.IMMediaCardBridge
    public final List<Object> LIZIZ(Fragment fragment, Object obj) {
        C457780HxI c457780HxI;
        if (!C0C0R.LIZ()) {
            return C13BV.INSTANCE;
        }
        if ((obj instanceof C457780HxI) && (c457780HxI = (C457780HxI) obj) != null) {
            return C1697810uHb.LJIIJJI(new PrivateImageViewProtocol(fragment, c457780HxI), new PrivateVideoViewProtocol(fragment, c457780HxI), new PhotoSwapNewProtocol(fragment, c457780HxI));
        }
        return C13BV.INSTANCE;
    }
}
