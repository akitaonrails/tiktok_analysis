package com.bytedance.android.livesdk.hashtag;

import X.C13LE;
import X.C19719912Dl;
import X.C754790TjB;
import X.EnumC754690Tj1;
import X.InterfaceC754470Tif;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes13.dex */
public class HashTagService implements IHashTagService {
    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final C19719912Dl RH() {
        return C13LE.LIZ(PreviewHashtagWidget2.class);
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final C19719912Dl jM1() {
        return C13LE.LIZ(PreviewHashtagRevisionOnlyIconWidget.class);
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final C19719912Dl uS0() {
        return C13LE.LIZ(PreviewHashtagRevisionGameWidget.class);
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final Class<? extends LiveRecyclableWidget> YE2() {
        return AudienceHashTagWidget.class;
    }

    @Override // com.bytedance.android.live.hashtag.IHashTagService
    public final void BC2(FragmentManager fragmentManager, InterfaceC754470Tif interfaceC754470Tif, EnumC754690Tj1 enumC754690Tj1, LiveMode liveMode) {
        C754790TjB.LIZ(fragmentManager, interfaceC754470Tif, enumC754690Tj1, liveMode, "add_topic");
    }
}
