package com.ss.android.ugc.aweme.favorite.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1172110gbh;
import X.C1209080hZK;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteMobParams;
import com.ss.android.ugc.aweme.favorite.NearbyFavoritePageParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFavoriteListCell extends PowerCell<C1172110gbh> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public NearbyFavoritePageParams LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyFavoriteListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorite/NearbyFavoriteListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NearbyFavoriteListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NearbyFavoriteListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 242);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(82);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 226), awS562S0100000_18, AFwS206S0000000_18.get$arr$(109), new AwS562S0100000_18((C03K6) this, 228), new AwS562S0100000_18((C03K6) this, 230), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 232), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 234), null, new AwS562S0100000_18((C03K6) this, 235));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 229);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 231);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 233);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 20));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 236);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 237);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 238);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 239);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 240);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 241), awS562S0100000_18, AFwS206S0000000_18.get$arr$(110), new AwS562S0100000_18((C03K6) this, 243), new AwS562S0100000_18((C03K6) this, 244), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 245), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 246), null, new AwS562S0100000_18((C03K6) this, 247));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 248), awS562S0100000_18, AFwS206S0000000_18.get$arr$(111), new AwS562S0100000_18((C03K6) this, 249), new AwS562S0100000_18((C03K6) this, 250), new AwS562S0100000_18((C03K6) this, 251), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 225));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2;
        super.onItemViewCreated();
        Fragment fragmentI5 = I5(getParent());
        NearbyFavoritePageParams nearbyFavoritePageParams = null;
        if (fragmentI5 != null && (interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentI5, null), "source_default_key", NearbyFavoriteMobParams.class, null)) != null) {
            interfaceC1555100qZQLIZIZ2.getSource();
        }
        Fragment fragmentI52 = I5(getParent());
        if (fragmentI52 != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentI52, null), "source_default_key", NearbyFavoritePageParams.class, null)) != null) {
            nearbyFavoritePageParams = (NearbyFavoritePageParams) interfaceC1555100qZQLIZIZ.getSource();
        }
        this.LLILLJJLI = nearbyFavoritePageParams;
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 86));
        C2211751BhN.LIZ(this.itemView, new C1209080hZK(this, 0));
    }

    public static Fragment I5(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof BaseFragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return I5(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof ReusedAssem) {
            return I5(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof PowerCell) {
            return I5(((PowerCell) lifecycleOwner).getParent());
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1172110gbh c1172110gbh = (C1172110gbh) interfaceC1891350zJl;
        super.onBindItemView(c1172110gbh);
        String str = c1172110gbh.LL;
        TuxTextView tuxTextView = null;
        if (str != null) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(str);
        }
        String str2 = c1172110gbh.LLILLJJLI;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, c1172110gbh.LL)) {
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(str2);
                TuxTextView tuxTextView4 = this.LLILZ;
                if (tuxTextView4 != null) {
                    tuxTextView = tuxTextView4;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView = tuxTextView5;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        TuxTextView tuxTextView6 = this.LLILZ;
        if (tuxTextView6 != null) {
            tuxTextView = tuxTextView6;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ds2, viewGroup, false);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.re7);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.re5);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.lkw);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((IPoiAnchorService) ServiceManager.get().getService(IPoiService.class)).getIconResByABExp(false);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 10), viewTd);
        return viewTd;
    }
}
