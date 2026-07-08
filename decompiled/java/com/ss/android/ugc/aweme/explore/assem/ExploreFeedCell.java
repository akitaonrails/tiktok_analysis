package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC1386130mAt;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C01GW;
import X.C04W8;
import X.C07MS;
import X.C0AB5;
import X.C0AHA;
import X.C0AZD;
import X.C0IKF;
import X.C1057880ddS;
import X.C1097304Qx;
import X.C1220000hqw;
import X.C12DM;
import X.C12ES;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1335180kqi;
import X.C1335190kqj;
import X.C1388190mED;
import X.C1389340mG4;
import X.C13LE;
import X.C1483340ohg;
import X.C1483410ohn;
import X.C14MI;
import X.C1558360qeg;
import X.C1581660rGG;
import X.C15TA;
import X.C15TI;
import X.C15TM;
import X.C15U8;
import X.C15UB;
import X.C15UE;
import X.C15UU;
import X.C15V4;
import X.C15V6;
import X.C15VB;
import X.C15VC;
import X.C15VE;
import X.C15VO;
import X.C15VP;
import X.C15VQ;
import X.C15VU;
import X.C15VZ;
import X.C1602160rnK;
import X.C1617890sCh;
import X.C1848630yCr;
import X.C1867310ygz;
import X.C1868410yil;
import X.C1910420zoW;
import X.C19252910Tv;
import X.C19651011uW;
import X.C19659111vp;
import X.C19719612Di;
import X.C19738212Km;
import X.C19738412Ko;
import X.C19EG;
import X.C1AF0;
import X.C1EE2;
import X.C20244914Jj;
import X.C2043407zU;
import X.C20524315Sv;
import X.C20526015Tm;
import X.C20530015Va;
import X.C20530115Vb;
import X.C20530215Vc;
import X.C20530315Vd;
import X.C20530515Vf;
import X.C20530615Vg;
import X.C20530915Vj;
import X.C20531215Vm;
import X.C20532515Vz;
import X.C20642515q3;
import X.C20742916Ex;
import X.C2095008Iq;
import X.C2153908cD;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2487409ou;
import X.C2493709pv;
import X.C2513609t8;
import X.C2513709t9;
import X.C281360B1a;
import X.C291000Bas;
import X.C304280BwI;
import X.C337760DLy;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452501pT;
import X.C465320IMo;
import X.C482920Iwk;
import X.C591510NHx;
import X.C618720OOo;
import X.C720080SMk;
import X.C720360SNm;
import X.C721220SQu;
import X.C724750Sbp;
import X.C734110Sqv;
import X.C735370Ssx;
import X.C735410St1;
import X.C735840Sti;
import X.C736950SvV;
import X.C738120SxO;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC1334360kpO;
import X.EnumC1781000wRm;
import X.EnumC1910400zoU;
import X.EnumC714850S2h;
import X.EnumC721170SQp;
import X.InterfaceC1086510eNd;
import X.InterfaceC1891350zJl;
import X.InterfaceC20530715Vh;
import X.InterfaceC427850Gq7;
import X.InterfaceC469401sC;
import X.InterfaceC658750Psf;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS16S1100000_11;
import Y.ARunnableS64S0300000_31;
import Y.AUListenerS219S0200000_11;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.experiment.ExploreFirstPreloadVideoConfig;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExplorePostModeQuickShowConfig;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreTopicTabMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTopicMonitorManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootMonitor;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.topic.ExploreRecommendTopicBottomSheetFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedImpressionManager;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.AbilityExtKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IExploreFeedDebugService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.AwS82S0210000_31;
import kotlin.jvm.internal.AwS92S1300000_31;
import kotlin.jvm.internal.AwS95S0210000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedCell extends PowerCell<C20526015Tm> implements View.OnTouchListener, View.OnLongClickListener, InterfaceC1086510eNd {
    public static TuxIconDrawable LLLF;
    public static TuxIconDrawable LLLFF;
    public static TuxIconDrawable LLLFFI;
    public static TuxIconDrawable LLLFZ;
    public static long LLLI;
    public final /* synthetic */ C15VZ LL = new C15VZ();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(72));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(71));
    public SmartAvatarImageView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public FrameLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public C337760DLy LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public SmartImageView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public FrameLayout LLJILLL;
    public LinearLayout LLJJ;
    public RelativeLayout LLJJI;
    public FrameLayout LLJJIII;
    public final C736950SvV LLJJIJI;
    public Runnable LLJJIJIIJIL;
    public ValueAnimator LLJJIJIL;
    public GradientDrawable LLJJJ;
    public String LLJJJIL;
    public C734110Sqv LLJJJJ;
    public final int LLJJJJJIL;
    public HashMap<String, String> LLJJJJLIIL;
    public Map<String, String> LLJJL;
    public Map<String, String> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public String LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    public final void P5() {
        RecyclerView recyclerView;
        AbstractC21674919sB abstractC21674919sB;
        ViewGroup viewGroup;
        ViewGroupOverlay overlay;
        this.LLJJJIL = null;
        Runnable runnable = this.LLJJIJIIJIL;
        if (runnable != null) {
            HandlerHook.viewRemoveCallbacks(this.itemView, runnable);
        }
        this.LLJJIJIIJIL = null;
        ValueAnimator valueAnimator = this.LLJJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJIJIL = null;
        GradientDrawable gradientDrawable = this.LLJJJ;
        if (gradientDrawable != null && (viewGroup = (ViewGroup) this.itemView.findViewById(R.id.rj8)) != null && (overlay = viewGroup.getOverlay()) != null) {
            overlay.remove(gradientDrawable);
        }
        this.LLJJJ = null;
        ViewParent parent = this.itemView.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null) {
            return;
        }
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if (!(itemAnimator instanceof AbstractC21674919sB) || (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) == null) {
            return;
        }
        abstractC21674919sB.LLIZ = true;
    }

    @Override // X.InterfaceC1086510eNd
    public final void b1() {
        k7(true);
    }

    public static boolean b7() {
        return ((Boolean) C1097304Qx.LIZ.getValue()).booleanValue();
    }

    public final MiddleBridgeCellAbility D6() {
        return (MiddleBridgeCellAbility) this.LLJLLIL.getValue();
    }

    public final Long S6() {
        return (Long) this.LLJL.getValue();
    }

    public final C15VP T5() {
        return (C15VP) this.LLJZIJLIL.getValue();
    }

    public final boolean a7() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final String getTabName() {
        return (String) this.LLJLIL.getValue();
    }

    public final void n7() throws Exception {
        int iWidth = C1389340mG4.LIZJ(this.itemView.getContext(), null).LIZIZ;
        C19EG currentActivity = getCurrentActivity();
        if (currentActivity != null && Build.VERSION.SDK_INT >= 35) {
            C0IKF.LIZ.getClass();
            C465320IMo.LIZ();
            C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(currentActivity);
            C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(2);
            iWidth = (c19738412KoLIZ.LIZ().width() - c20244914JjLIZIZ.LIZ) - c20244914JjLIZIZ.LIZJ;
        }
        int iLIZ = C1617890sCh.LIZ();
        e6().getLayoutParams().width = (iWidth - (C15UB.LLILZ * (iLIZ + 1))) / iLIZ;
    }

    public final String q6() {
        C21681819tI c21681819tI;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        return ((!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) ? getLayoutPosition() : c21681819tI.LIZ()) % 2 == 0 ? "left" : "right";
    }

    @Override // X.InterfaceC1086510eNd
    public final float z4() {
        return this.LL.LL;
    }

    public final String zR1() {
        return (String) this.LLJLILLLLZIIL.getValue();
    }

    public ExploreFeedCell() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 528);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(ExploreFeedImpressionManager.class), awS575S0100000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(80), null, null, null);
        this.LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 531));
        this.LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 532));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 527));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 530));
        this.LLJLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 526));
        this.LLJZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 529));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(157));
        this.LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 525));
    }

    public final FrameLayout C6() {
        if (!a7()) {
            return (FrameLayout) this.itemView.findViewById(R.id.o0x);
        }
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.o0x);
        this.LLJILLL = frameLayout2;
        return frameLayout2;
    }

    public final Map<String, String> I5() {
        TuxTextView tuxTextViewT6 = T6();
        if (!b7()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("card_index", String.valueOf(U5()));
            linkedHashMap.put("card_position", V5());
            linkedHashMap.put("modified_title", tuxTextViewT6.getText().toString());
            String strX5 = X5(tuxTextViewT6.getLayout(), tuxTextViewT6.getText().toString());
            linkedHashMap.put("displayed_title", strX5 != null ? strX5 : "");
            return linkedHashMap;
        }
        Map<String, String> map = this.LLJJLIIIJLLLLLLLZ;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        linkedHashMap2.put("modified_title", tuxTextViewT6.getText().toString());
        String strX52 = X5(tuxTextViewT6.getLayout(), tuxTextViewT6.getText().toString());
        linkedHashMap2.put("displayed_title", strX52 != null ? strX52 : "");
        return linkedHashMap2;
    }

    public final RelativeLayout K6() {
        if (!a7()) {
            return (RelativeLayout) this.itemView.findViewById(R.id.rj8);
        }
        RelativeLayout relativeLayout = this.LLJJI;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.itemView.findViewById(R.id.rj8);
        this.LLJJI = relativeLayout2;
        return relativeLayout2;
    }

    public final String L6() {
        String str;
        C20526015Tm item = getItem();
        if (item != null && (str = item.LLJJI) != null) {
            return str;
        }
        C20526015Tm item2 = getItem();
        if (item2 != null) {
            return item2.LLILLL;
        }
        return null;
    }

    public final TuxTextView T6() {
        if (!a7()) {
            return (TuxTextView) this.itemView.findViewById(R.id.tvw_desc);
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.tvw_desc);
        this.LLJILJILJ = tuxTextView2;
        return tuxTextView2;
    }

    public final int U5() {
        int iLIZ;
        if (!b7()) {
            return getLayoutPosition();
        }
        Map<String, String> map = this.LLJJLIIIJLLLLLLLZ;
        return (map == null || (iLIZ = C15V6.LIZ(map)) == -1) ? getBindingAdapterPosition() : iLIZ;
    }

    public final TuxTextView U6() {
        if (!a7()) {
            return (TuxTextView) this.itemView.findViewById(R.id.tvw_like_counts);
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.tvw_like_counts);
        this.LLIZLLLIL = tuxTextView2;
        return tuxTextView2;
    }

    public final String V5() {
        if (!b7()) {
            return q6();
        }
        Map<String, String> map = this.LLJJLIIIJLLLLLLLZ;
        return map != null ? C15V6.LIZIZ(map) : C482920Iwk.LIZ(this.itemView);
    }

    public final TuxTextView V6() {
        if (!a7()) {
            return (TuxTextView) this.itemView.findViewById(R.id.tvw_nick);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.tvw_nick);
        this.LLILZIL = tuxTextView2;
        return tuxTextView2;
    }

    public final LinearLayout W5() {
        if (!a7()) {
            return (LinearLayout) this.itemView.findViewById(R.id.fu8);
        }
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.fu8);
        this.LLILZLL = linearLayout2;
        return linearLayout2;
    }

    public final LinearLayout a6() {
        if (!a7()) {
            return (LinearLayout) this.itemView.findViewById(R.id.hhl);
        }
        LinearLayout linearLayout = this.LLJJ;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.hhl);
        this.LLJJ = linearLayout2;
        return linearLayout2;
    }

    public final FrameLayout c6() {
        if (!a7()) {
            return (FrameLayout) this.itemView.findViewById(R.id.kg1);
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.kg1);
        this.LLIZ = frameLayout2;
        return frameLayout2;
    }

    public final SmartAvatarImageView d6() {
        if (!a7()) {
            return (SmartAvatarImageView) this.itemView.findViewById(R.id.kg0);
        }
        SmartAvatarImageView smartAvatarImageView = this.LLILZ;
        if (smartAvatarImageView != null) {
            return smartAvatarImageView;
        }
        SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) this.itemView.findViewById(R.id.kg0);
        this.LLILZ = smartAvatarImageView2;
        return smartAvatarImageView2;
    }

    public final SmartImageView e6() {
        if (!a7()) {
            return (SmartImageView) this.itemView.findViewById(R.id.kgf);
        }
        SmartImageView smartImageView = this.LLJILJIL;
        if (smartImageView != null) {
            return smartImageView;
        }
        SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.kgf);
        this.LLJILJIL = smartImageView2;
        return smartImageView2;
    }

    public final C337760DLy f6() {
        if (!a7()) {
            return (C337760DLy) this.itemView.findViewById(R.id.kgy);
        }
        C337760DLy c337760DLy = this.LLJ;
        if (c337760DLy != null) {
            return c337760DLy;
        }
        C337760DLy c337760DLy2 = (C337760DLy) this.itemView.findViewById(R.id.kgy);
        this.LLJ = c337760DLy2;
        return c337760DLy2;
    }

    public final TuxIconView h6() {
        if (!a7()) {
            return (TuxIconView) this.itemView.findViewById(R.id.kh4);
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.kh4);
        this.LLJIJIL = tuxIconView2;
        return tuxIconView2;
    }

    public final FrameLayout i6() {
        if (!a7()) {
            return (FrameLayout) this.itemView.findViewById(R.id.m4c);
        }
        FrameLayout frameLayout = this.LLJJIII;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.m4c);
        this.LLJJIII = frameLayout2;
        return frameLayout2;
    }

    public final void j7() {
        C20526015Tm item;
        Aweme aweme;
        String aid;
        if (C15TM.LIZ()) {
            C20526015Tm item2 = getItem();
            boolean z = true;
            if (item2 == null || !item2.LLIZ || (item = getItem()) == null || (aweme = item.LL) == null || (aid = aweme.getAid()) == null || aid.length() == 0) {
                return;
            }
            synchronized (C2043407zU.LIZJ) {
                try {
                    if (!C2043407zU.LIZLLL || C2043407zU.LJ) {
                        return;
                    }
                    HashSet<String> hashSet = C2043407zU.LJI;
                    hashSet.remove(aid);
                    if (C2043407zU.LJFF && hashSet.isEmpty()) {
                        C2043407zU.LJ = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C2043407zU.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void m7() {
        if (b7()) {
            Map linkedHashMap = this.LLJJLIIIJLLLLLLLZ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.LLJJLIIIJLLLLLLLZ = linkedHashMap;
            }
            View view = this.itemView;
            C20526015Tm item = getItem();
            linkedHashMap.put("model_source", String.valueOf(item != null ? item.LLILZLL : C15TI.UNKNOWN.getValue()));
            linkedHashMap.put("card_position", C482920Iwk.LIZ(view));
            if (this.itemView.getWidth() == 0) {
                HandlerHook.viewPost(this.itemView, new ARunnableS107S0100000_7(this, 242));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() throws Exception {
        String enterFrom;
        C20530515Vf c20530515Vf;
        C15VU c15vu = T5().LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.ON_VIEW_CREATED, new C20530515Vf());
        }
        super.onItemViewCreated();
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.15Ul
            /* JADX WARN: Removed duplicated region for block: B:120:0x03a2  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x03a6  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x03aa  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x03d9  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x043f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0478  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01d9  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0273 A[ADDED_TO_REGION] */
            /* JADX WARN: Type inference failed for: r5v2, types: [T, com.ss.android.ugc.aweme.explore.data.ExploreAwemeList] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r84) {
                /*
                    Method dump skipped, instruction units count: 1703
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC20528515Ul.onClick(android.view.View):void");
            }
        }, this.itemView);
        V6().setOnTouchListener(this);
        d6().setOnTouchListener(this);
        W5().setOnTouchListener(this);
        this.itemView.setOnTouchListener(this);
        this.itemView.setOnLongClickListener(this);
        C786410Ut5.h9(V6(), new ACListenerS165S0100000_31(this, 64));
        C786410Ut5.G9(d6(), new ACListenerS165S0100000_31(this, 65));
        C786410Ut5.O7(c6(), new ACListenerS165S0100000_31(this, 66));
        MiddleBridgeCellAbility middleBridgeCellAbilityD6 = D6();
        if (middleBridgeCellAbilityD6 == null || (enterFrom = middleBridgeCellAbilityD6.getEnterFrom()) == null) {
            enterFrom = "";
        }
        this.LLJJJJ = new C734110Sqv(enterFrom, new WeakReference(this.itemView.getContext()), S6(), getTabName(), zR1(), new AwS680S0100000_31(this, 6));
        C786410Ut5.R7(W5(), new ACListenerS165S0100000_31(this, 67));
        n7();
        C15UU c15uu = C15UU.LIZ;
        Context context = this.itemView.getContext();
        c15uu.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            LinearLayout linearLayoutA6 = a6();
            if (linearLayoutA6 != null) {
                linearLayoutA6.setBackgroundColor(iIntValue);
            }
            SmartImageView smartImageViewE6 = e6();
            if (smartImageViewE6 != null) {
                smartImageViewE6.setBackground(C14MI.LIZ(this.itemView.getContext(), R.drawable.br9));
            }
        }
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1331070kk5 hierarchy = e6().getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(fLIZIZ);
        hierarchy.LJJIII(c1331100kk8);
        C1331100kk8 c1331100kk82 = e6().getHierarchy().LIZJ;
        if (c1331100kk82 != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, e6().getContext());
            c1331100kk82.LJFF = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
            c1331100kk82.LJFF(C12ES.LIZJ(0.5f, e6().getContext()));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        a6().setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.0d))), 0, 0);
        T6().setPadding(iLIZIZ, 0, iLIZIZ, iLIZIZ2);
        c6().setPadding(iLIZIZ, 0, 0, iLIZIZ3);
        V6().setPadding(0, 0, 0, iLIZIZ3);
        W5().setPadding(0, 0, iLIZIZ, iLIZIZ3);
        V6().setTuxFont(81);
        T6().setTuxFont(62);
        U6().setTuxFont(71);
        if (!C1EE2.LIZIZ.showEngagementCount()) {
            C786410Ut5.LJLLLLLL(8, U6());
        }
        C15VU c15vu2 = T5().LLILLJJLI;
        if (c15vu2 == null || (c20530515Vf = c15vu2.LJI.get(C15VO.ON_VIEW_CREATED)) == null) {
            return;
        }
        c20530515Vf.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C20530515Vf c20530515Vf;
        C15VU c15vu = T5().LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.ON_VIEW_ATTACHED, new C20530515Vf());
        }
        super.onViewAttachedToWindow();
        C1910420zoW.LIZIZ(EnumC1910400zoU.MANUAL_LOAD_TO_VIEW_ATTACHED);
        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager = ExploreCustomFeedColdBootManager.LIZ;
        Long lS6 = S6();
        exploreCustomFeedColdBootManager.getClass();
        if (lS6 == null || lS6.longValue() != 0) {
            ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) ExploreCustomFeedColdBootManager.LIZIZ).get(lS6);
            if (exploreCustomFeedColdBootMonitor != null) {
                exploreCustomFeedColdBootMonitor.endRender();
            }
        } else {
            ExploreColdBootMonitor.INSTANCE.endRender();
        }
        if (b7()) {
            t7();
        }
        k7(false);
        C15VU c15vu2 = T5().LLILLJJLI;
        if (c15vu2 == null || (c20530515Vf = c15vu2.LJI.get(C15VO.ON_VIEW_ATTACHED)) == null) {
            return;
        }
        c20530515Vf.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        C20530515Vf c20530515Vf;
        Aweme aweme;
        C15VU c15vu = T5().LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.ON_VIEW_DETACHED, new C20530515Vf());
        }
        super.onViewDetachedFromWindow();
        C20526015Tm item = getItem();
        if (item != null) {
            item.LLIZLLLIL = 0;
        }
        MiddleBridgeCellAbility middleBridgeCellAbilityD6 = D6();
        boolean z = middleBridgeCellAbilityD6 != null && middleBridgeCellAbilityD6.pJ2();
        String str = ExploreFeedListViewModel.LLL;
        C20526015Tm item2 = getItem();
        if (Intrinsics.LJFF(str, (item2 == null || (aweme = item2.LL) == null) ? null : aweme.getAid())) {
            ExploreFeedListViewModel.LLJZIJLIL = "see_less";
        } else if (z) {
            ExploreFeedListViewModel.LLJZIJLIL = "refresh";
        } else {
            ExploreFeedListViewModel.LLJZIJLIL = "slide_show_more_content";
        }
        h7(false);
        h7(true);
        ExploreFeedListViewModel.LLJZIJLIL = "other";
        C15VU c15vu2 = T5().LLILLJJLI;
        if (c15vu2 == null || (c20530515Vf = c15vu2.LJI.get(C15VO.ON_VIEW_DETACHED)) == null) {
            return;
        }
        c20530515Vf.LIZ();
    }

    public final void p7() {
        RecyclerView recyclerView;
        AbstractC21674919sB abstractC21674919sB;
        C20526015Tm item = getItem();
        if (item != null) {
            item.LLJJIII = false;
        }
        P5();
        ViewParent parent = this.itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        final ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.rj8);
        if (viewGroup == null) {
            return;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.hhl);
        int top = viewFindViewById != null ? viewFindViewById.getTop() : viewGroup.getHeight();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0b, this.itemView.getContext());
        gradientDrawable.setColor(numLIZJ != null ? numLIZJ.intValue() : Color.argb(38, 101, 171, 255));
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
        gradientDrawable.setAlpha(0);
        gradientDrawable.setBounds(0, top, viewGroup.getWidth(), viewGroup.getHeight());
        viewGroup.getOverlay().add(gradientDrawable);
        this.LLJJJ = gradientDrawable;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new C12DM());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS219S0200000_11(gradientDrawable, viewGroup, 4));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.15VW
            public boolean LL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.LL) {
                    return;
                }
                ExploreFeedCell exploreFeedCell = this;
                ARunnableS64S0300000_31 aRunnableS64S0300000_31 = new ARunnableS64S0300000_31(gradientDrawable, viewGroup, exploreFeedCell, 1);
                exploreFeedCell.LLJJIJIIJIL = aRunnableS64S0300000_31;
                HandlerHook.viewPostDelay(exploreFeedCell.itemView, aRunnableS64S0300000_31, 3000L);
            }
        });
        this.LLJJIJIL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public final String r6() {
        C20526015Tm item = getItem();
        if (item != null) {
            return item.LLJILJILJ;
        }
        return null;
    }

    public final void t7() {
        View view;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        Object parent = this.itemView.getParent();
        if (!(parent instanceof RecyclerView) || (view = (View) parent) == null) {
            return;
        }
        Map linkedHashMap = this.LLJJLIIIJLLLLLLLZ;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.LLJJLIIIJLLLLLLLZ = linkedHashMap;
        }
        View view2 = this.itemView;
        C20526015Tm item = getItem();
        int value = item != null ? item.LLILZLL : C15TI.UNKNOWN.getValue();
        if (!linkedHashMap.containsKey("model_source")) {
            linkedHashMap.put("model_source", String.valueOf(value));
        }
        if (!linkedHashMap.containsKey("card_position")) {
            linkedHashMap.put("card_position", C482920Iwk.LIZ(view2));
        }
        View view3 = this.itemView;
        linkedHashMap.put("card_index", String.valueOf(bindingAdapterPosition));
        linkedHashMap.put("card_position", C482920Iwk.LIZ(view3));
        linkedHashMap.put("is_first_screen", view3.getTop() + view.getPaddingTop() <= view.getHeight() ? "1" : CardStruct.IStatusCode.DEFAULT);
    }

    public final Long u6() {
        C20526015Tm item = getItem();
        if (item != null) {
            return item.LLJIJIL;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() throws JSONException {
        C20530515Vf c20530515Vf;
        Aweme aweme;
        Video video;
        UrlModel cover;
        MiddleBridgeCellAbility middleBridgeCellAbilityD6;
        C15VE c15veXm;
        C20530915Vj next;
        C20530015Va next2;
        InterfaceC469401sC interfaceC469401sC;
        if (b7()) {
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        C15VU c15vu = T5().LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.ON_VIEW_RECYCLED, new C20530515Vf());
        }
        super.unBind();
        P5();
        this.LLJJJIL = null;
        C20526015Tm item = getItem();
        if (item != null) {
            item.LLIZLLLIL = 0;
        }
        C20526015Tm item2 = getItem();
        if (item2 != null && (aweme = item2.LL) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (middleBridgeCellAbilityD6 = D6()) != null && (c15veXm = middleBridgeCellAbilityD6.xm()) != null) {
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(cover);
            synchronized (c15veXm.LJIIIIZZ) {
                try {
                    Iterator<C20530915Vj> it2 = c15veXm.LJII.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZ, imageUrlModelLIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C20530915Vj c20530915Vj = next;
                    if (c20530915Vj != null && (interfaceC469401sC = c20530915Vj.LIZIZ) != null) {
                        interfaceC469401sC.cancel();
                    }
                    Iterator<C20530015Va> it3 = c15veXm.LJI.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        C20530015Va c20530015Va = next2;
                        if (Intrinsics.LJFF(c20530015Va.LIZIZ, imageUrlModelLIZ) && c20530015Va.LIZLLL == C15VQ.START) {
                            break;
                        }
                    }
                    C20530015Va c20530015Va2 = next2;
                    if (c20530015Va2 != null) {
                        c20530015Va2.LIZLLL = C15VQ.IDLE;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C15VP c15vpT5 = T5();
        C15VU c15vu2 = c15vpT5.LLILLJJLI;
        if (c15vu2 != null && (c20530515Vf = c15vu2.LJI.get(C15VO.ON_VIEW_RECYCLED)) != null) {
            c20530515Vf.LIZ();
        }
        C15VU c15vu3 = c15vpT5.LLILLJJLI;
        if (c15vu3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("group_id", c15vu3.LIZ);
            jSONObject.putOpt("is_first_screen", c15vu3.LJ);
            jSONObject.putOpt("cover_expose_to_show", c15vu3.LJFF);
            jSONObject.putOpt("position", c15vu3.LIZIZ);
            jSONObject.putOpt("data_source", c15vu3.LIZJ);
            jSONObject.putOpt("cover_origin", c15vu3.LIZLLL);
            for (Map.Entry<C15VO, C20530515Vf> entry : c15vu3.LJI.entrySet()) {
                String value = entry.getKey().getValue();
                C20530515Vf value2 = entry.getValue();
                jSONObject.putOpt(value, Long.valueOf(value2.LIZIZ - value2.LIZ));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c15vpT5.LL);
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            C1848630yCr.LIZIZ(c15vpT5, C2188811AlT.LIZIZ(sbLIZ));
            C1848630yCr.LIZ(c15vpT5, jSONObject);
            c15vpT5.LLILLJJLI = null;
        }
    }

    public final String v6() {
        C20526015Tm item = getItem();
        if (item != null) {
            return item.LLJILJIL;
        }
        return null;
    }

    public final String w6() {
        C20526015Tm item = getItem();
        if (item != null) {
            return item.LLJJ;
        }
        return null;
    }

    public final String z6() {
        C20526015Tm item = getItem();
        if (item != null) {
            return item.LLJILLL;
        }
        return null;
    }

    public final TuxIconDrawable J6(Context context) {
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        C20526015Tm item = getItem();
        if (item != null && (aweme3 = item.LL) != null && C720360SNm.LJIIL(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        if (z && !((Boolean) C0AZD.LIZ.getValue()).booleanValue()) {
            if (LLLFF == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_horizontal_bars;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LJFF = false;
                LLLFF = c419910GdJ.LIZ(context);
            }
            return LLLFF;
        }
        C20526015Tm item2 = getItem();
        if (item2 != null && (aweme = item2.LL) != null && AwemeExtKt.isPhotoMode(aweme)) {
            C20526015Tm item3 = getItem();
            if (item3 != null && (aweme2 = item3.LL) != null && C721220SQu.LJ(aweme2)) {
                if (LLLFZ == null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_live_photo;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                    c419910GdJ2.LJFF = false;
                    LLLFZ = c419910GdJ2.LIZ(context);
                }
                return LLLFZ;
            }
            if (LLLF == null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_square_corner_border_fill;
                c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ3.LJFF = false;
                LLLF = c419910GdJ3.LIZ(context);
            }
            return LLLF;
        }
        if (LLLFFI == null) {
            C419910GdJ c419910GdJ4 = new C419910GdJ();
            c419910GdJ4.LIZ = R.raw.icon_play_fill;
            c419910GdJ4.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ4.LJFF = false;
            LLLFFI = c419910GdJ4.LIZ(context);
        }
        return LLLFFI;
    }

    public final int L5(Aweme aweme) {
        String desc;
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        if (desc == null || desc.length() == 0) {
            return 0;
        }
        return C720080SMk.LIZ(new Regex("@\\S+").replace(desc, "")).length();
    }

    public final int N5(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return str.length();
    }

    public final void S5(String str) {
        String authorUid;
        String secAuthorUid;
        Integer numValueOf;
        String requestId;
        String enterFrom;
        int i;
        Aweme aweme;
        User author;
        Aweme aweme2;
        User author2;
        Aweme aweme3;
        Aweme aweme4;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//user/profile");
        C20526015Tm item = getItem();
        Aweme aweme5 = null;
        if (item != null && (aweme4 = item.LL) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme4);
        } else {
            authorUid = null;
        }
        smartRouteBuildRoute.withParam("uid", authorUid);
        C20526015Tm item2 = getItem();
        if (item2 != null && (aweme3 = item2.LL) != null) {
            secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme3);
        } else {
            secAuthorUid = null;
        }
        smartRouteBuildRoute.withParam("sec_uid", secAuthorUid);
        smartRouteBuildRoute.withParam("enter_from", "homepage_explore");
        smartRouteBuildRoute.withParam("enter_method", str);
        smartRouteBuildRoute.withParam("previous_page", "homepage_explore");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "homepage_explore");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "homepage_explore");
        C20526015Tm item3 = getItem();
        if (item3 != null && (aweme2 = item3.LL) != null && (author2 = aweme2.getAuthor()) != null) {
            numValueOf = Integer.valueOf(author2.getCommerceUserLevel());
        } else {
            numValueOf = null;
        }
        smartRouteBuildRoute.withParam("profile_enterprise_type", numValueOf);
        C20526015Tm item4 = getItem();
        if (item4 != null && (aweme = item4.LL) != null && (author = aweme.getAuthor()) != null) {
            requestId = author.getRequestId();
        } else {
            requestId = null;
        }
        smartRouteBuildRoute.withParam("search_request_id", requestId);
        smartRouteBuildRoute.withParam("explore_detail", 1);
        smartRouteBuildRoute.open();
        C15TA c15ta = C15TA.LIZ;
        C20526015Tm item5 = getItem();
        if (item5 != null) {
            aweme5 = item5.LL;
        }
        MiddleBridgeCellAbility middleBridgeCellAbilityD6 = D6();
        String str2 = "";
        if (middleBridgeCellAbilityD6 == null || (enterFrom = middleBridgeCellAbilityD6.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C20526015Tm item6 = getItem();
        if (item6 != null) {
            i = item6.LLIZLLLIL;
        } else {
            i = 0;
        }
        if (aweme5 != null) {
            c15ta.getClass();
            String aid = aweme5.getAid();
            if (aid != null) {
                str2 = aid;
            }
        }
        c15ta.getClass();
        C15TA.LJIILLIIL("enter_personal_detail", str2);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = enterFrom;
        c735410St1.LJJLIIIJILLIZJL = str;
        c735410St1.LJIJI(aweme5);
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme5, c735410St1);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme5, objLJIIIZ);
        AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ;
        if (C1EE2.LIZIZ.LIZLLL()) {
            abstractC1386130mAt.LIZLLL(i, "is_enter_graphic_detail");
        }
        abstractC1386130mAt.LJIILJJIL();
        ExploreFeedListViewModel.LLJZIJLIL = "enter_personal_detail";
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, X.EnumC1781000wRm> b6(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell.b6(com.ss.android.ugc.aweme.feed.model.Aweme):kotlin.Pair");
    }

    public final void h7(boolean z) {
        String aid;
        Aweme aweme;
        if (!C1EE2.LIZIZ.LJJIJIIJI() && C291000Bas.LIZ()) {
            return;
        }
        try {
            Map<String, String> map = this.LLJJL;
            ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LLJJIJI.getValue();
            C20526015Tm item = getItem();
            if (item != null && (aweme = item.LL) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            AwS82S0210000_31 awS82S0210000_31 = new AwS82S0210000_31(this, map, z, 1);
            if (z) {
                exploreFeedImpressionManager.LL.LIZ(aid, awS82S0210000_31);
            } else {
                exploreFeedImpressionManager.LLILLJJLI.LIZ(aid, awS82S0210000_31);
            }
        } catch (C738120SxO e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "explore_disappear");
        }
    }

    public final void k7(boolean z) {
        C19EG currentActivity;
        Long l;
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1;
        Aweme aweme;
        List<ExplorePostItem> list;
        Aweme aweme2;
        String aid;
        String strCt0;
        String aid2 = null;
        if (!C07MS.LIZ() || !(getCurrentFragment() instanceof ExploreRecommendTopicBottomSheetFragment)) {
            Fragment currentFragment = getCurrentFragment();
            if (currentFragment != null && (currentActivity = getCurrentActivity()) != null && currentFragment.isVisible() && Hox.LLJILJIL.LIZ(currentActivity).KQ2("homepage_explore")) {
                ExploreManageTabAbility exploreManageTabAbility = (ExploreManageTabAbility) this.LLJZ.getValue();
                if (exploreManageTabAbility != null && (exploreCustomTopicResponseYB1 = exploreManageTabAbility.yB1()) != null) {
                    l = exploreCustomTopicResponseYB1.topicId;
                } else {
                    l = null;
                }
                if (!Intrinsics.LJFF(l, S6())) {
                    return;
                }
            } else {
                return;
            }
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        String str = "";
        if (!c1ee2.LJJIJIIJI() && C291000Bas.LIZ()) {
            String strLJJLIIJ = c1ee2.LJJLIIJ();
            HomeTabAbility homeTabAbilityLIZIZ = AbilityExtKt.LIZIZ(C1558360qeg.LJ(this.itemView, null));
            if (homeTabAbilityLIZIZ == null || (strCt0 = homeTabAbilityLIZIZ.Ct0()) == null) {
                strCt0 = "";
            }
            String strCQ2 = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.itemView.getContext())).CQ2();
            if (strCQ2 != null) {
                str = strCQ2;
            }
            C20532515Vz.LIZ(new C1581660rGG(strLJJLIIJ, "onImpressionReport", strCt0, str, Log.getStackTraceString(new Throwable())));
            this.LLJJIJI.getValue();
            return;
        }
        C20524315Sv c20524315Sv = C20524315Sv.LL;
        C20526015Tm item = getItem();
        if (item != null && (aweme2 = item.LL) != null && (aid = aweme2.getAid()) != null) {
            str = aid;
        }
        c20524315Sv.getClass();
        ReentrantLock reentrantLock = C20524315Sv.LLILLJJLI;
        reentrantLock.lock();
        try {
            ExploreAwemeList exploreAwemeList = C20524315Sv.LLILLL;
            if (exploreAwemeList != null && (list = exploreAwemeList.items) != null) {
                C19719612Di.LJJIIJ(list, new AwS74S1000000_24(str, 22), true);
            }
            reentrantLock.unlock();
            if (z) {
                if (!this.LL.LIZ(this.itemView)) {
                    return;
                }
            }
            Map<String, String> mapI5 = I5();
            if (mapI5 == null) {
                return;
            }
            this.LLJJL = mapI5;
            ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LLJJIJI.getValue();
            C20526015Tm item2 = getItem();
            if (item2 != null && (aweme = item2.LL) != null) {
                aid2 = aweme.getAid();
            }
            C20526015Tm item3 = getItem();
            AwS95S0210000_12 awS95S0210000_12 = new AwS95S0210000_12(this, (ExploreFeedCell) mapI5, (Map<String, String>) z, true);
            if (z) {
                exploreFeedImpressionManager.LL.LIZJ(aid2, item3, mapI5, awS95S0210000_12);
            } else {
                exploreFeedImpressionManager.LLILLJJLI.LIZJ(aid2, item3, mapI5, awS95S0210000_12);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) throws Exception {
        C734110Sqv c734110Sqv;
        C15VB c15vb;
        boolean z;
        View viewFindViewById;
        Aweme aweme;
        Integer exploreCommunityCommentShowType;
        Aweme aweme2;
        AwemeStatistics statistics;
        int i;
        C20530515Vf c20530515Vf;
        IExploreFeedDebugService iExploreFeedDebugService;
        final C20530115Vb c20530115Vb;
        MiddleBridgeCellAbility middleBridgeCellAbilityD6;
        UrlModel cover;
        EnumC1334360kpO enumC1334360kpO;
        String str;
        ViewGroup.LayoutParams layoutParams;
        String aid;
        C20526015Tm c20526015Tm = (C20526015Tm) interfaceC1891350zJl;
        C20531215Vm c20531215Vm = C15VB.Companion;
        Integer numValueOf = Integer.valueOf(c20526015Tm.LLILZLL);
        c20531215Vm.getClass();
        C15VB[] c15vbArrValues = C15VB.values();
        int length = c15vbArrValues.length;
        int i2 = 0;
        while (true) {
            c734110Sqv = null;
            if (i2 < length) {
                c15vb = c15vbArrValues[i2];
                int value = c15vb.getValue();
                if (numValueOf != null && value == numValueOf.intValue()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                c15vb = C15VB.UNKNOWN;
                break;
            }
        }
        C15VP c15vpT5 = T5();
        String aid2 = c20526015Tm.LL.getAid();
        int bindingAdapterPosition = getBindingAdapterPosition();
        boolean z2 = c20526015Tm.LLIZ;
        C15VU c15vu = c15vpT5.LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.BIND_DATA, new C20530515Vf());
        }
        C15VU c15vu2 = c15vpT5.LLILLJJLI;
        if (c15vu2 != null) {
            c15vu2.LIZ = aid2;
            c15vu2.LIZIZ = Integer.valueOf(bindingAdapterPosition);
        }
        C15VU c15vu3 = c15vpT5.LLILLJJLI;
        if (c15vu3 != null) {
            c15vu3.LIZJ = Integer.valueOf(c15vb.getValue());
        }
        C15VU c15vu4 = c15vpT5.LLILLJJLI;
        if (c15vu4 != null) {
            c15vu4.LJ = Boolean.valueOf(z2);
        }
        if (C15TM.LIZ() && c20526015Tm.LLIZ && (aid = c20526015Tm.LL.getAid()) != null && aid.length() != 0) {
            synchronized (C2043407zU.LIZJ) {
                try {
                    if (C2043407zU.LIZLLL && !C2043407zU.LJ && !C2043407zU.LJFF) {
                        C2043407zU.LJI.add(aid);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        super.onBindItemView(c20526015Tm);
        Aweme aweme3 = c20526015Tm.LL;
        if (AwemeExtKt.isPhotoMode(aweme3) && ((ExplorePostModeQuickShowConfig) C1867310ygz.LIZIZ.getValue()).preHot) {
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            if (!c1ee2.LJJLIIIJL()) {
                try {
                    c1ee2.LJIIIZ(this.itemView.getContext());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "explore_on_bind_preload_fullpage_xml");
                }
            }
        }
        if (c20526015Tm.LLJJIII && C2513709t9.LIZ) {
            this.LLJJJIL = c20526015Tm.LL.getAid();
        }
        ((InterfaceC20530715Vh) this.LLL.getValue()).m2(aweme3, getBindingAdapterPosition(), c20526015Tm.LLIZ, c15vb, S6(), zR1(), c20526015Tm.LLJI);
        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager = ExploreCustomFeedColdBootManager.LIZ;
        Long lS6 = S6();
        boolean z3 = c20526015Tm.LLIZ;
        String aid3 = c20526015Tm.LL.getAid();
        if (c20526015Tm.LLILZLL != C15TI.CACHE.getValue() && c20526015Tm.LLILZLL != C15TI.FAKE_REFRESH.getValue()) {
            z = false;
        } else {
            z = true;
        }
        int i3 = c20526015Tm.LLILZLL;
        C20530615Vg c20530615Vg = new C20530615Vg(i3, aid3, z3, z);
        exploreCustomFeedColdBootManager.getClass();
        if (lS6 != null && lS6.longValue() == 0) {
            ExploreColdBootMonitor.INSTANCE.bindCell(c20530615Vg);
        } else {
            ExploreLCPTracker exploreLCPTracker = ExploreLCPTracker.INSTANCE;
            exploreLCPTracker.bindFirstScreenCell$explore_release(lS6, aid3, z, i3);
            if (z3) {
                exploreLCPTracker.recordStage$explore_release(lS6, C15V4.DATA_BUILD);
            }
            ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) ExploreCustomFeedColdBootManager.LIZIZ).get(lS6);
            if (exploreCustomFeedColdBootMonitor != null) {
                exploreCustomFeedColdBootMonitor.bindCell(c20530615Vg);
            }
        }
        ExploreTopicTabMonitor.INSTANCE.reportSuccess();
        C786410Ut5.LLLLLLZZ(h6(), 8);
        C786410Ut5.LLLLZLL(T6(), 8);
        if (!C281360B1a.LIZ) {
            T6().setText("");
        }
        FrameLayout frameLayoutC6 = C6();
        if (frameLayoutC6 != null) {
            if (frameLayoutC6.getVisibility() != 8) {
                C786410Ut5.LJZ(8, frameLayoutC6);
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayoutC6.getLayoutParams();
            if ((layoutParams2 == null || layoutParams2.height != 0) && (layoutParams = frameLayoutC6.getLayoutParams()) != null) {
                layoutParams.height = 0;
            }
        }
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            FrameLayout frameLayoutC62 = C6();
            if (frameLayoutC62 != null) {
                C786410Ut5.U4(frameLayoutC62, 1.0f);
            }
            C786410Ut5.T4(this.itemView, 1.0f);
            SmartImageView smartImageViewE6 = e6();
            if (smartImageViewE6 != null) {
                C786410Ut5.u5(smartImageViewE6, 1.0f);
            }
            LinearLayout linearLayoutA6 = a6();
            if (linearLayoutA6 != null) {
                C786410Ut5.W4(linearLayoutA6, 1.0f);
            }
            TuxIconView tuxIconViewH6 = h6();
            if (tuxIconViewH6 != null) {
                C786410Ut5.x5(tuxIconViewH6, 1.0f);
            }
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LLIILII()) {
            C734110Sqv c734110Sqv2 = this.LLJJJJ;
            if (c734110Sqv2 == null) {
                c734110Sqv2 = null;
            }
            c734110Sqv2.LJ(aweme3);
            n7();
        }
        C786410Ut5.LLLLLLZZ(h6(), 0);
        ViewGroup.LayoutParams layoutParams3 = e6().getLayoutParams();
        float f = e6().getLayoutParams().width;
        C15UU.LIZ.getClass();
        layoutParams3.height = (int) (f * C15UU.LIZIZ(aweme3));
        Video video = aweme3.getVideo();
        if (video != null && (cover = video.getCover()) != null) {
            if (C15TM.LIZIZ().chunk0First && c20526015Tm.LLIZ) {
                enumC1334360kpO = EnumC1334360kpO.IMMEDIATE;
            } else {
                enumC1334360kpO = EnumC1334360kpO.HIGH;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJJIJL(e6().getContext());
            c1331670kl3LJIIIIZZ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, e6().getContext()));
            c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
            int i4 = e6().getLayoutParams().width;
            int i5 = e6().getLayoutParams().height;
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i4;
            c1331670kl3LJIIIIZZ.LJIIIZ = i5;
            c1331670kl3LJIIIIZZ.LJIILJJIL = 0;
            if (C1335180kqi.LIZLLL()) {
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                if (!C1335180kqi.LIZIZ() || (str = C15VC.LIZ.get(aweme3.getAid())) == null) {
                    str = "explore_feed_image_cache";
                }
                C2153908cD c2153908cD = C2153908cD.LIZ;
                c1331670kl3LJIIIIZZ.LJJJJJ = str;
                c1331670kl3LJIIIIZZ.LJIILJJIL = 0;
                this.LLJLL = str;
            } else if (C1335190kqj.LIZJ()) {
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIIZZ.LJJJJJ = "photomode_image_cache_v2";
                this.LLJLL = "photomode_image_cache_v2";
            } else {
                this.LLJLL = null;
            }
            c1331670kl3LJIIIIZZ.LJJ(e6());
            c1331670kl3LJIIIIZZ.LJJJIL = (InterfaceC658750Psf) this.LLL.getValue();
            c1331670kl3LJIIIIZZ.LJIIJ((InterfaceC427850Gq7) this.LLL.getValue());
        }
        String first = b6(aweme3).getFirst();
        if (first.length() > 0) {
            C786410Ut5.LLLLZLL(T6(), 0);
            T6().setText(first);
        }
        final User author = aweme3.getAuthor();
        if (author != null) {
            if (c20526015Tm.LLIZ) {
                final String aid4 = aweme3.getAid();
                final Long lS62 = S6();
                c20530115Vb = new InterfaceC427850Gq7() { // from class: X.15Vb
                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th2) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th2) {
                        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager2 = ExploreCustomFeedColdBootManager.LIZ;
                        Long l = lS62;
                        String str2 = aid4;
                        exploreCustomFeedColdBootManager2.getClass();
                        ExploreLCPTracker.INSTANCE.markAvatarLoaded$explore_release(l, str2, false);
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager2 = ExploreCustomFeedColdBootManager.LIZ;
                        Long l = lS62;
                        String str2 = aid4;
                        exploreCustomFeedColdBootManager2.getClass();
                        ExploreLCPTracker.INSTANCE.markAvatarLoaded$explore_release(l, str2, true);
                    }
                };
            } else {
                c20530115Vb = 0;
            }
            if (C15TM.LIZIZ().chunk0First && c20526015Tm.LLIZ) {
                C2043407zU.LIZJ(C15TM.LIZIZ().mergeWaitTimeoutMs, new AwS92S1300000_31(this, aweme3.getAid(), author, c20530115Vb, 2));
            } else if (C20530215Vc.LIZ().isEnable() && C20530215Vc.LIZ().exploreAvatarLoadDelayTime > 0 && c20526015Tm.LLIZ && (middleBridgeCellAbilityD6 = D6()) != null && middleBridgeCellAbilityD6.pJ2()) {
                final String aid5 = aweme3.getAid();
                C2487409ou.LIZLLL(C20530215Vc.LIZ().exploreAvatarLoadDelayTime, new Runnable() { // from class: X.15VA
                    public final void LIZ() {
                        MiddleBridgeCellAbility middleBridgeCellAbilityD62;
                        Aweme aweme4;
                        C20526015Tm item = this.LL.getItem();
                        if (Intrinsics.LJFF((item == null || (aweme4 = item.LL) == null) ? null : aweme4.getAid(), aid5) && (middleBridgeCellAbilityD62 = this.LL.D6()) != null && middleBridgeCellAbilityD62.pJ2()) {
                            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                            ExploreFeedCell exploreFeedCell = this.LL;
                            int i6 = exploreFeedCell.LLJJJJJIL;
                            c1331670kl3LJIIIIZZ2.LJIIIIZZ = i6;
                            c1331670kl3LJIIIIZZ2.LJIIIZ = i6;
                            c1331670kl3LJIIIIZZ2.LJJIII = EnumC1334360kpO.LOW;
                            c1331670kl3LJIIIIZZ2.LJJ(exploreFeedCell.d6());
                            c1331670kl3LJIIIIZZ2.LJIIJ(c20530115Vb);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ExploreFeedCell@544c.onBindItemView$3$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ExploreFeedCell@544c.onBindItemView$3$1");
                    }
                });
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                int i6 = this.LLJJJJJIL;
                c1331670kl3LJIIIIZZ2.LJIIIIZZ = i6;
                c1331670kl3LJIIIIZZ2.LJIIIZ = i6;
                c1331670kl3LJIIIIZZ2.LJJ(d6());
                c1331670kl3LJIIIIZZ2.LJIIJ(c20530115Vb);
            }
            V6().setText(C1057880ddS.LIZIZ("homepage_explore", null, aweme3));
        }
        C734110Sqv c734110Sqv3 = this.LLJJJJ;
        if (c734110Sqv3 != null) {
            c734110Sqv = c734110Sqv3;
        }
        c734110Sqv.LJ(aweme3);
        s7(aweme3);
        TuxIconView tuxIconViewH62 = h6();
        tuxIconViewH62.setImageDrawable(J6(h6().getContext()));
        if (tuxIconViewH62.getLayoutParams().width != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) {
            ViewGroup.LayoutParams layoutParams4 = tuxIconViewH62.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                C786410Ut5.W5(tuxIconViewH62, layoutParams4);
                C426750GoL.LJIIIZ(tuxIconViewH62, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 25);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
        c19659111vp.LIZIZ(5);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
        c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#2E000000"));
        tuxIconViewH62.setBackground(c19659111vp.LIZ(tuxIconViewH62.getContext()));
        if (K6() != null && (iExploreFeedDebugService = (IExploreFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IExploreFeedDebugService.class, false, false, false, 14, null)) != null) {
            C2095008Iq.LJIILIIL(aweme3.getAid());
            iExploreFeedDebugService.LIZ();
        }
        if (a7()) {
            TuxIconView tuxIconView = this.LLJI;
            viewFindViewById = tuxIconView;
            if (tuxIconView == null) {
                TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.c4k);
                this.LLJI = tuxIconView2;
                viewFindViewById = tuxIconView2;
            }
        } else {
            viewFindViewById = this.itemView.findViewById(R.id.c4k);
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        C15VU c15vu5 = T5().LLILLJJLI;
        if (c15vu5 != null && (c20530515Vf = c15vu5.LJI.get(C15VO.BIND_DATA)) != null) {
            c20530515Vf.LIZ();
        }
        if (C04W8.LIZ()) {
            FrameLayout frameLayoutI6 = i6();
            if (frameLayoutI6 != null) {
                C786410Ut5.LJJJJIZL(frameLayoutI6);
            }
            C20526015Tm item = getItem();
            if (item != null && (aweme = item.LL) != null && (exploreCommunityCommentShowType = aweme.getExploreCommunityCommentShowType()) != null && exploreCommunityCommentShowType.intValue() == 1 && first.length() > 0) {
                FrameLayout frameLayoutI62 = i6();
                if (frameLayoutI62 != null) {
                    C786410Ut5.LJZ(0, frameLayoutI62);
                }
                FrameLayout frameLayoutI63 = i6();
                if (frameLayoutI63 != null) {
                    final Context context = this.itemView.getContext();
                    LinearLayout linearLayout = new LinearLayout(context) { // from class: X.0DMJ
                        {
                            super(context, null);
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c5m, this, true);
                        }
                    };
                    C20526015Tm item2 = getItem();
                    if (item2 != null && (aweme2 = item2.LL) != null && (statistics = aweme2.getStatistics()) != null) {
                        long commentCount = statistics.getCommentCount();
                        if (commentCount <= 0) {
                            int visibility = linearLayout.getVisibility();
                            linearLayout.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, linearLayout);
                        } else {
                            int visibility2 = linearLayout.getVisibility();
                            linearLayout.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, linearLayout);
                            String strLIZ = C618720OOo.LIZ(commentCount);
                            if (Intrinsics.LJFF(strLIZ, "1")) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            AppCompatTextView appCompatTextView = (AppCompatTextView) linearLayout.findViewById(R.id.hhg);
                            appCompatTextView.setText(C20642515q3.LJ(2131755180, i, strLIZ));
                            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(linearLayout.getContext(), R.raw.icon_comment_fill);
                            tuxIconDrawable.LJI(R.attr.av_, linearLayout.getContext());
                            tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("  ");
                            sbLIZ.append((Object) appCompatTextView.getText());
                            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                            C786410Ut5.p2(spannableString, new C419890GdH(tuxIconDrawable, 2), 0, 1, 17);
                            appCompatTextView.setText(spannableString);
                        }
                    }
                    frameLayoutI63.addView(linearLayout);
                }
            } else {
                FrameLayout frameLayoutI64 = i6();
                if (frameLayoutI64 != null) {
                    C786410Ut5.LJZ(8, frameLayoutI64);
                }
            }
        }
        m7();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZ;
        C20530515Vf c20530515Vf;
        C15VP c15vpT5 = T5();
        c15vpT5.getClass();
        c15vpT5.LLILLJJLI = new C15VU();
        C15VU c15vu = T5().LLILLJJLI;
        if (c15vu != null) {
            c15vu.LJI.put(C15VO.ON_CREATE_VIEW, new C20530515Vf());
        }
        if (C2513609t8.LIZ) {
            viewLIZ = C20742916Ex.LIZ(viewGroup.getContext(), R.layout.c5_, viewGroup, false, -1);
            TuxIconView tuxIconView = (TuxIconView) viewLIZ.findViewById(R.id.kh4);
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(J6(viewGroup.getContext()));
            }
        } else {
            C2493709pv c2493709pv = C2493709pv.LIZ;
            Context context = viewGroup.getContext();
            c2493709pv.getClass();
            viewLIZ = C2493709pv.LIZ(context, R.layout.c5_, viewGroup);
            TuxIconView tuxIconView2 = (TuxIconView) viewLIZ.findViewById(R.id.kh4);
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(J6(viewGroup.getContext()));
            }
        }
        C15VU c15vu2 = T5().LLILLJJLI;
        if (c15vu2 != null && (c20530515Vf = c15vu2.LJI.get(C15VO.ON_CREATE_VIEW)) != null) {
            c20530515Vf.LIZ();
        }
        return viewLIZ;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewGroup viewGroup;
        ExploreFeedComponent exploreFeedComponent;
        C20526015Tm item = getItem();
        if (item != null) {
            View view2 = this.itemView;
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                if (C07MS.LIZ()) {
                    MiddleBridgeCellAbility middleBridgeCellAbilityD6 = D6();
                    if (middleBridgeCellAbilityD6 != null) {
                        middleBridgeCellAbilityD6.Fh0(item, viewGroup, this);
                        return true;
                    }
                    return true;
                }
                LifecycleOwner parent = getParent();
                if (!(parent instanceof ExploreFeedComponent) || (exploreFeedComponent = (ExploreFeedComponent) parent) == null) {
                    return true;
                }
                exploreFeedComponent.Fh0(item, viewGroup, this);
                return true;
            }
            return true;
        }
        return true;
    }

    public final void r7(String str) {
        String aid;
        C20526015Tm item;
        Aweme aweme;
        if (!C2513709t9.LIZ) {
            return;
        }
        C20526015Tm item2 = getItem();
        if (item2 != null && (aweme = item2.LL) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, str) || (item = getItem()) == null) {
            return;
        }
        item.LLJJIII = false;
        P5();
        ARunnableS16S1100000_11 aRunnableS16S1100000_11 = new ARunnableS16S1100000_11(this, str, 7);
        this.LLJJIJIIJIL = aRunnableS16S1100000_11;
        HandlerHook.viewPostDelay(this.itemView, aRunnableS16S1100000_11, 800L);
    }

    public final void s7(Aweme aweme) {
        long diggCount;
        if (aweme == null) {
            return;
        }
        f6().setSelected(aweme.isLike());
        TuxTextView tuxTextViewU6 = U6();
        C15UU c15uu = C15UU.LIZ;
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        c15uu.getClass();
        tuxTextViewU6.setText(C618720OOo.LIZ(diggCount));
    }

    public final HashMap<String, String> R5(Aweme aweme, Layout layout) {
        EnumC1781000wRm second;
        EnumC1781000wRm second2;
        Aweme aweme2 = null;
        if (aweme == null) {
            return null;
        }
        Pair<String, EnumC1781000wRm> pairB6 = b6(aweme);
        String first = pairB6.getFirst();
        if (!TextUtils.isEmpty(first)) {
            second = pairB6.getSecond();
        } else {
            second = EnumC1781000wRm.NONE;
        }
        if (!TextUtils.isEmpty(first)) {
            first = X5(layout, first);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("is_description_title", String.valueOf(second.getValue()));
        EnumC1781000wRm enumC1781000wRm = EnumC1781000wRm.DESC;
        if (second != enumC1781000wRm && second != EnumC1781000wRm.TITLE_AND_DESC) {
            map.put("displayed_description_length", CardStruct.IStatusCode.DEFAULT);
            map.put("displayed_desc_without_hashtag_mention_emoji_length", CardStruct.IStatusCode.DEFAULT);
        } else {
            map.put("displayed_description_length", String.valueOf(N5(first)));
            C20526015Tm item = getItem();
            if (item != null) {
                aweme2 = item.LL;
            }
            int length = 0;
            if (aweme2 != null) {
                Pair<String, EnumC1781000wRm> pairB62 = b6(aweme2);
                String first2 = pairB62.getFirst();
                if (!TextUtils.isEmpty(first2)) {
                    second2 = pairB62.getSecond();
                } else {
                    second2 = EnumC1781000wRm.NONE;
                }
                if (second2 == enumC1781000wRm || second2 == EnumC1781000wRm.TITLE_AND_DESC) {
                    if (!TextUtils.isEmpty(first2)) {
                        first2 = X5(layout, first2);
                    }
                    if (first2 != null && first2.length() != 0) {
                        length = C720080SMk.LIZ(new Regex("@\\S+").replace(first2, "")).length();
                    }
                }
            }
            map.put("displayed_desc_without_hashtag_mention_emoji_length", String.valueOf(length));
        }
        if (second != EnumC1781000wRm.TITLE && second != EnumC1781000wRm.TITLE_AND_DESC) {
            map.put("displayed_title_length", CardStruct.IStatusCode.DEFAULT);
        } else {
            map.put("displayed_title_length", String.valueOf(N5(first)));
        }
        map.putAll(C735370Ssx.LJJI(aweme));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AwemeExtKt.appendMobParam(aweme, entry.getKey(), entry.getValue());
        }
        return map;
    }

    public final String X5(Layout layout, String str) {
        if (layout != null && layout.getLineCount() > 1) {
            try {
                int ellipsisStart = layout.getEllipsisStart(1);
                if (ellipsisStart > 0) {
                    str = str.substring(0, layout.getLineEnd(0) + ellipsisStart);
                    return str;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public final void i7(Aweme aweme, EnumC721170SQp enumC721170SQp) {
        MiddleBridgeCellAbility middleBridgeCellAbilityD6;
        C20526015Tm item;
        Long lS6;
        Explore0VVTrackerMonitor explore0VVTrackerMonitor = Explore0VVTrackerMonitor.INSTANCE;
        C15UE c15ue = C15UE.RETURN_FROM_DETAIL;
        explore0VVTrackerMonitor.start(c15ue.getValue());
        if (Intrinsics.LJFF(zR1(), "subtab") && (lS6 = S6()) != null) {
            Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopicMonitorFor = Explore0VVTopicMonitorManager.INSTANCE.monitorFor(lS6.longValue());
            explore0VVTrackerMonitorTopicMonitorFor.setTopicName(getTabName());
            explore0VVTrackerMonitorTopicMonitorFor.start(c15ue.getValue());
        }
        EnumC721170SQp enumC721170SQp2 = EnumC721170SQp.DELETE;
        if (enumC721170SQp != enumC721170SQp2 && (item = getItem()) != null && C1EE2.LIZIZ.LIZLLL() && Intrinsics.LJFF(item.LL.getAid(), aweme.getAid())) {
            item.LLIZLLLIL = 1;
        }
        if (enumC721170SQp == enumC721170SQp2 && (middleBridgeCellAbilityD6 = D6()) != null) {
            middleBridgeCellAbilityD6.ck1(aweme.getAid(), new AwS412S0200000_11(this, aweme, 11));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        IExploreFeedDebugService iExploreFeedDebugService;
        Aweme aweme;
        C20526015Tm c20526015Tm = (C20526015Tm) interfaceC1891350zJl;
        super.onBindItemView(c20526015Tm, list);
        if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof C15U8)) {
            C734110Sqv c734110Sqv = this.LLJJJJ;
            Aweme aweme2 = null;
            if (c734110Sqv == null) {
                c734110Sqv = null;
            }
            C20526015Tm item = getItem();
            if (item != null) {
                aweme = item.LL;
            } else {
                aweme = null;
            }
            c734110Sqv.LJ(aweme);
            C20526015Tm item2 = getItem();
            if (item2 != null) {
                aweme2 = item2.LL;
            }
            s7(aweme2);
        }
        if (K6() != null && (iExploreFeedDebugService = (IExploreFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IExploreFeedDebugService.class, false, false, false, 14, null)) != null) {
            C2095008Iq.LJIILIIL(c20526015Tm.LL.getAid());
            iExploreFeedDebugService.LIZ();
        }
        m7();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FrameLayout frameLayoutC6;
        Aweme aweme;
        Aweme aweme2;
        if (motionEvent == null) {
            return false;
        }
        if (!Intrinsics.LJFF(view, d6()) && !Intrinsics.LJFF(view, V6())) {
            if (Intrinsics.LJFF(view, W5())) {
                if (motionEvent.getAction() == 0) {
                    C786410Ut5.W4(W5(), 0.2f);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    C786410Ut5.W4(W5(), 1.0f);
                    return false;
                }
            } else if (Intrinsics.LJFF(view, this.itemView)) {
                if (motionEvent.getAction() == 0) {
                    C20526015Tm item = getItem();
                    if (item != null) {
                        item.LLJJIII = false;
                    }
                    P5();
                    C6().getLayoutParams().height = this.itemView.getMeasuredHeight();
                    FrameLayout frameLayoutC62 = C6();
                    C15UU.LIZ.getClass();
                    frameLayoutC62.setBackgroundResource(R.drawable.brf);
                    C786410Ut5.U4(C6(), 1.0f);
                    C786410Ut5.LJZ(0, C6());
                    C20526015Tm item2 = getItem();
                    if (item2 != null && (aweme2 = item2.LL) != null) {
                        if (AwemeExtKt.isPhotoMode(aweme2)) {
                            if (((Boolean) C0AB5.LIZ.getValue()).booleanValue()) {
                                try {
                                    int i = ((ExploreFirstPreloadVideoConfig) C1868410yil.LIZIZ.getValue()).preloadAudioSizeKBs;
                                    if (i < 0) {
                                        i = 0;
                                    }
                                    C591510NHx.LIZIZ(i, aweme2);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1AF0.LJFF(e, "explore_press_photo_audio_preload");
                                }
                            }
                        } else if (C20530315Vd.LIZ().enable) {
                            try {
                                int i2 = C20530315Vd.LIZ().preloadVideoSizeKBs;
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                int i3 = i2 * 1024;
                                if (!C1483340ohg.LJIJI(aweme2) && C1483340ohg.LJIIIIZZ(aweme2) < i3 && i3 > 0) {
                                    C1483340ohg.LJIL(i3, aweme2);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C1AF0.LJFF(e2, "explore_press_video_preload");
                            }
                        }
                    }
                    C20526015Tm item3 = getItem();
                    if (item3 != null && (aweme = item3.LL) != null && aweme.getAid() != null) {
                        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
                            try {
                                C1EE2 c1ee2 = C1EE2.LIZIZ;
                                C844470XAv.LIZ.getClass();
                                c1ee2.LJJIIZ("homepage_explore", C844470XAv.LIZ(), aweme, 0, EnumC1334360kpO.IMMEDIATE, null, null);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                C1AF0.LJFF(e3, "explore_action_down_preload_first_image");
                            }
                            if (((ExplorePostModeQuickShowConfig) C1867310ygz.LIZIZ.getValue()).preHot) {
                                C1EE2 c1ee22 = C1EE2.LIZIZ;
                                if (!c1ee22.LJJLIIIJL()) {
                                    try {
                                        c1ee22.LJIIIZ(this.itemView.getContext());
                                        return false;
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                        C1AF0.LJFF(e4, "explore_action_down_preload_fullpage_xml");
                                        return false;
                                    }
                                }
                            }
                        } else if (((Boolean) C0AHA.LIZ.getValue()).booleanValue()) {
                            try {
                                C1483410ohn.LJLJJI().LJJLJ(aweme);
                                return false;
                            } catch (Exception e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                C1AF0.LJFF(e5, "explore_action_down_prerender_video");
                                return false;
                            }
                        }
                    }
                } else if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && (frameLayoutC6 = C6()) != null) {
                    if (frameLayoutC6.getLayoutParams().height != 0) {
                        ViewGroup.LayoutParams layoutParams = frameLayoutC6.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = 0;
                            C786410Ut5.W5(frameLayoutC6, layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    C786410Ut5.LJZ(8, frameLayoutC6);
                    return false;
                }
            }
        } else {
            if (motionEvent.getAction() == 0) {
                C786410Ut5.B5(V6(), 0.2f);
                C786410Ut5.J5(d6(), 0.2f);
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                C786410Ut5.B5(V6(), 1.0f);
                C786410Ut5.J5(d6(), 1.0f);
                return false;
            }
        }
        return false;
    }

    public final void l7(final Layout layout, Map<String, String> map, final boolean z) {
        final int value;
        final Aweme aweme;
        Long lS6;
        Integer numLJIIJJI;
        final int i;
        Integer numValueOf;
        Aweme aweme2;
        LogPbBean logPbBean;
        Boolean boolValueOf;
        Integer numValueOf2;
        Long lS62;
        Boolean boolValueOf2;
        final boolean z2 = false;
        final LogPbBean logPbBean2 = null;
        Integer numValueOf3 = null;
        if (!b7()) {
            final String string = T6().getText().toString();
            final int layoutPosition = getLayoutPosition();
            FirstScreenCheckingAbility firstScreenCheckingAbility = (FirstScreenCheckingAbility) this.LLJLLL.getValue();
            if (firstScreenCheckingAbility != null) {
                firstScreenCheckingAbility.kp0(layoutPosition);
            }
            FirstScreenCheckingAbility firstScreenCheckingAbility2 = (FirstScreenCheckingAbility) this.LLJLLL.getValue();
            if (firstScreenCheckingAbility2 != null && firstScreenCheckingAbility2.xC0(layoutPosition)) {
                i = 1;
            } else {
                i = 0;
            }
            C15TA c15ta = C15TA.LIZ;
            C20526015Tm item = getItem();
            if (item != null) {
                numValueOf = Integer.valueOf(item.LLILZLL);
            } else {
                numValueOf = null;
            }
            c15ta.getClass();
            C15TA.LJIIL(numValueOf);
            C20526015Tm item2 = getItem();
            if (item2 != null) {
                aweme2 = item2.LL;
            } else {
                aweme2 = null;
            }
            C20526015Tm item3 = getItem();
            if (item3 != null) {
                logPbBean = item3.LLILZ;
            } else {
                logPbBean = null;
            }
            final Aweme aweme3 = aweme2;
            final LogPbBean logPbBean3 = logPbBean;
            Runnable runnable = new Runnable() { // from class: X.15V8
                public final void LIZ() {
                    String enterFrom;
                    Integer exploreCommunityCommentShowType;
                    Aweme aweme4;
                    AwemeStatistics statistics;
                    String strX5 = this.LL.X5(layout, string);
                    ExploreFeedCell exploreFeedCell = this.LL;
                    exploreFeedCell.LLJJJJLIIL = exploreFeedCell.R5(aweme3, layout);
                    MiddleBridgeCellAbility middleBridgeCellAbilityD6 = this.LL.D6();
                    if (middleBridgeCellAbilityD6 == null || (enterFrom = middleBridgeCellAbilityD6.getEnterFrom()) == null) {
                        enterFrom = "";
                    }
                    String strQ6 = this.LL.q6();
                    Aweme aweme5 = aweme3;
                    String string2 = null;
                    String aid = aweme5 != null ? aweme5.getAid() : null;
                    Aweme aweme6 = aweme3;
                    String authorUid = aweme6 != null ? AwemeExtKt.getAuthorUid(aweme6) : null;
                    String strL6 = this.LL.L6();
                    Aweme aweme7 = aweme3;
                    int awemeType = aweme7 != null ? aweme7.getAwemeType() : 0;
                    HashMap<String, String> map2 = this.LL.LLJJJJLIIL;
                    Aweme aweme8 = aweme3;
                    int iLJII = aweme8 != null ? C720360SNm.LJII(aweme8) : 0;
                    Aweme aweme9 = aweme3;
                    int iLJIIJ = aweme9 != null ? C720360SNm.LJIIJ(aweme9) : 0;
                    C20526015Tm item4 = this.LL.getItem();
                    boolean z3 = item4 != null ? item4.LLILZIL : false;
                    Aweme aweme10 = aweme3;
                    Map<String, String> mapLIZIZ = aweme10 != null ? C1348720lCY.LIZIZ(aweme10) : null;
                    C20526015Tm item5 = this.LL.getItem();
                    int value2 = item5 != null ? item5.LLILZLL : C15TI.UNKNOWN.getValue();
                    Long lS63 = this.LL.S6();
                    String tabName = this.LL.getTabName();
                    String strZR1 = this.LL.zR1();
                    Aweme aweme11 = aweme3;
                    if (aweme11 != null && (exploreCommunityCommentShowType = aweme11.getExploreCommunityCommentShowType()) != null && exploreCommunityCommentShowType.intValue() == 1 && (aweme4 = aweme3) != null && (statistics = aweme4.getStatistics()) != null) {
                        string2 = Long.valueOf(statistics.getCommentCount()).toString();
                    }
                    C20532515Vz.LIZ(new C20532215Vw(enterFrom, strQ6, layoutPosition, aid, authorUid, strL6, logPbBean3, awemeType, strX5, string, map2, iLJII, iLJIIJ, z3, z, i, mapLIZIZ, value2, lS63, tabName, strZR1, string2, Integer.valueOf(this.LL.L5(aweme3)), this.LL.u6(), this.LL.v6(), this.LL.r6(), this.LL.z6(), this.LL.w6(), this.LL.LLJLL));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreFeedCell@544c.reportExploreCardShowLegacy$reportRunnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreFeedCell@544c.reportExploreCardShowLegacy$reportRunnable$1");
                }
            };
            if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
                C823050WQl.LIZIZ().execute(runnable);
            } else {
                runnable.run();
            }
            Explore0VVTrackerMonitor explore0VVTrackerMonitor = Explore0VVTrackerMonitor.INSTANCE;
            C20526015Tm item4 = getItem();
            if (item4 != null) {
                boolValueOf = Boolean.valueOf(item4.LLILZIL);
            } else {
                boolValueOf = null;
            }
            C20526015Tm item5 = getItem();
            if (item5 != null) {
                numValueOf2 = Integer.valueOf(item5.LLILZLL);
            } else {
                numValueOf2 = null;
            }
            explore0VVTrackerMonitor.showingCard(boolValueOf, numValueOf2);
            if (Intrinsics.LJFF(zR1(), "subtab") && (lS62 = S6()) != null) {
                Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopicMonitorFor = Explore0VVTopicMonitorManager.INSTANCE.monitorFor(lS62.longValue());
                C20526015Tm item6 = getItem();
                if (item6 != null) {
                    boolValueOf2 = Boolean.valueOf(item6.LLILZIL);
                } else {
                    boolValueOf2 = null;
                }
                C20526015Tm item7 = getItem();
                if (item7 != null) {
                    numValueOf3 = Integer.valueOf(item7.LLILZLL);
                }
                explore0VVTrackerMonitorTopicMonitorFor.showingCard(boolValueOf2, numValueOf3);
                return;
            }
            return;
        }
        final String string2 = T6().getText().toString();
        final int iLIZ = C15V6.LIZ(map);
        if (iLIZ == -1) {
            return;
        }
        final String strLIZIZ = C15V6.LIZIZ(map);
        boolean zLJFF = Intrinsics.LJFF(map.get("is_first_screen"), "1");
        String str = map.get("model_source");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            value = numLJIIJJI.intValue();
        } else {
            value = C15TI.UNKNOWN.getValue();
        }
        C15TA c15ta2 = C15TA.LIZ;
        Integer numValueOf4 = Integer.valueOf(value);
        c15ta2.getClass();
        C15TA.LJIIL(numValueOf4);
        C20526015Tm item8 = getItem();
        if (item8 != null) {
            aweme = item8.LL;
        } else {
            aweme = null;
        }
        C20526015Tm item9 = getItem();
        if (item9 != null) {
            logPbBean2 = item9.LLILZ;
        }
        C20526015Tm item10 = getItem();
        if (item10 != null) {
            z2 = item10.LLILZIL;
        }
        final int i2 = zLJFF ? 1 : 0;
        Runnable runnable2 = new Runnable() { // from class: X.15V9
            public final void LIZ() {
                String enterFrom;
                Integer exploreCommunityCommentShowType;
                Aweme aweme4;
                AwemeStatistics statistics;
                String strX5 = this.LL.X5(layout, string2);
                ExploreFeedCell exploreFeedCell = this.LL;
                exploreFeedCell.LLJJJJLIIL = exploreFeedCell.R5(aweme, layout);
                MiddleBridgeCellAbility middleBridgeCellAbilityD6 = this.LL.D6();
                if (middleBridgeCellAbilityD6 == null || (enterFrom = middleBridgeCellAbilityD6.getEnterFrom()) == null) {
                    enterFrom = "";
                }
                Aweme aweme5 = aweme;
                String string3 = null;
                String aid = aweme5 != null ? aweme5.getAid() : null;
                Aweme aweme6 = aweme;
                String authorUid = aweme6 != null ? AwemeExtKt.getAuthorUid(aweme6) : null;
                String strL6 = this.LL.L6();
                Aweme aweme7 = aweme;
                int awemeType = aweme7 != null ? aweme7.getAwemeType() : 0;
                HashMap<String, String> map2 = this.LL.LLJJJJLIIL;
                Aweme aweme8 = aweme;
                int iLJII = aweme8 != null ? C720360SNm.LJII(aweme8) : 0;
                Aweme aweme9 = aweme;
                int iLJIIJ = aweme9 != null ? C720360SNm.LJIIJ(aweme9) : 0;
                Aweme aweme10 = aweme;
                Map<String, String> mapLIZIZ = aweme10 != null ? C1348720lCY.LIZIZ(aweme10) : null;
                Long lS63 = this.LL.S6();
                String tabName = this.LL.getTabName();
                String strZR1 = this.LL.zR1();
                Aweme aweme11 = aweme;
                if (aweme11 != null && (exploreCommunityCommentShowType = aweme11.getExploreCommunityCommentShowType()) != null && exploreCommunityCommentShowType.intValue() == 1 && (aweme4 = aweme) != null && (statistics = aweme4.getStatistics()) != null) {
                    string3 = Long.valueOf(statistics.getCommentCount()).toString();
                }
                C20532515Vz.LIZ(new C20532215Vw(enterFrom, strLIZIZ, iLIZ, aid, authorUid, strL6, logPbBean2, awemeType, strX5, string2, map2, iLJII, iLJIIJ, z2, z, i2, mapLIZIZ, value, lS63, tabName, strZR1, string3, Integer.valueOf(this.LL.L5(aweme)), this.LL.u6(), this.LL.v6(), this.LL.r6(), this.LL.z6(), this.LL.w6(), this.LL.LLJLL));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreFeedCell@544c.reportExploreCardShow$reportRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreFeedCell@544c.reportExploreCardShow$reportRunnable$1");
            }
        };
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(runnable2);
        } else {
            runnable2.run();
        }
        Explore0VVTrackerMonitor.INSTANCE.showingCard(Boolean.valueOf(z2), Integer.valueOf(value));
        if (Intrinsics.LJFF(zR1(), "subtab") && (lS6 = S6()) != null) {
            Explore0VVTopicMonitorManager.INSTANCE.monitorFor(lS6.longValue()).showingCard(Boolean.valueOf(z2), Integer.valueOf(value));
        }
    }
}
