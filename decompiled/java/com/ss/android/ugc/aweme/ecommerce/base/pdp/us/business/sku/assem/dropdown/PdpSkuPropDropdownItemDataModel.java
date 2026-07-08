package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.DropdownProperty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PdpSkuPropDropdownItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PropClientMetadata;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PdpSkuPropDropdownItemDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("delimiter")
    public final String delimiter;

    @C09CT("dropdown_icon")
    public final Icon dropdownIcon;

    @C09CT("dropdown_properties")
    public final List<DropdownProperty> dropdownProperties;

    @C09CT("prop_button")
    public final PropButton propButton;

    @C09CT("client_metadata")
    public final PropClientMetadata propClientMetadata;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<PdpSkuPropDropdownItemDataModel> CREATOR = new Parcelable.Creator<PdpSkuPropDropdownItemDataModel>() { // from class: X.0mgc
        @Override // android.os.Parcelable.Creator
        public final PdpSkuPropDropdownItemDataModel createFromParcel(Parcel parcel) {
            PropButton propButtonCreateFromParcel;
            ArrayList arrayList;
            String string = parcel.readString();
            PropClientMetadata propClientMetadataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                propButtonCreateFromParcel = null;
            } else {
                propButtonCreateFromParcel = PropButton.CREATOR.createFromParcel(parcel);
            }
            PropButton propButton = propButtonCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DropdownProperty.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                propClientMetadataCreateFromParcel = PropClientMetadata.CREATOR.createFromParcel(parcel);
            }
            return new PdpSkuPropDropdownItemDataModel(string, propButton, string2, arrayList, propClientMetadataCreateFromParcel, (Icon) parcel.readParcelable(PdpSkuPropDropdownItemDataModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PdpSkuPropDropdownItemDataModel[] newArray(int i) {
            return new PdpSkuPropDropdownItemDataModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpSkuPropDropdownItemDataModel)) {
            return false;
        }
        PdpSkuPropDropdownItemDataModel pdpSkuPropDropdownItemDataModel = (PdpSkuPropDropdownItemDataModel) obj;
        return Intrinsics.LJFF(this.title, pdpSkuPropDropdownItemDataModel.title) && Intrinsics.LJFF(this.propButton, pdpSkuPropDropdownItemDataModel.propButton) && Intrinsics.LJFF(this.delimiter, pdpSkuPropDropdownItemDataModel.delimiter) && Intrinsics.LJFF(this.dropdownProperties, pdpSkuPropDropdownItemDataModel.dropdownProperties) && Intrinsics.LJFF(this.propClientMetadata, pdpSkuPropDropdownItemDataModel.propClientMetadata) && Intrinsics.LJFF(this.dropdownIcon, pdpSkuPropDropdownItemDataModel.dropdownIcon);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PropButton propButton = this.propButton;
        int iHashCode2 = (iHashCode + (propButton == null ? 0 : propButton.hashCode())) * 31;
        String str2 = this.delimiter;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DropdownProperty> list = this.dropdownProperties;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PropClientMetadata propClientMetadata = this.propClientMetadata;
        int iHashCode5 = (iHashCode4 + (propClientMetadata == null ? 0 : propClientMetadata.hashCode())) * 31;
        Icon icon = this.dropdownIcon;
        return iHashCode5 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSkuPropDropdownItemDataModel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", propButton=");
        sbLIZ.append(this.propButton);
        sbLIZ.append(", delimiter=");
        sbLIZ.append(this.delimiter);
        sbLIZ.append(", dropdownProperties=");
        sbLIZ.append(this.dropdownProperties);
        sbLIZ.append(", propClientMetadata=");
        sbLIZ.append(this.propClientMetadata);
        sbLIZ.append(", dropdownIcon=");
        sbLIZ.append(this.dropdownIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        PropButton propButton = this.propButton;
        if (propButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propButton.writeToParcel(parcel, i);
        }
        parcel.writeString(this.delimiter);
        List<DropdownProperty> list = this.dropdownProperties;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DropdownProperty> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        PropClientMetadata propClientMetadata = this.propClientMetadata;
        if (propClientMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propClientMetadata.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.dropdownIcon, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r6
      0x0027: PHI (r6v9 java.lang.Object[]) = (r6v0 java.lang.Object[]), (r6v11 java.lang.Object[]) binds: [B:38:0x00b1, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v1 java.lang.Object[]) = (r6v0 java.lang.Object[]), (r6v9 java.lang.Object[]) binds: [B:38:0x00b1, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[PHI: r3 r6
      0x00ba: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v10 java.lang.Integer) binds: [B:41:0x00b6, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r6v2 java.lang.Object[]) = (r6v1 java.lang.Object[]), (r6v8 java.lang.Object[]) binds: [B:41:0x00b6, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[PHI: r3 r6 r7
      0x00be: PHI (r3v3 java.lang.Integer) = (r3v2 java.lang.Integer), (r3v9 java.lang.Integer) binds: [B:44:0x00bb, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r6v3 java.lang.Object[]) = (r6v2 java.lang.Object[]), (r6v7 java.lang.Object[]) binds: [B:44:0x00bb, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:44:0x00bb, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[PHI: r3 r5 r6 r7
      0x00c2: PHI (r3v4 java.lang.Integer) = (r3v3 java.lang.Integer), (r3v8 java.lang.Integer) binds: [B:47:0x00bf, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:47:0x00bf, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v4 java.lang.Object[]) = (r6v3 java.lang.Object[]), (r6v6 java.lang.Object[]) binds: [B:47:0x00bf, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:47:0x00bf, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC718502rH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC746802vq> LIZ(X.C033W r22) throws java.lang.Throwable {
        /*
            r21 = this;
            r8 = r22
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r8.LIZIZ
            java.lang.Class<X.0NJ1> r0 = X.C0NJ1.class
            java.lang.Object r4 = r1.get(r0)
            boolean r0 = r4 instanceof X.C0NJ1
            r9 = 0
            if (r0 != 0) goto L10
            r4 = r9
        L10:
            X.0NJ1 r4 = (X.C0NJ1) r4
            r3 = 0
            if (r4 == 0) goto Laf
            X.0NJ9 r2 = r4.LJ()
            if (r2 == 0) goto Laf
            java.lang.String r1 = "checked_sku_ids"
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object r6 = r2.LIZIZ(r0, r1)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r6 == 0) goto Laf
        L27:
            X.0NJ9 r1 = r4.LJ()
            if (r1 == 0) goto Lb5
            java.lang.String r0 = "quantity"
            java.lang.Object r3 = r1.LIZ(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
        L35:
            X.0NJ9 r1 = r4.LJ()
            if (r1 == 0) goto Lba
            java.lang.String r0 = "sku_id"
            java.lang.Object r7 = r1.LIZ(r0)
            java.lang.String r7 = (java.lang.String) r7
        L43:
            X.0NJ9 r2 = r4.LJ()
            if (r2 == 0) goto Lbe
            java.lang.String r1 = "has_open_sku"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r2.LIZIZ(r0, r1)
        L51:
            X.0NJ9 r2 = r4.LJ()
            if (r2 == 0) goto Lc2
            java.lang.String r1 = "has_open_combined_osp"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r2.LIZIZ(r0, r1)
        L5f:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r8.LIZIZ
            java.lang.Class<X.0mgr> r0 = X.InterfaceC1405950mgr.class
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.InterfaceC1405950mgr
            if (r0 != 0) goto L6c
            r1 = r9
        L6c:
            X.0mgr r1 = (X.InterfaceC1405950mgr) r1
            if (r1 == 0) goto Lac
            com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo r19 = r1.n4(r7)
        L74:
            X.03T5 r0 = X.C03T5.LIZ
            r0.getClass()
            java.lang.String r20 = X.C03T5.LIZIZ()
            X.0mgs r10 = new X.0mgs
            r0 = r21
            java.lang.String r11 = r0.title
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton r12 = r0.propButton
            java.lang.String r13 = r0.delimiter
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.DropdownProperty> r14 = r0.dropdownProperties
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PropClientMetadata r15 = r0.propClientMetadata
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r2 = r0.dropdownIcon
            java.util.List r17 = X.C13LQ.LJJLL(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r1)
            if (r0 != 0) goto La0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r0 != 0) goto La0
            r3 = r9
        La0:
            r18 = r3
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.List r0 = java.util.Collections.singletonList(r10)
            return r0
        Lac:
            r19 = r9
            goto L74
        Laf:
            java.lang.String[] r6 = new java.lang.String[r3]
            if (r4 == 0) goto Lb5
            goto L27
        Lb5:
            r3 = r9
            if (r4 == 0) goto Lba
            goto L35
        Lba:
            r7 = r9
            if (r4 == 0) goto Lbe
            goto L43
        Lbe:
            r5 = r9
            if (r4 == 0) goto Lc2
            goto L51
        Lc2:
            r4 = r9
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PdpSkuPropDropdownItemDataModel.LIZ(X.033W):java.util.List");
    }

    public PdpSkuPropDropdownItemDataModel(String str, PropButton propButton, String str2, List<DropdownProperty> list, PropClientMetadata propClientMetadata, Icon icon) {
        this.title = str;
        this.propButton = propButton;
        this.delimiter = str2;
        this.dropdownProperties = list;
        this.propClientMetadata = propClientMetadata;
        this.dropdownIcon = icon;
    }
}
