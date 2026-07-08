package com.ss.android.ugc.aweme.fcpanchor.access;

import X.C03H5;
import X.C04UD;
import X.C0RD6;
import X.C0RFL;
import X.C704760Rkg;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFeedMultiTagAssem<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> implements FeedMultiAnchorAbility {
    public C704760Rkg LLJLLIL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public void J1(int i, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public boolean M51() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public View Uf() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public String bc0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final List<AnchorCommonStruct> Ea() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            return c704760Rkg.LJ.Ea();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final Map<String, String> QC() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg == null) {
            return null;
        }
        Map<String, String> stayTimeBizExtraMap = c704760Rkg.LJ.getStayTimeBizExtraMap();
        LinkedHashMap linkedHashMap = stayTimeBizExtraMap != null ? new LinkedHashMap(stayTimeBizExtraMap) : new LinkedHashMap();
        Map<String, String> stayTimeBizExtraMap2 = c704760Rkg.LIZIZ.getStayTimeBizExtraMap();
        Map<String, String> stayTimeBizExtraMap3 = c704760Rkg.LIZJ.getStayTimeBizExtraMap();
        if (stayTimeBizExtraMap2 != null) {
            linkedHashMap.putAll(stayTimeBizExtraMap2);
        }
        if (stayTimeBizExtraMap3 != null) {
            linkedHashMap.putAll(stayTimeBizExtraMap3);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LJ.onDestroy();
            c704760Rkg.LIZIZ.onDestroy();
            c704760Rkg.LIZJ.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public void unBind() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final Map<String, String> yi() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            return c704760Rkg.LJ.yi();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public void KI0() {
        C704760Rkg c704760Rkg;
        if (!C04UD.LIZ() || (c704760Rkg = this.LLJLLIL) == null) {
            return;
        }
        c704760Rkg.LIZJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LIZIZ.setCommodityCard(videoItemParams.commodityCard);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_component_clickable", new AwS590S0100000_11((BaseFeedMultiTagAssem) this, 69));
        c0rd6.LIZIZ("event_component_hint_text", new AwS590S0100000_11((BaseFeedMultiTagAssem) this, 70));
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final void zs1(boolean z) {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LJ.LJJLI(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public void T6(int i, Aweme aweme) {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LJ.LJJJJZI();
        }
    }
}
