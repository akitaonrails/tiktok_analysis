package com.bytedance.geckox.model;

import X.C09CT;
import Y.AComparatorS39S0000000_20;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DeploymentModel {

    @C09CT("target_channels")
    public List<CheckRequestBodyModel.TargetChannel> targetChannels;

    public abstract void addToGroupName(Object obj);

    public abstract List<?> getGroupName();

    public abstract String getSortString();

    public String getSortStringByChannels() {
        List<CheckRequestBodyModel.TargetChannel> list = this.targetChannels;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.targetChannels, new AComparatorS39S0000000_20(0));
        StringBuffer stringBuffer = new StringBuffer();
        for (CheckRequestBodyModel.TargetChannel targetChannel : this.targetChannels) {
            if (targetChannel != null && !TextUtils.isEmpty(targetChannel.channelName)) {
                stringBuffer.append(targetChannel.channelName);
            }
        }
        return stringBuffer.toString();
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }
}
