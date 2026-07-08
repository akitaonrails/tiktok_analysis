package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBaseAccountInfo extends BaseResponse {

    @C09CT("bulletin_account")
    public final BulletinBoardInfo accountInfo;

    @C09CT("function_settings")
    public final List<BulletinFunctionSetting> bulletinFunctionSettings;

    public final BulletinBaseAccountInfo copy(BulletinBoardInfo bulletinBoardInfo, List<BulletinFunctionSetting> list) {
        return new BulletinBaseAccountInfo(bulletinBoardInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinBaseAccountInfo)) {
            return false;
        }
        BulletinBaseAccountInfo bulletinBaseAccountInfo = (BulletinBaseAccountInfo) obj;
        return Intrinsics.LJFF(this.accountInfo, bulletinBaseAccountInfo.accountInfo) && Intrinsics.LJFF(this.bulletinFunctionSettings, bulletinBaseAccountInfo.bulletinFunctionSettings);
    }

    public int hashCode() {
        BulletinBoardInfo bulletinBoardInfo = this.accountInfo;
        int iHashCode = (bulletinBoardInfo == null ? 0 : bulletinBoardInfo.hashCode()) * 31;
        List<BulletinFunctionSetting> list = this.bulletinFunctionSettings;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBaseAccountInfo(accountInfo=");
        sbLIZ.append(this.accountInfo);
        sbLIZ.append(", bulletinFunctionSettings=");
        sbLIZ.append(this.bulletinFunctionSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BulletinBoardInfo getAccountInfo() {
        return this.accountInfo;
    }

    public final List<BulletinFunctionSetting> getBulletinFunctionSettings() {
        return this.bulletinFunctionSettings;
    }

    public BulletinBaseAccountInfo(BulletinBoardInfo bulletinBoardInfo, List<BulletinFunctionSetting> list) {
        this.accountInfo = bulletinBoardInfo;
        this.bulletinFunctionSettings = list;
    }
}
