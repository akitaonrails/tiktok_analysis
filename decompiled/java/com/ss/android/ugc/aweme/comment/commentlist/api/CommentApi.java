package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.AbstractC2126608Uu;
import X.C04RD;
import X.C080U;
import X.C09S2;
import X.C0CQT;
import X.C1017070cZd;
import X.C11NZ;
import X.C1344470l5h;
import X.C1344500l5k;
import X.C1345110l6j;
import X.C1345240l6w;
import X.C1345910l81;
import X.C1345960l86;
import X.C1345980l88;
import X.C1346000l8A;
import X.C1350920lG6;
import X.C1350950lG9;
import X.C1351950lHl;
import X.C1499850p8J;
import X.C15O7;
import X.C199499133x;
import X.C2188811AlT;
import X.C23093093b;
import X.C295800Bic;
import X.C422830Gi1;
import X.C454000HrC;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1343880l4k;
import X.InterfaceC1049630dQ9;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC2661011f;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentGifPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.commentv2.commentlist.TabletCommonParamsInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentApi {
    public static final InterfaceC2661011f LIZ;

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/comment/delete/")
        @InterfaceC1485505rh
        ListenableFuture<BaseCommentResponse> LIZ(@InterfaceC1501100pAK("cid") String str, @InterfaceC1501100pAK("channel_id") int i, @InterfaceC1501100pAK("action") int i2, @InterfaceC1501100pAK("scenario") int i3);

        @InterfaceC1501240pAY("/aweme/v2/comment/upload/auth/")
        C11NZ<CommentImageUploadAuth> LIZIZ(@InterfaceC1501120pAM("content_type") int i);

        @InterfaceC1501200pAU("/aweme/v1/comment/digg/")
        ListenableFuture<BaseCommentResponse> LIZJ(@InterfaceC1501120pAM("cid") String str, @InterfaceC1501120pAM("aweme_id") String str2, @InterfaceC1501120pAM("digg_type") String str3, @InterfaceC1501120pAM("channel_id") int i);

        @InterfaceC1501240pAY("/tiktok/v1/gift/send/")
        @InterfaceC1485505rh
        ListenableFuture<CommentResponse> LIZLLL(@InterfaceC1501100pAK("gift_id") String str, @InterfaceC1501100pAK("aweme_id") String str2, @InterfaceC1501100pAK("is_from_gift_bag") boolean z);

        @InterfaceC1501200pAU("/aweme/v1/comment/digg/")
        C11NZ<BaseCommentResponse> LJ(@InterfaceC1501120pAM("cid") String str, @InterfaceC1501120pAM("aweme_id") String str2, @InterfaceC1501120pAM("digg_type") String str3, @InterfaceC1501120pAM("channel_id") int i);

        @InterfaceC1501240pAY("/aweme/v1/comment/delete/")
        @InterfaceC1485505rh
        ListenableFuture<BaseCommentResponse> LJFF(@InterfaceC1501100pAK("cid") String str, @InterfaceC1501100pAK("channel_id") int i, @InterfaceC1501100pAK("scenario") int i2);

        @InterfaceC1501240pAY("/aweme/v1/comment/publish/")
        @InterfaceC1485505rh
        ListenableFuture<CommentResponse> LJI(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("text") String str2, @InterfaceC1501100pAK("reply_id") String str3, @InterfaceC1501100pAK("text_extra") String str4, @InterfaceC1501100pAK("image_extra") String str5, @InterfaceC1501100pAK("sticker_info") String str6, @InterfaceC1501100pAK("is_self_see") int i, @InterfaceC1501100pAK("reply_to_reply_id") String str7, @InterfaceC1501100pAK("channel_id") int i2, @InterfaceC1501100pAK("action_type") int i3, @InterfaceC1501100pAK("ad_info") String str8, @InterfaceC1501100pAK("publish_scenario") int i4, @InterfaceC1501100pAK("skip_rethink") int i5, @InterfaceC1501100pAK("current_shown_count") String str9, @InterfaceC1501100pAK("shark_params") String str10, @InterfaceC1501100pAK("ad_creative_id") Long l, @InterfaceC1501120pAM("enter_from") String str11, @InterfaceC1501100pAK("user_vote_info") String str12);

        @InterfaceC1501240pAY("/tiktok/v1/gift/send/")
        @InterfaceC1485505rh
        ListenableFuture<CommentResponse> LJII(@InterfaceC1501100pAK("gift_id") String str, @InterfaceC1501100pAK("aweme_id") String str2, @InterfaceC1501100pAK("comment_publish_request") String str3, @InterfaceC1501100pAK("is_from_gift_bag") boolean z);

        @InterfaceC1501240pAY("/aweme/v1/comment/publish/")
        @InterfaceC1485505rh
        ListenableFuture<CommentResponse> LJIIIIZZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("text") String str2, @InterfaceC1501100pAK("reply_id") String str3, @InterfaceC1501100pAK("text_extra") String str4, @InterfaceC1501100pAK("image_extra") String str5, @InterfaceC1501100pAK("sticker_info") String str6, @InterfaceC1501100pAK("is_self_see") int i, @InterfaceC1501100pAK("reply_to_reply_id") String str7, @InterfaceC1501100pAK("channel_id") int i2, @InterfaceC1501100pAK("action_type") int i3, @InterfaceC1501100pAK("ad_info") String str8, @InterfaceC1501100pAK("publish_scenario") int i4, @InterfaceC1501100pAK("current_shown_count") String str9, @InterfaceC1501100pAK("shark_params") String str10, @InterfaceC1501100pAK("ad_creative_id") Long l, @InterfaceC1501120pAM("enter_from") String str11, @InterfaceC1501100pAK("user_vote_info") String str12);

        @InterfaceC1501200pAU("/aweme/v2/comment/list/")
        C15O7<CommentItemList> fetchCommentListV2(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("insert_ids") String str2, @InterfaceC1501120pAM("forward_page_type") int i2, @InterfaceC1501120pAM("ad_creative_id") Long l, @InterfaceC1501120pAM("channel_id") int i3, @InterfaceC1501120pAM("user_avatar_shrink") String str3, @InterfaceC1501120pAM("ad_pricing_type") int i4, @InterfaceC1501120pAM("load_type") int i5, @InterfaceC1501120pAM("offline_pin_comment") int i6, @InterfaceC1501120pAM("author_relation_type") int i7, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501120pAM("scenario") int i8, @InterfaceC1501120pAM("enter_from") String str4, @InterfaceC1501120pAM("comment_entity_words") String str5, @InterfaceC1501120pAM("repost_insert_ids") String str6, @InterfaceC1501120pAM("is_non_personalized") boolean z, @InterfaceC1501120pAM("suggest_words") String str7, @InterfaceC1501120pAM("shown_cnt") long j2, @InterfaceC1501120pAM("enable_muf_maf") int i9, @InterfaceC1501120pAM("author_id") String str8, @InterfaceC1501120pAM("aweme_type") int i10, @InterfaceC1501120pAM("query_times") int i11, @InterfaceC1501120pAM("query_times_since_last_ad") int i12, @InterfaceC1501120pAM("preload") Integer num, @InterfaceC1501120pAM("net_level") Integer num2, @InterfaceC1501120pAM("perf_score") Float f, @InterfaceC1501120pAM("channel_name") String str9, @InterfaceC1501120pAM("zero_count_expire_time") Long l2, @InterfaceC1501120pAM("muf_comment_filter_user_ids") String str10, @InterfaceC1501120pAM("source") Integer num3, @InterfaceC1501120pAM("poll_id") Long l3, @InterfaceC1501120pAM("comment_profiles") String str11);
    }

    static {
        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(C0CQT.LIZJ);
        c1499850p8J.LIZ(new TabletCommonParamsInterceptor());
        LIZ = c1499850p8J.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommentGifPublishRequestModel LIZ(C1345910l81 c1345910l81) {
        String json;
        CommentGifPublishRequestModel commentGifPublishRequestModel = new CommentGifPublishRequestModel();
        commentGifPublishRequestModel.setAid(c1345910l81.LIZ);
        commentGifPublishRequestModel.setText(c1345910l81.LIZIZ);
        commentGifPublishRequestModel.setReplyId(c1345910l81.LIZJ);
        commentGifPublishRequestModel.setStructList(c1345910l81.LIZLLL);
        Gson gson = C7740030o.LIZ().getGson();
        List<CommentImageModel> list = c1345910l81.LJIIZILJ;
        if (list != null) {
            json = GsonProtectorUtils.toJson(gson, list);
        } else {
            json = "[]";
        }
        commentGifPublishRequestModel.setImageList(json);
        commentGifPublishRequestModel.setIsSelfSee(0);
        commentGifPublishRequestModel.setReplyToReplyId(c1345910l81.LJ);
        commentGifPublishRequestModel.setChannelId(c1345910l81.LJFF);
        commentGifPublishRequestModel.setActionType(0);
        commentGifPublishRequestModel.setAdInfo(LIZLLL(c1345910l81.LIZ));
        commentGifPublishRequestModel.setSendCommentType(0);
        commentGifPublishRequestModel.setUserVoteInfo(null);
        return commentGifPublishRequestModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommentPublishRequestModel LIZIZ(C1345910l81 c1345910l81) {
        CommentPublishRequestModel commentPublishRequestModel = new CommentPublishRequestModel();
        commentPublishRequestModel.setAid(c1345910l81.LIZ);
        commentPublishRequestModel.setText(c1345910l81.LIZIZ);
        commentPublishRequestModel.setReplyId(c1345910l81.LIZJ);
        commentPublishRequestModel.setStructList(c1345910l81.LIZLLL);
        commentPublishRequestModel.setImageList(c1345910l81.LJIIZILJ);
        commentPublishRequestModel.setStickerInfo(C454000HrC.LIZIZ(c1345910l81.LJIJ));
        commentPublishRequestModel.setIsSelfSee(0);
        commentPublishRequestModel.setReplyToReplyId(c1345910l81.LJ);
        commentPublishRequestModel.setChannelId(c1345910l81.LJFF);
        commentPublishRequestModel.setActionType(0);
        commentPublishRequestModel.setAdInfo(LIZLLL(c1345910l81.LIZ));
        commentPublishRequestModel.setSendCommentType(0);
        commentPublishRequestModel.setCurrentShownCount(c1345910l81.LJIJJLI);
        commentPublishRequestModel.setCreativeId(null);
        commentPublishRequestModel.setEnterFrom(c1345910l81.LJJIFFI);
        commentPublishRequestModel.setUserVoteInfo(null);
        return commentPublishRequestModel;
    }

    public static String LIZLLL(String str) {
        Aweme awemeLIZ;
        if (!TextUtils.isEmpty(str) && !CardStruct.IStatusCode.DEFAULT.equals(str) && (awemeLIZ = C1345240l6w.LIZ().LIZ(str)) != null && AwemeExtKt.isAdTraffic(awemeLIZ) && awemeLIZ.getAwemeRawAd() != null && awemeLIZ.getAwemeRawAd().getAdId() != null) {
            Long adId = awemeLIZ.getAwemeRawAd().getAdId();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ad_id", adId);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return C786410Ut5.J3(jSONObject);
        }
        return null;
    }

    public static CommentResponse LJ(C1345910l81 c1345910l81) {
        try {
            CommentGifPublishRequestModel commentGifPublishRequestModelLIZ = LIZ(c1345910l81);
            if (C199499133x.LIZ(c1345910l81.LIZIZ) && !C1351950lHl.LJIIIIZZ(c1345910l81.LJIIZILJ)) {
                return ((RealApi) LIZ.create(RealApi.class)).LIZLLL(String.valueOf(c1345910l81.LJIIIIZZ), c1345910l81.LIZ, c1345910l81.LJIIIZ).get();
            }
            CommentResponse commentResponse = ((RealApi) LIZ.create(RealApi.class)).LJII(String.valueOf(c1345910l81.LJIIIIZZ), c1345910l81.LIZ, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), commentGifPublishRequestModelLIZ), c1345910l81.LJIIIZ).get();
            Comment comment = commentResponse.comment;
            if (comment != null) {
                comment.setLabelInfo(commentResponse.starFakeLabel);
                commentResponse.comment.setFakeId(c1345910l81.LJI);
                commentResponse.comment.setImageList(C1345110l6j.LIZIZ(c1345910l81.LJIIZILJ));
            }
            return commentResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static C15O7 LIZJ(String str, String str2, int i, int i2, EnumC1343880l4k enumC1343880l4k, String str3, String str4, long j, boolean z, long j2, String str5, Integer num, boolean z2) {
        C1345980l88 c1345980l88;
        Long creativeId;
        int chargeType;
        String strLIZIZ;
        int iIntValue;
        int iIntValue2;
        User author;
        boolean z3;
        Boolean boolValueOf;
        int awemeType;
        Integer num2;
        Integer numValueOf;
        Float fValueOf;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ != null && awemeLLILZ.getPreload() != null && awemeLLILZ.getPreload().commentPreload >= 0) {
            c1345980l88 = new C1345980l88();
            C1346000l8A c1346000l8A = new C1346000l8A();
            c1346000l8A.LIZIZ = "cache_comment";
            c1346000l8A.LIZLLL = 100000;
            c1346000l8A.LIZJ = 1;
            c1345980l88.LJJI.put(C1346000l8A.class, c1346000l8A);
        } else {
            c1345980l88 = null;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && awemeEr.getAwemeRawAd() != null && !C1017070cZd.LJLJJLL(awemeEr)) {
            creativeId = awemeEr.getAwemeRawAd().getCreativeId();
        } else {
            creativeId = null;
        }
        if (awemeEr != null && awemeEr.getAwemeRawAd() != null) {
            chargeType = awemeEr.getAwemeRawAd().getChargeType();
        } else {
            chargeType = 0;
        }
        C1345960l86 c1345960l86 = new C1345960l86(str);
        c1345960l86.LIZIZ = 0L;
        c1345960l86.LIZJ = 20;
        c1345960l86.LIZLLL = str2;
        c1345960l86.LJ = 1;
        c1345960l86.LJFF = creativeId;
        c1345960l86.LJI = i;
        int[] iArrLIZ = C422830Gi1.LIZ(100);
        String authorUid = "";
        if (iArrLIZ == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append("_");
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c1345960l86.LJII = strLIZIZ;
        c1345960l86.LJIIIIZZ = chargeType;
        c1345960l86.LJIIIZ = 0;
        c1345960l86.LJIIJ = c1345980l88;
        c1345960l86.LJIIJJI = i2;
        c1345960l86.LJIIL = enumC1343880l4k.getValue();
        c1345960l86.LJIILIIL = str3;
        c1345960l86.LJIILJJIL = str4;
        c1345960l86.LJIILL = j;
        c1345960l86.LJIILLIIL = 0;
        c1345960l86.LJIIZILJ = num;
        CommentPreloadRequest commentPreloadRequest = new CommentPreloadRequest(c1345960l86);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        C1350920lG6.LJJLJLI(str3, str2);
        if (C295800Bic.LIZ() && ((Number) C295800Bic.LIZ.getValue()).intValue() != 3 && z2 && !TextUtils.isEmpty(str)) {
            C1344500l5k c1344500l5k = new C1344500l5k(0, num.intValue(), 0, 0L, str, str2);
            C1344470l5h.LIZ.getClass();
            C1344470l5h.LIZJ(c1344500l5k);
            if (str3 != null && str3.equals("homepage_hot") && num.intValue() == 0) {
                C1344470l5h.LIZIZ(Integer.valueOf(commentPreloadRequest.loadType), null, str2);
            }
        }
        boolean zLJFF = C1350950lG9.LIZIZ.LJFF();
        InterfaceC1049630dQ9 interfaceC1049630dQ9LIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZJ().LIZ(str3);
        if (interfaceC1049630dQ9LIZ != null) {
            Map<String, Object> mapLIZ = interfaceC1049630dQ9LIZ.LIZ();
            iIntValue = ((Integer) mapLIZ.get("query_times")).intValue();
            iIntValue2 = ((Integer) mapLIZ.get("query_times_since_last_ad")).intValue();
        } else {
            iIntValue = -1;
            iIntValue2 = -1;
        }
        RealApi realApi = (RealApi) LIZ.create(RealApi.class);
        String str6 = commentPreloadRequest.aid;
        long j3 = commentPreloadRequest.cursor;
        int i3 = commentPreloadRequest.count;
        String str7 = commentPreloadRequest.insertCids;
        int i4 = commentPreloadRequest.forwardPageType;
        Long l = commentPreloadRequest.adCreativeId;
        int i5 = commentPreloadRequest.channelId;
        String str8 = commentPreloadRequest.userAvatarShrink;
        int i6 = commentPreloadRequest.adPricingType;
        int i7 = commentPreloadRequest.loadType;
        int i8 = commentPreloadRequest.offlinePin;
        int i9 = commentPreloadRequest.authorRelationType;
        Object obj = commentPreloadRequest.policy;
        String str9 = commentPreloadRequest.searchParams;
        long j4 = commentPreloadRequest.shownCount;
        if (awemeLLILZ == null || (author = awemeLLILZ.getAuthor()) == null) {
            boolValueOf = Boolean.FALSE;
        } else {
            if ((author.getMatchedFriendStruct() == null || author.getMatchedFriendStruct().recType == null) && author.getFollowerStatus() != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolValueOf = Boolean.valueOf(z3);
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        if (awemeLLILZ == null) {
            awemeType = 0;
        } else {
            authorUid = AwemeExtKt.getAuthorUid(awemeLLILZ);
            awemeType = awemeLLILZ.getAwemeType();
        }
        if (z) {
            num2 = 1;
            C23093093b.LIZ.getClass();
            numValueOf = Integer.valueOf(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType());
            C23093093b.LIZ.getClass();
            fValueOf = Float.valueOf(C23093093b.LIZ());
        } else {
            num2 = null;
            numValueOf = null;
            fValueOf = null;
        }
        return realApi.fetchCommentListV2(str6, j3, i3, str7, i4, l, i5, str8, i6, i7, i8, i9, obj, arrayList, 0, str3, null, "", zLJFF, str9, j4, zBooleanValue ? 1 : 0, authorUid, awemeType, iIntValue, iIntValue2, num2, numValueOf, fValueOf, "", Long.valueOf(j2), str5, num, null, C04RD.LIZ());
    }
}
