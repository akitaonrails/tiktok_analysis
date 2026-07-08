package com.bytedance.geckox.model;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class DeploymentModelLoop extends DeploymentModel {

    @C09CT("group_name")
    public List<String> groupName;

    private String getSortStringByGroup() {
        List<String> list = this.groupName;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.groupName);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : this.groupName) {
            if (str != null && !TextUtils.isEmpty(str)) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public DeploymentModelLoop() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public String getSortString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSortStringByGroup());
        sbLIZ.append("-");
        sbLIZ.append(getSortStringByChannels());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public List<String> getGroupName() {
        return this.groupName;
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public void addToGroupName(Object obj) {
        this.groupName.add(obj);
    }

    public DeploymentModelLoop(List<String> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
