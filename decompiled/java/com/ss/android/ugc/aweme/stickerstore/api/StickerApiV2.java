package com.ss.android.ugc.aweme.stickerstore.api;

import X.C040I;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.AvatarDuoReportAddPhotoRequest;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetAvatarDuoResp;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerFavoritesResp;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerRequest;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerResp;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerSetsResp;
import com.ss.android.ugc.aweme.im.sticker.api.model.PhotoCommentStickerOnVideoResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.PopularStickerListResponseV2;
import com.ss.android.ugc.aweme.im.sticker.api.model.SaveStickerResp;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerInboxNotificationRequest;
import com.ss.android.ugc.aweme.im.sticker.api.model.SwitchStickerVariantRequest;
import com.ss.android.ugc.aweme.im.sticker.api.model.UpdateVisibilityRequest;
import com.ss.android.ugc.aweme.im.sticker.impl.replytosticker.model.IMStickerSearchSimilarResponseV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface StickerApiV2 {
    @InterfaceC1501200pAU("im/sticker/post_recommendation")
    Object LIZ(@InterfaceC1501120pAM("item_id") long j, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, InterfaceC1364105Vn<? super PostStickerRecommendationResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/sets/update")
    Object LIZIZ(@InterfaceC1501120pAM("set_ids") List<Long> list, @InterfaceC1501120pAM("sticker_type") int i, @InterfaceC1501120pAM("action") int i2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/popular")
    Object LIZJ(@InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("cursor") int i2, @InterfaceC1501120pAM("all_type") boolean z, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i3, @InterfaceC1501120pAM("version") int i4, @InterfaceC1501120pAM("video_id") Long l, InterfaceC1364105Vn<? super PopularStickerListResponseV2> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/save")
    Object LIZLLL(@InterfaceC1501120pAM("sticker_type") int i, @InterfaceC1501120pAM("uri") String str, @InterfaceC1501120pAM("width") int i2, @InterfaceC1501120pAM("height") int i3, @InterfaceC1501120pAM("texts") List<String> list, @InterfaceC1501120pAM("source") String str2, InterfaceC1364105Vn<? super SaveStickerResp> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/favorites")
    Object LJ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, @InterfaceC1501120pAM("in_house_tenor") boolean z, @InterfaceC1501120pAM("source") String str, InterfaceC1364105Vn<? super GetStickerFavoritesResp> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/stickers/attr")
    Object LJFF(@C040I SwitchStickerVariantRequest switchStickerVariantRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/video_reply")
    Object LJI(@InterfaceC1501120pAM("video_id") long j, InterfaceC1364105Vn<? super PhotoCommentStickerOnVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/notification/send")
    Object LJII(@C040I StickerInboxNotificationRequest stickerInboxNotificationRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/avatar_duo/added")
    Object LJIIIIZZ(@C040I AvatarDuoReportAddPhotoRequest avatarDuoReportAddPhotoRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/avatar_duo")
    Object LJIIIZ(@InterfaceC1501120pAM("conversation_id") String str, InterfaceC1364105Vn<? super GetAvatarDuoResp> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/sets")
    Object LJIIJ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("type_filters") List<Integer> list, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("all_stickers") boolean z, @InterfaceC1501120pAM("source") String str3, InterfaceC1364105Vn<? super GetStickerSetsResp> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/suggestion")
    Object LJIIJJI(@InterfaceC1501120pAM("sticker_type") int i, @InterfaceC1501120pAM("sticker_id") Long l, @InterfaceC1501120pAM("str_sticker_id") String str, @InterfaceC1501120pAM("sticker_ab_json") String str2, InterfaceC1364105Vn<? super IMStickerSearchSimilarResponseV2> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/favorites/update")
    Object LJIIL(@InterfaceC1501120pAM("sticker_id") long j, @InterfaceC1501120pAM("sticker_type") int i, @InterfaceC1501120pAM("action") int i2, @InterfaceC1501120pAM("str_sticker_id") String str, @InterfaceC1501120pAM("in_house_tenor") boolean z, @InterfaceC1501120pAM("source") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/visibility/")
    Object LJIILIIL(@C040I UpdateVisibilityRequest updateVisibilityRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/stickers")
    Object LJIILJJIL(@C040I GetStickerRequest getStickerRequest, @InterfaceC1501120pAM("source") String str, InterfaceC1364105Vn<? super GetStickerResp> interfaceC1364105Vn);

    public static final class PostStickerRecommendationResponse extends BaseResponse {

        @C09CT("stickers")
        public final List<StickerItem> stickers;

        public PostStickerRecommendationResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostStickerRecommendationResponse) && Intrinsics.LJFF(this.stickers, ((PostStickerRecommendationResponse) obj).stickers);
        }

        public final int hashCode() {
            List<StickerItem> list = this.stickers;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PostStickerRecommendationResponse(stickers=");
            sbLIZ.append(this.stickers);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PostStickerRecommendationResponse(List<StickerItem> list) {
            this.stickers = list;
        }
    }
}
