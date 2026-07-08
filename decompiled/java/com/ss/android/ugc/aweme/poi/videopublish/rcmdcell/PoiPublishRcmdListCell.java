package com.ss.android.ugc.aweme.poi.videopublish.rcmdcell;

import X.AbstractC2211791BhR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0BKJ;
import X.C0ZP4;
import X.C1196320hEk;
import X.C1199940hKa;
import X.C1199950hKb;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1200260hL6;
import X.C1201220hMe;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20627315nb;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1208760hYo;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishRcmdListCell extends PowerCell<C1199940hKa> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final /* synthetic */ C1201220hMe LL = new C1201220hMe();
    public C20627315nb LLILLJJLI;
    public TuxTextView LLILLL;
    public final AssemVMLazy LLILZ;
    public final AnchorLock$IAnchorStateService LLILZIL;
    public final C01GW LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiPublishRcmdListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/videopublish/PoiPublishExtensionVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    public PoiPublishRcmdListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPublishExtensionVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2111);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(728);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2096), awS562S0100000_18, AFwS206S0000000_18.get$arr$(555), new AwS562S0100000_18((C03K6) this, 2097), new AwS562S0100000_18((C03K6) this, 2099), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2101), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2103), null, new AwS562S0100000_18((C03K6) this, 2104));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 2098);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2100);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 2102);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 103));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 2105);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 2106);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 2107);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 2108);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 2109);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2110), awS562S0100000_18, AFwS206S0000000_18.get$arr$(557), new AwS562S0100000_18((C03K6) this, 2112), new AwS562S0100000_18((C03K6) this, 2113), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2114), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2115), null, new AwS562S0100000_18((C03K6) this, 2116));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2117), awS562S0100000_18, AFwS206S0000000_18.get$arr$(558), new AwS562S0100000_18((C03K6) this, 2118), new AwS562S0100000_18((C03K6) this, 2119), new AwS562S0100000_18((C03K6) this, 2093), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 2095));
        }
        this.LLILZ = assemVMLazy;
        C13LE.LIZ(PoiSearchVM.class);
        AFwS256S0000000_18.get$arr$(731);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLILZIL = (AnchorLock$IAnchorStateService) ServiceManager.get().getService(AnchorLock$IAnchorStateService.class);
        C1199950hKb.LIZ();
        this.LLILZLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(556));
    }

    public final PoiPublishExtensionVM L5() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (PoiPublishExtensionVM) assemVMLazy.getValue();
    }

    public final String I5() {
        return (String) C736680Sv4.LJIJJ(L5(), AFwS256S0000000_18.get$arr$(729));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C20627315nb c20627315nb = (C20627315nb) this.itemView.findViewById(R.id.veq);
        this.LLILLJJLI = c20627315nb;
        if (c20627315nb == null) {
            c20627315nb = null;
        }
        this.LLILLL = (TuxTextView) c20627315nb.findViewById(R.id.xkj);
        this.LL.LIZJ(this.itemView);
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hKT
            public Function0<String> LJ;
            public final int LJFF = 100;
            public final boolean LJI = true;
            public final C1199860hKS LJII;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.0hKS] */
            {
                this.LJ = new AwS562S0100000_18(this, 2094);
                this.LJII = new InterfaceC2211931Bhf() { // from class: X.0hKS
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x010c A[PHI: r9
                      0x010c: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:61:0x0108, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC2211931Bhf
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.view.View r16, java.lang.String r17) {
                        /*
                            Method dump skipped, instruction units count: 420
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1199860hKS.LIZ(android.view.View, java.lang.String):void");
                    }
                };
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public static boolean N5(C1199940hKa c1199940hKa) {
        ExtensionMisc extensionMisc;
        C1200260hL6 c1200260hL6 = c1199940hKa.LLILLJJLI;
        if (c1200260hL6 != null && (extensionMisc = c1200260hL6.LLILLJJLI) != null && !extensionMisc.isImageMode() && !extensionMisc.isImageNewStyleUi()) {
            return true;
        }
        return false;
    }

    public final void P5(PoiData poiData) {
        C1200260hL6 c1200260hL6;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        C1199940hKa item = getItem();
        if (item != null && (c1200260hL6 = item.LLILLJJLI) != null && (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLIZ, C1200260hL6.LIZ(c1200260hL6, null, poiData, 59), C1200260hL6.class, "source_default_key");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        int iLIZIZ;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService;
        float fLIZIZ;
        ExtensionMisc extensionMisc;
        boolean zEnableRefactorPoiRcmdList;
        ExtensionMisc extensionMisc2;
        ExtensionMisc extensionMisc3;
        final C1199940hKa c1199940hKa = (C1199940hKa) interfaceC1891350zJl;
        super.onBindItemView(c1199940hKa);
        TuxTextView tuxTextView = this.LLILLL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        PoiData poiData = c1199940hKa.LL;
        if (poiData != null) {
            str = poiData.name;
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        tuxTextView.setTag(c1199940hKa.LL);
        C20627315nb c20627315nb = this.LLILLJJLI;
        if (c20627315nb == null) {
            c20627315nb = null;
        }
        C786410Ut5.k9(c20627315nb, new View.OnClickListener() { // from class: X.0hKR
            /* JADX WARN: Removed duplicated region for block: B:102:0x02d8  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x02db  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x02de  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x02e7 A[PHI: r6
              0x02e7: PHI (r6v11 java.lang.String) = (r6v10 java.lang.String), (r6v17 java.lang.String), (r6v17 java.lang.String) binds: [B:106:0x02e3, B:21:0x005d, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x02ec A[PHI: r5 r6
              0x02ec: PHI (r5v8 java.lang.String) = (r5v7 java.lang.String), (r5v10 java.lang.String), (r5v10 java.lang.String) binds: [B:109:0x02e8, B:26:0x0067, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]
              0x02ec: PHI (r6v12 java.lang.String) = (r6v11 java.lang.String), (r6v16 java.lang.String), (r6v16 java.lang.String) binds: [B:109:0x02e8, B:26:0x0067, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x030c  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0313  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0321  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x034b A[LOOP:1: B:122:0x0345->B:124:0x034b, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:125:0x035f  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x038c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0283  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x029f  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x02b3  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02b5  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02b7  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x02bd  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02c0  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r44) {
                /*
                    Method dump skipped, instruction units count: 1000
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1199850hKR.onClick(android.view.View):void");
            }
        });
        if (getLayoutPosition() != 0 || c1199940hKa.LLILLL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService2 = (IAVPublishPageUIRefactorService) this.LLILZLL.getValue();
            if (iAVPublishPageUIRefactorService2 != null) {
                zEnableRefactorPoiRcmdList = iAVPublishPageUIRefactorService2.enableRefactorPoiRcmdList();
            } else {
                zEnableRefactorPoiRcmdList = false;
            }
            if (zEnableRefactorPoiRcmdList) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                C1200260hL6 c1200260hL6 = c1199940hKa.LLILLJJLI;
                if ((c1200260hL6 != null && (extensionMisc3 = c1200260hL6.LLILLJJLI) != null && extensionMisc3.isImageMode()) || N5(c1199940hKa)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    C1200260hL6 c1200260hL62 = c1199940hKa.LLILLJJLI;
                    if (c1200260hL62 != null && (extensionMisc2 = c1200260hL62.LLILLJJLI) != null && extensionMisc2.isImageNewStyleUi()) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    }
                }
            }
        }
        C20627315nb c20627315nb2 = this.LLILLJJLI;
        if (c20627315nb2 == null) {
            c20627315nb2 = null;
        }
        C426750GoL.LJIIIZ(c20627315nb2, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
        C1200260hL6 c1200260hL63 = c1199940hKa.LLILLJJLI;
        if ((c1200260hL63 != null && (extensionMisc = c1200260hL63.LLILLJJLI) != null && extensionMisc.isImageMode()) || (((iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) this.LLILZLL.getValue()) != null && iAVPublishPageUIRefactorService.enableRefactorPoiRcmdList()) || N5(c1199940hKa))) {
            C20627315nb c20627315nb3 = this.LLILLJJLI;
            if (c20627315nb3 == null) {
                c20627315nb3 = null;
            }
            View viewFindViewById = c20627315nb3.findViewById(R.id.nc2);
            boolean zLIZ = C0BKJ.LIZ();
            if (!N5(c1199940hKa) && !zLIZ) {
                fLIZIZ = C418440Gaw.LIZIZ(10);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(6);
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
            C20627315nb c20627315nb4 = this.LLILLJJLI;
            if (c20627315nb4 == null) {
                c20627315nb4 = null;
            }
            viewFindViewById.setBackground(c384050F3z.LIZ(c20627315nb4.getContext()));
            C20627315nb c20627315nb5 = this.LLILLJJLI;
            if (c20627315nb5 == null) {
                c20627315nb5 = null;
            }
            C427690Gpr.LJ(c20627315nb5, fLIZIZ);
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setTuxFont(62);
            if (N5(c1199940hKa)) {
                TuxTextView tuxTextView4 = this.LLILLL;
                if (tuxTextView4 != null) {
                    tuxTextView2 = tuxTextView4;
                }
                tuxTextView2.setTextColorRes(R.attr.a1i);
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
            } else if (zLIZ) {
                TuxTextView tuxTextView5 = this.LLILLL;
                if (tuxTextView5 != null) {
                    tuxTextView2 = tuxTextView5;
                }
                tuxTextView2.setTextColorRes(R.attr.a1h);
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
            } else {
                TuxTextView tuxTextView6 = this.LLILLL;
                if (tuxTextView6 != null) {
                    tuxTextView2 = tuxTextView6;
                }
                tuxTextView2.setTextColorRes(R.attr.a1k);
            }
        }
        this.LL.LIZIZ().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1208760hYo(getCurrentLifecycleOwner(), 2));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL.getClass();
        return C1201220hMe.LIZ(viewGroup);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
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
