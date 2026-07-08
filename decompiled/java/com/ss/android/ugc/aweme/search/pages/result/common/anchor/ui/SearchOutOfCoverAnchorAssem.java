package com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui;

import X.C01GW;
import X.C0QSJ;
import X.C0R48;
import X.C0R4F;
import X.C1164904h5;
import X.C1165004h6;
import X.C1169304hn;
import X.C13LE;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C660780Pvw;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1165104h7;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC660770Pvv;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.ACListenerS114S0200000_10;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOutOfCoverAnchorAssem extends ReusedUIContentAssem<SearchOutOfCoverAnchorAssem> implements InterfaceC712990Rxx<InterfaceC660770Pvv>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 425));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 427));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 426));
    public volatile ISearchCardElementVisibilityControlAbility LLJJL;
    public InterfaceC665370Q7z LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchOutOfCoverAnchorAssem.class, "searchCardElementVisibilityControlAbility", "getSearchCardElementVisibilityControlAbility()Lcom/ss/android/ugc/aweme/search/pages/result/common/anchor/abililty/ISearchCardElementVisibilityControlAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCardScope.class});
    }

    public final ISearchCardElementVisibilityControlAbility dp() {
        ISearchCardElementVisibilityControlAbility iSearchCardElementVisibilityControlAbility = this.LLJJL;
        if (iSearchCardElementVisibilityControlAbility == null) {
            synchronized (this) {
                iSearchCardElementVisibilityControlAbility = this.LLJJL;
                if (iSearchCardElementVisibilityControlAbility == null) {
                    ISearchCardElementVisibilityControlAbility iSearchCardElementVisibilityControlAbilityCp = cp();
                    this.LLJJL = iSearchCardElementVisibilityControlAbilityCp;
                    return iSearchCardElementVisibilityControlAbilityCp;
                }
            }
        }
        return iSearchCardElementVisibilityControlAbility;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ISearchCardElementVisibilityControlAbility cp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJLIIIJLLLLLLLZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SearchCardScope.class});
            this.LLJL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        ISearchCardElementVisibilityControlAbility iSearchCardElementVisibilityControlAbility = (ISearchCardElementVisibilityControlAbility) c0qsjLIZLLL.getAbility(ISearchCardElementVisibilityControlAbility.class);
        C687700QyG.LJ(iSearchCardElementVisibilityControlAbility, ISearchCardElementVisibilityControlAbility.class);
        return iSearchCardElementVisibilityControlAbility;
    }

    public final TuxTextView ep() {
        return (TuxTextView) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC660770Pvv interfaceC660770Pvv) {
        InterfaceC660770Pvv interfaceC660770Pvv2 = interfaceC660770Pvv;
        C660780Pvw c660780PvwLIZ = interfaceC660770Pvv2.LIZ();
        if (c660780PvwLIZ != null) {
            C786410Ut5.I7(new ACListenerS114S0200000_10(this, interfaceC660770Pvv2, 20), LJJIJL());
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            TuxIconView tuxIconView = (TuxIconView) this.LLJJJJ.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            tuxIconView.setTuxIcon(c419910GdJ);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.LLJJJJ.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.no);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            appCompatImageView.setBackgroundDrawable(c384050F3z.LIZ(LJJIJL().getContext()));
            InterfaceC1165104h7 interfaceC1165104h7 = c660780PvwLIZ.LIZ;
            if (interfaceC1165104h7 instanceof C1165004h6) {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJJJ.getValue(), 0);
                ep().setMaxLines(1);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJLIIL.getValue(), 8);
                ep().setText(((C1165004h6) c660780PvwLIZ.LIZ).LIZ);
                dp().Xc1(1);
                return;
            }
            if (interfaceC1165104h7 instanceof C1164904h5) {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJJJ.getValue(), 0);
                ep().setMaxLines(2);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJLIIL.getValue(), 8);
                TuxTextView tuxTextViewEp = ep();
                c660780PvwLIZ.LIZ.getClass();
                AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(c660780PvwLIZ, this, 100);
                tuxTextViewEp.setText((CharSequence) null);
                Layout layout = tuxTextViewEp.getLayout();
                if (layout != null) {
                    awS376S0200000_10.invoke(layout);
                    return;
                } else {
                    tuxTextViewEp.addOnAttachStateChangeListener(new C0R48(new C0R4F(tuxTextViewEp, awS376S0200000_10, 6), tuxTextViewEp, 13));
                    return;
                }
            }
            if (interfaceC1165104h7 instanceof C1169304hn) {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJJJ.getValue(), 0);
                ep().setMaxLines(1);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJLIIL.getValue(), 0);
                ep().setText(((C1169304hn) c660780PvwLIZ.LIZ).LIZ);
                ((TextView) this.LLJJJJLIIL.getValue()).setText(((C1169304hn) c660780PvwLIZ.LIZ).LIZIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[TitleAndSubTitle]: title = ");
                sbLIZ.append(((C1169304hn) c660780PvwLIZ.LIZ).LIZ);
                sbLIZ.append(", subtitle = ");
                sbLIZ.append(((C1169304hn) c660780PvwLIZ.LIZ).LIZIZ);
                sbLIZ.append(" ==> call hide");
                C2188811AlT.LIZIZ(sbLIZ);
                dp().vs1();
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC660770Pvv interfaceC660770Pvv) {
        if (interfaceC660770Pvv.LIZ() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC660770Pvv interfaceC660770Pvv) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
