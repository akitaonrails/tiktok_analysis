package com.ss.android.ugc.aweme.detail.lynxcard;

import X.C01GW;
import X.C0BQ9;
import X.C0SR4;
import X.C0T5M;
import X.C1097004Qu;
import X.C13LP;
import X.C1566140qrE;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C725750SdR;
import X.C738880Syc;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC725760SdS;
import Y.ACallableS242S0200000_10;
import android.content.Context;
import android.database.DataSetObserver;
import com.ss.android.ugc.aweme.detail.lynxcard.DetailLynxCardLoaderComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DetailLynxCardLoaderComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C630740Ooa LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;

    public DetailLynxCardLoaderComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS555S0100000_11((InterfaceC1565950qqv) this, 134), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS129S0110000_11(false, (InterfaceC1565950qqv) this, 1));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 135));
        this.LLILZ = ((Number) C1097004Qu.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        C2189821An6 c2189821An6;
        super.onDestroy();
        if (!C0BQ9.LIZ() || (c2189821An6 = getPanelContext().LIZJ) == null) {
            return;
        }
        C725750SdR.LIZ(c2189821An6);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C0SR4 c0sr4Zv0;
        super.onParentViewCreated();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility != null && (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) != null) {
            c0sr4Zv0.LJJII(new DataSetObserver() { // from class: X.0Sqk
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    List<Aweme> awemeList;
                    super.onChanged();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onChanged() ");
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LIZ.LL.getValue();
                    sbLIZ.append((iFeedPanelPlatformAbility2 == null || (awemeList = iFeedPanelPlatformAbility2.getAwemeList()) == null) ? null : Integer.valueOf(awemeList.size()));
                    C2188811AlT.LIZIZ(sbLIZ);
                    DetailLynxCardLoaderComponent detailLynxCardLoaderComponent = this.LIZ;
                    detailLynxCardLoaderComponent.bo(detailLynxCardLoaderComponent.LLILLL, (detailLynxCardLoaderComponent.LLILZ + r1) - 1);
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C738880Syc(this, 0));
        }
    }

    public final void bo(int i, int i2) {
        List<Aweme> awemeList;
        Aweme aweme;
        Context context;
        C2189821An6 c2189821An6;
        Object obj;
        if (i > i2) {
            return;
        }
        while (true) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
            Object next = null;
            if (iFeedPanelPlatformAbility != null && (awemeList = iFeedPanelPlatformAbility.getAwemeList()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i, awemeList)) != null && aweme.getAwemeType() == 106 && (context = getContext()) != null && (c2189821An6 = getPanelContext().LIZJ) != null && aweme != null) {
                List list = (List) C725750SdR.LIZ.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((InterfaceC725760SdS) obj2).S3(c2189821An6)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int priority = ((InterfaceC725760SdS) next).getPriority().getPriority();
                        do {
                            Object next2 = it2.next();
                            int priority2 = ((InterfaceC725760SdS) next2).getPriority().getPriority();
                            if (priority > priority2) {
                                next = next2;
                                priority = priority2;
                            }
                        } while (it2.hasNext());
                    }
                }
                InterfaceC725760SdS interfaceC725760SdS = (InterfaceC725760SdS) next;
                if (interfaceC725760SdS != null) {
                    interfaceC725760SdS.G4(aweme, c2189821An6, interfaceC725760SdS.getPriority().getContainerType(), context, C725750SdR.LIZIZ(aweme, c2189821An6));
                    obj = interfaceC725760SdS;
                } else {
                    obj = Boolean.FALSE;
                }
                if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                    C0T5M c0t5m = C0T5M.LIZ;
                    ACallableS242S0200000_10 aCallableS242S0200000_10 = new ACallableS242S0200000_10(aweme, c2189821An6, 11);
                    c0t5m.getClass();
                    C0T5M.LIZIZ(aCallableS242S0200000_10);
                }
            }
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }
}
