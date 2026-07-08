package com.ss.android.ugc.aweme.poi.album;

import X.C09CT;
import X.C1185000gwU;
import X.C1186200gyQ;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.experiment.PoiGalleryPicOptExperiment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiAlbumPageApi {
    public static final C1186200gyQ LIZ = C1186200gyQ.LIZ;

    public static final class Category {

        @C09CT("pic_tab_typecode")
        public final String code;

        @C09CT("name")
        public final String name;

        @C09CT("pictures")
        public final List<UrlModel> pictures;

        @C09CT("pictures_v2")
        public final List<PoiPicture> poiPictures;

        public Category() {
            this(null, null, null, null);
        }

        public final List<UrlModel> getAlbumDisplayPictures() {
            PoiGalleryPicOptExperiment.LIZ.getClass();
            if (PoiGalleryPicOptExperiment.LIZ() && C1185000gwU.LIZ()) {
                List<PoiPicture> list = this.poiPictures;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (PoiPicture poiPicture : list) {
                    UrlModel urlModel = poiPicture.compressedUrlInfo;
                    if (urlModel != null || (urlModel = poiPicture.urlModel) != null || (urlModel = poiPicture.originUrlInfo) != null) {
                        arrayList.add(urlModel);
                    }
                }
                return arrayList;
            }
            if (!C1185000gwU.LIZ()) {
                List<UrlModel> picturesByExperiment = getPicturesByExperiment();
                return picturesByExperiment == null ? C13BV.INSTANCE : picturesByExperiment;
            }
            List<PoiPicture> list2 = this.poiPictures;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (PoiPicture poiPicture2 : list2) {
                UrlModel urlModel2 = poiPicture2.urlModel;
                if (urlModel2 != null || (urlModel2 = poiPicture2.originUrlInfo) != null || (urlModel2 = poiPicture2.compressedUrlInfo) != null) {
                    arrayList2.add(urlModel2);
                }
            }
            return arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x006f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0069 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0025 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0025 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.Pair<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> getGalleryImageData() {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi.Category.getGalleryImageData():kotlin.Pair");
        }

        public final List<UrlModel> getPicturesByExperiment() {
            if (!C1185000gwU.LIZ()) {
                return this.pictures;
            }
            ArrayList arrayList = new ArrayList();
            List<PoiPicture> list = this.poiPictures;
            if (list == null) {
                return arrayList;
            }
            Iterator<PoiPicture> it2 = list.iterator();
            while (it2.hasNext()) {
                UrlModel urlModel = it2.next().urlModel;
                if (urlModel != null) {
                    arrayList.add(urlModel);
                }
            }
            return arrayList;
        }

        public final List<String> getIdlePreloadImageUrls(int i) {
            Object objLJJJLL;
            if (i <= 0) {
                return C13BV.INSTANCE;
            }
            List<UrlModel> albumDisplayPictures = getAlbumDisplayPictures();
            ArrayList arrayList = new ArrayList();
            Iterator<UrlModel> it2 = albumDisplayPictures.iterator();
            while (it2.hasNext()) {
                List<String> urlList = it2.next().getUrlList();
                if (urlList != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
            return C13LP.LL(arrayList, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Category(String str, String str2, List<? extends UrlModel> list, List<PoiPicture> list2) {
            this.name = str;
            this.code = str2;
            this.pictures = list;
            this.poiPictures = list2;
        }
    }

    @InterfaceC1501200pAU("/tiktok/poi/picture_album/v1")
    Object LIZ(@InterfaceC1501120pAM("poi_id") String str, @InterfaceC1501120pAM("request_extra_params") String str2, @InterfaceC1501120pAM("group_id") String str3, InterfaceC1364105Vn<? super PoiAlbumResponse> interfaceC1364105Vn);

    public static final class PoiAlbumResponse extends BaseResponse implements Serializable {

        @C09CT("categories")
        public final List<Category> categories;

        @C09CT("category_tab_info")
        public final List<CategoryTabInfo> categoryTabList;

        @C09CT("title")
        public final String title;

        public PoiAlbumResponse() {
            this(null, null, null);
        }

        public final PoiAlbumResponse copy(String str, List<CategoryTabInfo> list, List<Category> list2) {
            return new PoiAlbumResponse(str, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiAlbumResponse)) {
                return false;
            }
            PoiAlbumResponse poiAlbumResponse = (PoiAlbumResponse) obj;
            return Intrinsics.LJFF(this.title, poiAlbumResponse.title) && Intrinsics.LJFF(this.categoryTabList, poiAlbumResponse.categoryTabList) && Intrinsics.LJFF(this.categories, poiAlbumResponse.categories);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<CategoryTabInfo> list = this.categoryTabList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<Category> list2 = this.categories;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiAlbumResponse(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", categoryTabList=");
            sbLIZ.append(this.categoryTabList);
            sbLIZ.append(", categories=");
            sbLIZ.append(this.categories);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<Category> getCategories() {
            return this.categories;
        }

        public final List<CategoryTabInfo> getCategoryTabList() {
            return this.categoryTabList;
        }

        public final String getTitle() {
            return this.title;
        }

        public PoiAlbumResponse(String str, List<CategoryTabInfo> list, List<Category> list2) {
            this.title = str;
            this.categoryTabList = list;
            this.categories = list2;
        }
    }

    public static final class CategoryTabInfo {

        @C09CT("pic_tab_typecode")
        public final String code;

        @C09CT("cover")
        public final UrlModel cover;

        @C09CT("name")
        public final String name;

        public CategoryTabInfo() {
            this(null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryTabInfo)) {
                return false;
            }
            CategoryTabInfo categoryTabInfo = (CategoryTabInfo) obj;
            return Intrinsics.LJFF(this.name, categoryTabInfo.name) && Intrinsics.LJFF(this.code, categoryTabInfo.code) && Intrinsics.LJFF(this.cover, categoryTabInfo.cover);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlModel urlModel = this.cover;
            return iHashCode2 + (urlModel != null ? urlModel.hashCode() : 0);
        }

        public CategoryTabInfo(String str, String str2, UrlModel urlModel) {
            this.name = str;
            this.code = str2;
            this.cover = urlModel;
        }
    }
}
