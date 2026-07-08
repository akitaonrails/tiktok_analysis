package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelPopup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionLabel implements Serializable {

    @C09CT("countdown")
    public LabelCountdown countdown;

    @C09CT("da_info")
    @C09CS(StringJsonAdapterFactory.class)
    public Map<String, Object> daInfo;

    @C09CT("default_style")
    public Integer defaultStyle;

    @C09CT("feature")
    public List<PromotionProperty> extraProperty;

    @C09CT("extra_text")
    public String extraText;

    @C09CT("icon")
    public LabelIcon icon;

    @C09CT("icon_popup")
    public LabelPopup iconPopup;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("instance_key")
    public String instanceKey;
    public transient PromotionLabelSingleConfig promotionLabelSingleConfig;

    @C09CT("schema")
    public String schema;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("text")
    public String text;

    @C09CT("text_popup")
    public LabelPopup textPopup;

    @C09CT("type")
    public int type;

    public PromotionLabel() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PromotionLabel copy(String str, String str2, int i, Integer num, String str3, String str4, LabelIcon labelIcon, String str5, LabelCountdown labelCountdown, Integer num2, List<PromotionProperty> list, Map<String, ? extends Object> map, LabelPopup labelPopup, LabelPopup labelPopup2, String str6) {
        return new PromotionLabel(str, str2, i, num, str3, str4, labelIcon, str5, labelCountdown, num2, list, map, labelPopup, labelPopup2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLabel)) {
            return false;
        }
        PromotionLabel promotionLabel = (PromotionLabel) obj;
        return Intrinsics.LJFF(this.id, promotionLabel.id) && Intrinsics.LJFF(this.idStr, promotionLabel.idStr) && this.type == promotionLabel.type && Intrinsics.LJFF(this.status, promotionLabel.status) && Intrinsics.LJFF(this.text, promotionLabel.text) && Intrinsics.LJFF(this.extraText, promotionLabel.extraText) && Intrinsics.LJFF(this.icon, promotionLabel.icon) && Intrinsics.LJFF(this.schema, promotionLabel.schema) && Intrinsics.LJFF(this.countdown, promotionLabel.countdown) && Intrinsics.LJFF(this.defaultStyle, promotionLabel.defaultStyle) && Intrinsics.LJFF(this.extraProperty, promotionLabel.extraProperty) && Intrinsics.LJFF(this.daInfo, promotionLabel.daInfo) && Intrinsics.LJFF(this.iconPopup, promotionLabel.iconPopup) && Intrinsics.LJFF(this.textPopup, promotionLabel.textPopup) && Intrinsics.LJFF(this.instanceKey, promotionLabel.instanceKey);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idStr;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.type) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extraText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LabelIcon labelIcon = this.icon;
        int iHashCode6 = (iHashCode5 + (labelIcon == null ? 0 : labelIcon.hashCode())) * 31;
        String str5 = this.schema;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LabelCountdown labelCountdown = this.countdown;
        int iHashCode8 = (iHashCode7 + (labelCountdown == null ? 0 : labelCountdown.hashCode())) * 31;
        Integer num2 = this.defaultStyle;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PromotionProperty> list = this.extraProperty;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.daInfo;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        LabelPopup labelPopup = this.iconPopup;
        int iHashCode12 = (iHashCode11 + (labelPopup == null ? 0 : labelPopup.hashCode())) * 31;
        LabelPopup labelPopup2 = this.textPopup;
        int iHashCode13 = (iHashCode12 + (labelPopup2 == null ? 0 : labelPopup2.hashCode())) * 31;
        String str6 = this.instanceKey;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "PromotionLabel(id=" + this.id + ", idStr=" + this.idStr + ", type=" + this.type + ", status=" + this.status + ", text=" + this.text + ", extraText=" + this.extraText + ", icon=" + this.icon + ", schema=" + this.schema + ", countdown=" + this.countdown + ", defaultStyle=" + this.defaultStyle + ", extraProperty=" + this.extraProperty + ", daInfo=" + this.daInfo + ", iconPopup=" + this.iconPopup + ", textPopup=" + this.textPopup + ", instanceKey=" + this.instanceKey + ')';
    }

    public final void setPromotionLabelSingleConfig(PromotionLabelSingleConfig promotionLabelSingleConfig) {
        this.promotionLabelSingleConfig = promotionLabelSingleConfig;
    }

    public PromotionLabel(String str, String str2, int i, Integer num, String str3, String str4, LabelIcon labelIcon, String str5, LabelCountdown labelCountdown, Integer num2, List<PromotionProperty> list, Map<String, ? extends Object> map, LabelPopup labelPopup, LabelPopup labelPopup2, String str6) {
        this.id = str;
        this.idStr = str2;
        this.type = i;
        this.status = num;
        this.text = str3;
        this.extraText = str4;
        this.icon = labelIcon;
        this.schema = str5;
        this.countdown = labelCountdown;
        this.defaultStyle = num2;
        this.extraProperty = list;
        this.daInfo = map;
        this.iconPopup = labelPopup;
        this.textPopup = labelPopup2;
        this.instanceKey = str6;
    }
}
