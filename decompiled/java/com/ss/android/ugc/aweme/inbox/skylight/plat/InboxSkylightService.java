package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.AbstractC21673719rz;
import X.C098200Yq;
import X.C1220000hqw;
import X.C13LE;
import X.C1598660rhg;
import X.C1598680rhi;
import X.C1599110riP;
import X.C1600450rkZ;
import X.C1622206Wu;
import X.C189200o6;
import X.C19719912Dl;
import X.C20485615Dy;
import X.C20600815jK;
import X.C291001Au;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1598970riB;
import X.InterfaceC1600130rk3;
import X.InterfaceC1891350zJl;
import X.InterfaceC610820NxY;
import X.InterfaceC610960Nxm;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;
import com.ss.android.ugc.aweme.dc.core.PORef;
import com.ss.android.ugc.aweme.dc.core.SnapshotEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightService implements ISkylightOutBridge {
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final AbstractC21673719rz LJ() {
        return new C20485615Dy();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final Object LJFF() {
        return new InterfaceC610960Nxm() { // from class: X.0NxZ
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(516));

            @Override // X.InterfaceC610960Nxm
            public final Unit onStop() {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC610960Nxm
            public final Object LIZ(ListIndexSnapshot listIndexSnapshot) {
                List<SnapshotEntry> listLIZ = C614770O9j.LIZIZ.LJII().LIZ(listIndexSnapshot);
                int size = listIndexSnapshot.entries.size() - listLIZ.size();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStart: filtered count = ");
                sbLIZ.append(size);
                C1720106oR.LJI("InboxSkylightCacheVOMapper", C2188811AlT.LIZIZ(sbLIZ));
                return listLIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC610960Nxm
            public final Object LIZIZ(SnapshotEntry snapshotEntry, List list) {
                C610660NxI c610660NxI;
                C610500Nx2 c610500Nx2;
                Object c098200Yq;
                int iIntValue;
                String str;
                Integer numLJIIJJI;
                String str2;
                Integer numLJIIJJI2;
                String str3;
                Integer numLJIIJJI3;
                Aweme aweme;
                String str4;
                Integer numLJIIJJI4;
                AbstractC610790NxV abstractC610790NxVLIZ = C610770NxT.LIZ(snapshotEntry.voType);
                int iIntValue2 = Integer.MAX_VALUE;
                StoryInboxItem storyInboxItem = null;
                if (Intrinsics.LJFF(abstractC610790NxVLIZ, C610800NxW.LIZJ)) {
                    C610660NxI c610660NxI2 = (C610660NxI) C13LP.LJJJLL(list);
                    if (c610660NxI2 != null) {
                        T t = c610660NxI2.LIZIZ;
                        if ((t instanceof Aweme) && (aweme = (Aweme) t) != null) {
                            Map<String, String> map = snapshotEntry.states;
                            if (map != null && (str4 = map.get("priority")) != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str4)) != null) {
                                iIntValue2 = numLJIIJJI4.intValue();
                            }
                            storyInboxItem = new StoryInboxItem(aweme, iIntValue2, ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(aweme.getAuthor().getUid()), null, null, true, 0, -1, null, 1, System.currentTimeMillis());
                        }
                    }
                } else if (Intrinsics.LJFF(abstractC610790NxVLIZ, C610740NxQ.LIZJ) && (c610660NxI = (C610660NxI) C13LP.LJJJLL(list)) != null) {
                    T t2 = c610660NxI.LIZIZ;
                    if ((t2 instanceof C610500Nx2) && (c610500Nx2 = (C610500Nx2) t2) != null) {
                        try {
                            C1227904rF c1227904rF = C1227904rF.LIZ;
                            String str5 = c610500Nx2.LIZ.roomData;
                            c1227904rF.getClass();
                            c098200Yq = (SlimRoom) C1227904rF.LIZIZ(str5, SlimRoom.class);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        SlimRoom slimRoom = (SlimRoom) c098200Yq;
                        if (slimRoom != null) {
                            Map<String, String> map2 = snapshotEntry.states;
                            int iIntValue3 = 0;
                            if (map2 != null && (str3 = map2.get("type")) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str3)) != null) {
                                iIntValue = numLJIIJJI3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            Map<String, String> map3 = snapshotEntry.states;
                            if (map3 != null && (str2 = map3.get("priority")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) != null) {
                                iIntValue2 = numLJIIJJI2.intValue();
                            }
                            Map<String, String> map4 = snapshotEntry.states;
                            if (map4 != null && (str = map4.get("position")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                                iIntValue3 = numLJIIJJI.intValue();
                            }
                            InboxLiveNotice inboxLiveNotice = new InboxLiveNotice(c610500Nx2.LIZ, iIntValue, slimRoom, false, iIntValue2, true, System.currentTimeMillis());
                            IInboxLiveService iInboxLiveService = (IInboxLiveService) this.LIZ.getValue();
                            if (iInboxLiveService != null) {
                                return iInboxLiveService.mapLiveItem(inboxLiveNotice, true, iIntValue3);
                            }
                        }
                    }
                }
                return storyInboxItem;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final Object LJIIIZ() {
        return new InterfaceC610820NxY() { // from class: X.0NxS
            @Override // X.InterfaceC610820NxY
            public final C610780NxU LIZ(List list) {
                String curUserId;
                StoryInboxItem storyInboxItem;
                String strValueOf;
                SnapshotEntry snapshotEntry;
                User user;
                int i = 3;
                int iLIZ = C596340NaC.LIZ(3);
                if (iLIZ <= 0 || list.isEmpty()) {
                    return null;
                }
                boolean z = C596340NaC.LIZIZ().storyCacheEnable;
                boolean z2 = C596340NaC.LIZIZ().liveCacheEnable;
                ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList(iLIZ);
                for (Object obj : list) {
                    if (arrayList.size() >= iLIZ) {
                        break;
                    }
                    if (z2 && (obj instanceof AbstractC1598130rgp)) {
                        arrayList.add(obj);
                    } else if (z && (obj instanceof InterfaceC714040Rze)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
                    if (interfaceC1891350zJl instanceof AbstractC1598130rgp) {
                        AbstractC1598130rgp abstractC1598130rgp = (AbstractC1598130rgp) interfaceC1891350zJl;
                        InboxLiveNotice inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ();
                        if (inboxLiveNoticeLIZIZ != null && (user = inboxLiveNoticeLIZIZ.user) != null) {
                            List listSingletonList = Collections.singletonList(new PORef(user.getUid(), C610510Nx3.LIZJ.LIZ));
                            String str = C610740NxQ.LIZJ.LIZ;
                            Pair[] pairArr = new Pair[i];
                            pairArr[0] = new Pair("type", String.valueOf(inboxLiveNoticeLIZIZ.type));
                            pairArr[1] = new Pair("priority", String.valueOf(inboxLiveNoticeLIZIZ.priority));
                            pairArr[2] = new Pair("position", String.valueOf(abstractC1598130rgp.LL));
                            snapshotEntry = new SnapshotEntry(listSingletonList, str, C2097608Jq.LJIIIIZZ(pairArr));
                            arrayList2.add(snapshotEntry);
                        }
                    } else if (interfaceC1891350zJl instanceof InterfaceC714040Rze) {
                        InterfaceC714040Rze interfaceC714040Rze = (InterfaceC714040Rze) interfaceC1891350zJl;
                        String authorUid = AwemeExtKt.getAuthorUid(interfaceC714040Rze.getStoryCollection());
                        if (authorUid.length() != 0) {
                            if (interfaceC714040Rze instanceof StoryInboxItem) {
                                strValueOf = String.valueOf(((StoryInboxItem) interfaceC714040Rze).getPriority());
                            } else {
                                strValueOf = null;
                            }
                            List listSingletonList2 = Collections.singletonList(new PORef(authorUid, C610530Nx5.LIZJ.LIZ));
                            String str2 = C610800NxW.LIZJ.LIZ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (strValueOf != null) {
                                linkedHashMap.put("priority", strValueOf);
                            }
                            snapshotEntry = new SnapshotEntry(listSingletonList2, str2, linkedHashMap);
                            if (snapshotEntry != null) {
                                arrayList2.add(snapshotEntry);
                            }
                        }
                    }
                    i = 3;
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("provide: count limit = ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", candidates size = ");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(", entries size = ");
                sbLIZ.append(arrayList2.size());
                C1720106oR.LJI("InboxSkylightSnapshotEntryProvider", C2188811AlT.LIZIZ(sbLIZ));
                if (arrayList2.isEmpty()) {
                    return null;
                }
                Object objLJJJLL = C13LP.LJJJLL(arrayList);
                if ((objLJJJLL instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) objLJJJLL) != null && storyInboxItem.isMe()) {
                    curUserId = AwemeExtKt.getAuthorUid(storyInboxItem.getStoryCollection());
                } else {
                    curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                }
                return new C610780NxU(curUserId, arrayList2);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final Map LJI() {
        return C1599110riP.LIZ().LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final boolean LJIIIIZZ() {
        C1599110riP.LIZ().LIZIZ();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final Object LIZJ() {
        return C1598680rhi.LIZ;
    }

    public static AvatarComponentView LJIIJ(View view) {
        if (view instanceof AvatarComponentView) {
            return (AvatarComponentView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AvatarComponentView avatarComponentViewLJIIJ = LJIIJ(viewGroup.getChildAt(i));
                if (avatarComponentViewLJIIJ != null) {
                    return avatarComponentViewLJIIJ;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final void LIZ(String str) {
        Object c098200Yq;
        C1600450rkZ c1600450rkZLLZZJLIL;
        LifecycleOwner lifecycleOwner;
        LinearLayoutManager linearLayoutManager;
        AbstractC21673719rz itemAnimator;
        Pair<Integer, Boolean> pair;
        try {
            C1598660rhg.LIZ.getClass();
            InterfaceC1598970riB interfaceC1598970riBLJFF = C1598660rhg.LJFF();
            if (interfaceC1598970riBLJFF != null && (c1600450rkZLLZZJLIL = interfaceC1598970riBLJFF.LLZZJLIL()) != null) {
                Object context = c1600450rkZLLZZJLIL.getContext();
                Integer first = null;
                if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null) {
                    C291001Au<Pair<Integer, Boolean>> lifecycleFreeScrollPosition = ((InboxSkylightListState) C1598660rhg.LJII(lifecycleOwner).getState()).getLifecycleFreeScrollPosition();
                    if (lifecycleFreeScrollPosition != null && (pair = lifecycleFreeScrollPosition.LIZ) != null) {
                        first = pair.getFirst();
                    }
                    RecyclerView.LayoutManager layoutManager = c1600450rkZLLZZJLIL.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        int iLJIIIIZZ = c1600450rkZLLZZJLIL.getState().LJIIIIZZ();
                        if (first != null && first.intValue() >= 0 && first.intValue() < iLJIIIIZZ) {
                            if (!c1600450rkZLLZZJLIL.isComputingLayout() && (itemAnimator = c1600450rkZLLZZJLIL.getItemAnimator()) != null) {
                                itemAnimator.LJIIL();
                            }
                            linearLayoutManager.scrollToPositionWithOffset(first.intValue(), 0);
                            if (c1600450rkZLLZZJLIL.getWidth() > 0 && c1600450rkZLLZZJLIL.getHeight() > 0) {
                                c1600450rkZLLZZJLIL.measure(View.MeasureSpec.makeMeasureSpec(c1600450rkZLLZZJLIL.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1600450rkZLLZZJLIL.getHeight(), 1073741824));
                                c1600450rkZLLZZJLIL.layout(c1600450rkZLLZZJLIL.getLeft(), c1600450rkZLLZZJLIL.getTop(), c1600450rkZLLZZJLIL.getRight(), c1600450rkZLLZZJLIL.getBottom());
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final float[] LIZIZ(float[] fArr) {
        C1600450rkZ c1600450rkZLLZZJLIL;
        List<InterfaceC1891350zJl> listLJII;
        int i;
        int size;
        int width;
        C1598660rhg.LIZ.getClass();
        InterfaceC1598970riB interfaceC1598970riBLJFF = C1598660rhg.LJFF();
        if (interfaceC1598970riBLJFF != null && (c1600450rkZLLZZJLIL = interfaceC1598970riBLJFF.LLZZJLIL()) != null) {
            C20600815jK<InterfaceC1891350zJl> state = c1600450rkZLLZZJLIL.getState();
            if (state != null) {
                listLJII = state.LJII();
            } else {
                listLJII = null;
            }
            if (listLJII != null && (size = listLJII.size()) >= 0) {
                i = 0;
                for (int i2 = 0; !(ListProtector.get(listLJII, i2) instanceof StoryInboxItem); i2++) {
                    View childAt = c1600450rkZLLZZJLIL.getChildAt(i2);
                    if (childAt != null) {
                        width = childAt.getWidth();
                    } else {
                        width = 0;
                    }
                    i += width;
                    if (i2 == size) {
                        break;
                    }
                }
            } else {
                i = 0;
            }
            return new float[]{fArr[0] + i, fArr[1]};
        }
        return fArr;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final InterfaceC1600130rk3 LIZLLL(LifecycleOwner lifecycleOwner) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(215);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkylightListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(188);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        return (SkylightListViewModel) new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS264S0000000_24, null, null, null).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C786940Utw LJII(java.lang.String r9) {
        /*
            r8 = this;
            X.0rhg r0 = X.C1598660rhg.LIZ
            r0.getClass()
            X.0riB r0 = X.C1598660rhg.LJFF()
            r5 = 0
            if (r0 == 0) goto Lc3
            X.0rkZ r4 = r0.LLZZJLIL()
            if (r4 == 0) goto Lc3
            int r3 = r4.getChildCount()     // Catch: java.lang.Throwable -> Lad
            r7 = 0
            r2 = 0
        L18:
            if (r2 >= r3) goto La2
            android.view.View r6 = r4.getChildAt(r2)     // Catch: java.lang.Throwable -> Lad
            if (r6 == 0) goto L7c
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r4.getChildViewHolder(r6)     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r1 instanceof com.bytedance.ies.powerlist.PowerCell     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7c
            com.bytedance.ies.powerlist.PowerCell r1 = (com.bytedance.ies.powerlist.PowerCell) r1     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L7c
            X.0zJl r1 = r1.getItem()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.story.inbox.StoryInboxItem     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r1 = (com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) r1     // Catch: java.lang.Throwable -> Lad
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getStoryCollection()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7c
            java.lang.String r0 = X.C729510SjV.LJIIIZ(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L57
            goto L7c
        L43:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem r1 = (com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem) r1     // Catch: java.lang.Throwable -> Lad
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getHighlightCollection()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.getAid()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L57
        L55:
            java.lang.String r0 = ""
        L57:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r0 = LJIIJ(r6)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7c
            X.0Gpo r4 = r0.getAvatar()     // Catch: java.lang.Throwable -> Lad
            android.view.View r3 = r0.getRealAvatarView()     // Catch: java.lang.Throwable -> Lad
            if (r3 != 0) goto L71
            X.0Gpo r3 = r0.getAvatar()     // Catch: java.lang.Throwable -> Lad
        L71:
            boolean r0 = r6 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto La0
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Throwable -> Lad
            int r1 = r6.getChildCount()     // Catch: java.lang.Throwable -> Lad
            goto L7f
        L7c:
            int r2 = r2 + 1
            goto L18
        L7f:
            if (r7 >= r1) goto La0
            android.view.View r2 = r6.getChildAt(r7)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L9d
            boolean r0 = r2 instanceof X.InterfaceC1256280inS     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L9d
            int r0 = r2.getVisibility()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L9d
            int r0 = r2.getWidth()     // Catch: java.lang.Throwable -> Lad
            if (r0 <= 0) goto L9d
            int r0 = r2.getHeight()     // Catch: java.lang.Throwable -> Lad
            if (r0 > 0) goto La4
        L9d:
            int r7 = r7 + 1
            goto L7f
        La0:
            r2 = r5
            goto La4
        La2:
            r1 = r5
            goto La9
        La4:
            X.0Utw r1 = new X.0Utw     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> Lad
        La9:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> Lad
            goto Lb9
        Lad:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        Lb9:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Lc0
            r5 = r1
        Lc0:
            X.0Utw r5 = (X.C786940Utw) r5
            return r5
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightService.LJII(java.lang.String):X.0Utw");
    }
}
