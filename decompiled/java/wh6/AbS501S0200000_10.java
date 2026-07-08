package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0BQ8;
import X.C0PCY;
import X.C0PRC;
import X.C0Q0I;
import X.C0Q0J;
import X.C0QCA;
import X.C0QCC;
import X.C0R4A;
import X.C1390850mIV;
import X.C13DV;
import X.C1558520qew;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1697820uHc;
import X.C20684815ws;
import X.C444200HbO;
import X.C646370PWx;
import X.C652430PiT;
import X.C657980PrQ;
import X.C658000PrS;
import X.C661470Px3;
import X.C661490Px5;
import X.C665230Q7l;
import X.C683220Qr2;
import X.EnumC055400Ie;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.SearchTop1CardToolbarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoSugAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleMarkdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovMarkdownAbility;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.tabs.generaltab.ability.IVisualSearchAutoPlayAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class AbS501S0200000_10 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS501S0200000_10 abS501S0200000_10, View view) {
        Function1<? super View, Unit> function1;
        Function0<C683220Qr2> function0;
        Function1<? super View, Unit> function12;
        Function0<C683220Qr2> function02;
        Function1<? super View, Boolean> function13;
        if (view != null) {
            C665230Q7l c665230Q7lSp = ((SearchTop1CardToolbarAssem) abS501S0200000_10.l0).sp();
            if (c665230Q7lSp != null && (function13 = c665230Q7lSp.LLILZIL) != null && !function13.invoke(view).booleanValue()) {
                return;
            }
            if (C0BQ8.LIZ()) {
                SearchTop1CardToolbarAssem searchTop1CardToolbarAssem = (SearchTop1CardToolbarAssem) abS501S0200000_10.l0;
                FragmentManager fragmentManager = (FragmentManager) abS501S0200000_10.l1;
                searchTop1CardToolbarAssem.getClass();
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                C665230Q7l c665230Q7lSp2 = searchTop1CardToolbarAssem.sp();
                if (c665230Q7lSp2 != null && (function02 = c665230Q7lSp2.LLILLJJLI) != null && function02.invoke() != null) {
                    c13dvLIZIZ.add(new C0QCC(R.raw.icon_pen_on_doc, 2131835471, new AwS589S0100000_10(searchTop1CardToolbarAssem, 456)));
                    C665230Q7l c665230Q7lSp3 = searchTop1CardToolbarAssem.sp();
                    if (c665230Q7lSp3 != null && c665230Q7lSp3.LLIZLLLIL != null) {
                        c13dvLIZIZ.add(new C0QCC(R.raw.icon_exclamation_mark_circle, 2131844801, new AwS589S0100000_10(searchTop1CardToolbarAssem, 457)));
                    }
                }
                List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                C0QCA c0qca = C0QCA.LIZ;
                AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(searchTop1CardToolbarAssem, 1013);
                AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(searchTop1CardToolbarAssem, 455);
                c0qca.getClass();
                C0QCA.LIZ(fragmentManager, listLIZ, awS554S0100000_10, null, awS589S0100000_10);
                C665230Q7l c665230Q7lSp4 = searchTop1CardToolbarAssem.sp();
                if (c665230Q7lSp4 == null || (function12 = c665230Q7lSp4.LLIZ) == null) {
                    return;
                }
                function12.invoke(searchTop1CardToolbarAssem.LLJJLIIIJLLLLLLLZ);
                return;
            }
            SearchTop1CardToolbarAssem searchTop1CardToolbarAssem2 = (SearchTop1CardToolbarAssem) abS501S0200000_10.l0;
            ((ArrayList) searchTop1CardToolbarAssem2.LLJLL).clear();
            C665230Q7l c665230Q7lSp5 = searchTop1CardToolbarAssem2.sp();
            if (c665230Q7lSp5 != null && (function0 = c665230Q7lSp5.LLILLJJLI) != null && function0.invoke() != null) {
                ((ArrayList) searchTop1CardToolbarAssem2.LLJLL).add(searchTop1CardToolbarAssem2.LLJLLIL.getValue());
            }
            C665230Q7l c665230Q7lSp6 = searchTop1CardToolbarAssem2.sp();
            if (c665230Q7lSp6 != null && c665230Q7lSp6.LLIZLLLIL != null) {
                ((ArrayList) searchTop1CardToolbarAssem2.LLJLL).add(searchTop1CardToolbarAssem2.LLJLLL.getValue());
            }
            ((C658000PrS) ((SearchTop1CardToolbarAssem) abS501S0200000_10.l0).LLJZ.getValue()).LIZJ(true);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJFF(((SearchTop1CardToolbarAssem) abS501S0200000_10.l0).LLJLL);
            c1390850mIV.LIZ.LLILLJJLI = new C0R4A((SearchTop1CardToolbarAssem) abS501S0200000_10.l0, 3);
            c1390850mIV.LIZJ().show((FragmentManager) abS501S0200000_10.l1, "SearchTop1ToolbarPanel");
            C665230Q7l c665230Q7lSp7 = ((SearchTop1CardToolbarAssem) abS501S0200000_10.l0).sp();
            if (c665230Q7lSp7 == null || (function1 = c665230Q7lSp7.LLIZ) == null) {
                return;
            }
            function1.invoke(((SearchTop1CardToolbarAssem) abS501S0200000_10.l0).LLJJLIIIJLLLLLLLZ);
        }
    }

    public static final void LIZ$1(AbS501S0200000_10 abS501S0200000_10, View view) {
        Object objLIZIZ;
        if (view != null) {
            ISearchPovMarkdownAbility iSearchPovMarkdownAbility = (ISearchPovMarkdownAbility) abS501S0200000_10.l0;
            Map<String, Object> mapUp = ((Top1NimbleMarkdownAssem) abS501S0200000_10.l1).up();
            Integer num = null;
            if (mapUp != null) {
                objLIZIZ = C444200HbO.LIZIZ("multi_summary_index", mapUp);
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof Integer) {
                num = (Integer) objLIZIZ;
            }
            iSearchPovMarkdownAbility.be2(num, "click_words", null);
        }
    }

    public static final void LIZ$2(AbS501S0200000_10 abS501S0200000_10, View view) {
        Function1<? super View, Unit> function1;
        Function0<C683220Qr2> function0;
        Function1<? super View, Unit> function12;
        Function0<C683220Qr2> function02;
        Function1<? super View, Boolean> function13;
        if (view != null) {
            C657980PrQ c657980PrQSp = ((SearchTop1CardLabelAssem) abS501S0200000_10.l0).sp();
            if (c657980PrQSp != null && (function13 = c657980PrQSp.LLJJ) != null && !function13.invoke(view).booleanValue()) {
                return;
            }
            IVisualSearchAutoPlayAbility iVisualSearchAutoPlayAbility = (IVisualSearchAutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchTop1CardLabelAssem) abS501S0200000_10.l0), IVisualSearchAutoPlayAbility.class, null);
            if (iVisualSearchAutoPlayAbility != null) {
                iVisualSearchAutoPlayAbility.Gy2(EnumC055400Ie.OPEN_FEEDBACK);
            }
            if (C0BQ8.LIZ()) {
                SearchTop1CardLabelAssem searchTop1CardLabelAssem = (SearchTop1CardLabelAssem) abS501S0200000_10.l0;
                FragmentManager fragmentManager = (FragmentManager) abS501S0200000_10.l1;
                searchTop1CardLabelAssem.getClass();
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                C657980PrQ c657980PrQSp2 = searchTop1CardLabelAssem.sp();
                if (c657980PrQSp2 != null && (function02 = c657980PrQSp2.LLIZ) != null && function02.invoke() != null) {
                    c13dvLIZIZ.add(new C0QCC(R.raw.icon_pen_on_doc, 2131835471, new AwS589S0100000_10(searchTop1CardLabelAssem, 630)));
                    C657980PrQ c657980PrQSp3 = searchTop1CardLabelAssem.sp();
                    if (c657980PrQSp3 != null && c657980PrQSp3.LLJ != null) {
                        c13dvLIZIZ.add(new C0QCC(R.raw.icon_exclamation_mark_circle, 2131844801, new AwS589S0100000_10(searchTop1CardLabelAssem, 631)));
                    }
                }
                List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                C0QCA c0qca = C0QCA.LIZ;
                AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(searchTop1CardLabelAssem, 1276);
                AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(searchTop1CardLabelAssem, 629);
                c0qca.getClass();
                C0QCA.LIZ(fragmentManager, listLIZ, awS554S0100000_10, null, awS589S0100000_10);
                C657980PrQ c657980PrQSp4 = searchTop1CardLabelAssem.sp();
                if (c657980PrQSp4 == null || (function12 = c657980PrQSp4.LLJIJIL) == null) {
                    return;
                }
                function12.invoke(searchTop1CardLabelAssem.LLL);
                return;
            }
            SearchTop1CardLabelAssem searchTop1CardLabelAssem2 = (SearchTop1CardLabelAssem) abS501S0200000_10.l0;
            ((ArrayList) searchTop1CardLabelAssem2.LLLFFI).clear();
            C657980PrQ c657980PrQSp5 = searchTop1CardLabelAssem2.sp();
            if (c657980PrQSp5 != null && (function0 = c657980PrQSp5.LLIZ) != null && function0.invoke() != null) {
                ((ArrayList) searchTop1CardLabelAssem2.LLLFFI).add(searchTop1CardLabelAssem2.LLLFZ.getValue());
            }
            C657980PrQ c657980PrQSp6 = searchTop1CardLabelAssem2.sp();
            if (c657980PrQSp6 != null && c657980PrQSp6.LLJ != null) {
                ((ArrayList) searchTop1CardLabelAssem2.LLLFFI).add(searchTop1CardLabelAssem2.LLLI.getValue());
            }
            ((SearchTop1CardLabelAssem) abS501S0200000_10.l0).tp().LIZJ(true);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJFF(((SearchTop1CardLabelAssem) abS501S0200000_10.l0).LLLFFI);
            c1390850mIV.LIZ.LLILLJJLI = new C0R4A((SearchTop1CardLabelAssem) abS501S0200000_10.l0, 9);
            c1390850mIV.LIZJ().show((FragmentManager) abS501S0200000_10.l1, "SearchTop1ToolbarPanel");
            C657980PrQ c657980PrQSp7 = ((SearchTop1CardLabelAssem) abS501S0200000_10.l0).sp();
            if (c657980PrQSp7 == null || (function1 = c657980PrQSp7.LLJIJIL) == null) {
                return;
            }
            function1.invoke(((SearchTop1CardLabelAssem) abS501S0200000_10.l0).LLL);
        }
    }

    public static final void LIZ$3(AbS501S0200000_10 abS501S0200000_10, View view) {
        if (view != null) {
            SearchTakoCardAbility searchTakoCardAbility = (SearchTakoCardAbility) ((SearchTakoSugAssem) abS501S0200000_10.l0).LLJJLIIIJLLLLLLLZ.getValue();
            if (searchTakoCardAbility != null) {
                searchTakoCardAbility.O51((C0Q0I) abS501S0200000_10.l1);
            }
            SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility = (SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility) ((SearchTakoSugAssem) abS501S0200000_10.l0).LLJL.getValue();
            if (searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility != null) {
                C0Q0J c0q0j = ((C0Q0I) abS501S0200000_10.l1).LL;
                searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility.ST0(c0q0j.LL, c0q0j.LLILLJJLI, c0q0j.LLILLL);
            }
        }
    }

    public static final void LIZ$4(AbS501S0200000_10 abS501S0200000_10, View view) {
        C646370PWx c646370PWx;
        String str;
        C0PCY<C646370PWx> c0pcyWO2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (view != null) {
            C661490Px5 dataProvider = ((C661470Px3) ((SearchTakoVideoRootAssem) abS501S0200000_10.l0).LLJLIL.getValue()).getDataProvider();
            C1606420ruC c1606420ruCLIZJ = C1607950rwf.LIZJ(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
            SearchTakoCardAbility searchTakoCardAbility = (SearchTakoCardAbility) ((SearchTakoVideoRootAssem) abS501S0200000_10.l0).LLJJLIIIJLLLLLLLZ.getValue();
            if (searchTakoCardAbility != null) {
                searchTakoCardAbility.R21((C652430PiT) abS501S0200000_10.l1, dataProvider, c1606420ruCLIZJ);
            }
            Integer num = null;
            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchTakoVideoRootAssem) abS501S0200000_10.l0), SearchServiceCenter$MobAbility.class, null);
            if (searchServiceCenter$MobAbility != null) {
                searchServiceCenter$MobAbility.Nj1((C652430PiT) abS501S0200000_10.l1);
            }
            HashMap<String, String> mapLIZ = ((C652430PiT) abS501S0200000_10.l1).LLILZ.LIZ();
            String groupId = ((C652430PiT) abS501S0200000_10.l1).LLILLJJLI.getGroupId();
            String str2 = "";
            if (groupId == null) {
                groupId = "";
            }
            mapLIZ.put("group_id", groupId);
            String authorUid = AwemeExtKt.getAuthorUid(((C652430PiT) abS501S0200000_10.l1).LLILLJJLI);
            if (authorUid == null) {
                authorUid = "";
            }
            mapLIZ.put("author_id", authorUid);
            String str3 = ((C652430PiT) abS501S0200000_10.l1).LLILLL;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLIZ.put("is_page", str3);
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) ((SearchTakoVideoRootAssem) abS501S0200000_10.l0).LLJL.getValue();
            if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                mapLIZ.put("search_id", c0prc.LLILLL);
                mapLIZ.put("search_keyword", c0prc.LLIZLLLIL);
            }
            ISearchContextAbility iSearchContextAbility2 = (ISearchContextAbility) ((SearchTakoVideoRootAssem) abS501S0200000_10.l0).LLJL.getValue();
            if (iSearchContextAbility2 != null && (c0pcyWO2 = iSearchContextAbility2.wO2()) != null) {
                c646370PWx = (C646370PWx) c0pcyWO2.LIZJ();
            } else {
                c646370PWx = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mapLIZ);
            if (c646370PWx != null) {
                num = c646370PWx.LLJILJIL;
            }
            linkedHashMap.put("universal_rank", String.valueOf(num));
            if (c646370PWx != null && (str = c646370PWx.LLJILJILJ) != null) {
                str2 = str;
            }
            linkedHashMap.put("insert_type", str2);
            C20684815ws.LJIILLIIL("feed_enter", linkedHashMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS501S0200000_10(SearchTakoSugAssem searchTakoSugAssem, C0Q0I c0q0i, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = searchTakoSugAssem;
        this.l1 = c0q0i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS501S0200000_10(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
