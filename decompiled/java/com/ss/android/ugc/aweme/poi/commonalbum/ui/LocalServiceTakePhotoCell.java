package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1272304yP;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.zhiliaoapp.musically.R;
import irm.AkS96S0100000_30;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LocalServiceTakePhotoCell extends PowerCell<C1272304yP> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceTakePhotoCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LocalServiceTakePhotoCell.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiTakePhotoItemLayoutBinding;", 0);
        c09r3.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e9f;
    }

    public LocalServiceTakePhotoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 234);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(207);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2851), awS576S0100000_32, AFwS224S0000000_33.get$arr$(398), new AwS577S0100000_33((C03K6) this, 2852), new AwS577S0100000_33((C03K6) this, 2854), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2856), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2858), null, new AwS577S0100000_33((C03K6) this, 2859));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 2853);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2855);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 2857);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 112));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 2860);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2861);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2862);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2863);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2864);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2865), awS576S0100000_32, AFwS224S0000000_33.get$arr$(399), new AwS577S0100000_33((C03K6) this, 2866), new AwS577S0100000_33((C03K6) this, 2867), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2868), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2869), null, new AwS577S0100000_33((C03K6) this, 2870));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2871), awS576S0100000_32, AFwS224S0000000_33.get$arr$(400), new AwS577S0100000_33((C03K6) this, 2872), new AwS577S0100000_33((C03K6) this, 2873), new AwS577S0100000_33((C03K6) this, 2874), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2850));
        }
        this.LL = assemVMLazy;
        new AwS611S0100000_32(this, 81);
    }

    public final LocalServiceAlbumVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.I7(new AkS96S0100000_30(this, 1), view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1272304yP c1272304yP = (C1272304yP) interfaceC1891350zJl;
        super.onBindItemView(c1272304yP);
        if (c1272304yP.LLILLJJLI) {
            C786410Ut5.T4(this.itemView, 1.0f);
        } else {
            C786410Ut5.T4(this.itemView, 0.5f);
        }
    }
}
