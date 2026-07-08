package kotlin.jvm.internal;

import X.C09AY;
import X.C1393190mMH;
import X.C1483410ohn;
import X.C1575830r6r;
import X.C1587170rP9;
import X.C1594780rbQ;
import X.C1595180rc4;
import X.C1595530rcd;
import X.C1595550rcf;
import X.C291001Au;
import X.InterfaceC1588310rQz;
import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS107S1200000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS107S1200000_24 awS107S1200000_24, Object obj) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS107S1200000_24.l1;
        Map map = (Map) awS107S1200000_24.l2;
        String str = awS107S1200000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393190mMH c1393190mMHLJI = SkylightCellLongClickAbilityImpl.LJI(str, map);
        c1587170rP9.getClass();
        C1587170rP9.LJIIJ("cancel", c1393190mMHLJI);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS107S1200000_24 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r4 = (com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection) r4
            java.lang.Object r1 = r3.l1
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r1 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r1
            java.lang.String r0 = r3.s0
            boolean r0 = r1.C6(r0)
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r0 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r0
            r0.LLJZ = r4
            boolean r0 = r0.z6()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r0 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r0
            X.0zJl r0 = r0.getItem()
            com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r0 = (com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) r0
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
        L2a:
            boolean r0 = X.C10EU.LJIILJJIL(r0)
            if (r0 == 0) goto L42
            java.lang.Object r2 = r3.l1
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r2 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r2
            java.lang.Object r1 = r3.l2
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r2.LLJZ
            r2.n7(r1, r0)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            r0 = 0
            goto L2a
        L42:
            java.lang.Object r2 = r3.l1
            com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell r2 = (com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell) r2
            java.lang.Object r1 = r3.l2
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r2.LLJZ
            r2.n7(r1, r0)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS107S1200000_24.invoke$1(kotlin.jvm.internal.AwS107S1200000_24, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS107S1200000_24 awS107S1200000_24, Object obj) {
        String aid;
        VideoUrlModel videoUrlModelLJJIII;
        String sourceId;
        Surface surface = (Surface) obj;
        if (surface.isValid()) {
            Aweme aweme = ((InterfaceC1588310rQz) awS107S1200000_24.l1).getAweme();
            C1483410ohn c1483410ohnXc = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, awS107S1200000_24.s0)) {
                FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) ((FriendsV3FeedListAssem) awS107S1200000_24.l2).LLJJI.getValue();
                if (friendsV3PlayerAbility != null) {
                    c1483410ohnXc = friendsV3PlayerAbility.xc();
                }
                if ((c1483410ohnXc instanceof C1483410ohn) && c1483410ohnXc != null && ((videoUrlModelLJJIII = c1483410ohnXc.LJJIII()) == null || (sourceId = videoUrlModelLJJIII.getSourceId()) == null || Intrinsics.LJFF(sourceId, awS107S1200000_24.s0))) {
                    c1483410ohnXc.setSurface(surface);
                    if (!c1483410ohnXc.isPlaying()) {
                        c1483410ohnXc.LJIILLIIL();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS107S1200000_24 awS107S1200000_24, Object obj) {
        return C1575830r6r.LIZ((C1575830r6r) obj, new C291001Au(new C1594780rbQ(awS107S1200000_24.s0, (C1595180rc4) awS107S1200000_24.l1, (InsertStory) awS107S1200000_24.l2)), false, null, null, false, null, false, 126);
    }

    public static final Object invoke$4(AwS107S1200000_24 awS107S1200000_24, Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = false;
        C1595530rcd c1595530rcdLIZ = C1595530rcd.LIZ((C1595530rcd) obj, null, awS107S1200000_24.s0, false, false, false, 0, 0, null, (C1595550rcf) awS107S1200000_24.l1, 0, null, 3709);
        C1595550rcf c1595550rcf = (C1595550rcf) awS107S1200000_24.l1;
        StoryToolBarIconViewModel storyToolBarIconViewModel = (StoryToolBarIconViewModel) awS107S1200000_24.l2;
        boolean zLIZ = c1595550rcf.LIZ(2);
        boolean zLIZ2 = c1595550rcf.LIZ(0);
        c1595550rcf.LIZ(4);
        Boolean bool = storyToolBarIconViewModel.LLILLJJLI.get(storyToolBarIconViewModel.getState().LLILLJJLI);
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        if (zLIZ && !zLJFF) {
            z4 = true;
        }
        if (zLIZ2 && zLJFF) {
            z = true;
        } else {
            z = false;
        }
        if (zLIZ && zLJFF) {
            storyToolBarIconViewModel.setState(new AwS41S0310000_24(storyToolBarIconViewModel, c1595530rcdLIZ, (Boolean) null, true, 1));
        } else {
            if (!z4 && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (z4 || z) {
                z3 = true;
            }
            storyToolBarIconViewModel.setState(new AwS41S0310000_24(storyToolBarIconViewModel, c1595530rcdLIZ, boolValueOf, z3, 1));
        }
        if (zLIZ) {
            storyToolBarIconViewModel.LLILLJJLI.put(storyToolBarIconViewModel.getState().LLILLJJLI, bool2);
        }
        return c1595530rcdLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S1200000_24(InterfaceC1588310rQz interfaceC1588310rQz, String str, FriendsV3FeedListAssem friendsV3FeedListAssem, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1588310rQz;
        this.s0 = str;
        this.l2 = friendsV3FeedListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S1200000_24(SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl, SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2, Map<String, String> map, String str) {
        super(1);
        this.$t = str;
        this.l1 = skylightCellLongClickAbilityImpl;
        this.l2 = skylightCellLongClickAbilityImpl2;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S1200000_24(StoryInboxCell storyInboxCell, String str, User user, int i) {
        super(1);
        this.$t = i;
        this.l1 = storyInboxCell;
        this.s0 = str;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S1200000_24(String str, C1595180rc4 c1595180rc4, InsertStory insertStory, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1595180rc4;
        this.l2 = insertStory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S1200000_24(String str, C1595550rcf c1595550rcf, StoryToolBarIconViewModel storyToolBarIconViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1595550rcf;
        this.l2 = storyToolBarIconViewModel;
    }
}
