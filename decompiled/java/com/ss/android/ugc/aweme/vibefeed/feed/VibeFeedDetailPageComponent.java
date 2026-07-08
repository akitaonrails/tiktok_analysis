package com.ss.android.ugc.aweme.vibefeed.feed;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P3B;
import X.C0P3C;
import X.C1220000hqw;
import X.C13LE;
import X.C1575210r5r;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC897860ZKe;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeRetentionAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.ability.IVibeStatusViewAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedDetailPageComponent extends SimpleVibeDetailPageComponent {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1488));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1489));
    public final C736950SvV LLLL;
    public final C736950SvV LLLLII;

    public VibeFeedDetailPageComponent() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(397);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeDetailSharedVM.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(516);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((AbstractC738140SxQ) this, 1486);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLLL = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_24, c451610HnL, c723700Sa8);
        AFwS213S0000000_24 aFwS213S0000000_242 = AFwS213S0000000_24.get$arr$(398);
        this.LLLLII = new C736950SvV(C13LE.LIZ(VibeFeedEntranceViewModel.class), aFwS213S0000000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(517), new AwS568S0100000_24((AbstractC738140SxQ) this, 1487), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        VibeFeedEntranceViewModel vibeFeedEntranceViewModel = (VibeFeedEntranceViewModel) this.LLLLII.getValue();
        C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
        EnumC897860ZKe enumC897860ZKe = EnumC897860ZKe.CHAT_PAGE;
        String str = vibeFeedEntranceViewModel.LLJI;
        if (str == null) {
            str = "";
        }
        c1575210r5r.LJI(enumC897860ZKe, str, false);
        vibeFeedEntranceViewModel.setState(AFwS264S0000000_24.get$arr$(604));
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.SimpleVibeDetailPageComponent, com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        IVibeRetentionAbility iVibeRetentionAbility = (IVibeRetentionAbility) this.LLLJIL.getValue();
        if (iVibeRetentionAbility != null && iVibeRetentionAbility.onDispatchKeyEvent(keyEvent)) {
            return true;
        }
        return super.onDispatchKeyEvent(keyEvent);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.SimpleVibeDetailPageComponent, com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.z18);
        IVibeStatusViewAbility iVibeStatusViewAbility = (IVibeStatusViewAbility) this.LLLJL.getValue();
        if (iVibeStatusViewAbility != null) {
            getActualLifecycleOwner();
            iVibeStatusViewAbility.wf1(c1749280vcc, this);
        }
        C736680Sv4.LJIIIIZZ(this, this.LLLL.getValue(), new C2217381BqS() { // from class: X.0P3m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P3U) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 211), 6);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void yF(int i, String str) {
        IVibeRetentionAbility iVibeRetentionAbility = (IVibeRetentionAbility) this.LLLJIL.getValue();
        if (iVibeRetentionAbility != null && iVibeRetentionAbility.L52(str)) {
            return;
        }
        super.yF(i, str);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0P3B.LIZ.getClass();
        C0P3C.LIZIZ.LIZ("vibe_feed_ui_create_end");
        return viewOnCreateView;
    }
}
