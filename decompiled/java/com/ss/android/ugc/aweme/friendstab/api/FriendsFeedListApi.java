package com.ss.android.ugc.aweme.friendstab.api;

import X.C01GW;
import X.C080U;
import X.C09S2;
import X.C0CQT;
import X.C452501pT;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC2661011f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedListApi {
    public static final FriendsFeedApi LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static final C01GW<Boolean> LJ;

    public interface FriendsFeedApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/friend/friend_feed")
        @InterfaceC1501320pAg(3)
        ListenableFuture<FriendsFeedResponse> getFriendsFeedListEnhance(@InterfaceC1501120pAM("friends_tab_preload") int i, @InterfaceC1501120pAM("friends_tab_preload_scene") String str, @InterfaceC1501120pAM("friends_tab_pull_type") int i2, @InterfaceC1501100pAK("is_inhome_top_tab") Integer num, @InterfaceC1501100pAK("is_non_personalized") int i3, @InterfaceC1501100pAK("source") int i4, @InterfaceC1501100pAK("max_count") int i5, @InterfaceC1501100pAK("pull_type") int i6, @InterfaceC1501100pAK("aweme_ids") String str2, @InterfaceC1501100pAK("card_insert") String str3, @InterfaceC1501120pAM("insert_relations") String str4, @InterfaceC1501100pAK("client_read_gids") String str5, @InterfaceC1501100pAK("client_unread_gids") String str6, @InterfaceC1501100pAK("client_read_gids_notification") String str7, @InterfaceC1501100pAK("client_read_gids_all") String str8, @InterfaceC1501100pAK("page_token") String str9, @InterfaceC1501100pAK("preload") Integer num2, @InterfaceC1501100pAK("insert_aweme_asc") boolean z, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC1501120pAM("red_dot_source") String str10, @InterfaceC1501120pAM("drm_security_level") String str11, @InterfaceC1501100pAK("ima_app_status") Long l, @InterfaceC1501100pAK("camera_status") Integer num3, @InterfaceC1501100pAK("ad_personality_mode") Integer num4, @InterfaceC1501100pAK("cmpl_enc") String str12, @InterfaceC1501100pAK("ad_user_agent") String str13, @InterfaceC1501100pAK("resolution") String str14, @InterfaceC1501100pAK("gaid") String str15);
    }

    static {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
        LIZ = (FriendsFeedApi) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(FriendsFeedApi.class) : null);
        LIZIZ = true;
        LIZJ = -1L;
        LIZLLL = -1L;
        LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(151));
    }
}
