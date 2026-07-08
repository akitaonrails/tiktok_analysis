package com.ss.android.ugc.aweme.models;

import X.C09CT;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C786410Ut5;
import X.C901200ZXa;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageBubbleStyle {
    public static final int LIZ = Color.rgb(197, 197, 197);
    public static final int LIZIZ = -16777216;

    @C09CT("data")
    public final MessageBubbleStyleData data;

    @C09CT("label")
    public final String label;

    @C09CT("load_time")
    public final long loadTime;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("title")
    public String title;

    @C09CT("url_prefix")
    public String urlPrefix;

    public MessageBubbleStyle() {
        this("", "", "", new MessageBubbleStyleData("", null, null, new MessageBubbleStyleData.ImageSize(0.0f, 0.0f), new MessageBubbleStyleData.StretchPosition(0.0f, 0.0f, 0.0f, 0.0f), false, false, new MessageBubbleStyleData.MessageBubbleInsetsData(0.0f, 0.0f, 0.0f, 0.0f), null, null, null, null, null, false), "", 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageBubbleStyle)) {
            return false;
        }
        MessageBubbleStyle messageBubbleStyle = (MessageBubbleStyle) obj;
        return Intrinsics.LJFF(this.title, messageBubbleStyle.title) && Intrinsics.LJFF(this.resourceId, messageBubbleStyle.resourceId) && Intrinsics.LJFF(this.urlPrefix, messageBubbleStyle.urlPrefix) && Intrinsics.LJFF(this.data, messageBubbleStyle.data) && Intrinsics.LJFF(this.label, messageBubbleStyle.label) && this.loadTime == messageBubbleStyle.loadTime;
    }

    public final int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.resourceId.hashCode()) * 31) + this.urlPrefix.hashCode()) * 31) + this.data.hashCode()) * 31) + this.label.hashCode()) * 31) + C786410Ut5.Y2(this.loadTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBubbleStyle(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", loadTime=");
        sbLIZ.append(this.loadTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C901200ZXa LIZ() {
        String str = this.data.contentColorHex;
        if (str == null) {
            return null;
        }
        try {
            int color = Color.parseColor(str);
            float[] fArr = new float[3];
            C2441009hQ.LIZIZ(Color.red(color), Color.green(color), Color.blue(color), fArr);
            return new C901200ZXa(C2441009hQ.LJIIL(color, 52), C2441009hQ.LJIIL(color, 128), C2441009hQ.LJIIL(color, 166), color, (((double) fArr[2]) > 0.5d ? 1 : (((double) fArr[2]) == 0.5d ? 0 : -1)) < 0 ? C2441009hQ.LJI(0.7f, color, LIZ) : C2441009hQ.LJI(0.63f, color, LIZIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.models.MessageBubbleStyle.MessageBubbleStyleData.MessageBubbleInsetsData LIZIZ(com.ss.android.ugc.aweme.models.MessageBubbleStyle r3, boolean r4) {
        /*
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L2e
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L2e
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            r2 = 1
            if (r0 != r2) goto L2e
        L13:
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData r1 = r3.data
            boolean r0 = r1.disableFlip
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = r1.insets
            if (r2 == 0) goto L30
            r0.getClass()
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r4 = new com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData
            float r3 = r0.top
            float r2 = r0.right
            float r1 = r0.bottom
            float r0 = r0.left
            r4.<init>(r3, r2, r1, r0)
            return r4
        L2e:
            r2 = 0
            goto L13
        L30:
            return r0
        L31:
            if (r4 == 0) goto L36
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = r1.insets
            return r0
        L36:
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = r1.insets
            r0.getClass()
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r4 = new com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData
            float r3 = r0.top
            float r2 = r0.right
            float r1 = r0.bottom
            float r0 = r0.left
            r4.<init>(r3, r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.models.MessageBubbleStyle.LIZIZ(com.ss.android.ugc.aweme.models.MessageBubbleStyle, boolean):com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData");
    }

    public MessageBubbleStyle(String str, String str2, String str3, MessageBubbleStyleData messageBubbleStyleData, String str4, long j) {
        this.title = str;
        this.resourceId = str2;
        this.urlPrefix = str3;
        this.data = messageBubbleStyleData;
        this.label = str4;
        this.loadTime = j;
    }

    public static final class MessageBubbleStyleData {

        @C09CT("bubble_image")
        public final String bubbleImageKey;

        @C09CT("bubble_image_small")
        public final String bubbleImageSmallKey;

        @C09CT("content_color_hex")
        public final String contentColorHex;

        @C09CT("disable_flip")
        public final boolean disableFlip;

        @C09CT("end_date")
        public final Long endDate;

        @C09CT("image_size")
        public final ImageSize imageSize;

        @C09CT("message_content_insets")
        public final MessageBubbleInsetsData insets;

        @C09CT("is_locked_whee_bubble")
        public final boolean isLockedWheeBubble;

        @C09CT("start_date")
        public final Long startDate;

        @C09CT("flex_area_insets")
        public final StretchPosition stretchPosition;

        @C09CT("thumbnail_background_image")
        public final String thumbnailBackgroundImage;

        @C09CT("thumbnail_background_image_dk")
        public final String thumbnailBackgroundImageDk;

        @C09CT("thumbnail_image")
        public final String thumbnailImageKey;

        @C09CT("tile_to_resize")
        public final boolean tileToResize;

        public static final class ImageSize {

            @C09CT("height")
            public final float height;

            @C09CT("width")
            public final float width;

            public ImageSize() {
                this(0.0f, 0.0f);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ImageSize)) {
                    return false;
                }
                ImageSize imageSize = (ImageSize) obj;
                return Float.compare(this.width, imageSize.width) == 0 && Float.compare(this.height, imageSize.height) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ImageSize(width=");
                sbLIZ.append(this.width);
                sbLIZ.append(", height=");
                sbLIZ.append(this.height);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height);
            }

            public ImageSize(float f, float f2) {
                this.width = f;
                this.height = f2;
            }
        }

        public static final class MessageBubbleInsetsData {

            @C09CT("bottom")
            public final float bottom;

            @C09CT("left")
            public final float left;

            @C09CT("right")
            public final float right;

            @C09CT("top")
            public final float top;

            public MessageBubbleInsetsData() {
                this(0.0f, 0.0f, 0.0f, 0.0f);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MessageBubbleInsetsData)) {
                    return false;
                }
                MessageBubbleInsetsData messageBubbleInsetsData = (MessageBubbleInsetsData) obj;
                return Float.compare(this.top, messageBubbleInsetsData.top) == 0 && Float.compare(this.left, messageBubbleInsetsData.left) == 0 && Float.compare(this.bottom, messageBubbleInsetsData.bottom) == 0 && Float.compare(this.right, messageBubbleInsetsData.right) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MessageBubbleInsetsData(top=");
                sbLIZ.append(this.top);
                sbLIZ.append(", left=");
                sbLIZ.append(this.left);
                sbLIZ.append(", bottom=");
                sbLIZ.append(this.bottom);
                sbLIZ.append(", right=");
                sbLIZ.append(this.right);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (((((Float.floatToIntBits(this.top) * 31) + Float.floatToIntBits(this.left)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + Float.floatToIntBits(this.right);
            }

            public MessageBubbleInsetsData(float f, float f2, float f3, float f4) {
                this.top = f;
                this.left = f2;
                this.bottom = f3;
                this.right = f4;
            }
        }

        public static final class StretchPosition {

            @C09CT("left")
            public final float x0;

            @C09CT("right")
            public final float x1;

            @C09CT("top")
            public final float y0;

            @C09CT("bottom")
            public final float y1;

            public StretchPosition() {
                this(0.0f, 0.0f, 0.0f, 0.0f);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StretchPosition)) {
                    return false;
                }
                StretchPosition stretchPosition = (StretchPosition) obj;
                return Float.compare(this.x0, stretchPosition.x0) == 0 && Float.compare(this.x1, stretchPosition.x1) == 0 && Float.compare(this.y0, stretchPosition.y0) == 0 && Float.compare(this.y1, stretchPosition.y1) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StretchPosition(x0=");
                sbLIZ.append(this.x0);
                sbLIZ.append(", x1=");
                sbLIZ.append(this.x1);
                sbLIZ.append(", y0=");
                sbLIZ.append(this.y0);
                sbLIZ.append(", y1=");
                sbLIZ.append(this.y1);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (((((Float.floatToIntBits(this.x0) * 31) + Float.floatToIntBits(this.x1)) * 31) + Float.floatToIntBits(this.y0)) * 31) + Float.floatToIntBits(this.y1);
            }

            public StretchPosition(float f, float f2, float f3, float f4) {
                this.x0 = f;
                this.x1 = f2;
                this.y0 = f3;
                this.y1 = f4;
            }
        }

        public MessageBubbleStyleData() {
            this("", null, null, new ImageSize(0.0f, 0.0f), new StretchPosition(0.0f, 0.0f, 0.0f, 0.0f), false, false, new MessageBubbleInsetsData(0.0f, 0.0f, 0.0f, 0.0f), null, null, null, null, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageBubbleStyleData)) {
                return false;
            }
            MessageBubbleStyleData messageBubbleStyleData = (MessageBubbleStyleData) obj;
            return Intrinsics.LJFF(this.bubbleImageKey, messageBubbleStyleData.bubbleImageKey) && Intrinsics.LJFF(this.bubbleImageSmallKey, messageBubbleStyleData.bubbleImageSmallKey) && Intrinsics.LJFF(this.thumbnailImageKey, messageBubbleStyleData.thumbnailImageKey) && Intrinsics.LJFF(this.imageSize, messageBubbleStyleData.imageSize) && Intrinsics.LJFF(this.stretchPosition, messageBubbleStyleData.stretchPosition) && this.tileToResize == messageBubbleStyleData.tileToResize && this.disableFlip == messageBubbleStyleData.disableFlip && Intrinsics.LJFF(this.insets, messageBubbleStyleData.insets) && Intrinsics.LJFF(this.contentColorHex, messageBubbleStyleData.contentColorHex) && Intrinsics.LJFF(this.startDate, messageBubbleStyleData.startDate) && Intrinsics.LJFF(this.endDate, messageBubbleStyleData.endDate) && Intrinsics.LJFF(this.thumbnailBackgroundImage, messageBubbleStyleData.thumbnailBackgroundImage) && Intrinsics.LJFF(this.thumbnailBackgroundImageDk, messageBubbleStyleData.thumbnailBackgroundImageDk) && this.isLockedWheeBubble == messageBubbleStyleData.isLockedWheeBubble;
        }

        public final int hashCode() {
            int iHashCode = this.bubbleImageKey.hashCode() * 31;
            String str = this.bubbleImageSmallKey;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.thumbnailImageKey;
            int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.imageSize.hashCode()) * 31) + this.stretchPosition.hashCode()) * 31) + C786410Ut5.Z2(this.tileToResize)) * 31) + C786410Ut5.Z2(this.disableFlip)) * 31) + this.insets.hashCode()) * 31;
            String str3 = this.contentColorHex;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.startDate;
            int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.endDate;
            int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str4 = this.thumbnailBackgroundImage;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.thumbnailBackgroundImageDk;
            return ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isLockedWheeBubble);
        }

        public final String toString() {
            return "MessageBubbleStyleData(bubbleImageKey=" + this.bubbleImageKey + ", bubbleImageSmallKey=" + this.bubbleImageSmallKey + ", thumbnailImageKey=" + this.thumbnailImageKey + ", imageSize=" + this.imageSize + ", stretchPosition=" + this.stretchPosition + ", tileToResize=" + this.tileToResize + ", disableFlip=" + this.disableFlip + ", insets=" + this.insets + ", contentColorHex=" + this.contentColorHex + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", thumbnailBackgroundImage=" + this.thumbnailBackgroundImage + ", thumbnailBackgroundImageDk=" + this.thumbnailBackgroundImageDk + ", isLockedWheeBubble=" + this.isLockedWheeBubble + ')';
        }

        public MessageBubbleStyleData(String str, String str2, String str3, ImageSize imageSize, StretchPosition stretchPosition, boolean z, boolean z2, MessageBubbleInsetsData messageBubbleInsetsData, String str4, Long l, Long l2, String str5, String str6, boolean z3) {
            this.bubbleImageKey = str;
            this.bubbleImageSmallKey = str2;
            this.thumbnailImageKey = str3;
            this.imageSize = imageSize;
            this.stretchPosition = stretchPosition;
            this.tileToResize = z;
            this.disableFlip = z2;
            this.insets = messageBubbleInsetsData;
            this.contentColorHex = str4;
            this.startDate = l;
            this.endDate = l2;
            this.thumbnailBackgroundImage = str5;
            this.thumbnailBackgroundImageDk = str6;
            this.isLockedWheeBubble = z3;
        }
    }
}
