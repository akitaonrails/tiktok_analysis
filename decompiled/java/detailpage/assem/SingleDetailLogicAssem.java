package detailpage.assem;

import X.C019F;
import X.C069P;
import X.C0ZP4;
import X.C13LE;
import X.C1637806bA;
import X.C1721006oa;
import X.C19719912Dl;
import X.C19EG;
import X.C1BGS;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1480505qt;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import detailpage.vm.SingleDetailViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleDetailLogicAssem extends ChatDetailLogicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLJILLL;
    public C0ZP4 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleDetailLogicAssem.class, "vm", "getVm()Ldetailpage/vm/SingleDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SingleDetailLogicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleDetailViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 915), AFwS229S0000000_2.get$arr$(558), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C0ZP4 c0zp4 = this.LLJJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        this.LLJJ = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06om
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721506of) obj).LLIZ;
            }
        }, null, new AwS616S0100000_2(this, 73), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZP4 c0zp4 = this.LLJJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        IMUser iMUser;
        IMUser iMUser2;
        super.onResume();
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            AssemVMLazy assemVMLazy = this.LLJILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            final SingleDetailViewModel singleDetailViewModel = (SingleDetailViewModel) assemVMLazy.getValue();
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            C1721006oa c1721006oaVQ2 = singleDetailViewModel.vQ2();
            String secUid = null;
            String uid = (c1721006oaVQ2 == null || (iMUser2 = c1721006oaVQ2.LL) == null) ? null : iMUser2.getUid();
            C1721006oa c1721006oaVQ22 = singleDetailViewModel.vQ2();
            if (c1721006oaVQ22 != null && (iMUser = c1721006oaVQ22.LL) != null) {
                secUid = iMUser.getSecUid();
            }
            c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.06on
                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser3) {
                    singleDetailViewModel.setState(new AwS581S0100000_2(iMUser3, 721));
                    SingleDetailViewModel singleDetailViewModel2 = singleDetailViewModel;
                    singleDetailViewModel2.LLIZLLLIL = iMUser3;
                    C19EG c19eg = c19egLIZ;
                    singleDetailViewModel2.LLILZLL = new BlockUserController(c19eg, iMUser3, "chat_detail", "button", null, new AwS368S0200000_2(c19eg, singleDetailViewModel, 172), null, null, (String) singleDetailViewModel.LLILLJJLI.getValue(), null, 720);
                }
            }, uid, secUid, "im_chat_detail", false);
        }
    }
}
