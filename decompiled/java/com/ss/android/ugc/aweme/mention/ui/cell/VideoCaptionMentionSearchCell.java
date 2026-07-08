package com.ss.android.ugc.aweme.mention.ui.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C317060Cbo;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoCaptionMentionSearchCell extends PowerCell<C317060Cbo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCaptionMentionSearchCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionSearchViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoCaptionMentionSearchCell.class, "searchStateVm", "getSearchStateVm()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionStateViewModel;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoCaptionMentionSearchCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCaptionMentionSearchViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 858);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(158);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 845), awS575S0100000_31, AFwS221S0000000_31.get$arr$(233), new AwS575S0100000_31((C03K6) this, 835), new AwS575S0100000_31((C03K6) this, 846), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 849), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 852), null, new AwS575S0100000_31((C03K6) this, 855));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 831);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 833);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 836);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 55));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 841);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 844);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 847);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 850);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 853);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 856), awS575S0100000_31, AFwS221S0000000_31.get$arr$(232), new AwS575S0100000_31((C03K6) this, 860), new AwS575S0100000_31((C03K6) this, 862), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 864), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 866), null, new AwS575S0100000_31((C03K6) this, 868));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 869), awS575S0100000_31, AFwS221S0000000_31.get$arr$(234), new AwS575S0100000_31((C03K6) this, 871), new AwS575S0100000_31((C03K6) this, 873), new AwS575S0100000_31((C03K6) this, 876), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 878));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoCaptionMentionStateViewModel.class);
        AwS575S0100000_31 awS575S0100000_3110 = new AwS575S0100000_31(c19719912DlLIZ2, 826);
        AFwS276S0000000_31 aFwS276S0000000_312 = AFwS276S0000000_31.get$arr$(157);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 830), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(231), new AwS575S0100000_31((C03K6) this, 834), new AwS575S0100000_31((C03K6) this, 837), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 839), aFwS276S0000000_312, new AwS575S0100000_31((C03K6) this, 842), null, new AwS575S0100000_31((C03K6) this, 848));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_3111 = new AwS575S0100000_31((C03K6) this, 851);
            AwS575S0100000_31 awS575S0100000_3112 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 854);
            AwS575S0100000_31 awS575S0100000_3113 = new AwS575S0100000_31(c19719912DlLIZ2, 857);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_3111, 56));
            AwS575S0100000_31 awS575S0100000_3114 = new AwS575S0100000_31(c01gwLIZIZ2, 859);
            AwS575S0100000_31 awS575S0100000_3115 = new AwS575S0100000_31(c01gwLIZIZ2, 861);
            AwS575S0100000_31 awS575S0100000_3116 = new AwS575S0100000_31(c01gwLIZIZ2, 863);
            AwS575S0100000_31 awS575S0100000_3117 = new AwS575S0100000_31(c01gwLIZIZ2, 865);
            AwS575S0100000_31 awS575S0100000_3118 = new AwS575S0100000_31(c01gwLIZIZ2, 867);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS575S0100000_3113, awS575S0100000_3110, new C452080Ho6(), awS575S0100000_3114, awS575S0100000_3115, awS575S0100000_3112, aFwS276S0000000_312, awS575S0100000_3116, awS575S0100000_3117, awS575S0100000_3118);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 870), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(235), new AwS575S0100000_31((C03K6) this, 872), new AwS575S0100000_31((C03K6) this, 874), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 875), aFwS276S0000000_312, new AwS575S0100000_31((C03K6) this, 877), null, new AwS575S0100000_31((C03K6) this, 827));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 829), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(230), new AwS575S0100000_31((C03K6) this, 832), new AwS575S0100000_31((C03K6) this, 838), new AwS575S0100000_31((C03K6) this, 840), aFwS276S0000000_312, null, null, new AwS575S0100000_31((C03K6) this, 843));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(229));
        this.LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 828));
    }

    public final VideoCaptionMentionSearchViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (VideoCaptionMentionSearchViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r15) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dm6, viewGroup, false);
    }
}
