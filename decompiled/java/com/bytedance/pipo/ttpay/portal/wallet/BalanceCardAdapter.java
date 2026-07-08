package com.bytedance.pipo.ttpay.portal.wallet;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1227904rF;
import X.C13LE;
import X.C1697810uHb;
import X.C1720520usE;
import X.C1720610usN;
import X.C1720680usU;
import X.C1721300utU;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1720670usT;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1720550usH;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BalanceCardAdapter extends StellarCardAdapter<C1720610usN> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BalanceCardAdapter.class, "vm", "getVm()Lcom/bytedance/pipo/stellar/base/fragment/StellarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1720230url
    public final String LLFII() {
        return "balance";
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void P5() {
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

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i33;
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

    public BalanceCardAdapter() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StellarViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 81);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(55);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 63), awS570S0100000_26, AFwS215S0000000_26.get$arr$(23), new AwS570S0100000_26((C03K6) this, 66), new AwS570S0100000_26((C03K6) this, 68), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 70), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 72), null, new AwS570S0100000_26((C03K6) this, 73));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 67);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 69);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 71);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 6));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 74);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 76);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 77);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 78);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 79);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 80), awS570S0100000_26, AFwS215S0000000_26.get$arr$(24), new AwS570S0100000_26((C03K6) this, 82), new AwS570S0100000_26((C03K6) this, 83), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 84), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 85), null, new AwS570S0100000_26((C03K6) this, 86));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 87), awS570S0100000_26, AFwS215S0000000_26.get$arr$(25), new AwS570S0100000_26((C03K6) this, 88), new AwS570S0100000_26((C03K6) this, 89), new AwS570S0100000_26((C03K6) this, 90), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 91));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = "verifiedTag";
        this.LLJI = "verifiedImgTag";
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 75));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 65));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 64));
    }

    public final GridLayout W5() {
        return (GridLayout) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final EnumC1720670usT S5() {
        return EnumC1720670usT.DARK;
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void I5(InterfaceC1720550usH interfaceC1720550usH) {
        C1721300utU c1721300utU = C1721300utU.LIZ;
        View viewFindViewById = this.itemView.findViewById(R.id.bqp);
        BackgroundDO backgroundDO = ((C1720610usN) interfaceC1720550usH).LLJI;
        c1721300utU.getClass();
        C1721300utU.LIZ(viewFindViewById, backgroundDO, null);
    }

    @Override // X.InterfaceC1720230url
    public final InterfaceC1720550usH J2(CardDO cardDO) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String cardData = cardDO.getCardData();
        c1227904rF.getClass();
        BalanceDO balanceDO = (BalanceDO) C1227904rF.LIZIZ(cardData, BalanceDO.class);
        String id = cardDO.getId();
        if (id == null) {
            id = "";
        }
        String sectionId = cardDO.getSectionId();
        Map<String, Object> sectionTrackingParams = cardDO.getSectionTrackingParams();
        String type = cardDO.getType();
        if (type == null) {
            type = "balance";
        }
        String height = cardDO.getHeight();
        String str = "-2";
        if (height == null) {
            height = "-2";
        }
        String width = cardDO.getWidth();
        if (width != null) {
            str = width;
        }
        MarginDO margin = cardDO.getMargin();
        MarginDO cardPadding = cardDO.getCardPadding();
        StellarActionDO action = cardDO.getAction();
        BackgroundDO background = cardDO.getBackground();
        C1720680usU c1720680usU = EnumC1720670usT.Companion;
        String theme = cardDO.getTheme();
        c1720680usU.getClass();
        return new C1720610usN(id, sectionId, sectionTrackingParams, type, height, str, margin, cardPadding, action, background, C1720680usU.LIZ(theme), C1720520usE.LIZ(cardDO, null), cardDO.getLayoutGravity(), balanceDO);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void L5(InterfaceC1720550usH interfaceC1720550usH) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        C1720610usN c1720610usN = (C1720610usN) interfaceC1720550usH;
        C1721300utU c1721300utU = C1721300utU.LIZ;
        View view = this.itemView;
        MarginDO marginDO = c1720610usN.LLIZ;
        String str = c1720610usN.LLILZLL;
        String str2 = c1720610usN.LLILZIL;
        c1721300utU.getClass();
        C1721300utU.LIZLLL(view, marginDO, null, str, str2);
        View viewFindViewById = this.itemView.findViewById(R.id.bqp);
        MarginDO marginDO2 = c1720610usN.LLIZLLLIL;
        if (marginDO2 != null) {
            String str3 = marginDO2.start;
            int iIntValue4 = 0;
            if (str3 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str3)) != null) {
                iIntValue = numLJIIJJI4.intValue();
            } else {
                iIntValue = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            String str4 = marginDO2.top;
            if (str4 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str4)) != null) {
                iIntValue2 = numLJIIJJI3.intValue();
            } else {
                iIntValue2 = 0;
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            String str5 = marginDO2.end;
            if (str5 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
                iIntValue3 = numLJIIJJI2.intValue();
            } else {
                iIntValue3 = 0;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
            String str6 = marginDO2.bottom;
            if (str6 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str6)) != null) {
                iIntValue4 = numLJIIJJI.intValue();
            }
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ3), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4)))), 16);
        }
    }

    public static final void V5(View view, boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.faw), Integer.valueOf(R.id.fau)).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(iIntValue);
            ViewGroup.LayoutParams layoutParams = view.findViewById(iIntValue).getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:108|(2:110|(1:112))(1:138)|113|(2:128|(0)(2:131|(8:121|(1:123)(2:134|(0)(21:137|127|301|171|(1:177)(1:175)|176|180|(1:182)|183|(1:185)(1:186)|299|187|(1:189)(1:191)|190|194|(1:196)|197|(4:199|(1:201)|202|(3:204|(3:207|(12:209|(1:211)|212|(1:214)|(1:218)|219|(1:221)(5:229|(1:231)|225|(2:227|305)(1:306)|228)|222|(1:224)|225|(0)(0)|228)(3:304|234|235)|205)|303))(1:232)|233|202|(0)))|124|(1:126)(0)|127|301|171|(18:173|177|176|180|(0)|183|(0)(0)|299|187|(0)(0)|190|194|(0)|197|(0)(0)|233|202|(0))(0))(0)))(1:117)|118|(1:120)(0)|121|(0)(0)|124|(0)(0)|127|301|171|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x041b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x041c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        r4 = new X.C098200Yq(r3);
        X.C189200o6.m2constructorimpl(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fd A[PHI: r13
      0x02fd: PHI (r13v4 java.lang.Integer) = (r13v3 java.lang.Integer), (r13v11 java.lang.Integer) binds: [B:129:0x02fa, B:119:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0301 A[PHI: r13 r14
      0x0301: PHI (r13v5 java.lang.Integer) = (r13v4 java.lang.Integer), (r13v10 java.lang.Integer) binds: [B:132:0x02fe, B:122:0x02cc] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r14v2 java.lang.Integer) = (r14v1 java.lang.Integer), (r14v7 java.lang.Integer) binds: [B:132:0x02fe, B:122:0x02cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305 A[PHI: r13 r14 r15
      0x0305: PHI (r13v6 java.lang.Integer) = (r13v5 java.lang.Integer), (r13v9 java.lang.Integer) binds: [B:135:0x0302, B:125:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r14v3 java.lang.Integer) = (r14v2 java.lang.Integer), (r14v6 java.lang.Integer) binds: [B:135:0x0302, B:125:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r15v3 java.lang.Integer) = (r15v2 java.lang.Integer), (r15v9 java.lang.Integer) binds: [B:135:0x0302, B:125:0x02dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0409 A[Catch: all -> 0x041b, TryCatch #1 {all -> 0x041b, blocks: (B:171:0x0405, B:173:0x0409, B:175:0x040d, B:176:0x0411), top: B:301:0x0405 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043d A[Catch: all -> 0x0455, TryCatch #0 {all -> 0x0455, blocks: (B:187:0x0439, B:189:0x043d, B:190:0x0441), top: B:299:0x0439 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06f2 A[PHI: r7
      0x06f2: PHI (r7v5 ??) = (r7v4 ??), (r7v23 ??) binds: [B:290:0x06d8, B:241:0x05f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Type inference failed for: r3v46, types: [android.view.ViewGroup, android.widget.GridLayout] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.bytedance.pipo.stellar.base.model.BaseWidgetDO, com.bytedance.pipo.stellar.base.model.ButtonDO] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.bytedance.pipo.stellar.base.model.BaseWidgetDO, com.bytedance.pipo.stellar.base.model.ButtonDO] */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.bytedance.pipo.stellar.base.model.BaseWidgetDO, com.bytedance.pipo.stellar.base.model.ButtonDO] */
    /* JADX WARN: Type inference failed for: r9v30 */
    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(android.view.View r22, X.InterfaceC1720550usH r23) {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ttpay.portal.wallet.BalanceCardAdapter.N5(android.view.View, X.0usH):void");
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void T5(View view, ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTag(this.LLJ);
        C426750GoL.LJIIIZ(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
        ((ViewGroup) view.findViewById(R.id.verified_pill)).addView(tuxTextView);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || layoutParams2 == null) {
            layoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        C786410Ut5.d6(linearLayout, layoutParams2);
        linearLayout.setTag(this.LLJI);
        C426750GoL.LJIIIZ(linearLayout, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
        ((ViewGroup) view.findViewById(R.id.verified_pill)).addView(linearLayout);
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
