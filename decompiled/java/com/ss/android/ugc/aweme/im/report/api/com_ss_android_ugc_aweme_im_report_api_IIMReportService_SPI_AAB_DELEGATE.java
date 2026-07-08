package com.ss.android.ugc.aweme.im.report.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import defpackage.IMReportService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_report_api_IIMReportService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_report_api_IIMReportService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_report_api_IIMReportService_SPI_AAB_DELEGATE();
    public static final C01GW IMReportServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(388));
    public static final int $stable = 8;

    private final IMReportService getIMReportServiceinstance() {
        return (IMReportService) IMReportServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMReportService> getServices() {
        ArrayList<IIMReportService> arrayList = new ArrayList<>();
        arrayList.add(getIMReportServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMReportService getService() {
        return getIMReportServiceinstance();
    }
}
