package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel;

import X.C106F;
import X.C106G;
import X.C106V;
import X.C10B3;
import X.C10B4;
import X.C10B9;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C1888900zFo;
import X.C1888930zFr;
import X.C191862104e;
import X.C191871104n;
import X.C191880104w;
import X.InterfaceC1888940zFs;
import X.InterfaceC989510brB;
import Y.AfS162S0200000_28;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.api.PaPromptApi;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptViewModel extends ViewModel {
    public final MutableLiveData<C10B4> LL = new MutableLiveData<>(C10B4.NONE);
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>(Boolean.FALSE);
    public C10B9 LLILLL;
    public final boolean LLILZ;
    public final C106F LLILZIL;

    public final void vQ2() {
        C106V.LIZ.getClass();
        C191880104w c191880104wLIZIZ = C106V.LIZIZ();
        String str = this.LLILZ ? "privacy_account_prompt_review" : "private_account_prompt";
        C10B4 value = this.LL.getValue();
        int i = (value == null ? -1 : C10B3.LIZ[value.ordinal()]) == 1 ? 2 : 1;
        c191880104wLIZIZ.getClass();
        C191880104w.LJIJ(i, str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iPrivacySettingsDepService.LJIILL();
        }
    }

    public final C10B9 wQ2() {
        C10B9 c10b9 = this.LLILLL;
        if (c10b9 != null) {
            return c10b9;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0brB, X.106F] */
    public PaPromptViewModel() {
        Integer numLJJIII;
        ?? r2 = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.106F
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                C10B4 c10b4;
                PrivacyUserSettingsV2 privacyUserSettingsV22 = privacyUserSettingsV2;
                PaPromptViewModel paPromptViewModel = this.LL;
                if (paPromptViewModel.LLILZ) {
                    MutableLiveData<C10B4> mutableLiveData = paPromptViewModel.LL;
                    if (privacyUserSettingsV22 != null && C103K.LIZ(privacyUserSettingsV22)) {
                        c10b4 = C10B4.PRIVATE;
                    } else {
                        c10b4 = C10B4.PUBLIC;
                    }
                    mutableLiveData.postValue(c10b4);
                }
            }
        };
        this.LLILZIL = r2;
        boolean z = false;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null && (numLJJIII = iPrivacySettingsDepService.LJJIII()) != null && numLJJIII.intValue() == 5) {
            z = true;
        }
        this.LLILZ = z;
        C191871104n.LJ().getClass();
        C191862104e.LIZJ(r2);
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        C191880104w.LIZLLL(null, null, true);
        C106V.LIZIZ().getClass();
        C191871104n.LIZ().getClass();
        C1888900zFo.LIZIZ(null);
        C1888900zFo.LIZJ(null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C191862104e c191862104eLJ = C191871104n.LJ();
        C106F c106f = this.LLILZIL;
        c191862104eLJ.getClass();
        C191862104e.LIZLLL(c106f);
    }

    public final void xQ2(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        int i;
        C11NZ c11nzLIZJ;
        this.LLILLJJLI.postValue(Boolean.TRUE);
        C106G c106g = PaPromptApi.LIZ;
        if (this.LL.getValue() == C10B4.PUBLIC) {
            i = 0;
        } else {
            i = 1;
        }
        c106g.getClass();
        C11NZ c11nzLIZIZ = C1888930zFr.LIZIZ(C106G.LIZIZ.updatePrivateAccountAndFetchPrivacySettings(i), "/tiktok/privacy/user/private_account_prompt/v1", null);
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ != null && (c11nzLIZJ = interfaceC1888940zFsLIZJ.LIZJ(c11nzLIZIZ, "/tiktok/privacy/user/private_account_prompt/v1", null)) != null) {
            c11nzLIZIZ = c11nzLIZJ;
        }
        c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS162S0200000_28((Object) this, (MutableLiveData<Integer>) function0, (Function0<Unit>) 10), new AfS162S0200000_28((Object) this, (MutableLiveData<Integer>) function1, (Function0<Unit>) 11));
    }
}
