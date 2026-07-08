package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics;

import X.AbstractC746450TPv;
import X.AnonymousClass0399;
import X.C01GW;
import X.C0TPC;
import X.C0TPD;
import X.C0TQ2;
import X.C0TQ5;
import X.C1198204mS;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12847050z;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1697810uHb;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C191819102n;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C746390TPp;
import X.C746430TPt;
import X.C746460TPw;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1846110y8n;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.AdTopicStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.PATopicsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.SensitiveTopicStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.SensitiveTopicsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.ui.TopicDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel.AdTopicsViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public final class AdTopicsActivity extends BaseActivity implements C0TQ5 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklHELIOSMyp9KyohOSM6KSsvLGEnJzUlKjx9CSEYJj86KzYNKjs6Piw4MA==";
    public C1390410mHn LL;
    public RecyclerView LLILLJJLI;
    public TuxNavBar LLILLL;
    public RelativeLayout LLIZ;
    public RelativeLayout LLIZLLLIL;
    public RelativeLayout LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C1846060y8i LLJILJILJ;
    public C1198204mS LLJJI;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public long LLJJL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 356));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 358));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 357));
    public String LLJILLL = "";
    public String LLJJ = "";
    public final List<AbstractC746450TPv> LLJJIII = new ArrayList();
    public final long LLJJJIL = 500;

    public final C0TQ2 LLLLLZL() {
        return (C0TQ2) this.LLILZ.getValue();
    }

    public final C1390410mHn LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kls);
            this.LL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final AdTopicsViewModel LLLLZIL() {
        return (AdTopicsViewModel) this.LLILZIL.getValue();
    }

    public final boolean LLLLZLLIL() {
        if (this.LLJJJJ != null) {
            return false;
        }
        Integer num = this.LLJJJJLIIL;
        return num == null || num.intValue() == 0;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        Map mapLJIIZILJ;
        Map mapLJIIZILJ2;
        C1198204mS c1198204mS;
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(LLLLZLLIL() ? 2 : 1, "category");
        c2344009Gk.LIZJ((this.LLJJIJIIJIL || this.LLJJIJIL) ? 1 : 0, "is_changed");
        C20684815ws.LJIILLIIL("ad_topics_result", c2344009Gk.LIZ);
        if (LLLLZLLIL() && (c1198204mS = this.LLJJI) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c1198204mS.LIZIZ;
            Map<Integer, Long> map = c1198204mS.LIZJ;
            Integer numValueOf = Integer.valueOf(c1198204mS.LIZ);
            Long l = (Long) ((LinkedHashMap) c1198204mS.LIZJ).get(Integer.valueOf(c1198204mS.LIZ));
            map.put(numValueOf, Long.valueOf((l != null ? l.longValue() : 0L) + jCurrentTimeMillis));
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        String str = this.LLJJJJ;
        if (str != null) {
            c2344009Gk2.LJFF("ad_topic_id", str);
        }
        c2344009Gk2.LIZJ(LLLLZLLIL() ? 1 : 0, "is_parent");
        c2344009Gk2.LIZLLL(System.currentTimeMillis() - this.LLJJL, "stay_time");
        c2344009Gk2.LJ(this.LLJJJJLIIL, "section");
        if (LLLLZLLIL()) {
            C1198204mS c1198204mS2 = this.LLJJI;
            Object obj = null;
            c2344009Gk2.LJ((c1198204mS2 == null || (mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(c1198204mS2.LIZJ)) == null) ? null : mapLJIIZILJ2.get(0), "topic_tab_stay_time");
            C1198204mS c1198204mS3 = this.LLJJI;
            if (c1198204mS3 != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(c1198204mS3.LIZJ)) != null) {
                obj = mapLJIIZILJ.get(1);
            }
            c2344009Gk2.LJ(obj, "sensitive_tab_stay_time");
        }
        C20684815ws.LJIILLIIL("ad_topics_stay_time_list", c2344009Gk2.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C0TQ5
    public final void LIZ(int i) {
        String string;
        String str;
        if (i >= 0 && i < ((ArrayList) this.LLJJIII).size()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLJJJ >= this.LLJJJIL) {
                this.LLJJJ = jCurrentTimeMillis;
                AbstractC746450TPv abstractC746450TPv = (AbstractC746450TPv) ListProtector.get(this.LLJJIII, i);
                if (abstractC746450TPv instanceof C746390TPp) {
                    ((TopicDialog) this.LLILZLL.getValue()).bS(abstractC746450TPv, 3);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("ad_topic_id", ((C746390TPp) abstractC746450TPv).LIZ.sensitiveTopicId);
                    c2344009Gk.LIZJ(0, "is_parent");
                    c2344009Gk.LIZJ(0, "is_manage_all");
                    c2344009Gk.LIZJ(3, "section");
                    C20684815ws.LJIILLIIL("ad_topic_click_topic", c2344009Gk.LIZ);
                    return;
                }
                if (abstractC746450TPv instanceof C746430TPt) {
                    if (LLLLZLLIL()) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//privacy/setting/personalization/topic");
                        C746430TPt c746430TPt = (C746430TPt) abstractC746450TPv;
                        smartRouteBuildRoute.withParam("keyAdTopicId", c746430TPt.LIZ.adTopicId);
                        smartRouteBuildRoute.withParam("keyAdTopicTitle", c746430TPt.LIZ.adTopicName);
                        smartRouteBuildRoute.withParam("keyAdTopicIsParent", Intrinsics.LJFF(c746430TPt.LIZ.isParent(), Boolean.TRUE));
                        smartRouteBuildRoute.open();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("ad_topic_id", c746430TPt.LIZ.adTopicId);
                        c2344009Gk2.LIZJ(1, "is_parent");
                        c2344009Gk2.LIZJ(0, "is_manage_all");
                        c2344009Gk2.LJ(this.LLJJJJLIIL, "section");
                        C20684815ws.LJIILLIIL("ad_topic_click_topic", c2344009Gk2.LIZ);
                        return;
                    }
                    ((TopicDialog) this.LLILZLL.getValue()).bS(abstractC746450TPv, this.LLJJJJLIIL);
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    C746430TPt c746430TPt2 = (C746430TPt) abstractC746450TPv;
                    c2344009Gk3.LJIIIIZZ("ad_topic_id", c746430TPt2.LIZ.adTopicId);
                    c2344009Gk3.LIZJ(0, "is_parent");
                    c2344009Gk3.LIZJ(Intrinsics.LJFF(c746430TPt2.LIZ.isParent(), Boolean.TRUE) ? 1 : 0, "is_manage_all");
                    c2344009Gk3.LJ(this.LLJJJJLIIL, "section");
                    C20684815ws.LJIILLIIL("ad_topic_click_topic", c2344009Gk3.LIZ);
                    return;
                }
                if (!(abstractC746450TPv instanceof C746460TPw) || !LLLLZLLIL()) {
                    return;
                }
                C746460TPw c746460TPw = (C746460TPw) abstractC746450TPv;
                int i2 = c746460TPw.LIZIZ;
                if (i2 != 1) {
                    if (i2 != 2) {
                        string = null;
                    } else {
                        string = getString(2131824763);
                    }
                } else {
                    string = getString(2131824765);
                }
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this, "//privacy/setting/personalization/topic");
                smartRouteBuildRoute2.withParam("keyAdTopicSection", c746460TPw.LIZIZ);
                smartRouteBuildRoute2.withParam("keyAdTopicTitle", string);
                smartRouteBuildRoute2.open();
                if (c746460TPw.LIZIZ == 2) {
                    str = "ad_topic_inferred_by_tiktok_entry";
                } else {
                    str = "ad_topic_your_choices_entry";
                }
                C2344009Gk c2344009Gk4 = new C2344009Gk();
                c2344009Gk4.LIZJ(1, "entry");
                C20684815ws.LJIILLIIL(str, c2344009Gk4.LIZ);
            }
        }
    }

    public final void LLLLZLL(PATopicsResponse pATopicsResponse) {
        String descriptionLearnMoreLink;
        Integer num;
        List<AdTopicStruct> adTopics;
        int selectedTabPosition;
        TuxTextView tuxTextView;
        PATopicsResponse value = LLLLZIL().LL.getValue();
        AdTopicStruct adTopicStruct = null;
        if (value != null) {
            descriptionLearnMoreLink = value.getDescriptionLearnMoreLink();
        } else {
            descriptionLearnMoreLink = null;
        }
        this.LLJJIJI = descriptionLearnMoreLink;
        PATopicsResponse value2 = LLLLZIL().LL.getValue();
        if (value2 != null) {
            value2.getInterestLearnMoreLink();
        }
        if ((!a0.LJJJIL(this.LLJILLL)) && (!a0.LJJJIL(this.LLJJ)) && LLLLZLLIL() && (tuxTextView = this.LLJILJIL) != null) {
            tuxTextView.setText(AnonymousClass0399.LIZ(this, this.LLJILLL, this.LLJJ, this.LLJJIJI));
        }
        if (LLLLZLLIL()) {
            C1846060y8i c1846060y8i = this.LLJILJILJ;
            if (c1846060y8i != null) {
                selectedTabPosition = c1846060y8i.getSelectedTabPosition();
            } else {
                selectedTabPosition = 0;
            }
            LLLLZLLLI(selectedTabPosition);
        } else {
            List<AbstractC746450TPv> list = this.LLJJIII;
            Integer num2 = this.LLJJJJLIIL;
            if ((num2 == null || num2.intValue() != 1) && (((num = this.LLJJJJLIIL) == null || num.intValue() != 2) && (adTopics = pATopicsResponse.getAdTopics()) != null)) {
                Iterator<AdTopicStruct> it2 = adTopics.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AdTopicStruct next = it2.next();
                    if (Intrinsics.LJFF(next.isParent(), Boolean.TRUE)) {
                        adTopicStruct = next;
                        break;
                    }
                }
                AdTopicStruct adTopicStruct2 = adTopicStruct;
                if (adTopicStruct2 != null) {
                    ArrayList arrayList = (ArrayList) list;
                    arrayList.add(new C0TPD(getString(2131821858)));
                    arrayList.add(new C746430TPt(adTopicStruct2));
                }
            }
            List<AdTopicStruct> adTopics2 = pATopicsResponse.getAdTopics();
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.add(new C0TPD(getString(2131824757)));
            if (adTopics2 != null) {
                Iterator<AdTopicStruct> it3 = adTopics2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C746430TPt(it3.next()));
                }
            }
        }
        C1390410mHn c1390410mHnLLLLZI = LLLLZI();
        if (c1390410mHnLLLLZI != null) {
            c1390410mHnLLLLZI.LIZLLL();
        }
        C1390410mHn c1390410mHnLLLLZI2 = LLLLZI();
        if (c1390410mHnLLLLZI2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHnLLLLZI2, 8);
        }
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_label_list);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) callbackFindViewById;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        LLLLLZL().LLILZIL = this.LLJJIII;
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.user_label_list);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById2;
        }
        RecyclerView recyclerView2 = (RecyclerView) callbackFindViewById2;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(LLLLLZL());
        }
        LLLLLZL().notifyDataSetChanged();
    }

    public final void LLLLZLLLI(int i) {
        SensitiveTopicsResponse value;
        PATopicsResponse value2 = LLLLZIL().LL.getValue();
        if (value2 == null || (value = LLLLZIL().LLILLJJLI.getValue()) == null) {
            return;
        }
        ((ArrayList) this.LLJJIII).clear();
        List<AbstractC746450TPv> list = this.LLJJIII;
        if (i == 0) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C0TPD(getString(2131824763)));
            arrayList.add(new C746460TPw(getString(2131824762), 2));
            arrayList.add(new C0TPD(getString(2131824765)));
            arrayList.add(new C746460TPw(getString(2131824762), 1));
            List<AdTopicStruct> adTopics = value2.getAdTopics();
            if (adTopics != null && !adTopics.isEmpty()) {
                arrayList.add(new C0TPD(getString(2131824760)));
            }
            List<AdTopicStruct> adTopics2 = value2.getAdTopics();
            if (adTopics2 != null) {
                Iterator<AdTopicStruct> it2 = adTopics2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C746430TPt(it2.next()));
                }
            }
        } else {
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.add(new C0TPD(""));
            List<SensitiveTopicStruct> sensitiveTopics = value.getSensitiveTopics();
            if (sensitiveTopics != null) {
                Iterator<SensitiveTopicStruct> it3 = sensitiveTopics.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C746390TPp(it3.next()));
                }
            }
            arrayList2.add(new C0TPC(getString(2131822107)));
        }
        LLLLLZL().notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        Integer numValueOf;
        activityConfiguration(new AwS591S0100000_12(this, 590));
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("keyAdTopicId");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        this.LLJJJJ = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            try {
                stringExtra2 = intent2.getStringExtra("keyAdTopicTitle");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
        } else {
            stringExtra2 = null;
        }
        this.LLJJJJJIL = stringExtra2;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            intent3.getBooleanExtra("keyAdTopicIsParent", false);
        }
        Intent intent4 = getIntent();
        if (intent4 != null) {
            numValueOf = Integer.valueOf(intent4.getIntExtra("keyAdTopicSection", 0));
        } else {
            numValueOf = null;
        }
        this.LLJJJJLIIL = numValueOf;
        LLLLZIL().wQ2(this.LLJJJJLIIL, this.LLJJJJ);
        if (LLLLZLLIL()) {
            LLLLZIL().vQ2();
            LLLLZIL().LLILZIL.observe(this, new AObserverS216S0100000_12(this, 121));
        } else {
            LLLLZIL().LL.observe(this, new AObserverS216S0100000_12(this, 122));
        }
        setTheme(R.style.my);
        setContentView(R.layout.bc4);
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.klu);
            this.LLILLL = (TuxNavBar) callbackFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) callbackFindViewById;
        C1250250idj c1250250idj = new C1250250idj();
        if (LLLLZLLIL()) {
            c1250250idj.LIZJ = getString(2131822111);
        } else {
            c1250250idj.LIZJ = String.valueOf(this.LLJJJJJIL);
        }
        tuxNavBar.LJIJJ(c1250250idj);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 995));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(0);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.a8_);
        if (LLLLZLLIL()) {
            this.LLJJ = getString(2131822108);
            this.LLJILLL = getString(2131822106);
            String str = this.LLJJ;
            if (!a0.LJJJIL(str)) {
                this.LLJILLL = u.LJJIFFI(this.LLJILLL, "%s", str, false);
            }
        } else {
            Integer num = this.LLJJJJLIIL;
            if (num != null && num.intValue() == 2) {
                TuxTextView tuxTextView = this.LLJILJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(getString(2131824761));
                }
            } else {
                Integer num2 = this.LLJJJJLIIL;
                if (num2 != null && num2.intValue() == 1) {
                    TuxTextView tuxTextView2 = this.LLJILJIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(getString(2131824764));
                    }
                } else {
                    this.LLJILLL = getString(2131824755);
                    String string = getString(2131821858);
                    this.LLJJ = string;
                    String strLJJIFFI = u.LJJIFFI(this.LLJILLL, "%s", string, false);
                    this.LLJILLL = strLJJIFFI;
                    TuxTextView tuxTextView3 = this.LLJILJIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(AnonymousClass0399.LIZ(this, strLJJIFFI, this.LLJJ, null));
                    }
                }
            }
        }
        TuxTextView tuxTextView4 = this.LLJILJIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.LLJILJILJ = (C1846060y8i) findViewById(R.id.a9h);
        if (!LLLLZLLIL()) {
            C1846060y8i c1846060y8i = this.LLJILJILJ;
            if (c1846060y8i != null) {
                C786410Ut5.LJLLLLLL(8, c1846060y8i);
            }
        } else {
            this.LLJJI = new C1198204mS();
            C1846060y8i c1846060y8i2 = this.LLJILJILJ;
            if (c1846060y8i2 != null) {
                C1845940y8W c1845940y8WLJIIIZ = c1846060y8i2.LJIIIZ();
                c1845940y8WLJIIIZ.LIZIZ(getString(2131822113));
                c1846060y8i2.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i2.LLILZLL.size(), c1846060y8i2.LLILZLL.isEmpty());
                C1845940y8W c1845940y8WLJIIIZ2 = c1846060y8i2.LJIIIZ();
                c1845940y8WLJIIIZ2.LIZIZ(getString(2131822112));
                c1846060y8i2.LIZIZ(c1845940y8WLJIIIZ2, c1846060y8i2.LLILZLL.size(), c1846060y8i2.LLILZLL.isEmpty());
                c1846060y8i2.LIZ(new InterfaceC1846110y8n() { // from class: X.0TQ3
                    @Override // X.InterfaceC1846110y8n
                    public final void LIZ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZJ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZIZ(C1845940y8W c1845940y8W) {
                        long jLongValue;
                        this.LIZ.LLLLZLLLI(c1845940y8W.LIZLLL);
                        int i = c1845940y8W.LIZLLL;
                        if (i != 0) {
                            if (i == 1) {
                                i = 2;
                            }
                        } else {
                            i = 0;
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i, "entry");
                        C20684815ws.LJIILLIIL("ad_topic_tab_select", c2344009Gk.LIZ);
                        C1198204mS c1198204mS = this.LIZ.LLJJI;
                        if (c1198204mS != null) {
                            int i2 = c1845940y8W.LIZLLL;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = jCurrentTimeMillis - c1198204mS.LIZIZ;
                            Map<Integer, Long> map = c1198204mS.LIZJ;
                            Integer numValueOf2 = Integer.valueOf(c1198204mS.LIZ);
                            Long l = (Long) ((LinkedHashMap) c1198204mS.LIZJ).get(Integer.valueOf(c1198204mS.LIZ));
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            map.put(numValueOf2, Long.valueOf(jLongValue + j));
                            c1198204mS.LIZ = i2;
                            c1198204mS.LIZIZ = jCurrentTimeMillis;
                        }
                    }
                });
            }
        }
        if (LLLLZLLIL()) {
            C191819102n.LIZ.getClass();
            String strLIZIZ = C191819102n.LIZIZ();
            if (strLIZIZ != null) {
                Keva keva = C12847050z.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show");
                sbLIZ.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                Keva keva2 = C12847050z.LIZ;
                boolean z = keva2.getBoolean(strLIZIZ2, false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("time");
                sbLIZ2.append(strLIZIZ);
                long j = keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
                if (!z || (System.currentTimeMillis() - j) / ((long) 86400000) > 35) {
                    this.LLIZ = (RelativeLayout) findViewById(R.id.klm);
                    this.LLIZLLLIL = (RelativeLayout) findViewById(R.id.klk);
                    this.LLJ = (RelativeLayout) findViewById(R.id.klo);
                    this.LLJI = (TuxIconView) findViewById(R.id.kln);
                    this.LLJIJIL = (TuxIconView) findViewById(R.id.kll);
                    RelativeLayout relativeLayout = this.LLIZ;
                    if (relativeLayout != null) {
                        C786410Ut5.LLIIL(relativeLayout, 0);
                    }
                    TuxIconView tuxIconView = this.LLJI;
                    if (tuxIconView != null) {
                        C786410Ut5.a9(tuxIconView, new ACListenerS147S0100000_12(this, 462));
                    }
                    TuxIconView tuxIconView2 = this.LLJIJIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.a9(tuxIconView2, new ACListenerS147S0100000_12(this, 463));
                    }
                }
            }
        }
        C786410Ut5.LLLZZIL(LLLLZI(), 0);
        LLLLZI().LIZJ();
        this.LLJJL = System.currentTimeMillis();
        LLLLZIL().LLILLL.observe(this, new AObserverS216S0100000_12(this, 123));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
