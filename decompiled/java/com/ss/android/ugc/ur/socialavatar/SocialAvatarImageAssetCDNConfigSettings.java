package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import X.C13DA;
import X.C2188811AlT;
import X.C531650Kt9;
import com.bytedance.ies.abmock.SettingsManager;
import java.text.DecimalFormat;
import java.util.Map;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarImageAssetCDNConfigSettings {
    public static final DecimalFormat LIZ = new DecimalFormat("00");
    public static final Map<String, String> LIZIZ;
    public static final SocialAvatarImageAssetCDNConfig LIZJ;

    public static final class SocialAvatarImageAssetCDNConfig {

        @C09CT("social_avatar_asset_config")
        public final Map<String, String> map;

        public SocialAvatarImageAssetCDNConfig() {
            this(SocialAvatarImageAssetCDNConfigSettings.LIZIZ);
        }

        public SocialAvatarImageAssetCDNConfig(Map<String, String> map) {
            this.map = map;
        }
    }

    static {
        C13DA c13da = new C13DA();
        c13da.put("social_avatar_banner_icon", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_banner_icon.png");
        c13da.put("social_avatar_creation_icon", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_creation_icon.png");
        c13da.put("social_avatar_floating_notice", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_floating_notice.png");
        c13da.put("social_avatar_intro_sheet_avatars", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet_avatars.png");
        c13da.put("social_avatar_banner_bg", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_profile/top_banner_bg_v2.webp");
        c13da.put("social_avatar_banner_img", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_profile/top_banner_icon.webp");
        c13da.put("social_avatar_card_img_dark", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_dm/intro_card_dark.webp");
        c13da.put("social_avatar_card_img_light", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_dm/intro_card_light.webp");
        c13da.put("social_avatar_icon_img", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_profile/bottom_banner_icon.webp");
        c13da.put("social_avatar_intro_thought", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/avatar_thoughts/intro_card.webp");
        c13da.put("social_avatar_reaction_dark", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_dm/reaction_dark.webp");
        c13da.put("social_avatar_reaction_light", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_dm/reaction_light.webp");
        C531650Kt9 it2 = new IntRange(1, 6).iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("social_avatar_bg_");
            DecimalFormat decimalFormat = LIZ;
            sbLIZ.append(decimalFormat.format(Integer.valueOf(iNextInt)));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_bg_");
            sbLIZ2.append(decimalFormat.format(Integer.valueOf(iNextInt)));
            sbLIZ2.append(".png");
            c13da.put(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
        C531650Kt9 it3 = new IntRange(7, 12).iterator();
        while (it3.LLILLL) {
            int iNextInt2 = it3.nextInt();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("social_avatar_bg_");
            DecimalFormat decimalFormat2 = LIZ;
            sbLIZ3.append(decimalFormat2.format(Integer.valueOf(iNextInt2)));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_result_page/social_avatar_bg_");
            sbLIZ4.append(decimalFormat2.format(Integer.valueOf(iNextInt2)));
            sbLIZ4.append(".webp");
            c13da.put(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ4));
        }
        C531650Kt9 it4 = new IntRange(1, 5).iterator();
        while (it4.LLILLL) {
            int iNextInt3 = it4.nextInt();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("social_avatar_bg_pattern_");
            DecimalFormat decimalFormat3 = LIZ;
            sbLIZ5.append(decimalFormat3.format(Integer.valueOf(iNextInt3)));
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_bg_pattern_");
            sbLIZ6.append(decimalFormat3.format(Integer.valueOf(iNextInt3)));
            sbLIZ6.append(".png");
            c13da.put(strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ6));
        }
        C531650Kt9 it5 = new IntRange(1, 6).iterator();
        while (it5.LLILLL) {
            int iNextInt4 = it5.nextInt();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("social_avatar_download_share_bg_");
            DecimalFormat decimalFormat4 = LIZ;
            sbLIZ7.append(decimalFormat4.format(Integer.valueOf(iNextInt4)));
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_download_share_bg_");
            sbLIZ8.append(decimalFormat4.format(Integer.valueOf(iNextInt4)));
            sbLIZ8.append("@3x.png");
            c13da.put(strLIZIZ4, C2188811AlT.LIZIZ(sbLIZ8));
        }
        C531650Kt9 it6 = new IntRange(1, 6).iterator();
        while (it6.LLILLL) {
            int iNextInt5 = it6.nextInt();
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("social_avatar_download_share_card_");
            DecimalFormat decimalFormat5 = LIZ;
            sbLIZ9.append(decimalFormat5.format(Integer.valueOf(iNextInt5)));
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ9);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_download_share_card_");
            sbLIZ10.append(decimalFormat5.format(Integer.valueOf(iNextInt5)));
            sbLIZ10.append("@3x.png");
            c13da.put(strLIZIZ5, C2188811AlT.LIZIZ(sbLIZ10));
        }
        C531650Kt9 it7 = new IntRange(7, 12).iterator();
        while (it7.LLILLL) {
            int iNextInt6 = it7.nextInt();
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("social_avatar_download_share_card_");
            DecimalFormat decimalFormat6 = LIZ;
            sbLIZ11.append(decimalFormat6.format(Integer.valueOf(iNextInt6)));
            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_download_share_card_");
            sbLIZ12.append(decimalFormat6.format(Integer.valueOf(iNextInt6)));
            sbLIZ12.append(".webp");
            c13da.put(strLIZIZ6, C2188811AlT.LIZIZ(sbLIZ12));
        }
        C531650Kt9 it8 = new IntRange(1, 6).iterator();
        while (it8.LLILLL) {
            int iNextInt7 = it8.nextInt();
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("social_avatar_download_share_mask_");
            DecimalFormat decimalFormat7 = LIZ;
            sbLIZ13.append(decimalFormat7.format(Integer.valueOf(iNextInt7)));
            String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ13);
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_download_share_mask_");
            sbLIZ14.append(decimalFormat7.format(Integer.valueOf(iNextInt7)));
            sbLIZ14.append("@3x.png");
            c13da.put(strLIZIZ7, C2188811AlT.LIZIZ(sbLIZ14));
        }
        C531650Kt9 it9 = new IntRange(7, 18).iterator();
        while (it9.LLILLL) {
            int iNextInt8 = it9.nextInt();
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("social_avatar_edit_bg_");
            DecimalFormat decimalFormat8 = LIZ;
            sbLIZ15.append(decimalFormat8.format(Integer.valueOf(iNextInt8)));
            String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ15);
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_result_page/social_avatar_edit_bg_");
            sbLIZ16.append(decimalFormat8.format(Integer.valueOf(iNextInt8)));
            sbLIZ16.append(".webp");
            c13da.put(strLIZIZ8, C2188811AlT.LIZIZ(sbLIZ16));
        }
        LIZIZ = c13da.build();
        LIZJ = new SocialAvatarImageAssetCDNConfig(LIZIZ);
    }

    public static String LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SocialAvatarImageAssetCDNConfig socialAvatarImageAssetCDNConfig = LIZJ;
        SocialAvatarImageAssetCDNConfig socialAvatarImageAssetCDNConfig2 = (SocialAvatarImageAssetCDNConfig) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_image_asset_cdn_config", SocialAvatarImageAssetCDNConfig.class, socialAvatarImageAssetCDNConfig);
        if (socialAvatarImageAssetCDNConfig2 != null) {
            socialAvatarImageAssetCDNConfig = socialAvatarImageAssetCDNConfig2;
        }
        return socialAvatarImageAssetCDNConfig.map.get(str);
    }
}
