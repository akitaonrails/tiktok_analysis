package com.ss.android.ugc.aweme.shortvideo.publish;

import X.C09CT;
import X.C1405180mfc;
import X.C1954807lC;
import X.EnumC1405170mfb;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishModel {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public transient PublishFailureReason LIZLLL;

    @C09CT("creationId")
    public final String creationId;

    @C09CT("disableProgressView")
    public final boolean disableProgressView;

    @C09CT("editModel")
    public final BaseShortVideoContext editModel;

    @C09CT("expectPublishTaskId")
    public String expectPublishTaskId;

    @C09CT("isBatchSub")
    public Integer isBatchSub;

    @C09CT("isEditPrePublish")
    public final boolean isEditPrePublish;

    @C09CT("isEditSave")
    public final boolean isEditSave;

    @C09CT("isStoryPublish")
    public final boolean isStoryPublish;

    @C09CT("isTTEPSave")
    public final boolean isTTEPSave;

    @C09CT("nowsShootData")
    public final NowsShootModel nowsShootData;

    @C09CT("publishPermission")
    public final int publishPermission;

    @C09CT("publishType")
    public final int publishType;

    @C09CT("retry_type")
    public EnumC1405170mfb retryType;

    @C09CT("shootWay")
    public final String shootWay;

    @C09CT("skipVEPluginCheck")
    public final boolean skipVEPluginCheck;

    @C09CT("storyGroupPublishModel")
    public StoryGroupPublishModel storyGroupPublishModel;

    @C09CT("storyType")
    public final String storyType;

    @C09CT("videoCoverPaths")
    public List<String> videoCoverPaths;

    @C09CT("videoType")
    public final int videoType;
    public long LIZJ = System.currentTimeMillis();

    @C09CT("publishId")
    public String publishId = "";

    public final String LIZ() {
        int i = C1405180mfc.LIZ[this.retryType.ordinal()];
        if (i == 1) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (i == 2) {
            return "1";
        }
        if (i == 3) {
            return "2";
        }
        throw new C1954807lC();
    }

    public final boolean LIZIZ() {
        int i = this.publishType;
        return i == 2 || i == 1;
    }

    public final boolean LIZJ() {
        return this.retryType == EnumC1405170mfb.RETRY_BY_USER;
    }

    public PublishModel(String str, String str2, int i, EnumC1405170mfb enumC1405170mfb, int i2, int i3, List<String> list, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, boolean z7, StoryGroupPublishModel storyGroupPublishModel, Integer num, boolean z8) {
        this.shootWay = str;
        this.creationId = str2;
        this.publishType = i;
        this.retryType = enumC1405170mfb;
        this.videoType = i2;
        this.publishPermission = i3;
        this.videoCoverPaths = list;
        this.editModel = baseShortVideoContext;
        this.nowsShootData = nowsShootModel;
        this.isStoryPublish = z;
        this.storyType = str3;
        this.isTTEPSave = z2;
        this.isEditSave = z3;
        this.isEditPrePublish = z4;
        this.LIZ = z5;
        this.LIZIZ = z6;
        this.expectPublishTaskId = str4;
        this.disableProgressView = z7;
        this.storyGroupPublishModel = storyGroupPublishModel;
        this.isBatchSub = num;
        this.skipVEPluginCheck = z8;
    }
}
