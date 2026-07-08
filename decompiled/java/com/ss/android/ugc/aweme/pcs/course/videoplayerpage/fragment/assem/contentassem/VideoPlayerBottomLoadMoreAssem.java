package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.C019F;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C490680JMc;
import X.C490710JMf;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC490740JMi;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoPlayerBottomLoadMoreAssem extends UIContentAssem implements VideoPlayerLoadMoreAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final VideoPlayerBottomLoadMoreAssem LLIZLLLIL = this;
    public C490680JMc LLJ;
    public final List<InterfaceC490740JMi> LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerBottomLoadMoreAssem.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoPlayerBottomLoadMoreAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoPlayerBottomLoadMoreAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 724), AFwS229S0000000_2.get$arr$(448), null, true);
        this.LLJI = new ArrayList();
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

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility
    public final void QL0(C490710JMf c490710JMf) {
        ((ArrayList) this.LLJI).remove(c490710JMf);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).unbindAbility(this.LLIZLLLIL, VideoPlayerLoadMoreAbility.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ceo);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (C490680JMc) viewFindViewById;
        }
        C490680JMc c490680JMc = (C490680JMc) viewFindViewById;
        if (c490680JMc != null) {
            c490680JMc.setEnableLoadMore(false);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoPlayerFragmentScope.class}).bindAbility(this.LLIZLLLIL, VideoPlayerLoadMoreAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility
    public final void wF1(C490710JMf c490710JMf) {
        ((ArrayList) this.LLJI).add(c490710JMf);
    }
}
