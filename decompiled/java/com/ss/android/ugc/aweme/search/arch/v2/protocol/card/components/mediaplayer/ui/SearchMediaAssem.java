package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.ui;

import X.AbstractC654530Plr;
import X.AnonymousClass0207;
import X.C07E5;
import X.C0P72;
import X.C0QSJ;
import X.C1010120cOQ;
import X.C1012300cRw;
import X.C10IT;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1823007Ca;
import X.C19252910Tv;
import X.C19EG;
import X.C21565319aV;
import X.C2217381BqS;
import X.C654550Plt;
import X.C655100Pmm;
import X.C656130PoR;
import X.C657210PqB;
import X.C657280PqI;
import X.C657990PrR;
import X.C661470Px3;
import X.C673150Qan;
import X.C679340Qkm;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C723830SaL;
import X.C946803n0;
import X.EnumC657300PqK;
import X.EnumC657370PqR;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC652300PiG;
import X.InterfaceC655080Pmk;
import X.InterfaceC657240PqE;
import X.InterfaceC664630Q5d;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.mask.ui.SearchMediaMaskAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.core.viewmodel.ScreenSpecsViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.ui.SearchAdMediaViewAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.ui.SearchAdTagAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchLiveGameAnchorAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMediaAssem extends ReusedUISlotAssem<SearchMediaAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE>, InterfaceC664630Q5d, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C657210PqB LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final int LLLI;
    public static final int LLLII;
    public static final int LLLIIII;
    public static final int LLLIIIIL;
    public static final int LLLIIIL;
    public static final int LLLIIL;
    public static final int LLLIILIL;
    public static final int LLLIL;
    public static final int LLLILZ;
    public static final int LLLILZJ;
    public static final int LLLILZLLLI;
    public static final int LLLIZZ;
    public static final int LLLJ;
    public static final int LLLJIL;
    public final SearchMediaAssem LLJJLIIIJLLLLLLLZ = this;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C657280PqI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C656130PoR.class, null), checkSupervisorPrepared());
    public FixedRatioFrameLayout LLJLL;
    public SearchRefreshPredictMobCanShowVM LLJLLIL;
    public InterfaceC657240PqE LLJLLL;
    public volatile InterfaceC652300PiG LLJZ;
    public InterfaceC664630Q5d LLJZIJLIL;
    public List<InterfaceC687730QyJ> LLL;
    public InterfaceC665370Q7z LLLF;
    public C0QSJ LLLFF;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0PqB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaAssem.class, "searchHorizontalListAbility", "getSearchHorizontalListAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchHorizontalListAbility;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFFI = new Object() { // from class: X.0PqB
        };
        LLLI = R.id.u8y;
        LLLII = R.id.u94;
        LLLIIII = R.id.u8r;
        LLLIIIIL = R.id.u8q;
        LLLIIIL = R.id.u8s;
        LLLIIL = R.id.u8x;
        LLLIILIL = R.id.u8w;
        LLLIL = R.id.u8l;
        LLLILZ = R.id.u8k;
        LLLILZJ = R.id.u8g;
        LLLILZLLLI = R.id.u8h;
        LLLIZZ = R.id.u8i;
        LLLJ = R.id.u8j;
        LLLJIL = R.id.u8v;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJZIJLIL = (InterfaceC664630Q5d) obj;
            C687700QyG.LJFF(this, this.LLL, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCLASubtitleScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            return this.LLJZIJLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        arrayList.add(SearchGridScope.class);
        arrayList.add(SearchCLASubtitleScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJZIJLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        C654550Plt c654550Plt = (C654550Plt) this.LLJLIL.getValue();
        return (c654550Plt == null || !c654550Plt.LLIZ) ? R.layout.eu6 : R.layout.eue;
    }

    public final C657280PqI op() {
        return (C657280PqI) this.LLJL.getValue();
    }

    @Override // X.InterfaceC664630Q5d
    public final C1012300cRw El() {
        return (C1012300cRw) getContentView().findViewById(R.id.wm6);
    }

    @Override // X.InterfaceC664630Q5d
    public final C661470Px3 X4() {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        View viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility != null ? searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL() : null;
        if (viewLLLLLLLZIL instanceof C661470Px3) {
            return (C661470Px3) viewLLLLLLLZIL;
        }
        return null;
    }

    @Override // X.InterfaceC664630Q5d
    public final TextView m7() {
        return (TextView) getContentView().findViewById(R.id.wm5);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (this.LLJLLIL == null) {
            this.LLJLLIL = C0P72.LIZ(C946803n0.LIZ(LJJIJL()));
        }
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 422));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC664630Q5d.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C19EG c19egLIZ;
        Function0<? extends AbstractC654530Plr> function0;
        AbstractC654530Plr abstractC654530PlrInvoke;
        Size size;
        this.LLJLL = (FixedRatioFrameLayout) view.findViewById(LLLI);
        if (op().LLILLJJLI > 0) {
            C21565319aV.LIZIZ(this.LLJLL, Float.valueOf(op().LLILLJJLI), null, null, null, null, 30);
        }
        EnumC657300PqK enumC657300PqK = op().LL;
        EnumC657300PqK enumC657300PqK2 = EnumC657300PqK.SUB_CARD;
        if (enumC657300PqK == enumC657300PqK2) {
            C654550Plt c654550Plt = (C654550Plt) this.LLJLIL.getValue();
            if (c654550Plt != null && (function0 = c654550Plt.LLILZIL) != null && (abstractC654530PlrInvoke = function0.invoke()) != null && (size = abstractC654530PlrInvoke.LIZ) != null) {
                FixedRatioFrameLayout fixedRatioFrameLayout = this.LLJLL;
                if (fixedRatioFrameLayout != null) {
                    C657990PrR.LIZJ(fixedRatioFrameLayout, new AwS582S0100000_3(size, 88));
                }
                FixedRatioFrameLayout fixedRatioFrameLayout2 = this.LLJLL;
                if (fixedRatioFrameLayout2 != null) {
                    fixedRatioFrameLayout2.setWhRatio(size.getWidth() / size.getHeight());
                }
                FixedRatioFrameLayout fixedRatioFrameLayout3 = this.LLJLL;
                if (fixedRatioFrameLayout3 != null) {
                    fixedRatioFrameLayout3.setMode(0);
                }
            } else if (this.LLJLILLLLZIIL.getValue() != null) {
                FixedRatioFrameLayout fixedRatioFrameLayout4 = this.LLJLL;
                if (fixedRatioFrameLayout4 != null) {
                    C657990PrR.LIZJ(fixedRatioFrameLayout4, AnonymousClass0207.get$arr$(77));
                }
                FixedRatioFrameLayout fixedRatioFrameLayout5 = this.LLJLL;
                if (fixedRatioFrameLayout5 != null) {
                    fixedRatioFrameLayout5.setMode(1);
                }
            }
        }
        if (op().LL == enumC657300PqK2 && C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1 && (c19egLIZ = C657990PrR.LIZ(LJJIJL())) != null) {
            ScreenSpecsViewModel screenSpecsViewModel = (ScreenSpecsViewModel) C679340Qkm.LIZ(LJJIJL(), c19egLIZ).get(ScreenSpecsViewModel.class);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            View viewLJJIJL = LJJIJL();
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(viewLJJIJL, c19egLIZ);
            if (lifecycleOwnerLJIJI != null) {
                screenSpecsViewModel.vQ2().observe(lifecycleOwnerLJIJI, new AObserverS214S0100000_10(this, 109));
            }
        }
        op().getClass();
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC664630Q5d.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLL == null) {
            this.LLL = new ArrayList();
        }
        ((ArrayList) this.LLL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        AwemeRawAd awemeRawAd;
        C654550Plt c654550Plt;
        InterfaceC657240PqE interfaceC657240PqE2 = interfaceC657240PqE;
        this.LLJLLL = interfaceC657240PqE2;
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = interfaceC657240PqE2.getAweme();
        c10it.getClass();
        if (C10IT.LJIIL(aweme)) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaMaskAssem.class), true, null);
        }
        C654550Plt c654550Plt2 = (C654550Plt) this.LLJLIL.getValue();
        if (c654550Plt2 != null && c654550Plt2.LLJIJIL && interfaceC657240PqE2.getAweme().isAd()) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchAdTagAssem.class), true, null);
        }
        if (interfaceC657240PqE2.getAweme().isAd() && op().LLILLL == EnumC657370PqR.VIDEO) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchAdMediaViewAssem.class), true, null);
        }
        InterfaceC655080Pmk anchorType = interfaceC657240PqE2.getAnchorType();
        if (!C1823007Ca.LIZ() && op().LLILLL == EnumC657370PqR.LIVE && !interfaceC657240PqE2.LJJIIZI().getItemVisibility().LIZLLL && (c654550Plt = (C654550Plt) this.LLJLIL.getValue()) != null && c654550Plt.LLJILJIL && (anchorType instanceof C655100Pmm) && ((C655100Pmm) anchorType).LIZ.showDropsTag) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchLiveGameAnchorAssem.class), true, null);
        }
        if (interfaceC657240PqE2.getAweme().isAd() && (awemeRawAd = interfaceC657240PqE2.getAweme().getAwemeRawAd()) != null && C1010120cOQ.LJJIIZI(awemeRawAd)) {
            float width = interfaceC657240PqE2.getRatio().getValue().getWidth() / interfaceC657240PqE2.getRatio().getValue().getHeight();
            FixedRatioFrameLayout fixedRatioFrameLayout = this.LLJLL;
            if (fixedRatioFrameLayout != null) {
                fixedRatioFrameLayout.setWhRatio(width);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
