package com.ss.android.ugc.aweme.inbox.adapter;

import X.AbstractC1598130rgp;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0IYA;
import X.C10EU;
import X.C1152490g63;
import X.C1322110kVd;
import X.C1324610kZf;
import X.C1387050mCN;
import X.C1595350rcL;
import X.C1597900rgS;
import X.C1597910rgT;
import X.C1598200rgw;
import X.C1605490rsh;
import X.C1607430rvp;
import X.C1607450rvr;
import X.C1607470rvt;
import X.C1611060s1g;
import X.C1819620xS4;
import X.C1BCM;
import X.C21569819bE;
import X.C295060BhQ;
import X.C295310Bhp;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.C960203pA;
import X.EnumC21569519bB;
import X.EnumC2274741E1w;
import X.InterfaceC1605510rsj;
import X.InterfaceC1607520rvy;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS124S0100000_24;
import Y.ATListenerS344S0200000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeExperiment;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimEntranceDisableSettings;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes25.dex */
public abstract class InboxLiveBaseCell<T extends AbstractC1598130rgp> extends LongClickAbilitySkylightCell<T> implements InterfaceC1605510rsj {
    public static final C01GW<Integer> LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(199));
    public boolean LLILLJJLI;
    public C21569819bE LLILLL;
    public RelationButton LLILZ;
    public volatile boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public EnterRoomConfig LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(201));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(200));
    public final C1607430rvp LLIZ = new InterfaceC1607520rvy(this) { // from class: X.0rvp
        public final /* synthetic */ InboxLiveBaseCell<T> LIZ;

        {
            this.LIZ = this;
        }

        @Override // X.InterfaceC1607520rvy
        public final void LIZ(boolean z) {
            this.LIZ.LLJILJILJ = z;
            LiveHeadAnimDowngradeExperiment liveHeadAnimDowngradeExperiment = LiveHeadAnimDowngradeExperiment.INSTANCE;
            if (!liveHeadAnimDowngradeExperiment.isSoftDowngradeEnable()) {
                if (z) {
                    C21569819bE c21569819bE = this.LIZ.LLILLL;
                    if (c21569819bE != null) {
                        c21569819bE.setRenderInterval(liveHeadAnimDowngradeExperiment.getDowngradeFraction());
                        return;
                    }
                    return;
                }
                C21569819bE c21569819bE2 = this.LIZ.LLILLL;
                if (c21569819bE2 == null) {
                    return;
                }
                c21569819bE2.setRenderInterval(InboxLiveBaseCell.LLJJI.getValue().intValue());
            }
        }
    };
    public final ARunnableS124S0100000_24 LLJJ = new ARunnableS124S0100000_24(this, 35);

    public abstract void U5();

    public abstract void X5(Long l);

    public abstract void b6();

    public final void T5() {
        T item;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        User user;
        RelationButton relationButton;
        if (!C295060BhQ.LIZ() || (item = getItem()) == null || (inboxLiveNoticeLIZIZ = item.LIZIZ()) == null || (user = inboxLiveNoticeLIZIZ.user) == null || (relationButton = this.LLILZ) == null) {
            return;
        }
        if (!C10EU.LJIILJJIL(user)) {
            C339190DRl.LIZIZ(relationButton);
            relationButton.LIZ();
            C339190DRl.LIZLLL(this.LLILLL);
            C21569819bE c21569819bE = this.LLILLL;
            if (c21569819bE != null) {
                c21569819bE.LJFF();
                return;
            }
            return;
        }
        C339190DRl.LIZLLL(relationButton);
        C1387050mCN c1387050mCN = new C1387050mCN(user);
        c1387050mCN.LIZIZ = false;
        c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_INBOX_SKYLIGHT_RELATION;
        c1387050mCN.LJIIJJI = this;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        relationButton.setFollowClickListener(new AwS620S0100000_6(relationButton, 37));
        relationButton.setDataChangeListener(new AwS385S0200000_19((InboxLiveBaseCell) this, relationButton, (RelationButton) 33));
        relationButton.setTracker(new AwS568S0100000_24(user, 647));
        C339190DRl.LIZIZ(this.LLILLL);
        C21569819bE c21569819bE2 = this.LLILLL;
        if (c21569819bE2 != null) {
            c21569819bE2.LJ();
        }
    }

    public final void c6() {
        Long lValueOf;
        T item;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        InboxLiveNotice inboxLiveNoticeLIZIZ2;
        if (C1152490g63.LIZ() && this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        T item2 = getItem();
        if (item2 == null || (inboxLiveNoticeLIZIZ2 = item2.LIZIZ()) == null) {
            lValueOf = null;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() - inboxLiveNoticeLIZIZ2.receiveTime;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            lValueOf = Long.valueOf(jCurrentTimeMillis);
        }
        X5(lValueOf);
        if (C1597900rgS.LIZ(C1597910rgT.LIZJ()) || (item = getItem()) == null || (inboxLiveNoticeLIZIZ = item.LIZIZ()) == null) {
            return;
        }
        boolean zLIZ = C1598200rgw.LIZ(inboxLiveNoticeLIZIZ, C1597910rgT.LIZJ().LIZJ);
        C1597910rgT.LIZJ().LIZLLL(zLIZ ? 0 : 3, zLIZ, true);
        if (this.LLJ && this.LLJI) {
            C1597900rgS.LJFF(C1597910rgT.LIZJ(), zLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        ViewGroup viewGroup;
        super.onItemViewCreated();
        C1595350rcL.LIZLLL(this);
        View view = this.itemView;
        if (!(view instanceof ConstraintLayout) || (viewGroup = (ViewGroup) view) == null || C1607470rvt.LIZ().inboxSkyFixVersion > 0) {
            return;
        }
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        LiveHeadAnimDowngradeExperiment liveHeadAnimDowngradeExperiment = LiveHeadAnimDowngradeExperiment.INSTANCE;
        if (liveHeadAnimDowngradeExperiment.isDowngradeEnable()) {
            C1BCM c1bcm = C1BCM.LIZ;
            C1607430rvp c1607430rvp = this.LLIZ;
            c1bcm.getClass();
            ((ArrayList) C1BCM.LJFF).add(c1607430rvp);
            C1BCM.LIZIZ();
        }
        this.LLILLJJLI = true;
        this.LLJ = true;
        this.LLJI = true;
        T item = getItem();
        if (item != null && item.LIZLLL() && C1605490rsh.LIZJ.LIZ == 0) {
            if (liveHeadAnimDowngradeExperiment.isSoftDowngradeEnable()) {
                int downgradeFraction = this.LLJILJILJ ? liveHeadAnimDowngradeExperiment.getDowngradeFraction() : LLJJI.getValue().intValue();
                C21569819bE c21569819bE = this.LLILLL;
                if (c21569819bE != null) {
                    c21569819bE.setRenderInterval(downgradeFraction);
                }
            }
            b6();
        }
        View view = this.itemView;
        if (view != null) {
            HandlerHook.viewPost(view, this.LLJJ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        if (LiveHeadAnimDowngradeExperiment.INSTANCE.isDowngradeEnable()) {
            C1BCM c1bcm = C1BCM.LIZ;
            C1607430rvp c1607430rvp = this.LLIZ;
            c1bcm.getClass();
            ((ArrayList) C1BCM.LJFF).remove(c1607430rvp);
        }
        this.LLILLJJLI = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
        T item = getItem();
        if (item != null && item.LIZLLL()) {
            U5();
        }
        View view = this.itemView;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJJ);
        }
    }

    @Override // X.InterfaceC1605510rsj
    public final void LLLLLZL(boolean z) {
        int iIntValue;
        LiveHeadAnimDowngradeExperiment liveHeadAnimDowngradeExperiment = LiveHeadAnimDowngradeExperiment.INSTANCE;
        if (liveHeadAnimDowngradeExperiment.isSoftDowngradeEnable()) {
            if (this.LLJILJILJ) {
                iIntValue = liveHeadAnimDowngradeExperiment.getDowngradeFraction();
            } else {
                iIntValue = LLJJI.getValue().intValue();
            }
            C21569819bE c21569819bE = this.LLILLL;
            if (c21569819bE != null) {
                c21569819bE.setRenderInterval(iIntValue);
            }
        }
        if (!C1152490g63.LIZ() || !this.LLILLJJLI || z == this.LLJI) {
            return;
        }
        this.LLJI = z;
        if (z) {
            c6();
        } else {
            this.LLIZLLLIL = false;
        }
    }

    public final void V5(Context context) {
        int i;
        C21569819bE c21569819bE;
        if (context != null && C960203pA.LIZIZ(context)) {
            i = -16777216;
        } else {
            i = -1;
        }
        if (C1611060s1g.LIZ().isTopLiveEnable() && (c21569819bE = this.LLILLL) != null) {
            c21569819bE.setRenderInterval(LLJJI.getValue().intValue());
        }
        C21569819bE c21569819bE2 = this.LLILLL;
        if (c21569819bE2 != null) {
            c21569819bE2.setOuterCircleColors(i);
        }
        C21569819bE c21569819bE3 = this.LLILLL;
        if (c21569819bE3 != null) {
            c21569819bE3.LIZJ(EnumC21569519bB.LIVE_INBOX_LIVING_ICON_NEW);
        }
        if (C295310Bhp.LIZ()) {
            C21569819bE c21569819bE4 = this.LLILLL;
            if (c21569819bE4 != null) {
                c21569819bE4.setOuterCircleStrokeWidth(C418440Gaw.LIZIZ(3));
            }
        } else {
            C21569819bE c21569819bE5 = this.LLILLL;
            if (c21569819bE5 != null) {
                c21569819bE5.setOuterCircleStrokeWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            }
        }
        C21569819bE c21569819bE6 = this.LLILLL;
        if (c21569819bE6 != null) {
            c21569819bE6.setDisableAnim(LiveHeadAnimEntranceDisableSettings.INSTANCE.isDisable());
        }
        C21569819bE c21569819bE7 = this.LLILLL;
        if (c21569819bE7 != null) {
            HandlerHook.viewPost(c21569819bE7, new ARunnableS119S0100000_19(this, 73));
        }
    }

    @Override // X.InterfaceC1605510rsj
    public final void Z1(boolean z) {
        if (!C1152490g63.LIZ() || !this.LLILLJJLI || z == this.LLJ) {
            return;
        }
        this.LLJ = z;
        if (z) {
            if (this.LLJI) {
                c6();
                return;
            }
            return;
        }
        this.LLIZLLLIL = false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: a6, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        this.LLJIJIL = null;
        this.LLJILJIL = false;
        C786410Ut5.Ob(this.itemView, 1.0f);
        C786410Ut5.pc(this.itemView, 1.0f);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 22), this.itemView);
        if (C1607450rvr.LIZ().prepareAfterOnTouch) {
            this.itemView.setOnTouchListener(new ATListenerS344S0200000_24(this, t, 0));
        }
    }

    public final void W5(List list, C1322110kVd c1322110kVd, C0IYA c0iya) {
        if (list != null && !list.isEmpty()) {
            C1324610kZf c1324610kZfLJIJJLI = C1819620xS4.LIZ().LJIJJLI((String) ListProtector.get(list, 0), "inbox_window_avatar");
            c1324610kZfLJIJJLI.LJIIL = c0iya;
            c1324610kZfLJIJJLI.LJJIIZ = (String) this.LLILZLL.getValue();
            c1324610kZfLJIJJLI.LJJI(c1322110kVd);
            return;
        }
        c1322110kVd.setBackground(C800330VaR.LIZIZ(c1322110kVd.getContext(), R.drawable.ela));
    }
}
