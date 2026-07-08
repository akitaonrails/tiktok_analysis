package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEMattingRuntime {
    void addMattingTask(String str);

    void cleanMattingFile(String str, String str2, int i, String str3);

    void cleanMattingFile(String str, String str2, int i, String str3, Boolean bool);

    void copyMattingFile(String str, String str2, String str3, int i);

    VecString getRunningTasks();

    void removeAllTask();

    void removeMattingListener();

    void removeMattingTask(String str);

    void setMattingListener(INLEMattingListener iNLEMattingListener);
}
