package com.ss.android.ugc.aweme.pcs.course.api.network;

import X.C0X9S;
import X.C11NZ;
import X.C470590Icr;
import X.C490870JMv;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckRequest;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import webcast.api.smb.DiscardSMBCourseChangesRequest;
import webcast.api.smb.DiscardSMBCourseChangesResponse;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.smb.ListSMBCoursePriceTiersResponse;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;
import webcast.api.smb.UpdateSMBCourseReq;
import webcast.api.smb.UpdateSMBCourseResp;

/* JADX INFO: loaded from: classes8.dex */
public interface IPcsCourseApi {
    public static final C490870JMv LIZ = C490870JMv.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/aweme/stats/")
    C11NZ<C470590Icr<Unit>> awemeStatsReport(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501170pAR("/webcast/smb/course/video/confirm_audio/")
    C11NZ<C470590Icr<Object>> confirmVideoAudio(@InterfaceC1485405rg ConfirmSMBCourseVideoAudioRequest confirmSMBCourseVideoAudioRequest);

    @InterfaceC1501170pAR("/webcast/smb/course/discard_changes/")
    C11NZ<C470590Icr<DiscardSMBCourseChangesResponse>> discardCourseChanges(@InterfaceC1485405rg DiscardSMBCourseChangesRequest discardSMBCourseChangesRequest);

    @InterfaceC1501160pAQ("/webcast/smb/course/detail/")
    C11NZ<C470590Icr<GetSMBCourseDetailResponse.Data>> loadCourseDetail(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("course_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("iap_country_code") String str);

    @InterfaceC1501160pAQ("/webcast/smb/course/price_tier/list/")
    C11NZ<C470590Icr<ListSMBCoursePriceTiersResponse.Data>> loadCoursePriceTierList(@InterfaceC1501070pAH("course_id") long j);

    @InterfaceC1501160pAQ("/webcast/smb/course/video/list/")
    C11NZ<C470590Icr<ListSMBCourseVideosResponse.Data>> loadCourseVideos(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("course_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("count") int i3, @InterfaceC1501070pAH("video_id_list") List<Long> list);

    @InterfaceC1501170pAR("/webcast/smb/course/video/list/")
    C11NZ<C470590Icr<ListSMBCourseVideosResponse.Data>> loadCourseVideos(@InterfaceC1485405rg ListSMBCourseVideosRequest listSMBCourseVideosRequest);

    @InterfaceC1501170pAR("/aweme/v1/music/precheck/")
    C0X9S<PreCheckResult> preCheckMusic(@InterfaceC1485405rg PreCheckRequest preCheckRequest);

    @InterfaceC1501170pAR("/webcast/smb/course/update/")
    C11NZ<C470590Icr<UpdateSMBCourseResp.Data>> updateCourse(@InterfaceC1485405rg UpdateSMBCourseReq updateSMBCourseReq);
}
