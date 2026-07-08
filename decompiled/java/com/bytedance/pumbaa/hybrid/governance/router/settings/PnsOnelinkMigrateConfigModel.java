package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsOnelinkMigrateConfigModel extends BaseGovernanceModel {

    @C09CT("items")
    public final List<PnsMigrateItem> items;

    public PnsOnelinkMigrateConfigModel() {
        this(C1697810uHb.LJIILJJIL(new PnsMigrateItem(".onelink.me", "", "cct", C1697810uHb.LJIIJJI(CardStruct.IStatusCode.DEFAULT, "402657281", "67108864"), C1697810uHb.LJIIJJI("snssdk1233.onelink.me", "snssdk1180.onelink.me", "snssdk473824.onelink.me"))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PnsOnelinkMigrateConfigModel) && Intrinsics.LJFF(this.items, ((PnsOnelinkMigrateConfigModel) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsOnelinkMigrateConfigModel(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsOnelinkMigrateConfigModel(List<PnsMigrateItem> list) {
        super(null, false, false, false, false);
        this.items = list;
    }
}
