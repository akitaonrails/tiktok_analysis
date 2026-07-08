package com.ss.android.ugc.profile.business.ur.utils;

import X.C0HMC;
import X.C0HMM;
import X.C0MGE;
import X.C0WZX;
import X.C19EG;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class ProfileAvatarChoosePhotoScene extends MvChoosePhotoScene implements C0MGE, C0HMM, C0HMC {
    public static final int $stable = MvChoosePhotoScene.$stable;

    @Override // X.C0HMC
    public void callback(C19EG c19eg) {
    }

    @Override // X.C0HMM
    public void onSingleImageClicked(MediaModel mediaModel) {
    }

    @Override // X.C0HMM
    public void checkValidAndUpload(Activity activity, List<String> list, String str, Function1<? super List<String>, Unit> function1) throws Throwable {
        if (list.isEmpty()) {
            return;
        }
        Intent intent = new Intent();
        intent.setData(UriProtector.parse((String) ListProtector.get(list, 0)));
        C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi/kqzfRNd6uPWZtosXo1u7ApdRGNZlYKe/eYQu0SA2WlR8w=", null));
        Intent intent2 = activity.getIntent();
        if (intent2 == null || !intent2.getBooleanExtra("extra_keep_gallery_on_next", false)) {
            activity.finish();
        }
    }
}
