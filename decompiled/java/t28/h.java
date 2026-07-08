package t28;

import X.AbstractC1653180t7c;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0CHQ;
import X.C0LEO;
import X.C0MGA;
import X.C0MGB;
import X.C0MGD;
import X.C0MGL;
import X.C13LE;
import X.C13LP;
import X.C1462920oAk;
import X.C1660590tJZ;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C1DRG;
import X.C2217381BqS;
import X.C23250099c;
import X.C385670FAf;
import X.C418440Gaw;
import X.C452501pT;
import X.C535610KzX;
import X.C565530MFz;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC545560LaU;
import X.InterfaceC1647890sz5;
import X.InterfaceC1650190t2n;
import X.InterfaceC1650230t2r;
import X.InterfaceC1652470t6T;
import X.InterfaceC2183551Acz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObjectS241S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aime.MobModule;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import nv7.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends AbstractC1653180t7c implements InterfaceC379610EuV, C0MGD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final List<String> LLJL;
    public final C1DRG LLJILLL;
    public final C0MGA LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1068));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(550));
    public final C1664740tQG LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(h.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(h.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(h.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(h.class, "lightRecordScreenAdaptApiComponent", "getLightRecordScreenAdaptApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/LightRecordScreenAdaptApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(h.class, "musicPlayApiComponent", "getMusicPlayApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/play/MusicPlayApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJL = C1697810uHb.LJIIJJI("video_shoot_page", "aime_hub", "aime_generated_page", "video_edit_page", "sa_offical_message_inner_message");
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "AiMeBottomTabScene";
    }

    public final ShortVideoContext LLLLILI() {
        return (ShortVideoContext) this.LLJJIJIIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final void LLLLJ() {
        int iLIZIZ;
        View viewFindViewById = this.LLJJJJLIIL ? this.mView.findViewById(R.id.gu1) : this.LLJJ == C0MGA.ALBUM_AIME_IMAGE_TAB ? this.mView.findViewById(R.id.aw1) : this.mView.findViewById(R.id.ap_);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(this.mActivity);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        if (C1462920oAk.LIZLLL()) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            iLIZIZ = iLIZIZ2 + (c1660590tJZ != null ? c1660590tJZ.LIZIZ() : 0);
        } else {
            iLIZIZ = C0LEO.LIZIZ();
        }
        if (this.LLJJJJLIIL || this.LLJJ == C0MGA.ALBUM_AIME_IMAGE_TAB) {
            viewFindViewById.setPadding(0, statusBarHeight, 0, 0);
        } else {
            viewFindViewById.setPadding(0, statusBarHeight, 0, iLIZIZ);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        Object c098200Yq;
        Fragment fragmentLJJJJZI;
        try {
            c098200Yq = ((C19EG) requireActivity()).getSupportFragmentManager();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FragmentManager fragmentManager = (FragmentManager) c098200Yq;
        if (fragmentManager == null || (fragmentLJJJJZI = fragmentManager.LJJJJZI("aimeCreateNowFragmentTag")) == null || !fragmentLJJJJZI.isVisible()) {
            return;
        }
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        Object c098200Yq;
        Bundle arguments;
        Bundle arguments2;
        Bundle bundle;
        try {
            c098200Yq = ((C19EG) requireActivity()).getSupportFragmentManager();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String string = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FragmentManager fragmentManager = (FragmentManager) c098200Yq;
        Fragment fragmentLJJJJZI = fragmentManager != null ? fragmentManager.LJJJJZI("aimeCreateNowFragmentTag") : null;
        Scene sceneLIZ = C565530MFz.LIZ(this);
        String string2 = (sceneLIZ == null || (bundle = sceneLIZ.mArguments) == null) ? null : bundle.getString("enter_from");
        if (fragmentLJJJJZI != null && (arguments2 = fragmentLJJJJZI.getArguments()) != null) {
            string = arguments2.getString("enter_from");
        }
        if (!Intrinsics.LJFF(string2, string) && C13LP.LJJJJ(string2, LLJL) && string2 != null && fragmentLJJJJZI != null && (arguments = fragmentLJJJJZI.getArguments()) != null) {
            C786410Ut5.LJJJI("enter_from", string2, arguments);
        }
        if (this.LLJJ == C0MGA.ALBUM_AIME_IMAGE_TAB) {
            ((MobModule) this.LLJJIII.getValue()).LIZJ("upload_page");
        }
        super.onStart();
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        LiveEvent<Unit> liveEventSI2;
        C0CHQ.LIZ().LJIIL().updateCurrentScene("ai_me_self_show", true);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C535610KzX(this, null), 3);
        C1664740tQG c1664740tQG = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        C0MGL c0mgl = (C0MGL) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (c0mgl != null && (liveEventSI2 = c0mgl.sI2()) != null) {
            liveEventSI2.LIZ(this, new AObjectS241S0100000_8(this, 108));
        }
        InterfaceC2183551Acz interfaceC2183551Acz = new InterfaceC2183551Acz() { // from class: X.0MG7
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
            @Override // X.InterfaceC2183551Acz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onDone(int r19) {
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0MG7.onDone(int):void");
            }
        };
        if (this.LLJJIJIL.getValue(this, interfaceC2217461BqaArr[2]) == null) {
            interfaceC2183551Acz.onDone(-105);
        } else {
            InterfaceC1650190t2n interfaceC1650190t2n = (InterfaceC1650190t2n) this.LLJJIJIL.getValue(this, interfaceC2217461BqaArr[2]);
            if (interfaceC1650190t2n != null) {
                interfaceC1650190t2n.c11(interfaceC2183551Acz);
            }
        }
        InterfaceC1652470t6T interfaceC1652470t6T = (InterfaceC1652470t6T) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[5]);
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.rZ0(null, false);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.AI_ME_BOTTOM_TAB_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public h(C1DRG c1drg, C0MGA c0mga) {
        this.LLJILLL = c1drg;
        this.LLJJ = c0mga;
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, C0MGL.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, a.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, C0MGB.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652470t6T.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, q.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C385670FAf<Boolean> c385670FAfVa;
        C385670FAf<Boolean> c385670FAfVa2;
        super.onViewCreated(view, bundle);
        C1664740tQG c1664740tQG = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        if (c1664740tQG.getValue(this, interfaceC2217461BqaArr[4]) != null) {
            C0MGB c0mgb = (C0MGB) this.LLJJJIL.getValue(this, interfaceC2217461BqaArr[4]);
            if (c0mgb != null && (c385670FAfVa2 = c0mgb.va()) != null) {
                c385670FAfVa2.LIZ(this, new AObjectS241S0100000_8(this, 106));
                return;
            }
            return;
        }
        InterfaceC1647890sz5 interfaceC1647890sz5 = (InterfaceC1647890sz5) this.LLJJJ.getValue(this, interfaceC2217461BqaArr[3]);
        if (interfaceC1647890sz5 == null || (c385670FAfVa = interfaceC1647890sz5.va()) == null) {
            return;
        }
        c385670FAfVa.LIZ(this, new AObjectS241S0100000_8(this, 107));
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.LLJJJJLIIL) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emo, viewGroup, false);
        }
        if (this.LLJJ == C0MGA.ALBUM_AIME_IMAGE_TAB) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emn, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emm, viewGroup, false);
    }
}
