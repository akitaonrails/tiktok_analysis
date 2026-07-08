package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C01GW;
import X.C03H5;
import X.C064N;
import X.C098200Yq;
import X.C0BYX;
import X.C0DVA;
import X.C0EBE;
import X.C0KFD;
import X.C0QNN;
import X.C0QRC;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1323690kYB;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C15IK;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20639086r;
import X.C20684815ws;
import X.C2082308Dt;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21578619ce;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C301320BrW;
import X.C452501pT;
import X.C565530MFz;
import X.C616540OGe;
import X.C673150Qan;
import X.C681310Qnx;
import X.C681330Qnz;
import X.C681340Qo0;
import X.C681430Qo9;
import X.C681610QoR;
import X.C681620QoS;
import X.C681640QoU;
import X.C681660QoW;
import X.C681700Qoa;
import X.C681730Qod;
import X.C681870Qor;
import X.C681880Qos;
import X.C682080QpC;
import X.C687700QyG;
import X.C723850SaN;
import X.C736680Sv4;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC681490QoF;
import X.EnumC681630QoT;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1210900hcG;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC615300OBk;
import X.InterfaceC665370Q7z;
import X.InterfaceC681920Qow;
import X.InterfaceC681980Qp2;
import X.InterfaceC682000Qp4;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model.TrendingWord;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model.TrendingWordsStorageData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicTrendingViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicMiddlePageFragment extends AmeBaseFragment implements InterfaceC681920Qow, InterfaceC724530SbT, InterfaceC682000Qp4, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2svISA8OyAhPDw6K2HELIOSshICs3JCA8KCg2ZiYjOyp9PSxiGioyOiYkBDogISYBICs3JCAcKCg2DjctLiI2JjE=";
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public C21578619ce LLILZ;
    public MusicTrendingViewModel LLILZLL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJI;
    public InterfaceC615300OBk LLJJIJI;
    public InterfaceC682000Qp4 LLJJIJIIJIL;
    public final SearchMusicMiddlePageFragment LL = this;
    public final C681610QoR LLILLJJLI = new C681610QoR(LifecycleOwnerKt.getLifecycleScope(this), C0BYX.LIZ());
    public final String LLILZIL = "tt_music_create_transfer_feedback_params";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 374));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(257));
    public final ArrayList<InterfaceC1891350zJl> LLJ = new ArrayList<>();
    public final ArrayList<Word> LLJI = new ArrayList<>();
    public List<String> LLJIJIL = C13BV.INSTANCE;
    public String LLJILJIL = "";
    public final int LLJJ = 4;
    public final AObserverS214S0100000_10 LLJJIII = new AObserverS214S0100000_10(this, 33);

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            this.LLJJIJI = (InterfaceC615300OBk) obj;
        } else if (cls == InterfaceC682000Qp4.class) {
            this.LLJJIJIIJIL = (InterfaceC682000Qp4) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchMusicMiddlePageScope.class, SearchMusicMiddlePageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            return this.LLJJIJI;
        }
        if (cls == InterfaceC682000Qp4.class) {
            return this.LLJJIJIIJIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchMusicMiddlePageScope.class);
        arrayList.add(SearchMusicMiddlePageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchMusicMiddlePageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            this.LLJJIJI = null;
        } else if (cls == InterfaceC682000Qp4.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final ChooseSearchMusicStateViewModel MR() {
        return (ChooseSearchMusicStateViewModel) this.LLIZ.getValue();
    }

    public final void OR() {
        if ((!(!this.LLJIJIL.isEmpty()) || C681620QoS.LIZLLL() || C681620QoS.LJ()) && !C682080QpC.LIZJ()) {
            int i = 0;
            for (String str : this.LLJIJIL) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
                c2344009Gk.LJIIIIZZ("impr_id", this.LLJILJIL);
                c2344009Gk.LJIIIIZZ("search_entrance", C15IK.LIZ);
                c2344009Gk.LJIIIIZZ("search_position", "video_music");
                c2344009Gk.LJIIIIZZ("words_source", "recom_search");
                c2344009Gk.LIZJ(i, "words_position");
                c2344009Gk.LJIIIIZZ("words_content", str);
                c2344009Gk.LJIIIIZZ("words_horder", C681620QoS.LIZLLL() ? "search_bar" : "video_may_like");
                C20684815ws.LJIILLIIL("trending_words_show", c2344009Gk.LIZ);
                i = i2;
            }
        }
    }

    public final void NR() {
        int size = ((ArrayList) C681730Qod.LJIILIIL().LJFF()).size();
        if (size > 0) {
            C681640QoU.LIZ(MR().vQ2(), "show", C2097908Jt.LIZJ(new Pair("item_num", String.valueOf(size))));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NextLiveData<C0QRC<SuggestWordResponse>> nextLiveData;
        super.onDestroyView();
        ChooseSearchMusicStateViewModel chooseSearchMusicStateViewModelMR = MR();
        chooseSearchMusicStateViewModelMR.getClass();
        chooseSearchMusicStateViewModelMR.setState(new AwS589S0100000_10(chooseSearchMusicStateViewModelMR, 597));
        C681730Qod.LJIILIIL().LJIIIZ(this);
        MusicTrendingViewModel musicTrendingViewModel = this.LLILZLL;
        if (musicTrendingViewModel == null || (nextLiveData = musicTrendingViewModel.LL) == null) {
            return;
        }
        nextLiveData.removeObserver(this.LLJJIII);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SearchMusicMiddlePageFragment.class.getName());
        }
        super.onResume();
        SR(null);
    }

    @Override // X.InterfaceC682000Qp4
    public final C681610QoR By() {
        return this.LLILLJJLI;
    }

    public final void PR(boolean z) {
        String str;
        int size;
        String str2;
        this.LLJILLL = z;
        int i = 0;
        if (!this.LLJI.isEmpty()) {
            if (C681620QoS.LJ()) {
                size = this.LLJIJIL.size();
            } else {
                size = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
            c2344009Gk.LJIIIIZZ("impr_id", this.LLJILJIL);
            c2344009Gk.LJIIIIZZ("search_entrance", C15IK.LIZ);
            c2344009Gk.LJIIIIZZ("search_position", MR().vQ2());
            c2344009Gk.LJIIIIZZ("words_source", "recom_search");
            c2344009Gk.LIZJ(this.LLJI.size() + size, "words_num");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_cache", str2);
            C20684815ws.LJIILLIIL("trending_show", c2344009Gk.LIZ);
        }
        for (Word word : this.LLJI) {
            int i2 = i + 1;
            if (i >= 0) {
                Word word2 = word;
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("creation_id", C15IK.LJ);
                c2344009Gk2.LJIIIIZZ("impr_id", this.LLJILJIL);
                c2344009Gk2.LJIIIIZZ("search_entrance", C15IK.LIZ);
                c2344009Gk2.LJIIIIZZ("search_position", MR().vQ2());
                c2344009Gk2.LJIIIIZZ("words_source", "recom_search");
                c2344009Gk2.LIZJ(i, "words_position");
                c2344009Gk2.LJIIIIZZ("words_content", word2.getShowWord());
                c2344009Gk2.LJIIIIZZ("group_id", word2.getId());
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk2.LJIIIIZZ("is_cache", str);
                c2344009Gk2.LJIIIIZZ("words_horder", "text_may_like");
                C20684815ws.LJIILLIIL("trending_words_show", c2344009Gk2.LIZ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void SR(EnumC681630QoT enumC681630QoT) {
        List<MusicSearchHistory> listLJFF = C681730Qod.LJIILIIL().LJFF();
        if (enumC681630QoT == EnumC681630QoT.HISTORY_INIT) {
            C681610QoR c681610QoR = this.LLILLJJLI;
            int size = ((ArrayList) listLJFF).size();
            if (c681610QoR.LJIILL && !c681610QoR.LJIIIZ) {
                c681610QoR.LJIIIIZZ = size;
            }
        }
        RR(listLJFF, enumC681630QoT);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).unbindAbility(this.LL, InterfaceC682000Qp4.class);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (C301320BrW.LIZ()) {
            C687700QyG.LJI(this);
        }
        super.onCreate(bundle);
        C681610QoR c681610QoR = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c681610QoR.LJIILL) {
            c681610QoR.LJIIJJI = jCurrentTimeMillis;
        }
    }

    @C14EU
    public final void onExpandHistoryEvent(C0DVA c0dva) {
        c0dva.getClass();
        this.LLJILJILJ = true;
        SR(null);
        C681640QoU.LIZ(MR().vQ2(), "show_all", null);
    }

    @C14EU
    public final void onMusicTrendingSugFeedbackEvent(C064N c064n) {
        String schema;
        Map<String, String> schemaParams;
        ArrayList<Word> arrayList = this.LLJI;
        List<MusicSearchHistory> listLJFF = C681730Qod.LJIILIIL().LJFF();
        String strVQ2 = MR().vQ2();
        String str = this.LLJILJIL;
        ArrayList arrayList2 = new ArrayList();
        for (Word word : arrayList) {
            arrayList2.add(new TrendingWord(word.getWord(), word.getId()));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            arrayList3.add(((MusicSearchHistory) it2.next()).keyword);
        }
        try {
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ((Map) C7740030o.LIZ().getGson().LJII(C7740030o.LIZ().getGson().LJIILL(new TrendingWordsStorageData(arrayList2, arrayList3, strVQ2, str)), HashMap.class));
            Context context = getContext();
            if (context != null) {
                C1323690kYB.LIZ(context).LJIIIIZZ(mapLJIIZILJ, this.LLILZIL);
            }
            SearchUserFeedbackSettings.Feedback feedbackLIZ = SearchUserFeedbackSettings.LIZ("mc_transfer_page");
            if (feedbackLIZ == null || (schema = feedbackLIZ.getSchema()) == null) {
                schema = "";
            }
            if (schema.length() == 0) {
                return;
            }
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", UriProtector.parse(schema).buildUpon().appendQueryParameter("search_type", "mc_transfer_page").build().toString());
            SearchUserFeedbackSettings.Feedback feedbackLIZ2 = SearchUserFeedbackSettings.LIZ("mc_transfer_page");
            if (feedbackLIZ2 != null && (schemaParams = feedbackLIZ2.getSchemaParams()) != null) {
                for (Map.Entry<String, String> entry : schemaParams.entrySet()) {
                    builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            SmartRouter.buildRoute(getContext(), builderAppendQueryParameter.build().toString()).open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU
    public final void onPostHistoryMobEvent(C681700Qoa c681700Qoa) {
        C681640QoU.LIZ(MR().vQ2(), c681700Qoa.LIZ, c681700Qoa.LIZIZ);
    }

    @C14EU
    public final void onPostTrendingClickEvent(C681310Qnx c681310Qnx) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
        c2344009Gk.LJIIIIZZ("impr_id", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("search_entrance", C15IK.LIZ);
        c2344009Gk.LJIIIIZZ("search_position", MR().vQ2());
        c2344009Gk.LJIIIIZZ("words_source", "recom_search");
        c2344009Gk.LJII(c681310Qnx.LIZ);
        if (this.LLJILLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_cache", str);
        C20684815ws.LJIILLIIL("trending_words_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).bindAbility(this.LL, InterfaceC682000Qp4.class);
    }

    @Override // X.InterfaceC681920Qow
    public final void pc(List<? extends MusicSearchHistory> list) {
        RR(list, null);
    }

    public final void RR(List<? extends MusicSearchHistory> list, EnumC681630QoT enumC681630QoT) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        this.LLJ.clear();
        if (!C0BYX.LIZ() && !C681620QoS.LJ()) {
            Iterator<? extends MusicSearchHistory> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLJ.add(new C681870Qor(it2.next()));
                if (this.LLJ.size() >= Integer.MAX_VALUE) {
                    break;
                }
            }
            if (this.LLJ.size() >= 3) {
                this.LLJ.add(new InterfaceC1891350zJl() { // from class: X.0Qoy
                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C681940Qoy;
                    }
                });
            }
        } else {
            int i = 0;
            if (!this.LLJILJILJ) {
                int iMin = Math.min(this.LLJJ - 1, list.size() - 1);
                if (iMin >= 0) {
                    int i2 = 0;
                    while (true) {
                        this.LLJ.add(new C681880Qos((MusicSearchHistory) ListProtector.get(list, i2)));
                        if (i2 == iMin) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (list.size() > this.LLJJ) {
                    this.LLJ.add(new InterfaceC1891350zJl() { // from class: X.0Qp1
                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return interfaceC1891350zJl instanceof C681970Qp1;
                        }
                    });
                }
            } else {
                Iterator<? extends MusicSearchHistory> it3 = list.iterator();
                while (it3.hasNext()) {
                    this.LLJ.add(new C681880Qos(it3.next()));
                }
                if (list.size() > this.LLJJ) {
                    this.LLJ.add(new InterfaceC1891350zJl() { // from class: X.0Qoz
                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return interfaceC1891350zJl instanceof C681950Qoz;
                        }
                    });
                }
            }
            if (((!this.LLJI.isEmpty()) || ((!this.LLJIJIL.isEmpty()) && C681620QoS.LJ())) && !this.LLJJI) {
                this.LLJ.add(new InterfaceC1891350zJl() { // from class: X.0Qp0
                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C681960Qp0;
                    }
                });
                if (C681620QoS.LJ()) {
                    int i3 = 0;
                    for (String str : this.LLJIJIL) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            this.LLJ.add(new C681330Qnz(str, i3));
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                for (Word word : this.LLJI) {
                    int i5 = i + 1;
                    if (i >= 0) {
                        this.LLJ.add(new C681340Qo0(word, i));
                        i = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                this.LLJ.add(new InterfaceC1891350zJl() { // from class: X.0Qox
                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C681930Qox;
                    }
                });
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state2.LJFF(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LIZLLL(this.LLJ, new ARunnableS79S0200000_10(enumC681630QoT, this, 25));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        NextLiveData<C0QRC<SuggestWordResponse>> nextLiveData;
        super.onViewCreated(view, bundle);
        C20639086r.LIZ.LIZIZ();
        C681730Qod c681730QodLJIILIIL = C681730Qod.LJIILIIL();
        if (c681730QodLJIILIIL.LLILZLL == null) {
            c681730QodLJIILIIL.LLILZLL = new ArrayList();
        }
        ((ArrayList) c681730QodLJIILIIL.LLILZLL).add(new WeakReference(this));
        this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        if (C682080QpC.LIZJ()) {
            this.LLILZ = (C21578619ce) view.findViewById(R.id.uch);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(true);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(SearchMusicHistoryCell.class, SearchMusicHistoryCellNew.class, ClearSearchHistoryCell.class, ClearSearchHistoryCellNew.class, SearchMusicSugTitleCell.class, SearchMusicSugFeedbackCell.class, SearchMusicTrendingCell.class, SearchMusicSuggestedCell.class, ExpandSearchHistoryCell.class);
        }
        if (C682080QpC.LIZJ()) {
            ((C681660QoW) view.findViewById(R.id.ucg)).setDismissKeyboardWhenTouch(true);
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv4.addOnItemTouchListener(new C0KFD() { // from class: X.0QoX
                    @Override // X.InterfaceC21676019sM
                    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            C1440005kM.LIZ(new C681910Qov());
                            return false;
                        }
                        return false;
                    }
                });
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("music_suggested_queries");
            if (stringArrayList != null && (true ^ stringArrayList.isEmpty())) {
                this.LLJIJIL = C13LP.LLIIII(stringArrayList);
            }
            this.LLJJI = arguments.getBoolean("get_unlimited_music_only", false);
        }
        if (C681430Qo9.LIZ() && (((InterfaceC681980Qp2) this.LLIZLLLIL.getValue()).getLastSearchSoundPage() == EnumC681490QoF.DISCOVER_PAGE || ((InterfaceC681980Qp2) this.LLIZLLLIL.getValue()).getLastSearchSoundPage() == EnumC681490QoF.SEARCH_RES_PAGE)) {
            str = "return";
        } else {
            str = "enter";
        }
        MR().LL = str;
        C0QNN c0qnn = new C0QNN();
        c0qnn.LJIJJ("change_music_page");
        c0qnn.LJIIZILJ("enter_method", str);
        String str2 = C15IK.LIZ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0qnn.LJFF("search_entrance", str2, c2082308Dt);
        c0qnn.LJFF("creation_id", C15IK.LJ, c2082308Dt);
        c0qnn.LJFF("shoot_way", C15IK.LJIIJJI, c2082308Dt);
        c0qnn.LJIILJJIL();
        SR(EnumC681630QoT.HISTORY_INIT);
        NR();
        if (C682080QpC.LIZJ() && C0BYX.LIZ()) {
            C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, (ViewGroup) view.findViewById(R.id.uc7), 55), 3);
        }
        if (C0BYX.LIZ() && !C682080QpC.LIZJ()) {
            C19EG activity = getActivity();
            if (activity != null) {
                if (isAdded()) {
                    this.LLILZLL = (MusicTrendingViewModel) C1659630tI1.LJII(view, activity, 4).get(MusicTrendingViewModel.class);
                }
                Scene sceneLIZ = C0EBE.LIZ(view);
                LifecycleOwner lifecycleOwner = activity;
                if (sceneLIZ != null) {
                    Scene sceneLIZ2 = C565530MFz.LIZ(sceneLIZ);
                    lifecycleOwner = activity;
                    if (sceneLIZ2 != null) {
                        lifecycleOwner = sceneLIZ2;
                    }
                }
                MusicTrendingViewModel musicTrendingViewModel = this.LLILZLL;
                if (musicTrendingViewModel != null && (nextLiveData = musicTrendingViewModel.LL) != null) {
                    nextLiveData.observe(lifecycleOwner, this.LLJJIII);
                }
                C681610QoR c681610QoR = this.LLILLJJLI;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c681610QoR.LJIILL && c681610QoR.LIZ && !c681610QoR.LIZJ) {
                    c681610QoR.LJ = jCurrentTimeMillis;
                }
                MusicTrendingViewModel musicTrendingViewModel2 = this.LLILZLL;
                if (musicTrendingViewModel2 != null) {
                    musicTrendingViewModel2.vQ2();
                }
            }
        } else if (C681620QoS.LIZLLL() || C681620QoS.LJ()) {
            OR();
        }
        ((InterfaceC681980Qp2) this.LLIZLLLIL.getValue()).setLastSearchSoundPage(EnumC681490QoF.SEARCH_SUG_PAGE);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0QoZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C681270Qnt) obj).LL);
            }
        }, null, new AwS624S0100000_10(this, 39), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C682080QpC.LIZJ()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex9, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex8, viewGroup, false);
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
