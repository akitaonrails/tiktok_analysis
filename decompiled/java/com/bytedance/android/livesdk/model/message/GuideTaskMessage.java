package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuideTaskMessage extends AbstractC1136060ffY {

    @C09CT("biz_name")
    public String bizName;

    @C09CT("display_second")
    public long displaySecond;

    @C09CT("icon")
    public TPTuxImage icon;

    @C09CT("operation_types")
    public List<Integer> operationTypes;

    @C09CT("remind_area_text")
    public Text remindAreaText;

    @C09CT("remind_type")
    public String remindType;

    @C09CT("task_type")
    public int taskType;

    public GuideTaskMessage() {
        this.type = C001A.GUIDE_TASK_MESSAGE;
        this.bizName = "";
        this.operationTypes = new ArrayList();
        this.remindType = "";
    }
}
