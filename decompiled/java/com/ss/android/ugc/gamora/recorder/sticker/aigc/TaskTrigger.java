package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class TaskTrigger {
    public static final /* synthetic */ TaskTrigger[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("record")
    public static final TaskTrigger RECORD;

    @C09CT("tap")
    public static final TaskTrigger TAP;

    @C09CT("upload_image")
    public static final TaskTrigger UPLOAD_IMAGE;

    public static InterfaceC2044707zh<TaskTrigger> getEntries() {
        return LLILLJJLI;
    }

    static {
        TaskTrigger taskTrigger = new TaskTrigger("RECORD", 0);
        RECORD = taskTrigger;
        TaskTrigger taskTrigger2 = new TaskTrigger("TAP", 1);
        TAP = taskTrigger2;
        TaskTrigger taskTrigger3 = new TaskTrigger("UPLOAD_IMAGE", 2);
        UPLOAD_IMAGE = taskTrigger3;
        TaskTrigger[] taskTriggerArr = {taskTrigger, taskTrigger2, taskTrigger3};
        LL = taskTriggerArr;
        LLILLJJLI = new C2254308sP(taskTriggerArr);
    }

    public static TaskTrigger[] values() {
        return (TaskTrigger[]) LL.clone();
    }

    public static TaskTrigger valueOf(String str) {
        return (TaskTrigger) C08FF.LIZ(TaskTrigger.class, str);
    }

    public TaskTrigger(String str, int i) {
    }
}
