package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PostSMBCourseVideoRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("course_id")
    public long courseId;

    @C09CT("cover_info")
    public SMBCoverInfo coverInfo;

    @C09CT("cover_tsp")
    public double coverTsp;

    @C09CT("duration")
    public double duration;

    @C09CT("is_cover_positioned")
    public long isCoverPositioned;

    @C09CT("is_cover_text")
    public long isCoverText;

    @C09CT("video_count")
    public long videoCount;

    @C09CT("video_height")
    public long videoHeight;

    @C09CT("video_width")
    public long videoWidth;

    @C09CT("video_id")
    public String videoId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("cover_text_attr")
    public String coverTextAttr = "";

    @C09CT("cover_text_uri")
    public String coverTextUri = "";
}
