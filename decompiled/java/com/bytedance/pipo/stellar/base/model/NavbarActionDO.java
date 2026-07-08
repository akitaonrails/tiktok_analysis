package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class NavbarActionDO {
    public final boolean LIZ;

    @C09CT("click_action")
    public final StellarActionDO clickAction;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("obj_id")
    public final String id;

    @C09CT("image")
    public final ImageDO image;

    @C09CT("replace_icon")
    public final List<ImageDO> replaceIcons;

    @C09CT("subtitle")
    public final TextDO subtitle;

    @C09CT("text")
    public final TextDO text;

    @C09CT("title")
    public final TextDO title;

    @C09CT("action_type")
    public final String type;

    @C09CT("text_variant")
    public final String variant;

    public NavbarActionDO() {
        this(null, null, null, null, null, null, null, true, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavbarActionDO)) {
            return false;
        }
        NavbarActionDO navbarActionDO = (NavbarActionDO) obj;
        return Intrinsics.LJFF(this.id, navbarActionDO.id) && Intrinsics.LJFF(this.type, navbarActionDO.type) && Intrinsics.LJFF(this.icon, navbarActionDO.icon) && Intrinsics.LJFF(this.title, navbarActionDO.title) && Intrinsics.LJFF(this.subtitle, navbarActionDO.subtitle) && Intrinsics.LJFF(this.text, navbarActionDO.text) && Intrinsics.LJFF(this.image, navbarActionDO.image) && this.LIZ == navbarActionDO.LIZ && Intrinsics.LJFF(this.replaceIcons, navbarActionDO.replaceIcons) && Intrinsics.LJFF(this.clickAction, navbarActionDO.clickAction) && Intrinsics.LJFF(this.variant, navbarActionDO.variant);
    }

    public static NavbarActionDO LIZ(NavbarActionDO navbarActionDO, boolean z) {
        String str = navbarActionDO.id;
        String str2 = navbarActionDO.type;
        ImageDO imageDO = navbarActionDO.icon;
        TextDO textDO = navbarActionDO.title;
        TextDO textDO2 = navbarActionDO.subtitle;
        TextDO textDO3 = navbarActionDO.text;
        ImageDO imageDO2 = navbarActionDO.image;
        List<ImageDO> list = navbarActionDO.replaceIcons;
        StellarActionDO stellarActionDO = navbarActionDO.clickAction;
        String str3 = navbarActionDO.variant;
        navbarActionDO.getClass();
        return new NavbarActionDO(str, str2, imageDO, textDO, textDO2, textDO3, imageDO2, z, list, stellarActionDO, str3);
    }

    public NavbarActionDO(String str, String str2, ImageDO imageDO, TextDO textDO, TextDO textDO2, TextDO textDO3, ImageDO imageDO2, boolean z, List<ImageDO> list, StellarActionDO stellarActionDO, String str3) {
        this.id = str;
        this.type = str2;
        this.icon = imageDO;
        this.title = textDO;
        this.subtitle = textDO2;
        this.text = textDO3;
        this.image = imageDO2;
        this.LIZ = z;
        this.replaceIcons = list;
        this.clickAction = stellarActionDO;
        this.variant = str3;
    }
}
