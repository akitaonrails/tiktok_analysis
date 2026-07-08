package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C03MP;
import X.C08JS;
import X.C09CT;
import X.C1019103yf;
import X.EnumC1014603xw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeInfo implements Serializable {
    public static final int $stable = 0;
    public static final C03MP Companion = new Object() { // from class: X.03MP
    };

    @C09CT("change_type")
    public int changeType;

    @C09CT("extra_data")
    public String extraData;

    @C09CT("from_full_data_preload")
    public Boolean fromFullDataPreload;

    @C09CT("pre_bill_info_log_id")
    public String preBillInfoLogId;

    public ChangeInfo() {
    }

    public final ChangeInfo copy(int i, String str, Boolean bool, String str2) {
        return new ChangeInfo(i, str, bool, str2);
    }

    public final ChangeInfoExtraData getExtraData() {
        String str = this.extraData;
        if (str != null) {
            try {
                return (ChangeInfoExtraData) C08JS.LIZ(str, ChangeInfoExtraData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_JSON_EXP_ERROR, e, null);
            }
        }
        return null;
    }

    public ChangeInfo(int i, String str, Boolean bool, String str2) {
        this.changeType = i;
        this.preBillInfoLogId = str;
        this.fromFullDataPreload = bool;
        this.extraData = str2;
    }
}
