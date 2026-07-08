package com.ss.android.vesdk.bean;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes36.dex */
public class VEUndoRedoBean {
    public String commandTag;
    public String layerId;
    public int undoIndex;

    public static class JniHolder {
        public ArrayList<VEUndoRedoBean> beans = new ArrayList<>();

        public ArrayList<VEUndoRedoBean> getJniResult() {
            return this.beans;
        }

        private void jniAdd(int i, String str, String str2) {
            this.beans.add(new VEUndoRedoBean(i, str, str2));
        }
    }

    public String getCommandTag() {
        return this.commandTag;
    }

    public int getIndex() {
        return this.undoIndex;
    }

    public String getLayerId() {
        return this.layerId;
    }

    public VEUndoRedoBean(int i, String str, String str2) {
        this.undoIndex = i;
        this.layerId = str;
        this.commandTag = str2;
    }
}
