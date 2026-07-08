package com.ss.android.ugc.aweme.feed.model;

import X.C09AY;
import X.C19EG;
import androidx.lifecycle.ViewModelProviders;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSharePlayerViewModel$Companion$getViewModel$1 extends C09AY implements Function0<FeedSharePlayerViewModel> {
    public final /* synthetic */ C19EG $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedSharePlayerViewModel$Companion$getViewModel$1(C19EG c19eg) {
        super(0);
        this.$activity = c19eg;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ViewModel, com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FeedSharePlayerViewModel invoke() {
        return ViewModelProviders.of(this.$activity).get(FeedSharePlayerViewModel.class);
    }
}
