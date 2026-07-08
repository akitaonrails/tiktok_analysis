package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.EnumC1725606pK;
import X.InterfaceC15516065q;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.CommentToDmSetting;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GeneralTemplateNotice {
    public int LIZ;
    public final String LIZIZ;

    @C09CT("action_meta")
    public final String actionMeta;

    @C09CT("actions")
    public final ActionToReportStruct actions;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("extra_data")
    public final NoticeExtraData extraData;

    @C09CT("has_read")
    public boolean hasRead;

    @C09CT("legacy_sub_type")
    public final Integer legacySubType;

    @C09CT("message_extra")
    public final String messageExtra;

    @C09CT("nid")
    public final Long nid;

    @C09CT("nid_str")
    public final String nidStr;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("should_keep")
    public final boolean shouldKeep;

    @C09CT("type")
    public final Integer type;

    @C09CT("notice")
    public final NoticeUITemplate uiTemplate;

    @C09CT("uniq_id")
    public final Long uniqueId;

    @C09CT("user_id")
    public final Long userId;

    public final boolean equals(Object obj) {
        InterfaceC15516065q interfaceC15516065qLIZJ;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(GeneralTemplateNotice.class, obj.getClass())) {
            return false;
        }
        GeneralTemplateNotice generalTemplateNotice = (GeneralTemplateNotice) obj;
        if (Intrinsics.LJFF(this.uiTemplate, generalTemplateNotice.uiTemplate) && Intrinsics.LJFF(this.schemaUrl, generalTemplateNotice.schemaUrl)) {
            NoticeMessageData noticeMessageData = null;
            IMContactApi iMContactApi = (IMContactApi) PluggableExtentionKt.pluggableSpi$default(IMContactApi.class, false, false, false, 14, null);
            NoticeMessageData noticeMessageData2 = null;
            if (iMContactApi != null && (interfaceC15516065qLIZJ = iMContactApi.LIZJ()) != null) {
                EnumC1725606pK enumC1725606pK = EnumC1725606pK.COMMENT_TO_DM;
                CommentToDmSetting commentToDmSetting = (CommentToDmSetting) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
                if (commentToDmSetting != null && commentToDmSetting.commentToDmSetting == 1) {
                    NoticeExtraData noticeExtraData = this.extraData;
                    if (noticeExtraData != null) {
                        noticeMessageData = noticeExtraData.messageData;
                    }
                    NoticeExtraData noticeExtraData2 = generalTemplateNotice.extraData;
                    if (noticeExtraData2 != null) {
                        noticeMessageData2 = noticeExtraData2.messageData;
                    }
                    if (!Intrinsics.LJFF(noticeMessageData, noticeMessageData2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public GeneralTemplateNotice(Long l, NoticeUITemplate noticeUITemplate, NoticeExtraData noticeExtraData, Long l2, Long l3, Integer num, Integer num2, String str, boolean z, String str2, String str3, boolean z2, ActionToReportStruct actionToReportStruct, String str4, Long l4, int i, String str5) {
        this.nid = l;
        this.uiTemplate = noticeUITemplate;
        this.extraData = noticeExtraData;
        this.createTime = l2;
        this.userId = l3;
        this.type = num;
        this.legacySubType = num2;
        this.nidStr = str;
        this.hasRead = z;
        this.schemaUrl = str2;
        this.messageExtra = str3;
        this.shouldKeep = z2;
        this.actions = actionToReportStruct;
        this.actionMeta = str4;
        this.uniqueId = l4;
        this.LIZ = i;
        this.LIZIZ = str5;
    }
}
