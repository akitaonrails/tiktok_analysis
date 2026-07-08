package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C127K;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C20526015Tm;
import X.C20530115Vb;
import X.C20684815ws;
import X.C438710HIf;
import X.EnumC1334360kpO;
import X.EnumC20581215gA;
import X.InterfaceC427850Gq7;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS92S1300000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS92S1300000_31 awS92S1300000_31) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", awS92S1300000_31.s0);
        c0lab.LJFF("is_enabled", ((C127K) awS92S1300000_31.l1).getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        c0lab.LJ("option_value", String.valueOf(((EnumC20581215gA) awS92S1300000_31.l2).getValue()));
        c0lab.LJ("to_value", String.valueOf(((EnumC20581215gA) awS92S1300000_31.l2).getValue()));
        c0lab.LJ("from_value", String.valueOf(((StoryThoughtAvatarCreationFragment) awS92S1300000_31.l3).WR().LLJLLL.getValue().getValue()));
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", c0lab.LIZ);
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment = (StoryThoughtAvatarCreationFragment) awS92S1300000_31.l3;
        storyThoughtAvatarCreationFragment.WR().LLJLLL.setValue((EnumC20581215gA) awS92S1300000_31.l2);
        TuxSheet tuxSheet = storyThoughtAvatarCreationFragment.LLJJIII;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AwS92S1300000_31 awS92S1300000_31) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", awS92S1300000_31.s0);
        c0lab.LJFF("is_enabled", ((C127K) awS92S1300000_31.l1).getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        c0lab.LJ("option_value", String.valueOf(((EnumC20581215gA) awS92S1300000_31.l2).getValue()));
        c0lab.LJ("to_value", String.valueOf(((EnumC20581215gA) awS92S1300000_31.l2).getValue()));
        c0lab.LJ("from_value", String.valueOf(((StoryThoughtCreationFragment) awS92S1300000_31.l3).SR().LLJJJJLIIL.getValue().getValue()));
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", c0lab.LIZ);
        StoryThoughtCreationFragment storyThoughtCreationFragment = (StoryThoughtCreationFragment) awS92S1300000_31.l3;
        storyThoughtCreationFragment.SR().LLJJJJLIIL.setValue((EnumC20581215gA) awS92S1300000_31.l2);
        TuxSheet tuxSheet = storyThoughtCreationFragment.LLJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS92S1300000_31 awS92S1300000_31) {
        String aid;
        Aweme aweme;
        C20526015Tm item = ((ExploreFeedCell) awS92S1300000_31.l1).getItem();
        if (item != null && (aweme = item.LL) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, awS92S1300000_31.s0)) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((User) awS92S1300000_31.l2).getAvatarThumb()));
            ExploreFeedCell exploreFeedCell = (ExploreFeedCell) awS92S1300000_31.l1;
            int i = exploreFeedCell.LLJJJJJIL;
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
            c1331670kl3LJIIIIZZ.LJIIIZ = i;
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.LOW;
            c1331670kl3LJIIIIZZ.LJJ(exploreFeedCell.d6());
            c1331670kl3LJIIIIZZ.LJIIJ((InterfaceC427850Gq7) awS92S1300000_31.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1300000_31(ExploreFeedCell exploreFeedCell, String str, User user, C20530115Vb c20530115Vb, int i) {
        super(0);
        this.$t = i;
        this.l1 = exploreFeedCell;
        this.s0 = str;
        this.l2 = user;
        this.l3 = c20530115Vb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1300000_31(String str, C127K c127k, EnumC20581215gA enumC20581215gA, StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c127k;
        this.l2 = enumC20581215gA;
        this.l3 = storyThoughtAvatarCreationFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1300000_31(String str, C127K c127k, EnumC20581215gA enumC20581215gA, StoryThoughtCreationFragment storyThoughtCreationFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c127k;
        this.l2 = enumC20581215gA;
        this.l3 = storyThoughtCreationFragment;
    }
}
