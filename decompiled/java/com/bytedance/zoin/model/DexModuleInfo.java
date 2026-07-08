package com.bytedance.zoin.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DexModuleInfo extends AbstractModuleInfo {
    public List<ZoinBuildFileInfo> dexFileInfoList = new ArrayList();
    public List<ZoinBlockInfo> blockInfoList = new ArrayList();

    public List<ZoinBuildFileInfo> getOriginalDexFileInfoList() {
        return new ArrayList(new HashSet(this.dexFileInfoList));
    }
}
