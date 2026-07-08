package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C01GW;
import X.C03H5;
import X.C0RHY;
import X.C13IQ;
import X.C13LE;
import X.C2188811AlT;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.EnumC696280RSw;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleFullAboveInteractionTriggerComponent extends BaseCellTriggerComponent<AnoleFullAboveInteractionTriggerComponent> implements ComponentPriorityProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0RHY(this));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_above_container_anole_slot";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AnoleFullAboveInteractionContentComponent.class);
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    static {
        new Object() { // from class: X.0RHZ
        };
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return new C700450Rdj(null, AFwS294S0000000_11.get$arr$(22), null, 5);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
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
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger = ");
        sbLIZ.append(yp(videoItemParams.getAweme()));
        sbLIZ.append(",slotId = ");
        sbLIZ.append(EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName());
        C2188811AlT.LIZIZ(sbLIZ);
        return yp(videoItemParams.getAweme());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean yp(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            X.0RSw r5 = X.EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT
            java.lang.String r0 = r5.getSlotName()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r4 = 0
            if (r0 == 0) goto Le
            return r4
        Le:
            java.util.List r3 = X.C693790RJh.LIZ(r7)
            r1 = 1
            if (r7 == 0) goto L9f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L71
            boolean r0 = X.C1017180cZo.LJIL(r0)
            if (r0 != r1) goto L71
            X.0RSw r0 = X.EnumC696280RSw.TT_FEED_MULTI_SHOW_CARD
            java.lang.String r0 = r0.getSlotName()
        L27:
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L6f
            java.util.List r1 = X.C693790RJh.LIZ(r7)
            X.0RSw r0 = X.EnumC696280RSw.TT_FEED_ABOVE_INTERACTION_3D_FOREGROUND
            java.lang.String r0 = r0.getSlotName()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6f
            r3 = 0
        L3e:
            if (r7 == 0) goto L6d
            java.util.List r1 = X.C693790RJh.LIZIZ(r7)
            if (r1 == 0) goto L6d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6d
            java.util.Iterator r2 = r1.iterator()
        L50:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            X.0RSw r0 = X.EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT
            java.lang.String r0 = r0.getSlotName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
            r0 = 1
        L67:
            if (r3 != 0) goto L6b
            if (r0 == 0) goto L6c
        L6b:
            r4 = 1
        L6c:
            return r4
        L6d:
            r0 = 0
            goto L67
        L6f:
            r3 = 1
            goto L3e
        L71:
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r7.getCardInsertInfo()
            if (r0 == 0) goto L9f
            int r0 = r0.getCardType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L9f
            int r1 = r2.intValue()
            r0 = 13
            if (r1 != r0) goto L90
            X.0RSw r0 = X.EnumC696280RSw.TT_FEED_MULTI_SHOW_CARD
            java.lang.String r0 = r0.getSlotName()
            goto L27
        L90:
            int r1 = r2.intValue()
            r0 = 55
            if (r1 != r0) goto L9f
            X.0RSw r0 = X.EnumC696280RSw.TT_FEED_PLAYABLE_CARD
            java.lang.String r0 = r0.getSlotName()
            goto L27
        L9f:
            java.lang.String r0 = r5.getSlotName()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.anole.full.AnoleFullAboveInteractionTriggerComponent.yp(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
