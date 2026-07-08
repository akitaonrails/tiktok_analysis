package com.ss.android.ugc.nearby.container.repo;

import X.C040I;
import X.C09CT;
import X.C11NZ;
import X.C1515820pY4;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174608fY;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface INearbyApi {
    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp")
    @InterfaceC1501320pAg(2)
    Object fetchNearbyData(@C040I NearbyRequestBody nearbyRequestBody, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501240pAY("/tiktok/feed/nearby/chunk")
    @InterfaceC1501320pAg(2)
    C11NZ<C1515820pY4<NearbyRevampResponse>> fetchNearbyDataChunk(@C040I NearbyRequestBodyForChunk nearbyRequestBodyForChunk, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp")
    @InterfaceC1501320pAg(2)
    Object fetchNearbyInnerFeedData(@C040I NearbyRequestBodyForInnerFeed nearbyRequestBodyForInnerFeed, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp/preload")
    @InterfaceC1501320pAg(2)
    Object fetchPreloadNearbyData(@C040I NearbyRequestBodyForInitTaskPreload nearbyRequestBodyForInitTaskPreload, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn);

    public static final class NearbyRequestBodyForInnerFeed implements Serializable {

        @C09CT("count")
        public final Integer count;

        @C09CT("inner_feed_entrance_item_id")
        public final Long entranceId;

        @C09CT("is_inner_feed")
        public final Boolean isInnerFeed;

        @C09CT("manual_selection_region")
        public final LocationRegion manualSelectionRegion;

        @C09CT("page")
        public final Integer page;

        @C09CT("personalization_off")
        public final Boolean personalizationOff;

        public final Boolean isInnerFeed() {
            return this.isInnerFeed;
        }

        public NearbyRequestBodyForInnerFeed(LocationRegion locationRegion, Integer num, Integer num2, Boolean bool, Long l, Boolean bool2) {
            this.manualSelectionRegion = locationRegion;
            this.page = num;
            this.count = num2;
            this.isInnerFeed = bool;
            this.entranceId = l;
            this.personalizationOff = bool2;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class UnimpressVideos implements Serializable {

        @C09CT("aweme_ids")
        public final List<String> awemeIds;

        @C09CT("group_ids")
        public final List<String> groupIds;

        public UnimpressVideos() {
            this(null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnimpressVideos)) {
                return false;
            }
            UnimpressVideos unimpressVideos = (UnimpressVideos) obj;
            return Intrinsics.LJFF(this.awemeIds, unimpressVideos.awemeIds) && Intrinsics.LJFF(this.groupIds, unimpressVideos.groupIds);
        }

        public int hashCode() {
            List<String> list = this.awemeIds;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.groupIds;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UnimpressVideos(awemeIds=");
            sbLIZ.append(this.awemeIds);
            sbLIZ.append(", groupIds=");
            sbLIZ.append(this.groupIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public UnimpressVideos(List<String> list, List<String> list2) {
            this.awemeIds = list;
            this.groupIds = list2;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ChunkParams implements Serializable {

        @C09CT("first_full_video_num")
        public final Integer firstFullVideoNum;

        @C09CT("preview_video_num")
        public final Integer previewVideoNum;

        @C09CT("remain_full_video_num")
        public final Integer remainFullVideoNum;

        public ChunkParams() {
            this(null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChunkParams)) {
                return false;
            }
            ChunkParams chunkParams = (ChunkParams) obj;
            return Intrinsics.LJFF(this.previewVideoNum, chunkParams.previewVideoNum) && Intrinsics.LJFF(this.firstFullVideoNum, chunkParams.firstFullVideoNum) && Intrinsics.LJFF(this.remainFullVideoNum, chunkParams.remainFullVideoNum);
        }

        public int hashCode() {
            Integer num = this.previewVideoNum;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.firstFullVideoNum;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.remainFullVideoNum;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChunkParams(previewVideoNum=");
            sbLIZ.append(this.previewVideoNum);
            sbLIZ.append(", firstFullVideoNum=");
            sbLIZ.append(this.firstFullVideoNum);
            sbLIZ.append(", remainFullVideoNum=");
            sbLIZ.append(this.remainFullVideoNum);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ChunkParams(Integer num, Integer num2, Integer num3) {
            this.previewVideoNum = num;
            this.firstFullVideoNum = num2;
            this.remainFullVideoNum = num3;
        }
    }

    public static final class NearbyRequestBody implements Serializable {

        @C09CT("count")
        public final Integer count;

        @C09CT("manual_selection_region")
        public final LocationRegion manualSelectionRegion;

        @C09CT("page")
        public final Integer page;

        @C09CT("personalization_off")
        public final Boolean personalizationOff;

        @C09CT("unimpress_videos")
        public final UnimpressVideos unimpressVideos;

        public NearbyRequestBody(LocationRegion locationRegion, Integer num, Integer num2, Boolean bool, UnimpressVideos unimpressVideos) {
            this.manualSelectionRegion = locationRegion;
            this.page = num;
            this.count = num2;
            this.personalizationOff = bool;
            this.unimpressVideos = unimpressVideos;
        }
    }

    public static final class NearbyRequestBodyForChunk implements Serializable {

        @C09CT("chunk_params")
        public final ChunkParams chunkParams;

        @C09CT("count")
        public final Integer count;

        @C09CT("manual_selection_region")
        public final LocationRegion manualSelectionRegion;

        @C09CT("page")
        public final Integer page;

        @C09CT("personalization_off")
        public final Boolean personalizationOff;

        @C09CT("unimpress_videos")
        public final UnimpressVideos unimpressVideos;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyRequestBodyForChunk)) {
                return false;
            }
            NearbyRequestBodyForChunk nearbyRequestBodyForChunk = (NearbyRequestBodyForChunk) obj;
            return Intrinsics.LJFF(this.manualSelectionRegion, nearbyRequestBodyForChunk.manualSelectionRegion) && Intrinsics.LJFF(this.page, nearbyRequestBodyForChunk.page) && Intrinsics.LJFF(this.count, nearbyRequestBodyForChunk.count) && Intrinsics.LJFF(this.personalizationOff, nearbyRequestBodyForChunk.personalizationOff) && Intrinsics.LJFF(this.unimpressVideos, nearbyRequestBodyForChunk.unimpressVideos) && Intrinsics.LJFF(this.chunkParams, nearbyRequestBodyForChunk.chunkParams);
        }

        public int hashCode() {
            LocationRegion locationRegion = this.manualSelectionRegion;
            int iHashCode = (locationRegion == null ? 0 : locationRegion.hashCode()) * 31;
            Integer num = this.page;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.count;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.personalizationOff;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            UnimpressVideos unimpressVideos = this.unimpressVideos;
            int iHashCode5 = (iHashCode4 + (unimpressVideos == null ? 0 : unimpressVideos.hashCode())) * 31;
            ChunkParams chunkParams = this.chunkParams;
            return iHashCode5 + (chunkParams != null ? chunkParams.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyRequestBodyForChunk(manualSelectionRegion=");
            sbLIZ.append(this.manualSelectionRegion);
            sbLIZ.append(", page=");
            sbLIZ.append(this.page);
            sbLIZ.append(", count=");
            sbLIZ.append(this.count);
            sbLIZ.append(", personalizationOff=");
            sbLIZ.append(this.personalizationOff);
            sbLIZ.append(", unimpressVideos=");
            sbLIZ.append(this.unimpressVideos);
            sbLIZ.append(", chunkParams=");
            sbLIZ.append(this.chunkParams);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyRequestBodyForChunk(LocationRegion locationRegion, Integer num, Integer num2, Boolean bool, UnimpressVideos unimpressVideos, ChunkParams chunkParams) {
            this.manualSelectionRegion = locationRegion;
            this.page = num;
            this.count = num2;
            this.personalizationOff = bool;
            this.unimpressVideos = unimpressVideos;
            this.chunkParams = chunkParams;
        }
    }

    public static final class NearbyRequestBodyForInitTaskPreload implements Serializable {

        @C09CT("count")
        public final Integer count;

        @C09CT("manual_selection_region")
        public final LocationRegion manualSelectionRegion;

        @C09CT("page")
        public final Integer page;

        @C09CT("personalization_off")
        public final Boolean personalizationOff;

        @C09CT("should_preload_all_fields")
        public final Boolean shouldPreloadAllFields;

        @C09CT("unimpress_videos")
        public final UnimpressVideos unimpressVideos;

        public NearbyRequestBodyForInitTaskPreload(LocationRegion locationRegion, Integer num, Integer num2, Boolean bool, Boolean bool2, UnimpressVideos unimpressVideos) {
            this.manualSelectionRegion = locationRegion;
            this.page = num;
            this.count = num2;
            this.shouldPreloadAllFields = bool;
            this.personalizationOff = bool2;
            this.unimpressVideos = unimpressVideos;
        }
    }
}
