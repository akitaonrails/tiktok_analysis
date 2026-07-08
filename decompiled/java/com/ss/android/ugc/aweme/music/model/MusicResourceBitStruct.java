package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicResourceBitStruct implements Serializable {

    @C09CT("channels")
    public final List<String> channels;

    @C09CT("colors")
    public final List<String> colors;

    @C09CT("desc")
    public final String desc;

    @C09CT("desc_color")
    public final String descColor;

    @C09CT("desc_size")
    public final String descSize;

    @C09CT("height")
    public final String height;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_size")
    public final String iconSize;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("margin")
    public final String margin;

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("schema")
    public final String schema;

    public final List<String> getChannels() {
        return this.channels;
    }

    public final List<String> getColors() {
        return this.colors;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDescColor() {
        return this.descColor;
    }

    public final String getDescSize() {
        return this.descSize;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconSize() {
        return this.iconSize;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMargin() {
        return this.margin;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSchema() {
        return this.schema;
    }
}
