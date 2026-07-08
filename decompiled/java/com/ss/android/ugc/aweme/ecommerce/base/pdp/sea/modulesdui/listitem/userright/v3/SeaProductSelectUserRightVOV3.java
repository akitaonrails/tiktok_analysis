package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpBtm;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaProductSelectUserRightVOV3 {

    @C09CT("btm")
    public final SeaPdpBtm btm;

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("schema")
    public final String schema;

    @C09CT("schema_type")
    public final Integer schemaType;

    @C09CT("tag_row_num")
    public final Integer tagRowNum;

    @C09CT("tags_list")
    public final List<SeaPdpRichText> tagsList;

    @C09CT("title_content")
    public final SeaPdpRichText titleContent;

    @C09CT("track_params_for_schema")
    public final Map<String, String> trackParamsForSchema;

    public SeaProductSelectUserRightVOV3() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaProductSelectUserRightVOV3)) {
            return false;
        }
        SeaProductSelectUserRightVOV3 seaProductSelectUserRightVOV3 = (SeaProductSelectUserRightVOV3) obj;
        return Intrinsics.LJFF(this.icon, seaProductSelectUserRightVOV3.icon) && Intrinsics.LJFF(this.titleContent, seaProductSelectUserRightVOV3.titleContent) && Intrinsics.LJFF(this.tagsList, seaProductSelectUserRightVOV3.tagsList) && Intrinsics.LJFF(this.tagRowNum, seaProductSelectUserRightVOV3.tagRowNum) && Intrinsics.LJFF(this.daInfo, seaProductSelectUserRightVOV3.daInfo) && Intrinsics.LJFF(this.schema, seaProductSelectUserRightVOV3.schema) && Intrinsics.LJFF(this.schemaType, seaProductSelectUserRightVOV3.schemaType) && Intrinsics.LJFF(this.trackParamsForSchema, seaProductSelectUserRightVOV3.trackParamsForSchema) && Intrinsics.LJFF(this.btm, seaProductSelectUserRightVOV3.btm);
    }

    public SeaProductSelectUserRightVOV3(Icon icon, SeaPdpRichText seaPdpRichText, List<SeaPdpRichText> list, Integer num, Map<String, ? extends Object> map, String str, Integer num2, Map<String, String> map2, SeaPdpBtm seaPdpBtm) {
        this.icon = icon;
        this.titleContent = seaPdpRichText;
        this.tagsList = list;
        this.tagRowNum = num;
        this.daInfo = map;
        this.schema = str;
        this.schemaType = num2;
        this.trackParamsForSchema = map2;
        this.btm = seaPdpBtm;
    }
}
