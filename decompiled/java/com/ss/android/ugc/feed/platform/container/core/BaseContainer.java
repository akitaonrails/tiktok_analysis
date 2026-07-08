package com.ss.android.ugc.feed.platform.container.core;

import X.C03H5;
import X.C0RQ6;
import X.C1157604fu;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C693600RIo;
import X.C694100RKm;
import X.C710970Ruh;
import X.C724270Sb3;
import X.InterfaceC2753014t;
import X.InterfaceC665370Q7z;
import X.InterfaceC694120RKo;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseContainer<PROTOCOL extends VContainerProtocol, RECEIVER extends C03H5> extends BaseCellContentComponent<RECEIVER> implements VContainer<PROTOCOL>, InterfaceC694120RKo {
    public BaseFeedPageParams LLJJJJLIIL;
    public BaseContainer<?, ?> LLJJL;
    public VideoItemParams LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract C0RQ6 hp();

    public final BaseFeedPageParams nJ2() {
        BaseFeedPageParams baseFeedPageParams = this.LLJJJJLIIL;
        if (baseFeedPageParams != null) {
            return baseFeedPageParams;
        }
        return null;
    }

    @Override // X.InterfaceC694120RKo
    public void J4() {
        View viewLJJIJL = LJJIJL();
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554960qZC.LIZ(C1558360qeg.LJ(viewLJJIJL, null), new InterfaceC2753014t(interfaceC665370Q7zLJIIL) { // from class: X.0RKm
            public final InterfaceC665370Q7z LL;

            {
                this.LL = interfaceC665370Q7zLJIIL;
            }
        }, C694100RKm.class, "source_default_key");
    }

    public final void lp() {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> linkedList = C693600RIo.LIZ(this).wQ2().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                it2.next().lp();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: ip, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        this.LLJJLIIIJLLLLLLLZ = videoItemParams;
    }

    public final void kp(int i) {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> linkedList = C693600RIo.LIZ(this).wQ2().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                it2.next().kp(i);
            }
        }
    }

    public final void mp(PROTOCOL protocol) {
        ContainerTree containerTreeLIZ = C693600RIo.LIZ(this);
        if (!containerTreeLIZ.xQ2().containsKey(this)) {
            containerTreeLIZ.xQ2().put(this, new LinkedHashSet<>());
        }
        LinkedHashSet<VContainerProtocol> linkedHashSet = containerTreeLIZ.xQ2().get(this);
        if (linkedHashSet != null) {
            linkedHashSet.add(protocol);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Object obj;
        BaseContainer<?, ?> baseContainer;
        if (C1157604fu.LIZ()) {
            C710970Ruh c710970Ruh = C710970Ruh.LJ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            c710970Ruh.getClass();
            if (C710970Ruh.LIZ(aid) && (baseContainer = this.LLJJL) != null) {
                C693600RIo.LIZ(baseContainer).vQ2(baseContainer);
            }
        }
    }

    public void ep(int i, Aweme aweme) {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> linkedList = C693600RIo.LIZ(this).wQ2().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C03H5>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                it2.next().ep(i, aweme);
            }
        }
    }
}
