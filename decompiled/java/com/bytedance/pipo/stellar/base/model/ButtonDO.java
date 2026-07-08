package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ButtonDO extends BaseWidgetDO {

    @C09CT("content")
    public final String content;

    @C09CT("disabled")
    public final Integer disabled;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("size")
    public final String size;

    @C09CT("variant")
    public final String variant;

    public ButtonDO() {
        this(null, null, null, null, null);
    }

    public final ButtonDO copy(String str, String str2, String str3, ImageDO imageDO, Integer num) {
        return new ButtonDO(str, str2, str3, imageDO, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonDO)) {
            return false;
        }
        ButtonDO buttonDO = (ButtonDO) obj;
        return Intrinsics.LJFF(this.size, buttonDO.size) && Intrinsics.LJFF(this.variant, buttonDO.variant) && Intrinsics.LJFF(this.content, buttonDO.content) && Intrinsics.LJFF(this.icon, buttonDO.icon) && Intrinsics.LJFF(this.disabled, buttonDO.disabled);
    }

    public int hashCode() {
        String str = this.size;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variant;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageDO imageDO = this.icon;
        int iHashCode4 = (iHashCode3 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        Integer num = this.disabled;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonDO(size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.variant);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", disabled=");
        sbLIZ.append(this.disabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getDisabled() {
        return this.disabled;
    }

    public final ImageDO getIcon() {
        return this.icon;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getVariant() {
        return this.variant;
    }

    public ButtonDO(String str, String str2, String str3, ImageDO imageDO, Integer num) {
        super(null, null, 1, null, null);
        this.size = str;
        this.variant = str2;
        this.content = str3;
        this.icon = imageDO;
        this.disabled = num;
    }
}
