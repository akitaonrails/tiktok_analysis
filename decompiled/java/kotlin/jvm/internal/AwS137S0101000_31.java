package kotlin.jvm.internal;

import X.C09AY;
import X.C0JBW;
import X.C0SZ5;
import X.C13LE;
import X.C15M3;
import X.C15TX;
import X.C1662170tM7;
import X.C20359414lU;
import X.C20441214yg;
import X.C20480615Ca;
import X.C20544115aB;
import X.C20600815jK;
import X.C20613615lO;
import X.C20614415lW;
import X.C20614615lY;
import X.C20632315oP;
import X.C2188811AlT;
import X.C291001Au;
import X.C317910CdB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C951190arN;
import X.InterfaceC636270OxV;
import X.InterfaceC636340Oxc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialogV2;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS137S0101000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C0SZ5 c0sz5 = (C0SZ5) obj;
        c0sz5.LL = C13LE.LIZ(CommonHorizontalContainerAssem.class);
        c0sz5.LLIZLLLIL = awS137S0101000_31.i1;
        c0sz5.LLJILJIL = (CommonHorizontalContainerAssem) awS137S0101000_31.l0;
        c0sz5.LLILLJJLI = C20613615lO.LIZ("profile_bio");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C0SZ5 c0sz5 = (C0SZ5) obj;
        c0sz5.LL = C13LE.LIZ(CommonHorizontalContainerAssem.class);
        c0sz5.LLIZLLLIL = awS137S0101000_31.i1;
        c0sz5.LLJILJIL = (CommonHorizontalContainerAssem) awS137S0101000_31.l0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        int itemCount;
        C20632315oP c20632315oP;
        int i = awS137S0101000_31.i1;
        C951190arN c951190arN = ((PlaybookEditorCoverDialogV2) awS137S0101000_31.l0).LLLJ;
        if (c951190arN != null) {
            itemCount = c951190arN.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i <= itemCount && (c20632315oP = ((PlaybookEditorCoverDialogV2) awS137S0101000_31.l0).LLLIIIL) != null) {
            c20632315oP.setCurrentItem(awS137S0101000_31.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        ((C15TX) awS137S0101000_31.l0).LIZJ(awS137S0101000_31.i1, (ExploreAwemeList) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        ((C15TX) awS137S0101000_31.l0).LIZJ(awS137S0101000_31.i1, (ExploreAwemeList) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = (MusicDownloadPlayHelper) obj;
        musicDownloadPlayHelper.LLJILJIL = awS137S0101000_31.i1;
        if (Intrinsics.LJFF(((C15M3) awS137S0101000_31.l0).LLILZIL, "collection_music")) {
            musicDownloadPlayHelper.LLJI = "music_collection";
            musicDownloadPlayHelper.LLJIJIL = new MusicCategory("favorite_song", "");
        }
        if (C1662170tM7.LIZ().isEnable) {
            musicDownloadPlayHelper.LLJJIII = C1662170tM7.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (awS137S0101000_31.i1 == ((C20480615Ca) awS137S0101000_31.l0).LLJILJIL.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        C20480615Ca c20480615Ca = (C20480615Ca) awS137S0101000_31.l0;
        if (c20480615Ca.LLJJJJJIL) {
            c20480615Ca.LLJJJJJIL = false;
            if (z) {
                c20480615Ca.LLJJJJLIIL = true;
                c20480615Ca.e0();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("suppressed once, last page natural=");
                sbLIZ.append(zBooleanValue);
                sbLIZ.append(" -> CTA applied");
                C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[complete] suppressed once, natural=");
                sbLIZ2.append(zBooleanValue);
                sbLIZ2.append(" page=");
                sbLIZ2.append(awS137S0101000_31.i1);
                sbLIZ2.append(" -> skip auto advance");
                C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else if (zBooleanValue) {
            if (z) {
                c20480615Ca.LLJJJJLIIL = true;
                c20480615Ca.e0();
            } else {
                c20480615Ca.f();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[event] fragmentAnimationsCompleted -> auto advance, index=");
                sbLIZ3.append(awS137S0101000_31.i1);
                C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[complete] fragmentComplete natural=false page=");
            sbLIZ4.append(awS137S0101000_31.i1);
            sbLIZ4.append(" isLast=");
            sbLIZ4.append(z);
            sbLIZ4.append(" -> apply CTA if last");
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ4));
            if (z) {
                C20480615Ca c20480615Ca2 = (C20480615Ca) awS137S0101000_31.l0;
                c20480615Ca2.LLJJJJLIIL = true;
                c20480615Ca2.e0();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        InterfaceC636340Oxc interfaceC636340Oxc = (InterfaceC636340Oxc) obj;
        AssemListViewModel assemListViewModel = (AssemListViewModel) awS137S0101000_31.l0;
        C20600815jK<ITEM> c20600815jK = assemListViewModel.state;
        if (c20600815jK != 0) {
            C20600815jK.LJIILIIL(c20600815jK, awS137S0101000_31.i1);
            assemListViewModel.modifyListState(interfaceC636340Oxc, c20600815jK);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        ((AssemSingleListViewModel) awS137S0101000_31.l0).modifyListState((InterfaceC636270OxV) obj, new AwS18S0001000_3(awS137S0101000_31.i1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C0SZ5 c0sz5 = (C0SZ5) obj;
        c0sz5.LL = C13LE.LIZ(CommonHorizontalContainerAssem.class);
        c0sz5.LLIZLLLIL = awS137S0101000_31.i1;
        c0sz5.LLJILJIL = (CommonHorizontalContainerAssem) awS137S0101000_31.l0;
        c0sz5.LLILLJJLI = C20613615lO.LIZ("text_caption");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C20544115aB c20544115aB = (C20544115aB) awS137S0101000_31.l0;
        int i = awS137S0101000_31.i1;
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(999);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LJFF = Integer.valueOf(i);
        c384050F3z.LJII = C0JBW.LIZ(200, c20544115aB.getContext());
        c384050F3z.LJI = C0JBW.LIZ(40, c20544115aB.getContext());
        c20544115aB.setMaxWidth(C0JBW.LIZ(278, c20544115aB.getContext()));
        c20544115aB.setBackground(c384050F3z.LIZ(((C20544115aB) awS137S0101000_31.l0).getContext()));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C20544115aB c20544115aB = (C20544115aB) awS137S0101000_31.l0;
        int i = awS137S0101000_31.i1;
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(999);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LJFF = Integer.valueOf(i);
        c384050F3z.LJII = C0JBW.LIZ(200, c20544115aB.getContext());
        c384050F3z.LJI = C0JBW.LIZ(40, c20544115aB.getContext());
        c20544115aB.setMaxWidth(C0JBW.LIZ(278, c20544115aB.getContext()));
        c20544115aB.setBackground(c384050F3z.LIZ(((C20544115aB) awS137S0101000_31.l0).getContext()));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        C317910CdB c317910CdB = ((StoryUserListContainerViewModel) awS137S0101000_31.l0).getState().LLILLJJLI.LIZ;
        return C20614415lW.LIZ((C20614415lW) obj, null, null, new C291001Au(new C20614615lY(awS137S0101000_31.i1)), null, null, false, 119);
    }

    public static final Object invoke$9(AwS137S0101000_31 awS137S0101000_31, Object obj) {
        boolean z;
        if (((C20359414lU) obj).LIZ == ((C20359414lU) ListProtector.get((List) awS137S0101000_31.l0, awS137S0101000_31.i1)).LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(int i, C20480615Ca c20480615Ca, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c20480615Ca;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(int i, C15M3 c15m3, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c15m3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(int i, C15TX c15tx, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c15tx;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(int i, PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV2, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = playbookEditorCoverDialogV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(int i, CommonHorizontalContainerAssem commonHorizontalContainerAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = commonHorizontalContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(C20544115aB c20544115aB, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c20544115aB;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0101000_31(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i) {
        super(1);
        this.$t = i;
        this.l0 = assemListViewModel;
        this.i1 = assemListViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0101000_31(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i) {
        super(1);
        this.$t = i;
        this.l0 = assemSingleListViewModel;
        this.i1 = assemSingleListViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0101000_31(StoryUserListContainerViewModel storyUserListContainerViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = storyUserListContainerViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0101000_31(List list, List<C20359414lU> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
