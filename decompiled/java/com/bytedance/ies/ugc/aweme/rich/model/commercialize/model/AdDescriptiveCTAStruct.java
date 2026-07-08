package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDescriptiveCTAStruct implements Serializable {

    @C09CT("bottom_container_info")
    public final AdBottomContainerInfoStruct bottomContainer;

    @C09CT("default_bottom_container_info")
    public final AdDefaultContainerInfoStruct defaultContainer;

    @C09CT("fold_button_info")
    public final AdFoldButtonInfoStruct foldButton;

    @C09CT("gecko_channel_list")
    public final List<String> geckoChannelList;

    @C09CT("hide_music_disc")
    public final boolean hideMusicDisc;

    @C09CT("left_container_info")
    public final AdTopContainerInfoStruct leftContainer;

    public AdDescriptiveCTAStruct() {
        this(null, null, null, null, null, false);
    }

    public final AdBottomContainerInfoStruct getBottomContainer() {
        return this.bottomContainer;
    }

    public final AdDefaultContainerInfoStruct getDefaultContainer() {
        return this.defaultContainer;
    }

    public final AdFoldButtonInfoStruct getFoldButton() {
        return this.foldButton;
    }

    public final List<String> getGeckoChannelList() {
        return this.geckoChannelList;
    }

    public final boolean getHideMusicDisc() {
        return this.hideMusicDisc;
    }

    public final AdTopContainerInfoStruct getLeftContainer() {
        return this.leftContainer;
    }

    public AdDescriptiveCTAStruct(List<String> list, AdTopContainerInfoStruct adTopContainerInfoStruct, AdBottomContainerInfoStruct adBottomContainerInfoStruct, AdDefaultContainerInfoStruct adDefaultContainerInfoStruct, AdFoldButtonInfoStruct adFoldButtonInfoStruct, boolean z) {
        this.geckoChannelList = list;
        this.leftContainer = adTopContainerInfoStruct;
        this.bottomContainer = adBottomContainerInfoStruct;
        this.defaultContainer = adDefaultContainerInfoStruct;
        this.foldButton = adFoldButtonInfoStruct;
        this.hideMusicDisc = z;
    }
}
