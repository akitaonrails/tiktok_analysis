package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinHybridResourceResponse extends BaseResponse {

    @C09CT("activity_list")
    public final List<BulletinActivityStruct> activityList;

    @C09CT("apply_skin")
    public final ApplySkin applySkin;

    @C09CT("bar_entrance")
    public final BulletinBarEntrance barEntrance;

    @C09CT("bottom_resource_info")
    public final BulletinResourceInfo bottomResourceInfo;

    @C09CT("post_script_cfgs")
    public final List<BulletinPostScriptCfg> postScriptCfgs;

    @C09CT("top_resource_info")
    public final BulletinResourceInfo topResourceInfo;

    public BulletinHybridResourceResponse() {
        this(null, null, null, null, null, null);
    }

    public final BulletinHybridResourceResponse copy(BulletinResourceInfo bulletinResourceInfo, List<BulletinActivityStruct> list, List<BulletinPostScriptCfg> list2, BulletinResourceInfo bulletinResourceInfo2, BulletinBarEntrance bulletinBarEntrance, ApplySkin applySkin) {
        return new BulletinHybridResourceResponse(bulletinResourceInfo, list, list2, bulletinResourceInfo2, bulletinBarEntrance, applySkin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinHybridResourceResponse)) {
            return false;
        }
        BulletinHybridResourceResponse bulletinHybridResourceResponse = (BulletinHybridResourceResponse) obj;
        return Intrinsics.LJFF(this.bottomResourceInfo, bulletinHybridResourceResponse.bottomResourceInfo) && Intrinsics.LJFF(this.activityList, bulletinHybridResourceResponse.activityList) && Intrinsics.LJFF(this.postScriptCfgs, bulletinHybridResourceResponse.postScriptCfgs) && Intrinsics.LJFF(this.topResourceInfo, bulletinHybridResourceResponse.topResourceInfo) && Intrinsics.LJFF(this.barEntrance, bulletinHybridResourceResponse.barEntrance) && Intrinsics.LJFF(this.applySkin, bulletinHybridResourceResponse.applySkin);
    }

    public int hashCode() {
        BulletinResourceInfo bulletinResourceInfo = this.bottomResourceInfo;
        int iHashCode = (bulletinResourceInfo == null ? 0 : bulletinResourceInfo.hashCode()) * 31;
        List<BulletinActivityStruct> list = this.activityList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BulletinPostScriptCfg> list2 = this.postScriptCfgs;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BulletinResourceInfo bulletinResourceInfo2 = this.topResourceInfo;
        int iHashCode4 = (iHashCode3 + (bulletinResourceInfo2 == null ? 0 : bulletinResourceInfo2.hashCode())) * 31;
        BulletinBarEntrance bulletinBarEntrance = this.barEntrance;
        int iHashCode5 = (iHashCode4 + (bulletinBarEntrance == null ? 0 : bulletinBarEntrance.hashCode())) * 31;
        ApplySkin applySkin = this.applySkin;
        return iHashCode5 + (applySkin != null ? applySkin.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinHybridResourceResponse(bottomResourceInfo=");
        sbLIZ.append(this.bottomResourceInfo);
        sbLIZ.append(", activityList=");
        sbLIZ.append(this.activityList);
        sbLIZ.append(", postScriptCfgs=");
        sbLIZ.append(this.postScriptCfgs);
        sbLIZ.append(", topResourceInfo=");
        sbLIZ.append(this.topResourceInfo);
        sbLIZ.append(", barEntrance=");
        sbLIZ.append(this.barEntrance);
        sbLIZ.append(", applySkin=");
        sbLIZ.append(this.applySkin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BulletinActivityStruct> getActivityList() {
        return this.activityList;
    }

    public final ApplySkin getApplySkin() {
        return this.applySkin;
    }

    public final BulletinBarEntrance getBarEntrance() {
        return this.barEntrance;
    }

    public final BulletinResourceInfo getBottomResourceInfo() {
        return this.bottomResourceInfo;
    }

    public final List<BulletinPostScriptCfg> getPostScriptCfgs() {
        return this.postScriptCfgs;
    }

    public final BulletinResourceInfo getTopResourceInfo() {
        return this.topResourceInfo;
    }

    public BulletinHybridResourceResponse(BulletinResourceInfo bulletinResourceInfo, List<BulletinActivityStruct> list, List<BulletinPostScriptCfg> list2, BulletinResourceInfo bulletinResourceInfo2, BulletinBarEntrance bulletinBarEntrance, ApplySkin applySkin) {
        this.bottomResourceInfo = bulletinResourceInfo;
        this.activityList = list;
        this.postScriptCfgs = list2;
        this.topResourceInfo = bulletinResourceInfo2;
        this.barEntrance = bulletinBarEntrance;
        this.applySkin = applySkin;
    }
}
