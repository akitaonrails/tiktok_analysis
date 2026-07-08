package com.ss.android.ugc.nearby.container.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1204490hRv;
import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyNoticeModel implements InterfaceC1204490hRv {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("content")
    public final String content;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public NearbyNoticeModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyNoticeModel)) {
            return false;
        }
        NearbyNoticeModel nearbyNoticeModel = (NearbyNoticeModel) obj;
        return Intrinsics.LJFF(this.type, nearbyNoticeModel.type) && Intrinsics.LJFF(this.title, nearbyNoticeModel.title) && Intrinsics.LJFF(this.content, nearbyNoticeModel.content) && Intrinsics.LJFF(this.buttonText, nearbyNoticeModel.buttonText);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyNoticeModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(X.InterfaceC1891350zJl r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.ss.android.ugc.nearby.container.model.NearbyNoticeModel
            r2 = 0
            if (r0 == 0) goto L3d
            com.ss.android.ugc.nearby.container.model.NearbyNoticeModel r4 = (com.ss.android.ugc.nearby.container.model.NearbyNoticeModel) r4
            if (r4 == 0) goto L3e
            java.lang.String r1 = r4.type
        Lb:
            java.lang.String r0 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L40
            if (r4 == 0) goto L3b
            java.lang.String r1 = r4.title
        L17:
            java.lang.String r0 = r3.title
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L40
            if (r4 == 0) goto L39
            java.lang.String r1 = r4.content
        L23:
            java.lang.String r0 = r3.content
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L40
            if (r4 == 0) goto L2f
            java.lang.String r2 = r4.buttonText
        L2f:
            java.lang.String r0 = r3.buttonText
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L40
            r0 = 1
            return r0
        L39:
            r1 = r2
            goto L23
        L3b:
            r1 = r2
            goto L17
        L3d:
            r4 = r2
        L3e:
            r1 = r2
            goto Lb
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.model.NearbyNoticeModel.areContentsTheSame(X.0zJl):boolean");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof NearbyNoticeModel;
    }

    public NearbyNoticeModel(String str, String str2, String str3, String str4) {
        this.type = str;
        this.title = str2;
        this.content = str3;
        this.buttonText = str4;
    }
}
