package com.ss.android.ugc.aweme.ecommerce.search.videoguide.trigger;

import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C123100dR;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1770320wAY;
import X.C1770340wAa;
import X.C189200o6;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.EcSearchNoCartFypBottomButtonAbility;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.EcSearchNoCartFypBottomButtonScope;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartContentionVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchNoCartFypBottomButtonTrigger extends BaseCellTriggerComponent<EcSearchNoCartFypBottomButtonTrigger> implements EcSearchNoCartFypBottomButtonAbility, PriorityProtocol, InterfaceC699970Rcx, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final Set<String> LLJLIL = new LinkedHashSet();
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(EcSearchNoCartContentionVM.class), AFwS268S0000000_26.get$arr$(281));

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_shop_video_guide";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EcSearchNoCartFypBottomButtonScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcSearchNoCartFypBottomButtonScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcSearchNoCartFypBottomButtonScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<EcSearchNoCartFypBottomButtonAssem> getType() {
        return C13LE.LIZ(EcSearchNoCartFypBottomButtonAssem.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2100854320) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_shop_video_guide";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.videoguide.EcSearchNoCartFypBottomButtonAbility
    public final void LLLLLL(boolean z) {
        PriorityAbility priorityAbility = (PriorityAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PriorityAbility.class, null);
        if (priorityAbility != null) {
            priorityAbility.nw0(this, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        PriorityAbility priorityAbility = (PriorityAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PriorityAbility.class, null);
        if (priorityAbility != null) {
            priorityAbility.Vx0(this, new AwS392S0200000_26(this, videoItemParams, 54), new AwS392S0200000_26(this, videoItemParams, 55));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Object c098200Yq;
        String str;
        String aid;
        String str2;
        BaseFeedPageParams baseFeedPageParamsNJ2;
        BaseFeedPageParams baseFeedPageParamsNJ22;
        Object obj = null;
        try {
            C1770340wAa c1770340wAa = C1770340wAa.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
            if (iVideoCellAbility == null || (baseFeedPageParamsNJ22 = iVideoCellAbility.nJ2()) == null || (str = baseFeedPageParamsNJ22.eventType) == null) {
                str = "";
            }
            c1770340wAa.getClass();
            boolean zLIZ = C1770340wAa.LIZ(aweme, str);
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (C123100dR.LIZ(aid)) {
                Set<String> set = LLJLIL;
                if (!set.contains(aid)) {
                    if (set.size() > 30) {
                        set.clear();
                    }
                    set.add(aid);
                    C1770320wAY c1770320wAY = C1770320wAY.LIZ;
                    Boolean boolValueOf = Boolean.valueOf(zLIZ);
                    IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
                    if (iVideoCellAbility2 == null || (baseFeedPageParamsNJ2 = iVideoCellAbility2.nJ2()) == null || (str2 = baseFeedPageParamsNJ2.eventType) == null) {
                        str2 = "";
                    }
                    C1770320wAY.LJII(c1770320wAY, aweme2, "filter", null, boolValueOf, str2, null, null, null, 224);
                }
            }
            c098200Yq = Boolean.valueOf(zLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
