package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveVoucher {

    @C09CT("action")
    public VoucherAction action;

    @C09CT("big_icon")
    public final Icon bigIcon;

    @C09CT("bottom_label")
    public final BottomLabel bottomLabel;

    @C09CT("cost_type_desc")
    public final String costTypeDesc;

    @C09CT("cost_type_icon")
    public final Icon costTypeIcon;

    @C09CT("creator_operation_unique_id")
    public final String creatorOperationUniqueId;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("face_value")
    public final String faceValue;

    @C09CT("face_value_format")
    public final String formatTitle;

    @C09CT("live_voucher_type")
    public final Integer liveVoucherType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Status status;

    @C09CT("surprise_voucher_ext")
    public final SurpriseVoucherExt surpriseVoucherExt;

    @C09CT("task")
    public final VoucherTask task;

    @C09CT("threshold_desc")
    public final String threshold;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public LiveVoucher() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean LIZ() {
        SurpriseVoucherExt surpriseVoucherExt = this.surpriseVoucherExt;
        String str = surpriseVoucherExt != null ? surpriseVoucherExt.title : null;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.formatTitle;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final boolean LIZIZ() {
        Integer num;
        Integer num2;
        VoucherTask voucherTask = this.task;
        if (voucherTask != null && (num2 = voucherTask.type) != null && num2.intValue() == 3) {
            return true;
        }
        VoucherTask voucherTask2 = this.task;
        return (voucherTask2 == null || (num = voucherTask2.type) == null || num.intValue() != 4) ? false : true;
    }

    public final boolean LIZJ() {
        Integer num = this.liveVoucherType;
        return num != null && num.intValue() == 1;
    }

    public LiveVoucher(String str, String str2, Icon icon, String str3, String str4, String str5, VoucherTask voucherTask, VoucherAction voucherAction, Status status, Map<String, String> map, Integer num, String str6, SurpriseVoucherExt surpriseVoucherExt, Icon icon2, BottomLabel bottomLabel) {
        this.voucherTypeId = str;
        this.costTypeDesc = str2;
        this.costTypeIcon = icon;
        this.formatTitle = str3;
        this.faceValue = str4;
        this.threshold = str5;
        this.task = voucherTask;
        this.action = voucherAction;
        this.status = status;
        this.daInfo = map;
        this.liveVoucherType = num;
        this.creatorOperationUniqueId = str6;
        this.surpriseVoucherExt = surpriseVoucherExt;
        this.bigIcon = icon2;
        this.bottomLabel = bottomLabel;
    }
}
