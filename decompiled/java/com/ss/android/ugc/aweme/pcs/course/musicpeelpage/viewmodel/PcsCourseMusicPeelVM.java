package com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel;

import X.C0JI7;
import X.C0JIM;
import X.C11NZ;
import X.C11S5;
import X.C1554960qZC;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1808280x9m;
import X.C470590Icr;
import X.C480460Ism;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC489200JGk;
import X.InterfaceC665370Q7z;
import Y.AfS176S0100000_7;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseMusicPeelVM extends AssemViewModel<C0JIM> {
    public InterfaceC665370Q7z LL;
    public C0JI7 LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JIM(0);
    }

    public final C0JI7 vQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C0JI7 c0ji7 = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JI7.class, null)) != null) {
                c0ji7 = (C0JI7) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c0ji7;
        }
        return this.LLILLJJLI;
    }

    public final void xQ2() {
        String str;
        InterfaceC489200JGk interfaceC489200JGk;
        C0JI7 c0ji7VQ2 = vQ2();
        if (c0ji7VQ2 != null && (interfaceC489200JGk = c0ji7VQ2.LLILZLL) != null && interfaceC489200JGk.LJIJJLI() != null) {
            setState(new AwS586S0100000_7(interfaceC489200JGk, 256));
            return;
        }
        C0JI7 c0ji7VQ22 = vQ2();
        if (c0ji7VQ22 != null) {
            long j = c0ji7VQ22.LLILLL;
            setState(AFwS237S0000000_7.get$arr$(164));
            C480460Ism.LIZ().getClass();
            IPcsCourseApi iPcsCourseApi = (IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class);
            ListSMBCourseVideosRequest listSMBCourseVideosRequest = new ListSMBCourseVideosRequest();
            C0JI7 c0ji7VQ23 = vQ2();
            listSMBCourseVideosRequest.anchorId = c0ji7VQ23 != null ? c0ji7VQ23.LLILZ : -1L;
            C0JI7 c0ji7VQ24 = vQ2();
            listSMBCourseVideosRequest.courseId = c0ji7VQ24 != null ? c0ji7VQ24.LLILLJJLI : -1L;
            listSMBCourseVideosRequest.scene = 1;
            listSMBCourseVideosRequest.offset = 0;
            listSMBCourseVideosRequest.count = 0;
            listSMBCourseVideosRequest.videoIdList = C1697810uHb.LJIILJJIL(Long.valueOf(j));
            C11NZ<C470590Icr<ListSMBCourseVideosResponse.Data>> c11nzLoadCourseVideos = iPcsCourseApi.loadCourseVideos(listSMBCourseVideosRequest);
            C0JI7 c0ji7VQ25 = vQ2();
            if (c0ji7VQ25 == null || (str = c0ji7VQ25.LL) == null) {
                str = "";
            }
            C1808280x9m.LJFF(c11nzLoadCourseVideos, str, "/smb/course/video/list/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 264), new AfS176S0100000_7(this, 265));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel.PcsCourseMusicPeelVM.wQ2(java.lang.String, java.lang.String):void");
    }
}
