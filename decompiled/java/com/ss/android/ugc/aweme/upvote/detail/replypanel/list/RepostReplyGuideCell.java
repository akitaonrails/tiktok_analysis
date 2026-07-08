package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1355670lNl;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C427870Gq9;
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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyGuideCell extends PowerCell<C1355670lNl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public C427870Gq9 LLILLJJLI;
    public TuxTextView LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostReplyGuideCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostReplyGuideCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 990);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(263);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1001), awS565S0100000_21, AFwS209S0000000_21.get$arr$(368), new AwS565S0100000_21((C03K6) this, 976), new AwS565S0100000_21((C03K6) this, 978), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 980), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 982), null, new AwS565S0100000_21((C03K6) this, 983));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 977);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 979);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 981);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 67));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 984);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 985);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 986);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 987);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 988);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 989), awS565S0100000_21, AFwS209S0000000_21.get$arr$(369), new AwS565S0100000_21((C03K6) this, 991), new AwS565S0100000_21((C03K6) this, 992), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 993), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 994), null, new AwS565S0100000_21((C03K6) this, 995));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 996), awS565S0100000_21, AFwS209S0000000_21.get$arr$(370), new AwS565S0100000_21((C03K6) this, 997), new AwS565S0100000_21((C03K6) this, 998), new AwS565S0100000_21((C03K6) this, 999), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, LSPassThroughRecordSizeConfig.DEFAULT));
        }
        this.LL = assemVMLazy;
    }

    public final RepostInteractListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostReplyGuideCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6s, viewGroup, false);
        this.LLILLJJLI = (C427870Gq9) viewTd.findViewById(R.id.taf);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tag);
        return viewTd;
    }
}
