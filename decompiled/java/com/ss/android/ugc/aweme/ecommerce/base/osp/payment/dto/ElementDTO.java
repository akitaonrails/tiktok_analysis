package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C15438062q;
import X.C19719612Di;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ElementDTO {

    @C09CT("inner_configuration")
    public Configuration configuration;

    @C09CT("description")
    public String description;

    @C09CT("display_name")
    public String displayName;

    @C09CT("display_tag")
    public String displayTag;

    @C09CT("frontend_rule_list")
    public List<FrontendRule> frontendRuleList;

    @C09CT("icon")
    public Icon icon;

    @C09CT("element")
    public String id;

    @C09CT("need_encryption")
    public Boolean needEncryption;

    @C09CT("notification_url")
    public String notificationUrl;

    @C09CT("param_name")
    public String paramName;

    @C09CT("placeholder_display_name")
    public String placeholderDisplayName;

    @C09CT("inner_style_type")
    public Integer styleType;

    @C09CT("sub_element_list")
    public List<ElementDTO> subElementDTOList;

    public ElementDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementDTO)) {
            return false;
        }
        ElementDTO elementDTO = (ElementDTO) obj;
        return Intrinsics.LJFF(this.id, elementDTO.id) && Intrinsics.LJFF(this.icon, elementDTO.icon) && Intrinsics.LJFF(this.styleType, elementDTO.styleType) && Intrinsics.LJFF(this.frontendRuleList, elementDTO.frontendRuleList) && Intrinsics.LJFF(this.displayTag, elementDTO.displayTag) && Intrinsics.LJFF(this.paramName, elementDTO.paramName) && Intrinsics.LJFF(this.placeholderDisplayName, elementDTO.placeholderDisplayName) && Intrinsics.LJFF(this.subElementDTOList, elementDTO.subElementDTOList) && Intrinsics.LJFF(this.displayName, elementDTO.displayName) && Intrinsics.LJFF(this.needEncryption, elementDTO.needEncryption) && Intrinsics.LJFF(this.notificationUrl, elementDTO.notificationUrl) && Intrinsics.LJFF(this.configuration, elementDTO.configuration) && Intrinsics.LJFF(this.description, elementDTO.description);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.styleType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<FrontendRule> list = this.frontendRuleList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.displayTag;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramName;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholderDisplayName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ElementDTO> list2 = this.subElementDTOList;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.needEncryption;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.notificationUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int iHashCode12 = (iHashCode11 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str7 = this.description;
        return iHashCode12 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "ElementDTO(id=" + this.id + ", icon=" + this.icon + ", styleType=" + this.styleType + ", frontendRuleList=" + this.frontendRuleList + ", displayTag=" + this.displayTag + ", paramName=" + this.paramName + ", placeholderDisplayName=" + this.placeholderDisplayName + ", subElementDTOList=" + this.subElementDTOList + ", displayName=" + this.displayName + ", needEncryption=" + this.needEncryption + ", notificationUrl=" + this.notificationUrl + ", configuration=" + this.configuration + ", description=" + this.description + ')';
    }

    public final PaymentElement LIZ() {
        return new PaymentElement(this.id, this.paramName, "", this.needEncryption, Boolean.FALSE);
    }

    public final List<PaymentElement> LIZIZ() {
        List<ElementDTO> list = this.subElementDTOList;
        if (list == null || list.isEmpty()) {
            return Collections.singletonList(LIZ());
        }
        List<ElementDTO> list2 = this.subElementDTOList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<ElementDTO> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        return arrayList;
    }

    public final List<ElementDTO> LIZJ() {
        List<ElementDTO> list = this.subElementDTOList;
        if (list == null || list.isEmpty()) {
            return Collections.singletonList(this);
        }
        List<ElementDTO> list2 = this.subElementDTOList;
        ArrayList arrayList = new ArrayList();
        Iterator<ElementDTO> it2 = list2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LIZJ(), arrayList);
        }
        return arrayList;
    }

    public ElementDTO(String str, Icon icon, Integer num, List<FrontendRule> list, String str2, String str3, String str4, List<ElementDTO> list2, String str5, Boolean bool, String str6, Configuration configuration, String str7) {
        this.id = str;
        this.icon = icon;
        this.styleType = num;
        this.frontendRuleList = list;
        this.displayTag = str2;
        this.paramName = str3;
        this.placeholderDisplayName = str4;
        this.subElementDTOList = list2;
        this.displayName = str5;
        this.needEncryption = bool;
        this.notificationUrl = str6;
        this.configuration = configuration;
        this.description = str7;
    }
}
