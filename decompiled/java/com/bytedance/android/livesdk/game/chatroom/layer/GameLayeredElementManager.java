package com.bytedance.android.livesdk.game.chatroom.layer;

import X.AbstractC1080560eE2;
import X.AbstractC1081060eEq;
import X.C1080430eDp;
import X.C1080540eE0;
import X.C1082380eGy;
import X.C1083100eI8;
import X.C1083340eIW;
import X.C1161920gLG;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.billboard.LiveBillboardAvoidKeyboardSetting;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentPublicScreenBgOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGameShortTouchAlphaEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
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
public final class GameLayeredElementManager extends BroadcastLayeredElementManager {
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
    public GameLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        C1082380eGy c1082380eGyRa0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).ra0((AbstractC1080560eE2) getLayeredElementContext());
        if (c1082380eGyRa0 != null) {
            registerLayer(c1082380eGyRa0);
        }
        final AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new AbstractC1081060eEq(abstractC1080560eE2) { // from class: X.0eDu
            {
                MultiElementSpecImplKt.element(this, new C1080900eEa(C1079400eCA.LIZ));
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE22 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE22) { // from class: X.0eDm
            {
                super(abstractC1080560eE22);
                MultiElementSpecImplKt.element(this, new C1080490eDv(abstractC1080560eE22));
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.v9c);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(abstractC1080560eE22, 424));
                registerElement(elementSpecImpl);
            }
        });
        final ?? layeredElementContext = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eD0
            {
                MultiElementSpecImplKt.groupableElement(this, R.id.q3y, AFwS254S0000000_17.get$arr$(154));
                MultiElementSpecImplKt.groupableElement(this, R.id.kvx, AFwS254S0000000_17.get$arr$(155));
                MultiElementSpecImplKt.element(this, R.id.ysi);
                MultiElementSpecImplKt.element(this, R.id.kv1);
                MultiElementSpecImplKt.element(this, R.id.pbp);
                MultiElementSpecImplKt.groupableElement(this, R.id.qjn, AFwS254S0000000_17.get$arr$(156));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.pve);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079400eCA.LIZ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.uoc);
                groupableElementSpecImpl2.bindGroups(C1079430eCD.LJIIJ);
                groupableElementSpecImpl2.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.n5o);
                groupableElementSpecImpl3.bindGroup(i);
                int i3 = C1079590eCT.LIZ;
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.mw2);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.mxm);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.n7j);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl6);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE23) { // from class: X.0eCt
            {
                super(abstractC1080560eE23);
                MultiElementSpecImplKt.element(this, R.id.kwg);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.bss);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079400eCA.LIZ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl);
                C1080520eDy c1080520eDy = new C1080520eDy(abstractC1080560eE23);
                c1080520eDy.bindGroup(i);
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i2));
                if (!LiveCommentPublicScreenBgOptSetting.INSTANCE.getValue(true)) {
                    listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZIZ));
                }
                c1080520eDy.bindGroups(listLJIILJJIL);
                registerElement(c1080520eDy);
                C1079880eCw c1079880eCw = new C1079880eCw();
                c1079880eCw.bindGroup(i);
                int i3 = C1079590eCT.LIZIZ;
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(c1079880eCw);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n8i);
                groupableElementSpecImpl2.bindGroup(i);
                int i4 = C1079590eCT.LIZJ;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.qhj);
                groupableElementSpecImpl3.bindGroup(i);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.fce);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.fdx);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.weq);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.ik5);
                groupableElementSpecImpl7.bindGroup(i);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl7);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.qfy);
                groupableElementSpecImpl8.bindGroup(i);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.iqu);
                groupableElementSpecImpl9.bindGroup(i);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                registerElement(groupableElementSpecImpl9);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.n3l);
                groupableElementSpecImpl10.bindGroup(i);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl10, AFwS254S0000000_17.get$arr$(157));
                registerElement(groupableElementSpecImpl10);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE24 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE24) { // from class: X.0eCB
            {
                super(abstractC1080560eE24);
                C1079440eCE c1079440eCE = new C1079440eCE();
                int i = C1079430eCD.LIZ;
                int i2 = C1079430eCD.LJ;
                int i3 = C1079400eCA.LIZ;
                c1079440eCE.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(c1079440eCE);
                MultiElementSpecImplKt.groupableElement(this, R.id.jgy, AFwS254S0000000_17.get$arr$(167));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.yci);
                List<Integer> list = C1079430eCD.LJIIJ;
                groupableElementSpecImpl.bindGroups(list);
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl, AFwS254S0000000_17.get$arr$(168));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.wish_list_container);
                groupableElementSpecImpl2.bindGroups(list);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.v97);
                groupableElementSpecImpl3.bindGroups(list);
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i3));
                if (LiveGameShortTouchAlphaEnableSetting.INSTANCE.enable()) {
                    listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZLLL));
                }
                groupableElementSpecImpl3.bindGroups(listLJIILJJIL);
                ElementSpecImplKt.onAttach(groupableElementSpecImpl3, AFwS254S0000000_17.get$arr$(169));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.v96);
                groupableElementSpecImpl4.bindGroups(list);
                groupableElementSpecImpl4.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl4, AFwS254S0000000_17.get$arr$(170));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.n7f);
                groupableElementSpecImpl5.bindGroup(i);
                int i4 = C1079590eCT.LIZIZ;
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i3)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl5, new AwS596S0100000_17(abstractC1080560eE24, 423));
                registerElement(groupableElementSpecImpl5);
                MultiElementSpecImplKt.groupableElement(this, R.id.mue, AFwS254S0000000_17.get$arr$(171));
                MultiElementSpecImplKt.groupableElement(this, R.id.sqk, AFwS254S0000000_17.get$arr$(172));
                MultiElementSpecImplKt.groupableElement(this, R.id.sql, AFwS254S0000000_17.get$arr$(158));
                MultiElementSpecImplKt.groupableElement(this, R.id.p4x, AFwS254S0000000_17.get$arr$(159));
                MultiElementSpecImplKt.groupableElement(this, R.id.mut, AFwS254S0000000_17.get$arr$(160));
                MultiElementSpecImplKt.groupableElement(this, R.id.ba7, AFwS254S0000000_17.get$arr$(161));
                MultiElementSpecImplKt.groupableElement(this, R.id.user_info_container, AFwS254S0000000_17.get$arr$(162));
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.mo8);
                groupableElementSpecImpl6.bindGroups(list);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i2), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl6);
                MultiElementSpecImplKt.groupableElement(this, R.id.video_animate_container, AFwS254S0000000_17.get$arr$(163));
                MultiElementSpecImplKt.groupableElement(this, R.id.vku, AFwS254S0000000_17.get$arr$(164));
                MultiElementSpecImplKt.groupableElement(this, R.id.ea1, new AwS596S0100000_17(abstractC1080560eE24, 421));
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.v9b);
                groupableElementSpecImpl7.bindGroup(i);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.element(this, R.id.ebi);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.y6v);
                groupableElementSpecImpl8.bindGroups(list);
                groupableElementSpecImpl8.bindGroup(i3);
                ElementSpecImplKt.onAttach(groupableElementSpecImpl8, new AwS596S0100000_17(abstractC1080560eE24, 422));
                registerElement(groupableElementSpecImpl8);
                MultiElementSpecImplKt.groupableElement(this, R.id.vl5, AFwS254S0000000_17.get$arr$(165));
                MultiElementSpecImplKt.groupableElement(this, R.id.mvk, AFwS254S0000000_17.get$arr$(166));
            }
        });
        final ?? layeredElementContext2 = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eC9
            {
                MultiElementSpecImplKt.groupableElement(this, R.id.j2h, AFwS254S0000000_17.get$arr$(173));
                MultiElementSpecImplKt.groupableElement(this, R.id.n4a, AFwS254S0000000_17.get$arr$(174));
                MultiElementSpecImplKt.groupableElement(this, R.id.ye6, AFwS254S0000000_17.get$arr$(175));
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.kv7);
                int i = C1079430eCD.LIZ;
                groupableElementSpecImpl.bindGroup(i);
                int i2 = C1079400eCA.LIZ;
                groupableElementSpecImpl.bindGroup(i2);
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n3_);
                groupableElementSpecImpl2.bindGroup(i);
                groupableElementSpecImpl2.bindGroup(i2);
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.w4w);
                groupableElementSpecImpl3.bindGroup(i);
                groupableElementSpecImpl3.bindGroup(i2);
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.iuw);
                groupableElementSpecImpl4.bindGroup(i);
                groupableElementSpecImpl4.bindGroup(i2);
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.b2t);
                groupableElementSpecImpl5.bindGroup(i);
                groupableElementSpecImpl5.bindGroup(i2);
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.q41);
                groupableElementSpecImpl6.bindGroup(i);
                groupableElementSpecImpl6.bindGroup(i2);
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.h5d);
                groupableElementSpecImpl7.bindGroup(i);
                groupableElementSpecImpl7.bindGroup(i2);
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.element(this, R.id.dc5);
                MultiElementSpecImplKt.element(this, R.id.ir3);
                MultiElementSpecImplKt.element(this, R.id.vli);
                MultiElementSpecImplKt.element(this, R.id.nmp);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.mu6);
                groupableElementSpecImpl8.bindGroup(i);
                int i3 = C1079590eCT.LIZ;
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i3), Integer.valueOf(i2)));
                if (!LiveBillboardAvoidKeyboardSetting.INSTANCE.avoid()) {
                    groupableElementSpecImpl8.removeGroup(i3);
                }
                registerElement(groupableElementSpecImpl8);
            }
        });
        registerLayer(new C1080430eDp(getLayeredElementContext()));
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
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.ccg, R.id.cdt, R.id.v9c);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.y6t, R.id.q2x, R.id.v9b);
        finishRegistration();
    }
}
