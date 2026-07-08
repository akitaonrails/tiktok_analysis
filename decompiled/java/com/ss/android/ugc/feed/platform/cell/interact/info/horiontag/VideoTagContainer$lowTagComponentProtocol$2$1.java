package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C13LP;
import X.C2097608Jq;
import X.C631370Opb;
import X.C698800Rb4;
import X.C699500RcC;
import X.C700450Rdj;
import X.EnumC697700RYi;
import X.InterfaceC697230RWn;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTagContainer$lowTagComponentProtocol$2$1 implements ComponentPriorityProtocol {
    public final /* synthetic */ VideoTagContainer LL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return "low_tag";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        Set<String> setKeySet;
        if (this.LL.Fp()) {
            Map<String, PriorityProtocol> map = this.LL.Bp().LIZLLL().get("low_tag");
            if (map == null || (setKeySet = map.keySet()) == null) {
                return null;
            }
            return (String) C13LP.LJJJLIIL(setKeySet);
        }
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        String str = (String) this.LL.LLLII.getValue();
        String genreType = AwemeExtKt.getGenreType(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme());
        FeedComponentPriorityData feedComponentPriorityDataUp = this.LL.up();
        Map<String, PriorityProtocol> mapLJ = this.LL.Bp().LIZJ().get("low_tag");
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        EnumC697700RYi enumC697700RYi = EnumC697700RYi.VIDEO_TAG;
        c698800Rb4.getClass();
        return C698800Rb4.LIZLLL(str, genreType, feedComponentPriorityDataUp, mapLJ, enumC697700RYi);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return ((InterfaceC697230RWn) C2097608Jq.LJFF("low_tag", this.LL.Bp().LIZIZ())).LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        Map<String, PriorityProtocol> map;
        PriorityProtocol priorityProtocol;
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0 || (map = this.LL.Bp().LIZJ().get("low_tag")) == null || (priorityProtocol = map.get(H3())) == null) {
            return null;
        }
        return priorityProtocol.Ke1();
    }

    public VideoTagContainer$lowTagComponentProtocol$2$1(VideoTagContainer videoTagContainer) {
        this.LL = videoTagContainer;
    }
}
