package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C13LP;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class NetworkMentionDataItem {

    @C09CT("cameo_asset_info")
    public final CameoInfo cameoInfo;

    @C09CT("cameo_metrics_info")
    public final CameoMetricsInfo cameoMetricsInfo;

    @C09CT("created_cameo")
    public final Boolean createdCameo;

    @C09CT("followers")
    public final Long followers;

    @C09CT("generating_task_status")
    public final GeneratingTaskStatus generatingTaskStatus;

    @C09CT("invited")
    public final Boolean invited;

    @C09CT("operate_permission")
    public final Integer operatePermission;

    @C09CT("relation_type")
    public final String relationType;

    @C09CT("user_base_info")
    public final UserBaseInfo userBaseInfo;

    public NetworkMentionDataItem() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final MentionDataItem LIZ() {
        CameoInfo cameoInfo;
        Integer num;
        String str;
        Boolean bool;
        ImageThumb imageThumb;
        List<String> list;
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        if (userBaseInfo == null) {
            return null;
        }
        boolean zBooleanValue = false;
        if (!Intrinsics.LJFF(this.createdCameo, Boolean.TRUE) || (cameoInfo = this.cameoInfo) == null || cameoInfo.deleted) {
            cameoInfo = null;
        }
        AvatarData avatarData = userBaseInfo.avatar;
        String str2 = (avatarData == null || (imageThumb = avatarData.imageThumb) == null || (list = imageThumb.urlList) == null) ? null : (String) C13LP.LJJJLL(list);
        String str3 = userBaseInfo.nickName;
        String str4 = userBaseInfo.id;
        String str5 = userBaseInfo.uniqueId;
        String str6 = this.relationType;
        Long l = this.followers;
        String str7 = cameoInfo != null ? cameoInfo.cameoId : null;
        Boolean bool2 = this.invited;
        Integer num2 = this.operatePermission;
        int iIntValue = num2 != null ? num2.intValue() : 1;
        GeneratingTaskStatus generatingTaskStatus = this.generatingTaskStatus;
        if (generatingTaskStatus != null) {
            num = generatingTaskStatus.percentage;
            str = generatingTaskStatus.taskId;
        } else {
            num = null;
            str = null;
        }
        CameoMetricsInfo cameoMetricsInfo = this.cameoMetricsInfo;
        Integer num3 = cameoMetricsInfo != null ? cameoMetricsInfo.activateFilter : null;
        if (cameoInfo != null && (bool = cameoInfo.isVirtual) != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new MentionDataItem(str2, str3, str4, str5, l, str7, str6, Integer.valueOf(iIntValue), bool2, num, str, num3, Boolean.valueOf(zBooleanValue));
    }

    public NetworkMentionDataItem(UserBaseInfo userBaseInfo, CameoInfo cameoInfo, String str, Long l, Boolean bool, Integer num, Boolean bool2, GeneratingTaskStatus generatingTaskStatus, CameoMetricsInfo cameoMetricsInfo) {
        this.userBaseInfo = userBaseInfo;
        this.cameoInfo = cameoInfo;
        this.relationType = str;
        this.followers = l;
        this.createdCameo = bool;
        this.operatePermission = num;
        this.invited = bool2;
        this.generatingTaskStatus = generatingTaskStatus;
        this.cameoMetricsInfo = cameoMetricsInfo;
    }
}
