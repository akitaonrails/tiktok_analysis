package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C09R3;
import X.C0H9H;
import X.C0QSJ;
import X.C13LE;
import X.C1405960mgs;
import X.C1420650n4Z;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1420660n4a;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.zhiliaoapp.musically.R;
import g1c.AjS68S0100000_22;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SkuPropDropdownAssem extends ReusedUISlotAssem<SkuPropDropdownAssem> implements InterfaceC712990Rxx<C1405960mgs>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1420650n4Z LLJJLIIIJLLLLLLLZ = new C1420650n4Z();
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public volatile InterfaceC1420660n4a LLJLILLLLZIIL;
    public volatile ISkuManagerAbility LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPropDropdownAssem.class, "actionListener", "getActionListener()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/assem/dropdown/SkuPropDropdownActionListener;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SkuPropDropdownAssem.class, "skuManager", "getSkuManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/ISkuManagerAbility;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.az9;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SkuPropDropdownActionScope.class, PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SkuPropDropdownActionScope.class);
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
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
    public final X.InterfaceC1420660n4a op() {
        /*
            r4 = this;
            X.0n4a r0 = r4.LLJLILLLLZIIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0n4a r0 = r4.LLJLILLLLZIIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownActionScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownActionScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0n4a> r0 = X.InterfaceC1420660n4a.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0n4a r0 = (X.InterfaceC1420660n4a) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJLILLLLZIIL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownAssem.op():X.0n4a");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Float fValueOf;
        this.LLJL = (TuxTextView) view.findViewById(R.id.yy_);
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.y3y);
        View viewFindViewById = view.findViewById(R.id.gab);
        if (viewFindViewById != null) {
            C0H9H.LJI(this.LLJJLIIIJLLLLLLLZ.LIZ, viewFindViewById);
            viewFindViewById.setPadding(0, 0, 0, 0);
            C1420650n4Z c1420650n4Z = this.LLJJLIIIJLLLLLLLZ;
            Context context = viewFindViewById.getContext();
            c1420650n4Z.getClass();
            C384050F3z c384050F3z = new C384050F3z();
            Resources resources = context.getResources();
            if (resources != null) {
                fValueOf = Float.valueOf(resources.getDimension(R.dimen.ax));
            } else {
                fValueOf = null;
            }
            c384050F3z.LIZJ = fValueOf;
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
            C786410Ut5.I7(new AjS68S0100000_22(this, 0), viewFindViewById);
        }
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            C0H9H.LJFF(this.LLJJLIIIJLLLLLLLZ.LIZJ, tuxTextView);
            C0H9H.LJII(this.LLJJLIIIJLLLLLLLZ.LIZIZ, tuxTextView);
            tuxTextView.setTextColorRes(this.LLJJLIIIJLLLLLLLZ.LJ);
            tuxTextView.setTuxFont(this.LLJJLIIIJLLLLLLLZ.LJI);
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C0H9H.LIZLLL(this.LLJJLIIIJLLLLLLLZ.LIZLLL, tuxIconView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031b A[Catch: all -> 0x0327, PHI: r1
      0x031b: PHI (r1v13 X.0QSJ) = (r1v12 X.0QSJ), (r1v16 X.0QSJ) binds: [B:182:0x02fd, B:187:0x0317] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:179:0x02f7, B:181:0x02fb, B:183:0x02ff, B:185:0x0303, B:186:0x0309, B:190:0x0323, B:191:0x0325, B:189:0x031b), top: B:207:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0342  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1405960mgs r18) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1405960mgs c1405960mgs) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1405960mgs c1405960mgs) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
