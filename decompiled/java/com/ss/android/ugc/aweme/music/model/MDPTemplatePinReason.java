package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class MDPTemplatePinReason implements Serializable {

    @C09CT("icon")
    public final Integer icon;

    @C09CT("reason")
    public final String reason;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_type")
    public final String templateType;

    @C09CT("text")
    public final String text;

    @C09CT("tt_template_pin_type")
    public final Integer ttTemplatePinType;

    public final MDPTemplatePinReasonIcon getIconType() {
        MDPTemplatePinReasonIcon next;
        Iterator<MDPTemplatePinReasonIcon> it2 = MDPTemplatePinReasonIcon.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int value = next.getValue();
            Integer num = this.icon;
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return next;
    }

    public final MDPTemplatePinType getPinType() {
        MDPTemplatePinType next;
        Iterator<MDPTemplatePinType> it2 = MDPTemplatePinType.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int value = next.getValue();
            Integer num = this.ttTemplatePinType;
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return next;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTtTemplatePinType() {
        return this.ttTemplatePinType;
    }
}
