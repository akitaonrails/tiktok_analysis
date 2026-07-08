package com.ss.android.ugc.aweme.tools.sticker.core.donation;

import X.AbstractC1442160ndG;
import X.C098200Yq;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C189200o6;
import X.C19578711ir;
import X.C19591311kt;
import X.C19598511m3;
import X.C2097608Jq;
import X.C306530Bzv;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class DonationStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("add_time")
    public final String addTime;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("display_style")
    public final int displayStyle;

    @C09CT("donate_link")
    public final String donateLink;

    @C09CT("fundraiser_goal_desc")
    public final String fundraiserGoalDesc;

    @C09CT("fundriserId")
    public final String fundraiserId;

    @C09CT("fundraiser_owner_id")
    public final String fundraiserOwnerId;

    @C09CT("icon")
    public final String iconUri;

    @C09CT("initial_transform_scale")
    public final float initialTransformScale;

    @C09CT("is_dynamic_render")
    public final boolean isDynamicRender;

    @C09CT("legacy_donation_no_display_style_attr")
    public final boolean legacyDonationNoDisplayStyleAttr;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String orgId;

    @C09CT("type")
    public final String orgType;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<DonationStickerModel> CREATOR = new Parcelable.Creator<DonationStickerModel>() { // from class: X.11CB
        @Override // android.os.Parcelable.Creator
        public final DonationStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new DonationStickerModel(baseStickerModelCreateFromParcel, z, z2, string, string2, string3, string4, string5, string6, string7, string8, string9, i, f, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final DonationStickerModel[] newArray(int i) {
            return new DonationStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final DonationStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, float f, boolean z3, boolean z4) {
        return new DonationStickerModel(baseStickerModel, z, z2, str, str2, str3, str4, str5, str6, str7, str8, str9, i, f, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonationStickerModel)) {
            return false;
        }
        DonationStickerModel donationStickerModel = (DonationStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, donationStickerModel.baseStickerModel) && this.visible == donationStickerModel.visible && this.clickable == donationStickerModel.clickable && Intrinsics.LJFF(this.name, donationStickerModel.name) && Intrinsics.LJFF(this.iconUri, donationStickerModel.iconUri) && Intrinsics.LJFF(this.donateLink, donationStickerModel.donateLink) && Intrinsics.LJFF(this.addTime, donationStickerModel.addTime) && Intrinsics.LJFF(this.orgId, donationStickerModel.orgId) && Intrinsics.LJFF(this.orgType, donationStickerModel.orgType) && Intrinsics.LJFF(this.fundraiserId, donationStickerModel.fundraiserId) && Intrinsics.LJFF(this.fundraiserOwnerId, donationStickerModel.fundraiserOwnerId) && Intrinsics.LJFF(this.fundraiserGoalDesc, donationStickerModel.fundraiserGoalDesc) && this.displayStyle == donationStickerModel.displayStyle && Float.compare(this.initialTransformScale, donationStickerModel.initialTransformScale) == 0 && this.legacyDonationNoDisplayStyleAttr == donationStickerModel.legacyDonationNoDisplayStyleAttr && this.isDynamicRender == donationStickerModel.isDynamicRender;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    public String toString() {
        return "DonationStickerModel(baseStickerModel=" + this.baseStickerModel + ", visible=" + this.visible + ", clickable=" + this.clickable + ", name=" + this.name + ", iconUri=" + this.iconUri + ", donateLink=" + this.donateLink + ", addTime=" + this.addTime + ", orgId=" + this.orgId + ", orgType=" + this.orgType + ", fundraiserId=" + this.fundraiserId + ", fundraiserOwnerId=" + this.fundraiserOwnerId + ", fundraiserGoalDesc=" + this.fundraiserGoalDesc + ", displayStyle=" + this.displayStyle + ", initialTransformScale=" + this.initialTransformScale + ", legacyDonationNoDisplayStyleAttr=" + this.legacyDonationNoDisplayStyleAttr + ", isDynamicRender=" + this.isDynamicRender + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.iconUri);
        parcel.writeString(this.donateLink);
        parcel.writeString(this.addTime);
        parcel.writeString(this.orgId);
        parcel.writeString(this.orgType);
        parcel.writeString(this.fundraiserId);
        parcel.writeString(this.fundraiserOwnerId);
        parcel.writeString(this.fundraiserGoalDesc);
        parcel.writeInt(this.displayStyle);
        parcel.writeFloat(this.initialTransformScale);
        parcel.writeInt(this.legacyDonationNoDisplayStyleAttr ? 1 : 0);
        parcel.writeInt(this.isDynamicRender ? 1 : 0);
    }

    public DonationStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.DONATION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, false, "", "", "", "", "", "", "", "", "", 0, -1.0f, false, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        Object c098200Yq;
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        boolean z = (this.isDynamicRender || C306530Bzv.LIZ()) && !isLegacyGlobalDonationStackRisk();
        int iLIZ = C19578711ir.LIZ(this.displayStyle, z || this.isDynamicRender);
        try {
            HashMap mapLJI = C2097608Jq.LJI(new Pair("donation_name", this.name), new Pair("donation_url", this.donateLink), new Pair("add_anchor_time", this.addTime), new Pair("organization_id", this.orgId), new Pair("organization_type", this.orgType), new Pair("fundraiser_id", this.fundraiserId), new Pair("donation_sticker_type", String.valueOf(iLIZ)));
            if (!a0.LJJJIL(this.fundraiserOwnerId)) {
                mapLJI.put("fundraiser_owner_id", this.fundraiserOwnerId);
            }
            if (!a0.LJJJIL(this.iconUri)) {
                mapLJI.put("icon_uri", this.iconUri);
            }
            if (!a0.LJJJIL(this.fundraiserGoalDesc)) {
                mapLJI.put("fundraiser_goal_desc", this.fundraiserGoalDesc);
            }
            float f = this.initialTransformScale;
            if (f > 0.0f) {
                mapLJI.put("donation_initial_transform_scale", String.valueOf(f));
            }
            if (z) {
                mapLJI.put("is_dynamic_render", "true");
                if (iLIZ > 0) {
                    mapLJI.put("display_style", String.valueOf(iLIZ - 1));
                }
            }
            c098200Yq = C19598511m3.LIZ().LJIILL(mapLJI);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        interactStickerStructLIZLLL.setAttr((String) c098200Yq);
        if (z) {
            interactStickerStructLIZLLL.setNoGlobal(true);
        }
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    public final boolean getShouldRenderRealtimeOverlay() {
        return this.isDynamicRender && !isLegacyGlobalDonationStackRisk();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + this.name.hashCode()) * 31) + this.iconUri.hashCode()) * 31) + this.donateLink.hashCode()) * 31) + this.addTime.hashCode()) * 31) + this.orgId.hashCode()) * 31) + this.orgType.hashCode()) * 31) + this.fundraiserId.hashCode()) * 31) + this.fundraiserOwnerId.hashCode()) * 31) + this.fundraiserGoalDesc.hashCode()) * 31) + this.displayStyle) * 31) + Float.floatToIntBits(this.initialTransformScale)) * 31) + C786410Ut5.Z2(this.legacyDonationNoDisplayStyleAttr)) * 31) + C786410Ut5.Z2(this.isDynamicRender);
    }

    public final boolean isLegacyGlobalDonationStackRisk() {
        return this.legacyDonationNoDisplayStyleAttr && this.displayStyle == 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.name.length() > 0 && this.donateLink.length() > 0 && this.orgId.length() > 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        if (this.isDynamicRender) {
            return false;
        }
        return !C306530Bzv.LIZ();
    }

    public final String getAddTime() {
        return this.addTime;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final int getDisplayStyle() {
        return this.displayStyle;
    }

    public final String getDonateLink() {
        return this.donateLink;
    }

    public final String getFundraiserGoalDesc() {
        return this.fundraiserGoalDesc;
    }

    public final String getFundraiserId() {
        return this.fundraiserId;
    }

    public final String getFundraiserOwnerId() {
        return this.fundraiserOwnerId;
    }

    public final String getIconUri() {
        return this.iconUri;
    }

    public final float getInitialTransformScale() {
        return this.initialTransformScale;
    }

    public final boolean getLegacyDonationNoDisplayStyleAttr() {
        return this.legacyDonationNoDisplayStyleAttr;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrgId() {
        return this.orgId;
    }

    public final String getOrgType() {
        return this.orgType;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isDynamicRender() {
        return this.isDynamicRender;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.visible, this.clickable, this.name, this.iconUri, this.donateLink, this.addTime, this.orgId, this.orgType, this.fundraiserId, this.fundraiserOwnerId, this.fundraiserGoalDesc, this.displayStyle, this.initialTransformScale, this.legacyDonationNoDisplayStyleAttr, this.isDynamicRender);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(final Context context, final String str, final C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return new AbstractC1442160ndG<DonationStickerModel>(context, str, c1440500naa) { // from class: X.11jx
            public final Context LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.DONATION;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/donation_sticker/");
                sbLIZ.append(((DonationStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
            @Override // X.AbstractC1442160ndG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r10) throws java.lang.Throwable {
                /*
                    r9 = this;
                    com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel r10 = (com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel) r10
                    X.11im r7 = new X.11im
                    android.content.Context r0 = r9.LIZJ
                    r7.<init>(r0)
                    r6 = 0
                    r7.LLJI = r6
                    r5 = 0
                    r7.LLJIJIL = r5
                    int r2 = X.C19583911jh.LIZLLL(r10)
                    int r1 = r7.LLJ
                    r7.LIZLLL(r2, r10)
                    int r0 = r7.LLJ
                    if (r1 != r0) goto L1f
                    r7.LJI(r2, r10)
                L1f:
                    r7.LJFF()
                    android.widget.TextView r1 = r7.LLILZLL
                    if (r1 == 0) goto L6b
                    java.lang.String r0 = r7.LJ(r10)
                    r1.setText(r0)
                    r7.LIZIZ(r10)
                    r0 = 1
                    r7.LJIIIIZZ(r10, r0)
                    if (r2 == 0) goto L39
                    r0 = 3
                    if (r2 != r0) goto L6b
                L39:
                    X.0Gkv r4 = r7.LLILZIL
                    if (r4 == 0) goto L6b
                    int r0 = r4.getVisibility()
                    if (r0 != 0) goto L6b
                    java.lang.String r0 = r10.getIconUri()
                    boolean r0 = kotlin.text.a0.LJJJIL(r0)
                    if (r0 != 0) goto L6b
                    java.lang.String r0 = r10.getIconUri()
                    com.ss.android.ugc.aweme.base.model.UrlModel r8 = X.C19591311kt.LJIIJJI(r0)
                    if (r8 == 0) goto L6b
                    int r0 = r4.getWidth()
                    if (r0 <= 0) goto L6c
                    int r0 = r4.getHeight()
                    if (r0 <= 0) goto L6c
                L63:
                    X.09JV r0 = new X.09JV
                    r0.<init>(r4, r8, r5)
                    X.C23250099c.LJFF(r0)
                L6b:
                    return r7
                L6c:
                    android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                    if (r0 == 0) goto Lba
                    int r0 = r0.width
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r1.intValue()
                    if (r0 <= 0) goto Lba
                    int r3 = r1.intValue()
                L82:
                    android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                    if (r0 == 0) goto Lb5
                    int r0 = r0.height
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r1.intValue()
                    if (r0 <= 0) goto Lb5
                    int r2 = r1.intValue()
                L98:
                    if (r3 <= 0) goto L9c
                    if (r2 > 0) goto La4
                L9c:
                    int r3 = X.C1919207fS.LJ()
                    int r2 = X.C1919207fS.LJ()
                La4:
                    r0 = 1073741824(0x40000000, float:2.0)
                    int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
                    int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
                    r4.measure(r1, r0)
                    r4.layout(r6, r6, r3, r2)
                    goto L63
                Lb5:
                    int r2 = X.C1919207fS.LJ()
                    goto L98
                Lba:
                    int r3 = X.C1919207fS.LJ()
                    goto L82
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19585511jx.LIZIZ(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):android.view.View");
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                DonationStickerModel donationStickerModel = (DonationStickerModel) stickerModel;
                return donationStickerModel.copy(BaseStickerModel.copy$default(donationStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel.displayStyle, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
            }
        };
    }

    public DonationStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, float f, boolean z3, boolean z4) {
        this.baseStickerModel = baseStickerModel;
        this.visible = z;
        this.clickable = z2;
        this.name = str;
        this.iconUri = str2;
        this.donateLink = str3;
        this.addTime = str4;
        this.orgId = str5;
        this.orgType = str6;
        this.fundraiserId = str7;
        this.fundraiserOwnerId = str8;
        this.fundraiserGoalDesc = str9;
        this.displayStyle = i;
        this.initialTransformScale = f;
        this.legacyDonationNoDisplayStyleAttr = z3;
        this.isDynamicRender = z4;
    }
}
