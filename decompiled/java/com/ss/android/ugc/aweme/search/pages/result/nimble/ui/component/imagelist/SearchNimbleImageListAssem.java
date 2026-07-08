package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.imagelist;

import X.C723830SaL;
import X.C724270Sb3;
import X.InterfaceC685060Qu0;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleImageListAssem extends SearchNimbleBaseAssem<List<? extends ImageData>> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyy;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Gp, reason: merged with bridge method [inline-methods] */
    public final List<ImageData> tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC685060Qu0) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLJJI().getSubImages();
    }

    public final int Fp() {
        NimbleConfig nimbleConfigSp;
        Integer num;
        NimbleConfig nimbleConfigSp2 = sp();
        if (!(nimbleConfigSp2 != null ? Intrinsics.LJFF(nimbleConfigSp2.aggregatable, Boolean.TRUE) : false) || (nimbleConfigSp = sp()) == null || (num = nimbleConfigSp.maxPhotoColumn) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 241));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final boolean op(List<? extends ImageData> list) {
        boolean z;
        List<? extends ImageData> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
