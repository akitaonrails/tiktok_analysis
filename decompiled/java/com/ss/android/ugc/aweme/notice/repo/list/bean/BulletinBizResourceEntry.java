package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBizResourceEntry implements InterfaceC1891350zJl {

    @C09CT("event_tracking_fields")
    public final List<BulletinCardKV> extra;

    @C09CT("icon_url")
    public final TuxImageModel iconUrlModel;

    @C09CT("name")
    public final String name;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final int type;

    public BulletinBizResourceEntry() {
        this(-1, null, null, null, null);
    }

    public final BulletinBizResourceEntry copy(int i, String str, String str2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        return new BulletinBizResourceEntry(i, str, str2, tuxImageModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinBizResourceEntry)) {
            return false;
        }
        BulletinBizResourceEntry bulletinBizResourceEntry = (BulletinBizResourceEntry) obj;
        return this.type == bulletinBizResourceEntry.type && Intrinsics.LJFF(this.name, bulletinBizResourceEntry.name) && Intrinsics.LJFF(this.schema, bulletinBizResourceEntry.schema) && Intrinsics.LJFF(this.iconUrlModel, bulletinBizResourceEntry.iconUrlModel) && Intrinsics.LJFF(this.extra, bulletinBizResourceEntry.extra);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.name;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TuxImageModel tuxImageModel = this.iconUrlModel;
        int iHashCode3 = (iHashCode2 + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        List<BulletinCardKV> list = this.extra;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBizResourceEntry(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
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

    public final String getSchema() {
        return this.schema;
    }

    public final int getType() {
        return this.type;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public BulletinBizResourceEntry(int i, String str, String str2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        this.type = i;
        this.name = str;
        this.schema = str2;
        this.iconUrlModel = tuxImageModel;
        this.extra = list;
    }
}
