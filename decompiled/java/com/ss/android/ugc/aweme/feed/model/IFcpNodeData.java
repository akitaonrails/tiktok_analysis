package com.ss.android.ugc.aweme.feed.model;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface IFcpNodeData {

    public static final class DefaultImpls {
        public static List<String> getChildrenKey(IFcpNodeData iFcpNodeData, String str) {
            return null;
        }

        public static void setPolicyShowLimit(IFcpNodeData iFcpNodeData, int i) {
        }
    }

    List<String> getChildrenKey(String str);

    String getCurrentKey();

    String getParentKey();

    void setParentKey(String str);

    void setPolicyShowLimit(int i);
}
