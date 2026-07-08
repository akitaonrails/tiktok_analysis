package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.repository;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.smb.SMBIndustryVerificationActivateRequest;
import webcast.api.smb.SMBIndustryVerificationActivateResponse;
import webcast.api.smb.SMBIndustryVerificationSubmitRequest;
import webcast.api.smb.SMBIndustryVerificationSubmitResponse;
import webcast.api.smb.SMBVerificationInfoResponse;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.UpsellIndustryListResponse;
import webcast.api.sub.UpsellSelectIndustryRequest;
import webcast.api.sub.UpsellSelectIndustryResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface PcsIndustryApi {
    @InterfaceC1501170pAR("/webcast/smb/industry_verification/activate/")
    Object activateIndustryVerification(@InterfaceC1485405rg SMBIndustryVerificationActivateRequest sMBIndustryVerificationActivateRequest, InterfaceC1364105Vn<? super C470590Icr<SMBIndustryVerificationActivateResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/sub/upsell/industry_list/")
    Object getIndustryList(InterfaceC1364105Vn<? super C470590Icr<UpsellIndustryListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/sub/smb/qualification/")
    C11NZ<C470590Icr<SMBOptInQualificationResponse.ResponseData>> getQualification();

    @InterfaceC1501160pAQ("/webcast/smb/verification/info/")
    Object getSmbVerificationInfo(InterfaceC1364105Vn<? super C470590Icr<SMBVerificationInfoResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/upsell/select_industry/")
    Object selectIndustry(@InterfaceC1485405rg UpsellSelectIndustryRequest upsellSelectIndustryRequest, InterfaceC1364105Vn<? super C470590Icr<UpsellSelectIndustryResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/smb/industry_verification/submit/")
    Object submitIndustryVerification(@InterfaceC1485405rg SMBIndustryVerificationSubmitRequest sMBIndustryVerificationSubmitRequest, InterfaceC1364105Vn<? super C470590Icr<SMBIndustryVerificationSubmitResponse.Data>> interfaceC1364105Vn);
}
