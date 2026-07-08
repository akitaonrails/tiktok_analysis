package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC618410ONj;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBizResourceEntryToggle implements InterfaceC1891350zJl {

    @C09CT("event_tracking_fields")
    public final List<BulletinCardKV> extra;

    @C09CT("icon_url")
    public final TuxImageModel iconUrlModel;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("type")
    public final int type;

    public BulletinBizResourceEntryToggle() {
        this(-1, null, EnumC618410ONj.RESOURCE_ENTRY_STATUS_CLOSE.getStatus(), null, null);
    }

    public final BulletinBizResourceEntryToggle copy(int i, String str, int i2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        return new BulletinBizResourceEntryToggle(i, str, i2, tuxImageModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinBizResourceEntryToggle)) {
            return false;
        }
        BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle = (BulletinBizResourceEntryToggle) obj;
        return this.type == bulletinBizResourceEntryToggle.type && Intrinsics.LJFF(this.name, bulletinBizResourceEntryToggle.name) && this.status == bulletinBizResourceEntryToggle.status && Intrinsics.LJFF(this.iconUrlModel, bulletinBizResourceEntryToggle.iconUrlModel) && Intrinsics.LJFF(this.extra, bulletinBizResourceEntryToggle.extra);
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.name;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.status) * 31;
        TuxImageModel tuxImageModel = this.iconUrlModel;
        int iHashCode2 = (iHashCode + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        List<BulletinCardKV> list = this.extra;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBizResourceEntryToggle(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", iconUrlModel=");
        sbLIZ.append(this.iconUrlModel);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BulletinCardKV> getExtra() {
        return this.extra;
    }

    public final TuxImageModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final String getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof BulletinBizResourceEntryToggle) && ((BulletinBizResourceEntryToggle) interfaceC1891350zJl).status == this.status) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof BulletinBizResourceEntryToggle) && ((BulletinBizResourceEntryToggle) interfaceC1891350zJl).type == this.type) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof BulletinBizResourceEntryToggle) && ((BulletinBizResourceEntryToggle) interfaceC1891350zJl).status != this.status) {
            return new Object() { // from class: X.0ONl
            };
        }
        return null;
    }

    public BulletinBizResourceEntryToggle(int i, String str, int i2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        this.type = i;
        this.name = str;
        this.status = i2;
        this.iconUrlModel = tuxImageModel;
        this.extra = list;
    }
}
