package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C01GW;
import X.C098200Yq;
import X.C0CNO;
import X.C0HTT;
import X.C0LAB;
import X.C0PEM;
import X.C0RD4;
import X.C0RF0;
import X.C0RSU;
import X.C0RSV;
import X.C0RSW;
import X.C0RSY;
import X.C0RSZ;
import X.C0SR4;
import X.C0SZ8;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1609930rzr;
import X.C189200o6;
import X.C19EG;
import X.C205700ql;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C339190DRl;
import X.C452501pT;
import X.C535340Kz6;
import X.C535350Kz7;
import X.C628500Oky;
import X.C630740Ooa;
import X.C693070RGn;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C706480RnS;
import X.C724270Sb3;
import X.C729220Sj2;
import X.C729450SjP;
import X.C729510SjV;
import X.C735840Sti;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC712090RwV;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ARunnableS16S1100000_11;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionViewPagerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUploadProgressComponent extends BaseCellSlotComponent<StoryUploadProgressComponent> implements ComponentPriorityProtocol, Observer<C0RD4> {
    public Aweme LLLF;
    public Aweme LLLFF;
    public C1397510mTF LLLIIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 598));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 600));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 597));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 603));
    public int LLL = -1;
    public final HashMap<String, Float> LLLFFI = new HashMap<>();
    public final HashMap<String, C0RSU> LLLFZ = new HashMap<>();
    public final C630740Ooa LLLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 601));
    public final C630740Ooa LLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 599));
    public final C630740Ooa LLLIIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 596));
    public final C630740Ooa LLLIIIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 593));
    public final C01GW LLLIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(319));
    public final C630740Ooa LLLIILIL = C628500Oky.LIZ(AFwS198S0000000_11.get$arr$(147));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 602));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_container_story_uploading_bar";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fed;
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
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 594);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_uploading_progress_bar", true, awS555S0100000_11);
    }

    public final FeedCollectionViewPagerAbility Ep() {
        return (FeedCollectionViewPagerAbility) this.LLLI.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1397510mTF c1397510mTF = this.LLLIIL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C339190DRl.LIZIZ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void Gp(String str) {
        String scheduleId;
        Aweme aweme = this.LLLF;
        if (aweme != null) {
            scheduleId = AwemeBizExtKt.getScheduleId(aweme);
        } else {
            scheduleId = null;
        }
        if (!Intrinsics.LJFF(scheduleId, str)) {
            C735840Sti.LIZ.getClass();
            if (str != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C535340Kz6(str, null), 3);
            }
        }
    }

    public final void Jp(String str) {
        C19EG activity;
        String eventType;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        Fragment fragment;
        C729220Sj2 c729220Sj2 = C729220Sj2.LL;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null && (fragment = c0rf0.LIZJ) != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        C729220Sj2.LJIJI(activity, str);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C0RF0 c0rf02 = jm().LIZLLL;
        if (c0rf02 == null || (baseFeedPageParams = c0rf02.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        c735840Sti.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C535350Kz7(str, eventType, "publish", null), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        Aweme item;
        String scheduleId;
        Aweme item2;
        String scheduleId2;
        List<Aweme> listFg;
        C0HTT<C737030Svd> c0htt;
        C0SR4 c0sr4LJJLIIIJL;
        Aweme item3;
        C0SR4 c0sr4LJJLIIIJL2;
        C0HTT<C737030Svd> c0htt2;
        C0SZ8 c0sz8LJLIL;
        C729450SjP c729450SjP;
        Aweme item4;
        String scheduleId3;
        C0RD4 c0rd42 = c0rd4;
        String str = c0rd42.LIZ;
        String scheduleId4 = null;
        Object obj = null;
        switch (str.hashCode()) {
            case 271694622:
                if (str.equals("UPLOADING_USER_STORY_FAIL")) {
                    Object obj2 = c0rd42.LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    Pair pair = (Pair) obj2;
                    String str2 = (String) pair.getFirst();
                    String str3 = (String) pair.getSecond();
                    this.LLLFZ.put(str2, C0RSW.LJI);
                    FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp = Ep();
                    if (feedCollectionViewPagerAbilityEp != null) {
                        int iLJIL = feedCollectionViewPagerAbilityEp.LJIL();
                        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp2 = Ep();
                        if (feedCollectionViewPagerAbilityEp2 != null) {
                            item = feedCollectionViewPagerAbilityEp2.getItem(iLJIL);
                        } else {
                            item = null;
                        }
                        if (C729510SjV.LJIJ(item)) {
                            if (item != null) {
                                scheduleId = AwemeBizExtKt.getScheduleId(item);
                            } else {
                                scheduleId = null;
                            }
                            if (u.LJIJI(str2, scheduleId, true)) {
                                Qp(C0RSW.LJI, 0.0f, str3);
                                if (item != null) {
                                    scheduleId4 = AwemeBizExtKt.getScheduleId(item);
                                }
                                Gp(scheduleId4);
                            }
                        }
                    }
                }
                break;
            case 1555587043:
                if (str.equals("UPLOADING_USER_STORY_SUCCESS")) {
                    Object obj3 = c0rd42.LIZIZ;
                    if (obj3 == null) {
                        obj3 = null;
                    }
                    Pair pair2 = (Pair) obj3;
                    String str4 = (String) pair2.getFirst();
                    Aweme aweme = (Aweme) pair2.getSecond();
                    this.LLLFFI.put(str4, Float.valueOf(1.0f));
                    C0RSV c0rsv = new C0RSV(str4);
                    this.LLLFZ.put(str4, c0rsv);
                    FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp3 = Ep();
                    if (feedCollectionViewPagerAbilityEp3 != null) {
                        int iLJIL2 = feedCollectionViewPagerAbilityEp3.LJIL();
                        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp4 = Ep();
                        if (feedCollectionViewPagerAbilityEp4 != null) {
                            item2 = feedCollectionViewPagerAbilityEp4.getItem(iLJIL2);
                        } else {
                            item2 = null;
                        }
                        if (C729510SjV.LJIJ(item2)) {
                            if (aweme != null) {
                                scheduleId2 = AwemeBizExtKt.getScheduleId(aweme);
                            } else {
                                scheduleId2 = null;
                            }
                            if (u.LJIJI(str4, scheduleId2, true)) {
                                Qp(c0rsv, 100.0f, null);
                                FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp5 = Ep();
                                if (feedCollectionViewPagerAbilityEp5 == null || (listFg = feedCollectionViewPagerAbilityEp5.Fg()) == null) {
                                    listFg = C13BV.INSTANCE;
                                }
                                if (!(listFg instanceof Collection) || !listFg.isEmpty()) {
                                    for (Aweme aweme2 : listFg) {
                                        if (C729510SjV.LJIJ(aweme2) && Intrinsics.LJFF(AwemeBizExtKt.getScheduleId(aweme2), str4)) {
                                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listFg, 10));
                                            for (Aweme aweme3 : listFg) {
                                                if (C729510SjV.LJIJ(aweme3) && Intrinsics.LJFF(AwemeBizExtKt.getScheduleId(aweme3), str4)) {
                                                    aweme3 = aweme;
                                                }
                                                arrayList.add(aweme3);
                                            }
                                            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp6 = Ep();
                                            if (feedCollectionViewPagerAbilityEp6 != null && (c0sr4LJJLIIIJL = feedCollectionViewPagerAbilityEp6.LJJLIIIJL()) != null) {
                                                c0sr4LJJLIIIJL.setData(arrayList);
                                            }
                                            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp7 = Ep();
                                            if (feedCollectionViewPagerAbilityEp7 != null) {
                                                int iLJIL3 = feedCollectionViewPagerAbilityEp7.LJIL();
                                                StoryCollectionViewPagerAbility storyCollectionViewPagerAbility = (StoryCollectionViewPagerAbility) this.LLLII.getValue();
                                                if (storyCollectionViewPagerAbility != null) {
                                                    storyCollectionViewPagerAbility.onPageSelected(iLJIL3, false);
                                                }
                                            }
                                            EnumC712090RwV enumC712090RwV = EnumC712090RwV.ON_PUBLISH_SUCCESS;
                                            C0RF0 c0rf0 = jm().LIZLLL;
                                            if (c0rf0 != null && (c0htt = c0rf0.LIZIZ) != null) {
                                                c0htt.LLIIL(new C737030Svd(60, new C0RSY(enumC712090RwV, null)));
                                                break;
                                            }
                                        }
                                    }
                                }
                                StoryCollectionViewPagerAbility storyCollectionViewPagerAbility2 = (StoryCollectionViewPagerAbility) this.LLLII.getValue();
                                if (storyCollectionViewPagerAbility2 != null) {
                                    storyCollectionViewPagerAbility2.D61();
                                }
                            }
                        }
                    }
                }
                break;
            case 2005298957:
                if (str.equals("UPLOADING_LOCAL_VIDEO_READY")) {
                    Object obj4 = c0rd42.LIZIZ;
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    String str5 = (String) obj4;
                    FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp8 = Ep();
                    if (feedCollectionViewPagerAbilityEp8 != null) {
                        int iLJIL4 = feedCollectionViewPagerAbilityEp8.LJIL();
                        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp9 = Ep();
                        if (feedCollectionViewPagerAbilityEp9 != null && (item3 = feedCollectionViewPagerAbilityEp9.getItem(iLJIL4)) != null && C729510SjV.LJIJ(item3) && u.LJIJI(str5, AwemeBizExtKt.getScheduleId(item3), true)) {
                            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp10 = Ep();
                            if (feedCollectionViewPagerAbilityEp10 != null && (c0sz8LJLIL = feedCollectionViewPagerAbilityEp10.LJLIL()) != null) {
                                c0sz8LJLIL.LJJJJ(this.LLL, item3);
                            }
                            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp11 = Ep();
                            if (feedCollectionViewPagerAbilityEp11 != null && (c0sr4LJJLIIIJL2 = feedCollectionViewPagerAbilityEp11.LJJLIIIJL()) != null) {
                                int count = c0sr4LJJLIIIJL2.getCount();
                                EnumC712090RwV enumC712090RwV2 = EnumC712090RwV.ON_PAGE_SELECTED;
                                C724270Sb3 c724270Sb3 = this.LLJI;
                                if (c724270Sb3 != null) {
                                    obj = c724270Sb3.LL;
                                }
                                C693070RGn c693070RGn = new C693070RGn(item3, ((VideoItemParams) obj).currentPosition, iLJIL4, count, false, false, null, null, 0, 480);
                                C0RF0 c0rf02 = jm().LIZLLL;
                                if (c0rf02 != null && (c0htt2 = c0rf02.LIZIZ) != null) {
                                    c0htt2.LLIIL(new C737030Svd(60, new C0RSY(enumC712090RwV2, c693070RGn)));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2025168429:
                if (str.equals("UPLOADING_USER_STORY_PROGRESS")) {
                    Object obj5 = c0rd42.LIZIZ;
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    Pair pair3 = (Pair) obj5;
                    String str6 = (String) pair3.getFirst();
                    Object second = pair3.getSecond();
                    if ((second instanceof C729450SjP) && (c729450SjP = (C729450SjP) second) != null) {
                        float f = c729450SjP.LIZ;
                        this.LLLFFI.put(str6, Float.valueOf(f));
                        this.LLLFZ.put(str6, new C205700ql(c729450SjP.LJFF));
                        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp12 = Ep();
                        if (feedCollectionViewPagerAbilityEp12 != null) {
                            int iLJIL5 = feedCollectionViewPagerAbilityEp12.LJIL();
                            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp13 = Ep();
                            if (feedCollectionViewPagerAbilityEp13 != null) {
                                item4 = feedCollectionViewPagerAbilityEp13.getItem(iLJIL5);
                            } else {
                                item4 = null;
                            }
                            if (C729510SjV.LJIJ(item4)) {
                                if (item4 != null) {
                                    scheduleId3 = AwemeBizExtKt.getScheduleId(item4);
                                } else {
                                    scheduleId3 = null;
                                }
                                if (u.LJIJI(str6, scheduleId3, true)) {
                                    Qp(new C205700ql(c729450SjP.LJFF), f, null);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C339190DRl.LIZIZ(getContentView());
        C786410Ut5.I7(new AbS693S0100000_11(this, 8), getContentView());
        C786410Ut5.I7(new AbS693S0100000_11(this, 9), (View) this.LLJZIJLIL.getValue());
        C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 595));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C729510SjV.LJJ(videoItemParams.getAweme());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Boolean boolValueOf;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (!C729510SjV.LJJIIZ(videoItemParams2.getAweme())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind: isFake = ");
            Story story = videoItemParams2.getAweme().getStory();
            if (story != null) {
                boolValueOf = Boolean.valueOf(story.isFaked());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLLFF = videoItemParams2.getAweme();
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLIIIIL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final void Fp(C729450SjP c729450SjP, String str) {
        String scheduleId;
        Aweme aweme = this.LLLF;
        if (aweme != null) {
            scheduleId = AwemeBizExtKt.getScheduleId(aweme);
        } else {
            scheduleId = null;
        }
        if (!Intrinsics.LJFF(scheduleId, str)) {
            C735840Sti.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            C1609930rzr.LIZJ(c0lab, c729450SjP, "head_status");
            C20684815ws.LJIILLIIL("preview_during_publishing", c0lab.LIZ);
        }
    }

    public final void Ip(int i, Aweme aweme) {
        this.LLL = i;
        if (aweme == null) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            this.LLLF = aweme;
            return;
        }
        String scheduleId = AwemeBizExtKt.getScheduleId(aweme);
        if (scheduleId == null) {
            scheduleId = "";
        }
        C729450SjP c729450SjPLIZLLL = C729220Sj2.LL.LIZLLL(scheduleId);
        if (c729450SjPLIZLLL == null) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            this.LLLF = aweme;
            return;
        }
        int i2 = C0RSZ.LIZ[c729450SjPLIZLLL.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && !C729510SjV.LJIJ(aweme)) {
                    C786410Ut5.LJLLLLLL(8, getContentView());
                }
            } else {
                Qp(C0RSW.LJI, 0.0f, c729450SjPLIZLLL.LIZLLL);
                Fp(c729450SjPLIZLLL, AwemeBizExtKt.getScheduleId(aweme));
                Gp(AwemeBizExtKt.getScheduleId(aweme));
            }
        } else {
            C205700ql c205700ql = new C205700ql(c729450SjPLIZLLL.LJFF);
            Qp(c205700ql, c729450SjPLIZLLL.LIZ, null);
            this.LLLFZ.put(scheduleId, c205700ql);
            Fp(c729450SjPLIZLLL, AwemeBizExtKt.getScheduleId(aweme));
        }
        this.LLLF = aweme;
    }

    public final void Qp(C0RSU c0rsu, float f, String str) {
        int i = 0;
        if ((c0rsu instanceof C0RSW) && (str == null || str.length() == 0)) {
            str = getContentView().getContext().getString(2131849116);
        }
        View contentView = getContentView();
        TuxIconView tuxIconView = (TuxIconView) this.LLJLLIL.getValue();
        TextView textView = (TextView) this.LLJLLL.getValue();
        TuxTextView tuxTextView = (TuxTextView) this.LLJZ.getValue();
        View view = (View) this.LLJZIJLIL.getValue();
        C786410Ut5.LJLLLLLL(0, contentView);
        if (c0rsu.LIZIZ) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(c0rsu.LIZJ);
        } else {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        textView.setText(c0rsu.LIZ(f, contentView.getContext()));
        if (c0rsu.LIZLLL) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            textView.setText(str);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (!c0rsu.LJ) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        Integer numLIZJ = C1308910kAL.LIZJ(c0rsu.LJFF, contentView.getContext());
        if (numLIZJ != null) {
            contentView.findViewById(R.id.s8u).setBackgroundColor(numLIZJ.intValue());
        }
        if (c0rsu instanceof C0RSV) {
            HandlerHook.viewPostDelay(getContentView(), new ARunnableS16S1100000_11(this, ((C0RSV) c0rsu).LJI, 2), 3000L);
        }
    }
}
