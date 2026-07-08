package com.ss.android.ugc.aweme.poi.search.item;

import X.AbstractC2211791BhR;
import X.C1197490hGd;
import X.C1197910hHJ;
import X.C1198630hIT;
import X.C1198850hIp;
import X.C1220000hqw;
import X.C13LE;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C452070Ho5;
import X.C686930Qx1;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.search.eventtrack.IPoiSearchProvider;
import com.ss.android.ugc.aweme.poi.search.eventtrack.event.SearchPoiShowAlEvent;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCellLeft;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchCellLeft extends PowerCell<C1198630hIT> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public final C736950SvV LLILZIL;

    public final PoiSearchVM I5() {
        return (PoiSearchVM) this.LLILZIL.getValue();
    }

    public PoiSearchCellLeft() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(532);
        this.LLILZIL = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(689), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hIe
            public Function0<String> LJ;
            public final int LJFF = 100;
            public final C1198540hIK LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0hIK] */
            {
                this.LJ = new AwS562S0100000_18(this, 2054);
                this.LJI = new InterfaceC2211931Bhf() { // from class: X.0hIK
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v133 */
                    /* JADX WARN: Type inference failed for: r0v134 */
                    /* JADX WARN: Type inference failed for: r0v37 */
                    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
                    /* JADX WARN: Type inference failed for: r0v42 */
                    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
                    @Override // X.InterfaceC2211931Bhf
                    public final void LIZ(View view, String str) {
                        String str2;
                        String str3;
                        int iIntValue;
                        String str4;
                        int i;
                        String str5;
                        int iIntValue2;
                        String str6;
                        PoiData poiData;
                        String str7;
                        ?? LJFF;
                        ?? LJFF2;
                        String str8;
                        PoiData poiData2;
                        String str9;
                        Map<String, String> map;
                        int iHashCode;
                        String str10;
                        C1198610hIR c1198610hIR;
                        Long lValueOf;
                        C1198610hIR c1198610hIR2;
                        C1198610hIR c1198610hIR3;
                        C1198610hIR c1198610hIR4;
                        String str11;
                        Integer numLJIIJJI;
                        PoiData poiData3;
                        C1198610hIR c1198610hIR5;
                        C1198610hIR c1198610hIR6;
                        Integer num;
                        C1198610hIR c1198610hIR7;
                        List listLIZIZ;
                        PoiSearchCellLeft poiSearchCellLeft = this;
                        String str12 = poiSearchCellLeft.I5().LLJJIII;
                        SearchPoiShowAlEvent searchPoiShowAlEvent = new SearchPoiShowAlEvent();
                        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(poiSearchCellLeft);
                        int i2 = 0;
                        if (interfaceC665370Q7zLIZ != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7zLIZ, IPoiSearchProvider.class, false)) != null) {
                            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                            while (it2.hasNext()) {
                                InterfaceC1282004zy param = ((EventParamsProtocol) it2.next()).getParam();
                                if (param != null) {
                                    searchPoiShowAlEvent.LIZ().add(param);
                                }
                            }
                        }
                        C1198630hIT item = poiSearchCellLeft.getItem();
                        Integer num2 = null;
                        if (item != null && (c1198610hIR7 = item.LLILZ) != null) {
                            str2 = c1198610hIR7.LIZJ;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && str2.length() != 0) {
                            str3 = "search_poi";
                        } else {
                            str3 = "default_search_poi";
                        }
                        searchPoiShowAlEvent.LJI(str3, "enter_method");
                        C1198630hIT item2 = poiSearchCellLeft.getItem();
                        if (item2 != null && (c1198610hIR6 = item2.LLILZ) != null && (num = c1198610hIR6.LJFF) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        searchPoiShowAlEvent.LJI(Integer.valueOf(iIntValue), "is_display_distance");
                        String str13 = "";
                        if (str2 == null) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        searchPoiShowAlEvent.LJI(str4, "key_word");
                        String str14 = "1";
                        searchPoiShowAlEvent.LJI("1", "is_success");
                        C1198630hIT item3 = poiSearchCellLeft.getItem();
                        if (item3 != null && (c1198610hIR5 = item3.LLILZ) != null) {
                            i = c1198610hIR5.LIZ;
                        } else {
                            i = 0;
                        }
                        searchPoiShowAlEvent.LJI(String.valueOf(i), "page_order");
                        C1198630hIT item4 = poiSearchCellLeft.getItem();
                        if (item4 == null || (poiData3 = item4.LL) == null || (str5 = poiData3.poiId) == null) {
                            str5 = "";
                        }
                        searchPoiShowAlEvent.LJI(str5, "poi_id");
                        C1198630hIT item5 = poiSearchCellLeft.getItem();
                        if (item5 != null && (c1198610hIR4 = item5.LLILZ) != null && (str11 = c1198610hIR4.LJ) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str11)) != null) {
                            iIntValue2 = numLJIIJJI.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        searchPoiShowAlEvent.LJI(Integer.valueOf(iIntValue2), "index");
                        C1198630hIT item6 = poiSearchCellLeft.getItem();
                        if (item6 == null || (str6 = item6.LLILLL) == null) {
                            str6 = "";
                        }
                        searchPoiShowAlEvent.LJI(str6, "log_id");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                        C1198630hIT item7 = poiSearchCellLeft.getItem();
                        if (item7 != null) {
                            poiData = item7.LL;
                        } else {
                            poiData = null;
                        }
                        c1185430gxB.getClass();
                        C1185430gxB.LIZIZ(poiData, linkedHashMap);
                        C1189060h32.LJIIL(searchPoiShowAlEvent, linkedHashMap);
                        C1198630hIT item8 = poiSearchCellLeft.getItem();
                        if (item8 == null || (c1198610hIR3 = item8.LLILZ) == null || (str7 = c1198610hIR3.LIZIZ) == null) {
                            str7 = "";
                        }
                        searchPoiShowAlEvent.LJI(str7, "search_id");
                        if (str2 != null && str2.length() != 0) {
                            C1198630hIT item9 = poiSearchCellLeft.getItem();
                            if (item9 != null && (c1198610hIR2 = item9.LLILZ) != null) {
                                lValueOf = Long.valueOf(c1198610hIR2.LIZLLL);
                            } else {
                                lValueOf = null;
                            }
                            searchPoiShowAlEvent.LJI(String.valueOf(lValueOf), "search_session_id");
                        }
                        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(CardStruct.IStatusCode.DEFAULT);
                        if (numLJIIJJI2 != null) {
                            searchPoiShowAlEvent.LJI(Integer.valueOf(numLJIIJJI2.intValue()), "poi_category_has_show");
                        }
                        C1198630hIT item10 = poiSearchCellLeft.getItem();
                        if (item10 != null) {
                            LJFF = Intrinsics.LJFF(item10.LLILZIL, Boolean.TRUE);
                        } else {
                            LJFF = 0;
                        }
                        searchPoiShowAlEvent.LJI(Integer.valueOf((int) LJFF), "is_cache_search");
                        C1198630hIT item11 = poiSearchCellLeft.getItem();
                        if (item11 != null && (c1198610hIR = item11.LLILZ) != null) {
                            LJFF2 = Intrinsics.LJFF(c1198610hIR.LJII, Boolean.TRUE);
                        } else {
                            LJFF2 = 0;
                        }
                        searchPoiShowAlEvent.LJI(Integer.valueOf((int) LJFF2), "use_prefix_cache");
                        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = ((C1197490hGd) poiSearchCellLeft.I5().getState()).LLILZ;
                        if (poiSearchResultWrapper != null) {
                            i2 = poiSearchResultWrapper.useSessionCache;
                        }
                        searchPoiShowAlEvent.LJI(Integer.valueOf(i2), "use_session_cache");
                        C1189060h32.LJIIL(searchPoiShowAlEvent, C1200530hLX.LIZIZ(null, "search_poi_show_al"));
                        if (C123100dR.LIZ(str12)) {
                            if (str12 == null) {
                                str10 = "";
                            } else {
                                str10 = str12;
                            }
                            searchPoiShowAlEvent.LJI(str10, "retag_enter_method");
                        }
                        if (str12 != null && ((iHashCode = str12.hashCode()) == -1866131019 ? str12.equals("edit_post") : iHashCode == 100344454 ? str12.equals("inbox") : !(iHashCode != 112202875 || !str12.equals("video"))) && C123100dR.LIZ(poiSearchCellLeft.I5().LLJJIJI)) {
                            String str15 = poiSearchCellLeft.I5().LLJJIJI;
                            if (str15 != null) {
                                str13 = str15;
                            }
                            searchPoiShowAlEvent.LJI(str13, "after_post_days");
                        }
                        PoiMobParam poiMobParam = poiSearchCellLeft.I5().LLJJJJJIL;
                        if (poiMobParam != null && (map = poiMobParam.creationExtraData) != null) {
                            str8 = map.get("rec_poi_id_list");
                        } else {
                            str8 = null;
                        }
                        if (!C123100dR.LIZ(str8)) {
                            str14 = CardStruct.IStatusCode.DEFAULT;
                        }
                        searchPoiShowAlEvent.LJI(str14, "has_model_identify_res");
                        C1197870hHF c1197870hHF = C1197870hHF.LIZ;
                        C1198630hIT item12 = poiSearchCellLeft.getItem();
                        if (item12 != null) {
                            poiData2 = item12.LL;
                        } else {
                            poiData2 = null;
                        }
                        c1197870hHF.getClass();
                        for (Map.Entry entry : ((LinkedHashMap) C1197870hHF.LIZIZ(poiData2, null, null, null)).entrySet()) {
                            searchPoiShowAlEvent.LJI(entry.getValue(), (String) entry.getKey());
                        }
                        PoiMobParam poiMobParam2 = poiSearchCellLeft.I5().LLJJJJJIL;
                        if (poiMobParam2 != null) {
                            str9 = poiMobParam2.useMethod;
                        } else {
                            str9 = null;
                        }
                        searchPoiShowAlEvent.LJI(str9, "use_method");
                        PoiMobParam poiMobParam3 = poiSearchCellLeft.I5().LLJJJJJIL;
                        if (poiMobParam3 != null) {
                            num2 = poiMobParam3.displayIndex;
                        }
                        searchPoiShowAlEvent.LJI(num2, "display_index");
                        searchPoiShowAlEvent.LJIIIIZZ();
                    }
                };
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        C1198630hIT c1198630hIT = (C1198630hIT) interfaceC1891350zJl;
        super.onBindItemView(c1198630hIT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchCellLeft ");
        PoiData poiData = c1198630hIT.LL;
        TuxTextView tuxTextView = null;
        if (poiData != null) {
            str = poiData.name;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiData poiData2 = c1198630hIT.LL;
        if (poiData2 != null && (str4 = poiData2.name) != null) {
            String str5 = ((C1197490hGd) I5().getState()).LL;
            if (str5 != null && str5.length() != 0) {
                TuxTextView tuxTextView2 = this.LL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                tuxTextView2.setTuxFont(101);
                TuxTextView tuxTextView3 = this.LL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                C1197910hHJ.LJFF(tuxTextView3, str4, c1198630hIT.LLILLJJLI, c1198630hIT.LLILZLL);
            } else {
                TuxTextView tuxTextView4 = this.LL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                tuxTextView4.setTuxFont(102);
                TuxTextView tuxTextView5 = this.LL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                tuxTextView5.setText(str4);
            }
            TuxTextView tuxTextView6 = this.LL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 0);
        } else {
            TuxTextView tuxTextView7 = this.LL;
            if (tuxTextView7 == null) {
                tuxTextView7 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView7, 4);
        }
        PoiData poiData3 = c1198630hIT.LL;
        if (poiData3 != null && (str3 = poiData3.address) != null) {
            if (!Intrinsics.LJFF(str3, poiData3.name) && str3.length() != 0) {
                TuxTextView tuxTextView8 = this.LLILLJJLI;
                if (tuxTextView8 == null) {
                    tuxTextView8 = null;
                }
                tuxTextView8.setText(str3);
                TuxTextView tuxTextView9 = this.LLILLJJLI;
                if (tuxTextView9 == null) {
                    tuxTextView9 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView9, 0);
            } else {
                TuxTextView tuxTextView10 = this.LLILLJJLI;
                if (tuxTextView10 == null) {
                    tuxTextView10 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView10, 8);
            }
        } else {
            TuxTextView tuxTextView11 = this.LLILLJJLI;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView11, 8);
        }
        PoiData poiData4 = c1198630hIT.LL;
        TuxTextView tuxTextView12 = this.LLILLL;
        if (tuxTextView12 == null) {
            tuxTextView12 = null;
        }
        tuxTextView12.setText("");
        TuxTextView tuxTextView13 = this.LLILLL;
        if (tuxTextView13 == null) {
            tuxTextView13 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView13, 8);
        TuxTextView tuxTextView14 = this.LLILZ;
        if (tuxTextView14 == null) {
            tuxTextView14 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView14, 8);
        if (poiData4 != null && I5().LLJJI && (str2 = poiData4.distance) != null && (!TextUtils.isEmpty(str2))) {
            TuxTextView tuxTextView15 = this.LLILLL;
            if (tuxTextView15 == null) {
                tuxTextView15 = null;
            }
            tuxTextView15.setText(str2);
            TuxTextView tuxTextView16 = this.LLILLL;
            if (tuxTextView16 == null) {
                tuxTextView16 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView16, 0);
            TuxTextView tuxTextView17 = this.LLILZ;
            if (tuxTextView17 != null) {
                tuxTextView = tuxTextView17;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 49, 42), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C686930Qx1 c686930Qx1;
        System.currentTimeMillis();
        C1198850hIp c1198850hIp = I5().LLJLILLLLZIIL;
        if (c1198850hIp == null || (c686930Qx1 = c1198850hIp.LIZIZ) == null || (viewTd = c686930Qx1.LIZIZ(R.layout.e9m)) == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e9m, viewGroup, false);
        }
        this.LL = (TuxTextView) viewTd.findViewById(R.id.tv_poi_name);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.tv_poi_address);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_poi_distance);
        viewTd.findViewById(R.id.dxx);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.tv_poi_divider);
        return viewTd;
    }
}
