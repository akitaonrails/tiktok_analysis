package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step;

import X.AbstractC1823860xYu;
import X.AbstractC1823870xYv;
import X.C092O;
import X.C0JLW;
import X.C0KBP;
import X.C0TGC;
import X.C0WZX;
import X.C1103520ep4;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1143780fs0;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C1822320xWQ;
import X.C1824200xZS;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C19EG;
import X.C19EH;
import X.C19ME;
import X.C20247014Ke;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C389590FPh;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C521380Kca;
import X.C786410Ut5;
import X.InterfaceC517590KRp;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBBasicInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.chatroom.api.UpsellConsultationContent;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.BookingInfo;
import webcast.api.sub.DMInfo;
import webcast.api.sub.FormInfo;
import webcast.api.sub.PreviewDisplay;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.ServiceInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingResultFragment extends PcsOnboardingStepFragment<AbstractC1823870xYv> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzHELIOSw2OjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9OzEpOWEDKzYDJy08KTcoICE0GiA/PCMnDjctLiI2JjE=";
    public final int LLLIIIL = R.layout.gkt;
    public final boolean LLLIIL = true;
    public final boolean LLLIILIL = true;
    public final boolean LLLIL = true;
    public final String LLLILZ = "OnboardingResultPage";
    public final int LLLILZJ = 1310;
    public boolean LLLILZLLLI;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean uS() {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        int i;
        SMBOptInQualificationResponse.ResponseData responseDataEQ2;
        C500060JjI c500060JjI = new C500060JjI();
        if (JS().PQ2()) {
            i = (JS().MQ2() || Intrinsics.LJFF(JS().DQ2().getShowEntrance(), "endlive_page") || (responseDataEQ2 = JS().EQ2()) == null || responseDataEQ2.hasLivePermission != 1) ? 2131855898 : 2131855847;
        } else {
            PcsOnboardingVM pcsOnboardingVMJS = JS();
            i = (!pcsOnboardingVMJS.BQ2() || pcsOnboardingVMJS.yQ2() || pcsOnboardingVMJS.zQ2()) ? JS().NQ2() ? 2131855891 : JS().OQ2() ? 2131855894 : 2131855886 : 2131855896;
        }
        String string = getString(i);
        final PcsOnboardingVM pcsOnboardingVMJS2 = JS();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(string, R.style.a7k, new C092O() { // from class: X.0xYt
            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @Override // X.C092O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1823850xYt.accept(java.lang.Object):void");
            }
        })));
        return c500060JjI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void eT() {
        super.eT();
        if (this.LLLILZLLLI) {
            return;
        }
        this.LLLILZLLLI = true;
        jT("close");
        kT("close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingResultPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        XS("onDestroyView", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingResultPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean BS() {
        return this.LLLIILIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLILZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean HS() {
        return this.LLLIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final int zS() {
        return this.LLLIIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void initView(View view) {
        int i;
        String string;
        boolean z;
        C389590FPh c389590FPh;
        C389590FPh c389590FPh2;
        C20247014Ke c20247014Ke;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        super.initView(view);
        JS().SQ2();
        Context context = getContext();
        if (context != null) {
            C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
            PcsOnboardingVM pcsOnboardingVMJS = JS();
            SMBPreviewResponse.ResponseData responseData = new SMBPreviewResponse.ResponseData();
            responseData.displayHeaderDmBtn = !pcsOnboardingVMJS.AQ2();
            PreviewDisplay previewDisplay = new PreviewDisplay();
            if (pcsOnboardingVMJS.AQ2()) {
                previewDisplay.hasSuggestedQuestion = true;
            }
            if (pcsOnboardingVMJS.CQ2()) {
                previewDisplay.hasForm = true;
            }
            if (pcsOnboardingVMJS.yQ2()) {
                previewDisplay.hasBooking = true;
            }
            previewDisplay.activeSkuCount = 1L;
            responseData.displaySwitch = previewDisplay;
            if (pcsOnboardingVMJS.AQ2()) {
                DMInfo dMInfo = new DMInfo();
                ServiceInfo serviceInfo = new ServiceInfo();
                serviceInfo.title = context.getString(2131836437);
                dMInfo.serviceInfo = serviceInfo;
                dMInfo.skuId = 1L;
                dMInfo.suggestedQuestionList = new ArrayList();
                for (String str : pcsOnboardingVMJS.LLJILJILJ) {
                    List<UpsellConsultationContent> list = dMInfo.suggestedQuestionList;
                    UpsellConsultationContent upsellConsultationContent = new UpsellConsultationContent();
                    upsellConsultationContent.content = str;
                    list.add(upsellConsultationContent);
                }
                responseData.dmInfo = dMInfo;
            }
            if (pcsOnboardingVMJS.CQ2()) {
                FormInfo formInfo = new FormInfo();
                ServiceInfo serviceInfo2 = new ServiceInfo();
                serviceInfo2.title = context.getString(2131856152);
                formInfo.serviceInfo = serviceInfo2;
                formInfo.skuId = 2L;
                responseData.formInfo = formInfo;
                responseData.formInfoList = C1697810uHb.LJIILJJIL(formInfo);
            }
            if (pcsOnboardingVMJS.yQ2()) {
                BookingInfo bookingInfo = new BookingInfo();
                ServiceInfo serviceInfo3 = new ServiceInfo();
                serviceInfo3.title = context.getString(2131856151);
                bookingInfo.serviceInfo = serviceInfo3;
                bookingInfo.skuId = 3L;
                responseData.bookingInfoList = C1697810uHb.LJIILJJIL(bookingInfo);
            }
            if (pcsOnboardingVMJS.zQ2()) {
                SMBCourse sMBCourse = new SMBCourse();
                sMBCourse.courseId = 4L;
                ArrayList arrayList = new ArrayList();
                SMBCourseVideo sMBCourseVideo = new SMBCourseVideo();
                ContentAuditStatus contentAuditStatus = new ContentAuditStatus();
                contentAuditStatus.content = C1143780fs0.LJIIJ("tiktok_live_pcs_onboarding_preview", "ttlive_pcs_onboarding_img_course1.jpg");
                sMBCourseVideo.cover = contentAuditStatus;
                arrayList.add(sMBCourseVideo);
                SMBCourseVideo sMBCourseVideo2 = new SMBCourseVideo();
                ContentAuditStatus contentAuditStatus2 = new ContentAuditStatus();
                contentAuditStatus2.content = C1143780fs0.LJIIJ("tiktok_live_pcs_onboarding_preview", "ttlive_pcs_onboarding_img_course2.jpg");
                sMBCourseVideo2.cover = contentAuditStatus2;
                arrayList.add(sMBCourseVideo2);
                SMBCourseVideo sMBCourseVideo3 = new SMBCourseVideo();
                ContentAuditStatus contentAuditStatus3 = new ContentAuditStatus();
                contentAuditStatus3.content = C1143780fs0.LJIIJ("tiktok_live_pcs_onboarding_preview", "ttlive_pcs_onboarding_img_course3.jpg");
                sMBCourseVideo3.cover = contentAuditStatus3;
                arrayList.add(sMBCourseVideo3);
                sMBCourse.videoList = arrayList;
                responseData.courseList = C1697810uHb.LJIILJJIL(sMBCourse);
            }
            responseData.skuOrder = C1697810uHb.LJIILJJIL(1L, 2L, 3L, 4L);
            User user = new User();
            ImageModel imageModel = new ImageModel();
            imageModel.mUrls = Collections.singletonList(C0JLW.LIZJ(null));
            user.setAvatarThumb(imageModel);
            responseData.anchorData = user;
            SMBBasicInfo sMBBasicInfo = new SMBBasicInfo();
            ContentAuditStatus contentAuditStatus4 = new ContentAuditStatus();
            contentAuditStatus4.content = pcsOnboardingVMJS.LLJILJIL;
            sMBBasicInfo.desc = contentAuditStatus4;
            ContentAuditStatus contentAuditStatus5 = new ContentAuditStatus();
            contentAuditStatus5.content = "email";
            sMBBasicInfo.email = contentAuditStatus5;
            ContentAuditStatus contentAuditStatus6 = new ContentAuditStatus();
            contentAuditStatus6.content = "name";
            sMBBasicInfo.name = contentAuditStatus6;
            ContentAuditStatus contentAuditStatus7 = new ContentAuditStatus();
            contentAuditStatus7.content = "phone";
            sMBBasicInfo.phoneNum = contentAuditStatus7;
            responseData.anchorBasicInfo = sMBBasicInfo;
            c1103520ep4.LJFF("-1", "-1", new C1822320xWQ(responseData));
        }
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2LJIILL = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIILL(new C521380Kca("-1", "-1", "-1", true, true), C2097608Jq.LJ());
        if (pcsServiceBioFragmentV2LJIILL == null) {
            JS().LJJJJL();
            return;
        }
        C1835860xsG c1835860xsG = wS().LLJJJIL;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        AbstractC1823860xYu abstractC1823860xYu = c1835860xsG.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout2 = abstractC1823860xYu.LLJJJJLIIL) != null) {
            C500260Jjc.LJIILIIL(frameLayout2);
        }
        AbstractC1823860xYu abstractC1823860xYu2 = c1835860xsG.LLILLL;
        if (abstractC1823860xYu2 != null && (frameLayout = abstractC1823860xYu2.LLJJLIIIJLLLLLLLZ) != null) {
            C500260Jjc.LJIILIIL(frameLayout);
        }
        AbstractC1823860xYu abstractC1823860xYu3 = c1835860xsG.LLILLL;
        if (abstractC1823860xYu3 != null && (c20247014Ke = abstractC1823860xYu3.LLJJJIL) != null) {
            int id = c20247014Ke.getId();
            C19EH c19ehLJIIJ = parentFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(id, pcsServiceBioFragmentV2LJIILL, null);
            c19ehLJIIJ.LJIIIZ();
        }
        c1835860xsG.LIZIZ();
        try {
            float dimension = c1835860xsG.getResources().getDimension(R.dimen.atu);
            if (dimension > 0.0f) {
                C19EG activity = getActivity();
                C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(new DisplayMetrics());
                float f = dimension / r6.widthPixels;
                AbstractC1823860xYu binding = c1835860xsG.getBinding();
                if (binding != null && (c389590FPh2 = binding.LLJJL) != null) {
                    c389590FPh2.setRatio(f);
                }
                AbstractC1823860xYu binding2 = c1835860xsG.getBinding();
                if (binding2 != null && (c389590FPh = binding2.LLJJL) != null) {
                    ViewGroup.LayoutParams layoutParams = c389590FPh.getLayoutParams();
                    if (layoutParams != null) {
                        C19ME c19me = (C19ME) layoutParams;
                        c19me.topToTop = -1;
                        c19me.bottomToBottom = 0;
                        C786410Ut5.W5(c389590FPh, c19me);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
            }
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        TuxTextView tuxTextView = wS().LLJJJJJIL;
        if (JS().PQ2() && !JS().RQ2()) {
            i = 2131855944;
        } else {
            i = 2131855899;
        }
        tuxTextView.setText(getString(i));
        TuxTextView tuxTextView2 = wS().LLJJJJ;
        String str2 = "";
        if (JS().QQ2()) {
            string = getString(2131855897);
        } else if (JS().NQ2()) {
            string = getString(2131855892);
        } else if (JS().OQ2()) {
            string = getString(2131855895);
        } else if (JS().yQ2() && JS().CQ2() && JS().zQ2()) {
            string = getString(2131855890);
        } else if (JS().yQ2() && JS().zQ2()) {
            string = getString(2131855887);
        } else if (JS().CQ2() && JS().zQ2()) {
            string = getString(2131855889);
        } else if (!JS().yQ2() || !JS().CQ2()) {
            string = "";
        } else {
            string = getString(2131855888);
        }
        StringBuilder sb = new StringBuilder();
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (JS().RQ2()) {
                sb.append(getString(2131855902));
            } else if (JS().PQ2()) {
                sb.append(getString(2131855943));
            } else {
                sb.append(getString(2131855900));
            }
        } else {
            sb.append(string);
            if (JS().RQ2()) {
                if (string.length() > 0) {
                    sb.append(" ");
                }
                sb.append(getString(2131855902));
            }
        }
        tuxTextView2.setText(sb.toString());
        C1824200xZS.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "show", JS().DQ2().getShowEntrance(), JS().LQ2(), "", JS().LLJJIII);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingResultPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingResultPage initView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str2 = showEntrance2;
        }
        sbLIZ2.append(str2);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        JS().LJJJJL();
    }

    public final void jT(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingResultPage click action_type=");
        sbLIZ.append(str);
        sbLIZ.append(", show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void kT(String str) {
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        String strLQ2 = JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2())));
        boolean zLJJJI3 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2())));
        boolean zLJJJI4 = C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ));
        C1824200xZS.LIZJ(zLJJJI ? 1 : 0, zLJJJI2 ? 1 : 0, zLJJJI3 ? 1 : 0, zLJJJI4 ? 1 : 0, "click", showEntrance, strLQ2, str, JS().LLJJIII);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step.PcsOnboardingResultFragment.onCreate(android.os.Bundle):void");
    }
}
