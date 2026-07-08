package com.ss.android.ugc.aweme.template.assem;

import X.C426750GoL;
import android.content.Context;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class TemplateBannerAssem extends DynamicAssem {
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.template.assem.TemplateBannerAssem.onParentViewCreated():void");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        Context context = getContext();
        return (context == null || !C426750GoL.LIZLLL(context)) ? R.layout.ftq : R.layout.ftr;
    }
}
