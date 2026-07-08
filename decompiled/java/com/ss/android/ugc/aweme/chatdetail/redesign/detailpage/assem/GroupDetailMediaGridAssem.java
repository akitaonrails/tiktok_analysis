package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailMediaGridAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupDetailMediaGridAssem extends ChatDetailMediaGridAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailMediaGridAssem.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupDetailMediaGridAssem() {
        C019F c019f = C019F.LIZ;
        AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(71);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 490), AFwS257S0000000_19.get$arr$(79), aFwS207S0000000_19, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailMediaGridAssem
    public final void lp() {
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0hih
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZUE) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 12), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailMediaGridAssem
    public final MediaGridViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (MediaGridViewModel) assemVMLazy.getValue();
    }
}
