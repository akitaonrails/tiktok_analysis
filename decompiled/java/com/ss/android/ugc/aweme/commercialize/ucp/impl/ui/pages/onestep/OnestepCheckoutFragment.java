package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep;

import X.AbstractC1387200mCc;
import X.AbstractC334960DBe;
import X.AbstractC343940De4;
import X.AnonymousClass0951;
import X.C098200Yq;
import X.C0D3K;
import X.C0D3V;
import X.C0D3Z;
import X.C0D4D;
import X.C0D4E;
import X.C0D4F;
import X.C0D90;
import X.C0DAI;
import X.C0DAO;
import X.C0DB1;
import X.C0DBY;
import X.C0DC3;
import X.C0DC7;
import X.C0DCL;
import X.C0DCM;
import X.C0DCN;
import X.C0DCT;
import X.C0DCU;
import X.C0DDL;
import X.C0DDZ;
import X.C0DEK;
import X.C0DEM;
import X.C0DEO;
import X.C0DET;
import X.C0DGB;
import X.C0DIM;
import X.C11BJ;
import X.C1391190mJ3;
import X.C13LP;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C16BC;
import X.C189200o6;
import X.C1901307cZ;
import X.C1906580ziK;
import X.C19226610Js;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C332690D2l;
import X.C332730D2p;
import X.C332760D2s;
import X.C333540D5s;
import X.C334170D8d;
import X.C334410D9b;
import X.C334430D9d;
import X.C334630D9x;
import X.C334790DAn;
import X.C334800DAo;
import X.C334970DBf;
import X.C334980DBg;
import X.C334990DBh;
import X.C335000DBi;
import X.C335080DBq;
import X.C335260DCi;
import X.C335270DCj;
import X.C343970De7;
import X.C786410Ut5;
import X.EnumC335450DDb;
import X.InterfaceC1058150ddt;
import X.InterfaceC333090D3z;
import X.InterfaceC334930DBb;
import X.InterfaceC335280DCk;
import X.InterfaceC336390DGr;
import Y.ARunnableS37S0300000_4;
import Y.ARunnableS73S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ad.ecp.IEcpService;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS32S2100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class OnestepCheckoutFragment extends Fragment implements InterfaceC1058150ddt, DialogInterface.OnDismissListener, InterfaceC336390DGr, InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjZiwhHELIOSOSN9PSxiOS40LTZiJiE2OzEpOWEcJiA/PSojCy0pKiQ8PTEKOy40JSAiPQ==";
    public C0DC7 LL;
    public OnestepCheckoutViewModel LLILLJJLI;
    public CheckoutViewModel LLILLL;
    public C0DCN LLILZ;
    public C0DGB LLILZLL;
    public View LLIZ;
    public String LLJI;
    public boolean LLJIJIL;
    public C19226610Js LLJILJIL;
    public C335080DBq LLJILJILJ;
    public C335000DBi LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public Integer LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C11BJ LLJJIJIL;
    public C0D4E LLJJJJ;
    public final C335260DCi LLILZIL = new Object() { // from class: X.0DCi
    };
    public final C333540D5s LLIZLLLIL = new C333540D5s(null);
    public final C335270DCj LLJ = new C335270DCj(null);
    public C0D90 LLJJJ = C0D90.LL;
    public int LLJJJIL = 1;
    public AbstractC343940De4 LLJJJJJIL = C343970De7.LIZ;

    public final void RR() {
        BottomSheetBehavior bottomSheetBehavior;
        C0DET c0det;
        this.LLJJIJI = 1;
        C19EG activity = getActivity();
        if ((activity instanceof C0DET) && (c0det = (C0DET) activity) != null) {
            c0det.LLLLZLLIL(1);
        }
        UR("close", null);
        String str = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this);
        if (!(c16bcLJIIIZ instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) == null) {
            return;
        }
        bottomSheetBehavior.setState(5);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int iCS = cS(null);
        VR(iCS);
        WR(iCS);
        this.LLILZ = null;
        this.LLJJIJIL = null;
        this.LLIZ = null;
        C19226610Js c19226610Js = this.LLJILJIL;
        if (c19226610Js != null) {
            c19226610Js.LIZ();
        }
        this.LLJILJIL = null;
        C335270DCj c335270DCj = this.LLJ;
        c335270DCj.getClass();
        c335270DCj.LJ = null;
        c335270DCj.LIZLLL = false;
        c335270DCj.LJFF = null;
        InterfaceC335280DCk interfaceC335280DCk = c335270DCj.LIZIZ;
        if (interfaceC335280DCk != null) {
            c335270DCj.LJI.getClass();
            interfaceC335280DCk.LJFF(null);
        }
        super.onDestroyView();
        this.LL = null;
    }

    @Override // X.InterfaceC336390DGr
    public final void F1() {
        CheckoutViewModel checkoutViewModel = this.LLILLL;
        if (checkoutViewModel != null) {
            checkoutViewModel.IQ2();
        }
    }

    public final C332730D2p MR() {
        C0D4E c0d4e;
        C0D4D c0d4d;
        C332760D2s c332760D2s;
        AnonymousClass0951 anonymousClass0951;
        OnestepCheckoutViewModel onestepCheckoutViewModel = this.LLILLJJLI;
        C0D4F c0d4f = (onestepCheckoutViewModel == null || (anonymousClass0951 = onestepCheckoutViewModel.LLILLL) == null) ? null : (C0D4F) anonymousClass0951.getValue();
        if (!(c0d4f instanceof C0D4E) || (c0d4e = (C0D4E) c0d4f) == null || (c0d4d = c0d4e.LIZ) == null || (c332760D2s = c0d4d.LIZ) == null) {
            return null;
        }
        return c332760D2s.LIZIZ;
    }

    public final C0DC7 PR() {
        C0DC7 c0dc7 = this.LL;
        if (c0dc7 != null) {
            return c0dc7;
        }
        "UcpFragmentOnestepCheckoutBinding is only valid between onCreateView and onDestroyView".toString();
        throw new IllegalArgumentException("UcpFragmentOnestepCheckoutBinding is only valid between onCreateView and onDestroyView");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC336390DGr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hD() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.hD():void");
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        C332690D2l c332690D2l;
        CommonAdData commonAdData;
        C332730D2p c332730D2pMR = MR();
        if (c332730D2pMR != null && (c332690D2l = c332730D2pMR.identity) != null && (commonAdData = c332690D2l.rawAdData) != null) {
            return commonAdData;
        }
        C0DBY c0dby = C335000DBi.LIZJ;
        Map<String, String> map = c332730D2pMR != null ? c332730D2pMR.passThrough : null;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        return this.LLJILLL;
    }

    public final void NR(int i) {
        C0D4E c0d4e;
        C334630D9x c334630D9x;
        C334430D9d c334430D9d;
        List<C334410D9b> list;
        C334410D9b c334410D9b;
        int i2;
        CheckoutViewModel checkoutViewModel;
        int iOrdinal = this.LLJJJ.ordinal();
        boolean z = false;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C335080DBq c335080DBq = this.LLJILJILJ;
                if (c335080DBq != null && (c334630D9x = c335080DBq.LIZIZ) != null && (c334430D9d = c334630D9x.LIZ) != null && (list = c334430D9d.products) != null && (c334410D9b = (C334410D9b) C13LP.LJJJLL(list)) != null && (i2 = i - c334410D9b.quantity) != 0 && (checkoutViewModel = this.LLILLL) != null) {
                    checkoutViewModel.vQ2(0, i2);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        OnestepCheckoutViewModel onestepCheckoutViewModel = this.LLILLJJLI;
        if (onestepCheckoutViewModel == null) {
            return;
        }
        onestepCheckoutViewModel.LLJIJIL = i;
        Object value = onestepCheckoutViewModel.LLILLJJLI.getValue();
        if (!(value instanceof C0D4E) || (c0d4e = (C0D4E) value) == null) {
            return;
        }
        C2252321DDq c2252321DDq = onestepCheckoutViewModel.LLILLJJLI;
        C0D4D c0d4d = c0d4e.LIZ;
        c2252321DDq.setValue(new C0D4E(new C0D4D(c0d4d.LIZ, c0d4d.LIZIZ, i, onestepCheckoutViewModel.LLJILJIL)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[stepper.localQuantity] quantity=");
        sbLIZ.append(i);
        sbLIZ.append(" baselineRebuild=false hasCheckoutIntent=");
        if (onestepCheckoutViewModel.LLJI != null) {
            z = true;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void OR(C332730D2p c332730D2p) {
        if (this.LLJILLL == null && c332730D2p != null) {
            this.LLJILLL = new C335000DBi(c332730D2p.passThrough, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC336390DGr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SO(int r21) {
        /*
            r20 = this;
            r0 = r20
            X.0DC7 r1 = r0.LL
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.LL
            if (r3 == 0) goto Lb1
            r1 = 1500(0x5dc, double:7.41E-321)
            boolean r1 = X.C0OBG.LIZ(r1, r3)
            if (r1 == 0) goto L13
            return
        L13:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel r1 = r0.LLILLL
            if (r1 == 0) goto L1e
            X.1DDr r2 = r1.LLJILLL
            X.0DAr r1 = X.C334830DAr.LIZ
            r2.LIZJ(r1)
        L1e:
            X.0D2p r1 = r0.MR()
            r0.OR(r1)
            r5 = 0
            if (r1 == 0) goto Lae
            X.0D2l r1 = r1.identity
            if (r1 == 0) goto Lae
            java.lang.String r2 = r1.productId
        L2e:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel r1 = r0.LLILLJJLI
            if (r1 == 0) goto Lac
            X.0951 r1 = r1.LLILLL
            if (r1 == 0) goto Lac
            java.lang.Object r3 = r1.getValue()
            X.0D4F r3 = (X.C0D4F) r3
        L3c:
            boolean r1 = r3 instanceof X.C0D4E
            if (r1 == 0) goto Laa
            X.0D4E r3 = (X.C0D4E) r3
            if (r3 == 0) goto Laa
            X.0D4D r1 = r3.LIZ
            if (r1 == 0) goto Laa
            X.0D3K r1 = r1.LIZIZ
            if (r1 == 0) goto Laa
            X.0D3V r3 = r1.skuSelection
            if (r3 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.selectedSkuOptions
            if (r4 != 0) goto L58
        L54:
            java.util.Map r4 = X.C2097608Jq.LJ()
        L58:
            java.util.Set r6 = r4.keySet()
            java.lang.String r7 = ","
            r8 = 0
            r10 = 0
            r14 = 0
            r13 = 62
            r9 = r8
            r11 = r8
            r12 = r8
            java.lang.String r10 = X.C13LP.LJJLIIIJ(r6, r7, r8, r9, r10, r11, r12, r13)
            int r1 = r10.length()
            if (r1 > 0) goto L71
            r10 = r5
        L71:
            java.util.Collection r12 = r4.values()
            java.lang.String r13 = ","
            r16 = 0
            r19 = 62
            r15 = r14
            r17 = r14
            r18 = r14
            java.lang.String r11 = X.C13LP.LJJLIIIJ(r12, r13, r14, r15, r16, r17, r18, r19)
            int r1 = r11.length()
            if (r1 > 0) goto L8b
            r11 = r5
        L8b:
            X.0D3h r1 = X.C0D3Z.LIZIZ(r3)
            boolean r5 = r1.LIZLLL
            X.0DBi r4 = r0.LLJILLL
            if (r4 == 0) goto Lb1
            X.0ckk r3 = X.C2265461Dlo.LIZ
            com.bytedance.ies.ugc.aweme.rich.model.CommonAdData r1 = r0.ee()
            kotlin.jvm.internal.AwS0S3002000_35 r0 = new kotlin.jvm.internal.AwS0S3002000_35
            r12 = 3
            r7 = r21
            r6 = r0
            r8 = r5
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.logAd(r3, r1, r0)
            return
        Laa:
            r3 = r5
            goto L54
        Lac:
            r3 = r5
            goto L3c
        Lae:
            r2 = r5
            goto L2e
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.SO(int):void");
    }

    public final void SR(String str) {
        String str2;
        Context context = getContext();
        boolean z = false;
        if (context == null) {
            CheckoutViewModel checkoutViewModel = this.LLILLL;
            if (checkoutViewModel != null) {
                checkoutViewModel.DQ2("Fallback checkout context is unavailable.", false);
                return;
            }
            return;
        }
        IEcpService iEcpService = (IEcpService) PluggableExtentionKt.pluggableSpi$default(IEcpService.class, false, false, false, 14, null);
        if (iEcpService != null) {
            CheckoutViewModel checkoutViewModel2 = this.LLILLL;
            if (checkoutViewModel2 != null) {
                checkoutViewModel2.GQ2();
            }
            C0DCM c0dcm = new C0DCM(context);
            c0dcm.LIZ = str;
            C0DIM.LIZ.getClass();
            c0dcm.LIZIZ = C0DIM.LIZ();
            InterfaceC335280DCk interfaceC335280DCk = this.LLJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cashier: get bridge for fallback reuse, hit=");
            if (interfaceC335280DCk != null) {
                z = true;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            c0dcm.LIZJ = interfaceC335280DCk;
            CheckoutViewModel checkoutViewModel3 = this.LLILLL;
            if (checkoutViewModel3 == null || (str2 = checkoutViewModel3.LLJLILLLLZIIL) == null) {
                str2 = "";
            }
            iEcpService.LIZIZ(new C0DCU(context, c0dcm.LIZ, c0dcm.LIZIZ, interfaceC335280DCk, str2), new InterfaceC334930DBb() { // from class: X.0D9f
                @Override // X.InterfaceC334930DBb
                public final void LIZJ() {
                    CheckoutViewModel checkoutViewModel4;
                    if (this.LIZ.isAdded() && (checkoutViewModel4 = this.LIZ.LLILLL) != null) {
                        checkoutViewModel4.DQ2(null, true);
                    }
                }

                @Override // X.InterfaceC334930DBb
                public final void LIZ(String str3) {
                    CheckoutViewModel checkoutViewModel4;
                    if (this.LIZ.isAdded() && (checkoutViewModel4 = this.LIZ.LLILLL) != null) {
                        checkoutViewModel4.DQ2(str3, false);
                    }
                }

                @Override // X.InterfaceC334930DBb
                public final void LIZIZ(C0DB2 c0db2, AwS213S0300000_4 awS213S0300000_4) {
                    if (!this.LIZ.isAdded()) {
                        C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("OnestepCheckoutFragment is not added"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        awS213S0300000_4.invoke(C189200o6.m1boximpl(c098200Yq));
                    } else {
                        CheckoutViewModel checkoutViewModel4 = this.LIZ.LLILLL;
                        if (checkoutViewModel4 != null) {
                            checkoutViewModel4.EQ2(c0db2, awS213S0300000_4);
                        }
                    }
                }

                @Override // X.InterfaceC334930DBb
                public final void LIZLLL(C334340D8u c334340D8u, AwS583S0100000_4 awS583S0100000_4) {
                    if (!this.LIZ.isAdded()) {
                        C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("OnestepCheckoutFragment is not added"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        awS583S0100000_4.invoke(C189200o6.m1boximpl(c098200Yq));
                    } else {
                        CheckoutViewModel checkoutViewModel4 = this.LIZ.LLILLL;
                        if (checkoutViewModel4 != null) {
                            checkoutViewModel4.FQ2(c334340D8u, awS583S0100000_4);
                        }
                    }
                }
            });
        }
    }

    public final void VR(int i) {
        String strIR2;
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        OR(MR());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        CheckoutViewModel checkoutViewModel = this.LLILLL;
        if (checkoutViewModel == null || (strIR2 = checkoutViewModel.iR2(null)) == null) {
            strIR2 = "";
        }
        C335000DBi c335000DBi = this.LLJILLL;
        if (c335000DBi != null) {
            c335000DBi.logAd(C0DEM.LIZ, ee(), new C0DEK(strIR2, i, jCurrentTimeMillis));
        }
    }

    public final void WR(int i) {
        if (!this.LLJJ && this.LLJJIII != 0) {
            this.LLJJ = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
            C335000DBi c335000DBi = this.LLJILLL;
            if (c335000DBi != null) {
                c335000DBi.logAd(C0DDZ.LIZ.LJIIIIZZ(EnumC335450DDb.ONE_STEP_CHECKOUT.getValue()), ee(), new C0DC3(jCurrentTimeMillis, i));
            }
        }
    }

    public final void bS(C0D4E c0d4e) {
        int i;
        C0D3V c0d3v;
        CheckoutIntent checkoutIntent;
        boolean z;
        Object value;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        AnonymousClass0951 anonymousClass0951;
        C334630D9x c334630D9x;
        C334430D9d c334430D9d;
        List<C334410D9b> list;
        C334410D9b c334410D9b;
        this.LLJJJJ = c0d4e;
        int iOrdinal = this.LLJJJ.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C335080DBq c335080DBq = this.LLJILJILJ;
                if (c335080DBq != null && (c334630D9x = c335080DBq.LIZIZ) != null && (c334430D9d = c334630D9x.LIZ) != null && (list = c334430D9d.products) != null && (c334410D9b = (C334410D9b) C13LP.LJJJLL(list)) != null) {
                    i = c334410D9b.quantity;
                } else {
                    i = this.LLJJJIL;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            i = c0d4e.LIZ.LIZJ;
        }
        C0D3K c0d3k = c0d4e.LIZ.LIZIZ;
        C0DAO c0dao = null;
        if (c0d3k != null) {
            c0d3v = c0d3k.skuSelection;
        } else {
            c0d3v = null;
        }
        OnestepCheckoutViewModel onestepCheckoutViewModel = this.LLILLJJLI;
        if (onestepCheckoutViewModel != null) {
            checkoutIntent = onestepCheckoutViewModel.LLJI;
        } else {
            checkoutIntent = null;
        }
        boolean z5 = false;
        if (checkoutIntent != null) {
            z = true;
        } else {
            z = false;
        }
        if (onestepCheckoutViewModel != null && (anonymousClass0951 = onestepCheckoutViewModel.LLIZ) != null) {
            value = anonymousClass0951.getValue();
        } else {
            value = null;
        }
        boolean zLJFF = Intrinsics.LJFF(value, C1901307cZ.LIZ);
        if (c0d3v == null || (str = c0d3v.selectedVariantId) == null || a0.LJJJIL(str) || (c0d3v != null && !c0d3v.availableForSale)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !C0D3Z.LIZIZ(c0d3v).LIZ();
        if (!zLJFF && z && !z2 && !z6) {
            z3 = false;
        } else {
            z3 = true;
        }
        C335080DBq c335080DBq2 = this.LLJILJILJ;
        if (c335080DBq2 != null) {
            c0dao = c335080DBq2.LJ;
        }
        if (!Intrinsics.LJFF(c0dao, C334790DAn.LIZ) && !Intrinsics.LJFF(c0dao, C0DB1.LIZ) && !(c0dao instanceof C0DAI) && !Intrinsics.LJFF(c0dao, C334800DAo.LIZ)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 || z4) {
            z5 = true;
        }
        boolean z7 = !z5;
        C11BJ c11bj = this.LLJJIJIL;
        if (c11bj != null) {
            this.LLJJJIL = i;
            c11bj.setQuantity(i);
            c11bj.setEnabled(z7);
        }
    }

    @Override // X.InterfaceC336390DGr
    public final void c3(FrameLayout frameLayout) {
        Activity activityLIZIZ;
        AbstractC334960DBe abstractC334960DBeLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            C335270DCj c335270DCj = this.LLJ;
            c335270DCj.LJ = frameLayout;
            if (c335270DCj.LIZIZ == null) {
                abstractC334960DBeLIZIZ = C334980DBg.LIZ;
            } else {
                abstractC334960DBeLIZIZ = c335270DCj.LIZIZ(activityLIZIZ, this);
            }
            if (Intrinsics.LJFF(abstractC334960DBeLIZIZ, C334990DBh.LIZ)) {
                HandlerHook.viewPost(frameLayout, new ARunnableS73S0200000_4(frameLayout, this, 8));
            } else {
                if (Intrinsics.LJFF(abstractC334960DBeLIZIZ, C334980DBg.LIZ)) {
                    return;
                }
                if (abstractC334960DBeLIZIZ instanceof C334970DBf) {
                    HandlerHook.viewPost(frameLayout, new ARunnableS37S0300000_4(frameLayout, this, abstractC334960DBeLIZIZ, 3));
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[PHI: r0
      0x002b: PHI (r0v6 java.lang.Integer) = (r0v3 java.lang.Integer), (r0v7 java.lang.Integer) binds: [B:23:0x0041, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int cS(android.content.DialogInterface r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L13
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.0De4 r2 = X.C1391190mJ3.LJIIJ(r4)
            X.0De4 r1 = X.C1391190mJ3.LJIIJJI(r4)
            boolean r0 = r2 instanceof X.C343970De7
            if (r0 == 0) goto L11
            r2 = r1
        L11:
            if (r2 != 0) goto L15
        L13:
            X.0De4 r2 = r3.LLJJJJJIL
        L15:
            r3.LLJJJJJIL = r2
            boolean r0 = r2 instanceof X.C343960De6
            r1 = 3
            if (r0 != 0) goto L49
            boolean r0 = r2 instanceof X.C343980De8
            if (r0 != 0) goto L49
            boolean r0 = r2 instanceof X.C344000DeA
            if (r0 == 0) goto L36
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L29:
            if (r0 == 0) goto L3f
        L2b:
            int r1 = r0.intValue()
        L2f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LLJJIJI = r0
            return r1
        L36:
            boolean r0 = r2 instanceof X.C343990De9
            if (r0 == 0) goto L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L29
        L3f:
            java.lang.Integer r0 = r3.LLJJIJI
            if (r0 != 0) goto L2b
            boolean r0 = r3.LLJJIJIIJIL
            if (r0 == 0) goto L2f
            r1 = 2
            goto L2f
        L49:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.cS(android.content.DialogInterface):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel r1 = r8.LLILLJJLI
            r5 = 1
            r2 = 0
            if (r1 == 0) goto L46
            X.0D2s r7 = r1.LLIZLLLIL
            if (r7 == 0) goto L46
            X.0D3K r0 = r1.LLJ
            if (r0 == 0) goto L46
            X.0D3V r6 = r0.skuSelection
            if (r6 == 0) goto L46
            X.0D5X r1 = r1.LLJILJILJ
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.selectedSkuOptions
            r4.<init>(r0)
            if (r1 == 0) goto L74
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.selectedSkuOptions
        L1f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L72
            java.lang.String r0 = r6.selectedVariantId
            if (r1 == 0) goto L2b
            java.lang.String r2 = r1.selectedVariantId
        L2b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L72
            r3 = 0
        L32:
            X.0D5X r2 = new X.0D5X
            X.0D2p r0 = r7.LIZIZ
            X.0D2l r0 = r0.identity
            java.lang.String r1 = r0.getUniqueId$ucp_impl_release()
            java.lang.String r0 = r6.selectedVariantId
            r2.<init>(r1, r4, r0, r3)
            X.1DDr r0 = X.C0D5Z.LIZJ
            r0.LIZJ(r2)
        L46:
            int r2 = r8.cS(r9)
            r8.VR(r2)
            r8.WR(r2)
            X.19EG r1 = r8.getActivity()
            boolean r0 = r1 instanceof X.C0DET
            if (r0 == 0) goto L64
            X.0DET r1 = (X.C0DET) r1
            if (r1 == 0) goto L64
            int r0 = r1.LLILLL
            if (r0 != 0) goto L62
            r1.LLILLL = r2
        L62:
            r1.LLILZ = r5
        L64:
            X.19EG r1 = r8.getActivity()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity
            if (r0 == 0) goto L71
            if (r1 == 0) goto L71
            r1.finish()
        L71:
            return
        L72:
            r3 = 1
            goto L32
        L74:
            r0 = r2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.onDismiss(android.content.DialogInterface):void");
    }

    public final void t4(boolean z) {
        int i;
        View viewFindViewById;
        int i2;
        View view = this.LLIZ;
        C0DC7 c0dc7 = this.LL;
        if (c0dc7 == null) {
            return;
        }
        ConstraintLayout constraintLayout = c0dc7.LLIZ.LL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LL(i, constraintLayout);
        if (view != null && (viewFindViewById = view.findViewById(R.id.vg5)) != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        }
        C786410Ut5.LLIZLLLIL(c0dc7.LLILZ, 0);
        C786410Ut5.LJZ(0, c0dc7.LLILLJJLI);
        C786410Ut5.LJZL(8, c0dc7.LLILZLL.LL);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        if (f < 0.0f) {
            this.LLJJIJIIJIL = true;
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        BottomSheetBehavior bottomSheetBehavior;
        if (i == 3) {
            String str = TuxSheet._pnsPageId;
            C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this);
            if ((c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null) {
                bottomSheetBehavior.setState(4);
            }
        }
    }

    public final void UR(String str, String str2) {
        C335000DBi c335000DBi = this.LLJILLL;
        if (c335000DBi == null) {
            return;
        }
        c335000DBi.logAd(C0DEO.LIZ.LJIIIIZZ("one_step_checkout"), ee(), new AwS32S2100000_4(str, str2, this, 1));
    }

    public final void ZR(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onestep.address.refresh.start source=");
        sbLIZ.append(str);
        sbLIZ.append(" clearWhenMissing=");
        sbLIZ.append(z);
        sbLIZ.append(" currentSelectedAddressId=");
        String str2 = this.LLJI;
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append(" hasResolvedInitialAddress=");
        sbLIZ.append(this.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C334170D8d(this, str, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2 A[PHI: r15
      0x01a2: PHI (r15v5 X.0D9u) = (r15v4 X.0D9u), (r15v9 X.0D9u) binds: [B:102:0x0177, B:109:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(X.C0D4D r24, X.C335080DBq r25) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.aS(X.0D4D, X.0DBq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3t, viewGroup, false);
        int i = R.id.cah;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.cah, viewTd);
        if (frameLayout != null) {
            i = R.id.dr8;
            C0DDL c0ddl = (C0DDL) C1616006Uk.LIZ(R.id.dr8, viewTd);
            if (c0ddl != null) {
                i = R.id.eu8;
                RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.eu8, viewTd);
                if (recyclerView != null) {
                    i = R.id.l5x;
                    TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l5x, viewTd);
                    if (tuxIconView != null) {
                        i = R.id.m6x;
                        View viewLIZ = C1616006Uk.LIZ(R.id.m6x, viewTd);
                        if (viewLIZ != null) {
                            int i2 = R.id.cmd;
                            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.cmd, viewLIZ);
                            if (c197039127h != null) {
                                i2 = R.id.m6y;
                                if (C1616006Uk.LIZ(R.id.m6y, viewLIZ) != null) {
                                    i2 = R.id.z3s;
                                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z3s, viewLIZ);
                                    if (tuxTextView != null) {
                                        i2 = R.id.z3t;
                                        if (C1616006Uk.LIZ(R.id.z3t, viewLIZ) != null) {
                                            C0DCL c0dcl = new C0DCL((LinearLayout) viewLIZ, c197039127h, tuxTextView);
                                            i = R.id.m7r;
                                            View viewLIZ2 = C1616006Uk.LIZ(R.id.m7r, viewTd);
                                            if (viewLIZ2 != null) {
                                                int i3 = R.id.ve1;
                                                if (C1616006Uk.LIZ(R.id.ve1, viewLIZ2) != null) {
                                                    i3 = R.id.ve3;
                                                    if (C1616006Uk.LIZ(R.id.ve3, viewLIZ2) != null) {
                                                        i3 = R.id.ve4;
                                                        if (C1616006Uk.LIZ(R.id.ve4, viewLIZ2) != null) {
                                                            i3 = R.id.ve5;
                                                            View viewLIZ3 = C1616006Uk.LIZ(R.id.ve5, viewLIZ2);
                                                            if (viewLIZ3 != null) {
                                                                i3 = R.id.ve6;
                                                                View viewLIZ4 = C1616006Uk.LIZ(R.id.ve6, viewLIZ2);
                                                                if (viewLIZ4 != null) {
                                                                    i3 = R.id.ve7;
                                                                    View viewLIZ5 = C1616006Uk.LIZ(R.id.ve7, viewLIZ2);
                                                                    if (viewLIZ5 != null) {
                                                                        i3 = R.id.ve8;
                                                                        View viewLIZ6 = C1616006Uk.LIZ(R.id.ve8, viewLIZ2);
                                                                        if (viewLIZ6 != null) {
                                                                            i3 = R.id.ve9;
                                                                            View viewLIZ7 = C1616006Uk.LIZ(R.id.ve9, viewLIZ2);
                                                                            if (viewLIZ7 != null) {
                                                                                i3 = R.id.ve_;
                                                                                View viewLIZ8 = C1616006Uk.LIZ(R.id.ve_, viewLIZ2);
                                                                                if (viewLIZ8 != null) {
                                                                                    i3 = R.id.vea;
                                                                                    View viewLIZ9 = C1616006Uk.LIZ(R.id.vea, viewLIZ2);
                                                                                    if (viewLIZ9 != null) {
                                                                                        i3 = R.id.vec;
                                                                                        if (C1616006Uk.LIZ(R.id.vec, viewLIZ2) != null) {
                                                                                            i3 = R.id.ved;
                                                                                            if (C1616006Uk.LIZ(R.id.ved, viewLIZ2) != null) {
                                                                                                i3 = R.id.vee;
                                                                                                if (C1616006Uk.LIZ(R.id.vee, viewLIZ2) != null) {
                                                                                                    i3 = R.id.vef;
                                                                                                    View viewLIZ10 = C1616006Uk.LIZ(R.id.vef, viewLIZ2);
                                                                                                    if (viewLIZ10 != null) {
                                                                                                        i3 = R.id.veg;
                                                                                                        View viewLIZ11 = C1616006Uk.LIZ(R.id.veg, viewLIZ2);
                                                                                                        if (viewLIZ11 != null) {
                                                                                                            C0DCT c0dct = new C0DCT((ConstraintLayout) viewLIZ2, viewLIZ3, viewLIZ4, viewLIZ5, viewLIZ6, viewLIZ7, viewLIZ8, viewLIZ9, viewLIZ10, viewLIZ11);
                                                                                                            i = R.id.y6m;
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.y6m, viewTd);
                                                                                                            if (constraintLayout != null) {
                                                                                                                i = R.id.z7j;
                                                                                                                if (C1616006Uk.LIZ(R.id.z7j, viewTd) != null) {
                                                                                                                    this.LL = new C0DC7((ConstraintLayout) viewTd, frameLayout, c0ddl, recyclerView, tuxIconView, c0dcl, c0dct, constraintLayout);
                                                                                                                    PR().LL.setLayoutDirection(3);
                                                                                                                    PR().LL.setTextDirection(5);
                                                                                                                    ConstraintLayout constraintLayout2 = PR().LL;
                                                                                                                    C19GS c19gs = null;
                                                                                                                    if (!(constraintLayout2 instanceof View)) {
                                                                                                                        constraintLayout2 = null;
                                                                                                                    }
                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                        try {
                                                                                                                            ViewTreeLifecycleOwner.set(constraintLayout2, getViewLifecycleOwner());
                                                                                                                            ViewTreeViewModelStoreOwner.set(constraintLayout2, this);
                                                                                                                            constraintLayout2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                                                                                                            C19EG activity = getActivity();
                                                                                                                            if (activity instanceof C19GS) {
                                                                                                                                c19gs = (C19GS) activity;
                                                                                                                            }
                                                                                                                            C1685300txQ.LIZ(c19gs);
                                                                                                                        } catch (Throwable th) {
                                                                                                                            TryCatchGuardChecker.doCheck(th);
                                                                                                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                                                                                                            return constraintLayout2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                                                                                                    return constraintLayout2;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ2.getResources().getResourceName(i3)));
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ.getResources().getResourceName(i2)));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
