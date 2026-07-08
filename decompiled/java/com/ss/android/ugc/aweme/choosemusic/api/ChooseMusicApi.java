package com.ss.android.ugc.aweme.choosemusic.api;

import X.AnonymousClass1546;
import X.C092G;
import X.C09S2;
import X.C0C64;
import X.C12NI;
import X.C15MA;
import X.C15O7;
import X.C20017613Ty;
import X.C305420By8;
import X.C844470XAv;
import X.InterfaceC1485505rh;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParamKt;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.SuggestedQueryList;
import com.ss.android.ugc.aweme.music.model.TrimPointResponse;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseMusicApi {
    public static final API LIZ = (API) C09S2.LIZJ(API.class, C12NI.LIZ);
    public static final C20017613Ty LIZIZ;

    public interface API {
        @InterfaceC1501200pAU("/aweme/v1/commerce/music/collection/feed/")
        C15O7<MusicCollectionFeedResponse> LIZ(@InterfaceC1501120pAM("cursor") Integer num, @InterfaceC1501120pAM("count") Integer num2);

        @InterfaceC1501200pAU("/aweme/v1/music/collection/feed/")
        C15O7<MusicCollectionFeedResponse> LIZIZ(@InterfaceC1501120pAM("cursor") Integer num, @InterfaceC1501120pAM("count") Integer num2, @InterfaceC1501120pAM("sound_page_scene") int i);

        @InterfaceC1501240pAY("/aweme/v1/music/pick/")
        @InterfaceC1485505rh
        C15O7<MusicPickResponse> LIZJ(@InterfaceC1501100pAK("radio_cursor") Integer num, @InterfaceC1501100pAK("radio_count") Integer num2, @InterfaceC1501100pAK("extra_music_ids") String str, @InterfaceC1501100pAK("is_commerce_music") Boolean bool, @InterfaceC1501100pAK("sound_page_scene") Integer num3, @InterfaceC1501100pAK("zip_uri") String str2, @InterfaceC1501100pAK("music_consumption") String str3, @InterfaceC1501100pAK("shoot_way") String str4, @InterfaceC1501100pAK("content_type") String str5, @InterfaceC1501100pAK("content_source") String str6, @InterfaceC1501100pAK("info_sticker_list") String str7, @InterfaceC1501100pAK("mv_id") String str8, @InterfaceC1501100pAK("flash_mob_id") String str9, @InterfaceC1501100pAK("source_text") String str10, @InterfaceC1501100pAK("effect_id") String str11, @InterfaceC1501100pAK("creation_id") String str12, @InterfaceC1501100pAK("video_duration") Long l, @InterfaceC1501100pAK("first_music_id") Long l2, @InterfaceC1501100pAK("replace_music_index") Long l3, @InterfaceC1501100pAK("unlimited_only") Boolean bool2, @InterfaceC1501100pAK("recommend_extra") JSONObject jSONObject);

        @InterfaceC1501200pAU("/aweme/v1/commerce/music/collection/")
        C15O7<MusicCollection> LIZLLL(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2);

        @InterfaceC1501200pAU("/aweme/v1/music/collect/")
        C15O7<BaseResponse> LJ(@InterfaceC1501120pAM("music_id") String str, @InterfaceC1501120pAM("music_ids") String str2, @InterfaceC1501120pAM("action") int i);

        @InterfaceC1501200pAU("/aweme/v1/user/music/collect/")
        C15O7<CollectedMusicList> LJFF(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("sound_page_scene") int i3, @InterfaceC1501120pAM("favorite_scene") String str2, @InterfaceC1501120pAM("pinned_music_id") String str3, @InterfaceC1501120pAM("enable_offline_similar_music") String str4, @InterfaceC1501120pAM("need_theme_tags") Boolean bool, @InterfaceC1501120pAM("theme_tag_key") String str5);

        @InterfaceC1501200pAU("/aweme/v1/commerce/music/pick/")
        C15O7<MusicPickResponse> LJI(@InterfaceC1501120pAM("radio_cursor") Integer num, @InterfaceC1501120pAM("extra_music_ids") String str, @InterfaceC1501120pAM("is_commerce_music") Boolean bool, @InterfaceC1501120pAM("creation_id") String str2);

        @InterfaceC1501200pAU("/aweme/v1/music/list/")
        C15O7<MusicList> LJII(@InterfaceC1501120pAM("mc_id") String str, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("level") int i3, @InterfaceC1501120pAM("sound_page_scene") int i4);

        @InterfaceC1501200pAU("/aweme/v1/auto/apply/music/")
        C15O7<AutoApplyMusicResponse> LJIIIIZZ(@InterfaceC1501120pAM("speech_ratio") float f, @InterfaceC1501120pAM("sing_ratio") float f2, @InterfaceC1501120pAM("music_ratio") float f3, @InterfaceC1501120pAM("video_loudness_list") String str, @InterfaceC1501120pAM("extra_info") String str2, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("zip_uri") String str3, @InterfaceC1501120pAM("zip_scenario") Integer num, @InterfaceC1501120pAM("shoot_way") String str4, @InterfaceC1501120pAM("content_type") String str5, @InterfaceC1501120pAM("content_source") String str6, @InterfaceC1501120pAM("info_sticker_list") String str7, @InterfaceC1501120pAM("mv_id") String str8, @InterfaceC1501120pAM("flash_mob_id") String str9, @InterfaceC1501120pAM("source_text") String str10, @InterfaceC1501120pAM("effect_id") String str11, @InterfaceC1501120pAM("creation_id") String str12, @InterfaceC1501120pAM("video_duration") Long l, @InterfaceC1501120pAM("replace_music_index") Long l2, @InterfaceC1501120pAM("unlimited_only") Boolean bool, @InterfaceC1501120pAM("music_tag") int i3, @InterfaceC1501120pAM("recommend_extra") JSONObject jSONObject);

        @InterfaceC1501200pAU("/aweme/v1/commerce/music/list/")
        C15O7<MusicList> LJIIIZ(@InterfaceC1501120pAM("mc_id") String str, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("ai_recommend") int i3);

        @InterfaceC1501200pAU("/aweme/v1/music/recommend/by/video/")
        C15O7<MusicList> LJIIJ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("from") String str, @InterfaceC1501120pAM("from_page") String str2, @InterfaceC1501120pAM("zip_uri") String str3, @InterfaceC1501120pAM("music_ailab_ab") String str4, @InterfaceC1501120pAM("micro_app_id") String str5, @InterfaceC1501120pAM("music_id") String str6, @InterfaceC1501120pAM("is_fetching_similar_songs") Integer num, @InterfaceC1501120pAM("zip_scenario") Integer num2, @InterfaceC1501120pAM("is_ba_replace") int i3, @InterfaceC1501120pAM("shoot_way") String str7, @InterfaceC1501120pAM("content_type") String str8, @InterfaceC1501120pAM("content_source") String str9, @InterfaceC1501120pAM("info_sticker_list") String str10, @InterfaceC1501120pAM("mv_id") String str11, @InterfaceC1501120pAM("flash_mob_id") String str12, @InterfaceC1501120pAM("source_text") String str13, @InterfaceC1501120pAM("effect_id") String str14, @InterfaceC1501120pAM("creation_id") String str15, @InterfaceC1501120pAM("video_duration") Long l, @InterfaceC1501120pAM("ec_biz_scene") String str16, @InterfaceC1501120pAM("first_music_id") Long l2, @InterfaceC1501120pAM("replace_music_index") Long l3, @InterfaceC1501120pAM("unlimited_only") Boolean bool, @InterfaceC1501120pAM("music_tag") int i4, @InterfaceC1501120pAM("recommend_extra") JSONObject jSONObject, @InterfaceC1501120pAM("stripped_metasong_id") String str17, @InterfaceC1501120pAM("item_id") String str18, @InterfaceC1501120pAM("pinned_music_id") String str19);

        @InterfaceC1501200pAU("/aweme/v1/music/collection/")
        C15O7<MusicCollection> LJIIJJI(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("sound_page_scene") int i3, @InterfaceC1501120pAM("collection_type") int i4);

        @InterfaceC1501200pAU("aweme/v1/commerce/music/hot/recommend/")
        C15O7<MusicList> LJIIL(@InterfaceC1501120pAM("song_id") String str, @InterfaceC1501120pAM("item_id") String str2);

        @InterfaceC1501200pAU("/tiktok/v1/smart/sound/trim/")
        C15O7<TrimPointResponse> LJIILIIL(@InterfaceC1501120pAM("music_id") String str, @InterfaceC1501120pAM("video_duration") int i, @InterfaceC1501120pAM("music_duration") int i2);

        @InterfaceC1501200pAU("/aweme/v1/hot/music/")
        C15O7<MusicList> LJIILJJIL(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("not_duplicate") boolean z, @InterfaceC1501120pAM("sound_page_scene") int i3, @InterfaceC1501120pAM("is_commercial_sound_page") int i4, @InterfaceC1501120pAM("music_recommend_refer") int i5, @InterfaceC1501120pAM("shoot_way") String str, @InterfaceC1501120pAM("content_type") String str2, @InterfaceC1501120pAM("content_source") String str3, @InterfaceC1501120pAM("info_sticker_list") String str4, @InterfaceC1501120pAM("mv_id") String str5, @InterfaceC1501120pAM("flash_mob_id") String str6, @InterfaceC1501120pAM("source_text") String str7, @InterfaceC1501120pAM("effect_id") String str8, @InterfaceC1501120pAM("creation_id") String str9, @InterfaceC1501120pAM("video_duration") Long l, @InterfaceC1501120pAM("unlimited_only") Boolean bool, @InterfaceC1501120pAM("pinned_music_id") String str10);

        @InterfaceC1501200pAU("/aweme/v1/music/list/")
        C15O7<MusicList> LJIILL(@InterfaceC1501120pAM("mc_id") String str, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("sound_page_scene") int i3);

        @InterfaceC1501200pAU("/tiktok/v1/creative/user/feature/")
        C15O7<String> LJIILLIIL(@InterfaceC1501120pAM("need_is_cc_creator") Boolean bool, @InterfaceC1501120pAM("need_is_target_ba_user") Boolean bool2);

        @InterfaceC1501200pAU("/tiktok/v1/recommend/search/queries/")
        C15O7<SuggestedQueryList> LJIIZILJ(@InterfaceC1501120pAM("video_uri") String str);

        @C092G
        @InterfaceC1501170pAR("/aweme/v1/music/recommend/by/video2/")
        C15O7<MusicList> getRecommendMusicListFromAIWithFrame(@InterfaceC1501030pAD("cursor") TypedString typedString, @InterfaceC1501030pAD("count") TypedString typedString2, @InterfaceC1501030pAD("from") TypedString typedString3, @InterfaceC1501030pAD("from_page") TypedString typedString4, @InterfaceC1501030pAD("zip_uri") TypedString typedString5, @InterfaceC1501030pAD("music_ailab_ab") TypedString typedString6, @InterfaceC1501030pAD("micro_app_id") TypedString typedString7, @InterfaceC1501030pAD("music_id") TypedString typedString8, @InterfaceC1501030pAD("is_fetching_similar_songs") TypedString typedString9, @InterfaceC1501030pAD("zip_scenario") TypedString typedString10, @InterfaceC1501030pAD("is_ba_replace") TypedString typedString11, @InterfaceC1501030pAD("shoot_way") TypedString typedString12, @InterfaceC1501030pAD("content_type") TypedString typedString13, @InterfaceC1501030pAD("content_source") TypedString typedString14, @InterfaceC1501030pAD("info_sticker_list") TypedString typedString15, @InterfaceC1501030pAD("mv_id") TypedString typedString16, @InterfaceC1501030pAD("flash_mob_id") TypedString typedString17, @InterfaceC1501030pAD("source_text") TypedString typedString18, @InterfaceC1501030pAD("effect_id") TypedString typedString19, @InterfaceC1501030pAD("creation_id") TypedString typedString20, @InterfaceC1501030pAD("video_duration") TypedString typedString21, @InterfaceC1501030pAD("ec_biz_scene") TypedString typedString22, @InterfaceC1501030pAD("first_music_id") TypedString typedString23, @InterfaceC1501030pAD("replace_music_index") TypedString typedString24, @InterfaceC1501030pAD("unlimited_only") TypedString typedString25, @InterfaceC1501030pAD("music_tag") TypedString typedString26, @InterfaceC1501030pAD("recommend_extra") TypedString typedString27, @InterfaceC1501030pAD("stripped_metasong_id") TypedString typedString28, @InterfaceC1501030pAD("item_id") TypedString typedString29, @InterfaceC1501030pAD("pinned_music_id") TypedString typedString30, @InterfaceC1501030pAD("frame_file_byte") TypedByteArray typedByteArray);

        @InterfaceC1501240pAY("/aweme/v1/music/pick/")
        @InterfaceC1485505rh
        @InterfaceC1501320pAg(3)
        @InterfaceC1501290pAd(4)
        C15O7<MusicPickResponse> postMusicPickWithHighPriority(@InterfaceC1501100pAK("radio_cursor") Integer num, @InterfaceC1501100pAK("radio_count") Integer num2, @InterfaceC1501100pAK("extra_music_ids") String str, @InterfaceC1501100pAK("is_commerce_music") Boolean bool, @InterfaceC1501100pAK("sound_page_scene") Integer num3, @InterfaceC1501100pAK("zip_uri") String str2, @InterfaceC1501100pAK("music_consumption") String str3, @InterfaceC1501100pAK("shoot_way") String str4, @InterfaceC1501100pAK("content_type") String str5, @InterfaceC1501100pAK("content_source") String str6, @InterfaceC1501100pAK("info_sticker_list") String str7, @InterfaceC1501100pAK("mv_id") String str8, @InterfaceC1501100pAK("flash_mob_id") String str9, @InterfaceC1501100pAK("source_text") String str10, @InterfaceC1501100pAK("effect_id") String str11, @InterfaceC1501100pAK("creation_id") String str12, @InterfaceC1501100pAK("video_duration") Long l, @InterfaceC1501100pAK("first_music_id") Long l2, @InterfaceC1501100pAK("replace_music_index") Long l3, @InterfaceC1501100pAK("unlimited_only") Boolean bool2, @InterfaceC1501100pAK("recommend_extra") JSONObject jSONObject);
    }

    static {
        if (AnonymousClass1546.LIZ()) {
            int appVersionCode = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode();
            long jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 100L, "creative_tool_collect_music_cache_disk_size", true);
            long jLJIJJLI2 = C0C64.LJIILLIIL().LJIJJLI(31744, 200L, "creative_tool_collect_music_cache_in_memory_limit", true);
            C844470XAv.LIZ.getClass();
            LIZIZ = new C20017613Ty(appVersionCode, jLJIJJLI, jLJIJJLI2, C844470XAv.LIZ());
        }
    }

    public static String LIZ() {
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi(ICommerceMediaService.class);
        return iCommerceMediaService != null ? iCommerceMediaService.LJIJJLI() : "";
    }

    public static boolean LIZJ() {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIILLIIL();
    }

    public static boolean LIZLLL() {
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
            return true;
        }
        C15MA c15ma = C15MA.LL;
        return C15MA.LIZLLL();
    }

    public static C15O7<MusicCollectionFeedResponse> LJ(Integer num, Integer num2, int i) {
        boolean zLJI = MethodIDManager.LJI(202185);
        if (LIZLLL()) {
            C15O7<MusicCollectionFeedResponse> c15o7LIZ = LIZ.LIZ(num, num2);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c15o7LIZ;
        }
        C15O7<MusicCollectionFeedResponse> c15o7LIZIZ = LIZ.LIZIZ(num, num2, i);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c15o7LIZIZ;
    }

    public static C15O7 LJIIIIZZ(int i, int i2, String str) {
        boolean zLJI = MethodIDManager.LJI(137736);
        if (!LIZLLL() && !LIZJ()) {
            C15O7<CollectedMusicList> c15o7LJFF = LIZ.LJFF(i, 20, "", i2, "", null, str, Boolean.FALSE, null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c15o7LJFF;
        }
        C15O7<CollectedMusicList> c15o7LJFF2 = LIZ.LJFF(i, 20, "commerce", i2, LIZ(), null, str, Boolean.FALSE, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c15o7LJFF2;
    }

    public static C15O7<MusicCollection> LIZIZ(int i, int i2, int i3, int i4) {
        if (LIZLLL()) {
            return LIZ.LIZLLL(i, i2);
        }
        return LIZ.LJIIJJI(i, i2, i3, i4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C15O7 LJFF(int i, int i2, int i3, int i4, String str) {
        if (LIZLLL()) {
            API api = LIZ;
            C15MA.LL.getClass();
            return api.LJIIIZ(str, i, i2, C15MA.LIZJ() ? 1 : 0);
        }
        if (i3 == 0) {
            return LIZ.LJIILL(str, i, i2, i4);
        }
        return LIZ.LJII(str, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x028a A[Catch: InterruptedException -> 0x02d2, Exception -> 0x02e9, TryCatch #2 {InterruptedException -> 0x02d2, Exception -> 0x02e9, blocks: (B:73:0x028a, B:75:0x0299, B:77:0x029f, B:79:0x02a5, B:80:0x02a9, B:81:0x02b2, B:83:0x02b8, B:84:0x02bb, B:85:0x02c9, B:26:0x00f3, B:28:0x00f7, B:30:0x0101, B:32:0x014e, B:34:0x0152, B:35:0x016e, B:37:0x017d, B:39:0x0183, B:41:0x01a7, B:42:0x01ac, B:43:0x01b6, B:45:0x01bc, B:46:0x01bf, B:47:0x01ce, B:48:0x01d7, B:50:0x01db, B:51:0x01f8, B:53:0x0207, B:55:0x020d, B:57:0x0213, B:59:0x021e, B:63:0x0227, B:64:0x0248, B:66:0x025b, B:67:0x0260, B:68:0x026a, B:70:0x0270, B:71:0x0273, B:72:0x0281), top: B:106:0x00f3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C15O7 LJII(final int r25, final int r26, final int r27, final java.lang.Boolean r28, final java.lang.String r29, final java.lang.String r30, final java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi.LJII(int, int, int, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):X.15O7");
    }

    public static C15O7<MusicPickResponse> LJI(Integer num, Integer num2, String str, boolean z, int i, String str2, String str3, IMusicRequestParam iMusicRequestParam) {
        boolean zLJI = MethodIDManager.LJI(137220);
        if (LIZLLL()) {
            C15O7<MusicPickResponse> c15o7LJI = LIZ.LJI(num, str, Boolean.valueOf(z), iMusicRequestParam.getCreationId());
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c15o7LJI;
        }
        JSONObject jSONObject = IMusicRequestParamKt.toJSONObject(iMusicRequestParam.getRecommendExtra(), null);
        if (C305420By8.LIZ) {
            C15O7<MusicPickResponse> c15o7PostMusicPickWithHighPriority = LIZ.postMusicPickWithHighPriority(num, num2, str, Boolean.valueOf(z), Integer.valueOf(i), str2, str3, iMusicRequestParam.getShootWay(), iMusicRequestParam.getContentType(), iMusicRequestParam.getContentSource(), iMusicRequestParam.getInfoStickerList(), iMusicRequestParam.getMvId(), iMusicRequestParam.getChallengeId(), iMusicRequestParam.getTextContent(), iMusicRequestParam.getEffectId(), iMusicRequestParam.getCreationId(), Long.valueOf(iMusicRequestParam.getVideoDuration()), iMusicRequestParam.getFirstMusicId(), iMusicRequestParam.getReplaceMusicIndex(), Boolean.valueOf(iMusicRequestParam.getUnlimitedOnly()), jSONObject);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c15o7PostMusicPickWithHighPriority;
        }
        C15O7<MusicPickResponse> c15o7LIZJ = LIZ.LIZJ(num, num2, str, Boolean.valueOf(z), Integer.valueOf(i), str2, str3, iMusicRequestParam.getShootWay(), iMusicRequestParam.getContentType(), iMusicRequestParam.getContentSource(), iMusicRequestParam.getInfoStickerList(), iMusicRequestParam.getMvId(), iMusicRequestParam.getChallengeId(), iMusicRequestParam.getTextContent(), iMusicRequestParam.getEffectId(), iMusicRequestParam.getCreationId(), Long.valueOf(iMusicRequestParam.getVideoDuration()), iMusicRequestParam.getFirstMusicId(), iMusicRequestParam.getReplaceMusicIndex(), Boolean.valueOf(iMusicRequestParam.getUnlimitedOnly()), jSONObject);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c15o7LIZJ;
    }
}
