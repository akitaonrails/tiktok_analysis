package com.ss.android.ugc.aweme.services.draft;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: loaded from: classes8.dex */
public interface IDraftListener {

    /* JADX INFO: loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static void onDeleted(IDraftListener iDraftListener, AwemeDraft awemeDraft) {
        }

        public static void onUpdated(IDraftListener iDraftListener, UpdateParams updateParams) {
        }
    }

    void onDeleted(AwemeDraft awemeDraft);

    void onUpdated(UpdateParams updateParams);

    /* JADX INFO: loaded from: classes9.dex */
    public static final class UpdateParams {
        public final AwemeDraft draft;
        public final boolean isPublish;

        public final boolean isPublish() {
            return this.isPublish;
        }

        public UpdateParams(AwemeDraft awemeDraft) {
            this(awemeDraft, false);
        }

        public UpdateParams(AwemeDraft awemeDraft, boolean z) {
            this.draft = awemeDraft;
            this.isPublish = z;
        }
    }
}
