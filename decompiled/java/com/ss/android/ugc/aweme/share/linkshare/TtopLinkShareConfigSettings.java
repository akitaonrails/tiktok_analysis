package com.ss.android.ugc.aweme.share.linkshare;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class TtopLinkShareConfigSettings {
    public static final TtopLinkShareConfigModel LIZ = new TtopLinkShareConfigModel(1, C2097608Jq.LJIIIIZZ(new Pair(CardStruct.IStatusCode.DEFAULT, "7399871919215874577"), new Pair("1", "7403190503887344129")), "https://connect.tiktok-minis.com/assets/share/link_share_fg_video.png", "https://connect.tiktok-minis.com/assets/share/link_share_bg_video.png", "https://connect.tiktok-minis.com/assets/share/link_share_bg_photo.png", "https://connect.tiktok-minis.com/assets/share/link_share_bg_message.png");

    public static final TtopLinkShareConfigModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TtopLinkShareConfigModel ttopLinkShareConfigModel = LIZ;
            TtopLinkShareConfigModel ttopLinkShareConfigModel2 = (TtopLinkShareConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttop_link_share_config", TtopLinkShareConfigModel.class, ttopLinkShareConfigModel);
            return ttopLinkShareConfigModel2 != null ? ttopLinkShareConfigModel2 : ttopLinkShareConfigModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class TtopLinkShareConfigModel {

        @C09CT("linksharing_enable")
        public final int linkShareEnabled;

        @C09CT("share_to_message_bg_image_url")
        public final String messageBgImageUrl;

        @C09CT("share_to_photo_bg_image_url")
        public final String photoBgImageUrl;

        @C09CT("share_to_video_bg_image_url")
        public final String videoBgImageUrl;

        @C09CT("share_to_video_fg_image_url")
        public final String videoFgImageUrl;

        @C09CT("video_green_screen_effect_id_map")
        public final Map<String, String> videoGreenScreenEffectId;

        public TtopLinkShareConfigModel(int i, Map<String, String> map, String str, String str2, String str3, String str4) {
            this.linkShareEnabled = i;
            this.videoGreenScreenEffectId = map;
            this.videoFgImageUrl = str;
            this.videoBgImageUrl = str2;
            this.photoBgImageUrl = str3;
            this.messageBgImageUrl = str4;
        }
    }
}
