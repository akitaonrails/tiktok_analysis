package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ReferralWidgetResponse {

    @C09CT("widget_list")
    public WidgetList widgetList;

    @C09CT("widget_simple")
    public WidgetSimple widgetSimple;

    @C09CT("notification_id")
    public int notificationId = -1;

    @C09CT("widget_view_type")
    public String widgetViewType = "";

    public static final class TaskInfo {

        @C09CT("points_can_get")
        public String points;

        @C09CT("task_name")
        public String taskName;

        @C09CT("task_status")
        public int taskStatus;

        public TaskInfo() {
            this("", "", 0);
        }

        public TaskInfo(String str, String str2, int i) {
            this.taskName = str;
            this.points = str2;
            this.taskStatus = i;
        }
    }

    public static final class WidgetSimple {

        @C09CT("display_can_get_reward")
        public String displayReward;

        @C09CT("jump_link")
        public String jumpLink;

        @C09CT("points_earned")
        public int pointsEarned;

        @C09CT("points_total")
        public int pointsTotal;

        @C09CT("points_progress_desc")
        public String progressDesc;

        @C09CT("title")
        public String title;

        public WidgetSimple() {
            this("", "", 0, 0, "", "");
        }

        public WidgetSimple(String str, String str2, int i, int i2, String str3, String str4) {
            this.title = str;
            this.displayReward = str2;
            this.pointsEarned = i;
            this.pointsTotal = i2;
            this.progressDesc = str3;
            this.jumpLink = str4;
        }
    }

    public static final class WidgetList {

        @C09CT("jump_link")
        public String jumpLink;

        @C09CT("points_earned")
        public String pointsEarned;

        @C09CT("points_total")
        public String pointsTotal;

        @C09CT("task_list")
        public List<TaskInfo> taskList;

        @C09CT("title")
        public String title;

        public WidgetList(String str, String str2, String str3, String str4, List<TaskInfo> list) {
            this.jumpLink = str;
            this.title = str2;
            this.pointsEarned = str3;
            this.pointsTotal = str4;
            this.taskList = list;
        }
    }
}
