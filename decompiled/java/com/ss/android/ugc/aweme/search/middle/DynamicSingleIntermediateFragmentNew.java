package com.ss.android.ugc.aweme.search.middle;

import X.AnonymousClass0352;
import X.C01GW;
import X.C07BH;
import X.C098200Yq;
import X.C099G;
import X.C0BC8;
import X.C0BRK;
import X.C0BRO;
import X.C0BYY;
import X.C0FNT;
import X.C0P5A;
import X.C0PCY;
import X.C0PEM;
import X.C0PM7;
import X.C0PRC;
import X.C0PS4;
import X.C0PSI;
import X.C0PUQ;
import X.C0PYE;
import X.C0PZW;
import X.C0Q2M;
import X.C0Q2N;
import X.C0Q2T;
import X.C0Q2Y;
import X.C0Q39;
import X.C0Q3E;
import X.C0Q3H;
import X.C0Q3N;
import X.C0Q8L;
import X.C0QB3;
import X.C0QBD;
import X.C0QER;
import X.C0QG6;
import X.C0QGO;
import X.C0QGS;
import X.C0QGT;
import X.C0QGU;
import X.C0QGV;
import X.C0QGW;
import X.C0QGX;
import X.C0QGY;
import X.C0QH6;
import X.C0QH7;
import X.C0QH8;
import X.C0QJ5;
import X.C0QJ6;
import X.C0QJN;
import X.C0QJX;
import X.C0QJY;
import X.C0QKB;
import X.C0QKC;
import X.C0QKL;
import X.C0QKM;
import X.C0QNZ;
import X.C0QPJ;
import X.C0QQF;
import X.C0R4D;
import X.C1205904nh;
import X.C1255704vj;
import X.C12ES;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C1537480q70;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1766870w4z;
import X.C1820507Bb;
import X.C1837507Hp;
import X.C189200o6;
import X.C1935507i5;
import X.C19EG;
import X.C1AF0;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C262100zr;
import X.C270840AjS;
import X.C271610Akh;
import X.C284170BBv;
import X.C286150BJl;
import X.C293280BeY;
import X.C293720BfG;
import X.C294780Bgy;
import X.C301160BrG;
import X.C301520Brq;
import X.C313790CRt;
import X.C448040Hha;
import X.C452501pT;
import X.C484220Iyq;
import X.C487280J9a;
import X.C496570Jdf;
import X.C640270P9l;
import X.C640390P9x;
import X.C640800PBm;
import X.C641960PFy;
import X.C644560PPy;
import X.C646000PVm;
import X.C647340PaG;
import X.C647380PaK;
import X.C649160PdC;
import X.C649190PdF;
import X.C649290PdP;
import X.C649300PdQ;
import X.C649390PdZ;
import X.C649470Pdh;
import X.C649490Pdj;
import X.C650270Pez;
import X.C650500PfM;
import X.C650940Pg4;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C653690PkV;
import X.C663990Q2r;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C666000QAk;
import X.C666380QBw;
import X.C666750QDh;
import X.C666920QDy;
import X.C667500QGe;
import X.C667540QGi;
import X.C667550QGj;
import X.C667560QGk;
import X.C667590QGn;
import X.C667600QGo;
import X.C667630QGr;
import X.C667640QGs;
import X.C667670QGv;
import X.C667700QGy;
import X.C667750QHd;
import X.C667770QHf;
import X.C668200QIw;
import X.C668300QJg;
import X.C669090QMh;
import X.C669560QOc;
import X.C672110QXx;
import X.C673080Qag;
import X.C680370QmR;
import X.C723850SaN;
import X.C7740030o;
import X.C7837034h;
import X.C786410Ut5;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC1141530foN;
import X.InterfaceC1541990qEH;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC487330J9f;
import X.InterfaceC497601wk;
import X.InterfaceC663910Q2j;
import X.InterfaceC665370Q7z;
import X.InterfaceC667070QEn;
import X.InterfaceC668720QKw;
import X.InterfaceC669910QPl;
import X.InterfaceC669970QPr;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewTreeObserverOnPreDrawListenerC667660QGu;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS43S0300000_10;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.config.SearchMusicHistoryOptConfig;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinViewModelBridgeService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.IncentiveDetailInfo;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.SearchIncentiveTaskScene;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.SearchIncentiveTaskType;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveMultiDayService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService;
import com.ss.android.ugc.aweme.search.entry.eventcard.utils.LynxQueryProcessor;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.search.performance.core.config.HistoryAheadPrefetchConfig;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSingleIntermediateFragmentNew extends AbstractSearchIntermediateFragmentNew implements InterfaceC669970QPr, C0QH8, InterfaceC1141530foN, InterfaceC487330J9f, GenericLifecycleObserver {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGshICs3JCHELIOSBiDTY9KSglKhw6JiIgLAY9PCA+JCo3ISQ4LAkhKSIhLCEnBiA7";
    public C649290PdP LLJZ;
    public boolean LLJZIJLIL;
    public C1389910mGz LLL;
    public TemplateData LLLF;
    public SuggestWordsViewModel LLLFFI;
    public int LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public final String LLLIIIIL;
    public boolean LLLIIIL;
    public final CountDownLatch LLLIIL;
    public C099G LLLIILIL;
    public final C01GW LLLIL;
    public boolean LLLILZ;
    public String LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public final C01GW LLLL;
    public final AObserverS214S0100000_10 LLLLII;
    public final AObserverS214S0100000_10 LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public final DynamicSingleIntermediateFragmentNew LLLLIILLL;
    public final ArrayList<TemplateData> LLLFF = new ArrayList<>();
    public final Gson LLLFZ = C7740030o.LIZ().getGson();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void BS() {
        if (this.LLLLIIL) {
            if (((Number) C301520Brq.LIZ.getValue()).intValue() > 0 && C0QGV.LIZ() && C0QGU.LIZ() == C0QGW.ROUND) {
                Boolean bool = OR().LLIZ;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    try {
                        if (getActivity() != null) {
                            C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 447), 3);
                            OR().LLIZ = bool2;
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        } else if (this.LLLLIILL) {
            ES();
        }
        this.LLLLIILL = false;
        this.LLLLIIL = false;
    }

    public final void FS() {
        Map<String, Integer> map = C0QGT.LIZ;
        List<SearchHistory> listCS = cS();
        C666380QBw.LIZ.getClass();
        int i = 0;
        if (C666380QBw.LIZ().enableSmartPrefetch > 0) {
            C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(listCS, this, 100));
        }
        List<SearchHistory> listCS2 = cS();
        C667550QGj.LIZ.getClass();
        if (((HistoryAheadPrefetchConfig) C667550QGj.LIZJ.getValue()).enableSmartPrefetch > 0) {
            for (Object obj : C13LP.LL(listCS2, C0QGT.LJIIIIZZ)) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                SearchHistory searchHistory = (SearchHistory) obj;
                long j = C0QGT.LJIIIZ;
                Context context = getContext();
                if (context != null) {
                    C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new ARunnableS43S0300000_10(searchHistory, context, this, 29));
                }
                i = i2;
            }
        }
    }

    public final void PS() throws Throwable {
        View viewLIZIZ;
        ViewTreeObserver viewTreeObserver;
        C667590QGn.LIZ.getClass();
        if (C667590QGn.LIZ()) {
            return;
        }
        C0QGO.LIZ.getClass();
        Pair pairLJFF = C0QGO.LJFF();
        if (pairLJFF == null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            SAFHelper.LIZJ(this, activity);
            return;
        }
        this.LLJZ = (C649290PdP) pairLJFF.getFirst();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init dynamicViewsContainer Finished:");
        C649290PdP c649290PdP = this.LLJZ;
        if (c649290PdP == null) {
            c649290PdP = null;
        }
        sbLIZ.append(c649290PdP);
        C2188811AlT.LIZIZ(sbLIZ);
        C649290PdP c649290PdP2 = this.LLJZ;
        if (c649290PdP2 != null && (viewLIZIZ = c649290PdP2.LIZIZ()) != null && (viewTreeObserver = viewLIZIZ.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC667660QGu viewTreeObserverOnPreDrawListenerC667660QGu = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0QGu
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC667660QGu);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC667660QGu, ViewTreeObserver.OnPreDrawListener.class);
        }
        SearchMiddleMonitor.INSTANCE.setDynamicContainerInit(true);
        this.LLJZIJLIL = true;
    }

    public final boolean QS() {
        return ((Boolean) this.LLLIL.getValue()).booleanValue();
    }

    public final void US() {
        if (((Number) C271610Akh.LIZ.getValue()).intValue() == 1 && (getParentFragment() instanceof SearchResultFragmentNew) && getParentFragmentManager().LJJJJZI("Container") == null) {
            C786410Ut5.f3(new C0R4D(this, 0), Looper.myQueue());
        }
    }

    @Override // X.InterfaceC669970QPr
    public final C649290PdP a0() {
        C649290PdP c649290PdP = this.LLJZ;
        if (c649290PdP == null) {
            return null;
        }
        return c649290PdP;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kS() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.kS():void");
    }

    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew
    public final boolean nS() {
        C0QJ6 c0qj6LIZ;
        Integer numValueOf;
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ;
        C0QJ6 c0qj6LIZ2;
        InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
        if (!((interfaceC668720QKw == null || (c0qj6LIZ2 = interfaceC668720QKw.LIZ()) == null || c0qj6LIZ2.LIZ() != 1) ? false : true)) {
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LIZLLL()) {
                dS();
                ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR = AbstractSearchIntermediateFragmentNew.VR();
                if (iSearchBlankPageCoinTaskServiceVR != null) {
                    iSearchBlankPageCoinTaskServiceVR.LJIIZILJ(this, false);
                }
            }
            ISearchIncentiveTaskBridgeService.LIZ.getClass();
            ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ2 = C641960PFy.LIZ();
            if ((iSearchIncentiveTaskBridgeServiceLIZ2 != null ? iSearchIncentiveTaskBridgeServiceLIZ2.getTaskType() : null) == SearchIncentiveTaskType.COUPON_V2 && (iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ()) != null) {
                iSearchIncentiveTaskBridgeServiceLIZ.LJIIIIZZ(this, false, getActivity());
            }
        }
        InterfaceC668720QKw interfaceC668720QKw2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC668720QKw2 == null || (c0qj6LIZ = interfaceC668720QKw2.LIZ()) == null || (numValueOf = Integer.valueOf(c0qj6LIZ.LIZ())) == null) {
            return false;
        }
        if (numValueOf.intValue() == 2) {
            if (RR().getVisibility() == 0) {
                C786410Ut5.LJLZ(4, RR());
                C496570Jdf c496570Jdf = this.LLILZLL;
                if (c496570Jdf != null) {
                    int visibility = c496570Jdf.getVisibility();
                    c496570Jdf.setVisibility(4);
                    C1602160rnK.LIZIZ(visibility, 4, c496570Jdf);
                }
            }
        } else if (numValueOf.intValue() == 0) {
            if (RR().getVisibility() == 0) {
                C786410Ut5.LJLZ(4, RR());
            }
            C1389910mGz c1389910mGz = this.LLL;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
        } else if (numValueOf.intValue() == 1 && PR().getVisibility() == 0) {
            C786410Ut5.LLIZLLLIL(PR(), 4);
            View view = this.LLILLJJLI;
            int i = 8;
            if (view != null) {
                ISearchBlankPageCoinTaskService.LIZ.getClass();
                ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceLIZ = C650270Pez.LIZ();
                C786410Ut5.LJLLLLLL((iSearchBlankPageCoinTaskServiceLIZ == null || !iSearchBlankPageCoinTaskServiceLIZ.LJIILLIIL()) ? 8 : 4, view);
            }
            View view2 = this.LLILLL;
            if (view2 != null) {
                ISearchIncentiveTaskBridgeService.LIZ.getClass();
                ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ3 = C641960PFy.LIZ();
                if (iSearchIncentiveTaskBridgeServiceLIZ3 != null && iSearchIncentiveTaskBridgeServiceLIZ3.canShowBanner()) {
                    i = 4;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
            C496570Jdf c496570Jdf2 = this.LLILZLL;
            if (c496570Jdf2 != null) {
                int visibility2 = c496570Jdf2.getVisibility();
                c496570Jdf2.setVisibility(4);
                C1602160rnK.LIZIZ(visibility2, 4, c496570Jdf2);
            }
        }
        return super.nS();
    }

    public DynamicSingleIntermediateFragmentNew() {
        new BPEAHandler();
        this.LLLI = -1;
        this.LLLII = true;
        this.LLLIIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 347));
        C0Q2M.LIZ.getClass();
        this.LLLIIIIL = C0Q2M.LJIIL();
        this.LLLIIL = new CountDownLatch(1);
        this.LLLIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(238));
        this.LLLILZJ = "";
        this.LLLILZLLLI = "";
        this.LLLIZZ = "";
        this.LLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 348));
        this.LLLLII = new AObserverS214S0100000_10(this, 28);
        this.LLLLIIIILLL = new AObserverS214S0100000_10(this, 27);
        this.LLLLIILLL = this;
    }

    public final void ES() {
        if (C0QGU.LIZ() == C0QGW.NONE) {
            boolean zLIZJ = C650500PfM.LIZJ(C640270P9l.LIZJ(this, getActivity()));
            if (C667500QGe.LIZ().getValue() <= C0QGY.DEFAULT.getValue() || !C0BYY.LIZ(zLIZJ)) {
                return;
            }
            try {
                if (getActivity() != null) {
                    C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 162), 3);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void VS() {
        if (C286150BJl.LIZ() == 2 || C286150BJl.LIZ() == 3) {
            return;
        }
        C0PUQ.LIZ.getClass();
        if (((SearchPreloadLayoutOptConfig) C0PUQ.LIZJ.getValue()).enablePreload) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Context context = getContext();
            C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
            sAFHelper.getClass();
            Context contextLJI = SAFHelper.LJI(this, c19egLIZIZ);
            if (this.LLLIIIL) {
                return;
            }
            this.LLLIIIL = true;
            if (contextLJI != null) {
                C653690PkV.LIZ.getClass();
                C653690PkV.LIZLLL(contextLJI);
                C653690PkV.LIZ(contextLJI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS() {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.PR()
            r5 = 0
            X.C786410Ut5.LLIZLLLIL(r0, r5)
            java.lang.String r3 = r6.WR()
            X.0Pez r0 = com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService r1 = X.C650270Pez.LIZ()
            if (r1 == 0) goto L1c
            android.view.View r0 = r6.LLILLJJLI
            r1.LJFF(r0, r3)
        L1c:
            X.0PFy r0 = com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService r1 = X.C641960PFy.LIZ()
            if (r1 == 0) goto L2c
            android.view.View r0 = r6.LLILLL
            r1.LJIIJJI(r0, r3)
        L2c:
            X.0QMf r0 = r6.LLJILJIL
            r4 = 1
            if (r0 == 0) goto La8
            X.0QMf r0 = r6.bS()
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto La8
            r2 = 1
        L3c:
            r1 = 8
            if (r2 == 0) goto L96
            com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService r0 = X.C650270Pez.LIZ()
            if (r0 == 0) goto L96
            boolean r0 = r0.LJIILLIIL()
            if (r0 != r4) goto L96
            android.view.View r0 = r6.LLILLJJLI
            if (r0 == 0) goto L53
            X.C786410Ut5.LJLLLLLL(r5, r0)
        L53:
            com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService r0 = X.C641960PFy.LIZ()
            if (r0 == 0) goto La0
            boolean r0 = r0.canShowBanner()
            if (r0 != r4) goto La0
            android.view.View r0 = r6.LLILLL
            if (r0 == 0) goto L66
            X.C786410Ut5.LJLLLLLL(r5, r0)
        L66:
            com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService r1 = X.C650270Pez.LIZ()
            if (r1 == 0) goto L71
            android.view.View r0 = r6.LLILLJJLI
            r1.LJIJ(r0, r3)
        L71:
            com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService r1 = X.C641960PFy.LIZ()
            if (r1 == 0) goto L7c
            android.view.View r0 = r6.LLILLL
            r1.LJIIIZ(r0, r3)
        L7c:
            android.view.ViewGroup r0 = r6.RR()
            r2 = 4
            X.C786410Ut5.LJLZ(r2, r0)
            X.0Jdf r1 = r6.LLILZLL
            if (r1 == 0) goto L92
            int r0 = r1.getVisibility()
            r1.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r1)
        L92:
            super.mS()
            return
        L96:
            android.view.View r0 = r6.LLILLJJLI
            if (r0 == 0) goto L9d
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L9d:
            if (r2 == 0) goto La0
            goto L53
        La0:
            android.view.View r0 = r6.LLILLL
            if (r0 == 0) goto L66
            X.C786410Ut5.LJLLLLLL(r1, r0)
            goto L66
        La8:
            r2 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.mS():void");
    }

    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws Throwable {
        C496570Jdf c496570Jdf;
        Context context;
        C649290PdP c649290PdP;
        C649290PdP c649290PdP2;
        C099G c099g;
        C680370QmR.LJII();
        super.onDestroy();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG activity = getActivity();
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(this, activity);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJJIJLIJ, IntermediateAbility.class, null);
        }
        EventBus.LIZLLL().LJJI(this);
        ISearchCoinTaskControlService.LIZ.getClass();
        ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ = C0QBD.LIZ();
        if (iSearchCoinTaskControlServiceLIZ != null) {
            iSearchCoinTaskControlServiceLIZ.LJIILJJIL();
            C1548820qPI.LJIIIIZZ("event_claim_search_coin_task_success", this);
        }
        if (QS() && (c099g = this.LLLIILIL) != null) {
            c099g.LIZIZ(null);
        }
        if (this.LLILZIL != null) {
            C786410Ut5.LJJJJI(RR());
        }
        if (C0QGV.LIZ()) {
            OR().LLIZ = null;
        }
        if (C0BRO.LIZ() && (c649290PdP2 = this.LLJZ) != null) {
            c649290PdP2.LJIIIIZZ();
        }
        this.LLLF = null;
        this.LLLFF.clear();
        if (C293720BfG.LIZ() && (c649290PdP = this.LLJZ) != null) {
            c649290PdP.LJIJJ = null;
        }
        if (C1820507Bb.LIZIZ && (context = getContext()) != null && C0FNT.LIZ(context) != null) {
            C487280J9a.LIZJ(this);
        }
        if (!C07BH.LIZIZ || (c496570Jdf = this.LLILZLL) == null) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c496570Jdf, null);
        c496570Jdf.removeAllViews();
    }

    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() throws Throwable {
        super.onPause();
        SearchMiddleMonitor.INSTANCE.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[PHI: r7
      0x0120: PHI (r7v2 X.0QKM) = (r7v1 X.0QKM), (r7v5 X.0QKM) binds: [B:69:0x011d, B:40:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.onResume():void");
    }

    @Override // X.C0QH8
    public final InterfaceC669970QPr Tn() {
        return this.LLLLIILLL;
    }

    public final void JS(HashMap<?, ?> map) {
        int i;
        Map<?, ?> map2;
        TemplateData templateDataLJII;
        C649300PdQ c649300PdQ;
        InterfaceC1541990qEH interfaceC1541990qEH;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        String url;
        C649300PdQ c649300PdQ2;
        C1537480q70 hybridContext;
        C664000Q2s c664000Q2s;
        Integer numValueOf;
        InterfaceC668720QKw interfaceC668720QKw;
        C0QJ5 c0qj5LIZJ;
        SuggestWordResponse suggestWordResponse;
        String str;
        List<Pair<Integer, String>> list;
        C667750QHd c667750QHd = new C667750QHd(this, this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (ComplianceServiceProvider.LJI().P9()) {
            linkedHashMap.put("enable_manage_search_entry", 1);
        }
        if (C673080Qag.LIZIZ() && C1255704vj.LIZ().LJJJ()) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("enable_visual_search", Integer.valueOf(i));
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("isPreload", bool);
        linkedHashMap.put("disable_first_refresh", Boolean.valueOf(this.LLLJL));
        linkedHashMap.put("isFromCache", bool);
        if (map == null) {
            Map<?, ?> map3 = ((C667700QGy) c667750QHd.LIZJ().LIZIZ()).LIZIZ;
            linkedHashMap.put("isCachedSuggestWords", 1);
            map2 = map3;
        } else {
            c667750QHd.LIZ(new C0QGX(map));
            linkedHashMap.put("isCachedSuggestWords", 0);
            map2 = map;
        }
        linkedHashMap.put("guessSearchData", map2);
        C1537480q70 sparkContext = null;
        if (Intrinsics.LJFF(map2.get("qrec_virtual_enable"), "1")) {
            C0Q2M c0q2m = C0Q2M.LIZ;
            String str2 = this.LLLIIIIL;
            c0q2m.getClass();
            C0Q2M.LJIIIIZZ(str2, true);
            String strLJIIZILJ = C0Q2M.LJIIZILJ();
            Map<String, C0Q2N> map4 = C0Q2M.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIIZILJ);
            sbLIZ.append(this.LLLIIIIL);
            C0Q2N c0q2n = (C0Q2N) ((LinkedHashMap) map4).get(C2188811AlT.LIZIZ(sbLIZ));
            if (c0q2n != null && (list = c0q2n.LJFF) != null) {
                list.clear();
            }
            try {
                suggestWordResponse = (SuggestWordResponse) GsonProtectorUtils.fromJson(this.LLLFZ, GsonProtectorUtils.toJsonTree(this.LLLFZ, map2), SuggestWordResponse.class);
            } catch (o e) {
                TryCatchGuardChecker.doCheck(e);
                suggestWordResponse = null;
            }
            C0Q3H.LIZ = c0q2n;
            if (c0q2n != null) {
                if (suggestWordResponse != null) {
                    str = suggestWordResponse.logId;
                } else {
                    str = null;
                }
                c0q2n.LJII = str;
                c0q2n.LJIIZILJ = System.currentTimeMillis();
                c0q2n.LJIJ = System.currentTimeMillis();
            }
        }
        linkedHashMap.put("latestGroupId", ((C667770QHf) c667750QHd.LIZIZ().LIZIZ()).LIZLLL);
        linkedHashMap.put("totalPlayTime", Long.valueOf(((C667770QHf) c667750QHd.LIZIZ().LIZIZ()).LJII / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        linkedHashMap.put("hasEffectiveClick", Integer.valueOf(((C667770QHf) c667750QHd.LIZIZ().LIZIZ()).LIZJ ? 1 : 0));
        linkedHashMap.put("lastFromGroupId", this.LLLIIIIL);
        linkedHashMap.put("lastFeedGroupId", ((C0PM7) C0Q3E.LIZIZ(this).uF().LIZJ()).LLILLL);
        C0QJY c0qjy = C0QJY.LIZ;
        C19EG activity = getActivity();
        c0qjy.getClass();
        linkedHashMap.put("new_sug_session_id", C0QJY.LIZ(this, activity));
        C0QJY.LJ(3);
        linkedHashMap.put("is_non_personalized_search", Integer.valueOf(ComplianceServiceProvider.LJI().LJJII() ? 1 : 0));
        linkedHashMap.put("is_hide_engagement_data", Integer.valueOf(C666750QDh.LIZ() ? 1 : 0));
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity2 = getActivity();
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, activity2);
        if (c650960Pg6LJII != null && (c664000Q2s = c650960Pg6LJII.searchCommonModel) != null && (numValueOf = Integer.valueOf(c664000Q2s.feedSearchBarFlag)) != null && numValueOf.intValue() == 2 && ((interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ) == null || (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) == null || !c0qj5LIZJ.LIZIZ())) {
            linkedHashMap.put("is_from_outside", 1);
        }
        try {
            C649290PdP c649290PdP = this.LLJZ;
            if (c649290PdP == null) {
                c649290PdP = null;
            }
            if ((c649290PdP instanceof C649300PdQ) && (c649300PdQ = (C649300PdQ) c649290PdP) != null && (((interfaceC1541990qEH = c649300PdQ.LJIL) != null && (url = interfaceC1541990qEH.getSchema()) != null) || ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649300PdQ.LJIILIIL) != null && (url = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl()) != null))) {
                HashMap map5 = new HashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        map5.put(entry.getKey(), value);
                    }
                }
                C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
                C649290PdP c649290PdP2 = this.LLJZ;
                if (c649290PdP2 == null) {
                    c649290PdP2 = null;
                }
                if ((c649290PdP2 instanceof C649300PdQ) && (c649300PdQ2 = (C649300PdQ) c649290PdP2) != null) {
                    InterfaceC1541990qEH interfaceC1541990qEH2 = c649300PdQ2.LJIL;
                    if (interfaceC1541990qEH2 != null && (hybridContext = interfaceC1541990qEH2.getHybridContext()) != null) {
                        sparkContext = hybridContext;
                    } else {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c649300PdQ2.LJIILIIL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
                        }
                    }
                }
                c647380PaK.getClass();
                if (C0PZW.LIZ(url)) {
                    C647340PaG c647340PaG = new C647340PaG(map5);
                    c647340PaG.LIZ(sparkContext);
                    templateDataLJII = c647340PaG.LIZIZ(url);
                } else {
                    templateDataLJII = TemplateData.LJII(map5);
                }
            } else {
                templateDataLJII = TemplateData.LJII(linkedHashMap);
            }
            templateDataLJII.LIZJ = "guessSearchDataProcess";
            if (QS()) {
                XS(new AwS411S0200000_10(this, templateDataLJII, 29));
            } else {
                YS(templateDataLJII);
            }
            this.LLLJL = false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "search_update_recom");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020a A[Catch: Exception -> 0x021c, TryCatch #0 {Exception -> 0x021c, blocks: (B:79:0x0204, B:81:0x020a, B:82:0x0214, B:83:0x0217), top: B:88:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0217 A[Catch: Exception -> 0x021c, TryCatch #0 {Exception -> 0x021c, blocks: (B:79:0x0204, B:81:0x020a, B:82:0x0214, B:83:0x0217), top: B:88:0x0204 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NS(com.ss.android.ugc.aweme.discover.model.suggest.RecomDataWrapper r11) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.NS(com.ss.android.ugc.aweme.discover.model.suggest.RecomDataWrapper):void");
    }

    public final void XS(Function0 function0) {
        Object obj;
        View viewLIZIZ;
        int iHashCode;
        C649290PdP c649290PdP = this.LLJZ;
        if (c649290PdP != null) {
            if (c649290PdP instanceof C649300PdQ) {
                viewLIZIZ = c649290PdP.LIZIZ();
            } else {
                viewLIZIZ = null;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C649390PdZ.LIZ.getValue();
            if (viewLIZIZ != null) {
                iHashCode = viewLIZIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            obj = concurrentHashMap.get(Integer.valueOf(iHashCode));
        } else {
            obj = Boolean.FALSE;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            function0.invoke();
        } else {
            this.LLLIILIL = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C448040Hha(this, function0, "guess_search", null), 3);
        }
    }

    public final void YS(TemplateData templateData) {
        TemplateData templateData2;
        C649290PdP c649290PdP = this.LLJZ;
        C649290PdP c649290PdP2 = null;
        if (c649290PdP != null && (templateData2 = c649290PdP.LJIIZILJ) != null) {
            templateData.LJIJJLI(templateData2);
            C649290PdP c649290PdP3 = this.LLJZ;
            if (c649290PdP3 == null) {
                c649290PdP3 = null;
            }
            c649290PdP3.LJIIZILJ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("__lynx_timing_actual_fmp_");
        sbLIZ.append(System.currentTimeMillis());
        templateData.LJIILIIL("__lynx_timing_flag", C2188811AlT.LIZIZ(sbLIZ));
        if (C0BRO.LIZ()) {
            C649290PdP c649290PdP4 = this.LLJZ;
            if (c649290PdP4 != null) {
                c649290PdP4.LIZLLL(templateData);
                C649290PdP c649290PdP5 = this.LLJZ;
                if (c649290PdP5 != null) {
                    c649290PdP2 = c649290PdP5;
                }
                c649290PdP2.LJIILL = true;
                return;
            }
            C649490Pdj.LIZ.getClass();
            if (C649490Pdj.LIZIZ().enableTemplateDataForInitQueue == 1) {
                this.LLLFF.add(templateData);
                return;
            } else {
                this.LLLF = templateData;
                return;
            }
        }
        C649290PdP c649290PdP6 = this.LLJZ;
        if (c649290PdP6 == null) {
            c649290PdP6 = null;
        }
        c649290PdP6.LIZLLL(templateData);
        C649290PdP c649290PdP7 = this.LLJZ;
        if (c649290PdP7 != null) {
            c649290PdP2 = c649290PdP7;
        }
        c649290PdP2.LJIILL = true;
    }

    @C14EU
    public final void doRefreshMidPage(C640800PBm c640800PBm) {
        String string;
        C666000QAk c666000QAk = C666000QAk.LIZ;
        C1389910mGz c1389910mGz = this.LLL;
        String str = ((C0PRC) C0Q3E.LIZIZ(this).Ph1().LIZJ()).LLILLL;
        if (c1389910mGz == null) {
            c666000QAk.getClass();
        } else {
            c666000QAk.getClass();
            if (C666000QAk.LIZJ(false) && ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    C844470XAv.LIZ.getClass();
                    string = C844470XAv.LIZ().getResources().getString(2131839222);
                } else {
                    C844470XAv.LIZ.getClass();
                    string = C844470XAv.LIZ().getResources().getString(2131839223);
                }
                C666000QAk.LIZLLL(c1389910mGz, string, str);
            }
        }
        this.LLLII = false;
        if (((Boolean) C270840AjS.LIZ.getValue()).booleanValue()) {
            this.LLLJ = true;
            this.LLLJIL = true;
        }
        kS();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initView(android.view.View r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.initView(android.view.View):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str;
        String str2 = c262100zr.LIZ;
        ISearchCoinTaskControlService.LIZ.getClass();
        ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ = C0QBD.LIZ();
        C649290PdP c649290PdP = null;
        if (iSearchCoinTaskControlServiceLIZ != null) {
            iSearchCoinTaskControlServiceLIZ.LJIILJJIL();
            str = "event_claim_search_coin_task_success";
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            try {
                String strJ3 = C786410Ut5.J3(new JSONObject().put("coinTask", ""));
                ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ2 = C0QBD.LIZ();
                if (iSearchCoinTaskControlServiceLIZ2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onReceiveJsEvent, claim success, coinData = ");
                    sbLIZ.append(strJ3);
                    iSearchCoinTaskControlServiceLIZ2.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
                }
                C649290PdP c649290PdP2 = this.LLJZ;
                if (c649290PdP2 != null) {
                    c649290PdP = c649290PdP2;
                }
                c649290PdP.LIZJ(strJ3);
                ISearchCoinViewModelBridgeService.LIZ.getClass();
                ISearchCoinViewModelBridgeService value = C667600QGo.LIZIZ.getValue();
                if (value != null) {
                    value.LIZ(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ISearchCoinTaskControlService.LIZ.getClass();
                ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ3 = C0QBD.LIZ();
                if (iSearchCoinTaskControlServiceLIZ3 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onReceiveJsEvent, exception info = ");
                    sbLIZ2.append(Log.getStackTraceString(e));
                    iSearchCoinTaskControlServiceLIZ3.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        String string;
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.fragmentCreate();
        super.onCreate(bundle);
        C0QG6.LIZ();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG activity = getActivity();
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(this, activity);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, (DynamicSingleIntermediateFragmentNew$intermediateAbility$2$1) this.LLLL.getValue(), IntermediateAbility.class, null, null);
        }
        EventBus.LIZLLL().LJIJJ(this);
        ISearchCoinTaskControlService.LIZ.getClass();
        ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ = C0QBD.LIZ();
        if (iSearchCoinTaskControlServiceLIZ != null) {
            iSearchCoinTaskControlServiceLIZ.LJIILJJIL();
            C1548820qPI.LIZLLL("event_claim_search_coin_task_success", this);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Bundle bundleLIZLLL = SAFHelper.LIZLLL(this, getActivity());
        if (bundleLIZLLL != null) {
            string = bundleLIZLLL.getString("source_btm_token");
        } else {
            string = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b9734", string);
        Bundle bundleLIZLLL2 = SAFHelper.LIZLLL(this, getActivity());
        if (bundleLIZLLL2 != null) {
            C786410Ut5.LJJJI("source_btm_token", null, bundleLIZLLL2);
        }
        searchMiddleMonitor.fragmentCreateEnd();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(C7837034h c7837034h) throws JSONException {
        boolean z;
        String enterSearchFrom;
        int tabIndex;
        InterfaceC669910QPl tabIndex2;
        C0QJ5 c0qj5LIZJ;
        if (c7837034h != null && !c7837034h.LIZ) {
            JSONObject jSONObject = new JSONObject();
            InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC668720QKw != null && (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) != null && c0qj5LIZJ.LIZIZ()) {
                z = true;
            } else {
                z = false;
            }
            C649290PdP c649290PdP = null;
            if (z) {
                enterSearchFrom = "result";
            } else {
                C0QER c0qerLIZJ = C640270P9l.LIZJ(this, getActivity());
                if (c0qerLIZJ != null) {
                    enterSearchFrom = c0qerLIZJ.getEnterSearchFrom();
                } else {
                    enterSearchFrom = null;
                }
            }
            jSONObject.put("enter_from", enterSearchFrom);
            InterfaceC668720QKw interfaceC668720QKw2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC668720QKw2 != null && (tabIndex2 = interfaceC668720QKw2.getTabIndex()) != null) {
                tabIndex = tabIndex2.getTabIndex();
            } else {
                tabIndex = 0;
            }
            jSONObject.put("type", C644560PPy.LJIILIIL(tabIndex));
            C649290PdP c649290PdP2 = this.LLJZ;
            if (c649290PdP2 != null) {
                c649290PdP = c649290PdP2;
            }
            c649290PdP.sendEvent("searchTransferQuit", jSONObject);
            C649470Pdh.LIZ.getClass();
            if (((Number) C284170BBv.LIZ.getValue()).intValue() != 0) {
                C649470Pdh.LIZIZ.clear();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onExpandHistoryEvent(C667640QGs c667640QGs) {
        List<SearchHistory> listLJI;
        this.LLIZLLLIL = true;
        C668300QJg c668300QJg = this.LLJILJILJ;
        if (c668300QJg != null) {
            C0QKB.LIZ.getClass();
            if (((SearchMusicHistoryOptConfig) C0QKB.LIZJ.getValue()).isMusicHistoryUnderExpand == 1) {
                listLJI = NR().LJI();
            } else {
                listLJI = C13BV.INSTANCE;
            }
            C668300QJg.LLLII(c668300QJg, true, null, true, listLJI, 2);
        }
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 42));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHistoryDeleteEvent(C667560QGk c667560QGk) {
        SearchHistory searchHistory = c667560QGk.LIZ;
        if (searchHistory == null) {
            C668300QJg c668300QJg = this.LLJILJILJ;
            if (c668300QJg != null) {
                c668300QJg.LL.clear();
                c668300QJg.LLILLJJLI = C13BV.INSTANCE;
                c668300QJg.notifyDataSetChanged();
            }
        } else {
            C668300QJg c668300QJg2 = this.LLJILJILJ;
            if (c668300QJg2 != null) {
                C668300QJg.LLLII(c668300QJg2, this.LLIZLLLIL, searchHistory, false, null, 12);
            }
        }
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 43));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInterestPointDeleteEvent(C667630QGr c667630QGr) {
        C0QKM c0qkm;
        String str;
        C0QKL.LIZ.getClass();
        List listLJFF = C0QKL.LJFF();
        if (listLJFF != null) {
            c0qkm = (C0QKM) C13LP.LJJJLL(listLJFF);
        } else {
            c0qkm = null;
        }
        C668300QJg c668300QJg = this.LLJILJILJ;
        if (c668300QJg != null) {
            boolean z = this.LLIZLLLIL;
            if (c0qkm == null || (str = c0qkm.interestWord) == null) {
                str = "";
            }
            SearchHistory searchHistory = new SearchHistory(str);
            searchHistory.LIZ = 4;
            C668300QJg.LLLII(c668300QJg, z, searchHistory, false, null, 12);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C484220Iyq c484220Iyq) throws JSONException {
        if (Intrinsics.LJFF(c484220Iyq.LIZ.get("eventName"), "SearchTransferFirstScreenFinished")) {
            C666920QDy c666920QDy = C666920QDy.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c666920QDy.getClass();
            if (C666920QDy.LIZJ <= 0) {
                C666920QDy.LIZJ = jCurrentTimeMillis;
                long j = jCurrentTimeMillis - C666920QDy.LIZIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", j);
                jSONObject.put("fe_flag", "lynx");
                AppLogNewUtils.onEventV3("search_transfer_firstscreen_time_monitor", jSONObject);
            }
        }
    }

    @C14EU
    public final void onRefreshMidPage(C0QKC c0qkc) {
        nS();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSearchHistoryInsertInvalidMusicEvent(C667540QGi c667540QGi) {
        C668300QJg c668300QJg = this.LLJILJILJ;
        if (c668300QJg != null) {
            String str = c667540QGi.LIZIZ.musicId;
            if (str == null) {
                str = "";
            }
            List<SearchHistory> listLJIIJJI = NR().LJIIJJI(str);
            int i = c667540QGi.LIZ + 1;
            SearchHistory searchHistory = c667540QGi.LIZIZ;
            c668300QJg.LLIZ = "";
            c668300QJg.LL.addAll(i, listLJIIJJI);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c668300QJg.LLILLJJLI);
            arrayList.addAll(arrayList.indexOf(searchHistory) + 1, listLJIIJJI);
            c668300QJg.LLILLJJLI = arrayList;
            c668300QJg.notifyItemRangeInserted(i, listLJIIJJI.size());
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSearchIncentiveTaskEvent(C0P5A c0p5a) {
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ;
        IncentiveDetailInfo incentiveDetailInfoLJ;
        String str;
        String str2;
        C19EG activity;
        Context context;
        ISearchIncentiveTaskBridgeService.LIZ.getClass();
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ2 = C641960PFy.LIZ();
        if (iSearchIncentiveTaskBridgeServiceLIZ2 != null && iSearchIncentiveTaskBridgeServiceLIZ2.getTaskType() == SearchIncentiveTaskType.COUPON_V2) {
            if (iSearchIncentiveTaskBridgeServiceLIZ2.LJFF(null, null, SearchIncentiveTaskScene.MIDDLE_PAGE) && this.LLJI == null && (context = getContext()) != null) {
                this.LLJI = iSearchIncentiveTaskBridgeServiceLIZ2.LJIILJJIL(context, this);
                Integer value = OR().vQ2().getValue();
                if (value != null && value.intValue() == 1) {
                    iSearchIncentiveTaskBridgeServiceLIZ2.LJIIIIZZ(this, true, getActivity());
                }
            }
            if (c0p5a.LIZ && (iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ()) != null) {
                ISearchIncentiveMultiDayService.LIZ.getClass();
                if (C0Q2Y.LIZIZ.getValue() != null && (incentiveDetailInfoLJ = iSearchIncentiveTaskBridgeServiceLIZ.LJ()) != null && iSearchIncentiveTaskBridgeServiceLIZ.LJIILL() && iSearchIncentiveTaskBridgeServiceLIZ.LJII() && Intrinsics.LJFF(incentiveDetailInfoLJ.taskType, "periodic_task") && (str = c0p5a.LJ) != null && (str2 = c0p5a.LJFF) != null && (!a0.LJJJIL(str2))) {
                    if ((Intrinsics.LJFF(str, "middle_banner") || Intrinsics.LJFF(str, "terms_popup")) && (activity = getActivity()) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                        c1389890mGx.LJII(R.attr.ee);
                        c1389890mGx.LJIIJ(str2);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
        }
    }

    @C14EU
    public final void onSparkViewLoadStatusEvent(C649160PdC c649160PdC) {
        int iHashCode;
        if (!QS() || this.LLLIIL.getCount() == 0) {
            return;
        }
        View view = c649160PdC.LIZ;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C649390PdZ.LIZ.getValue();
        if (view != null) {
            iHashCode = view.hashCode();
        } else {
            iHashCode = 0;
        }
        if (Intrinsics.LJFF(concurrentHashMap.get(Integer.valueOf(iHashCode)), Boolean.TRUE)) {
            boolean zLIZ = C0BRK.LIZ();
            if (zLIZ) {
                C649290PdP c649290PdP = this.LLJZ;
                if (c649290PdP == null) {
                    c649290PdP = null;
                }
                if (!c649290PdP.LJIILJJIL) {
                    boolean z = !zLIZ;
                    if (0 == 0 && !z) {
                        return;
                    }
                }
            }
            this.LLLIIL.countDown();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSugSessionEndEvent(AnonymousClass0352 anonymousClass0352) {
        C0QJX c0qjx = this.LLJILLL;
        C0QJX c0qjx2 = null;
        if (c0qjx == null) {
            c0qjx = null;
        }
        c0qjx.LLJILJIL.clear();
        c0qjx.LLJILJILJ.clear();
        c0qjx.LLJILLL = null;
        c0qjx.LLJJI.clear();
        c0qjx.LLJJ.clear();
        c0qjx.LLJJIII.clear();
        C0QH6.LIZ.getClass();
        C0QH6.LIZIZ = 0L;
        C0QH6.LIZJ = 0L;
        C0QH7 c0qh7 = C0QNZ.LIZ;
        if (C301160BrG.LIZ() && C0QNZ.LJIIIIZZ != null) {
            C23250099c.LIZLLL(C0QNZ.LIZJ, null, null, new C313790CRt(null), 3);
        }
        C668200QIw.LIZ.clear();
        C0QJX c0qjx3 = this.LLJILLL;
        if (c0qjx3 != null) {
            c0qjx2 = c0qjx3;
        }
        ArrayList<String> arrayList = c0qjx2.LLJJIJIL;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<Integer> arrayList2 = c0qjx2.LLJJIJIIJIL;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (anonymousClass0352.LIZ == 3 && C0Q2T.LIZ != 0) {
            C0Q2T.LIZIZ = System.currentTimeMillis();
            C0Q2T.LIZIZ().LJIILJJIL();
            C0Q2T.LIZ = 0L;
            C0Q2T.LIZIZ = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS(boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.zS(boolean):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0218 -> B:64:0x018a). Please report as a decompilation issue!!! */
    public final void GS(String str, boolean z) throws Throwable {
        boolean zLIZIZ;
        String enterType;
        String str2;
        String strLIZ;
        InterfaceC667070QEn interfaceC667070QEnLIZIZ;
        C0QJ5 c0qj5LIZJ;
        boolean zLJI = MethodIDManager.LJI(137775);
        C0Q3N c0q3n = (C0Q3N) this.LLLIIII.getValue();
        System.currentTimeMillis();
        c0q3n.getClass();
        c0q3n.LIZ(new InterfaceC663910Q2j() { // from class: X.0QGw
        });
        InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC668720QKw != null && (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) != null) {
            zLIZIZ = c0qj5LIZJ.LIZIZ();
        } else {
            zLIZIZ = false;
        }
        C667590QGn.LIZ.getClass();
        if (C293280BeY.LIZ) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZIZ().disableSuggestGuide) {
                SearchMiddleMonitor.INSTANCE.enableRecommend(1);
                C646000PVm c646000PVm = C650950Pg5.Companion;
                C19EG activity = getActivity();
                c646000PVm.getClass();
                C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, activity);
                if (c650960Pg6LJII == null) {
                    c650960Pg6LJII = new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null));
                }
                C0QER c0qerLIZJ = C640270P9l.LIZJ(this, getActivity());
                LynxQueryProcessor lynxQueryProcessor = LynxQueryProcessor.LIZ;
                if (c0qerLIZJ != null) {
                    enterType = c0qerLIZJ.getEnterType();
                } else {
                    enterType = null;
                }
                lynxQueryProcessor.getClass();
                ((Boolean) C0BC8.LIZIZ.getValue()).booleanValue();
                if (C0BC8.LIZ(enterType) && (str2 = ((C663990Q2r) C0Q3E.LIZIZ(this).Ww1().LIZJ()).LLJILJIL) != null && str2.length() != 0) {
                    C0Q3E.LIZIZ(this).Ww1().LIZ(new C640390P9x(null));
                } else {
                    str2 = null;
                }
                if (yS() && this.LLLII && !z && str2 == null) {
                    if (C1837507Hp.LIZ()) {
                        NS(null);
                    } else {
                        JS(null);
                    }
                    if (!zLIZIZ) {
                        Word word = ((C667770QHf) ((C667750QHd) this.LLLIIII.getValue()).LIZIZ().LIZIZ()).LJIIIIZZ;
                        InterfaceC668720QKw interfaceC668720QKw2 = this.LLJJLIIIJLLLLLLLZ;
                        if (interfaceC668720QKw2 != null && (interfaceC667070QEnLIZIZ = interfaceC668720QKw2.LIZIZ()) != null) {
                            interfaceC667070QEnLIZIZ.LIZ(word);
                        }
                    }
                } else {
                    if (this.LLLII) {
                        C0Q3N c0q3n2 = (C0Q3N) this.LLLIIII.getValue();
                        c0q3n2.getClass();
                        c0q3n2.LIZ(new C667670QGv(zLIZIZ));
                    } else {
                        C0Q3N c0q3n3 = (C0Q3N) this.LLLIIII.getValue();
                        c0q3n3.getClass();
                        c0q3n3.LIZ(new C667670QGv(false));
                    }
                    SuggestWordsViewModel suggestWordsViewModel = this.LLLFFI;
                    if (suggestWordsViewModel != null) {
                        C19EG activity2 = getActivity();
                        c646000PVm.getClass();
                        C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, activity2);
                        if (SR() == -1) {
                            strLIZ = WR();
                        } else {
                            strLIZ = C0PSI.LIZ(SR());
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                        }
                        try {
                            if (C0BRO.LIZ()) {
                                C23250099c.LIZLLL((InterfaceC497601wk) suggestWordsViewModel.LLILLJJLI.getValue(), null, null, new C0QB3(suggestWordsViewModel, c0qerLIZJ, c650960Pg6LJII, c0ps4LJFF, strLIZ, str, str2, null), 3);
                            } else {
                                suggestWordsViewModel.zQ2(c0qerLIZJ, c650960Pg6LJII, c0ps4LJFF, str, str2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RS(com.ss.android.ugc.aweme.search.middle.SearchStartViewModel r19, java.lang.Boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew.RS(com.ss.android.ugc.aweme.search.middle.SearchStartViewModel, java.lang.Boolean):void");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Context context;
        if (C1820507Bb.LIZIZ && (context = getContext()) != null) {
            C669090QMh.LIZ.getClass();
            C669090QMh.LJIIIZ = ((C12ES.LJIIJ(context) - C669090QMh.LIZIZ) - C669090QMh.LJ) - C669090QMh.LJII;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        C0PCY<C0PM7> c0pcyAk0;
        C0PM7 c0pm7;
        Activity activityLIZ;
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        searchMiddleMonitor.fragmentViewCreated();
        super.onViewCreated(view, bundle);
        searchMiddleMonitor.fragmentViewCreatedEnd();
        InterfaceC214902198i interfaceC214902198i = null;
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 163), 3);
        if (C1820507Bb.LIZIZ) {
            Context context = getContext();
            if (context != null) {
                C669090QMh.LIZ.getClass();
                C669090QMh.LJIIIZ = ((C12ES.LJIIJ(context) - C669090QMh.LIZIZ) - C669090QMh.LJ) - C669090QMh.LJII;
            }
            Context context2 = getContext();
            if (context2 != null && (activityLIZ = C0FNT.LIZ(context2)) != null) {
                C487280J9a.LIZ(activityLIZ.hashCode(), this);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context3 = getContext();
        if (context3 != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context3);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            Fragment parentFragment = this;
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                } else {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == null) {
                        break;
                    }
                }
            }
        }
        C19EG activity = getActivity();
        sAFHelper.getClass();
        ISearchContextAbility iSearchContextAbilityLJJIZ = SAFHelper.LJJIZ(activity, interfaceC214902198i);
        if (iSearchContextAbilityLJJIZ != null && (c0pcyAk0 = iSearchContextAbilityLJJIZ.ak0()) != null && (c0pm7 = (C0PM7) c0pcyAk0.LIZJ()) != null) {
            linkedHashMap.put("search_session_id", String.valueOf(Long.valueOf(c0pm7.LL).longValue()));
        }
        if (!C1205904nh.LIZ()) {
            linkedHashMap.put("search_jump_in_num", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("ec_has_search_container", "1");
        }
        linkedHashMap.put("last_from_group_id", ((C0Q39) C0Q3E.LIZIZ(this).P70().LIZJ()).LLILLJJLI);
        linkedHashMap.put("end_to_end_search_session_id", String.valueOf(((C0PM7) C0Q3E.LIZIZ(this).pR().LIZJ()).LLILLJJLI));
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        List listSingletonList = Collections.singletonList(PageFinder.via((Fragment) this));
        c1766870w4z.getClass();
        C1766870w4z.LJ(true, listSingletonList, linkedHashMap);
    }

    public static JSONObject HS(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, boolean z, AwS589S0100000_10 awS589S0100000_10, int i) throws JSONException {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            awS589S0100000_10 = null;
        }
        dynamicSingleIntermediateFragmentNew.getClass();
        System.currentTimeMillis();
        List<SearchHistory> listLJIIL = dynamicSingleIntermediateFragmentNew.NR().LJIIL(C0QPJ.LJIJJLI());
        C0QER c0qerLIZJ = C640270P9l.LIZJ(dynamicSingleIntermediateFragmentNew, dynamicSingleIntermediateFragmentNew.getActivity());
        if (c0qerLIZJ != null) {
            c0qerLIZJ.getEnterSearchFrom();
        }
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : C13LP.LL(listLJIIL, 20)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory.keyword);
            jSONArray.put(jSONObject);
        }
        if (awS589S0100000_10 != null) {
            awS589S0100000_10.invoke(Boolean.valueOf(listLJIIL.isEmpty()));
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("historyList", jSONArray);
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                jSONObject2.put("isLogin", 1);
            } else {
                jSONObject2.put("isLogin", 0);
            }
            if (z) {
                C649190PdF.LIZ.getClass();
                if (C649190PdF.LIZ()) {
                    C0QGO.LIZ.getClass();
                    if (!C0QGO.LJII) {
                        C0QGO.LJII = true;
                        jSONObject2.put("isFromCache", true);
                        jSONObject2.put("guessSearchData", C0QGS.LIZ());
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        System.currentTimeMillis();
        return jSONObject2;
    }
}
