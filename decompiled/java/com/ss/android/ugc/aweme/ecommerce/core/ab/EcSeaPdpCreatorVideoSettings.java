package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpCreatorVideoSettings {
    public static final EcSeaPdpCreatorVideoModel LIZ;

    static {
        EcSeaPdpCreatorVideoModel ecSeaPdpCreatorVideoModel = new EcSeaPdpCreatorVideoModel(5, 3);
        EcSeaPdpCreatorVideoModel ecSeaPdpCreatorVideoModel2 = (EcSeaPdpCreatorVideoModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_sea_creator_video_config", EcSeaPdpCreatorVideoModel.class, ecSeaPdpCreatorVideoModel);
        if (ecSeaPdpCreatorVideoModel2 != null) {
            ecSeaPdpCreatorVideoModel = ecSeaPdpCreatorVideoModel2;
        }
        LIZ = ecSeaPdpCreatorVideoModel;
    }

    public static final class EcSeaPdpCreatorVideoModel {

        @C09CT("click_into_inner_feed_offset")
        public final Integer clickIntoFeedOffset;

        @C09CT("load_more_video_detail_count")
        public final Integer loadMoreVideoDetailCount;

        public EcSeaPdpCreatorVideoModel() {
            this(5, 3);
        }

        public EcSeaPdpCreatorVideoModel(Integer num, Integer num2) {
            this.loadMoreVideoDetailCount = num;
            this.clickIntoFeedOffset = num2;
        }
    }
}
