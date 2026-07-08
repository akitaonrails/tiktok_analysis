package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DialogContentDO extends BaseWidgetDO {

    @C09CT("accessory")
    public final AccessoryDO accessory;

    @C09CT("actions_area")
    public final DialogActionDO actionArea;

    @C09CT("message")
    public final TextDO message;

    @C09CT("theme")
    public final String theme;

    @C09CT("title")
    public final TextDO title;

    @C09CT("top_image")
    public final ImageDO topImage;

    public DialogContentDO() {
        this(null, null, null, null, null, null);
    }

    public final DialogContentDO copy(ImageDO imageDO, TextDO textDO, TextDO textDO2, AccessoryDO accessoryDO, DialogActionDO dialogActionDO, String str) {
        return new DialogContentDO(imageDO, textDO, textDO2, accessoryDO, dialogActionDO, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogContentDO)) {
            return false;
        }
        DialogContentDO dialogContentDO = (DialogContentDO) obj;
        return Intrinsics.LJFF(this.topImage, dialogContentDO.topImage) && Intrinsics.LJFF(this.title, dialogContentDO.title) && Intrinsics.LJFF(this.message, dialogContentDO.message) && Intrinsics.LJFF(this.accessory, dialogContentDO.accessory) && Intrinsics.LJFF(this.actionArea, dialogContentDO.actionArea) && Intrinsics.LJFF(this.theme, dialogContentDO.theme);
    }

    public int hashCode() {
        ImageDO imageDO = this.topImage;
        int iHashCode = (imageDO == null ? 0 : imageDO.hashCode()) * 31;
        TextDO textDO = this.title;
        int iHashCode2 = (iHashCode + (textDO == null ? 0 : textDO.hashCode())) * 31;
        TextDO textDO2 = this.message;
        int iHashCode3 = (iHashCode2 + (textDO2 == null ? 0 : textDO2.hashCode())) * 31;
        AccessoryDO accessoryDO = this.accessory;
        int iHashCode4 = (iHashCode3 + (accessoryDO == null ? 0 : accessoryDO.hashCode())) * 31;
        DialogActionDO dialogActionDO = this.actionArea;
        int iHashCode5 = (iHashCode4 + (dialogActionDO == null ? 0 : dialogActionDO.hashCode())) * 31;
        String str = this.theme;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogContentDO(topImage=");
        sbLIZ.append(this.topImage);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", accessory=");
        sbLIZ.append(this.accessory);
        sbLIZ.append(", actionArea=");
        sbLIZ.append(this.actionArea);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.theme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AccessoryDO getAccessory() {
        return this.accessory;
    }

    public final DialogActionDO getActionArea() {
        return this.actionArea;
    }

    public final TextDO getMessage() {
        return this.message;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final TextDO getTitle() {
        return this.title;
    }

    public final ImageDO getTopImage() {
        return this.topImage;
    }

    public DialogContentDO(ImageDO imageDO, TextDO textDO, TextDO textDO2, AccessoryDO accessoryDO, DialogActionDO dialogActionDO, String str) {
        super(null, null, 1, null, null);
        this.topImage = imageDO;
        this.title = textDO;
        this.message = textDO2;
        this.accessory = accessoryDO;
        this.actionArea = dialogActionDO;
        this.theme = str;
    }
}
