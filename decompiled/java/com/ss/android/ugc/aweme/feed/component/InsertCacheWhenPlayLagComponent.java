package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C0N9C;
import X.C0NC0;
import X.C0NEO;
import X.C0NER;
import X.C1017070cZd;
import X.C12848051a;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C1566140qrE;
import X.C1697810uHb;
import X.C1E5E;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217371BqR;
import X.C299750Boz;
import X.C299770Bp1;
import X.C301050Br5;
import X.C452501pT;
import X.C582130MsN;
import X.C606500Nqa;
import X.C606940NrI;
import X.C606990NrN;
import X.C607000NrO;
import X.C607020NrQ;
import X.C607030NrR;
import X.C607040NrS;
import X.C607060NrU;
import X.C607070NrV;
import X.C607080NrW;
import X.C628500Oky;
import X.C630740Ooa;
import X.C729510SjV;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.ExecutorC2043307zT;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC606860NrA;
import X.InterfaceC739770T0d;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS78S0200000_9;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent;
import com.ss.android.ugc.aweme.feed.component.ScoreModel;
import com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InsertCacheWhenPlayLagComponent extends BasePanelComponent implements InsertCacheWhenPlayLagAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public boolean LLILLJJLI;
    public C607000NrO LLILZLL;
    public C606990NrN LLIZ;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C630740Ooa LLJJIII;
    public final C01GW LLJJIJI;
    public int LL = -1;
    public String LLILLL = "";
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(111));
    public final Map<String, Pair<Long, Long>> LLILZIL = Collections.synchronizedMap(new LinkedHashMap());
    public C606940NrI LLIZLLLIL = new C606940NrI(0);
    public final ARunnableS109S0100000_9 LLJILJILJ = new ARunnableS109S0100000_9(this, 52);
    public final C607070NrV LLJILLL = new C607070NrV(Keva.getRepo("middle_insert_when_playback_lag"), 0L, "available_ts");

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(InsertCacheWhenPlayLagComponent.class, "availableTS", "getAvailableTS()J", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final void ko() {
        this.LLILZLL = null;
        C2113808Pw.LIZIZ.LL.removeCallbacks(this.LLJILJILJ);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1393804570) {
            return null;
        }
        return this;
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLJJIII.getValue();
    }

    public final void lo() {
        C606990NrN c606990NrN = this.LLIZ;
        if (c606990NrN != null) {
            c606990NrN.LIZJ = false;
            c606990NrN.LIZLLL = 0;
            c606990NrN.LJFF = -1;
            c606990NrN.LJI = false;
        }
        ko();
        this.LLJ = null;
        this.LLJILJIL = false;
    }

    public final DataLayerAbility mo() {
        return (DataLayerAbility) this.LLJJI.getValue();
    }

    public final void uo() {
        C606940NrI c606940NrI = this.LLIZLLLIL;
        long j = c606940NrI.LIZ + 1;
        c606940NrI.getClass();
        this.LLIZLLLIL = new C606940NrI(j, false);
    }

    public InsertCacheWhenPlayLagComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 141), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C607020NrQ(false, this));
        }
        this.LLJJ = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 142), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C607030NrR(false, this));
        }
        this.LLJJI = c01gwLIZIZ2;
        this.LLJJIII = C628500Oky.LIZ(new C607060NrU(this));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 143), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C607040NrS(false, this));
        }
        this.LLJJIJI = c01gwLIZIZ3;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        new C607080NrW(this);
        C582130MsN.LIZ().LJ().getClass();
        C0NEO.LJFF().LIZ(new C0NER() { // from class: X.0NrL
            @Override // X.C0NER
            public final void LLLLZLLIL(String str) {
                try {
                    C1227904rF.LIZ.getClass();
                    ScoreModel scoreModel = (ScoreModel) C1227904rF.LJ().LJII(str, ScoreModel.class);
                    if (scoreModel != null) {
                        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS78S0200000_9(this.LIZ, scoreModel, 6));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJI(e);
                }
            }

            @Override // X.C0NER
            public final void LLLLZLLLI(Long l, String str, Long l2, String str2) {
                C1E5E.LIZ.getClass();
                if (C1E5E.LIZIZ() == 2 && str != null && l != null && l.longValue() > 0 && l2 != null) {
                    InsertCacheWhenPlayLagComponent insertCacheWhenPlayLagComponent = this.LIZ;
                    synchronized (insertCacheWhenPlayLagComponent.LLILZIL) {
                        try {
                            insertCacheWhenPlayLagComponent.LLILZIL.remove(str);
                            insertCacheWhenPlayLagComponent.LLILZIL.put(str, new Pair<>(l2, l));
                            if (insertCacheWhenPlayLagComponent.LLILZIL.size() > 20) {
                                Map<String, Pair<Long, Long>> map = insertCacheWhenPlayLagComponent.LLILZIL;
                                map.remove(C13LP.LJJJJZ(map.keySet()));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1E5E.LIZ.getClass();
        if (C1E5E.LIZIZ() == 2) {
            uo();
            this.LLIZ = null;
            ko();
            this.LLJ = null;
            this.LLJILJIL = false;
        }
        C582130MsN.LIZ().LJ().getClass();
        C0NEO c0neoLJFF = C0NEO.LJFF();
        c0neoLJFF.LJFF.clear();
        if (c0neoLJFF.LIZ) {
            return;
        }
        C1478160oZK.LIZ().LIZIZ(c0neoLJFF.LJ);
        C0NEO.LJIILL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(new InterfaceC1616070s9l() { // from class: X.0NrJ
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

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    List<Aweme> items;
                    boolean z;
                    C606990NrN c606990NrN;
                    Aweme aweme;
                    Video video;
                    float fFloatValue;
                    Float fWo;
                    int iFloatValue;
                    String aid;
                    String aid2;
                    InsertCacheWhenPlayLagComponent insertCacheWhenPlayLagComponent = this.LL;
                    if (i >= insertCacheWhenPlayLagComponent.LL) {
                        insertCacheWhenPlayLagComponent.LL = i;
                        insertCacheWhenPlayLagComponent.LLILLJJLI = false;
                    } else {
                        insertCacheWhenPlayLagComponent.LLILLJJLI = true;
                    }
                    C1E5E.LIZ.getClass();
                    if (C1E5E.LIZIZ() == 2) {
                        insertCacheWhenPlayLagComponent.uo();
                        DataLayerAbility dataLayerAbilityMo = insertCacheWhenPlayLagComponent.mo();
                        if (dataLayerAbilityMo == null || (items = dataLayerAbilityMo.getItems()) == null) {
                            items = C13BV.INSTANCE;
                        }
                        Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(i, items);
                        if (aweme2 != null && AwemeBizExtKt.getCacheSourceType(aweme2) == C0N9C.OFFLINE_MODE.ordinal()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z2 = !z;
                        String aid3 = null;
                        if (insertCacheWhenPlayLagComponent.LLJ != null) {
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (!Intrinsics.LJFF(aid2, insertCacheWhenPlayLagComponent.LLJ)) {
                                insertCacheWhenPlayLagComponent.LLJ = null;
                            }
                        }
                        if (z2) {
                            if (aweme2 != null) {
                                aid = aweme2.getAid();
                            } else {
                                aid = null;
                            }
                            insertCacheWhenPlayLagComponent.yo(aid, true);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[v2] startup stall timer scheduled pos=");
                            sbLIZ.append(i);
                            sbLIZ.append(" aid=");
                            if (aweme2 != null) {
                                aid3 = aweme2.getAid();
                            }
                            sbLIZ.append(aid3);
                            sbLIZ.append(" items.size=");
                            sbLIZ.append(items.size());
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (aweme2 != null && AwemeBizExtKt.getCacheSourceType(aweme2) == C0N9C.OFFLINE_MODE.ordinal() && (c606990NrN = insertCacheWhenPlayLagComponent.LLIZ) != null) {
                            List<Aweme> list = c606990NrN.LIZIZ;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                return;
                            }
                            Iterator<Aweme> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.LJFF(it2.next().getAid(), aweme2.getAid())) {
                                    insertCacheWhenPlayLagComponent.LLJIJIL = c606990NrN.LIZ;
                                    C19719612Di.LJJIIJ(c606990NrN.LIZIZ, new C5183020f(aweme2, 268), true);
                                    if (!c606990NrN.LIZJ) {
                                        return;
                                    }
                                    if (!insertCacheWhenPlayLagComponent.LLILLJJLI) {
                                        C606990NrN c606990NrN2 = insertCacheWhenPlayLagComponent.LLIZ;
                                        if (c606990NrN2 != null && c606990NrN2.LIZJ) {
                                            int effectiveConnectionType = C1BMD.LIZIZ.getEffectiveConnectionType();
                                            C1E5E.LIZ.getClass();
                                            if (effectiveConnectionType >= ((Number) C1E5E.LJIIJJI.getValue()).intValue()) {
                                                c606990NrN2.LJ++;
                                            } else {
                                                c606990NrN2.LJ = 0;
                                            }
                                            if (c606990NrN2.LJ >= ((Number) C1E5E.LJIIJ.getValue()).intValue()) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("stable net recovered inserted=");
                                                sbLIZ2.append(c606990NrN2.LIZLLL + c606990NrN2.LIZIZ.size());
                                                sbLIZ2.append(" streak=");
                                                sbLIZ2.append(c606990NrN2.LJ);
                                                sbLIZ2.append(" type=");
                                                sbLIZ2.append(effectiveConnectionType);
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                                insertCacheWhenPlayLagComponent.lo();
                                            }
                                        }
                                        if (!c606990NrN.LIZJ) {
                                            return;
                                        }
                                        C606990NrN c606990NrN3 = insertCacheWhenPlayLagComponent.LLIZ;
                                        if (c606990NrN3 != null) {
                                            C1E5E.LIZ.getClass();
                                            if (C1E5E.LIZIZ() == 2 && c606990NrN3.LIZJ && (aweme = (Aweme) C13LP.LJJJLZIJ(i + 1, items)) != null && AwemeBizExtKt.getCacheSourceType(aweme) != C0N9C.OFFLINE_MODE.ordinal() && (video = aweme.getVideo()) != null) {
                                                Integer numValueOf = Integer.valueOf(video.getDuration());
                                                if (numValueOf.intValue() > 0) {
                                                    int iIntValue = numValueOf.intValue();
                                                    if (c606990NrN3.LJFF >= 0 && (fWo = insertCacheWhenPlayLagComponent.wo(aweme)) != null && (iFloatValue = ((int) ((((double) fWo.floatValue()) / 100.0d) * ((double) iIntValue))) - c606990NrN3.LJFF) >= ((Number) C1E5E.LJIIIZ.getValue()).intValue()) {
                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                        sbLIZ3.append("preload delta recovered(map) aid=");
                                                        sbLIZ3.append(aweme.getAid());
                                                        sbLIZ3.append(" delta=");
                                                        sbLIZ3.append(iFloatValue);
                                                        C2188811AlT.LIZIZ(sbLIZ3);
                                                        insertCacheWhenPlayLagComponent.lo();
                                                    } else {
                                                        Float fOo = InsertCacheWhenPlayLagComponent.oo(aweme);
                                                        if (fOo != null) {
                                                            fFloatValue = fOo.floatValue();
                                                        } else {
                                                            fFloatValue = 0.0f;
                                                        }
                                                        int i2 = (int) ((((double) fFloatValue) / 100.0d) * ((double) iIntValue));
                                                        int i3 = c606990NrN3.LJFF;
                                                        if (i3 < 0) {
                                                            c606990NrN3.LJFF = i2;
                                                        } else {
                                                            int i4 = i2 - i3;
                                                            c606990NrN3.LJFF = i2;
                                                            if (i4 >= ((Number) C1E5E.LJIIIZ.getValue()).intValue()) {
                                                                aweme.getAid();
                                                                insertCacheWhenPlayLagComponent.lo();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!c606990NrN.LIZJ) {
                                            return;
                                        }
                                    }
                                    c606990NrN.LIZLLL++;
                                    C606990NrN c606990NrN4 = insertCacheWhenPlayLagComponent.LLIZ;
                                    if (c606990NrN4 != null && c606990NrN4.LIZJ) {
                                        C1E5E.LIZ.getClass();
                                        C01GW c01gw = C1E5E.LJI;
                                        if (((Number) c01gw.getValue()).intValue() > 0 && c606990NrN4.LIZLLL >= ((Number) c01gw.getValue()).intValue()) {
                                            insertCacheWhenPlayLagComponent.lo();
                                            return;
                                        }
                                    }
                                    insertCacheWhenPlayLagComponent.ko();
                                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS109S0100000_9(insertCacheWhenPlayLagComponent, 205));
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
        DataLayerAbility dataLayerAbilityMo = mo();
        if (dataLayerAbilityMo != null) {
            dataLayerAbilityMo.kh0(new InterfaceC606860NrA() { // from class: X.0NrP
                @Override // X.InterfaceC606860NrA
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJFF() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fn() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fr(List<? extends Aweme> list) {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZ(List<? extends Aweme> list) {
                    InsertCacheWhenPlayLagComponent insertCacheWhenPlayLagComponent = this.LIZ;
                    insertCacheWhenPlayLagComponent.LL = 0;
                    insertCacheWhenPlayLagComponent.LLILLJJLI = false;
                    insertCacheWhenPlayLagComponent.LLJI = null;
                    insertCacheWhenPlayLagComponent.LLJIJIL = null;
                    C1E5E.LIZ.getClass();
                    if (C1E5E.LIZIZ() == 2) {
                        insertCacheWhenPlayLagComponent.uo();
                        insertCacheWhenPlayLagComponent.ko();
                        insertCacheWhenPlayLagComponent.LLJ = null;
                        insertCacheWhenPlayLagComponent.LLJILJIL = false;
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Float oo(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            android.util.LruCache<java.lang.String, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel> r0 = X.C1483340ohg.LIZ     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideo r2 = X.C1481230oeH.LJI(r0)     // Catch: java.lang.Throwable -> L45
            X.0oZ8 r0 = X.C607330Nrv.LIZ     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.video.config.ISimPlayerConfig r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L45
            X.0odf r0 = X.C1480850odf.LIZJ     // Catch: java.lang.Throwable -> L45
            X.0obu r0 = r0.getPlayerType()     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r1.getVideoPlayAddr(r2, r0)     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = X.C1481230oeH.LJIIJ(r0)     // Catch: java.lang.Throwable -> L45
            long r3 = X.C1483340ohg.LJIILLIIL(r0)     // Catch: java.lang.Throwable -> L45
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
            int r0 = X.C1483340ohg.LJIIIIZZ(r5)     // Catch: java.lang.Throwable -> L45
            if (r0 < 0) goto L3c
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L45
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L45
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L45
            goto L3d
        L3c:
            r0 = -1
        L3d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L45
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L51:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            r1 = 0
            if (r0 == 0) goto L59
            r2 = r1
        L59:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L72
            int r0 = r2.intValue()
            if (r0 < 0) goto L73
            r0 = 1
        L64:
            if (r0 != 0) goto L67
            r2 = r1
        L67:
            if (r2 == 0) goto L72
            int r0 = r2.intValue()
            float r0 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L72:
            return r1
        L73:
            r0 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent.oo(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.Float");
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility
    public final void K1(boolean z) {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        Aweme item;
        C606990NrN c606990NrN;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        List<Aweme> items;
        C607000NrO c607000NrO;
        C1E5E.LIZ.getClass();
        if (C1E5E.LIZIZ() == 2 && (iViewPagerComponentAbilityMb = Mb()) != null) {
            int iLJIL = iViewPagerComponentAbilityMb.LJIL();
            DataLayerAbility dataLayerAbilityMo = mo();
            Boolean boolValueOf = null;
            if (dataLayerAbilityMo != null && (item = dataLayerAbilityMo.getItem(iLJIL)) != null && AwemeBizOptExtKt.getAwemeCacheType(item) == 0) {
                if (z) {
                    if (this.LLILZLL == null) {
                        yo(item.getAid(), false);
                    }
                    C607000NrO c607000NrO2 = this.LLILZLL;
                    if (c607000NrO2 != null) {
                        c607000NrO = new C607000NrO(c607000NrO2.LIZ, c607000NrO2.LIZIZ, c607000NrO2.LIZJ, true);
                    } else {
                        c607000NrO = null;
                    }
                    this.LLILZLL = c607000NrO;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[v2] stall start startup=");
                    C607000NrO c607000NrO3 = this.LLILZLL;
                    if (c607000NrO3 != null) {
                        boolValueOf = Boolean.valueOf(c607000NrO3.LIZJ);
                    }
                    sbLIZ.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                ko();
                uo();
                if (this.LLILLJJLI || (c606990NrN = this.LLIZ) == null || !c606990NrN.LIZJ || c606990NrN.LJI) {
                    return;
                }
                IViewPagerComponentAbility iViewPagerComponentAbilityMb3 = Mb();
                if ((iViewPagerComponentAbilityMb3 != null && iViewPagerComponentAbilityMb3.LLLIIIL() != 0) || (iViewPagerComponentAbilityMb2 = Mb()) == null) {
                    return;
                }
                int iLJIL2 = iViewPagerComponentAbilityMb2.LJIL();
                DataLayerAbility dataLayerAbilityMo2 = mo();
                if (dataLayerAbilityMo2 == null || (items = dataLayerAbilityMo2.getItems()) == null) {
                    items = C13BV.INSTANCE;
                }
                List<Aweme> list = c606990NrN.LIZIZ;
                ArrayList<Aweme> arrayList = new ArrayList();
                for (Aweme aweme : list) {
                    Aweme aweme2 = aweme;
                    Iterator<Aweme> it2 = items.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getAid(), aweme2.getAid())) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i > iLJIL2) {
                        arrayList.add(aweme);
                    }
                }
                for (Aweme aweme3 : arrayList) {
                    C606500Nqa c606500Nqa = new C606500Nqa("middle_insert_when_video_lagging", "feed");
                    DataLayerAbility dataLayerAbilityMo3 = mo();
                    if (dataLayerAbilityMo3 != null) {
                        dataLayerAbilityMo3.wT(aweme3, c606500Nqa);
                    }
                }
                c606990NrN.LIZIZ.removeAll(C13LP.LLIIJI(arrayList));
                this.LLIZ = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bo(X.EnumC607050NrT r17) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent.bo(X.0NrT):void");
    }

    public final boolean vo(Aweme aweme) {
        String aid;
        DataLayerAbility dataLayerAbilityMo;
        List<Aweme> items;
        C1E5E.LIZ.getClass();
        if ((C1E5E.LIZIZ() != 1 && C1E5E.LIZIZ() != 2) || (aid = aweme.getAid()) == null || aid.length() == 0 || (dataLayerAbilityMo = mo()) == null || (items = dataLayerAbilityMo.getItems()) == null || items.isEmpty()) {
            return false;
        }
        Iterator<Aweme> it2 = items.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getAid(), aid)) {
                return true;
            }
        }
        return false;
    }

    public final Float wo(Aweme aweme) {
        Pair<Long, Long> pair = this.LLILZIL.get(aweme.getAid());
        if (pair != null) {
            long jLongValue = pair.getFirst().longValue();
            long jLongValue2 = pair.getSecond().longValue();
            if (jLongValue2 > 0) {
                return Float.valueOf((jLongValue * 100.0f) / jLongValue2);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0397 A[PHI: r11
      0x0397: PHI (r11v24 ??) = (r11v36 ??), (r11v37 ??), (r11v38 ??) binds: [B:142:0x02e6, B:187:0x0393, B:136:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0399 A[PHI: r11
      0x0399: PHI (r11v23 ??) = (r11v13 ??), (r11v15 ??), (r11v24 ??) binds: [B:174:0x0362, B:160:0x032d, B:188:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x039d A[PHI: r11
      0x039d: PHI (r11v16 ??) = (r11v11 ??), (r11v11 ??), (r11v11 ??), (r11v23 ??), (r11v24 ??) binds: [B:176:0x036e, B:178:0x0374, B:186:0x0391, B:190:0x039b, B:188:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x040f A[PHI: r11
      0x040f: PHI (r11v22 ??) = (r11v39 ??), (r11v40 ??), (r11v41 ??) binds: [B:192:0x03a6, B:214:0x0406, B:190:0x039b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0435 A[PHI: r11
      0x0435: PHI (r11v20 ??) = (r11v17 ??), (r11v22 ??) binds: [B:224:0x0434, B:215:0x040f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04aa  */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [X.0NHH] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [X.0NHH] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [X.0NHH] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [X.0NHH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.ss.android.ugc.aweme.feed.ghouse.CacheEntry] */
    /* JADX WARN: Type inference failed for: r11v15, types: [com.ss.android.ugc.aweme.feed.ghouse.CacheEntry] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [com.ss.android.ugc.aweme.feed.ghouse.CacheEntry] */
    /* JADX WARN: Type inference failed for: r11v23, types: [com.ss.android.ugc.aweme.feed.ghouse.CacheEntry] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.feed.ghouse.CacheEntry] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xo(com.ss.android.ugc.aweme.feed.component.ScoreModel r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent.xo(com.ss.android.ugc.aweme.feed.component.ScoreModel):void");
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static boolean m194do(Aweme aweme, Aweme aweme2) {
        if (!aweme.isAd() && !aweme2.isAd() && !AwemeSaaSExtKt.isLive(aweme) && !AwemeSaaSExtKt.isLive(aweme2)) {
            return false;
        }
        return true;
    }

    public static final boolean fo(float f, int i) {
        int i2 = (int) ((((double) f) / 100.0d) * ((double) i));
        C1E5E c1e5e = C1E5E.LIZ;
        c1e5e.getClass();
        if (i2 < ((Number) C1E5E.LJII.getValue()).intValue()) {
            int i3 = (int) f;
            c1e5e.getClass();
            if (i3 < ((Number) C1E5E.LJIIIIZZ.getValue()).intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean ho(Aweme aweme, Aweme aweme2) {
        IECommerceAnchorService iECommerceAnchorService;
        if (m194do(aweme, aweme2) || C1017070cZd.LJJLIIJ(aweme) || C1017070cZd.LJJLIIJ(aweme2) || AwemeExtKt.isPhotoMode(aweme) || AwemeExtKt.isPhotoMode(aweme2) || C0NC0.LIZ(aweme) || C0NC0.LIZ(aweme2) || C729510SjV.LJJIJIL(aweme) || C729510SjV.LJJIJIL(aweme2) || aweme.getCardInsertInfo() != null || aweme2.getCardInsertInfo() != null || ((iECommerceAnchorService = (IECommerceAnchorService) this.LLILZ.getValue()) != null && iECommerceAnchorService.LJJJIL(aweme))) {
            return true;
        }
        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) this.LLILZ.getValue();
        if (iECommerceAnchorService2 != null && iECommerceAnchorService2.LJJJIL(aweme2)) {
            return true;
        }
        return false;
    }

    public final void yo(String str, boolean z) {
        int iIntValue;
        if (z) {
            C1E5E.LIZ.getClass();
            iIntValue = ((Number) C1E5E.LJ.getValue()).intValue();
        } else {
            C1E5E.LIZ.getClass();
            iIntValue = ((Number) C1E5E.LJFF.getValue()).intValue();
        }
        this.LLILZLL = new C607000NrO(str, System.currentTimeMillis(), z, false);
        ExecutorC2043307zT executorC2043307zT = C2113808Pw.LIZIZ;
        executorC2043307zT.LL.removeCallbacks(this.LLJILJILJ);
        C786410Ut5.LJLIIL(iIntValue, executorC2043307zT.LL, this.LLJILJILJ);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Long, java.lang.Object] */
    public final void so(Aweme aweme, int i, boolean z) {
        String requestId;
        boolean z2;
        List<Aweme> items;
        List<Aweme> listSubList;
        String strZc;
        BaseListFragmentPanel baseListFragmentPanelYE;
        InterfaceC739770T0d interfaceC739770T0dP2;
        Aweme item;
        AwemeBizOptExtKt.setAwemeCacheType(aweme, 3);
        DataLayerAbility dataLayerAbilityMo = mo();
        String eventType = null;
        if (dataLayerAbilityMo != null && (item = dataLayerAbilityMo.getItem(i)) != null) {
            requestId = item.getRequestId();
        } else {
            requestId = null;
        }
        aweme.setRequestId(requestId);
        if (C299770Bp1.LIZ() != 1 && C299770Bp1.LIZ() != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            DataLayerAbility dataLayerAbilityMo2 = mo();
            if (dataLayerAbilityMo2 != null) {
                dataLayerAbilityMo2.Gm2(aweme, i, new C606500Nqa("middle_insert_when_video_lagging", "feed"));
            }
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJJ.getValue();
            if (iFeedPanelPlatformAbility != null) {
                iFeedPanelPlatformAbility.tJ2(i, "middle_insert_when_video_lagging", Collections.singletonList(aweme));
            }
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLJJ.getValue();
        if (iFeedPanelPlatformAbility2 != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbility2.P2()) != null) {
            interfaceC739770T0dP2.LJJIL(aweme);
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) (((Number) C301050Br5.LIZJ.getValue()).intValue() * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT));
            C607070NrV c607070NrV = this.LLJILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            ?? ValueOf = Long.valueOf(jCurrentTimeMillis);
            C12848051a.LIZIZ(c607070NrV.LIZ, ValueOf, c607070NrV.LIZIZ);
            c607070NrV.LIZLLL = ValueOf;
        }
        DataLayerAbility dataLayerAbilityMo3 = mo();
        if (dataLayerAbilityMo3 != null && (items = dataLayerAbilityMo3.getItems()) != null) {
            int i2 = i - 1;
            if (items.size() > i && (listSubList = items.subList(i2, items.size())) != null) {
                C1E5E.LIZ.getClass();
                if (C1E5E.LIZIZ() == 2) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (Aweme aweme2 : listSubList) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Aweme aweme3 = aweme2;
                            if (i3 == 0 || AwemeBizExtKt.getCacheSourceType(aweme3) != C0N9C.OFFLINE_MODE.ordinal()) {
                                arrayList.add(aweme2);
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    listSubList = arrayList;
                }
                if (!listSubList.isEmpty()) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = (IFeedPanelPlatformAbility) this.LLJJ.getValue();
                    if (iFeedPanelPlatformAbility3 != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbility3.yE()) != null) {
                        strZc = baseListFragmentPanelYE.Zc();
                    } else {
                        strZc = null;
                    }
                    C2189821An6 c2189821An6 = getPanelContext().LIZJ;
                    if (c2189821An6 != null) {
                        eventType = c2189821An6.getEventType();
                    }
                    C1483340ohg.LJJIIZ(strZc, eventType, listSubList);
                }
            }
        }
    }
}
