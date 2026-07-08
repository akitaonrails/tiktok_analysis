package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateAggregateRightUiInfo {

    @C09CT("button")
    public final NoticeUITemplateButton button;

    @C09CT("image_info")
    public final UrlModel imageInfo;

    @C09CT("scheme_url")
    public final String schemeUrl;

    public final int hashCode() {
        NoticeUITemplateButton noticeUITemplateButton = this.button;
        int iHashCode = (noticeUITemplateButton == null ? 0 : noticeUITemplateButton.hashCode()) * 31;
        UrlModel urlModel = this.imageInfo;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.schemeUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateAggregateRightUiInfo(button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", imageInfo=");
        sbLIZ.append(this.imageInfo);
        sbLIZ.append(", schemeUrl=");
        sbLIZ.append(this.schemeUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateAggregateRightUiInfo(NoticeUITemplateButton noticeUITemplateButton, UrlModel urlModel, String str) {
        this.button = noticeUITemplateButton;
        this.imageInfo = urlModel;
        this.schemeUrl = str;
    }
}
