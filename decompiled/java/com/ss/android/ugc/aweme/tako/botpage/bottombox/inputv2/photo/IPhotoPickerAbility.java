package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo;

import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public interface IPhotoPickerAbility extends InterfaceC494301wD {
    void OQ(boolean z);

    void eh(String str, Function2<? super BaseImage, ? super Integer, Unit> function2);

    void na(String str, Function2<? super BaseImage, ? super Integer, Unit> function2);

    void wu(BaseImage baseImage, String str);
}
