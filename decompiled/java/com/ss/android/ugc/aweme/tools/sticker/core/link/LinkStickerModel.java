package com.ss.android.ugc.aweme.tools.sticker.core.link;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC19613311oR;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LinkStickerModel implements StickerModel, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("display_text")
    public String displayText;

    @C09CT("link_address")
    public String fullURL;

    @C09CT("icon_size")
    public int iconSize;

    @C09CT("link_enabled_status")
    public String linkEnableStatus;

    @C09CT("link_risk_score")
    public int linkRiskScore;

    @C09CT("safety_conclusion")
    public int safetyConclusion;

    @C09CT("link_sticker_theme")
    public EnumC19613311oR theme;

    @C09CT("visible")
    public boolean visible;
    public static final Parcelable.Creator<LinkStickerModel> CREATOR = new Parcelable.Creator<LinkStickerModel>() { // from class: X.11oI
        @Override // android.os.Parcelable.Creator
        public final LinkStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            EnumC19613311oR enumC19613311oRValueOf = EnumC19613311oR.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new LinkStickerModel(baseStickerModelCreateFromParcel, i, enumC19613311oRValueOf, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkStickerModel[] newArray(int i) {
            return new LinkStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public LinkStickerModel() {
        this(new BaseStickerModel(106, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), 0, EnumC19613311oR.DEFAULT, true, "", "", "Enabled", 100, 0);
    }

    public static /* synthetic */ LinkStickerModel copy$default(LinkStickerModel linkStickerModel, BaseStickerModel baseStickerModel, int i, EnumC19613311oR enumC19613311oR, boolean z, String str, String str2, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            baseStickerModel = linkStickerModel.baseStickerModel;
        }
        if ((i4 & 2) != 0) {
            i = linkStickerModel.iconSize;
        }
        if ((i4 & 4) != 0) {
            enumC19613311oR = linkStickerModel.theme;
        }
        if ((i4 & 8) != 0) {
            z = linkStickerModel.visible;
        }
        if ((i4 & 16) != 0) {
            str = linkStickerModel.fullURL;
        }
        if ((i4 & 32) != 0) {
            str2 = linkStickerModel.displayText;
        }
        if ((i4 & 64) != 0) {
            str3 = linkStickerModel.linkEnableStatus;
        }
        if ((i4 & 128) != 0) {
            i2 = linkStickerModel.linkRiskScore;
        }
        if ((i4 & 256) != 0) {
            i3 = linkStickerModel.safetyConclusion;
        }
        return linkStickerModel.copy(baseStickerModel, i, enumC19613311oR, z, str, str2, str3, i2, i3);
    }

    public final LinkStickerModel copy(BaseStickerModel baseStickerModel, int i, EnumC19613311oR enumC19613311oR, boolean z, String str, String str2, String str3, int i2, int i3) {
        return new LinkStickerModel(baseStickerModel, i, enumC19613311oR, z, str, str2, str3, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkStickerModel)) {
            return false;
        }
        LinkStickerModel linkStickerModel = (LinkStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, linkStickerModel.baseStickerModel) && this.iconSize == linkStickerModel.iconSize && this.theme == linkStickerModel.theme && this.visible == linkStickerModel.visible && Intrinsics.LJFF(this.fullURL, linkStickerModel.fullURL) && Intrinsics.LJFF(this.displayText, linkStickerModel.displayText) && Intrinsics.LJFF(this.linkEnableStatus, linkStickerModel.linkEnableStatus) && this.linkRiskScore == linkStickerModel.linkRiskScore && this.safetyConclusion == linkStickerModel.safetyConclusion;
    }

    public int hashCode() {
        return (((((((((((((((this.baseStickerModel.hashCode() * 31) + this.iconSize) * 31) + this.theme.hashCode()) * 31) + C786410Ut5.Z2(this.visible)) * 31) + this.fullURL.hashCode()) * 31) + this.displayText.hashCode()) * 31) + this.linkEnableStatus.hashCode()) * 31) + this.linkRiskScore) * 31) + this.safetyConclusion;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", iconSize=");
        sbLIZ.append(this.iconSize);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.theme);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", fullURL=");
        sbLIZ.append(this.fullURL);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", linkEnableStatus=");
        sbLIZ.append(this.linkEnableStatus);
        sbLIZ.append(", linkRiskScore=");
        sbLIZ.append(this.linkRiskScore);
        sbLIZ.append(", safetyConclusion=");
        sbLIZ.append(this.safetyConclusion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.iconSize);
        parcel.writeString(this.theme.name());
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.fullURL);
        parcel.writeString(this.displayText);
        parcel.writeString(this.linkEnableStatus);
        parcel.writeInt(this.linkRiskScore);
        parcel.writeInt(this.safetyConclusion);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setUrlLinkSticker(new LinkStickerStruct(this.fullURL, this.displayText, this.linkEnableStatus, this.linkRiskScore, this.safetyConclusion));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.fullURL.length() > 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFullURL() {
        return this.fullURL;
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final String getLinkEnableStatus() {
        return this.linkEnableStatus;
    }

    public final int getLinkRiskScore() {
        return this.linkRiskScore;
    }

    public final int getSafetyConclusion() {
        return this.safetyConclusion;
    }

    public final EnumC19613311oR getTheme() {
        return this.theme;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }

    public final void setFullURL(String str) {
        this.fullURL = str;
    }

    public final void setIconSize(int i) {
        this.iconSize = i;
    }

    public final void setLinkEnableStatus(String str) {
        this.linkEnableStatus = str;
    }

    public final void setLinkRiskScore(int i) {
        this.linkRiskScore = i;
    }

    public final void setSafetyConclusion(int i) {
        this.safetyConclusion = i;
    }

    public final void setTheme(EnumC19613311oR enumC19613311oR) {
        this.theme = enumC19613311oR;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy$default(this, BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), 0, null, false, null, null, null, 0, 0, 510, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        ILinkStickerComponentProvider iLinkStickerComponentProvider = (ILinkStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ILinkStickerComponentProvider.class, false, false, false, 14, null);
        if (iLinkStickerComponentProvider != null) {
            return iLinkStickerComponentProvider.LIZJ(context, str, c1440500naa);
        }
        return null;
    }

    public LinkStickerModel(BaseStickerModel baseStickerModel, int i, EnumC19613311oR enumC19613311oR, boolean z, String str, String str2, String str3, int i2, int i3) {
        this.baseStickerModel = baseStickerModel;
        this.iconSize = i;
        this.theme = enumC19613311oR;
        this.visible = z;
        this.fullURL = str;
        this.displayText = str2;
        this.linkEnableStatus = str3;
        this.linkRiskScore = i2;
        this.safetyConclusion = i3;
    }
}
