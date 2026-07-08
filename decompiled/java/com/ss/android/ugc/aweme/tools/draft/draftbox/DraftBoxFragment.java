package com.ss.android.ugc.aweme.tools.draft.draftbox;

import X.AnonymousClass0880;
import X.C01GW;
import X.C01TT;
import X.C054G;
import X.C05JA;
import X.C098200Yq;
import X.C099F;
import X.C099R;
import X.C09AE;
import X.C09BV;
import X.C09XF;
import X.C0BW7;
import X.C0C64;
import X.C0CHQ;
import X.C0DX9;
import X.C0LAB;
import X.C0LQ3;
import X.C0M03;
import X.C0M0P;
import X.C0M0W;
import X.C0M0Z;
import X.C0M10;
import X.C0M11;
import X.C0M12;
import X.C0M13;
import X.C0M14;
import X.C0M16;
import X.C0M17;
import X.C0M18;
import X.C0M19;
import X.C0M1D;
import X.C0M1F;
import X.C0M1H;
import X.C0M1K;
import X.C0M1L;
import X.C0M1T;
import X.C0M1U;
import X.C0M1W;
import X.C0M1X;
import X.C0M1Y;
import X.C0M1Z;
import X.C0M20;
import X.C0M21;
import X.C0M22;
import X.C0M26;
import X.C0M2O;
import X.C0M34;
import X.C0M36;
import X.C0MAY;
import X.C0MJM;
import X.C0MYR;
import X.C0PEM;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1398110mUD;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1602160rnK;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1DFH;
import X.C1DFK;
import X.C1DZY;
import X.C201955140j;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C255890A1b;
import X.C259800zU;
import X.C298200BmU;
import X.C299990BpN;
import X.C418440Gaw;
import X.C452501pT;
import X.C539070LCf;
import X.C545110LZl;
import X.C545300La4;
import X.C547410LdT;
import X.C555490LqV;
import X.C556820Lse;
import X.C556880Lsk;
import X.C561060LzU;
import X.C561070LzV;
import X.C561090LzX;
import X.C561120Lza;
import X.C561130Lzb;
import X.C561150Lzd;
import X.C561160Lze;
import X.C561240Lzm;
import X.C561290Lzr;
import X.C561320Lzu;
import X.C561390M0b;
import X.C561400M0c;
import X.C561520M0o;
import X.C561580M0u;
import X.C561720M1i;
import X.C561750M1l;
import X.C561890M1z;
import X.C561900M2a;
import X.C561950M2f;
import X.C562260M3k;
import X.C562280M3m;
import X.C562670M4z;
import X.C570300MYi;
import X.C570560MZi;
import X.C571400Mb4;
import X.C571410Mb5;
import X.C571420Mb6;
import X.C571890Mbr;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC043000Dk;
import X.EnumC1427810nG7;
import X.EnumC543480LTe;
import X.EnumC562200M3e;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC2345609Ha;
import X.InterfaceC362610EJn;
import X.InterfaceC524950KiL;
import X.InterfaceC555450LqR;
import X.InterfaceC561350Lzx;
import X.InterfaceC561590M0v;
import X.InterfaceC562000M2k;
import X.InterfaceC562800M5m;
import X.ViewOnLayoutChangeListenerC580890MqN;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment;
import com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.DraftBoxModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.RFCDraftModel;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker;
import com.ss.android.ugc.aweme.service.IDraftBoxDebugService;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lgo.a;
import lth.o;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftBoxFragment extends AmeBaseLegacyFragment implements InterfaceC362610EJn, InterfaceC562000M2k, InterfaceC2345609Ha, InterfaceC555450LqR, C0M1U, InterfaceC561590M0v, C0M1T {
    public static boolean LLLLLJIL = false;
    public static boolean LLLLLJLJLL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZiHELIOSE+KCknZiE+KCknKio0ZwshKSM4CyArDjctLiI2JjE=";
    public View LL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public RFCDraftModel LLJLIL;
    public int LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public long LLJZ;
    public final C054G LLL;
    public C0M11 LLLF;
    public C0M14 LLLFF;
    public C561400M0c LLLFFI;
    public C0M0W LLLFZ;
    public C0M12 LLLI;
    public C0M26 LLLII;
    public IDraftBoxDebugService LLLIIII;
    public final C01GW LLLIIIIL;
    public Integer LLLIIIL;
    public boolean LLLIIL;
    public C0M1Z LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public boolean LLLJIL;
    public volatile long LLLJL;
    public final C0M19 LLLL;
    public final C1DFK LLLLII;
    public final C054G LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public int LLLLIILLL;
    public boolean LLLLIL;
    public C099F LLLLILI;
    public boolean LLLLJ;
    public long LLLLJI;
    public String LLLLL;
    public long LLLLLIL;
    public C0M0P LLLLLILLIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 479));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 492));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 481));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 488));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 489));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 494));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 493));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 491));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 483));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 487));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 497));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(230));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 482));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 485));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 495));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(227));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 496));
    public final Map<String, C09AE> LLJJIJIIJIL = new LinkedHashMap();
    public final Map<String, C09AE> LLJJIJIL = new LinkedHashMap();
    public final String LLJJJ = "draft_page";
    public boolean LLJJJJLIIL = true;
    public String LLJZIJLIL = "";

    @Override // X.InterfaceC561990M2j
    public final void v(boolean z) {
    }

    public final RecyclerView LLII() {
        return (RecyclerView) this.LLILZIL.getValue();
    }

    public final List<C0M1L> UR() {
        return (List) this.LLJJIII.getValue();
    }

    public final C561900M2a VR() {
        return (C561900M2a) this.LLJILLL.getValue();
    }

    public final C561130Lzb WR() {
        return (C561130Lzb) this.LLJILJILJ.getValue();
    }

    public final C0M13 ZR() {
        return (C0M13) this.LLJJ.getValue();
    }

    public final boolean aS() {
        return ((Boolean) this.LLLILZLLLI.getValue()).booleanValue();
    }

    @Override // X.C0M1U
    public final void b4() {
        ((C555490LqV) this.LLLLIILL.getValue()).LJ = this;
        ((C555490LqV) this.LLLLIILL.getValue()).LIZJ(getEnterFrom(), this.LLJJJ, WR(), "page");
        dS().xQ2();
    }

    public final boolean bS() {
        return ((Boolean) this.LLLILZJ.getValue()).booleanValue();
    }

    public final C0M03 cS() {
        return (C0M03) this.LLLLIIL.getValue();
    }

    public final DraftBoxPageViewModel dS() {
        return (DraftBoxPageViewModel) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC561590M0v
    public final String getEnterFrom() {
        return this.LLJJJIL ? "storage_management" : this.LLJJJJ ? "subonly_videolist" : this.LLJJJJJIL ? "click_profile_guide_widget" : this.LLJJL ? "shoot_page_edit_tab" : this.LLJLLIL ? "managedrafts" : "personal_homepage";
    }

    @Override // X.InterfaceC555450LqR
    public final void nR() {
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLILZ.getValue();
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = (C1749280vcc) this.LLILZ.getValue();
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    public final void oS() {
        if (this.LLJLILLLLZIIL <= 0 || this.LLJLL <= 0 || dS().LLJILLL) {
            return;
        }
        int i = 1;
        dS().LLJILLL = true;
        C0M16 c0m16 = C0M16.LIZ;
        String enterFrom = getEnterFrom();
        int i2 = this.LLJLILLLLZIIL;
        long j = this.LLJLL;
        c0m16.getClass();
        int i3 = 0;
        AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null);
        if (aVDraftMigrateService != null && (aVDraftMigrateService.enableM1MigrateDraft() || aVDraftMigrateService.enableM2MigrateDraft())) {
            MigrateTaskStatus migrateTaskStatusCurrentMigrateFlowStatus = aVDraftMigrateService.currentMigrateFlowStatus();
            if (migrateTaskStatusCurrentMigrateFlowStatus instanceof MigrateTaskStatus.Completed) {
                i = 2;
            } else if (migrateTaskStatusCurrentMigrateFlowStatus instanceof MigrateTaskStatus.Progress) {
            }
            i3 = i;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i2, "draft_cnt");
        c0lab.LIZ(Intrinsics.LJFF(enterFrom, "shoot_page_edit_tab") ? 1 : 0, "is_from_edit_tab");
        c0lab.LIZIZ(j, "draft_size");
        c0lab.LJ("enter_from", enterFrom);
        c0lab.LIZ(i3, "migrate_status");
        C20684815ws.LJIILLIIL("click_draft_entrance", c0lab.LIZ);
        List<C561950M2f> list = VR().LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C0M0P) {
                arrayList.add(obj);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0M16 c0m162 = C0M16.LIZ;
        int i4 = this.LLJLILLLLZIIL;
        long j2 = this.LLJLL;
        long jRS = rS(arrayList, jCurrentTimeMillis, 604800000L);
        long jRS2 = rS(arrayList, jCurrentTimeMillis, 2592000000L);
        long jRS3 = rS(arrayList, jCurrentTimeMillis, 7776000000L);
        long jRS4 = rS(arrayList, jCurrentTimeMillis, 15552000000L);
        long jRS5 = rS(arrayList, jCurrentTimeMillis, 31536000000L);
        int iQS = qS(arrayList, jCurrentTimeMillis, 604800000L);
        int iQS2 = qS(arrayList, jCurrentTimeMillis, 2592000000L);
        int iQS3 = qS(arrayList, jCurrentTimeMillis, 7776000000L);
        int iQS4 = qS(arrayList, jCurrentTimeMillis, 15552000000L);
        int iQS5 = qS(arrayList, jCurrentTimeMillis, 31536000000L);
        c0m162.getClass();
        if (((Boolean) C0BW7.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LIZ(i4, "count");
        c0lab2.LIZIZ(j2, "storage_size");
        c0lab2.LIZIZ(jRS, "recent_week_size");
        c0lab2.LIZIZ(jRS2, "recent_month_size");
        c0lab2.LIZIZ(jRS3, "recent_quarter_size");
        c0lab2.LIZIZ(jRS4, "recent_half_size");
        c0lab2.LIZIZ(jRS5, "recent_year_size");
        c0lab2.LIZ(iQS, "recent_week_cnt");
        c0lab2.LIZ(iQS2, "recent_month_cnt");
        c0lab2.LIZ(iQS3, "recent_quarter_cnt");
        c0lab2.LIZ(iQS4, "recent_half_cnt");
        c0lab2.LIZ(iQS5, "recent_year_cnt");
        C20684815ws.LJIILLIIL("tool_performance_draft_info", c0lab2.LIZ);
    }

    @Override // X.C0M32
    public final void v1() {
        C570300MYi.LIZ.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [X.0M19] */
    public DraftBoxFragment() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(231));
        this.LLLIILIL = C561720M1i.LIZ;
        this.LLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(229));
        this.LLLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(232));
        this.LLLILZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(234));
        this.LLLILZLLLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(233));
        this.LLLIZZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(228));
        this.LLLJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(226));
        this.LLLL = new DraftListenerAdapter() { // from class: X.0M19
            @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onDeleted(AwemeDraft awemeDraft) {
                super.onDeleted(awemeDraft);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                super.onUpdated(updateParams);
                if (C0M1A.LIZ(updateParams)) {
                    return;
                }
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DraftListenerAdapter onUpdated ");
                sbLIZ.append(updateParams.draft.LIZ());
                C201955140j.LIZLLL(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
                AnonymousClass0880.LIZ(this.LIZ.dS().LLJI, updateParams.draft);
            }
        };
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLLLII = c1dfkLIZ;
        this.LLLLIIIILLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(c1dfkLIZ));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 480));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 490));
        this.LLLLJI = System.currentTimeMillis();
        this.LLLLL = "";
    }

    @Override // X.C0M1U
    public final void ER() {
        InterfaceC561350Lzx interfaceC561350LzxVQ2;
        List<C0M0P> listEw;
        C0M0P c0m0p;
        DraftBoxPageViewModel draftBoxPageViewModelDS = dS();
        if (draftBoxPageViewModelDS == null || (interfaceC561350LzxVQ2 = draftBoxPageViewModelDS.vQ2()) == null || (listEw = interfaceC561350LzxVQ2.Ew()) == null || (c0m0p = (C0M0P) C13LP.LJJJLL(listEw)) == null) {
            return;
        }
        this.LLLLL = c0m0p.LJ;
        this.LLLLLIL = c0m0p.LJI;
        this.LLLLLILLIL = c0m0p;
        LLLLZLLIL(-1, c0m0p);
    }

    public final void iS() {
        oS();
        C23250099c.LIZLLL(this.LLLLIIIILLL, null, null, new C561160Lze(this, null), 3);
        C23250099c.LIZLLL(this.LLLLIIIILLL, null, null, new C561150Lzd(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        super.onDestroy();
        this.LLLLII.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AIGCWorkflowCreationService aIGCWorkflowCreationService;
        super.onDestroyView();
        C0M26 c0m26 = this.LLLII;
        if (c0m26 != null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finalizeWindow: window=");
            sbLIZ.append(c0m26.LJI);
            sbLIZ.append(", rewarded=");
            sbLIZ.append(c0m26.LJII);
            sbLIZ.append(", punished=");
            sbLIZ.append(c0m26.LJIIIIZZ);
            sbLIZ.append(" (tracker handles reward/punish independently)");
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
            c0m26.LJI = false;
        }
        this.LLLLL = "";
        if (this.LLLFF != null) {
            C0M1W.LIZ(C2097608Jq.LJ());
        }
        cS().LIZJ = null;
        ((C555490LqV) this.LLLLIILL.getValue()).LJ = null;
        Iterator<C0M1L> it2 = UR().iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        IDraftBoxDebugService iDraftBoxDebugService = this.LLLIIII;
        if (iDraftBoxDebugService != null) {
            iDraftBoxDebugService.LJI();
        }
        this.LLLIIII = null;
        C561900M2a c561900M2aVR = VR();
        c561900M2aVR.LLJILJIL.LIZIZ(null);
        Iterator it3 = ((ArrayList) c561900M2aVR.LLJILLL).iterator();
        while (it3.hasNext()) {
            ((Function0) it3.next()).invoke();
        }
        if (C299990BpN.LIZ()) {
            C2296808zG.LIZJ(this.LLLLIIIILLL, null);
        }
        C545110LZl.LIZ.getClass();
        if (C545300La4.LIZ() && (aIGCWorkflowCreationService = C545110LZl.LIZIZ) != null) {
            aIGCWorkflowCreationService.LJIILJJIL(this);
        }
        C0CHQ.LIZ().LJI().LIZ().unregisterListener(this.LLLL);
        ((InterfaceC524950KiL) requireActivity()).b8(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        super.onStop();
        this.LLLLJ = true;
        cS().getClass();
        if (!C0M03.LJ() || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return;
        }
        iCreationAsyncTaskManagerLIZ.LJI("DraftViewModel", AFwS189S0000000_3.get$arr$(377), false);
    }

    public final void sS() {
        if (!C0M1H.LIZ()) {
            C201955140j.LJIJJ(C0MAY.LIZIZ, "DraftBoxFragment", "tryUpdateStorageNotice: skip — strategy not enabled");
            return;
        }
        Context context = getContext();
        if (context == null) {
            C201955140j.LJIJJ(C0MAY.LIZIZ, "DraftBoxFragment", "tryUpdateStorageNotice: skip — context==null");
        } else {
            C23250099c.LIZLLL(this.LLLLIIIILLL, null, null, new C0M1Y(this, context, null), 3);
        }
    }

    @Override // X.C0M1T
    public final void yM() {
        Context context = getContext();
        if (context != null) {
            gS(context, EnumC043000Dk.LEAVE_DRAFT);
            C0M11 c0m11 = this.LLLF;
            if (c0m11 != null) {
                c0m11.LIZJ();
            }
        }
    }

    public static String SR(long j) {
        return C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.073741824E9d)}, 1));
    }

    public final void MR(String str) {
        InterfaceC562800M5m interfaceC562800M5m = (InterfaceC562800M5m) this.LLLJ.getValue();
        if (interfaceC562800M5m != null) {
            interfaceC562800M5m.LJ("DraftBoxFragment", str);
        }
    }

    @Override // X.C0M32
    public final void l(C0M0P c0m0p) {
        if (!Intrinsics.LJFF(dS().LLIZ.getValue(), Boolean.TRUE)) {
            C0M16 c0m16 = C0M16.LIZ;
            String enterFrom = getEnterFrom();
            Map<String, Boolean> value = dS().LLJIJIL.getValue();
            if (value == null) {
                value = C2097608Jq.LJ();
            }
            C0M16.LJ(c0m16, enterFrom, value, true, null, null, null, null, 120);
        }
    }

    @Override // X.InterfaceC555450LqR
    public final void lI(List<C0M0P> list) {
        C561400M0c c561400M0c;
        ZR().LIZJ(list);
        this.LLJLILLLLZIIL -= list.size();
        cS().LJIIIZ = this.LLJLILLLLZIIL;
        AnonymousClass0880.LIZ(dS().LL, Integer.valueOf(this.LLJLILLLLZIIL));
        AnonymousClass0880.LIZ(dS().LLJ, 0);
        AnonymousClass0880.LIZ(dS().LLIZLLLIL, 0L);
        Iterator it2 = ((ArrayList) VR().LLILLJJLI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (C1697810uHb.LJIIJJI(106, 114, 118, 119).contains(Integer.valueOf(((C561950M2f) next).LIZ()))) {
                if (next != null) {
                    return;
                }
            }
        }
        Map<String, Boolean> value = dS().LLJIJIL.getValue();
        if (value == null) {
            value = C2097608Jq.LJ();
        }
        Boolean bool = value.get("filter_type_effect");
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        if ((!Intrinsics.LJFF(value.get("filter_type_template"), bool2) && !zLJFF) || (c561400M0c = this.LLLFFI) == null) {
            return;
        }
        c561400M0c.LIZIZ(true);
    }

    public final void mS(Map map) {
        int i;
        Pair pairLIZ = C561390M0b.LIZ(map);
        EnumC562200M3e enumC562200M3e = (EnumC562200M3e) pairLIZ.getFirst();
        C0M0Z c0m0z = (C0M0Z) pairLIZ.getSecond();
        VR().LLJ = this.LLJJJIL;
        C561900M2a c561900M2aVR = VR();
        if (enumC562200M3e == EnumC562200M3e.FREE_UP_SPACE) {
            i = 1;
        } else {
            i = 0;
        }
        c561900M2aVR.LLJJ = i;
        C0M0W c0m0w = this.LLLFZ;
        if (c0m0w != null) {
            c0m0w.LIZJ(500L);
        }
        this.LLLLIILLL = 0;
        C23250099c.LIZLLL(this.LLLLIIIILLL, null, null, new C561320Lzu(this, enumC562200M3e, null, c0m0z, null), 3);
    }

    public final Object nS(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        if (this.LLLLIILLL == cS().LJI) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "already loaded all");
            return Unit.LIZ;
        }
        Map<String, Boolean> value = dS().LLJIJIL.getValue();
        if (value == null) {
            value = C2097608Jq.LJ();
        }
        Pair pairLIZ = C561390M0b.LIZ(value);
        EnumC562200M3e enumC562200M3e = (EnumC562200M3e) pairLIZ.getFirst();
        C0M0Z c0m0z = (C0M0Z) pairLIZ.getSecond();
        int i = this.LLLLIILLL;
        cS().getClass();
        int i2 = i * 48;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C561290Lzr(this, cS().LJII - i2, i2, c0m0z, enumC562200M3e, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        RFCDraftModel rFCDraftModel;
        long jLJIJJLI;
        super.onCreate(bundle);
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z = false;
            this.LLJLILLLLZIIL = arguments.getInt("draft_count", 0);
            this.LLJLL = arguments.getLong("draft_free_up_space", 0L);
            this.LLJJJIL = arguments.getBoolean("is_disk_manage_mode", false);
            this.LLJJJJ = arguments.getBoolean("entered_from_sub_only_videos_page", false);
            String string = "";
            String string2 = arguments.getString("enter_method", "");
            this.LLJJJJLIIL = arguments.getBoolean("enable_publish_from_draft", true);
            this.LLJJJJJIL = string2.equals("click_profile_guide_widget");
            this.LLJJL = string2.equals("click_editor_tab_drafts");
            Serializable serializable = arguments.getSerializable("wwa_rfc_draft_model");
            if (serializable instanceof RFCDraftModel) {
                rFCDraftModel = (RFCDraftModel) serializable;
            } else {
                rFCDraftModel = null;
            }
            this.LLJLIL = rFCDraftModel;
            this.LLJJLIIIJLLLLLLLZ = arguments.getLong("click_draft_box_time");
            this.LLJLLL = arguments.getBoolean("draft_organizer_from_push", false);
            if (Intrinsics.LJFF(string2, "managedrafts") || C255890A1b.LIZ()) {
                z = true;
            }
            this.LLJLLIL = z;
            if (C255890A1b.LIZ()) {
                jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "draft_box_post_mock_target_size", true);
            } else {
                jLJIJJLI = arguments.getLong("free_space_target", 0L);
            }
            this.LLJZ = jLJIJJLI;
            if (C255890A1b.LIZ()) {
                String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "draft_box_post_mock_jump_scheme", "", true);
                if (strLJJ != null) {
                    string = strLJJ;
                }
            } else {
                string = arguments.getString("free_space_extra", "");
            }
            this.LLJZIJLIL = string;
        }
        C0MJM.LIZLLL = true;
        this.LLJL = System.currentTimeMillis();
        ((InterfaceC524950KiL) requireActivity()).AH(this);
    }

    @C14EU
    public final void onPublishStatusUpdate(C09XF c09xf) {
        if (!this.LLJLLIL) {
            return;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishStatusUpdate ");
        sbLIZ.append(c09xf);
        sbLIZ.append(", ");
        sbLIZ.append(c09xf.LIZ);
        sbLIZ.append(' ');
        C201955140j.LIZLLL(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c09xf.LIZ, this.LLLLL) && this.LLLLLILLIL != null) {
            long j = this.LLJZ - this.LLLLLIL;
            this.LLJZ = j;
            C0M12 c0m12 = this.LLLI;
            if (c0m12 != null && j != c0m12.LIZJ) {
                c0m12.LIZJ = j;
                c0m12.LIZIZ(null);
            }
            if (this.LLJZ <= 0 && this.LLJLLIL) {
                Context context = getContext();
                if (context != null) {
                    gS(context, EnumC043000Dk.POST_DRAFT);
                    C0M11 c0m11 = this.LLLF;
                    if (c0m11 != null) {
                        c0m11.LIZJ();
                        return;
                    }
                    return;
                }
                return;
            }
            C054G c054g = this.LLLLIIIILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C0M10(this, null), 2);
        }
    }

    @Override // X.InterfaceC555450LqR
    public final void sb(List<C0M0P> list) {
        C19EG c19egLIZIZ;
        boolean z;
        C19EG activity;
        C0M11 c0m11;
        C0M26 c0m26;
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLILZ.getValue();
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        if ((!list.isEmpty()) && (c0m26 = this.LLLII) != null) {
            c0m26.LJIIJ(C0M1D.DRAFT_LIST_DELETE);
        }
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            int size = list.size();
            Iterator<C0M0P> it2 = list.iterator();
            long j = 0;
            while (it2.hasNext()) {
                j += it2.next().LJI;
            }
            this.LLJZ -= j;
            String quantityString = c19egLIZIZ.getResources().getQuantityString(2131755280, size, Integer.valueOf(size));
            if (this.LLJLLIL && this.LLJZ > 0 && !LLLLLJIL && this.LLJLILLLLZIIL > 0) {
                z = true;
            } else {
                z = false;
                if (size > 0) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIJ(quantityString);
                    c1389890mGx.LJIIJJI();
                }
            }
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sb = new StringBuilder("free total: ");
            Iterator<C0M0P> it3 = list.iterator();
            long j2 = 0;
            while (it3.hasNext()) {
                j2 += it3.next().LJI;
            }
            sb.append(j2);
            C201955140j.LIZLLL(c0may, "wqh_draft", sb.toString());
            C0M12 c0m12 = this.LLLI;
            if (c0m12 != null) {
                long j3 = this.LLJZ;
                if (j3 != c0m12.LIZJ) {
                    c0m12.LIZJ = j3;
                    c0m12.LIZIZ(null);
                }
            }
            if (this.LLJZ <= 0 && this.LLJLLIL) {
                Context context2 = getContext();
                if (context2 != null) {
                    gS(context2, EnumC043000Dk.DELETE_DRAFT);
                    C0M11 c0m112 = this.LLLF;
                    if (c0m112 != null) {
                        c0m112.LIZJ();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LLJLILLLLZIIL == 0 && this.LLLJIL && Intrinsics.LJFF(dS().LLIZ.getValue(), Boolean.TRUE) && (c0m11 = this.LLLF) != null) {
                c0m11.LIZIZ();
            }
            if (this.LLJLILLLLZIIL == 0 && !this.LLLJIL) {
                if (this.LLJJL && (activity = getActivity()) != null) {
                    C561520M0o.LIZ.getClass();
                    SmartRouter.buildRoute(activity, "aweme://openShoot?landing_tab=editor_tab&schema_tag=draft_box").open();
                    C01TT.LIZIZ(400L, new AwS552S0100000_8(this, 484));
                    return;
                } else {
                    C0M11 c0m113 = this.LLLF;
                    if (c0m113 != null) {
                        c0m113.LIZJ();
                        return;
                    }
                    return;
                }
            }
            if (z) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ);
                c1389890mGx2.LJIIJ(c19egLIZIZ.getResources().getQuantityString(2131755036, size, Integer.valueOf(size), C0M1F.LIZ(this.LLJZ)));
                c1389890mGx2.LIZ(true);
                c1389890mGx2.LJIIJJI();
                LLLLLJIL = true;
            }
        }
    }

    @Override // X.C0M32
    public final void LLLLZLLIL(int i, C0M0P c0m0p) {
        hS(i, c0m0p, "page", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object PR(boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0M1B
            if (r0 == 0) goto L22
            r5 = r8
            X.0M1B r5 = (X.C0M1B) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            boolean r7 = r5.LL
            goto L28
        L22:
            X.0M1B r5 = new X.0M1B
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L66
            goto L5a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            int r1 = r6.LLLLIILLL
            X.0M03 r0 = r6.cS()
            int r0 = r0.LJI
            if (r1 < r0) goto L44
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            if (r7 == 0) goto L4f
            X.0M0W r2 = r6.LLLFZ
            if (r2 == 0) goto L4f
            r0 = 200(0xc8, double:9.9E-322)
            r2.LIZJ(r0)
        L4f:
            r5.LL = r7     // Catch: java.lang.Throwable -> L66
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r6.nS(r5)     // Catch: java.lang.Throwable -> L66
            if (r0 != r4) goto L5a
            return r4
        L5a:
            if (r7 == 0) goto L63
            X.0M0W r0 = r6.LLLFZ
            if (r0 == 0) goto L63
            r0.LIZIZ()
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L66:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L73
            X.0M0W r0 = r6.LLLFZ
            if (r0 == 0) goto L73
            r0.LIZIZ()
        L73:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment.PR(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC555450LqR
    public final void R4(AwemeDraft awemeDraft, C0M0P c0m0p) {
        this.LLJLL -= c0m0p.LJI;
        AnonymousClass0880.LIZ(dS().LLILLL, Long.valueOf(this.LLJLL));
        C562670M4z c562670M4z = C562670M4z.LIZ;
        String strLIZ = awemeDraft.LIZ();
        List<TextImageTaskInfo> list = awemeDraft.LIZ.text2ImageModel.imageTaskList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TextImageTaskInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().getAsyncTaskId()));
        }
        c562670M4z.getClass();
        C562670M4z.LIZJ(strLIZ, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object RR(boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment.RR(boolean, X.05Vn):java.lang.Object");
    }

    public final void gS(Context context, EnumC043000Dk enumC043000Dk) {
        try {
            M2StorageCleanInterface m2StorageCleanInterface = (M2StorageCleanInterface) PluggableExtentionKt.pluggableSpi$default(M2StorageCleanInterface.class, false, false, false, 14, null);
            if (m2StorageCleanInterface != null) {
                m2StorageCleanInterface.LIZIZ(context, this.LLJZIJLIL);
            }
            C0M16 c0m16 = C0M16.LIZ;
            String enterFrom = getEnterFrom();
            String strName = enumC043000Dk.name();
            c0m16.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("action_type", strName);
            c0lab.LJ("enter_from", enterFrom);
            C20684815ws.LJIILLIIL("draft_direct_to_download_page", c0lab.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC2345609Ha
    public final void m7(C539070LCf c539070LCf, boolean z) {
        C561950M2f next;
        C0M0P c0m0p;
        C0M0P c0m0p2;
        Iterator<C561950M2f> it2 = VR().LLILLJJLI.iterator();
        while (true) {
            String str = null;
            if (it2.hasNext()) {
                next = it2.next();
                C561950M2f c561950M2f = next;
                if ((c561950M2f instanceof C0M0P) && (c0m0p2 = (C0M0P) c561950M2f) != null) {
                    str = c0m0p2.LJ;
                }
                if (Intrinsics.LJFF(str, c539070LCf.LIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if ((next instanceof C0M0P) && (c0m0p = (C0M0P) next) != null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onProgressUpdate ");
            sbLIZ.append(c539070LCf);
            C201955140j.LJIJJ(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
            c0m0p.LJIILJJIL = c539070LCf.LIZIZ;
            c0m0p.LJIILIIL = c539070LCf.LIZJ;
            c0m0p.LJIILL = c539070LCf.LIZLLL;
            C561900M2a c561900M2aVR = VR();
            for (Object obj : (ArrayList) c561900M2aVR.LLILLJJLI) {
                C561950M2f c561950M2f2 = (C561950M2f) obj;
                if ((c561950M2f2 instanceof C0M0P) && Intrinsics.LJFF(((C0M0P) c561950M2f2).LJ, c0m0p.LJ)) {
                    if (obj != null) {
                        int iIndexOf = ((ArrayList) c561900M2aVR.LLILLJJLI).indexOf(obj);
                        ListProtector.set(c561900M2aVR.LLILLJJLI, iIndexOf, c0m0p);
                        if (z) {
                            c561900M2aVR.notifyItemChanged(iIndexOf, "task_progress_change");
                            return;
                        } else {
                            c561900M2aVR.notifyItemChanged(iIndexOf);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass0880.LIZ(dS().LLILZ, Unit.LIZ);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ViewGroup viewGroup;
        String str;
        AVDraftMigrateService aVDraftMigrateService;
        IDraftMigrateStateService iDraftMigrateStateService;
        AVDraftMigrateService aVDraftMigrateService2;
        Map<String, Boolean> mapLJ;
        C0M17 c0m17;
        int i;
        C0M26 c0m26;
        IDraftBoxDebugService iDraftBoxDebugService;
        int i2;
        String enterFrom;
        Map<String, Boolean> mapLJ2;
        MutableLiveData<Map<String, Boolean>> mutableLiveData;
        MutableLiveData<Long> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5;
        Locale locale;
        super.onViewCreated(view, bundle);
        this.LL = view;
        C562280M3m.LIZ.getClass();
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        if (!Intrinsics.LJFF(C786410Ut5.t2(C562280M3m.LIZIZ), appLanguage)) {
            IAVSettingService iAVSettingService = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
            if (iAVSettingService == null || (locale = iAVSettingService.getLocale(appLanguage)) == null) {
                locale = Locale.getDefault();
            }
            C562280M3m.LIZIZ = locale;
            C562280M3m.LJFF = new SimpleDateFormat("MMMM", C562280M3m.LIZIZ);
        }
        if (this.LLJLLIL) {
            C0M12 c0m12 = new C0M12();
            this.LLLI = c0m12;
            TuxTextView tuxTextView = (TuxTextView) this.LLJ.getValue();
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            View view2 = (View) this.LLIZ.getValue();
            if (view2 != null) {
                int visibility = view2.getVisibility();
                view2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, view2);
            }
            long j = this.LLJZ;
            if (j != c0m12.LIZJ) {
                c0m12.LIZJ = j;
                c0m12.LIZIZ(null);
            }
            c0m12.LIZLLL = (TuxTextView) this.LLIZLLLIL.getValue();
            c0m12.LIZ((View) this.LLJ.getValue(), dS(), null);
            UR().add(c0m12);
        } else {
            C0M1X c0m1x = new C0M1X();
            TuxTextView tuxTextView2 = (TuxTextView) this.LLJ.getValue();
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            View view3 = (View) this.LLIZ.getValue();
            if (view3 != null) {
                int visibility2 = view3.getVisibility();
                view3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, view3);
            }
            c0m1x.LIZ((View) this.LLIZ.getValue(), dS(), null);
            UR().add(c0m1x);
        }
        C0M11 c0m11 = new C0M11();
        c0m11.LIZ((View) this.LLILLL.getValue(), dS(), this);
        UR().add(c0m11);
        if (this.LLJLLIL) {
            c0m11.LJFF = this;
            c0m11.LIZIZ = true;
            c0m11.LIZ = true;
            c0m11.LIZLLL();
            DraftBoxPageViewModel draftBoxPageViewModel = c0m11.LIZLLL;
            if (draftBoxPageViewModel != null && (mutableLiveData5 = draftBoxPageViewModel.LLILZLL) != null) {
                AnonymousClass0880.LIZ(mutableLiveData5, Boolean.TRUE);
            }
            DraftBoxPageViewModel draftBoxPageViewModel2 = c0m11.LIZLLL;
            if (draftBoxPageViewModel2 != null && (mutableLiveData4 = draftBoxPageViewModel2.LLIZ) != null) {
                AnonymousClass0880.LIZ(mutableLiveData4, Boolean.valueOf(c0m11.LIZ));
            }
            DraftBoxPageViewModel draftBoxPageViewModel3 = c0m11.LIZLLL;
            if (draftBoxPageViewModel3 != null && (mutableLiveData3 = draftBoxPageViewModel3.LLJ) != null) {
                AnonymousClass0880.LIZ(mutableLiveData3, 0);
            }
            DraftBoxPageViewModel draftBoxPageViewModel4 = c0m11.LIZLLL;
            if (draftBoxPageViewModel4 != null && (mutableLiveData2 = draftBoxPageViewModel4.LLIZLLLIL) != null) {
                AnonymousClass0880.LIZ(mutableLiveData2, 0L);
            }
            InterfaceC561590M0v interfaceC561590M0v = c0m11.LJ;
            if (interfaceC561590M0v != null && (enterFrom = interfaceC561590M0v.getEnterFrom()) != null) {
                C0M16 c0m16 = C0M16.LIZ;
                DraftBoxPageViewModel draftBoxPageViewModel5 = c0m11.LIZLLL;
                if (draftBoxPageViewModel5 == null || (mutableLiveData = draftBoxPageViewModel5.LLJIJIL) == null || (mapLJ2 = mutableLiveData.getValue()) == null) {
                    mapLJ2 = C2097608Jq.LJ();
                }
                C0M16.LJ(c0m16, enterFrom, mapLJ2, false, null, null, null, null, 124);
            }
        }
        this.LLLF = c0m11;
        C0M14 c0m14 = new C0M14();
        c0m14.LIZ((View) this.LLJIJIL.getValue(), dS(), null);
        UR().add(c0m14);
        this.LLLFF = c0m14;
        C0M2O c0m2o = new C0M2O();
        c0m2o.LIZ((View) this.LLJI.getValue(), dS(), this);
        UR().add(c0m2o);
        if (!this.LLJLLIL && C0C64.LJIILLIIL().LJIJ(31744, 0, "draft_box_post_btn_enable", true) != 1) {
            z = false;
        } else {
            z = true;
        }
        c0m2o.LJII = z;
        C197039127h c197039127hLIZJ = c0m2o.LIZJ();
        if (c197039127hLIZJ != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLLLJ(c197039127hLIZJ, i2);
        }
        C197039127h c197039127hLIZJ2 = c0m2o.LIZJ();
        if (c197039127hLIZJ2 != null) {
            C786410Ut5.I7(new AkS80S0100000_8(c0m2o, 42), c197039127hLIZJ2);
        }
        c0m2o.LJI = this;
        C561400M0c c561400M0c = new C561400M0c();
        c561400M0c.LIZ((View) this.LLJILJIL.getValue(), dS(), null);
        UR().add(c561400M0c);
        this.LLLFFI = c561400M0c;
        c561400M0c.LIZ = LLII();
        C0M0W c0m0w = new C0M0W();
        c0m0w.LIZ((View) this.LLILZ.getValue(), dS(), this);
        UR().add(c0m0w);
        this.LLLFZ = c0m0w;
        if (C0M21.LIZIZ() == null) {
            C561580M0u c561580M0u = new C561580M0u();
            c561580M0u.LIZ((View) this.LLIZ.getValue(), dS(), this);
            UR().add(c561580M0u);
        }
        View view4 = this.LL;
        if (view4 != null && view4.findViewById(R.id.g5d) != null && (iDraftBoxDebugService = (IDraftBoxDebugService) ServiceManager.get().getService(IDraftBoxDebugService.class)) != null) {
            this.LLLIIII = iDraftBoxDebugService;
            iDraftBoxDebugService.LIZ();
        }
        C0M26 c0m262 = new C0M26();
        this.LLLII = c0m262;
        DraftBoxPageViewModel draftBoxPageViewModelDS = dS();
        C561900M2a c561900M2aVR = VR();
        C555490LqV c555490LqV = (C555490LqV) this.LLLLIILL.getValue();
        C561130Lzb c561130LzbWR = WR();
        int iLIZ = C0M21.LIZ();
        C0M22 c0m22LIZIZ = C0M21.LIZIZ();
        if (c0m22LIZIZ == null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init: skip — control group, expGroup=");
            sbLIZ.append(iLIZ);
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            View view5 = getView();
            if ((view5 instanceof ViewGroup) && (viewGroup = (ViewGroup) view5) != null) {
                c0m262.LIZ = c0m22LIZIZ;
                c0m262.LIZIZ = new C05JA(c0m22LIZIZ);
                c0m262.LJIIIZ = this;
                c0m262.LJIIJ = draftBoxPageViewModelDS;
                c0m262.LJIIJJI = c561900M2aVR;
                c0m262.LJIIL = c555490LqV;
                c0m262.LJIILIIL = c561130LzbWR;
                IDraftOrganizerPostTracker iDraftOrganizerPostTracker = (IDraftOrganizerPostTracker) c0m262.LJIILL.getValue();
                if (iDraftOrganizerPostTracker != null) {
                    if (c0m22LIZIZ instanceof C0M20) {
                        str = "count";
                    } else if (c0m22LIZIZ instanceof C561890M1z) {
                        str = "memory";
                    } else {
                        throw new C1954807lC();
                    }
                    iDraftOrganizerPostTracker.LIZIZ(str);
                }
                ComposeView composeView = new ComposeView(requireContext(), null, 6);
                c0m262.LJIILJJIL = composeView;
                C786410Ut5.k6(composeView, new ViewGroup.LayoutParams(0, 0));
                viewGroup.addView(composeView);
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(382475346, new AwS622S0100000_8(c0m262, 58), true));
                C0MAY c0may2 = C0MAY.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("init: ready, expGroup=");
                sbLIZ2.append(iLIZ);
                sbLIZ2.append(", strategy=");
                sbLIZ2.append(C13LE.LIZ(c0m22LIZIZ.getClass()).LJI());
                C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxOrganizer", "init: skip — fragment.view is not a ViewGroup");
            }
        }
        UR().add(c0m262);
        C0M11 c0m112 = this.LLLF;
        if (c0m112 != null) {
            c0m112.LJI = new AwS552S0100000_8(this, 1108);
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("draft_organizer_auto_open_manage", false) && (c0m26 = this.LLLII) != null) {
            c0m26.LJIIZILJ = true;
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxOrganizer", "markPendingAutoOpenManage");
        }
        if (aS() || bS()) {
            if (aS() && (((aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null)) == null || !aVDraftMigrateService.isM2Installed()) && (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) != null)) {
                iDraftMigrateStateService.clearMigrationCache();
            }
            C1DZY c1dzy = new C1DZY(this, UR());
            c1dzy.LIZ(this.LL, dS(), this);
            UR().add(c1dzy);
        }
        RecyclerView recyclerViewLLII = LLII();
        if (recyclerViewLLII != null) {
            recyclerViewLLII.setItemAnimator(null);
            recyclerViewLLII.setLayoutManager(new GridLayoutManager(recyclerViewLLII.getContext(), 3));
            recyclerViewLLII.setAdapter(VR());
            if (C0M1K.LIZ()) {
                i = 5;
            } else {
                i = 1;
            }
            recyclerViewLLII.addItemDecoration(new C0DX9(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))));
            recyclerViewLLII.addOnScrollListener(new C571890Mbr("tool_draft_scroll"));
            VR().LLJI = this.LLJJL;
            if (C0M1H.LIZ()) {
                recyclerViewLLII.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC580890MqN(recyclerViewLLII, this, 4));
            }
        }
        dS().LLJIJIL.observe(getViewLifecycleOwner(), new AObserverS212S0100000_8(this, 105));
        if (C0M1H.LIZ()) {
            TuxTextView tuxTextView3 = (TuxTextView) this.LLIZLLLIL.getValue();
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            dS().LLILLL.observe(getViewLifecycleOwner(), new AObserverS212S0100000_8(this, 106));
        }
        dS().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS212S0100000_8(this, 107));
        dS().LLIZ.observe(getViewLifecycleOwner(), new AObserverS212S0100000_8(this, 108));
        dS().LLJI.observe(getViewLifecycleOwner(), new AObserverS212S0100000_8(this, 109));
        if ((aS() || bS()) && (aVDraftMigrateService2 = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null)) != null) {
            MigrateTaskStatus migrateTaskStatusCurrentMigrateFlowStatus = aVDraftMigrateService2.currentMigrateFlowStatus();
            if (migrateTaskStatusCurrentMigrateFlowStatus != null && (migrateTaskStatusCurrentMigrateFlowStatus instanceof MigrateTaskStatus.Completed)) {
                this.LLLJL = ((MigrateTaskStatus.Completed) migrateTaskStatusCurrentMigrateFlowStatus).getResult().resultTime;
            }
            aVDraftMigrateService2.observeMigrateFlowStatus(this, new AwS587S0100000_8(this, 756));
        }
        C0CHQ.LIZ().LJI().LIZ().registerListener(this.LLLL);
        VR().LLILZ = this;
        if (this.LLJLILLLLZIIL > 0) {
            AnonymousClass0880.LIZ(dS().LL, Integer.valueOf(this.LLJLILLLLZIIL));
        }
        if (this.LLJLL > 0) {
            AnonymousClass0880.LIZ(dS().LLILLL, Long.valueOf(this.LLJLL));
        }
        iS();
        if (this.LLJLLIL) {
            mapLJ = C2097908Jt.LIZJ(new Pair("filter_type_file_size", Boolean.TRUE));
        } else {
            C0M14 c0m142 = this.LLLFF;
            if (c0m142 == null || !c0m142.LIZLLL || (mapLJ = (Map) ((Map) C0M1W.LIZIZ.getValue()).get(C0M1W.LIZ.getValue())) == null) {
                mapLJ = C2097608Jq.LJ();
            }
        }
        C0M14 c0m143 = this.LLLFF;
        if (c0m143 != null && c0m143.LIZLLL && (c0m17 = c0m143.LIZJ) != null) {
            c0m17.setSelectedFilterTypes(mapLJ);
        }
        if (mapLJ.isEmpty()) {
            Map<String, Boolean> value = dS().LLJIJIL.getValue();
            if (value == null) {
                value = C2097608Jq.LJ();
            }
            mS(value);
        } else {
            AnonymousClass0880.LIZ(dS().LLJIJIL, mapLJ);
        }
        if (((Number) C298200BmU.LIZ.getValue()).intValue() == 1) {
            C0CHQ.LIZ().LJJJJJ().preloadVESoAsync();
        }
        a.LIZIZ.LJ().LIZ();
    }

    public static int qS(List list, long j, long j2) {
        int i = 0;
        if (!((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            i = 0;
            while (it2.hasNext()) {
                if (j - C561750M1l.LIZJ((C0M0P) it2.next()) <= j2 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static long rS(List list, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (j - C561750M1l.LIZJ((C0M0P) obj) <= j2) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j3 = 0;
        while (it2.hasNext()) {
            j3 += ((C0M0P) it2.next()).LJI;
        }
        return j3;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        IDraftBoxDebugService iDraftBoxDebugService = this.LLLIIII;
        if (iDraftBoxDebugService != null) {
            iDraftBoxDebugService.LIZIZ();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8g, viewGroup, false);
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

    @Override // X.C0M32
    public final void v3(C0M0P c0m0p, boolean z, boolean z2) {
        String str;
        int iIntValue;
        int i;
        long jLongValue;
        long j;
        String str2;
        C0M11 c0m11;
        if (!Intrinsics.LJFF(dS().LLIZ.getValue(), Boolean.TRUE) && (c0m11 = this.LLLF) != null) {
            c0m11.LIZIZ();
        }
        DraftBoxPageViewModel draftBoxPageViewModelDS = dS();
        String enterFrom = getEnterFrom();
        draftBoxPageViewModelDS.getClass();
        c0m0p.LJIIJJI = z;
        if (z2) {
            str = "long_press";
        } else {
            str = "click_select";
        }
        if (z) {
            if (draftBoxPageViewModelDS.vQ2().Cw() == 0) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C0M16 c0m16 = C0M16.LIZ;
            Map<String, Boolean> value = draftBoxPageViewModelDS.LLJIJIL.getValue();
            if (value == null) {
                value = C2097608Jq.LJ();
            }
            c0m16.getClass();
            C0M16.LJFF(1, str, enterFrom, str2, value);
        }
        draftBoxPageViewModelDS.vQ2().zw(c0m0p, z);
        AnonymousClass0880.LIZ(draftBoxPageViewModelDS.LLILZLL, Boolean.valueOf(!draftBoxPageViewModelDS.vQ2().vw()));
        MutableLiveData<Integer> mutableLiveData = draftBoxPageViewModelDS.LLJ;
        Integer value2 = mutableLiveData.getValue();
        if (value2 != null) {
            iIntValue = value2.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            i = iIntValue + 1;
        } else {
            i = iIntValue - 1;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
        MutableLiveData<Long> mutableLiveData2 = draftBoxPageViewModelDS.LLIZLLLIL;
        Long value3 = mutableLiveData2.getValue();
        if (value3 != null) {
            jLongValue = value3.longValue();
        } else {
            jLongValue = 0;
        }
        if (z) {
            j = jLongValue + c0m0p.LJI;
        } else {
            j = jLongValue - c0m0p.LJI;
        }
        mutableLiveData2.setValue(Long.valueOf(j));
    }

    public final void NR(int i, C0M0P c0m0p, String str, String str2) {
        String str3;
        String str4 = c0m0p.LJ;
        if (i == -1) {
            str3 = "post_button";
        } else {
            str3 = "draft_item";
        }
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
        String branchName = C0LQ3.DRAFT_ITEM_CLICK.getBranchName();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("source", str3));
        Map mapLJ = C2097608Jq.LJ();
        c547410LdT.getClass();
        C547410LdT.LJ(enumC543480LTe, str4, "common", branchName, 1, 0, "", mapLIZJ, mapLJ, str4);
        C23250099c.LIZLLL(this.LLL, null, null, new C561090LzX(this, c0m0p, i, str, str2, null), 3);
    }

    public final void hS(int i, C0M0P c0m0p, String str, String str2) {
        DraftMigrateState draftMigrateStateQueryDraftMigrateState;
        DraftMigrateState draftMigrateState;
        Integer num;
        int i2;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(getActivity(), "draft_again", true)) {
            if (bS() || aS()) {
                IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) this.LLLIL.getValue();
                if (iDraftMigrateStateService != null) {
                    draftMigrateStateQueryDraftMigrateState = iDraftMigrateStateService.queryDraftMigrateState(c0m0p.LJ);
                } else {
                    draftMigrateStateQueryDraftMigrateState = null;
                }
                C556880Lsk c556880Lsk = C556880Lsk.LIZ;
                String str3 = c0m0p.LJ;
                if (draftMigrateStateQueryDraftMigrateState == null) {
                    draftMigrateState = DraftMigrateState.WAIT_MIGRATE;
                } else {
                    draftMigrateState = draftMigrateStateQueryDraftMigrateState;
                }
                c556880Lsk.getClass();
                int i3 = C0M36.LIZ[draftMigrateState.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            num = 0;
                        } else {
                            num = null;
                        }
                    } else {
                        num = 1;
                    }
                } else {
                    num = 2;
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", str3);
                c0lab.LIZLLL(num, "migrate_status");
                C20684815ws.LJIILLIIL("click_draft", c0lab.LIZ);
                if (aS() && draftMigrateStateQueryDraftMigrateState != null && ((i2 = C0M34.LIZ[draftMigrateStateQueryDraftMigrateState.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
                    Context context = getContext();
                    if (context != null) {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        c1397580mTM.LJI(context.getString(2131836973, this.LLLIZZ.getValue()));
                        c1397580mTM.LIZIZ(context.getString(2131836972, this.LLLIZZ.getValue()));
                        C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(context, this, 218));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                    return;
                }
            }
            if (!this.LLJJJJLIIL) {
                return;
            }
            C0M26 c0m26 = this.LLLII;
            if (c0m26 != null) {
                String str4 = c0m0p.LJ;
                IDraftOrganizerPostTracker iDraftOrganizerPostTracker = (IDraftOrganizerPostTracker) c0m26.LJIILL.getValue();
                if (iDraftOrganizerPostTracker != null) {
                    iDraftOrganizerPostTracker.LJ(str4);
                }
            }
            this.LLLLJI = System.currentTimeMillis();
            C0M0W c0m0w = this.LLLFZ;
            if (c0m0w != null) {
                c0m0w.LIZJ(500L);
            }
            Source source = c0m0p.LJIILL;
            if (source != Source.SHOOTING_I2V && source != Source.EFFECT_AIGC) {
                if (source == Source.EDIT_AI_PLAYGROUND) {
                    C23250099c.LIZLLL(this.LLL, null, null, new C561060LzU(this, c0m0p, i, str, str2, null), 3);
                    return;
                } else {
                    NR(i, c0m0p, str, str2);
                    return;
                }
            }
            C23250099c.LIZLLL(this.LLL, null, null, new C561070LzV(this, c0m0p, i, str, str2, null), 3);
        }
    }

    public final void OR(AwemeDraft awemeDraft, long j, C561120Lza c561120Lza, String str, String str2) {
        String strLIZIZ = str2;
        awemeDraft.LJIJI = 0;
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        if (aIGCOfflineModel.isOfflineAIGCEffectGenerated) {
            aIGCOfflineModel.enterFrom = "draft";
            aIGCOfflineModel.enterMethod = "click_draft";
        }
        Map<String, Boolean> value = dS().LLJIJIL.getValue();
        if (value == null) {
            value = C2097608Jq.LJ();
        }
        DraftBoxModel draftBoxModel = awemeDraft.LIZ.draftBoxModel;
        if (strLIZIZ == null) {
            C0M16.LIZ.getClass();
            strLIZIZ = C0M16.LIZIZ(value);
        }
        draftBoxModel.sortBy = strLIZIZ;
        DraftBoxModel draftBoxModel2 = awemeDraft.LIZ.draftBoxModel;
        C0M16.LIZ.getClass();
        draftBoxModel2.filterBy = C0M16.LIZ(value);
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        C19EG activity = getActivity();
        if (activity != null) {
            C556820Lse c556820Lse = C556820Lse.LIZ;
            int i = awemeDraft.LJIJI;
            c556820Lse.getClass();
            C570560MZi.LJ(activity, awemeDraft, i, j, c561120Lza, null, str);
        }
    }

    public final void kS(String str, int i, EnumC562200M3e enumC562200M3e, C562260M3k c562260M3k, C0M0Z c0m0z) {
        if (Intrinsics.LJFF(dS().LLJILJIL.getValue(), Boolean.TRUE)) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadMore return by ");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LLLLIILLL >= i) {
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLoadMore return by reached end, currentPage = ");
            sbLIZ2.append(this.LLLLIILLL);
            sbLIZ2.append(" | totalPageSize = ");
            sbLIZ2.append(i);
            C201955140j.LIZLLL(c0may2, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ2));
            RecyclerView recyclerViewLLII = LLII();
            if (recyclerViewLLII != null) {
                HandlerHook.viewPost(recyclerViewLLII, new ARunnableS108S0100000_8(this, 74));
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LLLLIIIILLL, null, null, new C561240Lzm(this, i, c562260M3k, c0m0z, enumC562200M3e, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.0mGW, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, X.0mGW, android.app.Dialog] */
    @Override // X.InterfaceC562010M2l
    public final void qR(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        CreativeToolsPluginService creativeToolsPluginService;
        String str5 = str3;
        if (this.LLJJJJLIIL && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LIZJ(context, "draft_again", true)) {
            if (C298200BmU.LIZ()) {
                C0CHQ.LIZ().LJJJJJ().preloadVESoAsync();
            }
            if (z2) {
                if (z) {
                    C0M18 c0m18 = C0M18.LIZ;
                    C561130Lzb c561130LzbWR = WR();
                    boolean z3 = this.LLJJJJ;
                    c0m18.getClass();
                    AwemeDraft awemeDraftLJ = c561130LzbWR.LJ(str);
                    if (awemeDraftLJ == null) {
                        C201955140j.LIZJ(C0MAY.LIZIZ, "createNewVideo -> draft is null");
                        C1AF0.LIZJ("queryNull -> createNewVideo");
                        return;
                    }
                    AVMusic aVMusic = awemeDraftLJ.LJ;
                    if (aVMusic != null) {
                        aVMusic.ignoreReuseAudio = false;
                    }
                    C259800zU c259800zU = new C259800zU();
                    ?? dialogC1389620mGW = new DialogC1389620mGW(context);
                    dialogC1389620mGW.LJJLIIJ(false);
                    dialogC1389620mGW.LJJLL(false);
                    dialogC1389620mGW.setCancelable(false);
                    dialogC1389620mGW.LJJLJLI(context.getString(R.string.txr));
                    dialogC1389620mGW.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0M1J
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            dialogInterface.dismiss();
                            o.LJI.LIZIZ();
                        }
                    });
                    c259800zU.element = dialogC1389620mGW;
                    C786410Ut5.J4(dialogC1389620mGW);
                    C0M18.LIZ(true);
                    C0MYR.LIZ(C1388190mED.LIZIZ(context), awemeDraftLJ, new C571410Mb5(awemeDraftLJ, str2, str5, str4, context, z3), new AwS552S0100000_8(c259800zU, (C259800zU<DialogC1389620mGW>) 13)).LIZ();
                    return;
                }
            } else {
                if (z) {
                    C0M18 c0m182 = C0M18.LIZ;
                    C561130Lzb c561130LzbWR2 = WR();
                    boolean z4 = this.LLJJJJ;
                    c0m182.getClass();
                    if (c561130LzbWR2.LJ(str) == null) {
                        C201955140j.LIZJ(C0MAY.LIZIZ, "createNewVideo -> draft is null");
                        C1AF0.LIZJ("queryNull -> createNewVideo");
                        return;
                    }
                    if (str2 == null) {
                        return;
                    }
                    C1398110mUD.LIZ = "draft_page";
                    C571420Mb6 c571420Mb6 = new C571420Mb6();
                    c571420Mb6.LIZLLL = str2;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    c571420Mb6.LJ = str5;
                    if (str4 != null) {
                        str6 = str4;
                    }
                    c571420Mb6.LJFF = str6;
                    C0M18.LIZIZ(context, c571420Mb6, z4);
                    return;
                }
                if (!z2) {
                    return;
                }
            }
            C0M18 c0m183 = C0M18.LIZ;
            C561130Lzb c561130LzbWR3 = WR();
            boolean z5 = this.LLJJJJ;
            c0m183.getClass();
            AwemeDraft awemeDraftLJ2 = c561130LzbWR3.LJ(str);
            if (awemeDraftLJ2 == null) {
                C201955140j.LIZJ(C0MAY.LIZIZ, "createNewVideo -> draft is null");
                C1AF0.LIZJ("queryNull -> createNewVideo");
                return;
            }
            AVMusic aVMusic2 = awemeDraftLJ2.LJ;
            if (aVMusic2 != null) {
                aVMusic2.ignoreReuseAudio = false;
            }
            C259800zU c259800zU2 = new C259800zU();
            ?? dialogC1389620mGW2 = new DialogC1389620mGW(context);
            dialogC1389620mGW2.LJJLIIJ(false);
            dialogC1389620mGW2.LJJLL(false);
            dialogC1389620mGW2.setCancelable(false);
            dialogC1389620mGW2.LJJLJLI(context.getString(R.string.txr));
            dialogC1389620mGW2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0M1I
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                    o.LJI.LIZIZ();
                }
            });
            c259800zU2.element = dialogC1389620mGW2;
            C786410Ut5.J4(dialogC1389620mGW2);
            C0M18.LIZ(true);
            C0MYR.LIZ(C1388190mED.LIZIZ(context), awemeDraftLJ2, new C571400Mb4(awemeDraftLJ2, context, z5), new AwS552S0100000_8(c259800zU2, (C259800zU<DialogC1389620mGW>) 12)).LIZ();
        }
    }
}
