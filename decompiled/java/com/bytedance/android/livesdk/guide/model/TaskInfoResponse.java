package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;
import webcast.data.TouchPointData;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("task_util_extra")
        public TaskUtilExtra taskUtilExtra;

        @C09CT("user_task_info")
        public UserTaskInfo userTaskInfo;

        @C09CT("widget_info")
        public WidgetInfo widgetInfo;

        @C09CT("monitor_tag")
        public String monitorTag = "";

        @C09CT("tp_data_list")
        public List<TouchPointData> tpDataList = new ArrayList();
    }

    public static final class UserTaskInfo {

        @C09CT("task_infos")
        public List<TaskInfo> taskInfos = new ArrayList();

        @C09CT("target_task_types")
        public List<Integer> targetTaskTypes = new ArrayList();
    }

    public static final class WidgetInfo {

        @C09CT("entry_conditions")
        public EntryConditions entryConditions;

        @C09CT("entry_type")
        public long entryType;

        @C09CT("remind_area_text")
        public Text remindAreaText;

        @C09CT("schema_url")
        public String schemaUrl = "";

        @C09CT("show_widget_entry")
        public boolean showWidgetEntry;
    }
}
