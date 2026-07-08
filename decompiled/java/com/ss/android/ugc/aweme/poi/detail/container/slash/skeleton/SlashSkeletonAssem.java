package com.ss.android.ugc.aweme.poi.detail.container.slash.skeleton;

import X.C00HH;
import X.C098200Yq;
import X.C189200o6;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.ss.android.ugc.aweme.slash.component.SlashSkeletonData;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashSkeletonAssem extends BaseSlashReusedComponent<SlashSkeletonData> {
    public ViewGroup LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e9b;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vj9);
        this.LLJL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(SlashSkeletonData slashSkeletonData) {
        Object c098200Yq;
        int iIntValue;
        super.up(slashSkeletonData);
        Object obj = null;
        try {
            Integer num = slashSkeletonData.skeletonUIType;
            if (num != null) {
                c098200Yq = Integer.valueOf(num.intValue());
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        Map<Integer, Integer> map = C00HH.LIZ;
        Integer num3 = C00HH.LIZ.get(Integer.valueOf(iIntValue));
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            ViewGroup viewGroup = this.LLJL;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            C786410Ut5.Td(C786410Ut5.ne(getContext()), iIntValue2, this.LLJL, true);
            if (iIntValue != -2 && iIntValue != -1 && iIntValue != 8) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e3k, this.LLJL, false);
                ViewGroup viewGroup2 = this.LLJL;
                if (viewGroup2 != null) {
                    viewGroup2.addView(viewTd);
                }
            }
        }
    }
}
