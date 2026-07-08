package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleSubConfigItem_OptTypeAdapter extends TypeAdapter<TaskScheduleSubConfigItem> {
    public final Gson LIZ;

    public TaskScheduleSubConfigItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TaskScheduleSubConfigItem read(C09CU c09cu) {
        TaskScheduleSubConfigItem taskScheduleSubConfigItem = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            taskScheduleSubConfigItem = new TaskScheduleSubConfigItem(10, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "task_priority")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        taskScheduleSubConfigItem.setTaskPriority(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "ignore_block_scenes")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        taskScheduleSubConfigItem.setIgnoreBlockScenes(C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return taskScheduleSubConfigItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TaskScheduleSubConfigItem taskScheduleSubConfigItem) {
        TaskScheduleSubConfigItem taskScheduleSubConfigItem2 = taskScheduleSubConfigItem;
        if (taskScheduleSubConfigItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("task_priority");
        c09dl.LJJJJ(Integer.valueOf(taskScheduleSubConfigItem2.getTaskPriority()));
        c09dl.LJIILLIIL("ignore_block_scenes");
        C473040Igo.LIZLLL(this.LIZ, c09dl, taskScheduleSubConfigItem2.getIgnoreBlockScenes(), Integer.TYPE);
        c09dl.LJII();
    }
}
