package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShortTouchInfo {

    @C09CT("animation_type")
    public int animationType;

    @C09CT("container_type")
    public int containerType;

    @C09CT("height")
    public Integer height;

    @C09CT("img_url")
    public String imgUrl;

    @C09CT("jump_schema")
    public String jumpSchema;

    @C09CT("short_touch_fallback_url")
    public String shortTouchFallbackUrl;

    @C09CT("short_touch_url")
    public String shortTouchUrl;

    @C09CT("show_animation")
    public int showAnimation;

    @C09CT("sub_item_list")
    public List<String> subItemList;

    @C09CT("width")
    public Integer width;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.shortTouchUrl != null) {
            sb.append(", short_touch_url=");
            sb.append(this.shortTouchUrl);
        }
        if (this.shortTouchFallbackUrl != null) {
            sb.append(", short_touch_fallback_url=");
            sb.append(this.shortTouchFallbackUrl);
        }
        sb.append(", container_type=");
        sb.append(this.containerType);
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.imgUrl != null) {
            sb.append(", img_url=");
            sb.append(this.imgUrl);
        }
        if (this.jumpSchema != null) {
            sb.append(", jump_schema=");
            sb.append(this.jumpSchema);
        }
        sb.append(", show_animation=");
        sb.append(this.showAnimation);
        sb.append(", animation_type=");
        sb.append(this.animationType);
        List<String> list = this.subItemList;
        if (list != null && !list.isEmpty()) {
            sb.append(", sub_item_list=");
            sb.append(this.subItemList);
        }
        sb.replace(0, 2, "ShortTouchInfo{");
        sb.append('}');
        return sb.toString();
    }
}
