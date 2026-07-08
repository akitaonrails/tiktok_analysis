package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09R3;
import X.C0Q4Y;
import X.C0QSJ;
import X.C13BV;
import X.C13LE;
import X.C1405970mgt;
import X.C1408710mlJ;
import X.C1415770mwh;
import X.C20600815jK;
import X.C2217381BqS;
import X.C426050GnD;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1407210mit;
import X.InterfaceC1415800mwk;
import X.InterfaceC1420350n45;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.powercell.SkuPropValueSelectionCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SkuPropValueSelectionAssem extends ReusedUISlotAssem<SkuPropValueSelectionAssem> implements InterfaceC712990Rxx<C1405970mgt>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public C426050GnD LLJLIL;
    public InterfaceC1415800mwk LLJLL;
    public volatile InterfaceC1407210mit LLJLLL;
    public volatile ISkuManagerAbility LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;
    public C0QSJ LLLF;
    public final C1415770mwh LLJJLIIIJLLLLLLLZ = new C1415770mwh();
    public int LLJLILLLLZIIL = -1;
    public List<C1408710mlJ> LLJLLIL = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPropValueSelectionAssem.class, "actionListener", "getActionListener()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/assem/selection/SkuPropValueSelectionActionListener;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SkuPropValueSelectionAssem.class, "skuManager", "getSkuManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/ISkuManagerAbility;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.azc;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SkuPropValueSelectionActionScope.class, PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SkuPropValueSelectionActionScope.class);
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC1415800mwk interfaceC1415800mwk;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (interfaceC1415800mwk = this.LLJLL) != null) {
            interfaceC1415800mwk.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
        this.LLJLL = null;
        this.LLJLILLLLZIIL = -1;
        this.LLJLIL = null;
        this.LLJL = null;
        this.LLJLLIL = C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1407210mit op() {
        /*
            r4 = this;
            X.0mit r0 = r4.LLJLLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0mit r0 = r4.LLJLLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJZIJLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJZIJLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionActionScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionActionScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0mit> r0 = X.InterfaceC1407210mit.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0mit r0 = (X.InterfaceC1407210mit) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJLLL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionAssem.op():X.0mit");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0GnD] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C20600815jK<InterfaceC1891350zJl> state;
        final Context context = getContext();
        this.LLJLIL = new InterfaceC1420350n45(context) { // from class: X.0GnD
            public final Context LIZ;

            @Override // X.InterfaceC1420350n45
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1420350n45
            public final void LJFF() {
            }

            @Override // X.InterfaceC1420350n45
            public final void LJI() {
            }

            @Override // X.InterfaceC1420350n45
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1420350n45
            public final int LJIIJ() {
                return C0H9H.LIZIZ(4);
            }

            @Override // X.InterfaceC1420350n45
            public final void LJIL() {
            }

            @Override // X.InterfaceC1420350n45
            public final C384050F3z LJIIJJI() {
                Resources resources;
                C384050F3z c384050F3z = new C384050F3z();
                Context context2 = this.LIZ;
                c384050F3z.LIZJ = (context2 == null || (resources = context2.getResources()) == null) ? null : Float.valueOf(resources.getDimension(R.dimen.ay));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a1h);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJIIL = Float.valueOf(C418440Gaw.LIZIZ(4));
                c384050F3z.LJIILIIL = Float.valueOf(C418440Gaw.LIZIZ(4));
                return c384050F3z;
            }

            @Override // X.InterfaceC1420350n45
            public final int LJIIZILJ() {
                return C0H9H.LIZIZ(8);
            }

            @Override // X.InterfaceC1420350n45
            public final C384050F3z LJIJJ() {
                Resources resources;
                C384050F3z c384050F3z = new C384050F3z();
                Context context2 = this.LIZ;
                c384050F3z.LIZJ = (context2 == null || (resources = context2.getResources()) == null) ? null : Float.valueOf(resources.getDimension(R.dimen.ay));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJIIL = Float.valueOf(C418440Gaw.LIZIZ(4));
                c384050F3z.LJIILIIL = Float.valueOf(C418440Gaw.LIZIZ(4));
                return c384050F3z;
            }

            @Override // X.InterfaceC1420350n45
            public final C384050F3z LJIJJLI() {
                Resources resources;
                C384050F3z c384050F3z = new C384050F3z();
                Context context2 = this.LIZ;
                c384050F3z.LIZJ = (context2 == null || (resources = context2.getResources()) == null) ? null : Float.valueOf(resources.getDimension(R.dimen.ay));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                return c384050F3z;
            }

            @Override // X.InterfaceC1420350n45
            public final C384050F3z LJJ() {
                Resources resources;
                C384050F3z c384050F3z = new C384050F3z();
                Context context2 = this.LIZ;
                c384050F3z.LIZJ = (context2 == null || (resources = context2.getResources()) == null) ? null : Float.valueOf(resources.getDimension(R.dimen.ay));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a00);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
                return c384050F3z;
            }

            {
                this.LIZ = context;
            }
        };
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.se2);
        this.LLJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setNestedScrollingEnabled(false);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(SkuPropValueSelectionCell.class);
        }
        this.LLJLILLLLZIIL = -1;
        this.LLJLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[Catch: all -> 0x0253, PHI: r1
      0x00ef: PHI (r1v20 X.0QSJ) = (r1v19 X.0QSJ), (r1v22 X.0QSJ) binds: [B:53:0x00d3, B:58:0x00eb] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:50:0x00cd, B:52:0x00d1, B:54:0x00d5, B:56:0x00d9, B:57:0x00df, B:61:0x00fc, B:62:0x00fe, B:60:0x00ef), top: B:148:0x00cd }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0mlK] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0mwk] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1405970mgt r35) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1405970mgt c1405970mgt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1405970mgt c1405970mgt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
