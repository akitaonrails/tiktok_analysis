package com.ss.android.ugc.aweme.mention.ui.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C317050Cbn;
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
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoCaptionMentionRecommendCell extends PowerCell<C317050Cbn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCaptionMentionRecommendCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionRecommendViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoCaptionMentionRecommendCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCaptionMentionRecommendViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 815);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(156);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 800), awS575S0100000_31, AFwS221S0000000_31.get$arr$(225), new AwS575S0100000_31((C03K6) this, 801), new AwS575S0100000_31((C03K6) this, 803), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 805), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 807), null, new AwS575S0100000_31((C03K6) this, StrategyCenter.ENABLE_SMART_SERVICE));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 802);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 804);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 806);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 54));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 809);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 810);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 811);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 812);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 813);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 814), awS575S0100000_31, AFwS221S0000000_31.get$arr$(227), new AwS575S0100000_31((C03K6) this, 816), new AwS575S0100000_31((C03K6) this, 817), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 818), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 819), null, new AwS575S0100000_31((C03K6) this, 820));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 821), awS575S0100000_31, AFwS221S0000000_31.get$arr$(228), new AwS575S0100000_31((C03K6) this, 822), new AwS575S0100000_31((C03K6) this, 823), new AwS575S0100000_31((C03K6) this, 824), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 825));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(226));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r18) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionRecommendCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dm6, viewGroup, false);
    }
}
