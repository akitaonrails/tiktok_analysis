package com.ss.android.ugc.profile.business.creator.monetization;

import X.C0XQ7;
import X.C1250210idf;
import X.C20684815ws;
import X.C2344009Gk;
import X.C828330WeV;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellSupportingProtocol extends ContentCellProtocol implements GenericLifecycleObserver {
    public TuxSheet LLL;
    public Map<String, String> LLLF;
    public SupportingData LLLFF;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_supporting";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.IQ2(new AwS598S0100000_19(this, 307));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        String donationLink;
        String uid;
        Resources resources;
        SupportingData supportingData = this.LLLFF;
        ProfileNgoStruct supportedNonprofit = supportingData != null ? supportingData.getSupportedNonprofit() : null;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        String str = "";
        if (supportedNonprofit == null || (donationLink = supportedNonprofit.getDonationLink()) == null) {
            donationLink = "";
        }
        c2344009Gk.LJIIIIZZ("link", donationLink);
        User user = getUser();
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("link_type", "nonprofit");
        c2344009Gk.LJIIIIZZ("powered_by", supportedNonprofit != null ? supportedNonprofit.getOrgType() : null);
        c2344009Gk.LJIIIIZZ("ngo_name", supportedNonprofit != null ? supportedNonprofit.getName() : null);
        c2344009Gk.LJIIIIZZ("fundraiser_id", supportedNonprofit != null ? supportedNonprofit.getFundraiserId() : null);
        this.LLLF = c2344009Gk.LIZ;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            Object[] objArr = new Object[1];
            objArr[0] = supportedNonprofit != null ? supportedNonprofit.getName() : null;
            String string = resources.getString(2131838233, objArr);
            if (string != null) {
                str = string;
            }
        }
        LJLI(str);
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void destroy() {
        new C828330WeV(new ThirdPartyBizCert(402677760)).LIZJ();
    }

    public final User getUser() {
        return C0XQ7.LJFF().getCurUser();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.creator.monetization.ContentCellSupportingProtocol.LJII(android.view.View):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        SupportingData supportingData = (SupportingData) C1250210idf.LIZ(nVar.toString(), SupportingData.class);
        this.LLLFF = supportingData;
        this.LLJJJJ = supportingData;
        this.LLJILJIL = supportingData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJI(boolean z) {
        if (z) {
            C20684815ws.LJIILLIIL("show_link", this.LLLF);
        }
    }
}
