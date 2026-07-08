package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichTextContainerData {

    @C09CT("arrow_color")
    public final CustomColor arrowColor;

    @C09CT("arrow_content")
    public final ECRichText arrowContent;

    @C09CT("background_color")
    public final CustomColor backgroundColor;

    @C09CT("btm")
    public final SeaPdpBtm btm;

    @C09CT("content")
    public final List<ECRichText> content;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("schema")
    public final String schema;

    @C09CT("schema_type")
    public final Integer schemaType;

    @C09CT("track_params_for_schema")
    public final Map<String, String> trackParamsForSchema;

    public SeaPdpRichTextContainerData() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerData)) {
            return false;
        }
        SeaPdpRichTextContainerData seaPdpRichTextContainerData = (SeaPdpRichTextContainerData) obj;
        return Intrinsics.LJFF(this.icon, seaPdpRichTextContainerData.icon) && Intrinsics.LJFF(this.content, seaPdpRichTextContainerData.content) && Intrinsics.LJFF(this.backgroundColor, seaPdpRichTextContainerData.backgroundColor) && Intrinsics.LJFF(this.arrowColor, seaPdpRichTextContainerData.arrowColor) && Intrinsics.LJFF(this.schema, seaPdpRichTextContainerData.schema) && Intrinsics.LJFF(this.schemaType, seaPdpRichTextContainerData.schemaType) && Intrinsics.LJFF(this.daInfo, seaPdpRichTextContainerData.daInfo) && Intrinsics.LJFF(this.btm, seaPdpRichTextContainerData.btm) && Intrinsics.LJFF(this.trackParamsForSchema, seaPdpRichTextContainerData.trackParamsForSchema) && Intrinsics.LJFF(this.arrowContent, seaPdpRichTextContainerData.arrowContent);
    }

    public SeaPdpRichTextContainerData(Icon icon, List<ECRichText> list, CustomColor customColor, CustomColor customColor2, String str, Integer num, String str2, SeaPdpBtm seaPdpBtm, Map<String, String> map, ECRichText eCRichText) {
        this.icon = icon;
        this.content = list;
        this.backgroundColor = customColor;
        this.arrowColor = customColor2;
        this.schema = str;
        this.schemaType = num;
        this.daInfo = str2;
        this.btm = seaPdpBtm;
        this.trackParamsForSchema = map;
        this.arrowContent = eCRichText;
    }
}
