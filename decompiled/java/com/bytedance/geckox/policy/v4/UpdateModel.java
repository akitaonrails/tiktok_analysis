package com.bytedance.geckox.policy.v4;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class UpdateModel {
    public List<String> channels;
    public List<String> groups;

    public UpdateModel() {
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public void setChannels(List<String> list) {
        this.channels = list;
    }

    public void setGroups(List<String> list) {
        this.groups = list;
    }

    public UpdateModel(List<String> list, List<String> list2) {
        this.groups = list;
        this.channels = list2;
    }
}
