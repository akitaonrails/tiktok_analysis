package com.ss.android.ugc.aweme.feed.ui.share;

import X.AbstractC2252651DEx;
import X.AnonymousClass0956;
import X.AnonymousClass0957;
import X.C01GW;
import X.C05YD;
import X.C099G;
import X.C0PEM;
import X.C0S2W;
import X.C1076010e6h;
import X.C1234490iEJ;
import X.C1234530iEN;
import X.C1234590iET;
import X.C1234630iEX;
import X.C1234650iEZ;
import X.C1234690iEd;
import X.C13BV;
import X.C14EU;
import X.C1564680qos;
import X.C1584420rKi;
import X.C189200o6;
import X.C1DFH;
import X.C2024007wM;
import X.C2108208Ns;
import X.C2238608ps;
import X.C2276471E8n;
import X.C23250099c;
import X.C452501pT;
import X.C612480O0o;
import X.C612540O0u;
import X.C612550O0v;
import X.C737030Svd;
import Y.ARunnableS119S0100000_19;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class SharedVideoDeepLinkHelper implements LifecycleEventObserver {
    public static boolean LLJILJIL;
    public final BaseListFragmentPanel LL;
    public final AbstractC2252651DEx LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final C05YD<C612550O0v> LLILZ;
    public C1234530iEN LLILZIL;
    public C1234590iET LLILZLL;
    public C1234630iEX LLIZ;
    public C0S2W LLIZLLLIL;
    public C1234650iEZ LLJ;
    public final C01GW LLJI;
    public AnonymousClass0956 LLJIJIL;

    public SharedVideoDeepLinkHelper(RecommendFeedFragmentPanel recommendFeedFragmentPanel) {
        Fragment fragment;
        C2238608ps c2238608ps = C2108208Ns.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = recommendFeedFragmentPanel;
        this.LLILLJJLI = c2238608ps;
        this.LLILLL = c1dfh;
        this.LLILZ = C1234690iEd.LIZIZ.LIZJ().LIZIZ();
        this.LLJI = C452501pT.LIZIZ(new C612480O0o(this));
        EventBus.LIZLLL().LJIJJ(this);
        recommendFeedFragmentPanel.getLifecycle().addObserver(this);
        final LifecycleOwner lifecycleOwnerRequireActivity = recommendFeedFragmentPanel.getFragment().requireActivity();
        if (IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor() && (fragment = recommendFeedFragmentPanel.getFragment()) != null) {
            lifecycleOwnerRequireActivity = fragment;
        }
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(lifecycleOwnerRequireActivity, new Observer() { // from class: X.0O0q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FollowStatus followStatus = (FollowStatus) obj;
                C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "receive follow livedata!");
                String userId = followStatus.getUserId();
                boolean zIsFromSharerCard = followStatus.isFromSharerCard();
                Integer followerStatus = followStatus.getFollowerStatus();
                if (userId != null && userId.length() != 0 && followerStatus != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) lifecycleOwnerRequireActivity);
                    SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper = this;
                    C23250099c.LIZLLL(lifecycleScope, sharedVideoDeepLinkHelper.LLILLL, null, new C612460O0m(sharedVideoDeepLinkHelper, userId, followStatus, followerStatus, zIsFromSharerCard, null), 2);
                }
            }
        });
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        C1234530iEN c1234530iEN = this.LLILZIL;
        if (c1234530iEN != null) {
            c1234530iEN.LIZIZ();
        }
        this.LLILZIL = null;
        C1234590iET c1234590iET = this.LLILZLL;
        if (c1234590iET != null) {
            c1234590iET.LJ = null;
            AnonymousClass0956 anonymousClass0956 = c1234590iET.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
        this.LLILZLL = null;
        this.LLJ = null;
    }

    @C14EU(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onVideoFirstFrameRendered(C1584420rKi c1584420rKi) {
        String aid;
        C1234650iEZ c1234650iEZ;
        boolean zEquals;
        long jCurrentTimeMillis;
        Aweme aweme;
        if (c1584420rKi != null && (aweme = c1584420rKi.LIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        boolean z = false;
        if (aid != null && aid.length() != 0 && (c1234650iEZ = this.LLJ) != null) {
            if (c1234650iEZ.LLIZLLLIL) {
                List list = c1234650iEZ.LLIZ;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                zEquals = list.contains(aid);
            } else {
                zEquals = TextUtils.equals(aid, c1234650iEZ.LL);
            }
            if (zEquals) {
                long jLongValue = 0;
                if (c1234650iEZ.LLILZLL <= 0) {
                    long j = c1234650iEZ.LLILZIL;
                    if (j > 0) {
                        if (c1234650iEZ.LLILZ == 1) {
                            jCurrentTimeMillis = SystemClock.uptimeMillis();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        Long lValueOf = Long.valueOf(jCurrentTimeMillis - j);
                        if (lValueOf.longValue() >= 0) {
                            jLongValue = lValueOf.longValue();
                        }
                        c1234650iEZ.LLILZLL = jLongValue;
                    }
                }
            }
        }
        if (LLJILJIL) {
            return;
        }
        LLJILJIL = true;
        C1234490iEJ c1234490iEJ = C1234490iEJ.LIZLLL;
        if (c1234490iEJ != null) {
            C1234490iEJ.LIZLLL = null;
            c1234490iEJ.LIZ();
        }
        C1234530iEN c1234530iEN = this.LLILZIL;
        if (c1234530iEN != null && c1234530iEN.LJ) {
            z = true;
        }
        if (z) {
            this.LL.postDelayed(new ARunnableS119S0100000_19(this, 63), 100L);
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "set video pause!");
        }
        C0S2W c0s2w = this.LLIZLLLIL;
        if (c0s2w != null) {
            c0s2w.LIZ();
        }
        this.LLIZLLLIL = null;
        C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "onVideoFirstFrameRendered!");
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZLLL(String str, AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957) {
        boolean z;
        C1234630iEX c1234630iEX = this.LLIZ;
        if (c1234630iEX != null && Intrinsics.LJFF(c1234630iEX.LIZIZ, str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "insert aweme by old operator!");
            C1234630iEX c1234630iEX2 = this.LLIZ;
            return;
        }
        C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "insert aweme by new operator!");
        C1234630iEX c1234630iEX3 = this.LLIZ;
        if (c1234630iEX3 != null) {
            c1234630iEX3.LIZJ = null;
            AnonymousClass0956 anonymousClass0956 = c1234630iEX3.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
        C1234630iEX c1234630iEX4 = new C1234630iEX(this.LL, str);
        this.LLIZ = c1234630iEX4;
        if (anonymousClass0957 != null) {
            c1234630iEX4.LJ = anonymousClass0957;
        }
        c1234630iEX4.LIZ();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2024007wM.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1234530iEN c1234530iEN = this.LLILZIL;
                if (c1234530iEN != null) {
                    c1234530iEN.LIZIZ();
                }
                this.LLILZIL = null;
                this.LLJ = null;
                EventBus.LIZLLL().LJJI(this);
                return;
            }
            return;
        }
        C1234530iEN c1234530iEN2 = this.LLILZIL;
        if (c1234530iEN2 == null || !c1234530iEN2.LJ) {
            return;
        }
        this.LL.LLIIL(new C737030Svd(44));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(boolean r31, android.content.Intent r32, X.C2189821An6 r33) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper.LIZJ(boolean, android.content.Intent, X.1An6):boolean");
    }

    public final void LIZIZ(boolean z, String str, C099G c099g, Long l, boolean z2, boolean z3) {
        AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), this.LLILLL, null, new C612540O0u(this, z, str, c099g, l, z2, z3, null), 2);
    }
}
