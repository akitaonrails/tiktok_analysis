package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PublisherVideoCPModerationInfo {

    @C09CT("clip_advice_list")
    public List<PublisherVideoCPModerationClip> clipAdviceList = new ArrayList();

    @C09CT("cp_moderation_status")
    public int cpModerationStatus;

    @C09CT("whole_video_advice")
    public PublisherVideoCPModerationClip wholeVideoAdvice;
}
