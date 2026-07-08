package com.bytedance.android.livesdk.broadcast.obs.layer;

import X.AbstractC1080560eE2;
import X.AbstractC1081060eEq;
import X.C1080430eDp;
import X.C1080540eE0;
import X.C1081550eFd;
import X.C1082380eGy;
import X.C1083100eI8;
import X.C1083340eIW;
import X.C1161920gLG;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentPublicScreenBgOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ObsLayeredElementManager extends BroadcastLayeredElementManager {
    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager
    /* JADX INFO: renamed from: LIZLLL */
    public final C1080540eE0 onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new C1080540eE0(context, viewGroup, dataChannel, this);
    }

    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new C1080540eE0(context, viewGroup, dataChannel, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public ObsLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        C1082380eGy c1082380eGyRa0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).ra0((AbstractC1080560eE2) getLayeredElementContext());
        if (c1082380eGyRa0 != null) {
            registerLayer(c1082380eGyRa0);
        }
        final AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE2) { // from class: X.0eDl
            {
                super(abstractC1080560eE2);
                MultiElementSpecImplKt.element(this, new C1080490eDv(abstractC1080560eE2));
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE22 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new AbstractC1081060eEq(abstractC1080560eE22) { // from class: X.0eDt
            {
                MultiElementSpecImplKt.element(this, new C1080890eEZ(C1079460eCG.LIZ));
            }
        });
        final ?? layeredElementContext = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eCz
            {
                MultiElementSpecImplKt.groupableElement(this, R.id.kvx, AFwS254S0000000_17.get$arr$(7));
                MultiElementSpecImplKt.element(this, R.id.ysi);
                MultiElementSpecImplKt.element(this, R.id.kv1);
                MultiElementSpecImplKt.element(this, R.id.pbp);
                MultiElementSpecImplKt.groupableElement(this, R.id.qjn, AFwS254S0000000_17.get$arr$(8));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.pve);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079460eCG.LIZ;
                int i3 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.uoc);
                groupableElementSpecImpl2.bindGroups(C1079430eCD.LJIIJ);
                groupableElementSpecImpl2.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.n5o);
                groupableElementSpecImpl3.bindGroup(i);
                int i4 = C1079590eCT.LIZ;
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.mw2);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.mxm);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.n7j);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl6);
                MultiElementSpecImplKt.groupableElement(this, R.id.il0, AFwS254S0000000_17.get$arr$(9));
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE23) { // from class: X.0eCu
            {
                super(abstractC1080560eE23);
                MultiElementSpecImplKt.element(this, R.id.kwg);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.bss);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079460eCG.LIZ;
                int i3 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl);
                C1080520eDy c1080520eDy = new C1080520eDy(abstractC1080560eE23);
                c1080520eDy.bindGroup(i);
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i2), Integer.valueOf(i3));
                if (!LiveCommentPublicScreenBgOptSetting.INSTANCE.getValue(true)) {
                    listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZIZ));
                }
                c1080520eDy.bindGroups(listLJIILJJIL);
                registerElement(c1080520eDy);
                C1079880eCw c1079880eCw = new C1079880eCw();
                c1079880eCw.bindGroup(i);
                int i4 = C1079590eCT.LIZIZ;
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(c1079880eCw);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n8i);
                groupableElementSpecImpl2.bindGroup(i);
                int i5 = C1079590eCT.LIZJ;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.qhj);
                groupableElementSpecImpl3.bindGroup(i);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.fce);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.fdx);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.weq);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.ik5);
                groupableElementSpecImpl7.bindGroup(i);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl7);
                if (TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable()) {
                    GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.qfy);
                    groupableElementSpecImpl8.bindGroup(i);
                    groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2)));
                    registerElement(groupableElementSpecImpl8);
                }
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.n3l);
                groupableElementSpecImpl9.bindGroup(i);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl9, AFwS254S0000000_17.get$arr$(10));
                registerElement(groupableElementSpecImpl9);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE24 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE24) { // from class: X.0eCH
            {
                super(abstractC1080560eE24);
                C1079440eCE c1079440eCE = new C1079440eCE();
                int i = C1079430eCD.LIZ;
                int i2 = C1079430eCD.LJ;
                int i3 = C1079460eCG.LIZ;
                c1079440eCE.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(C1079430eCD.LIZJ)));
                registerElement(c1079440eCE);
                MultiElementSpecImplKt.groupableElement(this, R.id.jgy, AFwS254S0000000_17.get$arr$(17));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.yci);
                List<Integer> list = C1079430eCD.LJIIJ;
                groupableElementSpecImpl.bindGroups(list);
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl, AFwS254S0000000_17.get$arr$(18));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.wish_list_container);
                groupableElementSpecImpl2.bindGroups(list);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.v97);
                groupableElementSpecImpl3.bindGroups(list);
                groupableElementSpecImpl3.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl3, AFwS254S0000000_17.get$arr$(19));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.yjr);
                groupableElementSpecImpl4.bindGroups(list);
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.v96);
                groupableElementSpecImpl5.bindGroups(list);
                groupableElementSpecImpl5.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl5, AFwS254S0000000_17.get$arr$(20));
                registerElement(groupableElementSpecImpl5);
                MultiElementSpecImplKt.groupableElement(this, R.id.mue, AFwS254S0000000_17.get$arr$(21));
                MultiElementSpecImplKt.groupableElement(this, R.id.ba7, new AwS596S0100000_17(abstractC1080560eE24, 12));
                MultiElementSpecImplKt.groupableElement(this, R.id.user_info_container, new AwS596S0100000_17(abstractC1080560eE24, 13));
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.mo8);
                groupableElementSpecImpl6.bindGroups(list);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i2), Integer.valueOf(i3)));
                if (LiveExtendedScreenUiOptimizeSetting.INSTANCE.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    groupableElementSpecImpl6.bindGroup(i);
                }
                registerElement(groupableElementSpecImpl6);
                MultiElementSpecImplKt.groupableElement(this, R.id.p4x, AFwS254S0000000_17.get$arr$(11));
                MultiElementSpecImplKt.groupableElement(this, R.id.mut, AFwS254S0000000_17.get$arr$(12));
                MultiElementSpecImplKt.groupableElement(this, R.id.sqk, new AwS596S0100000_17(abstractC1080560eE24, 8));
                MultiElementSpecImplKt.groupableElement(this, R.id.sql, new AwS596S0100000_17(abstractC1080560eE24, 9));
                MultiElementSpecImplKt.groupableElement(this, R.id.video_animate_container, AFwS254S0000000_17.get$arr$(13));
                MultiElementSpecImplKt.groupableElement(this, R.id.vku, AFwS254S0000000_17.get$arr$(14));
                MultiElementSpecImplKt.groupableElement(this, R.id.ea1, new AwS596S0100000_17(abstractC1080560eE24, 10));
                MultiElementSpecImplKt.element(this, R.id.ebi);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.y6v);
                groupableElementSpecImpl7.bindGroups(list);
                groupableElementSpecImpl7.bindGroup(i3);
                ElementSpecImplKt.onAttach(groupableElementSpecImpl7, new AwS596S0100000_17(abstractC1080560eE24, 11));
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.groupableElement(this, R.id.vl5, AFwS254S0000000_17.get$arr$(15));
                MultiElementSpecImplKt.groupableElement(this, R.id.mvk, AFwS254S0000000_17.get$arr$(16));
            }
        });
        final ?? layeredElementContext2 = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eCI
            {
                super(layeredElementContext2);
                MultiElementSpecImplKt.groupableElement(this, R.id.j2h, new AwS596S0100000_17(layeredElementContext2, 14));
                MultiElementSpecImplKt.groupableElement(this, R.id.n4a, new AwS596S0100000_17(layeredElementContext2, 15));
                MultiElementSpecImplKt.groupableElement(this, R.id.ye6, AFwS254S0000000_17.get$arr$(23));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.kv7);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079460eCG.LIZ;
                int i3 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n3_);
                groupableElementSpecImpl2.bindGroup(i);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.w4w);
                groupableElementSpecImpl3.bindGroup(i);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.iuw);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.b2t);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.q41);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.h5d);
                groupableElementSpecImpl7.bindGroup(i);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.element(this, R.id.phg);
                MultiElementSpecImplKt.element(this, R.id.vli);
                MultiElementSpecImplKt.groupableElement(this, R.id.mu6, AFwS254S0000000_17.get$arr$(22));
            }
        });
        registerLayer(new C1080430eDp(getLayeredElementContext()));
        C1081550eFd c1081550eFdMA = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).MA((AbstractC1080560eE2) getLayeredElementContext());
        if (c1081550eFdMA != null) {
            registerLayer(c1081550eFdMA);
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p1_, R.id.p1a, R.id.user_info_container);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hh1, R.id.h4p, R.id.ocf);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p4r, R.id.p4x, R.id.mut);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.jgy, R.id.sqk, R.id.sql, R.id.p4x, R.id.hgt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hei, R.id.v97, R.id.mut, R.id.v96, R.id.c16);
        if (TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable()) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwc, R.id.ik5, R.id.fce, R.id.fdx, R.id.weq, R.id.n3l, R.id.qfy);
        } else {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwc, R.id.ik5, R.id.fce, R.id.fdx, R.id.weq, R.id.n3l);
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwd, R.id.ike, R.id.pbo);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.ccg, R.id.cdt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.y6t, R.id.q2x);
        finishRegistration();
    }
}
