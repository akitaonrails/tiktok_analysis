package com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama;

import X.AbstractC1536860q60;
import X.AbstractC738140SxQ;
import X.C005O;
import X.C01GW;
import X.C03H5;
import X.C085L;
import X.C0RJN;
import X.C0SZ8;
import X.C0ZP4;
import X.C109400bE;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1210880hcE;
import X.C1220000hqw;
import X.C1361880lXm;
import X.C1389300mG0;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1536840q5y;
import X.C1548820qPI;
import X.C1566140qrE;
import X.C1597406Ng;
import X.C1611420s2G;
import X.C1611440s2I;
import X.C1611880s30;
import X.C1612210s3X;
import X.C1770850wBP;
import X.C1898607c8;
import X.C189S;
import X.C189U;
import X.C19474211Gy;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C280440Ayw;
import X.C298280Bmc;
import X.C299750Boz;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C627260Oiy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C714060Rzg;
import X.C718180SFc;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737030Svd;
import X.EnumC1616310sA9;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1565950qqv;
import X.InterfaceC1612100s3M;
import X.InterfaceC1616070s9l;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC1611410s2F;
import Y.ARunnableS124S0100000_24;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama.PineDramaInsertLynxCardComponent;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.aweme.service.IPineDramaLynxCardService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class PineDramaInsertLynxCardComponent extends BasePanelComponent implements InterfaceC724530SbT, InterfaceC1616070s9l, InterfaceC1612100s3M {
    public final LinkedHashSet<Aweme> LL = new LinkedHashSet<>();
    public RunnableC1611410s2F LLILLJJLI;
    public final C736950SvV LLILLL;
    public final C01GW LLILZ;
    public final C630740Ooa LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final ARunnableS124S0100000_24 LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
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

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() throws JSONException {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbilityFo = fo();
        if (iViewPagerComponentAbilityFo != null) {
            iViewPagerComponentAbilityFo.Bv0(this);
        }
        C1548820qPI.LJI((C085L) this.LLIZLLLIL.getValue(), "on_drama_card_interact_event");
        C736680Sv4.LJIIIIZZ(this, m312do(), new C2217381BqS() { // from class: X.0s2H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1612210s3X) obj).LLJLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 79), 4);
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.InterfaceC1612100s3M
    public final boolean Za() {
        LinkedHashSet<Aweme> linkedHashSet = this.LL;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator<Aweme> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                if (C1611420s2G.LIZJ(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final SeriesInnerFeedViewModel m312do() {
        return (SeriesInnerFeedViewModel) this.LLILLL.getValue();
    }

    public final IViewPagerComponentAbility fo() {
        return (IViewPagerComponentAbility) this.LLILZIL.getValue();
    }

    public PineDramaInsertLynxCardComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1019);
        this.LLILLL = new C736950SvV(C13LE.LIZ(SeriesInnerFeedViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(321), new AwS568S0100000_24((AbstractC738140SxQ) this, 1022), new C451610HnL(this, true, true), new C723700Sa8(this));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1020), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 15));
        }
        this.LLILZ = c01gwLIZIZ;
        this.LLILZIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1023));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1021), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 16));
        }
        this.LLILZLL = c01gwLIZIZ2;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1018));
        this.LLJ = new ARunnableS124S0100000_24(this, 68);
    }

    @Override // X.InterfaceC1612100s3M
    public final boolean Cl() {
        PaidVideoItem paidVideoItem;
        Aweme aweme;
        C1611880s30 c1611880s30 = (C1611880s30) C13LP.LJJLIIIJL(bo());
        return (c1611880s30 == null || (paidVideoItem = c1611880s30.LL) == null || (aweme = paidVideoItem.aweme) == null || !C1611420s2G.LIZLLL(aweme)) ? false : true;
    }

    @Override // X.InterfaceC1612100s3M
    public final Aweme Lm() {
        C1611880s30 c1611880s30Previous;
        PaidVideoItem paidVideoItem;
        List<C1611880s30> listBo = bo();
        ListIterator<C1611880s30> listIterator = listBo.listIterator(listBo.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c1611880s30Previous = null;
                break;
            }
            c1611880s30Previous = listIterator.previous();
            if (C1611420s2G.LIZJ(c1611880s30Previous.LL.aweme)) {
                break;
            }
        }
        C1611880s30 c1611880s30 = c1611880s30Previous;
        if (c1611880s30 == null || (paidVideoItem = c1611880s30.LL) == null) {
            return null;
        }
        return paidVideoItem.aweme;
    }

    @Override // X.InterfaceC1612100s3M
    public final boolean Xf() {
        List<C1611880s30> listBo = bo();
        if (!(listBo instanceof Collection) || !listBo.isEmpty()) {
            Iterator<C1611880s30> it2 = listBo.iterator();
            while (it2.hasNext()) {
                if (C1611420s2G.LIZJ(it2.next().LL.aweme)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C1611880s30> bo() {
        C1612210s3X c1612210s3X = (C1612210s3X) m312do().getState();
        c1612210s3X.getClass();
        List<C1611880s30> listLIZ = C627260Oiy.LIZ(c1612210s3X);
        return listLIZ == null ? C13BV.INSTANCE : listLIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbilityFo;
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbilityFo2 = fo();
        if (iViewPagerComponentAbilityFo2 != null) {
            iViewPagerComponentAbilityFo2.removeCallbacks(this.LLJ);
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityFo3 = fo();
        if (iViewPagerComponentAbilityFo3 != null) {
            iViewPagerComponentAbilityFo3.Xl0(this);
        }
        C1548820qPI.LJIIIZ((C085L) this.LLIZLLLIL.getValue(), "on_drama_card_interact_event");
        RunnableC1611410s2F runnableC1611410s2F = this.LLILLJJLI;
        if (runnableC1611410s2F == null || (iViewPagerComponentAbilityFo = fo()) == null) {
            return;
        }
        iViewPagerComponentAbilityFo.removeCallbacks(runnableC1611410s2F);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        IPineDramaLynxCardService.LIZ.getClass();
        C1611440s2I.LIZ().LIZLLL();
        m312do().LLJZIJLIL = this;
        if (((Boolean) C298280Bmc.LIZLLL.getValue()).booleanValue()) {
            if (C1611440s2I.LIZ().LIZJ() || C1611440s2I.LIZ().LIZIZ()) {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=tiktok_drama_inner_feed");
                C1536840q5y.LIZLLL(sparkContext, new AbstractC1536860q60() { // from class: X.0s2K
                    @Override // X.AbstractC1536860q60
                    public final void LJ(String str) {
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                        boolean z;
                        boolean z2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[onParentSet] preload success, hasTemplate=");
                        boolean z3 = true;
                        if (bArr != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sbLIZ.append(z);
                        sbLIZ.append(", response=");
                        if (c1533790q13 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sbLIZ.append(z2);
                        sbLIZ.append(", responseX=");
                        if (c1532310pyf == null) {
                            z3 = false;
                        }
                        sbLIZ.append(z3);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }, null, true, 52);
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        EventBus.LIZLLL().LJJI(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // X.InterfaceC1612100s3M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest xi() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama.PineDramaInsertLynxCardComponent.xi():com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest");
    }

    public final void ho(String str) {
        Object aid;
        PaidVideoItem paidVideoItem;
        Aweme aweme;
        C280440Ayw.LIZ.getClass();
        if ((((Number) C280440Ayw.LIZIZ.getValue()).intValue() & 1) == 1) {
            m312do().IQ2(str, true);
            return;
        }
        Iterator<C1611880s30> it2 = bo().iterator();
        while (true) {
            aid = null;
            if (!it2.hasNext()) {
                break;
            }
            C1611880s30 next = it2.next();
            Aweme aweme2 = next.LL.aweme;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            if (Intrinsics.LJFF(str, aid)) {
                aid = next;
                break;
            }
        }
        C1611880s30 c1611880s30 = (C1611880s30) aid;
        if (c1611880s30 == null || (paidVideoItem = c1611880s30.LL) == null || (aweme = paidVideoItem.aweme) == null) {
            return;
        }
        C1440005kM.LIZ(new C1210880hcE(C1389300mG0.LIZ(getPanelContext()), "FUNCTION_FROM_NOT_INTERESTED", "not_interested", aweme));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDramaLynxCardLoadFailedEvent(C1361880lXm c1361880lXm) {
        String aid;
        String aid2;
        Aweme awemeLJIIIIZZ;
        Aweme aweme = c1361880lXm.LIZ;
        String aid3 = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        List<C1611880s30> listBo = bo();
        if ((listBo instanceof Collection) && listBo.isEmpty()) {
            return;
        }
        Iterator<C1611880s30> it2 = listBo.iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = it2.next().LL.aweme;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                IViewPagerComponentAbility iViewPagerComponentAbilityFo = fo();
                if (iViewPagerComponentAbilityFo != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbilityFo.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                Aweme aweme3 = c1361880lXm.LIZ;
                String str = c1361880lXm.LIZIZ;
                int i = c1361880lXm.LIZJ;
                String str2 = c1361880lXm.LIZLLL;
                if (awemeLJIIIIZZ != null) {
                    aid3 = awemeLJIIIIZZ.getAid();
                }
                ko(i, aweme3, str, str2, Intrinsics.LJFF(aid3, aid));
                return;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedClearModeEvent(C714060Rzg c714060Rzg) {
        String str;
        String eventType = null;
        if (c714060Rzg != null) {
            str = c714060Rzg.LIZLLL;
        } else {
            str = null;
        }
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        }
        if (Intrinsics.LJFF(str, eventType)) {
            boolean z = false;
            if (c714060Rzg != null && c714060Rzg.LIZ) {
                z = true;
            }
            this.LLJI = z;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        Aweme awemeLJIIIIZZ;
        String aid;
        C0RJN panelContext;
        boolean z;
        C1898607c8 c1898607c8;
        String str;
        int i2;
        IViewPagerComponentAbility iViewPagerComponentAbilityFo = fo();
        String eventType = null;
        if (iViewPagerComponentAbilityFo != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbilityFo.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPageSelected] position=");
        sbLIZ.append(i);
        sbLIZ.append(" aweme=");
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (awemeLJIIIIZZ != null && ((C1611420s2G.LIZJ(awemeLJIIIIZZ) || C1611420s2G.LJ(awemeLJIIIIZZ) || C1611420s2G.LIZLLL(awemeLJIIIIZZ)) && (((Boolean) C298280Bmc.LIZIZ.getValue()).booleanValue() || ((C005O) C298280Bmc.LIZJ.getValue()).LIZ))) {
            C189U c189u = C189U.LIZ;
            String aid2 = awemeLJIIIIZZ.getAid();
            c189u.getClass();
            C189S c189sLIZIZ = C189U.LIZIZ(aid2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[consumeCardShown] check load failed, aid=");
            sbLIZ2.append(awemeLJIIIIZZ.getAid());
            sbLIZ2.append(", container=");
            if (c189sLIZIZ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            sbLIZ2.append(", loadErrorInfo=");
            if (c189sLIZIZ != null) {
                c1898607c8 = c189sLIZIZ.LJ;
            } else {
                c1898607c8 = null;
            }
            sbLIZ2.append(c1898607c8);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (c189sLIZIZ != null && c189sLIZIZ.LJ != null) {
                C1898607c8 c1898607c82 = c189sLIZIZ.LJ;
                if (c1898607c82 == null || (str = c1898607c82.LIZ) == null) {
                    str = "load_failed";
                }
                if (c1898607c82 != null) {
                    i2 = c1898607c82.LIZIZ;
                    eventType = c1898607c82.LIZJ;
                } else {
                    i2 = -1;
                }
                ko(i2, awemeLJIIIIZZ, str, eventType, true);
                return;
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityFo2 = fo();
        if (iViewPagerComponentAbilityFo2 != null) {
            iViewPagerComponentAbilityFo2.removeCallbacks(this.LLJ);
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityFo3 = fo();
        if (iViewPagerComponentAbilityFo3 != null) {
            iViewPagerComponentAbilityFo3.post(this.LLJ);
        }
        if (awemeLJIIIIZZ != null && (panelContext = getPanelContext()) != null) {
            boolean zLIZIZ = C1611420s2G.LIZIZ(awemeLJIIIIZZ);
            if (this.LLJI && zLIZIZ) {
                C737030Svd c737030Svd = new C737030Svd(83, new C1597406Ng(false, null));
                c737030Svd.LJIILLIIL = System.identityHashCode(panelContext.LIZ());
                C2189821An6 c2189821An6 = panelContext.LIZJ;
                if (c2189821An6 != null) {
                    eventType = c2189821An6.getEventType();
                }
                c737030Svd.LJ = eventType;
                C1440005kM.LIZ(c737030Svd);
                this.LLIZ = true;
                return;
            }
            if (!this.LLIZ || zLIZIZ) {
                return;
            }
            this.LLIZ = false;
            int type = EnumC1616310sA9.OTHER_SWIPE.getType();
            C2189821An6 c2189821An62 = panelContext.LIZJ;
            if (c2189821An62 != null) {
                eventType = c2189821An62.getEventType();
            }
            C1440005kM.LIZ(new C714060Rzg(true, type, "other_swiper", eventType));
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0s2F, java.lang.Runnable] */
    public final void ko(final int i, Aweme aweme, String str, final String str2, final boolean z) {
        String pineDramaCardType;
        String str3;
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        final String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (aid == null) {
            aid = "";
        }
        try {
            if (!((Boolean) C298280Bmc.LIZIZ.getValue()).booleanValue() && !((C005O) C298280Bmc.LIZJ.getValue()).LIZ) {
                return;
            }
            if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) == null || (pineDramaCardType = paidContentMiniDramaInfoLIZ.getPineDramaCardType()) == null) {
                pineDramaCardType = "";
            }
            if (aweme == null || (lynxCardStruct = aweme.getLynxCardStruct()) == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str3 = dynamicPatch.schema) == null) {
                str3 = "";
            }
            C109400bE.LIZ.getClass();
            final String str4 = pineDramaCardType;
            final String str5 = str3;
            C109400bE.LIZ(str, str4, str5, i, str2, null);
            ?? r3 = new Runnable() { // from class: X.0s2F
                public final void LIZ() {
                    PaidContentVideoPanel paidContentVideoPanel;
                    PineDramaInsertLynxCardComponent pineDramaInsertLynxCardComponent = this.LL;
                    String str6 = aid;
                    boolean z2 = z;
                    String str7 = str4;
                    String str8 = str5;
                    int i2 = i;
                    String str9 = str2;
                    try {
                        pineDramaInsertLynxCardComponent.m312do().IQ2(str6, true);
                        if (z2) {
                            IPaidContentPanelAbility iPaidContentPanelAbility = (IPaidContentPanelAbility) pineDramaInsertLynxCardComponent.LLILZLL.getValue();
                            if ((iPaidContentPanelAbility instanceof PaidContentVideoPanel) && (paidContentVideoPanel = (PaidContentVideoPanel) iPaidContentPanelAbility) != null) {
                                paidContentVideoPanel.LLJJJJLIIL();
                            }
                        }
                        C109400bE c109400bE = C109400bE.LIZ;
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        c109400bE.getClass();
                        C109400bE.LIZ("delete", str7, str8, i2, str9, boolValueOf);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PineDramaInsertLynxCardComponent@b95a.handleResourceLoadErrorDelete$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PineDramaInsertLynxCardComponent@b95a.handleResourceLoadErrorDelete$1");
                }
            };
            try {
                this.LLILLJJLI = r3;
                IViewPagerComponentAbility iViewPagerComponentAbilityFo = fo();
                if (iViewPagerComponentAbilityFo != 0) {
                    iViewPagerComponentAbilityFo.postDelayed(r3, 50L);
                    return;
                }
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        TryCatchGuardChecker.doCheck(e);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
