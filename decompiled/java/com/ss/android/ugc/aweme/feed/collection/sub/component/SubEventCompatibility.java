package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C13LE;
import X.C291001Au;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C736820SvI;
import X.C737910Sx3;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionEventAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.viewmodel.VideoViewModelWrap;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SubEventCompatibility extends BaseCellLogicComponent<SubEventCompatibility> {
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 353));
    public final C01GW LLJJIJIIJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(169));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        CollectionEventAbility collectionEventAbility = (CollectionEventAbility) this.LLJJIJI.getValue();
        if (collectionEventAbility != null) {
            C13LE.LIZ(VideoViewModelWrap.class);
            C736820SvI.LIZLLL();
            new AwS590S0100000_11(this, 130);
            collectionEventAbility.Qr1();
        }
        CollectionEventAbility collectionEventAbility2 = (CollectionEventAbility) this.LLJJIJI.getValue();
        if (collectionEventAbility2 != null) {
            C13LE.LIZ(VideoViewModelWrap.class);
            C736820SvI.LIZLLL();
            new AwS590S0100000_11(this, 131);
            collectionEventAbility2.Qr1();
        }
        CollectionEventAbility collectionEventAbility3 = (CollectionEventAbility) this.LLJJIJI.getValue();
        if (collectionEventAbility3 != null) {
            C13LE.LIZ(VideoViewModelWrap.class);
            C736820SvI.LIZLLL();
            new AwS590S0100000_11(this, 132);
            collectionEventAbility3.Qr1();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    public final <T> void Bo(C291001Au<? extends Pair<String, ? extends C291001Au<? extends T>>> c291001Au, Function1<? super T, Unit> function1) {
        Object obj;
        C291001Au c291001Au2;
        T t;
        if (c291001Au == null) {
            return;
        }
        String str = (String) ((Pair) c291001Au.LIZ).getFirst();
        if (str.length() > 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid()) && (c291001Au2 = (C291001Au) ((Pair) c291001Au.LIZ).getSecond()) != null && (t = c291001Au2.LIZ) != null) {
                function1.invoke(t);
            }
        }
    }
}
