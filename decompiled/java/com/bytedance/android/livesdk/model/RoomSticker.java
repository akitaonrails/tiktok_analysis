package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RoomSticker extends Sticker {
    public boolean LIZLLL;

    @C09CT("audit_info")
    public RoomStickerAuditInfo auditInfo;

    @C09CT("bottom_right_h")
    public int bottomRightHeight;

    @C09CT("bottom_right_w")
    public int bottomRightWidth;

    @C09CT("content_key")
    public String contentKey;

    @C09CT("edited")
    public boolean edited;

    @C09CT("extra")
    public String extra;

    @C09CT("has_upload_to_server")
    public boolean hasUploadToServer;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_from_reward")
    public boolean isFromReward;

    @C09CT("name")
    public String name;

    @C09CT("nine_patch_image")
    public ImageModel ninePatchImage;

    @C09CT("review_status")
    public int reviewStatus;

    @C09CT("source")
    public String source;

    @C09CT("starling_key")
    public String starlingKey;

    @C09CT("top_left_h")
    public int topLeftHeight;

    @C09CT("top_left_w")
    public int topLeftWidth;

    public RoomSticker() {
        this(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomSticker)) {
            return false;
        }
        RoomSticker roomSticker = (RoomSticker) obj;
        return this.LIZLLL == roomSticker.LIZLLL && Intrinsics.LJFF(this.image, roomSticker.image) && Intrinsics.LJFF(this.ninePatchImage, roomSticker.ninePatchImage) && this.topLeftHeight == roomSticker.topLeftHeight && this.topLeftWidth == roomSticker.topLeftWidth && this.bottomRightHeight == roomSticker.bottomRightHeight && this.bottomRightWidth == roomSticker.bottomRightWidth && Intrinsics.LJFF(this.contentKey, roomSticker.contentKey) && Intrinsics.LJFF(this.name, roomSticker.name) && this.reviewStatus == roomSticker.reviewStatus && this.edited == roomSticker.edited && Intrinsics.LJFF(this.auditInfo, roomSticker.auditInfo) && Intrinsics.LJFF(this.starlingKey, roomSticker.starlingKey) && this.isFromReward == roomSticker.isFromReward && Intrinsics.LJFF(this.source, roomSticker.source) && Intrinsics.LJFF(this.extra, roomSticker.extra) && this.hasUploadToServer == roomSticker.hasUploadToServer;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZLLL) * 31;
        ImageModel imageModel = this.image;
        int iHashCode = (iZ2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.ninePatchImage;
        int iHashCode2 = (((((((((((((((((iHashCode + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31) + this.topLeftHeight) * 31) + this.topLeftWidth) * 31) + this.bottomRightHeight) * 31) + this.bottomRightWidth) * 31) + this.contentKey.hashCode()) * 31) + this.name.hashCode()) * 31) + this.reviewStatus) * 31) + C786410Ut5.Z2(this.edited)) * 31;
        RoomStickerAuditInfo roomStickerAuditInfo = this.auditInfo;
        int iHashCode3 = (((((iHashCode2 + (roomStickerAuditInfo == null ? 0 : roomStickerAuditInfo.hashCode())) * 31) + this.starlingKey.hashCode()) * 31) + C786410Ut5.Z2(this.isFromReward)) * 31;
        String str = this.source;
        return ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.extra.hashCode()) * 31) + C786410Ut5.Z2(this.hasUploadToServer);
    }

    public final String toString() {
        return "RoomSticker(isRemember=" + this.LIZLLL + ", image=" + this.image + ", ninePatchImage=" + this.ninePatchImage + ", topLeftHeight=" + this.topLeftHeight + ", topLeftWidth=" + this.topLeftWidth + ", bottomRightHeight=" + this.bottomRightHeight + ", bottomRightWidth=" + this.bottomRightWidth + ", contentKey=" + this.contentKey + ", name=" + this.name + ", reviewStatus=" + this.reviewStatus + ", edited=" + this.edited + ", auditInfo=" + this.auditInfo + ", starlingKey=" + this.starlingKey + ", isFromReward=" + this.isFromReward + ", source=" + this.source + ", extra=" + this.extra + ", hasUploadToServer=" + this.hasUploadToServer + ')';
    }

    public static RoomSticker LIZ(RoomSticker roomSticker) {
        boolean z = roomSticker.LIZLLL;
        ImageModel imageModel = roomSticker.image;
        ImageModel imageModel2 = roomSticker.ninePatchImage;
        int i = roomSticker.topLeftHeight;
        int i2 = roomSticker.topLeftWidth;
        int i3 = roomSticker.bottomRightHeight;
        int i4 = roomSticker.bottomRightWidth;
        String str = roomSticker.contentKey;
        String str2 = roomSticker.name;
        int i5 = roomSticker.reviewStatus;
        boolean z2 = roomSticker.edited;
        RoomStickerAuditInfo roomStickerAuditInfo = roomSticker.auditInfo;
        String str3 = roomSticker.starlingKey;
        boolean z3 = roomSticker.isFromReward;
        String str4 = roomSticker.source;
        String str5 = roomSticker.extra;
        boolean z4 = roomSticker.hasUploadToServer;
        roomSticker.getClass();
        return new RoomSticker(z, imageModel, imageModel2, i, i2, i3, i4, str, str2, i5, z2, roomStickerAuditInfo, str3, z3, str4, str5, z4);
    }

    public RoomSticker(boolean z, ImageModel imageModel, ImageModel imageModel2, int i, int i2, int i3, int i4, String str, String str2, int i5, boolean z2, RoomStickerAuditInfo roomStickerAuditInfo, String str3, boolean z3, String str4, String str5, boolean z4) {
        this.LIZLLL = z;
        this.image = imageModel;
        this.ninePatchImage = imageModel2;
        this.topLeftHeight = i;
        this.topLeftWidth = i2;
        this.bottomRightHeight = i3;
        this.bottomRightWidth = i4;
        this.contentKey = str;
        this.name = str2;
        this.reviewStatus = i5;
        this.edited = z2;
        this.auditInfo = roomStickerAuditInfo;
        this.starlingKey = str3;
        this.isFromReward = z3;
        this.source = str4;
        this.extra = str5;
        this.hasUploadToServer = z4;
    }
}
