package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C127K;
import X.C1389890mGx;
import X.C20684815ws;
import X.EnumC20581215gA;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS43S1400000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S1400000_31 awS43S1400000_31) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", awS43S1400000_31.s0);
        c0lab.LJFF("is_enabled", ((C127K) awS43S1400000_31.l1).getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        c0lab.LJ("option_value", String.valueOf(((EnumC20581215gA) awS43S1400000_31.l2).getValue()));
        c0lab.LJ("to_value", String.valueOf(((EnumC20581215gA) awS43S1400000_31.l2).getValue()));
        c0lab.LJ("from_value", String.valueOf(((StoryThoughtAvatarCreationFragment) awS43S1400000_31.l3).WR().LLJLLL.getValue().getValue()));
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", c0lab.LIZ);
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) awS43S1400000_31.l4;
        if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.resType == 25) {
            C1389890mGx c1389890mGx = new C1389890mGx((StoryThoughtAvatarCreationFragment) awS43S1400000_31.l3);
            c1389890mGx.LJIIIZ(2131826725);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S1400000_31 awS43S1400000_31) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", awS43S1400000_31.s0);
        c0lab.LJFF("is_enabled", ((C127K) awS43S1400000_31.l1).getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        c0lab.LJ("option_value", String.valueOf(((EnumC20581215gA) awS43S1400000_31.l2).getValue()));
        c0lab.LJ("to_value", String.valueOf(((EnumC20581215gA) awS43S1400000_31.l2).getValue()));
        c0lab.LJ("from_value", String.valueOf(((StoryThoughtCreationFragment) awS43S1400000_31.l3).SR().LLJJJJLIIL.getValue().getValue()));
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", c0lab.LIZ);
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) awS43S1400000_31.l4;
        if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.resType == 25) {
            C1389890mGx c1389890mGx = new C1389890mGx((StoryThoughtCreationFragment) awS43S1400000_31.l3);
            c1389890mGx.LJIIIZ(2131826725);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1400000_31(String str, C127K c127k, EnumC20581215gA enumC20581215gA, StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, PrivacySettingsRestrictionOption privacySettingsRestrictionOption, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c127k;
        this.l2 = enumC20581215gA;
        this.l3 = storyThoughtAvatarCreationFragment;
        this.l4 = privacySettingsRestrictionOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1400000_31(String str, C127K c127k, EnumC20581215gA enumC20581215gA, StoryThoughtCreationFragment storyThoughtCreationFragment, PrivacySettingsRestrictionOption privacySettingsRestrictionOption, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c127k;
        this.l2 = enumC20581215gA;
        this.l3 = storyThoughtCreationFragment;
        this.l4 = privacySettingsRestrictionOption;
    }
}
