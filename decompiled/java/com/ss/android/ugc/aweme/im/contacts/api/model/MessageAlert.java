package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.EnumC891030YxR;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageAlert {

    @C09CT("inapp_message_alert_status")
    public final Integer inAppAlertStatus;

    @C09CT("outapp_message_alert_new_status")
    public final Integer outAppAlertNewStatus;

    @C09CT("outapp_message_alert_permission_status")
    public final Integer outAppAlertPermissionStatus;

    @C09CT("outapp_message_alert_status")
    public final Integer outAppAlertStatus;

    @C09CT("outapp_message_conversation_alert_status")
    public final Integer outAppConversationAlertStatus;

    public MessageAlert() {
        this(0, 0, 0, 0, 0);
    }

    public final boolean LIZ() {
        Integer num = this.inAppAlertStatus;
        return num != null && num.intValue() == EnumC891030YxR.ENABLE.getValue();
    }

    public final boolean LIZIZ() {
        Integer num = this.outAppAlertStatus;
        EnumC891030YxR enumC891030YxR = EnumC891030YxR.ENABLE;
        int value = enumC891030YxR.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        Integer num2 = this.outAppAlertNewStatus;
        return num2 != null && num2.intValue() == enumC891030YxR.getValue();
    }

    public MessageAlert(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.outAppAlertStatus = num;
        this.inAppAlertStatus = num2;
        this.outAppAlertNewStatus = num3;
        this.outAppAlertPermissionStatus = num4;
        this.outAppConversationAlertStatus = num5;
    }
}
