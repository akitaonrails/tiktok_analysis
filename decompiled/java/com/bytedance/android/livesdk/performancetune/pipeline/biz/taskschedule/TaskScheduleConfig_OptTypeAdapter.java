package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleConfig_OptTypeAdapter extends TypeAdapter<TaskScheduleConfig> {
    public final Gson LIZ;

    public TaskScheduleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TaskScheduleConfig read(C09CU c09cu) {
        TaskScheduleConfig taskScheduleConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            taskScheduleConfig = new TaskScheduleConfig(new LinkedHashMap());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "task_schedule_configs")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        taskScheduleConfig.setTaskScheduleConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TaskScheduleConfigItem.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return taskScheduleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TaskScheduleConfig taskScheduleConfig) {
        TaskScheduleConfig taskScheduleConfig2 = taskScheduleConfig;
        if (taskScheduleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("task_schedule_configs");
        C473040Igo.LJ(this.LIZ, c09dl, taskScheduleConfig2.getTaskScheduleConfigs(), TaskScheduleConfigItem.class);
        c09dl.LJII();
    }
}
