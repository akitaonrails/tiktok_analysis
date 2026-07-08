package detailpage.assem;

import X.C019F;
import X.C0I0B;
import X.C1243340iSa;
import X.C1247530iZL;
import X.C1390850mIV;
import X.C13LE;
import X.C1637806bA;
import X.C1689206jS;
import X.C1703106lh;
import X.C1721006oa;
import X.C19719912Dl;
import X.C19EG;
import X.C1A62;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C898250ZLr;
import X.C898670ZNh;
import X.C912520Zr0;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import Y.AObserverS206S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem;
import com.zhiliaoapp.musically.R;
import detailpage.vm.SingleDetailViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleDetailNavAssem extends ChatDetailNavAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleDetailNavAssem.class, "vm", "getVm()Ldetailpage/vm/SingleDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SingleDetailNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleDetailViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 917), AFwS229S0000000_2.get$arr$(560), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void No() {
        EventLiveData<C1243340iSa> eventLiveDataLIZ;
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ == null || !iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.06mb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721506of) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 75), 6);
        IMHostApiRelationService.LIZ.getClass();
        IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
        if (iMHostApiRelationServiceLIZ == null || (eventLiveDataLIZ = iMHostApiRelationServiceLIZ.LIZ()) == null) {
            return;
        }
        eventLiveDataLIZ.observe(this, new AObserverS206S0100000_2(this, 10));
    }

    public final SingleDetailViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SingleDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void Go() {
        IMUser iMUser;
        SingleDetailViewModel singleDetailViewModelOo = Oo();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (iMUser = singleDetailViewModelOo.getState().LL.LIZ) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (singleDetailViewModelOo.xQ2()) {
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_block_fill);
            c1247530iZL.LIZIZ(iMUser.isBlock() ? 2131835251 : 2131835247);
            c1247530iZL.LIZJ = 0;
            c1247530iZL.LJ = new ACListenerS137S0100000_2(singleDetailViewModelOo, 95);
            arrayList.add(c1247530iZL);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJFF(arrayList);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        tuxActionSheetLIZJ.show(c19egLIZ.getSupportFragmentManager(), "single_detail_dialog");
        singleDetailViewModelOo.runOnUIThread(new AwS368S0200000_2(tuxActionSheetLIZJ, c19egLIZ, 173));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void Ho() {
        String str;
        Long l;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            SingleDetailViewModel singleDetailViewModelOo = Oo();
            IMUser iMUser = singleDetailViewModelOo.getState().LL.LIZ;
            if (iMUser == null || (str = (String) singleDetailViewModelOo.LLILLJJLI.getValue()) == null || (l = (Long) singleDetailViewModelOo.LLILZIL.getValue()) == null) {
                return;
            }
            long jLongValue = l.longValue();
            C1721006oa c1721006oaVQ2 = singleDetailViewModelOo.vQ2();
            int i = (c1721006oaVQ2 == null || !c1721006oaVQ2.LLILLJJLI) ? iMUser.getCommerceUserLevel() > 0 ? 2 : 0 : 1;
            String strValueOf = String.valueOf(jLongValue);
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            String contactName = iMUser.getContactName();
            IReportUtils.LIZ.getClass();
            C1689206jS c1689206jS = new C1689206jS(new C912520Zr0(strValueOf, uid, str, jLongValue, C1703106lh.LIZJ(iMUser), Boolean.valueOf(iMUser.isBlock()), "im", i, "click_head", contactName, 0, false, false, iMUser.getNickName(), iMUser.getDisplayAvatar(), Integer.valueOf(iMUser.getFollowingCount()), Integer.valueOf(iMUser.getFollowerCount()), Integer.valueOf(iMUser.getFollowStatus()), null, "", "chat", "im_detail_page"));
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(c1689206jS, c19egLIZ, "1", null, true);
            }
            IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
            if (iIMMessageAdapterAnalytics != null) {
                iIMMessageAdapterAnalytics.LIZJ(iMUser, C0I0B.LJFF.LIZIZ(), "chat");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final C1A62 Lo() {
        if (Oo().xQ2()) {
            return C1A62.MORE;
        }
        return null;
    }
}
