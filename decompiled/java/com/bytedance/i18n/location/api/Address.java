package com.bytedance.i18n.location.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Address {
    public static final /* synthetic */ int LIZLLL = 0;
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;

    @C09CT("AdminArea")
    public AreaModel adminArea;

    @C09CT("City")
    public AreaModel city;

    @C09CT("Continent")
    public final AreaModel continent;

    @C09CT("Country")
    public final AreaModel country;

    @C09CT("District")
    public AreaModel district;

    @C09CT("Subdivisions")
    public final List<AreaModel> subdivisions;

    public Address() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Address(continent=");
        sbLIZ.append(this.continent);
        sbLIZ.append(", country=");
        sbLIZ.append(this.country);
        sbLIZ.append(", adminArea=");
        sbLIZ.append(this.adminArea);
        sbLIZ.append(", subdivisions=");
        sbLIZ.append(this.subdivisions);
        sbLIZ.append(", city=");
        sbLIZ.append(this.city);
        sbLIZ.append(", district=");
        sbLIZ.append(this.district);
        sbLIZ.append(", encryptedH3=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", encryptedS2=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", encryptedGeoHash=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Address(AreaModel areaModel, AreaModel areaModel2, AreaModel areaModel3, List<AreaModel> list, AreaModel areaModel4, AreaModel areaModel5, String str, String str2, String str3) {
        this.continent = areaModel;
        this.country = areaModel2;
        this.adminArea = areaModel3;
        this.subdivisions = list;
        this.city = areaModel4;
        this.district = areaModel5;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
