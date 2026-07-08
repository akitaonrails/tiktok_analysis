package com.ss.android.ugc.aweme.detail.ui.saf;

import X.C01GW;
import X.C036E;
import X.C08JS;
import X.C093Y;
import X.C098200Yq;
import X.C0AAI;
import X.C0AAR;
import X.C0BSS;
import X.C0OGM;
import X.C0QTN;
import X.C0RO1;
import X.C0S4J;
import X.C0SUC;
import X.C0W93;
import X.C0Z6E;
import X.C1256070in7;
import X.C1367960lha;
import X.C1386470mBR;
import X.C1399700mWm;
import X.C13DB;
import X.C13LP;
import X.C1440005kM;
import X.C1443290nf5;
import X.C14EU;
import X.C14K9;
import X.C1600750rl3;
import X.C1606370ru7;
import X.C1606380ru8;
import X.C1606640ruY;
import X.C1615106Ub;
import X.C1618440sDa;
import X.C1787206zG;
import X.C1800490wxD;
import X.C189200o6;
import X.C1913380ztI;
import X.C19252910Tv;
import X.C19EG;
import X.C2037707yZ;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2189831An7;
import X.C2276411E8h;
import X.C2277711EDh;
import X.C2344009Gk;
import X.C2513109t3;
import X.C2513209t4;
import X.C264000AWg;
import X.C277070AtV;
import X.C287370BOd;
import X.C452501pT;
import X.C484220Iyq;
import X.C486860J7k;
import X.C522010Kdb;
import X.C523420Kfs;
import X.C581630MrZ;
import X.C584460Mw8;
import X.C652090Phv;
import X.C686870Qwv;
import X.C715170S3n;
import X.C722760SWs;
import X.C737030Svd;
import X.C786410Ut5;
import X.C799570VYd;
import X.C806840Vkw;
import X.C818480W8w;
import X.C844470XAv;
import X.C913020Zro;
import X.C913060Zrs;
import X.C960203pA;
import X.EnumC1879480z0c;
import X.InterfaceC1058480deQ;
import X.InterfaceC1209250hZb;
import X.InterfaceC1218550hob;
import X.InterfaceC1399350mWD;
import X.InterfaceC1740760vOs;
import X.InterfaceC20573715ex;
import X.InterfaceC342470Dbh;
import X.InterfaceC530790Krl;
import X.InterfaceC729990SkH;
import X.InterfaceC836750Ws5;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMChatToDetailSafConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.ITemplateDebugService;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class DetailSafRootFragment extends SAFTikTokFragment implements InterfaceC1218550hob, InterfaceC530790Krl, InterfaceC1058480deQ, InterfaceC836750Ws5, InterfaceC1740760vOs, InterfaceC20573715ex, C0OGM {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpPS46HELIOSJGs5IGEgKSNiDSonKSwgGi41GiojPQkhKSIhLCEn";
    public AmeBaseFragment LLJJ;
    public List<InterfaceC1399350mWD> LLJJI;
    public FrameLayout LLJJIJI;
    public volatile boolean LLJJIJIIJIL;
    public InterfaceC342470Dbh LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Configuration LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public InterfaceC729990SkH LLJLIL;
    public C722760SWs LLJLILLLLZIIL;
    public C1606380ru8 LLJLL;
    public C2189821An6 LLJLLL;
    public FrameLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public int LLL;
    public long LLLF;
    public long LLLFF;
    public long LLLFFI;
    public long LLLFZ;
    public long LLLI;
    public AudioManager LLLII;
    public final C01GW LLLIIII;
    public int LLLIIIIL;
    public C686870Qwv LLLIIIL;
    public final C0S4J LLJILLL = new C0S4J("DetailSafRoot");
    public String LLJJIII = "";
    public final C1399700mWm LLJLLIL = new C1399700mWm(this);

    @Override // X.InterfaceC20573715ex
    public final void E4() {
    }

    @Override // X.InterfaceC20573715ex
    public final boolean K6() {
        return true;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2878";
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return -1;
    }

    @Override // X.InterfaceC20573715ex
    public final boolean wy() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // X.InterfaceC1058480deQ
    public final DetailPageFragment Bc() {
        ?? r0 = this.LLJJ;
        if (r0 == 0) {
            return null;
        }
        return r0.vD();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() throws JSONException {
        C1606380ru8 c1606380ru8 = this.LLJLL;
        if (c1606380ru8 != null) {
            View view = c1606380ru8.LIZ;
            if (view != null) {
                HandlerHook.viewRemoveCallbacks(view, c1606380ru8.LIZLLL);
            }
            C806840Vkw.LIZ();
            c1606380ru8.LIZ = null;
            c1606380ru8.LIZIZ = null;
        }
        this.LLJLL = null;
        if (qS().getBooleanExtra("im_chat_to_detail_saf", false)) {
            C1606640ruY.LIZ.getClass();
            IMChatToDetailSafConfig iMChatToDetailSafConfigLIZ = C1606640ruY.LIZ();
            if (iMChatToDetailSafConfigLIZ.exitAnim != 0) {
                aS(new AwS603S0100000_24(iMChatToDetailSafConfigLIZ, 522));
            }
        }
        super.finish();
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 272);
        if (sS()) {
            return;
        }
        awS568S0100000_24.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // X.InterfaceC1218550hob
    public final InterfaceC1209250hZb getHelper() {
        ?? r0 = this.LLJJ;
        if (r0 != 0) {
            return r0.w8();
        }
        return null;
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        C686870Qwv c686870Qwv = this.LLLIIIL;
        if (c686870Qwv != null) {
            return c686870Qwv;
        }
        C686870Qwv c686870Qwv2 = new C686870Qwv(requireActivity());
        this.LLLIIIL = c686870Qwv2;
        return c686870Qwv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS() {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.nS():void");
    }

    public final void oS() {
        if (((Boolean) C0AAR.LIZ.getValue()).booleanValue()) {
            try {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (eventBusLIZLLL.LJIIJ(this)) {
                    eventBusLIZLLL.LJJI(this);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        ?? r0;
        C2189821An6 c2189821An6 = this.LLJLLL;
        DetailNavArgModel navArgModel = c2189821An6 != null ? c2189821An6.getNavArgModel() : null;
        boolean z = false;
        if (navArgModel != null ? Intrinsics.LJFF(navArgModel.isThumbnailScaleUp(), Boolean.TRUE) : false) {
            C722760SWs c722760SWs = this.LLJLILLLLZIIL;
            if (c722760SWs != null) {
                C722760SWs.LIZ(c722760SWs, navArgModel, null, this, 2);
            }
            return true;
        }
        if (yS()) {
            uS();
        }
        try {
            List<InterfaceC1399350mWD> list = this.LLJJI;
            if (list != null) {
                for (InterfaceC1399350mWD interfaceC1399350mWD : (ArrayList) list) {
                    if (interfaceC1399350mWD.onKeyDown(4, null)) {
                        return true;
                    }
                    if (C287370BOd.LIZ() && interfaceC1399350mWD.Fi()) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJILLL.LJI("[onBackPressed]", e);
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LL(getActivity())) {
            return true;
        }
        AmeBaseFragment ameBaseFragment = this.LLJJ;
        if (ameBaseFragment == null || !ameBaseFragment.isViewValid()) {
            C2276411E8h.LIZIZ.LIZJ("detail_feed", 6, "DetailSafRoot", "back when fragment is null!");
        } else {
            ?? r02 = this.LLJJ;
            if ((r02 == 0 || !r02.LLLLIIL()) && (r0 = this.LLJJ) != 0) {
                r0.LJIJ();
            }
            z = true;
        }
        C1440005kM.LIZ(new C737030Svd(42));
        this.LLJILLL.LJIIIZ("[onBackPressed] " + getActivity());
        return z;
    }

    public final Intent qS() {
        return (Intent) this.LLLIIII.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        User author;
        User author2;
        ?? r0 = this.LLJJ;
        if (r0 == 0 || r0.LJIIIIZZ() == null) {
            return null;
        }
        ?? r02 = this.LLJJ;
        Aweme awemeLJIIIIZZ = r02 != 0 ? r02.LJIIIIZZ() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_id", awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null);
        if (awemeLJIIIIZZ != null && awemeLJIIIIZZ.getAuthor() != null && awemeLJIIIIZZ != null && (author = awemeLJIIIIZZ.getAuthor()) != null && author.getAvatarThumb() != null) {
            UrlModel avatarThumb = (awemeLJIIIIZZ == null || (author2 = awemeLJIIIIZZ.getAuthor()) == null) ? null : author2.getAvatarThumb();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("uri", avatarThumb != null ? avatarThumb.getUri() : null);
            linkedHashMap2.put("url_list", avatarThumb != null ? avatarThumb.getUrlList() : null);
            linkedHashMap.put("avatar_thumb", C08JS.LIZLLL(linkedHashMap2));
        }
        return linkedHashMap;
    }

    public final void uS() {
        Intent intent = new Intent();
        intent.putExtra("TIME_PAUSED_IN_DETAIL_ACTIVITY", this.LLLI);
        C1800490wxD.LIZJ(this, 54321, intent);
    }

    public DetailSafRootFragment() {
        aS(AFwS264S0000000_24.get$arr$(62));
        this.LLL = -1;
        this.LLLFZ = -1L;
        this.LLLIIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 276));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0339  */
    /* JADX WARN: Type inference failed for: r0v106, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v124, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v143, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v146, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v92, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.onDestroy():void");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        oS();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLF;
        String strIS = iS(qS(), "video_from");
        String strIS2 = iS(qS(), "enter_from");
        String strIS3 = iS(qS(), "profile_search_id");
        String strIS4 = iS(qS(), "search_keyword");
        String strIS5 = iS(qS(), "enter_method");
        String strIS6 = iS(qS(), "search_method");
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJLIIIJ = String.valueOf(jCurrentTimeMillis);
        if (Intrinsics.LJFF("personal_homepage", strIS2) || Intrinsics.LJFF("others_homepage", strIS2)) {
            c1386470mBR.LJ("profile_entrance_id", String.valueOf(C1256070in7.LIZ));
        }
        if (Intrinsics.LJFF("add_yours", strIS) || Intrinsics.LJFF("from_feeds_operate_optimized", strIS)) {
            c1386470mBR.LJJIJL(strIS2);
        }
        if (Intrinsics.LJFF("profile_search_result", strIS)) {
            c1386470mBR.LJJIJL(strIS2);
            c1386470mBR.LJ("profile_search_id", strIS3);
            c1386470mBR.LJ("search_keyword", strIS4);
            c1386470mBR.LJL = strIS5;
            c1386470mBR.LJ("search_method", strIS6);
            c1386470mBR.LJIILJJIL();
        }
        if (yS()) {
            this.LLLFZ = System.currentTimeMillis();
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJJIFFI();
        }
        BPEAHandler bPEAHandler = C584460Mw8.LIZIZ;
        bPEAHandler.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(500L, bPEAHandler, new Runnable() { // from class: X.0MuO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EnterDetailFullscreenMask@b39f.resetFullScreenDelay$1");
                try {
                    C584460Mw8.LIZ = false;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EnterDetailFullscreenMask@b39f.resetFullScreenDelay$1");
            }
        });
        C0S4J c0s4j = this.LLJILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPause] ");
        sbLIZ.append(this);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onResume() throws Throwable {
        super.onResume();
        boolean z = false;
        if (C0RO1.LIZ(this.LLJLLL, getActivity()) && ((Number) C264000AWg.LIZ.getValue()).intValue() == 1 && !this.LLJL) {
            rS(this.LLJLLL);
            this.LLJL = true;
        }
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 274);
        if (!sS()) {
            awS568S0100000_24.invoke();
        }
        if (yS() && this.LLLFZ != -1) {
            this.LLLI += System.currentTimeMillis() - this.LLLFZ;
            this.LLLFZ = -1L;
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            ITemplateDebugService iTemplateDebugService = (ITemplateDebugService) ServiceManager.get().getService(ITemplateDebugService.class);
            getActivity();
            View view = getView();
            if (view != null) {
                view.findViewById(R.id.fri);
            }
            iTemplateDebugService.LIZIZ();
        }
        C584460Mw8.LIZIZ.removeCallbacksAndMessages(null);
        C584460Mw8.LIZ = true;
        this.LLJILLL.LJIIIZ("[onResume] " + this);
        C2277711EDh.LIZIZ.LJJJJZI();
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        String strIS = iS(qS(), FollowStatusChangeMethod.PARAM_UID);
        if (strIS != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C913020Zro c913020Zro = C913060Zrs.LIZ;
            if (c913020Zro == null || !Intrinsics.LJFF(c913020Zro.LIZ, strIS)) {
                return;
            }
            c913020Zro.LJ = (jCurrentTimeMillis - c913020Zro.LIZJ) - c913020Zro.LIZLLL;
            if (c913020Zro.LJIILLIIL <= 0) {
                c913020Zro.LJIILLIIL = jCurrentTimeMillis;
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C913020Zro c913020Zro;
        AudioManager audioManager;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 29 && this.LLJJJJJIL && (audioManager = this.LLLII) != null) {
            audioManager.setAllowedCapturePolicy(2);
        }
        C0S4J c0s4j = this.LLJILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onStart] ");
        sbLIZ.append(getActivity());
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        String strIS = iS(qS(), FollowStatusChangeMethod.PARAM_UID);
        if (strIS == null || strIS.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strIS == null || (c913020Zro = C913060Zrs.LIZ) == null || !Intrinsics.LJFF(c913020Zro.LIZ, strIS) || c913020Zro.LJIILL > 0) {
            return;
        }
        c913020Zro.LJIILL = jCurrentTimeMillis;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C19EG activity;
        AudioManager audioManager;
        DetailActivity detailActivity;
        C19EG activity2 = getActivity();
        if ((activity2 instanceof DetailActivity) && (detailActivity = (DetailActivity) activity2) != null && C2513109t3.LIZ) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS103S0100000_3((Object) detailActivity, 81));
        }
        if (Build.VERSION.SDK_INT >= 29 && this.LLJJJJJIL && (audioManager = this.LLLII) != null) {
            audioManager.setAllowedCapturePolicy(1);
        }
        super.onStop();
        C0S4J c0s4j = this.LLJILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onStop] ");
        sbLIZ.append(getActivity());
        sbLIZ.append(',');
        C19EG activity3 = getActivity();
        sbLIZ.append(activity3 != null ? Boolean.valueOf(activity3.isChangingConfigurations()) : null);
        sbLIZ.append(',');
        C19EG activity4 = getActivity();
        sbLIZ.append(activity4 != null ? Integer.valueOf(activity4.getChangingConfigurations()) : null);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C19EG activity5 = getActivity();
        if (activity5 == null || !activity5.isChangingConfigurations() || (activity = getActivity()) == null) {
            return;
        }
        int changingConfigurations = activity.getChangingConfigurations();
        HashMap map = new HashMap();
        map.put("enter_from", this.LLJJIII);
        map.put("changing_configurations", String.valueOf(changingConfigurations));
        C20684815ws.LJIILLIIL("changing_configuration_recreate", map);
    }

    public final boolean sS() {
        return getActivity() instanceof InterfaceC1058480deQ;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public boolean wS() {
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        String from;
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean zIsStandardUIEnable = C1913380ztI.LLILLJJLI.isStandardUIEnable();
        boolean zLJFF = Intrinsics.LJFF(this.LLJJIII, "notification_page");
        C13DB c13db = new C13DB();
        c13db.add("homepage_friends");
        c13db.add("homepage_follow");
        c13db.add("homepage_hot");
        if (C1615106Ub.LIZIZ()) {
            c13db.add("personal_homepage");
        }
        if (C13LP.LJJJJ(this.LLJJIII, c13db.build()) && (c2189821An6 = this.LLJLLL) != null && c2189821An6.isStoryPage() && (c2189821An62 = this.LLJLLL) != null && (from = c2189821An62.getFrom()) != null && C1600750rl3.LJFF(from)) {
            return false;
        }
        if (zIsStandardUIEnable && zLJFF) {
            return false;
        }
        Set setLJ = C093Y.LJ("offline_mode_page", "similar_videos_page", "chat", "homepage_nearby", "shared_feed");
        if (((Boolean) C0AAI.LIZ.getValue()).booleanValue()) {
            setLJ.add("homepage_explore");
        }
        if (C13LP.LJJJJ(this.LLJJIII, setLJ)) {
            return false;
        }
        String str = this.LLJJIII;
        C19EG activity = getActivity();
        return !C652090Phv.LJ(str, C0SUC.LIZ(activity != null ? activity.getBaseContext() : null).getPlaylistPreviousPage());
    }

    public final boolean yS() {
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ;
        C19EG activity = getActivity();
        return (activity == null || (scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity)) == null || scrollSwitchStateManagerLIZIZ.LL.getValue().intValue() != 0) ? false : true;
    }

    public static Bundle hS(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (X.C1576040r7C.LIZ() != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r3.LLJJ
            r2 = 0
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility r0 = r0.ZP()
            if (r0 == 0) goto L11
            boolean r0 = r0.onDispatchKeyEvent(r4)
            if (r0 != 0) goto L31
        L11:
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r3.LLJJ
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.detail.ui.DetailPageFragment r0 = r0.vD()
            if (r0 == 0) goto L62
            X.0Q7z r1 = X.C1578630rBN.LJ(r0)
            if (r1 == 0) goto L62
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility> r0 = com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility) r0
            if (r0 == 0) goto L62
            boolean r0 = r0.onDispatchKeyEvent(r4)
            if (r0 == 0) goto L62
        L31:
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            boolean r0 = r0.LJJZ()
            if (r0 != 0) goto L5f
            android.content.Intent r0 = r3.qS()
            android.os.Bundle r1 = hS(r0)
            if (r1 == 0) goto L51
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = r1.getString(r0)
        L51:
            java.lang.String r0 = "shared_feed"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L62
            boolean r0 = X.C1576040r7C.LIZ()
            if (r0 == 0) goto L62
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L62:
            java.lang.Boolean r0 = super.dispatchKeyEvent(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.dispatchKeyEvent(android.view.KeyEvent):java.lang.Boolean");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, motionEvent, 7);
        if (sS()) {
            awS425S0200000_24.invoke();
        }
        C715170S3n.LIZ(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void getAgeInfoUpdateEvent(C0Z6E c0z6e) {
        finish();
    }

    public DetailFragment mS(C2189821An6 c2189821An6) {
        Bundle bundleHS = hS(qS());
        if (bundleHS == null) {
            bundleHS = new Bundle();
        }
        return kS(bundleHS, c2189821An6);
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06e4  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        Integer numValueOf;
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJLIIIJLLLLLLLZ != z) {
            this.LLJJLIIIJLLLLLLLZ = z;
            if (sS()) {
                C19EG activity = getActivity();
                if (activity != null) {
                    activity.recreate();
                    return;
                }
                return;
            }
            ZR();
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        Configuration configuration2 = this.LLJJL;
        if (configuration2 == null || configuration.navigation != configuration2.navigation) {
            C0S4J c0s4j = this.LLJILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("navigation config changes ");
            if (configuration2 != null) {
                numValueOf = Integer.valueOf(configuration2.navigation);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(',');
            sbLIZ.append(configuration.navigation);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (((Number) C277070AtV.LIZ.getValue()).intValue() == 1) {
                this.LLJILLL.LJIIIZ("recreate due to navigation");
                if (sS()) {
                    C19EG activity2 = getActivity();
                    if (activity2 != null) {
                        activity2.recreate();
                        return;
                    }
                    return;
                }
                ZR();
                return;
            }
        }
        Configuration configuration3 = this.LLJJL;
        if (configuration3 == null) {
            this.LLJJL = new Configuration(configuration);
        } else {
            configuration3.setTo(configuration);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCoverTransitionFirstFrame(C2037707yZ c2037707yZ) {
        C1606380ru8 c1606380ru8 = this.LLJLL;
        if (c1606380ru8 != null) {
            c1606380ru8.LIZ();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws JSONException {
        C2189821An6 c2189821An6;
        String from;
        C19EG activity;
        C913020Zro c913020Zro;
        this.LLLFF = SystemClock.uptimeMillis();
        this.LLLFFI = System.currentTimeMillis();
        qS().putExtra("feed_detail_page_create", this.LLLFFI);
        String strIS = iS(qS(), FollowStatusChangeMethod.PARAM_UID);
        if (strIS != null && strIS.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (strIS != null && (c913020Zro = C913060Zrs.LIZ) != null && Intrinsics.LJFF(c913020Zro.LIZ, strIS) && c913020Zro.LJII <= 0) {
                c913020Zro.LJII = jCurrentTimeMillis;
            }
        }
        this.LLJLLL = C2189831An7.LIZLLL(getContext(), C1606370ru7.LJFF(this));
        if (!C19252910Tv.LIZIZ.LIZLLL().LJ() && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(1);
        }
        if (C1787206zG.LIZ()) {
            C20673215v0.LJII(getActivity(), "common_feed_item_feed");
            C20673215v0.LJII(getActivity(), "common_feed_micro_app_card_view");
        }
        C2189821An6 c2189821An62 = this.LLJLLL;
        if (c2189821An62 != null && c2189821An62.isStoryPage() && (c2189821An6 = this.LLJLLL) != null && (from = c2189821An6.getFrom()) != null && C1600750rl3.LJFF(from)) {
            C1618440sDa.LIZIZ.LJJ().LIZ(this, getActivity());
        }
        C818480W8w.LIZ("detail_page");
        C818480W8w.LIZ("detail_page_startup");
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 273);
        if (sS()) {
            awS568S0100000_24.invoke();
        }
        super.onCreate(bundle);
        C19EG activity2 = getActivity();
        String sourceBtmToken = null;
        if (activity2 != null && sS()) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C2189821An6 c2189821An63 = this.LLJLLL;
            if (c2189821An63 != null) {
                sourceBtmToken = c2189821An63.getSourceBtmToken();
            }
            btmSDK.registerBtmPageOnCreate(activity2, "a2270.b2878", sourceBtmToken);
            return;
        }
        BtmSDK btmSDK2 = BtmSDK.INSTANCE;
        C2189821An6 c2189821An64 = this.LLJLLL;
        if (c2189821An64 != null) {
            sourceBtmToken = c2189821An64.getSourceBtmToken();
        }
        btmSDK2.registerBtmPageOnCreate(this, "a2270.b2878", sourceBtmToken);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        Aweme awemeLLILZ;
        AwemeRawAd awemeRawAd;
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.equals("adVideoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
            try {
                ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
                if (iTalentAdRevenueShareServiceLJIIL == null) {
                    return;
                }
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data");
                if (jSONObject.opt("object_id") != null) {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "object_id");
                    IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                    if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(string)) != null && awemeLLILZ.getAwemeRawAd() != null && (awemeRawAd = awemeLLILZ.getAwemeRawAd()) != null) {
                        iTalentAdRevenueShareServiceLJIIL.LJIIJJI(awemeRawAd, jSONObject);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        if (C2513209t4.LIZ && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIJL(bundle2, "android:support:fragments", new Bundle());
        }
    }

    @C14EU
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        if (c581630MrZ.LIZ == 6 && Intrinsics.LJFF(this.LLJJJ, "reward_flow") && Intrinsics.LJFF(this.LLJJJIL, "true")) {
            PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
            if (pnSDigitalWellbeingSDKService != null) {
                pnSDigitalWellbeingSDKService.LIZLLL(EnumC1879480z0c.EDUCATION_VIDEO_TASK, null);
            }
            String string = getString(2131835024);
            String string2 = getString(2131834382);
            try {
                String strEncode = URLEncoder.encode("aweme://roma_redirect/?spark_page=positive_reinforcement_home&badge_id=education_video_task", "UTF-8");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("//pns/in_app_push/avatar_circled?enter_from=reward_flow&icon_name=icon_bitmap_wellbeing_mission_sofa&content=");
                sbLIZ.append(string);
                sbLIZ.append("&right_button_text=");
                sbLIZ.append(string2);
                sbLIZ.append("&action_url=");
                sbLIZ.append(strEncode);
                SmartRouter.buildRoute(getContext(), C2188811AlT.LIZIZ(sbLIZ)).open();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("challenge_name", "watch_video");
                C20684815ws.LJIILLIIL("wellbeing_challenge_badge_banner_show", c2344009Gk.LIZ);
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.LLJJJJ) {
            this.LLJJJJ = true;
            C818480W8w.LIZJ("detail_page_startup", C0W93.SUCCESS, null, C2097608Jq.LJ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rS(X.C2189821An6 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            X.0ru7 r0 = X.C1606370ru7.LIZ
            r0.getClass()
            androidx.fragment.app.FragmentManager r0 = X.C1606370ru7.LIZ(r6)
            r5 = 0
            if (r0 != 0) goto L16
            X.19EG r0 = r6.getActivity()
            if (r0 == 0) goto L8e
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
        L16:
            java.lang.String r4 = "storyDetailFragment"
            if (r0 == 0) goto L8c
            androidx.fragment.app.Fragment r3 = r0.LJJJJZI(r4)
        L1e:
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r3 = (com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment) r3
            if (r0 == 0) goto L8a
            X.19EH r2 = r0.LJIIJ()
        L26:
            if (r3 == 0) goto L5c
            r6.LLJJ = r3
        L2a:
            X.19EG r0 = r6.getActivity()
            if (r0 == 0) goto L34
            android.app.Activity r5 = r0.getParent()
        L34:
            X.C344870DfZ.LIZ(r5, r3)
            if (r2 == 0) goto L3f
            r2.LJJIFFI(r3)
            r2.LJIIIZ()
        L3f:
            r0 = 1
            r3.setUserVisibleHint(r0)
            X.0SkH r2 = r6.LLJLIL
            if (r2 == 0) goto L5b
            java.lang.String r1 = "activity_create_to_frag_create_dur_us"
            r0 = 110(0x6e, float:1.54E-43)
            r2.LIZJ(r0, r1)
            X.0SkH r3 = r6.LLJLIL
            if (r3 == 0) goto L5b
            java.lang.String r2 = "detail_create_to_story_frag_attach_dur_us"
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.LJFF(r0, r2)
        L5b:
            return
        L5c:
            android.content.Intent r0 = r6.qS()
            if (r0 == 0) goto L6d
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L69
            if (r1 != 0) goto L72
            goto L6d
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L72:
            java.lang.String r0 = "feed_param"
            X.C786410Ut5.LJJIZ(r1, r0, r7)
            com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment r3 = new com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment
            r3.<init>()
            r3.setArguments(r1)
            r6.LLJJ = r3
            if (r2 == 0) goto L2a
            r0 = 2131373640(0x7f0a2e48, float:1.8367377E38)
            r2.LJIJ(r0, r3, r4)
            goto L2a
        L8a:
            r2 = r5
            goto L26
        L8c:
            r3 = r5
            goto L1e
        L8e:
            r0 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.rS(X.1An6):void");
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list;
        if (this.LLJJI == null) {
            this.LLJJI = new ArrayList();
        }
        List<InterfaceC1399350mWD> list2 = this.LLJJI;
        if ((list2 != null && list2.contains(interfaceC1399350mWD)) || (list = this.LLJJI) == null) {
            return;
        }
        list.add(interfaceC1399350mWD);
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LLJJIJIL = interfaceC342470Dbh;
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        List<InterfaceC1399350mWD> list = this.LLJJI;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1399350mWD);
        }
    }

    public static String iS(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public DetailFragment kS(Bundle bundle, C2189821An6 c2189821An6) {
        C786410Ut5.LJJIZ(bundle, "feed_param", c2189821An6);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        Boolean boolOnKeyDown;
        this.LLJJJJLIIL = false;
        List<InterfaceC1399350mWD> list = this.LLJJI;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((InterfaceC1399350mWD) it2.next()).onKeyDown(i, keyEvent)) {
                    this.LLJJJJLIIL = true;
                    break;
                }
            }
        }
        if (this.LLJJJJLIIL) {
            boolOnKeyDown = Boolean.TRUE;
        } else {
            boolOnKeyDown = super.onKeyDown(i, keyEvent);
        }
        this.LLJLLIL.onKeyDown(i, keyEvent);
        C0S4J c0s4j = this.LLJILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onKeyDown] ");
        sbLIZ.append(boolOnKeyDown);
        sbLIZ.append(',');
        sbLIZ.append(i);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        return boolOnKeyDown;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (C0BSS.LIZ) {
            if (i != 25 && i != 24) {
                return super.onKeyUp(i, keyEvent);
            }
            return Boolean.valueOf(this.LLJJJJLIIL);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35 && (viewFindViewById = view.findViewById(R.id.fri)) != null) {
            C14K9.LJIJJ(viewFindViewById, new C522010Kdb(this, 1));
        }
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 275);
        if (!sS()) {
            awS568S0100000_24.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r0 = X.C294700Bgq.LIZ()
            if (r0 == 0) goto L43
            X.0ru7 r0 = X.C1606370ru7.LIZ
            r0.getClass()
            boolean r0 = X.C1606370ru7.LIZLLL(r4)
            if (r0 == 0) goto L43
            r0 = 1
        L12:
            r1 = 2131561310(0x7f0d0b5e, float:1.8748017E38)
            if (r0 == 0) goto L3a
            android.content.Context r0 = r5.getContext()
            android.view.View r1 = X.C20673215v0.LJ(r1, r0)
            X.18nL r3 = new X.18nL
            android.content.Context r0 = r5.getContext()
            r3.<init>(r0)
            r0 = 2131389271(0x7f0a6b57, float:1.839908E38)
            r3.setId(r0)
            r3.addView(r1)
        L31:
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L37
            r3 = r2
        L37:
            if (r3 == 0) goto L63
            goto L45
        L3a:
            android.content.Context r0 = r4.getContext()
            android.view.View r3 = X.C20673215v0.LJ(r1, r0)
            goto L31
        L43:
            r0 = 0
            goto L12
        L45:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L69
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L69
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L69
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L69
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L60
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L69
        L60:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L69
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L69
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L69
            return r3
        L69:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0ru9, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment] */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        String strIS;
        C19EG activity;
        Music music;
        BaseActivity baseActivity;
        InterfaceC342470Dbh interfaceC342470Dbh = this.LLJJIJIL;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
        EditPostPermission editPostPermission = null;
        if (i == 10086) {
            if (i2 == -1) {
                C1800490wxD.LIZJ(this, -1, intent);
                C19EG activity2 = getActivity();
                if ((activity2 instanceof BaseActivity) && (baseActivity = (BaseActivity) activity2) != null) {
                    baseActivity.activityConfiguration(AFwS264S0000000_24.get$arr$(67));
                }
                finish();
            }
        } else if (i == 1996) {
            if (i2 == -1 && intent != null) {
                C1443290nf5.LIZIZ(getActivity(), intent);
            }
        } else if (i == 10087) {
            if (i2 == -1 && intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("extra_replace_music_info");
                if (serializableExtra instanceof Music) {
                    music = (Music) serializableExtra;
                } else {
                    music = null;
                }
                Serializable serializableExtra2 = intent.getSerializableExtra("extra_replace_music_permission_info");
                if (serializableExtra2 instanceof EditPostPermission) {
                    editPostPermission = (EditPostPermission) serializableExtra2;
                }
                ?? r0 = this.LLJJ;
                if (r0 != 0) {
                    IDetailPageAbility iDetailPageAbilityZP = r0.ZP();
                    if (music != null && editPostPermission != null && iDetailPageAbilityZP != null) {
                        iDetailPageAbilityZP.Qj1(music, editPostPermission);
                    }
                }
            }
        } else if (i == 113 && i2 == 100 && intent != null && (strIS = iS(intent, "after_post_days")) != null && (activity = getActivity()) != null) {
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().LJJIIZ(activity, strIS);
        }
        return super.onResult(i, i2, intent);
    }
}
