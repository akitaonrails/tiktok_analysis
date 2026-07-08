package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class BNPLActivateModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_activate_log_track")
    public final boolean enableActivateLogTrack;

    @C09CT("enable_cashier_button_click")
    public final boolean enableCashierButtonClick;

    @C09CT("enable_check_before_create_order")
    public final boolean enableCheckBeforeCreateOrder;

    @C09CT("enable_credit_and_pay_flow")
    public final boolean enableCreditAndPayFlow;

    @C09CT("enable_display_installment_plan")
    public final boolean enableDisplayInstallmentPlan;

    @C09CT("enable_installment_click")
    public final boolean enableInstallmentClick;

    @C09CT("enable_notice")
    public final boolean enableNotice;

    @C09CT("enable_osp_button_click")
    public final boolean enableOspButtonClick;

    @C09CT("enable_osp_button_track")
    public final boolean enableOspButtonTrack;

    @C09CT("enable_set_pin")
    public final boolean enableSetPin;

    @C09CT("max_installment_display_num")
    public final int maxInstallmentDisplayNum;

    @C09CT("pm_list")
    public final List<String> pmList;

    public BNPLActivateModel() {
        this(false, null, false, 0, false, false, false, false, false, false, false, false, false, 8191, null);
    }

    public BNPLActivateModel(boolean z, List<String> list, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.enable = z;
        this.pmList = list;
        this.enableInstallmentClick = z2;
        this.maxInstallmentDisplayNum = i;
        this.enableOspButtonClick = z3;
        this.enableOspButtonTrack = z4;
        this.enableCashierButtonClick = z5;
        this.enableDisplayInstallmentPlan = z6;
        this.enableNotice = z7;
        this.enableCheckBeforeCreateOrder = z8;
        this.enableActivateLogTrack = z9;
        this.enableCreditAndPayFlow = z10;
        this.enableSetPin = z11;
    }

    public BNPLActivateModel(boolean z, List list, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? Collections.singletonList("pm_pi_ins_pipobnpl_c_d") : list, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? true : z4, (i2 & 64) != 0 ? true : z5, (i2 & 128) != 0 ? true : z6, (i2 & 256) != 0 ? true : z7, (i2 & 512) != 0 ? true : z8, (i2 & 1024) != 0 ? true : z9, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z10, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z11 : true);
    }
}
