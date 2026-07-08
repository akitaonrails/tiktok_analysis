package com.ss.android.ugc.aweme.socialavatar.mixstudio.story;

import X.AnonymousClass1201;
import X.C0ET4;
import X.C1659700tI8;
import X.C1910890zpH;
import X.C19684811zy;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.EnumC1910860zpE;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.social.sticker.service.socialavatar.IMixStudioStoryApi;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MixStudioAnimatedStoryServiceImpl implements IMixStudioStoryApi {
    public static final C1910890zpH LIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);

    @Override // com.ss.android.ugc.aweme.social.sticker.service.socialavatar.IMixStudioStoryApi
    public final void LIZ(C539960LFq c539960LFq, MixStickerInfo mixStickerInfo) {
        C1910890zpH c1910890zpH = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try registering animated mix story service: ");
        sbLIZ.append(mixStickerInfo);
        c1910890zpH.LIZ("MixStudioAnimatedStory", C2188811AlT.LIZIZ(sbLIZ));
        if (mixStickerInfo != null && Intrinsics.LJFF(mixStickerInfo.isAnimated(), Boolean.TRUE)) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C19684811zy.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(AnonymousClass1201.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, AnonymousClass1201.class, C19684811zy.class, new AwS608S0100000_29(new C0ET4(), c539960LFq, 276));
        }
    }
}
