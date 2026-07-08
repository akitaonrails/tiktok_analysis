package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C01GW;
import X.C1503740pEa;
import X.C1503760pEc;
import X.C1503780pEe;
import X.C1503800pEg;
import X.C1515820pY4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1631630sYr;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS56S0000100_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMessageApiDefault implements TakoApi {
    public static final TakoMessageApiDefault LIZ = new TakoMessageApiDefault();

    public static Object LIZ(Function0 function0) {
        C01GW c01gw = C1503800pEg.LIZ;
        C1503780pEe c1503780pEe = C1503760pEc.LIZ;
        InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr = c1503780pEe.LIZIZ.LIZ;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Boolean.FALSE, "stage_retry_init", Boolean.TRUE, null);
        }
        if (c1503780pEe.LIZ.LIZJ) {
            C1503800pEg.LIZLLL = (TakoApi) C1503800pEg.LIZ.getValue();
        }
        InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr2 = c1503780pEe.LIZIZ.LIZ;
        if (interfaceC1631630sYr2 != null) {
            Boolean bool = Boolean.TRUE;
            interfaceC1631630sYr2.invoke(bool, "stage_retry_init", bool, null);
        }
        if (c1503780pEe.LIZ.LIZJ) {
            C1503800pEg.LJ = (TakoApi) C1503800pEg.LIZJ.getValue();
        }
        InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr3 = c1503780pEe.LIZIZ.LIZ;
        if (interfaceC1631630sYr3 != null) {
            Boolean bool2 = Boolean.TRUE;
            interfaceC1631630sYr3.invoke(bool2, "stage_retry_init", bool2, null);
        }
        if (c1503780pEe.LIZ.LIZJ) {
            C1503800pEg.LJFF = (List) C1503740pEa.LIZ.getValue();
        }
        return function0.invoke();
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchImageUploadAuthConfig(InterfaceC1364105Vn<? super TakoImageUploadAuthConfig> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(125));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object getTopTitleConfig(InterfaceC1364105Vn<? super TakoTopTitleConfigResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(134));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object inboxCursor(InterfaceC1364105Vn<? super GetUserInboxIndexResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(135));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object batchFetchConversations(int i, InterfaceC1364105Vn<? super BatchFetchConversationsResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(119));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object botCenter(String str, InterfaceC1364105Vn<? super TakoBotCenterResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(121));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchAudioAuthInfo(AudioAuthRequest audioAuthRequest, InterfaceC1364105Vn<? super AudioAuthResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(123));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object getAdditionalPanelList(Integer num, InterfaceC1364105Vn<? super TakoAdditonalPanelListResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(131));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object getNewActionBarList(Integer num, InterfaceC1364105Vn<? super TakoNewActionBarListResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(132));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object searchLandingPage(Map<String, String> map, InterfaceC1364105Vn<? super SearchLandingPageResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(141));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object sendSyncData(AgentCommandSyncData agentCommandSyncData, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(142));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchLemon8Awemes(long j, List<String> list, InterfaceC1364105Vn<? super TakoLemon8AwemeResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(126));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchTemplatesSquare(String str, Integer num, InterfaceC1364105Vn<? super TemplateTabsResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(128));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object postQuestionnaireShow(int i, String str, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(138));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object botSetting(int i, long j, boolean z, InterfaceC1364105Vn<? super TakoBotSettingResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(122));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchConversation(long j, int i, boolean z, InterfaceC1364105Vn<? super FetchConversationResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(124));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchSubConversationList(String str, long j, int i, InterfaceC1364105Vn<? super FetchSubConversationListResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(127));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchUserOther(String str, String str2, Integer num, InterfaceC1364105Vn<? super TakoUserOtherResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(130));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public Object getOnboardingClickData(@InterfaceC1501050pAF("last_feed_group_id") String str, @InterfaceC1501050pAF("last_feed_group_id") String str2, @InterfaceC1501050pAF("show_type") int i, InterfaceC1364105Vn<? super TakoOnBoardingResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(133));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object inboxPull(long j, long j2, int i, InterfaceC1364105Vn<? super GetIncrementalMsgResponse> interfaceC1364105Vn) {
        return LIZ(new AwS56S0000100_30(j, 0));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object batchUpdateMessage(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super BatchUpdateMessageResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(120));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object batchDelete(String str, String str2, String str3, String str4, boolean z, InterfaceC1364105Vn<? super BatchDeleteResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(117));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object loadMoreMsgByConversation(String str, String str2, int i, long j, int i2, InterfaceC1364105Vn<? super LoadMoreMsgByConversationResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(136));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object postQuestionnaireSubmit(int i, String str, int i2, String str2, String str3, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(139));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object userSetting(int i, String str, int i2, String str2, int i3, InterfaceC1364105Vn<? super GetUserSettingSwitchStatusResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(118));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object fetchUserFeature(long j, String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn<? super TakoUserFeatureResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(129));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object messageRead(String str, String str2, long j, String str3, String str4, Boolean bool, InterfaceC1364105Vn<? super TakoMessageReadResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(137));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object recallAwemeList(String str, long j, Long l, Integer num, int i, String str2, InterfaceC1364105Vn<? super TakoAwemeRecallResponse> interfaceC1364105Vn) {
        return LIZ(AFwS219S0000000_30.get$arr$(140));
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.net.TakoApi
    public final Object takoOpChunk(int i, String str, long j, String str2, String str3, String str4, int i2, String str5, String str6, String str7, Long l, String str8, long j2, String str9, long j3, int i3, Integer num, Integer num2, int i4, String str10, Boolean bool, String str11, String str12, boolean z, int i5, int i6, String str13, int i7, Integer num3, Integer num4, Integer num5, String str14, int i8, int i9, String str15, String str16, String str17, String str18, String str19, Long l2, Long l3, boolean z2, String str20, InterfaceC1364105Vn<? super C1515820pY4<MessageChunkResult>> interfaceC1364105Vn) {
        return LIZ(AFwS212S0000000_23.get$arr$(101));
    }
}
