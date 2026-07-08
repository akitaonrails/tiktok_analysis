package com.ss.android.ugc.feed.platform.panel.pause;

import X.C01GW;
import X.C07HB;
import X.C0HCN;
import X.C0RGG;
import X.C0SUS;
import X.C0SZ8;
import X.C0T3R;
import X.C1209360hZm;
import X.C1210880hcE;
import X.C1372310lob;
import X.C13LP;
import X.C14EU;
import X.C1564680qos;
import X.C1576740r8K;
import X.C1576760r8M;
import X.C1581940rGi;
import X.C1584420rKi;
import X.C1594420raq;
import X.C1594430rar;
import X.C1594470rav;
import X.C1594520rb0;
import X.C1594540rb2;
import X.C1594560rb4;
import X.C1594570rb5;
import X.C1697810uHb;
import X.C19EG;
import X.C20684815ws;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C265910AbV;
import X.C418440Gaw;
import X.C452501pT;
import X.C586380MzE;
import X.C622680Oba;
import X.C676750Qgb;
import X.C690440R6k;
import X.C714060Rzg;
import X.C722910SXh;
import X.C724240Sb0;
import X.C739870T0n;
import X.C786410Ut5;
import X.C814420VxA;
import X.ExecutorC2043307zT;
import X.InterfaceC1554640qYg;
import X.InterfaceC1594350raj;
import X.InterfaceC1594460rau;
import X.InterfaceC1594550rb3;
import X.InterfaceC1603190roz;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import X.InterfaceC743730TFj;
import X.RunnableC1594530rb1;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS2S0100001_12;
import Y.ARunnableS72S0200000_3;
import Y.ARunnableS81S0200000_12;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class PausePanelComponent extends BasePanelComponent implements InterfaceC743730TFj, InterfaceC1616070s9l, IPausePanelAbility, InterfaceC1554640qYg {
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(97));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(107));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final List<String> LLJLILLLLZIIL = C1697810uHb.LJIIJJI("homepage_hot", "homepage_friends", "homepage_follow", "others_homepage", "personal_homepage", "story_archive", "collection_video", "chat");
    public boolean LLILLJJLI;
    public boolean LLJ;
    public ViewStub LLJJ;
    public View LLJJI;
    public ARunnableS112S0100000_12 LLJJJJ;
    public final C1594470rav LLJJJJLIIL;
    public final C1594570rb5 LL = new C1594570rb5("PausePanelComponent");
    public int LLILLL = -1;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1557));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 650));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 647));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1562));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 648));
    public final C1594540rb2 LLJI = new C1594540rb2(this);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1558));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 649));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1970));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1971));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1560));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1559));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1561));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(419));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(418));
    public final List<InterfaceC1594460rau> LLJJJIL = new ArrayList();
    public final RunnableC1594530rb1 LLJJJJJIL = new RunnableC1594530rb1(this);

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void A42() {
    }

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void IK2() {
        uo(false);
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -464386115) {
            return null;
        }
        return this;
    }

    public final Aweme LJIIIIZZ() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LLILZ.getValue();
        if (iFeedFragmentAbility == null || (iViewPagerComponentAbilityMb = iFeedFragmentAbility.Mb()) == null) {
            return null;
        }
        return iViewPagerComponentAbilityMb.LLLLLJLJLL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void NN0() {
        mo("story_change");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final boolean VA0() {
        Boolean boolValueOf;
        if (!this.LLILLJJLI) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPausePanelShowing ");
        sbLIZ.append(getEventType());
        sbLIZ.append(' ');
        View viewLo = lo();
        if (viewLo != null) {
            boolValueOf = Boolean.valueOf(viewLo.getVisibility() == 0);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        View viewLo2 = lo();
        return viewLo2 != null && viewLo2.getVisibility() == 0;
    }

    public final String getEventType() {
        return (String) this.LLIZLLLIL.getValue();
    }

    public final boolean ho() {
        return ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
    }

    public final C1594520rb0 ko() {
        return (C1594520rb0) this.LLJJJ.getValue();
    }

    public final View lo() {
        View view = this.LLJJI;
        if (view != null) {
            return view;
        }
        if (!ho()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            View viewFindViewById = c19egLIZ != null ? c19egLIZ.findViewById(R.id.q43) : null;
            this.LLJJI = viewFindViewById;
            if (viewFindViewById != null) {
                this.LLILLJJLI = true;
                so();
                return this.LLJJI;
            }
        }
        if (((Number) C265910AbV.LIZ.getValue()).intValue() != 1) {
            this.LLJJI = oo();
        }
        return this.LLJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[PHI: r0
      0x0034: PHI (r0v1 android.view.ViewStub) = (r0v0 android.view.ViewStub), (r0v20 android.view.ViewStub) binds: [B:3:0x0003, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View oo() {
        /*
            r5 = this;
            android.view.ViewStub r0 = r5.LLJJ
            r2 = 0
            if (r0 != 0) goto L34
            boolean r0 = r5.ho()
            if (r0 == 0) goto L97
            X.0RJN r0 = r5.getPanelContext()
            X.19EG r0 = r0.LIZ()
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r0)
            androidx.fragment.app.Fragment r0 = r0.BQ2()
            if (r0 == 0) goto L95
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L95
            r0 = 2131390017(0x7f0a6e41, float:1.8400593E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
        L2e:
            r5.LLJJ = r0
        L30:
            android.view.ViewStub r0 = r5.LLJJ
            if (r0 == 0) goto Laf
        L34:
            android.view.View r3 = X.C786410Ut5.LJLLLL(r0)
            if (r3 == 0) goto Laf
            r4 = 1
            r5.LLILLJJLI = r4
            boolean r0 = r5.ho()
            if (r0 == 0) goto L8e
            r0 = 2131384007(0x7f0a56c7, float:1.8388404E38)
            r3.setId(r0)
        L49:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r3)
            boolean r0 = X.C07HB.LIZ()
            if (r0 == 0) goto L67
            X.0rav r2 = r5.LLJJJJLIIL
            if (r2 == 0) goto L67
            android.view.View r1 = r5.lo()
            boolean r0 = r1 instanceof X.InterfaceC1594350raj
            if (r0 == 0) goto L67
            X.0raj r1 = (X.InterfaceC1594350raj) r1
            if (r1 == 0) goto L67
            r1.LIZIZ(r2)
        L67:
            r5.bo(r3, r4)
            X.0rb0 r1 = r5.ko()
            X.0rb2 r0 = r5.LLJI
            X.0Qgb r0 = r0.LIZIZ()
            java.util.List r0 = r1.LIZ(r0)
            r5.m345do(r3, r0)
            r1 = 2131368284(0x7f0a195c, float:1.8356514E38)
            X.0rb2 r0 = r5.LLJI
            r3.setTag(r1, r0)
            r1 = 2131368285(0x7f0a195d, float:1.8356516E38)
            java.lang.String r0 = r5.getEventType()
            r3.setTag(r1, r0)
            return r3
        L8e:
            r0 = 2131384006(0x7f0a56c6, float:1.8388402E38)
            r3.setId(r0)
            goto L49
        L95:
            r0 = r2
            goto L2e
        L97:
            X.0RJN r0 = r5.getPanelContext()
            X.19EG r1 = r0.LIZ()
            if (r1 == 0) goto Lad
            r0 = 2131381003(0x7f0a4b0b, float:1.838231E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
        Laa:
            r5.LLJJ = r0
            goto L30
        Lad:
            r0 = r2
            goto Laa
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent.oo():android.view.View");
    }

    public final void vo() {
        User author;
        User author2;
        C1594560rb4 c1594560rb4;
        InterfaceC1594550rb3 interfaceC1594550rb3;
        ViewPropertyAnimator viewPropertyAnimator;
        if (((Boolean) this.LLJILLL.getValue()).booleanValue()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(getEventType())) {
                return;
            }
            if (((Number) C265910AbV.LIZ.getValue()).intValue() == 1 && !this.LLILLJJLI) {
                oo();
            }
            C676750Qgb c676750QgbLIZIZ = this.LLJI.LIZIZ();
            List listLIZ = ko().LIZ(c676750QgbLIZIZ);
            View viewLo = lo();
            if (viewLo != null) {
                m345do(viewLo, listLIZ);
                ArrayList<InterfaceC1594550rb3> arrayList = (ArrayList) listLIZ;
                if (!arrayList.isEmpty()) {
                    IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLILZLL.getValue();
                    if (iAutoAScrollAbility != null) {
                        iAutoAScrollAbility.AU0();
                    }
                    View viewLo2 = lo();
                    String region = null;
                    if (viewLo2 != null) {
                        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 1);
                        C786410Ut5.T4(viewLo2, 0.0f);
                        C786410Ut5.LJLLLLLL(0, viewLo2);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewLo2.animate();
                        Object tag = viewLo2.getTag();
                        if ((tag instanceof ViewPropertyAnimator) && (viewPropertyAnimator = (ViewPropertyAnimator) tag) != null) {
                            viewPropertyAnimator.cancel();
                        }
                        viewLo2.setTag(viewPropertyAnimatorAnimate);
                        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(200L).withEndAction(new ARunnableS72S0200000_3(viewLo2, aRunnableS112S0100000_12, 0)).start();
                    }
                    View view = (View) this.LLJJIII.getValue();
                    if (view != null && view.getVisibility() == 0 && (interfaceC1594550rb3 = (c1594560rb4 = (C1594560rb4) this.LLJJIJIL.getValue()).LIZLLL) != null) {
                        C1594570rb5 c1594570rb5 = c1594560rb4.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("recordDisplay. id:");
                        interfaceC1594550rb3.LIZ();
                        sbLIZ.append("image_search");
                        c1594570rb5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                        Keva keva = (Keva) c1594560rb4.LIZ.getValue();
                        interfaceC1594550rb3.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("frequency_key_");
                        sbLIZ2.append("image_search");
                        sbLIZ2.append("_time");
                        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
                        interfaceC1594550rb3.LIZ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("frequency_key_");
                        sbLIZ3.append("image_search");
                        sbLIZ3.append("_count");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        ((Keva) c1594560rb4.LIZ.getValue()).storeInt(strLIZIZ, ((Keva) c1594560rb4.LIZ.getValue()).getInt(strLIZIZ, 0) + 1);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (InterfaceC1594550rb3 interfaceC1594550rb32 : arrayList) {
                        interfaceC1594550rb32.LIZIZ();
                        Map mapLJFF = interfaceC1594550rb32.LJFF(c676750QgbLIZIZ);
                        if (mapLJFF != null) {
                            linkedHashMap.putAll(mapLJFF);
                        }
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", getEventType());
                    Aweme awemeLJIIIIZZ = LJIIIIZZ();
                    c2344009Gk.LJIIIIZZ("group_id", awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null);
                    Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
                    c2344009Gk.LJIIIIZZ("author_id", (awemeLJIIIIZZ2 == null || (author2 = awemeLJIIIIZZ2.getAuthor()) == null) ? null : author2.getUid());
                    Aweme awemeLJIIIIZZ3 = LJIIIIZZ();
                    if (awemeLJIIIIZZ3 != null && (author = awemeLJIIIIZZ3.getAuthor()) != null) {
                        region = author.getRegion();
                    }
                    c2344009Gk.LJIIIIZZ("author_country", region);
                    c2344009Gk.LJIIIIZZ("function_show", C13LP.LJJLIIIJ(listLIZ, ",", "{", "}", 0, null, new AwS603S0100000_24(listLIZ, (List<? extends InterfaceC1594550rb3>) 2), 24));
                    c2344009Gk.LJII(linkedHashMap);
                    C20684815ws.LJIILLIIL("show_pause_panel_function", c2344009Gk.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
        mo("fragment_stop");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PausePanelComponent() {
        this.LLJJJJLIIL = C07HB.LIZ() ? new C0SUS() { // from class: X.0rav
            @Override // X.C0SUS
            public final void LIZIZ(float f) {
            }

            @Override // X.C0SUS
            public final void LIZ(int i) {
                if (i == 0) {
                    Iterator it2 = ((ArrayList) this.LIZ.LLJJJIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1594460rau) it2.next()).LIZ(true);
                    }
                } else {
                    Iterator it3 = ((ArrayList) this.LIZ.LLJJJIL).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1594460rau) it3.next()).LIZ(false);
                    }
                }
            }
        } : 0;
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
        C622680Oba.LIZLLL(this);
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ == null || !AwemeExtKt.isPhotoMode(awemeLJIIIIZZ)) {
            return;
        }
        mo("fragment_pause");
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
        C622680Oba.LIZJ(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFragmentResume ");
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        sbLIZ.append(awemeLJIIIIZZ != null ? Boolean.valueOf(AwemeExtKt.isPhotoMode(awemeLJIIIIZZ)) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 == null || !AwemeExtKt.isPhotoMode(awemeLJIIIIZZ2)) {
            return;
        }
        View viewLo = lo();
        if (Intrinsics.LJFF(viewLo != null ? viewLo.getTag(R.id.em5) : null, getEventType())) {
            RunnableC1594530rb1 runnableC1594530rb1 = this.LLJJJJJIL;
            runnableC1594530rb1.LL = true;
            C786410Ut5.LJLIIL(300L, C2113808Pw.LIZIZ.LL, runnableC1594530rb1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1594350raj interfaceC1594350raj;
        super.onDestroy();
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJJ;
        if (aRunnableS112S0100000_12 != null) {
            C2113808Pw.LIZIZ.LL.removeCallbacks(aRunnableS112S0100000_12);
        }
        C2113808Pw.LIZIZ.LL.removeCallbacks(this.LLJJJJJIL);
        if (C07HB.LIZ()) {
            C1594470rav c1594470rav = this.LLJJJJLIIL;
            if (c1594470rav != null) {
                KeyEvent.Callback callbackLo = lo();
                if ((callbackLo instanceof InterfaceC1594350raj) && (interfaceC1594350raj = (InterfaceC1594350raj) callbackLo) != null) {
                    interfaceC1594350raj.LIZ(c1594470rav);
                }
            }
            ((ArrayList) this.LLJJJIL).clear();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onParentViewCreated();
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LLILZ.getValue();
        if (iFeedFragmentAbility == null || (iViewPagerComponentAbilityMb = iFeedFragmentAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Bv0(this);
    }

    public final void so() {
        View viewLo = lo();
        if (viewLo != null) {
            viewLo.setTag(R.id.em5, getEventType());
        }
        View viewLo2 = lo();
        if (viewLo2 != null) {
            viewLo2.setTag(R.id.em4, this.LLJI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void NC(boolean z) {
        if (z) {
            mo("clean_mode");
        } else {
            uo(true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void VA(C1594420raq c1594420raq) {
        if (C07HB.LIZ()) {
            ((ArrayList) this.LLJJJIL).add(c1594420raq);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility
    public final void WI1(C1594420raq c1594420raq) {
        if (C07HB.LIZ()) {
            ((ArrayList) this.LLJJJIL).remove(c1594420raq);
        }
    }

    public final void mo(String str) {
        Object tag;
        ViewPropertyAnimator viewPropertyAnimator;
        C1594570rb5 c1594570rb5 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hidePausePanel. type:");
        sbLIZ.append(str);
        c1594570rb5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILLJJLI) {
            return;
        }
        View viewLo = lo();
        if (viewLo != null) {
            tag = viewLo.getTag(R.id.em5);
        } else {
            tag = null;
        }
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (!Intrinsics.LJFF(tag, getEventType())) {
            return;
        }
        ExecutorC2043307zT executorC2043307zT = C2113808Pw.LIZIZ;
        executorC2043307zT.LL.removeCallbacks(this.LLJJJJJIL);
        this.LLJJJJJIL.LL = false;
        View viewLo2 = lo();
        if (viewLo2 != null && viewLo2.getVisibility() == 0) {
            if (Intrinsics.LJFF(str, "video_play")) {
                View viewLo3 = lo();
                if (viewLo3 != null) {
                    fo(viewLo3, 1.0f);
                }
                View viewLo4 = lo();
                if (viewLo4 != null) {
                    HandlerHook.viewPostDelay(viewLo4, new ARunnableS124S0100000_24(this, 84), 200L);
                }
            } else {
                View viewLo5 = lo();
                if (viewLo5 != null && viewLo5.getVisibility() != 8) {
                    Object tag2 = viewLo5.getTag();
                    if ((tag2 instanceof ViewPropertyAnimator) && (viewPropertyAnimator = (ViewPropertyAnimator) tag2) != null) {
                        viewPropertyAnimator.cancel();
                    }
                    viewLo5.setTag(null);
                    C786410Ut5.LJLLLLLL(8, viewLo5);
                }
                IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLILZLL.getValue();
                if (iAutoAScrollAbility != null) {
                    iAutoAScrollAbility.uD2();
                }
            }
            Intrinsics.LJFF(str, "dislike_mode");
        }
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJJ;
        if (aRunnableS112S0100000_12 != null) {
            executorC2043307zT.LL.removeCallbacks(aRunnableS112S0100000_12);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentDialogEvent(C739870T0n c739870T0n) {
        if (c739870T0n.LIZ == 1) {
            mo("comment_show");
        } else {
            uo(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        if (!Intrinsics.LJFF(c1210880hcE.LIZIZ, getEventType())) {
            return;
        }
        mo("delete_aweme");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailVideoCleanModeEvent(C1209360hZm c1209360hZm) {
        Object tag;
        if (!this.LLILLJJLI) {
            return;
        }
        View viewLo = lo();
        Object obj = null;
        if (viewLo != null) {
            tag = viewLo.getTag(R.id.em5);
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj = tag;
        }
        if (Intrinsics.LJFF(obj, getEventType()) && c1209360hZm.LIZ) {
            mo("clean_event");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        Object tag;
        if (!this.LLILLJJLI) {
            return;
        }
        View viewLo = lo();
        Object obj = null;
        if (viewLo != null) {
            tag = viewLo.getTag(R.id.em5);
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj = tag;
        }
        if (!Intrinsics.LJFF(obj, getEventType())) {
            return;
        }
        if (c1372310lob.LIZ) {
            mo("dislike_mode");
        } else {
            uo(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedClearModeEvent(C714060Rzg c714060Rzg) {
        if (!Intrinsics.LJFF(c714060Rzg.LIZLLL, getEventType())) {
            return;
        }
        if (c714060Rzg.LIZ) {
            mo("clear_mode");
        } else {
            this.LLJJJJJIL.LL = true;
            uo(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        mo("refresh");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFriendsTabCleanModeEvent(C1576760r8M c1576760r8M) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsTabCleanModeEvent isShow: ");
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            boolValueOf = Boolean.valueOf(c1576740r8KLIZ.LIZJ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
        if (c1576740r8KLIZ2 != null && c1576740r8KLIZ2.LIZJ) {
            mo("friends_clean");
        } else {
            uo(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFullFeedVideoCleanModeEvent(C1594430rar c1594430rar) {
        Object tag;
        if (!this.LLILLJJLI || !c1594430rar.LIZ) {
            return;
        }
        View viewLo = lo();
        Object obj = null;
        if (viewLo != null) {
            tag = viewLo.getTag(R.id.em5);
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj = tag;
        }
        if (Intrinsics.LJFF(obj, getEventType()) && c1594430rar.LIZ) {
            mo("clean_event");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        if (!this.LLILLJJLI) {
            return;
        }
        mo("page_pause");
        View viewLo = lo();
        if (viewLo != null) {
            viewLo.setTag(R.id.em5, "");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        if (ho() && !this.LLILLJJLI) {
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS112S0100000_12(this, 223));
        } else {
            so();
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        if (i == this.LLILLL) {
            return;
        }
        this.LLILLL = i;
        mo("page_select");
        for (InterfaceC1594550rb3 interfaceC1594550rb3 : new ArrayList(ko().LIZIZ)) {
            this.LLJI.LIZIZ();
            interfaceC1594550rb3.onPageSelected();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlayStatusEvent(C722910SXh c722910SXh) {
        String aid;
        C1594570rb5 c1594570rb5 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayStatusEvent type:");
        sbLIZ.append(c722910SXh.LIZIZ);
        sbLIZ.append(", status:");
        sbLIZ.append(c722910SXh.LIZJ);
        sbLIZ.append(", eventType:");
        sbLIZ.append(getEventType());
        sbLIZ.append(", needResumeWithSeekOnResume:");
        sbLIZ.append(this.LLJ);
        c1594570rb5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(getEventType(), c722910SXh.LIZIZ)) {
            return;
        }
        Aweme aweme = c722910SXh.LIZ;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            aid2 = awemeLJIIIIZZ.getAid();
        }
        if (Intrinsics.LJFF(aid, aid2) && c722910SXh.LIZJ == 1) {
            vo();
        } else {
            mo("video_play");
            this.LLJ = false;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlayerControllerRenderFirstFrameEvent(C1584420rKi c1584420rKi) {
        if (!Intrinsics.LJFF(c1584420rKi.LIZIZ, getEventType())) {
            return;
        }
        mo("render_ready");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshEndEvent(C1581940rGi c1581940rGi) {
        IPlayButtonAbility iPlayButtonAbility;
        if (this.LLILLJJLI && (iPlayButtonAbility = (IPlayButtonAbility) this.LLILZIL.getValue()) != null && iPlayButtonAbility.Ol0()) {
            uo(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSkyLightShownEventEvent(C0T3R c0t3r) {
        Object tag;
        if (!this.LLILLJJLI) {
            return;
        }
        View viewLo = lo();
        Object obj = null;
        if (viewLo != null) {
            tag = viewLo.getTag(R.id.em5);
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            obj = tag;
        }
        if (!Intrinsics.LJFF(obj, getEventType())) {
            return;
        }
        if (c0t3r.LIZ) {
            mo("sky_light");
        } else {
            uo(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uo(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.LLILLJJLI
            if (r0 != 0) goto L5
            return
        L5:
            X.01GW r0 = r4.LLJILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            return
        L14:
            X.01GW<X.0RGG> r0 = X.C0RGG.LJ
            X.0RGG r1 = X.C586380MzE.LIZ()
            java.lang.String r0 = r4.getEventType()
            boolean r0 = r1.LIZJ(r0)
            if (r0 == 0) goto L25
            return
        L25:
            android.view.View r1 = r4.lo()
            r3 = 0
            if (r1 == 0) goto L45
            r0 = 2131368285(0x7f0a195d, float:1.8356516E38)
            java.lang.Object r1 = r1.getTag(r0)
        L33:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3a
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L3a:
            java.lang.String r0 = r4.getEventType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L47
            return
        L45:
            r1 = r3
            goto L33
        L47:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "resumeTopEntranceIfNeeded PauseViewShow: "
            r2.append(r0)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility r0 = (com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility) r0
            if (r0 == 0) goto L99
            boolean r1 = r0.Ol0()
            r0 = 1
            if (r1 != r0) goto L99
        L61:
            r2.append(r0)
            java.lang.String r0 = ", isPaused: "
            r2.append(r0)
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            boolean r0 = r0.isPaused()
            r2.append(r0)
            java.lang.String r0 = ", tag: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " type "
            r2.append(r0)
            java.lang.String r0 = r4.getEventType()
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            if (r5 == 0) goto L9b
            X.07zT r0 = X.C2113808Pw.LIZIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = r0.LL
            X.0rb1 r2 = r4.LLJJJJJIL
            r0 = 300(0x12c, double:1.48E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        L99:
            r0 = 0
            goto L61
        L9b:
            X.0rb1 r0 = r4.LLJJJJJIL
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent.uo(boolean):void");
    }

    public static void fo(View view, float f) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        view.setTag(viewPropertyAnimatorAnimate);
        viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS2S0100001_12(view, f, 2)).start();
    }

    public final void bo(View view, boolean z) {
        View viewFindViewById;
        int iIntValue;
        int iIntValue2;
        Object parent;
        View view2;
        View viewFindViewById2;
        Integer numValueOf = null;
        if (C724240Sb0.LIZ(this) instanceof InterfaceC1603190roz) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (viewFindViewById2 = c19egLIZ.findViewById(R.id.tpm)) != null) {
                parent = viewFindViewById2.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                numValueOf = Integer.valueOf(view2.getBottom());
                if (numValueOf != null && numValueOf.intValue() == 0 && z) {
                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS81S0200000_12(view, this, 69));
                }
            }
        } else {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null && (viewFindViewById = c19egLIZ2.findViewById(R.id.ija)) != null) {
                numValueOf = Integer.valueOf(viewFindViewById.getBottom());
                if (numValueOf != null) {
                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS81S0200000_12(view, this, 69));
                }
            }
        }
        if (C0HCN.LIZ()) {
            int paddingLeft = view.getPaddingLeft();
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue() + LLJL;
            } else {
                iIntValue2 = LLJJL;
            }
            view.setPadding(paddingLeft, iIntValue2, view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        int paddingLeft2 = view.getPaddingLeft();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue() + LLJLIL;
        } else {
            iIntValue = LLJJLIIIJLLLLLLLZ;
        }
        view.setPadding(paddingLeft2, iIntValue, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m345do(android.view.View r27, java.util.List<? extends X.InterfaceC1594550rb3> r28) {
        /*
            Method dump skipped, instruction units count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent.m345do(android.view.View, java.util.List):void");
    }
}
