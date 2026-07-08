package com.bytedance.tracking;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public final class TrackingEventV3Data {

    @C09CT("charge_from")
    public final String chargeFromHash;

    @C09CT("charge_reason")
    public final String chargeReason;

    @C09CT("event_module")
    public final String eventModule;

    @C09CT("has_pipo_recharge_before")
    public final int hasPipoRechargeBefore;

    @C09CT("is_first_cash_recharge")
    public final int isFirstCashRecharge;

    @C09CT("is_first_recharge")
    public final int isFirstRecharge;

    @C09CT("is_switch_panel_type")
    public final int isSwitchPanelType;

    @C09CT("panel_channel")
    public final String panelChannel;

    @C09CT("recharge_v3_version")
    public final Integer rechargeV3Version;

    @C09CT("request_page")
    public final String requestPage;

    @C09CT("sub_source")
    public final Integer subSource;

    @C09CT("switch_panel_type")
    public final String switchPanelType;

    @C09CT("trigger_point")
    public final String triggerPoint;

    public TrackingEventV3Data() {
        this(0, null, 0, null, null, null, null, null, null, 0, 0, null, null);
    }

    public final Map<String, String> LIZ() {
        String string;
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("is_first_recharge", String.valueOf(this.isFirstRecharge));
        pairArr[1] = new Pair("is_first_cash_recharge", String.valueOf(this.isFirstCashRecharge));
        pairArr[2] = new Pair("has_pipo_recharge_before", String.valueOf(this.hasPipoRechargeBefore));
        String str = this.switchPanelType;
        if (str == null) {
            str = "";
        }
        pairArr[3] = new Pair("switch_panel_type", str);
        pairArr[4] = new Pair("is_switch_panel_type", String.valueOf(this.isSwitchPanelType));
        String str2 = this.panelChannel;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[5] = new Pair("panel_channel", str2);
        String str3 = this.eventModule;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[6] = new Pair("event_module", str3);
        String str4 = this.chargeReason;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[7] = new Pair("charge_reson", str4);
        Integer num = this.subSource;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        pairArr[8] = new Pair("sub_source", string);
        String str5 = this.triggerPoint;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[9] = new Pair("trigger_point", str5);
        String str6 = this.chargeFromHash;
        pairArr[10] = new Pair("charge_from", str6 != null ? str6 : "");
        pairArr[11] = new Pair("recharge_v3_version", String.valueOf(this.rechargeV3Version));
        return C2097608Jq.LJI(pairArr);
    }

    public TrackingEventV3Data(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, int i3, int i4, Integer num, Integer num2) {
        this.hasPipoRechargeBefore = i;
        this.switchPanelType = str;
        this.isSwitchPanelType = i2;
        this.panelChannel = str2;
        this.eventModule = str3;
        this.requestPage = str4;
        this.triggerPoint = str5;
        this.chargeFromHash = str6;
        this.chargeReason = str7;
        this.isFirstRecharge = i3;
        this.isFirstCashRecharge = i4;
        this.subSource = num;
        this.rechargeV3Version = num2;
    }
}
