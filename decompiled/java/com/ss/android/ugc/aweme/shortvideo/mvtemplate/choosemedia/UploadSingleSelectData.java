package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class UploadSingleSelectData {

    @C09CT("creation_upload_3cover")
    public final boolean upload3Columns;

    @C09CT("creation_upload_3cover_nonstory")
    public final boolean upload3ColumnsNonStory;

    @C09CT("creation_upload_alltab_nonstory")
    public final boolean uploadAllTabNonStory;

    @C09CT("creation_upload_remember_lastchoice")
    public final boolean uploadRememberLastChoice;

    @C09CT("creation_upload_remember_lastchoice_nonstory")
    public final boolean uploadRememberLastChoiceNonStory;

    @C09CT("creation_upload_singleselect")
    public final boolean uploadSingleSelect;

    @C09CT("creation_upload_singleselect_nonstory")
    public final boolean uploadSingleSelectNonStory;

    public UploadSingleSelectData() {
        this(false, false, false, false, false, false, false);
    }

    public final boolean getUpload3Columns() {
        return this.upload3Columns;
    }

    public final boolean getUpload3ColumnsNonStory() {
        return this.upload3ColumnsNonStory;
    }

    public final boolean getUploadAllTabNonStory() {
        return this.uploadAllTabNonStory;
    }

    public final boolean getUploadRememberLastChoice() {
        return this.uploadRememberLastChoice;
    }

    public final boolean getUploadRememberLastChoiceNonStory() {
        return this.uploadRememberLastChoiceNonStory;
    }

    public final boolean getUploadSingleSelect() {
        return this.uploadSingleSelect;
    }

    public final boolean getUploadSingleSelectNonStory() {
        return this.uploadSingleSelectNonStory;
    }

    public UploadSingleSelectData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.uploadSingleSelect = z;
        this.uploadSingleSelectNonStory = z2;
        this.upload3Columns = z3;
        this.upload3ColumnsNonStory = z4;
        this.uploadRememberLastChoice = z5;
        this.uploadRememberLastChoiceNonStory = z6;
        this.uploadAllTabNonStory = z7;
    }
}
