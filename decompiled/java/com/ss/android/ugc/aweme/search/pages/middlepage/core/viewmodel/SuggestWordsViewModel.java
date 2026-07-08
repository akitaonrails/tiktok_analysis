package com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel;

import X.C01GW;
import X.C080U;
import X.C0BRR;
import X.C0PS4;
import X.C0Q2M;
import X.C0Q47;
import X.C0QEE;
import X.C0QER;
import X.C0QRC;
import X.C1150504el;
import X.C123100dR;
import X.C15O7;
import X.C1741890vQh;
import X.C1ER1;
import X.C2097608Jq;
import X.C293280BeY;
import X.C452501pT;
import X.C645950PVh;
import X.C649490Pdj;
import X.C650960Pg6;
import X.C661140PwW;
import X.C667700QGy;
import X.C667750QHd;
import X.C667760QHe;
import X.C667770QHf;
import X.C667800QHi;
import X.C670650QSh;
import X.C786410Ut5;
import X.InterfaceC2385309Wh;
import Y.ARunnableS79S0200000_10;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.RecomDataWrapper;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestWordsViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public final NextLiveData<Word> LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;
    public final NextLiveData<C0QRC<RecomDataWrapper>> LLILZ;

    public SuggestWordsViewModel() {
        new NextLiveData();
        this.LL = new NextLiveData<>();
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(277));
        this.LLILLL = true;
        this.LLILZ = new NextLiveData<>();
    }

    public static void vQ2(C645950PVh c645950PVh) {
        String strLIZIZ = C670650QSh.LIZIZ(C670650QSh.LIZ, false, true, 1);
        if (strLIZIZ.length() > 0) {
            c645950PVh.LJFF = strLIZIZ;
            c645950PVh.LJIIL = C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(new Pair("caption_type", "bubble")));
        }
    }

    public final void wQ2(C645950PVh c645950PVh, C0QER c0qer) {
        if (c0qer == null) {
            return;
        }
        boolean zLJFF = Intrinsics.LJFF("1", c0qer.obtainLogData("is_from_video"));
        boolean zLIZ = C123100dR.LIZ(c0qer.getEnterFromMusicId());
        if ((zLJFF || zLIZ) && this.LLILLL) {
            this.LLILLL = false;
            c645950PVh.LJFF = c0qer.getSearchHint();
        }
    }

    public final void xQ2(C0QRC<RecomDataWrapper> c0qrc, boolean z) {
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.recommendPostValueStart();
        if (z) {
            this.LLILZ.setValue(c0qrc);
            return;
        }
        C649490Pdj.LIZ.getClass();
        if (C649490Pdj.LIZIZ().postRecomDataImmediate == 1 || (searchMiddleMonitor.isHistoryDrawEnd() == 1 && C649490Pdj.LIZIZ().postRecomDataImmediate == 2)) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                this.LLILZ.setValue(c0qrc);
                return;
            } else {
                C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS79S0200000_10(this, c0qrc, 26));
                return;
            }
        }
        this.LLILZ.postValue(c0qrc);
    }

    public final void zQ2(C0QER c0qer, final C650960Pg6 c650960Pg6, C0PS4 c0ps4, String str, String str2) {
        final boolean z;
        String groupId;
        Integer num;
        SearchMiddleMonitor.INSTANCE.recommendRequestStart();
        System.currentTimeMillis();
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        final C667750QHd c667750QHd = new C667750QHd(c650960Pg6);
        if (c0ps4 != null) {
            c667750QHd.LIZ(new C667800QHi(System.currentTimeMillis() - C1150504el.LIZ().LJJII, System.currentTimeMillis(), c0ps4.blankPageEnterForm, c0ps4.blankPageEnterMethod));
        }
        SuggestWordsApi suggestWordsApi = SuggestWordsApi.LIZ;
        C645950PVh c645950PVh = new C645950PVh();
        c645950PVh.LIZ = "100011";
        if (c0qer != null) {
            groupId = c0qer.getGroupId();
        } else {
            groupId = null;
        }
        c645950PVh.LIZIZ = groupId;
        c645950PVh.LJ = Integer.valueOf(C293280BeY.LIZ(AFwS196S0000000_10.get$arr$(584), AFwS196S0000000_10.get$arr$(585)));
        wQ2(c645950PVh, c0qer);
        vQ2(c645950PVh);
        c645950PVh.LJI = C786410Ut5.J3(C667750QHd.LJI(null, (C667770QHf) c667750QHd.LIZIZ().LIZIZ(), (C667760QHe) ((C0Q47) c667750QHd.LJIIIIZZ.getValue()).LIZIZ()));
        c645950PVh.LJII = Integer.valueOf(c667750QHd.LIZLLL() ? 1 : 0);
        c645950PVh.LJIIIIZZ = ((C667700QGy) c667750QHd.LIZJ().LIZIZ()).LIZIZ();
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        c645950PVh.LJIIIZ = num;
        c645950PVh.LJIIJJI = str;
        if (str != null) {
            c645950PVh.LJFF = null;
        }
        c645950PVh.LJIILJJIL = str2;
        suggestWordsApi.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        String strLIZIZ = C661140PwW.LIZIZ();
        SuggestWordsApi.SuggestApi suggestApi = (SuggestWordsApi.SuggestApi) SuggestWordsApi.LIZIZ.getValue();
        String str3 = c645950PVh.LIZ;
        C0Q2M.LIZ.getClass();
        String strLJIIL = C0Q2M.LJIIL();
        String str4 = c645950PVh.LJFF;
        Integer num2 = c645950PVh.LJ;
        C0QEE.LIZ.getClass();
        suggestApi.getSuggestWordsWithRawString(str3, strLJIIL, null, str4, num2, null, C0QEE.LJFF(false), C1ER1.LIZIZ.LLLFFI(true, false), c645950PVh.LJI, c645950PVh.LJII, c645950PVh.LJIIIIZZ, "", "", "", "qrec", c645950PVh.LJIIIZ, c645950PVh.LJIIL, c645950PVh.LJIIJJI, c645950PVh.LJIILJJIL, arrayList, Integer.valueOf(C0BRR.LIZ()), strLIZIZ).LJI(new InterfaceC2385309Wh() { // from class: X.09Rt
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) throws InterruptedException {
                C1C7U.LIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvancedReal$3");
                if (((Number) C1821307Bj.LIZ.getValue()).intValue() != 0) {
                    Thread.sleep(((Number) r1.getValue()).intValue());
                }
                C1C7U.LIZIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvancedReal$3");
                return c15o7;
            }
        }).LJ(new InterfaceC2385309Wh() { // from class: X.0QHY
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                List<TypeWords> list;
                TypeWords typeWords;
                List<Word> list2;
                Word word;
                SuggestWordResponse.Config config;
                C1C7U.LIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvancedReal$4");
                SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
                searchMiddleMonitor.recommendRequestEnd(c15o7.LJIIL());
                C667750QHd c667750QHd2 = c667750QHd;
                c667750QHd2.getClass();
                int historyDisplayNum = 0;
                c667750QHd2.LIZ(new C667720QHa(false));
                C667750QHd c667750QHd3 = c667750QHd;
                c667750QHd3.getClass();
                c667750QHd3.LIZ(new C667730QHb());
                if (c15o7.LJIILJJIL()) {
                    String str5 = (String) c15o7.LJIIL();
                    if (!TextUtils.isEmpty(str5)) {
                        try {
                            searchMiddleMonitor.recommendJsonStart();
                            SuggestWordResponse suggestWordResponse = (SuggestWordResponse) new Gson().LJII(str5, SuggestWordResponse.class);
                            searchMiddleMonitor.recommendJsonEnd();
                            if (!C0BQA.LIZ()) {
                                this.xQ2(new C0QRC<>(new RecomDataWrapper(str5, suggestWordResponse)), true);
                            }
                            if (suggestWordResponse != null && (config = suggestWordResponse.config) != null) {
                                historyDisplayNum = config.getHistoryDisplayNum();
                            }
                            ((Keva) C0QIL.LIZ.getValue()).storeInt("search_history_count", historyDisplayNum);
                            if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) C13LP.LJJJLL(list)) != null && (list2 = typeWords.words) != null) {
                                boolean z2 = z;
                                SuggestWordsViewModel suggestWordsViewModel = this;
                                C650960Pg6 c650960Pg62 = c650960Pg6;
                                Word word2 = (Word) C13LP.LJJJLL(list2);
                                if (!list2.isEmpty()) {
                                    if (word2 != null) {
                                        String str6 = suggestWordResponse.logId;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        word2.setImplId(str6);
                                    }
                                    if (z2 && word2 != null) {
                                        word2.setFromRefresh(true);
                                    }
                                    NextLiveData<Word> nextLiveData = suggestWordsViewModel.LL;
                                    if (word2 == null) {
                                        word = new Word();
                                    } else {
                                        word = word2;
                                    }
                                    nextLiveData.setValue(word);
                                    C0Q3L c0q3l = C0Q3L.LIZ;
                                    if (word2 == null) {
                                        word2 = new Word();
                                    }
                                    c0q3l.LIZ(new C0QHZ(word2), c650960Pg62);
                                }
                            }
                            if (C0BQA.LIZ()) {
                                this.xQ2(new C0QRC<>(new RecomDataWrapper(str5, suggestWordResponse)), true);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        this.xQ2(new C0QRC<>(new RecomDataWrapper(c15o7.LJIIJJI().toString(), null)), true);
                    }
                } else if (c15o7.LJIILL()) {
                    this.xQ2(new C0QRC<>(new RecomDataWrapper(c15o7.LJIIJJI().toString(), null)), true);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvancedReal$4");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a8  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.C0QER r40, X.C650960Pg6 r41, X.C0PS4 r42, java.lang.String r43, java.lang.String r44, X.InterfaceC1364105Vn r45) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel.yQ2(X.0QER, X.0Pg6, X.0PS4, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
