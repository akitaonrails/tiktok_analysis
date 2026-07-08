package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.C019F;
import X.C09R3;
import X.C0JMJ;
import X.C0QSJ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoPlayerTopOverlayAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public LiveIconView LLJJI;
    public TuxIconView LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C0JMJ LLJJIJIIJIL;
    public volatile VideoPlayerPagerAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerTopOverlayAssem.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoPlayerTopOverlayAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoPlayerTopOverlayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 727), AFwS229S0000000_2.get$arr$(449), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.djd;
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

    public final C0JMJ hp() {
        if (this.LLJJIJIIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JMJ.class, null);
            this.LLJJIJIIJIL = interfaceC1555100qZQLIZIZ != null ? (C0JMJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r2
      0x0041: PHI (r2v4 android.view.View) = (r2v3 android.view.View), (r2v5 android.view.View) binds: [B:12:0x002a, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r4 = r10
            super.onViewCreated(r11)
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r4.LLJJI
            r3 = 0
            if (r2 != 0) goto L1b
            android.view.View r1 = r4.LJJIJL()
            if (r1 == 0) goto L62
            r0 = 2131365592(0x7f0a0ed8, float:1.8351054E38)
            android.view.View r2 = r1.findViewById(r0)
        L16:
            r0 = r2
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r4.LLJJI = r0
        L1b:
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L28
            irm.AkS75S0100000_2 r1 = new irm.AkS75S0100000_2
            r0 = 0
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L28:
            com.bytedance.tux.icon.TuxIconView r2 = r4.LLJJIII
            if (r2 != 0) goto L41
            android.view.View r1 = r4.LJJIJL()
            if (r1 == 0) goto L39
            r0 = 2131365765(0x7f0a0f85, float:1.8351405E38)
            android.view.View r3 = r1.findViewById(r0)
        L39:
            r0 = r3
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r4.LLJJIII = r0
            r2 = r3
            if (r3 == 0) goto L4a
        L41:
            irm.AkS79S0100000_7 r1 = new irm.AkS79S0100000_7
            r0 = 0
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L4a:
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r4.LLJJIJI
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem.LLJJJJ
            com.bytedance.assem.arch.viewModel.AssemViewModel r5 = r1.getValue()
            X.06JV r6 = new X.C2217381BqS() { // from class: X.06JV
                static {
                    /*
                        X.06JV r0 = new X.06JV
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.06JV) X.06JV.LL X.06JV
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06JV.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0JMP> r3 = X.C0JMP.class
                        java.lang.String r2 = "getOrientation()I"
                        r1 = 0
                        java.lang.String r0 = "orientation"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06JV.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0JMP r2 = (X.C0JMP) r2
                        int r0 = r2.LLILLJJLI
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06JV.get(java.lang.Object):java.lang.Object");
                }
            }
            X.0wBP r7 = X.C736820SvI.LIZLLL()
            r0 = 0
            kotlin.jvm.internal.AFwS285S0000000_2 r8 = kotlin.jvm.internal.AFwS285S0000000_2.get$arr$(r0)
            r9 = 4
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            return
        L62:
            r2 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem.onViewCreated(android.view.View):void");
    }
}
