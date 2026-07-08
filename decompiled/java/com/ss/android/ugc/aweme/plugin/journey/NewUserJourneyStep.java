package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeens;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserJourneyStep {

    @C09CT("ab_expose_vid")
    public final String abExposeVid;

    @C09CT("ad_subscription_age_gate_page")
    public final AgeGateModel adAgeGatePage;

    @C09CT("ad_free_trial_payload")
    public final AdFreeTrialPageInfo adFreeTrialPageInfo;

    @C09CT("consistent_content_and_ad_choice_page")
    public final JourneyConsistentContentAndAdChoicesStruct consistentContentAndAdChoices;

    @C09CT("page_id")
    public final int id;

    @C09CT("new_user_content_language_page")
    public final JourneyContentLanguageWrapper newUserContentLanguagePage;

    @C09CT("new_user_interest_page")
    public final NewUserInterestPageStruct newUserInterestPage;

    @C09CT("page_type")
    public final String pageType;

    @C09CT("pick_your_plan_payload")
    public final PickYourAdPlanPage pickYourAdPlanPage;

    @C09CT("privacy_highlights_teens")
    public final PrivacyHighlightsForTeens privacyHighlightsForTeensInfo;

    @C09CT("topic_interest")
    public final List<Object> topicInterestList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserJourneyStep)) {
            return false;
        }
        NewUserJourneyStep newUserJourneyStep = (NewUserJourneyStep) obj;
        return this.id == newUserJourneyStep.id && Intrinsics.LJFF(this.newUserInterestPage, newUserJourneyStep.newUserInterestPage) && Intrinsics.LJFF(this.newUserContentLanguagePage, newUserJourneyStep.newUserContentLanguagePage) && Intrinsics.LJFF(this.topicInterestList, newUserJourneyStep.topicInterestList) && Intrinsics.LJFF(this.privacyHighlightsForTeensInfo, newUserJourneyStep.privacyHighlightsForTeensInfo) && Intrinsics.LJFF(this.abExposeVid, newUserJourneyStep.abExposeVid) && Intrinsics.LJFF(this.pageType, newUserJourneyStep.pageType) && Intrinsics.LJFF(this.adAgeGatePage, newUserJourneyStep.adAgeGatePage) && Intrinsics.LJFF(this.pickYourAdPlanPage, newUserJourneyStep.pickYourAdPlanPage) && Intrinsics.LJFF(this.adFreeTrialPageInfo, newUserJourneyStep.adFreeTrialPageInfo) && Intrinsics.LJFF(this.consistentContentAndAdChoices, newUserJourneyStep.consistentContentAndAdChoices);
    }

    public NewUserJourneyStep(int i, NewUserInterestPageStruct newUserInterestPageStruct, JourneyContentLanguageWrapper journeyContentLanguageWrapper, List<Object> list, PrivacyHighlightsForTeens privacyHighlightsForTeens, String str, String str2, AgeGateModel ageGateModel, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct) {
        this.id = i;
        this.newUserInterestPage = newUserInterestPageStruct;
        this.newUserContentLanguagePage = journeyContentLanguageWrapper;
        this.topicInterestList = list;
        this.privacyHighlightsForTeensInfo = privacyHighlightsForTeens;
        this.abExposeVid = str;
        this.pageType = str2;
        this.adAgeGatePage = ageGateModel;
        this.pickYourAdPlanPage = pickYourAdPlanPage;
        this.adFreeTrialPageInfo = adFreeTrialPageInfo;
        this.consistentContentAndAdChoices = journeyConsistentContentAndAdChoicesStruct;
    }
}
