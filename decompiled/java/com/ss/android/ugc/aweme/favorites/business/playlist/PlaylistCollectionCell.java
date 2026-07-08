package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0O6P;
import X.C1196320hEk;
import X.C13LE;
import X.C1669670tYD;
import X.C19719212De;
import X.C19719912Dl;
import X.C20088213iq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.EnumC1427810nG7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class PlaylistCollectionCell extends PowerCell<C0O6P> implements InterfaceC713360RyY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistCollectionCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/favorites/business/playlist/PlaylistCollectionVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaylistCollectionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistCollectionVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 196);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(101);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2067), awS546S0100000_2, AFwS206S0000000_18.get$arr$(148), new AwS562S0100000_18((C03K6) this, 311), new AwS562S0100000_18((C03K6) this, 313), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2069), aFwS279S0000000_33, new AwS562S0100000_18((C03K6) this, 314), null, new AwS562S0100000_18((C03K6) this, 315));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((C03K6) this, 312);
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2068);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c19719912DlLIZ, 2070);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_18, 35));
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c01gwLIZIZ, 316);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(c01gwLIZIZ, 317);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c01gwLIZIZ, 318);
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 319);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 320);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_332, awS546S0100000_2, new C452080Ho6(), awS562S0100000_182, awS562S0100000_183, awS577S0100000_33, aFwS279S0000000_33, awS562S0100000_184, awS562S0100000_185, awS562S0100000_186);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2072), awS546S0100000_2, AFwS206S0000000_18.get$arr$(149), new AwS562S0100000_18((C03K6) this, 321), new AwS562S0100000_18((C03K6) this, 322), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2073), aFwS279S0000000_33, new AwS562S0100000_18((C03K6) this, 323), null, new AwS562S0100000_18((C03K6) this, 324));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2074), awS546S0100000_2, AFwS206S0000000_18.get$arr$(150), new AwS562S0100000_18((C03K6) this, 325), new AwS562S0100000_18((C03K6) this, 326), new AwS562S0100000_18((C03K6) this, 309), aFwS279S0000000_33, null, null, new AwS562S0100000_18((C03K6) this, 310));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1429));
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 195));
        this.LLILZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(291));
        this.LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2071));
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 111));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0O6P c0o6p = (C0O6P) interfaceC1891350zJl;
        super.onBindItemView(c0o6p);
        C1669670tYD.LJ((ComposeView) this.itemView, EnumC1427810nG7.Auto, new C19719212De(1665935179, new AwS460S0200000_25(this, c0o6p, 3), true));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo r53, X.InterfaceC1680500tpg r54, int r55) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell.I5(com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo, X.0tpg, int):void");
    }
}
