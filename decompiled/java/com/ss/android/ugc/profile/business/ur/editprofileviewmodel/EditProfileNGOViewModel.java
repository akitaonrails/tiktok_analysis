package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C0XQ7;
import X.C1215360hjS;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileNGOViewModel extends AssemViewModel<C1215360hjS> {
    public static final /* synthetic */ int LLILLL = 0;
    public EditProfileSyncSharedViewModel LL;
    public User LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215360hjS(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = (EditProfileSyncSharedViewModel) new C736950SvV(C13LE.LIZ(EditProfileSyncSharedViewModel.class), AFwS207S0000000_19.get$arr$(429), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(404), null, null, null).getValue();
        this.LL = editProfileSyncSharedViewModel;
        this.LLILLJJLI = (User) editProfileSyncSharedViewModel.LLILLL.getValue();
    }

    public final void wQ2(IDonationService.OrganizationModel organizationModel) {
        IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
        String str = organizationModel.fundraiserId;
        if (str == null) {
            str = "";
        }
        C0XQ7.LJ();
        String curSecUserId = C0XQ7.LIZ.LJIIJ().getCurSecUserId();
        String str2 = organizationModel.orgId;
        if (str2 == null) {
            str2 = "";
        }
        iFundraiserServiceLJIILL.LJIIJ(str, curSecUserId, str2, new AwS598S0100000_19(this, 367), new AwS563S0100000_19(this, 2261));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vQ2(com.ss.android.ugc.aweme.services.external.IDonationService.OrganizationModel r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNGOViewModel.vQ2(com.ss.android.ugc.aweme.services.external.IDonationService$OrganizationModel, java.util.Map):boolean");
    }
}
