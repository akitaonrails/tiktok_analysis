package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C580470Mph;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ShareKitPanel implements Serializable, Parcelable {
    public static final long serialVersionUID = -9;

    @C09CT("clientKey")
    public String clientKey;

    @C09CT("effect_resource_id")
    public String effectResourceId;

    @C09CT("share_media_type")
    public Integer shareMediaType;

    @C09CT("share_panel_effect")
    public Effect sharePanelEffect;

    @C09CT("share_panel_option")
    public String sharePanelOption;
    public static final C580470Mph Companion = new Object() { // from class: X.0Mph
    };
    public static final Parcelable.Creator<ShareKitPanel> CREATOR = new Parcelable.Creator<ShareKitPanel>() { // from class: X.0Mpg
        @Override // android.os.Parcelable.Creator
        public final ShareKitPanel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Effect effect = (Effect) parcel.readParcelable(ShareKitPanel.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ShareKitPanel(effect, string, string2, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareKitPanel[] newArray(int i) {
            return new ShareKitPanel[i];
        }
    };

    public ShareKitPanel() {
        this(null, "", "", null, "");
    }

    public final ShareKitPanel copy(Effect effect, String str, String str2, Integer num, String str3) {
        return new ShareKitPanel(effect, str, str2, num, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareKitPanel)) {
            return false;
        }
        ShareKitPanel shareKitPanel = (ShareKitPanel) obj;
        return Intrinsics.LJFF(this.sharePanelEffect, shareKitPanel.sharePanelEffect) && Intrinsics.LJFF(this.sharePanelOption, shareKitPanel.sharePanelOption) && Intrinsics.LJFF(this.effectResourceId, shareKitPanel.effectResourceId) && Intrinsics.LJFF(this.shareMediaType, shareKitPanel.shareMediaType) && Intrinsics.LJFF(this.clientKey, shareKitPanel.clientKey);
    }

    public int hashCode() {
        Effect effect = this.sharePanelEffect;
        int iHashCode = (effect == null ? 0 : effect.hashCode()) * 31;
        String str = this.sharePanelOption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.effectResourceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.shareMediaType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.clientKey;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareKitPanel(sharePanelEffect=");
        sbLIZ.append(this.sharePanelEffect);
        sbLIZ.append(", sharePanelOption=");
        sbLIZ.append(this.sharePanelOption);
        sbLIZ.append(", effectResourceId=");
        sbLIZ.append(this.effectResourceId);
        sbLIZ.append(", shareMediaType=");
        sbLIZ.append(this.shareMediaType);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.sharePanelEffect, i);
        parcel.writeString(this.sharePanelOption);
        parcel.writeString(this.effectResourceId);
        Integer num = this.shareMediaType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.clientKey);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getEffectResourceId() {
        return this.effectResourceId;
    }

    public final Integer getShareMediaType() {
        return this.shareMediaType;
    }

    public final Effect getSharePanelEffect() {
        return this.sharePanelEffect;
    }

    public final String getSharePanelOption() {
        return this.sharePanelOption;
    }

    public ShareKitPanel(Effect effect) {
        this(effect, "", "", null, "");
    }

    public final void setClientKey(String str) {
        this.clientKey = str;
    }

    public final void setEffectResourceId(String str) {
        this.effectResourceId = str;
    }

    public final void setShareMediaType(Integer num) {
        this.shareMediaType = num;
    }

    public final void setSharePanelEffect(Effect effect) {
        this.sharePanelEffect = effect;
    }

    public final void setSharePanelOption(String str) {
        this.sharePanelOption = str;
    }

    public ShareKitPanel(Effect effect, String str) {
        this(effect, str, "", null, "");
    }

    public ShareKitPanel(Effect effect, String str, String str2) {
        this(effect, str, str2, null, "");
    }

    public ShareKitPanel(Effect effect, String str, String str2, Integer num) {
        this(effect, str, str2, num, "");
    }

    public ShareKitPanel(Effect effect, String str, String str2, Integer num, String str3) {
        this.sharePanelEffect = effect;
        this.sharePanelOption = str;
        this.effectResourceId = str2;
        this.shareMediaType = num;
        this.clientKey = str3;
    }
}
