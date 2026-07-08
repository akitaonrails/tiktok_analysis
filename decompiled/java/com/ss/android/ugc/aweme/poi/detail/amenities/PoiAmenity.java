package com.ss.android.ugc.aweme.poi.detail.amenities;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PoiAmenity implements Serializable, InterfaceC1891350zJl {

    @C09CT("highlight_text")
    public final String highlightText;

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("text")
    public final String text;

    public PoiAmenity() {
        this(null, null, null);
    }

    public final PoiAmenity copy(DynamicIcon dynamicIcon, String str, String str2) {
        return new PoiAmenity(dynamicIcon, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAmenity)) {
            return false;
        }
        PoiAmenity poiAmenity = (PoiAmenity) obj;
        return Intrinsics.LJFF(this.icon, poiAmenity.icon) && Intrinsics.LJFF(this.text, poiAmenity.text) && Intrinsics.LJFF(this.highlightText, poiAmenity.highlightText);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        DynamicIcon dynamicIcon = this.icon;
        int iHashCode = (dynamicIcon == null ? 0 : dynamicIcon.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.highlightText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmenity(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", highlightText=");
        sbLIZ.append(this.highlightText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getHighlightText() {
        return this.highlightText;
    }

    public final DynamicIcon getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        PoiAmenity poiAmenity;
        String str = this.text;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof PoiAmenity) && (poiAmenity = (PoiAmenity) interfaceC1891350zJl) != null) {
            str2 = poiAmenity.text;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public PoiAmenity(DynamicIcon dynamicIcon, String str, String str2) {
        this.icon = dynamicIcon;
        this.text = str;
        this.highlightText = str2;
    }
}
