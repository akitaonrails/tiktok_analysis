package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C06US;
import X.C0LAB;
import X.C0PEM;
import X.C0XF1;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1836920xty;
import X.C20684815ws;
import X.C23250099c;
import X.C420501kJ;
import X.C490750JMj;
import X.C555390LqL;
import X.C631370Opb;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1519705xD;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailDeletedAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailFailureAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailTopBarAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveSheetService;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsBannerComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AkS75S0100000_2 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS75S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS75S0100000_2 akS75S0100000_2, View view) {
        Fragment fragmentLJI = C724240Sb0.LJI((VideoPlayerTopOverlayAssem) akS75S0100000_2.l0);
        if (fragmentLJI != null) {
            C490750JMj.LIZIZ(fragmentLJI);
        }
    }

    public static final void LIZ$1(AkS75S0100000_2 akS75S0100000_2, View view) {
        Fragment fragmentLJI = C724240Sb0.LJI((CourseDetailDeletedAssem) akS75S0100000_2.l0);
        if (fragmentLJI != null) {
            C490750JMj.LIZIZ(fragmentLJI);
        }
    }

    public static final void LIZ$2(AkS75S0100000_2 akS75S0100000_2, View view) {
        Context context = ((CourseDetailFailureAssem) akS75S0100000_2.l0).getContext();
        if (context != null) {
            AssemVMLazy assemVMLazy = ((CourseDetailFailureAssem) akS75S0100000_2.l0).LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CourseDetailFailureAssem.LLJJJ;
            ((PcsCourseDetailVM) assemVMLazy.getValue()).xQ2(context);
        }
    }

    public static final void LIZ$3(AkS75S0100000_2 akS75S0100000_2, View view) {
        Fragment fragmentLJI = C724240Sb0.LJI((CourseDetailTopBarAssem) akS75S0100000_2.l0);
        if (fragmentLJI != null) {
            C490750JMj.LIZIZ(fragmentLJI);
        }
    }

    public static final void LIZ$4(AkS75S0100000_2 akS75S0100000_2, View view) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        AssemVMLazy assemVMLazy = ((CourseDetailTopBarAssem) akS75S0100000_2.l0).LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CourseDetailTopBarAssem.LLJILJILJ;
        Long lValueOf3 = null;
        PcsCourseDetailVM.zQ2((PcsCourseDetailVM) assemVMLazy.getValue(), "click", "report", null, false, 12);
        CourseDetailTopBarAssem courseDetailTopBarAssem = (CourseDetailTopBarAssem) akS75S0100000_2.l0;
        courseDetailTopBarAssem.getClass();
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "video");
        C1836920xty c1836920xtyGo = courseDetailTopBarAssem.Go();
        Activity activityLIZ = null;
        if (c1836920xtyGo != null) {
            lValueOf3 = Long.valueOf(c1836920xtyGo.LL);
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("object_id", String.valueOf(lValueOf3));
        C1836920xty c1836920xtyGo2 = courseDetailTopBarAssem.Go();
        if (c1836920xtyGo2 != null) {
            lValueOf = Long.valueOf(c1836920xtyGo2.LLILLJJLI);
        } else {
            lValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("owner_id", String.valueOf(lValueOf));
        C1836920xty c1836920xtyGo3 = courseDetailTopBarAssem.Go();
        if (c1836920xtyGo3 != null) {
            lValueOf2 = Long.valueOf(c1836920xtyGo3.LL);
        } else {
            lValueOf2 = null;
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("group_id", String.valueOf(lValueOf2));
        C1836920xty c1836920xtyGo4 = courseDetailTopBarAssem.Go();
        if (c1836920xtyGo4 != null) {
            str = c1836920xtyGo4.LLILZLL;
        } else {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("enter_from", String.valueOf(str));
        IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
        Context context = courseDetailTopBarAssem.getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        }
        iReportServiceLJJ.LIZIZ(activityLIZ, builderAppendQueryParameter5);
    }

    public static final void LIZ$5(AkS75S0100000_2 akS75S0100000_2, View view) {
        ((C555390LqL) akS75S0100000_2.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$6(AkS75S0100000_2 akS75S0100000_2, View view) {
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        Context context;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((StoryHighlightsComponent) akS75S0100000_2.l0)).getAweme();
        if (aweme != null && (fragmentLJI = C724240Sb0.LJI((StoryHighlightsComponent) akS75S0100000_2.l0)) != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null && (context = ((StoryHighlightsComponent) akS75S0100000_2.l0).getContext()) != null) {
            InterfaceC1519705xD.LIZ.getClass();
            if (!C0XF1.LIZLLL(context)) {
                Fragment fragmentLJI2 = C724240Sb0.LJI((StoryHighlightsComponent) akS75S0100000_2.l0);
                if (fragmentLJI2 != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
                    c1389890mGx.LJIIIZ(2131829440);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMFp = ((StoryHighlightsComponent) akS75S0100000_2.l0).Fp();
            if (storyHighlightsImmersiveSheetVMFp != null) {
                String groupId = aweme.getGroupId();
                C06US c06us = C06US.LIZ;
                String str = storyHighlightsImmersiveSheetVMFp.LLJJJJJIL;
                boolean z = storyHighlightsImmersiveSheetVMFp.LLJJLIIIJLLLLLLLZ;
                if (groupId == null) {
                    groupId = "";
                }
                c06us.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", str);
                c0lab.LIZ(z ? 1 : 0, "is_new_user");
                c0lab.LJ("group_id", groupId);
                C20684815ws.LJIILLIIL("ttsocial_story_highlight_addvideo_btn_click", c0lab.LIZ);
            }
            IStoryHighlightsImmersiveSheetService iStoryHighlightsImmersiveSheetService = (IStoryHighlightsImmersiveSheetService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsImmersiveSheetService.class, false, false, false, 14, null);
            if (iStoryHighlightsImmersiveSheetService == null) {
                return;
            }
            iStoryHighlightsImmersiveSheetService.LIZ(aweme, childFragmentManager);
        }
    }

    public static final void LIZ$7(AkS75S0100000_2 akS75S0100000_2, View view) {
        LinearLayout linearLayout = ((HeaderStoryHighlightsBannerComponent) akS75S0100000_2.l0).LLJJL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        AssemVMLazy assemVMLazy = ((HeaderStoryHighlightsBannerComponent) akS75S0100000_2.l0).LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HeaderStoryHighlightsBannerComponent.LLJLIL;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(assemVMLazy.getValue()), C0PEM.LIZJ, null, new C420501kJ(null), 2);
    }
}
