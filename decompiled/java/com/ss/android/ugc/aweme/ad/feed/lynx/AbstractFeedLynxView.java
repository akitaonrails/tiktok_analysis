package com.ss.android.ugc.aweme.ad.feed.lynx;

import X.AbstractC999780c7k;
import X.C01GW;
import X.C1000100c8G;
import X.C1537900q7g;
import X.C1541950qED;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1000280c8Y;
import X.InterfaceC987380bnk;
import X.InterfaceC988500bpY;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractFeedLynxView implements GenericLifecycleObserver {
    public final ViewGroup LL;
    public final InterfaceC987380bnk LLILLJJLI;
    public final String LLILLL;
    public Aweme LLILZ;
    public AwemeRawAd LLILZIL;
    public boolean LLILZLL;
    public AbstractC999780c7k LLIZ;
    public final C01GW LLIZLLLIL;
    public final InterfaceC1000280c8Y LLJ;
    public boolean LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJILJILJ;

    public AbstractC999780c7k LIZ(String str) {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ() {
        SparkContext sparkContext;
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF == null || (sparkContext = iAdSparkUtilsLJFF.LIZJ(this.LL.getContext(), null, null, null, false)) == null) {
            sparkContext = new SparkContext();
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = this.LL.getContext();
        c1537900q7g.getClass();
        return new C1541950qED(context, sparkContext).LIZ(false);
    }

    public AbstractFeedLynxView(ViewGroup viewGroup, InterfaceC987380bnk interfaceC987380bnk, String str) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        ViewGroup viewGroup2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        AbstractC999780c7k abstractC999780c7kLIZ;
        View view;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        this.LL = viewGroup;
        this.LLILLJJLI = interfaceC987380bnk;
        this.LLILLL = str;
        FeedAdLynxSticker feedAdLynxSticker = (FeedAdLynxSticker) this;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(feedAdLynxSticker, 60));
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if (interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) {
            interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ;
        } else {
            interfaceC1000280c8Y = null;
        }
        this.LLJ = interfaceC1000280c8Y;
        if (C1000100c8G.LIZ() && (abstractC999780c7kLIZ = LIZ(str)) != null && (view = abstractC999780c7kLIZ.LIZIZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = abstractC999780c7kLIZ.LIZJ) != null && abstractC999780c7kLIZ.LIZ == 3) {
            this.LLIZ = abstractC999780c7kLIZ;
            this.LLJIJIL = view;
            this.LLILZLL = true;
            this.LLJI = abstractC999780c7kLIZ.LJ;
            this.LLJILJIL = abstractC999780c7kLIZ.LIZLLL;
            this.LLJILJILJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
            feedAdLynxSticker.LLJJIJIIJIL = true;
        }
        if (!this.LLILZLL) {
            View viewLJLLJ = C786410Ut5.LJLLJ(viewGroup.getContext(), R.layout.d4i, null);
            this.LLJIJIL = viewLJLLJ;
            this.LLJILJILJ = (viewLJLLJ == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLJLLJ.findViewById(R.id.spark_ad_sticker_view)) == null) ? LIZIZ() : sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        } else if (this.LLJILJILJ == null) {
            this.LLJILJILJ = LIZIZ();
        }
        C786410Ut5.LJJJJI(viewGroup);
        if (this.LLILZLL) {
            View view2 = this.LLJIJIL;
            ViewParent parent = (view2 == null ? null : view2).getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                View view3 = this.LLJIJIL;
                C786410Ut5.LJJJLZIJ(view3 == null ? null : view3, viewGroup2);
            }
        }
        View view4 = this.LLJIJIL;
        viewGroup.addView(view4 != null ? view4 : null);
    }
}
