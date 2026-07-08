package com.bytedance.geckox.model;

import X.C09CT;
import X.C2188811AlT;
import Y.AComparatorS39S0000000_20;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class DeploymentModelV4 extends DeploymentModel {

    @C09CT("group_name")
    public List<V4Group> groupName;

    private String getSortStringByV4Group() {
        List<V4Group> list = this.groupName;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.groupName, new AComparatorS39S0000000_20(1));
        StringBuffer stringBuffer = new StringBuffer();
        for (V4Group v4Group : this.groupName) {
            if (v4Group != null && !TextUtils.isEmpty(v4Group.name)) {
                stringBuffer.append(v4Group.name);
            }
        }
        return stringBuffer.toString();
    }

    public DeploymentModelV4() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public String getSortString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSortStringByV4Group());
        sbLIZ.append("-");
        sbLIZ.append(getSortStringByChannels());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static class V4Group {

        @C09CT("from")
        public String from;

        @C09CT("name")
        public String name;

        public V4Group() {
        }

        public V4Group(String str) {
            this.name = str;
        }

        public V4Group(String str, String str2) {
            this.name = str;
            this.from = str2;
        }
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public List<V4Group> getGroupName() {
        return this.groupName;
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public void addToGroupName(Object obj) {
        this.groupName.add(obj);
    }

    public DeploymentModelV4(List<V4Group> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
