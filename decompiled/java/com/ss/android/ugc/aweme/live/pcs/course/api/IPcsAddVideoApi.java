package com.ss.android.ugc.aweme.live.pcs.course.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.live.pcs.course.model.CreatePcsAwemeResponse;
import com.ss.android.ugc.aweme.live.pcs.course.model.PostSMBCourseVideoRequestCopy;

/* JADX INFO: loaded from: classes5.dex */
public interface IPcsAddVideoApi {
    @InterfaceC1501170pAR("/webcast/smb/course/video/post/")
    C11NZ<CreatePcsAwemeResponse> addCourseVideo(@InterfaceC1485405rg PostSMBCourseVideoRequestCopy postSMBCourseVideoRequestCopy);
}
