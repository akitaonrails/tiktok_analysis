package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C01GW;
import X.C0XIR;
import X.C1215500hjg;
import X.C1215680hjy;
import X.C1215760hk6;
import X.C1215770hk7;
import X.C1220000hqw;
import X.C1232410iAx;
import X.C1235040iFC;
import X.C13LE;
import X.C1494450ozb;
import X.C1BWL;
import X.C2187451AjH;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1216800hlm;
import X.InterfaceC0148002o;
import android.text.TextUtils;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS18S2000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileNamesViewModel extends AssemViewModel<C1215500hjg> {
    public EditProfileSyncSharedViewModel LL;
    public User LLILLJJLI;
    public int LLILLL;
    public final C1235040iFC LLILZ = new C1235040iFC();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(430));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(431));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2262));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215500hjg(0);
    }

    public final void zQ2() {
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = this.LL;
        if (editProfileSyncSharedViewModel == null) {
            editProfileSyncSharedViewModel = null;
        }
        editProfileSyncSharedViewModel.wQ2();
        setState(AFwS257S0000000_19.get$arr$(406));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = (EditProfileSyncSharedViewModel) new C736950SvV(C13LE.LIZ(EditProfileSyncSharedViewModel.class), AFwS207S0000000_19.get$arr$(432), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(405), null, null, null).getValue();
        this.LL = editProfileSyncSharedViewModel;
        this.LLILLJJLI = (User) editProfileSyncSharedViewModel.LLILLL.getValue();
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = this.LL;
        this.LLILLL = (editProfileSyncSharedViewModel2 != null ? editProfileSyncSharedViewModel2 : null).LLILLJJLI;
    }

    public final void xQ2(String str) {
        String str2;
        int i = C2187451AjH.LIZ;
        if (str != null && str.length() != 0) {
            setState(new AwS70S1000000_19(str, 7));
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (!TextUtils.isEmpty(str)) {
                str2 = "bold";
            } else {
                str2 = "blank";
            }
            try {
                if (zIsEmpty) {
                    if (getState().LLIZLLLIL) {
                        setState(AFwS257S0000000_19.get$arr$(722));
                    }
                } else if (!getState().LLIZLLLIL) {
                    setState(AFwS257S0000000_19.get$arr$(723));
                }
                EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = this.LL;
                EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = null;
                if (editProfileSyncSharedViewModel == null) {
                    editProfileSyncSharedViewModel = null;
                }
                editProfileSyncSharedViewModel.getClass();
                editProfileSyncSharedViewModel.setState(new AwS18S2000000_19("nickname", str2, 4));
                EditProfileSyncSharedViewModel editProfileSyncSharedViewModel3 = this.LL;
                if (editProfileSyncSharedViewModel3 != null) {
                    editProfileSyncSharedViewModel2 = editProfileSyncSharedViewModel3;
                }
                editProfileSyncSharedViewModel2.getClass();
                editProfileSyncSharedViewModel2.setState(AFwS257S0000000_19.get$arr$(729));
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            withState(new AwS598S0100000_19(this, 368));
        }
    }

    public static String wQ2(Exception exc, EnumC1216800hlm enumC1216800hlm) {
        C0XIR c0xir;
        String errorMsg;
        if (exc instanceof C1494450ozb) {
            if (enumC1216800hlm == EnumC1216800hlm.USERNAME) {
                return C1BWL.LIZJ().getString(2131845399);
            }
            return C1BWL.LIZJ().getString(2131845397);
        }
        if ((exc instanceof C0XIR) && (errorMsg = (c0xir = (C0XIR) exc).getErrorMsg()) != null && errorMsg.length() != 0) {
            return c0xir.getErrorMsg();
        }
        if (enumC1216800hlm == EnumC1216800hlm.USERNAME) {
            return C1BWL.LIZJ().getString(2131845398);
        }
        return C1BWL.LIZJ().getString(2131845394);
    }

    public final boolean vQ2(String str, boolean z) {
        if (z) {
            return false;
        }
        if (((Regex) this.LLILZIL.getValue()).matches(str) && !((Pattern) this.LLILZLL.getValue()).matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public final void yQ2(String str, C1215680hjy c1215680hjy) {
        C1215770hk7.LIZ.getClass();
        if (C1215770hk7.LIZIZ(str)) {
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = null;
            if (C1215760hk6.LIZ(str, GlobalContext.getApplicationContext())) {
                EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = this.LL;
                if (editProfileSyncSharedViewModel2 != null) {
                    editProfileSyncSharedViewModel = editProfileSyncSharedViewModel2;
                }
                editProfileSyncSharedViewModel.getClass();
                editProfileSyncSharedViewModel.setState(AFwS257S0000000_19.get$arr$(730));
                ((C1232410iAx) this.LLIZ.getValue()).LIZJ(str);
                setState(new AwS103S1200000_19(str, this, c1215680hjy, 8));
                return;
            }
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel3 = this.LL;
            if (editProfileSyncSharedViewModel3 != null) {
                editProfileSyncSharedViewModel = editProfileSyncSharedViewModel3;
            }
            editProfileSyncSharedViewModel.wQ2();
        }
    }
}
