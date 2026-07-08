package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0HHT;
import X.C0PDE;
import X.C0PDF;
import X.C0Q3E;
import X.C0R45;
import X.C1339950kyP;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1849520yEI;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C23271099x;
import X.C284370BCp;
import X.C435810H7b;
import X.C448250Hhv;
import X.C452501pT;
import X.C643400PLm;
import X.C644560PPy;
import X.C650300Pf2;
import X.C659150PtJ;
import X.C659520Ptu;
import X.C659750PuH;
import X.C660550PvZ;
import X.C660670Pvl;
import X.C660970PwF;
import X.C661170PwZ;
import X.C661180Pwa;
import X.C661190Pwb;
import X.C661200Pwc;
import X.C661330Pwp;
import X.C661470Px3;
import X.C679340Qkm;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC650320Pf4;
import X.InterfaceC661400Pww;
import X.InterfaceC712990Rxx;
import Y.AObserverS175S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SearchInfo;
import com.ss.android.ugc.aweme.feed.model.SearchOutreachDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchPhotoCommentAnchorViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS28S0000100_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class SearchVideoPhotoCommentAnchorAssem<T> extends ReusedUIContentAssem<SearchVideoPhotoCommentAnchorAssem<T>> implements InterfaceC712990Rxx<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final int LLJJJJ = R.id.u7j;
    public C1849520yEI LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public ViewGroup LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public AnonymousClass0956 LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public SearchStateViewModel LLJLLIL;
    public SearchStartViewModel LLJLLL;
    public int LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C660970PwF LLLFFI;
    public final C661200Pwc LLLFZ;
    public final C661180Pwa LLLI;
    public final C0R45 LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoPhotoCommentAnchorAssem.class, "commentAnchorVM", "getCommentAnchorVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchPhotoCommentAnchorViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0PwF] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Pwc] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0Pwa] */
    public SearchVideoPhotoCommentAnchorAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPhotoCommentAnchorViewModel.class);
        this.LLJJJJLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 537), null, AFwS241S0000000_10.get$arr$(248));
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(249));
        this.LLJLL = "";
        this.LLJZ = C644560PPy.LJIJJLI();
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchVideoPhotoCommentAnchorAssem) this, 533));
        this.LLL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchVideoPhotoCommentAnchorAssem) this, 536));
        this.LLLF = C452501pT.LIZIZ(new AwS554S0100000_10((SearchVideoPhotoCommentAnchorAssem) this, 535));
        this.LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10((SearchVideoPhotoCommentAnchorAssem) this, 534));
        this.LLLFFI = new Object() { // from class: X.0PwF
        };
        this.LLLFZ = new InterfaceC661400Pww(this) { // from class: X.0Pwc
            public final /* synthetic */ SearchVideoPhotoCommentAnchorAssem<T> LL;

            {
                this.LL = this;
            }

            @Override // X.InterfaceC661400Pww
            public final void LIZIZ(EnumC661340Pwq enumC661340Pwq) {
                int i = C661210Pwd.LIZ[enumC661340Pwq.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        return;
                    }
                    SearchVideoPhotoCommentAnchorAssem<T> searchVideoPhotoCommentAnchorAssem = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchVideoPhotoCommentAnchorAssem.LLLIIII;
                    searchVideoPhotoCommentAnchorAssem.sp(true);
                    return;
                }
                SearchVideoPhotoCommentAnchorAssem<T> searchVideoPhotoCommentAnchorAssem2 = this.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SearchVideoPhotoCommentAnchorAssem.LLLIIII;
                searchVideoPhotoCommentAnchorAssem2.tp(true);
            }
        };
        this.LLLI = new InterfaceC650320Pf4<C1339950kyP>(this) { // from class: X.0Pwa
            public final /* synthetic */ SearchVideoPhotoCommentAnchorAssem<T> LIZ;

            @Override // X.InterfaceC650320Pf4
            public final Class<C1339950kyP> LIZ() {
                return C1339950kyP.class;
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC650320Pf4
            public final void LIZIZ(C1339950kyP c1339950kyP) {
                SearchOutreachDataStruct searchOutreachDataStruct;
                Comment comment;
                String cid;
                C1339950kyP c1339950kyP2 = c1339950kyP;
                if (C301450Brj.LIZ()) {
                    Comment comment2 = this.LIZ.ip().getState().LL;
                    if (comment2 == null || (cid = comment2.getCid()) == null) {
                        cid = "";
                    }
                    if (!Intrinsics.LJFF(c1339950kyP2.LIZ, cid)) {
                        return;
                    }
                }
                Comment comment3 = this.LIZ.ip().getState().LL;
                Aweme aweme = null;
                if (comment3 != null) {
                    comment3.setDiggCount(c1339950kyP2.LIZJ);
                    comment3.setUserDigged(c1339950kyP2.LIZIZ);
                } else {
                    comment3 = null;
                }
                Aweme aweme2 = this.LIZ.ip().getState().LLILZ;
                if (aweme2 != null) {
                    SearchInfo searchInfo = aweme2.getSearchInfo();
                    if (searchInfo != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && (comment = searchOutreachDataStruct.comment) != null) {
                        comment.setDiggCount(c1339950kyP2.LIZJ);
                        comment.setUserDigged(c1339950kyP2.LIZIZ);
                    }
                    aweme = aweme2;
                }
                SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp = this.LIZ.ip();
                searchPhotoCommentAnchorViewModelIp.getClass();
                if (comment3 != null) {
                    searchPhotoCommentAnchorViewModelIp.setState(new AwS589S0100000_10(comment3, 618));
                }
                SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp2 = this.LIZ.ip();
                searchPhotoCommentAnchorViewModelIp2.getClass();
                if (aweme != null) {
                    searchPhotoCommentAnchorViewModelIp2.setState(new AwS589S0100000_10(aweme, 615));
                }
                ISearchPhotoHolderAbility iSearchPhotoHolderAbility = (ISearchPhotoHolderAbility) this.LIZ.LLLF.getValue();
                if (iSearchPhotoHolderAbility != null) {
                    iSearchPhotoHolderAbility.Ge(c1339950kyP2.LIZIZ, c1339950kyP2.LIZJ);
                }
                ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LIZ.LLL.getValue();
                if (iSearchVideoHolderAbility == null) {
                    return;
                }
                iSearchVideoHolderAbility.Ge(c1339950kyP2.LIZIZ, c1339950kyP2.LIZJ);
            }
        };
        this.LLLII = new C0R45(this, 10);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(T t) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(T t) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public void zp() {
        C661470Px3 c661470Px3X4;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0PuT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C237400vs) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(24), 6);
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LLL.getValue();
        if (iSearchVideoHolderAbility == null || (c661470Px3X4 = iSearchVideoHolderAbility.X4()) == null) {
            return;
        }
        c661470Px3X4.LIZLLL(this.LLLFZ);
    }

    public SearchPhotoCommentAnchorViewModel ip() {
        return (SearchPhotoCommentAnchorViewModel) this.LLJJJJLIIL.getValue(this, LLLIIII[0]);
    }

    public List<InterfaceC650320Pf4<?>> lp() {
        return (List) this.LLJZIJLIL.getValue();
    }

    public final void up() {
        Comment comment;
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLJLILLLLZIIL) {
            return;
        }
        SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp = ip();
        String str = this.LLJLL;
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(LJJIJL());
        searchPhotoCommentAnchorViewModelIp.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C661190Pwb state = searchPhotoCommentAnchorViewModelIp.getState();
        Aweme aweme = state.LLILZ;
        if (aweme != null && (comment = state.LL) != null) {
            C448250Hhv c448250Hhv = new C448250Hhv(comment, aweme);
            C661330Pwp.LIZ(c448250Hhv, state.LLILZ, str, iSearchContextAbilityLIZ);
            c448250Hhv.LJIJI("duration", String.valueOf(jCurrentTimeMillis - state.LLILZLL));
            Comment comment2 = state.LL;
            c448250Hhv.LJIJI("comment_level", String.valueOf(comment2 != null ? comment2.getCommentType() == 1 ? 1 : 2 : -1));
            c448250Hhv.LJIILJJIL();
        }
        this.LLJLILLLLZIIL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        Iterator<InterfaceC650320Pf4<?>> it2 = lp().iterator();
        while (it2.hasNext()) {
            C650300Pf2.LIZLLL.LJFF(it2.next());
        }
    }

    public final void yp() {
        SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp = ip();
        searchPhotoCommentAnchorViewModelIp.getClass();
        searchPhotoCommentAnchorViewModelIp.setState(AFwS241S0000000_10.get$arr$(561));
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        AnonymousClass0956 anonymousClass0956LJ = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(LJJIJL());
        if (lifecycleOwnerLIZ != null) {
            anonymousClass0956LJ = C948503nH.LJ(lifecycleOwnerLIZ, C23271099x.INSTANCE, new C661170PwZ(this, null));
        }
        this.LLJLIL = anonymousClass0956LJ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        up();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        yp();
    }

    public int kp() {
        return this.LLJJJJ;
    }

    public C660970PwF mp() {
        return this.LLLFFI;
    }

    public void cp(Comment comment) {
        String text;
        UrlModel avatarThumb;
        C1849520yEI c1849520yEI = this.LLJJJJJIL;
        if (c1849520yEI != null) {
            if (comment != null) {
                text = comment.getText();
                User user = comment.getUser();
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                }
                C1849520yEI.LJJJJL(c1849520yEI, text, avatarThumb, null, 8);
            }
            text = null;
            avatarThumb = null;
            C1849520yEI.LJJJJL(c1849520yEI, text, avatarThumb, null, 8);
        }
    }

    @InterfaceC1294060jmO
    public void dp(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLJJL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJJL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup2);
    }

    public void ep(View view) {
        this.LLJJL = (ViewGroup) view.findViewById(R.id.u7j);
        this.LLJJJJJIL = (C1849520yEI) view.findViewById(R.id.u7l);
    }

    public final C643400PLm hp(C643400PLm c643400PLm) {
        LinkedHashMap linkedHashMap;
        String cid;
        Map<String, String> map = c643400PLm.LJIIL;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("enter_method", "click_comment_external_exposure");
        Comment comment = ip().getState().LL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        return C643400PLm.LIZ(c643400PLm, cid, false, linkedHashMap, null, 257023);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ISearchPhotoHolderAbility iSearchPhotoHolderAbility;
        NextLiveData<Integer> nextLiveDataYQ2;
        ViewModelProvider viewModelProviderLIZIZ;
        MutableLiveData<Integer> mutableLiveData;
        SearchStateViewModel searchStateViewModel;
        ViewModelProvider viewModelProviderLIZIZ2;
        ISearchVideoHolderAbility iSearchVideoHolderAbility;
        ISearchPhotoHolderAbility iSearchPhotoHolderAbility2;
        ep(view);
        C650300Pf2.LIZLLL.LIZLLL();
        Iterator<InterfaceC650320Pf4<?>> it2 = lp().iterator();
        while (it2.hasNext()) {
            C650300Pf2.LIZLLL.LIZ(it2.next());
        }
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup != null && (iSearchPhotoHolderAbility2 = (ISearchPhotoHolderAbility) this.LLLF.getValue()) != null) {
            iSearchPhotoHolderAbility2.Y50(viewGroup, new C659150PtJ(new AwS446S0200000_10(viewGroup, (ViewGroup) this, (SearchVideoPhotoCommentAnchorAssem<Object>) 10)));
        }
        ViewGroup viewGroup2 = this.LLJJL;
        SearchStartViewModel searchStartViewModel = null;
        if (viewGroup2 != null && (iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LLL.getValue()) != null) {
            iSearchVideoHolderAbility.Bd2(viewGroup2, new C435810H7b(2, null, new AwS446S0200000_10(viewGroup2, (ViewGroup) this, (SearchVideoPhotoCommentAnchorAssem<Object>) 11)));
        }
        ViewGroup viewGroup3 = this.LLJJL;
        if (viewGroup3 != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 28), viewGroup3);
        }
        zp();
        if (this.LLJLLIL == null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
            if (c19egLIZIZ != null && (viewModelProviderLIZIZ2 = C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZIZ)) != null) {
                searchStateViewModel = (SearchStateViewModel) viewModelProviderLIZIZ2.get(SearchStateViewModel.class);
            } else {
                searchStateViewModel = null;
            }
            this.LLJLLIL = searchStateViewModel;
        }
        SearchStateViewModel searchStateViewModel2 = this.LLJLLIL;
        if (searchStateViewModel2 != null && (mutableLiveData = searchStateViewModel2.searchState) != null) {
            C0PDE c0pde = new C0PDE();
            c0pde.LL = new C0PDF(this) { // from class: X.0Pwh
                public final /* synthetic */ SearchVideoPhotoCommentAnchorAssem<Object> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C0PDF
                public final void LIZ() {
                }

                @Override // X.C0PDF
                public final void LLFF() {
                }

                @Override // X.C0PDF
                public final void LIZIZ(boolean z) {
                    if (!z) {
                        this.LIZ.up();
                    }
                }
            };
            mutableLiveData.observe(this, c0pde);
        }
        if (this.LLJLLL == null) {
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(view.getContext());
            if (c19egLIZIZ2 != null && (viewModelProviderLIZIZ = C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZIZ2)) != null) {
                searchStartViewModel = (SearchStartViewModel) viewModelProviderLIZIZ.get(SearchStartViewModel.class);
            }
            this.LLJLLL = searchStartViewModel;
        }
        SearchStartViewModel searchStartViewModel2 = this.LLJLLL;
        if (searchStartViewModel2 != null && (nextLiveDataYQ2 = searchStartViewModel2.yQ2()) != null) {
            nextLiveDataYQ2.observe(this, new AObserverS175S0200000_10(view, this, 5));
        }
        C660970PwF c660970PwFMp = mp();
        if (c660970PwFMp != null && (iSearchPhotoHolderAbility = (ISearchPhotoHolderAbility) this.LLLF.getValue()) != null) {
            iSearchPhotoHolderAbility.gE2(c660970PwFMp);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Pwg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C661190Pwb) obj).LLIZ);
            }
        }, C736820SvI.LJ(), AFwS293S0000000_10.get$arr$(25), 4);
        op(view);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Pwi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C661190Pwb) obj).LL;
            }
        }, C736820SvI.LJ(), new AwS624S0100000_10(view, 101), 4);
    }

    public void op(View view) {
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Pwf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C661190Pwb) obj).LLILLL);
            }
        }, C736820SvI.LJ(), new AwS624S0100000_10(view, 57), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: rr */
    public void up(T t) {
        C659750PuH c659750PuH;
        C659520Ptu c659520Ptu = null;
        if (t instanceof C659520Ptu) {
            c659520Ptu = (C659520Ptu) t;
        }
        if (c659520Ptu != null) {
            if (c659520Ptu.LLILLL instanceof C660670Pvl) {
                ip().wQ2(c659520Ptu);
                ip().zQ2(true);
            } else {
                ip().zQ2(false);
            }
            this.LLJLL = c659520Ptu.LLILLJJLI;
        }
        if ((t instanceof C659750PuH) && (c659750PuH = (C659750PuH) t) != null) {
            if (c659750PuH.LLILLL instanceof C660550PvZ) {
                ip().xQ2(c659750PuH);
                ip().zQ2(true);
            } else {
                ip().zQ2(false);
            }
            this.LLJLL = c659750PuH.LLILLJJLI.LJIIIIZZ;
        }
    }

    public void sp(boolean z) {
        C661190Pwb state = ip().getState();
        if (C284370BCp.LIZ() && ip().LL != 0) {
            return;
        }
        if (!C284370BCp.LIZ() && state.LLIZLLLIL != 0) {
            return;
        }
        ip().vQ2(this.LLJLL, C0Q3E.LIZ(LJJIJL()));
        if (z) {
            if (state.LLJI instanceof C660670Pvl) {
                C1849520yEI c1849520yEI = this.LLJJJJJIL;
                if (c1849520yEI != null) {
                    c1849520yEI.setMaxLines(2);
                }
                C1849520yEI c1849520yEI2 = this.LLJJJJJIL;
                if (c1849520yEI2 != null) {
                    c1849520yEI2.LJJJJLI();
                }
                ip().yQ2(1);
                return;
            }
            return;
        }
        if (state.LLJIJIL instanceof C660550PvZ) {
            C1849520yEI c1849520yEI3 = this.LLJJJJJIL;
            if (c1849520yEI3 != null) {
                c1849520yEI3.setMaxLines(2);
            }
            C1849520yEI c1849520yEI4 = this.LLJJJJJIL;
            if (c1849520yEI4 != null) {
                c1849520yEI4.LJJJJLI();
            }
            ip().yQ2(1);
        }
    }

    public void tp(boolean z) {
        C661190Pwb state = ip().getState();
        if (C284370BCp.LIZ() && ip().LL != 1) {
            return;
        }
        if (!C284370BCp.LIZ() && state.LLIZLLLIL != 1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (state.LLJI instanceof C660670Pvl) {
                C1849520yEI c1849520yEI = this.LLJJJJJIL;
                if (c1849520yEI != null) {
                    c1849520yEI.setMaxLines(1);
                }
                C1849520yEI c1849520yEI2 = this.LLJJJJJIL;
                if (c1849520yEI2 != null) {
                    c1849520yEI2.LJJJJLI();
                }
                ip().yQ2(0);
                SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp = ip();
                searchPhotoCommentAnchorViewModelIp.getClass();
                searchPhotoCommentAnchorViewModelIp.setState(new AwS28S0000100_10(jCurrentTimeMillis, 3));
                return;
            }
            return;
        }
        if (state.LLJIJIL instanceof C660550PvZ) {
            C1849520yEI c1849520yEI3 = this.LLJJJJJIL;
            if (c1849520yEI3 != null) {
                c1849520yEI3.setMaxLines(1);
            }
            C1849520yEI c1849520yEI4 = this.LLJJJJJIL;
            if (c1849520yEI4 != null) {
                c1849520yEI4.LJJJJLI();
            }
            ip().yQ2(0);
            SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp2 = ip();
            searchPhotoCommentAnchorViewModelIp2.getClass();
            searchPhotoCommentAnchorViewModelIp2.setState(new AwS28S0000100_10(jCurrentTimeMillis, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
