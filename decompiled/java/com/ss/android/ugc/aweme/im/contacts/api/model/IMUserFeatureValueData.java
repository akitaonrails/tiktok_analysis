package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C1726206pQ;
import X.C1954807lC;
import X.EnumC1725606pK;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMUserFeatureValueData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("archive_settings")
    public final IMUserArchiveSettings archiveSettings;

    @C09CT("b2c_user_avg_resp_time")
    public final IMB2CBusinessInfoAvgResp b2cUserAvgRespTime;

    @C09CT("business_tools_items")
    public final List<BusinessToolsItem> businessToolsItems;

    @C09CT("comment_to_dm")
    public final CommentToDmSetting commentToDmSetting;

    @C09CT("inbox_mode_value")
    public final int inboxModeValue;

    @C09CT("message_alert_status")
    public final MessageAlert messageAlert;

    @C09CT("message_request_settings")
    public final MessageRequestSetting msgRequestSetting;

    @C09CT("im_relation_label")
    public final IMRelationLabelInfo relationLabel;

    public IMUserFeatureValueData() {
        this(0, null, null, null, null, null, null, null);
    }

    public final Map<EnumC1725606pK, Object> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1725606pK enumC1725606pK : EnumC1725606pK.values()) {
            switch (C1726206pQ.LIZ[enumC1725606pK.ordinal()]) {
                case 1:
                    linkedHashMap.put(EnumC1725606pK.INBOX_MODE_SWITCH, Integer.valueOf(this.inboxModeValue));
                    break;
                case 2:
                    IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp = this.b2cUserAvgRespTime;
                    if (iMB2CBusinessInfoAvgResp != null) {
                        linkedHashMap.put(EnumC1725606pK.B2C_USER_AVG_RESP_TIME, iMB2CBusinessInfoAvgResp);
                    }
                    break;
                case 3:
                    IMUserArchiveSettings iMUserArchiveSettings = this.archiveSettings;
                    if (iMUserArchiveSettings != null) {
                        linkedHashMap.put(EnumC1725606pK.ARCHIVE_SETTINGS, iMUserArchiveSettings);
                    }
                    break;
                case 4:
                    MessageRequestSetting messageRequestSetting = this.msgRequestSetting;
                    if (messageRequestSetting != null) {
                        linkedHashMap.put(EnumC1725606pK.MESSAGE_REQUEST_SETTING, messageRequestSetting);
                    }
                    break;
                case 5:
                    CommentToDmSetting commentToDmSetting = this.commentToDmSetting;
                    if (commentToDmSetting != null) {
                        linkedHashMap.put(EnumC1725606pK.COMMENT_TO_DM, commentToDmSetting);
                    }
                    break;
                case 6:
                    List<BusinessToolsItem> list = this.businessToolsItems;
                    if (list != null) {
                        linkedHashMap.put(EnumC1725606pK.BUSINESS_TOOLS_ITEMS, list);
                    }
                    break;
                case 7:
                    MessageAlert messageAlert = this.messageAlert;
                    if (messageAlert != null) {
                        linkedHashMap.put(EnumC1725606pK.MESSAGE_ALERT, messageAlert);
                    }
                    break;
                case 8:
                    IMRelationLabelInfo iMRelationLabelInfo = this.relationLabel;
                    if (iMRelationLabelInfo != null) {
                        linkedHashMap.put(EnumC1725606pK.IM_RELATION_LABEL, iMRelationLabelInfo);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        return linkedHashMap;
    }

    public IMUserFeatureValueData(int i, IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp, IMUserArchiveSettings iMUserArchiveSettings, MessageRequestSetting messageRequestSetting, CommentToDmSetting commentToDmSetting, List<BusinessToolsItem> list, MessageAlert messageAlert, IMRelationLabelInfo iMRelationLabelInfo) {
        this.inboxModeValue = i;
        this.b2cUserAvgRespTime = iMB2CBusinessInfoAvgResp;
        this.archiveSettings = iMUserArchiveSettings;
        this.msgRequestSetting = messageRequestSetting;
        this.commentToDmSetting = commentToDmSetting;
        this.businessToolsItems = list;
        this.messageAlert = messageAlert;
        this.relationLabel = iMRelationLabelInfo;
    }
}
