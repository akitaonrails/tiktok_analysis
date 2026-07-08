package com.ss.android.ugc.aweme.detail.prefab;

import X.C2097608Jq;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class HeaderBasicInfoAssem extends DynamicAssem {
    public static final Map<String, Integer> LLJJI = C2097608Jq.LJIIIIZZ(new Pair("cover", Integer.valueOf(R.id.cover)), new Pair("desc", Integer.valueOf(R.id.desc)));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bk8;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public Map<String, Integer> kp() {
        return LLJJI;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewGroup viewGroup;
        Object obj = getConfig().LLILZ.get("is_image_right");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            View viewFindViewById = view.findViewById(R.id.cover);
            boolean z = view instanceof ViewGroup;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup2);
                }
                if (z && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.addView(viewFindViewById);
                }
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        mo127do();
    }
}
