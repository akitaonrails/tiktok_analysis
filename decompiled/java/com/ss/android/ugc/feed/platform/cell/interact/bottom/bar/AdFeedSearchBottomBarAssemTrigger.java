package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1AV3;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C452501pT;
import X.C688180Qz2;
import X.C688190Qz3;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class AdFeedSearchBottomBarAssemTrigger extends BaseCellTriggerComponent<AdFeedSearchBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLJLIL = 0;
    public C688190Qz3 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 908));

    static {
        new C688180Qz2();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_ad_search_rs";
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AdFeedSearchBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_ad_search_rs";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return new C700450Rdj(new AwS624S0100000_10(this, 86), new AwS624S0100000_10(this, 87), new AwS554S0100000_10(this, 907));
    }

    public final Map<String, String> yp() {
        String str;
        WordStruct wordStruct;
        Word wordRecord;
        String wordsLabel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        String str2 = "";
        if (c688190Qz3 == null || (str = c688190Qz3.LIZJ) == null) {
            str = "";
        }
        linkedHashMap.put("query_name", str);
        C688190Qz3 c688190Qz32 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz32 != null && (wordStruct = c688190Qz32.LIZIZ) != null && (wordRecord = wordStruct.getWordRecord()) != null && (wordsLabel = wordRecord.getWordsLabel()) != null) {
            str2 = wordsLabel;
        }
        linkedHashMap.put("banner_type", str2);
        return linkedHashMap;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(1, "Search", null, "bottombar"));
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility.Vx0(this, new AwS376S0200000_10(videoItemParams, this, 71), AFwS241S0000000_10.get$arr$(385));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C688190Qz3 c688190Qz3LJ = C688180Qz2.LJ(videoItemParams);
        this.LLJJLIIIJLLLLLLLZ = c688190Qz3LJ;
        return C688180Qz2.LIZIZ(c688190Qz3LJ, videoItemParams.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String desc;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onHolderSelected] position: ");
        sbLIZ.append(i);
        sbLIZ.append(", aweme: ");
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        sbLIZ.append(desc);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
