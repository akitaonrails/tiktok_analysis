package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C098200Yq;
import X.C09R3;
import X.C1173220gdU;
import X.C1175590ghJ;
import X.C1175980ghw;
import X.C1176430gif;
import X.C1189060h32;
import X.C1208670hYf;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C189200o6;
import X.C19659111vp;
import X.C19719912Dl;
import X.C20584615gi;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C614900O9w;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ACListenerS153S0100000_18;
import Y.AObserverS222S0100000_18;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS29S0101000_18;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.mapdetail.cell.PoiMapDetailHorizontalSkeletonCell;
import com.ss.android.ugc.aweme.poi.mapdetail.horizontal.PoiMapDetailHorizontalCardCell;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiCardAiSummary;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailCommonHorizontalCardAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIJI;
    public boolean LLJJIJIIJIL;
    public List<PoiGeneralCard> LLJJIJIL;
    public TuxIconView LLJJJ;
    public ViewGroup LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;

    public interface PoiMapDetailHorizontalCardAbility extends InterfaceC494301wD {
        void eM2(String str, boolean z);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailCommonHorizontalCardAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailCommonHorizontalCardAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapDetailCommonHorizontalCardAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1385), AFwS256S0000000_18.get$arr$(467), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1386), AFwS256S0000000_18.get$arr$(468), null, true);
        this.LLJJJJJIL = -1;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e4j;
    }

    public final PoiMapDetailFilterVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PoiMapDetailFilterVM) assemVMLazy.getValue();
    }

    public final PoiMapDetailPageVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            Unit unit = null;
            if (eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJJI(this);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDestroy();
    }

    public final void kp(C1176430gif c1176430gif) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        List<PoiGeneralCard> list = this.LLJJIJIL;
        if (list != null) {
            int i = 0;
            for (PoiGeneralCard poiGeneralCard : list) {
                int i2 = i + 1;
                String str = null;
                if (i >= 0) {
                    PoiGeneralCard poiGeneralCard2 = poiGeneralCard;
                    if (c1176430gif != null) {
                        str = c1176430gif.LIZ;
                    }
                    if (C123100dR.LIZ(str) && Intrinsics.LJFF(poiGeneralCard2.getPoiId(), c1176430gif.LIZ) && (this.LLJJJJJIL == -1 || (viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI) == null || i != viewOnAttachStateChangeListenerC20631115oD.getCurrentItem())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("card_view observe target poi id: ");
                        sbLIZ.append(c1176430gif.LIZ);
                        sbLIZ.append(" index: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", selectedPage: ");
                        sbLIZ.append(this.LLJJJJJIL);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LLJJIJIIJIL = true;
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIJI;
                        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD2, new ARunnableS29S0101000_18(i, this, 8));
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void lp(List<PoiGeneralCard> list) {
        String str;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJIJIL = list;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator<PoiGeneralCard> it2 = list.iterator();
                while (it2.hasNext()) {
                    PoiCardAiSummary aiSummary = it2.next().getAiSummary();
                    if (aiSummary != null) {
                        str = aiSummary.recommendationText;
                    } else {
                        str = null;
                    }
                    if (C123100dR.LIZ(str)) {
                        break;
                    }
                }
                z = false;
            }
            List<C1175980ghw> listLIZ = C1175590ghJ.LIZ(list, z, ip(), hp(), C1558520qew.LJIIL(this));
            if (listLIZ != null) {
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIJI;
                if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                    state.LJIILL(listLIZ, null);
                }
                if (this.LLJJJJ && (viewOnAttachStateChangeListenerC20631115oD = this.LLJJIJI) != null) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS118S0100000_18(this, 41));
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        List<PoiGeneralCard> listPoiList;
        if (!c614900O9w.LJI && C123100dR.LIZ(c614900O9w.LIZIZ)) {
            int i = 0;
            PoiMapDetailResponse poiMapDetailResponseYQ2 = ip().yQ2(c614900O9w, false);
            if (poiMapDetailResponseYQ2 != null && (listPoiList = poiMapDetailResponseYQ2.poiList()) != null) {
                for (PoiGeneralCard poiGeneralCard : listPoiList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PoiGeneralCard poiGeneralCard2 = poiGeneralCard;
                        if (Intrinsics.LJFF(poiGeneralCard2.getPoiId(), c614900O9w.LIZIZ)) {
                            mp(poiGeneralCard2.getPoiId(), c614900O9w.LIZ);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        IPoiMapDetailMapAssemAbility iPoiMapDetailMapAssemAbility;
        InterfaceC1733780vDc viewItemOperator;
        InterfaceC1733780vDc viewItemOperator2;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.jr6);
        this.LLJJIJI = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PoiMapDetailHorizontalCardCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null) {
            viewItemOperator2.LIZJ(PoiMapDetailHorizontalSkeletonCell.class);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD3.getViewItemOperator()) != null) {
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 1;
            viewItemOperator.LIZLLL(c1173220gdU);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
            viewOnAttachStateChangeListenerC20631115oD4.setPageTransformer(new C20584615gi(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD5 != null) {
            viewOnAttachStateChangeListenerC20631115oD5.registerOnPageChangeCallback(new C1208670hYf(this, 0));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD6 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD6 != null) {
            C1189060h32.LJJII(viewOnAttachStateChangeListenerC20631115oD6, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)) + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext())));
        }
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.nzk);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.msa);
        this.LLJJJIL = viewGroup;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            viewGroup.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext())));
        }
        ViewGroup viewGroup2 = this.LLJJJIL;
        if (viewGroup2 != null) {
            C1189060h32.LJJIIJ(viewGroup2, new AwS597S0100000_18(this, 7));
        }
        InterfaceC665370Q7z interfaceC665370Q7z = ip().LLIZ;
        Unit unit = null;
        if ((interfaceC665370Q7z == null || (iPoiMapDetailMapAssemAbility = (IPoiMapDetailMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailMapAssemAbility.class, null)) == null || !iPoiMapDetailMapAssemAbility.E32()) && (tuxIconView = this.LLJJJ) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        }
        TuxIconView tuxIconView2 = this.LLJJJ;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_scope;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView2.getContext());
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c3);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(tuxIconView2.getContext()));
            C19659111vp c19659111vp2 = new C19659111vp();
            c19659111vp2.LIZJ = C418440Gaw.LIZIZ(4);
            c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp2.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp2.LJ = Integer.valueOf(R.attr.p0);
            tuxIconView2.setBackground(C426750GoL.LJIILIIL(layerDrawableLJIILIIL, c19659111vp2.LIZ(tuxIconView2.getContext())));
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS153S0100000_18(this, 1));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ghG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 9), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ghH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 11), 6);
        ip().LLILLL.observe(this, new AObserverS222S0100000_18(this, 1));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), new PoiMapDetailHorizontalCardAbility() { // from class: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem$loadAllAbility$1$1
                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem.PoiMapDetailHorizontalCardAbility
                public final void eM2(String str, boolean z) {
                    this.LL.mp(str, z);
                }
            }, PoiMapDetailHorizontalCardAbility.class, null, null);
        }
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (!eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJIJJ(this);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp(java.lang.String r66, boolean r67) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem.mp(java.lang.String, boolean):void");
    }
}
