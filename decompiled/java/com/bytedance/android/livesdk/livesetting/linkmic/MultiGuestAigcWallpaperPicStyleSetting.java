package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_aigc_wallpaper_pic_style")
public final class MultiGuestAigcWallpaperPicStyleSetting {
    public static final MultiGuestAigcWallpaperPicStyleSetting INSTANCE = new MultiGuestAigcWallpaperPicStyleSetting();
    public static final List<PicStyleItem> DEFAULT = C13BV.INSTANCE;

    public final List<PicStyleItem> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<PicStyleItem> list = DEFAULT;
        List<PicStyleItem> list2 = (List) settingsManager.getValueSafely("multi_guest_aigc_wallpaper_pic_style", list);
        return list2 != null ? list2 : list;
    }

    public static final class PicStyleItem {
        public static final TypeAdapter ADAPTER = new MultiGuestAigcWallpaperPicStyleSetting_PicStyleItem_OptTypeAdapter(NormalGson.singleton());

        @C09CT("picUrl")
        public String geckoFileName;

        @C09CT("isSelected")
        public boolean isSelected;

        @C09CT("position")
        public int position;

        @C09CT("styleName")
        public String styleName;

        @C09CT("styleVal")
        public long styleVal;

        public PicStyleItem() {
            this(null, null, 0, false, 0L);
        }

        public PicStyleItem(String str, String str2, int i, boolean z, long j) {
            this.geckoFileName = str;
            this.styleName = str2;
            this.position = i;
            this.isSelected = z;
            this.styleVal = j;
        }
    }
}
