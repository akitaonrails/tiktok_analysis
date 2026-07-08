package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalAllianceInfo implements Serializable {

    @C09CT("alliance_item_label_text")
    public String allianceItemLabelText;

    @C09CT("alliance_item_label_type")
    public Integer allianceItemLabelType;

    @C09CT("disable_change_poi")
    public Boolean disableChangePoi;

    public LocalAllianceInfo() {
        this(null, null, null);
    }

    public final boolean showBottomLabel() {
        String str;
        Integer num = this.allianceItemLabelType;
        return (num == null || num.intValue() != 1 || (str = this.allianceItemLabelText) == null || str.length() == 0) ? false : true;
    }

    public final void setAllianceItemLabelText(String str) {
        this.allianceItemLabelText = str;
    }

    public final void setAllianceItemLabelType(Integer num) {
        this.allianceItemLabelType = num;
    }

    public LocalAllianceInfo(Integer num, String str, Boolean bool) {
        this.allianceItemLabelType = num;
        this.allianceItemLabelText = str;
        this.disableChangePoi = bool;
    }
}
