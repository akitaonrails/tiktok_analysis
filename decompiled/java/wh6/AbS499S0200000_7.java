package wh6;

import X.AbstractC1387200mCc;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C06MM;
import X.C0JCG;
import X.C0JH3;
import X.C0JHC;
import X.C0K3J;
import X.C0K3Q;
import X.C0K3R;
import X.C1157140gDY;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C489110JGb;
import X.C489320JGw;
import X.C489550JHt;
import X.C492360JSo;
import X.C511080K2o;
import X.C511340K3o;
import X.C517750KSf;
import X.C517780KSi;
import X.C520040KaQ;
import X.InterfaceC1555100qZQ;
import X.InterfaceC489200JGk;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pcs.course.api.ui.IPcsCourseActivityAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseNavigationAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePinNoticeEditSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePinnedNoticeAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseVideoEditNavigationAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseNavigationAssemV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.fragment.AccessCriteriaPickerFragment;
import com.ss.android.ugc.aweme.publicgroup.view.IMWhoCanJoinCellAssem;
import com.ss.android.ugc.aweme.publicgroup.vm.IMWhoCanJoinVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AbS499S0200000_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS499S0200000_7 abS499S0200000_7, View view) {
        FragmentManager supportFragmentManager;
        if (view != null) {
            IMWhoCanJoinVM iMWhoCanJoinVMOp = ((IMWhoCanJoinCellAssem) abS499S0200000_7.l0).op();
            Context context = view.getContext();
            C1157140gDY c1157140gDY = (C1157140gDY) abS499S0200000_7.l1;
            iMWhoCanJoinVMOp.getClass();
            ArrayList arrayList = new ArrayList();
            List<GroupAccessCriteria> list = c1157140gDY.LL.accessCriteriaSetting;
            int i = 0;
            int i2 = 0;
            for (GroupAccessCriteria groupAccessCriteria : list) {
                int i3 = i2 + 1;
                String str = null;
                if (i2 >= 0) {
                    GroupAccessCriteria groupAccessCriteria2 = groupAccessCriteria;
                    GroupAccessCriteria groupAccessCriteria3 = c1157140gDY.LL.selectedAccessCriteria;
                    if (groupAccessCriteria3 != null) {
                        str = groupAccessCriteria3.key;
                    }
                    if (Intrinsics.LJFF(str, groupAccessCriteria2.key)) {
                        i = i2;
                    }
                    arrayList.add(groupAccessCriteria2.description);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C492360JSo c492360JSo = new C492360JSo();
            c492360JSo.LIZ = arrayList;
            c492360JSo.LIZIZ = new AwS227S0300000_18(iMWhoCanJoinVMOp, (IMWhoCanJoinVM) c1157140gDY, (C1157140gDY) list, (List<GroupAccessCriteria>) 39);
            c492360JSo.LIZJ = c1157140gDY.LL.selectionPanelTitle;
            c492360JSo.LIZLLL = context.getString(2131831398);
            c492360JSo.LJFF = 3;
            c492360JSo.LJ = 0;
            c492360JSo.LJI = i;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                AccessCriteriaPickerFragment accessCriteriaPickerFragment = new AccessCriteriaPickerFragment();
                accessCriteriaPickerFragment.LL = c492360JSo;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJLLL = false;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJJIJI = accessCriteriaPickerFragment;
                tuxSheet.show(supportFragmentManager, "AccessCriteriaDetailSelectionSheet");
            }
        }
    }

    public static final void LIZ$1(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            ((CourseVideoListCell) abS499S0200000_7.l0).LLILLL.getValue();
            PcsVideoPublishVM.wQ2(((InterfaceC489200JGk) abS499S0200000_7.l1).LJII());
            C489110JGb.LJIIJJI(((CourseVideoListCell) abS499S0200000_7.l0).L5(), (InterfaceC489200JGk) abS499S0200000_7.l1, "retry", "click");
        }
    }

    public static final void LIZ$10(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            Activity activityLIZ = C06MM.LIZ(((LiveIconView) abS499S0200000_7.l0).getContext());
            if (activityLIZ != null) {
                activityLIZ.onBackPressed();
            }
            PcsCourseVideoEditNavigationAssem pcsCourseVideoEditNavigationAssem = (PcsCourseVideoEditNavigationAssem) abS499S0200000_7.l1;
            if (pcsCourseVideoEditNavigationAssem.LLJJIII == null) {
                C0JHC c0jhc = null;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    c0jhc = (C0JHC) interfaceC1555100qZQLIZIZ.getSource();
                }
                pcsCourseVideoEditNavigationAssem.LLJJIII = c0jhc;
            }
            C489110JGb.LJIILJJIL(pcsCourseVideoEditNavigationAssem.LLJJIII, C489320JGw.LIZ(((C489550JHt) ((PcsCourseVideoEditNavigationAssem) abS499S0200000_7.l1).LLJJI.getValue().getState()).LLILZIL), "close", "click");
        }
    }

    public static final void LIZ$11(AbS499S0200000_7 abS499S0200000_7, View view) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        FragmentManager fragmentManagerLJ;
        if (view != null) {
            View view2 = (View) abS499S0200000_7.l0;
            if (view2 != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view2)) != null && (fragmentManagerLJ = abstractC1387200mCcLIZ.LJ()) != null) {
                new PcsCoursePinNoticeEditSheet().show(fragmentManagerLJ, "pcs_course_pin_notice_edit_sheet");
            }
            C489110JGb.LJ(((PcsCoursePinnedNoticeAssem) abS499S0200000_7.l1).hp(), "click");
        }
    }

    public static final void LIZ$12(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null && ((InterfaceC489200JGk) abS499S0200000_7.l0).LJIIIIZZ().isUploaded()) {
            C0JHC c0jhcZQ2 = null;
            IPcsCourseActivityAbility iPcsCourseActivityAbility = (IPcsCourseActivityAbility) C1558520qew.LIZ(GScope.LL, IPcsCourseActivityAbility.class, null);
            if (iPcsCourseActivityAbility != null) {
                iPcsCourseActivityAbility.O52(((InterfaceC489200JGk) abS499S0200000_7.l0).LJ(true), (InterfaceC489200JGk) abS499S0200000_7.l0);
            }
            PcsCourseManageVM pcsCourseManageVM = ((C0JH3) abS499S0200000_7.l1).LLILLL;
            if (pcsCourseManageVM != null) {
                c0jhcZQ2 = pcsCourseManageVM.zQ2();
            }
            C489110JGb.LJIIJJI(c0jhcZQ2, (InterfaceC489200JGk) abS499S0200000_7.l0, "cover", "click");
        }
    }

    public static final void LIZ$13(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            Activity activityLIZ = C06MM.LIZ(((LiveIconView) abS499S0200000_7.l0).getContext());
            if (activityLIZ != null) {
                activityLIZ.onBackPressed();
            }
            PcsCourseNavigationAssemV2 pcsCourseNavigationAssemV2 = (PcsCourseNavigationAssemV2) abS499S0200000_7.l1;
            if (pcsCourseNavigationAssemV2.LLJJIII == null) {
                C0JHC c0jhc = null;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    c0jhc = (C0JHC) interfaceC1555100qZQLIZIZ.getSource();
                }
                pcsCourseNavigationAssemV2.LLJJIII = c0jhc;
            }
            C489110JGb.LIZLLL(pcsCourseNavigationAssemV2.LLJJIII, (PcsCourseManageVM) ((PcsCourseNavigationAssemV2) abS499S0200000_7.l1).LLJJI.getValue(), "return", "click");
        }
    }

    public static final void LIZ$14(AbS499S0200000_7 abS499S0200000_7, View view) {
        SpacePost spacePost;
        if (view != null && (spacePost = ((C0K3J) abS499S0200000_7.l0).LIZIZ) != null && !spacePost.previewMode) {
            ((C511080K2o) abS499S0200000_7.l1).LLILLJJLI.BQ2(spacePost);
        }
    }

    public static final void LIZ$15(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SpacePost spacePost = (SpacePost) abS499S0200000_7.l0;
            if (!spacePost.previewMode) {
                SubSpaceFeedVM subSpaceFeedVM = ((C511340K3o) abS499S0200000_7.l1).LLILLJJLI;
                subSpaceFeedVM.LLILZLL = spacePost;
                subSpaceFeedVM.setState(new AwS586S0100000_7(spacePost, 488));
            }
        }
    }

    public static final void LIZ$2(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            TreasureBoxDialog treasureBoxDialog = (TreasureBoxDialog) abS499S0200000_7.l0;
            treasureBoxDialog.yS((C517780KSi) abS499S0200000_7.l1, treasureBoxDialog.LLLI);
        }
    }

    public static final void LIZ$3(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            ((TreasureBoxDialog) abS499S0200000_7.l0).zS((C517750KSf) abS499S0200000_7.l1);
        }
    }

    public static final void LIZ$4(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SubSpaceEditorVM subSpaceEditorVM = ((C0JCG) abS499S0200000_7.l0).LLILLJJLI;
            User user = (User) abS499S0200000_7.l1;
            subSpaceEditorVM.getClass();
            subSpaceEditorVM.setState(new AwS586S0100000_7(user, 401));
        }
    }

    public static final void LIZ$5(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SubSpaceDetailVM subSpaceDetailVM = ((C0K3R) abS499S0200000_7.l0).LLILLJJLI;
            C0K3J c0k3j = (C0K3J) abS499S0200000_7.l1;
            subSpaceDetailVM.getClass();
            subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 389));
        }
    }

    public static final void LIZ$6(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SubSpaceDetailVM subSpaceDetailVM = ((C0K3R) abS499S0200000_7.l0).LLILLJJLI;
            C0K3J c0k3j = (C0K3J) abS499S0200000_7.l1;
            subSpaceDetailVM.getClass();
            subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 389));
        }
    }

    public static final void LIZ$7(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SubSpaceDetailVM subSpaceDetailVM = ((C0K3Q) abS499S0200000_7.l0).LLILLJJLI;
            C0K3J c0k3j = (C0K3J) abS499S0200000_7.l1;
            subSpaceDetailVM.getClass();
            subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 389));
        }
    }

    public static final void LIZ$8(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            SubSpaceDetailVM subSpaceDetailVM = ((C0K3Q) abS499S0200000_7.l0).LLILLJJLI;
            C0K3J c0k3j = (C0K3J) abS499S0200000_7.l1;
            subSpaceDetailVM.getClass();
            subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 389));
        }
    }

    public static final void LIZ$9(AbS499S0200000_7 abS499S0200000_7, View view) {
        if (view != null) {
            Activity activityLIZ = C06MM.LIZ(((LiveIconView) abS499S0200000_7.l0).getContext());
            if (activityLIZ != null) {
                activityLIZ.onBackPressed();
            }
            PcsCourseNavigationAssem pcsCourseNavigationAssem = (PcsCourseNavigationAssem) abS499S0200000_7.l1;
            if (pcsCourseNavigationAssem.LLJJIII == null) {
                C0JHC c0jhc = null;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    c0jhc = (C0JHC) interfaceC1555100qZQLIZIZ.getSource();
                }
                pcsCourseNavigationAssem.LLJJIII = c0jhc;
            }
            C489110JGb.LIZLLL(pcsCourseNavigationAssem.LLJJIII, (PcsCourseManageVM) ((PcsCourseNavigationAssem) abS499S0200000_7.l1).LLJJI.getValue(), "return", "click");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS499S0200000_7(LiveIconView liveIconView, PcsCourseVideoEditNavigationAssem pcsCourseVideoEditNavigationAssem, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = liveIconView;
        this.l1 = pcsCourseVideoEditNavigationAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS499S0200000_7(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
