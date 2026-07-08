package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class MaskLayer {

    @C09CT("mask_layer_type")
    public int maskLayerType;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("title")
    public Text title;

    public String getMaskLayerTypeStr() {
        int i = this.maskLayerType;
        return i == 1 ? "R2" : i == 2 ? "Game Age Restricted" : i == 3 ? "Game Disturbing Content" : "Unknown";
    }

    public boolean isGameAgeRestrictedType() {
        return this.maskLayerType == 2;
    }

    public boolean isGameDisturbingContentType() {
        return this.maskLayerType == 3;
    }

    public boolean isGameLiveMask() {
        int i = this.maskLayerType;
        return i == 2 || i == 3;
    }

    public boolean isR2OrUnknownMask() {
        int i = this.maskLayerType;
        return i == 1 || i == 0;
    }
}
