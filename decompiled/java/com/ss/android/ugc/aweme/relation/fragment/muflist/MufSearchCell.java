package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1247680iZa;
import X.C1253010iiB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1387050mCN;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1387060mCO;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS167S0100000_33;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import irm.AkS58S0200000_19;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MufSearchCell extends PowerCell<C1247680iZa> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3142));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3155));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3145));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3144));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MufSearchCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/relation/fragment/muflist/MufListPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MufSearchCell() {
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MufListPageViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3161);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(218);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3143), awS577S0100000_33, AFwS224S0000000_33.get$arr$(434), new AwS577S0100000_33((C03K6) this, 3146), new AwS577S0100000_33((C03K6) this, 3148), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3150), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3152), null, new AwS577S0100000_33((C03K6) this, 3153));
            return;
        }
        if (!(obj instanceof InterfaceC451590HnJ)) {
            if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3160), awS577S0100000_33, AFwS224S0000000_33.get$arr$(435), new AwS577S0100000_33((C03K6) this, 3162), new AwS577S0100000_33((C03K6) this, 3163), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3164), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3165), null, new AwS577S0100000_33((C03K6) this, 3166));
                return;
            }
            if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3167), awS577S0100000_33, AFwS224S0000000_33.get$arr$(436), new AwS577S0100000_33((C03K6) this, 3168), new AwS577S0100000_33((C03K6) this, 3169), new AwS577S0100000_33((C03K6) this, 3140), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3141));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3147);
        AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3149);
        AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3151);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 124));
        AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3154);
        AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3156);
        AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3157);
        AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3158);
        AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3159);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
        new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1247680iZa c1247680iZa = (C1247680iZa) interfaceC1891350zJl;
        super.onBindItemView(c1247680iZa);
        ((TextView) this.LLILLJJLI.getValue()).setText(c1247680iZa.LLILZ);
        RelationButton relationButton = (RelationButton) this.LLILLL.getValue();
        C2201941BFw c2201941BFw = IMUser.Companion;
        IMUser iMUser = c1247680iZa.LLILLJJLI;
        c2201941BFw.getClass();
        C1387050mCN c1387050mCN = new C1387050mCN(C2201941BFw.LJII(iMUser));
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        ((RelationButton) this.LLILLL.getValue()).setTracker(new AwS563S0100000_19(c1247680iZa, 3080));
        C786410Ut5.I7(new ACListenerS122S0200000_19(this, c1247680iZa, 52), this.itemView);
        C786410Ut5.G9((SmartAvatarImageView) this.LL.getValue(), new ACListenerS167S0100000_33(this, 80));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1247680iZa.LLILLJJLI.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(this.itemView.getContext()));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        User userLJII = C2201941BFw.LJII(c1247680iZa.LLILLJJLI);
        if (C1253010iiB.LIZJ.LJJIFFI()) {
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLILZ.getValue(), 0);
        }
        C786410Ut5.I7(new AkS58S0200000_19(userLJII, this, 6), (View) this.LLILZ.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c_t, viewGroup, false);
    }
}
