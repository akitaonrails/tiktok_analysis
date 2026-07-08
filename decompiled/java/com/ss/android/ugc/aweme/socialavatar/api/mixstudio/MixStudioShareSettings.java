package com.ss.android.ugc.aweme.socialavatar.api.mixstudio;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class MixStudioShareSettings {
    public static final Config LIZ = new Config("2639795550", "TikTokSans36pt-Black.otf", C1697810uHb.LJIIJJI("imagine_studio_story_bg_01.webp", "imagine_studio_story_bg_02.webp", "imagine_studio_story_bg_03.webp", "imagine_studio_story_bg_04.webp", "imagine_studio_story_bg_05.webp", "imagine_studio_story_bg_06.webp", "imagine_studio_story_bg_07.webp", "imagine_studio_story_bg_08.webp"), C1697810uHb.LJIIJJI("https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_01_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_02_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_03_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_04_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_05_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_06_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_07_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_08_v2.webp"), C1697810uHb.LJIIJJI("#CCE59787", "#CCBF9FCC", "#CC5FCCB6", "#FFABC6E3", "#CCE59787", "#CCBF9FCC", "#CC5FCCB6", "#FFABC6E3"));

    public static final class Config {

        @C09CT("background_file_names")
        public final List<String> backgroundFileNames;

        @C09CT("background_urls")
        public final List<String> backgroundUrls;

        @C09CT("font_effect_id")
        public final String fontEffectId;

        @C09CT("font_file_name")
        public final String fontFileName;

        @C09CT("font_shadow_colors")
        public final List<String> fontShadowColors;

        public Config() {
            this("2639795550", "TikTokSans36pt-Black.otf", C1697810uHb.LJIIJJI("imagine_studio_story_bg_01.webp", "imagine_studio_story_bg_02.webp", "imagine_studio_story_bg_03.webp", "imagine_studio_story_bg_04.webp", "imagine_studio_story_bg_05.webp", "imagine_studio_story_bg_06.webp", "imagine_studio_story_bg_07.webp", "imagine_studio_story_bg_08.webp"), C1697810uHb.LJIIJJI("https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_01_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_02_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_03_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_04_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_05_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_06_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_07_v2.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/imagine_studio/imagine_studio_story_bg_08_v2.webp"), C1697810uHb.LJIIJJI("#CCE59787", "#CCBF9FCC", "#CC5FCCB6", "#FFABC6E3", "#CCE59787", "#CCBF9FCC", "#CC5FCCB6", "#FFABC6E3"));
        }

        public Config(String str, String str2, List<String> list, List<String> list2, List<String> list3) {
            this.fontEffectId = str;
            this.fontFileName = str2;
            this.backgroundFileNames = list;
            this.backgroundUrls = list2;
            this.fontShadowColors = list3;
        }
    }

    public static final Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("imagine_studio_share_settings", Config.class, config);
        return config2 != null ? config2 : config;
    }
}
