package com.ss.android.ugc.aweme.opensdk.contants;

import X.C09CT;
import X.C786410Ut5;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class OPSDK$GreenScreenKitConfig implements Serializable {

    @C09CT("green_screen_kit_audio_path")
    public String audioPath;

    @C09CT("green_screen_kit_effect_id")
    public String effectId;

    @C09CT("green_screen_kit_hide_image_picker")
    public boolean hideImagePicker;

    @C09CT("green_screen_kit_image_path")
    public String imagePath;

    @C09CT("share_from_green_screen_kit")
    public boolean shareFromGSK;

    @C09CT("green_screen_kit_video_path")
    public String videoPath;

    public OPSDK$GreenScreenKitConfig() {
        this(true, null, null, null, null, false);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_from_green_screen_kit", this.shareFromGSK);
        C786410Ut5.LJJJI("green_screen_kit_effect_id", this.effectId, bundle);
        C786410Ut5.LJJJI("green_screen_kit_video_path", this.videoPath, bundle);
        C786410Ut5.LJJJI("green_screen_kit_image_path", this.imagePath, bundle);
        C786410Ut5.LJJJI("green_screen_kit_audio_path", this.audioPath, bundle);
        bundle.putBoolean("green_screen_kit_hide_image_picker", this.hideImagePicker);
        return bundle;
    }

    public OPSDK$GreenScreenKitConfig(boolean z) {
        this(z, null, null, null, null, false);
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setHideImagePicker(boolean z) {
        this.hideImagePicker = z;
    }

    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    public final void setShareFromGSK(boolean z) {
        this.shareFromGSK = z;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str) {
        this(z, str, null, null, null, false);
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2) {
        this(z, str, str2, null, null, false);
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3) {
        this(z, str, str2, str3, null, false);
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3, String str4) {
        this(z, str, str2, str3, str4, false);
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3, String str4, boolean z2) {
        this.shareFromGSK = z;
        this.effectId = str;
        this.videoPath = str2;
        this.audioPath = str3;
        this.imagePath = str4;
        this.hideImagePicker = z2;
    }
}
