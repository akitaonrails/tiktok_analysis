package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel;

import X.AbstractC1812590xGj;
import X.AbstractC1814790xKH;
import X.AbstractC316870CbV;
import X.AbstractC481901uD;
import X.C01GW;
import X.C09YA;
import X.C0IJT;
import X.C0KPJ;
import X.C1152620g6G;
import X.C1161920gLG;
import X.C125800ds;
import X.C1559260qg8;
import X.C1781580wSi;
import X.C1813080xHW;
import X.C1814370xJb;
import X.C1814780xKG;
import X.C1814810xKJ;
import X.C1815050xKh;
import X.C1815060xKi;
import X.C1815090xKl;
import X.C1815100xKm;
import X.C1815120xKo;
import X.C1815130xKp;
import X.C1815140xKq;
import X.C1815950xM9;
import X.C2003107sz;
import X.C452501pT;
import X.C474500IjA;
import X.C481401u8;
import X.C481501u9;
import X.C627660Ojc;
import X.C758470Tp7;
import X.C758510TpB;
import X.EnumC1815680xLi;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1814530xJr;
import X.InterfaceC1815150xKr;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public class LiveBoardsPageViewModel extends AssemListViewModel<C1815950xM9, InterfaceC1891350zJl, Integer> {
    public final InterfaceC1815150xKr LL;
    public boolean LLILLJJLI;
    public DataChannel LLILLL;
    public final InterfaceC1814530xJr LLILZ;
    public final C09YA LLILZIL;
    public final C1559260qg8 LLILZLL;
    public final C01GW LLIZ;
    public C1814370xJb LLIZLLLIL;
    public List<InterfaceC1891350zJl> LLJ;
    public boolean LLJI;
    public AbstractC1812590xGj LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1815950xM9(0);
    }

    public final C1781580wSi zQ2() {
        return (C1781580wSi) this.LLILZLL.getValue();
    }

    public static boolean GQ2() {
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        return c758470Tp7LIZ != null && c758470Tp7LIZ.LJ;
    }

    public final int AQ2() {
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LIZJ) {
            List<ITEM> listListGetAll = listGetAll();
            return ((listListGetAll != 0 ? listListGetAll.size() : 0) - 1) - this.LLJ.size();
        }
        if (BQ2()) {
            List<ITEM> listListGetAll2 = listGetAll();
            size = (listListGetAll2 != 0 ? listListGetAll2.size() : 0) - 1;
        } else {
            if (!GQ2()) {
                List<ITEM> listListGetAll3 = listGetAll();
                if (listListGetAll3 != 0) {
                    return listListGetAll3.size();
                }
                return 0;
            }
            List<ITEM> listListGetAll4 = listGetAll();
            if (listListGetAll4 != 0) {
                size = listListGetAll4.size();
            }
        }
        return size - 1;
    }

    public final boolean BQ2() {
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll == 0) {
            return false;
        }
        Iterator it2 = listListGetAll.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof AbstractC1812590xGj) {
                return next != null;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL = null;
        this.LLILLJJLI = true;
        C0KPJ.f121kf.LJFF((Map<String, String>) this.LLIZ.getValue());
    }

    public LiveBoardsPageViewModel(InterfaceC1815150xKr interfaceC1815150xKr) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        this.LL = interfaceC1815150xKr;
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager();
        } else {
            boardsDisplayStateManager = null;
        }
        this.LLILZ = boardsDisplayStateManager;
        this.LLILZIL = new C09YA(this, new C1815140xKq());
        this.LLILZLL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1781580wSi.class, (Class<Object>) null, (String) 13), true);
        this.LLIZ = C452501pT.LIZIZ(new C1815090xKl());
        this.LLJ = new ArrayList();
    }

    public static void wQ2(C1814780xKG c1814780xKG) {
        Board board = c1814780xKG.LLILLL;
        if (!C1152620g6G.LIZLLL(board)) {
            return;
        }
        AbstractC481901uD abstractC481901uDLIZIZ = C481401u8.LIZIZ(board);
        if (abstractC481901uDLIZIZ instanceof C481501u9) {
            Board board2 = ((C481501u9) abstractC481901uDLIZIZ).LIZ;
            board.dslVersion = board2.dslVersion;
            board.minCompatibleDslVersion = board2.minCompatibleDslVersion;
            board.boardItemList = board2.boardItemList;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new C1815100xKm(c627660Ojc));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return FQ2(this, 0, interfaceC1364105Vn);
    }

    public final void vQ2(EnumC1815680xLi enumC1815680xLi) {
        setState(new C1815130xKp(enumC1815680xLi));
    }

    public final void xQ2(Context context) {
        InterfaceC1814530xJr interfaceC1814530xJr = this.LLILZ;
        if (interfaceC1814530xJr != null) {
            Board board = new Board();
            board.version = 2;
            HashMap map = new HashMap();
            String str = zQ2().LL;
            if (str == null) {
                str = "";
            }
            map.put("decoration_entrance", str);
            map.put("is_empty", "1");
            map.put("previous_page", "decoration_create");
            interfaceC1814530xJr.LJI(board, map);
        }
        setState(new C1815120xKo());
        withState(new C1815060xKi(this));
    }

    public final void CQ2(C1814780xKG c1814780xKG, String str) {
        String str2;
        int i;
        long j;
        C1781580wSi c1781580wSiZQ2 = zQ2();
        Board board = c1814780xKG.LLILLL;
        if (board.version == 2) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_my_decoration_card");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(c1781580wSiZQ2.LLILZ, "room_id");
            c474500IjALIZ.LJJII(c1781580wSiZQ2.LL, "decoration_entrance");
            c474500IjALIZ.LJJII(Long.valueOf(c1814780xKG.LLILLL.id), "decoration_set_id");
            if (c1814780xKG.LLILZIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_ongoing");
            RecommendBoardInfo recommendBoardInfo = c1814780xKG.LLILLL.recommendBoardInfo;
            if (recommendBoardInfo != null) {
                i = recommendBoardInfo.boardSource;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "board_source");
            RecommendBoardInfo recommendBoardInfo2 = c1814780xKG.LLILLL.recommendBoardInfo;
            if (recommendBoardInfo2 != null) {
                j = recommendBoardInfo2.recommendBoardId;
            } else {
                j = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "rec_template_id");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(str, "click_type");
            c474500IjALIZ.LJJII(C1813080xHW.LIZ(Integer.valueOf(c1814780xKG.LLILZLL)), "audit_status");
            c474500IjALIZ.LIZ();
            return;
        }
        C1813080xHW.LIZJ(board, c1814780xKG.LLIZ, c1814780xKG.LLILZIL, Integer.valueOf(c1814780xKG.LLILZLL), "click", str, c1781580wSiZQ2.LLILZ, c1781580wSiZQ2.LL, -1).LIZ();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return FQ2(this, num.intValue(), interfaceC1364105Vn);
    }

    public final void yQ2(Context context, C1814780xKG c1814780xKG) {
        String str;
        if (zQ2().LLILLJJLI) {
            wQ2(c1814780xKG);
            InterfaceC1814530xJr interfaceC1814530xJr = this.LLILZ;
            if (interfaceC1814530xJr != null) {
                Board board = c1814780xKG.LLILLL;
                HashMap map = new HashMap();
                String str2 = zQ2().LL;
                if (str2 == null) {
                    str2 = "";
                }
                map.put("decoration_entrance", str2);
                if (C125800ds.LIZIZ(c1814780xKG.LLILLL)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_empty", str);
                map.put("previous_page", "my_decoration_card");
                interfaceC1814530xJr.LJI(board, map);
            }
            setState(new C1815050xKh());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0358 A[Catch: all -> 0x035e, TRY_ENTER, TryCatch #14 {all -> 0x035e, blocks: (B:166:0x0350, B:169:0x0358), top: B:255:0x0350 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0367 A[Catch: all -> 0x0383, TRY_LEAVE, TryCatch #2 {all -> 0x0383, blocks: (B:167:0x0353, B:174:0x0360, B:175:0x0363, B:177:0x0367), top: B:231:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0376 A[Catch: all -> 0x0381, TryCatch #1 {all -> 0x0381, blocks: (B:178:0x0371, B:180:0x0376), top: B:230:0x0365 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0350 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object FQ2(com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel r29, int r30, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r31) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel.FQ2(com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel, int, X.05Vn):java.lang.Object");
    }

    public final void DQ2(AbstractC1814790xKH abstractC1814790xKH, String str, String str2) {
        String string;
        long j;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_my_decoration_delete_confirm");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(zQ2().LLILZ, "room_id");
        c474500IjALIZ.LJJII(zQ2().LL, "decoration_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZ(str2, "click_type", new C1814810xKJ(str));
        c474500IjALIZ.LJJII("decoration", "board_type");
        RecommendBoardInfo recommendBoardInfo = abstractC1814790xKH.LIZ().recommendBoardInfo;
        if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(string, "board_source");
        RecommendBoardInfo recommendBoardInfo2 = abstractC1814790xKH.LIZ().recommendBoardInfo;
        if (recommendBoardInfo2 != null) {
            j = recommendBoardInfo2.recommendBoardId;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "rec_template_id");
        c474500IjALIZ.LJJII(Long.valueOf(abstractC1814790xKH.LIZ().id), "decoration_set_id");
        c474500IjALIZ.LIZ();
    }

    public final void EQ2(C1814780xKG c1814780xKG, String str, String str2) {
        String string;
        long j;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_my_decoration_edit_panel");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(zQ2().LLILZ, "room_id");
        c474500IjALIZ.LJJII(zQ2().LL, "decoration_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(c1814780xKG.LLILLL.id), "decoration_set_id");
        RecommendBoardInfo recommendBoardInfo = c1814780xKG.LLILLL.recommendBoardInfo;
        if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(string, "board_source");
        RecommendBoardInfo recommendBoardInfo2 = c1814780xKG.LLILLL.recommendBoardInfo;
        if (recommendBoardInfo2 != null) {
            j = recommendBoardInfo2.recommendBoardId;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "rec_template_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZ(str2, "click_type", new C2003107sz(str));
        c474500IjALIZ.LIZ();
    }
}
