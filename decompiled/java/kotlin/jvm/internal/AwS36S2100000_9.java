package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0W17;
import X.C0XF1;
import X.C1223430hwT;
import X.C1361330lWt;
import X.C1389890mGx;
import X.C1401320mZO;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C614360O7u;
import X.C618370ONf;
import X.C618380ONg;
import X.C628510Okz;
import X.C628860OlY;
import X.C628920Ole;
import X.C729510SjV;
import X.C844470XAv;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS36S2100000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((FavoriteButtonAssem) awS36S2100000_9.l2).lp().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
            ((FavoriteButtonAssem) awS36S2100000_9.l2).lp().setText(awS36S2100000_9.s0);
        } else {
            ((FavoriteButtonAssem) awS36S2100000_9.l2).lp().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
            ((FavoriteButtonAssem) awS36S2100000_9.l2).lp().setText(awS36S2100000_9.s1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        String aid;
        Aweme aweme;
        List<C628920Ole> listEQ2 = ((VibeFeedDiggDetailListVM) awS36S2100000_9.l2).zQ2((C628860OlY) obj);
        String str = awS36S2100000_9.s0;
        VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM = (VibeFeedDiggDetailListVM) awS36S2100000_9.l2;
        String str2 = awS36S2100000_9.s1;
        for (C628920Ole c628920Ole : listEQ2) {
            VibeFeedItem vibeFeedItem = c628920Ole.LLILLL;
            if (vibeFeedItem != null && (aweme = vibeFeedItem.aweme) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, str)) {
                List<String> list = c628920Ole.LLILLL.likedUids;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!Intrinsics.LJFF(obj2, str2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.size() > 1) {
                        break;
                    }
                }
                if (vibeFeedDiggDetailListVM.vQ2(str) >= 0) {
                    vibeFeedDiggDetailListVM.LLIZLLLIL--;
                    vibeFeedDiggDetailListVM.setState(new AwS588S0100000_9(vibeFeedDiggDetailListVM, 417));
                    if (vibeFeedDiggDetailListVM.LLIZLLLIL == 0) {
                        vibeFeedDiggDetailListVM.listClear();
                    }
                } else {
                    vibeFeedDiggDetailListVM.listClear();
                    vibeFeedDiggDetailListVM.setState(AFwS240S0000000_9.get$arr$(676));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((BulletinBoardEditViewModel) awS36S2100000_9.l2), C0PEM.LIZJ, null, new C618370ONf((C618380ONg) obj, (BulletinBoardEditViewModel) awS36S2100000_9.l2, awS36S2100000_9.s0, awS36S2100000_9.s1, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS36S2100000_9 r6, java.lang.Object r7) {
        /*
            X.0OEF r7 = (X.C0OEF) r7
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Object r4 = r6.l2
            com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem r4 = (com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem) r4
            java.lang.String r5 = r6.s0
            java.lang.String r3 = r6.s1
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility r0 = (com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility) r0
            r1 = 0
            if (r0 == 0) goto L22
            X.0OD0 r0 = r0.D30()
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.LIZJ
        L22:
            java.lang.String r0 = "enter_from"
            X.C817250W4d.LIZ(r0, r1, r2)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r5)
            java.lang.String r0 = "category_name"
            r2.put(r0, r3)
            X.0y8i r0 = r4.ip()
            r3 = 0
            X.0y8W r0 = r0.LJII(r3)
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r0.LIZ
            boolean r0 = r1 instanceof X.C0OEI
            if (r0 == 0) goto L7a
            X.0OEI r1 = (X.C0OEI) r1
            if (r1 == 0) goto L7a
            X.0OCk r0 = r1.LLILZ
            int r0 = r0.LIZIZ
        L4a:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "added_topic_cnt"
            r2.put(r0, r1)
            boolean r0 = r7.LL
            if (r0 == 0) goto L79
            X.0y8i r1 = r4.ip()
            r0 = 1
            X.0y8W r0 = r1.LJII(r0)
            if (r0 == 0) goto L70
            java.lang.Object r1 = r0.LIZ
            boolean r0 = r1 instanceof X.C0OEI
            if (r0 == 0) goto L70
            X.0OEI r1 = (X.C0OEI) r1
            if (r1 == 0) goto L70
            X.0OCk r0 = r1.LLILZ
            int r3 = r0.LIZIZ
        L70:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "to_add_topic_cnt"
            r2.put(r0, r1)
        L79:
            return r2
        L7a:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS36S2100000_9.invoke$3(kotlin.jvm.internal.AwS36S2100000_9, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        String uid;
        boolean z;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            String str = awS36S2100000_9.s0;
            String str2 = awS36S2100000_9.s1;
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                InterfaceC1361290lWp interfaceC1361290lWp2 = interfaceC1361290lWp;
                if (interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) {
                    InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) interfaceC1361290lWp2;
                    User userLLILLL = interfaceC1361270lWn.LLILLL();
                    if (userLLILLL != null) {
                        uid = userLLILLL.getUid();
                    } else {
                        uid = null;
                    }
                    if (Intrinsics.LJFF(uid, str) && Intrinsics.LJFF(interfaceC1361270lWn.getAweme().getAid(), str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                            arrayList.add(interfaceC1361290lWp);
                        }
                    } else if (!z) {
                        arrayList.add(interfaceC1361290lWp);
                    }
                } else if (!(interfaceC1361290lWp2 instanceof C1361330lWt) || z2) {
                    arrayList.add(interfaceC1361290lWp);
                }
            }
            if (arrayList.size() != list.size()) {
                C0W17.LIZJ("listVM", "removeItemByUidAndAid, ready to remove");
                ((FriendsV3FeedListViewModel) awS36S2100000_9.l2).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        String uid;
        boolean z;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            String str = awS36S2100000_9.s1;
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                InterfaceC1361290lWp interfaceC1361290lWp2 = interfaceC1361290lWp;
                if (interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) {
                    InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) interfaceC1361290lWp2;
                    User userLLILLL = interfaceC1361270lWn.LLILLL();
                    if (userLLILLL != null) {
                        uid = userLLILLL.getUid();
                    } else {
                        uid = null;
                    }
                    if (!Intrinsics.LJFF(uid, str) && !Intrinsics.LJFF(AwemeExtKt.getAuthorUid(interfaceC1361270lWn.getAweme()), str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                            arrayList.add(interfaceC1361290lWp);
                        }
                    } else if (!z) {
                        arrayList.add(interfaceC1361290lWp);
                    }
                } else if (!(interfaceC1361290lWp2 instanceof C1361330lWt) || z2) {
                    arrayList.add(interfaceC1361290lWp);
                }
            }
            if (arrayList.size() != list.size()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(awS36S2100000_9.s0);
                sbLIZ.append(", ready to remove");
                C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
                ((FriendsV3FeedListViewModel) awS36S2100000_9.l2).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        String uid;
        boolean z;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null && !list.isEmpty()) {
            String str = awS36S2100000_9.s1;
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                InterfaceC1361290lWp interfaceC1361290lWp2 = interfaceC1361290lWp;
                if (interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) {
                    InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) interfaceC1361290lWp2;
                    User userLLILLL = interfaceC1361270lWn.LLILLL();
                    if (userLLILLL != null) {
                        uid = userLLILLL.getUid();
                    } else {
                        uid = null;
                    }
                    if ((Intrinsics.LJFF(uid, str) || Intrinsics.LJFF(AwemeExtKt.getAuthorUid(interfaceC1361270lWn.getAweme()), str)) && (!C729510SjV.LJJIJIL(interfaceC1361270lWn.getAweme()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                            arrayList.add(interfaceC1361290lWp);
                        }
                    } else if (!z) {
                        arrayList.add(interfaceC1361290lWp);
                    }
                } else if (!(interfaceC1361290lWp2 instanceof C1361330lWt) || z2) {
                    arrayList.add(interfaceC1361290lWp);
                }
            }
            if (arrayList.size() != list.size()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(awS36S2100000_9.s0);
                sbLIZ.append(", ready to remove");
                C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
                ((FriendsV3FeedListViewModel) awS36S2100000_9.l2).listSetItems(arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS36S2100000_9 awS36S2100000_9, Object obj) {
        Long lValueOf;
        String str;
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            C1389890mGx c1389890mGx = new C1389890mGx((MusicDetailAwemeListFragment) awS36S2100000_9.l2);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        } else {
            MusicDetailAwemeListFragment musicDetailAwemeListFragment = (MusicDetailAwemeListFragment) awS36S2100000_9.l2;
            T t = musicDetailAwemeListFragment.LLILZ.LL;
            if (t instanceof C1401320mZO) {
                Music music = musicDetailAwemeListFragment.LLLIZZ;
                if (music != null) {
                    lValueOf = Long.valueOf(music.getId());
                } else {
                    lValueOf = null;
                }
                String strValueOf = String.valueOf(lValueOf);
                if (strValueOf.length() != 0 && (str = awS36S2100000_9.s0) != null && str.length() != 0) {
                    String str2 = ((MusicDetailAwemeListFragment) awS36S2100000_9.l2).LLILLL;
                    String str3 = awS36S2100000_9.s0;
                    String str4 = awS36S2100000_9.s1;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_method", str4);
                    c2344009Gk.LJIIIIZZ("music_id", str2);
                    c2344009Gk.LJIIIIZZ("old_group_id", "");
                    c2344009Gk.LJIIIIZZ("group_id", str3);
                    c2344009Gk.LJIIIIZZ("type", "remove");
                    C20684815ws.LJIILLIIL("success_featured_video", c2344009Gk.LIZ);
                    String str5 = awS36S2100000_9.s0;
                    C628510Okz c628510Okz = ((C1401320mZO) t).LLJILJIL;
                    c628510Okz.getClass();
                    if (str5 != null) {
                        C23250099c.LIZLLL((InterfaceC497601wk) c628510Okz.LIZJ.getValue(), null, null, new C614360O7u(strValueOf, str5, null), 3);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS36S2100000_9(java.lang.String r3, com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.s0 = r3
            r1.l2 = r4
            r1.s1 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l2 = r4
            r1.s0 = r3
            r1.s1 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS36S2100000_9.<init>(java.lang.String, com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2100000_9(BulletinBoardEditViewModel bulletinBoardEditViewModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = bulletinBoardEditViewModel;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2100000_9(MusicDetailAwemeListFragment musicDetailAwemeListFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = musicDetailAwemeListFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2100000_9(FavoriteButtonAssem favoriteButtonAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = favoriteButtonAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2100000_9(VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = vibeFeedDiggDetailListVM;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2100000_9(AddYoursMultiHubAssem addYoursMultiHubAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = addYoursMultiHubAssem;
        this.s0 = str;
        this.s1 = str2;
    }
}
