package com.ss.android.ugc.aweme.music.v2.assem;

import X.C418440Gaw;
import X.C497820Jfg;
import X.C630120Ona;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class MusicPUGCPlayLoadingAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dq9;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            C786410Ut5.LJJJLZIJ(getContentView(), viewGroup);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        View viewFindViewById;
        mo127do();
        Context context = getContext();
        if (context != null) {
            iLIZIZ = C497820Jfg.LIZIZ(context);
        } else {
            iLIZIZ = 0;
        }
        if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) && (viewFindViewById = view.findViewById(R.id.qk2)) != null) {
            C630120Ona.LIZ(viewFindViewById);
        }
    }
}
