package com.ss.android.ugc.aweme.poi.collect.slash;

import X.C019F;
import X.C01GW;
import X.C0OH5;
import X.C112000be;
import X.C1176020gi0;
import X.C1183990gur;
import X.C1184000gus;
import X.C1192290h8F;
import X.C1200940hMC;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20642515q3;
import X.C2217381BqS;
import X.C298360Bmk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.C452501pT;
import X.C614900O9w;
import X.C622680Oba;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectListAssemForSlashCell extends UIListContentAssem<PoiCollectListViewModelForSlashCell> implements C0OH5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public final List<String> LLJIJIL;
    public final List<String> LLJILJIL;
    public Long LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public Runnable LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectListAssemForSlashCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/collect/slash/PoiCollectListViewModelForSlashCell;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectListAssemForSlashCell() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectListViewModelForSlashCell.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 953), AFwS256S0000000_18.get$arr$(303), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C112000be.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 950));
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
        this.LLJJI = true;
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 949));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 952));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 947));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 951));
        this.LLJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 954));
    }

    @Override // X.C0OH5, X.InterfaceC723730SaB
    public String LIZ() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C1200940hMC.LIZ.getClass();
            this.LLJJ = C1200940hMC.LIZIZ(context);
        }
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
            C1192290h8F.LIZ(this, "poi_collections_in_personal_page", null, false, null, null, 30);
            C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 264));
        }
        if (!this.LLJIJIL.isEmpty()) {
            this.LLJIJIL.clear();
            Go().smoothScrollToPosition(0);
            kp(this, false);
        }
        ep(this.LLJILJIL);
        this.LLJILJIL.clear();
    }

    private final C112000be ap() {
        return (C112000be) this.LLJ.getValue();
    }

    private final boolean hp() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1722300uv6 Vo() {
        return (C1722300uv6) this.LLJJIJIIJIL.getValue();
    }

    public final C1722300uv6 Zo() {
        return (C1722300uv6) this.LLJJIII.getValue();
    }

    public final C1722300uv6 bp() {
        return (C1722300uv6) this.LLJJIJI.getValue();
    }

    @Override // X.C0OH5
    public void co() {
        if (this.LLJILLL) {
            return;
        }
        PoiCollectListViewModelForSlashCell poiCollectListViewModelForSlashCellJo = Jo();
        C112000be c112000beAp = ap();
        poiCollectListViewModelForSlashCellJo.LLILZ = c112000beAp != null ? c112000beAp.LL : null;
        this.LLJILJILJ = Long.valueOf(System.currentTimeMillis());
        this.LLJILLL = true;
        kp(this, true);
    }

    public final C1749280vcc cp() {
        return (C1749280vcc) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: dp, reason: merged with bridge method [inline-methods] */
    public PoiCollectListViewModelForSlashCell Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiCollectListViewModelForSlashCell) assemVMLazy.getValue();
    }

    public final void ip() {
        Runnable runnable = this.LLJJJJ;
        if (runnable != null) {
            runnable.run();
        }
        this.LLJJJJ = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        ip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    @Override // X.C0OH5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageSelected() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListViewModelForSlashCell r0 = r3.Jo()
            X.002o r0 = r0.getState()
            X.0gcJ r0 = (X.C1172490gcJ) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            X.06Xk<X.0OhC> r0 = r0.LL
            boolean r0 = r0 instanceof X.C1623606Xi
            if (r0 == 0) goto L48
            X.0gdT r2 = X.C1173210gdT.LIZ
            com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListViewModelForSlashCell r0 = r3.Jo()
            X.002o r0 = r0.getState()
            X.0gcJ r0 = (X.C1172490gcJ) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            java.util.List<ITEM> r0 = r0.LLILZ
            if (r0 == 0) goto L46
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L46
        L37:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.bytedance.android.btm.api.model.PageFinder r0 = com.bytedance.android.btm.api.model.PageFinder.via(r3)
            r2.getClass()
            X.C1173210gdT.LIZ(r1, r0)
            return
        L46:
            r1 = 0
            goto L37
        L48:
            Y.ARunnableS118S0100000_18 r1 = new Y.ARunnableS118S0100000_18
            r0 = 31
            r1.<init>(r3, r0)
            r3.LLJJJJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListAssemForSlashCell.onPageSelected():void");
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        super.xo();
        if (C298360Bmk.LIZ()) {
            C1183990gur.LIZ();
        } else {
            C1184000gus.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ep(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            X.15jv r0 = r6.Go()
            X.15jK r0 = r0.getState()
            java.util.List r5 = r0.LJII()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r4 = r5.iterator()
        L19:
            r3 = 0
            if (r4 == 0) goto L54
            boolean r1 = r4.hasNext()
            r0 = 1
            if (r1 != r0) goto L54
        L23:
            r2 = 0
            if (r0 == 0) goto L56
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C1175980ghw
            if (r0 == 0) goto L52
            X.0ghw r1 = (X.C1175980ghw) r1
            if (r1 == 0) goto L52
            com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel r0 = r1.LL
            if (r0 == 0) goto L52
            java.lang.Object r1 = r0.LLILLJJLI
        L38:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData r1 = (com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData) r1
            if (r1 == 0) goto L42
            java.lang.String r2 = r1.poiId
        L42:
            boolean r0 = X.C1200890hM7.LIZ(r2)
            if (r0 == 0) goto L19
            boolean r0 = X.C13LP.LJJJJ(r2, r7)
            if (r0 == 0) goto L19
            r4.remove()
            goto L19
        L52:
            r1 = r2
            goto L38
        L54:
            r0 = 0
            goto L23
        L56:
            X.15jv r0 = r6.Go()
            X.15jK r0 = r0.getState()
            r0.LJIIJJI(r5, r2)
            X.15jv r0 = r6.Go()
            X.15jK r0 = r0.getState()
            java.util.List r0 = r0.LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L99
            X.15jv r1 = r6.Go()
            r0 = 8
            X.C786410Ut5.LLF(r0, r1)
            X.0vcc r1 = r6.cp()
            X.0uv6 r0 = r6.Zo()
            r1.setStatus(r0)
            X.0HcA r1 = X.EnumC444680HcA.NO_CONTENT
            X.0vcc r0 = r6.cp()
            X.C444690HcB.LIZ(r1, r0)
            X.0vcc r0 = r6.cp()
            X.C786410Ut5.LLLZLZ(r0, r3)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListAssemForSlashCell.ep(java.util.List):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        String str = c614900O9w.LIZIZ;
        if (str == null) {
            return;
        }
        if (c614900O9w.LIZ) {
            this.LLJIJIL.add(str);
            this.LLJILJIL.remove(str);
        } else {
            this.LLJIJIL.remove(str);
            this.LLJILJIL.add(str);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C1176020gi0.LIZ("poi_common_card", Go());
        C1176020gi0.LIZ("poi_hotel_card", Go());
        C1176020gi0.LIZ("poi_regional_card", Go());
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gfr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172490gcJ c1172490gcJ = (C1172490gcJ) obj;
                c1172490gcJ.getClass();
                return C627260Oiy.LIZLLL(c1172490gcJ);
            }
        }, null, new AwS597S0100000_18(this, 265), AFwS206S0000000_18.get$arr$(286), new AwS597S0100000_18(this, 266), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gfs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172490gcJ c1172490gcJ = (C1172490gcJ) obj;
                c1172490gcJ.getClass();
                return C627260Oiy.LIZJ(c1172490gcJ);
            }
        }, null, AFwS256S0000000_18.get$arr$(302), AFwS206S0000000_18.get$arr$(287), new AwS597S0100000_18(this, 267), 2, null);
        PerfMonitorService perfMonitorService = (PerfMonitorService) PluggableExtentionKt.pluggableSpi$default(PerfMonitorService.class, false, false, false, 14, null);
        if (perfMonitorService != null) {
            perfMonitorService.LJ(Go(), "poi_collect_list");
        }
    }

    public static final void kp(PoiCollectListAssemForSlashCell poiCollectListAssemForSlashCell, boolean z) {
        poiCollectListAssemForSlashCell.Jo().manualListRefresh();
        if (z) {
            C786410Ut5.LLF(8, poiCollectListAssemForSlashCell.Go());
        }
        poiCollectListAssemForSlashCell.cp().LJ();
    }

    public final C1722300uv6 Lo(Integer num, int i, int i2, boolean z) {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        if (!hp()) {
            cp().setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(187)));
            cp().setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(193)));
            if (num != null) {
                int iIntValue = num.intValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iIntValue;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZ(c419910GdJ);
            }
        } else {
            cp().setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            cp().setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        c1722300uv6.LJI = C20642515q3.LJI(i);
        c1722300uv6.LJIIIIZZ = C20642515q3.LJI(i2);
        if (z) {
            c1722300uv6.LJIIIZ = new AwS597S0100000_18(this, 263);
        }
        return c1722300uv6;
    }

    public final C1722300uv6 No(EnumC444680HcA enumC444680HcA, Integer num, Integer num2, Integer num3, boolean z) {
        C444640Hc6 c444640Hc6;
        C444560Hby c444560Hby;
        if (!hp()) {
            c444640Hc6 = new C444640Hc6(EnumC444620Hc4.HUG, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(187))), Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(193))));
        } else {
            c444640Hc6 = new C444640Hc6(EnumC444620Hc4.HUG, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))), Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        }
        C444550Hbx c444550Hbx = new C444550Hbx(Boolean.valueOf(!hp()), num, 4);
        if (z) {
            c444560Hby = new C444560Hby(EnumC444580Hc0.PILL_BUTTON, null, 2131830000, 1, new AwS562S0100000_18(this, 948), 2);
        } else {
            c444560Hby = null;
        }
        return C444600Hc2.LIZ(getContext(), cp(), C444540Hbw.LIZ(enumC444680HcA, c444640Hc6, c444550Hbx, num2, num3, c444560Hby, new C444590Hc1(3)));
    }
}
