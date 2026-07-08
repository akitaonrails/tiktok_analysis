package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0OYZ;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinToolkitModel implements InterfaceC1891350zJl {
    public static final C0OYZ Companion = new Object() { // from class: X.0OYZ
    };

    @C09CT("event_params")
    public final List<BulletinCardKV> eventParams;

    @C09CT("icon_url")
    public final TuxImageModel iconUrlModel;

    @C09CT("name")
    public final String name;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("toolkit_type")
    public final Integer type;

    public final BulletinToolkitModel copy(Integer num, String str, String str2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        return new BulletinToolkitModel(num, str, str2, tuxImageModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinToolkitModel)) {
            return false;
        }
        BulletinToolkitModel bulletinToolkitModel = (BulletinToolkitModel) obj;
        return Intrinsics.LJFF(this.type, bulletinToolkitModel.type) && Intrinsics.LJFF(this.name, bulletinToolkitModel.name) && Intrinsics.LJFF(this.schemaUrl, bulletinToolkitModel.schemaUrl) && Intrinsics.LJFF(this.iconUrlModel, bulletinToolkitModel.iconUrlModel) && Intrinsics.LJFF(this.eventParams, bulletinToolkitModel.eventParams);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TuxImageModel tuxImageModel = this.iconUrlModel;
        int iHashCode4 = (iHashCode3 + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        List<BulletinCardKV> list = this.eventParams;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinToolkitModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(", iconUrlModel=");
        sbLIZ.append(this.iconUrlModel);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.eventParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BulletinCardKV> getEventParams() {
        return this.eventParams;
    }

    public final TuxImageModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Integer getType() {
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

    public BulletinToolkitModel(Integer num, String str, String str2, TuxImageModel tuxImageModel, List<BulletinCardKV> list) {
        this.type = num;
        this.name = str;
        this.schemaUrl = str2;
        this.iconUrlModel = tuxImageModel;
        this.eventParams = list;
    }
}
