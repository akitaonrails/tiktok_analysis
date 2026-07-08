package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C0PDT;
import X.C0PFS;
import X.C0PRC;
import X.C0Q00;
import X.C0Q3E;
import X.C0QER;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1ER1;
import X.C301500Bro;
import X.C486180J4u;
import X.C643380PLk;
import X.C643400PLm;
import X.C663370Q0h;
import X.InterfaceC594520NTm;
import X.InterfaceC645880PVa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TopMixNavigateAbilityImpl implements SearchServiceCenter$NavigateAbility {
    public final Fragment LL;
    public final C0PDT LLILLJJLI;
    public final Function1<Aweme, Unit> LLILLL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final boolean zT1() {
        return C301500Bro.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void Zx0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme) {
        InterfaceC594520NTm interfaceC594520NTmCB2;
        SearchMixFeed searchMixFeed;
        this.LLILLL.invoke(aweme);
        C643380PLk c643380PLk = C643380PLk.LIZ;
        ISearchCardProtocol<InterfaceC594520NTm> protocol = ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).getProtocol();
        Fragment fragment = this.LL;
        C0PDT c0pdt = this.LLILLJJLI;
        C643400PLm c643400PLm = new C643400PLm(((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).k4().itemView, aweme, null, C0PFS.LIZ(interfaceC665370Q7z), null, false, false, 0, null, null, null, 0, null, null, null, null, 262132);
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$MobAbility.class);
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null) {
            interfaceC594520NTmCB2 = searchServiceCenter$CardCommonAbility.cB2();
        } else {
            interfaceC594520NTmCB2 = null;
        }
        if (interfaceC594520NTmCB2 instanceof SearchMixFeed) {
            searchMixFeed = (SearchMixFeed) interfaceC594520NTmCB2;
        } else {
            searchMixFeed = null;
        }
        c643380PLk.getClass();
        C643380PLk.LIZIZ(protocol, fragment, c0pdt, c643400PLm, searchServiceCenter$MobAbility, searchMixFeed, false);
    }

    public TopMixNavigateAbilityImpl(Fragment fragment, C0PDT c0pdt, AwS589S0100000_10 awS589S0100000_10) {
        this.LL = fragment;
        this.LLILLJJLI = c0pdt;
        this.LLILLL = awS589S0100000_10;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void hk0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, Function1<? super EnterRoomConfig, EnterRoomConfig> function1) {
        User author;
        int i;
        if (!AwemeSaaSExtKt.isLive(aweme) || (author = aweme.getAuthor()) == null) {
            return;
        }
        long jLIZ = C486180J4u.LIZ(author);
        ISearchContextAbility iSearchContextAbilityLJI = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISearchContextAbility.class, null);
        if (iSearchContextAbilityLJI == null) {
            iSearchContextAbilityLJI = C0Q3E.LJI();
        }
        C0Q00 c0q00 = C0Q00.LIZ;
        Context contextRequireContext = this.LL.requireContext();
        ArrayList arrayListLJ = C1697810uHb.LJ(Long.valueOf(jLIZ));
        ArrayList arrayListLJ2 = C1697810uHb.LJ(new RoomInfo(jLIZ, author.getUid()));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str = c0prc.LLILLL;
        logData.search_id = str;
        logData.requestId = str;
        logData.search_keyword = c0prc.LLIZLLLIL;
        logData.search_type = "general";
        logData.list_item_id = String.valueOf(jLIZ);
        enterRoomConfig.mRoomsData.userId = author.getUid();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (author.isAccuratePrivateAccount()) {
            i = 1;
        } else {
            i = 0;
        }
        roomsData.isSecret = i;
        enterRoomConfig.mRoomsData.followStatus = String.valueOf(author.getFollowStatus());
        EnterRoomConfig enterRoomConfigInvoke = function1.invoke(enterRoomConfig);
        c0q00.getClass();
        C0Q00.LIZIZ(jLIZ, contextRequireContext, enterRoomConfigInvoke, "general_search", arrayListLJ, arrayListLJ2);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void ie0(InterfaceC665370Q7z interfaceC665370Q7z, Context context, User user, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", "general_search");
        smartRouteBuildRoute.withParam("previous_page", "general_search");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "general_search");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "general_search");
        smartRouteBuildRoute.withParam("enter_from_request_id", user.getRequestId());
        smartRouteBuildRoute.withParam("extra_previous_page_position", "main_head");
        ISearchContextAbility iSearchContextAbilityLJI = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISearchContextAbility.class, null);
        if (iSearchContextAbilityLJI == null) {
            iSearchContextAbilityLJI = C0Q3E.LJI();
        }
        smartRouteBuildRoute.withParam("enter_method", C663370Q0h.LIZIZ(((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLIZLLLIL));
        smartRouteBuildRoute.withParam("search_request_id", user.getRequestId());
        smartRouteBuildRoute.withParam("sticky_content", CardStruct.IStatusCode.DEFAULT);
        smartRouteBuildRoute.withParam("trackParams", str);
        if (!TextUtils.isEmpty(null)) {
            smartRouteBuildRoute.withParam("from_scene", (String) null);
        }
        C0QER c0qerLJJLJ = C1ER1.LIZIZ.LJJLJ();
        if (c0qerLJJLJ != null && c0qerLJJLJ.getSourcePage() != null) {
            smartRouteBuildRoute.withParam("source_page", c0qerLJJLJ.getSourcePage());
        }
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void GV0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC645880PVa interfaceC645880PVa, boolean z, Map<String, String> map, Product product) {
        InterfaceC594520NTm interfaceC594520NTmCB2;
        SearchMixFeed searchMixFeed;
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$MobAbility.class);
        searchServiceCenter$MobAbility.Nj1(interfaceC645880PVa);
        this.LLILLL.invoke(aweme);
        C643380PLk c643380PLk = C643380PLk.LIZ;
        ISearchCardProtocol<InterfaceC594520NTm> protocol = ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).getProtocol();
        Fragment fragment = this.LL;
        C0PDT c0pdt = this.LLILLJJLI;
        C643400PLm c643400PLm = new C643400PLm(((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).k4().itemView, aweme, null, C0PFS.LIZ(interfaceC665370Q7z), product, false, false, 0, null, null, map, 0, null, null, null, null, 258020);
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null) {
            interfaceC594520NTmCB2 = searchServiceCenter$CardCommonAbility.cB2();
        } else {
            interfaceC594520NTmCB2 = null;
        }
        if (interfaceC594520NTmCB2 instanceof SearchMixFeed) {
            searchMixFeed = (SearchMixFeed) interfaceC594520NTmCB2;
        } else {
            searchMixFeed = null;
        }
        c643380PLk.getClass();
        C643380PLk.LIZIZ(protocol, fragment, c0pdt, c643400PLm, searchServiceCenter$MobAbility, searchMixFeed, z);
    }
}
