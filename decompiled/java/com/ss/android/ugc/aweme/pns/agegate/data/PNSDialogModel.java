package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C09CT;
import X.EnumC19298710en;
import X.EnumC19301210fC;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSDialogModel implements Serializable {
    public final boolean addExclamationIcon;

    @C09CT("alignment_type")
    public final int alignmentType;
    public final boolean cancellable;
    public final boolean forceVertical;
    public final List<PNSHyperlink> hyperLinks;
    public final boolean isDestructive;

    @C09CT("description")
    public final String message;

    @C09CT("options")
    public final List<PNSAgeConfirmOption> options;

    @C09CT("style")
    public final Integer style;

    @C09CT("style_type")
    public final int styleType;

    @C09CT("title")
    public final String title;

    public PNSDialogModel() {
        this(null, null, null, Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false);
    }

    public final boolean isDestructive() {
        return this.isDestructive;
    }

    public PNSDialogModel(String str, String str2, List<PNSAgeConfirmOption> list, Integer num, int i, int i2, boolean z, boolean z2, boolean z3, List<PNSHyperlink> list2, boolean z4) {
        this.message = str;
        this.title = str2;
        this.options = list;
        this.style = num;
        this.styleType = i;
        this.alignmentType = i2;
        this.isDestructive = z;
        this.cancellable = z2;
        this.forceVertical = z3;
        this.hyperLinks = list2;
        this.addExclamationIcon = z4;
    }
}
