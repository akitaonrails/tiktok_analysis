package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryPicOptExperiment {
    public static final PoiGalleryPicOptExperiment LIZ = new PoiGalleryPicOptExperiment();
    public static final PoiGalleryPicOptConfigModel LIZIZ = new PoiGalleryPicOptConfigModel(0, 0, 0, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(361));

    public static boolean LIZ() {
        Integer num = ((PoiGalleryPicOptConfigModel) LIZJ.getValue()).poiAlbumPicOpt;
        return num != null && num.intValue() == 1;
    }

    public static boolean LIZIZ() {
        Integer num = ((PoiGalleryPicOptConfigModel) LIZJ.getValue()).poiGalleryPicUseOrigin;
        return num != null && num.intValue() == 1;
    }

    public static final class PoiAlbumIdlePreloadConfig {

        @C09CT("image_count")
        public final Integer imageCount;

        @C09CT("tab_count")
        public final Integer tabCount;

        public PoiAlbumIdlePreloadConfig() {
            this(0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiAlbumIdlePreloadConfig)) {
                return false;
            }
            PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadConfig = (PoiAlbumIdlePreloadConfig) obj;
            return Intrinsics.LJFF(this.tabCount, poiAlbumIdlePreloadConfig.tabCount) && Intrinsics.LJFF(this.imageCount, poiAlbumIdlePreloadConfig.imageCount);
        }

        public final int hashCode() {
            Integer num = this.tabCount;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.imageCount;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiAlbumIdlePreloadConfig(tabCount=");
            sbLIZ.append(this.tabCount);
            sbLIZ.append(", imageCount=");
            sbLIZ.append(this.imageCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiAlbumIdlePreloadConfig(Integer num, Integer num2) {
            this.tabCount = num;
            this.imageCount = num2;
        }
    }

    public static final class PoiGalleryPicOptConfigModel {

        @C09CT("poi_album_idle_preload_image")
        public final PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadImage;

        @C09CT("poi_album_pic_opt")
        public final Integer poiAlbumPicOpt;

        @C09CT("poi_detail_preload_galley_pic")
        public final Integer poiDetailPreloadGalleyPic;

        @C09CT("poi_gallery_pic_use_origin")
        public final Integer poiGalleryPicUseOrigin;

        public PoiGalleryPicOptConfigModel() {
            this(0, 0, 0, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiGalleryPicOptConfigModel)) {
                return false;
            }
            PoiGalleryPicOptConfigModel poiGalleryPicOptConfigModel = (PoiGalleryPicOptConfigModel) obj;
            return Intrinsics.LJFF(this.poiGalleryPicUseOrigin, poiGalleryPicOptConfigModel.poiGalleryPicUseOrigin) && Intrinsics.LJFF(this.poiDetailPreloadGalleyPic, poiGalleryPicOptConfigModel.poiDetailPreloadGalleyPic) && Intrinsics.LJFF(this.poiAlbumPicOpt, poiGalleryPicOptConfigModel.poiAlbumPicOpt) && Intrinsics.LJFF(this.poiAlbumIdlePreloadImage, poiGalleryPicOptConfigModel.poiAlbumIdlePreloadImage);
        }

        public final int hashCode() {
            Integer num = this.poiGalleryPicUseOrigin;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.poiDetailPreloadGalleyPic;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.poiAlbumPicOpt;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadConfig = this.poiAlbumIdlePreloadImage;
            return iHashCode3 + (poiAlbumIdlePreloadConfig != null ? poiAlbumIdlePreloadConfig.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiGalleryPicOptConfigModel(poiGalleryPicUseOrigin=");
            sbLIZ.append(this.poiGalleryPicUseOrigin);
            sbLIZ.append(", poiDetailPreloadGalleyPic=");
            sbLIZ.append(this.poiDetailPreloadGalleyPic);
            sbLIZ.append(", poiAlbumPicOpt=");
            sbLIZ.append(this.poiAlbumPicOpt);
            sbLIZ.append(", poiAlbumIdlePreloadImage=");
            sbLIZ.append(this.poiAlbumIdlePreloadImage);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiGalleryPicOptConfigModel(Integer num, Integer num2, Integer num3, PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadConfig) {
            this.poiGalleryPicUseOrigin = num;
            this.poiDetailPreloadGalleyPic = num2;
            this.poiAlbumPicOpt = num3;
            this.poiAlbumIdlePreloadImage = poiAlbumIdlePreloadConfig;
        }
    }
}
