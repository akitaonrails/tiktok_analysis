package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class PaidContentImageSettings {
    public static final CouldntLoadImageSettings LIZ = new CouldntLoadImageSettings(new Image("", ""), new Image("", ""), new Image("", ""), new Image("", ""), new Image("", ""));

    public static final class CouldntLoadImageSettings {

        @C09CT("couldnt_load_img_url")
        public final Image couldntLoadImage;

        @C09CT("estimated_earnings_img_url")
        public final Image estimatedEarningsImage;

        @C09CT(alternate = {"guidence_to_create_url"}, value = "guidance_to_create_url")
        public final Image sellingSeriesGuidanceImage;

        @C09CT("series_creation_success_img_url")
        public final Image seriesCreationSuccessImage;

        @C09CT("promote_horn_img_url")
        public final Image seriesPromoteDialogImage;

        public CouldntLoadImageSettings() {
            this(new Image("", ""), new Image("", ""), new Image("", ""), new Image("", ""), new Image("", ""));
        }

        public CouldntLoadImageSettings(Image image, Image image2, Image image3, Image image4, Image image5) {
            this.couldntLoadImage = image;
            this.sellingSeriesGuidanceImage = image2;
            this.estimatedEarningsImage = image3;
            this.seriesCreationSuccessImage = image4;
            this.seriesPromoteDialogImage = image5;
        }
    }

    public static final class Image {

        @C09CT("dark")
        public final String dark;

        @C09CT("light")
        public final String light;

        public Image() {
            this("", "");
        }

        public Image(String str, String str2) {
            this.light = str;
            this.dark = str2;
        }
    }

    public static CouldntLoadImageSettings LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CouldntLoadImageSettings couldntLoadImageSettings = LIZ;
        CouldntLoadImageSettings couldntLoadImageSettings2 = (CouldntLoadImageSettings) settingsManagerLIZLLL.LJIIIIZZ("paid_content_settings", CouldntLoadImageSettings.class, couldntLoadImageSettings);
        return couldntLoadImageSettings2 != null ? couldntLoadImageSettings2 : couldntLoadImageSettings;
    }
}
