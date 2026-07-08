package com.ss.android.ugc.aweme.commerce.tools.common.record;

import X.C04TD;
import X.C15MA;

/* JADX INFO: loaded from: classes26.dex */
public final class CommerceToolsRecordApiComponent implements ICommerceToolsRecordApiComponent {
    @Override // com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent
    public void vZ0() {
        C15MA.LL.setInCommercialSoundPage(false);
    }

    public static ICommerceToolsRecordApiComponent LIZIZ(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommerceToolsRecordApiComponent.class, z);
        if (objLIZ != null) {
            return (ICommerceToolsRecordApiComponent) objLIZ;
        }
        return new CommerceToolsRecordApiComponent();
    }
}
