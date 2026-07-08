package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorStatusDO extends BaseWidgetDO {

    @C09CT("buttons")
    public final List<ButtonDO> buttons;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("layout")
    public final Integer layout;

    @C09CT("sub_title")
    public final TextDO subTitle;

    @C09CT("title")
    public final TextDO title;

    public ErrorStatusDO() {
        this(null, null, null, null, null);
    }

    public final ErrorStatusDO copy(TextDO textDO, TextDO textDO2, ImageDO imageDO, List<ButtonDO> list, Integer num) {
        return new ErrorStatusDO(textDO, textDO2, imageDO, list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorStatusDO)) {
            return false;
        }
        ErrorStatusDO errorStatusDO = (ErrorStatusDO) obj;
        return Intrinsics.LJFF(this.title, errorStatusDO.title) && Intrinsics.LJFF(this.subTitle, errorStatusDO.subTitle) && Intrinsics.LJFF(this.icon, errorStatusDO.icon) && Intrinsics.LJFF(this.buttons, errorStatusDO.buttons) && Intrinsics.LJFF(this.layout, errorStatusDO.layout);
    }

    public int hashCode() {
        TextDO textDO = this.title;
        int iHashCode = (textDO == null ? 0 : textDO.hashCode()) * 31;
        TextDO textDO2 = this.subTitle;
        int iHashCode2 = (iHashCode + (textDO2 == null ? 0 : textDO2.hashCode())) * 31;
        ImageDO imageDO = this.icon;
        int iHashCode3 = (iHashCode2 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        List<ButtonDO> list = this.buttons;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.layout;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorStatusDO(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", buttons=");
        sbLIZ.append(this.buttons);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ButtonDO> getButtons() {
        return this.buttons;
    }

    public final ImageDO getIcon() {
        return this.icon;
    }

    public final Integer getLayout() {
        return this.layout;
    }

    public final TextDO getSubTitle() {
        return this.subTitle;
    }

    public final TextDO getTitle() {
        return this.title;
    }

    public ErrorStatusDO(TextDO textDO, TextDO textDO2, ImageDO imageDO, List<ButtonDO> list, Integer num) {
        super(null, null, 1, null, null);
        this.title = textDO;
        this.subTitle = textDO2;
        this.icon = imageDO;
        this.buttons = list;
        this.layout = num;
    }
}
