package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment;

import X.C16F5;
import X.C500980Jkm;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import webcast.api.sub.TopicResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpacePostCategoryFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LDHELIOS04O2s/PC0gOCQvLGE9LTI8JjwnZjMlLDh9LjctLiI2JjFiGjoxGzUtKioDJzY4Ci4nLSIjOzYVOiQrJCo9PA==";
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public C16F5 LLILZ;
    public FragmentManager LLILZIL;
    public String LLILZLL = "";
    public String LLIZ = "";
    public boolean LLIZLLLIL;
    public TopicResponse.ResponseData LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final LinearLayout MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rly) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.glr);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[PHI: r1
      0x0058: PHI (r1v16 android.view.View) = (r1v15 android.view.View), (r1v30 android.view.View) binds: [B:16:0x0045, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubSpacePostCategoryFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
