package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TempAMETabController {

    @C09CT("ame_asset_entrance_config")
    public final String ameAssetTabEntranceConfig;

    @C09CT("ame_inspector_entrance_config")
    public final TempAmeInspectorEntranceConfig ameInspectorEntranceConfig;

    @C09CT("ame_side_bar_entrance_config")
    public final String ameSideBarEntranceConfig;

    @C09CT("show_behaviour_entrance")
    public final boolean showBehaviourEntrance;

    public TempAMETabController() {
        this("promotion,divider,makeup,sticker,3d_accessory,filter,distortion,greenscreen,effect,template,gan,text", "switch,layer,behaviour", new TempAmeInspectorEntranceConfig("edit,behaviour,property,delete,flip,copy", "edit,behaviour,delete,loop,property,flip,copy", "edit,behaviour,property,delete,flip,copy", "edit,behaviour,delete,copy", "edit,behaviour,property,delete,copy", "edit,behaviour,property,delete,copy", "edit,behaviour,delete,copy", "edit,behaviour,property,mirror,delete,copy", "edit,behaviour,delete", "face_fusion,edit,behaviour,delete", "tracking,behaviour,property,delete,copy", "property,tracking,behaviour,delete,copy,edit,flip", "property,tracking,behaviour,delete,copy,edit,flip", "property,tracking,behaviour,delete,loop,copy,edit,flip", "tracking,placeholder,reshape,behaviour,copy,delete,property", "clip,edit,delete", "edit,behaviour,delete", "tracking,face_area,property,behaviour,delete,copy", "property,delete", "behaviour,copy,delete"), true);
    }

    public TempAMETabController(String str, String str2, TempAmeInspectorEntranceConfig tempAmeInspectorEntranceConfig, boolean z) {
        this.ameAssetTabEntranceConfig = str;
        this.ameSideBarEntranceConfig = str2;
        this.ameInspectorEntranceConfig = tempAmeInspectorEntranceConfig;
        this.showBehaviourEntrance = z;
    }
}
