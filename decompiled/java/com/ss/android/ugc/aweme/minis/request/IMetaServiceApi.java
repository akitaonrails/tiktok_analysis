package com.ss.android.ugc.aweme.minis.request;

import X.C11NZ;
import X.C1232860iBg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.minis.model.CheckEligibilityResponse;
import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import com.ss.android.ugc.aweme.minis.model.MinisDevAuthorizationResponse;
import com.ss.android.ugc.aweme.minis.model.MinisMetaBulkResponse;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.RecommendMinisMetasResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkResponse;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface IMetaServiceApi {
    public static final C1232860iBg LIZ = C1232860iBg.LIZ;

    @InterfaceC1501240pAY("tiktok/minis/link")
    @InterfaceC1485505rh
    C11NZ<TiktokMinisLinkResponse> LIZ(@InterfaceC1501190pAT LinkedHashMap<String, String> linkedHashMap);

    @InterfaceC1501200pAU("/tiktok/minis/dev/authorization/")
    C11NZ<MinisDevAuthorizationResponse> LIZIZ(@InterfaceC1501120pAM("client_key") String str);

    @InterfaceC1501200pAU("/tiktok/minis/meta/recommendations")
    C11NZ<RecommendMinisMetasResponse> LIZJ();

    @InterfaceC1501200pAU("tiktok/minis/meta")
    C11NZ<MinisMetaResp> LIZLLL(@InterfaceC1501120pAM("client_key") String str, @InterfaceC1501120pAM("stage") Integer num, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("report_usage") boolean z, @InterfaceC1501120pAM("event_tracking_params") String str3);

    @InterfaceC1501200pAU("/tiktok/minis/link/{token}")
    C11NZ<TiktokMinisLinkParseResponse> LJ(@InterfaceC1501110pAL("token") String str);

    @InterfaceC1501200pAU("/tiktok/minis/meta/bulk")
    C11NZ<MinisMetaBulkResponse> LJFF(@InterfaceC1501120pAM("client_key_list") String str, @InterfaceC1501120pAM("stage") Integer num, @InterfaceC1501120pAM("source") String str2);

    @InterfaceC1501240pAY("/tiktok/minis/check_eligibility")
    @InterfaceC1485505rh
    C11NZ<CheckEligibilityResponse> checkConversationEligibility(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("uids") List<String> list, @InterfaceC1501050pAF("gids") List<String> list2);

    @InterfaceC1501240pAY("tiktok/minis/message/content_pb")
    @InterfaceC1485505rh
    C11NZ<ContentPbResponse> getContentPbForDMShare(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("title") String str2, @InterfaceC1501050pAF("desc") String str3, @InterfaceC1501050pAF("url") String str4, @InterfaceC1501050pAF("preview_image_url") String str5, @InterfaceC1501050pAF("schema_queries") String str6, @InterfaceC1501050pAF("optional_params") String str7, @InterfaceC1501050pAF("source_page") int i, @InterfaceC1501050pAF("template_type") int i2, @InterfaceC1501050pAF("path") String str8);
}
