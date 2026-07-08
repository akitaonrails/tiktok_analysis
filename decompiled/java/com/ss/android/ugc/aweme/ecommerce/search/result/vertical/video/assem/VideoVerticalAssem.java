package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C0QER;
import X.C0QES;
import X.C0QSR;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1749280vcc;
import X.C1766860w4y;
import X.C1976407og;
import X.C1ER1;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C627260Oiy;
import X.C660320PvC;
import X.C669760QOw;
import X.C674800QdS;
import X.C675340QeK;
import X.C675370QeN;
import X.C683760Qru;
import X.C689720R3q;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.EnumC683800Qry;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import X.InterfaceC494301wD;
import X.InterfaceC660330PvD;
import X.InterfaceC675660Qeq;
import X.InterfaceC684640QtK;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ab.EcVideoSearchConfig;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.VideoVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell.VideoVerticalDynamicHeaderCell;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell.VideoVerticalFooterCell;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell.VideoVerticalItemCell;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm.VideoVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC684640QtK, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJJI = 0;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public View LLJI;
    public VideoVerticalViewModel LLJILLL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 128));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(104));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 129));
    public long LLJJ = -1;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void CO0(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void Jd2(EnumC669620QOi enumC669620QOi, boolean z, Long l) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void Ws0() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void XZ1() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void hf1(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final InterfaceC420801kM iC0(InterfaceC675660Qeq interfaceC675660Qeq) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void j02(String str) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1245798836) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC684640QtK
    public final boolean XM1() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return true;
        }
        List<InterfaceC1891350zJl> listLJII = state.LJII();
        return ((listLJII.isEmpty() ^ true) && (ListProtector.get(listLJII, 0) instanceof C675370QeN)) ? false : true;
    }

    public final SearchResultParam I() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            return iSearchVerticalContext.Tb();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Go(String str) {
        String keyword;
        String enterMethod;
        String enterSearchFrom;
        String strLIZ;
        List<Object> list;
        Long endToEndSession;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        C0QER searchEnterParam3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIJJ();
        }
        VideoVerticalViewModel videoVerticalViewModel = this.LLJILLL;
        if (videoVerticalViewModel != null) {
            videoVerticalViewModel.listClear();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv2);
        }
        VideoVerticalViewModel videoVerticalViewModel2 = this.LLJILLL;
        if (videoVerticalViewModel2 != null) {
            videoVerticalViewModel2.LLIZ = I();
            C669760QOw.LIZ.getClass();
            EcVideoSearchConfig ecVideoSearchConfigLIZ = C669760QOw.LIZ();
            SearchResultParam searchResultParam = videoVerticalViewModel2.LLIZ;
            String strLIZIZ = "";
            if (searchResultParam == null || (keyword = searchResultParam.getKeyword()) == null) {
                keyword = "";
            }
            int i = ecVideoSearchConfigLIZ.requestCount;
            String str2 = ecVideoSearchConfigLIZ.source;
            SearchResultParam searchResultParam2 = videoVerticalViewModel2.LLIZ;
            if (searchResultParam2 == null || (enterMethod = searchResultParam2.getEnterMethod()) == null) {
                enterMethod = "";
            }
            String str3 = ecVideoSearchConfigLIZ.searchChannel;
            SearchResultParam searchResultParam3 = videoVerticalViewModel2.LLIZ;
            if (searchResultParam3 == null || (searchEnterParam3 = searchResultParam3.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam3.getEnterSearchFrom()) == null) {
                enterSearchFrom = "";
            }
            SearchResultParam searchResultParam4 = videoVerticalViewModel2.LLIZ;
            Integer numValueOf = null;
            if (searchResultParam4 != null && (searchEnterParam2 = searchResultParam4.getSearchEnterParam()) != null) {
                strLIZ = C0QSR.LIZ(searchEnterParam2);
            } else {
                strLIZ = null;
            }
            JSONArray jSONArrayLIZ = C1976407og.LIZ(strLIZ);
            if (jSONArrayLIZ != null) {
                list = JsonExtKt.toList(jSONArrayLIZ);
            } else {
                list = null;
            }
            if (list != null) {
                Iterator<Object> it2 = list.iterator();
                while (it2.hasNext()) {
                    String string = it2.next().toString();
                    if (strLIZIZ.length() == 0) {
                        strLIZIZ = string;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(',');
                        sbLIZ.append(string);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            C1ER1 c1er1 = C1ER1.LIZIZ;
            String latestSearchId = c1er1.getLatestSearchId();
            C0QES c0qes = C0QES.LIZ;
            SearchResultParam searchResultParam5 = videoVerticalViewModel2.LLIZ;
            if (searchResultParam5 != null && (searchEnterParam = searchResultParam5.getSearchEnterParam()) != null) {
                endToEndSession = searchEnterParam.getEndToEndSession();
            } else {
                endToEndSession = null;
            }
            Long lLIZ = C0QES.LIZ(c0qes, endToEndSession, false, 6);
            SearchResultParam searchResultParam6 = videoVerticalViewModel2.LLIZ;
            if (searchResultParam6 != null) {
                numValueOf = Integer.valueOf(searchResultParam6.getIsNonPersonalizedSearch());
            }
            C674800QdS c674800QdS = new C674800QdS(keyword, enterMethod, str2, 0, 1, "", latestSearchId, 0L, i, enterSearchFrom, str3, null, null, null, null, null, null, strLIZIZ, null, null, 0, null, null, null, null, lLIZ, null, Integer.valueOf(C683760Qru.LIZIZ(numValueOf, EnumC683800Qry.TT_DSA_SEARCH_CONSENT)), null, null, null, null, null, null, null);
            C1766860w4y.LIZ.getClass();
            c674800QdS.setSearchSessionId(C1766860w4y.LIZIZ("search_session_id"));
            c674800QdS.setSearchContext(c1er1.O());
            if (str != null) {
                c674800QdS.setKeyword(str);
            }
            videoVerticalViewModel2.LLILZLL = c674800QdS;
            videoVerticalViewModel2.manualListRefresh();
        }
        this.LLJJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void ga0(boolean z) {
        Go(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        C675340QeK c675340QeK;
        List listLIZ;
        String aid;
        String aid2;
        C660320PvC c660320PvC;
        Aweme aweme2;
        if (c737030Svd.LIZ == 21) {
            Object obj = c737030Svd.LIZIZ;
            RecyclerView.LayoutManager layoutManager = null;
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            VideoVerticalViewModel videoVerticalViewModel = this.LLJILLL;
            if (videoVerticalViewModel != null && (c675340QeK = (C675340QeK) videoVerticalViewModel.getState()) != null && (listLIZ = C627260Oiy.LIZ(c675340QeK)) != null) {
                Iterator it2 = listLIZ.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC660330PvD interfaceC660330PvD = (InterfaceC660330PvD) it2.next();
                        if ((interfaceC660330PvD instanceof C660320PvC) && (c660320PvC = (C660320PvC) interfaceC660330PvD) != null && (aweme2 = c660320PvC.LLILLJJLI) != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (Intrinsics.LJFF(aid, aid2)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf != null && numValueOf.intValue() > 0) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                    }
                    if ((layoutManager instanceof GridLayoutManager) && layoutManager != null) {
                        layoutManager.scrollToPosition(numValueOf.intValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.msy);
        this.LLJ = (C1749280vcc) view.findViewById(R.id.gh5);
        this.LLJI = view.findViewById(R.id.tf9);
        getActualLifecycleOwner();
        VideoVerticalViewModel videoVerticalViewModel = (VideoVerticalViewModel) new C736950SvV(C13LE.LIZ(VideoVerticalViewModel.class), AFwS187S0000000_2.get$arr$(233), new C452070Ho5(), C724750Sbp.LJII(this), AFwS196S0000000_10.get$arr$(105), AFwS241S0000000_10.get$arr$(488), null, null, null).getValue();
        this.LLJILLL = videoVerticalViewModel;
        AssemViewModel.asyncSubscribe$default(videoVerticalViewModel, new C2217381BqS() { // from class: X.0Sig
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getRefreshState();
            }
        }, null, new AwS589S0100000_10(this, 445), new AwS554S0100000_10(this, 1009), new AwS589S0100000_10(this, 446), 2, null);
        VideoVerticalViewModel videoVerticalViewModel2 = this.LLJILLL;
        if (videoVerticalViewModel2 != null) {
            final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(VideoVerticalItemCell.class, VideoVerticalDynamicHeaderCell.class);
                ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv.getAdapter()).LLLLII(this, VideoVerticalAssem.class);
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 1, viewOnAttachStateChangeListenerC20604515jv.getContext(), false);
                gridLayoutManager.LLIZ = new C689720R3q(viewOnAttachStateChangeListenerC20604515jv, gridLayoutManager, 0);
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
                C20603715jn c20603715jn = new C20603715jn();
                c20603715jn.LIZJ = false;
                c20603715jn.LIZ = 5;
                c20603715jn.LIZLLL = VideoVerticalFooterCell.class;
                viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
                videoVerticalViewModel2.setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
                viewOnAttachStateChangeListenerC20604515jv.LJIIL(videoVerticalViewModel2.getConfig());
                viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AbstractC1585810rMx(viewOnAttachStateChangeListenerC20604515jv, this) { // from class: X.0QOx
                    public final float LL;
                    public final int LLILLJJLI;
                    public final GridLayoutManager LLILLL;
                    public int LLILZ;
                    public final /* synthetic */ VideoVerticalAssem LLILZIL;

                    {
                        GridLayoutManager gridLayoutManager2;
                        this.LLILZIL = this;
                        C669760QOw.LIZ.getClass();
                        this.LL = C0H9H.LIZ(C669760QOw.LIZ().returnToTopDistance);
                        this.LLILLJJLI = 2;
                        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                        if (layoutManager instanceof GridLayoutManager) {
                            gridLayoutManager2 = (GridLayoutManager) layoutManager;
                        } else {
                            gridLayoutManager2 = null;
                        }
                        this.LLILLL = gridLayoutManager2;
                    }

                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                        int iFindFirstVisibleItemPosition;
                        int height;
                        View viewFindViewByPosition;
                        GridLayoutManager gridLayoutManager2 = this.LLILLL;
                        int i3 = 0;
                        if (gridLayoutManager2 != null) {
                            iFindFirstVisibleItemPosition = gridLayoutManager2.findFirstVisibleItemPosition();
                        } else {
                            iFindFirstVisibleItemPosition = 0;
                        }
                        this.LLILZ = iFindFirstVisibleItemPosition / this.LLILLJJLI;
                        GridLayoutManager gridLayoutManager3 = this.LLILLL;
                        if (gridLayoutManager3 != null && (viewFindViewByPosition = gridLayoutManager3.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                            height = (viewFindViewByPosition.getHeight() * this.LLILZ) - viewFindViewByPosition.getTop();
                        } else {
                            height = 0;
                        }
                        View view2 = this.LLILZIL.LLJI;
                        if (view2 != null) {
                            if (height <= this.LL) {
                                i3 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i3, view2);
                        }
                    }
                });
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                C786410Ut5.I7(new AjS65S0100000_10(this, 11), view2);
            }
        }
    }
}
