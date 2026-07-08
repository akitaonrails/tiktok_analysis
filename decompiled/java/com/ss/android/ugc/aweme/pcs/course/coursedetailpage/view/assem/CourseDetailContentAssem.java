package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem;

import X.C019F;
import X.C0KBP;
import X.C1273104yX;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1672206gi;
import X.C1697810uHb;
import X.C1723706p1;
import X.C1826730xdX;
import X.C1836910xtx;
import X.C1836920xty;
import X.C1837000xu6;
import X.C1885807a4;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C990490bsl;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517590KRp;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.DescriptionCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.DescriptionCellV2;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.FeedbackGuideCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.GridVideoCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.LinearVideoCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.VideoCountCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.VideoRowCell;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS176S1100000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS641S0100000_27;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class CourseDetailContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public final AssemVMLazy LLJJIII;
    public C1836920xty LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CourseDetailContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CourseDetailContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 715), AFwS229S0000000_2.get$arr$(439), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dc1;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ip() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ew4) : null;
            this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1836920xty kp() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1836920xty.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C1836920xty) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final PcsCourseDetailVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PcsCourseDetailVM) assemVMLazy.getValue();
    }

    public final void mp() {
        C500260Jjc.LLFFF(LJJIJL());
        C1836920xty c1836920xtyKp = kp();
        boolean z = c1836920xtyKp != null && c1836920xtyKp.LLILLJJLI == UserService.getInstance().user().getCurrentUserId();
        C1836920xty c1836920xtyKp2 = kp();
        boolean z2 = c1836920xtyKp2 != null ? c1836920xtyKp2.LLJI : false;
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            C1836920xty c1836920xtyKp3 = kp();
            interfaceC517590KRpLIZ.LJI(new C0KBP(c1836920xtyKp3 != null ? c1836920xtyKp3.LLJIJIL : -1, C2097608Jq.LJIIJ(new Pair("is_service_plus_revamp", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage())) ? 1 : 0)), new Pair("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)), new Pair("is_single_sku", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0)))));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 277));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIp = ip();
        if (viewOnAttachStateChangeListenerC20604515jvIp != null) {
            viewOnAttachStateChangeListenerC20604515jvIp.LJIIIZ();
            viewOnAttachStateChangeListenerC20604515jvIp.LJIILJJIL(DescriptionCell.class, DescriptionCellV2.class, GridVideoCell.class, LinearVideoCell.class, FeedbackGuideCell.class, VideoCountCell.class, VideoRowCell.class);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0xtz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 0), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0xu0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LLILLJJLI;
            }
        }, null, new AwS641S0100000_27(this, 1), 6);
        lp().xQ2(getContext());
    }

    public final List<InterfaceC1891350zJl> hp(GetSMBCourseDetailResponse.Data data, long[] jArr) {
        boolean z;
        boolean z2;
        List listLJLIL;
        String str;
        String str2;
        int size;
        List list;
        boolean z3;
        String str3;
        String str4;
        List<SMBCourseVideo> list2;
        ContentAuditStatus contentAuditStatus;
        ContentAuditStatus contentAuditStatus2;
        SMBCourse sMBCourse = data.course;
        if (sMBCourse != null && sMBCourse.isPurchased) {
            z = true;
        } else {
            z = false;
        }
        C1836920xty c1836920xtyKp = kp();
        if (c1836920xtyKp != null && c1836920xtyKp.LLIZLLLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            listLJLIL = C13LP.LJLIL(C1836910xtx.LIZIZ(data, kp(), new AwS462S0200000_27(this, jArr, 0)), Collections.singletonList(C1836910xtx.LIZ(data, Boolean.FALSE, new AwS176S1100000_27(this, "faq", 0))));
        } else if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            InterfaceC1891350zJl[] interfaceC1891350zJlArr = new InterfaceC1891350zJl[2];
            kp();
            SMBCourse sMBCourse2 = data.course;
            if (sMBCourse2 != null && (contentAuditStatus2 = sMBCourse2.name) != null) {
                str = contentAuditStatus2.content;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (sMBCourse2 == null || (contentAuditStatus = sMBCourse2.description) == null || (str2 = contentAuditStatus.content) == null) {
                str2 = "";
            }
            interfaceC1891350zJlArr[0] = new C1723706p1(str, str2);
            kp();
            SMBCourse sMBCourse3 = data.course;
            if (sMBCourse3 != null && (list2 = sMBCourse3.videoList) != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            interfaceC1891350zJlArr[1] = new C1273104yX(size);
            List listLJIIJJI = C1697810uHb.LJIIJJI(interfaceC1891350zJlArr);
            kp();
            AwS462S0200000_27 awS462S0200000_27 = new AwS462S0200000_27(this, jArr, 0);
            SMBCourse sMBCourse4 = data.course;
            if (sMBCourse4 == null || (list = sMBCourse4.videoList) == null) {
                list = C13BV.INSTANCE;
            }
            List listLJJJIL = C13LP.LJJJIL(list, 2);
            int i = 10;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJIL, 10));
            int i2 = 0;
            for (Object obj : listLJJJIL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    List list3 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, i));
                    int i4 = 0;
                    for (Object obj2 : list3) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            SMBCourseVideo sMBCourseVideo = (SMBCourseVideo) obj2;
                            ContentAuditStatus contentAuditStatus3 = sMBCourseVideo.title;
                            if (contentAuditStatus3 == null || (str3 = contentAuditStatus3.content) == null) {
                                str3 = "";
                            }
                            ContentAuditStatus contentAuditStatus4 = sMBCourseVideo.cover;
                            if (contentAuditStatus4 == null || (str4 = contentAuditStatus4.content) == null) {
                                str4 = "";
                            }
                            arrayList2.add(new C1837000xu6(i2, str4, str3, sMBCourseVideo.videoDuration, false, new C990490bsl(i2, i4, awS462S0200000_27), false));
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (i2 == (list.size() - 1) / 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C1885807a4(arrayList2, z3));
                    i2 = i3;
                    i = 10;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            listLJLIL = C13LP.LJLIL(arrayList, listLJIIJJI);
        } else {
            Boolean boolValueOf = null;
            C1836920xty c1836920xtyKp2 = kp();
            if (c1836920xtyKp2 != null) {
                boolValueOf = Boolean.valueOf(c1836920xtyKp2.LLIZLLLIL);
            }
            listLJLIL = C13LP.LJLIL(C1836910xtx.LIZIZ(data, kp(), new AwS462S0200000_27(this, jArr, 0)), Collections.singletonList(C1836910xtx.LIZ(data, boolValueOf, new AwS176S1100000_27(this, "faq", 0))));
        }
        ArrayList arrayList3 = new ArrayList(listLJLIL);
        if (z) {
            arrayList3.add(new C1672206gi(new AwS176S1100000_27(this, "submit_feedback", 0)));
        }
        return arrayList3;
    }
}
