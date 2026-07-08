package com.ss.android.ugc.feed.platform.cell.interact;

import X.C03H5;
import X.C1AV2;
import X.C698300RaG;
import X.C698380RaO;
import X.C698920RbG;
import X.C699060RbU;
import X.C702650RhH;
import X.C720670SOr;
import X.EnumC706820Ro0;
import X.InterfaceC494301wD;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public interface InteractAreaCommonAbility extends InterfaceC494301wD {
    void BK1(Map<String, List<String>> map, ValueAnimator valueAnimator, boolean z, C1AV2 c1av2);

    void CL(String str, ComponentPriorityProtocol componentPriorityProtocol, boolean z);

    C702650RhH E71();

    void Hh0(List list, ValueAnimator valueAnimator, boolean z, C1AV2 c1av2);

    void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener);

    C720670SOr LQ(String str);

    void Me(boolean z);

    void Mr2(ComponentPriorityProtocol componentPriorityProtocol);

    C698920RbG Ry0();

    C699060RbU VK2();

    void Vt1(View view);

    void Xz2(EnumC706820Ro0 enumC706820Ro0, boolean z, C698300RaG c698300RaG, boolean z2, C1AV2 c1av2);

    void a82(List<String> list);

    void fx2(Map<String, List<C698380RaO>> map, Map<String, List<C698380RaO>> map2, C1AV2 c1av2);

    List hp0(Set set, boolean z, Set set2);

    List<AreaContainerProtocol> iG2();

    void j52(View view, String str);

    int l40();

    void xk(String str, View.OnLayoutChangeListener onLayoutChangeListener);

    void xq0(String str, List<? extends ReusedUIAssem<? extends C03H5>> list);

    void yz(FcpContainerProtocol fcpContainerProtocol);

    void zB1(ComponentPriorityProtocol componentPriorityProtocol);
}
