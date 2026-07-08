package com.ss.android.ugc.aweme.shortvideo.model;

import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* JADX INFO: loaded from: classes2.dex */
public final class GreenScreenMaterialKt {
    public static final String getAuthorName(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getAuthorName();
        }
        return null;
    }

    public static final String getEffectId(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getStickerId();
        }
        return null;
    }

    public static final Long getEndTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getEndTime());
        }
        return null;
    }

    public static final String getLocalPath(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getLocalPath();
        }
        return null;
    }

    public static final String getMediasource(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getMediasource();
        }
        return null;
    }

    public static final String getResId(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getResId();
        }
        return null;
    }

    public static final Long getStartTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getStartTime());
        }
        return null;
    }

    public static final Integer getType(TimeSpeedModelExtension timeSpeedModelExtension) {
        com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial = (com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Integer.valueOf(greenScreenMaterial.getType());
        }
        return null;
    }

    public static final boolean isGreenScreenClip(TimeSpeedModelExtension timeSpeedModelExtension) {
        if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material") != null) {
            return true;
        }
        return false;
    }

    public static final Bundle asBundle(com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial greenScreenMaterial, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJIJL(bundle, "extra_key_green_screen_material", greenScreenMaterial);
        return bundle;
    }
}
