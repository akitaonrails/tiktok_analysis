package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PanelVoucherInfo {

    @C09CT("bcm_standard_track")
    public final BcmStandardTrack bcmStandardTrack;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("cost_role_text")
    public final String costRoleText;

    @C09CT("cost_type")
    public final int costType;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("discount_text")
    public final String discountText;

    @C09CT("usable_end_time")
    public final long endTime;

    @C09CT("face_value")
    public final String faceValue;

    @C09CT("full_vap_schema")
    public final String fullVapSchema;

    @C09CT("vap_schema")
    public final String schema;

    @C09CT("scope_text")
    public final String scopeTxt;

    @C09CT("usable_start_time")
    public final long startTime;

    @C09CT("strategy_info")
    public final n strategyInfo;

    @C09CT("tc_lines")
    public final List<Object> tcLines;

    @C09CT("terms_apply")
    public final TermsApply termsApply;

    @C09CT("threshold_text")
    public final String thresholdText;

    @C09CT("title")
    public final String title;

    @C09CT("usable_reminder_text")
    public final String usableReminderText;

    @C09CT("use_limit_text")
    public final String useLimitText;

    @C09CT("vap_schema_type")
    public final Integer vapSchemaType;

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public PanelVoucherInfo() {
        this(null, null, 0, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null);
    }

    public PanelVoucherInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, String str9, List<Object> list, String str10, String str11, String str12, String str13, Integer num, TermsApply termsApply, String str14, n nVar, BcmStandardTrack bcmStandardTrack) {
        this.voucherId = str;
        this.voucherTypeId = str2;
        this.costType = i;
        this.title = str3;
        this.discountText = str4;
        this.thresholdText = str5;
        this.buttonText = str6;
        this.schema = str7;
        this.fullVapSchema = str8;
        this.startTime = j;
        this.endTime = j2;
        this.daInfo = str9;
        this.tcLines = list;
        this.scopeTxt = str10;
        this.costRoleText = str11;
        this.useLimitText = str12;
        this.usableReminderText = str13;
        this.vapSchemaType = num;
        this.termsApply = termsApply;
        this.faceValue = str14;
        this.strategyInfo = nVar;
        this.bcmStandardTrack = bcmStandardTrack;
    }
}
