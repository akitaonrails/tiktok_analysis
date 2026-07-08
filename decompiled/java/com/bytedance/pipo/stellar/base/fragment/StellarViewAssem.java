package com.bytedance.pipo.stellar.base.fragment;

import X.C01D1;
import X.C01GW;
import X.C0P0T;
import X.C1308910kAL;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C13LE;
import X.C1543490qGh;
import X.C1637806bA;
import X.C16FB;
import X.C1720420us4;
import X.C1720680usU;
import X.C1721300utU;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C481090Itn;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C747080TSg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1720670usT;
import X.EnumC452301pR;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS511S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarViewAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public View LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public C0P0T LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StellarViewAssem.class, "vm", "getVm()Lcom/bytedance/pipo/stellar/base/fragment/StellarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StellarViewAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StellarViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 53), AFwS268S0000000_26.get$arr$(34), null, true);
        this.LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26(this, 42));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 52));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 43));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 54));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 44));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 41));
    }

    public final StellarFragmentViewAbility Ho() {
        return (StellarFragmentViewAbility) this.LLJJ.getValue();
    }

    public final StellarViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (StellarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1543490qGh.LIZIZ(C747080TSg.class, null, 6);
    }

    public final void Lo(boolean z) {
        if (z) {
            C1749280vcc c1749280vcc = (C1749280vcc) this.LLJILJIL.getValue();
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_error_robot;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ua);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJFF = 2131829439;
            c1722300uv6.LJIIIZ = new AwS605S0100000_26(this, 39);
            c1749280vcc.setStatus(c1722300uv6);
            c1749280vcc.setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            return;
        }
        C786410Ut5.LLLZLZ((C1749280vcc) this.LLJILJIL.getValue(), 8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        StellarViewModel stellarViewModelJo = Jo();
        selectSubscribe(stellarViewModelJo, new C2217381BqS() { // from class: X.0urv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720190urh) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0urz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720190urh) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0us0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720190urh) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0ury
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720190urh) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(stellarViewModelJo.usedInReusedScene), null, new C1720420us4(this));
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0urx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1720190urh) obj).LLILLL);
            }
        }, null, new AwS633S0100000_19(this, 290), 6);
        ((C16FB) this.LLJI.getValue()).setOnRefreshListener(new AwS570S0100000_26(this, 45));
    }

    public final void setLoading(boolean z) {
        if (z) {
            StellarFragmentViewAbility stellarFragmentViewAbilityHo = Ho();
            if (stellarFragmentViewAbilityHo != null) {
                stellarFragmentViewAbilityHo.mL2();
            }
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJIJIL.getValue());
            C786410Ut5.LLZL((C481090Itn) this.LLJI.getValue(), 8);
            return;
        }
        C786410Ut5.LJZ(8, (FrameLayout) this.LLJIJIL.getValue());
        C786410Ut5.LLZL((C481090Itn) this.LLJI.getValue(), 0);
    }

    public final void Go(String str, StellarTooltipDO stellarTooltipDO) {
        View viewFindViewWithTag;
        long stayTime;
        ViewTreeObserver viewTreeObserver;
        Map<String, Object> trackingParams;
        ViewOnAttachStateChangeListenerC20604515jv powerList;
        StellarFragmentViewAbility stellarFragmentViewAbilityHo = Ho();
        if (stellarFragmentViewAbilityHo != null && (powerList = stellarFragmentViewAbilityHo.getPowerList()) != null) {
            viewFindViewWithTag = powerList.findViewWithTag(str);
        } else {
            viewFindViewWithTag = null;
        }
        this.LLJILJILJ = viewFindViewWithTag;
        if (viewFindViewWithTag == null) {
            Jo().LLILLJJLI.LIZJ("rd_pipo_stellar_render", C2097608Jq.LJIIIIZZ(new Pair("step", "tooltip_exception"), new Pair("error_name", "anchor_view_not_found")));
            return;
        }
        Context context = LJJIJL().getContext();
        if (context == null) {
            return;
        }
        C1720680usU c1720680usU = EnumC1720670usT.Companion;
        String theme = stellarTooltipDO.getTheme();
        c1720680usU.getClass();
        Context contextLIZIZ = C1720680usU.LIZIZ(context, theme);
        View viewSd = C786410Ut5.Sd(R.layout.fa9, C786410Ut5.ne(contextLIZIZ), null);
        Integer showClose = stellarTooltipDO.getShowClose();
        if (showClose != null && showClose.intValue() == 1) {
            View viewFindViewById = viewSd.findViewById(R.id.w35);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.I7(new AbS511S0200000_26(this, stellarTooltipDO, 0), viewFindViewById);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> trackingParams2 = stellarTooltipDO.getTrackingParams();
            if (trackingParams2 != null) {
                linkedHashMap.putAll(trackingParams2);
            }
            ImageDO closeIcon = stellarTooltipDO.getCloseIcon();
            if (closeIcon != null && (trackingParams = closeIcon.getTrackingParams()) != null) {
                linkedHashMap.putAll(trackingParams);
            }
            Jo().DQ2(null, "close", linkedHashMap);
        } else {
            C786410Ut5.LJLLLLLL(8, viewSd.findViewById(R.id.w35));
        }
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.w37);
        C1721300utU c1721300utU = C1721300utU.LIZ;
        TextDO text = stellarTooltipDO.getText();
        c1721300utU.getClass();
        C1721300utU.LJIL(null, text, tuxTextView);
        ImageView imageView = (ImageView) viewSd.findViewById(R.id.w36);
        ImageDO leadIcon = stellarTooltipDO.getLeadIcon();
        c1721300utU.getClass();
        C1721300utU.LJIJI(imageView, leadIcon, null);
        Integer autoDismiss = stellarTooltipDO.getAutoDismiss();
        if ((autoDismiss == null || autoDismiss.intValue() != 0) && stellarTooltipDO.getStayTime() > 0) {
            stayTime = stellarTooltipDO.getStayTime();
        } else {
            stayTime = -1001;
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C1391550mJd c1391550mJd = new C1391550mJd(contextLIZIZ);
            c1391550mJd.LLILLJJLI.LIZIZ = view;
            c1391550mJd.LIZLLL();
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJIJJ = false;
            c1391600mJi.LJIIIZ = true;
            c1391550mJd.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c1391550mJd.LJIIIZ(false, null);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f509o0, contextLIZIZ);
            if (numLIZJ != null) {
                c1391550mJd.LJI(numLIZJ.intValue());
            }
            Float bodyOffset = stellarTooltipDO.getBodyOffset();
            if (bodyOffset != null) {
                c1391550mJd.LLILLJJLI.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(bodyOffset.floatValue())));
            }
            Float pointOffset = stellarTooltipDO.getPointOffset();
            if (pointOffset != null) {
                c1391550mJd.LLILLJJLI.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(pointOffset.floatValue())));
            }
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LJII = stayTime;
            c1391600mJi2.LJIIZILJ = viewSd;
            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
            this.LLJJI = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            View view2 = this.LLJILJILJ;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.LLJILLL.getValue();
                viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
            }
            Jo().DQ2(null, "act_badge", stellarTooltipDO.getTrackingParams());
        }
    }
}
