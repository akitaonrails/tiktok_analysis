package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.C13BV;
import X.C1486280omQ;
import X.C16F5;
import X.C1884080z82;
import X.C19EG;
import X.C2178651AOh;
import X.C2188811AlT;
import X.C500980Jkm;
import X.InterfaceC1881340z3c;
import android.text.TextUtils;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.videoshop.context.VideoContext;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameIntroMediaViewerFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCYrHELIOSJCQ1JjonZic5OiY9LTY/ZywyOiFiLi4+LSwiPT08ZgItJCoaJjE+JgI2LCwtHyY2PyA+Dz0yLygpJzs=";
    public ViewPager LL;
    public C16F5 LLILLJJLI;
    public List<? extends Object> LLILLL = C13BV.INSTANCE;
    public InterfaceC1881340z3c LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        Window window;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            C2178651AOh c2178651AOh = VideoContext.LJJJJLL(getContext()).LL;
            c2178651AOh.LLJILJIL = 0;
            c2178651AOh.LLJIJIL = C1486280omQ.LJ(0) || C1486280omQ.LJFF(0);
            VideoContext videoContextLJJJJLL = VideoContext.LJJJJLL(getContext());
            if (videoContextLJJJJLL.LJJJJLI() == null || !(!TextUtils.isEmpty(null))) {
                videoContextLJJJJLL.LL.LJ(false, false);
            }
            C19EG activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setFlags(1024, 1024);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6x);
        c500980Jkm.LIZIZ = 1;
        c500980Jkm.LIZJ = R.style.aif;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJI = 1.0f;
        if (C1884080z82.LIZIZ()) {
            c500980Jkm.LJIIIIZZ = 1024;
        }
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MR();
        super.onDestroyView();
    }

    public final void QF1(int i) {
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i + 1);
            sbLIZ.append('/');
            sbLIZ.append(this.LLILLL.size());
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroMediaViewerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
