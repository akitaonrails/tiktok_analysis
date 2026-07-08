package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.AbstractC738140SxQ;
import X.C0BR4;
import X.C0PS3;
import X.C0QF5;
import X.C14EU;
import X.C1558520qew;
import X.C19EG;
import X.C679340Qkm;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC644920PRi;
import X.InterfaceC644960PRm;
import X.InterfaceC645000PRq;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicSurveyAbility;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicSurveyAssem extends AbstractC738140SxQ implements ISearchDynamicSurveyAbility, InterfaceC1554640qYg {
    public SurveyViewModel LL;
    public InterfaceC644920PRi LLILLJJLI;
    public InterfaceC644960PRm LLILLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -416843759) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicSurveyAbility
    public final void vz2() {
        InterfaceC644920PRi interfaceC644920PRi = this.LLILLJJLI;
        if (interfaceC644920PRi != null) {
            interfaceC644920PRi.kD2();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicSurveyAbility
    public final void Lh() {
        InterfaceC644960PRm interfaceC644960PRm;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (interfaceC644960PRm = this.LLILLL) == null) {
            return;
        }
        interfaceC644960PRm.LIZJ(fragmentLJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        InterfaceC645000PRq interfaceC645000PRqLJ;
        InterfaceC644920PRi interfaceC644920PRiLIZ;
        InterfaceC644960PRm interfaceC644960PRmLIZIZ;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            this.LL = (SurveyViewModel) C679340Qkm.LIZIZ(fragmentLJI, c19egLIZ).get(SurveyViewModel.class);
            if (C0BR4.LIZ()) {
                ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
                InterfaceC644960PRm interfaceC644960PRm = null;
                if (iSearchSurveyLIZ != null) {
                    interfaceC645000PRqLJ = iSearchSurveyLIZ.LJ();
                    if (interfaceC645000PRqLJ != null && (interfaceC644920PRiLIZ = interfaceC645000PRqLJ.LIZ()) != null) {
                        interfaceC644920PRiLIZ.KC1(fragmentLJI);
                    }
                    this.LLILLJJLI = interfaceC644920PRiLIZ;
                    if (interfaceC645000PRqLJ != null && (interfaceC644960PRmLIZIZ = interfaceC645000PRqLJ.LIZIZ()) != null) {
                        interfaceC644960PRmLIZIZ.LIZIZ(this.LLILLJJLI);
                        interfaceC644960PRm = interfaceC644960PRmLIZIZ;
                    }
                    this.LLILLL = interfaceC644960PRm;
                } else {
                    interfaceC645000PRqLJ = null;
                }
                interfaceC644920PRiLIZ = null;
                this.LLILLJJLI = interfaceC644920PRiLIZ;
                if (interfaceC645000PRqLJ != null) {
                    interfaceC644960PRmLIZIZ.LIZIZ(this.LLILLJJLI);
                    interfaceC644960PRm = interfaceC644960PRmLIZIZ;
                }
                this.LLILLL = interfaceC644960PRm;
            }
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @C14EU
    public final void onFeedbackSubmitSuccess(C0PS3 c0ps3) {
        NextLiveData<Boolean> nextLiveData;
        SurveyViewModel surveyViewModel = this.LL;
        if (surveyViewModel != null && (nextLiveData = surveyViewModel.LL) != null) {
            nextLiveData.postValue(Boolean.TRUE);
        }
    }
}
