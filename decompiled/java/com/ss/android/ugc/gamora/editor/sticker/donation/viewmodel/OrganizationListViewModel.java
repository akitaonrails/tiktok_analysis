package com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import X.AnonymousClass1112;
import X.AnonymousClass1113;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C19413310xH;
import X.C194325110x;
import X.C194326110y;
import X.C194327110z;
import Y.AfS60S0110000_29;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OrganizationListViewModel extends ViewModel {
    public final MutableLiveData<C19413310xH> LL;
    public final MutableLiveData LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final List<OrganizationModel> LLILZIL;
    public String LLILZLL;
    public final List<OrganizationSearchResultModel> LLIZ;

    public final void LLIZLLLIL() {
        ((ArrayList) this.LLILZIL).clear();
        this.LLILLL = 0;
        this.LLILZ = 1;
        this.LLILZLL = null;
        ((ArrayList) this.LLIZ).clear();
    }

    public OrganizationListViewModel() {
        MutableLiveData<C19413310xH> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        this.LLILZ = 1;
        this.LLILZIL = new ArrayList();
        this.LLIZ = new ArrayList();
    }

    public final void vQ2(boolean z) {
        boolean z2;
        Boolean boolValueOf;
        C11NZ c11nzLIZ;
        boolean zLJI = MethodIDManager.LJI(202506);
        MutableLiveData<C19413310xH> mutableLiveData = this.LL;
        List<OrganizationModel> list = this.LLILZIL;
        if (this.LLILZ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mutableLiveData.setValue(new C19413310xH(null, false, null, list, null, null, true, false, z, z2, 181));
        IDonationVendorService iDonationVendorService = (IDonationVendorService) PluggableExtentionKt.pluggableSpi$default(IDonationVendorService.class, false, false, false, 14, null);
        if (iDonationVendorService != null) {
            boolValueOf = Boolean.valueOf(iDonationVendorService.enableDonationPercentService());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            c11nzLIZ = AnonymousClass1113.LIZ(new AnonymousClass1112(this.LLILLL, "PERCENT"));
        } else {
            c11nzLIZ = AnonymousClass1113.LIZ(new AnonymousClass1112(this.LLILLL, "TILTIFY"));
        }
        c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS60S0110000_29(this, z, 1), new AfS60S0110000_29(this, z, 2));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void wQ2(boolean z) {
        boolean z2;
        MutableLiveData<C19413310xH> mutableLiveData = this.LL;
        List<OrganizationSearchResultModel> list = this.LLIZ;
        String str = this.LLILZLL;
        if (this.LLILZ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mutableLiveData.setValue(new C19413310xH(str, true, list, null, null, null, true, false, z, z2, 184));
        C194327110z c194327110z = new C194327110z();
        if (z) {
            c194327110z.LIZ = this.LLILLL;
        }
        c194327110z.LIZIZ = this.LLILZLL;
        IDonationVendorService iDonationVendorService = (IDonationVendorService) PluggableExtentionKt.pluggableSpi$default(IDonationVendorService.class, false, false, false, 14, null);
        if (iDonationVendorService != null && iDonationVendorService.enableDonationPercentService()) {
            c194327110z.LIZJ = "PERCENT";
        }
        OrganizationSearchApi.Api api = OrganizationSearchApi.LIZ;
        C194326110y c194326110y = new C194326110y();
        c194326110y.LIZ = c194327110z.LIZ;
        c194326110y.LIZIZ = 11;
        c194326110y.LIZJ = c194327110z.LIZIZ;
        c194326110y.LIZLLL = c194327110z.LIZJ;
        C194325110x.LIZ(c194326110y).LJJIJIIJI(C11S5.LIZ).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS60S0110000_29(this, z, 3), new AfS60S0110000_29(this, z, 4));
    }
}
