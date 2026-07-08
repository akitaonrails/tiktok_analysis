package com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui;

import X.C0R45;
import X.C13LE;
import X.C275130AqN;
import X.C656870Ppd;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC656860Ppc;
import X.InterfaceC435460H5s;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchLsLiveCardInfoAssem;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveCardBottomAssem extends SearchCardBottomBarAssem {
    public boolean LLLIIIIL;
    public Aweme LLLIIIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final EnumC656860Ppc yp() {
        EnumC656860Ppc enumC656860Ppc;
        C656870Ppd c656870Ppd = (C656870Ppd) this.LLJJLIIIJLLLLLLLZ.getValue();
        return (c656870Ppd == null || (enumC656860Ppc = c656870Ppd.LL) == null) ? EnumC656860Ppc.NONE : enumC656860Ppc;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (((Number) C275130AqN.LIZ.getValue()).intValue() != 0) {
            view.addOnAttachStateChangeListener(new C0R45(this, 45));
        }
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 196));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC435460H5s interfaceC435460H5s) {
        up(interfaceC435460H5s);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.bytedance.tux.input.TuxTextView r3 = r6.LLJLILLLLZIIL
            if (r3 == 0) goto L5d
            boolean r0 = X.C656880Ppe.LIZIZ(r7)
            r6.LLLIIIIL = r0
            r2 = 0
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            if (r0 == 0) goto L6b
            java.lang.String r5 = r0.getRoomTitleAiSummary()
        L1a:
            boolean r0 = r6.Ap()
            r4 = 0
            if (r0 != 0) goto L3a
            android.content.Context r1 = r3.getContext()
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L5e
            int r0 = r0.intValue()
        L32:
            r3.setTextColor(r0)
            r0 = 41
            r3.setTuxFont(r0)
        L3a:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L6d
            java.lang.String r0 = ""
            r3.setText(r0)
            r0 = 8
            X.C786410Ut5.LLLLZLL(r3, r0)
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility r1 = (com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility) r1
            if (r1 == 0) goto L5d
            X.0Ppx r0 = X.EnumC657070Ppx.DESC
            r1.qw1(r0, r2)
        L5d:
            return
        L5e:
            r0 = 0
            goto L32
        L60:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            if (r0 == 0) goto L6b
            java.lang.String r5 = r0.getRoomTitle()
            goto L1a
        L6b:
            r5 = r2
            goto L1a
        L6d:
            X.C786410Ut5.LLLLZLL(r3, r4)
            X.0HCs r2 = new X.0HCs
            r2.<init>(r3, r6, r5)
            X.01GW r0 = X.C275140AqO.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L9d
            X.01GW r0 = X.C0A5C.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L9d
            Y.ARunnableS75S0200000_6 r1 = new Y.ARunnableS75S0200000_6
            r0 = 43
            r1.<init>(r3, r2, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r3, r1)
            return
        L9d:
            r2.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCardBottomAssem.tp(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    /* JADX INFO: renamed from: zp */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        this.LLLIIIL = interfaceC435460H5s.getAweme();
        super.up(interfaceC435460H5s);
        if (interfaceC435460H5s.getAweme().localServiceLiveInfo != null) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchLsLiveCardInfoAssem.class), true, null);
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
    }
}
