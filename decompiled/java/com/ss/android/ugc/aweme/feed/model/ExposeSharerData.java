package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ExposeSharerData extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("share_url_extra")
    public ShareUrlExtra shareExtra;

    @C09CT("user_info")
    public User sharer;

    public ExposeSharerData() {
        this(null, null, null);
    }

    public final ExposeSharerData copy(User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra) {
        return new ExposeSharerData(user, logPbBean, shareUrlExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeSharerData)) {
            return false;
        }
        ExposeSharerData exposeSharerData = (ExposeSharerData) obj;
        return Intrinsics.LJFF(this.sharer, exposeSharerData.sharer) && Intrinsics.LJFF(this.logPbBean, exposeSharerData.logPbBean) && Intrinsics.LJFF(this.shareExtra, exposeSharerData.shareExtra);
    }

    public int hashCode() {
        User user = this.sharer;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int iHashCode2 = (iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        ShareUrlExtra shareUrlExtra = this.shareExtra;
        return iHashCode2 + (shareUrlExtra != null ? shareUrlExtra.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposeSharerData(sharer=");
        sbLIZ.append(this.sharer);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append(", shareExtra=");
        sbLIZ.append(this.shareExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final ShareUrlExtra getShareExtra() {
        return this.shareExtra;
    }

    public final User getSharer() {
        return this.sharer;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setShareExtra(ShareUrlExtra shareUrlExtra) {
        this.shareExtra = shareUrlExtra;
    }

    public final void setSharer(User user) {
        this.sharer = user;
    }

    public ExposeSharerData(User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra) {
        this.sharer = user;
        this.logPbBean = logPbBean;
        this.shareExtra = shareUrlExtra;
    }
}
