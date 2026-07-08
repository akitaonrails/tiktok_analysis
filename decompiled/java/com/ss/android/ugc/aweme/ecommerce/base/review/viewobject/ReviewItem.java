package com.ss.android.ugc.aweme.ecommerce.base.review.viewobject;

import X.C09CT;
import X.C786410Ut5;
import X.EnumC036800Ba;
import X.EnumC1407150min;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.TopTextDisclaimer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReviewItem {

    public static final class ReviewCellVO extends ReviewItem {
        public final ShopReviewProductCard LIZ;
        public final String LIZIZ;
        public final String LIZJ;
        public final TopTextDisclaimer LIZLLL;
        public final boolean LJ;
        public final boolean LJFF;
        public final boolean LJI;
        public final boolean LJII;
        public final boolean LJIIIIZZ;
        public final int LJIIIZ;
        public final EnumC1407150min LJIIJ;
        public final ReviewTransData LJIIJJI;
        public final EnumC036800Ba LJIIL;
        public final Boolean LJIILIIL;

        @C09CT("platform_link_info")
        public final PlatformLinkInfo platformLinkInfo;

        @C09CT("reviewABTest")
        public final ReviewCardUI reviewABTest;

        @C09CT("struct")
        public final ReviewItemStruct struct;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewCellVO)) {
                return false;
            }
            ReviewCellVO reviewCellVO = (ReviewCellVO) obj;
            return Intrinsics.LJFF(this.struct, reviewCellVO.struct) && Intrinsics.LJFF(this.LIZ, reviewCellVO.LIZ) && Intrinsics.LJFF(this.LIZIZ, reviewCellVO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, reviewCellVO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, reviewCellVO.LIZLLL) && this.LJ == reviewCellVO.LJ && this.LJFF == reviewCellVO.LJFF && this.LJI == reviewCellVO.LJI && this.LJII == reviewCellVO.LJII && this.LJIIIIZZ == reviewCellVO.LJIIIIZZ && this.LJIIIZ == reviewCellVO.LJIIIZ && this.LJIIJ == reviewCellVO.LJIIJ && Intrinsics.LJFF(this.reviewABTest, reviewCellVO.reviewABTest) && Intrinsics.LJFF(this.LJIIJJI, reviewCellVO.LJIIJJI) && this.LJIIL == reviewCellVO.LJIIL && Intrinsics.LJFF(this.LJIILIIL, reviewCellVO.LJIILIIL) && Intrinsics.LJFF(this.platformLinkInfo, reviewCellVO.platformLinkInfo);
        }

        public final int hashCode() {
            int iHashCode = this.struct.hashCode() * 31;
            ShopReviewProductCard shopReviewProductCard = this.LIZ;
            int iHashCode2 = (iHashCode + (shopReviewProductCard == null ? 0 : shopReviewProductCard.hashCode())) * 31;
            String str = this.LIZIZ;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.LIZJ;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TopTextDisclaimer topTextDisclaimer = this.LIZLLL;
            int iHashCode5 = (((((((((((((((iHashCode4 + (topTextDisclaimer == null ? 0 : topTextDisclaimer.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode()) * 31;
            ReviewCardUI reviewCardUI = this.reviewABTest;
            int iHashCode6 = (iHashCode5 + (reviewCardUI == null ? 0 : reviewCardUI.hashCode())) * 31;
            ReviewTransData reviewTransData = this.LJIIJJI;
            int iHashCode7 = (((iHashCode6 + (reviewTransData == null ? 0 : reviewTransData.hashCode())) * 31) + this.LJIIL.hashCode()) * 31;
            Boolean bool = this.LJIILIIL;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
            return iHashCode8 + (platformLinkInfo != null ? platformLinkInfo.hashCode() : 0);
        }

        public final String toString() {
            return "ReviewCellVO(struct=" + this.struct + ", productCard=" + this.LIZ + ", daInfo=" + this.LIZIZ + ", tipsText=" + this.LIZJ + ", topTextDisclaimer=" + this.LIZLLL + ", mainReviewExpand=" + this.LJ + ", appendReviewExpand=" + this.LJFF + ", sellerFistReplyExpand=" + this.LJI + ", sellerAppendReplyExpand=" + this.LJII + ", showDivider=" + this.LJIIIIZZ + ", transState=" + this.LJIIIZ + ", transStateV2=" + this.LJIIJ + ", reviewABTest=" + this.reviewABTest + ", transData=" + this.LJIIJJI + ", cardType=" + this.LJIIL + ", isLocalReview=" + this.LJIILIIL + ", platformLinkInfo=" + this.platformLinkInfo + ')';
        }

        public ReviewCellVO(ReviewItemStruct reviewItemStruct, ShopReviewProductCard shopReviewProductCard, String str, String str2, TopTextDisclaimer topTextDisclaimer, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, EnumC1407150min enumC1407150min, ReviewCardUI reviewCardUI, ReviewTransData reviewTransData, EnumC036800Ba enumC036800Ba, Boolean bool, PlatformLinkInfo platformLinkInfo) {
            this.struct = reviewItemStruct;
            this.LIZ = shopReviewProductCard;
            this.LIZIZ = str;
            this.LIZJ = str2;
            this.LIZLLL = topTextDisclaimer;
            this.LJ = z;
            this.LJFF = z2;
            this.LJI = z3;
            this.LJII = z4;
            this.LJIIIIZZ = z5;
            this.LJIIIZ = i;
            this.LJIIJ = enumC1407150min;
            this.reviewABTest = reviewCardUI;
            this.LJIIJJI = reviewTransData;
            this.LJIIL = enumC036800Ba;
            this.LJIILIIL = bool;
            this.platformLinkInfo = platformLinkInfo;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ReviewCellVO(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct r6, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard r7, java.lang.String r8, java.lang.String r9, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.TopTextDisclaimer r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16, X.EnumC1407150min r17, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI r18, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData r19, X.EnumC036800Ba r20, java.lang.Boolean r21, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r5 = this;
                r0 = r23
                r1 = r0 & 2
                if (r1 == 0) goto L7
                r7 = 0
            L7:
                r1 = r0 & 4
                if (r1 == 0) goto Lc
                r8 = 0
            Lc:
                r1 = r0 & 8
                if (r1 == 0) goto L11
                r9 = 0
            L11:
                r1 = r0 & 16
                if (r1 == 0) goto L16
                r10 = 0
            L16:
                r1 = r0 & 32
                if (r1 == 0) goto L1b
                r11 = 0
            L1b:
                r1 = r0 & 64
                if (r1 == 0) goto L20
                r12 = 0
            L20:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L25
                r13 = 0
            L25:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L2a
                r14 = 0
            L2a:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L2f
                r15 = 1
            L2f:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L39
                X.04G9 r1 = X.C04G9.VIEW_TRANSLATION
                int r16 = r1.getValue()
            L39:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L3f
                X.0min r17 = X.EnumC1407150min.NONE
            L3f:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L45
                r18 = 0
            L45:
                r1 = r0 & 8192(0x2000, float:1.148E-41)
                if (r1 == 0) goto L4b
                r19 = 0
            L4b:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r1 == 0) goto L7d
                com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct$MainReview r1 = r6.review
                if (r1 == 0) goto L92
                java.util.List<com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia> r1 = r1.media
                if (r1 == 0) goto L92
                java.util.Iterator r4 = r1.iterator()
            L5b:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L90
                java.lang.Object r1 = r4.next()
                r2 = r1
                com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia r2 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia) r2
                java.lang.Integer r2 = r2.mediaType
                if (r2 == 0) goto L5b
                int r3 = r2.intValue()
                r2 = 2
                if (r3 != r2) goto L5b
            L73:
                com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia r1 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia) r1
                if (r1 == 0) goto L92
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Video r1 = r1.video
                if (r1 == 0) goto L92
                X.00Ba r20 = X.EnumC036800Ba.VIDEO
            L7d:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L85
                java.lang.Boolean r21 = java.lang.Boolean.TRUE
            L85:
                r1 = 65536(0x10000, float:9.1835E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L8c
                r22 = 0
            L8c:
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            L90:
                r1 = 0
                goto L73
            L92:
                X.00Ba r20 = X.EnumC036800Ba.DEFAULT
                goto L7d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.viewobject.ReviewItem.ReviewCellVO.<init>(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.TopTextDisclaimer, boolean, boolean, boolean, boolean, boolean, int, X.0min, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData, X.00Ba, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
