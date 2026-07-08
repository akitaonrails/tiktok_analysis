package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.desc;

import X.C01GW;
import X.C0SDD;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1564680qos;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC494301wD;
import X.InterfaceC705620Rm4;
import android.text.Layout;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3DescAssem extends VideoDescAssem implements FriendsV3CellTrackParamsProtocol, InterfaceC705620Rm4 {
    public final C01GW LLLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 435));

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1354300871 || iHashCode == -78363505 || iHashCode == -16814679) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.b9t, new AwS555S0100000_11(this, 436));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        C0SDD c0sdd;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Boolean boolValueOf = null;
        if (!ur((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null))) {
            return C2097608Jq.LJ();
        }
        if (!(Fp().getVisibility() == 0)) {
            return C2097608Jq.LJIIIIZZ(new Pair("is_with_caption", CardStruct.IStatusCode.DEFAULT), new Pair("is_unfold_caption", CardStruct.IStatusCode.DEFAULT), new Pair("caption_lines", CardStruct.IStatusCode.DEFAULT));
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("is_with_caption", "1");
        C724270Sb3 c724270Sb32 = this.LLJI;
        Object obj = c724270Sb32 != null ? c724270Sb32.LL : null;
        if ((obj instanceof C0SDD) && (c0sdd = (C0SDD) obj) != null) {
            boolValueOf = Boolean.valueOf(c0sdd.LJZI());
        }
        pairArr[1] = new Pair("is_unfold_caption", boolValueOf);
        Layout textLayout = ((C21415018rM) this.LLLLL.getValue()).getTextLayout();
        pairArr[2] = new Pair("caption_lines", Integer.valueOf(textLayout != null ? textLayout.getLineCount() : 0));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
        super.cp();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem
    /* JADX INFO: renamed from: Tp */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        Up();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0S6j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C715890S6h) obj).LLIZLLLIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(85), 6);
        C426750GoL.LJIIIZ(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (super.ur(videoItemParams) && (videoItemParams instanceof C0SDD)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        sr((VideoItemParams) interfaceC1587906Jp, list);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: up */
    public final void sr(VideoItemParams videoItemParams, List<? extends Object> list) {
        if (!va(list)) {
            return;
        }
        up(videoItemParams);
    }
}
