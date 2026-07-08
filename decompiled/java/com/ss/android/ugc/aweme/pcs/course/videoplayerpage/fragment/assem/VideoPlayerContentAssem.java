package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem;

import X.C019F;
import X.C098200Yq;
import X.C09R3;
import X.C0JI5;
import X.C0JMJ;
import X.C0JMN;
import X.C0JMO;
import X.C0JMP;
import X.C0JMR;
import X.C13LE;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C490770JMl;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.game.GameDrawerCategory;
import webcast.api.smb.ListSMBCourseVideosRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoPlayerContentAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerContentAssem.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoPlayerContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoPlayerContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 721), AFwS229S0000000_2.get$arr$(445), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dfq;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoPlayerFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object c098200Yq;
        int i;
        long j;
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 711));
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06J7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JMP) obj).LL;
            }
        }, null, AFwS285S0000000_2.get$arr$(69), 6);
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVM = (PcsCourseVideoPlayerVM) this.LLJJI.getValue();
        try {
            C0JMP state = pcsCourseVideoPlayerVM.getState();
            C0JMJ c0jmjVQ2 = pcsCourseVideoPlayerVM.vQ2();
            if (c0jmjVQ2 != null) {
                c098200Yq = Long.valueOf(state.LLILZ.get(c0jmjVQ2.LLILZIL).longValue());
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C490770JMl.LIZLLL((Long) c098200Yq, "show", null);
        AssemVMLazy assemVMLazy2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIII;
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVM2 = (PcsCourseVideoPlayerVM) assemVMLazy2.getValue();
        if (pcsCourseVideoPlayerVM2.getState().LLILZ.isEmpty()) {
            pcsCourseVideoPlayerVM2.wQ2(new Throwable("VideoId list is empty"));
            return;
        }
        C0JMJ c0jmjVQ22 = pcsCourseVideoPlayerVM2.vQ2();
        if (c0jmjVQ22 != null) {
            i = c0jmjVQ22.LLILZIL;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(pcsCourseVideoPlayerVM2.getState().LLILLL);
        if (((C0JMR) ListProtector.get(arrayList, i)).LIZJ()) {
            pcsCourseVideoPlayerVM2.xQ2(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(0, i - 3);
        int iMin = Math.min(arrayList.size() - 1, i + 3);
        if (iMax <= iMin) {
            while (true) {
                if (!((C0JMR) ListProtector.get(arrayList, iMax)).LIZJ()) {
                    C0JMR c0jmrLIZ = C0JMR.LIZ((C0JMR) ListProtector.get(arrayList, iMax), C0JMN.FETCHING, 3);
                    ListProtector.set(arrayList, iMax, c0jmrLIZ);
                    arrayList2.add(Long.valueOf(c0jmrLIZ.LIZ));
                }
                if (iMax == iMin) {
                    break;
                } else {
                    iMax++;
                }
            }
        }
        pcsCourseVideoPlayerVM2.setState(new AwS586S0100000_7((List) arrayList, (List<GameDrawerCategory>) 263));
        C0JMO c0jmo = (C0JMO) pcsCourseVideoPlayerVM2.LL.getValue();
        ListSMBCourseVideosRequest listSMBCourseVideosRequest = new ListSMBCourseVideosRequest();
        C0JMJ c0jmjVQ23 = pcsCourseVideoPlayerVM2.vQ2();
        long j2 = -1;
        if (c0jmjVQ23 != null) {
            j = c0jmjVQ23.LLILLJJLI;
        } else {
            j = -1;
        }
        listSMBCourseVideosRequest.anchorId = j;
        C0JMJ c0jmjVQ24 = pcsCourseVideoPlayerVM2.vQ2();
        if (c0jmjVQ24 != null) {
            j2 = c0jmjVQ24.LLILZ;
        }
        listSMBCourseVideosRequest.courseId = j2;
        listSMBCourseVideosRequest.videoIdList = arrayList2;
        listSMBCourseVideosRequest.scene = 3;
        C23250099c.LIZLLL(c0jmo.LIZ, null, null, new C0JI5(c0jmo, listSMBCourseVideosRequest, new AwS373S0200000_7(pcsCourseVideoPlayerVM2, arrayList, 39), new AwS586S0100000_7(pcsCourseVideoPlayerVM2, 338), null), 3);
    }
}
