package com.ss.android.ugc.tiktok.anchor;

import X.C04TD;
import X.C1067370dsl;
import X.C1394160mNq;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.effect.IEffectAnchorRouteService;
import com.ss.android.ugc.aweme.utils.EffectAnchorService;
import kotlin.jvm.internal.AwS0S3510000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class EffectAnchorServiceImpl implements EffectAnchorService, IEffectAnchorRouteService {
    public static EffectAnchorService LIZLLL() {
        Object objLIZ = C04TD.LIZ(EffectAnchorService.class, false);
        if (objLIZ != null) {
            return (EffectAnchorService) objLIZ;
        }
        if (C04TD.T6 == null) {
            synchronized (EffectAnchorService.class) {
                if (C04TD.T6 == null) {
                    C04TD.T6 = new EffectAnchorServiceImpl();
                }
            }
        }
        return C04TD.T6;
    }

    @Override // com.ss.android.ugc.aweme.utils.EffectAnchorService
    public final StickerAnchorMaker LIZ() {
        return new StickerAnchorMaker(0);
    }

    @Override // com.ss.android.ugc.aweme.utils.EffectAnchorService
    public final C1067370dsl LIZJ() {
        return new C1067370dsl();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.IEffectAnchorRouteService
    public final void LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, Music music, AVMusic aVMusic, AnchorCommonStruct anchorCommonStruct2, String str, String str2, String str3, Fragment fragment, Activity activity, FlexibleComponentAbility flexibleComponentAbility) {
        C1394160mNq c1394160mNq = new C1394160mNq(0);
        c1394160mNq.LIZJ.LIZ(aweme, anchorCommonStruct, context, music, aVMusic, "", str, anchorCommonStruct2, ((Boolean) c1394160mNq.LIZLLL.getValue()).booleanValue(), str3, new AwS0S3510000_21(fragment, aweme, str2, c1394160mNq, str, activity, flexibleComponentAbility, 1));
    }
}
