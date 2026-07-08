package com.ss.android.ugc.feed.platform.panel.player;

import X.C01GW;
import X.C0CLW;
import X.C0IR0;
import X.C0IS1;
import X.C0N0Y;
import X.C0RDR;
import X.C0RGG;
import X.C0SFC;
import X.C0SZ8;
import X.C0T12;
import X.C0T13;
import X.C0T14;
import X.C0T15;
import X.C0T1Q;
import X.C0T1R;
import X.C0T1S;
import X.C0TC9;
import X.C1233040iBy;
import X.C1481110oe5;
import X.C1483410ohn;
import X.C1594680rbG;
import X.C15O7;
import X.C1618110sD3;
import X.C1618440sDa;
import X.C19EG;
import X.C1EE1;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2276411E8h;
import X.C2281231EQv;
import X.C2344009Gk;
import X.C2521509uP;
import X.C2521609uQ;
import X.C291630Bbt;
import X.C300880Bqo;
import X.C302540BtU;
import X.C316660CbA;
import X.C452501pT;
import X.C586380MzE;
import X.C586920N0g;
import X.C729510SjV;
import X.C735280Sso;
import X.C739660Szs;
import X.C739800T0g;
import X.C739900T0q;
import X.C739910T0r;
import X.C740740T3w;
import X.C755980Tl6;
import X.EnumC584330Mvv;
import X.InterfaceC739770T0d;
import Y.ACallableS2S3400000_21;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.StoryFeedListHelper;
import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import java.util.HashMap;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class PlayerComponentTemp implements IPlayerComponentAbility {
    public static final HashMap<String, C0IS1<C0IR0>> LLJLLIL = new HashMap<>();
    public static C0IS1<C0IR0> LLJLLL;
    public BaseListFragmentPanel LL;
    public C0N0Y LLIZ;
    public InterfaceC739770T0d LLIZLLLIL;
    public C586920N0g LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public C0IS1<C0IR0> LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public float LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public C0SZ8 LLJJL;
    public C0SZ8 LLJJLIIIJLLLLLLLZ;
    public C0SZ8 LLJL;
    public Boolean LLJLILLLLZIIL;
    public Aweme LLJLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C739800T0g(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C739910T0r(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0T14(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C0T15(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C0T13(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C739900T0q(this));
    public int LLJJI = -1;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 654));

    public final boolean LJIIJJI() {
        Boolean bool;
        try {
            bool = this.LLJLILLLLZIIL;
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean enableOnPageSelectPauseCheck = C0CLW.LIZIZ.LIZ.getEnableOnPageSelectPauseCheck();
        this.LLJLILLLLZIIL = enableOnPageSelectPauseCheck;
        if (enableOnPageSelectPauseCheck != null) {
            return enableOnPageSelectPauseCheck.booleanValue();
        }
        return true;
    }

    public final String LIZ() {
        return (String) this.LLJILJIL.getValue();
    }

    public final boolean LIZLLL() {
        if (C2521509uP.LIZ) {
            IRootAbility iRootAbility = (IRootAbility) this.LLILLL.getValue();
            return iRootAbility != null && iRootAbility.getUserVisibleHint();
        }
        BaseListFragmentPanel baseListFragmentPanel = this.LL;
        return baseListFragmentPanel != null && baseListFragmentPanel.LLZLLIL;
    }

    public final boolean LJFF() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    public final void LJIILIIL() {
        InterfaceC739770T0d interfaceC739770T0d = this.LLIZLLLIL;
        getPlayerManager().LJJLIIJ(interfaceC739770T0d != null ? interfaceC739770T0d.LJIIZILJ() : null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void LJJIIZ() {
        InterfaceC739770T0d interfaceC739770T0d = this.LLIZLLLIL;
        if (interfaceC739770T0d != null) {
            interfaceC739770T0d.LJJIIZ();
        }
    }

    public final void Vm1() {
        Aweme aweme;
        String str;
        BaseListFragmentPanel baseListFragmentPanel = this.LL;
        if (baseListFragmentPanel != null && baseListFragmentPanel.getUserVisibleHint()) {
            C0SZ8 c0sz8LJLIL = baseListFragmentPanel.LJLIL();
            if (!C1594680rbG.LJIIJJI(c0sz8LJLIL) || c0sz8LJLIL == null || (aweme = c0sz8LJLIL.getAweme()) == null || aweme == this.LLJLL) {
                return;
            }
            this.LLJLL = aweme;
            Context context = baseListFragmentPanel.getContext();
            JSONObject jSONObjectZj = baseListFragmentPanel.zj();
            C2189821An6 c2189821An6 = baseListFragmentPanel.LLLLIIIILLL;
            String strC7 = baseListFragmentPanel.C7(true);
            Fragment fragment = baseListFragmentPanel.getFragment();
            C19EG activity = fragment != null ? fragment.getActivity() : null;
            LruCache<String, C739660Szs> lruCache = C0T12.LIZ;
            int pageType = c2189821An6.getPageType();
            if (pageType == 0) {
                str = "homepage_hot";
            } else if (pageType == 1) {
                str = "homepage_follow";
            } else if (pageType == 7) {
                str = "homepage_nearby";
            } else if (pageType == 9) {
                str = "search";
            } else if (pageType == 33) {
                str = "homepage_popular";
            } else if (pageType == 45) {
                str = "homepage_series";
            } else if (pageType != 2000) {
                return;
            } else {
                str = "others_homepage";
            }
            C15O7.LIZIZ(new ACallableS2S3400000_21(jSONObjectZj, aweme, strC7, context, str, aweme.getAid(), c2189821An6, activity, 0), C20684815ws.LJFF(), null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final C0N0Y getPlayerManager() {
        C0N0Y c0n0yLJLJJI = this.LLIZ;
        if (c0n0yLJLJJI == null) {
            c0n0yLJLJJI = C1483410ohn.LJLJJI();
        }
        this.LLIZ = c0n0yLJLJJI;
        return c0n0yLJLJJI;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void tryResumePlay() {
        Aweme awemeLLLLLJLJLL;
        BaseListFragmentPanel baseListFragmentPanel = this.LL;
        if (baseListFragmentPanel == null || (awemeLLLLLJLJLL = baseListFragmentPanel.LLLLLJLJLL()) == null) {
            return;
        }
        jF0(awemeLLLLLJLJLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final int uz1() {
        C586920N0g c586920N0g = this.LLJ;
        if (c586920N0g != null) {
            return c586920N0g.LIZ;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void LLLLLLLLLL() {
        getPlayerManager().LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String Zc() {
        return LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final long getCurrentPosition() {
        return getPlayerManager().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void hs() {
        getPlayerManager().LJJL();
        C755980Tl6.LIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final int s2() {
        InterfaceC739770T0d interfaceC739770T0dP2 = P2();
        if (interfaceC739770T0dP2 != null) {
            return interfaceC739770T0dP2.s2();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final long te() {
        InterfaceC739770T0d interfaceC739770T0dP2 = P2();
        if (interfaceC739770T0dP2 != null) {
            return interfaceC739770T0dP2.te();
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final float An2() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final InterfaceC739770T0d P2() {
        return this.LLIZLLLIL;
    }

    public static boolean LIZIZ(BaseListFragmentPanel baseListFragmentPanel) {
        if (baseListFragmentPanel.LJJ() && !baseListFragmentPanel.getFragment().isResumed()) {
            return false;
        }
        return true;
    }

    public final void LJI(C0SZ8 c0sz8) {
        if (c0sz8 == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SurfaceView", "PlayerComponentTemp onHolderWhenScrollEnd");
        }
        if (c0sz8 instanceof C0RDR) {
            BaseFeedPlayerView baseFeedPlayerViewE = c0sz8.E();
            if ((baseFeedPlayerViewE != null && baseFeedPlayerViewE.Mg()) || LJFF()) {
                c0sz8.onScrollEnd();
            }
        }
    }

    public final void LJIJJLI(boolean z) {
        Aweme awemeLLLLLJLJLL;
        BaseListFragmentPanel baseListFragmentPanel = this.LL;
        if (baseListFragmentPanel != null) {
            awemeLLLLLJLJLL = baseListFragmentPanel.LLLLLJLJLL();
        } else {
            awemeLLLLLJLJLL = null;
        }
        if (z) {
            Vm1();
        }
        ui(awemeLLLLLJLJLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void dO0(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            getPlayerManager().seek(f);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void jF0(Aweme aweme) {
        ui(aweme);
        Vm1();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void nk(boolean z) {
        BaseListFragmentPanel baseListFragmentPanel;
        if (z && (baseListFragmentPanel = this.LL) != null) {
            baseListFragmentPanel.showIvPlay();
        }
        LJIILIIL();
    }

    public final void ui(Aweme aweme) {
        InterfaceC739770T0d interfaceC739770T0d;
        boolean z;
        IResumePlayPanelComponent iResumePlayPanelComponent;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        BaseListFragmentPanel baseListFragmentPanel = this.LL;
        if (baseListFragmentPanel == null) {
            return;
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJ(aweme) || baseListFragmentPanel.getContext() == null) {
            return;
        }
        C0SZ8 c0sz8LJLIL = baseListFragmentPanel.LJLIL();
        if (C302540BtU.LIZIZ && c0sz8LJLIL != null) {
            c0sz8LJLIL.LLLI(1);
        }
        if (C740740T3w.LJFF((C19EG) baseListFragmentPanel.activity) != aweme) {
            C740740T3w.LJII((C19EG) baseListFragmentPanel.activity, aweme);
        }
        BaseListFragmentPanel baseListFragmentPanel2 = this.LL;
        if (baseListFragmentPanel2 != null && (interfaceC739770T0d = this.LLIZLLLIL) != null) {
            Activity activity = baseListFragmentPanel2.activity;
            int iEk1 = 0;
            String aid = null;
            if (activity instanceof C19EG) {
                Fragment fragmentLJJJJZI2 = ((C19EG) activity).getSupportFragmentManager().LJJJJZI("quick_chat_sheet");
                if (fragmentLJJJJZI2 != null && fragmentLJJJJZI2.isVisible()) {
                    z = true;
                } else {
                    z = false;
                }
                Activity activity2 = baseListFragmentPanel2.activity;
                if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("GameLivePartnerShipMixedPage")) != null && fragmentLJJJJZI.isVisible()) {
                    z = true;
                }
            } else {
                z = false;
            }
            if (C0T1R.LJ(aweme)) {
                interfaceC739770T0d.LJJJJZI(aweme);
                interfaceC739770T0d.p6(aweme, 0, z);
                return;
            }
            if (C729510SjV.LJIJJLI(aweme)) {
                long jLJJIFFI = C1618440sDa.LIZIZ.LJIJJLI().LJJIFFI(baseListFragmentPanel2.LJZI());
                if (jLJJIFFI > 0) {
                    interfaceC739770T0d.p6(aweme, (int) jLJJIFFI, z);
                    return;
                }
            }
            FeedPopupService feedPopupService = (FeedPopupService) PluggableExtentionKt.pluggableSpi$default(FeedPopupService.class, false, false, false, 14, null);
            if (feedPopupService != null && feedPopupService.LJ()) {
                return;
            }
            C2281231EQv c2281231EQv = C2281231EQv.LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(baseListFragmentPanel2.getEventType());
            sbLIZ.append(System.identityHashCode(baseListFragmentPanel2.getFragment()));
            if (c2281231EQv.LJIIL(aid, C2188811AlT.LIZIZ(sbLIZ), C0TC9.RESUME_PLAY_INTERNAL)) {
                return;
            }
            if (((Number) C300880Bqo.LIZ.getValue()).intValue() > 0 && (iResumePlayPanelComponent = (IResumePlayPanelComponent) this.LLILLJJLI.getValue()) != null && iResumePlayPanelComponent.jx(aweme)) {
                return;
            }
            IPipAbility iPipAbility = (IPipAbility) this.LLILZ.getValue();
            if (iPipAbility != null) {
                iPipAbility.ac1();
                IPipAbility iPipAbility2 = (IPipAbility) this.LLILZ.getValue();
                if (iPipAbility2 != null) {
                    iEk1 = iPipAbility2.ek1(aweme);
                }
            }
            interfaceC739770T0d.p6(aweme, iEk1, z);
        }
    }

    public final void LJII(C0SZ8 c0sz8, String str) {
        if (c0sz8 == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayerComponentTemp onHolderWhenScrollStart ");
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c0sz8 instanceof C0RDR) {
            BaseFeedPlayerView baseFeedPlayerViewE = c0sz8.E();
            if ((baseFeedPlayerViewE != null && baseFeedPlayerViewE.Mg()) || LJFF()) {
                c0sz8.LJIJJ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void Y2(Aweme aweme, boolean z, boolean z2) {
        Bj(aweme, z, z2, false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final String p6(Aweme aweme, int i, boolean z) {
        InterfaceC739770T0d interfaceC739770T0d = this.LLIZLLLIL;
        if (interfaceC739770T0d != null) {
            return interfaceC739770T0d.p6(aweme, i, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility
    public final void Bj(Aweme aweme, boolean z, boolean z2, boolean z3) {
        boolean zLIZLLL;
        C586920N0g c586920N0gLLLII;
        PaidContentInfo paidContentInfo;
        String eventType;
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        String eventType2 = null;
        Activity activity = null;
        if (c1ee1.LJJIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LL;
            if (baseListFragmentPanel != null) {
                eventType = baseListFragmentPanel.getEventType();
            } else {
                eventType = null;
            }
            if (Intrinsics.LJFF(eventType, "offline_mode_page")) {
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                if (C586380MzE.LIZ().LIZLLL) {
                    BaseListFragmentPanel baseListFragmentPanel2 = this.LL;
                    if (baseListFragmentPanel2 != null) {
                        activity = baseListFragmentPanel2.activity;
                    }
                    c1ee1.LJIILLIIL(activity);
                    return;
                }
            }
        }
        boolean z4 = true;
        if (aweme != null && C0SFC.LIZIZ.LJIIIIZZ(aweme) && ((paidContentInfo = aweme.mPaidContentInfo) == null || !paidContentInfo.isPartialPreview())) {
            BaseListFragmentPanel baseListFragmentPanel3 = this.LL;
            if (baseListFragmentPanel3 != null) {
                eventType2 = baseListFragmentPanel3.getEventType();
            }
            if (Intrinsics.LJFF(eventType2, "paid_series_detail_page")) {
                return;
            }
        }
        BaseListFragmentPanel baseListFragmentPanel4 = this.LL;
        if (baseListFragmentPanel4 == 0) {
            return;
        }
        I18nPlayerController i18nPlayerController = baseListFragmentPanel4.LLLLIILL;
        if (i18nPlayerController != null && (c586920N0gLLLII = i18nPlayerController.LLLII()) != null && c586920N0gLLLII.LIZ == 2 && z2) {
            if (baseListFragmentPanel4 instanceof C0T1Q) {
                ((C0T1Q) baseListFragmentPanel4).LJIIZILJ("pause");
            }
            IPipAbility iPipAbility = (IPipAbility) this.LLILZ.getValue();
            if (iPipAbility != null) {
                iPipAbility.To2(z2);
            }
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJ(aweme)) {
            C1233040iBy c1233040iBy = new C1233040iBy(baseListFragmentPanel4.getContext());
            c1233040iBy.LIZIZ(2131858551);
            c1233040iBy.LIZLLL();
            return;
        }
        boolean z5 = C2521609uQ.LIZ;
        if ((((!z5 || !z2) && !LIZLLL()) || !baseListFragmentPanel4.isViewValid()) && !C1618110sD3.LIZ()) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try to handlePlay,but can't meet the conditions,pageResume:");
            sbLIZ.append(LIZLLL());
            sbLIZ.append(", pageVisibilityHandleFromUser: ");
            if (z5 && z2) {
                zLIZLLL = true;
            } else {
                zLIZLLL = LIZLLL();
            }
            sbLIZ.append(zLIZLLL);
            sbLIZ.append(", rootVisibility: ");
            IRootAbility iRootAbility = (IRootAbility) this.LLILLL.getValue();
            if (iRootAbility == null || !iRootAbility.getUserVisibleHint()) {
                z4 = false;
            }
            sbLIZ.append(z4);
            sbLIZ.append(", fragment: ");
            sbLIZ.append(baseListFragmentPanel4.getFragment());
            sbLIZ.append(", panel: ");
            sbLIZ.append(baseListFragmentPanel4);
            sbLIZ.append(",isViewValid:");
            sbLIZ.append(baseListFragmentPanel4.isViewValid());
            sbLIZ.append("BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():");
            sbLIZ.append(C1618110sD3.LIZ());
            c2276411E8h.LIZJ("common_feed", 4, "PlayerComponentTemp", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the stacktrace:");
            sbLIZ2.append(Log.getStackTraceString(new Throwable()));
            c2276411E8h.LIZJ("common_feed", 4, "PlayerComponentTemp", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        InterfaceC739770T0d interfaceC739770T0d = this.LLIZLLLIL;
        if (interfaceC739770T0d != null) {
            interfaceC739770T0d.Bj(aweme, z, z2, false);
        }
    }

    public final String LJIIZILJ(Aweme aweme, boolean z, C0SZ8 c0sz8, boolean z2) {
        int iEk1;
        String aid;
        String from;
        String hotEnterMethod;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        C2189821An6 c2189821An63;
        StoryFeedListHelper storyFeedListHelper;
        String strLIZ;
        IPipAbility iPipAbility = (IPipAbility) this.LLILZ.getValue();
        boolean z3 = false;
        if (iPipAbility != null) {
            iEk1 = iPipAbility.ek1(aweme);
        } else {
            iEk1 = 0;
        }
        if (C729510SjV.LJJIIZ(aweme)) {
            BaseListFragmentPanel baseListFragmentPanel = this.LL;
            if (baseListFragmentPanel == null || (storyFeedListHelper = baseListFragmentPanel.LLLZLL) == null || (strLIZ = storyFeedListHelper.LIZ()) == null) {
                return "";
            }
            return strLIZ;
        }
        InterfaceC739770T0d interfaceC739770T0d = this.LLIZLLLIL;
        if (interfaceC739770T0d == null) {
            return "";
        }
        if (aweme != null) {
            BaseListFragmentPanel baseListFragmentPanel2 = this.LL;
            C2189821An6 c2189821An64 = null;
            if (baseListFragmentPanel2 != null && (c2189821An63 = baseListFragmentPanel2.LLLLIIIILLL) != null) {
                aid = c2189821An63.getAid();
            } else {
                aid = null;
            }
            BaseListFragmentPanel baseListFragmentPanel3 = this.LL;
            if (baseListFragmentPanel3 != null && (c2189821An62 = baseListFragmentPanel3.LLLLIIIILLL) != null) {
                from = c2189821An62.getFrom();
            } else {
                from = null;
            }
            BaseListFragmentPanel baseListFragmentPanel4 = this.LL;
            if (baseListFragmentPanel4 != null && (c2189821An6 = baseListFragmentPanel4.LLLLIIIILLL) != null) {
                hotEnterMethod = c2189821An6.getHotEnterMethod();
            } else {
                hotEnterMethod = null;
            }
            if (!TextUtils.equals(aweme.getAid(), aid)) {
                BaseListFragmentPanel baseListFragmentPanel5 = this.LL;
                if (baseListFragmentPanel5 != null) {
                    c2189821An64 = baseListFragmentPanel5.LLLLIIIILLL;
                }
                C0T1R.LJII(c2189821An64, "switched");
            } else {
                String aid2 = aweme.getAid();
                try {
                    C0T1S.LIZ.getClass();
                    if (C0T1S.LIZIZ(from, hotEnterMethod, aid, aid2) && !C0T1S.LJII) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZLLL(jCurrentTimeMillis - C0T1S.LIZIZ, "duration");
                        c2344009Gk.LIZJ(C0T1S.LIZJ, "page_size");
                        c2344009Gk.LJIIIIZZ("card_status", C0T1S.LIZLLL);
                        c2344009Gk.LJIIIIZZ("click_area", C0T1S.LJ);
                        c2344009Gk.LIZJ(C0T1S.LJFF, "single_player");
                        c2344009Gk.LJIIIIZZ("enter_from", hotEnterMethod);
                        C20684815ws.LJIILLIIL("rd_tiktokec_mall_video_try_play", c2344009Gk.LIZ);
                        C0T1S.LJII = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                String aid3 = aweme.getAid();
                if (Intrinsics.LJFF("goods_search", from) && Intrinsics.LJFF("goods_search", hotEnterMethod) && TextUtils.equals(aid, aid3)) {
                    z3 = true;
                }
                if (z3) {
                    ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJIIIZ(from, hotEnterMethod, aid, aweme.getAid());
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get pip initialStartTime from ");
        sbLIZ.append(this.LLILZ.getValue());
        sbLIZ.append(" : ");
        sbLIZ.append(iEk1);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            aweme.getAid();
        }
        if (z2) {
            C291630Bbt.LIZ.getClass();
            if (((Boolean) C291630Bbt.LIZIZ.getValue()).booleanValue()) {
                return interfaceC739770T0d.LJIILIIL(aweme, z, c0sz8, iEk1, EnumC584330Mvv.ON_PAGE_SELECT);
            }
        }
        return interfaceC739770T0d.LJLILLLLZI(iEk1, c0sz8, aweme, z);
    }

    public final void LJIIJ(C0SZ8 c0sz8, int i, float f, int i2, int i3) {
        if (c0sz8 == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayerComponentTemp onHolderWhenScrolling ");
            sbLIZ.append(i2);
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c0sz8 instanceof C0RDR) {
            BaseFeedPlayerView baseFeedPlayerViewE = c0sz8.E();
            if ((baseFeedPlayerViewE != null && baseFeedPlayerViewE.Mg()) || LJFF()) {
                c0sz8.q7(f, i, i2, i3);
            }
        }
    }
}
