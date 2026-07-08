package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AbstractC2196081AxC;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisIAADebugFragment extends MinisM10nDebugFragment {
    public static WeakReference<AbstractC2196081AxC> LLIZ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiHELIOSEpKzo0ZjAlZwI6Jiw/AA4SDCAuPCgVOiQrJCo9PA==";

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final String MR() {
        return "In-App Ads rewards fulfillment test";
    }

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final String NR() {
        return "Choose an outcome from the dropdown below to mock a fulfillment response";
    }

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final void OR() {
        AbstractC2196081AxC abstractC2196081AxC;
        WeakReference<AbstractC2196081AxC> weakReference = LLIZ;
        if (weakReference == null || (abstractC2196081AxC = weakReference.get()) == null) {
            return;
        }
        getActivity();
        abstractC2196081AxC.LIZLLL();
    }
}
