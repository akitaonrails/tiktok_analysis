package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C09R3;
import X.C0H62;
import X.C0H9H;
import X.C0HHT;
import X.C0N7G;
import X.C0PFS;
import X.C0Q45;
import X.C0QSJ;
import X.C0R45;
import X.C0XQ7;
import X.C13LE;
import X.C1524805y2;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1699360uK6;
import X.C189200o6;
import X.C19719612Di;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C21565319aV;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C486180J4u;
import X.C650240Pew;
import X.C650630PfZ;
import X.C653660PkS;
import X.C654550Plt;
import X.C656910Pph;
import X.C657140Pq4;
import X.C657320PqM;
import X.C657710Pqz;
import X.C658480PsE;
import X.C658530PsJ;
import X.C663070Pzd;
import X.C663180Pzo;
import X.C664410Q4h;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC665990QAj;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC583720Muw;
import X.InterfaceC658500PsG;
import X.InterfaceC658510PsH;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AAListenerS321S0100000_10;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardLivePlayerAssem extends ReusedUISlotAssem<SearchCardLivePlayerAssem> implements SearchComponentCenter$Player$PlayerControlAbility, InterfaceC712990Rxx<InterfaceC435460H5s>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public RadiusLayout LLJLLL;
    public Aweme LLJZ;
    public boolean LLL;
    public boolean LLLF;
    public volatile InterfaceC658500PsG LLLII;
    public InterfaceC665370Q7z LLLIIII;
    public C0QSJ LLLIIIIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C656910Pph.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 212));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 211));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 208));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(143));
    public final C657140Pq4<Aweme> LLJZIJLIL = new C657140Pq4<>();
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 209));
    public final List<InterfaceC658510PsH> LLLFFI = new ArrayList();
    public final C0N7G LLLFZ = new C0H62() { // from class: X.0N7G
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (C0N7F.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 210));
            }
        }
    };
    public boolean LLLI = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchCardLivePlayerAssem.class, "soundIconAbility", "getSoundIconAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/components/soundcontrol/communication/SoundIconAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchCardLivePlayerAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        c09r3.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0N7G] */
    public SearchCardLivePlayerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1456), null, AFwS241S0000000_10.get$arr$(139));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eun;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchComponentCenter$Player$PlayerControlAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        ((ArrayList) this.LLLFFI).clear();
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC658500PsG Ap() {
        /*
            r4 = this;
            X.0PsG r0 = r4.LLLII
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0PsG r0 = r4.LLLII     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLIIIIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLIIII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope> r1 = com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIIIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0PsG> r0 = X.InterfaceC658500PsG.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0PsG r0 = (X.InterfaceC658500PsG) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLII = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem.Ap():X.0PsG");
    }

    public final C656910Pph sp() {
        return (C656910Pph) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final SmartImageView tp() {
        return (SmartImageView) this.LLJLL.getValue();
    }

    public final TuxSpinner up() {
        return (TuxSpinner) this.LLLFF.getValue();
    }

    public final ArrayList<InterfaceC583720Muw> yp() {
        return (ArrayList) this.LLJLLIL.getValue();
    }

    public final C658530PsJ zp() {
        return (C658530PsJ) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        try {
            super.Co();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0Q45 c0q45 = C0Q45.COMMON;
            EnumC665990QAj enumC665990QAj = EnumC665990QAj.CONTAINER;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("parent", getParent().getClass().getSimpleName());
            C664410Q4h.LIZIZ(c0q45, enumC665990QAj, e, "SearchCardLivePlayerAssem", linkedHashMap, C2097608Jq.LJ(), "search");
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final View LLLLLLLZIL() {
        return zp();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isMute() {
        return zp().getLiveCore().getMute();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isPlaying() {
        return zp().getLiveCore().isPlaying();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        zp().getLiveCore().LJI();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void Im2(InterfaceC583720Muw interfaceC583720Muw) {
        yp().add(interfaceC583720Muw);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void LJIILJJIL(boolean z) {
        zp().getLiveCore().setMute(z);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void VV1(C657320PqM c657320PqM) {
        C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this, c657320PqM, 60));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Function0<? extends Map<String, String>> function0;
        Float f;
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, this, SearchComponentCenter$Player$PlayerControlAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbilityDefaultImpl() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem$initCommonAbilities$1
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean N1() {
                    return !this.LLILLJJLI.LLL && C0XQ7.LJFF().isLogin();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View getDetectView() {
                    return this.LLILLJJLI.zp();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean isPlaying() {
                    return this.LLILLJJLI.zp().getLiveCore().isPlaying();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void J0() {
                    TuxSpinner tuxSpinnerUp;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    super.J0();
                    Iterator<InterfaceC658510PsH> it2 = this.LLILLJJLI.LLLFFI.iterator();
                    while (it2.hasNext()) {
                        it2.next().J0();
                    }
                    this.LLILLJJLI.zp().getLiveCore().LLLLLIL();
                    SearchCardLivePlayerAssem searchCardLivePlayerAssem = this.LLILLJJLI;
                    if (searchCardLivePlayerAssem.LLLF || (tuxSpinnerUp = searchCardLivePlayerAssem.up()) == null || (viewPropertyAnimatorAnimate = tuxSpinnerUp.animate()) == null) {
                        return;
                    }
                    SearchCardLivePlayerAssem searchCardLivePlayerAssem2 = this.LLILLJJLI;
                    viewPropertyAnimatorAnimate.setDuration(searchCardLivePlayerAssem2.sp() != null ? r0.LLILZ : 0);
                    viewPropertyAnimatorAnimate.setListener(new AAListenerS321S0100000_10(searchCardLivePlayerAssem2, 0));
                    viewPropertyAnimatorAnimate.start();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LLZZZZ() {
                    super.LLZZZZ();
                    Iterator<InterfaceC658510PsH> it2 = this.LLILLJJLI.LLLFFI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LLZZZZ();
                    }
                    this.LLILLJJLI.zp().getLiveCore().LJI();
                    TuxSpinner tuxSpinnerUp = this.LLILLJJLI.up();
                    if (tuxSpinnerUp != null) {
                        tuxSpinnerUp.clearAnimation();
                    }
                    TuxSpinner tuxSpinnerUp2 = this.LLILLJJLI.up();
                    if (tuxSpinnerUp2 != null) {
                        C786410Ut5.LLZILL(tuxSpinnerUp2, 8);
                    }
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Mu(C650630PfZ c650630PfZ) {
                    C19719612Di.LJJIIJ(this.LLILLJJLI.yp(), new AwS589S0100000_10(c650630PfZ, 391), true);
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void wp(C650630PfZ c650630PfZ) {
                    this.LLILLJJLI.yp().add(new C657710Pqz(c650630PfZ));
                }
            }, SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        view.addOnAttachStateChangeListener(new C0R45(this, 2));
        if (!C650240Pew.LIZ()) {
            this.LLJLLL = (RadiusLayout) getContentView().findViewById(R.id.ubt);
            C656910Pph c656910PphSp = sp();
            if (c656910PphSp != null && (f = c656910PphSp.LLILZIL) != null) {
                float fFloatValue = f.floatValue();
                C21565319aV.LIZIZ((View) this.LLJLIL.getValue(), Float.valueOf(fFloatValue), null, null, null, null, 30);
                zp().setOutCorner(true);
                C21565319aV.LIZIZ(tp(), Float.valueOf(fFloatValue), null, null, null, null, 30);
                RadiusLayout radiusLayout = this.LLJLLL;
                if (radiusLayout != null) {
                    C21565319aV.LIZIZ(radiusLayout, Float.valueOf(fFloatValue), null, null, null, null, 30);
                }
                C21565319aV.LIZIZ(zp(), Float.valueOf(fFloatValue), null, null, null, null, 30);
            } else {
                C21565319aV.LIZ(this.LLJLLL, null, null, null, Float.valueOf(C418440Gaw.LIZIZ(4)), Float.valueOf(C418440Gaw.LIZIZ(4)));
            }
        }
        tp().getHierarchy().LJIILIIL(2).LJIJ(new PointF(0.5f, 0.0f));
        zp().setMCoverView(tp());
        zp().getLiveCore().LIZ(new AwS554S0100000_10(this, 943));
        C658480PsE dataProvider = zp().getDataProvider();
        C656910Pph c656910PphSp2 = sp();
        if (c656910PphSp2 != null) {
            function0 = c656910PphSp2.LLILLL;
        } else {
            function0 = null;
        }
        dataProvider.LJIIL = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[PHI: r11
      0x003f: PHI (r11v2 int) = (r11v0 int), (r11v3 int) binds: [B:24:0x0059, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(com.ss.android.ugc.aweme.feed.model.Aweme r19) {
        /*
            r18 = this;
            r12 = r19
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt.isLive(r12)
            r1 = 0
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.roomCover
        L11:
            com.ss.android.ugc.aweme.base.ImageUrlModel r5 = X.C438710HIf.LIZ(r1)
        L15:
            boolean r0 = X.C0C1B.LIZ()
            r3 = r18
            if (r0 == 0) goto L5c
            X.0Q7z r0 = X.C1558520qew.LJIIL(r3)
            X.0PkS r1 = X.C0PFS.LIZ(r0)
            com.bytedance.lighten.loader.SmartImageView r6 = r3.tp()
            if (r1 == 0) goto L58
            java.lang.String r0 = r1.LJIJ
            if (r0 == 0) goto L58
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L58
            java.lang.String r0 = r1.LJIJ
            int r11 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L3b:
            java.lang.String r10 = r1.LJIIJ
            if (r10 != 0) goto L41
        L3f:
            java.lang.String r10 = ""
        L41:
            r4 = 0
            r8 = 0
            r2 = 0
            r17 = 32313(0x7e39, float:4.528E-41)
            r7 = r4
            r9 = r8
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            X.C657910PrJ.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L50:
            com.bytedance.lighten.loader.SmartImageView r0 = r3.tp()
            X.C786410Ut5.LLFF(r2, r0)
            return
        L58:
            r11 = 0
            if (r1 == 0) goto L3f
            goto L3b
        L5c:
            r2 = 0
            X.0kl3 r1 = X.C1331660kl2.LJIIIIZZ(r5)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.tp()
            r1.LJJ(r0)
            X.0Pq3 r0 = new X.0Pq3
            r0.<init>()
            r1.LJJJIL = r0
            X.C786410Ut5.h3(r1)
            goto L50
        L73:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r12.getVideo()
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getCover()
        L7d:
            com.ss.android.ugc.aweme.base.ImageUrlModel r5 = X.C438710HIf.LIZ(r1)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem.op(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void qq1(C657320PqM c657320PqM) {
        C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this, c657320PqM, 58));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        Long lValueOf;
        C656910Pph c656910PphSp;
        Function0<Unit> function0;
        String str;
        String str2;
        Function1<? super C653660PkS, Unit> function1;
        InterfaceC435460H5s interfaceC435460H5s2 = interfaceC435460H5s;
        C657140Pq4<Aweme> c657140Pq4 = this.LLJZIJLIL;
        Aweme aweme = interfaceC435460H5s2.getAweme();
        if (!c657140Pq4.LIZ.isCompleted()) {
            c657140Pq4.LIZ.LJJLIIIJILLIZJL(aweme);
        }
        TuxSpinner tuxSpinnerUp = up();
        if (tuxSpinnerUp != null) {
            ViewGroup.LayoutParams layoutParams = tuxSpinnerUp.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (int) C0H9H.LIZ(5);
                C786410Ut5.W5(tuxSpinnerUp, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.LLLF = false;
        this.LLJZ = interfaceC435460H5s2.getAweme();
        op(interfaceC435460H5s2.getAweme());
        Aweme aweme2 = interfaceC435460H5s2.getAweme();
        C653660PkS c653660PkSLIZ = C0PFS.LIZ(C1558520qew.LJIIL(this));
        if (c653660PkSLIZ == null) {
            c653660PkSLIZ = new C653660PkS();
        }
        C653660PkS c653660PkS = new C653660PkS();
        c653660PkS.LJIIIIZZ = c653660PkSLIZ.LJIIIIZZ;
        c653660PkS.LJIIIZ = c653660PkSLIZ.LJIIIZ;
        c653660PkS.LJIIJJI = c653660PkSLIZ.LJIIJJI;
        c653660PkS.LJIIJ = c653660PkSLIZ.LJIIJ;
        c653660PkS.LJFF = c653660PkSLIZ.LJFF;
        c653660PkS.LIZLLL = c653660PkSLIZ.LIZLLL;
        User author = aweme2.getAuthor();
        if (author != null) {
            lValueOf = Long.valueOf(C486180J4u.LIZ(author));
        } else {
            lValueOf = null;
        }
        c653660PkS.LJIJI = String.valueOf(lValueOf);
        c653660PkS.LJIIIZ = "live_cover";
        C656910Pph c656910PphSp2 = sp();
        if (c656910PphSp2 != null && (function1 = c656910PphSp2.LLILZLL) != null) {
            function1.invoke(c653660PkS);
        }
        this.LLL = false;
        zp().LIZJ(aweme2, c653660PkS);
        zp().getLiveCore().LJIILIIL();
        C654550Plt c654550Plt = (C654550Plt) this.LLJL.getValue();
        if ((c654550Plt != null && c654550Plt.LLJJ) || ((c656910PphSp = sp()) != null && c656910PphSp.LLIZLLLIL)) {
            C656910Pph c656910PphSp3 = sp();
            if (c656910PphSp3 != null && c656910PphSp3.LLIZLLLIL) {
                str = "mt_live_single_card";
            } else {
                str = "live_cell";
            }
            if (aweme2.getIsLiveHasProduct()) {
                str2 = "ecom";
            } else {
                str2 = "";
            }
            zp().getLiveCore().setLivePlayerEntranceParam(new C1699360uK6("general_search", str, "", str2, false, true, 8));
        }
        C656910Pph c656910PphSp4 = sp();
        if (c656910PphSp4 != null && c656910PphSp4.LLIZ) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            C658530PsJ c658530PsJZp = zp();
            Aweme aweme3 = interfaceC435460H5s2.getAweme();
            C663070Pzd liveCore = zp().getLiveCore();
            AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, interfaceC435460H5s2, 59);
            c663180Pzo.getClass();
            C663180Pzo.LJFF(c658530PsJZp, aweme3, liveCore, awS411S0200000_10);
        }
        if (this.LLLI) {
            this.LLLI = false;
            C656910Pph c656910PphSp5 = sp();
            if (c656910PphSp5 != null && (function0 = c656910PphSp5.LL) != null) {
                function0.invoke();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void yA2(InterfaceC583720Muw interfaceC583720Muw) {
        yp().remove(interfaceC583720Muw);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
