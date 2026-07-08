package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ReportTaskBody {

    @C09CT("biz")
    public final Integer biz;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("input")
    public final String input;

    @C09CT("prompt_image")
    public final String promptImage;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("report_reasons")
    public final List<String> reportReasons;

    @C09CT("video_id")
    public final String videoId;

    public ReportTaskBody() {
        this(null, null, null, null, null, null, null);
    }

    public ReportTaskBody(Integer num, String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.biz = num;
        this.input = str;
        this.promptText = str2;
        this.promptImage = str3;
        this.videoId = str4;
        this.imageId = str5;
        this.reportReasons = list;
    }
}
