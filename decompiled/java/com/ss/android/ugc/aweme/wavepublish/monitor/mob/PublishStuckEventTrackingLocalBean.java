package com.ss.android.ugc.aweme.wavepublish.monitor.mob;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class PublishStuckEventTrackingLocalBean {

    @C09CT("circle_time")
    public final Integer circleTime;

    @C09CT("compile_context")
    public final String compileStuckInfo;

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("is_retry")
    public final Integer isRetry;

    @C09CT("is_story")
    public final Integer isStory;

    @C09CT("multi_photo_type")
    public final Integer multiPhotoType;

    @C09CT("net_type")
    public final Integer netType;

    @C09CT("progress_bean")
    public final ArrayList<ProgressBean> progressList;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("source_duration")
    public final Integer sourceDuration;

    @C09CT("uploader_context")
    public final String uploaderStuckInfo;

    public PublishStuckEventTrackingLocalBean() {
        this(new ArrayList(), 10, "", "", 0, 0, -1, 0, "", "", 0, "", "");
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static final class ProgressBean {

        @C09CT("end_time")
        public final Long endTime;

        @C09CT("net_level")
        public final Integer netLevel;

        @C09CT("progress")
        public final Integer progress;

        @C09CT("running_nodes")
        public final List<Object> runningNodes;

        @C09CT("start_time")
        public final Long startTime;

        public ProgressBean() {
            this(0, 0L, 0L, null, -2);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ProgressBean(progress=");
            sbLIZ.append(this.progress);
            sbLIZ.append(", startTime=");
            sbLIZ.append(this.startTime);
            sbLIZ.append(", endTime=");
            sbLIZ.append(this.endTime);
            sbLIZ.append(", runningNodes=");
            sbLIZ.append(this.runningNodes);
            sbLIZ.append(", netLevel=");
            sbLIZ.append(this.netLevel);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ProgressBean(Integer num, Long l, Long l2, List<? extends Object> list, Integer num2) {
            this.progress = num;
            this.startTime = l;
            this.endTime = l2;
            this.runningNodes = list;
            this.netLevel = num2;
        }
    }

    public PublishStuckEventTrackingLocalBean(ArrayList<ProgressBean> arrayList, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, Integer num5, String str3, String str4, Integer num6, String str5, String str6) {
        this.progressList = arrayList;
        this.circleTime = num;
        this.creationId = str;
        this.contentType = str2;
        this.isStory = num2;
        this.isRetry = num3;
        this.netType = num4;
        this.sourceDuration = num5;
        this.shootWay = str3;
        this.contentSource = str4;
        this.multiPhotoType = num6;
        this.uploaderStuckInfo = str5;
        this.compileStuckInfo = str6;
    }
}
