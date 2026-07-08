package com.ss.android.ugc.aweme.music.model;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;

/* JADX INFO: loaded from: classes10.dex */
public interface AddSongEntranceViewModel {
    public static final Companion Companion = Companion.$$INSTANCE;

    DspPlatform getDisplayedDsp();

    void onClick(Fragment fragment, Activity activity);

    void onShow(boolean z);

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final AddSongEntranceViewModel DEFAULT_IMPL = new AddSongEntranceViewModel() { // from class: com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel$Companion$DEFAULT_IMPL$1
            @Override // com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel
            public DspPlatform getDisplayedDsp() {
                return AddSongEntranceViewModel.DefaultImpls.getDisplayedDsp(this);
            }

            @Override // com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel
            public void onShow(boolean z) {
                AddSongEntranceViewModel.DefaultImpls.onShow(this, z);
            }

            @Override // com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel
            public void onClick(Fragment fragment, Activity activity) {
                AddSongEntranceViewModel.DefaultImpls.onClick(this, fragment, activity);
            }
        };

        public final AddSongEntranceViewModel getDEFAULT_IMPL() {
            return DEFAULT_IMPL;
        }
    }

    public static final class DefaultImpls {
        public static void onClick(AddSongEntranceViewModel addSongEntranceViewModel, Fragment fragment, Activity activity) {
        }

        public static void onShow(AddSongEntranceViewModel addSongEntranceViewModel, boolean z) {
        }

        public static DspPlatform getDisplayedDsp(AddSongEntranceViewModel addSongEntranceViewModel) {
            return DspPlatform.UNKNOWN;
        }
    }
}
