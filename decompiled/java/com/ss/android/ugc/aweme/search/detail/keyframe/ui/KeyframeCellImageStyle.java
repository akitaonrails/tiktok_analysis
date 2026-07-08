package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0BY9;
import X.C0H8A;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM;
import com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.SearchDetailKeyframeSheetVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class KeyframeCellImageStyle extends BaseKeyframeCell<C0H8A> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLJILLL;
    public final boolean LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(KeyframeCellImageStyle.class, "keyframePanelVM", "getKeyframePanelVM()Lcom/ss/android/ugc/aweme/search/detail/keyframe/viewmodel/SearchDetailKeyframeSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final int X5() {
        return R.raw.tux_lottie_common_search_videocover_wave_dark;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ew8;
    }

    public KeyframeCellImageStyle() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchDetailKeyframeSheetVM.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 959);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(164);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 970), awS575S0100000_31, AFwS221S0000000_31.get$arr$(247), new AwS575S0100000_31((C03K6) this, 945), new AwS575S0100000_31((C03K6) this, 947), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 949), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 951), null, new AwS575S0100000_31((C03K6) this, 952));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 946);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 948);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 950);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 66));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 953);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 954);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 955);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 956);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 957);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 958), awS575S0100000_31, AFwS221S0000000_31.get$arr$(245), new AwS575S0100000_31((C03K6) this, 960), new AwS575S0100000_31((C03K6) this, 961), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 962), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 963), null, new AwS575S0100000_31((C03K6) this, 964));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 965), awS575S0100000_31, AFwS221S0000000_31.get$arr$(246), new AwS575S0100000_31((C03K6) this, 966), new AwS575S0100000_31((C03K6) this, 967), new AwS575S0100000_31((C03K6) this, 968), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 969));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = C0BY9.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final boolean R5() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell
    public final void W5(C0H8A c0h8a) {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        ((BaseSearchDetailKeyframeVM) assemVMLazy.getValue()).yQ2(getBindingAdapterPosition(), c0h8a);
    }
}
