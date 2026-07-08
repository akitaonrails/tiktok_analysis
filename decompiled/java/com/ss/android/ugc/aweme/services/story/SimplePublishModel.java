package com.ss.android.ugc.aweme.services.story;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SimplePublishModel {
    public final List<String> coverPathList;
    public final String creationId;
    public String publishId;
    public final PublishModel publishModel;
    public final String shootWay;
    public final String storyType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePublishModel)) {
            return false;
        }
        SimplePublishModel simplePublishModel = (SimplePublishModel) obj;
        return Intrinsics.LJFF(this.creationId, simplePublishModel.creationId) && Intrinsics.LJFF(this.publishId, simplePublishModel.publishId) && Intrinsics.LJFF(this.shootWay, simplePublishModel.shootWay) && Intrinsics.LJFF(this.storyType, simplePublishModel.storyType) && Intrinsics.LJFF(this.coverPathList, simplePublishModel.coverPathList) && Intrinsics.LJFF(this.publishModel, simplePublishModel.publishModel);
    }

    public final void setPublishId(String str) {
        this.publishId = str;
    }

    public SimplePublishModel(String str, String str2, String str3, String str4, List<String> list, PublishModel publishModel) {
        this.creationId = str;
        this.publishId = str2;
        this.shootWay = str3;
        this.storyType = str4;
        this.coverPathList = list;
        this.publishModel = publishModel;
    }
}
