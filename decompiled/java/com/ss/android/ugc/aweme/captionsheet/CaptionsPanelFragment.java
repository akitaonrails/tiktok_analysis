package com.ss.android.ugc.aweme.captionsheet;

import X.AbstractC1604130rqV;
import X.AbstractC848400XPy;
import X.C004U;
import X.C01GW;
import X.C05RH;
import X.C09IC;
import X.C0A7X;
import X.C0BJA;
import X.C0OM1;
import X.C0S58;
import X.C0SCU;
import X.C0XQ7;
import X.C1238760iLC;
import X.C1308910kAL;
import X.C13LP;
import X.C13LQ;
import X.C1554610qYd;
import X.C161N;
import X.C1629806Zs;
import X.C1697810uHb;
import X.C1839820xye;
import X.C19292910dr;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19323610io;
import X.C20693015yC;
import X.C20693915yL;
import X.C20697815yy;
import X.C20698415z4;
import X.C20700315zN;
import X.C20703515zt;
import X.C2188811AlT;
import X.C23250099c;
import X.C2738014e;
import X.C305370By3;
import X.C338700DPo;
import X.C418440Gaw;
import X.C452501pT;
import X.C708270RqL;
import X.C746760TRa;
import X.C786410Ut5;
import X.C814420VxA;
import X.C861640Xr8;
import X.EnumC1390800mIQ;
import X.EnumC20698315z3;
import X.EnumC715590S5d;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import X.InterfaceC20698115z1;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1077400e8w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS12S0120000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class CaptionsPanelFragment extends BaseCaptionSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6HELIOSJys/ISo2PGsPKD8nISoiOh8yJiAgDz0yLygpJzs=";
    public final EnumC20698315z3 LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C20693015yC LLJI;
    public C19292910dr LLJIJIL;
    public C20693915yL LLJILJIL;
    public C19292910dr LLJILJILJ;
    public C1238760iLC LLJILLL;
    public String[] LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final ITranslationFeedbackDelegate LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final CaptionsPanelFragment$captionSheetParamsProvider$1 LLJJJ;
    public final CaptionsPanelFragment$clickSeeTranslationParamsProvider$1 LLJJJIL;

    public CaptionsPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean RR() {
        return false;
    }

    public final String dS() {
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        return C20703515zt.LIZ(c20698415z4 != null ? c20698415z4.LIZ() : null, this.LLJJ, Boolean.valueOf(C746760TRa.LIZ().LJLILLLLZI()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19319110i5 gS() {
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        return new C19319110i5(new C19319010i4("", true, false, objArr, objArr2, null, null == true ? 1 : 0, null == true ? 1 : 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null == true ? 1 : 0, objArr3, objArr4, 56316));
    }

    public final String getEnterFrom() {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null) {
            return null;
        }
        return interfaceC20698115z1.getEnterFrom();
    }

    public final EnumC1390800mIQ getEnterMethod() {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null) {
            return null;
        }
        return interfaceC20698115z1.getEnterMethod();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public String getTitle() {
        return (String) this.LLJJIII.getValue();
    }

    public final AbstractC1604130rqV hS() {
        return (AbstractC1604130rqV) this.LLJJIJIL.getValue();
    }

    public final void mS() {
        C20693015yC c20693015yC = this.LLJI;
        if (c20693015yC != null) {
            C1238760iLC c1238760iLC = new C1238760iLC(new C19323610io(getString(2131828820), null, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 16777214));
            this.LLJILLL = c1238760iLC;
            c20693015yC.LIZ(c1238760iLC);
        }
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C20697815yy(this, null), new C1629806Zs(new C05RH(C1839820xye.LIZ().LIZIZ()))));
    }

    public void oS() {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null) {
            return;
        }
        interfaceC20698115z1.iQ();
    }

    public void qS() {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null) {
            return;
        }
        interfaceC20698115z1.Ol(EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1Sn = super.Sn();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            c0om1Sn.LIZJ(numLIZJ.intValue());
        }
        c0om1Sn.LIZLLL = false;
        return c0om1Sn;
    }

    public final void ZR() {
        if (C1839820xye.LIZ().LJII() == null || C1839820xye.LIZ().LJIIIIZZ().getDoNotTranslateList() == null) {
            OR(new AwS610S0100000_31(this, 138));
            return;
        }
        C1238760iLC c1238760iLC = this.LLILZIL;
        if (c1238760iLC != null) {
            c1238760iLC.LJI(new AwS610S0100000_31(this, 551));
        }
        C1238760iLC c1238760iLC2 = this.LLJILLL;
        if (c1238760iLC2 != null) {
            c1238760iLC2.LJI(new AwS610S0100000_31(this, 550));
        }
        rS(this.LLJJ);
    }

    public String aS() {
        InterfaceC20698115z1 interfaceC20698115z1;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String[] strArr;
        InterfaceC20698115z1 interfaceC20698115z12;
        String[] strArr2;
        InterfaceC20698115z1 interfaceC20698115z13;
        InterfaceC20698115z1 interfaceC20698115z14;
        InterfaceC20698115z1 interfaceC20698115z15;
        InterfaceC20698115z1 interfaceC20698115z16;
        if (iS() == EnumC20698315z3.LANDSCAPE_CAPTIONS) {
            return null;
        }
        if (C0A7X.LIZ()) {
            C20698415z4 c20698415z4 = this.LLILLJJLI;
            if (C20703515zt.LJJI((c20698415z4 == null || (interfaceC20698115z16 = c20698415z4.LIZ) == null) ? null : interfaceC20698115z16.getAweme())) {
                C20703515zt c20703515zt = C20703515zt.LIZ;
                C20698415z4 c20698415z42 = this.LLILLJJLI;
                Aweme aweme2 = (c20698415z42 == null || (interfaceC20698115z15 = c20698415z42.LIZ) == null) ? null : interfaceC20698115z15.getAweme();
                c20703515zt.getClass();
                if (C20703515zt.LJIL(aweme2) && C746760TRa.LIZ().LJLILLLLZI() && !uS(true)) {
                    C20698415z4 c20698415z43 = this.LLILLJJLI;
                    if (C0SCU.LIZ().LLFFF((c20698415z43 == null || (interfaceC20698115z14 = c20698415z43.LIZ) == null) ? null : interfaceC20698115z14.getAweme(), true)) {
                        C20698415z4 c20698415z44 = this.LLILLJJLI;
                        String strLJIIIZ = C20703515zt.LJIIIZ((c20698415z44 == null || (interfaceC20698115z13 = c20698415z44.LIZ) == null) ? null : interfaceC20698115z13.getAweme());
                        if (strLJIIIZ != null && (strArr2 = this.LLJJ) != null && C13LQ.LJJIJIIJI(strLJIIIZ, strArr2) >= 0) {
                            return getString(2131828382);
                        }
                    }
                }
            }
        }
        C20698415z4 c20698415z45 = this.LLILLJJLI;
        Aweme aweme3 = (c20698415z45 == null || (interfaceC20698115z12 = c20698415z45.LIZ) == null) ? null : interfaceC20698115z12.getAweme();
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        String strLJIIIZ2 = C20703515zt.LJIIIZ(aweme3);
        if (C20703515zt.LJJI(aweme3) && !Intrinsics.LJFF(strLLIIZ, strLJIIIZ2) && !C0SCU.LIZ().LLFFF(aweme3, true) && ((strArr = this.LLJJ) == null || C13LQ.LJJIJIIJI(strLJIIIZ2, strArr) < 0)) {
            return getString(2131828783);
        }
        C20698415z4 c20698415z46 = this.LLILLJJLI;
        if (c20698415z46 != null && (interfaceC20698115z1 = c20698415z46.LIZ) != null && (aweme = interfaceC20698115z1.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isAdvertiserDisbaleTranslation()) {
            return getString(2131828783);
        }
        if (C0A7X.LIZ()) {
            return null;
        }
        return (!C0BJA.LIZIZ() || C0S58.LIZ) ? getString(2131838820) : getString(2131829021);
    }

    public final void kS() {
        boolean zLJJJLZIJ = C746760TRa.LIZ().LJJJLZIJ();
        C20693015yC c20693015yC = this.LLJI;
        if (c20693015yC != null) {
            C19292910dr c19292910dr = new C19292910dr(new C19319810iC(zLJJJLZIJ, getString(2131838819), null, false, null, null, null, null, false, false, false, null, 131068));
            this.LLJILJILJ = c19292910dr;
            c20693015yC.LIZ(c19292910dr);
        }
        C19292910dr c19292910dr2 = this.LLJILJILJ;
        if (c19292910dr2 != null) {
            c19292910dr2.LJI(new AwS397S0200000_31(c19292910dr2, this, 41));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C708270RqL(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        this.LLJJ = C20700315zN.LIZJ();
        wS(this.LLJJ);
        if (PR()) {
            View viewFindViewById = this.LLJ;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
                this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
            if (PR()) {
                C786410Ut5.x3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077400e8w(this, viewOnAttachStateChangeListenerC20604515jv, 2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC665370Q7z interfaceC665370Q7zRx;
        InterfaceC20698115z1 interfaceC20698115z12;
        InterfaceC665370Q7z interfaceC665370Q7zRx2;
        super.onStart();
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null && (interfaceC665370Q7zRx2 = interfaceC20698115z12.rx()) != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zRx2, ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLJJJ));
        }
        C20698415z4 c20698415z42 = this.LLILLJJLI;
        if (c20698415z42 == null || (interfaceC20698115z1 = c20698415z42.LIZ) == null || (interfaceC665370Q7zRx = interfaceC20698115z1.rx()) == null) {
            return;
        }
        C1554610qYd.LIZJ(interfaceC665370Q7zRx, ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLJJJIL));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC665370Q7z interfaceC665370Q7zRx;
        InterfaceC20698115z1 interfaceC20698115z12;
        InterfaceC665370Q7z interfaceC665370Q7zRx2;
        super.onStop();
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null && (interfaceC665370Q7zRx2 = interfaceC20698115z12.rx()) != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zRx2, ETParamsProvider.class, this.LLJJJ);
        }
        C20698415z4 c20698415z42 = this.LLILLJJLI;
        if (c20698415z42 == null || (interfaceC20698115z1 = c20698415z42.LIZ) == null || (interfaceC665370Q7zRx = interfaceC20698115z1.rx()) == null) {
            return;
        }
        C1554610qYd.LIZLLL(interfaceC665370Q7zRx, ETParamsProvider.class, this.LLJJJIL);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C20693015yC SR() {
        return this.LLJI;
    }

    public EnumC20698315z3 iS() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionSheetParamsProvider$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$clickSeeTranslationParamsProvider$1] */
    public CaptionsPanelFragment(int i) {
        this.LLIZLLLIL = EnumC20698315z3.CAPTIONS;
        this.LLJJI = true;
        this.LLJJIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1581));
        C20703515zt.LIZ.getClass();
        this.LLJJIJI = C20703515zt.LIZIZ.LIZLLL();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1586));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(542));
        this.LLJJJ = new ETParamsProvider<C004U>() { // from class: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionSheetParamsProvider$1
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final InterfaceC0241006d Mb0() {
                String value;
                EnumC1390800mIQ enterMethod = this.LL.getEnterMethod();
                if (enterMethod == null || (value = enterMethod.getValue()) == null) {
                    value = "";
                }
                return new C004U(value, this.LL.dS());
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC1282004zy getParam() {
                String value;
                if (!lt2(C004U.class)) {
                    return null;
                }
                EnumC1390800mIQ enterMethod = this.LL.getEnterMethod();
                if (enterMethod == null || (value = enterMethod.getValue()) == null) {
                    value = "";
                }
                return new C004U(value, this.LL.dS());
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
                return Intrinsics.LJFF(cls, C004U.class);
            }
        };
        this.LLJJJIL = new ETParamsProvider<C2738014e>() { // from class: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$clickSeeTranslationParamsProvider$1
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final InterfaceC0241006d Mb0() {
                return new C2738014e("switch_toggle", null);
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC1282004zy getParam() {
                if (lt2(C2738014e.class)) {
                    return new C2738014e("switch_toggle", null);
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
                return Intrinsics.LJFF(cls, C004U.class);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final void WR(String str) {
        Aweme aweme;
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC20698115z1 interfaceC20698115z12;
        super.WR(str);
        AbstractC1604130rqV abstractC1604130rqVHS = hS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsPanelFragment onTranslationLangChanged: ");
        sbLIZ.append(str);
        abstractC1604130rqVHS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C305370By3.LIZ) {
            C20698415z4 c20698415z4 = this.LLILLJJLI;
            Aweme aweme2 = null;
            if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null) {
                aweme = interfaceC20698115z12.getAweme();
            } else {
                aweme = null;
            }
            boolean zLJJI = C20703515zt.LJJI(aweme);
            C20703515zt c20703515zt = C20703515zt.LIZ;
            C20698415z4 c20698415z42 = this.LLILLJJLI;
            if (c20698415z42 != null && (interfaceC20698115z1 = c20698415z42.LIZ) != null) {
                aweme2 = interfaceC20698115z1.getAweme();
            }
            c20703515zt.getClass();
            boolean zLJIL = C20703515zt.LJIL(aweme2);
            C19292910dr c19292910dr = this.LLJIJIL;
            if (c19292910dr != null) {
                c19292910dr.LJI(new AwS12S0120000_31(this, zLJJI, zLJIL, 2));
            }
        }
        wS(this.LLJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String cS(boolean r7) {
        /*
            r6 = this;
            X.15zt r0 = X.C20703515zt.LIZ
            r0.getClass()
            X.161N r1 = X.C20703515zt.LIZIZ
            X.15z4 r0 = r6.LLILLJJLI
            r5 = 0
            if (r0 == 0) goto L8f
            X.15z1 r0 = r0.LIZ
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L14:
            boolean r4 = r1.LJIILL(r0, r5, r5)
            X.15z4 r0 = r6.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L36
            X.15z1 r0 = r0.LIZ
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            if (r2 == 0) goto L36
            int r1 = r2.getAwemeType()
            r0 = 77
            if (r1 != r0) goto L36
            boolean r0 = r2.isAd()
            if (r0 == 0) goto L36
            r4 = 0
        L36:
            X.01GW r0 = X.C0A7Q.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L59
            if (r4 != 0) goto L58
            X.15z4 r0 = r6.LLILLJJLI
            if (r0 == 0) goto L52
            X.15z1 r0 = r0.LIZ
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.getAweme()
        L52:
            boolean r0 = X.C20703515zt.LJJ(r5)
            if (r0 == 0) goto L59
        L58:
            r3 = 1
        L59:
            r2 = 2131828818(0x7f112052, float:1.9290588E38)
            if (r7 == 0) goto L91
            X.15z3 r1 = r6.iS()
            X.15z3 r0 = X.EnumC20698315z3.LANDSCAPE_CAPTIONS
            if (r1 != r0) goto L8a
            r0 = 2131828821(0x7f112055, float:1.9290594E38)
            java.lang.String r0 = r6.getString(r0)
        L6d:
            if (r3 == 0) goto L89
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r0 = 2131828817(0x7f112051, float:1.9290586E38)
            java.lang.String r0 = r6.getString(r0)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
        L89:
            return r0
        L8a:
            java.lang.String r0 = r6.getString(r2)
            goto L6d
        L8f:
            r0 = r5
            goto L14
        L91:
            boolean r0 = X.C0A7X.LIZ()
            if (r0 == 0) goto L9c
            java.lang.String r0 = r6.getString(r2)
            return r0
        L9c:
            r0 = 2131828816(0x7f112050, float:1.9290584E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment.cS(boolean):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0301  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void nS(android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment.nS(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (!(this instanceof LandscapeCaptionPanelFragment)) {
            sS(context);
        }
    }

    public final void rS(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            C1238760iLC c1238760iLC = this.LLJILLL;
            if (c1238760iLC != null) {
                c1238760iLC.LJI(AFwS276S0000000_31.get$arr$(54));
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                C20703515zt.LIZ.getClass();
                arrayList.add(C20703515zt.LJII(str));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
            C1238760iLC c1238760iLC2 = this.LLJILLL;
            if (c1238760iLC2 != null) {
                c1238760iLC2.LJIIIIZZ(strLJJLIIIJ);
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        Context context = getContext();
        TuxTextView tuxTextView = null;
        if (context != null) {
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            tuxTextView = tuxTextView2;
            tuxTextView2.setText(getString(2131828825));
            tuxTextView2.setTextColorRes(R.attr.bb);
            tuxTextView2.setTuxFont(42);
        }
        linearLayout.addView(tuxTextView);
        C1238760iLC c1238760iLC3 = this.LLJILLL;
        if (c1238760iLC3 != null) {
            c1238760iLC3.LJI(new AwS610S0100000_31(linearLayout, 139));
        }
    }

    public void sS(Context context) {
        context.setTheme(R.style.my);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean uS(boolean r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L3d
            X.15zt r4 = X.C20703515zt.LIZ
            X.15z4 r0 = r6.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LIZ()
        Le:
            com.ss.android.ugc.aweme.service.ICaptionKevaService r0 = X.C746760TRa.LIZ()
            boolean r0 = r0.LJLILLLLZI()
            if (r0 == 0) goto L2e
            java.lang.String[] r1 = r6.LLJJ
            if (r1 == 0) goto L3e
            X.15z4 r0 = r6.LLILLJJLI
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LIZ()
        L24:
            java.lang.String r0 = X.C20703515zt.LJIIIZ(r3)
            int r0 = X.C13LQ.LJJIJIIJI(r0, r1)
            if (r0 < 0) goto L3e
        L2e:
            r0 = 1
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.getClass()
            boolean r0 = X.C20703515zt.LJJIIZI(r2, r0)
            if (r0 == 0) goto L3d
            r5 = 1
        L3d:
            return r5
        L3e:
            r0 = 0
            goto L2f
        L40:
            r2 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment.uS(boolean):boolean");
    }

    public final void wS(String[] strArr) {
        Aweme aweme;
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC20698115z1 interfaceC20698115z12;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        Aweme aweme2 = null;
        if (c20698415z4 != null && (interfaceC20698115z12 = c20698415z4.LIZ) != null) {
            aweme = interfaceC20698115z12.getAweme();
        } else {
            aweme = null;
        }
        boolean zLJJI = C20703515zt.LJJI(aweme);
        C20703515zt c20703515zt = C20703515zt.LIZ;
        C20698415z4 c20698415z42 = this.LLILLJJLI;
        if (c20698415z42 != null && (interfaceC20698115z1 = c20698415z42.LIZ) != null) {
            aweme2 = interfaceC20698115z1.getAweme();
        }
        c20703515zt.getClass();
        boolean zLJIL = C20703515zt.LJIL(aweme2);
        C19292910dr c19292910dr = this.LLJIJIL;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS12S0120000_31(this, zLJIL, zLJJI, 0));
        }
        C20693915yL c20693915yL = this.LLJILJIL;
        if (c20693915yL != null) {
            c20693915yL.LJI(new AwS610S0100000_31(this, 140));
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1238760iLC c1238760iLC = this.LLJILLL;
            if (c1238760iLC != null) {
                c1238760iLC.LJI(AFwS276S0000000_31.get$arr$(55));
            }
            C1238760iLC c1238760iLC2 = this.LLILZIL;
            if (c1238760iLC2 != null) {
                c1238760iLC2.LJI(AFwS276S0000000_31.get$arr$(56));
                return;
            }
            return;
        }
        rS(strArr);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public View VR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.adc, viewGroup, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        if (X.C20703515zt.LIZLLL(r0) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String bS(boolean r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment.bS(boolean, boolean):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rn0);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        this.LLJI = new C20693015yC((ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById);
        nS(view);
        this.LLJJI = false;
        C20693015yC c20693015yC = this.LLJI;
        if (c20693015yC != null) {
            c20693015yC.LJ();
        }
        if (this.LLIZ) {
            view.getLayoutParams().width = C338700DPo.LIZ;
        }
    }
}
