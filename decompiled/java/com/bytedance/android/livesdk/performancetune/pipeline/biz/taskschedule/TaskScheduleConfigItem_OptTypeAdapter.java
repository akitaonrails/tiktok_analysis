package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleConfigItem_OptTypeAdapter extends TypeAdapter<TaskScheduleConfigItem> {
    public final Gson LIZ;

    public TaskScheduleConfigItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TaskScheduleConfigItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TaskScheduleConfigItem taskScheduleConfigItem = new TaskScheduleConfigItem(10, new ArrayList(), new LinkedHashMap());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1156916450) {
                    if (iHashCode != -779032755) {
                        if (iHashCode == 1725913766 && strLJJJJ.equals("ignore_block_scenes")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                taskScheduleConfigItem.setIgnoreBlockScenes(C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("sub_biz_config")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            taskScheduleConfigItem.setSubBizConfig(C473040Igo.LIZIZ(this.LIZ, c09cu, TaskScheduleSubConfigItem.class));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("task_priority")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        taskScheduleConfigItem.setTaskPriority(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return taskScheduleConfigItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TaskScheduleConfigItem taskScheduleConfigItem) {
        TaskScheduleConfigItem taskScheduleConfigItem2 = taskScheduleConfigItem;
        if (taskScheduleConfigItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("task_priority");
        c09dl.LJJJJ(Integer.valueOf(taskScheduleConfigItem2.getTaskPriority()));
        c09dl.LJIILLIIL("ignore_block_scenes");
        C473040Igo.LIZLLL(this.LIZ, c09dl, taskScheduleConfigItem2.getIgnoreBlockScenes(), Integer.TYPE);
        c09dl.LJIILLIIL("sub_biz_config");
        C473040Igo.LJ(this.LIZ, c09dl, taskScheduleConfigItem2.getSubBizConfig(), TaskScheduleSubConfigItem.class);
        c09dl.LJII();
    }
}
