package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01CL;
import X.C01GW;
import X.C0C64;
import X.C0DTR;
import X.C0OLV;
import X.C0OMX;
import X.C0OOH;
import X.C0OOY;
import X.C0OPX;
import X.C0OQK;
import X.C0ORN;
import X.C0ORP;
import X.C0OSF;
import X.C0OU0;
import X.C0OU5;
import X.C0OU6;
import X.C0OU9;
import X.C0OUA;
import X.C0OUB;
import X.C0OUF;
import X.C0OUH;
import X.C0OV2;
import X.C0OV4;
import X.C0OWM;
import X.C0P4U;
import X.C0P4Z;
import X.C0XQ7;
import X.C1162570gMJ;
import X.C1168250gVT;
import X.C1220000hqw;
import X.C13BV;
import X.C13DA;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1534905zf;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C15438062q;
import X.C1545590qK5;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1637906bB;
import X.C1902940zcS;
import X.C1907940zkW;
import X.C19719912Dl;
import X.C2038307yf;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296740Bk8;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C616880OHm;
import X.C619990OTl;
import X.C620040OTq;
import X.C620050OTr;
import X.C620060OTs;
import X.C620080OTu;
import X.C620090OTv;
import X.C620110OTx;
import X.C620650OVz;
import X.C638910P4f;
import X.C678350QjB;
import X.C679540Ql6;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619250OQp;
import X.EnumC619890OTb;
import X.InterfaceC1548390qOb;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC618620OOe;
import X.InterfaceC623330Ocd;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS112S0000000_9;
import Y.ARunnableS109S0100000_9;
import Y.AsS36S0100000_9;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinTaskData;
import com.ss.android.ugc.aweme.inbox.bulletin.data.TaskFromScene;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinLynxCardCacheSizeItem;
import com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinTaskEventDispatcher;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListPageStatusViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardPageHybridAssem extends UIContentAssem implements BulletinHybridAbility, InterfaceC623330Ocd, BulletinTaskEventAbility, InterfaceC1554640qYg {
    public static final C0OMX LLLIILIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public static final C01GW<ExecutorService> LLLILZ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), new AwS553S0100000_9(this, 275), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(175), new AwS553S0100000_9((AbstractC738140SxQ) this, 277), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public C0OOH LLJILJILJ;
    public C1540620qC4 LLJILLL;
    public C0OUH LLJJ;
    public C638910P4f LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final EnumC619890OTb LLJJJ;
    public long LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public final ConcurrentHashMap<String, String> LLJJJJLIIL;
    public final int LLJJL;
    public final Map<String, Integer> LLJJLIIIJLLLLLLLZ;
    public C620040OTq LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public String LLJZIJLIL;
    public final BPEAHandler LLL;
    public final ArrayDeque<C620080OTu> LLLF;
    public boolean LLLFF;
    public volatile boolean LLLFFI;
    public final C0P4U LLLFZ;
    public final C01GW LLLI;
    public C1537720q7O LLLII;
    public boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public C1537720q7O LLLIIIL;
    public final C01GW LLLIIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0OMX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinBoardPageHybridAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BulletinBoardPageHybridAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0), new C2217381BqS(BulletinBoardPageHybridAssem.class, "pageViewModel", "getPageViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListPageStatusViewModel;", 0)};
        LLLIILIL = new Object() { // from class: X.0OMX
        };
        LLLILZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(141));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1191140750 || iHashCode == -917258767) {
            return this;
        }
        return null;
    }

    public BulletinBoardPageHybridAssem() {
        String str;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 414), AFwS240S0000000_9.get$arr$(172), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 415), AFwS240S0000000_9.get$arr$(173), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinListPageStatusViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 416), AFwS240S0000000_9.get$arr$(174), null, true);
        this.LLJJIII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(133));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 273));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 279));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 278));
        this.LLJJJ = EnumC619890OTb.HYBRID_CONTAINER;
        this.LLJJJIL = 10000000L;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 274));
        this.LLJJJJLIIL = !Intrinsics.LJFF(C0OUA.LIZ.enableCustomShortLinkCache, Boolean.TRUE) ? null : C620090OTv.LIZ;
        C0OU9.LIZ.getClass();
        Integer num = C0OU9.LIZ().preloadCacheSize;
        this.LLJJL = num != null ? num.intValue() : 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<BulletinLynxCardCacheSizeItem> list = C0OU9.LIZ().preloadCardCache;
        if (list != null) {
            for (BulletinLynxCardCacheSizeItem bulletinLynxCardCacheSizeItem : list) {
                if (bulletinLynxCardCacheSizeItem != null && (str = bulletinLynxCardCacheSizeItem.schema) != null) {
                    Integer num2 = bulletinLynxCardCacheSizeItem.cacheSize;
                    linkedHashMap.put(str, Integer.valueOf(num2 != null ? num2.intValue() : 5));
                }
            }
        }
        this.LLJJLIIIJLLLLLLLZ = linkedHashMap;
        C0OU9.LIZ.getClass();
        Integer num3 = C0OU9.LIZ().preloadSearchSize;
        this.LLJLL = num3 != null ? num3.intValue() : 0;
        Integer num4 = C0OU9.LIZ().preloadTriggerSize;
        this.LLJLLIL = num4 != null ? num4.intValue() : 0;
        this.LLL = new BPEAHandler(Looper.getMainLooper());
        this.LLLF = new ArrayDeque<>();
        this.LLLFZ = new C0P4U(this, 1);
        this.LLLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 413));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 272));
        this.LLLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 276));
    }

    public final C0OLV Lo() {
        return (C0OLV) this.LLIZLLLIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Oo() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJ.getValue();
    }

    public final BulletinListViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        return (BulletinListViewModel) assemVMLazy.getValue();
    }

    public final BulletinProfileViewModel Vo() {
        return (BulletinProfileViewModel) this.LLJ.getValue();
    }

    public final FrameLayout Zo() {
        return (FrameLayout) this.LLLI.getValue();
    }

    public final BulletinTooltipAbility ap() {
        return (BulletinTooltipAbility) this.LLJJIJIIJIL.getValue();
    }

    public final FrameLayout bp() {
        return (FrameLayout) this.LLLIIIIL.getValue();
    }

    public final void dp() {
        if (this.LLLIIII) {
            AssemVMLazy assemVMLazy = this.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
            C0OSF c0osf = ((C619990OTl) assemVMLazy.getValue().getState()).LL;
            C0OWM c0owm = ((C619990OTl) this.LLJIJIL.getValue().getState()).LLILLJJLI;
            if (c0osf == C0OSF.NORMAL && c0owm == C0OWM.HIDE && !this.LLJJJJJIL) {
                if (Oo().getHeaderCount() <= 0) {
                    Oo().LJ(0, Zo());
                }
            } else if (Oo().getHeaderCount() > 0) {
                Oo().LJJ(Zo());
            }
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String str;
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C0OOY c0ooy = C0OOY.LIZ;
        Object value = this.LLLIIL.getValue();
        c0ooy.getClass();
        C0OOY.LJII.add((InterfaceC618620OOe) value);
        C0OLV c0olvLo = Lo();
        if (c0olvLo == null || (str = c0olvLo.LL) == null) {
            str = "";
        }
        if (str.length() > 0) {
            C620050OTr c620050OTr = C620050OTr.LIZ;
            C620060OTs c620060OTs = new C620060OTs(str, this, new C620110OTx(this));
            c620050OTr.getClass();
            C620050OTr.LIZIZ.put(str, c620060OTs);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        String str;
        C620080OTu c620080OTuPollFirst;
        C1540620qC4 c1540620qC4;
        super.onDestroy();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJJ);
        }
        C0OLV c0olvLo = Lo();
        if (c0olvLo == null || (str = c0olvLo.LL) == null) {
            str = "";
        }
        if (str.length() > 0) {
            C620050OTr.LIZ.getClass();
            C620050OTr.LIZIZ.remove(str);
        }
        EventBus.LIZLLL().LJJI(this);
        C0OUH c0ouh = this.LLJJ;
        if (c0ouh != null && (c1540620qC4 = this.LLJILLL) != null) {
            C0OV2 c0ov2 = c1540620qC4.LJIILLIIL;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c0ov2.LIZJ.getValue()).get(c0ouh);
            if (concurrentHashMap != null) {
                Object obj = concurrentHashMap.get("bulletin_toast_event");
                if (obj != null) {
                    CopyOnWriteArrayList<C0OV4> copyOnWriteArrayList = c0ov2.LIZ().get("bulletin_toast_event");
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.remove(obj);
                    }
                    concurrentHashMap.remove("bulletin_toast_event");
                }
                if (concurrentHashMap.isEmpty()) {
                    ((ConcurrentHashMap) c0ov2.LIZJ.getValue()).remove(c0ouh);
                }
            }
        }
        C638910P4f c638910P4f = this.LLJJI;
        if (c638910P4f != null) {
            C1548820qPI.LJIIIIZZ("bb_apply_skin_changed", c638910P4f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApplySkinChanged subscriber unregistered from EventCenter, event=bb_apply_skin_changed, bbId=");
            sbLIZ.append(Vo().LLILLJJLI);
            sbLIZ.append(", subscriberHash=");
            sbLIZ.append(System.identityHashCode(c638910P4f));
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJJI = null;
        Vo().u51().LIZIZ();
        C0OOY c0ooy = C0OOY.LIZ;
        Object value = this.LLLIIL.getValue();
        c0ooy.getClass();
        C0OOY.LJII.remove(value);
        C620040OTq c620040OTq = this.LLJL;
        if (c620040OTq != null) {
            C0OPX.LJIIIZ("BulletinBoardPageHybrid PreloadonDestroy removeIdleHandler");
            Looper.myQueue().removeIdleHandler(c620040OTq);
        }
        this.LLLFFI = true;
        while ((!this.LLLF.isEmpty()) && (c620080OTuPollFirst = this.LLLF.pollFirst()) != null) {
            C1540620qC4 c1540620qC42 = this.LLJILLL;
            if (c1540620qC42 != null) {
                c1540620qC42.LJJI(c620080OTuPollFirst.LIZ);
            }
        }
        C786410Ut5.v2().removeFrameCallback(this.LLLFZ);
        C1537720q7O c1537720q7O = this.LLLII;
        if (c1537720q7O != null) {
            C786410Ut5.LJJJZ(c1537720q7O, Zo());
            C1540620qC4 c1540620qC43 = this.LLJILLL;
            if (c1540620qC43 != null) {
                c1540620qC43.LJJII(c1537720q7O);
            }
        }
        C1540620qC4 c1540620qC44 = this.LLJILLL;
        if (c1540620qC44 != null) {
            c1540620qC44.LJII();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    public final C1540620qC4 YW1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    public final void Aw1(C1537720q7O c1537720q7O) {
        C1540620qC4 c1540620qC4;
        if (c1537720q7O != null && (c1540620qC4 = this.LLJILLL) != null) {
            c1540620qC4.LJJI(c1537720q7O);
        }
    }

    public final void Go(String str) {
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager;
        C620040OTq c620040OTq = this.LLJL;
        if (c620040OTq != null) {
            RecyclerView.LayoutManager layoutManager = Oo().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                iFindLastVisibleItemPosition = 0;
            }
            int i = this.LLJLIL;
            if (i - iFindLastVisibleItemPosition < this.LLJLLIL) {
                if (!this.LLJLLL) {
                    if (iFindLastVisibleItemPosition >= i) {
                        this.LLJLIL = iFindLastVisibleItemPosition + 1;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BulletinBoardPageHybrid Preload ");
                        sbLIZ.append(str);
                        sbLIZ.append(" addIdleHandler, preloadInitIndex = ");
                        sbLIZ.append(this.LLJLIL);
                        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BulletinBoardPageHybrid Preload ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" addIdleHandler");
                    C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLJLLL = true;
                    C786410Ut5.f3(c620040OTq, Looper.myQueue());
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BulletinBoardPageHybrid Preload ");
                sbLIZ3.append(str);
                sbLIZ3.append(" pending not addIdleHandler");
                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("BulletinBoardPageHybrid Preload ");
            sbLIZ4.append(str);
            sbLIZ4.append(" trigger not addIdleHandler");
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final Map<String, Object> No(String str) {
        BulletinTaskData bulletinTaskData;
        boolean z;
        ArrayList arrayList;
        List<BulletinTaskData> list;
        String str2;
        List<BulletinTaskData> list2;
        BulletinTaskData next;
        String str3;
        C0OLV c0olvLo = Lo();
        if (c0olvLo != null && (list2 = c0olvLo.LLJILJILJ) != null) {
            Iterator<BulletinTaskData> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BulletinTaskData bulletinTaskData2 = next;
                    if (bulletinTaskData2 != null) {
                        str3 = bulletinTaskData2.taskName;
                    } else {
                        str3 = null;
                    }
                    if (Intrinsics.LJFF(str3, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            bulletinTaskData = next;
        } else {
            bulletinTaskData = null;
        }
        StringBuilder sb = new StringBuilder("HybridAssem getExtraParamsByTaskName taskName=");
        sb.append(str);
        sb.append(", found=");
        if (bulletinTaskData != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", allTasks=");
        C0OLV c0olvLo2 = Lo();
        if (c0olvLo2 != null && (list = c0olvLo2.LLJILJILJ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (BulletinTaskData bulletinTaskData3 : list) {
                if (bulletinTaskData3 != null) {
                    str2 = bulletinTaskData3.taskName;
                } else {
                    str2 = null;
                }
                arrayList.add(str2);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        C0OPX.LJIIIZ(sb.toString());
        if (bulletinTaskData == null) {
            return null;
        }
        C13DA c13da = new C13DA();
        Map<String, Object> map = bulletinTaskData.extraParams;
        if (map != null) {
            c13da.put("task_ext", map);
        }
        TaskFromScene taskFromScene = bulletinTaskData.taskFromScene;
        if (taskFromScene != null) {
            C13DA c13da2 = new C13DA();
            String str4 = taskFromScene.scene;
            if (str4 != null) {
                c13da2.put(Scene.SCENE_SERVICE, str4);
            }
            Map<String, Object> map2 = taskFromScene.sceneParams;
            if (map2 != null) {
                c13da2.put("scene_params", map2);
            }
            c13da.put("task_from_scene", c13da2.build());
        }
        return c13da.build();
    }

    @C14EU
    public final void onAccountInfoUpdated(C2038307yf c2038307yf) {
        Number pinToInbox;
        int i;
        String string;
        if (!Intrinsics.LJFF(c2038307yf.LIZ.getBulletinBoardId(), String.valueOf(Vo().LLILLJJLI)) || (pinToInbox = c2038307yf.LIZ.getPinToInbox()) == null) {
            return;
        }
        BulletinProfileViewModel bulletinProfileViewModelVo = Vo();
        int iIntValue = pinToInbox.intValue();
        bulletinProfileViewModelVo.getClass();
        bulletinProfileViewModelVo.setState(new AwS24S0001000_9(iIntValue, 12));
        if (Vo().To()) {
            i = 10;
        } else {
            i = 15;
        }
        C1440005kM.LIZ(new C1902940zcS(i, C0ORP.PIN.getType(), 1, c2038307yf.LIZ.getBulletinBoardId()));
        C620050OTr c620050OTr = C620050OTr.LIZ;
        Long l = Vo().LLILLJJLI;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        C620050OTr.LIZ(c620050OTr, string, "channel_pin", C2097908Jt.LIZJ(new Pair("pin_to_inbox", pinToInbox)));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBulletinCloseLynxContainer(C0ORN c0orn) {
        Long lLJIILIIL;
        String str;
        C1540620qC4 c1540620qC4;
        C1540620qC4 c1540620qC42;
        String str2 = c0orn.LIZ;
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            Long l = Vo().LLILLJJLI;
            if (l != null && jLongValue == l.longValue()) {
                String str3 = c0orn.LIZIZ;
                int iHashCode = str3.hashCode();
                if (iHashCode != -1326696856) {
                    if (iHashCode != -953117601) {
                        if (iHashCode == -612002635 && str3.equals("bulletin_resource_container_scene")) {
                            Oo().LJJ(Zo());
                            this.LLJJJJJIL = true;
                            return;
                        }
                        return;
                    }
                    if (!str3.equals("bulletin_top_resource_container_scene")) {
                        return;
                    }
                    C786410Ut5.LJJJJIZL(bp());
                    C0DTR.LIZIZ(bp());
                    C1537720q7O c1537720q7O = this.LLLIIIL;
                    if (c1537720q7O != null && (c1540620qC42 = this.LLJILLL) != null) {
                        c1540620qC42.LJJII(c1537720q7O);
                    }
                    this.LLLIIIL = null;
                    return;
                }
                if (!str3.equals("close_single_lynx_card") || (str = c0orn.LIZJ) == null || (c1540620qC4 = this.LLJILLL) == null) {
                    return;
                }
                c1540620qC4.LJJIII("closeBulletinPanelCard", new JSONObject().put("unique_key", str));
            }
        }
    }

    @C14EU
    public final void onReceiveOpenSettingsPageEvent(C0OU5 c0ou5) {
        long j = c0ou5.LIZ;
        Long l = Vo().LLILLJJLI;
        if (l != null && j == l.longValue() && getContext() != null) {
            SmartRouter.buildRoute(getContext(), Vo().sL0(false, true)).open(10001, new C0P4Z(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v74, types: [X.0OTq] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0OUH, java.lang.Object] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        ArrayList arrayList;
        Integer numValueOf;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility;
        List<BulletinTaskData> list;
        List<BulletinTaskData> list2;
        String str3;
        C1540620qC4 c1540620qC4;
        ViewGroup viewGroup;
        int iLIZ;
        String strLIZIZ;
        String str4;
        super.onViewCreated(view);
        Vo().u51().LJ();
        Context context = view.getContext();
        if (C0OU9.LIZIZ() == C0OU0.NONE && !C296740Bk8.LIZ()) {
            z = false;
        } else {
            z = true;
        }
        C1540620qC4 c1540620qC42 = new C1540620qC4(context, z, "social_inbox_lynx_biz", "bulletin_board_lynx", false, C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_hybrid_loading_setting", true, true), false, false, false, false, this.LLJJJJLIIL, 8112);
        this.LLJILLL = c1540620qC42;
        C678350QjB c678350QjB = new C678350QjB(null, null, null, null, null, 16383);
        String str5 = "1";
        c678350QjB.LJIIL = C2097608Jq.LJIIJ(new Pair("ignore_cached_theme", "1"));
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("bulletin_board_id", String.valueOf(Vo().LLILLJJLI));
        pairArr[1] = new Pair("bulletin_identity", Integer.valueOf(Vo().HQ2()));
        pairArr[2] = new Pair("bulletin_subscribe_status", Integer.valueOf(Vo().JQ2()));
        pairArr[3] = new Pair("bulletin_quota", Long.valueOf(Vo().getState().LLJJIJIL));
        C0OLV c0olvLo = Lo();
        String str6 = "";
        if (c0olvLo == null || (str = c0olvLo.LLJIJIL) == null) {
            str = "";
        }
        pairArr[4] = new Pair("from_scene", str);
        C0OLV c0olvLo2 = Lo();
        if (c0olvLo2 == null || c0olvLo2.LLJI) {
            str2 = "";
        } else {
            str2 = "half_screen";
        }
        pairArr[5] = new Pair("open_type", str2);
        C0OLV c0olvLo3 = Lo();
        if (c0olvLo3 == null || !c0olvLo3.LLJ) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("bulletin_is_half_screen", str5);
        C0OLV c0olvLo4 = Lo();
        if (c0olvLo4 != null && (str4 = c0olvLo4.LLILLJJLI) != null) {
            str6 = str4;
        }
        pairArr[7] = new Pair("bulletin_previous_page", str6);
        pairArr[8] = new Pair("bulletin_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        pairArr[9] = new Pair("bulletin_channel_status", Integer.valueOf(Vo().EQ2()));
        pairArr[10] = new Pair("bulletin_creator_id", Vo().CQ2());
        c678350QjB.LJIILIIL = C2097608Jq.LJIIJ(pairArr);
        C0OU9.LIZ.getClass();
        Integer num = C0OU9.LIZ().enableCommonOpt;
        if (num != null && num.intValue() == 1) {
            c678350QjB.LJJ = new AObjectS112S0000000_9(1);
        }
        c1540620qC42.LJIILJJIL(c678350QjB);
        ArrayList arrayList2 = new ArrayList();
        this.LLJILJILJ = So().LLJILJILJ;
        Iterator it2 = ((Map) C0OUB.LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            String str7 = (String) ((Map.Entry) it2.next()).getValue();
            String strLIZ = C0OQK.LIZ(str7);
            C0OOH c0ooh = this.LLJILJILJ;
            if (c0ooh != null) {
                iLIZ = c0ooh.LIZ(strLIZ);
            } else {
                iLIZ = -1;
            }
            if (strLIZ.length() > 0 && iLIZ != -1) {
                C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
                if (c1545590qK5.LIZLLL(str7)) {
                    ConcurrentHashMap<String, String> concurrentHashMap = this.LLJJJJLIIL;
                    if (concurrentHashMap == null || (strLIZIZ = concurrentHashMap.get(str7)) == null) {
                        strLIZIZ = c1545590qK5.LIZIZ(str7, C2097608Jq.LJ());
                    }
                } else {
                    strLIZIZ = str7;
                }
                Uri uriLIZJ = C01CL.LIZJ(strLIZIZ);
                String strLIZIZ2 = C1907940zkW.LIZIZ(uriLIZJ, "bulletin_card_width");
                if (strLIZIZ2 != null) {
                    C2095008Iq.LJIIJJI(strLIZIZ2);
                }
                String strLIZIZ3 = C1907940zkW.LIZIZ(uriLIZJ, "bulletin_card_height");
                if (strLIZIZ3 != null) {
                    C2095008Iq.LJIIJJI(strLIZIZ3);
                }
                arrayList2.add(new C1168250gVT(null, String.valueOf(iLIZ), str7, 31));
            }
        }
        C1540620qC4 c1540620qC43 = this.LLJILLL;
        if (c1540620qC43 != null) {
            c1540620qC43.LJIILL(arrayList2);
        }
        BulletinCommonAbility bulletinCommonAbility = (BulletinCommonAbility) this.LLJJIJI.getValue();
        if (bulletinCommonAbility != null && bulletinCommonAbility.K82()) {
            Vo().u51().LJII();
            z2 = true;
        } else {
            C736680Sv4.LJIIIZ(this, Vo(), new C2217381BqS() { // from class: X.0OMC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0OSK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLJJJJJIL;
                }
            }, null, new AwS658S0100000_9(this, 2), 12);
            C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0OT2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C0OKY) obj).LLJJIJIL);
                }
            }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 2), 4);
            C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0OU1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LL;
                }
            }, null, new AwS623S0100000_9(this, 3), 6);
            z2 = true;
            AssemViewModel.asyncSubscribe$default(Vo(), new C2217381BqS() { // from class: X.0OQM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLJJJJLIIL;
                }
            }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 12), 24, null);
        }
        if (C0OU9.LIZIZ() != C0OU0.NONE) {
            this.LLJL = new MessageQueue.IdleHandler() { // from class: X.0OTq
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    List<InterfaceC1891350zJl> list3;
                    InterfaceC1891350zJl interfaceC1891350zJl;
                    Integer num2;
                    AbstractC21673619ry adapter;
                    BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = this.LL;
                    C1540620qC4 c1540620qC44 = bulletinBoardPageHybridAssem.LLJILLL;
                    if (c1540620qC44 != null && (list3 = ((C616880OHm) bulletinBoardPageHybridAssem.So().getState()).LL.LLILZ) != null && list3.size() > bulletinBoardPageHybridAssem.LLJLIL) {
                        ArrayList arrayList3 = new ArrayList();
                        int i = bulletinBoardPageHybridAssem.LLJLIL + bulletinBoardPageHybridAssem.LLJLL;
                        int size = list3.size();
                        if (i <= size) {
                            size = i;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int i2 = bulletinBoardPageHybridAssem.LLJLIL;
                        while (true) {
                            C679540Ql6 c679540Ql6 = null;
                            if (i2 >= size || (interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(i2, list3)) == null) {
                                break;
                            }
                            if (interfaceC1891350zJl instanceof C0OOV) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("BulletinBoardPageHybrid PreloadperformPreloading item index = ");
                                sbLIZ.append(i2);
                                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                                C0OOV c0oov = (C0OOV) interfaceC1891350zJl;
                                BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
                                if (bulletinCardInfo != null) {
                                    BulletinCardUIInfo bulletinCardUIInfo = bulletinCardInfo.hybridCardUIInfo;
                                    if (bulletinCardUIInfo != null) {
                                        bulletinCardUIInfo.setBulletinItemId(String.valueOf(c0oov.LLJI));
                                    }
                                    BulletinCardUIInfo bulletinCardUIInfo2 = bulletinCardInfo.hybridCardUIInfo;
                                    if (bulletinCardUIInfo2 != null) {
                                        bulletinCardUIInfo2.setBulletinCardType(String.valueOf(bulletinCardInfo.cardType));
                                    }
                                    BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo;
                                    if (bulletinHybridCardConfigStruct != null) {
                                        c679540Ql6 = new C679540Ql6(null, null, Boolean.TRUE, null, null, new C1162570gMJ(-2, -2), null, String.valueOf(c0oov.LLJJJJ), bulletinHybridCardConfigStruct.schema, null, 31095);
                                        c679540Ql6.LJFF = Integer.valueOf(C0OU9.LIZJ());
                                        C0OU0 c0ou0LIZIZ = C0OU9.LIZIZ();
                                        if (c0ou0LIZIZ == C0OU0.PRE_RENDER || c0ou0LIZIZ == C0OU0.PRE_LAYOUT) {
                                            c679540Ql6.LJIILIIL = C2097908Jt.LIZJ(new Pair("enable_pending_js_task", "1"));
                                        }
                                    }
                                }
                                if (c679540Ql6 != null) {
                                    String str8 = c679540Ql6.LJIJJLI;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    if (!a0.LJJJIL(str8)) {
                                        Integer num3 = (Integer) linkedHashMap.get(str8);
                                        int iIntValue = num3 != null ? num3.intValue() : 0;
                                        int iLJIIJJI = c1540620qC44.LJIIJJI(c679540Ql6) + iIntValue;
                                        Integer num4 = (Integer) ((LinkedHashMap) bulletinBoardPageHybridAssem.LLJJLIIIJLLLLLLLZ).get(str8);
                                        if (iLJIIJJI <= (num4 != null ? num4.intValue() : 5)) {
                                            linkedHashMap.put(str8, Integer.valueOf(iIntValue + 1));
                                            arrayList3.add(c679540Ql6);
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("BulletinBoardPageHybrid PreloadSuccess, generatePreloadSSMConfig, schema = ");
                                            sbLIZ2.append(c679540Ql6.LJIJJLI);
                                            sbLIZ2.append(", curCacheSize = ");
                                            sbLIZ2.append(c1540620qC44.LJIIJJI(c679540Ql6));
                                            sbLIZ2.append(", curAddSize = ");
                                            sbLIZ2.append(iIntValue);
                                            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("BulletinBoardPageHybrid PreloadFailed, generatePreloadSSMConfig, schema = ");
                                            sbLIZ3.append(c679540Ql6.LJIJJLI);
                                            sbLIZ3.append(", curCacheSize = ");
                                            sbLIZ3.append(c1540620qC44.LJIIJJI(c679540Ql6));
                                            sbLIZ3.append(", curAddSize = ");
                                            sbLIZ3.append(iIntValue);
                                            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                        }
                                    }
                                }
                                if (C296740Bk8.LIZ()) {
                                    C0OS8.LIZ.getClass();
                                    if (!((Boolean) C0OS8.LIZLLL.getValue()).booleanValue() && (num2 = C0OS8.LJII().enableVHPoolWarmUp) != null && num2.intValue() == 1 && bulletinBoardPageHybridAssem.LLJZ < 5 && (adapter = bulletinBoardPageHybridAssem.Oo().getAdapter()) != null) {
                                        try {
                                            int itemViewType = adapter.getItemViewType(i2);
                                            if (itemViewType >= 0) {
                                                RecyclerView.RecycledViewPool recycledViewPool = bulletinBoardPageHybridAssem.Oo().getRecycledViewPool();
                                                int recycledViewCount = recycledViewPool.getRecycledViewCount(itemViewType);
                                                if (recycledViewCount >= 2) {
                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                    sbLIZ4.append("BulletinBoardPageHybrid Preload warmUpVH skip viewType=");
                                                    sbLIZ4.append(itemViewType);
                                                    sbLIZ4.append(", existing=");
                                                    sbLIZ4.append(recycledViewCount);
                                                    C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                                } else {
                                                    try {
                                                        recycledViewPool.putRecycledView(adapter.createViewHolder(bulletinBoardPageHybridAssem.Oo(), itemViewType));
                                                        bulletinBoardPageHybridAssem.LLJZ++;
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("BulletinBoardPageHybrid Preload warmUpVH created viewType=");
                                                        sbLIZ5.append(itemViewType);
                                                        sbLIZ5.append(", total=");
                                                        sbLIZ5.append(bulletinBoardPageHybridAssem.LLJZ);
                                                        sbLIZ5.append(", poolCount=");
                                                        sbLIZ5.append(recycledViewPool.getRecycledViewCount(itemViewType));
                                                        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
                                                    } catch (Exception e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                        sbLIZ6.append("BulletinBoardPageHybrid Preload warmUpVH createVH failed viewType=");
                                                        sbLIZ6.append(itemViewType);
                                                        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6));
                                                    }
                                                }
                                            }
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("BulletinBoardPageHybrid Preload warmUpVH getItemViewType failed pos=");
                                            sbLIZ7.append(i2);
                                            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ7));
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                        bulletinBoardPageHybridAssem.LLJLIL = size;
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("BulletinBoardPageHybrid PreloadperformPreloading preloadInitIndex = ");
                        sbLIZ8.append(bulletinBoardPageHybridAssem.LLJLIL);
                        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ8));
                        if (!arrayList3.isEmpty()) {
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("BulletinBoardPageHybrid PreloadperformPreloading listToPreload size = ");
                            sbLIZ9.append(arrayList3.size());
                            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ9));
                            int i3 = C620130OTz.LIZ[C0OU9.LIZIZ().ordinal()];
                            if (i3 == 1) {
                                C0OPX.LJIIIZ("BulletinBoardPageHybrid PreloadperformPreloading preCreateWithConfigurations");
                                C1540620qC4 c1540620qC45 = bulletinBoardPageHybridAssem.LLJILLL;
                                if (c1540620qC45 != null) {
                                    c1540620qC45.LJIILLIIL(arrayList3, new C5183020f(bulletinBoardPageHybridAssem, 8));
                                }
                            } else if (i3 == 2) {
                                C0OPX.LJIIIZ("BulletinBoardPageHybrid PreloadperformPreloading preRenderWithConfigurations");
                                C1540620qC4 c1540620qC46 = bulletinBoardPageHybridAssem.LLJILLL;
                                if (c1540620qC46 != null) {
                                    c1540620qC46.LJIJI(Integer.valueOf(bulletinBoardPageHybridAssem.LLJJL), arrayList3);
                                }
                            } else if (i3 == 3) {
                                C0OPX.LJIIIZ("BulletinBoardPageHybrid PreloadperformPreloading preLayoutWithConfigurations");
                                C1540620qC4 c1540620qC47 = bulletinBoardPageHybridAssem.LLJILLL;
                                if (c1540620qC47 != null) {
                                    C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
                                    c1540620qC47.LJIJ(arrayList3, null);
                                }
                            } else if (i3 != 4) {
                                throw new C1954807lC();
                            }
                        }
                    }
                    this.LL.LLJLLL = false;
                    return false;
                }
            };
            Oo().addOnScrollListener(new AsS36S0100000_9(this, 1));
            C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0OU3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C616880OHm) obj).LL;
                }
            }, null, new AwS623S0100000_9(this, 10), 6);
        }
        if (C0OU6.LIZ() && (c1540620qC4 = this.LLJILLL) != null) {
            long j = this.LLJJJIL;
            this.LLJJJIL = 1 + j;
            C679540Ql6 c679540Ql6 = new C679540Ql6(String.valueOf(j), null, null, null, null, null, null, "59999", "aweme://roma_redirect/?spark_page=social_inbox_bulletin_mob_page", null, 31230);
            c679540Ql6.LJIJ = new C1162570gMJ(0, 0);
            C1537720q7O c1537720q7OLJIILIIL = c1540620qC4.LJIILIIL(c679540Ql6, null);
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                viewGroup.addView(c1537720q7OLJIILIIL);
            }
        }
        C0OLV c0olvLo5 = Lo();
        if (c0olvLo5 != null && c0olvLo5.LLJ == z2) {
            final ?? r5 = new C0OUF() { // from class: X.0OUH
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
                @Override // X.C0OUF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C0OUG r8) {
                    /*
                        Method dump skipped, instruction units count: 220
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0OUH.LIZ(X.0OUG):void");
                }
            };
            this.LLJJ = r5;
            C1540620qC4 c1540620qC44 = this.LLJILLL;
            if (c1540620qC44 != null) {
                C0OV2 c0ov2 = c1540620qC44.LJIILLIIL;
                c0ov2.getClass();
                C0OV4 c0ov4 = new C0OV4(UUID.randomUUID().toString(), System.currentTimeMillis(), new InterfaceC1548390qOb() { // from class: X.0OUE
                    @Override // X.InterfaceC1548390qOb
                    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str8) {
                        r5.LIZ(new C0OUG(interfaceC1107590evd, str8));
                    }
                }, null);
                if (((ConcurrentHashMap) c0ov2.LIZJ.getValue()).get(r5) == null) {
                    ((ConcurrentHashMap) c0ov2.LIZJ.getValue()).put(r5, new ConcurrentHashMap());
                }
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ((ConcurrentHashMap) c0ov2.LIZJ.getValue()).get(r5);
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.put("bulletin_toast_event", c0ov4);
                }
                c0ov2.LIZIZ(c0ov4, "bulletin_toast_event");
            }
        }
        C638910P4f c638910P4f = new C638910P4f(this, 0);
        this.LLJJI = c638910P4f;
        C1548820qPI.LIZLLL("bb_apply_skin_changed", c638910P4f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplySkinChanged subscriber registered to EventCenter, event=bb_apply_skin_changed, currentBbId=");
        sbLIZ.append(Vo().LLILLJJLI);
        sbLIZ.append(", subscriberHash=");
        sbLIZ.append(System.identityHashCode(c638910P4f));
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sb = new StringBuilder("initPageStartTaskEvent called, bulletinTasks=");
        C0OLV c0olvLo6 = Lo();
        if (c0olvLo6 != null && (list2 = c0olvLo6.LLJILJILJ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (BulletinTaskData bulletinTaskData : list2) {
                if (bulletinTaskData != null) {
                    str3 = bulletinTaskData.taskName;
                } else {
                    str3 = null;
                }
                arrayList.add(str3);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        sb.append(", size=");
        C0OLV c0olvLo7 = Lo();
        if (c0olvLo7 != null && (list = c0olvLo7.LLJILJILJ) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        C0OPX.LJIIIZ(sb.toString());
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OMl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618190OMn) obj).LLILLL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 13), 28, null);
        BulletinCommonAbility bulletinCommonAbility2 = (BulletinCommonAbility) this.LLJJIJI.getValue();
        if ((bulletinCommonAbility2 != null && bulletinCommonAbility2.K82() == z2) || (bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null)) == null) {
            return;
        }
        bulletinAnimationCoordinatorAbility.HK2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    public final void oo2(int i) {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardPageHybrid PreloadstartPreload initIndex = ");
        sbLIZ.append(i);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLILLLLZIIL = true;
        this.LLJLIL = i + 1;
        List<InterfaceC1891350zJl> list = ((C616880OHm) So().getState()).LL.LLILZ;
        if (Oo().getScrollState() == 0 && list != null && this.LLJLIL < list.size()) {
            Go("startPreload");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void routerHybridEvent(C1534905zf c1534905zf) throws JSONException {
        if (!C0OU6.LIZ() || !C1578630rBN.LJIIJ(this) || !Vo().OQ2(c1534905zf.LIZ) || c1534905zf.LIZIZ.isEmpty()) {
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("bulletin_board_id", String.valueOf(Vo().LLILLJJLI));
        for (Map.Entry<String, String> entry : c1534905zf.LIZIZ.entrySet()) {
            jSONObjectPut.put(entry.getKey(), entry.getValue());
        }
        C1540620qC4 c1540620qC4 = this.LLJILLL;
        if (c1540620qC4 != null) {
            c1540620qC4.LJJIII("bulletin_router_event", jSONObjectPut);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0024, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C679540Ql6 Jo(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinResourceInfo r23, final boolean r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem.Jo(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinResourceInfo, boolean):X.0Ql6");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Sk1(X.C679540Ql6 r23, X.C0OUV r24) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem.Sk1(X.0Ql6, X.0OUV):void");
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    public final C1537720q7O ys1(C679540Ql6 c679540Ql6, C1537720q7O c1537720q7O) {
        c679540Ql6.LJFF = Integer.valueOf(C0OU9.LIZJ());
        C1540620qC4 c1540620qC4 = this.LLJILLL;
        if (c1540620qC4 != null) {
            return c1540620qC4.LJIILIIL(c679540Ql6, c1537720q7O);
        }
        return null;
    }

    public static Integer cp(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map map) {
        BulletinCardInfo cardInfo;
        if (bulletinItem != null && (cardInfo = bulletinItem.getCardInfo()) != null) {
            return Integer.valueOf((int) cardInfo.cardType);
        }
        Long lLJI = bulletinBaseItem.LJI();
        if (lLJI != null) {
            return Integer.valueOf((int) lLJI.longValue());
        }
        String str = (String) map.get("card_type");
        if (str != null) {
            return C2095008Iq.LJIIJJI(str);
        }
        return null;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        if (!this.LLLIIII) {
            return;
        }
        if (!c620650OVz.LIZ() && !c620650OVz.LJ()) {
            if (c620650OVz.LIZLLL == C0OSF.NORMAL && c620650OVz.LIZIZ == C0OWM.HIDE && enumC617880OLi == EnumC617880OLi.COMPLETE) {
                HandlerHook.viewPostDelay(Oo(), new ARunnableS109S0100000_9(this, 84), 500L);
                return;
            }
            return;
        }
        if (enumC617880OLi != EnumC617880OLi.PREPARE) {
            return;
        }
        dp();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility
    public final void l92(EnumC619250OQp enumC619250OQp, int i, Map<String, ? extends Object> map) throws JSONException {
        C1540620qC4 c1540620qC4 = this.LLJILLL;
        if (c1540620qC4 != null) {
            String event = enumC619250OQp.getEvent();
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("post_type", i);
            Object obj = Vo().LLILLJJLI;
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("bb_id", obj);
            c1540620qC4.LJJIII(event, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility
    public final void G02(String str, Map map, Map map2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridAssem dispatchChannelModifyComplete success=");
        sbLIZ.append(z);
        sbLIZ.append(", modifyType=");
        sbLIZ.append(str);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(map2);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((BulletinTaskEventDispatcher) this.LLJJIJIL.getValue()).G02(str, map, map2, z);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility
    public final void gQ1(String str, Map map, Map map2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridAssem dispatchInteractionComplete success=");
        sbLIZ.append(z);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(str);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(map2);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((BulletinTaskEventDispatcher) this.LLJJIJIL.getValue()).gQ1(str, map, map2, z);
    }

    public final void Ho(boolean z, int i, Integer num, String str, Map<String, ? extends Object> map, Integer num2) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridAssem dispatchPostComplete success=");
        sbLIZ.append(z);
        sbLIZ.append(", itemType=");
        sbLIZ.append(i);
        sbLIZ.append(", cardType=");
        sbLIZ.append(num);
        sbLIZ.append(", bulletinItemId=");
        sbLIZ.append(str);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(map);
        sbLIZ.append(", postTextLength=");
        sbLIZ.append(num2);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        BulletinTaskEventDispatcher bulletinTaskEventDispatcher = (BulletinTaskEventDispatcher) this.LLJJIJIL.getValue();
        bulletinTaskEventDispatcher.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BulletinTaskEventDispatcher dispatchPostComplete success=");
        sbLIZ2.append(z);
        sbLIZ2.append(", itemType=");
        sbLIZ2.append(i);
        sbLIZ2.append(", cardType=");
        sbLIZ2.append(num);
        sbLIZ2.append(", bulletinItemId=");
        sbLIZ2.append(str);
        sbLIZ2.append(", postTextLength=");
        sbLIZ2.append(num2);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", str2);
        pairArr[1] = new Pair("item_type", String.valueOf(i));
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (num != null) {
            mapLJIIJ.put("card_type", String.valueOf(num.intValue()));
        }
        if (str != null) {
            mapLJIIJ.put("bulletin_item_id", str);
        }
        if (num2 != null && (i == 1 || i == 2)) {
            mapLJIIJ.put("post_text_length", num2);
        }
        bulletinTaskEventDispatcher.LIZ("post_complete_event", mapLJIIJ, map);
    }
}
