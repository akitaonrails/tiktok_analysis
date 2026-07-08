package com.ss.android.ugc.aweme.feed.assem.stitchbutton;

import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C299670Bor;
import X.C418440Gaw;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import Y.ARunnableS17S0101000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoStitchButtonAssem extends BaseCellSlotComponent<VideoStitchButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C197039127h LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoStitchButtonAssem.class, "stitchButtonVM", "getStitchButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/stitchbutton/VideoStitchButtonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoStitchButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoStitchButtonViewModel.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 82), null, AFwS236S0000000_6.get$arr$(62));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_3;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.w87);
        this.LLJLLIL = c197039127h;
        Object obj3 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS115S0200000_11(this, view, 6));
        if (C299670Bor.LIZ()) {
            C197039127h c197039127h2 = this.LLJLLIL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                C786410Ut5.W5(c197039127h2, layoutParams);
                c197039127h2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c197039127h2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Object value = this.LLJLLL.getValue(this, LLJZ[0]);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        value.getClass();
        if (VideoStitchButtonViewModel.vQ2(aweme)) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS17S0101000_6(0, this, 21));
            C786410Ut5.LJLLLLLL(0, view);
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            String str = ((VideoItemParams) obj3).mEventType;
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJJI(str, AwemeExtKt.getAuthorUid(aweme2), aweme2.getAid());
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS17S0101000_6(8, this, 21));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
