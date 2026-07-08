package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgActivityTasks {

    @C09CT("finish_push")
    public String finishPush;

    @C09CT("frame")
    public List<List<Integer>> frame;
    public Boolean reported;

    @C09CT("show")
    public Boolean show;
    public Boolean succeed;

    @C09CT("task_id")
    public String taskId;

    @C09CT("task_type")
    public Integer taskType;

    @C09CT("time")
    public Integer time;

    @C09CT("url_list")
    public List<String> urlList;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UgActivityTasks m222clone() {
        UgActivityTasks ugActivityTasks = new UgActivityTasks();
        ugActivityTasks.taskId = this.taskId;
        ugActivityTasks.taskType = this.taskType;
        ugActivityTasks.time = this.time;
        ugActivityTasks.finishPush = this.finishPush;
        return ugActivityTasks;
    }

    public String getFinishPush() throws C316660CbA {
        String str = this.finishPush;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getTaskId() throws C316660CbA {
        String str = this.taskId;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getTaskType() throws C316660CbA {
        Integer num = this.taskType;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getTime() throws C316660CbA {
        Integer num = this.time;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public UgActivityTasks() {
        Boolean bool = Boolean.FALSE;
        this.reported = bool;
        this.succeed = bool;
    }

    public List<List<Integer>> getFrame() {
        return this.frame;
    }

    public Boolean getReported() {
        return this.reported;
    }

    public Boolean getShow() {
        return this.show;
    }

    public Boolean getSucceed() {
        return this.succeed;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public UgActivityTasks clone(Integer num) {
        UgActivityTasks ugActivityTasksM222clone = m222clone();
        if (num != null) {
            ugActivityTasksM222clone.time = num;
        }
        return ugActivityTasksM222clone;
    }

    public void setFrame(List<List<Integer>> list) {
        this.frame = list;
    }

    public void setReported(Boolean bool) {
        this.reported = bool;
    }

    public void setShow(Boolean bool) {
        this.show = bool;
    }

    public void setSucceed(Boolean bool) {
        this.succeed = bool;
    }

    public void setTime(Integer num) {
        this.time = num;
    }
}
