package com.tiktok.strategycenterengineimpl.storagecenter.model;

import X.C1697810uHb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMSceneModel {
    public int dbCode;
    public String sceneKey;
    public List<TTMStrategyModel> strategyInfo;
    public List<TTMStreamModel> streamInfo;
    public String uid;
    public boolean userRelate;

    public TTMSceneModel() {
        this(null, null, null, false, null, 0);
    }

    private final native int nativeSaveTTMSceneToNative(long j, String str, String str2, boolean z, int i, long[] jArr, int i2, long[] jArr2);

    public final int getDbCode() {
        return this.dbCode;
    }

    public final String getSceneKey() {
        return this.sceneKey;
    }

    public final List<TTMStrategyModel> getStrategyInfo() {
        return this.strategyInfo;
    }

    public final List<TTMStreamModel> getStreamInfo() {
        return this.streamInfo;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getUserRelate() {
        return this.userRelate;
    }

    public final int saveTTMSceneToNativeDB(long j) {
        int size;
        int size2;
        List<TTMStrategyModel> list = this.strategyInfo;
        int i = 0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        long[] jArr = new long[size];
        List<TTMStrategyModel> list2 = this.strategyInfo;
        if (list2 != null) {
            int i2 = 0;
            for (TTMStrategyModel tTMStrategyModel : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    jArr[i2] = tTMStrategyModel.makeNativeModel();
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        List<TTMStreamModel> list3 = this.streamInfo;
        if (list3 != null) {
            size2 = list3.size();
        } else {
            size2 = 0;
        }
        long[] jArr2 = new long[size2];
        List<TTMStreamModel> list4 = this.streamInfo;
        if (list4 != null) {
            for (TTMStreamModel tTMStreamModel : list4) {
                int i4 = i + 1;
                if (i >= 0) {
                    jArr2[i] = tTMStreamModel.makeNativeModel();
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String str = this.sceneKey;
        if (str == null) {
            str = "";
        }
        String str2 = this.uid;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        return nativeSaveTTMSceneToNative(j, str, str2, this.userRelate, size, jArr, size2, jArr2);
    }

    public final void setDbCode(int i) {
        this.dbCode = i;
    }

    public final void setSceneKey(String str) {
        this.sceneKey = str;
    }

    public final void setStrategyInfo(List<TTMStrategyModel> list) {
        this.strategyInfo = list;
    }

    public final void setStreamInfo(List<TTMStreamModel> list) {
        this.streamInfo = list;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUserRelate(boolean z) {
        this.userRelate = z;
    }

    public TTMSceneModel(String str, List<TTMStrategyModel> list, List<TTMStreamModel> list2, boolean z, String str2, int i) {
        this.sceneKey = str;
        this.strategyInfo = list;
        this.streamInfo = list2;
        this.userRelate = z;
        this.uid = str2;
        this.dbCode = i;
    }
}
