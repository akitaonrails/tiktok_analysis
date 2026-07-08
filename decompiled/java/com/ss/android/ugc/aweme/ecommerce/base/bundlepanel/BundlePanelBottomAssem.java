package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.AnonymousClass0434;
import X.AnonymousClass0445;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C10344042s;
import X.C13LE;
import X.C1637806bA;
import X.C1744700vVE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC599480NfG;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class BundlePanelBottomAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public View LLJJIJI;
    public AnonymousClass0434 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C10344042s LLJJL;
    public volatile InterfaceC599480NfG LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BundlePanelBottomAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/bundlepanel/BundlePanelVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BundlePanelBottomAssem.class, "eventCenter", "getEventCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/eventcenter/IPdpEventCenter;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.042s] */
    public BundlePanelBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BundlePanelVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 69), AFwS228S0000000_1.get$arr$(44), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 68));
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 73));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 72));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 70));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 71));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 67));
        this.LLJJL = new AnonymousClass0445() { // from class: X.042s
            @Override // X.AnonymousClass0445
            public final void LIZJ() {
            }

            /* JADX WARN: Removed duplicated region for block: B:124:0x024e  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0262  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x026a  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x0272  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0276  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0284  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x02b3  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x035c  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x035e  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0361  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x036d  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x0370  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x0373  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x0377  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x037a  */
            /* JADX WARN: Removed duplicated region for block: B:186:0x037e  */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0381  */
            /* JADX WARN: Removed duplicated region for block: B:193:0x0393  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x0398 A[PHI: r8
              0x0398: PHI (r8v26 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) = 
              (r8v25 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp)
              (r8v32 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp)
              (r8v32 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp)
              (r8v32 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp)
              (r8v32 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp)
             binds: [B:194:0x0394, B:91:0x01db, B:98:0x01fe, B:100:0x0202, B:110:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:197:0x039b  */
            /* JADX WARN: Removed duplicated region for block: B:198:0x039f  */
            /* JADX WARN: Removed duplicated region for block: B:200:0x03a5  */
            /* JADX WARN: Removed duplicated region for block: B:280:0x04ca A[PHI: r3
              0x04ca: PHI (r3v31 java.lang.String) = (r3v9 java.lang.String), (r3v33 java.lang.String) binds: [B:431:0x0714, B:279:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:293:0x04f2  */
            /* JADX WARN: Removed duplicated region for block: B:301:0x050d  */
            /* JADX WARN: Removed duplicated region for block: B:303:0x0511  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x052b  */
            /* JADX WARN: Removed duplicated region for block: B:325:0x0550  */
            /* JADX WARN: Removed duplicated region for block: B:337:0x0570  */
            /* JADX WARN: Removed duplicated region for block: B:340:0x0577  */
            /* JADX WARN: Removed duplicated region for block: B:367:0x062e  */
            /* JADX WARN: Removed duplicated region for block: B:369:0x063f  */
            /* JADX WARN: Removed duplicated region for block: B:383:0x0663  */
            /* JADX WARN: Removed duplicated region for block: B:387:0x067d  */
            /* JADX WARN: Removed duplicated region for block: B:390:0x0699  */
            /* JADX WARN: Removed duplicated region for block: B:394:0x06ab  */
            /* JADX WARN: Removed duplicated region for block: B:402:0x06be  */
            /* JADX WARN: Removed duplicated region for block: B:407:0x06cc  */
            /* JADX WARN: Removed duplicated region for block: B:408:0x06ce  */
            /* JADX WARN: Removed duplicated region for block: B:411:0x06d6  */
            /* JADX WARN: Removed duplicated region for block: B:412:0x06da  */
            /* JADX WARN: Removed duplicated region for block: B:413:0x06dd  */
            /* JADX WARN: Removed duplicated region for block: B:415:0x06e3  */
            /* JADX WARN: Removed duplicated region for block: B:416:0x06e6  */
            /* JADX WARN: Removed duplicated region for block: B:417:0x06e9  */
            /* JADX WARN: Removed duplicated region for block: B:418:0x06ec  */
            /* JADX WARN: Removed duplicated region for block: B:419:0x06f0  */
            /* JADX WARN: Removed duplicated region for block: B:420:0x06f3  */
            /* JADX WARN: Removed duplicated region for block: B:421:0x06f7  */
            /* JADX WARN: Removed duplicated region for block: B:422:0x06fb  */
            /* JADX WARN: Removed duplicated region for block: B:423:0x06ff  */
            /* JADX WARN: Removed duplicated region for block: B:424:0x0702  */
            /* JADX WARN: Removed duplicated region for block: B:425:0x0705  */
            /* JADX WARN: Removed duplicated region for block: B:426:0x0708  */
            /* JADX WARN: Removed duplicated region for block: B:432:0x0716  */
            /* JADX WARN: Removed duplicated region for block: B:446:0x0741  */
            /* JADX WARN: Removed duplicated region for block: B:455:0x075f  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
            @Override // X.AnonymousClass0445
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C04E4 r68, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r69) {
                /*
                    Method dump skipped, instruction units count: 2003
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C10344042s.LIZ(X.04E4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton):void");
            }

            @Override // X.AnonymousClass0445
            public final void LIZIZ(C04E4 c04e4, PdpButton pdpButton) {
                HashMap<String, Object> mapLJIIJ;
                BundlePanelVM bundlePanelVMKp = this.LIZ.kp();
                String str = pdpButton.daInfo;
                if (str != null) {
                    mapLJIIJ = C1741890vQh.LJIIJ(str);
                } else {
                    mapLJIIJ = null;
                }
                C1019503yj c1019503yj = bundlePanelVMKp.LLJ;
                c1019503yj.getClass();
                C1018703yb.LIZLLL("tiktokec_button_show", new AwS367S0200000_1(c1019503yj, (C1019503yj) mapLJIIJ, (Map<String, ? extends Object>) 154));
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b3c;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BundlePanelFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BundlePanelFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC599480NfG ip() {
        /*
            r4 = this;
            X.0NfG r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0NfG r0 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragmentScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0NfG> r0 = X.InterfaceC599480NfG.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0NfG r0 = (X.InterfaceC599480NfG) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJLIIIJLLLLLLLZ = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelBottomAssem.ip():X.0NfG");
    }

    public final BundlePanelVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (BundlePanelVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AnonymousClass0434 anonymousClass0434 = (AnonymousClass0434) getContentView().findViewById(R.id.d78);
        this.LLJJIJIIJIL = anonymousClass0434;
        if (anonymousClass0434 != null) {
            anonymousClass0434.setPdpBottomButtonListener(this.LLJJL);
        }
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.y_s);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIJI = viewFindViewById;
        }
        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), viewFindViewById);
        viewFindViewById.setBackground(C800330VaR.LIZIZ(viewFindViewById.getContext(), R.drawable.b3u));
        AnonymousClass0434 anonymousClass04342 = this.LLJJIJIIJIL;
        if (anonymousClass04342 != null) {
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), anonymousClass04342);
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03xQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1756010vnT) obj).LLILLJJLI;
            }
        }, null, new AwS615S0100000_1(this, 8), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03xP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1756010vnT) obj).LLIZ;
            }
        }, null, new AwS615S0100000_1(this, 9), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b8 A[PHI: r9
      0x02b8: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v28 java.lang.String) binds: [B:172:0x02b4, B:70:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c5 A[PHI: r5 r40
      0x02c5: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v131 java.lang.String) binds: [B:178:0x02c1, B:58:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r40v1 java.lang.String) = (r40v0 java.lang.String), (r40v7 java.lang.String) binds: [B:178:0x02c1, B:58:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d7 A[PHI: r17 r19 r20
      0x02d7: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v19 java.lang.String), (r17v19 java.lang.String) binds: [B:185:0x02d3, B:21:0x0098, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r19v2 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v1 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v18 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v18 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:185:0x02d3, B:21:0x0098, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r20v2 java.lang.Integer) = (r20v1 java.lang.Integer), (r20v16 java.lang.Integer), (r20v16 java.lang.Integer) binds: [B:185:0x02d3, B:21:0x0098, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dd A[PHI: r16 r17 r19 r20
      0x02dd: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v17 java.lang.String), (r16v17 java.lang.String) binds: [B:188:0x02d9, B:26:0x00a4, B:28:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v18 java.lang.String), (r17v18 java.lang.String) binds: [B:188:0x02d9, B:26:0x00a4, B:28:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r19v3 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v2 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v17 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v17 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:188:0x02d9, B:26:0x00a4, B:28:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r20v3 java.lang.Integer) = (r20v2 java.lang.Integer), (r20v15 java.lang.Integer), (r20v15 java.lang.Integer) binds: [B:188:0x02d9, B:26:0x00a4, B:28:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e2 A[PHI: r15 r16 r17 r19 r20
      0x02e2: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v16 java.lang.String), (r15v16 java.lang.String) binds: [B:191:0x02de, B:31:0x00ae, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v16 java.lang.String), (r16v16 java.lang.String) binds: [B:191:0x02de, B:31:0x00ae, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v17 java.lang.String), (r17v17 java.lang.String) binds: [B:191:0x02de, B:31:0x00ae, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r19v4 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v3 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v16 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v16 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:191:0x02de, B:31:0x00ae, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r20v4 java.lang.Integer) = (r20v3 java.lang.Integer), (r20v14 java.lang.Integer), (r20v14 java.lang.Integer) binds: [B:191:0x02de, B:31:0x00ae, B:33:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e7 A[PHI: r14 r15 r16 r17 r19 r20
      0x02e7: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v15 java.lang.String) binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v15 java.lang.String) binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v15 java.lang.String) binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v16 java.lang.String) binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r19v5 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v4 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v15 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r20v5 java.lang.Integer) = (r20v4 java.lang.Integer), (r20v13 java.lang.Integer) binds: [B:194:0x02e3, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ec A[PHI: r13 r14 r15 r16 r17 r19 r20
      0x02ec: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v15 java.lang.String), (r13v15 java.lang.String) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v14 java.lang.String), (r14v14 java.lang.String) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v14 java.lang.String), (r15v14 java.lang.String) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r16v4 java.lang.String) = (r16v3 java.lang.String), (r16v14 java.lang.String), (r16v14 java.lang.String) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r17v5 java.lang.String) = (r17v4 java.lang.String), (r17v15 java.lang.String), (r17v15 java.lang.String) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r19v6 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v5 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v14 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v14 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r20v6 java.lang.Integer) = (r20v5 java.lang.Integer), (r20v12 java.lang.Integer), (r20v12 java.lang.Integer) binds: [B:197:0x02e8, B:39:0x00be, B:41:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[PHI: r15 r16 r17 r19 r20
      0x00ac: PHI (r15v16 java.lang.String) = (r15v0 java.lang.String), (r15v17 java.lang.String) binds: [B:191:0x02de, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r16v16 java.lang.String) = (r16v1 java.lang.String), (r16v17 java.lang.String) binds: [B:191:0x02de, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r17v17 java.lang.String) = (r17v2 java.lang.String), (r17v18 java.lang.String) binds: [B:191:0x02de, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r19v16 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo) = 
      (r19v3 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
      (r19v17 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo)
     binds: [B:191:0x02de, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r20v14 java.lang.Integer) = (r20v3 java.lang.Integer), (r20v15 java.lang.Integer) binds: [B:191:0x02de, B:29:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[PHI: r5 r40
      0x00e4: PHI (r5v131 java.lang.String) = (r5v2 java.lang.String), (r5v132 java.lang.String) binds: [B:178:0x02c1, B:50:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r40v7 java.lang.String) = (r40v0 java.lang.String), (r40v8 java.lang.String) binds: [B:178:0x02c1, B:50:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x084a A[PHI: r18
      0x084a: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v6 java.lang.String) binds: [B:557:0x0846, B:346:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:604:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r99, X.C04E4 r100) {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelBottomAssem.hp(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton, X.04E4):void");
    }

    public final void lp(TuxTextView tuxTextView, LinkRichText linkRichText) {
        Context context;
        if (linkRichText != null && (context = getContext()) != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.setText(RichTextUtil.LJ(RichTextUtil.LIZ, context, linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 16380));
            tuxTextView.setTextColor(linkRichText.LIZIZ(context));
            if (Unit.LIZ != null) {
                return;
            }
        }
        C786410Ut5.LJLLLLLL(8, tuxTextView);
    }
}
