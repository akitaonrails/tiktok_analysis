package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PCY;
import X.C0PZ5;
import X.C0PZ7;
import X.C0PZI;
import X.C0Q00;
import X.C0Q3E;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1840707Iv;
import X.C452501pT;
import X.C642090PGl;
import X.C646670PYb;
import X.C646870PYv;
import X.C646880PYw;
import X.C647010PZj;
import X.C647030PZl;
import X.C647120PZu;
import X.C647140PZw;
import X.C649040Pd0;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC486120J4o;
import X.InterfaceC494301wD;
import X.InterfaceC644520PPu;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicLiveAssem<D> extends AbstractC738140SxQ implements ISearchDynamicLiveAbility, InterfaceC644520PPu, InterfaceC1554640qYg {
    public boolean LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchDynamicLiveAssem) this, 812));

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility
    public final void Gb2() {
        this.LL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1692970876) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC644520PPu
    public final boolean sq(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility
    public final boolean q10() {
        return !this.LL;
    }

    public final ISearchContextAbility bo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return C0Q3E.LIZIZ(fragmentLJI);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        C646870PYv c646870PYv;
        SearchTabPlayConfig searchTabPlayConfig;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C646880PYw c646880PYw = (C646880PYw) this.LLILLJJLI.getValue();
        if (c646880PYw == null || (c646870PYv = c646880PYw.LLILLL) == null || (searchTabPlayConfig = c646870PYv.searchTabPlayConfig) == null || !searchTabPlayConfig.needAutoPlay) {
            return;
        }
        C0PZ5.LIZ.getClass();
        C0PZ5.LIZIZ = null;
        ISearchContextAbility iSearchContextAbilityBo = bo();
        C647140PZw.LIZ.LIZJ((iSearchContextAbilityBo == null || (c0pcyJh0 = iSearchContextAbilityBo.Jh0()) == null || (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) == null) ? -1 : c646670PYb.LLJILJIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        EventBus.LIZLLL().LJIJJ(this);
        this.LL = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility
    public final void WQ0(SearchLiveList searchLiveList) {
        int i;
        String imprId;
        LogPbBean logPbBean;
        long j;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        ISearchContextAbility iSearchContextAbilityBo = bo();
        if (iSearchContextAbilityBo != null && (c0pcyJh0 = iSearchContextAbilityBo.Jh0()) != null && (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) != null) {
            i = c646670PYb.LLJILJIL;
        } else {
            i = -1;
        }
        if (C1840707Iv.LIZ()) {
            C647140PZw.LIZ.LIZJ(i);
            C649040Pd0 c649040Pd0 = new C649040Pd0(new DynamicPatch());
            ArrayList arrayList = new ArrayList();
            if (searchLiveList != null) {
                List<SearchLiveStruct> listLJI = searchLiveList.LJI();
                if (listLJI != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : (ArrayList) listLJI) {
                        if (((SearchLiveStruct) obj).getType() == 1) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                List<SearchLiveStruct> listLJ = searchLiveList.LJ();
                if (listLJ != null) {
                    arrayList.addAll(listLJ);
                }
            }
            c649040Pd0.LIZJ = arrayList;
            c649040Pd0.LIZLLL = (C642090PGl) this.LLILLL.getValue();
            c649040Pd0.LJ = true;
            int iLIZIZ = C647140PZw.LIZ.LIZIZ(c649040Pd0);
            ISearchContextAbility iSearchContextAbilityBo2 = bo();
            if (iSearchContextAbilityBo2 != null) {
                iSearchContextAbilityBo2.fe(new C647030PZl(iLIZIZ));
            }
            ISearchContextAbility iSearchContextAbilityBo3 = bo();
            if (iSearchContextAbilityBo3 != null) {
                if (searchLiveList != null) {
                    j = searchLiveList.cursor;
                } else {
                    j = 0;
                }
                iSearchContextAbilityBo3.fe(new C647120PZu(true, j));
            }
            ISearchContextAbility iSearchContextAbilityBo4 = bo();
            if (iSearchContextAbilityBo4 != null) {
                if (searchLiveList == null || (logPbBean = searchLiveList.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
                    imprId = "";
                }
                iSearchContextAbilityBo4.fe(new C647010PZj(imprId));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void enterLiveRoom(C0PZ7 c0pz7) {
        C0Q00 c0q00 = C0Q00.LIZ;
        getContext();
        LiveRoomStruct liveRoomStruct = c0pz7.LIZ;
        ArrayList<LiveRoomStruct> arrayList = c0pz7.LIZIZ;
        EnterRoomConfig enterRoomConfig = c0pz7.LIZLLL;
        long j = c0pz7.LIZJ;
        Boolean bool = c0pz7.LJ;
        InterfaceC486120J4o interfaceC486120J4o = new InterfaceC486120J4o() { // from class: X.0J8e
            @Override // X.InterfaceC486120J4o
            public final void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig2) {
            }

            @Override // X.InterfaceC486120J4o
            public final void LIZJ(Aweme aweme, EnterRoomConfig enterRoomConfig2) {
            }

            @Override // X.InterfaceC486120J4o
            public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig2) {
                EnterRoomConfig.RoomsData roomsData;
                if (enterRoomConfig2 != null && enterRoomConfig2.mLogData != null) {
                    EnterRoomConfig.LogData logData = enterRoomConfig2.mLogData;
                    if (logData.search_result_id_v2 == null) {
                        if (obj instanceof LiveRoomStruct) {
                            logData.search_result_id_v2 = String.valueOf(((LiveRoomStruct) obj).id);
                        }
                        if ((obj instanceof Aweme) && (roomsData = enterRoomConfig2.mRoomsData) != null) {
                            enterRoomConfig2.mLogData.search_result_id_v2 = String.valueOf(roomsData.roomId);
                        }
                        enterRoomConfig2.mLogData.search_result_type = 2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("log callback ");
                        String str = enterRoomConfig2.mLogData.search_result_id_v2;
                        if (str == null) {
                            str = "";
                        }
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
        };
        c0q00.getClass();
        C0Q00.LIZLLL(liveRoomStruct, arrayList, enterRoomConfig, j, bool, this, interfaceC486120J4o);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility, X.InterfaceC644520PPu
    public final void x(String str) throws JSONException {
        ISearchDynamicContentAbility iSearchDynamicContentAbility;
        C0PZI c0pziRw2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", str);
        this.LL = true;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicContentAbility.class, null)) != null && (c0pziRw2 = iSearchDynamicContentAbility.rw2()) != null) {
            c0pziRw2.sendEvent("verticalLiveBack", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility, X.InterfaceC644520PPu
    public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        int i;
        ISearchDynamicContentAbility iSearchDynamicContentAbility;
        List<SearchLiveStruct> list2;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        C647140PZw c647140PZw = C647140PZw.LIZ;
        ISearchContextAbility iSearchContextAbilityBo = bo();
        if (iSearchContextAbilityBo != null && (c0pcyJh0 = iSearchContextAbilityBo.Jh0()) != null && (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) != null) {
            i = c646670PYb.LLJILJIL;
        } else {
            i = -1;
        }
        C649040Pd0 c649040Pd0LIZ = c647140PZw.LIZ(i);
        if (c649040Pd0LIZ != null && (list2 = c649040Pd0LIZ.LIZJ) != null) {
            ((ArrayList) list2).addAll(searchLiveList.LJI());
        }
        ISearchContextAbility iSearchContextAbilityBo2 = bo();
        if (iSearchContextAbilityBo2 != null) {
            iSearchContextAbilityBo2.fe(new C647120PZu(z, searchLiveList.cursor));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicContentAbility.class, null)) != null) {
            iSearchDynamicContentAbility.T70(searchLiveList, null);
        }
    }
}
