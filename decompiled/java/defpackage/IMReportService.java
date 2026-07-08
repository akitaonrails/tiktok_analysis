package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.report.api.IIMReportService;

/* JADX INFO: loaded from: classes15.dex */
public final class IMReportService implements IIMReportService {
    @Override // com.ss.android.ugc.aweme.im.report.api.IIMReportService
    public final void report(Activity activity, Uri.Builder builder, Bundle bundle) {
        IReportService iReportService = (IReportService) PluggableExtentionKt.pluggableSpi$default(IReportService.class, false, false, false, 14, null);
        if (iReportService != null) {
            iReportService.report(activity, builder, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
    
        if (r6 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
    
        r15.LIZ();
        r12 = r12 + 1;
     */
    @Override // com.ss.android.ugc.aweme.im.report.api.IIMReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r17, java.lang.String r18, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r19, X.C912520Zr0 r20) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IMReportService.LIZ(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.0Zr0):void");
    }
}
