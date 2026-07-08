package com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.markdown;

import X.C01GW;
import X.C07GM;
import X.C123100dR;
import X.C1263404wy;
import X.C1558520qew;
import X.C1829607Eo;
import X.C1860130yVP;
import X.C21419418s4;
import X.C301280BrS;
import X.C341990Dav;
import X.C418440Gaw;
import X.C426750GoL;
import X.C430110Gtl;
import X.C452501pT;
import X.C688690Qzr;
import X.C689240R1u;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC682700QqC;
import X.InterfaceC1587906Jp;
import X.InterfaceC328600CuQ;
import X.InterfaceC342000Daw;
import X.InterfaceC431780GwS;
import X.InterfaceC665370Q7z;
import X.InterfaceC684960Qtq;
import X.InterfaceC685020Qtw;
import X.InterfaceC685480Qug;
import X.InterfaceC685490Quh;
import X.InterfaceC685560Quo;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.pov.IMarkdownSupTagSpanClickAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.IMarkdownTextClickAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovMarkdownAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMarkDownContentAssem extends ReusedUISlotAssem<SearchMarkDownContentAssem> implements InterfaceC712990Rxx<InterfaceC684960Qtq> {
    public C1860130yVP LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public InterfaceC342000Daw LLJLILLLLZIIL;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 593));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 639));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.ez_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C688690Qzr c688690Qzr;
        C1860130yVP c1860130yVP = this.LLJJLIIIJLLLLLLLZ;
        if (!(c1860130yVP instanceof C688690Qzr) || (c688690Qzr = (C688690Qzr) c1860130yVP) == null) {
            return;
        }
        c688690Qzr.LJJJJL();
    }

    public final boolean sp() {
        InterfaceC685020Qtw interfaceC685020Qtw;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        return (obj instanceof InterfaceC685020Qtw) && (interfaceC685020Qtw = (InterfaceC685020Qtw) obj) != null && interfaceC685020Qtw.LJJLI();
    }

    public final Integer tp() {
        InterfaceC685020Qtw interfaceC685020Qtw;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        if (!(obj instanceof InterfaceC685020Qtw) || (interfaceC685020Qtw = (InterfaceC685020Qtw) obj) == null) {
            return null;
        }
        return interfaceC685020Qtw.LJLJLJ();
    }

    public final String up() {
        InterfaceC685020Qtw interfaceC685020Qtw;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        if (!(obj instanceof InterfaceC685020Qtw) || (interfaceC685020Qtw = (InterfaceC685020Qtw) obj) == null) {
            return null;
        }
        return interfaceC685020Qtw.getSubTitle();
    }

    public final boolean yp() {
        InterfaceC685020Qtw interfaceC685020Qtw;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        return (obj instanceof InterfaceC685020Qtw) && (interfaceC685020Qtw = (InterfaceC685020Qtw) obj) != null && interfaceC685020Qtw.LJIIIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        int i;
        InterfaceC431780GwS interfaceC431780GwS;
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_snippet);
        this.LLJJLIIIJLLLLLLLZ = (C1860130yVP) view.findViewById(R.id.o03);
        C1860130yVP c1860130yVP = this.LLJJLIIIJLLLLLLLZ;
        if (c1860130yVP != null) {
            if (C1829607Eo.LIZ()) {
                ViewGroup.LayoutParams layoutParams = c1860130yVP.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    C786410Ut5.W5(c1860130yVP, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C341990Dav.LIZ(c1860130yVP, c1860130yVP.getContext(), 0, 0, (ISearchPovMarkdownAbility) this.LLJLLIL.getValue(), 6);
            C430110Gtl.LIZ(c1860130yVP, new AwS254S0300000_10(view, c1860130yVP, this, 10));
            C786410Ut5.I7(new AbS692S0100000_10(this, 14), c1860130yVP);
            KeyEvent.Callback callback = this.LLJJLIIIJLLLLLLLZ;
            if ((callback instanceof InterfaceC431780GwS) && (interfaceC431780GwS = (InterfaceC431780GwS) callback) != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(LLIIJLIL(), ISearchPovMarkdownAbility.class, null)) != null) {
                iMarkdownTextClickAbility.WW(interfaceC431780GwS);
            }
            if (C301280BrS.LIZ() && !C07GM.LIZ()) {
                if (C426750GoL.LJFF()) {
                    i = 4;
                } else {
                    i = 3;
                }
                c1860130yVP.setTextDirection(i);
            }
        }
        C786410Ut5.I7(new AbS692S0100000_10(this, 13), view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void op(C1860130yVP c1860130yVP) {
        Object obj;
        EnumC682700QqC enumC682700QqCZJ;
        C1263404wy c1263404wyLJJIIJ;
        InterfaceC685560Quo interfaceC685560Quo;
        int iIntValue;
        InterfaceC685020Qtw interfaceC685020Qtw;
        Integer numLJLJLJ;
        Object obj2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String content = ((InterfaceC684960Qtq) obj).getContent();
        if (content == null) {
            content = "";
        }
        C689240R1u c689240R1u = C689240R1u.LIZ;
        Context context = c1860130yVP.getContext();
        c689240R1u.getClass();
        C21419418s4 c21419418s4LJ = C689240R1u.LJ(context, null);
        boolean zYp = yp();
        Context context2 = getContext();
        InterfaceC685480Qug interfaceC685480Qug = (InterfaceC685480Qug) this.LLJLLIL.getValue();
        if (interfaceC685480Qug != null) {
            enumC682700QqCZJ = interfaceC685480Qug.ZJ();
        } else {
            enumC682700QqCZJ = null;
        }
        C21419418s4 c21419418s4LIZ = C689240R1u.LIZ(c689240R1u, c21419418s4LJ, zYp, context2, false, enumC682700QqCZJ, 4);
        InterfaceC328600CuQ interfaceC328600CuQ = new InterfaceC328600CuQ() { // from class: X.0Quc
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                int iIntValue2;
                String string;
                Integer numLJIIJJI;
                if (charSequence != null && (string = charSequence.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                    iIntValue2 = numLJIIJJI.intValue();
                } else {
                    iIntValue2 = 0;
                }
                IMarkdownSupTagSpanClickAbility iMarkdownSupTagSpanClickAbility = (IMarkdownSupTagSpanClickAbility) C1558520qew.LIZ(this.LIZ.LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
                if (iMarkdownSupTagSpanClickAbility != null) {
                    iMarkdownSupTagSpanClickAbility.lu0(iIntValue2 - 1);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                String strLJJLIIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("widget = ");
                sbLIZ.append(view);
                sbLIZ.append(", span = ");
                sbLIZ.append(interfaceC431020GvE.getClass());
                sbLIZ.append(", indexList = ");
                if (list != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
                } else {
                    strLJJLIIIJ = null;
                }
                sbLIZ.append(strLJJLIIIJ);
                C2188811AlT.LIZIZ(sbLIZ);
                IMarkdownSupTagSpanClickAbility iMarkdownSupTagSpanClickAbility = (IMarkdownSupTagSpanClickAbility) C1558520qew.LIZ(this.LIZ.LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
                if (iMarkdownSupTagSpanClickAbility != null) {
                    iMarkdownSupTagSpanClickAbility.yZ(list, map);
                }
            }
        };
        boolean zSp = sp();
        if (!yp()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            c1263404wyLJJIIJ = ((InterfaceC684960Qtq) obj2).LJJIIJ();
        } else {
            c1263404wyLJJIIJ = null;
        }
        C341990Dav.LIZLLL(c1860130yVP, content, c21419418s4LIZ, interfaceC328600CuQ, null, null, null, null, null, c1263404wyLJJIIJ, zSp, null, new AwS589S0100000_10(this, 258), 1272);
        InterfaceC685490Quh interfaceC685490Quh = (InterfaceC685490Quh) this.LLJLLIL.getValue();
        if (interfaceC685490Quh != null) {
            if (c1860130yVP instanceof InterfaceC685560Quo) {
                interfaceC685560Quo = (InterfaceC685560Quo) c1860130yVP;
            } else {
                interfaceC685560Quo = null;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            if ((obj3 instanceof InterfaceC685020Qtw) && (interfaceC685020Qtw = (InterfaceC685020Qtw) obj3) != null && (numLJLJLJ = interfaceC685020Qtw.LJLJLJ()) != null) {
                iIntValue = numLJLJLJ.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC685490Quh.wN(interfaceC685560Quo, iIntValue);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC684960Qtq interfaceC684960Qtq) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void up(InterfaceC684960Qtq interfaceC684960Qtq) {
        int i;
        int i2;
        int i3;
        int i4;
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null && C123100dR.LIZ(up())) {
            if (yp()) {
                i3 = 23;
            } else {
                i3 = 42;
            }
            tuxTextView.setTuxFont(i3);
            if (yp()) {
                i4 = 12;
            } else {
                i4 = 4;
            }
            C426750GoL.LJIIIZ(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)))), false, 23);
            tuxTextView.setText(up());
        }
        TuxTextView tuxTextView2 = this.LLJL;
        int iIntValue = 1;
        int i5 = 8;
        if (tuxTextView2 != null) {
            if (C123100dR.LIZ(up()) && interfaceC684960Qtq.LIZLLL()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(up());
        }
        TuxTextView tuxTextView4 = this.LLJLIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(interfaceC684960Qtq.getSnippet());
        }
        TuxTextView tuxTextView5 = this.LLJLIL;
        if (tuxTextView5 != null) {
            Integer displayLine = interfaceC684960Qtq.getDisplayLine();
            if (displayLine != null) {
                iIntValue = displayLine.intValue();
            }
            tuxTextView5.setMaxLines(iIntValue);
        }
        TuxTextView tuxTextView6 = this.LLJLIL;
        if (tuxTextView6 != null) {
            if (C123100dR.LIZ(interfaceC684960Qtq.getSnippet())) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView6);
        }
        C1860130yVP c1860130yVP = this.LLJJLIIIJLLLLLLLZ;
        if (c1860130yVP != null) {
            if (C123100dR.LIZ(interfaceC684960Qtq.getContent())) {
                i5 = 0;
            }
            C786410Ut5.LJLLLLLL(i5, c1860130yVP);
        }
        C1860130yVP c1860130yVP2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1860130yVP2 != null && C123100dR.LIZ(interfaceC684960Qtq.getContent())) {
            this.LLJLILLLLZIIL = null;
            op(c1860130yVP2);
            if (!sp()) {
                this.LLJLILLLLZIIL = c1860130yVP2.getMarkdownContent();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC684960Qtq interfaceC684960Qtq) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
