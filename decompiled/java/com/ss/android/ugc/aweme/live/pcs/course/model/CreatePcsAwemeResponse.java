package com.ss.android.ugc.aweme.live.pcs.course.model;

import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class CreatePcsAwemeResponse extends CreateBaseAwemeResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("course_video")
        public SMBCourseVideoCopy courseVideo;
    }
}
