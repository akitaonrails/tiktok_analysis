package com.ss.android.ugc.aweme.ecommerce.mall.customdot.state;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ReachCfgDataForMall {
    public final long createTime;
    public final boolean isBubblePicShow;
    public boolean isBubbleShowed;
    public boolean isDotShowed;
    public String mallExtraInfo;
    public final ReachCfgData reachCfgData;
    public final String reachCfgDataStr;
    public Map<String, ? extends Object> tabUiTrackParams;

    public ReachCfgDataForMall() {
        this(null, null, false, false, false, null, null, System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReachCfgDataForMall(reachCfgDataStr=");
        sbLIZ.append(this.reachCfgDataStr);
        sbLIZ.append(", reachCfgData=");
        sbLIZ.append(this.reachCfgData);
        sbLIZ.append(", isBubblePicShow=");
        sbLIZ.append(this.isBubblePicShow);
        sbLIZ.append(", isBubbleShowed=");
        sbLIZ.append(this.isBubbleShowed);
        sbLIZ.append(", isDotShowed=");
        sbLIZ.append(this.isDotShowed);
        sbLIZ.append(", tabUiTrackParams=");
        sbLIZ.append(this.tabUiTrackParams);
        sbLIZ.append(", mallExtraInfo=");
        sbLIZ.append(this.mallExtraInfo);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isBubblePicShow() {
        return this.isBubblePicShow;
    }

    public final boolean isBubbleShowed() {
        return this.isBubbleShowed;
    }

    public final boolean isDotShowed() {
        return this.isDotShowed;
    }

    public final void setBubbleShowed(boolean z) {
        this.isBubbleShowed = z;
    }

    public final void setDotShowed(boolean z) {
        this.isDotShowed = z;
    }

    public final void setMallExtraInfo(String str) {
        this.mallExtraInfo = str;
    }

    public final void setTabUiTrackParams(Map<String, ? extends Object> map) {
        this.tabUiTrackParams = map;
    }

    public ReachCfgDataForMall(String str, ReachCfgData reachCfgData, boolean z, boolean z2, boolean z3, Map<String, ? extends Object> map, String str2, long j) {
        this.reachCfgDataStr = str;
        this.reachCfgData = reachCfgData;
        this.isBubblePicShow = z;
        this.isBubbleShowed = z2;
        this.isDotShowed = z3;
        this.tabUiTrackParams = map;
        this.mallExtraInfo = str2;
        this.createTime = j;
    }
}
