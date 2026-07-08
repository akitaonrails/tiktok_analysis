package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0GZA;
import X.C0IK5;
import X.C0P0T;
import X.C1308910kAL;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C13LE;
import X.C1834350xpp;
import X.C1834580xqC;
import X.C1834770xqV;
import X.C1834780xqW;
import X.C1834810xqZ;
import X.C1835390xrV;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426320Gne;
import X.C426750GoL;
import X.C450650Hln;
import X.C452080Ho6;
import X.C452501pT;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1834800xqY;
import X.EnumC1834820xqa;
import X.EnumC450670Hlp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui.LiveHighlightSideBarCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class LiveHighlightSideBarCell extends PowerCell<C1834770xqV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public View LLILLJJLI;
    public C426320Gne LLILLL;
    public TuxSpinner LLILZ;
    public float LLILZIL;
    public Integer LLILZLL;
    public C0P0T LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 342));
    public final ARunnableS127S0100000_27 LLIZ = new ARunnableS127S0100000_27(this, 22);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHighlightSideBarCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ddz;
    }

    public LiveHighlightSideBarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 357);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(78);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 341), awS571S0100000_27, AFwS216S0000000_27.get$arr$(125), new AwS571S0100000_27((C03K6) this, 343), new AwS571S0100000_27((C03K6) this, 345), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 347), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 349), null, new AwS571S0100000_27((C03K6) this, 350));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 344);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 346);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 348);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 19));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 351);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 352);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 353);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 354);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 355);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 356), awS571S0100000_27, AFwS216S0000000_27.get$arr$(126), new AwS571S0100000_27((C03K6) this, 358), new AwS571S0100000_27((C03K6) this, 359), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 360), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 361), null, new AwS571S0100000_27((C03K6) this, 362));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 363), awS571S0100000_27, AFwS216S0000000_27.get$arr$(127), new AwS571S0100000_27((C03K6) this, 364), new AwS571S0100000_27((C03K6) this, 365), new AwS571S0100000_27((C03K6) this, 366), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 340));
        }
        this.LLJ = assemVMLazy;
    }

    public final TuxIconView I5() {
        return (TuxIconView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLJJLI = this.itemView.findViewById(R.id.rwm);
        this.LLILLL = (C426320Gne) this.itemView.findViewById(R.id.nl1);
        this.LLILZ = (TuxSpinner) this.itemView.findViewById(R.id.vuc);
        C786410Ut5.I7(new AkS94S0100000_27(this, 8), this.itemView);
    }

    public final void L5() {
        C1834770xqV item;
        C1834770xqV item2;
        String str;
        String str2;
        EnumC1834820xqa enumC1834820xqa;
        String str3;
        C1834770xqV item3 = getItem();
        if (!(item3 != null && item3.LLILZIL) || (item = getItem()) == null || !item.LLILLJJLI || (item2 = getItem()) == null || (str = item2.LLILZLL) == null || str.length() <= 0) {
            C0P0T c0p0t = this.LLIZLLLIL;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
            this.LLIZLLLIL = null;
            return;
        }
        Context context = getContext();
        if (context != null) {
            C450650Hln c450650Hln = new C450650Hln(context);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ub, context);
            int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -16777216;
            C1834770xqV item4 = getItem();
            if (item4 == null || (str2 = item4.LLILZLL) == null) {
                return;
            }
            c450650Hln.LLILZIL = iIntValue;
            c450650Hln.LIZLLL(str2, null);
            c450650Hln.LIZIZ(EnumC450670Hlp.LARGE);
            c450650Hln.LIZ(0);
            c450650Hln.setCustomImage(null);
            c450650Hln.setFocusableInTouchMode(true);
            c450650Hln.requestFocus();
            c450650Hln.setOnKeyListener(new View.OnKeyListener() { // from class: X.0xrZ
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (keyEvent.getAction() == 0 && i == 4) {
                        LiveHighlightSideBarCell liveHighlightSideBarCell = this.LL;
                        C0P0T c0p0t2 = liveHighlightSideBarCell.LLIZLLLIL;
                        if (c0p0t2 != null) {
                            c0p0t2.dismiss();
                        }
                        liveHighlightSideBarCell.LLIZLLLIL = null;
                    }
                    return false;
                }
            });
            C1391550mJd c1391550mJd = new C1391550mJd(context);
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LJIIZILJ = c450650Hln;
            c1391600mJi.LIZLLL = EnumC1235690iGF.START;
            c1391600mJi.LJIJJ = false;
            c1391550mJd.LJIIIZ(false, null);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1d, context);
            c1391550mJd.LJI(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
            c1391550mJd.LLILLJJLI.LIZIZ = this.itemView;
            this.LLIZLLLIL = c1391550mJd.LIZIZ();
            HandlerHook.viewPostDelay(this.itemView, new ARunnableS127S0100000_27(this, 21), 500L);
            C1834770xqV item5 = getItem();
            if (item5 == null || (enumC1834820xqa = item5.LL) == null) {
                return;
            }
            int i = C1834810xqZ.LIZIZ[enumC1834820xqa.ordinal()];
            if (i == 1) {
                C1834350xpp.LIZ.getClass();
                C1834350xpp.LIZJ.LIZJ(Boolean.TRUE);
                return;
            }
            if (i == 2) {
                C1834770xqV item6 = getItem();
                if (item6 == null || (str3 = item6.LLILZLL) == null) {
                    str3 = "";
                }
                String string = context.getString(2131852965);
                if (Intrinsics.LJFF(str3, context.getString(2131852964))) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LIZLLL.LIZJ(Boolean.TRUE);
                } else if (Intrinsics.LJFF(str3, string)) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJ.LIZJ(Boolean.TRUE);
                }
            }
        }
    }

    public final void N5(C1834770xqV c1834770xqV) {
        if (c1834770xqV.LLILZ) {
            C426750GoL.LIZ(I5(), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 2, C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4), null, 0, null, null, 960);
        } else {
            C0GZA.LIZIZ(I5());
        }
    }

    public final void P5(C1834770xqV c1834770xqV) {
        EnumC1834800xqY enumC1834800xqY;
        float fIntValue;
        EnumC1834820xqa enumC1834820xqa = c1834770xqV.LL;
        if (enumC1834820xqa != EnumC1834820xqa.REVIVE && enumC1834820xqa != EnumC1834820xqa.MUSIC && enumC1834820xqa != EnumC1834820xqa.TEXT_STICKER && enumC1834820xqa != EnumC1834820xqa.CAPTION) {
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            C500260Jjc.LJIILIIL(this.LLILLL);
            C500260Jjc.LJIILIIL(this.LLILZ);
            return;
        }
        C1834770xqV item = getItem();
        if (item == null || (enumC1834800xqY = item.LLJ) == null) {
            return;
        }
        int i = C1834810xqZ.LIZ[enumC1834800xqY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C500260Jjc.LJIILIIL(I5());
                    C500260Jjc.LJIILIIL(this.LLILLJJLI);
                    C500260Jjc.LJIILIIL(this.LLILLL);
                    C500260Jjc.LLFFF(this.LLILZ);
                    return;
                }
                C500260Jjc.LJIILIIL(this.LLILLJJLI);
                C500260Jjc.LJIILIIL(this.LLILLL);
                C500260Jjc.LLFFF(I5());
                C500260Jjc.LJIILIIL(this.LLILZ);
                C0IK5.LIZLLL(this.LLIZ);
                return;
            }
            C500260Jjc.LJIILIIL(this.LLILLL);
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LLFFF(I5());
            C500260Jjc.LLFFF(this.LLILLJJLI);
            C0IK5.LIZLLL(this.LLIZ);
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C1834580xqC c1834580xqCLIZ = ((C1834780xqW) assemVMLazy.getValue().getState()).LLILZ.LIZ();
        if (c1834580xqCLIZ == null) {
            return;
        }
        Integer numLIZJ = C1835390xrV.LIZJ(c1834580xqCLIZ.LLILZ);
        if (numLIZJ != null) {
            fIntValue = numLIZJ.intValue();
        } else {
            fIntValue = 0.0f;
        }
        this.LLILZIL = fIntValue;
        C500260Jjc.LJIILIIL(I5());
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C500260Jjc.LLFFF(this.LLILLL);
        C500260Jjc.LJIILIIL(this.LLILZ);
        this.LLIZ.run();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1834770xqV c1834770xqV = (C1834770xqV) interfaceC1891350zJl;
        TuxIconView tuxIconViewI5 = I5();
        this.LLILZLL = c1834770xqV.LLJIJIL;
        tuxIconViewI5.setIconRes(c1834770xqV.LLILLL);
        boolean z = c1834770xqV.LLILLJJLI;
        I5().setEnabled(z);
        TuxIconView tuxIconViewI52 = I5();
        if (z) {
            i = R.attr.ee;
        } else {
            i = R.attr.a1p;
        }
        tuxIconViewI52.setTintColorRes(i);
        N5(c1834770xqV);
        L5();
        P5(c1834770xqV);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        float fIntValue;
        C1834770xqV c1834770xqV = (C1834770xqV) interfaceC1891350zJl;
        boolean z = !list.isEmpty();
        int i = R.attr.ee;
        if (z) {
            for (Object obj : list) {
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    Object obj2 = map.get(1);
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(obj2, bool)) {
                        boolean z2 = c1834770xqV.LLILLJJLI;
                        I5().setEnabled(z2);
                        TuxIconView tuxIconViewI5 = I5();
                        if (!z2) {
                            i = R.attr.a1p;
                        }
                        tuxIconViewI5.setTintColorRes(i);
                    }
                    if (Intrinsics.LJFF(map.get(2), bool)) {
                        N5(c1834770xqV);
                    }
                    if (Intrinsics.LJFF(map.get(3), bool)) {
                        L5();
                    }
                    if (Intrinsics.LJFF(map.get(4), bool)) {
                        P5(c1834770xqV);
                    }
                    if (Intrinsics.LJFF(map.get(5), bool) && C500260Jjc.LJJJJIZL(this.LLILLL)) {
                        AssemVMLazy assemVMLazy = this.LLJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
                        C1834580xqC c1834580xqCLIZ = ((C1834780xqW) assemVMLazy.getValue().getState()).LLILZ.LIZ();
                        if (c1834580xqCLIZ != null) {
                            Integer numLIZJ = C1835390xrV.LIZJ(c1834580xqCLIZ.LLILZ);
                            if (numLIZJ != null) {
                                fIntValue = numLIZJ.intValue();
                            } else {
                                fIntValue = 0.0f;
                            }
                            this.LLILZIL = fIntValue;
                            C426320Gne c426320Gne = this.LLILLL;
                            if (c426320Gne != null) {
                                c426320Gne.LIZ(fIntValue, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        TuxIconView tuxIconViewI52 = I5();
        this.LLILZLL = c1834770xqV.LLJIJIL;
        tuxIconViewI52.setIconRes(c1834770xqV.LLILLL);
        boolean z3 = c1834770xqV.LLILLJJLI;
        I5().setEnabled(z3);
        TuxIconView tuxIconViewI53 = I5();
        if (!z3) {
            i = R.attr.a1p;
        }
        tuxIconViewI53.setTintColorRes(i);
        N5(c1834770xqV);
        L5();
        P5(c1834770xqV);
    }
}
