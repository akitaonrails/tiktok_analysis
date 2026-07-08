package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class TaskStage {

    @C09CT("AIGCTask")
    public static final TaskStage AIGC_TASK;

    @C09CT("AIGCTrigger")
    public static final TaskStage AIGC_TRIGGER;
    public static final /* synthetic */ TaskStage[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<TaskStage> getEntries() {
        return LLILLJJLI;
    }

    static {
        TaskStage taskStage = new TaskStage("AIGC_TRIGGER", 0);
        AIGC_TRIGGER = taskStage;
        TaskStage taskStage2 = new TaskStage("AIGC_TASK", 1);
        AIGC_TASK = taskStage2;
        TaskStage[] taskStageArr = {taskStage, taskStage2};
        LL = taskStageArr;
        LLILLJJLI = new C2254308sP(taskStageArr);
    }

    public static TaskStage[] values() {
        return (TaskStage[]) LL.clone();
    }

    public static TaskStage valueOf(String str) {
        return (TaskStage) C08FF.LIZ(TaskStage.class, str);
    }

    public TaskStage(String str, int i) {
    }
}
