package com.ss.android.ugc.aweme.commercialize.service;

import X.C09RD;
import X.C09RE;
import X.C1017160cZm;
import X.C19EG;
import X.C786410Ut5;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.service.IProfileContainerService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CommerceAdProfileContainerServiceImpl implements ICommerceAdProfileContainerService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService
    public final void LIZIZ(Activity activity) {
        ViewGroup viewGroup;
        View viewFindViewById = activity.findViewById(R.id.aan);
        if (viewFindViewById != null) {
            ViewParent parent = viewFindViewById.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService
    public final FrameLayout LIZJ(Activity activity) {
        Fragment fragmentLIZLLL;
        View view;
        IProfileContainerService iProfileContainerService;
        Object next;
        FrameLayout frameLayout;
        if (!(activity instanceof C19EG) || (fragmentLIZLLL = LIZLLL(activity)) == null || (view = fragmentLIZLLL.getView()) == null || !(view instanceof ViewGroup) || (iProfileContainerService = (IProfileContainerService) PluggableExtentionKt.pluggableSpi$default(IProfileContainerService.class, false, false, false, 14, null)) == null) {
            return null;
        }
        iProfileContainerService.LIZ();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.s5m);
        if (viewGroup == null) {
            return null;
        }
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                next = c09re.next();
                if (((View) next).getId() == R.id.aan) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        View view2 = (View) next;
        if (view2 != null) {
            if (view2 instanceof FrameLayout) {
                return (FrameLayout) view2;
            }
            C786410Ut5.LJJJLZIJ(view2, viewGroup);
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f872aho, viewGroup, false);
        if (!(viewTd instanceof FrameLayout) || (frameLayout = (FrameLayout) viewTd) == null) {
            return null;
        }
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LIZLLL(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.profile.IProfileService> r0 = com.ss.android.ugc.aweme.profile.IProfileService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.profile.IProfileService r0 = (com.ss.android.ugc.aweme.profile.IProfileService) r0
            if (r0 == 0) goto L39
            java.lang.Class r1 = r0.getProfilePageFragmentClass()
            if (r1 == 0) goto L39
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.detail.ui.DetailActivity
            if (r0 == 0) goto L2d
            boolean r0 = r7 instanceof X.C19EG
            if (r0 == 0) goto L38
            X.19EG r7 = (X.C19EG) r7
            if (r7 == 0) goto L38
            androidx.fragment.app.FragmentManager r0 = r7.getSupportFragmentManager()
        L26:
            if (r0 == 0) goto L38
            androidx.fragment.app.Fragment r0 = LJ(r0, r1)
            return r0
        L2d:
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L38
            androidx.fragment.app.FragmentManager r0 = r0.LJ()
            goto L26
        L38:
            return r5
        L39:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.service.CommerceAdProfileContainerServiceImpl.LIZLLL(android.content.Context):androidx.fragment.app.Fragment");
    }

    public static Fragment LJ(FragmentManager fragmentManager, Class cls) {
        List<Fragment> listLJJLIIIJL;
        if (fragmentManager != null && (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) != null && (!listLJJLIIIJL.isEmpty())) {
            for (Fragment fragment : listLJJLIIIJL) {
                if (Intrinsics.LJFF(fragment.getClass(), cls)) {
                    return fragment;
                }
                Fragment fragmentLJ = LJ(fragment.getChildFragmentManager(), cls);
                if (fragmentLJ != null) {
                    return fragmentLJ;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService
    public final void LIZ(Aweme aweme, Map map, String str, String str2) {
        if ((aweme instanceof Aweme) && aweme != null) {
            C1017160cZm.LIZ(aweme, map, str, true);
        }
    }
}
