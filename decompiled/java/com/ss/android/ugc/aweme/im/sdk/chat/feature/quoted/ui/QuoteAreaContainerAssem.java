package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import X.C13LE;
import X.C461000I5y;
import X.C462520IBu;
import X.C723830SaL;
import X.C869590Y9l;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class QuoteAreaContainerAssem extends ReusedSkeletonUIContentAssem<QuoteAreaContainerAssem, C461000I5y> {
    public QuoteAreaContainerAssem() {
        super(C462520IBu.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 90));
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 91));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(C869590Y9l c869590Y9l, C461000I5y c461000I5y) {
        if (c461000I5y.LL.LLILZLL) {
            C723830SaL.LJ(this, C13LE.LIZ(QuotedAreaReusedAssem2.class), false, null);
        } else {
            C723830SaL.LJ(this, C13LE.LIZ(QuotedAreaReusedAssem.class), false, null);
        }
    }
}
