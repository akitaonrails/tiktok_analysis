package com.ss.android.ugc.aweme.story.feed.avatar.component.panel;

import X.C01GW;
import X.C0SR4;
import X.C0SZ8;
import X.C13LP;
import X.C15438062q;
import X.C1602720roE;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C310670CFt;
import X.C349401Xg;
import X.C452501pT;
import X.C603820NmG;
import X.C628500Oky;
import X.C630740Ooa;
import X.C695170ROp;
import X.C729510SjV;
import X.InterfaceC1616070s9l;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryAvatarRingVerifyConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedAvatarRingVerifyPanelComponent extends BasePanelComponent implements InterfaceC1616070s9l {
    public String LLILZ;
    public final C630740Ooa LL = C628500Oky.LIZ(new AwS555S0100000_11(this, 548));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1981));
    public final LinkedHashMap<String, C695170ROp> LLILLL = new LinkedHashMap<>();
    public int LLILZIL = -1;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this);
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter pagerAdapterLJJLIIIJL;
        C0SR4 c0sr4;
        List<Aweme> listLJJJLZIJ;
        String aid;
        String eventType;
        String eventType2;
        long currentProfileUserRoomId;
        int i2;
        User author;
        String uid;
        User author2;
        String uid2;
        C01GW c01gw = C310670CFt.LIZIZ;
        if (!((StoryAvatarRingVerifyConfig) c01gw.getValue()).enable) {
            return;
        }
        StoryAvatarRingVerifyConfig storyAvatarRingVerifyConfig = (StoryAvatarRingVerifyConfig) c01gw.getValue();
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LL.getValue();
        if (iViewPagerAbility != null) {
            pagerAdapterLJJLIIIJL = iViewPagerAbility.LJJLIIIJL();
        } else {
            pagerAdapterLJJLIIIJL = null;
        }
        if (!(pagerAdapterLJJLIIIJL instanceof C0SR4) || (c0sr4 = (C0SR4) pagerAdapterLJJLIIIJL) == null || (listLJJJLZIJ = c0sr4.LJJJLZIJ()) == null || listLJJJLZIJ.isEmpty()) {
            return;
        }
        Aweme aweme = (Aweme) C13LP.LJJJLL(listLJJJLZIJ);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LLILZ)) {
            this.LLILZ = aid;
            this.LLILZIL = -1;
            this.LLILLL.clear();
        }
        int i3 = storyAvatarRingVerifyConfig.preloadAfter + i;
        int i4 = 1;
        int size = listLJJJLZIJ.size() - 1;
        if (i3 > size) {
            i3 = size;
        }
        int i5 = i - storyAvatarRingVerifyConfig.preloadBefore;
        if (i5 < 0) {
            i5 = 0;
        }
        int iMax = Math.max(i5, this.LLILZIL + 1);
        if (iMax <= i3) {
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType2 = c2189821An6.getEventType();
            } else {
                eventType2 = null;
            }
            C2189821An6 c2189821An62 = getPanelContext().LIZJ;
            if (c2189821An62 != null) {
                currentProfileUserRoomId = c2189821An62.getCurrentProfileUserRoomId();
            } else {
                currentProfileUserRoomId = 0;
            }
            if (iMax <= i3) {
                int i6 = iMax;
                i2 = 0;
                while (true) {
                    Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(i6, listLJJJLZIJ);
                    if (aweme2 != null && (author = aweme2.getAuthor()) != null && (uid = author.getUid()) != null && author.getStoryStatus() == i4 && ((C603820NmG) this.LLILLJJLI.getValue()).LIZJ(uid) == null && !this.LLILLL.containsKey(uid)) {
                        new Object() { // from class: X.0ROq
                        }.getClass();
                        if (!C729510SjV.LJJ(aweme2) && (author2 = aweme2.getAuthor()) != null && (uid2 = author2.getUid()) != null && uid2.length() != 0 && author2.getStoryStatus() == i4) {
                            FeedAvatarAssemWrap.LLLFZ.getClass();
                            if ((!C1602720roE.LIZIZ(aweme2, author2) && currentProfileUserRoomId <= 0) || Intrinsics.LJFF(eventType2, "homepage_nearby")) {
                                this.LLILLL.put(uid, new C695170ROp(i6, author.getNickname()));
                                i2++;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("pendingAdd, nickname=");
                                sbLIZ.append(author.getNickname());
                                sbLIZ.append(", position=");
                                sbLIZ.append(i6);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    }
                    if (i6 == i3) {
                        break;
                    }
                    i6++;
                    i4 = 1;
                }
            } else {
                i2 = 0;
            }
            this.LLILZIL = Math.max(this.LLILZIL, i3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scan, position=");
            sbLIZ2.append(i);
            sbLIZ2.append(", window=[");
            sbLIZ2.append(i5);
            sbLIZ2.append(',');
            sbLIZ2.append(i3);
            sbLIZ2.append("], scanRange=[");
            sbLIZ2.append(iMax);
            sbLIZ2.append(',');
            sbLIZ2.append(i3);
            sbLIZ2.append("], added=");
            sbLIZ2.append(i2);
            sbLIZ2.append(", pendingSize=");
            sbLIZ2.append(this.LLILLL.size());
            sbLIZ2.append(", lastScannedEnd=");
            sbLIZ2.append(this.LLILZIL);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("scanSkipped, position=");
            sbLIZ3.append(i);
            sbLIZ3.append(", window=[");
            sbLIZ3.append(i5);
            sbLIZ3.append(',');
            sbLIZ3.append(i3);
            sbLIZ3.append("], scanStart=");
            sbLIZ3.append(iMax);
            sbLIZ3.append(", lastScannedEnd=");
            sbLIZ3.append(this.LLILZIL);
            sbLIZ3.append(", pendingSize=");
            sbLIZ3.append(this.LLILLL.size());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (!this.LLILLL.isEmpty()) {
            Iterator<T> it2 = this.LLILLL.values().iterator();
            if (it2.hasNext()) {
                Integer numValueOf = Integer.valueOf(((C695170ROp) it2.next()).LIZ);
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((C695170ROp) it2.next()).LIZ);
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    int i7 = ((StoryAvatarRingVerifyConfig) C310670CFt.LIZIZ.getValue()).verifyTriggerDistance;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    if (i >= iIntValue - i7) {
                        List listLLIIII = C13LP.LLIIII(this.LLILLL.keySet());
                        Collection<C695170ROp> collectionValues = this.LLILLL.values();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        Iterator<T> it3 = collectionValues.iterator();
                        while (it3.hasNext()) {
                            String str = ((C695170ROp) it3.next()).LIZIZ;
                            if (str == null) {
                                str = "unknown";
                            }
                            arrayList.add(str);
                        }
                        Collection<C695170ROp> collectionValues2 = this.LLILLL.values();
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues2, 10));
                        Iterator<T> it4 = collectionValues2.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Integer.valueOf(((C695170ROp) it4.next()).LIZ));
                        }
                        C2189821An6 c2189821An63 = getPanelContext().LIZJ;
                        if (c2189821An63 != null) {
                            eventType = c2189821An63.getEventType();
                        } else {
                            eventType = null;
                        }
                        this.LLILLL.clear();
                        Iterator it5 = listLLIIII.iterator();
                        while (it5.hasNext()) {
                            ((C603820NmG) this.LLILLJJLI.getValue()).LIZLLL(it5.next(), Boolean.TRUE);
                        }
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C349401Xg(eventType, listLLIIII, null), 3);
                    }
                }
            }
        }
    }
}
