package com.ss.android.ugc.aweme.utils;

import X.C01GW;
import X.C04TD;
import X.C1041590dDB;
import X.C452501pT;
import X.C844470XAv;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SchemaPageHelperImpl implements SchemaPageHelper {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(283));

    public static SchemaPageHelper LJ() {
        Object objLIZ = C04TD.LIZ(SchemaPageHelper.class, false);
        if (objLIZ != null) {
            return (SchemaPageHelper) objLIZ;
        }
        if (C04TD.X5 == null) {
            synchronized (SchemaPageHelper.class) {
                if (C04TD.X5 == null) {
                    C04TD.X5 = new SchemaPageHelperImpl();
                }
            }
        }
        return C04TD.X5;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final String getChannel() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJIILL;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent LIZ(Context context, Uri uri) {
        return C1041590dDB.LIZ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent LIZIZ(Context context, Uri uri) {
        ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LIZ.getValue();
        if (iCommercializeFromMainOutService != null) {
            return iCommercializeFromMainOutService.LJI(context, uri, false, false);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final void LIZJ(Context context, String str) {
        ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LIZ.getValue();
        if (iCommercializeFromMainOutService != null) {
            iCommercializeFromMainOutService.LJFF(context, str, "", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final boolean LIZLLL(Context context, String str, String str2, Map map) {
        ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LIZ.getValue();
        if (iCommercializeFromMainOutService != null && iCommercializeFromMainOutService.LIZLLL(context, str, str2, map)) {
            return true;
        }
        return false;
    }
}
