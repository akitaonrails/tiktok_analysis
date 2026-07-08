package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C1710500uc4;
import X.EnumC1710490uc3;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class Element {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("backend_rule_list")
    public final List<CheckRule> backendRuleList;

    @C09CT("bank_detail_list")
    public final List<BankDetail> bankDetailList;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("description")
    public final String description;

    @C09CT("display_raw_text")
    public final String displayName;

    @C09CT("display_order")
    public final Long displayOrder;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("element")
    public final String id;

    @C09CT("info_url")
    public final String infoUrl;

    @C09CT("need_encrypted")
    public final Boolean needEncrypted;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("placeholder_raw_text")
    public final String placeholderRawText;

    @C09CT("style_type")
    public final String styleType;

    @C09CT("sub_element_list")
    public final List<Element> subElementList;

    public final EnumC1710490uc3 LIZ() {
        return C1710500uc4.LIZ(this.paramName);
    }

    public Element(String str, String str2, String str3, String str4, List<Element> list, String str5, List<CheckRule> list2, Long l, Boolean bool, List<BankDetail> list3, String str6, String str7, String str8, String str9) {
        this.id = str;
        this.iconUrl = str2;
        this.darkModeIconUrl = str3;
        this.styleType = str4;
        this.subElementList = list;
        this.paramName = str5;
        this.backendRuleList = list2;
        this.displayOrder = l;
        this.needEncrypted = bool;
        this.bankDetailList = list3;
        this.displayName = str6;
        this.placeholderRawText = str7;
        this.infoUrl = str8;
        this.description = str9;
    }
}
