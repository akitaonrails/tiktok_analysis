package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C07CQ;
import X.C0PRC;
import X.C0PYV;
import X.C0Q7F;
import X.C1323690kYB;
import X.C14TF;
import X.C1558520qew;
import X.C19EG;
import X.C309390CAv;
import X.C644560PPy;
import X.C646370PWx;
import X.C663020PzY;
import X.C665130Q7b;
import X.C665660Q9c;
import X.C724240Sb0;
import X.EnumC663040Pza;
import X.InterfaceC1870830ymf;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.ui.SearchStatusViewAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.ailivephoto.SearchAILivePhotoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot.SearchTakoNewBotCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot.SearchTakoNewBotLandingPageData;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes11.dex */
public class AkS55S0200000_10 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS55S0200000_10 akS55S0200000_10, View view) {
        SearchAILivePhotoCardAssem searchAILivePhotoCardAssem = (SearchAILivePhotoCardAssem) akS55S0200000_10.l0;
        searchAILivePhotoCardAssem.getClass();
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(searchAILivePhotoCardAssem, 310);
        C19EG c19egLIZ = C724240Sb0.LIZ(searchAILivePhotoCardAssem);
        if (c19egLIZ != null) {
            awS600S0100000_21.invoke(c19egLIZ);
        }
        ((C663020PzY) akS55S0200000_10.l1).LLILLJJLI = EnumC663040Pza.CLICK_TOOL;
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchAILivePhotoCardAssem) akS55S0200000_10.l0), SearchServiceCenter$MobAbility.class, null);
        if (searchServiceCenter$MobAbility != null) {
            searchServiceCenter$MobAbility.Nj1((C663020PzY) akS55S0200000_10.l1);
        }
    }

    public static final void LIZ$1(AkS55S0200000_10 akS55S0200000_10, View view) {
        SearchAILivePhotoCardAssem searchAILivePhotoCardAssem = (SearchAILivePhotoCardAssem) akS55S0200000_10.l0;
        searchAILivePhotoCardAssem.getClass();
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(searchAILivePhotoCardAssem, 310);
        C19EG c19egLIZ = C724240Sb0.LIZ(searchAILivePhotoCardAssem);
        if (c19egLIZ != null) {
            awS600S0100000_21.invoke(c19egLIZ);
        }
        ((C663020PzY) akS55S0200000_10.l1).LLILLJJLI = EnumC663040Pza.CLICK_SHOOT;
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchAILivePhotoCardAssem) akS55S0200000_10.l0), SearchServiceCenter$MobAbility.class, null);
        if (searchServiceCenter$MobAbility != null) {
            searchServiceCenter$MobAbility.Nj1((C663020PzY) akS55S0200000_10.l1);
        }
    }

    public static final void LIZ$2(AkS55S0200000_10 akS55S0200000_10, View view) {
        String richMessage;
        Map<String, String> linkedHashMap;
        TakoInfo bot;
        String landingPageSchema;
        TakoInfo bot2;
        TakoInfo bot3;
        TakoInfo bot4;
        String string;
        TakoInfo bot5;
        TakoSearchCarryInItem takoSearchCarryInItemLIZ;
        Integer num;
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility;
        C0PYV c0pyv = ((SearchTakoNewBotCardAssem) akS55S0200000_10.l0).LLJLIL;
        if (c0pyv != null) {
            SearchTakoNewBotCardAssem searchTakoNewBotCardAssem = (SearchTakoNewBotCardAssem) akS55S0200000_10.l0;
            C0PYV c0pyv2 = searchTakoNewBotCardAssem.LLJLIL;
            String landingPageHint = null;
            if (c0pyv2 != null && (searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchTakoNewBotCardAssem), SearchServiceCenter$MobAbility.class, null)) != null) {
                searchServiceCenter$MobAbility.Nj1(c0pyv2);
            }
            SearchTakoNewBotCardAssem searchTakoNewBotCardAssem2 = (SearchTakoNewBotCardAssem) akS55S0200000_10.l0;
            if (searchTakoNewBotCardAssem2.LLJLLIL) {
                Context context = ((View) akS55S0200000_10.l1).getContext();
                C0PRC c0prcOp = searchTakoNewBotCardAssem2.op();
                if (c0prcOp != null) {
                    C646370PWx c646370PWxSp = searchTakoNewBotCardAssem2.sp();
                    if (c646370PWxSp == null || (num = c646370PWxSp.LLJILJIL) == null || (string = num.toString()) == null) {
                        string = CardStruct.IStatusCode.DEFAULT;
                    }
                    SearchMixFeed searchMixFeed = c0pyv.LL;
                    if (searchMixFeed != null && (bot5 = searchMixFeed.getBot()) != null && (takoSearchCarryInItemLIZ = C0Q7F.LIZ(bot5)) != null) {
                        C14TF c14tf = C14TF.LIZIZ;
                        C665130Q7b.LIZ(c14tf, context, c14tf.LJJJLIIL(), "click_tako_brand_card", System.currentTimeMillis(), c0prcOp.LLILLL, c0prcOp.LLIZLLLIL, null, null, null, takoSearchCarryInItemLIZ.text, null, null, null, null, null, takoSearchCarryInItemLIZ.placeholderSources, null, takoSearchCarryInItemLIZ.eventTracker, C644560PPy.LJIILLIIL(c0prcOp.LL), null, null, null, null, string, null, null, null, null, -18092096, 2015);
                        if (C07CQ.LIZ()) {
                            c14tf.LJJJLL().mobTikbotEntranceClick(c14tf.LJJJLIIL(), "tako_brand_card", null, null, null, null, null, null, null, null, null, null, null, null, c0prcOp.LLILLL, null, null, null, null, null, null, null, null, null, null, string, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Context context2 = ((View) akS55S0200000_10.l1).getContext();
            try {
                InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(context2);
                SearchMixFeed searchMixFeed2 = c0pyv.LL;
                if (searchMixFeed2 != null && (bot4 = searchMixFeed2.getBot()) != null) {
                    richMessage = bot4.getRichMessage();
                } else {
                    richMessage = null;
                }
                SearchMixFeed searchMixFeed3 = c0pyv.LL;
                if (searchMixFeed3 != null && (bot3 = searchMixFeed3.getBot()) != null) {
                    landingPageHint = bot3.getLandingPageHint();
                }
                SearchMixFeed searchMixFeed4 = c0pyv.LL;
                if (searchMixFeed4 == null || (bot2 = searchMixFeed4.getBot()) == null || (linkedHashMap = bot2.getPlaceholderSources()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                interfaceC1870830ymfLIZ.LJIIIIZZ(C309390CAv.LIZIZ(new SearchTakoNewBotLandingPageData(richMessage, landingPageHint, linkedHashMap)), "tako_intervene");
                SearchMixFeed searchMixFeed5 = c0pyv.LL;
                if (searchMixFeed5 == null || (bot = searchMixFeed5.getBot()) == null || (landingPageSchema = bot.getLandingPageSchema()) == null || landingPageSchema.length() <= 0) {
                    return;
                }
                SmartRouter.buildRoute(context2, UriProtector.parse(landingPageSchema).buildUpon().toString()).open();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZ$3(AkS55S0200000_10 akS55S0200000_10, View view) {
        SearchStatusViewAssem searchStatusViewAssem = (SearchStatusViewAssem) akS55S0200000_10.l0;
        C665660Q9c c665660Q9c = (C665660Q9c) akS55S0200000_10.l1;
        searchStatusViewAssem.getClass();
        Function0<Unit> function0 = c665660Q9c.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        searchStatusViewAssem.Ho();
        searchStatusViewAssem.Go();
    }

    public AkS55S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
