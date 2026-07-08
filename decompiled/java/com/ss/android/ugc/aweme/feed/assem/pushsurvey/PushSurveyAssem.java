package com.ss.android.ugc.aweme.feed.assem.pushsurvey;

import X.C01GW;
import X.C09CT;
import X.C13LE;
import X.C14EU;
import X.C1888380zEy;
import X.C2217381BqS;
import X.C622680Oba;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PushSurveyAssem extends BaseCellSlotComponent<PushSurveyAssem> {
    public View LLJLLIL;
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS271S0000000_28.get$arr$(101));
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJZ;

    public static final class SurveyData {

        @C09CT("aid")
        public int aid;

        @C09CT("aweme_id")
        public String awemeId;

        @C09CT("country_code")
        public String countryCode;

        @C09CT("region")
        public String region;

        @C09CT("survey_key")
        public String surveyKey;

        @C09CT("user_id")
        public String userId;

        public SurveyData() {
            this("", "", "", "", "", 0);
        }

        public SurveyData(String str, String str2, String str3, String str4, String str5, int i) {
            this.awemeId = str;
            this.surveyKey = str2;
            this.userId = str3;
            this.region = str4;
            this.countryCode = str5;
            this.aid = i;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    @C14EU
    public final void onSurveyVisible(C1888380zEy c1888380zEy) {
        int i;
        View viewLJJIJL = LJJIJL();
        if (c1888380zEy.LIZ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = view.findViewById(R.id.tqy);
        C622680Oba.LIZJ(this);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0zps
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS315S0000000_28.get$arr$(11), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
