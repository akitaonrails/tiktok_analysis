package com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness;

import X.C06KX;
import X.C1257950iq9;
import X.C19U0;
import android.view.View;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface ITabBusinessListener extends C06KX {
    void Hv0(AwemePagerVM awemePagerVM);

    void Oq(C19U0 c19u0);

    void WQ(C1257950iq9 c1257950iq9, int i, View view);

    void Yn(C19U0 c19u0);

    String getName();

    void hl0();

    boolean iI0();

    void ih(C19U0 c19u0);

    void onPageScrollStateChanged(int i);

    void onPageScrolled(int i, float f, int i2);

    int pt1();

    void sW(C19U0 c19u0, int i);

    void st2(View view);

    Map<String, String> uP(int i, String str);
}
